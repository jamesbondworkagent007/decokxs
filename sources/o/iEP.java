package o;

import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailResultVo;
import com.okinc.business.dex.api.bean.DexMarketCheckCoinDetailVO;
import com.okinc.business.dex.api.bean.DexMarketCheckTokenDetailInfo;
import com.okinc.business.dex.api.bean.DexTokenBaseInfo;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.invest_biz.data.bean.CandleResultInfo;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlInfo;
import com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestPointsInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.bean.SecurityScoreInfo;
import com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam;
import com.okinc.business.invest_biz.data.bean.request.InvestWalletIdInfo;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsHistoryResponse;
import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$appendDexDetails$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$fetchDecisiveInfo$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$fetchDecisiveInfo$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getBonus$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getBonus$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getChartData$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getChartData$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getHistory$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getHistory$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getMainWallet$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getMainWallet$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getOktStakingDetail$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getOktStakingDetail$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getPointReward$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getPointReward$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getPortfolio$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getPortfolio$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getProductDetails$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getProductDetails$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getRawProductDetailsResponse$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getRedeemInfo$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getRedeemInfo$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getSecurityScore$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getSecurityScore$2;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getStoredBonusData$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getStoredPositionData$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getTvlChartData$1;
import com.okinc.business.invest_biz.data.repository.product_details.ProductDetailsRepositoryImpl$getTvlChartData$2;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import com.okinc.network.okg.response.ResponseData;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.reactive.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEP implements iEM {
    public final C23580iBq AEQbTJ;
    public final iEO EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final iEY OLrzqt;
    public final InterfaceC23589iBz copydefault;

    public iEP(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull C23580iBq c23580iBq, @NotNull iEO ieo, @NotNull iEY iey, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(ieo, "");
        Intrinsics.checkNotNullParameter(iey, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23589iBz;
        this.AEQbTJ = c23580iBq;
        this.EZpvd = ieo;
        this.OLrzqt = iey;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public iEP(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEO ieo, @NotNull iEY iey, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(interfaceC23589iBz, C23580iBq.AEQbTJ, ieo, iey, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(ieo, "");
        Intrinsics.checkNotNullParameter(iey, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<C23623iDf> list, @NotNull Continuation<? super Result<? extends java.util.List<C23623iDf>>> continuation) {
        ProductDetailsRepositoryImpl$appendDexDetails$1 productDetailsRepositoryImpl$appendDexDetails$1;
        java.lang.Object next;
        C23623iDf c23623iDfCopy$default;
        java.util.List<C23623iDf> list2 = list;
        if (continuation instanceof ProductDetailsRepositoryImpl$appendDexDetails$1) {
            productDetailsRepositoryImpl$appendDexDetails$1 = (ProductDetailsRepositoryImpl$appendDexDetails$1) continuation;
            int i = productDetailsRepositoryImpl$appendDexDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$appendDexDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$appendDexDetails$1 = new ProductDetailsRepositoryImpl$appendDexDetails$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = productDetailsRepositoryImpl$appendDexDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$appendDexDetails$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DexTokenBaseInfo(str, ((C23623iDf) it.next()).AEQbTJ().EZpvd()));
                }
                AbstractC58185ywX<ResponseData<DexMarketCheckCoinDetailResultVo>> abstractC58185ywXKWHzl = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).KWHzl(OKDSourceType.YIELD_SOURCE, new DexMarketCheckCoinDetailVO(arrayList));
                productDetailsRepositoryImpl$appendDexDetails$1.L$0 = list2;
                productDetailsRepositoryImpl$appendDexDetails$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXKWHzl, productDetailsRepositoryImpl$appendDexDetails$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) productDetailsRepositoryImpl$appendDexDetails$1.L$0;
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            ResponseData responseData = (ResponseData) objAwaitFirst;
            if (responseData.getCode() == 0) {
                DexMarketCheckCoinDetailResultVo dexMarketCheckCoinDetailResultVo = (DexMarketCheckCoinDetailResultVo) responseData.getData();
                java.util.List<DexMarketCheckTokenDetailInfo> tokenDetailInfoList = dexMarketCheckCoinDetailResultVo != null ? dexMarketCheckCoinDetailResultVo.getTokenDetailInfoList() : null;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                for (C23623iDf c23623iDf : list2) {
                    if (tokenDetailInfoList != null) {
                        java.util.Iterator<T> it2 = tokenDetailInfoList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((DexMarketCheckTokenDetailInfo) next).getTokenContractAddress(), (java.lang.Object) c23623iDf.AEQbTJ().EZpvd())) {
                                break;
                            }
                        }
                        DexMarketCheckTokenDetailInfo dexMarketCheckTokenDetailInfo = (DexMarketCheckTokenDetailInfo) next;
                        if (dexMarketCheckTokenDetailInfo != null && (c23623iDfCopy$default = C23623iDf.copy$default(c23623iDf, null, null, null, false, null, null, dexMarketCheckTokenDetailInfo.isSupportDetail(), 63, null)) != null) {
                            c23623iDf = c23623iDfCopy$default;
                        }
                    }
                    arrayList2.add(c23623iDf);
                }
                list2 = arrayList2;
            }
            return Result.m7377constructorimpl(list2);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull C23682iFk c23682iFk, @NotNull Continuation<? super Result<? extends java.util.List<ProductDetailsByChain>>> continuation) {
        ProductDetailsRepositoryImpl$fetchDecisiveInfo$1 productDetailsRepositoryImpl$fetchDecisiveInfo$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$fetchDecisiveInfo$1) {
            productDetailsRepositoryImpl$fetchDecisiveInfo$1 = (ProductDetailsRepositoryImpl$fetchDecisiveInfo$1) continuation;
            int i = productDetailsRepositoryImpl$fetchDecisiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$fetchDecisiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$fetchDecisiveInfo$1 = new ProductDetailsRepositoryImpl$fetchDecisiveInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$fetchDecisiveInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$fetchDecisiveInfo$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$fetchDecisiveInfo$2 productDetailsRepositoryImpl$fetchDecisiveInfo$2 = new ProductDetailsRepositoryImpl$fetchDecisiveInfo$2(this, c23682iFk, null);
        productDetailsRepositoryImpl$fetchDecisiveInfo$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$fetchDecisiveInfo$2, productDetailsRepositoryImpl$fetchDecisiveInfo$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C23682iFk c23682iFk, boolean z, @NotNull Continuation<? super Result<C23673iFb>> continuation) {
        ProductDetailsRepositoryImpl$getProductDetails$1 productDetailsRepositoryImpl$getProductDetails$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getProductDetails$1) {
            productDetailsRepositoryImpl$getProductDetails$1 = (ProductDetailsRepositoryImpl$getProductDetails$1) continuation;
            int i = productDetailsRepositoryImpl$getProductDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getProductDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getProductDetails$1 = new ProductDetailsRepositoryImpl$getProductDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getProductDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getProductDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getProductDetails$2 productDetailsRepositoryImpl$getProductDetails$2 = new ProductDetailsRepositoryImpl$getProductDetails$2(this, c23682iFk, z, null);
        productDetailsRepositoryImpl$getProductDetails$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getProductDetails$2, productDetailsRepositoryImpl$getProductDetails$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull C23682iFk c23682iFk, @NotNull Continuation<? super Result<InvestProductDetailResponse>> continuation) {
        ProductDetailsRepositoryImpl$getRawProductDetailsResponse$1 productDetailsRepositoryImpl$getRawProductDetailsResponse$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getRawProductDetailsResponse$1) {
            productDetailsRepositoryImpl$getRawProductDetailsResponse$1 = (ProductDetailsRepositoryImpl$getRawProductDetailsResponse$1) continuation;
            int i = productDetailsRepositoryImpl$getRawProductDetailsResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getRawProductDetailsResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getRawProductDetailsResponse$1 = new ProductDetailsRepositoryImpl$getRawProductDetailsResponse$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getRawProductDetailsResponse$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getRawProductDetailsResponse$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2 productDetailsRepositoryImpl$getRawProductDetailsResponse$2 = new ProductDetailsRepositoryImpl$getRawProductDetailsResponse$2(this, c23682iFk, null);
        productDetailsRepositoryImpl$getRawProductDetailsResponse$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getRawProductDetailsResponse$2, productDetailsRepositoryImpl$getRawProductDetailsResponse$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super Result<InvestmentBonusInfo>> continuation) {
        ProductDetailsRepositoryImpl$getBonus$1 productDetailsRepositoryImpl$getBonus$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getBonus$1) {
            productDetailsRepositoryImpl$getBonus$1 = (ProductDetailsRepositoryImpl$getBonus$1) continuation;
            int i = productDetailsRepositoryImpl$getBonus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getBonus$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getBonus$1 = new ProductDetailsRepositoryImpl$getBonus$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getBonus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getBonus$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getBonus$2 productDetailsRepositoryImpl$getBonus$2 = new ProductDetailsRepositoryImpl$getBonus$2(this, j, null);
        productDetailsRepositoryImpl$getBonus$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getBonus$2, productDetailsRepositoryImpl$getBonus$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull InvestmentKind investmentKind, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<? extends java.util.List<CandleResultInfo>>> continuation) {
        ProductDetailsRepositoryImpl$getChartData$1 productDetailsRepositoryImpl$getChartData$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getChartData$1) {
            productDetailsRepositoryImpl$getChartData$1 = (ProductDetailsRepositoryImpl$getChartData$1) continuation;
            int i = productDetailsRepositoryImpl$getChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getChartData$1 = new ProductDetailsRepositoryImpl$getChartData$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getChartData$1 productDetailsRepositoryImpl$getChartData$12 = productDetailsRepositoryImpl$getChartData$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getChartData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getChartData$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getChartData$2 productDetailsRepositoryImpl$getChartData$2 = new ProductDetailsRepositoryImpl$getChartData$2(this, j, chartInterval, investmentKind, null);
        productDetailsRepositoryImpl$getChartData$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getChartData$2, productDetailsRepositoryImpl$getChartData$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, java.lang.Long l, java.lang.Long l2, @NotNull Continuation<? super Result<? extends java.util.List<InvestUserAssetDetailByInvestment>>> continuation) {
        ProductDetailsRepositoryImpl$getPortfolio$1 productDetailsRepositoryImpl$getPortfolio$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getPortfolio$1) {
            productDetailsRepositoryImpl$getPortfolio$1 = (ProductDetailsRepositoryImpl$getPortfolio$1) continuation;
            int i = productDetailsRepositoryImpl$getPortfolio$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getPortfolio$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getPortfolio$1 = new ProductDetailsRepositoryImpl$getPortfolio$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getPortfolio$1 productDetailsRepositoryImpl$getPortfolio$12 = productDetailsRepositoryImpl$getPortfolio$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getPortfolio$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getPortfolio$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getPortfolio$2 productDetailsRepositoryImpl$getPortfolio$2 = new ProductDetailsRepositoryImpl$getPortfolio$2(this, j, l2, l, null);
        productDetailsRepositoryImpl$getPortfolio$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getPortfolio$2, productDetailsRepositoryImpl$getPortfolio$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    public final java.util.List<InvestWalletIdInfo> EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        java.util.List<InvestWalletAddressInfo> listAEQbTJ;
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        if (l != null) {
            listAEQbTJ = EZpvd(interfaceC9738bbJ, l.longValue());
        } else {
            listAEQbTJ = this.AEQbTJ.AEQbTJ();
        }
        return C56402yEa.EZpvd(new InvestWalletIdInfo(listAEQbTJ, strDbNXlk));
    }

    public final java.util.List<InvestWalletAddressInfo> EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
        return C56402yEa.EZpvd(new InvestWalletAddressInfo(java.lang.Long.valueOf(j), interfaceC9738bbJ.EZpvd(j), j == 0 ? interfaceC9738bbJ.EZpvd(interfaceC9738bbJ.EZpvd(j)) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, long j2, @NotNull Continuation<? super Result<ProductDetailsHistoryResponse>> continuation) {
        ProductDetailsRepositoryImpl$getHistory$1 productDetailsRepositoryImpl$getHistory$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getHistory$1) {
            productDetailsRepositoryImpl$getHistory$1 = (ProductDetailsRepositoryImpl$getHistory$1) continuation;
            int i = productDetailsRepositoryImpl$getHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getHistory$1 = new ProductDetailsRepositoryImpl$getHistory$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getHistory$1 productDetailsRepositoryImpl$getHistory$12 = productDetailsRepositoryImpl$getHistory$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getHistory$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getHistory$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getHistory$2 productDetailsRepositoryImpl$getHistory$2 = new ProductDetailsRepositoryImpl$getHistory$2(this, j2, j, null);
        productDetailsRepositoryImpl$getHistory$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getHistory$2, productDetailsRepositoryImpl$getHistory$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super Result<SecurityScoreInfo>> continuation) {
        ProductDetailsRepositoryImpl$getSecurityScore$1 productDetailsRepositoryImpl$getSecurityScore$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getSecurityScore$1) {
            productDetailsRepositoryImpl$getSecurityScore$1 = (ProductDetailsRepositoryImpl$getSecurityScore$1) continuation;
            int i = productDetailsRepositoryImpl$getSecurityScore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getSecurityScore$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getSecurityScore$1 = new ProductDetailsRepositoryImpl$getSecurityScore$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getSecurityScore$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getSecurityScore$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getSecurityScore$2 productDetailsRepositoryImpl$getSecurityScore$2 = new ProductDetailsRepositoryImpl$getSecurityScore$2(j, this, null);
        productDetailsRepositoryImpl$getSecurityScore$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getSecurityScore$2, productDetailsRepositoryImpl$getSecurityScore$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, long j2, @NotNull Continuation<? super Result<InvestPointsInfoResponse>> continuation) {
        ProductDetailsRepositoryImpl$getPointReward$1 productDetailsRepositoryImpl$getPointReward$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getPointReward$1) {
            productDetailsRepositoryImpl$getPointReward$1 = (ProductDetailsRepositoryImpl$getPointReward$1) continuation;
            int i = productDetailsRepositoryImpl$getPointReward$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getPointReward$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getPointReward$1 = new ProductDetailsRepositoryImpl$getPointReward$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getPointReward$1 productDetailsRepositoryImpl$getPointReward$12 = productDetailsRepositoryImpl$getPointReward$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getPointReward$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getPointReward$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getPointReward$2 productDetailsRepositoryImpl$getPointReward$2 = new ProductDetailsRepositoryImpl$getPointReward$2(this, j, j2, null);
        productDetailsRepositoryImpl$getPointReward$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getPointReward$2, productDetailsRepositoryImpl$getPointReward$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, long j2, boolean z, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation) {
        ProductDetailsRepositoryImpl$getRedeemInfo$1 productDetailsRepositoryImpl$getRedeemInfo$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getRedeemInfo$1) {
            productDetailsRepositoryImpl$getRedeemInfo$1 = (ProductDetailsRepositoryImpl$getRedeemInfo$1) continuation;
            int i = productDetailsRepositoryImpl$getRedeemInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getRedeemInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getRedeemInfo$1 = new ProductDetailsRepositoryImpl$getRedeemInfo$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getRedeemInfo$1 productDetailsRepositoryImpl$getRedeemInfo$12 = productDetailsRepositoryImpl$getRedeemInfo$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getRedeemInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getRedeemInfo$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getRedeemInfo$2 productDetailsRepositoryImpl$getRedeemInfo$2 = new ProductDetailsRepositoryImpl$getRedeemInfo$2(this, j2, j, z, investmentKind, null);
        productDetailsRepositoryImpl$getRedeemInfo$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getRedeemInfo$2, productDetailsRepositoryImpl$getRedeemInfo$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) {
        ProductDetailsRepositoryImpl$getOktStakingDetail$1 productDetailsRepositoryImpl$getOktStakingDetail$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getOktStakingDetail$1) {
            productDetailsRepositoryImpl$getOktStakingDetail$1 = (ProductDetailsRepositoryImpl$getOktStakingDetail$1) continuation;
            int i = productDetailsRepositoryImpl$getOktStakingDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getOktStakingDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getOktStakingDetail$1 = new ProductDetailsRepositoryImpl$getOktStakingDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getOktStakingDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getOktStakingDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getOktStakingDetail$2 productDetailsRepositoryImpl$getOktStakingDetail$2 = new ProductDetailsRepositoryImpl$getOktStakingDetail$2(this, j, null);
        productDetailsRepositoryImpl$getOktStakingDetail$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getOktStakingDetail$2, productDetailsRepositoryImpl$getOktStakingDetail$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) {
        ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1 productDetailsRepositoryImpl$getLsdBatchClaimDetail$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1) {
            productDetailsRepositoryImpl$getLsdBatchClaimDetail$1 = (ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1) continuation;
            int i = productDetailsRepositoryImpl$getLsdBatchClaimDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getLsdBatchClaimDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getLsdBatchClaimDetail$1 = new ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1(this, continuation);
            }
        }
        ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$1 productDetailsRepositoryImpl$getLsdBatchClaimDetail$12 = productDetailsRepositoryImpl$getLsdBatchClaimDetail$1;
        java.lang.Object obj = productDetailsRepositoryImpl$getLsdBatchClaimDetail$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getLsdBatchClaimDetail$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2 productDetailsRepositoryImpl$getLsdBatchClaimDetail$2 = new ProductDetailsRepositoryImpl$getLsdBatchClaimDetail$2(this, j, j2, null);
        productDetailsRepositoryImpl$getLsdBatchClaimDetail$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getLsdBatchClaimDetail$2, productDetailsRepositoryImpl$getLsdBatchClaimDetail$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Result<? extends InterfaceC9738bbJ>> continuation) {
        ProductDetailsRepositoryImpl$getMainWallet$1 productDetailsRepositoryImpl$getMainWallet$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getMainWallet$1) {
            productDetailsRepositoryImpl$getMainWallet$1 = (ProductDetailsRepositoryImpl$getMainWallet$1) continuation;
            int i = productDetailsRepositoryImpl$getMainWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getMainWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getMainWallet$1 = new ProductDetailsRepositoryImpl$getMainWallet$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getMainWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getMainWallet$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getMainWallet$2 productDetailsRepositoryImpl$getMainWallet$2 = new ProductDetailsRepositoryImpl$getMainWallet$2(this, null);
        productDetailsRepositoryImpl$getMainWallet$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getMainWallet$2, productDetailsRepositoryImpl$getMainWallet$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<CandleResultTvlInfo>> continuation) {
        ProductDetailsRepositoryImpl$getTvlChartData$1 productDetailsRepositoryImpl$getTvlChartData$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getTvlChartData$1) {
            productDetailsRepositoryImpl$getTvlChartData$1 = (ProductDetailsRepositoryImpl$getTvlChartData$1) continuation;
            int i = productDetailsRepositoryImpl$getTvlChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getTvlChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getTvlChartData$1 = new ProductDetailsRepositoryImpl$getTvlChartData$1(this, continuation);
            }
        }
        java.lang.Object obj = productDetailsRepositoryImpl$getTvlChartData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getTvlChartData$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        ProductDetailsRepositoryImpl$getTvlChartData$2 productDetailsRepositoryImpl$getTvlChartData$2 = new ProductDetailsRepositoryImpl$getTvlChartData$2(this, j, chartInterval, null);
        productDetailsRepositoryImpl$getTvlChartData$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, productDetailsRepositoryImpl$getTvlChartData$2, productDetailsRepositoryImpl$getTvlChartData$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C23682iFk c23682iFk, @NotNull Continuation<? super C23673iFb> continuation) throws java.lang.Throwable {
        ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1 productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1;
        C23682iFk c23682iFk2;
        iEP iep;
        iEP iep2;
        C23673iFb c23673iFb;
        java.lang.Object objM7386unboximpl;
        C23682iFk c23682iFk3;
        java.util.List list;
        iEO ieo;
        long j;
        iEP iep3;
        C23673iFb c23673iFbAEQbTJ;
        C23682iFk c23682iFk4;
        C23682iFk c23682iFk5;
        iEP iep4;
        java.lang.Object objUnwrapResponseData$default;
        iEO ieo2;
        long jKWHzl;
        C23673iFb c23673iFb2;
        if (continuation instanceof ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) {
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1 = (ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) continuation;
            int i = productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1 = new ProductDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InvestProductDetailParam investProductDetailParam = new InvestProductDetailParam(c23682iFk.KWHzl(), c23682iFk.copydefault().getValue(), this.AEQbTJ.AEQbTJ());
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.copydefault.OLrzqt();
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = this;
            c23682iFk2 = c23682iFk;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk2;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 1;
            objOLrzqt = interfaceC25472ixPOLrzqt.OLrzqt(investProductDetailParam, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            iep = this;
        } else if (i2 == 1) {
            c23682iFk2 = (C23682iFk) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1;
            iep = (iEP) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        } else if (i2 == 2) {
            c23673iFb = (C23673iFb) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2;
            c23682iFk3 = (C23682iFk) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1;
            iEP iep5 = (iEP) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            objM7386unboximpl = ((Result) objOLrzqt).m7386unboximpl();
            iep2 = iep5;
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            list = (java.util.List) objM7386unboximpl;
            ieo = iep2.EZpvd;
            long jKWHzl2 = c23682iFk3.KWHzl();
            if (list == null) {
                C23673iFb c23673iFb3 = c23673iFb;
                j = jKWHzl2;
                iep3 = iep2;
                c23673iFbAEQbTJ = c23673iFb3.AEQbTJ((8187 & 1) != 0 ? c23673iFb3.KWHzl : null, (8187 & 2) != 0 ? c23673iFb3.gEmmrt : false, (8187 & 4) != 0 ? c23673iFb3.AhwBna : list, (8187 & 8) != 0 ? c23673iFb3.valueOf : null, (8187 & 16) != 0 ? c23673iFb3.AEQbTJ : null, (8187 & 32) != 0 ? c23673iFb3.values : null, (8187 & 64) != 0 ? c23673iFb3.copydefault : null, (8187 & 128) != 0 ? c23673iFb3.djBIcL : null, (8187 & 256) != 0 ? c23673iFb3.EZpvd : null, (8187 & 512) != 0 ? c23673iFb3.AkhnZx : null, (8187 & 1024) != 0 ? c23673iFb3.AYXKKw : null, (8187 & 2048) != 0 ? c23673iFb3.OLrzqt : null, (8187 & 4096) != 0 ? c23673iFb3.isConnected : null);
                if (c23673iFbAEQbTJ == null) {
                }
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = iep3;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk3;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = c23673iFb;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 3;
                if (ieo.EZpvd(j, c23673iFbAEQbTJ, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) == objCopydefault) {
                    return objCopydefault;
                }
                c23682iFk4 = c23682iFk3;
                if (c23673iFb.EZpvd().values()) {
                }
            } else {
                j = jKWHzl2;
                iep3 = iep2;
            }
            c23673iFbAEQbTJ = c23673iFb;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = iep3;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk3;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = c23673iFb;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 3;
            if (ieo.EZpvd(j, c23673iFbAEQbTJ, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) == objCopydefault) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c23673iFb2 = (C23673iFb) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return c23673iFb2;
                }
                c23673iFb = (C23673iFb) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2;
                c23682iFk5 = (C23682iFk) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1;
                iep4 = (iEP) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                ieo2 = iep4.EZpvd;
                jKWHzl = c23682iFk5.KWHzl();
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = c23673iFb;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = null;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = null;
                productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 5;
                if (ieo2.KWHzl(jKWHzl, (InvestmentBonusInfo) objUnwrapResponseData$default, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) != objCopydefault) {
                    return objCopydefault;
                }
                c23673iFb2 = c23673iFb;
                return c23673iFb2;
            }
            c23673iFb = (C23673iFb) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2;
            c23682iFk4 = (C23682iFk) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1;
            iEP iep6 = (iEP) productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            iep3 = iep6;
            if (c23673iFb.EZpvd().values()) {
                return c23673iFb;
            }
            InterfaceC25472ixP interfaceC25472ixPOLrzqt2 = iep3.copydefault.OLrzqt();
            long jKWHzl3 = c23682iFk4.KWHzl();
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = iep3;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk4;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = c23673iFb;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 4;
            objOLrzqt = interfaceC25472ixPOLrzqt2.EZpvd(jKWHzl3, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c23682iFk5 = c23682iFk4;
            iep4 = iep3;
            objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default);
            ieo2 = iep4.EZpvd;
            jKWHzl = c23682iFk5.KWHzl();
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = c23673iFb;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = null;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = null;
            productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 5;
            if (ieo2.KWHzl(jKWHzl, (InvestmentBonusInfo) objUnwrapResponseData$default, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) != objCopydefault) {
            }
        }
        java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        C23673iFb c23673iFbOLrzqt = iep.OLrzqt.OLrzqt((ProductDetailsResponse) objUnwrapResponseData$default2);
        long jOLrzqt = c23673iFbOLrzqt.AEQbTJ().OLrzqt();
        java.util.List<C23623iDf> listGEmmrt = c23673iFbOLrzqt.gEmmrt();
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = iep;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk2;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = c23673iFbOLrzqt;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 2;
        java.lang.Object objKWHzl = iep.KWHzl(java.lang.String.valueOf(jOLrzqt), listGEmmrt, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        iep2 = iep;
        C23682iFk c23682iFk6 = c23682iFk2;
        c23673iFb = c23673iFbOLrzqt;
        objM7386unboximpl = objKWHzl;
        c23682iFk3 = c23682iFk6;
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        list = (java.util.List) objM7386unboximpl;
        ieo = iep2.EZpvd;
        long jKWHzl22 = c23682iFk3.KWHzl();
        if (list == null) {
        }
        c23673iFbAEQbTJ = c23673iFb;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$0 = iep3;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$1 = c23682iFk3;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.L$2 = c23673iFb;
        productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1.label = 3;
        if (ieo.EZpvd(j, c23673iFbAEQbTJ, productDetailsRepositoryImpl$getProductDetailsAndBonusInternally$1) == objCopydefault) {
        }
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super InterfaceC25472ixP> continuation) {
        return this.copydefault.KWHzl(this.AEQbTJ.copydefault(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull RewardType rewardType, @NotNull Continuation<? super Result<AssetBottomSheetData.BonusBottomSheetData>> continuation) {
        ProductDetailsRepositoryImpl$getStoredBonusData$1 productDetailsRepositoryImpl$getStoredBonusData$1;
        java.util.List list;
        if (continuation instanceof ProductDetailsRepositoryImpl$getStoredBonusData$1) {
            productDetailsRepositoryImpl$getStoredBonusData$1 = (ProductDetailsRepositoryImpl$getStoredBonusData$1) continuation;
            int i = productDetailsRepositoryImpl$getStoredBonusData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getStoredBonusData$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getStoredBonusData$1 = new ProductDetailsRepositoryImpl$getStoredBonusData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = productDetailsRepositoryImpl$getStoredBonusData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getStoredBonusData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            iEO ieo = this.EZpvd;
            productDetailsRepositoryImpl$getStoredBonusData$1.L$0 = rewardType;
            productDetailsRepositoryImpl$getStoredBonusData$1.label = 1;
            objKWHzl = ieo.KWHzl(j, productDetailsRepositoryImpl$getStoredBonusData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rewardType = (RewardType) productDetailsRepositoryImpl$getStoredBonusData$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list2 = (java.util.List) objKWHzl;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                java.util.List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo = ((InvestUserAssetDetailByInvestment) it.next()).getRewardDefiTokenInfo();
                if (rewardDefiTokenInfo == null) {
                    rewardDefiTokenInfo = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, rewardDefiTokenInfo);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : arrayList) {
                RewardType rewardType2 = ((InvestUserRewardInfoByInvestment) obj).getRewardType();
                java.lang.Object arrayList2 = linkedHashMap.get(rewardType2);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(rewardType2, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            list = (java.util.List) linkedHashMap.get(rewardType);
        } else {
            list = null;
        }
        if (list != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(new AssetBottomSheetData.BonusBottomSheetData(list));
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("Stored result not found")));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iYN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j2, long j3, @NotNull Continuation<? super Result<AssetBottomSheetData.PositionBottomSheetData>> continuation) {
        ProductDetailsRepositoryImpl$getStoredPositionData$1 productDetailsRepositoryImpl$getStoredPositionData$1;
        if (continuation instanceof ProductDetailsRepositoryImpl$getStoredPositionData$1) {
            productDetailsRepositoryImpl$getStoredPositionData$1 = (ProductDetailsRepositoryImpl$getStoredPositionData$1) continuation;
            int i = productDetailsRepositoryImpl$getStoredPositionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDetailsRepositoryImpl$getStoredPositionData$1.label = i - Integer.MIN_VALUE;
            } else {
                productDetailsRepositoryImpl$getStoredPositionData$1 = new ProductDetailsRepositoryImpl$getStoredPositionData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = productDetailsRepositoryImpl$getStoredPositionData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = productDetailsRepositoryImpl$getStoredPositionData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            iEO ieo = this.EZpvd;
            productDetailsRepositoryImpl$getStoredPositionData$1.L$0 = str;
            productDetailsRepositoryImpl$getStoredPositionData$1.label = 1;
            objKWHzl = ieo.KWHzl(j, productDetailsRepositoryImpl$getStoredPositionData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) productDetailsRepositoryImpl$getStoredPositionData$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List list = (java.util.List) objKWHzl;
        InvestUserAssetDetailByPosition investUserAssetDetailByPosition = null;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.List<InvestUserAssetDetailByPosition> positionList = ((InvestUserAssetDetailByInvestment) it.next()).getPositionList();
                if (positionList == null) {
                    positionList = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, positionList);
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InvestUserAssetDetailByPosition) next).getTokenId(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            investUserAssetDetailByPosition = (InvestUserAssetDetailByPosition) obj;
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
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.NullPointerException("Stored result not found")));
    }
}
