~~~c
/* 2018.11.20
   Lee soobin  */

bgColor('#A4A4A4');

box().append().size('90%', 200).color('white').border(7).borderRadius(5).borderColor('black').image('woman_tone1_big');

box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('red').marginTop(7).paddingTop(3).text('내 이름은 000 입니다');
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('pink').marginTop(7).paddingTop(3).text('00을 좋아합니다');
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('orange').marginTop(7).paddingTop(3).text('나이는 00살 입니다');
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('yellow').marginTop(7).paddingTop(3).text('취미는 00 입니다');
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('green').marginTop(7).paddingTop(3).text('학교는 00 학교입니다');
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor('blue').marginTop(7).paddingTop(3).text('좋아하는 과목은 00 입니다');
~~~

~~~c
/* 2018.11.21
Lee soobin  */

bgColor('#A4A4A4');

var borderColors = ['red', 'pink', 'orange', 'yellow', 'green', 'blue'];
var boxText = ['내 이름은 000 입니다', '00을 좋아합니다', '나이는 00살 입니다', '취미는 00 입니다', '학교는 00 학교입니다', '좋아하는 과목은 00 입니다'];

box().append().size('90%', 200).color('white').border(7).borderRadius(5).borderColor('black').image('woman_tone1_big');

for (var i = 0; i < borderColors.length; i++) {
box().append().size('90%',40).color('white').border(7).borderRadius(5).borderColor(borderColors[i]).marginTop(7).paddingTop(3).text(boxText[i]);
}
~~~

