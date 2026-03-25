package com.okinc.business.defi.wallet.tee.converter.ui.fragment;

import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C9748bbT;
import o.fUF;
import o.fUX;

/* JADX INFO: loaded from: classes18.dex */
public final class OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<C9748bbT> $it;
    final /* synthetic */ String $unsignedIntent;
    int label;
    final /* synthetic */ fUF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1(fUF fuf, String str, ResponseData<C9748bbT> responseData, Continuation<? super OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fuf;
        this.$unsignedIntent = str;
        this.$it = responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1(this.this$0, this.$unsignedIntent, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrderConfirmBottomSheet$onFooterCreated$1$2$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fUX fuxGEmmrt = this.this$0.gEmmrt();
            String str = this.$unsignedIntent;
            C9748bbT data = this.$it.getData();
            String strAEQbTJ = data != null ? data.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            this.label = 1;
            if (fuxGEmmrt.OLrzqt(str, strAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
