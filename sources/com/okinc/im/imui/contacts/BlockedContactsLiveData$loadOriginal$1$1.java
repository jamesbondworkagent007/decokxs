package com.okinc.im.imui.contacts;

import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44177sGd;

/* JADX INFO: loaded from: classes18.dex */
public final class BlockedContactsLiveData$loadOriginal$1$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends RelationInfo>>, Object> {
    final /* synthetic */ InterfaceC44177sGd $this_run;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedContactsLiveData$loadOriginal$1$1(InterfaceC44177sGd interfaceC44177sGd, Continuation<? super BlockedContactsLiveData$loadOriginal$1$1> continuation) {
        super(1, continuation);
        this.$this_run = interfaceC44177sGd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BlockedContactsLiveData$loadOriginal$1$1(this.$this_run, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends RelationInfo>> continuation) {
        return invoke2((Continuation<? super List<RelationInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<RelationInfo>> continuation) {
        return ((BlockedContactsLiveData$loadOriginal$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44177sGd interfaceC44177sGd = this.$this_run;
            this.label = 1;
            obj = interfaceC44177sGd.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
