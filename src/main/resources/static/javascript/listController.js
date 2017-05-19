myApp.controller('listController', function($scope, $location, $http){

    $scope.users = [];
    $scope.firstName = null;
    $scope.lastName = null;

    $http({
        method: 'get',
        url: 'http://localhost:8080/all'
    }).then(function(res) {
        $scope.users = res.data;
        console.log($scope.users);
    });

})