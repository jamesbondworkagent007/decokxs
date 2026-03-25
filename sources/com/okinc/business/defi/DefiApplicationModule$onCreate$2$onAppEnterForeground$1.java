package com.okinc.business.defi;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17922fXg;
import o.C56391yDq;
import o.C56442yFn;
import o.C9678baC;
import o.InterfaceC13426dKx;
import o.fVJ;
import o.fVK;

/* JADX INFO: loaded from: classes14.dex */
public final class DefiApplicationModule$onCreate$2$onAppEnterForeground$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C9678baC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiApplicationModule$onCreate$2$onAppEnterForeground$1(C9678baC c9678baC, Continuation<? super DefiApplicationModule$onCreate$2$onAppEnterForeground$1> continuation) {
        super(2, continuation);
        this.this$0 = c9678baC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiApplicationModule$onCreate$2$onAppEnterForeground$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiApplicationModule$onCreate$2$onAppEnterForeground$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TeeMetadata teeMetadata;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
            this.label = 1;
            obj = fieldNames.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                teeMetadata = (TeeMetadata) obj;
                if (teeMetadata != null) {
                    C17922fXg.KWHzl(teeMetadata);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Number) obj).longValue() >= System.currentTimeMillis()) {
            fVK fvkKWHzl = this.this$0.KWHzl();
            this.label = 2;
            obj = fvkKWHzl.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            teeMetadata = (TeeMetadata) obj;
            if (teeMetadata != null) {
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
