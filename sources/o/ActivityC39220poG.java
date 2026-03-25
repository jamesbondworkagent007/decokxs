package o;

import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import com.google.gson.Gson;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.BotWebHook;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC48895ueM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.poG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC39220poG extends AbstractActivityC39218poE implements InterfaceC39499ptW, InterfaceC39508ptf {
    public int AhwBna;
    public boolean AkhnZx;
    public C49352umt AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public java.lang.String DbNXlk;
    public boolean ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public ViewOnClickListenerC38659pdc fJNWhG;
    public boolean fetchVPNInfo;
    public MarketCoinInfo getFieldNames;
    public C38795pgF getNewProxyInstance;
    public InterfaceC58217yxC hDKMBd;
    public FragmentContainerView isConnected;
    public InterfaceC37933pGb iwGUEr;
    public int sSMYrx;
    public boolean uzCIH;
    public boolean wlaJM;
    public InterfaceC39560pue zLjUOn;
    public android.widget.RelativeLayout zsXlph;
    public C55237xgE zuBGHE;
    public final java.lang.String gEmmrt = "open_trade_view";
    public final java.lang.String AYXKKw = "open_draw_line_tools";
    public final java.lang.String valueOf = "save_tag";
    public final java.lang.String djBIcL = "save_not_first";
    public final java.lang.String OLrzqt = "is_portrait";
    public boolean values = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return this.AubY;
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void copydefault(InterfaceC37933pGb interfaceC37933pGb) {
        this.iwGUEr = interfaceC37933pGb;
    }

    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39508ptf
    public void setClickLockListener(InterfaceC39560pue interfaceC39560pue) {
        this.zLjUOn = interfaceC39560pue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public java.lang.Boolean values() {
        return java.lang.Boolean.FALSE;
    }

    public ActivityC39220poG() {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        this.AuCTelauCTel = !((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.BANNER);
        this.wlaJM = true ^ ((OKComplianceRestrictionService) c43248rlh.AEQbTJ(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.RISK_BANNER);
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.sSMYrx = c33512mxp.isConnected();
        this.AhwBna = c33512mxp.AYXKKw();
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        super.onCreate(bundle);
        OLrzqt();
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("market_detail_info");
        this.getFieldNames = parcelableExtra instanceof MarketCoinInfo ? (MarketCoinInfo) parcelableExtra : null;
        this.fetchVPNInfo = getIntent().getBooleanExtra("kline_is_full_screen", true);
        this.AubY = getIntent().getBooleanExtra("openDrawLine", true);
        this.fARcdN = getIntent().getStringExtra("id");
        this.fIwbmz = getIntent().getStringExtra("type");
        this.DbNXlk = getIntent().getStringExtra("from");
        if (getRequestedOrientation() == 0) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
        }
        setContentView(C35964oKf.Application.djBIcL);
        FragmentContainerView fragmentContainerView = (FragmentContainerView) findViewById(C35964oKf.StateListAnimator.Qsauvs);
        this.isConnected = fragmentContainerView;
        if (this.fetchVPNInfo && fragmentContainerView != null) {
            ViewGroup.LayoutParams layoutParams = fragmentContainerView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
                ((LinearLayout.LayoutParams) layoutParams2).topMargin = C33570myu.OLrzqt();
                fragmentContainerView.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            }
        }
        uzCIH();
        pFN.OLrzqt.EZpvd(new WeakReference<>(this));
        if (bundle != null) {
            this.AubY = bundle.getBoolean(this.AYXKKw);
            this.getFieldNames = (MarketCoinInfo) bundle.getParcelable(this.valueOf);
            this.AkhnZx = bundle.getBoolean(this.djBIcL);
            this.values = bundle.getBoolean(this.OLrzqt);
        }
        MarketCoinInfo marketCoinInfo = this.getFieldNames;
        if (marketCoinInfo != null) {
            this.fARcdN = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo2 = this.getFieldNames;
            this.fIwbmz = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
        }
        if (this.getFieldNames == null && (str3 = this.fARcdN) != null && this.fIwbmz != null) {
            Intrinsics.copydefault((java.lang.Object) str3);
            java.lang.String str4 = this.fIwbmz;
            Intrinsics.copydefault((java.lang.Object) str4);
            this.getFieldNames = new MarketCoinInfo(str3, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        }
        java.lang.String str5 = this.fARcdN;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = this.fIwbmz;
        OLrzqt(str5, str6 != null ? str6 : "");
        if (this.getFieldNames == null || (str = this.fARcdN) == null || str.length() == 0 || (str2 = this.fIwbmz) == null || str2.length() == 0) {
            gEmmrt();
            android.widget.RelativeLayout relativeLayout = this.zsXlph;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                return;
            }
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33504mxh.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.poM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39220poG.AEQbTJ(this.copydefault, (C33504mxh) obj);
            }
        };
        this.hDKMBd = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.poN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC39220poG.EZpvd(function1, obj);
            }
        });
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        getFieldNames();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.poQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC39220poG.OLrzqt(this.KWHzl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC39220poG activityC39220poG, C33504mxh c33504mxh) {
        if (c33504mxh.copydefault() != activityC39220poG.AhwBna || c33504mxh.AEQbTJ() != activityC39220poG.sSMYrx) {
            activityC39220poG.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC39220poG activityC39220poG) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC39220poG, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        overridePendingTransition(0, 0);
    }

    private final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.DeEinT, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.valueOf(i);
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.djBIcL(i);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.ixgjPv();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.DCUTEIddSDPG();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.UlJrfe();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.htlTjW();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.fERRXa();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.DCUTEIdCUTEI();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.KWHzl(d, d2);
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.EZpvd(d, d2);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.dUDNAs();
        }
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdc = this.fJNWhG;
        if (viewOnClickListenerC38659pdc != null) {
            viewOnClickListenerC38659pdc.fjfviF();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        try {
            MarketCoinInfo marketCoinInfo = this.getFieldNames;
            if (marketCoinInfo != null) {
                bundle.putParcelable(this.valueOf, marketCoinInfo);
            }
            bundle.putBoolean(this.djBIcL, this.AkhnZx);
            bundle.putBoolean(this.AYXKKw, this.AubY);
            bundle.putBoolean(this.gEmmrt, pEI.EZpvd.copydefault());
            bundle.putBoolean(this.OLrzqt, this.values);
        } catch (java.lang.Exception e) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("Kline_crash_track", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.poI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC39220poG.EZpvd(e, (EventParamsList) obj);
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
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
        this.getFieldNames = marketCoinInfo;
        this.fARcdN = marketCoinInfo != null ? marketCoinInfo.getInstrumentId() : null;
        MarketCoinInfo marketCoinInfo2 = this.getFieldNames;
        this.fIwbmz = marketCoinInfo2 != null ? marketCoinInfo2.getInstrumentType() : null;
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        copydefault(i);
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(boolean z) {
        EZpvd(z);
        getFieldNames();
    }

    public final void EZpvd(boolean z) {
        this.values = false;
        this.ejfBZ = z;
        setRequestedOrientation(0);
    }

    public final void iwGUEr() {
        this.values = true;
        this.fetchVPNInfo = true;
        setRequestedOrientation(1);
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(android.view.View view) {
        iwGUEr();
        getFieldNames();
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(android.view.View view) {
        AYXKKw();
    }

    @Override // o.InterfaceC39499ptW
    public void isConnected() {
        this.values = true;
        this.fetchVPNInfo = false;
        setRequestedOrientation(1);
        getFieldNames();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        if (this.values) {
            setRequestedOrientation(1);
            getWindow().clearFlags(1024);
            return;
        }
        setRequestedOrientation(0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.flags = 1024 | attributes.flags;
        getWindow().setAttributes(attributes);
        C38795pgF c38795pgF = this.getNewProxyInstance;
        if (c38795pgF != null) {
            c38795pgF.AxsJAYsNCnLh();
        }
    }

    private final void getFieldNames() {
        java.lang.String str;
        java.lang.String str2;
        C38795pgF c38795pgFEZpvd = null;
        viewOnClickListenerC38659pdcOLrzqt = null;
        ViewOnClickListenerC38659pdc viewOnClickListenerC38659pdcOLrzqt = null;
        c38795pgFEZpvd = null;
        if (this.fetchVPNInfo) {
            copydefault(true);
            iwGUEr();
            java.lang.String str3 = this.fARcdN;
            if (str3 != null && (str2 = this.fIwbmz) != null) {
                viewOnClickListenerC38659pdcOLrzqt = ViewOnClickListenerC38659pdc.Companion.OLrzqt(str3, str2, (16 & 4) != 0 ? null : this.DbNXlk, (16 & 8) != 0, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? null : null, (16 & 64) != 0 ? null : null);
            }
            this.fJNWhG = viewOnClickListenerC38659pdcOLrzqt;
            if (viewOnClickListenerC38659pdcOLrzqt != null) {
                AEQbTJ(viewOnClickListenerC38659pdcOLrzqt);
                return;
            }
            return;
        }
        copydefault(false);
        EZpvd(true);
        java.lang.String str4 = this.fARcdN;
        if (str4 != null && (str = this.fIwbmz) != null) {
            c38795pgFEZpvd = C38795pgF.Companion.EZpvd(str4, str, this.ejfBZ, true, false);
        }
        this.getNewProxyInstance = c38795pgFEZpvd;
        if (c38795pgFEZpvd != null) {
            AEQbTJ(c38795pgFEZpvd);
        }
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
        getDelegate().setLocalNightMode(i);
    }

    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
        InterfaceC37933pGb interfaceC37933pGb;
        this.uzCIH = z;
        if (z || (interfaceC37933pGb = this.iwGUEr) == null) {
            return;
        }
        interfaceC37933pGb.AhwBna();
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        OLrzqt();
    }

    private final void copydefault(int i) {
        InterfaceC54577xNn interfaceC54577xNn;
        AuCTel();
        C49352umt c49352umt = this.AuCTel;
        if (c49352umt != null) {
            InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.poF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC39220poG.AEQbTJ(this.AEQbTJ);
                }
            }, 1, null);
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_demo_trading_chart_button_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.poH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC39220poG.OLrzqt(this.OLrzqt, (EventParamsList) obj);
                }
            });
        }
        C32866mlf.EZpvd("KLine_PageInteraction_Share_View", new EventParam("type", i == 0 ? "chart" : "info", false));
    }

    public static final Unit AEQbTJ(final ActivityC39220poG activityC39220poG) {
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(activityC39220poG.getWindow().getDecorView(), activityC39220poG.AuCTel);
        Intrinsics.checkNotNullExpressionValue(bitmapAEQbTJ, "");
        ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, activityC39220poG, new Function1() { // from class: o.poL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39220poG.copydefault((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.poK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39220poG.OLrzqt(this.copydefault, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC39220poG activityC39220poG, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC39220poG, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.poJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39220poG.KWHzl((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC39220poG activityC39220poG, EventParamsList eventParamsList) {
        java.lang.String instrumentId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "share", false);
        eventParamsList.put("type", activityC39220poG.djBIcL(), false);
        MarketCoinInfo marketCoinInfo = activityC39220poG.getFieldNames;
        if (marketCoinInfo != null && (instrumentId = marketCoinInfo.getInstrumentId()) != null) {
            str = instrumentId;
        }
        eventParamsList.put("pair", str, false);
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        android.view.View viewInflate = android.view.View.inflate(this, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.AuCTel = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC39499ptW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL() {
        MarketCoinInfo marketCoinInfo = this.getFieldNames;
        java.lang.String instrumentType = marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null;
        if (instrumentType != null) {
            switch (instrumentType.hashCode()) {
                case -2027980370:
                    if (instrumentType.equals("MARGIN")) {
                        return "bb";
                    }
                    break;
                case -1956807563:
                    if (instrumentType.equals("OPTION")) {
                        return "options";
                    }
                    break;
                case 2552066:
                    if (!instrumentType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (instrumentType.equals("SWAP")) {
                        return "swap";
                    }
                    break;
                case 214415088:
                    if (instrumentType.equals("FUTURES")) {
                        return "futures";
                    }
                    break;
            }
        }
        return "";
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            MarketCoinInfo marketCoinInfo = (MarketCoinInfo) new Gson().fromJson(extras.getString("market_detail_info"), MarketCoinInfo.class);
            this.getFieldNames = marketCoinInfo;
            if (marketCoinInfo == null) {
                finish();
            }
        }
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        pFN.OLrzqt.OLrzqt();
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.zLjUOn;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.zLjUOn;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(java.lang.Boolean bool) {
        if (bool != null) {
            this.AubY = bool.booleanValue();
        }
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pEI pei = pEI.EZpvd;
        pei.KWHzl();
        pei.AYXKKw();
        pFU.AEQbTJ.KWHzl(true);
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pFU.AEQbTJ.KWHzl(false);
        C36246oUr.copydefault().gEmmrt();
    }

    public final void uzCIH() {
        C55113xdn c55113xdn;
        C55237xgE c55237xgE = this.zuBGHE;
        android.view.View viewAEQbTJ = c55237xgE != null ? c55237xgE.AEQbTJ(StatefulView.Status.Loading) : null;
        if (viewAEQbTJ == null || (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) == null) {
            return;
        }
        C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
    }

    public final void gEmmrt() {
        C55237xgE c55237xgE = this.zuBGHE;
        if (c55237xgE == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("KLine_Chart_ChartType_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.poO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39220poG.OLrzqt(str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("trade_pair", str, false);
        eventParamsList.put("business_line", str2, true);
        return Unit.INSTANCE;
    }

    private final void copydefault(boolean z) {
        java.lang.String strValueOf = C56524yIo.AEQbTJ(C38685peB.class).valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        if (z) {
            if (getSupportFragmentManager().findFragmentByTag(strValueOf) != null) {
                return;
            }
            getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.Qsauvs, C38685peB.Companion.EZpvd(true), strValueOf).commitNowAllowingStateLoss();
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C34584neo.OLrzqt(supportFragmentManager, strValueOf);
        }
    }

    public final C38685peB fIwbmz() {
        FragmentContainerView fragmentContainerView = this.isConnected;
        if (fragmentContainerView != null) {
            return (C38685peB) fragmentContainerView.getFragment();
        }
        return null;
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC39218poE, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
