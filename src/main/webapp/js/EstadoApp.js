'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminEstado', [
  'ngRoute',
  'adminEstado.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Estado.html', controller: 'EstadoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
