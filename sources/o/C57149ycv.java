package o;

import android.webkit.ConsoleMessage;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.wallet.hardware.api.onekey.OneKeySDKError;
import com.okinc.wallet.hardware.impl.onekey.data.Cancel;
import com.okinc.wallet.hardware.impl.onekey.data.Unsuccessful;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$cancel$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$cancelInternal$$inlined$executeNativeCall$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$cancelInternal$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$handleNativeCallback$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$handleRequest$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$loadScriptInternal$1;
import com.okinc.wallet.hardware.impl.onekey.js.OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57149ycv {
    public static final android.webkit.WebResourceResponse AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final java.util.Map<java.lang.String, AbstractC57148ycu> AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final TaskDescription DbNXlk;
    public final android.content.Context EZpvd;
    public android.webkit.WebView KWHzl;
    public final AtomicLong copydefault;
    public final ConcurrentHashMap<java.lang.String, ActionBar> djBIcL;
    public final CoroutineDispatcher gEmmrt;
    public final SendChannel<StateListAnimator> isConnected;
    public final CoroutineScope valueOf;
    public Job values;

    /* JADX INFO: renamed from: o.ycv$Activity */
    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public Activity(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("OneKeySDKJavaScriptEngine", "Throwable caught", th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.Map<java.lang.String, ? extends o.ycu> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57149ycv(@NotNull android.content.Context context, @NotNull java.util.Map<java.lang.String, ? extends AbstractC57148ycu> map, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher3, "");
        this.EZpvd = context;
        this.AYXKKw = map;
        this.gEmmrt = coroutineDispatcher;
        this.AhwBna = coroutineDispatcher2;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher3).plus(new Activity(CoroutineExceptionHandler.Key)));
        this.valueOf = CoroutineScope;
        this.copydefault = new AtomicLong();
        this.djBIcL = new ConcurrentHashMap<>();
        this.isConnected = ActorKt.actor$default(CoroutineScope, null, Integer.MAX_VALUE, null, null, new OneKeySDKJavaScriptEngine$monitorCharacteristicActor$1(this, null), 13, null);
        this.DbNXlk = new TaskDescription(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (r8v0 java.util.Map)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:53)) : (r9v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000d: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:54)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0012: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001a: INVOKE 
  (wrap:kotlinx.coroutines.MainCoroutineDispatcher:0x0016: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getMain():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:55))
 VIRTUAL call: kotlinx.coroutines.MainCoroutineDispatcher.getImmediate():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:55)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(android.content.Context, java.util.Map<java.lang.String, ? extends o.ycu>, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:50) call: o.ycv.<init>(android.content.Context, java.util.Map, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C57149ycv(android.content.Context context, java.util.Map map, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2, (i & 16) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher3);
    }

    /* JADX INFO: renamed from: o.ycv$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ycv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(android.webkit.WebView webView) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setCacheMode(3);
            webView.setWebChromeClient(new C1007Application());
            webView.setWebViewClient(new TaskDescription());
        }

        /* JADX INFO: renamed from: o.ycv$Application$Application, reason: collision with other inner class name */
        public static final class C1007Application extends android.webkit.WebChromeClient {

            /* JADX INFO: renamed from: o.ycv$Application$Application$Application, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes17.dex */
            public final /* synthetic */ class C1008Application {
                public static final /* synthetic */ int[] EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                static {
                    int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                    try {
                        iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
                    } catch (java.lang.NoSuchFieldError unused5) {
                    }
                    EZpvd = iArr;
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
                ConsoleMessage.MessageLevel messageLevel = consoleMessage != null ? consoleMessage.messageLevel() : null;
                int i = messageLevel == null ? -1 : C1008Application.EZpvd[messageLevel.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        pUU.KWHzl("OneKeySDKJavaScriptEngine", "TIP: message=" + consoleMessage.message() + "\nlineNumber=" + consoleMessage.lineNumber() + "\nsourceId=" + consoleMessage.sourceId());
                    } else if (i == 2) {
                        pUU.KWHzl("OneKeySDKJavaScriptEngine", "LOG: message=" + consoleMessage.message() + "\nlineNumber=" + consoleMessage.lineNumber() + "\nsourceId=" + consoleMessage.sourceId());
                    } else if (i == 3) {
                        pUU.valueOf("OneKeySDKJavaScriptEngine", "WARNING: message=" + consoleMessage.message() + "\nlineNumber=" + consoleMessage.lineNumber() + "\nsourceId=" + consoleMessage.sourceId());
                    } else if (i == 4) {
                        pUU.copydefault("OneKeySDKJavaScriptEngine", "ERROR: message=" + consoleMessage.message() + "\nlineNumber=" + consoleMessage.lineNumber() + "\nsourceId=" + consoleMessage.sourceId());
                    } else {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pUU.KWHzl("OneKeySDKJavaScriptEngine", "DEBUG: message=" + consoleMessage.message() + "\nlineNumber=" + consoleMessage.lineNumber() + "\nsourceId=" + consoleMessage.sourceId());
                    }
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: o.ycv$Application$TaskDescription */
        public static final class TaskDescription extends android.webkit.WebViewClient {
            @Override // android.webkit.WebViewClient
            public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
                pUU.KWHzl("OneKeySDKJavaScriptEngine", "shouldInterceptRequest: " + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
                return C57149ycv.AEQbTJ;
            }

            @Override // android.webkit.WebViewClient
            public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, java.lang.String str) {
                pUU.KWHzl("OneKeySDKJavaScriptEngine", "shouldInterceptRequest: " + str);
                return C57149ycv.AEQbTJ;
            }
        }
    }

    static {
        byte[] bytes = "".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        AEQbTJ = new android.webkit.WebResourceResponse("text/plain", "utf-8", new java.io.ByteArrayInputStream(bytes));
    }

    /* JADX INFO: renamed from: o.ycv$TaskDescription */
    public static final class TaskDescription {
        public final C57149ycv EZpvd;

        public TaskDescription(@NotNull C57149ycv c57149ycv) {
            Intrinsics.checkNotNullParameter(c57149ycv, "");
            this.EZpvd = c57149ycv;
        }

        @android.webkit.JavascriptInterface
        public final void request(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd.AEQbTJ(str, str2, str3);
        }

        @android.webkit.JavascriptInterface
        public final void nativeCallback(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd.EZpvd(str, str3);
        }
    }

    /* JADX INFO: renamed from: o.ycv$StateListAnimator */
    public static final class StateListAnimator {
        public final byte[] AEQbTJ;
        public final Job KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Job OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator(@NotNull Job job, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(job, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            this.KWHzl = job;
            this.AEQbTJ = bArr;
        }
    }

    /* JADX INFO: renamed from: o.ycv$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final CancellableContinuation<java.lang.String> OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CancellableContinuation<java.lang.String> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.lang.String str, java.lang.String str2, @NotNull CancellableContinuation<? super java.lang.String> cancellableContinuation) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cancellableContinuation, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.OLrzqt = cancellableContinuation;
        }
    }

    public final android.webkit.WebView copydefault() {
        android.webkit.WebView webView = this.KWHzl;
        if (webView != null) {
            return webView;
        }
        try {
            android.webkit.WebView webView2 = new android.webkit.WebView(this.EZpvd);
            this.KWHzl = webView2;
            Companion.EZpvd(webView2);
            java.lang.String strAEQbTJ = C48872udq.AEQbTJ.AEQbTJ("file_wallet_hardware_oneKey_js");
            this.values = strAEQbTJ != null ? AEQbTJ(webView2, new java.io.File(strAEQbTJ, "onekey_sdk.js")) : null;
            return webView2;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("OneKeySDKJavaScriptEngine", "Failed to create WebView", th);
            return null;
        }
    }

    public final void KWHzl(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        android.webkit.WebView webViewCopydefault = copydefault();
        if (webViewCopydefault == null) {
            return;
        }
        this.values = AEQbTJ(webViewCopydefault, file);
    }

    public final Job AEQbTJ(android.webkit.WebView webView, java.io.File file) {
        return BuildersKt__Builders_commonKt.launch$default(this.valueOf, null, null, new OneKeySDKJavaScriptEngine$loadScriptInternal$1(webView, this, file, null), 3, null);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.webkit.WebView webViewCopydefault = copydefault();
        if (webViewCopydefault == null) {
            pUU.copydefault("OneKeySDKJavaScriptEngine", "WebView is null when trying to cancel: connectId=" + str);
            return;
        }
        Job job = this.values;
        if (job == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.valueOf, null, null, new OneKeySDKJavaScriptEngine$cancel$1(job, this, webViewCopydefault, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(android.webkit.WebView webView, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OneKeySDKJavaScriptEngine$cancelInternal$1 oneKeySDKJavaScriptEngine$cancelInternal$1;
        java.lang.String str2;
        C57149ycv c57149ycv;
        InterfaceC57144ycq interfaceC57144ycq;
        if (continuation instanceof OneKeySDKJavaScriptEngine$cancelInternal$1) {
            oneKeySDKJavaScriptEngine$cancelInternal$1 = (OneKeySDKJavaScriptEngine$cancelInternal$1) continuation;
            int i = oneKeySDKJavaScriptEngine$cancelInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oneKeySDKJavaScriptEngine$cancelInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                oneKeySDKJavaScriptEngine$cancelInternal$1 = new OneKeySDKJavaScriptEngine$cancelInternal$1(this, continuation);
            }
        }
        java.lang.Object obj = oneKeySDKJavaScriptEngine$cancelInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = oneKeySDKJavaScriptEngine$cancelInternal$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Cancel cancel = new Cancel(str);
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            OneKeySDKJavaScriptEngine$cancelInternal$$inlined$executeNativeCall$1 oneKeySDKJavaScriptEngine$cancelInternal$$inlined$executeNativeCall$1 = new OneKeySDKJavaScriptEngine$cancelInternal$$inlined$executeNativeCall$1(cancel, null);
            oneKeySDKJavaScriptEngine$cancelInternal$1.L$0 = this;
            oneKeySDKJavaScriptEngine$cancelInternal$1.L$1 = webView;
            oneKeySDKJavaScriptEngine$cancelInternal$1.L$2 = cancel;
            str2 = OtpEventTracker.OTP_EVENT_VALUE_CANCEL;
            oneKeySDKJavaScriptEngine$cancelInternal$1.L$3 = OtpEventTracker.OTP_EVENT_VALUE_CANCEL;
            oneKeySDKJavaScriptEngine$cancelInternal$1.label = 1;
            java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcher, oneKeySDKJavaScriptEngine$cancelInternal$$inlined$executeNativeCall$1, oneKeySDKJavaScriptEngine$cancelInternal$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c57149ycv = this;
            obj = objWithContext;
            interfaceC57144ycq = cancel;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            java.lang.String str3 = (java.lang.String) oneKeySDKJavaScriptEngine$cancelInternal$1.L$3;
            interfaceC57144ycq = (InterfaceC57144ycq) oneKeySDKJavaScriptEngine$cancelInternal$1.L$2;
            android.webkit.WebView webView2 = (android.webkit.WebView) oneKeySDKJavaScriptEngine$cancelInternal$1.L$1;
            C57149ycv c57149ycv2 = (C57149ycv) oneKeySDKJavaScriptEngine$cancelInternal$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str3;
            webView = webView2;
            c57149ycv = c57149ycv2;
        }
        java.lang.String str4 = (java.lang.String) obj;
        oneKeySDKJavaScriptEngine$cancelInternal$1.L$0 = c57149ycv;
        oneKeySDKJavaScriptEngine$cancelInternal$1.L$1 = webView;
        oneKeySDKJavaScriptEngine$cancelInternal$1.L$2 = interfaceC57144ycq;
        oneKeySDKJavaScriptEngine$cancelInternal$1.L$3 = str2;
        oneKeySDKJavaScriptEngine$cancelInternal$1.L$4 = str4;
        oneKeySDKJavaScriptEngine$cancelInternal$1.label = 2;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(oneKeySDKJavaScriptEngine$cancelInternal$1), 1);
        cancellableContinuationImpl.initCancellability();
        java.lang.String strValueOf = java.lang.String.valueOf(c57149ycv.copydefault.getAndIncrement());
        c57149ycv.djBIcL.put(strValueOf, new ActionBar(strValueOf, interfaceC57144ycq.getConnectId(), cancellableContinuationImpl));
        java.lang.String str5 = "window.WKWebViewJavascriptBridge.nativeCall(\"" + strValueOf + "\", \"" + str2 + "\", " + str4 + ");";
        pUU.KWHzl("OneKeySDKJavaScriptEngine", "nativeCall: " + str5);
        webView.evaluateJavascript(str5, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(oneKeySDKJavaScriptEngine$cancelInternal$1);
        }
        if (result == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Job job = this.values;
        if (job == null) {
            return false;
        }
        return ChannelResult.m7430isSuccessimpl(this.isConnected.mo5769trySendJP2dKIU(new StateListAnimator(job, bArr)));
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        pUU.KWHzl("OneKeySDKJavaScriptEngine", "handleRequest: requestId=" + str + ", method=" + str2 + ", params=" + str3);
        BuildersKt__Builders_commonKt.launch$default(this.valueOf, null, null, new OneKeySDKJavaScriptEngine$handleRequest$1(this, str2, str, str3, null), 3, null);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        pUU.KWHzl("OneKeySDKJavaScriptEngine", "handleNativeCallback: callId=" + str + ", data=" + str2);
        BuildersKt__Builders_commonKt.launch$default(this.valueOf, null, null, new OneKeySDKJavaScriptEngine$handleNativeCallback$1(this, str, str2, null), 3, null);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ConcurrentHashMap<java.lang.String, ActionBar> concurrentHashMap = this.djBIcL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, ActionBar> entry : concurrentHashMap.entrySet()) {
            if (Intrinsics.EZpvd((java.lang.Object) entry.getValue().OLrzqt(), (java.lang.Object) str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.lang.String strKWHzl = null;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            ActionBar actionBar = (ActionBar) entry2.getValue();
            this.djBIcL.remove(str2);
            CancellableContinuation<java.lang.String> cancellableContinuationAEQbTJ = actionBar.AEQbTJ();
            if (cancellableContinuationAEQbTJ.isActive()) {
                if (strKWHzl == null) {
                    OneKeySDKError oneKeySDKError = OneKeySDKError.BluetoothError;
                    strKWHzl = C33489mxS.KWHzl.KWHzl(Unsuccessful.Companion.serializer(), new Unsuccessful(false, new Unsuccessful.Payload(oneKeySDKError.getMessage(), oneKeySDKError.getCode())));
                }
                Result.Application application = Result.Companion;
                cancellableContinuationAEQbTJ.resumeWith(Result.m7377constructorimpl(strKWHzl));
            }
        }
    }
}
