package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.CalldataPermit2;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$broadcastEoaOrder$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$buildAndSubmitTransaction$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$getV6CallData$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$submitOrder$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$submitOrderWithDualSign$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28328kXi {
    public final C28195kSk AYXKKw;

    public abstract CoroutineDispatcher AEQbTJ();

    public abstract kKG AhwBna();

    public abstract gYX EZpvd();

    public abstract C19700gMb KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        return EZpvd(this, v6BaseQuoteResponse, v6CalldataResponseData, approveUnsignedData, z, fragmentActivity, z2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28195kSk OLrzqt() {
        return this.AYXKKw;
    }

    public abstract java.util.List<java.lang.String> copydefault(NewCallbackBean.DexCallbackBean dexCallbackBean, MevConfig mevConfig);

    public abstract C28327kXh copydefault();

    public abstract AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    public AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> copydefault(java.lang.String str, boolean z) {
        return null;
    }

    /* JADX INFO: renamed from: o.kXi$Application */
    public static final class Application implements Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> {
        public final /* synthetic */ AbstractC28328kXi AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ V6CalldataResponseData KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ C28327kXh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C28327kXh c28327kXh, java.lang.String str, AbstractC28328kXi abstractC28328kXi, V6CalldataResponseData v6CalldataResponseData, java.lang.String str2) {
            this.copydefault = c28327kXh;
            this.EZpvd = str;
            this.AEQbTJ = abstractC28328kXi;
            this.KWHzl = v6CalldataResponseData;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final AbstractC58185ywX<ResponseData<java.lang.String>> invoke(NewCallbackBean newCallbackBean) {
            Intrinsics.checkNotNullParameter(newCallbackBean, "");
            kotlin.Pair<JsonObject, java.lang.String> pairEZpvd = this.copydefault.KWHzl().EZpvd(newCallbackBean.getBody());
            JsonObject jsonObjectComponent1 = pairEZpvd.component1();
            java.lang.String strComponent2 = pairEZpvd.component2();
            if (jsonObjectComponent1 == null || strComponent2.length() == 0) {
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null));
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                return abstractC58185ywXAEQbTJ;
            }
            this.copydefault.copydefault().EZpvd(this.EZpvd);
            pUU.KWHzl("MemeV6MarketTxV6UseCase", "signAuthType = " + newCallbackBean.getSignAuthType());
            return this.AEQbTJ.copydefault(newCallbackBean.getHeaderMap(), newCallbackBean.getDexCallbackBean(), this.KWHzl, this.OLrzqt, newCallbackBean.getSignAuthType() == SignAuthType.SILENT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, boolean z, int i, @NotNull FragmentActivity fragmentActivity, @NotNull V6CalldataParams v6CalldataParams, boolean z2, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        MemeV6MarketTxV6UseCase$submitOrder$1 memeV6MarketTxV6UseCase$submitOrder$1;
        java.lang.Object objEZpvd;
        java.lang.String str2;
        boolean z3;
        FragmentActivity fragmentActivity2;
        InterfaceC9740bbL.TaskDescription taskDescription2;
        boolean z4;
        java.lang.String str3;
        V6BaseQuoteResponse v6BaseQuoteResponse2;
        AbstractC28328kXi abstractC28328kXi;
        DexMultiTokenInfoBean fromToken;
        java.lang.String message;
        if (continuation instanceof MemeV6MarketTxV6UseCase$submitOrder$1) {
            memeV6MarketTxV6UseCase$submitOrder$1 = (MemeV6MarketTxV6UseCase$submitOrder$1) continuation;
            int i2 = memeV6MarketTxV6UseCase$submitOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$submitOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$submitOrder$1 = new MemeV6MarketTxV6UseCase$submitOrder$1(this, continuation);
            }
        }
        MemeV6MarketTxV6UseCase$submitOrder$1 memeV6MarketTxV6UseCase$submitOrder$12 = memeV6MarketTxV6UseCase$submitOrder$1;
        java.lang.Object obj = memeV6MarketTxV6UseCase$submitOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6MarketTxV6UseCase$submitOrder$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
            java.lang.String str4 = chainId == null ? "" : chainId;
            DefiPlatformInfo defiPlatformInfoCopydefault = gYQ.copydefault(v6BaseQuoteResponse, str);
            V6CalldataResponseData transactionData = defiPlatformInfoCopydefault != null ? defiPlatformInfoCopydefault.getTransactionData() : null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$0 = this;
            memeV6MarketTxV6UseCase$submitOrder$12.L$1 = v6BaseQuoteResponse;
            memeV6MarketTxV6UseCase$submitOrder$12.L$2 = str;
            memeV6MarketTxV6UseCase$submitOrder$12.L$3 = fragmentActivity;
            memeV6MarketTxV6UseCase$submitOrder$12.L$4 = taskDescription;
            memeV6MarketTxV6UseCase$submitOrder$12.L$5 = str4;
            memeV6MarketTxV6UseCase$submitOrder$12.Z$0 = z;
            memeV6MarketTxV6UseCase$submitOrder$12.Z$1 = z2;
            memeV6MarketTxV6UseCase$submitOrder$12.label = 1;
            objEZpvd = EZpvd(transactionData, v6BaseQuoteResponse, defiPlatformInfoCopydefault, i, v6CalldataParams, memeV6MarketTxV6UseCase$submitOrder$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            z3 = z;
            fragmentActivity2 = fragmentActivity;
            taskDescription2 = taskDescription;
            z4 = z2;
            str3 = str4;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse;
            abstractC28328kXi = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            z4 = memeV6MarketTxV6UseCase$submitOrder$12.Z$1;
            z3 = memeV6MarketTxV6UseCase$submitOrder$12.Z$0;
            str3 = (java.lang.String) memeV6MarketTxV6UseCase$submitOrder$12.L$5;
            InterfaceC9740bbL.TaskDescription taskDescription3 = (InterfaceC9740bbL.TaskDescription) memeV6MarketTxV6UseCase$submitOrder$12.L$4;
            fragmentActivity2 = (FragmentActivity) memeV6MarketTxV6UseCase$submitOrder$12.L$3;
            str2 = (java.lang.String) memeV6MarketTxV6UseCase$submitOrder$12.L$2;
            V6BaseQuoteResponse v6BaseQuoteResponse3 = (V6BaseQuoteResponse) memeV6MarketTxV6UseCase$submitOrder$12.L$1;
            abstractC28328kXi = (AbstractC28328kXi) memeV6MarketTxV6UseCase$submitOrder$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            taskDescription2 = taskDescription3;
            v6BaseQuoteResponse2 = v6BaseQuoteResponse3;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.hrnhsO);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!(thM7380exceptionOrNullimpl instanceof OKServerException) ? (message = thM7380exceptionOrNullimpl.getMessage()) == null : (message = thM7380exceptionOrNullimpl.getMessage()) == null) {
                message = string;
            }
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, message, null, null, 13, null)));
        }
        V6CalldataResponseData v6CalldataResponseData = (V6CalldataResponseData) objEZpvd;
        ApproveUnsignedData approveTxInfo = v6CalldataResponseData.getApproveTxInfo();
        if (approveTxInfo != null && abstractC28328kXi.OLrzqt() != null) {
            memeV6MarketTxV6UseCase$submitOrder$12.L$0 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$1 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$2 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$3 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$4 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.L$5 = null;
            memeV6MarketTxV6UseCase$submitOrder$12.label = 2;
            java.lang.Object objOLrzqt = abstractC28328kXi.OLrzqt(v6BaseQuoteResponse2, v6CalldataResponseData, approveTxInfo, z3, fragmentActivity2, z4, memeV6MarketTxV6UseCase$submitOrder$12);
            return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
        }
        memeV6MarketTxV6UseCase$submitOrder$12.L$0 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.L$1 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.L$2 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.L$3 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.L$4 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.L$5 = null;
        memeV6MarketTxV6UseCase$submitOrder$12.label = 3;
        java.lang.Object objKWHzl = abstractC28328kXi.KWHzl(v6BaseQuoteResponse2, str2, z3, v6CalldataResponseData, str3, fragmentActivity2, z4, taskDescription2, memeV6MarketTxV6UseCase$submitOrder$12);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(AbstractC28328kXi abstractC28328kXi, V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, ApproveUnsignedData approveUnsignedData, boolean z, FragmentActivity fragmentActivity, boolean z2, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6MarketTxV6UseCase$submitOrderWithDualSign$1 memeV6MarketTxV6UseCase$submitOrderWithDualSign$1;
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean fromToken2;
        if (continuation instanceof MemeV6MarketTxV6UseCase$submitOrderWithDualSign$1) {
            memeV6MarketTxV6UseCase$submitOrderWithDualSign$1 = (MemeV6MarketTxV6UseCase$submitOrderWithDualSign$1) continuation;
            int i = memeV6MarketTxV6UseCase$submitOrderWithDualSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$submitOrderWithDualSign$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$submitOrderWithDualSign$1 = new MemeV6MarketTxV6UseCase$submitOrderWithDualSign$1(abstractC28328kXi, continuation);
            }
        }
        java.lang.Object obj = memeV6MarketTxV6UseCase$submitOrderWithDualSign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6MarketTxV6UseCase$submitOrderWithDualSign$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C28195kSk c28195kSkOLrzqt = abstractC28328kXi.OLrzqt();
        if (c28195kSkOLrzqt == null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
        }
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken2 = commonDexInfo.getFromToken()) == null) ? null : fromToken2.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String str = chainId;
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String tokenContractAddress = (commonDexInfo2 == null || (fromToken = commonDexInfo2.getFromToken()) == null) ? null : fromToken.getTokenContractAddress();
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        C28194kSj c28194kSj = new C28194kSj(str, v6CalldataResponseData, approveUnsignedData, z, tokenContractAddress, commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null, z2);
        memeV6MarketTxV6UseCase$submitOrderWithDualSign$1.label = 1;
        java.lang.Object objOLrzqt = c28195kSkOLrzqt.OLrzqt(c28194kSj, fragmentActivity, memeV6MarketTxV6UseCase$submitOrderWithDualSign$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(V6CalldataResponseData v6CalldataResponseData, V6BaseQuoteResponse v6BaseQuoteResponse, DefiPlatformInfo defiPlatformInfo, int i, V6CalldataParams v6CalldataParams, Continuation<? super Result<V6CalldataResponseData>> continuation) throws java.lang.Throwable {
        MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1 memeV6MarketTxV6UseCase$getOrCreateTransactionData$1;
        AbstractC28328kXi abstractC28328kXi;
        if (continuation instanceof MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1) {
            memeV6MarketTxV6UseCase$getOrCreateTransactionData$1 = (MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1) continuation;
            int i2 = memeV6MarketTxV6UseCase$getOrCreateTransactionData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$getOrCreateTransactionData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$getOrCreateTransactionData$1 = new MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1(this, continuation);
            }
        }
        MemeV6MarketTxV6UseCase$getOrCreateTransactionData$1 memeV6MarketTxV6UseCase$getOrCreateTransactionData$12 = memeV6MarketTxV6UseCase$getOrCreateTransactionData$1;
        java.lang.Object objEZpvd = memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                if (v6CalldataResponseData != null) {
                    Result.Application application = Result.Companion;
                    return Result.m7377constructorimpl(v6CalldataResponseData);
                }
                CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
                DexMultiTokenInfoBean fromToken = commonDexInfo != null ? commonDexInfo.getFromToken() : null;
                if (fromToken == null) {
                    pUU.copydefault(AbstractC28328kXi.class.getSimpleName(), "fromToken is null, commonDexInfo: " + v6BaseQuoteResponse.getCommonDexInfo());
                    Result.Application application2 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.hrnhsO), null, null, 13, null)));
                }
                memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.L$0 = this;
                memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.label = 1;
                objEZpvd = EZpvd(fromToken, defiPlatformInfo, i, v6CalldataParams, memeV6MarketTxV6UseCase$getOrCreateTransactionData$12);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                abstractC28328kXi = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                    Result.Application application3 = Result.Companion;
                    return Result.m7377constructorimpl((V6CalldataResponseData) objEZpvd);
                }
                abstractC28328kXi = (AbstractC28328kXi) memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            V6CalldataRequest v6CalldataRequest = (V6CalldataRequest) objEZpvd;
            memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.L$0 = null;
            memeV6MarketTxV6UseCase$getOrCreateTransactionData$12.label = 2;
            objEZpvd = abstractC28328kXi.copydefault(v6CalldataRequest, memeV6MarketTxV6UseCase$getOrCreateTransactionData$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            Result.Application application32 = Result.Companion;
            return Result.m7377constructorimpl((V6CalldataResponseData) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application4 = Result.Companion;
            OKServerException oKServerException = th instanceof OKServerException ? th : null;
            if (oKServerException == null) {
                oKServerException = new OKServerException(0, C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.hrnhsO), null, th, 5, null);
            }
            return Result.m7377constructorimpl(C56391yDq.EZpvd(oKServerException));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, DefiPlatformInfo defiPlatformInfo, int i, V6CalldataParams v6CalldataParams, Continuation<? super V6CalldataRequest> continuation) throws java.lang.Throwable {
        MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1 memeV6MarketTxV6UseCase$buildV6CallDataRequest$1;
        java.lang.String str;
        DefiPlatformInfo defiPlatformInfo2;
        V6CalldataParams v6CalldataParams2;
        int i2;
        java.lang.String str2;
        if (continuation instanceof MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1) {
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1 = (MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1) continuation;
            int i3 = memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.label = i3 - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$buildV6CallDataRequest$1 = new MemeV6MarketTxV6UseCase$buildV6CallDataRequest$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.lang.String strCopydefault = AhwBna().copydefault(dexMultiTokenInfoBean.getChainId());
            kKG kkgAhwBna = AhwBna();
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$0 = defiPlatformInfo;
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$1 = v6CalldataParams;
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$2 = strCopydefault;
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.I$0 = i;
            memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.label = 1;
            objAEQbTJ = kkgAhwBna.AEQbTJ(memeV6MarketTxV6UseCase$buildV6CallDataRequest$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = strCopydefault;
            defiPlatformInfo2 = defiPlatformInfo;
            v6CalldataParams2 = v6CalldataParams;
            i2 = i;
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.I$0;
            java.lang.String str3 = (java.lang.String) memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$2;
            v6CalldataParams2 = (V6CalldataParams) memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$1;
            defiPlatformInfo2 = (DefiPlatformInfo) memeV6MarketTxV6UseCase$buildV6CallDataRequest$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            str = str3;
        }
        AccountInfo accountInfo = new AccountInfo((java.lang.String) null, C56443yFo.AEQbTJ(2), (java.lang.Boolean) null, (java.lang.String) objAEQbTJ, 5, (DefaultConstructorMarker) null);
        PreSetConfig preSetConfig = v6CalldataParams2.getPreSetConfig();
        CalldataPermit2 permit2 = v6CalldataParams2.getPermit2();
        java.lang.String strKWHzl = AbstractC22421hez.Companion.KWHzl();
        SlippageConfig slippageConfig = v6CalldataParams2.getSlippageConfig();
        java.lang.String quoteId = v6CalldataParams2.getQuoteId();
        if (quoteId == null) {
            java.lang.String quoteId2 = defiPlatformInfo2 != null ? defiPlatformInfo2.getQuoteId() : null;
            if (quoteId2 == null) {
                quoteId2 = "";
            }
            str2 = quoteId2;
        } else {
            str2 = quoteId;
        }
        return new V6CalldataRequest(java.lang.String.valueOf(i2), false, strKWHzl, (NetworkFee) null, slippageConfig, accountInfo, preSetConfig, permit2, str, str2, 10, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, boolean z, V6CalldataResponseData v6CalldataResponseData, java.lang.String str2, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6MarketTxV6UseCase$buildAndSubmitTransaction$1 memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1;
        if (continuation instanceof MemeV6MarketTxV6UseCase$buildAndSubmitTransaction$1) {
            memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1 = (MemeV6MarketTxV6UseCase$buildAndSubmitTransaction$1) continuation;
            int i = memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1 = new MemeV6MarketTxV6UseCase$buildAndSubmitTransaction$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherAEQbTJ = AEQbTJ();
            MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1 memeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1 = new MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1(null, this, v6BaseQuoteResponse, v6CalldataResponseData, str, z, str2, fragmentActivity, z2, taskDescription);
            memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, memeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1, memeV6MarketTxV6UseCase$buildAndSubmitTransaction$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.kXi$ActionBar */
    public static final class ActionBar implements Function1<kotlin.Pair<? extends InterfaceC9734bbF, ? extends V6BaseQuoteResponse>, InterfaceC60096zvd<? extends ResponseData<C9748bbT>>> {
        public final /* synthetic */ InterfaceC9740bbL.TaskDescription AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ FragmentActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription) {
            this.copydefault = fragmentActivity;
            this.EZpvd = z;
            this.AEQbTJ = taskDescription;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<C9748bbT>> invoke(kotlin.Pair<? extends InterfaceC9734bbF, ? extends V6BaseQuoteResponse> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return AbstractC28328kXi.this.copydefault().KWHzl(pair.component1(), this.copydefault, this.EZpvd, this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.kXi$Activity */
    public static final class Activity implements Function1<ResponseData<C9748bbT>, java.lang.String> {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(ResponseData<C9748bbT> responseData) throws OKServerException {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(responseData, "");
            int code = responseData.getCode();
            C9748bbT data = responseData.getData();
            java.lang.String strGEmmrt = data != null ? data.gEmmrt() : null;
            pUU.EZpvd("MemeV6MarketTxV6UseCase", "submitTransaction result: code=" + code + ", txId=" + strGEmmrt + ", msg=" + responseData.getMsg());
            if (responseData.getCode() != -5001) {
                int code2 = responseData.getCode();
                java.lang.String msg = responseData.getMsg();
                if (msg.length() == 0) {
                    str = "Transaction failed with code: " + responseData.getCode();
                } else {
                    str = msg;
                }
                throw new OKServerException(code2, str, null, null, 12, null);
            }
            C9748bbT data2 = responseData.getData();
            java.lang.String strGEmmrt2 = data2 != null ? data2.gEmmrt() : null;
            return strGEmmrt2 == null ? "" : strGEmmrt2;
        }
    }

    public static /* synthetic */ AbstractC58185ywX buildTransaction$default(AbstractC28328kXi abstractC28328kXi, V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildTransaction");
        }
        if ((i & 2) != 0) {
            v6CalldataResponseData = null;
        }
        return abstractC28328kXi.copydefault(v6BaseQuoteResponse, v6CalldataResponseData, str, z, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(V6CalldataRequest v6CalldataRequest, Continuation<? super V6CalldataResponseData> continuation) throws java.lang.Throwable {
        MemeV6MarketTxV6UseCase$getV6CallData$1 memeV6MarketTxV6UseCase$getV6CallData$1;
        if (continuation instanceof MemeV6MarketTxV6UseCase$getV6CallData$1) {
            memeV6MarketTxV6UseCase$getV6CallData$1 = (MemeV6MarketTxV6UseCase$getV6CallData$1) continuation;
            int i = memeV6MarketTxV6UseCase$getV6CallData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6MarketTxV6UseCase$getV6CallData$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6MarketTxV6UseCase$getV6CallData$1 = new MemeV6MarketTxV6UseCase$getV6CallData$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = memeV6MarketTxV6UseCase$getV6CallData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6MarketTxV6UseCase$getV6CallData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            gYX gyxEZpvd = EZpvd();
            memeV6MarketTxV6UseCase$getV6CallData$1.label = 1;
            objOLrzqt = gyxEZpvd.OLrzqt(v6CalldataRequest, memeV6MarketTxV6UseCase$getV6CallData$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((AbstractC43419rot) objOLrzqt).AEQbTJ();
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(java.util.Map<java.lang.String, java.lang.String> map, NewCallbackBean.DexCallbackBean dexCallbackBean, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, boolean z) {
        return RxFlowableKt.rxFlowable(AEQbTJ(), new MemeV6MarketTxV6UseCase$broadcastEoaOrder$1(dexCallbackBean, this, map, v6CalldataResponseData, str, z, null));
    }
}
