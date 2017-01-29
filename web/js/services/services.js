(function () {


    var app = angular.module('hotelApp');

    app.factory('BookingService', ['$http', '$q', 'REST_URI', function ($http, $q, REST_URI) {

        var createBooking = function(bookingData){
            return $http.post(REST_URI + 'createBooking', bookingData);
        };

        var factory = {
            createBooking: createBooking
        };

        return factory;
    }]);


})();