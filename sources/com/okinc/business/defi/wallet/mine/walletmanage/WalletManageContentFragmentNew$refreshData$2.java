package com.okinc.business.defi.wallet.mine.walletmanage;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C17351fCc;
import o.C17671fNz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManageContentFragmentNew$refreshData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.IntRef $refreshCount;
    final /* synthetic */ long $startTimeMillis;
    int label;
    final /* synthetic */ C17351fCc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManageContentFragmentNew$refreshData$2(Ref.IntRef intRef, long j, C17351fCc c17351fCc, Continuation<? super WalletManageContentFragmentNew$refreshData$2> continuation) {
        super(2, continuation);
        this.$refreshCount = intRef;
        this.$startTimeMillis = j;
        this.this$0 = c17351fCc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManageContentFragmentNew$refreshData$2(this.$refreshCount, this.$startTimeMillis, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletManageContentFragmentNew$refreshData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C17671fNz instance$default = C17671fNz.TaskDescription.getInstance$default(C17671fNz.Companion, null, 1, null);
            this.label = 1;
            objKWHzl = instance$default.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        Ref.IntRef intRef = this.$refreshCount;
        long j = this.$startTimeMillis;
        C17351fCc c17351fCc = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            ((Boolean) objKWHzl).booleanValue();
            int i2 = intRef.element + 1;
            intRef.element = i2;
            C17351fCc.KWHzl(j, c17351fCc, i2);
        }
        Ref.IntRef intRef2 = this.$refreshCount;
        long j2 = this.$startTimeMillis;
        C17351fCc c17351fCc2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            int i3 = intRef2.element + 1;
            intRef2.element = i3;
            C17351fCc.KWHzl(j2, c17351fCc2, i3);
        }
        return Unit.INSTANCE;
    }
}
