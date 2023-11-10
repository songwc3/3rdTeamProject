const chatbotLog = document.querySelector('.chatbot_log');

let messageDiv; // messageDiv 변수를 함수 외부에서 선언
let messageText; // messageText 변수를 함수 외부에서 선언

function addWeatherMessageToLog(message, type) {
    messageDiv = document.createElement('div');
    messageDiv.classList.add('message', type);

    // 챗봇 응답 메시지 처리
        if (type === 'bot') {
            messageText = document.createElement('p');
            messageText.textContent = message;
            messageText.classList.add('message_box');
        } 
//         else {
//             if (message.startsWith("날씨현재")) {
//                     message = message.substring(4); // "날씨현재"를 제외한 나머지 부분만 추출
//                 }
//             // 사용자 메시지 처리
//             messageText = document.createElement('p');
//             messageText.textContent = message;
//             messageText.classList.add('message_box');
//             // 메시지 상자를 감추는 스타일 적용
// //            messageText.style.display = 'none';
//         }
    messageDiv.appendChild(messageText);
    chatbotLog.appendChild(messageDiv);
    chatbotLog.scrollTop = chatbotLog.scrollHeight;
}

async function sendWeatherMessage(inputValue) {
    const message = inputValue.trim();
    if (message) {
        // addWeatherMessageToLog(message, 'user');
        const response = await fetch(`/api/chatbot2/chat?message=${encodeURIComponent(message)}`);

        if (response.status === 200) {
            const botResponse = await response.text();
            console.log(botResponse);
            addWeatherMessageToLog(botResponse, 'bot');
        } else {
            const errorMessage = await response.text();
            addWeatherMessageToLog(errorMessage, 'error');
        }
    }
}

export { addWeatherMessageToLog };
export { sendWeatherMessage };

