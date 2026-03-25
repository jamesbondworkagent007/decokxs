package com.okinc.okex.center.ui.fragment;

import android.graphics.drawable.Drawable;
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
import o.AbstractC45235slv;
import o.C45180skt;
import o.C47463tqX;
import o.C55113xdn;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C6873aXb;

/* JADX INFO: loaded from: classes19.dex */
public final class TokenBottomSheetFragment$outlinedCardSetup$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C45180skt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenBottomSheetFragment$outlinedCardSetup$2(C45180skt c45180skt, Continuation<? super TokenBottomSheetFragment$outlinedCardSetup$2> continuation) {
        super(2, continuation);
        this.this$0 = c45180skt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenBottomSheetFragment$outlinedCardSetup$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenBottomSheetFragment$outlinedCardSetup$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okex.center.ui.fragment.TokenBottomSheetFragment$outlinedCardSetup$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC45235slv, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C45180skt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C45180skt c45180skt, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c45180skt;
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
        public final Object invoke(AbstractC45235slv abstractC45235slv, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC45235slv, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC45235slv abstractC45235slv = (AbstractC45235slv) this.L$0;
                C47463tqX c47463tqX = null;
                if (abstractC45235slv instanceof AbstractC45235slv.ActionBar) {
                    C47463tqX c47463tqX2 = this.this$0.AhwBna;
                    if (c47463tqX2 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX2 = null;
                    }
                    C55113xdn c55113xdn = c47463tqX2.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(0);
                    C47463tqX c47463tqX3 = this.this$0.AhwBna;
                    if (c47463tqX3 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX3 = null;
                    }
                    c47463tqX3.copydefault.playAnimation();
                    C47463tqX c47463tqX4 = this.this$0.AhwBna;
                    if (c47463tqX4 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c47463tqX = c47463tqX4;
                    }
                    RecyclerView recyclerView = c47463tqX.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(8);
                } else if (abstractC45235slv instanceof AbstractC45235slv.Application) {
                    C47463tqX c47463tqX5 = this.this$0.AhwBna;
                    if (c47463tqX5 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX5 = null;
                    }
                    C55113xdn c55113xdn2 = c47463tqX5.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                    c55113xdn2.setVisibility(8);
                    C47463tqX c47463tqX6 = this.this$0.AhwBna;
                    if (c47463tqX6 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX6 = null;
                    }
                    RecyclerView recyclerView2 = c47463tqX6.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                    C6873aXb.OLrzqt(recyclerView2);
                    C47463tqX c47463tqX7 = this.this$0.AhwBna;
                    if (c47463tqX7 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c47463tqX = c47463tqX7;
                    }
                    RecyclerView recyclerView3 = c47463tqX.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                    recyclerView3.setVisibility(0);
                } else if (abstractC45235slv instanceof AbstractC45235slv.StateListAnimator) {
                    C47463tqX c47463tqX8 = this.this$0.AhwBna;
                    if (c47463tqX8 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX8 = null;
                    }
                    C55113xdn c55113xdn3 = c47463tqX8.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                    c55113xdn3.setVisibility(8);
                    C47463tqX c47463tqX9 = this.this$0.AhwBna;
                    if (c47463tqX9 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX9 = null;
                    }
                    RecyclerView recyclerView4 = c47463tqX9.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView4, "");
                    C6873aXb.OLrzqt(recyclerView4);
                    C47463tqX c47463tqX10 = this.this$0.AhwBna;
                    if (c47463tqX10 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c47463tqX = c47463tqX10;
                    }
                    RecyclerView recyclerView5 = c47463tqX.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView5, "");
                    recyclerView5.setVisibility(8);
                } else if (abstractC45235slv instanceof AbstractC45235slv.Activity) {
                    C47463tqX c47463tqX11 = this.this$0.AhwBna;
                    if (c47463tqX11 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX11 = null;
                    }
                    C55113xdn c55113xdn4 = c47463tqX11.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                    c55113xdn4.setVisibility(8);
                    C47463tqX c47463tqX12 = this.this$0.AhwBna;
                    if (c47463tqX12 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX12 = null;
                    }
                    RecyclerView recyclerView6 = c47463tqX12.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView6, "");
                    C6873aXb.OLrzqt(recyclerView6);
                    C47463tqX c47463tqX13 = this.this$0.AhwBna;
                    if (c47463tqX13 == null) {
                        Intrinsics.gEmmrt("");
                        c47463tqX13 = null;
                    }
                    RecyclerView recyclerView7 = c47463tqX13.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(recyclerView7, "");
                    recyclerView7.setVisibility(8);
                    AbstractC45235slv.Activity activity = (AbstractC45235slv.Activity) abstractC45235slv;
                    String strEZpvd = activity.EZpvd();
                    if (strEZpvd != null) {
                        if (!activity.OLrzqt()) {
                            C55326xho.toast$default(strEZpvd, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        } else {
                            C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (Object) null);
                        }
                    }
                } else {
                    if (!(abstractC45235slv instanceof AbstractC45235slv.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strOLrzqt = ((AbstractC45235slv.TaskDescription) abstractC45235slv).OLrzqt();
                    if (strOLrzqt != null) {
                        C55326xho.OLrzqt(strOLrzqt);
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
            StateFlow<AbstractC45235slv> stateFlowAkhnZx = this.this$0.OLrzqt().AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAkhnZx, anonymousClass1, this) == objCopydefault) {
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
