package com.okinc.im.imui.group.info.viewmodel;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C36553odD;
import o.C36554odE;
import o.C56391yDq;
import o.C56442yFn;
import o.oDF;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$uiState$1$1 extends SuspendLambda implements yHT<oDF.StateListAnimator, C36554odE, C36553odD, Continuation<? super Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupProfileViewModel$uiState$1$1(Continuation<? super GroupProfileViewModel$uiState$1$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(oDF.StateListAnimator stateListAnimator, C36554odE c36554odE, C36553odD c36553odD, Continuation<? super Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD>> continuation) {
        return invoke2(stateListAnimator, c36554odE, c36553odD, (Continuation<? super Triple<oDF.StateListAnimator, C36554odE, C36553odD>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(oDF.StateListAnimator stateListAnimator, C36554odE c36554odE, C36553odD c36553odD, Continuation<? super Triple<oDF.StateListAnimator, C36554odE, C36553odD>> continuation) {
        GroupProfileViewModel$uiState$1$1 groupProfileViewModel$uiState$1$1 = new GroupProfileViewModel$uiState$1$1(continuation);
        groupProfileViewModel$uiState$1$1.L$0 = stateListAnimator;
        groupProfileViewModel$uiState$1$1.L$1 = c36554odE;
        groupProfileViewModel$uiState$1$1.L$2 = c36553odD;
        return groupProfileViewModel$uiState$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new Triple((oDF.StateListAnimator) this.L$0, (C36554odE) this.L$1, (C36553odD) this.L$2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
