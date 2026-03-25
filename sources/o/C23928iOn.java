package o;

import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniAssetDetailRepo$getStoredBonusData$1;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniAssetDetailRepo$getStoredPositionData$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23928iOn extends C23932iOr implements iYN {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC23589iBz EZpvd;
    public final iEY KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C23928iOn(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEY iey, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23589iBz, iey, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(iey, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23589iBz;
        this.KWHzl = iey;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, @NotNull RewardType rewardType, @NotNull Continuation<? super Result<AssetBottomSheetData.BonusBottomSheetData>> continuation) throws java.lang.Throwable {
        DeFiMiniAssetDetailRepo$getStoredBonusData$1 deFiMiniAssetDetailRepo$getStoredBonusData$1;
        java.lang.Object objCopydefault;
        java.util.List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo;
        if (continuation instanceof DeFiMiniAssetDetailRepo$getStoredBonusData$1) {
            deFiMiniAssetDetailRepo$getStoredBonusData$1 = (DeFiMiniAssetDetailRepo$getStoredBonusData$1) continuation;
            int i = deFiMiniAssetDetailRepo$getStoredBonusData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniAssetDetailRepo$getStoredBonusData$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniAssetDetailRepo$getStoredBonusData$1 = new DeFiMiniAssetDetailRepo$getStoredBonusData$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniAssetDetailRepo$getStoredBonusData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deFiMiniAssetDetailRepo$getStoredBonusData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniAssetDetailRepo$getStoredBonusData$1.L$0 = rewardType;
            deFiMiniAssetDetailRepo$getStoredBonusData$1.label = 1;
            objCopydefault = copydefault(j, deFiMiniAssetDetailRepo$getStoredBonusData$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rewardType = (RewardType) deFiMiniAssetDetailRepo$getStoredBonusData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        java.util.List list = null;
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) objCopydefault;
        if (investUserAssetDetailByInvestment != null && (rewardDefiTokenInfo = investUserAssetDetailByInvestment.getRewardDefiTokenInfo()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj2 : rewardDefiTokenInfo) {
                RewardType rewardType2 = ((InvestUserRewardInfoByInvestment) obj2).getRewardType();
                java.lang.Object arrayList = linkedHashMap.get(rewardType2);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(rewardType2, arrayList);
                }
                ((java.util.List) arrayList).add(obj2);
            }
            list = (java.util.List) linkedHashMap.get(rewardType);
        }
        if (list != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(new AssetBottomSheetData.BonusBottomSheetData(list));
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iYN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j2, long j3, @NotNull Continuation<? super Result<AssetBottomSheetData.PositionBottomSheetData>> continuation) throws java.lang.Throwable {
        DeFiMiniAssetDetailRepo$getStoredPositionData$1 deFiMiniAssetDetailRepo$getStoredPositionData$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof DeFiMiniAssetDetailRepo$getStoredPositionData$1) {
            deFiMiniAssetDetailRepo$getStoredPositionData$1 = (DeFiMiniAssetDetailRepo$getStoredPositionData$1) continuation;
            int i = deFiMiniAssetDetailRepo$getStoredPositionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniAssetDetailRepo$getStoredPositionData$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniAssetDetailRepo$getStoredPositionData$1 = new DeFiMiniAssetDetailRepo$getStoredPositionData$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniAssetDetailRepo$getStoredPositionData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deFiMiniAssetDetailRepo$getStoredPositionData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniAssetDetailRepo$getStoredPositionData$1.L$0 = str;
            deFiMiniAssetDetailRepo$getStoredPositionData$1.label = 1;
            objCopydefault = copydefault(j, deFiMiniAssetDetailRepo$getStoredPositionData$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) deFiMiniAssetDetailRepo$getStoredPositionData$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        InvestUserAssetDetailByPosition investUserAssetDetailByPosition = null;
        java.lang.Object obj2 = null;
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) objCopydefault;
        java.util.List<InvestUserAssetDetailByPosition> positionList = investUserAssetDetailByInvestment != null ? investUserAssetDetailByInvestment.getPositionList() : null;
        if (positionList != null) {
            java.util.Iterator<T> it = positionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InvestUserAssetDetailByPosition) next).getTokenId(), (java.lang.Object) str)) {
                    obj2 = next;
                    break;
                }
            }
            investUserAssetDetailByPosition = (InvestUserAssetDetailByPosition) obj2;
        }
        if (investUserAssetDetailByPosition != null) {
            Result.Application application = Result.Companion;
            java.util.List<InvestBaseDefiTokenInfo> assetsTokenList = investUserAssetDetailByPosition.getAssetsTokenList();
            if (assetsTokenList == null) {
                assetsTokenList = yDY.AhwBna();
            }
            java.util.List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo = investUserAssetDetailByPosition.getRewardDefiTokenInfo();
            if (rewardDefiTokenInfo == null) {
                rewardDefiTokenInfo = yDY.AhwBna();
            }
            java.util.List<InvestUserRewardInfoByInvestment> unclaimFeesDefiTokenInfo = investUserAssetDetailByPosition.getUnclaimFeesDefiTokenInfo();
            if (unclaimFeesDefiTokenInfo == null) {
                unclaimFeesDefiTokenInfo = yDY.AhwBna();
            }
            return Result.m7377constructorimpl(new AssetBottomSheetData.PositionBottomSheetData(assetsTokenList, rewardDefiTokenInfo, unclaimFeesDefiTokenInfo));
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("")));
    }
}
