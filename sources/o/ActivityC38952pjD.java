package o;

import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.uilab.stateful.StatefulView;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pjD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC38952pjD extends AbstractActivityC38961pjM implements InterfaceC39499ptW {
    public int AYXKKw;
    public boolean AhwBna;
    public MarketArbCoinInfo AkhnZx;
    public InterfaceC37933pGb AuCTel;
    public boolean DbNXlk;
    public int KWHzl;
    public InterfaceC39560pue ejfBZ;
    public ViewOnClickListenerC38981pjg fARcdN;
    public boolean fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public C49352umt fetchVPNInfo;
    public C55237xgE getFieldNames;
    public boolean getNewProxyInstance;
    public int hDKMBd;
    public java.lang.String isConnected;
    public android.os.Handler iwGUEr;
    public java.lang.String valueOf;
    public java.lang.String values;
    public final java.lang.String EZpvd = "open_trade_view";
    public final java.lang.String copydefault = "open_draw_line_tools";
    public final java.lang.String AEQbTJ = "save_tag";
    public final java.lang.String OLrzqt = "save_not_first";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return this.getNewProxyInstance;
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC37933pGb interfaceC37933pGb) {
        Intrinsics.checkNotNullParameter(interfaceC37933pGb, "");
        this.AuCTel = interfaceC37933pGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.fIwbmz = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.pjM.OLrzqt()V */
    public final InterfaceC37933pGb OLrzqt() {
        return this.AuCTel;
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void copydefault(InterfaceC37933pGb interfaceC37933pGb) {
        this.AuCTel = interfaceC37933pGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
        this.DbNXlk = false;
    }

    @Override // o.InterfaceC39499ptW
    public void isConnected() {
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(android.view.View view) {
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(android.view.View view) {
    }

    public ActivityC38952pjD() {
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.hDKMBd = c33512mxp.isConnected();
        this.KWHzl = c33512mxp.AYXKKw();
        this.iwGUEr = new Application(this);
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("market_detail_info");
        this.AkhnZx = parcelableExtra instanceof MarketArbCoinInfo ? (MarketArbCoinInfo) parcelableExtra : null;
        this.valueOf = getIntent().getStringExtra("from");
        this.AYXKKw = getIntent().getIntExtra("coin_hot_sort", 0);
        if (getRequestedOrientation() == 0) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
        }
        setContentView(C35964oKf.Application.OLrzqt);
        this.getFieldNames = (C55237xgE) findViewById(C35964oKf.StateListAnimator.search);
        AuCTel();
        valueOf();
        if (bundle != null) {
            this.getNewProxyInstance = bundle.getBoolean(this.copydefault);
            this.AkhnZx = (MarketArbCoinInfo) bundle.getParcelable(this.AEQbTJ);
            this.AhwBna = bundle.getBoolean(this.OLrzqt);
            boolean z = bundle.getBoolean(this.EZpvd);
            this.DbNXlk = z;
            pEI.EZpvd.AEQbTJ(z);
        }
        MarketArbCoinInfo marketArbCoinInfo = this.AkhnZx;
        if (marketArbCoinInfo != null) {
            this.values = marketArbCoinInfo != null ? marketArbCoinInfo.getLeftInstId() : null;
            MarketArbCoinInfo marketArbCoinInfo2 = this.AkhnZx;
            this.isConnected = marketArbCoinInfo2 != null ? marketArbCoinInfo2.getLeftInstType() : null;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33504mxh.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.pjF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38952pjD.copydefault(this.KWHzl, (C33504mxh) obj);
            }
        };
        this.fJNWhG = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pjG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC38952pjD.EZpvd(function1, obj);
            }
        });
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        MarketArbCoinInfo marketArbCoinInfo3 = this.AkhnZx;
        ViewOnClickListenerC38981pjg viewOnClickListenerC38981pjgEZpvd = marketArbCoinInfo3 != null ? ViewOnClickListenerC38981pjg.Companion.EZpvd(marketArbCoinInfo3, this.valueOf) : null;
        this.fARcdN = viewOnClickListenerC38981pjgEZpvd;
        if (viewOnClickListenerC38981pjgEZpvd != null) {
            AEQbTJ(viewOnClickListenerC38981pjgEZpvd);
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC38952pjD.copydefault(this.EZpvd);
            }
        });
        EZpvd(true);
        C36246oUr.copydefault().fIwbmz(false);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC38952pjD activityC38952pjD, C33504mxh c33504mxh) {
        if (c33504mxh.copydefault() != activityC38952pjD.KWHzl || c33504mxh.AEQbTJ() != activityC38952pjD.hDKMBd) {
            activityC38952pjD.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC38952pjD activityC38952pjD) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC38952pjD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C35964oKf.StateListAnimator.AEQbTJ;
        Intrinsics.copydefault(fragment);
        fragmentTransactionBeginTransaction.replace(i, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        try {
            MarketArbCoinInfo marketArbCoinInfo = this.AkhnZx;
            if (marketArbCoinInfo != null) {
                bundle.putParcelable(this.AEQbTJ, marketArbCoinInfo);
            }
            bundle.putBoolean(this.OLrzqt, this.AhwBna);
            bundle.putBoolean(this.copydefault, this.getNewProxyInstance);
            bundle.putBoolean(this.EZpvd, pEI.EZpvd.copydefault());
        } catch (java.lang.Exception e) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("Kline_crash_track", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pjH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38952pjD.EZpvd(e, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String simpleName = eventParamsList.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        eventParamsList.put("Kline_crash_track_page_info", simpleName, false);
        eventParamsList.put("Kline_crash_track_exception", exc.toString(), false);
        eventParamsList.put("Kline_crash_track_time", C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), false);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
        this.AkhnZx = marketArbCoinInfo;
        this.values = marketArbCoinInfo != null ? marketArbCoinInfo.getLeftInstId() : null;
        MarketArbCoinInfo marketArbCoinInfo2 = this.AkhnZx;
        this.isConnected = marketArbCoinInfo2 != null ? marketArbCoinInfo2.getLeftInstType() : null;
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        KWHzl(i);
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
        getDelegate().setLocalNightMode(i);
    }

    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
        InterfaceC37933pGb interfaceC37933pGb;
        this.fIwbmz = z;
        if (z || (interfaceC37933pGb = this.AuCTel) == null) {
            return;
        }
        interfaceC37933pGb.AhwBna();
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
        finish();
    }

    public final void KWHzl(int i) {
        AEQbTJ();
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(getWindow().getDecorView(), this.fetchVPNInfo);
        Intrinsics.checkNotNullExpressionValue(bitmapAEQbTJ, "");
        ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, this, new Function1() { // from class: o.pjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38952pjD.copydefault((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.pjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38952pjD.EZpvd(this.KWHzl, (java.io.File) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC38952pjD activityC38952pjD, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(activityC38952pjD, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.pjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38952pjD.OLrzqt((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        android.view.View viewInflate = android.view.View.inflate(this, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.fetchVPNInfo = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC39499ptW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL() {
        MarketArbCoinInfo marketArbCoinInfo = this.AkhnZx;
        java.lang.String leftInstId = marketArbCoinInfo != null ? marketArbCoinInfo.getLeftInstId() : null;
        if (leftInstId != null) {
            switch (leftInstId.hashCode()) {
                case -2027980370:
                    if (leftInstId.equals("MARGIN")) {
                        return "bb";
                    }
                    break;
                case -1956807563:
                    if (leftInstId.equals("OPTION")) {
                        return "options";
                    }
                    break;
                case 2552066:
                    if (!leftInstId.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (leftInstId.equals("SWAP")) {
                        return "swap";
                    }
                    break;
                case 214415088:
                    if (leftInstId.equals("FUTURES")) {
                        return "futures";
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: o.pjD$Application */
    public static final class Application extends android.os.Handler {
        public static final C0917Application Companion = new C0917Application(null);
        public static final int KWHzl = 8;
        public WeakReference<android.app.Activity> AEQbTJ;

        public Application(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.AEQbTJ = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull android.os.Message message) {
            InterfaceC37933pGb interfaceC37933pGbOLrzqt;
            Intrinsics.checkNotNullParameter(message, "");
            android.app.Activity activity = this.AEQbTJ.get();
            if (activity != null) {
                ActivityC38952pjD activityC38952pjD = (ActivityC38952pjD) activity;
                if (message.what == 4) {
                    activityC38952pjD.KWHzl(false);
                    if (activityC38952pjD.OLrzqt() == null || (interfaceC37933pGbOLrzqt = activityC38952pjD.OLrzqt()) == null) {
                        return;
                    }
                    interfaceC37933pGbOLrzqt.AhwBna();
                }
            }
        }

        /* JADX INFO: renamed from: o.pjD$Application$Application, reason: collision with other inner class name */
        public static final class C0917Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pjD.Application.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0917Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0917Application() {
            }
        }
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C36246oUr.copydefault().AubY(false);
        pEI.EZpvd.EZpvd();
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.ejfBZ;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.ejfBZ;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    @Override // o.InterfaceC39499ptW
    public java.lang.Boolean values() {
        return java.lang.Boolean.valueOf(this.DbNXlk);
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(java.lang.Boolean bool) {
        if (bool != null) {
            this.getNewProxyInstance = bool.booleanValue();
        }
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pEI pei = pEI.EZpvd;
        pei.KWHzl();
        pei.AYXKKw();
    }

    private final void AuCTel() {
        C55237xgE c55237xgE = this.getFieldNames;
        if (c55237xgE != null) {
            ViewGroup.LayoutParams layoutParams = c55237xgE.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C33570myu.gEmmrt(this) + gEmmrt();
            c55237xgE.setLayoutParams(layoutParams2);
        }
    }

    public final void valueOf() {
        C55113xdn c55113xdn;
        C55237xgE c55237xgE = this.getFieldNames;
        android.view.View viewAEQbTJ = c55237xgE != null ? c55237xgE.AEQbTJ(StatefulView.Status.Loading) : null;
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        }
        C55237xgE c55237xgE2 = this.getFieldNames;
        if (c55237xgE2 != null) {
            c55237xgE2.setVisibility(0);
        }
        C55237xgE c55237xgE3 = this.getFieldNames;
        if (c55237xgE3 != null) {
            c55237xgE3.setLoadingDelayedTime(0L);
        }
        C55237xgE c55237xgE4 = this.getFieldNames;
        if (c55237xgE4 != null) {
            c55237xgE4.setStatus(StatefulView.Status.Loading);
        }
    }

    public final void KWHzl() {
        C55237xgE c55237xgE = this.getFieldNames;
        if (c55237xgE == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC38961pjM, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
