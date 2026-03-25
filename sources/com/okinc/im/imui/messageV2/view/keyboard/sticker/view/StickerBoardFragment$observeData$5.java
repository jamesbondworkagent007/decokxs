package com.okinc.im.imui.messageV2.view.keyboard.sticker.view;

import androidx.appcompat.widget.LinearLayoutCompat;
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
import o.C36965oks;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36968okv;
import o.nKF;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerBoardFragment$observeData$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36965oks this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardFragment$observeData$5(C36965oks c36965oks, Continuation<? super StickerBoardFragment$observeData$5> continuation) {
        super(2, continuation);
        this.this$0 = c36965oks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardFragment$observeData$5(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerBoardFragment$observeData$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$5$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC36968okv, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C36965oks this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C36965oks c36965oks, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c36965oks;
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
        public final Object invoke(InterfaceC36968okv interfaceC36968okv, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC36968okv, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC36968okv interfaceC36968okv = (InterfaceC36968okv) this.L$0;
                if (interfaceC36968okv instanceof InterfaceC36968okv.TaskDescription) {
                    nKF nkf = this.this$0.AkhnZx;
                    if (nkf != null) {
                        C36965oks c36965oks = this.this$0;
                        LinearLayoutCompat linearLayoutCompat = nkf.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                        linearLayoutCompat.setVisibility(0);
                        LinearLayoutCompat root = nkf.AEQbTJ.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "");
                        root.setVisibility(8);
                        RecyclerView recyclerView = nkf.isConnected;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                        recyclerView.setVisibility(0);
                        c36965oks.valueOf().submitList(((InterfaceC36968okv.TaskDescription) interfaceC36968okv).AEQbTJ());
                    }
                } else if (Intrinsics.EZpvd(interfaceC36968okv, InterfaceC36968okv.ActionBar.EZpvd)) {
                    nKF nkf2 = this.this$0.AkhnZx;
                    if (nkf2 != null) {
                        LinearLayoutCompat linearLayoutCompat2 = nkf2.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
                        linearLayoutCompat2.setVisibility(8);
                        LinearLayoutCompat root2 = nkf2.AEQbTJ.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root2, "");
                        root2.setVisibility(0);
                        RecyclerView recyclerView2 = nkf2.isConnected;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                        recyclerView2.setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
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
            StateFlow<InterfaceC36968okv> stateFlowOLrzqt = this.this$0.gEmmrt().OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowOLrzqt, anonymousClass1, this) == objCopydefault) {
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
