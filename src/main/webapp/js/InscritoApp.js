'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminInscrito', [
  'ngRoute',
  'adminInscrito.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Inscrito.html', controller: 'InscritoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
