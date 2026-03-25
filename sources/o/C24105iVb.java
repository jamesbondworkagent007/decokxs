package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24105iVb extends iTL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public iKG EZpvd;
    public final boolean OLrzqt;
    public iJO djBIcL;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iVc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C24105iVb.OLrzqt(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iVg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24105iVb.AEQbTJ(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.iVb$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
    public final void OLrzqt(@NotNull iJO ijo) {
        Intrinsics.checkNotNullParameter(ijo, "");
        this.djBIcL = ijo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull iKG ikg) {
        Intrinsics.checkNotNullParameter(ikg, "");
        this.EZpvd = ikg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.iVb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C24105iVb newInstance$default(TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return taskDescription.KWHzl(i);
        }

        public final C24105iVb KWHzl(int i) {
            C24105iVb c24105iVb = new C24105iVb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type_invest", i);
            c24105iVb.setArguments(bundle);
            return c24105iVb;
        }
    }

    public final iKG copydefault() {
        iKG ikg = this.EZpvd;
        if (ikg != null) {
            return ikg;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iJO EZpvd() {
        iJO ijo = this.djBIcL;
        if (ijo != null) {
            return ijo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final int KWHzl() {
        return ((java.lang.Number) this.AhwBna.getValue()).intValue();
    }

    public static final int OLrzqt(C24105iVb c24105iVb) {
        android.os.Bundle arguments = c24105iVb.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final InterfaceC27092jof OLrzqt() {
        return (InterfaceC27092jof) this.copydefault.getValue();
    }

    public static final InterfaceC27092jof AEQbTJ(C24105iVb c24105iVb) {
        java.lang.Object obj;
        if (c24105iVb.KWHzl() == 4) {
            FragmentActivity fragmentActivityRequireActivity = c24105iVb.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity).get(InvestUniv3FarmSubscribeViewModel.class);
        } else if (c24105iVb.KWHzl() == 5) {
            FragmentActivity fragmentActivityRequireActivity2 = c24105iVb.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity2).get(InvestUniv3FarmRedeemViewModel.class);
        } else {
            FragmentActivity fragmentActivityRequireActivity3 = c24105iVb.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity3).get(InvestUniv3FarmRedeemViewModel.class);
        }
        return (InterfaceC27092jof) obj;
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        copydefault(iKG.AEQbTJ(android.view.LayoutInflater.from(getContext())));
        android.widget.FrameLayout root = copydefault().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OLrzqt(iJO.AEQbTJ(android.view.LayoutInflater.from(getContext())));
        android.widget.ImageView imageView = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        EZpvd().AEQbTJ.setText(getString(C25493ixk.FragmentManager.invokespecialsiEkQe));
        android.widget.LinearLayout root = EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.iVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C24105iVb.copydefault(this.copydefault, view2);
            }
        });
        OLrzqt().getNewProxyInstance().observe(this, new Application(new Function1() { // from class: o.iVd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24105iVb.KWHzl(this.AEQbTJ, (C23960iPs) obj);
            }
        }));
    }

    public static final void copydefault(C24105iVb c24105iVb, android.view.View view) {
        c24105iVb.dismissAllowingStateLoss();
    }

    public static final Unit KWHzl(C24105iVb c24105iVb, C23960iPs c23960iPs) {
        Intrinsics.copydefault(c23960iPs);
        c24105iVb.KWHzl(c23960iPs);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C23960iPs c23960iPs) {
        InvestTokenWithAmount investTokenWithAmount;
        InvestTokenWithAmount investTokenWithAmount2;
        InvestTokenWithAmount investTokenWithAmount3;
        InvestTokenWithAmount investTokenWithAmount4;
        C27224jrE c27224jrE = copydefault().AEQbTJ;
        java.lang.String string = getString(C25493ixk.FragmentManager.invokespecialatDTRm);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C27224jrE.setTitle$default(c27224jrE, string, null, null, 6, null);
        java.util.List<InvestTokenWithAmount> listOLrzqt = c23960iPs.OLrzqt();
        if (listOLrzqt != null) {
            C27224jrE c27224jrE2 = copydefault().AEQbTJ;
            if (!listOLrzqt.isEmpty()) {
                InvestTokenWithAmount investTokenWithAmount5 = listOLrzqt.get(0);
                investTokenWithAmount3 = investTokenWithAmount5.copy((268435455 & 1) != 0 ? investTokenWithAmount5.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount5.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount5.currencyAmount : "", (268435455 & 8) != 0 ? investTokenWithAmount5.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount5.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount5.network : null, (268435455 & 64) != 0 ? investTokenWithAmount5.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount5.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount5.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount5.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount5.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount5.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount5.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount5.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount5.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount5.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount5.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount5.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount5.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount5.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount5.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount5.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount5.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount5.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount5.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount5.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount5.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount5.tokenPrice : null);
            } else {
                investTokenWithAmount3 = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
            }
            if (listOLrzqt.size() > 1) {
                InvestTokenWithAmount investTokenWithAmount6 = listOLrzqt.get(1);
                investTokenWithAmount4 = investTokenWithAmount6.copy((268435455 & 1) != 0 ? investTokenWithAmount6.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount6.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount6.currencyAmount : "", (268435455 & 8) != 0 ? investTokenWithAmount6.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount6.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount6.network : null, (268435455 & 64) != 0 ? investTokenWithAmount6.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount6.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount6.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount6.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount6.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount6.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount6.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount6.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount6.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount6.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount6.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount6.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount6.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount6.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount6.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount6.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount6.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount6.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount6.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount6.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount6.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount6.tokenPrice : null);
            } else {
                investTokenWithAmount4 = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
            }
            c27224jrE2.setData(investTokenWithAmount3, investTokenWithAmount4, c23960iPs.AYXKKw(), c23960iPs.gEmmrt());
        }
        C27224jrE c27224jrE3 = copydefault().KWHzl;
        java.lang.String string2 = getString(C25493ixk.FragmentManager.GQzpsZgQzpsZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        C27224jrE.setTitle$default(c27224jrE3, string2, null, null, 6, null);
        java.util.List<InvestTokenWithAmount> listCopydefault = c23960iPs.copydefault();
        if (listCopydefault != null) {
            C27224jrE c27224jrE4 = copydefault().KWHzl;
            if (!listCopydefault.isEmpty()) {
                InvestTokenWithAmount investTokenWithAmount7 = listCopydefault.get(0);
                investTokenWithAmount = investTokenWithAmount7.copy((268435455 & 1) != 0 ? investTokenWithAmount7.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount7.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount7.currencyAmount : "", (268435455 & 8) != 0 ? investTokenWithAmount7.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount7.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount7.network : null, (268435455 & 64) != 0 ? investTokenWithAmount7.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount7.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount7.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount7.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount7.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount7.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount7.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount7.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount7.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount7.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount7.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount7.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount7.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount7.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount7.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount7.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount7.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount7.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount7.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount7.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount7.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount7.tokenPrice : null);
            } else {
                investTokenWithAmount = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
            }
            if (listCopydefault.size() > 1) {
                InvestTokenWithAmount investTokenWithAmount8 = listCopydefault.get(1);
                investTokenWithAmount2 = investTokenWithAmount8.copy((268435455 & 1) != 0 ? investTokenWithAmount8.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount8.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount8.currencyAmount : "", (268435455 & 8) != 0 ? investTokenWithAmount8.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount8.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount8.network : null, (268435455 & 64) != 0 ? investTokenWithAmount8.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount8.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount8.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount8.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount8.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount8.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount8.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount8.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount8.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount8.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount8.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount8.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount8.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount8.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount8.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount8.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount8.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount8.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount8.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount8.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount8.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount8.tokenPrice : null);
            } else {
                investTokenWithAmount2 = new InvestTokenWithAmount(0L, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268435455, (DefaultConstructorMarker) null);
            }
            c27224jrE4.setData(investTokenWithAmount, investTokenWithAmount2, c23960iPs.AYXKKw(), c23960iPs.gEmmrt());
        }
    }
}
