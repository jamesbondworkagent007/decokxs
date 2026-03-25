package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.presentation.OKComplianceWebActivity$Companion$openPage$1;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rEq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC42054rEq extends WebActivity {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.lang.String EZpvd = "OKComplianceWebActivity";
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rEu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC42054rEq.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rEx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC42054rEq.EZpvd(this.copydefault);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX INFO: renamed from: o.rEq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rEq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void openPage$default(Application application, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            application.KWHzl(context, bundle, num);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num) {
            CoroutineScope coroutineScopeMainScope;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
            AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
            if (appCompatActivity == null || (coroutineScopeMainScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
                coroutineScopeMainScope = CoroutineScopeKt.MainScope();
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, null, null, new OKComplianceWebActivity$Companion$openPage$1(context, bundle, num, null), 3, null);
        }

        public static /* synthetic */ void openUrlInWebView$default(Application application, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            application.OLrzqt(context, bundle, num);
        }

        public final void OLrzqt(android.content.Context context, android.os.Bundle bundle, java.lang.Integer num) {
            C43693ruB.OLrzqt("KYC_Vendor_WebViewOpen_View");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC42054rEq.class);
            intent.putExtras(bundle);
            if (num != null) {
                if (context instanceof android.app.Activity) {
                    ((android.app.Activity) context).startActivityForResult(intent, num.intValue());
                }
            } else {
                if (!(context instanceof android.app.Activity)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            }
        }
    }

    private final java.lang.String KWHzl() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String copydefault(ActivityC42054rEq activityC42054rEq) {
        java.lang.String stringExtra;
        android.content.Intent intent = activityC42054rEq.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("playbook")) == null) ? "" : stringExtra;
    }

    private final java.util.HashMap<java.lang.String, java.lang.String> AEQbTJ() {
        return (java.util.HashMap) this.AEQbTJ.getValue();
    }

    public static final java.util.HashMap EZpvd(ActivityC42054rEq activityC42054rEq) {
        android.content.Intent intent = activityC42054rEq.getIntent();
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("playbookParams") : null;
        java.util.HashMap map = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        return map == null ? new java.util.HashMap() : map;
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.okinc.web.WebActivity
    public WebActivity.Activity OLrzqt(@NotNull C57350ygk c57350ygk) {
        Intrinsics.checkNotNullParameter(c57350ygk, "");
        return new StateListAnimator(this, c57350ygk);
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C43693ruB.OLrzqt("KYC_Vendor_WebViewClosed_Click");
        pUU.EZpvd(getTAG(), "close-->url=" + this.fvQaOB);
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: o.rEq$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator extends WebActivity.Activity {
        public final /* synthetic */ ActivityC42054rEq EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ActivityC42054rEq activityC42054rEq, C57350ygk c57350ygk) {
            super(activityC42054rEq, c57350ygk);
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.EZpvd = activityC42054rEq;
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public android.webkit.WebResourceResponse shouldInterceptRequest(@NotNull android.webkit.WebView webView, @NotNull android.webkit.WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            pUU.KWHzl(this.EZpvd.getTAG(), "shouldInterceptRequest-->url=" + webResourceRequest.getUrl());
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            pUU.EZpvd(this.EZpvd.getTAG(), "onPageFinished-->url=" + str);
            C43693ruB.copydefault("KYC_Vendor_WebViewFinish_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("url", java.lang.String.valueOf(str))));
            super.onPageFinished(webView, str);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull android.webkit.WebView webView, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            pUU.EZpvd(this.EZpvd.getTAG(), "shouldOverrideUrlLoading-->url=" + str);
            this.EZpvd.EZpvd(str, "shouldOverrideUrlLoading");
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
            java.lang.String string;
            android.net.Uri url;
            pUU.EZpvd(this.EZpvd.getTAG(), "shouldOverrideUrlLoading2-->url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
            ActivityC42054rEq activityC42054rEq = this.EZpvd;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                string = "";
            }
            activityC42054rEq.EZpvd(string, "shouldOverrideUrlLoading2");
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            pUU.EZpvd(this.EZpvd.getTAG(), "onPageStarted-->url=" + str);
            this.EZpvd.EZpvd(str == null ? "" : str, "onPageStarted");
            C43693ruB.copydefault("KYC_Vendor_WebViewStart_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("url", java.lang.String.valueOf(str))));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            pUU.EZpvd(this.EZpvd.getTAG(), "onReceivedError-->url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + "  errorCode=" + (webResourceError != null ? java.lang.Integer.valueOf(webResourceError.getErrorCode()) : null) + "  error=" + webResourceError);
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MSG, "url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + "  errorCode=" + (webResourceError != null ? java.lang.Integer.valueOf(webResourceError.getErrorCode()) : null) + "  error=" + webResourceError);
            C43693ruB.copydefault("KYC_Vendor_WebViewError_View", C56424yEw.AYXKKw(pairArr));
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // com.okinc.web.WebActivity.Activity, com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
            pUU.EZpvd(this.EZpvd.getTAG(), "onReceivedHttpError-->url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " error=" + webResourceResponse);
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            pairArr[0] = C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MSG, "url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + "   error=" + webResourceResponse);
            C43693ruB.copydefault("KYC_Vendor_WebViewError_View", C56424yEw.AYXKKw(pairArr));
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String stringExtra = getIntent().getStringExtra("listener_url");
        if (getIntent().getBooleanExtra("enable_listener", false) && C33129mqd.OLrzqt((java.lang.CharSequence) stringExtra)) {
            Intrinsics.copydefault((java.lang.Object) stringExtra);
            if (C59449zhJ.startsWith$default(str, stringExtra, false, 2, null)) {
                pUU.EZpvd(getTAG(), "listenerAndCallBack-->source=" + str2 + "  completeUrl=" + str + " listenerUrl=" + stringExtra);
                C43693ruB.OLrzqt("Url_Vendor_BackCall_View");
                java.io.Serializable serializableExtra = getIntent().getSerializableExtra("callBack_params");
                java.util.HashMap map = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
                if (map == null) {
                    map = new java.util.HashMap();
                }
                map.put("completeUrl", str);
                AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) InterfaceC43709ruR.Companion.AEQbTJ(KWHzl(), AEQbTJ()).AEQbTJ(map));
                final Function1 function1 = new Function1() { // from class: o.rEs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC42054rEq.EZpvd((ResponseData) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rEr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC42054rEq.EZpvd(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.rEv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC42054rEq.EZpvd((java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rEy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC42054rEq.OLrzqt(function12, obj);
                    }
                });
                finish();
            }
        }
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ResponseData responseData) {
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "yes")));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "no")));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
