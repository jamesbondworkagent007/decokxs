var vm = new Vue({
    el: '#app',
    data: function () {
        return {
            info: null,
            requestHeader: null,
            responseHeader: null,
            errorInfo: null,
            responseJSONData: null,
            responseHTMLData: null,
            responseImageData: null,
            reqBody: null
        }
    }
});

function updateInfo(params) {
    vm.info = params;
    highlightAll();
}

function updateRequestHeader(params) {
    vm.requestHeader = params;
    highlightAll();
}

function updateResponseHeader(params) {
    vm.responseHeader = params;
    highlightAll();
}

function updateErrorInfo(params) {
    vm.errorInfo = params;
    highlightAll();
}

function updateResponseJSONData(params) {
    vm.responseJSONData = params;
    highlightAll();
}

function updateResponseHTMLData(params) {
    vm.responseHTMLData = params;
    highlightAll();
}

function updateResponseImageData(params) {
    vm.responseImageData = params;
    highlightAll();
}

function updateReqBody(params) {
    vm.reqBody = params;
    highlightAll();
}

function highlightAll() {
    setTimeout(() => {
        Prism.highlightAll();
    }, 50);
}