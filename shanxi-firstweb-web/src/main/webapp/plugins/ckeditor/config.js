/**
 * @license Copyright (c) 2003-2019, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see https://ckeditor.com/legal/ckeditor-oss-license
 */

CKEDITOR.editorConfig = function( config ) {
    // Define changes to default configuration here. For example:
    // config.language = 'fr';
    // config.uiColor = '#AADC6E';
    // config.filebrowserImageUploadUrl = '/imgUpload/ckeditorUpload.do?type=image';


    /*将编辑器的语言设置为中文*/
    config.language = 'zh-cn';
    /*去掉图片预览框的文字*/
    config.image_previewText = ' ';
    config.allowedContent = true;
    //保证word导入格式
    config.pasteFromWordRemoveFontStyles = false;
    config.pasteFromWordRemoveStyles = false;
    //是否强制复制来的内容去除格式
    config.forcePasteAsPlainText =false; //不去除


    // Simplify the dialog windows.
    config.removeDialogTabs = 'image:advanced;link:advanced';


    config.uploadUrl = '../../imgUpload/ckeditorUpload.do?command=QuickUpload&type=Files&responseType=json';
    /*开启工具栏“附件”中文件上传功能，后面的url为图片上传要指向的的action或servlet*/
    config.filebrowserUploadUrl = '../../imgUpload/ckeditorUpload.do?command=QuickUpload&type=Files';
    /*开启工具栏“图像”中文件上传功能，后面的url为图片上传要指向的的action或servlet*/
    config.filebrowserImageUploadUrl = '../../imgUpload/ckeditorUpload.do?command=QuickUpload&type=Images';




};

