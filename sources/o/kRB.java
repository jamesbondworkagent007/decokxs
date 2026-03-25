package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$getTransactionData$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$submitOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$submitOrderSingleSign$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDexService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.AbstractC43419rot;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kRB {
    public abstract C19700gMb AEQbTJ();

    public abstract C28196kSl EZpvd();

    public AbstractC58185ywX<java.util.List<WalletDexService.SupportedMevNodeBean>> EZpvd(java.lang.String str, boolean z) {
        return null;
    }

    public abstract gYX KWHzl();

    public abstract AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    public abstract java.lang.Object OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull Continuation<? super Result<java.lang.String>> continuation);

    public abstract java.util.List<java.lang.String> OLrzqt(@NotNull NewCallbackBean newCallbackBean, @NotNull V6CalldataResponseData v6CalldataResponseData);

    public abstract CoroutineDispatcher OLrzqt();

    public abstract C28180kRw copydefault();

    public static final class Activity implements Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ kRB KWHzl;
        public final /* synthetic */ V6CalldataResponseData OLrzqt;
        public final /* synthetic */ C28180kRw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C28180kRw c28180kRw, java.lang.String str, kRB krb, V6CalldataResponseData v6CalldataResponseData, java.lang.String str2) {
            this.copydefault = c28180kRw;
            this.EZpvd = str;
            this.KWHzl = krb;
            this.OLrzqt = v6CalldataResponseData;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final AbstractC58185ywX<ResponseData<java.lang.String>> invoke(NewCallbackBean newCallbackBean) {
            Intrinsics.checkNotNullParameter(newCallbackBean, "");
            NewCallbackBean.DexCallbackBean dexCallbackBean = newCallbackBean.getDexCallbackBean();
            java.util.List<NewCallbackBean.DexCallbackBean.SignedInfo> signedInfoList = dexCallbackBean != null ? dexCallbackBean.getSignedInfoList() : null;
            if (signedInfoList == null || signedInfoList.isEmpty()) {
                pUU.copydefault("AdvancedMarketTxHelper", "broadcastDelegate: signedInfoList is empty");
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null));
                Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                return abstractC58185ywXAEQbTJ;
            }
            this.copydefault.OLrzqt().EZpvd(this.EZpvd);
            pUU.KWHzl("AdvancedMarketTxV6UseCase", "signAuthType = " + newCallbackBean.getSignAuthType());
            return this.KWHzl.OLrzqt(newCallbackBean, this.OLrzqt, this.AEQbTJ, newCallbackBean.getSignAuthType() == SignAuthType.SILENT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataRequest v6CalldataRequest, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedMarketTxV6UseCase$submitOrder$1 advancedMarketTxV6UseCase$submitOrder$1;
        FragmentActivity fragmentActivity2;
        InterfaceC9740bbL.TaskDescription taskDescription2;
        boolean z3;
        java.lang.Object objCopydefault;
        kRB krb;
        V6BaseQuoteResponse v6BaseQuoteResponse2;
        boolean z4;
        V6CalldataResponseData transactionData;
        FragmentActivity fragmentActivity3;
        boolean z5;
        InterfaceC9740bbL.TaskDescription taskDescription3;
        kRB krb2;
        DexMultiTokenInfoBean fromToken;
        ApproveUnsignedData approveTxInfo;
        if (continuation instanceof AdvancedMarketTxV6UseCase$submitOrder$1) {
            advancedMarketTxV6UseCase$submitOrder$1 = (AdvancedMarketTxV6UseCase$submitOrder$1) continuation;
            int i = advancedMarketTxV6UseCase$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketTxV6UseCase$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketTxV6UseCase$submitOrder$1 = new AdvancedMarketTxV6UseCase$submitOrder$1(this, continuation);
            }
        }
        AdvancedMarketTxV6UseCase$submitOrder$1 advancedMarketTxV6UseCase$submitOrder$12 = advancedMarketTxV6UseCase$submitOrder$1;
        java.lang.Object obj = advancedMarketTxV6UseCase$submitOrder$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = advancedMarketTxV6UseCase$submitOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            if (commonDexInfo != null && (fromToken = commonDexInfo.getFromToken()) != null) {
                fromToken.getChainId();
            }
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (selectedDeFiPlatform == null || (transactionData = selectedDeFiPlatform.getTransactionData()) == null) {
                advancedMarketTxV6UseCase$submitOrder$12.L$0 = this;
                advancedMarketTxV6UseCase$submitOrder$12.L$1 = v6BaseQuoteResponse;
                fragmentActivity2 = fragmentActivity;
                advancedMarketTxV6UseCase$submitOrder$12.L$2 = fragmentActivity2;
                taskDescription2 = taskDescription;
                advancedMarketTxV6UseCase$submitOrder$12.L$3 = taskDescription2;
                z3 = z;
                advancedMarketTxV6UseCase$submitOrder$12.Z$0 = z3;
                advancedMarketTxV6UseCase$submitOrder$12.Z$1 = z2;
                advancedMarketTxV6UseCase$submitOrder$12.label = 1;
                objCopydefault = copydefault(v6CalldataRequest, advancedMarketTxV6UseCase$submitOrder$12);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                krb = this;
                v6BaseQuoteResponse2 = v6BaseQuoteResponse;
                z4 = z2;
            } else {
                v6BaseQuoteResponse2 = v6BaseQuoteResponse;
                z3 = z;
                fragmentActivity3 = fragmentActivity;
                z5 = z2;
                taskDescription3 = taskDescription;
                krb2 = this;
                approveTxInfo = transactionData.getApproveTxInfo();
                if (approveTxInfo == null) {
                    advancedMarketTxV6UseCase$submitOrder$12.L$0 = null;
                    advancedMarketTxV6UseCase$submitOrder$12.L$1 = null;
                    advancedMarketTxV6UseCase$submitOrder$12.L$2 = null;
                    advancedMarketTxV6UseCase$submitOrder$12.L$3 = null;
                    advancedMarketTxV6UseCase$submitOrder$12.label = 2;
                    java.lang.Object objOLrzqt = krb2.OLrzqt(v6BaseQuoteResponse2, transactionData, approveTxInfo, z3, fragmentActivity3, z5, advancedMarketTxV6UseCase$submitOrder$12);
                    return objOLrzqt == objCopydefault2 ? objCopydefault2 : objOLrzqt;
                }
                advancedMarketTxV6UseCase$submitOrder$12.L$0 = null;
                advancedMarketTxV6UseCase$submitOrder$12.L$1 = null;
                advancedMarketTxV6UseCase$submitOrder$12.L$2 = null;
                advancedMarketTxV6UseCase$submitOrder$12.L$3 = null;
                advancedMarketTxV6UseCase$submitOrder$12.label = 3;
                java.lang.Object objKWHzl = krb2.KWHzl(v6BaseQuoteResponse2, transactionData, z3, fragmentActivity3, z5, taskDescription3, advancedMarketTxV6UseCase$submitOrder$12);
                return objKWHzl == objCopydefault2 ? objCopydefault2 : objKWHzl;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return ((Result) obj).m7386unboximpl();
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            boolean z6 = advancedMarketTxV6UseCase$submitOrder$12.Z$1;
            boolean z7 = advancedMarketTxV6UseCase$submitOrder$12.Z$0;
            taskDescription2 = (InterfaceC9740bbL.TaskDescription) advancedMarketTxV6UseCase$submitOrder$12.L$3;
            FragmentActivity fragmentActivity4 = (FragmentActivity) advancedMarketTxV6UseCase$submitOrder$12.L$2;
            v6BaseQuoteResponse2 = (V6BaseQuoteResponse) advancedMarketTxV6UseCase$submitOrder$12.L$1;
            krb = (kRB) advancedMarketTxV6UseCase$submitOrder$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            z4 = z6;
            fragmentActivity2 = fragmentActivity4;
            z3 = z7;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        z5 = z4;
        transactionData = (V6CalldataResponseData) objCopydefault;
        taskDescription3 = taskDescription2;
        kRB krb3 = krb;
        fragmentActivity3 = fragmentActivity2;
        krb2 = krb3;
        approveTxInfo = transactionData.getApproveTxInfo();
        if (approveTxInfo == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, boolean z, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedMarketTxV6UseCase$submitOrderSingleSign$1 advancedMarketTxV6UseCase$submitOrderSingleSign$1;
        DexMultiTokenInfoBean fromToken;
        if (continuation instanceof AdvancedMarketTxV6UseCase$submitOrderSingleSign$1) {
            advancedMarketTxV6UseCase$submitOrderSingleSign$1 = (AdvancedMarketTxV6UseCase$submitOrderSingleSign$1) continuation;
            int i = advancedMarketTxV6UseCase$submitOrderSingleSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketTxV6UseCase$submitOrderSingleSign$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketTxV6UseCase$submitOrderSingleSign$1 = new AdvancedMarketTxV6UseCase$submitOrderSingleSign$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedMarketTxV6UseCase$submitOrderSingleSign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketTxV6UseCase$submitOrderSingleSign$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            java.lang.String str = chainId;
            CoroutineDispatcher coroutineDispatcherOLrzqt = OLrzqt();
            AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1 advancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1 = new AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1(null, this, v6BaseQuoteResponse, v6CalldataResponseData, z, str, fragmentActivity, z2, taskDescription);
            advancedMarketTxV6UseCase$submitOrderSingleSign$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, advancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1, advancedMarketTxV6UseCase$submitOrderSingleSign$1);
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

    public static final class ActionBar implements Function1<kotlin.Pair<? extends InterfaceC9734bbF, ? extends V6BaseQuoteResponse>, InterfaceC60096zvd<? extends ResponseData<C9748bbT>>> {
        public final /* synthetic */ InterfaceC9740bbL.TaskDescription AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ FragmentActivity KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription) {
            this.KWHzl = fragmentActivity;
            this.EZpvd = z;
            this.AEQbTJ = taskDescription;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<C9748bbT>> invoke(kotlin.Pair<? extends InterfaceC9734bbF, ? extends V6BaseQuoteResponse> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return kRB.this.copydefault().KWHzl(pair.component1(), this.KWHzl, this.EZpvd, this.AEQbTJ);
        }
    }

    public static final class TaskDescription implements Function1<ResponseData<C9748bbT>, java.lang.String> {
        public static final TaskDescription OLrzqt = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke(ResponseData<C9748bbT> responseData) throws OKServerException {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(responseData, "");
            int code = responseData.getCode();
            C9748bbT data = responseData.getData();
            java.lang.String strGEmmrt = data != null ? data.gEmmrt() : null;
            pUU.EZpvd("AdvancedMarketTxV6UseCase", "submitTransaction result: code=" + code + ", txId=" + strGEmmrt + ", msg=" + responseData.getMsg());
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(V6CalldataRequest v6CalldataRequest, Continuation<? super Result<V6CalldataResponseData>> continuation) throws java.lang.Throwable {
        AdvancedMarketTxV6UseCase$getTransactionData$1 advancedMarketTxV6UseCase$getTransactionData$1;
        if (continuation instanceof AdvancedMarketTxV6UseCase$getTransactionData$1) {
            advancedMarketTxV6UseCase$getTransactionData$1 = (AdvancedMarketTxV6UseCase$getTransactionData$1) continuation;
            int i = advancedMarketTxV6UseCase$getTransactionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMarketTxV6UseCase$getTransactionData$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMarketTxV6UseCase$getTransactionData$1 = new AdvancedMarketTxV6UseCase$getTransactionData$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = advancedMarketTxV6UseCase$getTransactionData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMarketTxV6UseCase$getTransactionData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            gYX gyxKWHzl = KWHzl();
            advancedMarketTxV6UseCase$getTransactionData$1.label = 1;
            objOLrzqt = gyxKWHzl.OLrzqt(v6CalldataRequest, advancedMarketTxV6UseCase$getTransactionData$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(NewCallbackBean newCallbackBean, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, boolean z) {
        return RxFlowableKt.rxFlowable(OLrzqt(), new AdvancedMarketTxV6UseCase$broadcastAdvancedOrder$1(this, newCallbackBean, v6CalldataResponseData, str, z, null));
    }
}
