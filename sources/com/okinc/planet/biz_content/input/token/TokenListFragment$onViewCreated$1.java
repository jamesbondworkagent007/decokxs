package com.okinc.planet.biz_content.input.token;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C33129mqd;
import o.C47565tsX;
import o.C47566tsY;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tNX;

/* JADX INFO: loaded from: classes19.dex */
public final class TokenListFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47565tsX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListFragment$onViewCreated$1(C47565tsX c47565tsX, Continuation<? super TokenListFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c47565tsX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListFragment$onViewCreated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.token.TokenListFragment$onViewCreated$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C47565tsX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47565tsX c47565tsX, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47565tsX;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C47566tsY> stateFlowEZpvd = this.this$0.KWHzl().EZpvd();
                final C47565tsX c47565tsX = this.this$0;
                FlowCollector<? super C47566tsY> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.token.TokenListFragment.onViewCreated.1.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C47566tsY c47566tsY, Continuation<? super Unit> continuation) {
                        TextView textView;
                        TextView textView2;
                        C55113xdn c55113xdn;
                        C55113xdn c55113xdn2;
                        if (c47566tsY.EZpvd().isEmpty()) {
                            tNX tnx = c47565tsX.KWHzl;
                            if (tnx != null && (c55113xdn2 = tnx.KWHzl) != null) {
                                c55113xdn2.setVisibility(0);
                            }
                            c47565tsX.OLrzqt().fZBcTu();
                        } else {
                            tNX tnx2 = c47565tsX.KWHzl;
                            if (tnx2 != null && (c55113xdn = tnx2.KWHzl) != null) {
                                c55113xdn.setVisibility(8);
                            }
                            c47565tsX.AEQbTJ.setItems(CollectionsKt___CollectionsKt.AhwBna((Iterable) c47566tsY.OLrzqt(), 5));
                            c47565tsX.AEQbTJ.notifyDataSetChanged();
                            if (C33129mqd.KWHzl((Collection) c47566tsY.OLrzqt())) {
                                tNX tnx3 = c47565tsX.KWHzl;
                                if (tnx3 != null && (textView2 = tnx3.EZpvd) != null) {
                                    textView2.setVisibility(8);
                                }
                                c47565tsX.OLrzqt().copydefault(true);
                            } else {
                                tNX tnx4 = c47565tsX.KWHzl;
                                if (tnx4 != null && (textView = tnx4.EZpvd) != null) {
                                    textView.setVisibility(0);
                                }
                                c47565tsX.OLrzqt().copydefault(false);
                            }
                            if (!c47565tsX.OLrzqt) {
                                c47565tsX.OLrzqt = true;
                                rVN.reportFullyDrawn$default((Fragment) c47565tsX, true, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
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
