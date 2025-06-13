/**
 * service.js
 */
const svc = {
	add: function(num1 = 0, num2 = 0) {
		return num1 + num2;
	},
	// 목록출력메소드.
	replyList: function() {
		fetch('replyList.do?bno=' + bno)
			.then(data => data.json())
			.then(successCallback)
			.catch(errorcallback)
	},
	removeReply(rno, successCallback, errorCallback) {
		// ajax.
		fetch('removeReply.do?rno' + rno)
			.then(data => data.json())
			.then(successCallback)
			.catch(errorCallback)
	},
	// 댓글등록메소드.
	addReply(param = { bno, reply, replyer }, successCallback, errorCallback) {
		// ajax.
		fetch('addReply.do', {
			method: 'post',
			headers: {'Content-Type': 'application/x-www-form-urlencoded'},
			body: 'bno=' + param.bno + '&reply=' + param.reply + '&replyer=' + param.replyer
		})
			.then(data => data.json())
			.then(successCallback)
			.catch(errorCallback)
	}
}

// add함수.
const add = (num1, num2) => {
	return num1 + num2;
}
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
}