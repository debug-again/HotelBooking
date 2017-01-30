(function () {


    var app = angular.module('hotelApp', ['ngAnimate', 'ngSanitize', 'ui.bootstrap', 'ui.router']);
    app.constant('REST_URI', 'http://localhost:8181/rest/');

    app.config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise('/home');

        $stateProvider.state('home',{
            url : '/home',
            templateUrl : 'html/home.html'
        });

        $stateProvider.state('about',{
            url : '/about',
            templateUrl : 'html/about.html'
        });

        $stateProvider.state('admin',{
            url : '/admin',
            templateUrl : 'html/admin.html'
        });

        $stateProvider.state('search',{
            url : '/search',
            templateUrl : 'html/search.html'
        });

        $stateProvider.state('rates',{
            url : '/rates',
            templateUrl : 'html/rates.html'
        });

        $stateProvider.state('booking',{
            url : '/booking',
            templateUrl : 'html/booking.html'
        });

        $stateProvider.state('contact',{
            url : '/contact',
            templateUrl : 'html/contact.html'
        });

        $stateProvider.state('feedback',{
            url : '/feedback',
            templateUrl : 'html/feedback.html'
        });

    }]);

})();