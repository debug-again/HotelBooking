(function(){

    var app = angular.module('hotelApp');

    app.directive('roomBookingForm', function(){
        return{
            restrict : 'E',
            templateUrl : 'html/room-booking.html',
            controller : 'bookingFormController',
            scope : false,
            transclude : false
        };
    });

})();