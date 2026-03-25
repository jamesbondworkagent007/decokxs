package o;

import com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo;
import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.StakingProgress;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getOktStakingDetail$1;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getOktStakingDetail$2;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getPortfolio$1;
import com.okinc.business.invest_biz.mln.repo.DeFiMiniDetailCacheRepo$getPortfolio$2;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import o.C27581jxr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iOr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23932iOr {
    public final InterfaceC23589iBz OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final iEY valueOf;

    @yCM
    public C23932iOr(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEY iey, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(iey, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23589iBz;
        this.valueOf = iey;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) throws java.lang.Throwable {
        DeFiMiniDetailCacheRepo$getOktStakingDetail$1 deFiMiniDetailCacheRepo$getOktStakingDetail$1;
        if (continuation instanceof DeFiMiniDetailCacheRepo$getOktStakingDetail$1) {
            deFiMiniDetailCacheRepo$getOktStakingDetail$1 = (DeFiMiniDetailCacheRepo$getOktStakingDetail$1) continuation;
            int i = deFiMiniDetailCacheRepo$getOktStakingDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailCacheRepo$getOktStakingDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailCacheRepo$getOktStakingDetail$1 = new DeFiMiniDetailCacheRepo$getOktStakingDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailCacheRepo$getOktStakingDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailCacheRepo$getOktStakingDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        DeFiMiniDetailCacheRepo$getOktStakingDetail$2 deFiMiniDetailCacheRepo$getOktStakingDetail$2 = new DeFiMiniDetailCacheRepo$getOktStakingDetail$2(j, this, null);
        deFiMiniDetailCacheRepo$getOktStakingDetail$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailCacheRepo$getOktStakingDetail$2, deFiMiniDetailCacheRepo$getOktStakingDetail$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) throws java.lang.Throwable {
        DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1 deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1;
        if (continuation instanceof DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1) {
            deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1 = (DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1) continuation;
            int i = deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1 = new DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1(this, continuation);
            }
        }
        DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1 deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$12 = deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$1;
        java.lang.Object obj = deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2 deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2 = new DeFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2(j2, j, this, null);
        deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$2, deFiMiniDetailCacheRepo$getLsdBatchClaimDetail$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super Result<InvestUserAssetDetailByInvestment>> continuation) {
        DeFiMiniDetailCacheRepo$getPortfolio$1 deFiMiniDetailCacheRepo$getPortfolio$1;
        if (continuation instanceof DeFiMiniDetailCacheRepo$getPortfolio$1) {
            deFiMiniDetailCacheRepo$getPortfolio$1 = (DeFiMiniDetailCacheRepo$getPortfolio$1) continuation;
            int i = deFiMiniDetailCacheRepo$getPortfolio$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailCacheRepo$getPortfolio$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailCacheRepo$getPortfolio$1 = new DeFiMiniDetailCacheRepo$getPortfolio$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailCacheRepo$getPortfolio$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailCacheRepo$getPortfolio$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.copydefault;
        DeFiMiniDetailCacheRepo$getPortfolio$2 deFiMiniDetailCacheRepo$getPortfolio$2 = new DeFiMiniDetailCacheRepo$getPortfolio$2(j, null);
        deFiMiniDetailCacheRepo$getPortfolio$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailCacheRepo$getPortfolio$2, deFiMiniDetailCacheRepo$getPortfolio$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public final InvestUserRewardInfoByInvestment AEQbTJ(long j, @NotNull RewardType rewardType, @NotNull java.lang.String str) {
        InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment;
        InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment;
        java.util.ArrayList arrayList;
        java.lang.Object next;
        java.lang.Object objDecodeFromString;
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            C23924iOj c23924iOj = C23924iOj.AEQbTJ;
            java.lang.String strEZpvd = c23924iOj.EZpvd(c23924iOj.copydefault(), j);
            if (strEZpvd != null) {
                Json jsonJson$default = JsonKt.Json$default(null, C27581jxr.StateListAnimator.copydefault, 1, null);
                if (strEZpvd.length() == 0) {
                    objDecodeFromString = null;
                    investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) objDecodeFromString;
                } else {
                    try {
                        java.lang.String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), C27581jxr.copydefault(jsonJson$default.parseToJsonElement(strEZpvd)));
                        jsonJson$default.getSerializersModule();
                        objDecodeFromString = jsonJson$default.decodeFromString(InvestUserAssetDetailByInvestment.Companion.serializer(), strEncodeToString);
                    } catch (java.lang.Exception e) {
                        pUU.copydefault("parseFromMiniJson " + e.getMessage());
                        e.printStackTrace();
                        objDecodeFromString = null;
                    }
                    investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) objDecodeFromString;
                }
            } else {
                investUserAssetDetailByInvestment = null;
            }
            if (investUserAssetDetailByInvestment == null) {
                pUU.copydefault("getMyHoldData", "error: Portfolio data is null for investmentId: " + j);
                return null;
            }
            java.util.List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo = investUserAssetDetailByInvestment.getRewardDefiTokenInfo();
            if (rewardDefiTokenInfo != null) {
                java.util.Iterator<T> it = rewardDefiTokenInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((InvestUserRewardInfoByInvestment) next).getRewardType() == rewardType) {
                        break;
                    }
                }
                investUserRewardInfoByInvestment = (InvestUserRewardInfoByInvestment) next;
            } else {
                investUserRewardInfoByInvestment = null;
            }
            if (investUserRewardInfoByInvestment == null) {
                pUU.copydefault("getMyHoldData", "error: rewardInfoList data is null for investmentId: " + j);
                return null;
            }
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                return investUserRewardInfoByInvestment;
            }
            java.util.List<InvestUserRewardElementInfo> baseDefiTokenInfos = investUserRewardInfoByInvestment.getBaseDefiTokenInfos();
            if (baseDefiTokenInfos != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : baseDefiTokenInfos) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((InvestUserRewardElementInfo) obj).getTokenSymbol(), (java.lang.Object) str)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                return investUserRewardInfoByInvestment.copy((1022 & 1) != 0 ? investUserRewardInfoByInvestment.baseDefiTokenInfos : arrayList, (1022 & 2) != 0 ? investUserRewardInfoByInvestment.buttonType : null, (1022 & 4) != 0 ? investUserRewardInfoByInvestment.claimMode : null, (1022 & 8) != 0 ? investUserRewardInfoByInvestment.currencyAmount : null, (1022 & 16) != 0 ? investUserRewardInfoByInvestment.extraData : null, (1022 & 32) != 0 ? investUserRewardInfoByInvestment.rewardType : null, (1022 & 64) != 0 ? investUserRewardInfoByInvestment.callDataExtJson : null, (1022 & 128) != 0 ? investUserRewardInfoByInvestment.unclaimedTokenList : null, (1022 & 256) != 0 ? investUserRewardInfoByInvestment.network : null, (1022 & 512) != 0 ? investUserRewardInfoByInvestment.chainId : null);
            }
            return null;
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("getMyHoldData", "exception for investmentId: " + j, e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[Catch: all -> 0x0087, CancellationException -> 0x0089, TryCatch #5 {CancellationException -> 0x0089, all -> 0x0087, blocks: (B:15:0x0062, B:17:0x0082, B:16:0x0069), top: B:34:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<C23673iFb>> continuation) {
        C23673iFb c23673iFb;
        try {
            try {
                Result.Application application = Result.Companion;
                C23924iOj c23924iOj = C23924iOj.AEQbTJ;
                java.lang.String strEZpvd = c23924iOj.EZpvd(c23924iOj.KWHzl(), j);
                try {
                    if (strEZpvd != null) {
                        java.lang.Object objDecodeFromString = null;
                        Json jsonJson$default = JsonKt.Json$default(null, C27581jxr.StateListAnimator.copydefault, 1, null);
                        if (strEZpvd.length() != 0) {
                            try {
                                java.lang.String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), C27581jxr.copydefault(jsonJson$default.parseToJsonElement(strEZpvd)));
                                jsonJson$default.getSerializersModule();
                                objDecodeFromString = jsonJson$default.decodeFromString(ProductDetailsResponse.Companion.serializer(), strEncodeToString);
                            } catch (java.lang.Exception e) {
                                pUU.copydefault("parseFromMiniJson " + e.getMessage());
                                e.printStackTrace();
                            }
                        }
                        ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) objDecodeFromString;
                        if (productDetailsResponse == null) {
                            c23673iFb = new C23673iFb(null, false, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                        } else {
                            c23673iFb = this.valueOf.OLrzqt(productDetailsResponse);
                        }
                    }
                    return Result.m7377constructorimpl(c23673iFb);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    Result.Application application2 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[Catch: all -> 0x0122, CancellationException -> 0x012e, TryCatch #1 {all -> 0x0122, blocks: (B:2:0x0000, B:4:0x0010, B:7:0x001f, B:11:0x005b, B:14:0x011d, B:10:0x0040, B:13:0x005f), top: B:23:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<InvestProductDetailResponse>> continuation) {
        InvestProductDetailResponse investProductDetailResponse;
        try {
            try {
                Result.Application application = Result.Companion;
                C23924iOj c23924iOj = C23924iOj.AEQbTJ;
                java.lang.String strEZpvd = c23924iOj.EZpvd(c23924iOj.KWHzl(), j);
                if (strEZpvd != null) {
                    java.lang.Object objDecodeFromString = null;
                    Json jsonJson$default = JsonKt.Json$default(null, C27581jxr.StateListAnimator.copydefault, 1, null);
                    if (strEZpvd.length() != 0) {
                        try {
                            java.lang.String strEncodeToString = jsonJson$default.encodeToString(JsonElement.Companion.serializer(), C27581jxr.copydefault(jsonJson$default.parseToJsonElement(strEZpvd)));
                            jsonJson$default.getSerializersModule();
                            objDecodeFromString = jsonJson$default.decodeFromString(InvestProductDetailResponse.Companion.serializer(), strEncodeToString);
                        } catch (java.lang.Exception e) {
                            pUU.copydefault("parseFromMiniJson " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                    investProductDetailResponse = (InvestProductDetailResponse) objDecodeFromString;
                    if (investProductDetailResponse == null) {
                        investProductDetailResponse = new InvestProductDetailResponse((java.util.List) null, (java.lang.Long) null, (java.lang.Long) null, (InvestApyDetailInfo) null, (java.lang.String) null, (java.util.List) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (InvestDetailPagePromptInformation) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, false, 0, (java.lang.Integer) null, 0L, (java.lang.String) null, (java.lang.String) null, false, 0, false, false, (java.lang.Boolean) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, 0, (java.util.List) null, (java.lang.String) null, 0, (java.lang.String) null, 0, 0, (TransactionMethod) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TransactionMethod) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0L, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, 0, (BTCMode) null, false, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (StakingProgress) null, -1, -1, 536870911, (DefaultConstructorMarker) null);
                    }
                }
                return Result.m7377constructorimpl(investProductDetailResponse);
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
