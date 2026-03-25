package com.okinc.web;

import android.R;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.applog.util.WebViewJsUtil;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.immomo.mls.fun.constants.TextAlign;
import com.just.agentweb.AgentWeb;
import com.just.agentweb.DefaultWebClient;
import com.just.agentweb.JsAccessEntrace;
import com.just.agentweb.WebChromeClient;
import com.just.agentweb.WebCreator;
import com.just.agentweb.WebViewClient;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.web.WebActivity;
import com.okinc.web.bean.WebShareInfo;
import com.okinc.web.web.IWebActivityAPI;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractActivityC33041mov;
import o.AbstractActivityC57310yfx;
import o.AbstractC43238rlX;
import o.AbstractC47263tmj;
import o.C32113mPz;
import o.C33070mpX;
import o.C33072mpZ;
import o.C33129mqd;
import o.C33492mxV;
import o.C33516mxt;
import o.C33537myN;
import o.C33567myr;
import o.C33569myt;
import o.C33570myu;
import o.C33610mzh;
import o.C33625mzw;
import o.C34704nhP;
import o.C35962oKd;
import o.C43246rlf;
import o.C43251rlk;
import o.C43292rmY;
import o.C43324rnD;
import o.C43341rnU;
import o.C52761wXj;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C57262yfB;
import o.C57309yfw;
import o.C57315ygB;
import o.C57317ygD;
import o.C57330ygQ;
import o.C57338ygY;
import o.C57345ygf;
import o.C57350ygk;
import o.C57354ygo;
import o.C57363ygx;
import o.C57364ygy;
import o.C57394yhb;
import o.C57396yhd;
import o.C59449zhJ;
import o.C59829zoS;
import o.C60121zwJ;
import o.C6777aVl;
import o.C6813aWU;
import o.C6818aWZ;
import o.InterfaceC43294rma;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.ViewOnClickListenerC54939xaY;
import o.pSC;
import o.pUU;
import o.wYC;
import o.yCM;
import o.yDV;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class WebActivity extends AbstractActivityC57310yfx {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int DbNXlk = 8;
    public String AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public C57394yhb AwvSrB;
    public String AxsJAY;
    public Context DTwDnp;
    public long ORxRYg;
    public AgentWeb OcIXYQ;
    public C33537myN QKVWgx;
    public C57330ygQ QOLQEE;
    public FrameLayout QUSxYX;
    public View QVAiDq;
    public Application QbewEr;
    public Activity QfsBiF;
    public WebShareInfo RJOkX;
    public int RcXXUw;
    public WebView UeEOUB;
    public String aKErDB;
    public boolean dNCPSb;
    public String djSkpj;
    public String dvKsVJ;
    public final ActivityResultLauncher<String> dxcTrN;
    public String ejfBZ;
    public String fARcdN;
    public String fFgQHt;
    public final int fIwbmz;
    public String fJNWhG;
    public SubdomainStrategy fZBcTu;
    public AlertDialog fetchVPNInfo;
    public String finit;
    public String flVtFt;
    public String fvQaOB;
    public String gGvvIC;
    public boolean gHZMYf;
    public final AtomicReference<String> gasjUx;
    public String getFieldNames;
    public String getNewProxyInstance;
    public IWebActivityAPI giSNqX;
    public final InterfaceC56387yDm hDKMBd;
    public boolean isConnected;
    public final C57350ygk iwGUEr;
    public boolean sSMYrx;

    @yCM
    public InterfaceC47278tmy userManager;
    public String uzCIH;
    public boolean values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public boolean zsXlph;
    public final Object zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull AgentWeb agentWeb) {
        Intrinsics.checkNotNullParameter(agentWeb, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IWebActivityAPI fARcdN() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public int getContentView() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String iwGUEr() {
        return this.flVtFt;
    }

    @Override // o.AbstractActivityC33041mov
    public boolean needHook() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setRequestedOrientation(@NotNull android.app.Activity activity, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    public WebActivity() {
        Function0<Boolean> function0ValueOf = C57309yfw.AEQbTJ.valueOf();
        if (Intrinsics.EZpvd(function0ValueOf != null ? function0ValueOf.invoke() : null, Boolean.TRUE)) {
            try {
                WebView.enableSlowWholeDocumentDraw();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.fIwbmz = C57262yfB.Application.KWHzl;
        this.fvQaOB = "";
        this.flVtFt = "";
        this.gGvvIC = "";
        this.AuCTelauCTel = true;
        this.AubY = true;
        this.wlaJM = true;
        this.aKErDB = "";
        this.RcXXUw = 2;
        this.finit = "";
        this.djSkpj = C33070mpX.AYXKKw(C57262yfB.StateListAnimator.KWHzl);
        this.fFgQHt = C33070mpX.AYXKKw(C57262yfB.StateListAnimator.copydefault);
        this.fJNWhG = C33070mpX.AYXKKw(C57262yfB.StateListAnimator.AEQbTJ);
        this.ejfBZ = C33070mpX.AYXKKw(C57262yfB.StateListAnimator.EZpvd);
        this.zuBGHE = new Object();
        this.AuCTel = "";
        this.gasjUx = new AtomicReference<>("");
        this.hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.yfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WebActivity.AhwBna();
            }
        });
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: o.yfM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                WebActivity.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.dxcTrN = activityResultLauncherRegisterForActivityResult;
        this.AxsJAY = "";
        this.ORxRYg = System.currentTimeMillis();
        this.iwGUEr = new C57350ygk();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web.WebActivity.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void openPage$default(TaskDescription taskDescription, Context context, Bundle bundle, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            taskDescription.KWHzl(context, bundle, num);
        }

        public final void KWHzl(@NotNull Context context, @NotNull Bundle bundle, Integer num) {
            CoroutineScope coroutineScopeMainScope;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
            AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
            if (appCompatActivity == null || (coroutineScopeMainScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
                coroutineScopeMainScope = CoroutineScopeKt.MainScope();
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, null, null, new WebActivity$Companion$openPage$1(context, bundle, num, null), 3, null);
        }

        public static /* synthetic */ void openUrlInWebView$default(TaskDescription taskDescription, Context context, Bundle bundle, Integer num, int i, Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            taskDescription.AEQbTJ(context, bundle, num);
        }

        public final void AEQbTJ(Context context, Bundle bundle, Integer num) {
            Intent intent = new Intent(context, (Class<?>) WebActivity.class);
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

    public final C57396yhd isConnected() {
        return (C57396yhd) this.hDKMBd.getValue();
    }

    public static final C57396yhd AhwBna() {
        return new C57396yhd();
    }

    public final InterfaceC47278tmy AkhnZx() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void EZpvd(WebActivity webActivity, Boolean bool) {
        String str;
        String str2;
        if (bool.booleanValue()) {
            String str3 = webActivity.uzCIH;
            if (str3 != null && (str = webActivity.getFieldNames) != null && (str2 = webActivity.getNewProxyInstance) != null) {
                if (str3 == null) {
                    str3 = "";
                }
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                webActivity.KWHzl(str3, str, str2);
            }
            webActivity.uzCIH = null;
            webActivity.getFieldNames = null;
            webActivity.getNewProxyInstance = null;
            return;
        }
        webActivity.getFieldNames();
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator implements IWebActivityAPI {
        public final WeakReference<AbstractActivityC33041mov> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.web.web.IWebActivityAPI
        public WeakReference<AbstractActivityC33041mov> getWebActivity() {
            return this.KWHzl;
        }

        public StateListAnimator(@NotNull WebActivity webActivity) {
            Intrinsics.checkNotNullParameter(webActivity, "");
            this.KWHzl = new WeakReference<>(webActivity);
        }

        @Override // com.okinc.web.web.IWebActivityAPI
        public Bitmap buildWebViewDrawCache() {
            AbstractActivityC33041mov abstractActivityC33041mov = this.KWHzl.get();
            if (abstractActivityC33041mov != null) {
                return ((WebActivity) abstractActivityC33041mov).fetchVPNInfo();
            }
            return null;
        }

        @Override // com.okinc.web.web.IWebActivityAPI
        public String getWebUrl() {
            AbstractActivityC33041mov abstractActivityC33041mov = this.KWHzl.get();
            if (abstractActivityC33041mov != null) {
                return ((WebActivity) abstractActivityC33041mov).uzCIH();
            }
            return null;
        }

        @Override // com.okinc.web.web.IWebActivityAPI
        public String getWebTitle() {
            AbstractActivityC33041mov abstractActivityC33041mov = this.KWHzl.get();
            if (abstractActivityC33041mov == null) {
                return null;
            }
            C33537myN c33537myN = ((WebActivity) abstractActivityC33041mov).QKVWgx;
            if (c33537myN == null) {
                Intrinsics.gEmmrt("");
                c33537myN = null;
            }
            CharSequence text = c33537myN.getTitle().getText();
            if (text != null) {
                return text.toString();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x035b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.AbstractActivityC33041mov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init() {
        AgentWeb.PreAgentWeb preAgentWebCreateAgentWeb;
        DefaultWebClient.OpenOtherPageWays openOtherPageWays;
        String strInvoke;
        String strInvoke2;
        String strInvoke3;
        String stringExtra = getIntent().getStringExtra("overridentheme");
        if (stringExtra != null) {
            getDelegate().setLocalNightMode(Intrinsics.EZpvd((Object) stringExtra, (Object) "night") ? 2 : 1);
        }
        AYXKKw();
        isConnected().EZpvd(this.fvQaOB);
        this.DTwDnp = getApplicationContext();
        this.giSNqX = new StateListAnimator(this);
        this.iwGUEr.KWHzl(C43324rnD.AEQbTJ.KWHzl());
        this.iwGUEr.EZpvd(this.fZBcTu);
        this.iwGUEr.gEmmrt("B");
        pUU.KWHzl("WebActivity", "url:" + this.fvQaOB + " shareInfo:" + this.RJOkX);
        this.QKVWgx = (C33537myN) findViewById(C57262yfB.Activity.EZpvd);
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            getWindow().getDecorView().setLayoutDirection(1);
        }
        this.QUSxYX = (FrameLayout) findViewById(C57262yfB.Activity.AEQbTJ);
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        Function0<View> function0IsConnected = c57309yfw.isConnected();
        AgentWeb agentWeb = null;
        View viewInvoke = function0IsConnected != null ? function0IsConnected.invoke() : null;
        this.QVAiDq = viewInvoke;
        if (viewInvoke != null) {
            FrameLayout frameLayout = this.QUSxYX;
            if (frameLayout == null) {
                Intrinsics.gEmmrt("");
                frameLayout = null;
            }
            frameLayout.addView(this.QVAiDq);
        }
        this.QfsBiF = OLrzqt(this.iwGUEr);
        this.QbewEr = AEQbTJ(this.iwGUEr);
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) uzCIH()).toString();
        this.AuCTel = string;
        OLrzqt(string);
        AEQbTJ("WebView init");
        try {
            AgentWeb.AgentBuilder agentBuilderWith = AgentWeb.with(getMActivity());
            FrameLayout frameLayout2 = this.QUSxYX;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
                frameLayout2 = null;
            }
            AgentWeb.CommonBuilder commonBuilderUseDefaultIndicator = agentBuilderWith.setAgentWebParent(frameLayout2, new LinearLayout.LayoutParams(-1, -1)).useDefaultIndicator(ContextCompat.getColor(this, C52761wXj.Activity.hvKCwS));
            int i = this.RcXXUw;
            if (i == 1) {
                openOtherPageWays = DefaultWebClient.OpenOtherPageWays.DERECT;
            } else if (i == 3) {
                openOtherPageWays = DefaultWebClient.OpenOtherPageWays.DISALLOW;
            } else {
                openOtherPageWays = DefaultWebClient.OpenOtherPageWays.ASK;
            }
            AgentWeb.CommonBuilder openOtherPageWays2 = commonBuilderUseDefaultIndicator.setOpenOtherPageWays(openOtherPageWays);
            Activity activity = this.QfsBiF;
            if (activity == null) {
                Intrinsics.gEmmrt("");
                activity = null;
            }
            AgentWeb.CommonBuilder webViewClient = openOtherPageWays2.setWebViewClient(activity);
            Application application = this.QbewEr;
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            AgentWeb.CommonBuilder mainFrameErrorView = webViewClient.setWebChromeClient(application).setMainFrameErrorView(C52761wXj.Fragment.dmfpNf, C32113mPz.FragmentManager.KWHzl);
            View viewInflate = getLayoutInflater().inflate(C57262yfB.Application.OLrzqt, (ViewGroup) null);
            C55173xeu c55173xeu = (C55173xeu) viewInflate.findViewById(C57262yfB.Activity.copydefault);
            Function1<WebStringEnum, String> function1Values = c57309yfw.values();
            if (function1Values == null || (strInvoke = function1Values.invoke(WebStringEnum.EMPTY_TITLE_ERROR)) == null) {
                strInvoke = "";
            }
            c55173xeu.setTitle(strInvoke);
            Function1<NetworkStringEnum, String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
            if (function1ZsXlph == null || (strInvoke2 = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) {
                strInvoke2 = "";
            }
            c55173xeu.setSubTitle((CharSequence) strInvoke2);
            Function1<WebStringEnum, String> function1Values2 = c57309yfw.values();
            if (function1Values2 == null || (strInvoke3 = function1Values2.invoke(WebStringEnum.BTN_RELOAD)) == null) {
                strInvoke3 = "";
            }
            c55173xeu.setRetry(strInvoke3);
            viewInflate.setBackgroundColor(ContextCompat.getColor(this, C52761wXj.Activity.registerUser));
            preAgentWebCreateAgentWeb = mainFrameErrorView.setMainFrameErrorView(viewInflate).setAgentWebWebSettings(new C57338ygY(this, this.AuCTelauCTel, this.isConnected, this.sSMYrx)).setSecurityType(AgentWeb.SecurityType.STRICT_CHECK).additionalHttpHeader(string, HttpHeaders.ACCEPT_LANGUAGE, pSC.AEQbTJ.KWHzl()).interceptUnkownUrl().createAgentWeb();
        } catch (Throwable th) {
            finish();
            AEQbTJ("finish webactivity for throwable when creating preAgentWeb: " + th.getMessage());
            preAgentWebCreateAgentWeb = null;
        }
        if (preAgentWebCreateAgentWeb == null) {
            return;
        }
        AEQbTJ("load url : " + string);
        if (C43341rnU.EZpvd(this.AuCTel) || C57354ygo.AEQbTJ(this.AuCTel)) {
            this.iwGUEr.gEmmrt().KWHzl();
        }
        this.ORxRYg = System.currentTimeMillis();
        AgentWeb.PreAgentWeb yVar = preAgentWebCreateAgentWeb.ready();
        yVar.get().getWebCreator().getWebView().removeJavascriptInterface("agentWeb");
        AgentWeb agentWebGo = yVar.go(string);
        this.OcIXYQ = agentWebGo;
        if (agentWebGo == null) {
            Intrinsics.gEmmrt("");
            agentWebGo = null;
        }
        this.QOLQEE = new C57330ygQ(agentWebGo.getWebCreator().getWebView());
        C33516mxt.EZpvd(this);
        copydefault(string, "init");
        C33537myN c33537myN = this.QKVWgx;
        if (c33537myN == null) {
            Intrinsics.gEmmrt("");
            c33537myN = null;
        }
        c33537myN.setBackListener(new View.OnClickListener() { // from class: o.yfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                WebActivity.isConnected(this.EZpvd, view);
            }
        });
        if (this.values) {
            C33537myN c33537myN2 = this.QKVWgx;
            if (c33537myN2 == null) {
                Intrinsics.gEmmrt("");
                c33537myN2 = null;
            }
            c33537myN2.setBackImageResource(C32113mPz.TaskDescription.AhwBna);
        }
        AgentWeb agentWeb2 = this.OcIXYQ;
        if (agentWeb2 == null) {
            Intrinsics.gEmmrt("");
            agentWeb2 = null;
        }
        agentWeb2.getWebCreator().getWebView().setDownloadListener(new DownloadListener() { // from class: o.yfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
                WebActivity.copydefault(this.KWHzl, str, str2, str3, str4, j);
            }
        });
        this.dNCPSb = false;
        C33537myN c33537myN3 = this.QKVWgx;
        if (c33537myN3 == null) {
            Intrinsics.gEmmrt("");
            c33537myN3 = null;
        }
        TextView title = c33537myN3.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "");
        addDisposable(C33072mpZ.AEQbTJ(title, 2L, 5, new View.OnClickListener() { // from class: o.yfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                WebActivity.valueOf(this.copydefault, view);
            }
        }));
        OLrzqt(this.zsXlph);
        RxBus.KWHzl(C6818aWZ.class, new String[0]).subscribe(new RxBus.EventCallback<C6818aWZ>(this.zuBGHE) { // from class: com.okinc.web.WebActivity.init.6
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C6818aWZ c6818aWZ) {
                Intrinsics.checkNotNullParameter(c6818aWZ, "");
                String strCopydefault = c6818aWZ.copydefault();
                Map<String, String> mapAEQbTJ = c6818aWZ.AEQbTJ();
                if (strCopydefault.length() > 0) {
                    AgentWeb agentWeb3 = null;
                    if (mapAEQbTJ != null) {
                        AgentWeb agentWeb4 = WebActivity.this.OcIXYQ;
                        if (agentWeb4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            agentWeb3 = agentWeb4;
                        }
                        agentWeb3.getWebCreator().getWebView().loadUrl(strCopydefault, mapAEQbTJ);
                        return;
                    }
                    AgentWeb agentWeb5 = WebActivity.this.OcIXYQ;
                    if (agentWeb5 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        agentWeb3 = agentWeb5;
                    }
                    agentWeb3.getWebCreator().getWebView().loadUrl(strCopydefault);
                }
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass7(null), 3, null);
        AgentWeb agentWeb3 = this.OcIXYQ;
        if (agentWeb3 == null) {
            Intrinsics.gEmmrt("");
            agentWeb3 = null;
        }
        agentWeb3.getWebCreator().getWebView().setBackgroundColor(ContextCompat.getColor(this, C32113mPz.ActionBar.QbewEr));
        if (this.AuCTelauCTel) {
            copydefault(string);
        }
        WebView.setWebContentsDebuggingEnabled(SPUtils.getBoolean("web_is_debug", false));
        AgentWeb agentWeb4 = this.OcIXYQ;
        if (agentWeb4 == null) {
            Intrinsics.gEmmrt("");
            agentWeb4 = null;
        }
        agentWeb4.getWebCreator().getWebView().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.yfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return WebActivity.AYXKKw(this.OLrzqt, view);
            }
        });
        if (C33129mqd.OLrzqt((CharSequence) this.aKErDB)) {
            AgentWeb agentWeb5 = this.OcIXYQ;
            if (agentWeb5 == null) {
                Intrinsics.gEmmrt("");
                agentWeb5 = null;
            }
            agentWeb5.getUrlLoader().postUrl(StringsKt__StringsKt.hDKMBd((CharSequence) uzCIH()).toString(), C59829zoS.copydefault(this.aKErDB, "BASE64"));
        }
        if (this.AubY) {
            if (C33129mqd.OLrzqt((CharSequence) this.gGvvIC)) {
                String[] strArrAEQbTJ = C33625mzw.AEQbTJ();
                if (!C60121zwJ.KWHzl(this, (String[]) Arrays.copyOf(strArrAEQbTJ, strArrAEQbTJ.length))) {
                }
            }
        } else {
            try {
                ActivityCompat.requestPermissions(this, C33625mzw.AEQbTJ(), 100);
            } catch (Exception e) {
                pUU.OLrzqt("web requestPermissions: " + e);
            }
        }
        if (SPUtils.getBoolean("sp_web_close_icon", false)) {
            ImageView imageView = (ImageView) findViewById(C57262yfB.Activity.KWHzl);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.yfG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    WebActivity.gEmmrt(this.KWHzl, view);
                }
            });
        }
        C33537myN c33537myN4 = this.QKVWgx;
        if (c33537myN4 == null) {
            Intrinsics.gEmmrt("");
            c33537myN4 = null;
        }
        AEQbTJ(c33537myN4);
        AgentWeb agentWeb6 = this.OcIXYQ;
        if (agentWeb6 != null) {
            if (agentWeb6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                agentWeb = agentWeb6;
            }
            EZpvd(agentWeb);
        }
    }

    public static final void isConnected(WebActivity webActivity, View view) {
        if (webActivity.values) {
            Object systemService = webActivity.getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            webActivity.fIwbmz();
            return;
        }
        AgentWeb agentWeb = webActivity.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        if (agentWeb.back()) {
            return;
        }
        Intrinsics.copydefault(view);
        webActivity.closePage(view);
    }

    public static final void copydefault(WebActivity webActivity, String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 || webActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Intrinsics.copydefault((Object) str3);
            Intrinsics.copydefault((Object) str4);
            webActivity.KWHzl(str, str3, str4);
        } else {
            if (webActivity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                webActivity.getFieldNames = str3;
                webActivity.getNewProxyInstance = str4;
                webActivity.uzCIH = str;
                if (!C57363ygx.copydefault.AYXKKw()) {
                    webActivity.dxcTrN.launch("android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                } else {
                    webActivity.getFieldNames();
                    return;
                }
            }
            webActivity.getFieldNames = str3;
            webActivity.getNewProxyInstance = str4;
            webActivity.uzCIH = str;
            webActivity.dxcTrN.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final void valueOf(WebActivity webActivity, View view) {
        ByteArrayOutputStream byteArrayOutputStream;
        webActivity.dNCPSb = true;
        AgentWeb agentWeb = webActivity.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebCreator().getWebView().reload();
        try {
            InputStream inputStreamOpen = webActivity.getAssets().open("vconsole.min.js");
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } finally {
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i > 0) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        webActivity.AxsJAY = byteArrayOutputStream.toString();
                        Unit unit = Unit.INSTANCE;
                        yFA.copydefault(byteArrayOutputStream, null);
                        yFA.copydefault(inputStreamOpen, null);
                        return;
                    }
                }
            } finally {
            }
        } catch (IOException e) {
            Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: renamed from: com.okinc.web.WebActivity$init$7, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebActivity.this.new AnonymousClass7(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<AbstractC47263tmj> flowFIwbmz = WebActivity.this.AkhnZx().fIwbmz();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(WebActivity.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFIwbmz, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.web.WebActivity$init$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC47263tmj, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ WebActivity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(WebActivity webActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = webActivity;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(abstractC47263tmj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AgentWeb agentWeb = this.this$0.OcIXYQ;
                    if (agentWeb == null) {
                        Intrinsics.gEmmrt("");
                        agentWeb = null;
                    }
                    agentWeb.getWebCreator().getWebView().reload();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xaY.setSecondaryButton$default(o.xaY, java.lang.String, android.view.View$OnClickListener, int, java.lang.Object):void */
    public static final boolean AYXKKw(final WebActivity webActivity, View view) {
        String strInvoke;
        String strInvoke2;
        String strInvoke3;
        String str = "";
        Intrinsics.copydefault(view, "");
        final WebView.HitTestResult hitTestResult = ((WebView) view).getHitTestResult();
        Intrinsics.checkNotNullExpressionValue(hitTestResult, "");
        int type = hitTestResult.getType();
        if (type != 5 && type != 8) {
            return false;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(webActivity);
        C57309yfw c57309yfw = C57309yfw.AEQbTJ;
        Function1<WebStringEnum, String> function1Values = c57309yfw.values();
        if (function1Values == null || (strInvoke = function1Values.invoke(WebStringEnum.BTN_SAVE_IMAGE)) == null) {
            strInvoke = "";
        }
        viewOnClickListenerC54939xaY.EZpvd(strInvoke);
        Function1<WebStringEnum, String> function1Values2 = c57309yfw.values();
        if (function1Values2 == null || (strInvoke2 = function1Values2.invoke(WebStringEnum.BTN_CANCEL)) == null) {
            strInvoke2 = "";
        }
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, strInvoke2, (View.OnClickListener) null, 2, (Object) null);
        Function1<WebStringEnum, String> function1Values3 = c57309yfw.values();
        if (function1Values3 != null && (strInvoke3 = function1Values3.invoke(WebStringEnum.BTN_OK)) != null) {
            str = strInvoke3;
        }
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) str, new View.OnClickListener() { // from class: o.yfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                WebActivity.KWHzl(hitTestResult, webActivity, viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return true;
    }

    public static final void KWHzl(WebView.HitTestResult hitTestResult, WebActivity webActivity, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        String extra = hitTestResult.getExtra();
        if (extra == null) {
            extra = "";
        }
        C33610mzh.OLrzqt.copydefault(webActivity, extra, new Function1() { // from class: o.yfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WebActivity.copydefault(viewOnClickListenerC54939xaY, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, String str) {
        try {
            viewOnClickListenerC54939xaY.dismiss();
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(WebActivity webActivity, View view) {
        webActivity.onClickWebClose(view);
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.credentials.provider.IntentHandlerConverters$$ExternalSyntheticApiModelOutline1.m(android.content.Intent, java.lang.String, java.lang.Class):java.lang.Object */
    public void AYXKKw() {
        WebShareInfo webShareInfo;
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("url");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.fvQaOB = stringExtra;
            String stringExtra2 = intent.getStringExtra("title");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.flVtFt = stringExtra2;
            this.zsXlph = intent.getBooleanExtra("share", false);
            this.sSMYrx = intent.getBooleanExtra("telegram", false);
            this.gHZMYf = intent.getBooleanExtra("special", false);
            this.AuCTelauCTel = intent.getBooleanExtra(VerifyDAppDomainResponse.LEVEL_SAFE, true);
            this.AubY = intent.getBooleanExtra("is_skip_storage_permission", true);
            this.wlaJM = intent.getBooleanExtra("set_token", true);
            String stringExtra3 = intent.getStringExtra("post_data");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.aKErDB = stringExtra3;
            this.values = intent.getBooleanExtra(OtcExtraKeys.FLAG, false);
            if (Build.VERSION.SDK_INT >= 33) {
                webShareInfo = (WebShareInfo) intent.getParcelableExtra("share_info", WebShareInfo.class);
            } else {
                webShareInfo = (WebShareInfo) intent.getParcelableExtra("share_info");
            }
            this.RJOkX = webShareInfo;
            this.isConnected = intent.getBooleanExtra("cache", false);
            String stringExtra4 = intent.getStringExtra("temp_token");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            this.gGvvIC = stringExtra4;
            String stringExtra5 = intent.getStringExtra("special_token");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            this.finit = stringExtra5;
            this.RcXXUw = intent.getIntExtra("openOtherPageWays", 2);
            C57354ygo c57354ygo = C57354ygo.OLrzqt;
            String stringExtra6 = intent.getStringExtra("subdomainstrategy");
            this.fZBcTu = c57354ygo.EZpvd(stringExtra6 != null ? stringExtra6 : "");
            String stringExtra7 = intent.getStringExtra("EXTRA_PHOTO_LIBRARY_STRING");
            if (stringExtra7 != null) {
                this.djSkpj = stringExtra7;
            }
            String stringExtra8 = intent.getStringExtra("EXTRA_TAKE_PHOTO_STRING");
            if (stringExtra8 != null) {
                this.fFgQHt = stringExtra8;
            }
            String stringExtra9 = intent.getStringExtra("EXTRA_FILE_UPLOAD_STRING");
            if (stringExtra9 != null) {
                this.fJNWhG = stringExtra9;
            }
            String stringExtra10 = intent.getStringExtra("EXTRA_CANCEL_STRING");
            if (stringExtra10 != null) {
                this.ejfBZ = stringExtra10;
            }
        }
    }

    public final void AEQbTJ(C33537myN c33537myN) {
        if (getIntent().getBooleanExtra("SHOW_CLOSE", false)) {
            FrameLayout frameLayout = (FrameLayout) c33537myN.findViewById(C32113mPz.FragmentManager.dNCPSb);
            Context context = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            wYC wyc = new wYC(context, null, 0, 6, null);
            wyc.setImageResource(C52761wXj.TaskDescription.DztXDE);
            wyc.setOnClickListener(new View.OnClickListener() { // from class: o.yfE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    WebActivity.values(this.copydefault, view);
                }
            });
            Context context2 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(24, context2);
            Context context3 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iOLrzqt, C55298xhM.OLrzqt(24, context3));
            layoutParams.gravity = TextAlign.RIGHT;
            Context context4 = frameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            layoutParams.setMarginEnd(C55298xhM.OLrzqt(12, context4));
            Unit unit = Unit.INSTANCE;
            frameLayout.addView(wyc, layoutParams);
        }
    }

    public static final void values(WebActivity webActivity, View view) {
        webActivity.onClickWebClose(view);
    }

    public void onClickWebClose(View view) {
        if (view != null) {
            Object systemService = getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            fIwbmz();
        }
    }

    public final void KWHzl(final String str, String str2, String str3) {
        final String strGuessFileName = URLUtil.guessFileName(str, str2, str3);
        C57363ygx c57363ygx = C57363ygx.copydefault;
        if (c57363ygx.AYXKKw()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.AEQbTJ(), null, null, 6, null));
            builder.setMessage(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.EZpvd(), C56423yEv.EZpvd(C56390yDp.OLrzqt("filename", strGuessFileName)), null, 4, null));
            builder.setPositiveButton(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.copydefault(), null, null, 6, null), new DialogInterface.OnClickListener() { // from class: o.yfC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    WebActivity.copydefault(this.EZpvd, str, strGuessFileName, dialogInterface, i);
                }
            });
            builder.setNegativeButton(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.KWHzl(), null, null, 6, null), (DialogInterface.OnClickListener) null);
            builder.show();
            return;
        }
        Intrinsics.copydefault((Object) strGuessFileName);
        copydefault(str, strGuessFileName, strGuessFileName);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ygy.getFormattedStringOrDefault$default(android.content.Context, int, java.util.Map, java.lang.String, int, java.lang.Object):java.lang.String */
    public static final void copydefault(WebActivity webActivity, String str, String str2, DialogInterface dialogInterface, int i) {
        Intrinsics.copydefault((Object) str2);
        webActivity.copydefault(str, str2, C57364ygy.getFormattedStringOrDefault$default(webActivity, C57363ygx.copydefault.OLrzqt(), C56423yEv.EZpvd(C56390yDp.OLrzqt("filename", str2)), null, 4, null));
    }

    public final void copydefault(String str, String str2, String str3) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme != null) {
            if (Intrinsics.EZpvd((Object) scheme, (Object) "http") || Intrinsics.EZpvd((Object) scheme, (Object) "https")) {
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setTitle(str3);
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
                Object systemService = getSystemService("download");
                Intrinsics.copydefault(systemService, "");
                ((DownloadManager) systemService).enqueue(request);
            }
        }
    }

    public final void getFieldNames() {
        C57363ygx c57363ygx = C57363ygx.copydefault;
        if (c57363ygx.AYXKKw()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.gEmmrt(), null, null, 6, null));
            builder.setMessage(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.AhwBna(), null, null, 6, null));
            builder.setPositiveButton(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.djBIcL(), null, null, 6, null), new DialogInterface.OnClickListener() { // from class: o.yfO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    WebActivity.copydefault(this.KWHzl, dialogInterface, i);
                }
            });
            builder.setNegativeButton(C57364ygy.getFormattedStringOrDefault$default(this, c57363ygx.valueOf(), null, null, 6, null), (DialogInterface.OnClickListener) null);
            builder.show();
        }
    }

    public static final void copydefault(WebActivity webActivity, DialogInterface dialogInterface, int i) {
        webActivity.dxcTrN.launch("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public void OLrzqt() {
        C57309yfw.AEQbTJ.OLrzqt(this, this.giSNqX, this.RJOkX);
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(java.util.concurrent.atomic.AtomicReference, java.lang.Object, java.lang.Object):boolean */
    public final void fJNWhG() {
        Function2<IWebActivityAPI, WebShareInfo, Unit> function2AkhnZx;
        synchronized (this) {
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.gasjUx, "", this.AuCTel) && (function2AkhnZx = C57309yfw.AEQbTJ.AkhnZx()) != null) {
                function2AkhnZx.invoke(this.giSNqX, this.RJOkX);
            }
        }
    }

    public final void OLrzqt(boolean z) {
        C33537myN c33537myN = this.QKVWgx;
        if (c33537myN == null) {
            Intrinsics.gEmmrt("");
            c33537myN = null;
        }
        c33537myN.setSubDoVisible(z ? 0 : 8);
        if (z) {
            fJNWhG();
        }
        C33537myN c33537myN2 = this.QKVWgx;
        if (c33537myN2 == null) {
            Intrinsics.gEmmrt("");
            c33537myN2 = null;
        }
        c33537myN2.setSubDoListener(z ? new View.OnClickListener() { // from class: o.yfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                WebActivity.DbNXlk(this.copydefault, view);
            }
        } : null);
    }

    public static final void DbNXlk(WebActivity webActivity, View view) {
        webActivity.OLrzqt();
    }

    public final void OLrzqt(String str) {
        boolean zOLrzqt = C57354ygo.OLrzqt(str);
        this.wlaJM = zOLrzqt;
        this.AuCTelauCTel = zOLrzqt;
        this.iwGUEr.copydefault(zOLrzqt);
        if (zOLrzqt) {
            return;
        }
        C6777aVl.Companion.EZpvd(new WebHostError(str));
    }

    public final void copydefault(String str, String str2) {
        pUU.valueOf("checkTitleBarVisibility", "url=" + str + " origin=" + str2);
        try {
            if (C33129mqd.OLrzqt((CharSequence) Uri.parse(str).getQueryParameter("navigationBarHidden"))) {
                AEQbTJ(!Intrinsics.EZpvd((Object) r4, (Object) "1"));
            } else {
                KWHzl(!Intrinsics.EZpvd((Object) Uri.parse(str).getQueryParameter("titleBarVisibility"), (Object) "0"));
            }
        } catch (Exception unused) {
        }
        ejfBZ();
    }

    public final void KWHzl(boolean z) {
        FrameLayout frameLayout = null;
        if (z) {
            C33537myN c33537myN = this.QKVWgx;
            if (c33537myN == null) {
                Intrinsics.gEmmrt("");
                c33537myN = null;
            }
            c33537myN.setVisibility(0);
            FrameLayout frameLayout2 = this.QUSxYX;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setPadding(0, 0, 0, 0);
            return;
        }
        C33537myN c33537myN2 = this.QKVWgx;
        if (c33537myN2 == null) {
            Intrinsics.gEmmrt("");
            c33537myN2 = null;
        }
        c33537myN2.setVisibility(8);
        FrameLayout frameLayout3 = this.QUSxYX;
        if (frameLayout3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setPadding(0, C33570myu.OLrzqt(), 0, 0);
    }

    public final void AuCTel() {
        C33537myN c33537myN = null;
        if (this.values) {
            Object systemService = getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            C33537myN c33537myN2 = this.QKVWgx;
            if (c33537myN2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c33537myN = c33537myN2;
            }
            inputMethodManager.hideSoftInputFromWindow(c33537myN.getWindowToken(), 0);
            fIwbmz();
            return;
        }
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        if (agentWeb.back()) {
            return;
        }
        C33537myN c33537myN3 = this.QKVWgx;
        if (c33537myN3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33537myN = c33537myN3;
        }
        closePage(c33537myN);
    }

    public final void AEQbTJ(boolean z) {
        C33537myN c33537myN = null;
        if (z) {
            C33537myN c33537myN2 = this.QKVWgx;
            if (c33537myN2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c33537myN = c33537myN2;
            }
            c33537myN.setVisibility(0);
            return;
        }
        C33537myN c33537myN3 = this.QKVWgx;
        if (c33537myN3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33537myN = c33537myN3;
        }
        c33537myN.setVisibility(8);
    }

    public final void copydefault(boolean z) {
        C33567myr.AEQbTJ(this, z);
    }

    public final void ejfBZ() {
        C33567myr.AEQbTJ(this, !C33492mxV.OLrzqt());
    }

    public final void AEQbTJ(String str) {
        SPUtils.getBoolean("web_is_debug", false);
    }

    private final Bitmap KWHzl(WebView webView) {
        float scale = webView.getScale();
        int width = webView.getWidth();
        int iAhwBna = C33129mqd.AhwBna(Float.valueOf(webView.getContentHeight() * scale));
        if (width <= 0 || iAhwBna <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iAhwBna, Bitmap.Config.RGB_565);
        webView.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final Bitmap fetchVPNInfo() {
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        WebView webView = agentWeb.getWebCreator().getWebView();
        Intrinsics.checkNotNullExpressionValue(webView, "");
        Bitmap bitmapKWHzl = KWHzl(webView);
        if (bitmapKWHzl == null) {
            return null;
        }
        View view = this.QVAiDq;
        if (view == null) {
            return EZpvd(bitmapKWHzl);
        }
        return EZpvd(bitmapKWHzl, C33570myu.EZpvd(view));
    }

    public final void copydefault(boolean z, WebShareInfo webShareInfo) {
        this.zLjUOn = z;
        C33537myN c33537myN = this.QKVWgx;
        C33537myN c33537myN2 = null;
        if (c33537myN == null) {
            Intrinsics.gEmmrt("");
            c33537myN = null;
        }
        c33537myN.setSubDoVisible(z ? 0 : 8);
        if (webShareInfo != null) {
            this.RJOkX = webShareInfo;
        }
        if (z) {
            fJNWhG();
        }
        C33537myN c33537myN3 = this.QKVWgx;
        if (c33537myN3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c33537myN2 = c33537myN3;
        }
        c33537myN2.setSubDoListener(new View.OnClickListener() { // from class: o.yfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                WebActivity.AkhnZx(this.AEQbTJ, view);
            }
        });
    }

    public static final void AkhnZx(WebActivity webActivity, View view) {
        webActivity.OLrzqt();
    }

    public final void closePage(View view) {
        Object systemService = getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        KWHzl((Context) this);
    }

    private final void KWHzl(Context context) {
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).onBackPressed();
        } else if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            KWHzl(baseContext);
        }
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        KWHzl("0");
        super.onStart();
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        AEQbTJ("WebActivity onResume");
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        agentWeb.getWebLifeCycle().onResume();
        KWHzl("1");
        super.onResume();
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb != null) {
            if (agentWeb == null) {
                Intrinsics.gEmmrt("");
                agentWeb = null;
            }
            agentWeb.getWebLifeCycle().onPause();
        }
        KWHzl("2");
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        KWHzl("3");
        super.onStop();
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AgentWeb agentWeb = this.OcIXYQ;
        C57330ygQ c57330ygQ = null;
        if (agentWeb != null) {
            if (agentWeb == null) {
                Intrinsics.gEmmrt("");
                agentWeb = null;
            }
            agentWeb.getWebLifeCycle().onDestroy();
        }
        C57330ygQ c57330ygQ2 = this.QOLQEE;
        if (c57330ygQ2 != null) {
            if (c57330ygQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c57330ygQ = c57330ygQ2;
            }
            c57330ygQ.KWHzl();
        }
        ejfBZ();
        super.onDestroy();
        SubHelper.AEQbTJ(this.zuBGHE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ygD.safeCallJs$default(com.just.agentweb.JsAccessEntrace, java.lang.String, java.lang.String[], android.webkit.ValueCallback, int, java.lang.Object):void */
    public final void KWHzl(String str) {
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb != null) {
            if (agentWeb == null) {
                Intrinsics.gEmmrt("");
                agentWeb = null;
            }
            JsAccessEntrace jsAccessEntrace = agentWeb.getJsAccessEntrace();
            Intrinsics.checkNotNullExpressionValue(jsAccessEntrace, "");
            C57317ygD.safeCallJs$default(jsAccessEntrace, "onVisibilityChange", new String[]{str}, null, 4, null);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "");
        if (this.values && i == 4) {
            AuCTel();
            return true;
        }
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        if (agentWeb.handleKeyEvent(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public String uzCIH() {
        String strDbNXlk;
        Uri uri;
        Object objM7377constructorimpl;
        pUU.KWHzl(getTAG(), "origin url: " + this.fvQaOB);
        if (this.gHZMYf) {
            strDbNXlk = this.fvQaOB;
        } else if (this.fvQaOB.length() > 0) {
            strDbNXlk = TextUtils.isEmpty(Uri.parse(this.fvQaOB).getScheme()) ? C6813aWU.AEQbTJ(this.fvQaOB) : this.fvQaOB;
        } else {
            strDbNXlk = C57309yfw.AEQbTJ.DbNXlk();
        }
        String strReplace$default = strDbNXlk;
        C34704nhP c34704nhP = C34704nhP.copydefault;
        if (c34704nhP.copydefault()) {
            strReplace$default = C59449zhJ.replace$default(strReplace$default, "okexcomweb.bafang.com", C57354ygo.OLrzqt.KWHzl().invoke(), false, 4, (Object) null);
        }
        String strOLrzqt = strReplace$default;
        if (c34704nhP.EZpvd()) {
            strOLrzqt = C59449zhJ.replace$default(C59449zhJ.replace$default(strOLrzqt, "okcoincomweb.bafang.com", "www.okcoin.com", false, 4, (Object) null), "okcoinzendesk.bafang.com", "support.okcoin.com", false, 4, (Object) null);
        }
        try {
            uri = Uri.parse(strOLrzqt);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null && !C57354ygo.OLrzqt.KWHzl(uri)) {
            strOLrzqt = C43324rnD.AEQbTJ.OLrzqt(strOLrzqt, this.fZBcTu);
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Uri.parse(strOLrzqt).getHost());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String strInvoke = (String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        C57350ygk c57350ygk = this.iwGUEr;
        if (strInvoke == null) {
            strInvoke = C57354ygo.OLrzqt.KWHzl().invoke();
        }
        c57350ygk.AhwBna(strInvoke);
        pUU.KWHzl(getTAG(), "resolved url: " + strOLrzqt);
        return strOLrzqt;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        pUU.KWHzl(getTAG(), "finish, start");
        super.finish();
    }

    public final void DbNXlk() {
        pUU.KWHzl(getTAG(), "clearCookie");
        CookieSyncManager.createInstance(getApplicationContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeSessionCookies(null);
        cookieManager.removeAllCookie();
        cookieManager.flush();
        if (C43341rnU.EZpvd(this.AuCTel) || C57354ygo.AEQbTJ(this.AuCTel)) {
            this.iwGUEr.gEmmrt().KWHzl();
        }
    }

    public Activity OLrzqt(@NotNull C57350ygk c57350ygk) {
        Intrinsics.checkNotNullParameter(c57350ygk, "");
        return new Activity(this, c57350ygk);
    }

    public Application AEQbTJ(@NotNull C57350ygk c57350ygk) {
        Intrinsics.checkNotNullParameter(c57350ygk, "");
        return new Application(this, c57350ygk);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public class Activity extends WebViewClient {
        public final C57350ygk OLrzqt;
        public final /* synthetic */ WebActivity copydefault;

        public static final void KWHzl(String str) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C57350ygk OLrzqt() {
            return this.OLrzqt;
        }

        public Activity(@NotNull WebActivity webActivity, C57350ygk c57350ygk) {
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.copydefault = webActivity;
            this.OLrzqt = c57350ygk;
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(webResourceRequest, "");
            WebResourceResponse webResourceResponseKWHzl = this.OLrzqt.KWHzl(webView, webResourceRequest);
            if (webResourceResponseKWHzl == null) {
                return null;
            }
            WebActivity webActivity = this.copydefault;
            if (!webResourceRequest.isForMainFrame()) {
                return webResourceResponseKWHzl;
            }
            C57396yhd c57396yhdIsConnected = webActivity.isConnected();
            Uri url = webResourceRequest.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "");
            c57396yhdIsConnected.EZpvd(url, webResourceResponseKWHzl);
            webActivity.fARcdN = webResourceRequest.getUrl().getHost();
            webActivity.dvKsVJ = webResourceResponseKWHzl.getResponseHeaders().get("Host");
            return webResourceResponseKWHzl;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.rma.Application.processDeeplink$default(o.rma, android.content.Context, java.lang.String, java.util.Map, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull final String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.gasjUx.set("");
            this.copydefault.AuCTel = str;
            this.copydefault.copydefault(str);
            for (String str2 : C34704nhP.copydefault.KWHzl()) {
                if (C59449zhJ.startsWith$default(str, str2, false, 2, null)) {
                    if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) RemoteMessageConst.Notification.CHANNEL_ID, false, 2, (Object) null)) {
                        final WebActivity webActivity = this.copydefault;
                        webActivity.OLrzqt(webView, RemoteMessageConst.Notification.CHANNEL_ID, (Function1<? super String, Unit>) new Function1() { // from class: o.yfY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return WebActivity.Activity.KWHzl(webActivity, str, (java.lang.String) obj);
                            }
                        });
                        return true;
                    }
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this.copydefault, str, null, new Function1() { // from class: o.yfZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return WebActivity.Activity.copydefault((AbstractC43238rlX) obj);
                        }
                    }, 4, null);
                    return true;
                }
            }
            this.copydefault.copydefault(str, "shouldOverrideUrlLoading");
            return super.shouldOverrideUrlLoading(webView, str);
        }

        public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(WebActivity webActivity, String str, String str2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C33129mqd.OLrzqt((CharSequence) str2)) {
                linkedHashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, String.valueOf(str2));
            }
            ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(webActivity, str, linkedHashMap, new Function1() { // from class: o.yfV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WebActivity.Activity.KWHzl((AbstractC43238rlX) obj);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String string;
            String host;
            this.copydefault.gasjUx.set("");
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
                return false;
            }
            Uri url2 = webResourceRequest.getUrl();
            if (url2 != null && (host = url2.getHost()) != null) {
                this.copydefault.copydefault(host);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new WebActivity$OkWebViewClient$shouldOverrideUrlLoading$5(webView, interfaceC43294rma, this.copydefault, string, webResourceRequest, null), 3, null);
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            this.copydefault.AEQbTJ("onPageFinished");
            this.copydefault.AEQbTJ("load cost: " + (System.currentTimeMillis() - this.copydefault.ORxRYg));
            super.onPageFinished(webView, str);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.copydefault.AEQbTJ("onPageStarted");
            if (C57354ygo.OLrzqt(str)) {
                AgentWeb agentWeb = this.copydefault.OcIXYQ;
                if (agentWeb == null) {
                    Intrinsics.gEmmrt("");
                    agentWeb = null;
                }
                agentWeb.getWebCreator().getWebView().evaluateJavascript("window.localStorage.removeItem('token');", new ValueCallback() { // from class: o.yfX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        WebActivity.Activity.KWHzl((java.lang.String) obj);
                    }
                });
            }
            super.onPageStarted(webView, str, bitmap);
            if (str != null) {
                WebActivity webActivity = this.copydefault;
                webActivity.copydefault(str);
                webActivity.copydefault(str, "onPageStarted");
            }
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            C57396yhd c57396yhdIsConnected = this.copydefault.isConnected();
            Uri url = webResourceRequest.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "");
            c57396yhdIsConnected.EZpvd(url, webResourceResponse);
        }

        @Override // com.just.agentweb.WebViewClientDelegate, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public class Application extends WebChromeClient {
        public final C57350ygk AEQbTJ;
        public final /* synthetic */ WebActivity EZpvd;
        public int OLrzqt;

        public Application(@NotNull WebActivity webActivity, C57350ygk c57350ygk) {
            Intrinsics.checkNotNullParameter(c57350ygk, "");
            this.EZpvd = webActivity;
            this.AEQbTJ = c57350ygk;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!C57354ygo.OLrzqt(str)) {
                return true;
            }
            C57330ygQ c57330ygQ = this.EZpvd.QOLQEE;
            if (c57330ygQ == null) {
                Intrinsics.gEmmrt("");
                c57330ygQ = null;
            }
            C35962oKd.copydefault(c57330ygQ, str2);
            if (jsPromptResult == null) {
                return true;
            }
            jsPromptResult.confirm("JsBridge");
            return true;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            String strIwGUEr = this.EZpvd.iwGUEr();
            if (strIwGUEr != null && strIwGUEr.length() != 0) {
                str = strIwGUEr;
            }
            C33537myN c33537myN = this.EZpvd.QKVWgx;
            if (c33537myN == null) {
                Intrinsics.gEmmrt("");
                c33537myN = null;
            }
            c33537myN.setTitle(str);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebSettings settings;
            WebSettings settings2;
            WebSettings settings3;
            WebActivity webActivity = this.EZpvd;
            if (webActivity.sSMYrx) {
                Context context = webActivity.DTwDnp;
                webActivity.UeEOUB = context != null ? new WebView(context) : null;
                WebView webView2 = this.EZpvd.UeEOUB;
                if (webView2 != null) {
                    webView2.setVerticalScrollBarEnabled(false);
                }
                WebView webView3 = this.EZpvd.UeEOUB;
                if (webView3 != null) {
                    webView3.setHorizontalScrollBarEnabled(false);
                }
                WebView webView4 = this.EZpvd.UeEOUB;
                if (webView4 != null) {
                    webView4.setWebViewClient(this.EZpvd.OLrzqt(this.AEQbTJ));
                }
                WebView webView5 = this.EZpvd.UeEOUB;
                if (webView5 != null) {
                    webView5.setWebChromeClient(this.EZpvd.AEQbTJ(this.AEQbTJ));
                }
                WebView webView6 = this.EZpvd.UeEOUB;
                if (webView6 != null && (settings3 = webView6.getSettings()) != null) {
                    settings3.setJavaScriptEnabled(true);
                }
                WebView webView7 = this.EZpvd.UeEOUB;
                if (webView7 != null && (settings2 = webView7.getSettings()) != null) {
                    settings2.setSavePassword(true);
                }
                WebView webView8 = this.EZpvd.UeEOUB;
                if (webView8 != null && (settings = webView8.getSettings()) != null) {
                    settings.setSaveFormData(true);
                }
                WebView webView9 = this.EZpvd.UeEOUB;
                if (webView9 != null) {
                    this.EZpvd.OLrzqt(webView9);
                }
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.setAcceptCookie(true);
                cookieManager.setAcceptThirdPartyCookies(this.EZpvd.UeEOUB, true);
                Object obj = message != null ? message.obj : null;
                if (obj instanceof WebView.WebViewTransport) {
                    ((WebView.WebViewTransport) obj).setWebView(this.EZpvd.UeEOUB);
                    message.sendToTarget();
                }
                return true;
            }
            return super.onCreateWindow(webView, z, z2, message);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            AlertDialog alertDialog;
            WebActivity webActivity = this.EZpvd;
            if (webActivity.sSMYrx && webActivity.UeEOUB != null) {
                AlertDialog alertDialog2 = this.EZpvd.fetchVPNInfo;
                if (alertDialog2 == null || !alertDialog2.isShowing() || this.EZpvd.isFinishing() || this.EZpvd.isDestroyed() || (alertDialog = this.EZpvd.fetchVPNInfo) == null) {
                    return;
                }
                alertDialog.dismiss();
                return;
            }
            super.onCloseWindow(webView);
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            this.EZpvd.AEQbTJ("onProgressChanged " + i);
            if (SPUtils.getBoolean("web_is_debug", false) && this.EZpvd.dNCPSb) {
                AgentWeb agentWeb = this.EZpvd.OcIXYQ;
                if (agentWeb == null) {
                    Intrinsics.gEmmrt("");
                    agentWeb = null;
                }
                agentWeb.getWebCreator().getWebView().loadUrl(WebViewJsUtil.JS_URL_PREFIX + this.EZpvd.AxsJAY);
            }
            if (i == 100) {
                this.EZpvd.copydefault(webView);
            }
            if (this.OLrzqt != i) {
                this.OLrzqt = i;
                super.onProgressChanged(webView, i);
            }
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public final String KWHzl(Context context, Uri uri) {
            String path;
            Cursor cursorQuery;
            int columnIndex;
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            int iHashCode = scheme.hashCode();
            if (iHashCode == 3143036) {
                if (scheme.equals("file") && (path = uri.getPath()) != null) {
                    return new File(path).getName();
                }
                return null;
            }
            if (iHashCode != 951530617 || !scheme.equals("content") || (cursorQuery = context.getContentResolver().query(uri, null, null, null, null)) == null) {
                return null;
            }
            try {
                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                    String string = cursorQuery.getString(columnIndex);
                    yFA.copydefault(cursorQuery, null);
                    return string;
                }
                yFA.copydefault(cursorQuery, null);
                return null;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    yFA.copydefault(cursorQuery, th);
                    throw th2;
                }
            }
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onShowFileChooser(@NotNull WebView webView, @NotNull final ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            boolean z;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(valueCallback, "");
            Intrinsics.checkNotNullParameter(fileChooserParams, "");
            C57315ygB c57315ygB = new C57315ygB();
            final WebActivity webActivity = this.EZpvd;
            c57315ygB.copydefault(webActivity.djSkpj);
            c57315ygB.AEQbTJ(webActivity.fFgQHt);
            c57315ygB.KWHzl(webActivity.fJNWhG);
            c57315ygB.OLrzqt(webActivity.ejfBZ);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            Intrinsics.copydefault(acceptTypes);
            if (acceptTypes.length == 0) {
                z = true;
                break;
            }
            for (String str : acceptTypes) {
                Intrinsics.copydefault((Object) str);
                if (!C59449zhJ.startsWith$default(str, "image/", false, 2, null) && !Intrinsics.EZpvd((Object) str, (Object) "image/*")) {
                    z = true;
                    break;
                }
            }
            z = false;
            c57315ygB.copydefault(acceptTypes);
            c57315ygB.KWHzl(z);
            Function1<? super Uri, Unit> function1 = new Function1() { // from class: o.yfU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WebActivity.Application.EZpvd(this.OLrzqt, webActivity, valueCallback, booleanRef, (android.net.Uri) obj);
                }
            };
            c57315ygB.AEQbTJ(function1);
            c57315ygB.OLrzqt(function1);
            c57315ygB.EZpvd(function1);
            c57315ygB.EZpvd(new Function0() { // from class: o.yfS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return WebActivity.Application.OLrzqt(booleanRef, valueCallback);
                }
            });
            try {
                FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c57315ygB.OLrzqt(supportFragmentManager);
                return true;
            } catch (Exception unused) {
                valueCallback.onReceiveValue(null);
                return false;
            }
        }

        public static final Unit EZpvd(Application application, WebActivity webActivity, ValueCallback valueCallback, Ref.BooleanRef booleanRef, Uri uri) {
            if (uri != null) {
                String strKWHzl = application.KWHzl(webActivity, uri);
                if (strKWHzl != null) {
                    application.AEQbTJ.copydefault(strKWHzl, uri);
                }
                valueCallback.onReceiveValue(new Uri[]{uri});
                booleanRef.element = true;
            } else {
                valueCallback.onReceiveValue(null);
                booleanRef.element = true;
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(Ref.BooleanRef booleanRef, ValueCallback valueCallback) {
            if (!booleanRef.element) {
                booleanRef.element = true;
                valueCallback.onReceiveValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // com.just.agentweb.WebChromeClientDelegate, android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
                String strMessage = consoleMessage.message();
                Intrinsics.checkNotNullExpressionValue(strMessage, "");
                pUU.copydefault("WebConsole", strMessage);
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }

    public final void OLrzqt(WebView webView, String str, final Function1<? super String, Unit> function1) {
        webView.evaluateJavascript("sessionStorage.getItem('" + str + "');", new ValueCallback() { // from class: o.yfN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                WebActivity.EZpvd(function1, (java.lang.String) obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, String str) {
        if (str != null && str.length() > 1 && !Intrinsics.EZpvd((Object) str, (Object) AbstractJsonLexerKt.NULL)) {
            String strSubstring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            function1.invoke(strSubstring);
            return;
        }
        function1.invoke(null);
    }

    public final void OLrzqt(WebView webView) {
        Window window;
        Window window2;
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).create();
        this.fetchVPNInfo = alertDialogCreate;
        if (alertDialogCreate != null && (window2 = alertDialogCreate.getWindow()) != null) {
            window2.setBackgroundDrawableResource(R.color.transparent);
        }
        AlertDialog alertDialog = this.fetchVPNInfo;
        if (alertDialog != null) {
            alertDialog.setView(webView);
        }
        AlertDialog alertDialog2 = this.fetchVPNInfo;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
        AlertDialog alertDialog3 = this.fetchVPNInfo;
        if (alertDialog3 != null) {
            alertDialog3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.yfQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    WebActivity.KWHzl(this.KWHzl, dialogInterface);
                }
            });
        }
        AlertDialog alertDialog4 = this.fetchVPNInfo;
        if (alertDialog4 == null || (window = alertDialog4.getWindow()) == null) {
            return;
        }
        window.clearFlags(131080);
    }

    public static final void KWHzl(WebActivity webActivity, DialogInterface dialogInterface) {
        webActivity.values();
    }

    public final void values() {
        WebSettings settings;
        WebView webView = this.UeEOUB;
        ViewParent parent = webView != null ? webView.getParent() : null;
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.UeEOUB);
        }
        WebView webView2 = this.UeEOUB;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        WebView webView3 = this.UeEOUB;
        if (webView3 != null && (settings = webView3.getSettings()) != null) {
            settings.setJavaScriptEnabled(false);
        }
        WebView webView4 = this.UeEOUB;
        if (webView4 != null) {
            webView4.clearHistory();
        }
        WebView webView5 = this.UeEOUB;
        if (webView5 != null) {
            webView5.clearView();
        }
        WebView webView6 = this.UeEOUB;
        if (webView6 != null) {
            webView6.removeAllViews();
        }
        WebView webView7 = this.UeEOUB;
        if (webView7 != null) {
            webView7.destroy();
        }
        this.UeEOUB = null;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.values) {
            fIwbmz();
        }
        super.onBackPressed();
    }

    public void copydefault(WebView webView) {
        WebView webView2;
        AgentWeb agentWeb = this.OcIXYQ;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        WebCreator webCreator = agentWeb.getWebCreator();
        boolean z = true;
        boolean zCanGoBack = (webCreator == null || (webView2 = webCreator.getWebView()) == null) ? true : webView2.canGoBack();
        if ((!this.zsXlph || zCanGoBack) && !this.zLjUOn) {
            z = false;
        }
        OLrzqt(z);
    }

    public final void fIwbmz() {
        Intent intent = new Intent();
        intent.putExtra("is_finish", true);
        setResult(0, intent);
        finish();
    }

    public final void copydefault(String str) {
        C57394yhb c57394yhb = this.AwvSrB;
        if (c57394yhb != null) {
            c57394yhb.EZpvd(str);
            return;
        }
        AgentWeb agentWeb = this.OcIXYQ;
        AgentWeb agentWeb2 = null;
        if (agentWeb == null) {
            Intrinsics.gEmmrt("");
            agentWeb = null;
        }
        WebView webView = agentWeb.getWebCreator().getWebView();
        C57330ygQ c57330ygQ = this.QOLQEE;
        if (c57330ygQ == null) {
            Intrinsics.gEmmrt("");
            c57330ygQ = null;
        }
        C57394yhb c57394yhb2 = new C57394yhb(c57330ygQ, str);
        this.AwvSrB = c57394yhb2;
        webView.addJavascriptInterface(c57394yhb2, "native");
        Activity activity = this.QfsBiF;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        C57345ygf c57345ygf = new C57345ygf(activity.OLrzqt());
        AgentWeb agentWeb3 = this.OcIXYQ;
        if (agentWeb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            agentWeb2 = agentWeb3;
        }
        agentWeb2.getWebCreator().getWebView().addJavascriptInterface(c57345ygf, "interception");
    }

    public final Bitmap EZpvd(@NotNull Bitmap... bitmapArr) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(bitmapArr, "");
        if (bitmapArr.length == 0) {
            bitmap = null;
        } else {
            bitmap = bitmapArr[0];
            int iZLjUOn = yDV.zLjUOn(bitmapArr);
            if (iZLjUOn != 0) {
                int width = bitmap.getWidth();
                int i = 1;
                if (1 <= iZLjUOn) {
                    while (true) {
                        Bitmap bitmap2 = bitmapArr[i];
                        int width2 = bitmap2.getWidth();
                        if (width < width2) {
                            bitmap = bitmap2;
                            width = width2;
                        }
                        if (i == iZLjUOn) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        int width3 = bitmap != null ? bitmap.getWidth() : 0;
        int height = 0;
        for (Bitmap bitmap3 : bitmapArr) {
            height += bitmap3.getHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width3, height, Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int height2 = 0;
        for (Bitmap bitmap4 : bitmapArr) {
            canvas.drawBitmap(bitmap4, 0.0f, C33129mqd.djBIcL(Integer.valueOf(height2)), (Paint) null);
            height2 += bitmap4.getHeight();
        }
        return bitmapCreateBitmap;
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
