package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34703nhO;
import o.C56391yDq;
import o.C56442yFn;
import o.C5691aBJ;
import o.InterfaceC58765zOm;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceMasterViewModel$approve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyCrossDeviceMasterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCrossDeviceMasterViewModel$approve$1(PasskeyCrossDeviceMasterViewModel passkeyCrossDeviceMasterViewModel, Context context, Continuation<? super PasskeyCrossDeviceMasterViewModel$approve$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyCrossDeviceMasterViewModel;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyCrossDeviceMasterViewModel$approve$1(this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyCrossDeviceMasterViewModel$approve$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC58765zOm interfaceC58765zOm;
        ?? r0;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ?? r6 = this.this$0.copydefault().AEQbTJ() ? 1 : this.this$0.fJNWhG;
            interfaceC58765zOm = this.this$0.AYXKKw;
            C5691aBJ c5691aBJ = this.this$0.AkhnZx;
            Context context = this.$context;
            this.L$0 = interfaceC58765zOm;
            this.I$0 = r6;
            this.label = 1;
            Object objCopydefault2 = c5691aBJ.copydefault(context, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            r0 = r6;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.I$0;
            interfaceC58765zOm = (InterfaceC58765zOm) this.L$0;
            C56391yDq.AEQbTJ(obj);
            r0 = i2;
        }
        interfaceC58765zOm.AEQbTJ(r0 != 0, (String) obj, C34703nhO.KWHzl(this.$context));
        return Unit.INSTANCE;
    }
}
