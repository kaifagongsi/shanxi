//控制层
app.controller('indexController',function ($scope,indexService,$cookieStore) {

    //加载cookie
    $scope.getCookie = function () {
        indexService.getPatviewerCookie().success(
            function (response) {
                console.log(response);
                console.log(response.session);
                var s = response.session
               // $cookies.put("AngularJs", "xcccc", {expires:new Date(new Date().getTime()+5000)})
                $cookieStore.put("JSESSIONID", s);
                var xx = $cookieStore.get("JSESSIONID");
                console.info(xx);
            }
        );
    };

  /*  content1: 电子
    colname: 申请号,公开（公告）号,申请（专利权）人,发明（设计）人,地址,名称,摘要+=
        strWhere: 申请号,公开（公告）号,申请（专利权）人,发明（设计）人,地址,名称,摘要+=(苹果)
    simpleSearch: 1
    presearchword:
        savesearchword: ON
    strChannels: 14,15,16,17
    strSources: fmsq_ft
    strSortMethod: RELEVANCE
    strDefautCols: 主权项, 名称, 摘要
    strStat:
        iHitPointType: 115
    searchKind: tableSearch
    bContinue:
        trsLastWhere:
            channelid:
                content: 苹果*/
    $scope.ceFormDate = {
         'content1':'电子','colname':'申请号,公开（公告）号,申请（专利权）人,发明（设计）人,地址,名称,摘要+=',
         'strWhere':'',
          'simpleSearch':'1','presearchword':'','savesearchword':'ON','strSources':'',
        'strChannels':'','strDefautCols':'主权项, 名称, 摘要','strStat':'','iHitPointType':'115',
        'searchKind':'tableSearch','bContinue':'','trsLastWhere':'','channelid':'','content':''
    }
    $scope.search = function () {
        if($scope.ceFormDate.content.length > 5000){
            alert('超过非注册用户检索式长度，请注册或者联系管理员');
            return false;
        }
        if($scope.ceFormDate.content != null && $scope.ceFormDate.content !=''){
            if( ($scope.ceFormDate.content.indexOf(' and ') >-1 || $scope.ceFormDate.content.indexOf(' AND ') >-1)  &&
                ($scope.ceFormDate.content.indexOf(' or ') ==-1&&$scope.ceFormDate.content.indexOf(' OR ')==-1)&&
                ($scope.ceFormDate.content.indexOf(' not ') ==-1&&$scope.ceFormDate.content.indexOf(' NOT ')==-1)) {

                var reg = new RegExp(' and ','g');//g,表示全部替换。
                $scope.ceFormDate.content = $scope.ceFormDate.content.replace(reg,' ');

                var reg1 = new RegExp(' AND ','g');//g,表示全部替换。
                $scope.ceFormDate.content = $scope.ceFormDate.content.replace(reg1,' ');

                $scope.ceFormDate.strWhere = $scope.ceFormDate.strWhere + '(' +$scope.ceFormDate.content +')';
                $("#strWhere").attr("value",colname+"("+$.trim(content).replace(/\s+/g, " and ")+")");
            }
        }
        console.log($scope.ceFormDate);
    }
});
