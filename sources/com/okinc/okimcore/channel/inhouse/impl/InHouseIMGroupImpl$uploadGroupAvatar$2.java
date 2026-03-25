package com.okinc.okimcore.channel.inhouse.impl;

import android.net.Uri;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44124sEe;
import o.C44127sEh;
import o.C44388sNz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMGroupImpl$uploadGroupAvatar$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ Uri $groupAvatar;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44127sEh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMGroupImpl$uploadGroupAvatar$2(C44127sEh c44127sEh, Uri uri, Continuation<? super InHouseIMGroupImpl$uploadGroupAvatar$2> continuation) {
        super(2, continuation);
        this.this$0 = c44127sEh;
        this.$groupAvatar = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMGroupImpl$uploadGroupAvatar$2 inHouseIMGroupImpl$uploadGroupAvatar$2 = new InHouseIMGroupImpl$uploadGroupAvatar$2(this.this$0, this.$groupAvatar, continuation);
        inHouseIMGroupImpl$uploadGroupAvatar$2.L$0 = obj;
        return inHouseIMGroupImpl$uploadGroupAvatar$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((InHouseIMGroupImpl$uploadGroupAvatar$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C44127sEh c44127sEh = this.this$0;
            Uri uri = this.$groupAvatar;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(C44388sNz.copydefault(c44127sEh.AhwBna, uri, c44127sEh.KWHzl).AEQbTJ().getFirst().longValue()));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("InHouseIMGroupImpl => uploadGroupAvatar failed", thM7380exceptionOrNullimpl);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
