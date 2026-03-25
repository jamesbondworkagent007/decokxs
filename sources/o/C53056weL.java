package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergPresenter;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.weL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53056weL extends ConstraintLayout implements InterfaceC49943uyA {
    public DigitInfoBean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public StrategyConfigInfo EZpvd;
    public final AbstractC50925vdO KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final Function2<C47988uAv, java.lang.String, Unit> djBIcL;
    public Function2<? super C47988uAv, ? super java.lang.Float, Unit> gEmmrt;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53056weL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53056weL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC49943uyA
    public java.lang.String OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnAmtPercentCallback(Function2<? super C47988uAv, ? super java.lang.Float, Unit> function2) {
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:47) call: o.weL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53056weL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53056weL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "unified_" + C53056weL.class.getSimpleName();
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.isScanInProgress, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50925vdO abstractC50925vdO = (AbstractC50925vdO) viewDataBindingInflate;
        this.KWHzl = abstractC50925vdO;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.weM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53056weL.copydefault(this.EZpvd);
            }
        });
        this.djBIcL = new Function2() { // from class: o.weP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53056weL.OLrzqt(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.valueOf = new Function2() { // from class: o.weO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53056weL.OLrzqt(this.copydefault, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        C55258xgZ c55258xgZ = abstractC50925vdO.copydefault;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this, context));
        abstractC50925vdO.AEQbTJ.setMaxDecimal(0);
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.weU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53056weL.AEQbTJ(this.copydefault);
            }
        });
    }

    private final SmartIcebergPresenter gEmmrt() {
        return (SmartIcebergPresenter) this.AYXKKw.getValue();
    }

    public static final SmartIcebergPresenter copydefault(C53056weL c53056weL) {
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(c53056weL);
        if (viewModelStoreOwner != null) {
            return (SmartIcebergPresenter) new ViewModelProvider(viewModelStoreOwner).get(SmartIcebergPresenter.class);
        }
        return null;
    }

    public static final Unit OLrzqt(C53056weL c53056weL, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.OLrzqt)) {
            if (checkSingleAmtIsValid$default(c53056weL, false, false, 1, null)) {
                checkTotalAmtIsValid$default(c53056weL, false, true, 1, null);
            }
        } else if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.AEQbTJ)) {
            if (checkSingleNumIsValid$default(c53056weL, false, false, 1, null)) {
                checkTotalAmtIsValid$default(c53056weL, false, true, 1, null);
            }
        } else if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.KWHzl)) {
            checkTotalAmtIsValid$default(c53056weL, false, true, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53056weL c53056weL, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && c47988uAv.AkhnZx().length() > 0) {
            if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.OLrzqt)) {
                c53056weL.OLrzqt("IcebergBotPlaceOrder_Full_InputBox_Input", "input_type", OtcExtraKeys.AMOUNT);
            } else if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.AEQbTJ)) {
                c53056weL.OLrzqt("IcebergBotPlaceOrder_Full_InputBox_Input", "input_type", "visible_orders");
            } else if (Intrinsics.EZpvd(c47988uAv, c53056weL.KWHzl.KWHzl)) {
                c53056weL.OLrzqt("IcebergBotPlaceOrder_Full_InputBox_Input", "input_type", "order_amount");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.weL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static /* synthetic */ void updateUi$default(C53056weL c53056weL, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53056weL.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        C55887xsS c55887xsSFvQaOB;
        SmartIcebergPresenter smartIcebergPresenterGEmmrt = gEmmrt();
        DigitInfoBean digitInfoBeanEZpvd = (smartIcebergPresenterGEmmrt == null || (c55887xsSFvQaOB = smartIcebergPresenterGEmmrt.fvQaOB()) == null) ? null : c55887xsSFvQaOB.EZpvd();
        if (digitInfoBeanEZpvd != null) {
            this.KWHzl.OLrzqt.setInputUnit(digitInfoBeanEZpvd.getSymbol());
            this.KWHzl.OLrzqt.setMaxDecimal(digitInfoBeanEZpvd.getDigit());
            this.KWHzl.KWHzl.setInputUnit(digitInfoBeanEZpvd.getSymbol());
            this.KWHzl.KWHzl.setMaxDecimal(digitInfoBeanEZpvd.getDigit());
        }
        if (z || !Intrinsics.EZpvd(this.AEQbTJ, digitInfoBeanEZpvd)) {
            this.KWHzl.OLrzqt.setOnTextChangeCallback(this.djBIcL);
            this.KWHzl.AEQbTJ.setOnTextChangeCallback(this.djBIcL);
            this.KWHzl.KWHzl.setOnTextChangeCallback(this.djBIcL);
            this.KWHzl.OLrzqt.setOnFocusChangeCallback(this.valueOf);
            this.KWHzl.AEQbTJ.setOnFocusChangeCallback(this.valueOf);
            this.KWHzl.KWHzl.setOnFocusChangeCallback(this.valueOf);
            C47988uAv.setInputContent$default(this.KWHzl.KWHzl, "", false, false, 6, null);
            C47988uAv.setInputContent$default(this.KWHzl.OLrzqt, "", false, false, 6, null);
            C47988uAv.setInputContent$default(this.KWHzl.AEQbTJ, "", false, false, 6, null);
            this.KWHzl.KWHzl.copydefault();
            this.KWHzl.OLrzqt.copydefault();
            this.KWHzl.AEQbTJ.copydefault();
        }
        this.AEQbTJ = digitInfoBeanEZpvd;
    }

    @Override // o.InterfaceC49943uyA
    public void KWHzl() {
        if (this.KWHzl.KWHzl.zLjUOn()) {
            C47988uAv.setInputContent$default(this.KWHzl.KWHzl, "", false, false, 6, null);
        }
        C47988uAv.clearSeekBarData$default(this.KWHzl.KWHzl, false, 1, null);
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

    /* JADX INFO: renamed from: o.weL$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53056weL AEQbTJ;
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53056weL c53056weL, android.content.Context context) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c53056weL;
            this.KWHzl = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt("IcebergBotPlaceOrder_Full_Button_Click", EopTrackEvent.KEY_BUTTON_NAME, "basic_info");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.KWHzl);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.onKeyDown));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.getIconAttributeResId));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final void AEQbTJ(@NotNull StrategyConfigInfo strategyConfigInfo) {
        java.lang.String max;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        this.EZpvd = strategyConfigInfo;
        C47988uAv c47988uAv = this.KWHzl.AEQbTJ;
        xMR xmr = xMR.copydefault;
        LmtOrderNumber lmtOrderNumber = strategyConfigInfo.getLmtOrderNumber();
        if (lmtOrderNumber == null || (max = lmtOrderNumber.getMax()) == null) {
            max = "5";
        }
        c47988uAv.setInputUnit("≤ " + xmr.copydefault(max));
    }

    public static /* synthetic */ boolean checkSingleAmtIsValid$default(C53056weL c53056weL, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return c53056weL.KWHzl(z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(boolean z, boolean z2) {
        java.lang.String strDjBIcL;
        java.lang.String strValueOf;
        java.lang.String safeString$default;
        java.lang.String strDjBIcL2;
        java.lang.String strValueOf2;
        java.lang.String amountMin;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default2;
        C55887xsS c55887xsSFvQaOB;
        C55887xsS c55887xsSFvQaOB2;
        java.lang.String amountMin2;
        C54536xML c54536xMLAuCTel;
        C55887xsS c55887xsSFvQaOB3;
        C55887xsS c55887xsSFvQaOB4;
        java.lang.String strAkhnZx = this.KWHzl.OLrzqt.AkhnZx();
        java.lang.String str = "";
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (!z2) {
                this.KWHzl.OLrzqt.copydefault();
                return false;
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.KWHzl.OLrzqt.values())));
            this.KWHzl.OLrzqt.setInputErrorMsg(strKWHzl);
            if (z) {
                C55326xho.AEQbTJ(strKWHzl);
                this.KWHzl.OLrzqt.zsXlph();
            }
            return false;
        }
        if (C33129mqd.OLrzqt(strAkhnZx, "0")) {
            C47988uAv c47988uAv = this.KWHzl.OLrzqt;
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMedia, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("0")), C56390yDp.OLrzqt("unit", this.KWHzl.OLrzqt.fARcdN()))));
            return false;
        }
        if (this.EZpvd == null) {
            this.KWHzl.OLrzqt.copydefault();
            return true;
        }
        SmartIcebergPresenter smartIcebergPresenterGEmmrt = gEmmrt();
        if (smartIcebergPresenterGEmmrt == null || (c55887xsSFvQaOB4 = smartIcebergPresenterGEmmrt.fvQaOB()) == null || (strDjBIcL = c55887xsSFvQaOB4.djBIcL()) == null) {
            strDjBIcL = "";
        }
        SmartIcebergPresenter smartIcebergPresenterGEmmrt2 = gEmmrt();
        if (smartIcebergPresenterGEmmrt2 == null || (c55887xsSFvQaOB3 = smartIcebergPresenterGEmmrt2.fvQaOB()) == null || (strValueOf = c55887xsSFvQaOB3.valueOf()) == null) {
            strValueOf = "";
        }
        C54571xNh c54571xNhCreateStrategyTradeConverter$default = C54566xNc.createStrategyTradeConverter$default(strDjBIcL, strValueOf, null, 4, null);
        if (c54571xNhCreateStrategyTradeConverter$default == null) {
            safeString$default = null;
        } else {
            StrategyConfigInfo strategyConfigInfo = this.EZpvd;
            if (strategyConfigInfo == null || (amountMin2 = strategyConfigInfo.getAmountMin()) == null) {
                amountMin2 = "";
            }
            C54536xML c54536xMLDjBIcL2 = c54571xNhCreateStrategyTradeConverter$default.djBIcL(amountMin2);
            if (c54536xMLDjBIcL2 != null && (c54536xMLAuCTel = c54536xMLDjBIcL2.AuCTel()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null);
            }
        }
        if (C33129mqd.gEmmrt(this.KWHzl.OLrzqt.AkhnZx(), safeString$default)) {
            SmartIcebergPresenter smartIcebergPresenterGEmmrt3 = gEmmrt();
            if (smartIcebergPresenterGEmmrt3 == null || (c55887xsSFvQaOB2 = smartIcebergPresenterGEmmrt3.fvQaOB()) == null || (strDjBIcL2 = c55887xsSFvQaOB2.djBIcL()) == null) {
                strDjBIcL2 = "";
            }
            SmartIcebergPresenter smartIcebergPresenterGEmmrt4 = gEmmrt();
            if (smartIcebergPresenterGEmmrt4 == null || (c55887xsSFvQaOB = smartIcebergPresenterGEmmrt4.fvQaOB()) == null || (strValueOf2 = c55887xsSFvQaOB.valueOf()) == null) {
                strValueOf2 = "";
            }
            C54571xNh c54571xNhCreateStrategyTradeConverter$default2 = C54566xNc.createStrategyTradeConverter$default(strDjBIcL2, strValueOf2, null, 4, null);
            if (c54571xNhCreateStrategyTradeConverter$default2 != null) {
                StrategyConfigInfo strategyConfigInfo2 = this.EZpvd;
                if (strategyConfigInfo2 == null || (amountMin = strategyConfigInfo2.getAmountMin()) == null) {
                    amountMin = "";
                }
                C54536xML c54536xMLDjBIcL3 = c54571xNhCreateStrategyTradeConverter$default2.djBIcL(amountMin);
                if (c54536xMLDjBIcL3 != null && (c54536xMLCopydefault = c54536xMLDjBIcL3.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) != null) {
                    str = safeString$default2;
                }
            }
            this.KWHzl.OLrzqt.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.setIcon, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
            return false;
        }
        this.KWHzl.OLrzqt.copydefault();
        return true;
    }

    public static /* synthetic */ boolean checkSingleNumIsValid$default(C53056weL c53056weL, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return c53056weL.AEQbTJ(z, z2);
    }

    public final boolean AEQbTJ(boolean z, boolean z2) {
        java.lang.String max;
        LmtOrderNumber lmtOrderNumber;
        java.lang.String max2;
        LmtOrderNumber lmtOrderNumber2;
        java.lang.String min;
        LmtOrderNumber lmtOrderNumber3;
        java.lang.String strAkhnZx = this.KWHzl.AEQbTJ.AkhnZx();
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            if (!z2) {
                this.KWHzl.AEQbTJ.copydefault();
                return false;
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.KWHzl.AEQbTJ.values())));
            this.KWHzl.AEQbTJ.setInputErrorMsg(strKWHzl);
            if (z) {
                C55326xho.AEQbTJ(strKWHzl);
                this.KWHzl.AEQbTJ.zsXlph();
            }
            return false;
        }
        if (C33129mqd.OLrzqt(strAkhnZx, "0")) {
            C47988uAv c47988uAv = this.KWHzl.AEQbTJ;
            int i = C55688xof.Application.ActivityResultContractsPickVisualMediaCompanion;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("fieldName", c47988uAv.values());
            StrategyConfigInfo strategyConfigInfo = this.EZpvd;
            if (strategyConfigInfo == null || (lmtOrderNumber3 = strategyConfigInfo.getLmtOrderNumber()) == null || (min = lmtOrderNumber3.getMin()) == null) {
                min = "1";
            }
            pairArr[1] = C56390yDp.OLrzqt("lowLimit", min);
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            return false;
        }
        if (this.EZpvd == null) {
            this.KWHzl.AEQbTJ.copydefault();
            return true;
        }
        java.lang.String strAkhnZx2 = this.KWHzl.AEQbTJ.AkhnZx();
        StrategyConfigInfo strategyConfigInfo2 = this.EZpvd;
        java.lang.String str = "5";
        if (strategyConfigInfo2 == null || (lmtOrderNumber2 = strategyConfigInfo2.getLmtOrderNumber()) == null || (max = lmtOrderNumber2.getMax()) == null) {
            max = "5";
        }
        if (C33129mqd.AEQbTJ(strAkhnZx2, max)) {
            C47988uAv c47988uAv2 = this.KWHzl.AEQbTJ;
            int i2 = C55688xof.Application.QSLkRj;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            pairArr2[0] = C56390yDp.OLrzqt("fieldName", c47988uAv2.values());
            xMR xmr = xMR.copydefault;
            StrategyConfigInfo strategyConfigInfo3 = this.EZpvd;
            if (strategyConfigInfo3 != null && (lmtOrderNumber = strategyConfigInfo3.getLmtOrderNumber()) != null && (max2 = lmtOrderNumber.getMax()) != null) {
                str = max2;
            }
            pairArr2[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(str));
            c47988uAv2.setInputErrorMsg(C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2)));
            return false;
        }
        this.KWHzl.AEQbTJ.copydefault();
        return true;
    }

    public static /* synthetic */ boolean checkTotalAmtIsValid$default(C53056weL c53056weL, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c53056weL.OLrzqt(z, z2);
    }

    public final boolean OLrzqt(boolean z, boolean z2) {
        java.lang.String strAkhnZx = this.KWHzl.KWHzl.AkhnZx();
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            this.KWHzl.KWHzl.copydefault();
            if (z2) {
                return false;
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", this.KWHzl.KWHzl.values())));
            this.KWHzl.KWHzl.setInputErrorMsg(strKWHzl);
            if (z) {
                C55326xho.AEQbTJ(strKWHzl);
                this.KWHzl.KWHzl.zsXlph();
            }
            return false;
        }
        if (C33129mqd.OLrzqt(strAkhnZx, "0")) {
            C47988uAv c47988uAv = this.KWHzl.KWHzl;
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMedia, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", c47988uAv.values()), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("0")), C56390yDp.OLrzqt("unit", this.KWHzl.KWHzl.fARcdN()))));
            return false;
        }
        if (this.EZpvd == null) {
            this.KWHzl.KWHzl.copydefault();
            return true;
        }
        java.lang.String strMulS$default = C33129mqd.mulS$default(this.KWHzl.OLrzqt.AkhnZx(), this.KWHzl.AEQbTJ.AkhnZx(), null, null, null, 14, null);
        if (C33129mqd.gEmmrt(strAkhnZx, strMulS$default)) {
            this.KWHzl.KWHzl.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.getElevation, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", xMR.copydefault.copydefault(strMulS$default) + " " + this.KWHzl.KWHzl.fARcdN()))));
            return false;
        }
        this.KWHzl.KWHzl.copydefault();
        return true;
    }

    public final kotlin.Pair<IceBergReq, java.lang.Boolean> AEQbTJ() {
        if (!checkSingleAmtIsValid$default(this, true, false, 2, null) || !checkSingleNumIsValid$default(this, true, false, 2, null) || !OLrzqt(true, false)) {
            return C56390yDp.OLrzqt(null, java.lang.Boolean.TRUE);
        }
        IceBergReq iceBergReq = new IceBergReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        iceBergReq.setLmtOrderNumber(this.KWHzl.AEQbTJ.AkhnZx());
        iceBergReq.setSzLimit(this.KWHzl.OLrzqt.AkhnZx());
        iceBergReq.setSz(this.KWHzl.KWHzl.AkhnZx());
        return C56390yDp.OLrzqt(iceBergReq, java.lang.Boolean.FALSE);
    }

    public final C47988uAv valueOf() {
        C47988uAv c47988uAv = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv AhwBna() {
        C47988uAv c47988uAv = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final C47988uAv AYXKKw() {
        C47988uAv c47988uAv = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    private final java.util.Map<C47988uAv, java.lang.String> djBIcL() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(this.KWHzl.OLrzqt, OtcExtraKeys.AMOUNT), C56390yDp.OLrzqt(this.KWHzl.AEQbTJ, "visible_orders"), C56390yDp.OLrzqt(this.KWHzl.KWHzl, "order_amount"));
    }

    public final C53519wmy EZpvd() {
        return (C53519wmy) this.copydefault.getValue();
    }

    public static final C53519wmy AEQbTJ(C53056weL c53056weL) {
        return new C53519wmy(c53056weL.djBIcL());
    }

    public final java.util.List<C47988uAv> copydefault() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(djBIcL().keySet());
    }

    public final void OLrzqt(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.weN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53056weL.copydefault(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }
}
