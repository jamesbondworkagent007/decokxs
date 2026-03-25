package com.okinc.ok_kyc_core.presentation.verify;

import com.okinc.ok_kyc_core.data.remote.networkmodel.VendorVerifyRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43846rww;
import o.C42203rKd;
import o.C56391yDq;
import o.C56442yFn;
import o.rJF;

/* JADX INFO: loaded from: classes23.dex */
public final class OcrVerifyFragment$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ rJF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcrVerifyFragment$onViewCreated$2(rJF rjf, Continuation<? super OcrVerifyFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = rjf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OcrVerifyFragment$onViewCreated$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OcrVerifyFragment$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC43846rww abstractC43846rwwAEQbTJ = this.this$0.AEQbTJ();
            if (abstractC43846rwwAEQbTJ != null) {
                abstractC43846rwwAEQbTJ.KWHzl.setAutoMirrored(true);
                abstractC43846rwwAEQbTJ.KWHzl.KWHzl(0L);
            }
            VendorVerifyRequest vendorVerifyRequest = new VendorVerifyRequest(0L, (ArrayList) null, (Integer) null, (Integer) null, (String) null, this.this$0.gHZMYf, this.this$0.AxsJAY, this.this$0.AubY, this.this$0.AYXKKw(), this.this$0.copydefault(), this.this$0.valueOf(), 31, (DefaultConstructorMarker) null);
            C42203rKd c42203rKdFetchVPNInfo = this.this$0.fetchVPNInfo();
            this.label = 1;
            if (c42203rKdFetchVPNInfo.KWHzl(vendorVerifyRequest, this) == objCopydefault) {
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
