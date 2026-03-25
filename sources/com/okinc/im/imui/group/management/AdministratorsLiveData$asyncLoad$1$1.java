package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C34198nVb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sIR;

/* JADX INFO: loaded from: classes18.dex */
public final class AdministratorsLiveData$asyncLoad$1$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends GroupMemberInfo>>, Object> {
    final /* synthetic */ InterfaceC35180nqU $service;
    int label;
    final /* synthetic */ C34198nVb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdministratorsLiveData$asyncLoad$1$1(InterfaceC35180nqU interfaceC35180nqU, C34198nVb c34198nVb, Continuation<? super AdministratorsLiveData$asyncLoad$1$1> continuation) {
        super(1, continuation);
        this.$service = interfaceC35180nqU;
        this.this$0 = c34198nVb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AdministratorsLiveData$asyncLoad$1$1(this.$service, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends GroupMemberInfo>> continuation) {
        return invoke2((Continuation<? super List<GroupMemberInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<GroupMemberInfo>> continuation) {
        return ((AdministratorsLiveData$asyncLoad$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sirCopydefault = this.$service.AEQbTJ().copydefault();
            String strAEQbTJ = this.this$0.AEQbTJ();
            this.label = 1;
            obj = sirCopydefault.OLrzqt(strAEQbTJ, this);
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
