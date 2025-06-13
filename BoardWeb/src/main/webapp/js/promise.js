/**
 * promise.js
 */
// Promise 객체역할.
// 비동기방식의 처리를 동기방식으로 순서로 처리하기에 유용함.
// 화살표 함수
fetch('replyList.do?bno=221')
	.then(function(data) {
		//console.log(data); // Response 결과.
		return data.json(); // json -> object
	})
	.then(function(result) {
		console.log(result);
		result.forEach(function(item) {
			let tr = makeRow(item);
			//tr을 tbody에 추가.
			document.querySelector('table:nth-of-type(2) tbody').appendChild(tr);
		});//댓글수만큼tr생성.
	})
	.catch(function(err) { // .then 이 에러가나면 실행
		console.log(err);
	})
// 등록이벤트.
document.querySelector("#addReply").addEventListener('click', addReplyFnc);
// 댓글등록함수.
function addReplyFnc(e){
	const bno = document.querySelector('#bno').value;
	const reply = document.querySelector('#reply').value;
	//필수입력.
	if (!bno || !reply || !logId) {
		alert('필수값 입력!');
		return;
	}
	//ajax호출.
	//fetch(url) => get방식요청.
	//fetch(url, option) => post요청.
	fetch('addReply.do', {
		method: 'post',
		headers: {'Content-Type': 'application/x-www-form-urlencoded' },
		body: 'bno=' + bno + '&reply=' + reply + '&replyer=' + logId
	})
	
	//fetch('addReply.do?bno=' + bno + '&reply=' + reply + '&replyer=' + logId)
		.then(json => json.json())
		.then(result => {
			if(result.retCode == 'Success'){
				alert('댓글이 등록되었습니다.');
				let tr = makeRow(result.retVal);
				//
				let target = document.querySelector('table:nth-of-type(2) tbody tr');
				document.querySelector('table:nth-of-type(2) tbody').insertBefore(tr, target);
			} else {
				alert('댓글 등록에 실패했습니다.');
			}
		})
		.catch(err=>console.error(err));
} // end of addReplyFnc.

// 댓글삭제함수.
function deleteReplyFnc(e) {
	if (!confirm("삭제하겠습니까?")) {
		return;
	}
	// removeReply.do?rno=221
	let rno = e.target.parentElement.parentElement.dataset.rno;
	// ajax 호출.
	fetch('removeReply.do?rno=' + rno)
		.then(json => json.json())
		.then(data => {
			if (data.retCode == 'Success') {
				alert('삭제성공!');
				e.target.parentElement.parentElement.remove();
			} else {
				alert('삭제실패.');
			}
		})
		.catch(err=>console.error(err))
} // end of deleteReplyFnc.

// 댓글을 row 생성
function makeRow(item) {
	let tr = document.createElement('tr'); // <tr></tr>
	tr.setAttribute('data-rno', item.replyNo); // <tr data-rno="8" ></tr>
	// 글번호, 내용, 작성자
	for (let prop of ['replyNo', 'reply', 'replyer']) {
		let td = document.createElement('td'); // <td>3</td>
		td.innerHTML = item[prop]; // item['replyNo']
		tr.appendChild(td); // <tr><td>3</td></tr> 
	}
	// button생성.
	let td = document.createElement('td');
	let btn = document.createElement('button'); // <td></td>
	btn.addEventListener('click', deleteReplyFnc);
	btn.innerHTML = '❌';
	btn.className = 'btn btn-danger';
	td.appendChild(btn);
	tr.appendChild(td);
	return tr; // makeRow를 호출한 영역으로 tr 반환.
} // end of makeRow.