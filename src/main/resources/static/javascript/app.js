var myApp = angular.module('myApp', ['ngRoute']);

myApp.config(function($routeProvider, $locationProvider) {
    $locationProvider.hashPrefix('');
    $routeProvider
    .when('/all', {
        templateUrl: '../views/all.html',
        controller: 'listController'
    });
});