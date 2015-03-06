
<html>
	<head>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<link rel="stylesheet" href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css" />
		<script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>

		<script type="text/javascript" src="http://plupload.com/js/bootstrap.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/js/shCore.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/js/shBrushPhp.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/js/shBrushjScript.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/plupload/js/plupload.full.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/plupload/js/jquery.ui.plupload/jquery.ui.plupload.min.js" charset="UTF-8"></script>
		<script type="text/javascript" src="http://plupload.com/js/themeswitcher.js" charset="UTF-8"></script>

		<script type="text/javascript" src="http://snapnote-app.appspot.com/script.js"></script>


	</head>
	<body>
		<pre>this is a test</pre>

		<div id="example">

<p>This example shows you how to use the jQuery UI widget use the "Switch theme" drop down to the right to select different jQuery UI themes.</p>

<div id="uploader"><div class="plupload_wrapper"><div class="ui-widget-content plupload_container ui-resizable plupload_view_thumbs" id="uploader_container"><div class="ui-state-default ui-widget-header plupload_header"><div class="plupload_header_content"><div class="plupload_logo"> </div><div class="plupload_header_title">Select files</div><div class="plupload_header_text">Add files to the upload queue and click the start button.</div><div class="plupload_view_switch ui-buttonset" style="display: block;"><input type="radio" id="uploader_view_list" name="view_mode_uploader" checked="checked" class="ui-helper-hidden-accessible"><label class="plupload_button ui-button ui-widget ui-state-default ui-button-icon-only ui-corner-left" for="uploader_view_list" data-view="list" role="button" aria-disabled="false" title="List" aria-pressed="false"><span class="ui-button-text">List</span><span class="ui-button-icon-secondary ui-icon ui-icon-grip-dotted-horizontal"></span></label><input type="radio" id="uploader_view_thumbs" name="view_mode_uploader" class="ui-helper-hidden-accessible"><label class="plupload_button ui-button ui-widget ui-state-default ui-button-icon-only ui-corner-right ui-state-active" for="uploader_view_thumbs" data-view="thumbs" role="button" aria-disabled="false" title="Thumbnails" aria-pressed="true"><span class="ui-button-text">Thumbnails</span><span class="ui-button-icon-secondary ui-icon ui-icon-image"></span></label></div></div></div><table class="plupload_filelist plupload_filelist_header ui-widget-header"><tbody><tr><td class="plupload_cell plupload_file_name">Filename</td><td class="plupload_cell plupload_file_status">Status</td><td class="plupload_cell plupload_file_size">Size</td><td class="plupload_cell plupload_file_action">&nbsp;</td></tr></tbody></table><div class="plupload_content plupload_dropbox" id="uploader_dropbox"><div class="plupload_droptext">Drag files here.</div><ul class="plupload_filelist_content" id="uploader_filelist" unselectable="on"> <li class="plupload_done ui-state-default plupload_file" id="o_198gnfejip783l215c413jo1d49a" style="width:100px;"><div class="plupload_file_thumb" style="width:100px;height:60px;"><canvas width="100" height="60" id="uid_198gnfel31is71t5amka1m42c40c_canvas"></canvas></div><div class="plupload_file_status"><div class="plupload_file_progress ui-widget-header" style="width: 100%;"> </div><span class="plupload_file_percent">100%</span></div><div class="plupload_file_name" title="test.png"><span class="plupload_file_name_wrapper">test.png </span></div><div class="plupload_file_action"><div class="plupload_action_icon ui-icon ui-icon-circle-check"> </div></div><div class="plupload_file_size">56 kb</div><div class="plupload_file_fields"><input type="hidden" name="uploader_0_name" value="test.png"><input type="hidden" name="uploader_0_status" value="done"></div></li></ul><div class="plupload_clearer">&nbsp;</div></div><table class="plupload_filelist plupload_filelist_footer ui-widget-header"><tbody><tr><td class="plupload_cell plupload_file_name"><div class="plupload_buttons" id="uploader_buttons"><!-- Visible --><a class="plupload_button plupload_add ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary" id="uploader_browse" role="button" aria-disabled="false" style="z-index: 1;"><span class="ui-button-icon-primary ui-icon ui-icon-circle-plus"></span><span class="ui-button-text">Add Files</span></a>&nbsp;<a class="plupload_button plupload_start ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary ui-button-disabled ui-state-disabled" id="uploader_start" role="button" aria-disabled="true"><span class="ui-button-icon-primary ui-icon ui-icon-circle-arrow-e"></span><span class="ui-button-text">Start Upload</span></a>&nbsp;<a class="plupload_button plupload_stop ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-primary plupload_hidden" id="uploader_stop" role="button" aria-disabled="false"><span class="ui-button-icon-primary ui-icon ui-icon-circle-close"></span><span class="ui-button-text">Stop Upload</span></a>&nbsp;<div id="html5_198gnes9b1ka3bvk4ed19ob19423_container" class="moxie-shim moxie-shim-html5" style="position: absolute; top: 0px; left: 0px; width: 94px; height: 27px; overflow: hidden; z-index: 0;"><input id="html5_198gnes9b1ka3bvk4ed19ob19423" type="file" style="font-size: 999px; opacity: 0; position: absolute; top: 0px; left: 0px; width: 100%; height: 100%;" multiple="" accept="image/jpeg,image/gif,image/png,application/zip,video/avi"></div></div><div class="plupload_started plupload_hidden"><!-- Hidden --><div class="plupload_progress plupload_right"><div class="plupload_progress_container ui-progressbar ui-widget ui-widget-content ui-corner-all" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="100"><div class="ui-progressbar-value ui-widget-header ui-corner-left ui-corner-right" style="display: block; width: 100%;"></div></div></div><div class="plupload_cell plupload_upload_status">Uploaded 1/1 files</div><div class="plupload_clearer">&nbsp;</div></div></td><td class="plupload_file_status"><span class="plupload_total_status">100%</span></td><td class="plupload_file_size"><span class="plupload_total_file_size">199 kb</span></td><td class="plupload_file_action"></td></tr></tbody></table><div class="ui-resizable-handle ui-resizable-s" style="z-index: 90;"></div></div><input class="plupload_count" value="1" type="hidden" id="uploader_count" name="uploader_count"></div></div>

<script type="text/javascript">
// Initialize the widget when the DOM is ready
$(function() {
	$("#uploader").plupload({
		// General settings
		runtimes : 'html5,flash,silverlight,html4',
		url : "/examples/upload",

		// Maximum file size
		max_file_size : '2mb',

		chunk_size: '1mb',

		// Resize images on clientside if we can
		resize : {
			width : 200, 
			height : 200, 
			quality : 90,
			crop: true // crop to exact dimensions
		},

		// Specify what files to browse for
		filters : [
			{title : "Image files", extensions : "jpg,gif,png"},
			{title : "Zip files", extensions : "zip,avi"}
		],

		// Rename files by clicking on their titles
		rename: true,
		
		// Sort files
		sortable: true,

		// Enable ability to drag'n'drop files onto the widget (currently only HTML5 supports that)
		dragdrop: true,

		// Views to activate
		views: {
			list: true,
			thumbs: true, // Show thumbs
			active: 'thumbs'
		},

		// Flash settings
		flash_swf_url : '/plupload/js/Moxie.swf',
	
		// Silverlight settings
		silverlight_xap_url : '/plupload/js/Moxie.xap'
	});
});
</script>


	</body>
</html>
