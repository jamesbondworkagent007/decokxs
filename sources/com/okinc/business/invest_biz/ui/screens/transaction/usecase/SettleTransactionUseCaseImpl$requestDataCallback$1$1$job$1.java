package com.okinc.business.invest_biz.ui.screens.transaction.usecase;

import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.request.InvestSubscriptionReceiveReq;
import com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25493ixk;
import o.C26758jiP;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC58184ywW;
import o.InterfaceC9738bbJ;
import o.iCG;
import o.iDD;
import o.iFG;
import o.iFJ;
import o.iFN;

/* JADX INFO: loaded from: classes6.dex */
public final class SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $amount;
    final /* synthetic */ TransactionConfig $config;
    final /* synthetic */ InvestTokenWithAmount $currentToken;
    final /* synthetic */ InterfaceC58184ywW<ResponseData<String>> $emitter;
    final /* synthetic */ InvestTxModel $model;
    final /* synthetic */ String $updatedInputAmount;
    final /* synthetic */ InterfaceC9738bbJ $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C26758jiP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1(C26758jiP c26758jiP, TransactionConfig transactionConfig, String str, String str2, InterfaceC9738bbJ interfaceC9738bbJ, InvestTokenWithAmount investTokenWithAmount, InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW, InvestTxModel investTxModel, Continuation<? super SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1> continuation) {
        super(2, continuation);
        this.this$0 = c26758jiP;
        this.$config = transactionConfig;
        this.$updatedInputAmount = str;
        this.$amount = str2;
        this.$wallet = interfaceC9738bbJ;
        this.$currentToken = investTokenWithAmount;
        this.$emitter = interfaceC58184ywW;
        this.$model = investTxModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1(this.this$0, this.$config, this.$updatedInputAmount, this.$amount, this.$wallet, this.$currentToken, this.$emitter, this.$model, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        String strEZpvd;
        String strDbNXlk;
        Object objOLrzqt;
        InvestTxModel investTxModel;
        InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iFN ifn = this.this$0.EZpvd;
            iDD.TaskDescription taskDescription = iDD.Companion;
            TransactionConfig transactionConfig = this.$config;
            String str = this.$updatedInputAmount;
            if (str == null) {
                str = this.$amount;
            }
            InterfaceC9738bbJ interfaceC9738bbJ = this.$wallet;
            String str2 = (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) ? "" : strDbNXlk;
            InterfaceC9738bbJ interfaceC9738bbJ2 = this.$wallet;
            InvestSubscriptionReceiveReq investSubscriptionReceiveReqKWHzl = taskDescription.KWHzl(transactionConfig, str, "", str2, (interfaceC9738bbJ2 == null || (strEZpvd = interfaceC9738bbJ2.EZpvd(this.$config.copydefault())) == null) ? "" : strEZpvd, this.$currentToken);
            String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$config.copydefault()));
            TransactionConfig transactionConfig2 = this.$config;
            this.label = 1;
            objEZpvd = ifn.EZpvd(investSubscriptionReceiveReqKWHzl, strGEmmrt, transactionConfig2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                investTxModel = (InvestTxModel) this.L$2;
                interfaceC58184ywW = (InterfaceC58184ywW) this.L$1;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    interfaceC58184ywW.onError(thM7380exceptionOrNullimpl);
                    interfaceC58184ywW.onComplete();
                }
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                    String signDataJson = iFG.Companion.AEQbTJ(((InvestCallDataResult) objOLrzqt).EZpvd(), investTxModel).getSignDataJson();
                    if (signDataJson.length() == 0) {
                        interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
                        interfaceC58184ywW.onComplete();
                    } else {
                        interfaceC58184ywW.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, signDataJson, null, 46, null));
                        interfaceC58184ywW.onComplete();
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW2 = this.$emitter;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
        if (thM7380exceptionOrNullimpl2 != null) {
            interfaceC58184ywW2.onError(thM7380exceptionOrNullimpl2);
            interfaceC58184ywW2.onComplete();
        }
        InvestTxModel investTxModel2 = this.$model;
        TransactionConfig transactionConfig3 = this.$config;
        C26758jiP c26758jiP = this.this$0;
        InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW3 = this.$emitter;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            InvestTxModel investTxModelKWHzl = iCG.copydefault.KWHzl(investTxModel2, (InvestDetailsAndGasFee) objEZpvd, transactionConfig3);
            iFJ ifj = c26758jiP.copydefault;
            this.L$0 = objEZpvd;
            this.L$1 = interfaceC58184ywW3;
            this.L$2 = investTxModelKWHzl;
            this.label = 2;
            objOLrzqt = ifj.OLrzqt(investTxModelKWHzl, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            investTxModel = investTxModelKWHzl;
            interfaceC58184ywW = interfaceC58184ywW3;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7384isSuccessimpl(objOLrzqt)) {
            }
        }
        return Unit.INSTANCE;
    }
}
