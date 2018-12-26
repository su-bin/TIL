~~~c
/* 2018.11.30
   Lee soobin  */

var titleBox = box().append().color('gold').text('Calculator').textSize(20).paddingTop(10);


var num1 = random(100)+1;
var num2 = random(100)+1;
var result = num1 + num2;

box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num1).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('+').marginTop(10);
box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num2).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('=').marginTop(10);
box().append().size(130, 50).textSize(20).paddingTop( 5).border(5).text(result).marginTop(10);

num1 = random(100)+1;
num2 = random(100)+1;
result = num1 - num2;

box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num1).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('-').marginTop(10);
box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num2).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('=').marginTop(10);
box().append().size(130, 50).textSize(20).paddingTop( 5).border(5).text(result).marginTop(10);

num1 = random(100)+1;
num2 = random(100)+1;
result = num1 * num2;

box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num1).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('*').marginTop(10);
box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num2).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('=').marginTop(10);
box().append().size(130, 50).textSize(20).paddingTop( 5).border(5).text(result).marginTop(10);

num1 = random(100)+1;
num2 = random(100)+1;
result = num1 / num2 + '';

box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num1).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('/').marginTop(10);
box().append().size(110, 50).textSize(20).paddingTop( 5).border(5).text(num2).marginTop(10);
box().append().size( 25, 50).textSize(20).paddingTop(10).border(0).text('=').marginTop(10);
box().append().size(130, 50).textSize(20).paddingTop( 5).border(5).text(result.substring(0, 3)).marginTop(10);

~~~