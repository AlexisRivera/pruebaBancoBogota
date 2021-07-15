'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminTargeta', [
  'ngRoute',
  'adminTargeta.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Targeta.html', controller: 'TargetaCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
