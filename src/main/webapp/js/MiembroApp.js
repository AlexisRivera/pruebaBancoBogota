'use strict';


// Declare app level module which depends on filters, and services
var module=angular.module('adminMiembro', [
  'ngRoute',
  'adminMiembro.controllers'
]);
module.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/', {templateUrl: 'partials/Miembro.html', controller: 'MiembroCtrl'});
  $routeProvider.otherwise({redirectTo: '/'}); 
}]);
