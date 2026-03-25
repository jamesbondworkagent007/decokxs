package com.okinc.business.invest_biz.data.handler;

import android.content.Context;
import android.os.Bundle;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.handler.BaseTransactionHandler$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC25522iyM;
import o.AbstractC58185ywX;
import o.C25493ixk;
import o.C25523iyN;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25466ixJ;
import o.InterfaceC25530iyU;
import o.InterfaceC9854bdT;
import o.iFG;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionHandler$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC25530iyU, Unit> $callback;
    final /* synthetic */ C25523iyN $claimRequestParams;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterfaceC25466ixJ $hostRef;
    final /* synthetic */ InvestTxModel $transactionRequest;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ AbstractC25522iyM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.iyU, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseTransactionHandler$invoke$1(AbstractC25522iyM abstractC25522iyM, InvestTxModel investTxModel, Function1<? super InterfaceC25530iyU, Unit> function1, C25523iyN c25523iyN, InterfaceC25466ixJ interfaceC25466ixJ, Context context, Continuation<? super BaseTransactionHandler$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC25522iyM;
        this.$transactionRequest = investTxModel;
        this.$callback = function1;
        this.$claimRequestParams = c25523iyN;
        this.$hostRef = interfaceC25466ixJ;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionHandler$invoke$1(this.this$0, this.$transactionRequest, this.$callback, this.$claimRequestParams, this.$hostRef, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionHandler$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:7:0x0024, B:25:0x007a, B:31:0x0092, B:33:0x0099, B:37:0x00cb, B:40:0x00d2, B:41:0x00e4, B:35:0x00bc, B:36:0x00ca, B:11:0x0030, B:17:0x004b, B:19:0x005d, B:21:0x0062, B:14:0x003e), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:7:0x0024, B:25:0x007a, B:31:0x0092, B:33:0x0099, B:37:0x00cb, B:40:0x00d2, B:41:0x00e4, B:35:0x00bc, B:36:0x00ca, B:11:0x0030, B:17:0x004b, B:19:0x005d, B:21:0x0062, B:14:0x003e), top: B:46:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[Catch: all -> 0x00e5, TryCatch #0 {all -> 0x00e5, blocks: (B:7:0x0024, B:25:0x007a, B:31:0x0092, B:33:0x0099, B:37:0x00cb, B:40:0x00d2, B:41:0x00e4, B:35:0x00bc, B:36:0x00ca, B:11:0x0030, B:17:0x004b, B:19:0x005d, B:21:0x0062, B:14:0x003e), top: B:46:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object obj2;
        final AbstractC25522iyM abstractC25522iyM;
        final Function1<InterfaceC25530iyU, Unit> function1;
        Context context;
        InvestTxModel investTxModel;
        InvestCallDataResult investCallDataResult;
        Context context2;
        final InvestTxModel investTxModel2;
        InvestCallDataResult investCallDataResult2;
        boolean z;
        Object obj3;
        final Context context3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            this.$callback.invoke(this.this$0.copydefault(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC25522iyM abstractC25522iyM2 = this.this$0;
            InvestTxModel investTxModel3 = this.$transactionRequest;
            this.label = 1;
            objEZpvd = abstractC25522iyM2.EZpvd(investTxModel3, (Continuation<? super Result<InvestCallDataResult>>) this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investCallDataResult2 = (InvestCallDataResult) this.L$5;
            investTxModel2 = (InvestTxModel) this.L$4;
            context2 = (Context) this.L$3;
            function1 = (Function1) this.L$2;
            abstractC25522iyM = (AbstractC25522iyM) this.L$1;
            obj2 = this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                investCallDataResult = investCallDataResult2;
                investTxModel = investTxModel2;
                context = context2;
                z = true;
                obj3 = obj2;
                context3 = context;
                investTxModel2 = investTxModel;
                investCallDataResult2 = investCallDataResult;
                if (!z) {
                    throw new OKServerException(5, "GasFee Reminder popup and user cancelled", null, null, 12, null);
                }
                function1.invoke(InterfaceC25530iyU.TaskDescription.copydefault);
                if (context3 != null) {
                    InterfaceC9854bdT.Application.startContractTx$default(abstractC25522iyM.copydefault, context3, iFG.Companion.AEQbTJ(investCallDataResult2.EZpvd(), investTxModel2), new Function1() { // from class: o.iyJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return BaseTransactionHandler$invoke$1.invokeSuspend$lambda$2$lambda$0(function1, abstractC25522iyM, (android.os.Bundle) obj4);
                        }
                    }, new Function1() { // from class: o.iyL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return BaseTransactionHandler$invoke$1.invokeSuspend$lambda$2$lambda$1(abstractC25522iyM, investTxModel2, context3, (NewCallbackBean) obj4);
                        }
                    }, null, 16, null);
                }
                obj2 = obj3;
                if (Result.m7380exceptionOrNullimpl(obj2) == null) {
                    throw new OKServerException(2, C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY), null, null, 12, null);
                }
                return Unit.INSTANCE;
            }
            z = false;
            obj3 = obj2;
            context3 = context2;
            if (!z) {
            }
        }
        obj2 = objEZpvd;
        C25523iyN c25523iyN = this.$claimRequestParams;
        abstractC25522iyM = this.this$0;
        InterfaceC25466ixJ interfaceC25466ixJ = this.$hostRef;
        function1 = this.$callback;
        context = this.$context;
        investTxModel = this.$transactionRequest;
        if (Result.m7384isSuccessimpl(obj2)) {
            investCallDataResult = (InvestCallDataResult) obj2;
            if (c25523iyN != null) {
                this.L$0 = obj2;
                this.L$1 = abstractC25522iyM;
                this.L$2 = function1;
                this.L$3 = context;
                this.L$4 = investTxModel;
                this.L$5 = investCallDataResult;
                this.label = 2;
                obj = abstractC25522iyM.KWHzl(interfaceC25466ixJ, c25523iyN, investCallDataResult, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                context2 = context;
                investTxModel2 = investTxModel;
                investCallDataResult2 = investCallDataResult;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            z = true;
            obj3 = obj2;
            context3 = context;
            investTxModel2 = investTxModel;
            investCallDataResult2 = investCallDataResult;
            if (!z) {
            }
        }
        if (Result.m7380exceptionOrNullimpl(obj2) == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(Function1 function1, AbstractC25522iyM abstractC25522iyM, Bundle bundle) {
        function1.invoke(abstractC25522iyM.KWHzl(bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC58185ywX invokeSuspend$lambda$2$lambda$1(AbstractC25522iyM abstractC25522iyM, InvestTxModel investTxModel, Context context, NewCallbackBean newCallbackBean) {
        return abstractC25522iyM.copydefault(newCallbackBean, investTxModel, context);
    }
}
