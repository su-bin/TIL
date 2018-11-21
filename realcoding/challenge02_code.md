~~~c
/* 2018.11.21
   Lee soobin  */

var mainBox = box().append().size(400, 310).border(5);

var titleBox = box().appendTo(mainBox).size(390, 50).paddingTop(10).text('한국인이 가장 좋아하는 색깔').textSize(20).color('lightGreen');

var englishBox1 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('white');
var koreaBox1 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('흰색').textColor('white');
var englishBox2 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('red');
var koreaBox2 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('빨강색').textColor('white');
var englishBox3 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('blue');
var koreaBox3 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('파란색').textColor('white');
var englishBox4 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('black');
var koreaBox4 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('검정색').textColor('white');
var englishBox5 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('green');
var koreaBox5 = box().appendTo(mainBox).size(195, 50).paddingTop(15).click(onClick).text('초록색').textColor('white');

function onClick(bx) {
​    if(bx == englishBox1 || bx == koreaBox1) {
​        koreaBox1.textColor('black');
​        titleBox.textColor('white');
​    } else if(bx == englishBox2 || bx == koreaBox2) {
​        koreaBox2.textColor('black');
​        titleBox.textColor('red');
​    } else if(bx == englishBox3 || bx == koreaBox3) {
​        koreaBox3.textColor('black');
​        titleBox.textColor('blue');
​    } else if(bx == englishBox4 || bx == koreaBox4) {
​        koreaBox4.textColor('black');
​        titleBox.textColor('black');
​    } else if(bx == englishBox5 || bx == koreaBox5) {
​        koreaBox5.textColor('black');
​        titleBox.textColor('green');
​    }
}
~~~