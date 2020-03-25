//统计service层
app.service('productBulletinShowService',function ($http) {

    //列表页加载
    this.getInfo = function (productId) {
        return $http.get('../../product/getProductInfo.do?productId='+productId);
    };

});