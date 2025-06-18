/**
 * covid_module.js
 */

const defaultNum = 10;
let url = `https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=Mhjo5LPG8YD22FZ5rJohAU2JQRjkugW48jsFc4K6xLXDQumBQT2sJVn50s%2BhzvC8cuyVW%2FF%2B3Mm3Hftp1GoaAQ%3D%3D`
function makeRow(center) {
	let tr = document.createElement('tr');
	for (const prop of ['id', 'centerName', 'phoneNumber']) {
		let td = document.createElement('td'); // <td></td>
		td.innerHTML = center[prop];
		tr.appendChild(td);
	}
	return tr;
}

export { makeRow, url};
