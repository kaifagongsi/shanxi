//统计service层
app.service('complaintRightService',function ($http) {
    //列表页加载
    this.load = function (searchMap) {
        return $http.post('../../complaintRight/getList.do',searchMap);
    }


});