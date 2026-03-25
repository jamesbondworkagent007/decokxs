package com.okinc.im.imui.share.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C37638oxc;
import o.C37763ozv;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC37636oxa;
import o.nKX;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareMessageBottomSheet$observeViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C37638oxc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessageBottomSheet$observeViewModel$1(C37638oxc c37638oxc, Continuation<? super ShareMessageBottomSheet$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c37638oxc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareMessageBottomSheet$observeViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareMessageBottomSheet$observeViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.share.view.ShareMessageBottomSheet$observeViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC37636oxa, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C37638oxc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C37638oxc c37638oxc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c37638oxc;
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
        public final Object invoke(InterfaceC37636oxa interfaceC37636oxa, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC37636oxa, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC37636oxa interfaceC37636oxa = (InterfaceC37636oxa) this.L$0;
                nKX nkx = this.this$0.KWHzl;
                if (nkx == null) {
                    Intrinsics.gEmmrt("");
                    nkx = null;
                }
                C37638oxc c37638oxc = this.this$0;
                if (Intrinsics.EZpvd(interfaceC37636oxa, InterfaceC37636oxa.StateListAnimator.AEQbTJ)) {
                    C55113xdn c55113xdn = nkx.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(8);
                    nkx.KWHzl.KWHzl().setEnabled(true);
                    C55173xeu c55173xeu = nkx.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(0);
                    RecyclerView recyclerView = nkx.valueOf;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                } else if (Intrinsics.EZpvd(interfaceC37636oxa, InterfaceC37636oxa.ActionBar.EZpvd)) {
                    C55113xdn c55113xdn2 = nkx.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                    c55113xdn2.setVisibility(0);
                    nkx.KWHzl.KWHzl().setEnabled(false);
                    C55173xeu c55173xeu2 = nkx.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                    c55173xeu2.setVisibility(8);
                    RecyclerView recyclerView2 = nkx.valueOf;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                    recyclerView2.setVisibility(8);
                } else {
                    if (!(interfaceC37636oxa instanceof InterfaceC37636oxa.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55113xdn c55113xdn3 = nkx.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                    c55113xdn3.setVisibility(8);
                    nkx.KWHzl.KWHzl().setEnabled(true);
                    C55173xeu c55173xeu3 = nkx.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                    c55173xeu3.setVisibility(8);
                    RecyclerView recyclerView3 = nkx.valueOf;
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    recyclerView3.setVisibility(0);
                    C37763ozv.updateList$default(c37638oxc.copydefault, ((InterfaceC37636oxa.TaskDescription) interfaceC37636oxa).EZpvd(), null, 2, null);
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
            StateFlow<InterfaceC37636oxa> stateFlowCopydefault = this.this$0.copydefault().copydefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowCopydefault, anonymousClass1, this) == objCopydefault) {
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
