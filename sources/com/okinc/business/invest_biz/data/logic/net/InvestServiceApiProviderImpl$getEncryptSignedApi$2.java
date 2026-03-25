package com.okinc.business.invest_biz.data.logic.net;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;
import o.iBA;
import o.iBG;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestServiceApiProviderImpl$getEncryptSignedApi$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC25472ixP>, Object> {
    final /* synthetic */ AbstractC58185ywX<String> $flowable;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ iBG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestServiceApiProviderImpl$getEncryptSignedApi$2(AbstractC58185ywX<String> abstractC58185ywX, String str, iBG ibg, Continuation<? super InvestServiceApiProviderImpl$getEncryptSignedApi$2> continuation) {
        super(2, continuation);
        this.$flowable = abstractC58185ywX;
        this.$walletId = str;
        this.this$0 = ibg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestServiceApiProviderImpl$getEncryptSignedApi$2(this.$flowable, this.$walletId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC25472ixP> continuation) {
        return ((InvestServiceApiProviderImpl$getEncryptSignedApi$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC58185ywX<String> abstractC58185ywX = this.$flowable;
                String str2 = this.$walletId;
                Result.Application application = Result.Companion;
                this.L$0 = str2;
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywX, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            String str3 = (String) obj;
            InterfaceC25472ixP.TaskDescription taskDescription = InterfaceC25472ixP.Companion;
            Intrinsics.copydefault((Object) str3);
            if (str == null) {
                str = "";
            }
            objM7377constructorimpl = Result.m7377constructorimpl(taskDescription.EZpvd(new iBA(str3, str, "TIME")));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : this.this$0.OLrzqt();
    }
}
