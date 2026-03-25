package o;

import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.page.dialog.MerklClaimReminderParams;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$proceedToClaim$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.handler.ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C24117iVn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26566jej {
    public final C25528iyS AEQbTJ;
    public final InterfaceC25527iyR AhwBna;
    public final ProductDetailsByChain EZpvd;
    public final InterfaceC25466ixJ KWHzl;
    public final C26534jeD OLrzqt;
    public RewardType copydefault;
    public final InterfaceC25524iyO gEmmrt;

    /* JADX INFO: renamed from: o.jej$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestUserRewardsAction.values().length];
            try {
                iArr[InvestUserRewardsAction.STOKT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestUserRewardsAction.LSD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestUserRewardsAction.MERKL_BONUS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestUserRewardsAction.COMMON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public C26566jej(@NotNull ProductDetailsByChain productDetailsByChain, @NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull InterfaceC25524iyO interfaceC25524iyO, C26534jeD c26534jeD, C25528iyS c25528iyS, InterfaceC25527iyR interfaceC25527iyR) {
        Intrinsics.checkNotNullParameter(productDetailsByChain, "");
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(interfaceC25524iyO, "");
        this.EZpvd = productDetailsByChain;
        this.KWHzl = interfaceC25466ixJ;
        this.gEmmrt = interfaceC25524iyO;
        this.OLrzqt = c26534jeD;
        this.AEQbTJ = c25528iyS;
        this.AhwBna = interfaceC25527iyR;
    }

    public final android.content.Context djBIcL() {
        return this.KWHzl.AEQbTJ();
    }

    public final java.lang.Object EZpvd(@NotNull InvestAction investAction, @NotNull InvestUserRewardsAction investUserRewardsAction, java.lang.String str, @NotNull java.util.List<InvestUserRewardElementInfo> list, @NotNull RewardType rewardType, java.lang.Long l, java.lang.Long l2, java.lang.String str2, InvestmentKind investmentKind, boolean z, Function0<Unit> function0, Function0<Unit> function02, @NotNull Continuation<? super Unit> continuation) {
        this.copydefault = rewardType;
        ProductDetailsByChain productDetailsByChain = this.EZpvd;
        ProductDetailsByChain productDetailsByChainEZpvd = productDetailsByChain.EZpvd((248 & 1) != 0 ? productDetailsByChain.OLrzqt : l2 != null ? l2.longValue() : productDetailsByChain.OLrzqt(), (248 & 2) != 0 ? productDetailsByChain.KWHzl : investmentKind == null ? this.EZpvd.KWHzl() : investmentKind, (248 & 4) != 0 ? productDetailsByChain.EZpvd : new ChainInfo(l != null ? l.longValue() : this.EZpvd.AEQbTJ().OLrzqt(), str2 == null ? this.EZpvd.AEQbTJ().EZpvd() : str2, null, null, null, 28, null), (248 & 8) != 0 ? productDetailsByChain.AEQbTJ : false, (248 & 16) != 0 ? productDetailsByChain.djBIcL : null, (248 & 32) != 0 ? productDetailsByChain.AhwBna : null, (248 & 64) != 0 ? productDetailsByChain.gEmmrt : null, (248 & 128) != 0 ? productDetailsByChain.copydefault : false);
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        int i = TaskDescription.KWHzl[investUserRewardsAction.ordinal()];
        if (i == 1) {
            InvestUserRewardElementInfo investUserRewardElementInfo = (InvestUserRewardElementInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (investUserRewardElementInfo != null) {
                java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
                KWHzl(investAction, tokenSymbol, c56434yFf, productDetailsByChainEZpvd, z, function0, function02);
            }
        } else if (i == 2) {
            InvestUserRewardElementInfo investUserRewardElementInfo2 = (InvestUserRewardElementInfo) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (investUserRewardElementInfo2 != null) {
                AEQbTJ(investAction, investUserRewardElementInfo2, c56434yFf, productDetailsByChainEZpvd, z, function0, function02);
            }
        } else if (i == 3) {
            handleMerklBonusClaim$default(this, investAction, list, str != null ? new C25477ixU(null, null, null, str, 7, null) : null, c56434yFf, productDetailsByChainEZpvd, null, function0, function02, 32, null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            showClaimBottomSheet$default(this, investAction, list, str != null ? new C25477ixU(null, null, null, str, 7, null) : null, c56434yFf, productDetailsByChainEZpvd, z, null, function0, function02, 64, null);
        }
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.jej */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleMerklBonusClaim$default(C26566jej c26566jej, InvestAction investAction, java.util.List list, C25477ixU c25477ixU, Continuation continuation, ProductDetailsByChain productDetailsByChain, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        c26566jej.copydefault(investAction, list, (i & 4) != 0 ? null : c25477ixU, continuation, productDetailsByChain, (i & 32) != 0 ? new Function0() { // from class: o.jei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26566jej.valueOf();
            }
        } : function0, (i & 64) != 0 ? null : function02, (i & 128) != 0 ? null : function03);
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public final void copydefault(final InvestAction investAction, final java.util.List<InvestUserRewardElementInfo> list, final C25477ixU c25477ixU, final Continuation<? super Unit> continuation, final ProductDetailsByChain productDetailsByChain, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        C24117iVn.StateListAnimator stateListAnimator = C24117iVn.Companion;
        long jOLrzqt = productDetailsByChain.OLrzqt();
        long jOLrzqt2 = productDetailsByChain.AEQbTJ().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestUserRewardElementInfo) it.next()).getTokenAddress());
        }
        final C24117iVn c24117iVnAEQbTJ = stateListAnimator.AEQbTJ(new MerklClaimReminderParams(java.lang.String.valueOf(jOLrzqt), jOLrzqt2, CollectionsKt___CollectionsKt.QfsBiF(arrayList)));
        c24117iVnAEQbTJ.EZpvd(new Function0() { // from class: o.jem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26566jej.EZpvd(this.EZpvd, investAction, list, c25477ixU, continuation, productDetailsByChain, function02, function03, c24117iVnAEQbTJ, function0);
            }
        });
        c24117iVnAEQbTJ.KWHzl(new Function0() { // from class: o.jep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26566jej.EZpvd();
            }
        });
        c24117iVnAEQbTJ.show(this.KWHzl.getParentFragmentManager());
    }

    public static final Unit EZpvd(C26566jej c26566jej, InvestAction investAction, java.util.List list, C25477ixU c25477ixU, Continuation continuation, ProductDetailsByChain productDetailsByChain, Function0 function0, Function0 function02, final C24117iVn c24117iVn, final Function0 function03) {
        showClaimBottomSheet$default(c26566jej, investAction, list, c25477ixU, continuation, productDetailsByChain, false, new Function0() { // from class: o.jek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26566jej.KWHzl(c24117iVn, function03);
            }
        }, function0, function02, 32, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C24117iVn c24117iVn, Function0 function0) {
        c24117iVn.dismiss();
        Unit unit = Unit.INSTANCE;
        function0.invoke();
        return unit;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void KWHzl(InvestAction investAction, java.lang.String str, Continuation<? super Unit> continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        CoroutineScope coroutineScopeAhwBna = this.KWHzl.AhwBna();
        if (coroutineScopeAhwBna != null) {
            C27493jwI.safeLaunch$default(coroutineScopeAhwBna, null, null, new ProductDetailsFeesAndRewardsHandler$handleOktStakingClaim$1(this, productDetailsByChain, investAction, continuation, z, function0, function02, str, null), 3, null);
        }
    }

    public final void AEQbTJ(InvestAction investAction, InvestUserRewardElementInfo investUserRewardElementInfo, Continuation<? super Unit> continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        CoroutineScope coroutineScopeAhwBna = this.KWHzl.AhwBna();
        if (coroutineScopeAhwBna != null) {
            C27493jwI.safeLaunch$default(coroutineScopeAhwBna, null, null, new ProductDetailsFeesAndRewardsHandler$handleLsdBatchClaim$1(this, productDetailsByChain, investAction, investUserRewardElementInfo, continuation, z, function0, function02, null), 3, null);
        }
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.jej */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showClaimBottomSheet$default(C26566jej c26566jej, InvestAction investAction, java.util.List list, C25477ixU c25477ixU, Continuation continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0 function0, Function0 function02, Function0 function03, int i, java.lang.Object obj) {
        c26566jej.EZpvd(investAction, list, (i & 4) != 0 ? null : c25477ixU, continuation, productDetailsByChain, (i & 32) != 0 ? false : z, (i & 64) != 0 ? new Function0() { // from class: o.jeo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26566jej.AhwBna();
            }
        } : function0, (i & 128) != 0 ? null : function02, (i & 256) != 0 ? null : function03);
    }

    public final void EZpvd(InvestAction investAction, java.util.List<InvestUserRewardElementInfo> list, C25477ixU c25477ixU, Continuation<? super Unit> continuation, ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        CoroutineScope coroutineScopeAhwBna = this.KWHzl.AhwBna();
        if (coroutineScopeAhwBna != null) {
            C27493jwI.safeLaunch$default(coroutineScopeAhwBna, null, null, new ProductDetailsFeesAndRewardsHandler$showClaimBottomSheet$2(this, productDetailsByChain, continuation, investAction, list, c25477ixU, function0, z, function03, function02, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InvestAction investAction, java.util.List<InvestUserRewardElementInfo> list, C25477ixU c25477ixU, Function0<Unit> function0, ProductDetailsByChain productDetailsByChain, boolean z, Function0<Unit> function02, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ProductDetailsFeesAndRewardsHandler$proceedToClaim$1 productDetailsFeesAndRewardsHandler$proceedToClaim$1;
        InvestAction investAction2;
        java.util.List<InvestUserRewardElementInfo> list2;
        C25477ixU c25477ixU2;
        final Function0<Unit> function03;
        boolean z2;
        ProductDetailsByChain productDetailsByChain2;
        final Function0<Unit> function04;
        final C26566jej c26566jej;
        java.lang.Long l;
        java.lang.Long l2;
        java.util.List<InvestUserRewardElementInfo> list3;
        C25477ixU c25477ixU3;
        java.lang.Long l3;
        Function0<Unit> function05;
        ProductDetailsByChain productDetailsByChain3;
        C25477ixU c25477ixU4;
        Function0<Unit> function06;
        C26566jej c26566jej2;
        InvestAction investAction3;
        java.util.List<InvestUserRewardElementInfo> list4;
        java.util.List listEZpvd;
        if (continuation instanceof ProductDetailsFeesAndRewardsHandler$proceedToClaim$1) {
            productDetailsFeesAndRewardsHandler$proceedToClaim$1 = (ProductDetailsFeesAndRewardsHandler$proceedToClaim$1) continuation;
            int i = productDetailsFeesAndRewardsHandler$proceedToClaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsFeesAndRewardsHandler$proceedToClaim$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsFeesAndRewardsHandler$proceedToClaim$1 = new ProductDetailsFeesAndRewardsHandler$proceedToClaim$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = productDetailsFeesAndRewardsHandler$proceedToClaim$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsFeesAndRewardsHandler$proceedToClaim$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (this.AEQbTJ == null) {
                return Unit.INSTANCE;
            }
            InterfaceC25524iyO interfaceC25524iyO = this.gEmmrt;
            long jOLrzqt = productDetailsByChain.OLrzqt();
            InvestmentKind investmentKindKWHzl = productDetailsByChain.KWHzl();
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$0 = this;
            investAction2 = investAction;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$1 = investAction2;
            list2 = list;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$2 = list2;
            c25477ixU2 = c25477ixU;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$3 = c25477ixU2;
            function03 = function0;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$4 = function03;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$5 = productDetailsByChain;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$6 = function02;
            z2 = z;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.Z$0 = z2;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.label = 1;
            objKWHzl = interfaceC25524iyO.KWHzl(jOLrzqt, investmentKindKWHzl, productDetailsFeesAndRewardsHandler$proceedToClaim$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            productDetailsByChain2 = productDetailsByChain;
            function04 = function02;
            c26566jej = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l3 = (java.lang.Long) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$7;
                function05 = (Function0) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$6;
                productDetailsByChain3 = (ProductDetailsByChain) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$5;
                function06 = (Function0) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$4;
                c25477ixU4 = (C25477ixU) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$3;
                list4 = (java.util.List) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$2;
                investAction3 = (InvestAction) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$1;
                c26566jej2 = (C26566jej) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                l2 = (java.lang.Long) objKWHzl;
                c26566jej = c26566jej2;
                l = l3;
                function03 = function06;
                c25477ixU3 = c25477ixU4;
                list3 = list4;
                investAction2 = investAction3;
                function04 = function05;
                productDetailsByChain2 = productDetailsByChain3;
                if (productDetailsByChain2.OLrzqt() == 0) {
                    listEZpvd = yDY.AhwBna();
                } else {
                    listEZpvd = C56402yEa.EZpvd(C56443yFo.KWHzl(productDetailsByChain2.OLrzqt()));
                }
                java.util.List list5 = listEZpvd;
                long jOLrzqt2 = productDetailsByChain2.AEQbTJ().OLrzqt();
                int value = investAction2.getValue();
                RewardType rewardType = c26566jej.copydefault;
                c26566jej.AEQbTJ.EZpvd(c26566jej.KWHzl, new C25523iyN(jOLrzqt2, value, list3, rewardType == RewardType.MARKET || rewardType == RewardType.AVAILABLE_REWARD, l, l2, list5, c25477ixU3), new Function1() { // from class: o.jeg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C26566jej.EZpvd(this.EZpvd, function03, function04, (InterfaceC25530iyU) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            boolean z3 = productDetailsFeesAndRewardsHandler$proceedToClaim$1.Z$0;
            function04 = (Function0) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$6;
            productDetailsByChain2 = (ProductDetailsByChain) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$5;
            Function0<Unit> function07 = (Function0) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$4;
            C25477ixU c25477ixU5 = (C25477ixU) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$3;
            java.util.List<InvestUserRewardElementInfo> list6 = (java.util.List) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$2;
            InvestAction investAction4 = (InvestAction) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$1;
            c26566jej = (C26566jej) productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            z2 = z3;
            function03 = function07;
            investAction2 = investAction4;
            c25477ixU2 = c25477ixU5;
            list2 = list6;
        }
        java.lang.Long l4 = (java.lang.Long) objKWHzl;
        if (z2) {
            InterfaceC25524iyO interfaceC25524iyO2 = c26566jej.gEmmrt;
            long jOLrzqt3 = productDetailsByChain2.OLrzqt();
            InvestmentKind investmentKindKWHzl2 = productDetailsByChain2.KWHzl();
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$0 = c26566jej;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$1 = investAction2;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$2 = list2;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$3 = c25477ixU2;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$4 = function03;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$5 = productDetailsByChain2;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$6 = function04;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.L$7 = l4;
            productDetailsFeesAndRewardsHandler$proceedToClaim$1.label = 2;
            java.lang.Object objEZpvd = interfaceC25524iyO2.EZpvd(jOLrzqt3, investmentKindKWHzl2, productDetailsFeesAndRewardsHandler$proceedToClaim$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            l3 = l4;
            objKWHzl = objEZpvd;
            function05 = function04;
            productDetailsByChain3 = productDetailsByChain2;
            c25477ixU4 = c25477ixU2;
            function06 = function03;
            c26566jej2 = c26566jej;
            java.util.List<InvestUserRewardElementInfo> list7 = list2;
            investAction3 = investAction2;
            list4 = list7;
            l2 = (java.lang.Long) objKWHzl;
            c26566jej = c26566jej2;
            l = l3;
            function03 = function06;
            c25477ixU3 = c25477ixU4;
            list3 = list4;
            investAction2 = investAction3;
            function04 = function05;
            productDetailsByChain2 = productDetailsByChain3;
            if (productDetailsByChain2.OLrzqt() == 0) {
            }
            java.util.List list52 = listEZpvd;
            long jOLrzqt22 = productDetailsByChain2.AEQbTJ().OLrzqt();
            int value2 = investAction2.getValue();
            RewardType rewardType2 = c26566jej.copydefault;
            c26566jej.AEQbTJ.EZpvd(c26566jej.KWHzl, new C25523iyN(jOLrzqt22, value2, list3, rewardType2 == RewardType.MARKET || rewardType2 == RewardType.AVAILABLE_REWARD, l, l2, list52, c25477ixU3), new Function1() { // from class: o.jeg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26566jej.EZpvd(this.EZpvd, function03, function04, (InterfaceC25530iyU) obj);
                }
            });
            return Unit.INSTANCE;
        }
        l = l4;
        l2 = null;
        list3 = list2;
        c25477ixU3 = c25477ixU2;
        if (productDetailsByChain2.OLrzqt() == 0) {
        }
        java.util.List list522 = listEZpvd;
        long jOLrzqt222 = productDetailsByChain2.AEQbTJ().OLrzqt();
        int value22 = investAction2.getValue();
        RewardType rewardType22 = c26566jej.copydefault;
        c26566jej.AEQbTJ.EZpvd(c26566jej.KWHzl, new C25523iyN(jOLrzqt222, value22, list3, rewardType22 == RewardType.MARKET || rewardType22 == RewardType.AVAILABLE_REWARD, l, l2, list522, c25477ixU3), new Function1() { // from class: o.jeg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26566jej.EZpvd(this.EZpvd, function03, function04, (InterfaceC25530iyU) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C26566jej c26566jej, Function0 function0, Function0 function02, InterfaceC25530iyU interfaceC25530iyU) {
        Intrinsics.checkNotNullParameter(interfaceC25530iyU, "");
        InterfaceC25527iyR interfaceC25527iyR = c26566jej.AhwBna;
        if (interfaceC25527iyR != null) {
            interfaceC25527iyR.copydefault(interfaceC25530iyU);
        }
        function0.invoke();
        if (function02 != null) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
