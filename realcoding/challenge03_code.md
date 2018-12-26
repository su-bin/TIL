~~~c
/* 2018.12.21
Lee soobin  */

var questionArray = [ '박스를 만드는 함수는?', '박스를 화면에 \n 그리는 함수는?', 
                      '상자 안쪽 여백을 정하는 \n 함수는?', '상자 바깥쪽 여백을 \n정하는 함수는?', 
                      '상자안에 글자를 넣는 \n 함수는?', '상자의 크기를 \n 정하는 함수는?', 
                      '상자 테두리의 굵기를 \n 정하는 함수는?', '상자 테두리의 둥글기를 \n 정하는 함수는?', 
                      '반복문을 쓸 때 \n 사용하는 키워드는?', '조건문을 쓸 때 \n 사용하는 키워드는?' ];

// questionArray 이라는 배열을 만들고 10개의 문제를 담아줍니다
                     
var answerArray = [ 'box( )', 'append( )', 'padding( )', 'margin( )', 'text( )', 
                    'size( )', 'border( )', 'borderRadius( )', 'for', 'if - else if - eles' ];
// answerArray 이라는 배열을 만들고 10개의 답을 순서대로 담아줍니다

bgImage('bg_pencil');
// 배경 이미지를 넣어줍니다

box().append().size(375, 40).color('white').text('\'선생님의 문제노트\'').textSize(15)
     .border(3).borderColor('black').borderRadius(5)
     .margin('auto').marginTop(10).paddingTop(5).block().opacity(85);
// 박스를 만들고 '선생님의 문제노트'라는 글자를 넣어줍니다.

var quizNumber = random(10);
// quizNumber 라는 변수에 0부터9까지중 무작위로 숫자하나를 담아줍니다

var quizBox = box().append().size(375, 140).color('white').text(questionArray[quizNumber]).textSize(30)
                   .border(3).borderColor('black').borderRadius(5)
                   .margin('auto').marginTop(10).padding(20).block().opacity(85);
// 박스를 만들고 문제 배열에서 quizNumber 번째 문제를 글자로 넣어줍니다
                   
var answerBox = box().append().size(390, 300).border(0).margin('auto').block();

for(var i = 0; i < answerArray.length; i++) {
    box().appendTo(answerBox).size(180, 50).color('white').text(answerArray[i]).textSize(20)
         .border(3).borderColor('dimgray').borderRadius(5)
         .margin('10 6 0 6').paddingTop(7).click(answerClick).opacity(85);
}
// 반복문을 정답 배열의 길이만큼 반복해서 박스를 만들고 박스의 글자에 정답배열의 원소들을 차례대로 넣어줍니다

function answerClick(bx) {
    if (bx.text() == answerArray[quizNumber]) {             // 클릭한 박스의 내용이 현재 문제의 답안인지 확인합니다
        quizBox.text('정답입니다').textColor('blue');
        bx.borderColor('blue').timer(onTimer, 500);         
    } else {
        quizBox.text('틀렸습니다').textColor('red');
        bx.borderColor('red').timer(onTimer, 500);          // 정답 여부를 0.5초 동안 보여줍니다
    }
    
}

function onTimer(bx) {                          // 문제 박스의 내용을 정답이면 새로운 문제로 오답이면 기존 문제로 바꿔줍니다
    if(quizBox.textColor()=='blue'){
        quizNumber = random(10);
    }
    quizBox.text(questionArray[quizNumber]).textColor('black');
    bx.borderColor('dimgray');
    bx.clearTimer();
}
~~~