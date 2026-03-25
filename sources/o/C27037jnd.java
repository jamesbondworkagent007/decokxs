package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.DualCryptoZapFragment$updateUI$1$1$1$1;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapInputState;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C25493ixk;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27037jnd extends AbstractC27017jnJ {
    public InvestTokenWithAmount AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public final yIP EZpvd = C27589jxz.EZpvd(this);
    public InvestTokenWithAmount copydefault;
    public java.lang.String djBIcL;
    public ZapInputState gEmmrt;
    public ZapInputState isConnected;
    public java.lang.String valueOf;
    public static final /* synthetic */ yJA<java.lang.Object>[] KWHzl = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C27037jnd.class, "binding", "getBinding()Lcom/okinc/business/invest_biz/databinding/FragmentDualCryptoZapBinding;", 0))};
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.jnd$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.wlaJM;
    }

    public C27037jnd() {
        ZapInputState zapInputState = ZapInputState.EMPTY;
        this.gEmmrt = zapInputState;
        this.isConnected = zapInputState;
        this.AYXKKw = "";
        this.valueOf = "";
    }

    public final void AEQbTJ(C23747iHv c23747iHv) {
        this.EZpvd.KWHzl(this, KWHzl[0], c23747iHv);
    }

    public final C23747iHv KWHzl() {
        return (C23747iHv) this.EZpvd.getValue(this, KWHzl[0]);
    }

    @Override // o.AbstractC27017jnJ
    public void AEQbTJ(boolean z) {
        if (z) {
            return;
        }
        KWHzl().EZpvd.valueOf();
        KWHzl().valueOf.valueOf();
    }

    @Override // o.AbstractC27017jnJ
    public void AEQbTJ() {
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.AYXKKw)) || Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) "0") || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.valueOf)) || Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "0")) {
            return;
        }
        AEQbTJ(this.AYXKKw, this.valueOf, false, true);
    }

    @Override // o.AbstractC27017jnJ, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(C23747iHv.OLrzqt(view));
        DbNXlk();
        super.initView(view, bundle);
        values();
        EZpvd();
    }

    public final void EZpvd() {
        AYXKKw().DCJXGO().observe(this, new StateListAnimator(new Function1() { // from class: o.jnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27037jnd.AEQbTJ(this.OLrzqt, (C27019jnL) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C27037jnd c27037jnd, C27019jnL c27019jnL) {
        if (c27019jnL != null) {
            ZapInputState zapInputState = c27037jnd.gEmmrt;
            ZapInputState zapInputState2 = ZapInputState.HAS_INPUT;
            if (zapInputState == zapInputState2 && c27037jnd.isConnected == zapInputState2 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c27037jnd.AYXKKw)) && !Intrinsics.EZpvd((java.lang.Object) c27037jnd.AYXKKw, (java.lang.Object) "0") && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c27037jnd.valueOf)) && !Intrinsics.EZpvd((java.lang.Object) c27037jnd.valueOf, (java.lang.Object) "0") && c27037jnd.AEQbTJ != null && c27037jnd.copydefault != null && (!Intrinsics.EZpvd((java.lang.Object) c27037jnd.AYXKKw, (java.lang.Object) c27037jnd.AhwBna) || !Intrinsics.EZpvd((java.lang.Object) c27037jnd.valueOf, (java.lang.Object) c27037jnd.djBIcL) || c27019jnL.copydefault())) {
                updateUI$default(c27037jnd, c27037jnd.AYXKKw, c27037jnd.valueOf, false, c27019jnL.copydefault(), 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        final C23747iHv c23747iHvKWHzl = KWHzl();
        c23747iHvKWHzl.EZpvd.setTagAndDelayedTextWatcher(InvestUniv3SubscribeActivity.AmountInputIndex.First, new Function2() { // from class: o.jne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27037jnd.KWHzl(this.KWHzl, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        c23747iHvKWHzl.EZpvd.setClickablePromptListener(new View.OnClickListener() { // from class: o.jnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27037jnd.EZpvd(this.copydefault, c23747iHvKWHzl, view);
            }
        });
        c23747iHvKWHzl.valueOf.setTagAndDelayedTextWatcher(InvestUniv3SubscribeActivity.AmountInputIndex.Second, new Function2() { // from class: o.jnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27037jnd.AEQbTJ(this.copydefault, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        c23747iHvKWHzl.valueOf.setClickablePromptListener(new View.OnClickListener() { // from class: o.jng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27037jnd.copydefault(this.OLrzqt, c23747iHvKWHzl, view);
            }
        });
    }

    public static final Unit KWHzl(C27037jnd c27037jnd, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        c27037jnd.AYXKKw = str;
        c27037jnd.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C27037jnd c27037jnd, C23747iHv c23747iHv, android.view.View view) {
        java.lang.Object tag = view.getTag();
        kotlin.Pair pair = tag instanceof kotlin.Pair ? (kotlin.Pair) tag : null;
        if (pair == null) {
            return;
        }
        java.lang.Object objComponent1 = pair.component1();
        pair.component2();
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 2)) {
            InvestTokenWithAmount investTokenWithAmount = c27037jnd.AEQbTJ;
            if (investTokenWithAmount != null) {
                c27037jnd.EZpvd(investTokenWithAmount);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 1)) {
            c27037jnd.AYXKKw().KWHzl(true);
            InvestTokenWithAmount investTokenWithAmount2 = c27037jnd.AEQbTJ;
            if (investTokenWithAmount2 != null) {
                c23747iHv.EZpvd.AEQbTJ(c27037jnd.KWHzl(investTokenWithAmount2, false));
                c23747iHv.EZpvd.valueOf();
            }
        }
    }

    public static final Unit AEQbTJ(C27037jnd c27037jnd, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        c27037jnd.valueOf = str;
        c27037jnd.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final void copydefault(C27037jnd c27037jnd, C23747iHv c23747iHv, android.view.View view) {
        java.lang.Object tag = view.getTag();
        kotlin.Pair pair = tag instanceof kotlin.Pair ? (kotlin.Pair) tag : null;
        if (pair == null) {
            return;
        }
        java.lang.Object objComponent1 = pair.component1();
        pair.component2();
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 2)) {
            InvestTokenWithAmount investTokenWithAmount = c27037jnd.copydefault;
            if (investTokenWithAmount != null) {
                c27037jnd.EZpvd(investTokenWithAmount);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 1)) {
            c27037jnd.AYXKKw().KWHzl(true);
            InvestTokenWithAmount investTokenWithAmount2 = c27037jnd.copydefault;
            if (investTokenWithAmount2 != null) {
                c23747iHv.valueOf.AEQbTJ(c27037jnd.KWHzl(investTokenWithAmount2, false));
                c23747iHv.valueOf.valueOf();
            }
        }
    }

    private final void values() {
        this.AEQbTJ = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(valueOf().getInvestWithTokenList(), 0);
        this.copydefault = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(valueOf().getInvestWithTokenList(), 1);
        C25480ixX c25480ixXAEQbTJ = AEQbTJ(valueOf(), 0);
        if (c25480ixXAEQbTJ != null) {
            KWHzl().EZpvd.AEQbTJ(c25480ixXAEQbTJ);
        }
        C25480ixX c25480ixXAEQbTJ2 = AEQbTJ(valueOf(), 1);
        if (c25480ixXAEQbTJ2 != null) {
            KWHzl().valueOf.AEQbTJ(c25480ixXAEQbTJ2);
        }
    }

    public final void copydefault(java.lang.String str) {
        ZapInputState zapInputState;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            zapInputState = ZapInputState.EMPTY;
        } else {
            zapInputState = ZapInputState.HAS_INPUT;
        }
        this.gEmmrt = zapInputState;
        if (zapInputState == ZapInputState.EMPTY) {
            KWHzl().EZpvd.OLrzqt("0");
        } else {
            InvestTokenWithAmount investTokenWithAmount = this.AEQbTJ;
            if (investTokenWithAmount != null) {
                C27300jsb c27300jsb = KWHzl().EZpvd;
                Intrinsics.checkNotNullExpressionValue(c27300jsb, "");
                KWHzl(str, investTokenWithAmount, c27300jsb);
            }
        }
        ZapInputState zapInputState2 = this.gEmmrt;
        ZapInputState zapInputState3 = ZapInputState.HAS_INPUT;
        if (zapInputState2 == zapInputState3 && this.isConnected == zapInputState3) {
            updateUI$default(this, this.AYXKKw, this.valueOf, false, false, 12, null);
            return;
        }
        KWHzl().djBIcL.setVisibility(4);
        AYXKKw().EZpvd((InvestUniv3SubscribeReceiveInfo) null);
        AYXKKw().copydefault((kotlin.Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) null);
        AYXKKw().AEQbTJ((ResponseState) null);
        AYXKKw().gHZMYf().setValue("--");
        AYXKKw().QKVWgx().setValue(new C27024jnQ(null, YieldState.DASH));
        AYXKKw().iZzfmt().setValue(new C23962iPu(false, null, 2, null));
        this.AhwBna = null;
        this.djBIcL = null;
    }

    public final void AEQbTJ(java.lang.String str) {
        ZapInputState zapInputState;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            zapInputState = ZapInputState.EMPTY;
        } else {
            zapInputState = ZapInputState.HAS_INPUT;
        }
        this.isConnected = zapInputState;
        if (zapInputState == ZapInputState.EMPTY) {
            KWHzl().valueOf.OLrzqt("0");
        } else {
            InvestTokenWithAmount investTokenWithAmount = this.copydefault;
            if (investTokenWithAmount != null) {
                C27300jsb c27300jsb = KWHzl().valueOf;
                Intrinsics.checkNotNullExpressionValue(c27300jsb, "");
                KWHzl(str, investTokenWithAmount, c27300jsb);
            }
        }
        ZapInputState zapInputState2 = this.gEmmrt;
        ZapInputState zapInputState3 = ZapInputState.HAS_INPUT;
        if (zapInputState2 == zapInputState3 && this.isConnected == zapInputState3) {
            updateUI$default(this, this.AYXKKw, this.valueOf, false, false, 12, null);
            return;
        }
        KWHzl().djBIcL.setVisibility(4);
        AYXKKw().EZpvd((InvestUniv3SubscribeReceiveInfo) null);
        AYXKKw().copydefault((kotlin.Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) null);
        AYXKKw().AEQbTJ((ResponseState) null);
        AYXKKw().gHZMYf().setValue("--");
        AYXKKw().QKVWgx().setValue(new C27024jnQ(null, YieldState.DASH));
        this.AhwBna = null;
        this.djBIcL = null;
    }

    public final void KWHzl(java.lang.String str, InvestTokenWithAmount investTokenWithAmount, C27300jsb c27300jsb) {
        try {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalEZpvd.compareTo(bigDecimal) > 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) investTokenWithAmount.getCurrencyAmount())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) investTokenWithAmount.getCoinAmount()))) {
                BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(investTokenWithAmount.getCoinAmount());
                if (bigDecimalEZpvd2.compareTo(bigDecimal) > 0) {
                    java.lang.String plainString = bigDecimalEZpvd.multiply(C33129mqd.EZpvd(investTokenWithAmount.getCurrencyAmount()).divide(bigDecimalEZpvd2, 8, RoundingMode.HALF_UP)).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "");
                    c27300jsb.OLrzqt(plainString);
                    return;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        c27300jsb.OLrzqt("0");
    }

    private final void EZpvd(InvestTokenWithAmount investTokenWithAmount) {
        java.lang.String strDjBIcL;
        java.lang.String strHDKMBd;
        java.util.ArrayList arrayListCopydefault;
        java.lang.String tokenAddress = !investTokenWithAmount.isBaseToken() ? investTokenWithAmount.getTokenAddress() : "";
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(AYXKKw().accept());
        if (interfaceC9738bbJOLrzqt == null || (strDjBIcL = interfaceC9738bbJOLrzqt.djBIcL(investTokenWithAmount.getChainId())) == null) {
            strDjBIcL = "0";
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).gEmmrt().OLrzqt(AYXKKw().accept());
        if (interfaceC9738bbJOLrzqt2 == null || (strHDKMBd = interfaceC9738bbJOLrzqt2.hDKMBd()) == null) {
            strHDKMBd = "0";
        }
        boolean z = (C33129mqd.AEQbTJ(strDjBIcL, "0") || C33129mqd.AEQbTJ(strHDKMBd, "0")) ? false : true;
        InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC23916iOb.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(investTokenWithAmount.getChainId()));
        if (z) {
            arrayListCopydefault = yDY.copydefault("dex", "gas_station");
        } else {
            arrayListCopydefault = yDY.copydefault("gas_station");
        }
        InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(strGEmmrt, tokenAddress, "yield", "balance", arrayListCopydefault, (java.util.ArrayList) null, true, (java.lang.String) null, 0, 416, (DefaultConstructorMarker) null), 0, null, 12, null);
    }

    public static /* synthetic */ void updateUI$default(C27037jnd c27037jnd, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        c27037jnd.AEQbTJ(str, str2, z, z2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        InvestTokenWithAmount investTokenWithAmount;
        C23747iHv c23747iHvKWHzl = KWHzl();
        ZapInputState zapInputState = this.gEmmrt;
        ZapInputState zapInputState2 = ZapInputState.HAS_INPUT;
        if (zapInputState != zapInputState2 || this.isConnected != zapInputState2) {
            c23747iHvKWHzl.djBIcL.setVisibility(4);
            this.AhwBna = null;
            this.djBIcL = null;
            return;
        }
        if (!z2 && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.AhwBna)) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) this.djBIcL)) {
                return;
            }
        }
        InvestTokenWithAmount investTokenWithAmount2 = this.AEQbTJ;
        if (investTokenWithAmount2 == null || (investTokenWithAmount = this.copydefault) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DualCryptoZapFragment$updateUI$1$1$1$1(this, str, str2, investTokenWithAmount2, investTokenWithAmount, z, c23747iHvKWHzl, null), 3, null);
    }

    /* JADX INFO: renamed from: o.jnd$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jnd.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C27037jnd OLrzqt(@NotNull InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
            Intrinsics.checkNotNullParameter(investUniv3SubscribeInfo, "");
            C27037jnd c27037jnd = new C27037jnd();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("args", investUniv3SubscribeInfo);
            c27037jnd.setArguments(bundle);
            return c27037jnd;
        }
    }
}
