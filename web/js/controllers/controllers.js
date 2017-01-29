(function () {

    var app = angular.module('hotelApp');

    app.controller('mainController', ['$scope', function ($scope) {

    }]);

    app.controller('bookingFormController', ['$scope', 'BookingService', function ($scope, BookingService) {

        $scope.bookingData = {};
        $scope.dateFormat = "dd/MM/yyyy";
        $scope.altInputFormats = ['M!/d!/yyyy'];

        $scope.dateOptions = {
            // dateDisabled: disabled,  https://plnkr.co/edit/?p=preview
            formatYear: 'yy',
            maxDate: new Date(),
            minDate: new Date(1800, 5, 22),
            startingDay: 1,
        };

        /*
         function disabled(data) {
         var date = data.date,
         mode = data.mode;
         return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
         }
         */
        $scope.open = function () {
            $scope.opened = true;
            console.log('opened');
        };


        /* --------------------------------------------------------------------------------------------- */
        $scope.confirmBooking = function () {

            if($scope.bookingData.addressLine2)
                $scope.bookingData.permanentAddress = $scope.bookingData.addressLine1 + ' '  + $scope.bookingData.addressLine2 + ' ' + $scope.bookingData.city;
            else
                $scope.bookingData.permanentAddress = $scope.bookingData.addressLine1 + ' ' + $scope.bookingData.city;

            BookingService.createBooking($scope.bookingData).then(
                function (successResponse) {
                    $scope.response = successResponse;
                },
                function (errorResponse) {
                    $scope.response = errorResponse;
                }
            );
        };
    }]);

})();