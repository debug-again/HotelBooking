(function () {

    var app = angular.module('hotelApp');

    app.directive('dateNow', ['$filter', function($filter) {
        return {
            link: function( $scope, $element, $attrs) {
                $element.text($filter('date')(new Date(), $attrs.dateNow));
            }
        };
    }]);

    app.directive('upperCase', ['$parse', function ($parse) {
        return{

            restrict: 'A',
            require:'ngModel',
            link: function($scope, $element, $attribute, $modelController){

                var upperCase = function(oldValue){
                    if(oldValue == undefined) return undefined;
                    var newValue =  oldValue.toUpperCase();

                    if(oldValue !== newValue){
                        $modelController.$setViewValue(newValue);
                        $modelController.$render();
                    }

                    return newValue;
                }

                $modelController.$parsers.push(upperCase);


            }
        };
    }]);

    app.directive('capitalizeFirstLetters', ['$parse', function ($parse) {
        return {

            restrict: 'A',
            require: 'ngModel',
            link: function ($scope, $element, $attributes, $modelController) {

                var capitalizeFirstLetters = function (value) {

                    if(value == undefined){
                        return value;
                    }

                    var capitalizedValue = '';

                    if (value == ' ')
                        capitalizedValue = value.trim();

                    else if (value.length == 1)
                        capitalizedValue = value.toUpperCase();

                    else {
                        var lastIndexPrev = value.length - 2;
                        var lastIndex = value.length - 1;

                        if (value.charAt(lastIndexPrev) == ' ') {
                            var upChar = value.charAt(lastIndex).toUpperCase();
                            capitalizedValue = value.substring(0, lastIndex) + upChar;

                        } else {
                            var loChar = value.charAt(lastIndex).toLowerCase();
                            capitalizedValue =  value.substring(0, lastIndex) + loChar;
                        }
                    }

                    if(capitalizedValue != value){
                        $modelController.$setViewValue(capitalizedValue);
                        $modelController.$render();
                    }

                    return capitalizedValue;
                };

                var model = $parse($attributes.ngModel);
                $modelController.$parsers.push(capitalizeFirstLetters);
                capitalizeFirstLetters(model($scope));
            }
        };
    }]);


})();