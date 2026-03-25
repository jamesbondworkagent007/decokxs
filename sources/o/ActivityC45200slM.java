package o;

import android.webkit.WebChromeClient;
import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.FragmentResultListener;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.WebCreator;
import com.okinc.okex.chatbot.ChatbotWebActivity$Companion$openPage$1;
import com.okinc.okex.chatbot.ChatbotWebActivity$Companion$openUrlInWebView$2;
import com.okinc.okex.jsbridge.PermissionCheckResult;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import o.AbstractC43238rlX;
import o.ActivityC45200slM;
import o.C45239slz;
import o.C45364soR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.slM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45200slM extends AbstractActivityC45205slR implements InterfaceC45195slH {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public android.webkit.WebView EZpvd;
    public android.webkit.ValueCallback<android.net.Uri[]> OLrzqt;
    public java.lang.String djBIcL;
    public final Activity AEQbTJ = new Activity();
    public final C45364soR KWHzl = C45364soR.Companion.EZpvd(new C45364soR.ActionBar.Activity(this));

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void setRequestedOrientation(int i) {
    }

    /* JADX INFO: renamed from: o.slM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.slM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ java.lang.Object openPage$default(Application application, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            return application.EZpvd(context, bundle, num, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull android.os.Bundle bundle, java.lang.Integer num, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            ChatbotWebActivity$Companion$openPage$1 chatbotWebActivity$Companion$openPage$1;
            Application application;
            AbstractC43238rlX abstractC43238rlX;
            if (continuation instanceof ChatbotWebActivity$Companion$openPage$1) {
                chatbotWebActivity$Companion$openPage$1 = (ChatbotWebActivity$Companion$openPage$1) continuation;
                int i = chatbotWebActivity$Companion$openPage$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    chatbotWebActivity$Companion$openPage$1.label = i - Integer.MIN_VALUE;
                } else {
                    chatbotWebActivity$Companion$openPage$1 = new ChatbotWebActivity$Companion$openPage$1(this, continuation);
                }
            }
            java.lang.Object objEZpvd = chatbotWebActivity$Companion$openPage$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = chatbotWebActivity$Companion$openPage$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.OLrzqt(InterfaceC43294rma.class);
                if (interfaceC43294rma != null) {
                    java.lang.String string = bundle.getString("url");
                    if (string == null) {
                        string = "";
                    }
                    chatbotWebActivity$Companion$openPage$1.L$0 = this;
                    chatbotWebActivity$Companion$openPage$1.L$1 = context;
                    chatbotWebActivity$Companion$openPage$1.L$2 = bundle;
                    chatbotWebActivity$Companion$openPage$1.L$3 = num;
                    chatbotWebActivity$Companion$openPage$1.label = 1;
                    objEZpvd = interfaceC43294rma.EZpvd(context, string, chatbotWebActivity$Companion$openPage$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    application = this;
                } else {
                    application = this;
                    abstractC43238rlX = null;
                    if (!Intrinsics.EZpvd(abstractC43238rlX, AbstractC43238rlX.StateListAnimator.OLrzqt)) {
                        return Unit.INSTANCE;
                    }
                    chatbotWebActivity$Companion$openPage$1.L$0 = null;
                    chatbotWebActivity$Companion$openPage$1.L$1 = null;
                    chatbotWebActivity$Companion$openPage$1.L$2 = null;
                    chatbotWebActivity$Companion$openPage$1.L$3 = null;
                    chatbotWebActivity$Companion$openPage$1.label = 2;
                    if (application.copydefault(context, bundle, num, chatbotWebActivity$Companion$openPage$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Unit.INSTANCE;
                }
                java.lang.Integer num2 = (java.lang.Integer) chatbotWebActivity$Companion$openPage$1.L$3;
                bundle = (android.os.Bundle) chatbotWebActivity$Companion$openPage$1.L$2;
                android.content.Context context2 = (android.content.Context) chatbotWebActivity$Companion$openPage$1.L$1;
                application = (Application) chatbotWebActivity$Companion$openPage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                num = num2;
                context = context2;
            }
            abstractC43238rlX = (AbstractC43238rlX) objEZpvd;
            if (!Intrinsics.EZpvd(abstractC43238rlX, AbstractC43238rlX.StateListAnimator.OLrzqt)) {
            }
        }

        public static /* synthetic */ java.lang.Object openUrlInWebView$default(Application application, android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            return application.copydefault(context, bundle, num, continuation);
        }

        public final java.lang.Object copydefault(android.content.Context context, android.os.Bundle bundle, java.lang.Integer num, Continuation<? super Unit> continuation) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC45200slM.class);
            intent.putExtras(bundle);
            java.lang.Object objWithContext = BuildersKt.withContext(C44711scA.EZpvd.KWHzl(), new ChatbotWebActivity$Companion$openUrlInWebView$2(num, context, intent, null), continuation);
            return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.slM$Activity */
    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(false);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Unit unit = null;
            C44760scx.log$default("jsBridge message.data: " + ActivityC45200slM.this.djBIcL, null, 2, null);
            java.lang.String str = ActivityC45200slM.this.djBIcL;
            if (str != null) {
                android.webkit.WebView webView = ActivityC45200slM.this.EZpvd;
                if (webView != null) {
                    webView.evaluateJavascript(str, null);
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            ActivityC45200slM activityC45200slM = ActivityC45200slM.this;
            setEnabled(false);
            activityC45200slM.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    @Override // o.AbstractActivityC45205slR, com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, this.AEQbTJ);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.slK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45200slM.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(ActivityC45200slM activityC45200slM) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45200slM, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // com.okinc.web.WebActivity
    public void EZpvd(@NotNull AgentWeb agentWeb) {
        Intrinsics.checkNotNullParameter(agentWeb, "");
        super.EZpvd(agentWeb);
        WebCreator webCreator = agentWeb.getWebCreator();
        this.EZpvd = webCreator != null ? webCreator.getWebView() : null;
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.EZpvd = null;
    }

    @Override // o.InterfaceC45195slH
    public void copydefault(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        java.lang.String str = message.data;
        this.djBIcL = str;
        this.AEQbTJ.setEnabled(str != null);
    }

    @Override // o.InterfaceC45195slH
    public void AEQbTJ(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        this.KWHzl.EZpvd(new C45364soR.Application(C56402yEa.EZpvd("android.permission.RECORD_AUDIO"), null, null, new Function1() { // from class: o.slQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45200slM.OLrzqt(interfaceC57336ygW, message, (PermissionCheckResult) obj);
            }
        }, new Function0() { // from class: o.slO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC45200slM.KWHzl(interfaceC57336ygW, message);
            }
        }, 6, null));
    }

    public static final Unit OLrzqt(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, PermissionCheckResult permissionCheckResult) {
        Intrinsics.checkNotNullParameter(permissionCheckResult, "");
        interfaceC57336ygW.OLrzqt(message, permissionCheckResult.getValue());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message) {
        interfaceC57336ygW.OLrzqt(message, PermissionCheckResult.AUTHORISED.getValue());
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC45195slH
    public void KWHzl(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        interfaceC57336ygW.OLrzqt(message, PermissionCheckResult.AUTHORISED.getValue());
    }

    @Override // o.InterfaceC45195slH
    public void EZpvd(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        interfaceC57336ygW.OLrzqt(message, PermissionCheckResult.AUTHORISED.getValue());
    }

    /* JADX INFO: renamed from: o.slM$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final class ActionBar extends WebActivity.Application {
        public final C57350ygk KWHzl;
        public final /* synthetic */ ActivityC45200slM copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ActivityC45200slM activityC45200slM, C57350ygk c57350ygk) {
            super(activityC45200slM, c57350ygk);
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.copydefault = activityC45200slM;
            this.KWHzl = c57350ygk;
        }

        @Override // com.okinc.web.WebActivity.Application, com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onShowFileChooser(@NotNull android.webkit.WebView webView, @NotNull android.webkit.ValueCallback<android.net.Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            android.webkit.ValueCallback valueCallback2 = this.copydefault.OLrzqt;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(null);
            }
            this.copydefault.OLrzqt = valueCallback;
            C45239slz.TaskDescription taskDescription = C45239slz.Companion;
            java.lang.String[] acceptTypes = fileChooserParams.getAcceptTypes();
            Intrinsics.checkNotNullExpressionValue(acceptTypes, "");
            C45239slz c45239slzAEQbTJ = taskDescription.AEQbTJ(acceptTypes);
            final Function2 function2Copydefault = this.copydefault.copydefault(this.KWHzl);
            this.copydefault.getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_FILE_PICKER", this.copydefault, new FragmentResultListener() { // from class: o.slP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    ActivityC45200slM.ActionBar.copydefault(function2Copydefault, str, bundle);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c45239slzAEQbTJ.show(supportFragmentManager);
            return true;
        }

        public static final void copydefault(Function2 function2, java.lang.String str, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            function2.invoke(str, bundle);
        }
    }

    public final Function2<java.lang.String, android.os.Bundle, Unit> copydefault(final C57350ygk c57350ygk) {
        return new Function2() { // from class: o.slI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC45200slM.KWHzl(this.EZpvd, c57350ygk, (java.lang.String) obj, (android.os.Bundle) obj2);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(ActivityC45200slM activityC45200slM, C57350ygk c57350ygk, java.lang.String str, android.os.Bundle bundle) {
        android.net.Uri[] uriArrEZpvd;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("ARG_FILE_URI");
        if (string == null) {
            uriArrEZpvd = null;
        } else {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
                string = null;
            }
            if (string != null) {
                C44760scx.log$default("filePicker: Selected uri: " + string, null, 2, null);
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(android.net.Uri.parse(string));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                final java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    C44760scx.copydefault("filePicker: Failed to parse uri: " + string, new Function1() { // from class: o.slL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC45200slM.AEQbTJ(thM7380exceptionOrNullimpl, (C44761scy) obj);
                        }
                    });
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                android.net.Uri uri = (android.net.Uri) objM7377constructorimpl;
                if (uri != null) {
                    uriArrEZpvd = activityC45200slM.EZpvd(c57350ygk, uri);
                }
            }
        }
        C44760scx.log$default("filePicker: onReceiveValue: " + uriArrEZpvd, null, 2, null);
        android.webkit.ValueCallback<android.net.Uri[]> valueCallback = activityC45200slM.OLrzqt;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArrEZpvd);
        }
        activityC45200slM.OLrzqt = null;
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(th);
        return Unit.INSTANCE;
    }

    public final android.net.Uri[] EZpvd(C57350ygk c57350ygk, android.net.Uri uri) {
        if (!c57350ygk.AEQbTJ(uri)) {
            java.lang.String strEZpvd = EZpvd(this, uri);
            C44760scx.log$default("filePicker: valueCallbacks: " + strEZpvd + " -> " + uri, null, 2, null);
            if (strEZpvd != null) {
                c57350ygk.copydefault(strEZpvd, uri);
            }
        }
        return new android.net.Uri[]{uri};
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String EZpvd(android.content.Context context, android.net.Uri uri) {
        android.database.Cursor cursorQuery;
        int columnIndex;
        java.lang.String scheme = uri.getScheme();
        if (scheme == null) {
            return null;
        }
        int iHashCode = scheme.hashCode();
        if (iHashCode == 3143036) {
            if (scheme.equals("file")) {
                return uri.getLastPathSegment();
            }
            return null;
        }
        if (iHashCode != 951530617 || !scheme.equals("content") || (cursorQuery = context.getContentResolver().query(uri, null, null, null, null)) == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) == -1) {
                yFA.copydefault(cursorQuery, null);
                return null;
            }
            java.lang.String string = cursorQuery.getString(columnIndex);
            yFA.copydefault(cursorQuery, null);
            return string;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(cursorQuery, th);
                throw th2;
            }
        }
    }

    @Override // com.okinc.web.WebActivity
    public WebActivity.Application AEQbTJ(@NotNull C57350ygk c57350ygk) {
        Intrinsics.checkNotNullParameter(c57350ygk, "");
        return new ActionBar(this, c57350ygk);
    }

    @Override // o.AbstractActivityC45205slR, com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45205slR, com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45205slR, com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC45205slR, com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
