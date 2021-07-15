'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminpagos', [
  'ngRoute',
  'adminpagos.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/pagos.html', controller: 'pagosCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
