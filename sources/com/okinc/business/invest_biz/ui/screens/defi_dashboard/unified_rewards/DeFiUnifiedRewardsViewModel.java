package com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23646iEb;
import o.C24193iYi;
import o.C26356jal;
import o.C26536jeF;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25524iyO;
import o.InterfaceC26557jea;
import o.InterfaceC27436jvE;
import o.iEM;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiUnifiedRewardsViewModel extends ViewModel implements InterfaceC25524iyO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C26536jeF AEQbTJ;
    public DeFiUnifiedRewardsParams OLrzqt;
    public final iEM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull DeFiUnifiedRewardsParams deFiUnifiedRewardsParams) {
        Intrinsics.checkNotNullParameter(deFiUnifiedRewardsParams, "");
        this.OLrzqt = deFiUnifiedRewardsParams;
    }

    @yCM
    public DeFiUnifiedRewardsViewModel(@NotNull iEM iem, @NotNull C26536jeF c26536jeF) {
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(c26536jeF, "");
        this.copydefault = iem;
        this.AEQbTJ = c26536jeF;
    }

    public final C26356jal EZpvd(@NotNull DeFiUnifiedRewardsParams deFiUnifiedRewardsParams) {
        Intrinsics.checkNotNullParameter(deFiUnifiedRewardsParams, "");
        if (deFiUnifiedRewardsParams.getAllRewards().size() != 1) {
            return null;
        }
        return OLrzqt((UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.AuCTelauCTel(deFiUnifiedRewardsParams.getAllRewards()), true);
    }

    public static /* synthetic */ List buildListItems$default(DeFiUnifiedRewardsViewModel deFiUnifiedRewardsViewModel, DeFiUnifiedRewardsParams deFiUnifiedRewardsParams, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return deFiUnifiedRewardsViewModel.EZpvd(deFiUnifiedRewardsParams, z);
    }

    public final List<InterfaceC27436jvE> EZpvd(@NotNull DeFiUnifiedRewardsParams deFiUnifiedRewardsParams, boolean z) {
        Intrinsics.checkNotNullParameter(deFiUnifiedRewardsParams, "");
        List<UnifiedRewardInfoByInvestment> allRewards = deFiUnifiedRewardsParams.getAllRewards();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allRewards.iterator();
        while (it.hasNext()) {
            C26356jal c26356jalOLrzqt = OLrzqt((UnifiedRewardInfoByInvestment) it.next(), z);
            if (c26356jalOLrzqt != null) {
                arrayList.add(c26356jalOLrzqt);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ C26356jal mapRewardToSection$default(DeFiUnifiedRewardsViewModel deFiUnifiedRewardsViewModel, UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return deFiUnifiedRewardsViewModel.OLrzqt(unifiedRewardInfoByInvestment, z);
    }

    public final C26356jal OLrzqt(UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment, boolean z) {
        List<InvestUserRewardElementInfo> baseDefiTokenInfos = unifiedRewardInfoByInvestment.getBaseDefiTokenInfos();
        if (baseDefiTokenInfos == null || baseDefiTokenInfos.isEmpty()) {
            return null;
        }
        boolean z2 = (unifiedRewardInfoByInvestment.getButtonType() == ButtonType.CLAIM_TYPE_NO_NEED_SHOW || C24193iYi.OLrzqt.AEQbTJ() || z) ? false : true;
        RewardType rewardType = unifiedRewardInfoByInvestment.getRewardType();
        ButtonType buttonType = unifiedRewardInfoByInvestment.getButtonType();
        InvestAction investActionEZpvd = C23646iEb.EZpvd(unifiedRewardInfoByInvestment.getRewardType());
        InvestUserRewardsAction claimMode = unifiedRewardInfoByInvestment.getClaimMode();
        String callDataExtJson = unifiedRewardInfoByInvestment.getCallDataExtJson();
        InvestUserAssetDetailClaimPromptInformation extraData = unifiedRewardInfoByInvestment.getExtraData();
        Long chainId = unifiedRewardInfoByInvestment.getChainId();
        return new C26356jal(rewardType, baseDefiTokenInfos, buttonType, investActionEZpvd, claimMode, callDataExtJson, z2, z, extraData, chainId != null ? chainId.longValue() : 0L, unifiedRewardInfoByInvestment.getInvestmentId(), unifiedRewardInfoByInvestment.getNetwork(), unifiedRewardInfoByInvestment.getInvestmentCategory());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) throws Throwable {
        DeFiUnifiedRewardsViewModel$getOktStakingDetail$1 deFiUnifiedRewardsViewModel$getOktStakingDetail$1;
        if (continuation instanceof DeFiUnifiedRewardsViewModel$getOktStakingDetail$1) {
            deFiUnifiedRewardsViewModel$getOktStakingDetail$1 = (DeFiUnifiedRewardsViewModel$getOktStakingDetail$1) continuation;
            int i = deFiUnifiedRewardsViewModel$getOktStakingDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiUnifiedRewardsViewModel$getOktStakingDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiUnifiedRewardsViewModel$getOktStakingDetail$1 = new DeFiUnifiedRewardsViewModel$getOktStakingDetail$1(this, continuation);
            }
        }
        Object obj = deFiUnifiedRewardsViewModel$getOktStakingDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiUnifiedRewardsViewModel$getOktStakingDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iEM iem = this.copydefault;
        deFiUnifiedRewardsViewModel$getOktStakingDetail$1.label = 1;
        Object objEZpvd = iem.EZpvd(j, deFiUnifiedRewardsViewModel$getOktStakingDetail$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) throws Throwable {
        DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1 deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1;
        if (continuation instanceof DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1) {
            deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1 = (DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1) continuation;
            int i = deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1 = new DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1(this, continuation);
            }
        }
        DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1 deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$12 = deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1;
        Object obj = deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        iEM iem = this.copydefault;
        deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$12.label = 1;
        Object objOLrzqt = iem.OLrzqt(j, j2, deFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$12);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC26557jea>> continuation) throws Throwable {
        DeFiUnifiedRewardsViewModel$checkEligibility$1 deFiUnifiedRewardsViewModel$checkEligibility$1;
        if (continuation instanceof DeFiUnifiedRewardsViewModel$checkEligibility$1) {
            deFiUnifiedRewardsViewModel$checkEligibility$1 = (DeFiUnifiedRewardsViewModel$checkEligibility$1) continuation;
            int i = deFiUnifiedRewardsViewModel$checkEligibility$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiUnifiedRewardsViewModel$checkEligibility$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiUnifiedRewardsViewModel$checkEligibility$1 = new DeFiUnifiedRewardsViewModel$checkEligibility$1(this, continuation);
            }
        }
        Object obj = deFiUnifiedRewardsViewModel$checkEligibility$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiUnifiedRewardsViewModel$checkEligibility$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C26536jeF c26536jeF = this.AEQbTJ;
        deFiUnifiedRewardsViewModel$checkEligibility$1.label = 1;
        Object objKWHzl = c26536jeF.KWHzl(productDetailsByChain, z, deFiUnifiedRewardsViewModel$checkEligibility$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    @Override // o.InterfaceC25524iyO
    public Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Long> continuation) {
        DeFiUnifiedRewardsParams deFiUnifiedRewardsParams = this.OLrzqt;
        if (deFiUnifiedRewardsParams != null) {
            return C56443yFo.KWHzl(deFiUnifiedRewardsParams.getAnalysisPlatformId());
        }
        return null;
    }

    @Override // o.InterfaceC25524iyO
    public Object EZpvd(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Long> continuation) {
        return C56443yFo.KWHzl(j);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards.DeFiUnifiedRewardsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean AEQbTJ(@NotNull DeFiUnifiedRewardsParams deFiUnifiedRewardsParams) {
            UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment;
            List<InvestUserRewardElementInfo> baseDefiTokenInfos;
            Intrinsics.checkNotNullParameter(deFiUnifiedRewardsParams, "");
            List<UnifiedRewardInfoByInvestment> allRewards = deFiUnifiedRewardsParams.getAllRewards();
            if (allRewards == null || allRewards.isEmpty() || deFiUnifiedRewardsParams.getAllRewards().size() != 1 || (baseDefiTokenInfos = (unifiedRewardInfoByInvestment = (UnifiedRewardInfoByInvestment) CollectionsKt___CollectionsKt.AuCTelauCTel(deFiUnifiedRewardsParams.getAllRewards())).getBaseDefiTokenInfos()) == null || baseDefiTokenInfos.isEmpty()) {
                return false;
            }
            if (unifiedRewardInfoByInvestment.getButtonType() != ButtonType.CLAIM_TYPE_ENABLE) {
                List<InvestUserRewardElementInfo> baseDefiTokenInfos2 = unifiedRewardInfoByInvestment.getBaseDefiTokenInfos();
                if (baseDefiTokenInfos2 == null) {
                    return false;
                }
                if (!baseDefiTokenInfos2.isEmpty()) {
                    Iterator<T> it = baseDefiTokenInfos2.iterator();
                    while (it.hasNext()) {
                        if (((InvestUserRewardElementInfo) it.next()).getButtonType() != ButtonType.CLAIM_TYPE_ENABLE) {
                            return false;
                        }
                    }
                }
            }
            return !C24193iYi.OLrzqt.AEQbTJ();
        }
    }
}
