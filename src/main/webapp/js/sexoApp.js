'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminsexo', [
  'ngRoute',
  'adminsexo.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/sexo.html', controller: 'sexoCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
