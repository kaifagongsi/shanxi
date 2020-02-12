//统计service层
app.service('policyPapersService',function ($http) {

    this.search = function (searchMap) {
        return $http.post('policypapers/getList.do',searchMap);
    }

    this.initById = function (pData) {
        return $http.post('policypapers/getContent.do',pData);
    }
});