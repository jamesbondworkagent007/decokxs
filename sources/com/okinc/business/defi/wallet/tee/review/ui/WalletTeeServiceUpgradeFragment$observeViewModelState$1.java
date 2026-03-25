package com.okinc.business.defi.wallet.tee.review.ui;

import androidx.constraintlayout.widget.Group;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16692eoi;
import o.C13754dXa;
import o.C33070mpX;
import o.C52794wYp;
import o.C55178xez;
import o.C56391yDq;
import o.C56442yFn;
import o.fWG;
import o.fWX;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletTeeServiceUpgradeFragment$observeViewModelState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fWG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletTeeServiceUpgradeFragment$observeViewModelState$1(fWG fwg, Continuation<? super WalletTeeServiceUpgradeFragment$observeViewModelState$1> continuation) {
        super(2, continuation);
        this.this$0 = fwg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletTeeServiceUpgradeFragment$observeViewModelState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletTeeServiceUpgradeFragment$observeViewModelState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.ui.WalletTeeServiceUpgradeFragment$observeViewModelState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<fWX, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fWG this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fWG fwg, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fwg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fWX fwx, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(fwx, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C52794wYp c52794wYp;
            C55178xez c55178xez;
            Group group;
            C52794wYp c52794wYp2;
            C55178xez c55178xez2;
            Group group2;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (((fWX) this.L$0) instanceof fWX.ComponentName) {
                    AbstractC16692eoi abstractC16692eoi = this.this$0.OLrzqt;
                    if (abstractC16692eoi != null && (group2 = abstractC16692eoi.EZpvd) != null) {
                        group2.setVisibility(8);
                    }
                    AbstractC16692eoi abstractC16692eoi2 = this.this$0.OLrzqt;
                    if (abstractC16692eoi2 != null && (c55178xez2 = abstractC16692eoi2.OLrzqt) != null) {
                        c55178xez2.setVisibility(0);
                    }
                    AbstractC16692eoi abstractC16692eoi3 = this.this$0.OLrzqt;
                    if (abstractC16692eoi3 != null && (c52794wYp2 = abstractC16692eoi3.copydefault) != null) {
                        c52794wYp2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.gkJEwt));
                    }
                } else {
                    AbstractC16692eoi abstractC16692eoi4 = this.this$0.OLrzqt;
                    if (abstractC16692eoi4 != null && (group = abstractC16692eoi4.EZpvd) != null) {
                        group.setVisibility(0);
                    }
                    AbstractC16692eoi abstractC16692eoi5 = this.this$0.OLrzqt;
                    if (abstractC16692eoi5 != null && (c55178xez = abstractC16692eoi5.OLrzqt) != null) {
                        c55178xez.setVisibility(8);
                    }
                    AbstractC16692eoi abstractC16692eoi6 = this.this$0.OLrzqt;
                    if (abstractC16692eoi6 != null && (c52794wYp = abstractC16692eoi6.copydefault) != null) {
                        c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fGsPTM));
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<fWX> stateFlowValues = this.this$0.KWHzl().values();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowValues, anonymousClass1, this) == objCopydefault) {
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
