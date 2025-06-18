/*
* covid.js
*/
import { makeRow, url } from './covid_module.js';

let centerAry;

fetch(url)
	.then(data => data.json())
	.then(result => {
		console.log(result.data);
		//시도정보배열.
		let sidoAry = [];
		//let centerAry = result.data; // [{}, {}, {} ... , {}]
		// tr> td*2
		// #centerList
		centerAry.forEach((center, idx) => {
			// sidoAry에 중복하지 않고 담기.
			if (sidoAry.indexOf(center.sido) == -1) {
				sidoAry.push(center.sido); // 추가.
			}
			if (idx < 10) {
				console.log(center);
				// tr생성하기.

				let tr = makeRow(center);
				document.querySelector('#centerList').appendChild(tr);
			} // end of id.
		}); // end of for.
		console.log(sidoAry);
		//sidoAry의 갯수만큼<option value="sido정보">sido정보</option>
		sidoAry.forEach(sido => {
			let opt = document.createElement('option');
			opt.value = sido;
			opt.innerText = sido;
			document.getElementById('sido').appendChild(opt);
		})
	})
	.catch(err => console.log(err))
// event.
document.querySelector('button.btn-primary').addEventListener('click', function(e) {

	//목록지우고
	document.querySelector('#centerList').innerHTML = ""; // CLEAR
	let keyword = document.getElementById('centerName').value; //검색값.

	centerAry
		.filter(center => center.centerName.indexOf(keyword))
		.forEach(center => {
			let tr = makeRow(center);
			document.querySelector('#centerList').appendChild(tr);
		})
});

//select태그의 change이벤트.
document.querySelector('#sido').addEventListener('change', function(e) {

	//목록지우고
	document.querySelector('#centerList').innerHTML = ""; // CLEAR
	let keyword = document.getElementById('sido').value; //검색값.

	centerAry // 배열
	    .reduce((acc, center) => {
			if(center.sido == keyword) {
				let tr = makeRow(center);
				acc.appendChild(tr);
			}
			return acc; // 다음순번의 acc값으로 반환.,
		}, document.querySelector('#centerList'));
});

// [].push(), [].unshift(), [].pop, [].shift() => [].splice();
// reduce();

let result = [1, 3, 5, 7].reduce(function(acc, elem, idx, ary) {
	console.log(acc, elem);
	if (elem > 4) {
		let li = document.createElement('li');
		li.innerHTML = elem;
		acc.appendChild(li);
	}
	return acc; // 1
}, document.querySelector('#target'));
console.log('결과:', result);










