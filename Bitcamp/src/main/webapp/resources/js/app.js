/**
 * 
 */
var app = app || {};
app = {
	init : x=>{
		var head = document.createElement( 'head' );
		var body = document.createElement( 'body' );
		document.documentElement.appendChild(head);
		document.documentElement.appendChild(body);
		//head와 body 만드는 것
		$(createDiv({id: 'wrapper'})).appendTo('body');
		$(createDiv({id: 'container'})).appendTo('#wrapper');
		//$('#result').text(x.result);
		$.getJSON(x.context+'/', x=>{
			alert('dddddd');
			if(x.exist=='true'){
				$('#container').load('<div id="test"><h1 id="result">존재OO </h1></div>');
			}else{
				$('#container').load('<div id="test"><h1 id="result">존재XX </h1></div>');
			}
		})
	}
}
var createDiv = x=>{
	return '<div id="'+x.id+'" clazz="'+x.clazz+'"></div>';
}
var createHTag =x=>{
	return '<h'+x.num+' id="'+x.id+'">'+x.val+'</h'+x.num+'>';
}
/*dom.documentElement.innerHTML = '<head></head><body></body>';
Or go with the more rigorous:

var head = dom.createElement( 'head' );
var body = dom.createElement( 'body' );
dom.documentElement.appendChild(head);
dom.documentElement.appendChild(body);*/