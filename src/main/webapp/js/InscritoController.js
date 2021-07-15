'use strict';

/* Controllers */
var module = angular.module('adminInscrito.controllers', []);

module.controller('InscritoCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = {};
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    $scope.listar=function(){
        $http.get('./webresources/Inscrito', {})
            .success(function (data, status, headers, config) {
                $scope.lista = data;
            }).error(function (data, status, headers, config) {
                alert('Error al consultar la informaci\xf3n, por favor intente m\xe1s tarde');
        });    
    };

        $scope.listarEstado=function(){
            $http.get('./webresources/Estado', {})
                .success(function (data, status, headers, config) {
                    $scope.listaEstado = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de estado, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarEstado();
            $scope.listarMiembro=function(){
            $http.get('./webresources/Miembro', {})
                .success(function (data, status, headers, config) {
                    $scope.listaMiembro = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de miembro, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarMiembro();
            $scope.listarSexo=function(){
            $http.get('./webresources/sexo', {})
                .success(function (data, status, headers, config) {
                    $scope.listaSexo = data;
                }).error(function (data, status, headers, config) {
                    alert('Error al consultar la informaci\xf3n de sexo, por favor intente m\xe1s tarde');
            });    
        };
        $scope.listarSexo();
        

    $scope.listar();
    //guardar
    $scope.nuevo = function () {
        $scope.panelEditar = true;
        $scope.datosFormulario = {};
    };
    
    $scope.guardar = function () {
        $scope.errores = {};
        var error = false;
        
        if (error)
            return;
        $http.post('./webresources/Inscrito', JSON.stringify($scope.datosFormulario), {}
            ).success(function (data, status, headers, config) {
                alert("Los datos han sido guardados con Exito");
                $scope.panelEditar = false;
                $scope.listar();
            }).error(function (data, status, headers, config) {
                alert('Error al guardar la informaci\xf3n, por favor intente m\xe1s tarde');
            });
    };
    $scope.cancelar = function () {
        $scope.panelEditar = false;
        $scope.datosFormulario = {};
    };

    //editar
    $scope.editar = function (data) {
        $scope.panelEditar = true;
        $scope.datosFormulario = data;
    };
    //eliminar
    $scope.eliminar = function (data){
        if (confirm('�Desea elminar este registro?')) {    
            $http.delete('./webresources/Inscrito/'+data.id, {})
                .success(function (data, status, headers, config) {
                    $scope.listar();
                }).error(function (data, status, headers, config) {    
                    alert('Error al eliminar la informaci\xf3n de Inscrito, por favor intente m\xe1s tarde');
            });   
        }
    };
}]);
