package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FundingFeeDetailItem;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC49419uoG;
import o.AbstractC49464uoz;
import o.C49720utq;
import o.C55688xof;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49757uua extends android.widget.LinearLayout implements InterfaceC49582urK {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public long AhwBna;
    public Observer<AbstractC49419uoG.ActionBar> AkhnZx;
    public boolean AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public final InterfaceC49574urC AubY;
    public long DbNXlk;
    public BizInstrument EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;
    public InterfaceC49492upa djBIcL;
    public Observer<xMJ.TaskDescription> ejfBZ;
    public boolean fARcdN;
    public Observer<xMJ.StateListAnimator> fIwbmz;
    public InterfaceC49575urD fJNWhG;
    public InterfaceC58217yxC fetchVPNInfo;
    public FundingRateData gEmmrt;
    public Observer<OfflinePlan> getFieldNames;
    public java.lang.Long getNewProxyInstance;
    public java.lang.String hDKMBd;
    public Observer<AbstractC49464uoz.Activity> isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public java.lang.Long uzCIH;
    public final AbstractC49689utL valueOf;
    public androidx.fragment.app.FragmentManager values;
    public InterfaceC58217yxC wlaJM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBizInstrument(BizInstrument bizInstrument) {
        this.EZpvd = bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.values = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMIsLeftLegal(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r11v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r12v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:androidx.fragment.app.FragmentManager:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null androidx.fragment.app.FragmentManager) : (r14v0 androidx.fragment.app.FragmentManager))
  (r15v0 com.okinc.unify_trade.biz.BizInstrument)
  (r16v0 boolean)
  (wrap:o.urC:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null o.urC) : (r17v0 o.urC))
 A[MD:(android.content.Context, android.util.AttributeSet, int, androidx.fragment.app.FragmentManager, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void (m)] (LINE:91) call: o.uua.<init>(android.content.Context, android.util.AttributeSet, int, androidx.fragment.app.FragmentManager, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void type: THIS */
    public /* synthetic */ C49757uua(android.content.Context context, android.util.AttributeSet attributeSet, int i, androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragmentManager, bizInstrument, z, (i2 & 64) != 0 ? null : interfaceC49574urC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49757uua(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i, androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = bizInstrument;
        this.fARcdN = z;
        this.AubY = interfaceC49574urC;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49720utq.ActionBar.AYXKKw, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC49689utL abstractC49689utL = (AbstractC49689utL) viewDataBindingInflate;
        this.valueOf = abstractC49689utL;
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.uuk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49757uua.AEQbTJ(context);
            }
        });
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.uum
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C49757uua.copydefault(context);
            }
        });
        this.AYXKKw = "";
        this.AEQbTJ = "";
        this.copydefault = "";
        this.KWHzl = "";
        this.hDKMBd = "";
        BizInstrument bizInstrumentCopydefault = copydefault();
        pUU.KWHzl("unifiedDepth_Ticker_s", "init   " + (bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null));
        abstractC49689utL.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49757uua.copydefault(this.OLrzqt, view);
            }
        });
        fetchVPNInfo();
        this.values = fragmentManager;
    }

    /* JADX INFO: renamed from: o.uua$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uua.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final java.lang.String AEQbTJ(android.content.Context context) {
        return context.getString(C55688xof.Application.isDrawerSlideAnimationEnabled);
    }

    private final java.lang.String values() {
        return (java.lang.String) this.AuCTelauCTel.getValue();
    }

    private final java.lang.String AkhnZx() {
        return (java.lang.String) this.iwGUEr.getValue();
    }

    public static final java.lang.String copydefault(android.content.Context context) {
        return context.getString(C55688xof.Application.getData);
    }

    public static final void copydefault(C49757uua c49757uua, android.view.View view) {
        c49757uua.KWHzl(!c49757uua.AuCTel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        C56132xwz c56132xwz;
        C56111xwe<java.lang.Boolean> c56111xweEZpvd;
        android.content.Context context = getContext();
        byte b = 0;
        final FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradeuilib.impl.depth.view.tickerview.SwapDepthTickerInfoView$handlePreQuoteState$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = fragmentActivity.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            };
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C56132xwz.class);
            Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.tradeuilib.impl.depth.view.tickerview.SwapDepthTickerInfoView$handlePreQuoteState$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = fragmentActivity.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            };
            final byte b2 = b == true ? 1 : 0;
            c56132xwz = (C56132xwz) new ViewModelLazy(interfaceC56551yJoAEQbTJ, function02, function0, new Function0<CreationExtras>() { // from class: com.okinc.tradeuilib.impl.depth.view.tickerview.SwapDepthTickerInfoView$handlePreQuoteState$$inlined$viewModels$default$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function03 = b2;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    CreationExtras defaultViewModelCreationExtras = fragmentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
            }).getValue();
        } else {
            c56132xwz = null;
        }
        boolean z = ((c56132xwz == null || (c56111xweEZpvd = c56132xwz.EZpvd()) == null) ? null : c56111xweEZpvd.getValue()) == null || Intrinsics.EZpvd(c56132xwz.EZpvd().getValue(), java.lang.Boolean.FALSE);
        BizInstrument bizInstrumentCopydefault = copydefault();
        setVisibility((Intrinsics.EZpvd((java.lang.Object) (bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getBizStatus() : null), (java.lang.Object) "LIVE") && z) ? 0 : 8);
    }

    private final java.lang.String AhwBna() {
        java.lang.String strAhwBna;
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SWAP") : null;
            xLU xlu = abstractC54531xLwOLrzqt instanceof xLU ? (xLU) abstractC54531xLwOLrzqt : null;
            if (xlu != null && (strAhwBna = xlu.AhwBna(bizInstrumentCopydefault)) != null) {
                return strAhwBna;
            }
        }
        return "";
    }

    private final void fetchVPNInfo() {
        this.fIwbmz = new Observer() { // from class: o.uub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49757uua.OLrzqt(this.EZpvd, (xMJ.StateListAnimator) obj);
            }
        };
        this.ejfBZ = new Observer() { // from class: o.uuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49757uua.OLrzqt(this.KWHzl, (xMJ.TaskDescription) obj);
            }
        };
        this.getFieldNames = new Observer() { // from class: o.uuf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49757uua.OLrzqt(this.AEQbTJ, (OfflinePlan) obj);
            }
        };
        this.AkhnZx = new Observer() { // from class: o.uud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49757uua.OLrzqt(this.AEQbTJ, (AbstractC49419uoG.ActionBar) obj);
            }
        };
        this.isConnected = new Observer() { // from class: o.uue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49757uua.KWHzl(this.OLrzqt, (AbstractC49464uoz.Activity) obj);
            }
        };
    }

    public static final void OLrzqt(C49757uua c49757uua, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC49681utD abstractC49681utD = c49757uua.valueOf.gEmmrt;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtMarkPriceWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49757uua.copydefault(), false, 4, null));
    }

    public static final void OLrzqt(C49757uua c49757uua, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC49681utD abstractC49681utD = c49757uua.valueOf.EZpvd;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtIndexTickerWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49757uua.copydefault(), false, 4, null));
    }

    public static final void OLrzqt(C49757uua c49757uua, OfflinePlan offlinePlan) {
        java.lang.String startTime;
        Intrinsics.checkNotNullParameter(offlinePlan, "");
        java.lang.String startTime2 = offlinePlan.getStartTime();
        java.lang.Long lValueOf = (startTime2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) startTime2) || (startTime = offlinePlan.getStartTime()) == null) ? null : java.lang.Long.valueOf(C33129mqd.valueOf(startTime));
        c49757uua.getNewProxyInstance = lValueOf;
        pUU.KWHzl("unifiedDepth_Ticker_s", "offLineEndTime   " + lValueOf);
        InterfaceC49492upa interfaceC49492upa = c49757uua.djBIcL;
        if (interfaceC49492upa != null) {
            interfaceC49492upa.copydefault(offlinePlan);
        }
    }

    public static final void OLrzqt(C49757uua c49757uua, AbstractC49419uoG.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        pUU.KWHzl("unifiedDepth_Ticker_s", "ws get FundingRateData " + actionBar);
        refreshFundingRateView$default(c49757uua, null, actionBar, 1, null);
        InterfaceC49492upa interfaceC49492upa = c49757uua.djBIcL;
        if (interfaceC49492upa != null) {
            interfaceC49492upa.AEQbTJ(actionBar);
        }
    }

    public static final void KWHzl(C49757uua c49757uua, AbstractC49464uoz.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String strCopydefault = activity.copydefault();
        if (strCopydefault == null || strCopydefault.length() == 0) {
            c49757uua.valueOf.OLrzqt.KWHzl(true);
        } else {
            C49579urH c49579urH = C49579urH.EZpvd;
            java.lang.String strCopydefault2 = activity.copydefault();
            if (strCopydefault2 == null) {
                strCopydefault2 = "";
            }
            pUU.copydefault("SwapDepthTickerInfoView", "estimatedPrice=" + c49579urH.copydefault(strCopydefault2, c49757uua.copydefault()));
            java.lang.String strCopydefault3 = activity.copydefault();
            c49757uua.hDKMBd = c49579urH.copydefault(strCopydefault3 != null ? strCopydefault3 : "", c49757uua.copydefault());
            c49757uua.valueOf.OLrzqt.KWHzl(true);
            c49757uua.valueOf.AhwBna.EZpvd(false);
        }
        InterfaceC49492upa interfaceC49492upa = c49757uua.djBIcL;
        if (interfaceC49492upa != null) {
            interfaceC49492upa.AEQbTJ(activity);
        }
    }

    private final boolean isConnected() {
        return xVD.KWHzl.copydefault(this.getNewProxyInstance, java.lang.Long.valueOf(this.DbNXlk));
    }

    public final boolean valueOf() {
        if (TradeAbTestManager.copydefault.valueOf()) {
            return xVD.KWHzl.KWHzl(this.getNewProxyInstance);
        }
        return xVD.KWHzl.OLrzqt(this.getNewProxyInstance);
    }

    @Override // o.InterfaceC49582urK
    public void AEQbTJ() {
        InterfaceC49575urD interfaceC49575urD;
        LiveData<OfflinePlan> liveDataKWHzl;
        InterfaceC49575urD interfaceC49575urD2;
        LiveData<AbstractC49464uoz.Activity> liveDataAEQbTJ;
        InterfaceC49575urD interfaceC49575urD3;
        LiveData<AbstractC49419uoG.ActionBar> liveDataEZpvd;
        InterfaceC49575urD interfaceC49575urD4;
        LiveData<xMJ.TaskDescription> liveDataCopydefault;
        InterfaceC49575urD interfaceC49575urD5;
        LiveData<xMJ.StateListAnimator> liveDataOLrzqt;
        BizInstrument bizInstrumentCopydefault = copydefault();
        pUU.KWHzl("unifiedDepth_Ticker_s", "onVisible   " + (bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null));
        InterfaceC49574urC interfaceC49574urC = this.AubY;
        InterfaceC49575urD interfaceC49575urDOLrzqt = interfaceC49574urC != null ? interfaceC49574urC.OLrzqt(OLrzqt()) : null;
        this.fJNWhG = interfaceC49575urDOLrzqt;
        if (interfaceC49575urDOLrzqt != null) {
            interfaceC49575urDOLrzqt.AhwBna();
        }
        Observer<xMJ.StateListAnimator> observer = this.fIwbmz;
        if (observer != null && (interfaceC49575urD5 = this.fJNWhG) != null && (liveDataOLrzqt = interfaceC49575urD5.OLrzqt()) != null) {
            liveDataOLrzqt.observeForever(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.ejfBZ;
        if (observer2 != null && (interfaceC49575urD4 = this.fJNWhG) != null && (liveDataCopydefault = interfaceC49575urD4.copydefault()) != null) {
            liveDataCopydefault.observeForever(observer2);
        }
        Observer<AbstractC49419uoG.ActionBar> observer3 = this.AkhnZx;
        if (observer3 != null && (interfaceC49575urD3 = this.fJNWhG) != null && (liveDataEZpvd = interfaceC49575urD3.EZpvd()) != null) {
            liveDataEZpvd.observeForever(observer3);
        }
        Observer<AbstractC49464uoz.Activity> observer4 = this.isConnected;
        if (observer4 != null && (interfaceC49575urD2 = this.fJNWhG) != null && (liveDataAEQbTJ = interfaceC49575urD2.AEQbTJ()) != null) {
            liveDataAEQbTJ.observeForever(observer4);
        }
        Observer<OfflinePlan> observer5 = this.getFieldNames;
        if (observer5 != null && (interfaceC49575urD = this.fJNWhG) != null && (liveDataKWHzl = interfaceC49575urD.KWHzl()) != null) {
            liveDataKWHzl.observeForever(observer5);
        }
        djBIcL();
        copydefault(copydefault());
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.EZpvd(1L, java.util.concurrent.TimeUnit.SECONDS).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49757uua.copydefault(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        this.wlaJM = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.utY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49757uua.OLrzqt(function1, obj);
            }
        });
        if (!DbNXlk() && !gEmmrt()) {
            this.valueOf.AhwBna.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.uuh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49757uua.OLrzqt(this.copydefault, view);
                }
            });
        }
        BizInstrument bizInstrumentCopydefault2 = copydefault();
        setVisibility(Intrinsics.EZpvd((java.lang.Object) (bizInstrumentCopydefault2 != null ? bizInstrumentCopydefault2.getBizStatus() : null), (java.lang.Object) "LIVE") ? 0 : 8);
        AYXKKw();
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C49757uua c49757uua, java.lang.Long l) {
        c49757uua.setManualFundingRate();
        if (c49757uua.AhwBna > java.lang.System.currentTimeMillis()) {
            c49757uua.valueOf.KWHzl.OLrzqt.setText(xMN.KWHzl(c49757uua.AhwBna - java.lang.System.currentTimeMillis()));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C49757uua c49757uua, android.view.View view) {
        java.lang.String method;
        java.lang.String method2;
        java.lang.String method3;
        BizInstrument bizInstrumentCopydefault = c49757uua.copydefault();
        c49757uua.OLrzqt(bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstType() : null);
        java.lang.String str = "";
        if (c49757uua.valueOf() && C33129mqd.OLrzqt((java.lang.CharSequence) c49757uua.hDKMBd)) {
            FundingRateData fundingRateData = c49757uua.gEmmrt;
            if (fundingRateData != null && (method3 = fundingRateData.getMethod()) != null) {
                str = method3;
            }
            c49757uua.AEQbTJ("funding_fee_off_line", str);
            return;
        }
        if (c49757uua.isConnected()) {
            FundingRateData fundingRateData2 = c49757uua.gEmmrt;
            if (fundingRateData2 != null && (method2 = fundingRateData2.getMethod()) != null) {
                str = method2;
            }
            c49757uua.AEQbTJ("funding_fee_collecting", str);
            return;
        }
        FundingRateData fundingRateData3 = c49757uua.gEmmrt;
        java.lang.String str2 = Intrinsics.EZpvd((java.lang.Object) (fundingRateData3 != null ? fundingRateData3.getMethod() : null), (java.lang.Object) "current_period") ? "funding_fee_current_period" : "funding_fee_cross_period";
        FundingRateData fundingRateData4 = c49757uua.gEmmrt;
        if (fundingRateData4 != null && (method = fundingRateData4.getMethod()) != null) {
            str = method;
        }
        c49757uua.AEQbTJ(str2, str);
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("PlaceOrder_Top_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.uui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49757uua.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            str2 = lowerCase == null ? "" : lowerCase;
        }
        EventParamsList.put$default(eventParamsList, "biz_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "fundingfee_countdown", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        if (DbNXlk()) {
            this.AuCTel = true;
            this.valueOf.djBIcL.setVisibility(8);
            this.valueOf.gEmmrt.KWHzl(true);
            this.valueOf.EZpvd.KWHzl(true);
            android.widget.TextView textView = this.valueOf.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            this.valueOf.KWHzl.KWHzl(false);
            this.valueOf.copydefault.KWHzl(false);
            return;
        }
        this.valueOf.djBIcL.setVisibility(8);
        this.valueOf.gEmmrt.KWHzl(true);
        this.valueOf.EZpvd.KWHzl(true);
        android.widget.TextView textView2 = this.valueOf.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        this.valueOf.AhwBna.EZpvd(false);
        this.valueOf.copydefault.KWHzl(true);
        KWHzl(false);
    }

    private final boolean DbNXlk() {
        xOU xouWlaJM;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C49955uyM.copydefault(context) instanceof InterfaceC49514upw) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "arbitrage")) {
                return true;
            }
        }
        return false;
    }

    public final boolean gEmmrt() {
        xOU xouWlaJM;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C49955uyM.copydefault(context) instanceof InterfaceC49514upw) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "smart_arbitrage")) {
                return true;
            }
        }
        return false;
    }

    public final void KWHzl(boolean z) {
        this.AuCTel = z;
        pUU.KWHzl("unifiedDepth_Ticker_s", "showFundRateView   " + z);
        boolean z2 = z ^ true;
        this.valueOf.KWHzl.KWHzl(z2);
        this.valueOf.copydefault.KWHzl(z2);
        if (z) {
            this.valueOf.AEQbTJ.setText(getContext().getString(C55688xof.Application.MediaBrowserCompatSubscription));
        } else {
            this.valueOf.AEQbTJ.setText(getContext().getString(C55688xof.Application.dzkkkq));
        }
    }

    @Override // o.InterfaceC49582urK
    public void KWHzl() {
        InterfaceC49575urD interfaceC49575urD;
        LiveData<OfflinePlan> liveDataKWHzl;
        InterfaceC49575urD interfaceC49575urD2;
        LiveData<AbstractC49464uoz.Activity> liveDataAEQbTJ;
        InterfaceC49575urD interfaceC49575urD3;
        LiveData<AbstractC49419uoG.ActionBar> liveDataEZpvd;
        InterfaceC49575urD interfaceC49575urD4;
        LiveData<xMJ.TaskDescription> liveDataCopydefault;
        InterfaceC49575urD interfaceC49575urD5;
        LiveData<xMJ.StateListAnimator> liveDataOLrzqt;
        BizInstrument bizInstrumentCopydefault = copydefault();
        pUU.KWHzl("unifiedDepth_Ticker_s", "onInvisible   " + (bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null));
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fetchVPNInfo;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        this.wlaJM = null;
        this.DbNXlk = 0L;
        this.AhwBna = 0L;
        this.getNewProxyInstance = null;
        this.uzCIH = null;
        this.hDKMBd = "";
        InterfaceC49575urD interfaceC49575urD6 = this.fJNWhG;
        if (interfaceC49575urD6 != null) {
            interfaceC49575urD6.djBIcL();
        }
        Observer<xMJ.StateListAnimator> observer = this.fIwbmz;
        if (observer != null && (interfaceC49575urD5 = this.fJNWhG) != null && (liveDataOLrzqt = interfaceC49575urD5.OLrzqt()) != null) {
            liveDataOLrzqt.removeObserver(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.ejfBZ;
        if (observer2 != null && (interfaceC49575urD4 = this.fJNWhG) != null && (liveDataCopydefault = interfaceC49575urD4.copydefault()) != null) {
            liveDataCopydefault.removeObserver(observer2);
        }
        Observer<AbstractC49419uoG.ActionBar> observer3 = this.AkhnZx;
        if (observer3 != null && (interfaceC49575urD3 = this.fJNWhG) != null && (liveDataEZpvd = interfaceC49575urD3.EZpvd()) != null) {
            liveDataEZpvd.removeObserver(observer3);
        }
        Observer<AbstractC49464uoz.Activity> observer4 = this.isConnected;
        if (observer4 != null && (interfaceC49575urD2 = this.fJNWhG) != null && (liveDataAEQbTJ = interfaceC49575urD2.AEQbTJ()) != null) {
            liveDataAEQbTJ.removeObserver(observer4);
        }
        Observer<OfflinePlan> observer5 = this.getFieldNames;
        if (observer5 != null && (interfaceC49575urD = this.fJNWhG) != null && (liveDataKWHzl = interfaceC49575urD.KWHzl()) != null) {
            liveDataKWHzl.removeObserver(observer5);
        }
        this.valueOf.AhwBna.getRoot().setOnClickListener(null);
        this.djBIcL = null;
    }

    public final void copydefault(BizInstrument bizInstrument) {
        java.lang.String instId;
        xBE xbe = new xBE();
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        xbe.EZpvd(instId);
        xbe.KWHzl(new Function1() { // from class: o.uug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49757uua.EZpvd(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbe, 0L, 1, null);
    }

    public static final Unit EZpvd(C49757uua c49757uua, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        refreshFundingRateView$default(c49757uua, list != null ? (FundingRateData) CollectionsKt___CollectionsKt.AkhnZx(list, 0) : null, null, 2, null);
        java.util.List list2 = (java.util.List) responseData.getData();
        pUU.KWHzl("unifiedDepth_Ticker_s", "http get FundingRateData " + (list2 != null ? (FundingRateData) CollectionsKt___CollectionsKt.AkhnZx(list2, 0) : null));
        pUU.KWHzl("unifiedDepth_Ticker_s", "http get ForecastFundRateTime   " + c49757uua.uzCIH);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshFundingRateView$default(C49757uua c49757uua, FundingRateData fundingRateData, AbstractC49419uoG.ActionBar actionBar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingRateData = null;
        }
        if ((i & 2) != 0) {
            actionBar = null;
        }
        c49757uua.EZpvd(fundingRateData, actionBar);
    }

    public final void EZpvd(FundingRateData fundingRateData, AbstractC49419uoG.ActionBar actionBar) {
        C55320xhi c55320xhiKWHzl;
        djBIcL();
        if (fundingRateData != null) {
            this.gEmmrt = fundingRateData;
            this.DbNXlk = C33129mqd.valueOf(fundingRateData.getFundingTime());
        }
        if (actionBar != null) {
            this.DbNXlk = C33129mqd.valueOf(actionBar.EZpvd());
            FundingRateData fundingRateData2 = this.gEmmrt;
            if (fundingRateData2 != null) {
                fundingRateData2.setSettFundingRate(actionBar.valueOf());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setSettState(actionBar.AhwBna());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setMethod(actionBar.copydefault());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setFundingTime(actionBar.EZpvd());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setFundingRate(actionBar.KWHzl());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setMinFundingRate(actionBar.AEQbTJ());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setMaxFundingRate(actionBar.OLrzqt());
            }
            if (fundingRateData2 != null) {
                fundingRateData2.setNextFundingTime(actionBar.AYXKKw());
            }
        }
        java.lang.String strAhwBna = AhwBna();
        java.lang.Long l = this.getNewProxyInstance;
        java.lang.Long l2 = this.uzCIH;
        if (l == null || l2 == null || l.longValue() >= l2.longValue()) {
            this.AhwBna = this.DbNXlk;
            FundingRateData fundingRateData3 = this.gEmmrt;
            if (fundingRateData3 != null) {
                if (!DbNXlk() && !gEmmrt()) {
                    KWHzl(fundingRateData3, strAhwBna);
                    EZpvd(fundingRateData3, strAhwBna);
                } else {
                    OLrzqt(fundingRateData3, strAhwBna);
                    AEQbTJ(fundingRateData3, strAhwBna);
                }
            }
        } else {
            this.AhwBna = l.longValue();
            this.valueOf.KWHzl.OLrzqt(AkhnZx());
            KWHzl("0", strAhwBna);
        }
        if (l != null && l.longValue() != 0 && l2 != null && l.longValue() < l2.longValue()) {
            this.AhwBna = l.longValue();
            KWHzl("0", strAhwBna);
        }
        java.lang.Long l3 = this.getNewProxyInstance;
        if (l3 != null && ((l3 == null || l3.longValue() != 0) && isConnected())) {
            FundingRateData fundingRateData4 = this.gEmmrt;
            if (C33129mqd.OLrzqt((java.lang.Object) (fundingRateData4 != null ? fundingRateData4.getQuickState() : null), (java.lang.Object) 0)) {
                this.AhwBna = this.DbNXlk;
                C55312xha c55312xhaValueOf = this.valueOf.AhwBna.valueOf.valueOf();
                if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                    c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterKt));
                }
                this.AYXKKw = xMR.formatPercent$default(xMR.copydefault, "0", 0, null, 4, null);
            }
        }
        pUU.KWHzl("unifiedDepth_Ticker_s", "refreshFundingRateView FundingRateData " + this.gEmmrt);
    }

    @Override // o.InterfaceC49582urK
    public void EZpvd() {
        C54782xVc c54782xVc = C54782xVc.AEQbTJ;
        c54782xVc.KWHzl().setValue(c54782xVc.KWHzl().getValue());
        c54782xVc.copydefault().setValue(c54782xVc.copydefault().getValue());
        c54782xVc.AEQbTJ().setValue(c54782xVc.AEQbTJ().getValue());
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault;
        java.lang.String fundingRate;
        java.lang.String str3;
        java.lang.String fundingTime;
        java.lang.String timeInterval;
        FundingRateData fundingRateData = this.gEmmrt;
        java.lang.String str4 = (fundingRateData == null || (timeInterval = fundingRateData.getTimeInterval()) == null) ? "" : timeInterval;
        java.lang.String strEZpvd = pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C49720utq.StateListAnimator.copydefault, C33129mqd.AhwBna(str4), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str4, null, 1, null))));
        FundingRateData fundingRateData2 = this.gEmmrt;
        if (C33129mqd.OLrzqt((java.lang.Object) (fundingRateData2 != null ? fundingRateData2.getQuickState() : null), (java.lang.Object) 1)) {
            FundingRateData fundingRateData3 = this.gEmmrt;
            if (fundingRateData3 == null || (fundingTime = fundingRateData3.getFundingTime()) == null || (str3 = pTA.format$default(new Date(C33129mqd.valueOf(fundingTime)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null)) == null) {
                str3 = "";
            }
            strCopydefault = C33069mpW.copydefault(C49720utq.Activity.uzCIH, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str3)));
        } else {
            strCopydefault = C33069mpW.copydefault(C49720utq.Activity.AEQbTJ, C56423yEv.EZpvd(C56390yDp.OLrzqt("numHour", strEZpvd))) + "\n\n" + C33070mpX.AYXKKw(C49720utq.Activity.djBIcL) + "\n\n" + C33070mpX.AYXKKw(C49720utq.Activity.KWHzl);
        }
        java.lang.String str5 = strCopydefault;
        java.lang.String str6 = (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "funding_fee_cross_period") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "funding_fee_current_period")) ? this.KWHzl : "";
        java.lang.String str7 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "funding_fee_off_line") ? this.hDKMBd : "";
        androidx.fragment.app.FragmentManager fragmentManager = this.values;
        if (fragmentManager != null) {
            java.lang.String str8 = this.AYXKKw;
            FundingRateData fundingRateData4 = this.gEmmrt;
            FundingFeeDetailItem fundingFeeDetailItem = new FundingFeeDetailItem(str8, fundingRateData4 != null ? fundingRateData4.getFundingRate() : null, "", str6, str5, str7, str, java.lang.Integer.valueOf(C33129mqd.AhwBna(AhwBna())));
            InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
            FundingRateData fundingRateData5 = this.gEmmrt;
            this.djBIcL = interfaceC49497upf.KWHzl(fragmentManager, str, fundingFeeDetailItem, str4, (fundingRateData5 == null || (fundingRate = fundingRateData5.getFundingRate()) == null) ? "" : fundingRate, this.AhwBna);
        }
    }

    public final void setManualFundingRate() {
        C55320xhi c55320xhiKWHzl;
        FundingRateData fundingRateData = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) (fundingRateData != null ? fundingRateData.getSettState() : null), (java.lang.Object) "processing")) {
            this.valueOf.AhwBna.KWHzl.setText(this.AEQbTJ);
            C55312xha c55312xhaValueOf = this.valueOf.AhwBna.valueOf.valueOf();
            if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
                return;
            }
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.isNavigationVisible));
            return;
        }
        this.valueOf.AhwBna.KWHzl.setText(this.AYXKKw + " / " + xMN.KWHzl(this.AhwBna - java.lang.System.currentTimeMillis()));
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String strOLrzqt;
        if (!DbNXlk() && !gEmmrt()) {
            strOLrzqt = xMR.formatPercent$default(xMR.copydefault, str, (str2 == null || str2.length() == 0) ? 5 : C33129mqd.AhwBna(str2), 0, null, 8, null);
        } else {
            strOLrzqt = xVD.KWHzl.OLrzqt(str, str2);
        }
        this.AYXKKw = strOLrzqt;
        this.valueOf.copydefault.OLrzqt.setText(strOLrzqt);
    }

    public final void KWHzl(FundingRateData fundingRateData, java.lang.String str) {
        java.lang.String str2;
        C55320xhi c55320xhiKWHzl;
        FundingRateData fundingRateData2 = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) (fundingRateData2 != null ? fundingRateData2.getSettState() : null), (java.lang.Object) "processing")) {
            str2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.isNavigationVisible);
        } else {
            str2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsCreateDocument);
        }
        C55312xha c55312xhaValueOf = this.valueOf.AhwBna.valueOf.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(str2);
        }
        xVD xvd = xVD.KWHzl;
        this.AEQbTJ = xvd.OLrzqt(fundingRateData.getFundingRate(), str) + " / " + xvd.OLrzqt(fundingRateData.getSettFundingRate(), str);
        this.copydefault = xvd.OLrzqt(fundingRateData.getSettFundingRate(), str);
    }

    public final void OLrzqt(FundingRateData fundingRateData, java.lang.String str) {
        java.lang.String str2;
        C55320xhi c55320xhiKWHzl;
        int iAhwBna = (str == null || str.length() == 0) ? 5 : C33129mqd.AhwBna(str);
        FundingRateData fundingRateData2 = this.gEmmrt;
        if (Intrinsics.EZpvd((java.lang.Object) (fundingRateData2 != null ? fundingRateData2.getSettState() : null), (java.lang.Object) "processing")) {
            str2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.isNavigationVisible);
        } else {
            str2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContracts) + " / " + C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsCreateDocument);
        }
        C55312xha c55312xhaValueOf = this.valueOf.AhwBna.valueOf.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(str2);
        }
        xMR xmr = xMR.copydefault;
        int i = iAhwBna;
        this.AEQbTJ = xMR.formatPercent$default(xmr, fundingRateData.getFundingRate(), i, 0, null, 8, null) + " / " + xMR.formatPercent$default(xmr, fundingRateData.getSettFundingRate(), i, 0, null, 8, null);
        this.copydefault = java.lang.String.valueOf(xMR.formatPercent$default(xmr, fundingRateData.getSettFundingRate(), i, 0, null, 8, null));
    }

    public final void EZpvd(FundingRateData fundingRateData, java.lang.String str) {
        xVD xvd = xVD.KWHzl;
        this.AYXKKw = xvd.OLrzqt(fundingRateData.getFundingRate(), str);
        this.KWHzl = xvd.copydefault(fundingRateData.getMaxFundingRate(), str) + " / " + xvd.copydefault(fundingRateData.getMinFundingRate(), str);
        this.valueOf.KWHzl.OLrzqt(values());
        this.valueOf.copydefault.OLrzqt.setText(this.AYXKKw);
    }

    public final void AEQbTJ(FundingRateData fundingRateData, java.lang.String str) {
        int iAhwBna = (str == null || str.length() == 0) ? 5 : C33129mqd.AhwBna(str);
        xMR xmr = xMR.copydefault;
        int i = iAhwBna;
        this.AYXKKw = xMR.formatPercent$default(xmr, fundingRateData.getFundingRate(), i, 0, null, 8, null);
        this.KWHzl = xMR.formatPercent$default(xmr, fundingRateData.getMaxFundingRate(), i, 0, null, 8, null) + " / " + xMR.formatPercent$default(xmr, fundingRateData.getMinFundingRate(), i, 0, null, 8, null);
        this.valueOf.KWHzl.OLrzqt(values());
        this.valueOf.copydefault.OLrzqt.setText(this.AYXKKw);
    }
}
