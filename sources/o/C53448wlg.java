package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelStoreOwner;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.TwapModifyBean;
import com.okinc.unify_trade.manager.MarginModeManager;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C49861uwY;
import o.C55688xof;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53448wlg extends ConstraintLayout implements InterfaceC49943uyA {
    public InterfaceC58217yxC AEQbTJ;
    public C55887xsS AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public Function0<? extends AbstractC49896uxG> DbNXlk;
    public final AbstractC50999vej EZpvd;
    public final java.lang.String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public StrategyConfigInfo copydefault;
    public final Function2<C47988uAv, java.lang.String, Unit> djBIcL;
    public Function2<? super C47988uAv, ? super java.lang.Float, Unit> fetchVPNInfo;
    public Function1<? super java.lang.Boolean, Unit> gEmmrt;
    public Function1<? super StrategyConfigInfo, Unit> valueOf;

    /* JADX INFO: renamed from: o.wlg$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY_OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL_CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53448wlg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53448wlg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC49943uyA
    public java.lang.String OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function0<? extends o.uxG>, kotlin.jvm.functions.Function0<o.uxG> */
    public final Function0<AbstractC49896uxG> djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super o.uAv, ? super java.lang.Float, kotlin.Unit>, kotlin.jvm.functions.Function2<o.uAv, java.lang.Float, kotlin.Unit> */
    public Function2<C47988uAv, java.lang.Float, Unit> fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstManager(C55887xsS c55887xsS) {
        this.AYXKKw = c55887xsS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadConfigCallback(@NotNull Function1<? super StrategyConfigInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginModelViewModel(Function0<? extends AbstractC49896uxG> function0) {
        this.DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnAmtPercentCallback(Function2<? super C47988uAv, ? super java.lang.Float, Unit> function2) {
        this.fetchVPNInfo = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:67) call: o.wlg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53448wlg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53448wlg(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "unified_" + C53448wlg.class.getSimpleName();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.zEkrwr, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50999vej abstractC50999vej = (AbstractC50999vej) viewDataBindingInflate;
        this.EZpvd = abstractC50999vej;
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.wlm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53448wlg.EZpvd(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.djBIcL = function2;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53448wlg.AEQbTJ(context);
            }
        });
        abstractC50999vej.DbNXlk.setOnTextChangeCallback(function2);
        abstractC50999vej.DbNXlk.setInputUnit(context.getString(C55688xof.Application.XmlRes));
        C49917uxb c49917uxb = abstractC50999vej.gEmmrt;
        c49917uxb.setCallback(new Function1() { // from class: o.wlk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53448wlg.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        });
        c49917uxb.setCurrentType("price_from", false);
        fJNWhG();
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wlo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53448wlg.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final Unit EZpvd(C53448wlg c53448wlg, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c53448wlg.EZpvd.AEQbTJ)) {
            c53448wlg.copydefault(false);
        } else if (Intrinsics.EZpvd(c47988uAv, c53448wlg.EZpvd.OLrzqt)) {
            c53448wlg.AEQbTJ(false);
        } else if (Intrinsics.EZpvd(c47988uAv, c53448wlg.EZpvd.DbNXlk)) {
            c53448wlg.OLrzqt(false);
        } else if (Intrinsics.EZpvd(c47988uAv, c53448wlg.EZpvd.AYXKKw)) {
            c53448wlg.EZpvd(false);
        } else if (Intrinsics.EZpvd(c47988uAv, c53448wlg.EZpvd.fetchVPNInfo)) {
            c53448wlg.KWHzl(false);
            if (c53448wlg.EZpvd.fetchVPNInfo.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(c53448wlg.EZpvd.fetchVPNInfo, false, 1, null);
            }
        }
        Function1<? super java.lang.Boolean, Unit> function1 = c53448wlg.gEmmrt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(c53448wlg.EZpvd()));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(ViewModelStoreOwner viewModelStoreOwner, @NotNull TradeType tradeType, @NotNull Function0<Unit> function0) {
        BizInstrument bizInstrumentAhwBna;
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        this.EZpvd.KWHzl.setFm(hDKMBd());
        uBL ubl = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility(bizInstrumentAhwBna.isDisplayTradeReceive() ? 0 : 8);
        this.EZpvd.KWHzl.copydefault(viewModelStoreOwner, bizInstrumentAhwBna, tradeType, true);
        this.EZpvd.KWHzl.setTradeQuoteCcyChange(function0);
    }

    public final void EZpvd(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        uBP ubpCopydefault = this.EZpvd.KWHzl.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.EZpvd(onPropertyChangedCallback);
        }
    }

    public final void AEQbTJ(@NotNull Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        Intrinsics.checkNotNullParameter(onPropertyChangedCallback, "");
        uBP ubpCopydefault = this.EZpvd.KWHzl.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.copydefault(onPropertyChangedCallback);
        }
    }

    public final java.lang.String fARcdN() {
        return this.EZpvd.KWHzl.OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.FragmentManager AEQbTJ(android.content.Context context) {
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            return appCompatActivityCopydefault.getSupportFragmentManager();
        }
        return null;
    }

    private final androidx.fragment.app.FragmentManager hDKMBd() {
        return (androidx.fragment.app.FragmentManager) this.OLrzqt.getValue();
    }

    public static final Unit OLrzqt(C53448wlg c53448wlg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53448wlg.AhwBna(true);
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        this.EZpvd.EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.getController));
        this.EZpvd.AhwBna.setText(C33070mpX.AYXKKw(C55688xof.Application.getMediaSession));
        this.EZpvd.valueOf.setText(C33070mpX.AYXKKw(C55688xof.Application.fromMediaSession));
    }

    public final void setFragmentManager(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd.gEmmrt.setFm(fragmentManager);
    }

    public static /* synthetic */ void updateUi$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53448wlg.djBIcL(z);
    }

    public final void djBIcL(boolean z) {
        AhwBna(false);
        AuCTel();
        fIwbmz();
        ejfBZ();
        uzCIH();
        if (z) {
            C47988uAv.setInputContent$default(this.EZpvd.AEQbTJ, "", false, false, 6, null);
            C47988uAv.setInputContent$default(this.EZpvd.OLrzqt, "", false, false, 6, null);
            C47988uAv.setInputContent$default(this.EZpvd.AYXKKw, "", false, false, 6, null);
            C47988uAv.setInputContent$default(this.EZpvd.fetchVPNInfo, "", false, false, 6, null);
            this.EZpvd.fetchVPNInfo.setInputCover("");
            this.EZpvd.AEQbTJ.copydefault();
            this.EZpvd.OLrzqt.copydefault();
            this.EZpvd.AYXKKw.copydefault();
            this.EZpvd.fetchVPNInfo.copydefault();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getNewProxyInstance() {
        int i;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        TradeType tradeType;
        xOW newProxyInstance;
        AbstractC54531xLw abstractC54531xLwAEQbTJ;
        if (!C55697xoo.OLrzqt.isConnected()) {
            this.EZpvd.copydefault.setVisibility(8);
            this.EZpvd.djBIcL.setVisibility(8);
            return;
        }
        this.EZpvd.copydefault.setVisibility(0);
        this.EZpvd.copydefault.setFooterAvaValue("");
        C55887xsS c55887xsS = this.AYXKKw;
        java.lang.String strAuCTelauCTel = null;
        java.lang.String strDjBIcL = c55887xsS != null ? c55887xsS.djBIcL() : null;
        if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "MARGIN")) {
            this.EZpvd.djBIcL.setVisibility(0);
            this.EZpvd.djBIcL.setFooterAvaValue("");
        } else {
            this.EZpvd.djBIcL.setVisibility(8);
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null || (abstractC54531xLwAEQbTJ = c55887xsS2.AEQbTJ()) == null || abstractC54531xLwAEQbTJ.getFieldNames()) {
            C55887xsS c55887xsS3 = this.AYXKKw;
            java.lang.String strDjBIcL2 = c55887xsS3 != null ? c55887xsS3.djBIcL() : null;
            if (strDjBIcL2 != null) {
                switch (strDjBIcL2.hashCode()) {
                    case -2027980370:
                        if (!strDjBIcL2.equals("MARGIN")) {
                        }
                        TradeType tradeType2 = C49861uwY.Companion.copydefault().get();
                        i = tradeType2 != null ? -1 : TaskDescription.copydefault[tradeType2.ordinal()];
                        if (i != 1) {
                            C53539wnR.setFooterAvaTitle$default(this.EZpvd.djBIcL, C33070mpX.AYXKKw(C55688xof.Application.dispatchResult), false, null, 6, null);
                            break;
                        } else if (i == 2) {
                            C53539wnR.setFooterAvaTitle$default(this.EZpvd.djBIcL, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryCallbackAndContract), false, null, 6, null);
                            break;
                        }
                        break;
                    case 2552066:
                        if (!strDjBIcL2.equals("SPOT")) {
                        }
                        TradeType tradeType22 = C49861uwY.Companion.copydefault().get();
                        if (tradeType22 != null) {
                        }
                        if (i != 1) {
                        }
                        break;
                    case 2558355:
                        if (!strDjBIcL2.equals("SWAP")) {
                        }
                        interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                            strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode") && (tradeType = C49861uwY.Companion.copydefault().get()) != null && TaskDescription.copydefault[tradeType.ordinal()] == 2) {
                            this.EZpvd.copydefault.setVisibility(8);
                            break;
                        }
                        break;
                    case 214415088:
                        if (!strDjBIcL2.equals("FUTURES")) {
                        }
                        interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt != null) {
                            strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
                        }
                        if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "long_short_mode")) {
                        }
                        break;
                }
            }
        }
    }

    public static /* synthetic */ void initPriceWithDepth$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c53448wlg.AhwBna(z);
    }

    public final void AhwBna(boolean z) {
        DigitInfoBean digitInfoBeanIsConnected;
        Objects.toString(this.copydefault);
        if (z) {
            C47988uAv.setInputContent$default(this.EZpvd.AEQbTJ, "", false, false, 6, null);
            this.EZpvd.AEQbTJ.copydefault();
        }
        java.lang.String strCopydefault = this.EZpvd.gEmmrt.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "price_from")) {
            C55887xsS c55887xsS = this.AYXKKw;
            if (c55887xsS != null && (digitInfoBeanIsConnected = c55887xsS.isConnected()) != null) {
                this.EZpvd.AEQbTJ.setInputUnit(digitInfoBeanIsConnected.getSymbol());
                this.EZpvd.AEQbTJ.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
                this.EZpvd.AEQbTJ.setInputHint("");
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "ratio")) {
            this.EZpvd.AEQbTJ.setInputUnit("");
            C47988uAv c47988uAv = this.EZpvd.AEQbTJ;
            StrategyConfigInfo strategyConfigInfo = this.copydefault;
            c47988uAv.setMaxDecimal(C54803xVx.EZpvd(C33129mqd.mulS$default(strategyConfigInfo != null ? strategyConfigInfo.getPxPercentageMin() : null, 100, null, null, null, 14, null), 2));
            StrategyConfigInfo strategyConfigInfo2 = this.copydefault;
            if (strategyConfigInfo2 != null) {
                C47988uAv c47988uAv2 = this.EZpvd.AEQbTJ;
                android.content.Context context = getContext();
                c47988uAv2.setInputHint(context != null ? C33069mpW.KWHzl(context, C55688xof.Application.HJWChPRGtXKC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("timeInterval", xMR.formatPercent$default(xMR.copydefault, strategyConfigInfo2.getPxPercentageRec(), 2, 1, null, 8, null)))) : null);
            }
        }
        this.EZpvd.AEQbTJ.setOnTextChangeCallback(this.djBIcL);
        this.EZpvd.OLrzqt.setOnTextChangeCallback(this.djBIcL);
    }

    public final void AuCTel() {
        DigitInfoBean digitInfoBeanEZpvd;
        DigitInfoBean digitInfoBeanIsConnected;
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS != null && (digitInfoBeanIsConnected = c55887xsS.isConnected()) != null) {
            this.EZpvd.OLrzqt.setInputUnit(digitInfoBeanIsConnected.getSymbol());
            this.EZpvd.OLrzqt.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null || (digitInfoBeanEZpvd = c55887xsS2.EZpvd()) == null) {
            return;
        }
        this.EZpvd.AYXKKw.setInputUnit(digitInfoBeanEZpvd.getSymbol());
        this.EZpvd.AYXKKw.setMaxDecimal(digitInfoBeanEZpvd.getDigit());
        this.EZpvd.fetchVPNInfo.setInputUnit(digitInfoBeanEZpvd.getSymbol());
        this.EZpvd.fetchVPNInfo.setMaxDecimal(digitInfoBeanEZpvd.getDigit());
    }

    public final void fIwbmz() {
        this.EZpvd.DbNXlk.setMaxDecimal(0);
    }

    public final void ejfBZ() {
        final C47988uAv c47988uAv = this.EZpvd.fetchVPNInfo;
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wlj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53448wlg.OLrzqt(this.KWHzl, c47988uAv, ((java.lang.Float) obj).floatValue());
            }
        });
        this.EZpvd.AYXKKw.setOnTextChangeCallback(this.djBIcL);
        this.EZpvd.fetchVPNInfo.setOnTextChangeCallback(this.djBIcL);
    }

    public static final Unit OLrzqt(C53448wlg c53448wlg, C47988uAv c47988uAv, float f) {
        c53448wlg.EZpvd("BotPlaceOrder_Btm_InvestmentAmount_Drag", "bot_type", "twap");
        if (!c47988uAv.zLjUOn()) {
            c47988uAv.setInputCover("");
            C47988uAv.setInputContent$default(c47988uAv, "", false, true, 2, null);
            Function2<C47988uAv, java.lang.Float, Unit> function2FetchVPNInfo = c53448wlg.fetchVPNInfo();
            if (function2FetchVPNInfo != null) {
                Intrinsics.copydefault(c47988uAv);
                function2FetchVPNInfo.invoke(c47988uAv, null);
            }
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
            C55887xsS c55887xsS = c53448wlg.AYXKKw;
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsS != null ? c55887xsS.djBIcL() : null)) {
                java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, C33129mqd.gEmmrt(java.lang.Float.valueOf(c47988uAv.fJNWhG())), 0, null, 4, null);
                C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
                c47988uAv.setInputCover(percent$default);
            }
            Function2<C47988uAv, java.lang.Float, Unit> function2FetchVPNInfo2 = c53448wlg.fetchVPNInfo();
            if (function2FetchVPNInfo2 != null) {
                Intrinsics.copydefault(c47988uAv);
                function2FetchVPNInfo2.invoke(c47988uAv, java.lang.Float.valueOf(c47988uAv.fJNWhG()));
            }
            checkTotalAmtIsValid$default(c53448wlg, false, 1, null);
            c47988uAv.setOnTextChangeCallback(c53448wlg.djBIcL);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setCurrentType$default(C53448wlg c53448wlg, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "price_from";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c53448wlg.setCurrentType(str, z);
    }

    public final void setCurrentType(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.gEmmrt.setCurrentType(str, z);
    }

    public final void gEmmrt(boolean z) {
        this.EZpvd.gEmmrt.AEQbTJ(z);
    }

    public boolean iwGUEr() {
        return this.EZpvd.fetchVPNInfo.zLjUOn();
    }

    public java.lang.Float valueOf() {
        return java.lang.Float.valueOf(this.EZpvd.fetchVPNInfo.fJNWhG());
    }

    @Override // o.InterfaceC49943uyA
    public void KWHzl() {
        if (this.EZpvd.fetchVPNInfo.zLjUOn()) {
            C47988uAv c47988uAv = this.EZpvd.fetchVPNInfo;
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
            c47988uAv.setInputCover("");
        }
        C47988uAv.clearSeekBarData$default(this.EZpvd.fetchVPNInfo, false, 1, null);
    }

    public void setAmtPercentContent(@NotNull C47988uAv c47988uAv, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (c47988uAv.zLjUOn()) {
            if (!z) {
                c47988uAv.setOnTextChangeCallback(null);
            }
            c47988uAv.setInputCover("");
            C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
            if (z) {
                return;
            }
            c47988uAv.setOnTextChangeCallback(this.djBIcL);
        }
    }

    public static /* synthetic */ boolean checkPriceWithDepthIsValid$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c53448wlg.copydefault(z);
    }

    public final boolean copydefault(boolean z) {
        java.lang.String pxPercentageMax;
        java.lang.String pxPercentageMin;
        java.lang.String strCopydefault = this.EZpvd.gEmmrt.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "price_from")) {
            C47988uAv c47988uAv = this.EZpvd.AEQbTJ;
            c47988uAv.setInputErrorMsg(OLrzqt(c47988uAv.AkhnZx()));
            if (this.EZpvd.AEQbTJ.getFieldNames()) {
                return false;
            }
            if (this.copydefault == null) {
                this.EZpvd.AEQbTJ.copydefault();
                return true;
            }
            java.lang.String strAkhnZx = this.EZpvd.AEQbTJ.AkhnZx();
            if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
                if (!z) {
                    this.EZpvd.AEQbTJ.copydefault();
                    return true;
                }
                C47988uAv c47988uAv2 = this.EZpvd.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c47988uAv2.setInputErrorMsg(C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.EZpvd.AEQbTJ.values()))));
                return false;
            }
            if (C33129mqd.OLrzqt(strAkhnZx, "0")) {
                C47988uAv c47988uAv3 = this.EZpvd.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c47988uAv3.setInputErrorMsg(C33069mpW.KWHzl(context2, C55688xof.Application.getGmsPickeractivity_release, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", this.EZpvd.AEQbTJ.values()), C56390yDp.OLrzqt("fieldName2", xMR.copydefault.copydefault("0")))));
                return false;
            }
            this.EZpvd.AEQbTJ.copydefault();
            return true;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "ratio")) {
            this.EZpvd.AEQbTJ.copydefault();
            return true;
        }
        if (this.copydefault == null) {
            this.EZpvd.AEQbTJ.copydefault();
            return true;
        }
        java.lang.String strAkhnZx2 = this.EZpvd.AEQbTJ.AkhnZx();
        if (strAkhnZx2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx2)) {
            if (!z) {
                this.EZpvd.AEQbTJ.copydefault();
                return true;
            }
            C47988uAv c47988uAv4 = this.EZpvd.AEQbTJ;
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c47988uAv4.setInputErrorMsg(C33069mpW.KWHzl(context3, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.EZpvd.AEQbTJ.values()))));
            return false;
        }
        StrategyConfigInfo strategyConfigInfo = this.copydefault;
        if (!C33129mqd.gEmmrt(strAkhnZx2, C33129mqd.mulS$default(strategyConfigInfo != null ? strategyConfigInfo.getPxPercentageMin() : null, 100, null, null, null, 14, null))) {
            StrategyConfigInfo strategyConfigInfo2 = this.copydefault;
            if (!C33129mqd.AEQbTJ(strAkhnZx2, C33129mqd.mulS$default(strategyConfigInfo2 != null ? strategyConfigInfo2.getPxPercentageMax() : null, 100, null, null, null, 14, null))) {
                this.EZpvd.AEQbTJ.copydefault();
                return true;
            }
        }
        C47988uAv c47988uAv5 = this.EZpvd.AEQbTJ;
        int i = C55688xof.Application.getAudioStream;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        xMR xmr = xMR.copydefault;
        StrategyConfigInfo strategyConfigInfo3 = this.copydefault;
        java.lang.String str = (strategyConfigInfo3 == null || (pxPercentageMin = strategyConfigInfo3.getPxPercentageMin()) == null) ? "" : pxPercentageMin;
        RoundingMode roundingMode = RoundingMode.DOWN;
        pairArr[0] = C56390yDp.OLrzqt("min", xMR.formatPercent$default(xmr, str, 0, roundingMode, 2, null));
        StrategyConfigInfo strategyConfigInfo4 = this.copydefault;
        pairArr[1] = C56390yDp.OLrzqt("max", xMR.formatPercent$default(xmr, (strategyConfigInfo4 == null || (pxPercentageMax = strategyConfigInfo4.getPxPercentageMax()) == null) ? "" : pxPercentageMax, 0, roundingMode, 2, null));
        c47988uAv5.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        return false;
    }

    public static /* synthetic */ boolean checkLimitPriceIsValid$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c53448wlg.AEQbTJ(z);
    }

    public final boolean AEQbTJ(boolean z) {
        C47988uAv c47988uAv = this.EZpvd.OLrzqt;
        c47988uAv.setInputErrorMsg(OLrzqt(c47988uAv.AkhnZx()));
        if (this.EZpvd.OLrzqt.getFieldNames()) {
            return false;
        }
        if (c47988uAv.AkhnZx().length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            if (!z) {
                c47988uAv.copydefault();
                return true;
            }
            android.content.Context context = c47988uAv.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c47988uAv.setInputErrorMsg(C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", c47988uAv.values()))));
            return false;
        }
        if (C33129mqd.OLrzqt(c47988uAv.AkhnZx(), "0")) {
            android.content.Context context2 = c47988uAv.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c47988uAv.setInputErrorMsg(C33069mpW.KWHzl(context2, C55688xof.Application.getGmsPickeractivity_release, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", c47988uAv.values()), C56390yDp.OLrzqt("fieldName2", xMR.copydefault.copydefault("0")))));
            return false;
        }
        c47988uAv.copydefault();
        return true;
    }

    public static /* synthetic */ boolean checkSingleAmtIsValid$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c53448wlg.EZpvd(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(boolean z) {
        java.lang.String strDjBIcL;
        java.lang.String strValueOf;
        java.lang.String strDjBIcL2;
        java.lang.String strValueOf2;
        java.lang.String safeString$default;
        java.lang.String strDjBIcL3;
        java.lang.String strValueOf3;
        java.lang.String amountMax;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default2;
        java.lang.String amountMin;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo2;
        if (this.copydefault == null) {
            this.EZpvd.AYXKKw.copydefault();
            return true;
        }
        java.lang.String strAkhnZx = this.EZpvd.AYXKKw.AkhnZx();
        java.lang.String str = "";
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (!z) {
                this.EZpvd.AYXKKw.copydefault();
                return true;
            }
            C47988uAv c47988uAv = this.EZpvd.AYXKKw;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c47988uAv.setInputErrorMsg(C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.EZpvd.AYXKKw.values()))));
            return false;
        }
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS == null || (strDjBIcL = c55887xsS.djBIcL()) == null) {
            strDjBIcL = "";
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null || (strValueOf = c55887xsS2.valueOf()) == null) {
            strValueOf = "";
        }
        C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strDjBIcL, strValueOf, null, 4, null);
        java.lang.String strKWHzl = c54571xNhCreateStrategyTradeConverter$default != null ? c54571xNhCreateStrategyTradeConverter$default.KWHzl(this.EZpvd.AYXKKw.AkhnZx()) : null;
        StrategyConfigInfo strategyConfigInfo = this.copydefault;
        if (!C33129mqd.gEmmrt(strKWHzl, strategyConfigInfo != null ? strategyConfigInfo.getAmountMin() : null)) {
            StrategyConfigInfo strategyConfigInfo2 = this.copydefault;
            if (!C33129mqd.AEQbTJ(strKWHzl, strategyConfigInfo2 != null ? strategyConfigInfo2.getAmountMax() : null)) {
                this.EZpvd.AYXKKw.copydefault();
                return true;
            }
        }
        C55887xsS c55887xsS3 = this.AYXKKw;
        if (c55887xsS3 == null || (strDjBIcL2 = c55887xsS3.djBIcL()) == null) {
            strDjBIcL2 = "";
        }
        C55887xsS c55887xsS4 = this.AYXKKw;
        if (c55887xsS4 == null || (strValueOf2 = c55887xsS4.valueOf()) == null) {
            strValueOf2 = "";
        }
        C54571xNh c54571xNhCreateStrategyTradeConverter$default2 = C54566xNc.createStrategyTradeConverter$default(strDjBIcL2, strValueOf2, null, 4, null);
        if (c54571xNhCreateStrategyTradeConverter$default2 == null) {
            safeString$default = "";
        } else {
            StrategyConfigInfo strategyConfigInfo3 = this.copydefault;
            if (strategyConfigInfo3 == null || (amountMin = strategyConfigInfo3.getAmountMin()) == null) {
                amountMin = "";
            }
            C54536xML c54536xMLDjBIcL3 = c54571xNhCreateStrategyTradeConverter$default2.djBIcL(amountMin);
            if (c54536xMLDjBIcL3 == null || (c54536xMLCopydefault2 = c54536xMLDjBIcL3.copydefault()) == null || (c54536xMLDjBIcL2 = c54536xMLCopydefault2.djBIcL()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, null)) == null) {
            }
        }
        C55887xsS c55887xsS5 = this.AYXKKw;
        if (c55887xsS5 == null || (strDjBIcL3 = c55887xsS5.djBIcL()) == null) {
            strDjBIcL3 = "";
        }
        C55887xsS c55887xsS6 = this.AYXKKw;
        if (c55887xsS6 == null || (strValueOf3 = c55887xsS6.valueOf()) == null) {
            strValueOf3 = "";
        }
        C54571xNh c54571xNhCreateStrategyTradeConverter$default3 = C54566xNc.createStrategyTradeConverter$default(strDjBIcL3, strValueOf3, null, 4, null);
        if (c54571xNhCreateStrategyTradeConverter$default3 != null) {
            StrategyConfigInfo strategyConfigInfo4 = this.copydefault;
            if (strategyConfigInfo4 == null || (amountMax = strategyConfigInfo4.getAmountMax()) == null) {
                amountMax = "";
            }
            C54536xML c54536xMLDjBIcL4 = c54571xNhCreateStrategyTradeConverter$default3.djBIcL(amountMax);
            if (c54536xMLDjBIcL4 != null && (c54536xMLCopydefault = c54536xMLDjBIcL4.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                str = safeString$default2;
            }
        }
        this.EZpvd.AYXKKw.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.MediaSessionCompatApi22, C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", safeString$default), C56390yDp.OLrzqt("max", str))));
        return false;
    }

    public static /* synthetic */ boolean checkTotalAmtIsValid$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c53448wlg.KWHzl(z);
    }

    public final boolean KWHzl(boolean z) {
        java.lang.String strDjBIcL;
        java.lang.String strValueOf;
        java.lang.String strDjBIcL2;
        java.lang.String strValueOf2;
        java.lang.String szMin;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        if (this.copydefault == null) {
            this.EZpvd.fetchVPNInfo.copydefault();
            return true;
        }
        if (this.EZpvd.fetchVPNInfo.zLjUOn()) {
            java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
            C55887xsS c55887xsS = this.AYXKKw;
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsS != null ? c55887xsS.djBIcL() : null)) {
                this.EZpvd.fetchVPNInfo.copydefault();
                return true;
            }
        }
        java.lang.String strAkhnZx = this.EZpvd.fetchVPNInfo.AkhnZx();
        java.lang.String str = "";
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (!z) {
                this.EZpvd.fetchVPNInfo.copydefault();
                return true;
            }
            C47988uAv c47988uAv = this.EZpvd.fetchVPNInfo;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c47988uAv.setInputErrorMsg(C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.EZpvd.fetchVPNInfo.values()))));
            return false;
        }
        C55887xsS c55887xsS2 = this.AYXKKw;
        if (c55887xsS2 == null || (strDjBIcL = c55887xsS2.djBIcL()) == null) {
            strDjBIcL = "";
        }
        C55887xsS c55887xsS3 = this.AYXKKw;
        if (c55887xsS3 == null || (strValueOf = c55887xsS3.valueOf()) == null) {
            strValueOf = "";
        }
        C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strDjBIcL, strValueOf, null, 4, null);
        java.lang.String strKWHzl = c54571xNhCreateStrategyTradeConverter$default != null ? c54571xNhCreateStrategyTradeConverter$default.KWHzl(strAkhnZx) : null;
        StrategyConfigInfo strategyConfigInfo = this.copydefault;
        if (C33129mqd.gEmmrt(strKWHzl, strategyConfigInfo != null ? strategyConfigInfo.getSzMin() : null)) {
            C55887xsS c55887xsS4 = this.AYXKKw;
            if (c55887xsS4 == null || (strDjBIcL2 = c55887xsS4.djBIcL()) == null) {
                strDjBIcL2 = "";
            }
            C55887xsS c55887xsS5 = this.AYXKKw;
            if (c55887xsS5 == null || (strValueOf2 = c55887xsS5.valueOf()) == null) {
                strValueOf2 = "";
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default2 = C54566xNc.createStrategyTradeConverter$default(strDjBIcL2, strValueOf2, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default2 != null) {
                StrategyConfigInfo strategyConfigInfo2 = this.copydefault;
                if (strategyConfigInfo2 == null || (szMin = strategyConfigInfo2.getSzMin()) == null) {
                    szMin = "";
                }
                C54536xML c54536xMLDjBIcL2 = c54571xNhCreateStrategyTradeConverter$default2.djBIcL(szMin);
                if (c54536xMLDjBIcL2 != null && (c54536xMLCopydefault = c54536xMLDjBIcL2.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                    str = safeString$default;
                }
            }
            this.EZpvd.fetchVPNInfo.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.setWindowTitle, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str))));
            return false;
        }
        if (C33129mqd.gEmmrt(strAkhnZx, this.EZpvd.AYXKKw.AkhnZx())) {
            this.EZpvd.fetchVPNInfo.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.ActionBarDisplayOptions));
            return false;
        }
        this.EZpvd.fetchVPNInfo.copydefault();
        return true;
    }

    public static /* synthetic */ boolean checkTimeIsValid$default(C53448wlg c53448wlg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c53448wlg.OLrzqt(z);
    }

    public final boolean OLrzqt(boolean z) {
        java.lang.String timeIntervalMin;
        java.lang.String timeIntervalMax;
        if (this.copydefault == null) {
            this.EZpvd.DbNXlk.copydefault();
            return true;
        }
        java.lang.String strAkhnZx = this.EZpvd.DbNXlk.AkhnZx();
        java.lang.String str = "";
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (!z) {
                this.EZpvd.DbNXlk.copydefault();
                return true;
            }
            C47988uAv c47988uAv = this.EZpvd.DbNXlk;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c47988uAv.setInputErrorMsg(C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.EZpvd.DbNXlk.values()))));
            return false;
        }
        StrategyConfigInfo strategyConfigInfo = this.copydefault;
        if (!C33129mqd.gEmmrt(strAkhnZx, strategyConfigInfo != null ? strategyConfigInfo.getTimeIntervalMin() : null)) {
            StrategyConfigInfo strategyConfigInfo2 = this.copydefault;
            if (!C33129mqd.AEQbTJ(strAkhnZx, strategyConfigInfo2 != null ? strategyConfigInfo2.getTimeIntervalMax() : null)) {
                this.EZpvd.DbNXlk.copydefault();
                return true;
            }
        }
        C47988uAv c47988uAv2 = this.EZpvd.DbNXlk;
        int i = C55688xof.Application.ActivityResultContractsPickMultipleVisualMediaExternalSyntheticApiModelOutline0;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        xMR xmr = xMR.copydefault;
        StrategyConfigInfo strategyConfigInfo3 = this.copydefault;
        if (strategyConfigInfo3 == null || (timeIntervalMin = strategyConfigInfo3.getTimeIntervalMin()) == null) {
            timeIntervalMin = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("minLevel", xmr.copydefault(timeIntervalMin));
        StrategyConfigInfo strategyConfigInfo4 = this.copydefault;
        if (strategyConfigInfo4 != null && (timeIntervalMax = strategyConfigInfo4.getTimeIntervalMax()) != null) {
            str = timeIntervalMax;
        }
        pairArr[1] = C56390yDp.OLrzqt("maxLevel", xmr.copydefault(str));
        c47988uAv2.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        return false;
    }

    private final void uzCIH() {
        java.lang.String strGEmmrt;
        C56235xyw c56235xyw = new C56235xyw();
        c56235xyw.KWHzl("twap");
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS == null || (strGEmmrt = c55887xsS.gEmmrt()) == null) {
            return;
        }
        c56235xyw.AEQbTJ(strGEmmrt);
        C55887xsS c55887xsS2 = this.AYXKKw;
        c56235xyw.OLrzqt(c55887xsS2 != null ? c55887xsS2.AEQbTJ("twap") : null);
        c56235xyw.KWHzl(new Function1() { // from class: o.wle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53448wlg.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<TwapReq, java.lang.Boolean> copydefault() {
        java.lang.String strAkhnZx;
        if (!checkPriceWithDepthIsValid$default(this, false, 1, null) || !checkLimitPriceIsValid$default(this, false, 1, null) || !checkTimeIsValid$default(this, false, 1, null) || !checkSingleAmtIsValid$default(this, false, 1, null) || !checkTotalAmtIsValid$default(this, false, 1, null)) {
            return C56390yDp.OLrzqt(null, java.lang.Boolean.TRUE);
        }
        TwapReq twapReq = new TwapReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null);
        java.lang.String strCopydefault = this.EZpvd.gEmmrt.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "price_from")) {
            twapReq.setPxSpread(this.EZpvd.AEQbTJ.AkhnZx());
        } else if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "ratio")) {
            twapReq.setPxVar(C33129mqd.divS$default(this.EZpvd.AEQbTJ.AkhnZx(), 100, null, null, null, 14, null));
        } else {
            return C56390yDp.OLrzqt(null, java.lang.Boolean.FALSE);
        }
        twapReq.setPxLimit(this.EZpvd.OLrzqt.AkhnZx());
        twapReq.setTimeInterval(this.EZpvd.DbNXlk.AkhnZx());
        twapReq.setSzLimit(this.EZpvd.AYXKKw.AkhnZx());
        if (this.EZpvd.fetchVPNInfo.zLjUOn()) {
            java.util.List listGEmmrt = yDY.gEmmrt("FUTURES", "SWAP");
            C55887xsS c55887xsS = this.AYXKKw;
            strAkhnZx = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listGEmmrt), c55887xsS != null ? c55887xsS.djBIcL() : null) ? "" : this.EZpvd.fetchVPNInfo.AkhnZx();
        }
        twapReq.setSz(strAkhnZx);
        return C56390yDp.OLrzqt(twapReq, java.lang.Boolean.FALSE);
    }

    public final C47988uAv values() {
        C47988uAv c47988uAv = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv AYXKKw() {
        C47988uAv c47988uAv = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv AkhnZx() {
        C47988uAv c47988uAv = this.EZpvd.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv isConnected() {
        C47988uAv c47988uAv = this.EZpvd.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv DbNXlk() {
        C47988uAv c47988uAv = this.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final TwapModifyBean AEQbTJ() {
        return new TwapModifyBean(this.EZpvd.AEQbTJ.AkhnZx(), this.EZpvd.OLrzqt.AkhnZx(), this.EZpvd.DbNXlk.AkhnZx(), this.EZpvd.AYXKKw.AkhnZx(), this.EZpvd.fetchVPNInfo.AkhnZx());
    }

    public final boolean EZpvd() {
        return checkPriceWithDepthIsValid$default(this, false, 1, null) && checkLimitPriceIsValid$default(this, false, 1, null) && checkTimeIsValid$default(this, false, 1, null) && checkSingleAmtIsValid$default(this, false, 1, null) && checkTotalAmtIsValid$default(this, false, 1, null);
    }

    public final java.util.Map<C47988uAv, java.lang.String> AhwBna() {
        return (java.util.Map) this.AhwBna.getValue();
    }

    public static final java.util.Map AEQbTJ(C53448wlg c53448wlg) {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(c53448wlg.EZpvd.AEQbTJ, "priceWithDepth"), C56390yDp.OLrzqt(c53448wlg.EZpvd.OLrzqt, "limitPrice"), C56390yDp.OLrzqt(c53448wlg.EZpvd.DbNXlk, CrashHianalyticsData.TIME), C56390yDp.OLrzqt(c53448wlg.EZpvd.AYXKKw, "singleAmt"), C56390yDp.OLrzqt(c53448wlg.EZpvd.fetchVPNInfo, "totalAmt"));
    }

    public final java.util.List<C47988uAv> gEmmrt() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(AhwBna().keySet());
    }

    public final java.lang.String[] OLrzqt(java.lang.String str) {
        xVK xvk = xVK.EZpvd;
        C55887xsS c55887xsS = this.AYXKKw;
        java.lang.String strGEmmrt = c55887xsS != null ? c55887xsS.gEmmrt() : null;
        C55887xsS c55887xsS2 = this.AYXKKw;
        return xvk.EZpvd(str, strGEmmrt, c55887xsS2 != null ? c55887xsS2.djBIcL() : null);
    }

    private final void EZpvd(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.wli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53448wlg.copydefault(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(MaxAvailableResp maxAvailableResp) {
        BizInstrument bizInstrumentAhwBna;
        java.lang.String first;
        java.lang.String tradeSymbol;
        kotlin.Pair pairConvertSpotAvaTrade$default;
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        boolean z;
        AbstractC49896uxG abstractC49896uxGInvoke;
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        C49861uwY.ActionBar actionBar = C49861uwY.Companion;
        TradeType tradeType = actionBar.copydefault().get();
        java.lang.String str = "--";
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            first = "--";
        } else {
            java.lang.String available = maxAvailableResp.getAvailable();
            C55887xsS c55887xsS2 = this.AYXKKw;
            first = null;
            if (c55887xsS2 == null) {
                pairOLrzqt = null;
            } else {
                if (tradeType == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) {
                    return;
                }
                Function0<? extends AbstractC49896uxG> function0 = this.DbNXlk;
                java.lang.String strCopydefault = (function0 == null || (abstractC49896uxGInvoke = function0.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
                java.lang.String tradeQuoteCcy = maxAvailableResp.getTradeQuoteCcy();
                int i = TaskDescription.copydefault[tradeType.ordinal()];
                if (i == 1) {
                    z = true;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                pairOLrzqt = c55887xsS2.OLrzqt(available, tradeType, false, currentMarginMode$default, strCopydefault, "twap", tradeQuoteCcy, z);
            }
            pUU.EZpvd("USDRename", "TWAP spot, updateSpotAvaUiInfo, " + bizInstrumentAhwBna.joinCcyRelevantToString() + ", tradeQuoteCcy:" + maxAvailableResp.getTradeQuoteCcy() + ", formatted quote available : " + (pairOLrzqt != null ? pairOLrzqt.getFirst() : null));
            if (pairOLrzqt != null) {
                first = pairOLrzqt.getFirst();
            }
        }
        C53539wnR c53539wnR = this.EZpvd.copydefault;
        if (tradeType == TradeType.BUY_OPEN) {
            C55887xsS c55887xsS3 = this.AYXKKw;
            if (c55887xsS3 == null || (tradeSymbol = c55887xsS3.copydefault("twap")) == null) {
                tradeSymbol = "";
            }
        } else {
            tradeSymbol = bizInstrumentAhwBna.getTradeSymbol();
        }
        c53539wnR.setTransferCoin(tradeSymbol);
        this.EZpvd.copydefault.setFooterAvaValue(first);
        wPL.avaViewAdapterBorrow$default(wPL.KWHzl, this.EZpvd.copydefault, bizInstrumentAhwBna, maxAvailableResp, hDKMBd(), null, 16, null);
        if (maxAvailableResp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
            java.lang.String maxSize = maxAvailableResp.getMaxSize();
            if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "SPOT")) {
                C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                java.lang.String instId = bizInstrumentAhwBna.getInstId();
                java.lang.String instType = bizInstrumentAhwBna.getInstType();
                TradeType tradeType2 = actionBar.copydefault().get();
                if (tradeType2 == null) {
                    return;
                } else {
                    pairConvertSpotAvaTrade$default = C54796xVq.convertSpotMaxSizeQuoteCcy$default(c54796xVq, maxSize, instId, instType, tradeType2, fARcdN(), false, 32, null);
                }
            } else {
                C54796xVq c54796xVq2 = C54796xVq.AEQbTJ;
                TradeType tradeType3 = actionBar.copydefault().get();
                if (tradeType3 == null) {
                    return;
                } else {
                    pairConvertSpotAvaTrade$default = C54796xVq.convertSpotAvaTrade$default(c54796xVq2, tradeType3, maxSize, bizInstrumentAhwBna.getInstId(), bizInstrumentAhwBna.getInstType(), null, false, 32, null);
                }
            }
            str = (java.lang.String) pairConvertSpotAvaTrade$default.getFirst();
        }
        this.EZpvd.djBIcL.setFooterAvaValue(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(MaxAvailableResp maxAvailableResp) {
        C55887xsS c55887xsS;
        BizInstrument bizInstrumentAhwBna;
        java.lang.String str;
        BizInstrument bizInstrument;
        java.lang.Object obj;
        C53539wnR c53539wnR;
        java.lang.Object obj2;
        java.lang.String avaCcy$default;
        java.lang.String str2;
        java.lang.String str3;
        AbstractC49896uxG abstractC49896uxGInvoke;
        java.lang.String strCopydefault;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        MarginModeManager marginModeManagerIsConnected2;
        java.lang.String currentMarginMode$default2;
        boolean z;
        AbstractC49896uxG abstractC49896uxGInvoke2;
        C49861uwY.ActionBar actionBar = C49861uwY.Companion;
        TradeType tradeType = actionBar.copydefault().get();
        if (tradeType == null || (c55887xsS = this.AYXKKw) == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = null;
        if (maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) {
            str = "--";
            bizInstrument = null;
            obj = str;
        } else {
            C55887xsS c55887xsS2 = this.AYXKKw;
            if (c55887xsS2 != null) {
                java.lang.String available = maxAvailableResp.getAvailable();
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected2 = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default2 = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected2, false, null, 3, null)) == null) {
                    return;
                }
                Function0<? extends AbstractC49896uxG> function0 = this.DbNXlk;
                java.lang.String strCopydefault2 = (function0 == null || (abstractC49896uxGInvoke2 = function0.invoke()) == null) ? null : abstractC49896uxGInvoke2.copydefault();
                java.lang.String tradeQuoteCcy = maxAvailableResp.getTradeQuoteCcy();
                int i = TaskDescription.copydefault[tradeType.ordinal()];
                if (i == 1) {
                    z = true;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                str = "--";
                bizInstrument = null;
                pairOLrzqt = c55887xsS2.OLrzqt(available, tradeType, false, currentMarginMode$default2, strCopydefault2, "twap", tradeQuoteCcy, z);
            } else {
                str = "--";
                bizInstrument = null;
            }
            obj = pairOLrzqt != null ? (java.lang.String) pairOLrzqt.getFirst() : bizInstrument;
        }
        C53539wnR c53539wnR2 = this.EZpvd.copydefault;
        C55887xsS c55887xsS3 = this.AYXKKw;
        if (c55887xsS3 != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            java.lang.String str4 = (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 3, bizInstrument)) == null) ? "" : currentMarginMode$default;
            Function0<? extends AbstractC49896uxG> function02 = this.DbNXlk;
            c53539wnR = c53539wnR2;
            java.lang.Object obj3 = obj;
            avaCcy$default = C55887xsS.getAvaCcy$default(c55887xsS3, tradeType, false, str4, (function02 == null || (abstractC49896uxGInvoke = function02.invoke()) == null || (strCopydefault = abstractC49896uxGInvoke.copydefault()) == null) ? "" : strCopydefault, "twap", null, 32, null);
            str2 = obj3;
            obj2 = obj3;
            if (avaCcy$default == null) {
            }
            c53539wnR.setTransferCoin(avaCcy$default);
            this.EZpvd.copydefault.setFooterAvaValue(str2);
            if (maxAvailableResp != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getMaxSize())) {
                str3 = str;
            } else {
                C54796xVq c54796xVq = C54796xVq.AEQbTJ;
                TradeType tradeType2 = actionBar.copydefault().get();
                if (tradeType2 == null) {
                    return;
                } else {
                    str3 = (java.lang.String) C54796xVq.convertSpotAvaTrade$default(c54796xVq, tradeType2, maxAvailableResp.getMaxSize(), bizInstrumentAhwBna.getInstId(), bizInstrumentAhwBna.getInstType(), java.lang.Boolean.FALSE, false, 32, null).getFirst();
                }
            }
            this.EZpvd.djBIcL.setFooterAvaValue(str3);
        }
        c53539wnR = c53539wnR2;
        obj2 = obj;
        avaCcy$default = "";
        str2 = obj2;
        c53539wnR.setTransferCoin(avaCcy$default);
        this.EZpvd.copydefault.setFooterAvaValue(str2);
        if (maxAvailableResp != null) {
            str3 = str;
        }
        this.EZpvd.djBIcL.setFooterAvaValue(str3);
    }

    public final void EZpvd(MaxAvailableResp maxAvailableResp) {
        BizInstrument bizInstrumentAhwBna;
        C55887xsS c55887xsS = this.AYXKKw;
        if (c55887xsS == null || (bizInstrumentAhwBna = c55887xsS.AhwBna()) == null) {
            return;
        }
        this.EZpvd.copydefault.setFooterAvaValue((maxAvailableResp == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxAvailableResp.getAvailable())) ? "--" : C54796xVq.AEQbTJ.AEQbTJ(maxAvailableResp.getAvailable(), bizInstrumentAhwBna.getInstType(), bizInstrumentAhwBna.getInstId()).getFirst());
    }

    public static final Unit EZpvd(C53448wlg c53448wlg, ResponseData responseData) {
        Function1<? super StrategyConfigInfo, Unit> function1;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            c53448wlg.copydefault = list != null ? (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
            c53448wlg.AhwBna(false);
            StrategyConfigInfo strategyConfigInfo = c53448wlg.copydefault;
            if (strategyConfigInfo != null && (function1 = c53448wlg.valueOf) != null) {
                function1.invoke(strategyConfigInfo);
            }
        } else {
            C33134mqi.AEQbTJ(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
