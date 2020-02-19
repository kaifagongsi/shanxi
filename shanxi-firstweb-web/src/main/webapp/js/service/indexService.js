//service层
app.service('indexService',function ($http) {

    this.getPatviewerCookie = function () {
        return $http.get("../../Simulation/getCookie.do");
    }
});
