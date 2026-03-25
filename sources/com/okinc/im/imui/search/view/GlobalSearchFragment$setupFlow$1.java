package com.okinc.im.imui.search.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C33546myW;
import o.C37453ouC;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37420otW;
import o.nJS;

/* JADX INFO: loaded from: classes16.dex */
public final class GlobalSearchFragment$setupFlow$1 extends SuspendLambda implements Function2<InterfaceC37420otW, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C37453ouC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchFragment$setupFlow$1(C37453ouC c37453ouC, Continuation<? super GlobalSearchFragment$setupFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c37453ouC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GlobalSearchFragment$setupFlow$1 globalSearchFragment$setupFlow$1 = new GlobalSearchFragment$setupFlow$1(this.this$0, continuation);
        globalSearchFragment$setupFlow$1.L$0 = obj;
        return globalSearchFragment$setupFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC37420otW interfaceC37420otW, Continuation<? super Unit> continuation) {
        return ((GlobalSearchFragment$setupFlow$1) create(interfaceC37420otW, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33546myW c33546myW;
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        C33546myW c33546myW2;
        C55173xeu c55173xeu2;
        C33546myW c33546myW3;
        C55173xeu c55173xeu3;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC37420otW interfaceC37420otW = (InterfaceC37420otW) this.L$0;
            if (interfaceC37420otW != null) {
                C37453ouC c37453ouC = this.this$0;
                if (Intrinsics.EZpvd(interfaceC37420otW, InterfaceC37420otW.Application.AEQbTJ)) {
                    nJS njs = c37453ouC.EZpvd;
                    if (njs != null && (c55173xeu3 = njs.copydefault) != null) {
                        c55173xeu3.setVisibility(8);
                    }
                    c37453ouC.valueOf.AEQbTJ();
                    nJS njs2 = c37453ouC.EZpvd;
                    if (njs2 != null && (c33546myW3 = njs2.EZpvd) != null) {
                        c33546myW3.AhwBna(false);
                    }
                } else if (Intrinsics.EZpvd(interfaceC37420otW, InterfaceC37420otW.ActionBar.copydefault)) {
                    nJS njs3 = c37453ouC.EZpvd;
                    if (njs3 != null && (c55173xeu2 = njs3.copydefault) != null) {
                        c55173xeu2.setVisibility(0);
                    }
                    c37453ouC.valueOf.AEQbTJ();
                    nJS njs4 = c37453ouC.EZpvd;
                    if (njs4 != null && (c33546myW2 = njs4.EZpvd) != null) {
                        c33546myW2.AhwBna(false);
                    }
                } else if (interfaceC37420otW instanceof InterfaceC37420otW.StateListAnimator) {
                    nJS njs5 = c37453ouC.EZpvd;
                    if (njs5 != null && (c55173xeu = njs5.copydefault) != null) {
                        c55173xeu.setVisibility(8);
                    }
                    nJS njs6 = c37453ouC.EZpvd;
                    if (njs6 != null && (recyclerView = njs6.OLrzqt) != null) {
                        recyclerView.setVisibility(0);
                    }
                    c37453ouC.valueOf.submitList(((InterfaceC37420otW.StateListAnimator) interfaceC37420otW).OLrzqt());
                    nJS njs7 = c37453ouC.EZpvd;
                    if (njs7 != null && (c33546myW = njs7.EZpvd) != null) {
                        c33546myW.valueOf();
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
