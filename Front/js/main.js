angular.module('main-app', [])
    .controller('MainController', function($scope, $http) {

      const url = 'http://localhost:8080/api/now';
      $scope.answerText = 'Тут храниться ответ от микросервиса';
      $scope.visibalAnswer = false;
      $scope.city;
      $scope.temperature;
      $scope.units;
      $scope.date;

      $scope.check = function(text){
          $http({
            method: 'POST',
            url: url,
            headers: {
              'Content-type':'application/json; charset=UTF-8'
            },
            data:{
              "city":text
            }
          }).then(function(response){
            //показывем блок с результами запроса
            $scope.showContext(response.data);
          }, function(response) {
            console.log('Произошла ошибка запроса, проверте работу '+url);
          });
      }

      $scope.showContext = function(jsonResponse){
        $scope.answerText = jsonResponse;
        $scope.city = jsonResponse.city;
        $scope.temperature = jsonResponse.temperature;
        $scope.units = jsonResponse.units;
        $scope.date = jsonResponse.date;
        $scope.visibalAnswer = true;
      }

    });
