'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminMedioPagos', [
  'ngRoute',
  'adminMedioPagos.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/MedioPagos.html', controller: 'MedioPagosCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
