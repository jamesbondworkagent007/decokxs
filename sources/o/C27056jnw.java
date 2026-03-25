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
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.SingleCryptoZapFragment$updateUI$1$1$1;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapInputState;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
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

/* JADX INFO: renamed from: o.jnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27056jnw extends AbstractC27017jnJ implements InterfaceC26609jfZ {
    public java.lang.String AhwBna;
    public InvestTokenWithAmount KWHzl;
    public static final /* synthetic */ yJA<java.lang.Object>[] OLrzqt = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C27056jnw.class, "binding", "getBinding()Lcom/okinc/business/invest_biz/databinding/FragmentSingleCryptoZapBinding;", 0))};
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final yIP EZpvd = C27589jxz.EZpvd(this);
    public ZapInputState djBIcL = ZapInputState.EMPTY;
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.jnw$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.jnw$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ZapInputState.values().length];
            try {
                iArr[ZapInputState.EMPTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ZapInputState.HAS_INPUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.aKErDB;
    }

    /* JADX DEBUG: Possible override for method o.jnm.EZpvd()V */
    public final iHS EZpvd() {
        return (iHS) this.EZpvd.getValue(this, OLrzqt[0]);
    }

    public final void KWHzl(iHS ihs) {
        this.EZpvd.KWHzl(this, OLrzqt[0], ihs);
    }

    @Override // o.AbstractC27017jnJ
    public void AEQbTJ(boolean z) {
        if (z) {
            return;
        }
        EZpvd().copydefault.valueOf();
    }

    @Override // o.AbstractC27017jnJ
    public void AEQbTJ() {
        copydefault(this.copydefault, false, true);
    }

    @Override // o.AbstractC27017jnJ, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl(iHS.OLrzqt(view));
        KWHzl();
        super.initView(view, bundle);
        DbNXlk();
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        AYXKKw().DXXBbs().observe(this, new ActionBar(new Function1() { // from class: o.jnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27056jnw.AEQbTJ(this.AEQbTJ, (C27019jnL) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C27056jnw c27056jnw, C27019jnL c27019jnL) {
        if (c27019jnL != null && c27056jnw.djBIcL == ZapInputState.HAS_INPUT && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c27056jnw.copydefault)) && !Intrinsics.EZpvd((java.lang.Object) c27056jnw.copydefault, (java.lang.Object) "0") && c27056jnw.KWHzl != null && (!Intrinsics.EZpvd((java.lang.Object) c27056jnw.copydefault, (java.lang.Object) c27056jnw.AhwBna) || c27019jnL.copydefault())) {
            updateUI$default(c27056jnw, c27056jnw.copydefault, false, c27019jnL.copydefault(), 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        this.KWHzl = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(valueOf().getInvestWithTokenList(), 0);
        C25480ixX c25480ixXAEQbTJ = AEQbTJ(valueOf(), 0);
        if (c25480ixXAEQbTJ != null) {
            EZpvd().copydefault.AEQbTJ(c25480ixXAEQbTJ);
        }
    }

    private final void KWHzl() {
        final iHS ihsEZpvd = EZpvd();
        ihsEZpvd.copydefault.setTagAndDelayedTextWatcher(InvestUniv3SubscribeActivity.AmountInputIndex.First, new Function2() { // from class: o.jnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27056jnw.EZpvd(this.copydefault, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        ihsEZpvd.copydefault.setGetFocusCallback(new Function1() { // from class: o.jnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27056jnw.EZpvd(this.copydefault, (android.view.View) obj);
            }
        });
        ihsEZpvd.copydefault.setClickablePromptListener(new View.OnClickListener() { // from class: o.jny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27056jnw.KWHzl(this.KWHzl, ihsEZpvd, view);
            }
        });
        InvestUniv3SubscribeInfo investUniv3SubscribeInfoGEmmrt = AYXKKw().gEmmrt();
        if (investUniv3SubscribeInfoGEmmrt == null || !investUniv3SubscribeInfoGEmmrt.isSupportSwapSingle()) {
            return;
        }
        ihsEZpvd.copydefault.setTokenArrowIconVisible(true);
        ihsEZpvd.copydefault.setTokenClickCallback(new Function0() { // from class: o.jnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27056jnw.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final Unit EZpvd(C27056jnw c27056jnw, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        c27056jnw.copydefault = str;
        c27056jnw.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C27056jnw c27056jnw, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        c27056jnw.AYXKKw().KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C27056jnw c27056jnw, iHS ihs, android.view.View view) {
        java.lang.Object tag = view.getTag();
        kotlin.Pair pair = tag instanceof kotlin.Pair ? (kotlin.Pair) tag : null;
        if (pair == null) {
            return;
        }
        java.lang.Object objComponent1 = pair.component1();
        pair.component2();
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 2)) {
            InvestTokenWithAmount investTokenWithAmount = c27056jnw.KWHzl;
            if (investTokenWithAmount != null) {
                c27056jnw.AEQbTJ(investTokenWithAmount);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(objComponent1, (java.lang.Object) 1)) {
            c27056jnw.AYXKKw().KWHzl(true);
            InvestTokenWithAmount investTokenWithAmount2 = c27056jnw.KWHzl;
            if (investTokenWithAmount2 != null) {
                ihs.copydefault.AEQbTJ(c27056jnw.KWHzl(investTokenWithAmount2, false));
                ihs.copydefault.valueOf();
            }
        }
    }

    public static final Unit EZpvd(C27056jnw c27056jnw) {
        C26601jfR c26601jfRAEQbTJ = C26601jfR.Companion.AEQbTJ(new TokenSelectionParams(c27056jnw.valueOf().getInvestmentId(), c27056jnw.AYXKKw().accept(), c27056jnw.valueOf().getChainId(), TokenSelectionAction.Invest));
        androidx.fragment.app.FragmentManager childFragmentManager = c27056jnw.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26601jfRAEQbTJ.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
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

    public final void copydefault(java.lang.String str) {
        ZapInputState zapInputState;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            zapInputState = ZapInputState.EMPTY;
        } else {
            zapInputState = ZapInputState.HAS_INPUT;
        }
        this.djBIcL = zapInputState;
        if (zapInputState == ZapInputState.EMPTY) {
            EZpvd().copydefault.OLrzqt("0");
            EZpvd().OLrzqt.setVisibility(4);
            AYXKKw().KWHzl((InvestUniv3SubscribeReceiveInfo) null);
            AYXKKw().AEQbTJ((kotlin.Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo>) null);
            AYXKKw().OLrzqt((ResponseState) null);
            AYXKKw().gHZMYf().setValue("--");
            AYXKKw().QKVWgx().setValue(new C27024jnQ(null, YieldState.DASH));
            AYXKKw().iZzfmt().setValue(new C23962iPu(false, null, 2, null));
            this.AhwBna = null;
            return;
        }
        InvestTokenWithAmount investTokenWithAmount = this.KWHzl;
        if (investTokenWithAmount != null) {
            KWHzl(str, investTokenWithAmount);
        }
        updateUI$default(this, str, false, false, 6, null);
    }

    public final void KWHzl(java.lang.String str, InvestTokenWithAmount investTokenWithAmount) {
        try {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (bigDecimalEZpvd.compareTo(bigDecimal) > 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) investTokenWithAmount.getCurrencyAmount())) && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) investTokenWithAmount.getCoinAmount()))) {
                BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(investTokenWithAmount.getCoinAmount());
                if (bigDecimalEZpvd2.compareTo(bigDecimal) > 0) {
                    BigDecimal bigDecimalMultiply = bigDecimalEZpvd.multiply(C33129mqd.EZpvd(investTokenWithAmount.getCurrencyAmount()).divide(bigDecimalEZpvd2, 8, RoundingMode.HALF_UP));
                    C27300jsb c27300jsb = EZpvd().copydefault;
                    java.lang.String plainString = bigDecimalMultiply.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "");
                    c27300jsb.OLrzqt(plainString);
                    return;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        EZpvd().copydefault.OLrzqt("0");
    }

    public static /* synthetic */ void updateUI$default(C27056jnw c27056jnw, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c27056jnw.copydefault(str, z, z2);
    }

    public final void copydefault(java.lang.String str, boolean z, boolean z2) {
        InvestTokenWithAmount investTokenWithAmount;
        iHS ihsEZpvd = EZpvd();
        int i = Activity.copydefault[this.djBIcL.ordinal()];
        if (i == 1) {
            ihsEZpvd.OLrzqt.setVisibility(4);
            this.AhwBna = null;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if ((z2 || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.AhwBna)) && (investTokenWithAmount = this.KWHzl) != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SingleCryptoZapFragment$updateUI$1$1$1(ihsEZpvd, this, str, investTokenWithAmount, z, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.jnw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jnw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C27056jnw OLrzqt(@NotNull InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
            Intrinsics.checkNotNullParameter(investUniv3SubscribeInfo, "");
            C27056jnw c27056jnw = new C27056jnw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("args", investUniv3SubscribeInfo);
            c27056jnw.setArguments(bundle);
            return c27056jnw;
        }
    }

    @Override // o.InterfaceC26609jfZ
    public void OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (Intrinsics.EZpvd(this.KWHzl, investTokenWithAmount)) {
            return;
        }
        this.KWHzl = investTokenWithAmount;
        EZpvd().copydefault.AEQbTJ(KWHzl(investTokenWithAmount, true));
        this.AhwBna = null;
        this.copydefault = "0";
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) "0")) || Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "0")) {
            return;
        }
        copydefault(this.copydefault);
    }
}
