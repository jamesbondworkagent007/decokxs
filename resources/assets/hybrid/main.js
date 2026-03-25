const TAG = 'Hybrid'

function init() {
    setThemeFromQuery();
    notifyDomReady();
    observeDomSize();
    observeElementClick();
    observeImgLoad();
    loadDebugConsole();
    loadCustomStyleIfNeed();
}
function loadCustomStyleIfNeed() {
    const params = new URLSearchParams(window.location.search);

    // 获取 URL 中的 cssName 参数
    const cssName = params.get("cssName");

    // 如果 cssName 存在，并且不是空字符串
    if (cssName) {
        let link = document.createElement("link");
        link.rel = "stylesheet";
        link.type = "text/css";
        link.href = `${cssName}.css`;  // 使用 cssName 作为文件名来加载 CSS
        document.head.appendChild(link);
    }
}
function setThemeFromQuery() {
    // 根据 query 参数设置主题
    const params = new URLSearchParams(window.location.search);
    const isDarkMode = params.get('darkMode');
    if (isDarkMode === 'true') {
        document.body.classList.add('dark-mode');
    } else {
        document.body.classList.remove('dark-mode');
    }
    console.debug(TAG, 'Current is dark mode', isDarkMode);
}

function isDarkMode() {
    // media query not work on some devices
    // window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches;
    const params = new URLSearchParams(window.location.search);
    const isDarkMode = params.get('darkMode');
    return isDarkMode === 'true'
}

// 监听 dom 高度变化, 通知 native 进行处理
function observeDomSize() {

    // 获取文档的整体高度
    let lastHeight = document.documentElement.scrollHeight;

    // 创建一个回调函数，当 DOM 变化时调用
    const observerCallback = function (mutationsList, observer) {
        // 获取当前的页面高度
        const currentHeight = document.documentElement.scrollHeight;

        // 判断高度是否变化
        if (currentHeight !== lastHeight) {
            console.log(TAG, 'Document height changed:', currentHeight);
            lastHeight = currentHeight;

            // 通知 native 高度变化
            notifyHeightChanged(currentHeight);
        }
    };

    // 创建一个 MutationObserver 实例
    const observer = new MutationObserver(observerCallback);

    // 配置观察选项，监听整个 body 元素的子元素变化
    const config = {
        childList: true, // 监听子元素的变化
        subtree: true,   // 监听整个子树，包括孙元素
        attributes: true // 监听属性的变化（如 style 变化）
    };

    // 开始监听 body 元素的变动
    observer.observe(document.body, config);
}

// 监听 <a> , <img> 等元素的点击事件, 通知 native 进行处理
function observeElementClick() {
    document.addEventListener('click', function (event) {
        const tag = event.target.tagName.toLowerCase();
        if (tag === 'a') {
            console.log(TAG, 'Link click intercepted:', event.target.href);
            event.preventDefault();
            notifyOpenHyperlink(event.target.href);
        } else if (tag === 'img') {
            console.log(TAG, 'Image click intercepted:', event.target.src);
            event.preventDefault();

            // Get clicked image frame info
            const imgElement = event.target;
            const rect = imgElement.getBoundingClientRect();
            const imgList = document.querySelectorAll('img');
            const imgSrcList = Array.from(imgList).map(img => img.src);
            const index = imgSrcList.indexOf(imgElement.src);

            // Create frame info for clicked image
            const clickedImageFrame = {
                x: rect.left,
                y: rect.top,
                width: rect.width,
                height: rect.height
            };

            console.log(TAG, 'Image frame info:', clickedImageFrame);
            notifyShowImageGallery(imgSrcList, index, clickedImageFrame);
        }
    });
}

// 监听 img 加载事件，若失败，则替换为默认图片
function observeImgLoad() {
    const dayPlaceholderBase64 = 'data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTQzIiBoZWlnaHQ9IjE0MyIgdmlld0JveD0iMCAwIDE0MyAxNDMiIGZpbGw9Im5vbmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiAgICA8cGF0aCBkPSJNNzEuOTUyMSAxLjA5MThDMzMuMjkyMiAxLjA5MTggMS45NTIxNSAzMi40MzE5IDEuOTUyMTUgNzEuMDkxOEMxLjk1MjE1IDc1LjQ5MDQgMi4zNTc4NSA3OS43OTQyIDMuMTMzODcgODMuOTY3OUw0My41NTU0IDQ4LjEwNTVDNDQuMzUxIDQ3LjM5OTYgNDUuNTYgNDcuNDQgNDYuMzA2OCA0OC4xOTczTDYyLjM1NDQgNjQuNDcxOEw5My45ODQ0IDMyLjUyMjJDOTQuNzY3IDMxLjczMTcgOTYuMDQ0MyAzMS43MzE3IDk2LjgyNyAzMi41MjIyTDE0MS42MzcgNzcuNzgxNEMxNDEuODQ1IDc1LjU3OTcgMTQxLjk1MiA3My4zNDgyIDE0MS45NTIgNzEuMDkxOEMxNDEuOTUyIDMyLjQzMTkgMTEwLjYxMiAxLjA5MTggNzEuOTUyMSAxLjA5MThaIiBmaWxsPSIjRDlEOUQ5Ii8+CiAgICA8cGF0aCBkPSJNMTUuMjEwMSAxMTIuMDkyQzE4LjcwMjcgMTE2LjkxNyAyMi43OTU2IDEyMS4yOCAyNy4zNzkzIDEyNS4wNjlDMzkuNDg2MSAxMzUuMDc4IDU1LjAxNjggMTQxLjA5MiA3MS45NTIxIDE0MS4wOTJDMTA4LjM1NiAxNDEuMDkyIDEzOC4yNjkgMTEzLjMwMyAxNDEuNjM3IDc3Ljc4MTRNMTUuMjEwMSAxMTIuMDkyTDYyLjM1NDQgNjQuNDcxOE0xNS4yMTAxIDExMi4wOTJDOS4yNjQ5OSAxMDMuODc5IDUuMDU5NDIgOTQuMzI0MSAzLjEzMzg3IDgzLjk2NzlNMTQxLjYzNyA3Ny43ODE0QzE0MS44NDUgNzUuNTc5NyAxNDEuOTUyIDczLjM0ODIgMTQxLjk1MiA3MS4wOTE4QzE0MS45NTIgMzIuNDMxOSAxMTAuNjEyIDEuMDkxOCA3MS45NTIxIDEuMDkxOEMzMy4yOTIyIDEuMDkxOCAxLjk1MjE1IDMyLjQzMTkgMS45NTIxNSA3MS4wOTE4QzEuOTUyMTUgNzUuNDkwNCAyLjM1Nzg1IDc5Ljc5NDIgMy4xMzM4NyA4My45Njc5TTE0MS42MzcgNzcuNzgxNEw5Ni44MjcgMzIuNTIyMkM5Ni4wNDQzIDMxLjczMTcgOTQuNzY3IDMxLjczMTcgOTMuOTg0NCAzMi41MjIyTDYyLjM1NDQgNjQuNDcxOE02Mi4zNTQ0IDY0LjQ3MThMNDYuMzA2OCA0OC4xOTczQzQ1LjU2IDQ3LjQ0IDQ0LjM1MSA0Ny4zOTk2IDQzLjU1NTQgNDguMTA1NUwzLjEzMzg3IDgzLjk2NzkiIHN0cm9rZT0iI0Q5RDlEOSIgc3Ryb2tlLXdpZHRoPSIyIi8+Cjwvc3ZnPgo=';
    const nightPlaceholderBase64 = 'data:image/svg+xml;base64,PHN2ZyB3aWR0aD0iMTQzIiBoZWlnaHQ9IjE0MyIgdmlld0JveD0iMCAwIDE0MyAxNDMiIGZpbGw9Im5vbmUiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+CiAgICA8cGF0aCBkPSJNNzEuODQ1NyAxLjA5MjI5QzMzLjE4NTggMS4wOTIyOSAxLjg0NTcgMzIuNDMyNCAxLjg0NTcgNzEuMDkyM0MxLjg0NTcgNzUuNDkwOSAyLjI1MTQgNzkuNzk0NyAzLjAyNzQzIDgzLjk2ODRMNDMuNDQ4OSA0OC4xMDZDNDQuMjQ0NiA0Ny40MDAxIDQ1LjQ1MzUgNDcuNDQwNCA0Ni4yMDAzIDQ4LjE5NzhMNjIuMjQ4IDY0LjQ3MjNMOTMuODc4IDMyLjUyMjdDOTQuNjYwNiAzMS43MzIyIDk1LjkzNzkgMzEuNzMyMiA5Ni43MjA1IDMyLjUyMjdMMTQxLjUzIDc3Ljc4MTlDMTQxLjczOSA3NS41ODAyIDE0MS44NDYgNzMuMzQ4NyAxNDEuODQ2IDcxLjA5MjNDMTQxLjg0NiAzMi40MzI0IDExMC41MDYgMS4wOTIyOSA3MS44NDU3IDEuMDkyMjlaIiBmaWxsPSIjMzgzODM4Ii8+CiAgICA8cGF0aCBkPSJNMTUuMTAzNyAxMTIuMDkzQzE4LjU5NjIgMTE2LjkxOCAyMi42ODkxIDEyMS4yOCAyNy4yNzI4IDEyNS4wNjlDMzkuMzc5NyAxMzUuMDc4IDU0LjkxMDQgMTQxLjA5MiA3MS44NDU3IDE0MS4wOTJDMTA4LjI0OSAxNDEuMDkyIDEzOC4xNjIgMTEzLjMwNCAxNDEuNTMgNzcuNzgxOU0xNS4xMDM3IDExMi4wOTNMNjIuMjQ4IDY0LjQ3MjNNMTUuMTAzNyAxMTIuMDkzQzkuMTU4NTQgMTAzLjg4IDQuOTUyOTcgOTQuMzI0NiAzLjAyNzQzIDgzLjk2ODRNMTQxLjUzIDc3Ljc4MTlDMTQxLjczOSA3NS41ODAyIDE0MS44NDYgNzMuMzQ4NyAxNDEuODQ2IDcxLjA5MjNDMTQxLjg0NiAzMi40MzI0IDExMC41MDYgMS4wOTIyOSA3MS44NDU3IDEuMDkyMjlDMzMuMTg1OCAxLjA5MjI5IDEuODQ1NyAzMi40MzI0IDEuODQ1NyA3MS4wOTIzQzEuODQ1NyA3NS40OTA5IDIuMjUxNCA3OS43OTQ3IDMuMDI3NDMgODMuOTY4NE0xNDEuNTMgNzcuNzgxOUw5Ni43MjA1IDMyLjUyMjdDOTUuOTM3OSAzMS43MzIyIDk0LjY2MDYgMzEuNzMyMiA5My44NzggMzIuNTIyN0w2Mi4yNDggNjQuNDcyM002Mi4yNDggNjQuNDcyM0w0Ni4yMDAzIDQ4LjE5NzhDNDUuNDUzNSA0Ny40NDA0IDQ0LjI0NDYgNDcuNDAwMSA0My40NDg5IDQ4LjEwNkwzLjAyNzQzIDgzLjk2ODQiIHN0cm9rZT0iIzM4MzgzOCIgc3Ryb2tlLXdpZHRoPSIyIi8+Cjwvc3ZnPgo=';
    document.addEventListener("error", (event) => {
        const target = event.target;
        if (target.tagName === "IMG") {
            console.log(TAG, `img: ${target.src} load failed`);
            target.src = isDarkMode() ? nightPlaceholderBase64 : dayPlaceholderBase64;
            target.style.paddingLeft = "35%";
            target.style.paddingRight = "35%";
        }
    }, true);
}

// 加载调试控制台,仅在 DEBUG 模式生效
function loadDebugConsole() {

    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    const debug = urlParams.get('debug');

    if (debug === 'true') {
        const url = 'https://unpkg.com/vconsole@latest/dist/vconsole.min.js'

        const script = document.createElement('script');
        script.type = 'text/javascript';
        script.src = url;

        script.onload = function () {
            console.log(TAG, 'VConsole loaded ok.');
            new window.VConsole();
        };

        // 定义加载失败的处理
        script.onerror = function (error) {
            console.error(TAG, 'VConsole loaded failed', JSON.stringify(error));
        };

        // 将 script 插入到 head 中以开始加载
        document.head.appendChild(script);
    }
}

// 监听 content dom 变化，配置 img 标签高度
function observeContentChangeOnceAndAutoImgSize(contentElement, imgConfigList) {
    const timeoutNotify = setTimeout(() => {
        // 如果 150ms 后还没有触发，则直接通知
        console.log(TAG, 'timeout notifyContentUpdated');
        notifyContentUpdated();
    }, 150);
    const observer = new MutationObserver((mutationsList) => {
        mutationsList.forEach(mutation => {
            if (mutation.type === 'childList') {
                observer.disconnect();
                if (imgConfigList) {
                    // 查找所有 img 元素
                    const imgList = document.querySelectorAll('img');
                    imgList.forEach(img => {
                        // update img css style: aspect-ratio
                        const src = img.src;
                        const config = imgConfigList.find(item => item.src === src);
                        if (config) {
                            const ratio = config.width / config.height;
                            img.style.aspectRatio = ratio;
                            console.log(TAG, 'Set img aspect-ratio:', ratio, JSON.stringify(config));
                        } else {
                            img.style.aspectRatio = 'auto';
                            console.log(TAG, 'Set img aspect-ratio:', 'auto', src);
                        }
                        img.onload = function () {
                            img.style.opacity = 1;
                        }
                    });
                }
                console.log(TAG, 'observeContentChangeOnceAndAutoImgSize notifyContentUpdated');
                clearTimeout(timeoutNotify);
                notifyContentUpdated();
            }
        });
    });
    observer.observe(contentElement, { childList: true, subtree: true });
}

function resolveHtmlContent(htmlString, imgConfigList) {
    var startTime = performance.now();
    var resolvedHtmlString = decodeURIComponent(htmlString);
    if (imgConfigList) {
        imgConfigList.forEach((config) => {
            if (config.node) {
                resolvedHtmlString = resolvedHtmlString.replace(config.node, '<img class="fade-in-image" src="' + config.src + '" style="aspect-ratio: ' + config.width / config.height + ';" />');
            }
        });
    }
    var endTime = performance.now();
    console.log(TAG, `resolveHtmlContent took ${endTime - startTime} milliseconds`, resolvedHtmlString);
    return resolvedHtmlString;
}

////////////////////////// bridge //////////////////////////

// js -> native
function notifyDomReady() {
    NativeApi.notifyWebViewDomReady();
}

// js -> native
function notifyHeightChanged(height) {
    NativeApi.notifyWebViewDomHeightChanged(height);
}

// js - native
function notifyShowToast(text) {
    NativeApi.notifyShowToast(text);
}

// js - native
function notifyOpenHyperlink(href) {
    NativeApi.notifyOpenHyperlink(href);
}

// js - native
function notifyShowImageGallery(imageUrlList, defaultSelectIndex, clickedImageFrame) {
    NativeApi.notifyShowImageGallery(imageUrlList, defaultSelectIndex, clickedImageFrame);
}

// js - native
function notifyContentUpdated() {
    setTimeout(() => {
        NativeApi.notifyContentUpdated();
    });
}

const JsApi = {
    latestContent: null,
    injectHtmlContent: (model) => {
        console.log(TAG, 'JsApi injectHtmlContent:' + model.htmlString);

        // Filter duplicate content
        if (JsApi.latestContent == model.htmlString) {
            console.warn(TAG, 'inject same content, so ignore.');
            return
        }

        JsApi.latestContent = model.htmlString;
        const contentElement = document.getElementById('content');

        const imgConfigList = model.imgConfigList;
        if (imgConfigList && imgConfigList.length > 0) {
            observeContentChangeOnceAndAutoImgSize(contentElement, imgConfigList);
        } else {
            notifyContentUpdated();
        }

        // 刷新 content
        if (model.htmlString) {
            const decodeHtmlString = resolveHtmlContent(model.htmlString, model.imgConfigList);
            contentElement.innerHTML = decodeHtmlString;
        } else {
            contentElement.innerHTML = "<p></p>";
        }
    }
}

const NativeApi = {
    notifyShowToast: (text) => {
        invokeNativeApi('showToast', { text });
    },
    notifyWebViewDomReady: (model) => {
        invokeNativeApi('onWebViewDomReady', null);
    },
    notifyWebViewDomHeightChanged: (height) => {
        invokeNativeApi('onWebViewDomHeightChanged', { height });
    },
    notifyShowImageGallery: (imageUrlList, defaultSelectIndex, clickedImageFrame) => {
        const data = { imageUrlList, defaultSelectIndex, clickedImageFrame };
        data.scrollY = window.scrollY;
        invokeNativeApi('showImageGallery', data);
    },
    notifyOpenHyperlink: (href) => {
        invokeNativeApi('openHyperLink', { url: href });
    },
    notifyContentUpdated: () => {
        invokeNativeApi('onContentUpdated', null);
    },
}

// js -> native real call
function invokeNativeApi(handlerName, model) {
    if (window.AndroidApi) {
        console.log(TAG, 'invokeNativeApi:', handlerName, model);
        if (model) {
            const modelJson = JSON.stringify(model);
            window.AndroidApi.invokeNativeApi(handlerName, modelJson);
        } else {
            window.AndroidApi.invokeNativeApi(handlerName, "");
        }
    } else {
        console.error(TAG, 'AndroidApi not found:', handlerName);
    }
}

function invokeJsApi(handlerName, modelJson) {
    console.log(TAG, 'invokeJsApi:', handlerName, modelJson);
    const handler = JsApi[handlerName];
    if (handler) {
        const model = JSON.parse(modelJson);
        if (model) {
            handler(model);
        } else {
            handler();
        }
    } else {
        console.error(TAG, 'JsApi handler not found:', handlerName);
    }
}