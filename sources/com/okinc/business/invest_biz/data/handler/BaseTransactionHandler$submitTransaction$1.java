package com.okinc.business.invest_biz.data.handler;

import android.content.Context;
import com.google.gson.JsonObject;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC25522iyM;
import o.C23724iGz;
import o.C25493ixk;
import o.C56391yDq;
import o.C56442yFn;
import o.iEQ;
import o.iGH;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionHandler$submitTransaction$1 extends SuspendLambda implements Function2<ProducerScope<? super ResponseData<String>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ iEQ $transactionParams;
    final /* synthetic */ InvestTxModel $transactionRequest;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC25522iyM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionHandler$submitTransaction$1(AbstractC25522iyM abstractC25522iyM, iEQ ieq, InvestTxModel investTxModel, Context context, Continuation<? super BaseTransactionHandler$submitTransaction$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC25522iyM;
        this.$transactionParams = ieq;
        this.$transactionRequest = investTxModel;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseTransactionHandler$submitTransaction$1 baseTransactionHandler$submitTransaction$1 = new BaseTransactionHandler$submitTransaction$1(this.this$0, this.$transactionParams, this.$transactionRequest, this.$context, continuation);
        baseTransactionHandler$submitTransaction$1.L$0 = obj;
        return baseTransactionHandler$submitTransaction$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ResponseData<String>> producerScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionHandler$submitTransaction$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objKWHzl;
        ProducerScope producerScope2;
        Object obj2;
        ProducerScope producerScope3;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            C23724iGz c23724iGz = this.this$0.EZpvd;
            Map<String, String> mapKWHzl = this.$transactionParams.KWHzl();
            JsonObject jsonObjectCopydefault = this.$transactionParams.copydefault();
            InvestTxModel investTxModel = this.$transactionRequest;
            this.L$0 = producerScope;
            this.label = 1;
            objKWHzl = c23724iGz.KWHzl(mapKWHzl, jsonObjectCopydefault, investTxModel, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$1;
                producerScope3 = (ProducerScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                producerScope2 = producerScope3;
                Context context = this.$context;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    String string = context.getString(C25493ixk.FragmentManager.DIIpTV);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    ResponseData responseData = new ResponseData(0, (message == null || message.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) message)) ? string : message, null, null, null, null, 61, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 3;
                    if (producerScope2.send(responseData, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        Object obj3 = objKWHzl;
        producerScope2 = producerScope;
        obj2 = obj3;
        AbstractC25522iyM abstractC25522iyM = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
            iGH igh = (iGH) obj2;
            abstractC25522iyM.djBIcL = igh;
            ResponseData responseData2 = new ResponseData(0, null, null, null, igh.KWHzl(), null, 46, null);
            this.L$0 = producerScope2;
            this.L$1 = obj2;
            this.label = 2;
            if (producerScope2.send(responseData2, this) == objCopydefault) {
                return objCopydefault;
            }
            producerScope3 = producerScope2;
            producerScope2 = producerScope3;
        }
        Context context2 = this.$context;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
