package com.okinc.planet.biz_content.input.topic;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C46242tNb;
import o.C46271tOd;
import o.C47622ttb;
import o.C47629tti;
import o.C47805twz;
import o.C55113xdn;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicListFragment$onViewCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47622ttb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicListFragment$onViewCreated$2(C47622ttb c47622ttb, Continuation<? super TopicListFragment$onViewCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = c47622ttb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicListFragment$onViewCreated$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopicListFragment$onViewCreated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.topic.TopicListFragment$onViewCreated$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C47622ttb this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47622ttb c47622ttb, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47622ttb;
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
                Flow<C47805twz> flowQVAiDq = this.this$0.EZpvd().QVAiDq();
                final C47622ttb c47622ttb = this.this$0;
                FlowCollector<? super C47805twz> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.topic.TopicListFragment.onViewCreated.2.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C47805twz c47805twz, Continuation<? super Unit> continuation) {
                        C46242tNb c46242tNb;
                        LinearLayout root;
                        TextView textView;
                        C46242tNb c46242tNb2;
                        LinearLayout root2;
                        C55113xdn c55113xdn;
                        if (c47805twz.copydefault()) {
                            return Unit.INSTANCE;
                        }
                        C46271tOd c46271tOd = c47622ttb.OLrzqt;
                        if (c46271tOd != null && (c55113xdn = c46271tOd.AEQbTJ) != null) {
                            c55113xdn.setVisibility(8);
                        }
                        if (!c47805twz.KWHzl()) {
                            C46271tOd c46271tOd2 = c47622ttb.OLrzqt;
                            if (c46271tOd2 != null && (c46242tNb2 = c46271tOd2.KWHzl) != null && (root2 = c46242tNb2.getRoot()) != null) {
                                root2.setVisibility(8);
                            }
                            C47629tti c47629ttiAEQbTJ = c47622ttb.AEQbTJ();
                            List<PublisherTopicInfo> listEZpvd = c47805twz.EZpvd();
                            if (listEZpvd == null) {
                                listEZpvd = yDY.AhwBna();
                            }
                            c47629ttiAEQbTJ.copydefault(listEZpvd, c47622ttb.KWHzl());
                            if (c47622ttb.AEQbTJ().OLrzqt().getValue().KWHzl().isEmpty()) {
                                C46271tOd c46271tOd3 = c47622ttb.OLrzqt;
                                if (c46271tOd3 != null && (textView = c46271tOd3.EZpvd) != null) {
                                    textView.setVisibility(0);
                                }
                                c47622ttb.EZpvd().copydefault(false);
                            }
                            if (!c47622ttb.EZpvd) {
                                c47622ttb.EZpvd = true;
                                rVN.reportFullyDrawn$default((Fragment) c47622ttb, true, (String) null, 2, (Object) null);
                            }
                        } else {
                            C46271tOd c46271tOd4 = c47622ttb.OLrzqt;
                            if (c46271tOd4 != null && (c46242tNb = c46271tOd4.KWHzl) != null && (root = c46242tNb.getRoot()) != null) {
                                root.setVisibility(0);
                            }
                            if (!c47622ttb.EZpvd) {
                                c47622ttb.EZpvd = true;
                                rVN.reportFullyDrawn$default((Fragment) c47622ttb, false, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowQVAiDq.collect(flowCollector, this) == objCopydefault) {
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
