package com.okinc.planet.biz_content.input.token;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C46242tNb;
import o.C47565tsX;
import o.C47621tta;
import o.C47802tww;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tNX;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class TokenListFragment$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47565tsX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListFragment$onViewCreated$2(C47565tsX c47565tsX, Continuation<? super TokenListFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = c47565tsX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListFragment$onViewCreated$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListFragment$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.token.TokenListFragment$onViewCreated$2$1, reason: invalid class name */
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
                Flow<C47802tww> flowQKVWgx = this.this$0.OLrzqt().QKVWgx();
                final C47565tsX c47565tsX = this.this$0;
                FlowCollector<? super C47802tww> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.token.TokenListFragment.onViewCreated.2.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C47802tww c47802tww, Continuation<? super Unit> continuation) {
                        C46242tNb c46242tNb;
                        LinearLayout root;
                        tNX tnx;
                        TextView textView;
                        C46242tNb c46242tNb2;
                        LinearLayout root2;
                        C55113xdn c55113xdn;
                        if (c47802tww.KWHzl()) {
                            return Unit.INSTANCE;
                        }
                        tNX tnx2 = c47565tsX.KWHzl;
                        if (tnx2 != null && (c55113xdn = tnx2.KWHzl) != null) {
                            c55113xdn.setVisibility(8);
                        }
                        if (!c47802tww.AEQbTJ()) {
                            tNX tnx3 = c47565tsX.KWHzl;
                            if (tnx3 != null && (c46242tNb2 = tnx3.AEQbTJ) != null && (root2 = c46242tNb2.getRoot()) != null) {
                                root2.setVisibility(8);
                            }
                            C47621tta c47621ttaKWHzl = c47565tsX.KWHzl();
                            List<PublisherTokenInfo> listCopydefault = c47802tww.copydefault();
                            if (listCopydefault == null) {
                                listCopydefault = yDY.AhwBna();
                            }
                            c47621ttaKWHzl.KWHzl(listCopydefault, c47565tsX.copydefault());
                            if (c47565tsX.KWHzl().EZpvd().getValue().OLrzqt().isEmpty() && (tnx = c47565tsX.KWHzl) != null && (textView = tnx.EZpvd) != null) {
                                textView.setVisibility(0);
                            }
                            if (!c47565tsX.OLrzqt) {
                                c47565tsX.OLrzqt = true;
                                rVN.reportFullyDrawn$default((Fragment) c47565tsX, true, (String) null, 2, (Object) null);
                            }
                        } else {
                            tNX tnx4 = c47565tsX.KWHzl;
                            if (tnx4 != null && (c46242tNb = tnx4.AEQbTJ) != null && (root = c46242tNb.getRoot()) != null) {
                                root.setVisibility(0);
                            }
                            if (!c47565tsX.OLrzqt) {
                                c47565tsX.OLrzqt = true;
                                rVN.reportFullyDrawn$default((Fragment) c47565tsX, false, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowQKVWgx.collect(flowCollector, this) == objCopydefault) {
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
