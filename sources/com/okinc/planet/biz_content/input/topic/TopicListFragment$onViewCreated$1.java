package com.okinc.planet.biz_content.input.topic;

import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import o.C46271tOd;
import o.C47622ttb;
import o.C47627ttg;
import o.C55113xdn;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicListFragment$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47622ttb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicListFragment$onViewCreated$1(C47622ttb c47622ttb, Continuation<? super TopicListFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c47622ttb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicListFragment$onViewCreated$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopicListFragment$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.topic.TopicListFragment$onViewCreated$1$1, reason: invalid class name */
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
                StateFlow<C47627ttg> stateFlowOLrzqt = this.this$0.AEQbTJ().OLrzqt();
                final C47622ttb c47622ttb = this.this$0;
                FlowCollector<? super C47627ttg> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.topic.TopicListFragment.onViewCreated.1.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(C47627ttg c47627ttg, Continuation<? super Unit> continuation) {
                        TextView textView;
                        TextView textView2;
                        C55113xdn c55113xdn;
                        FrameLayout frameLayout;
                        int iDp2px$default;
                        C55113xdn c55113xdn2;
                        if (c47627ttg.AEQbTJ().isEmpty()) {
                            C46271tOd c46271tOd = c47622ttb.OLrzqt;
                            if (c46271tOd != null && (c55113xdn2 = c46271tOd.AEQbTJ) != null) {
                                c55113xdn2.setVisibility(0);
                            }
                            c47622ttb.EZpvd().dxcTrN();
                        } else {
                            C46271tOd c46271tOd2 = c47622ttb.OLrzqt;
                            if (c46271tOd2 != null && (frameLayout = c46271tOd2.gEmmrt) != null) {
                                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                                if (c47627ttg.AEQbTJ().size() <= 4) {
                                    iDp2px$default = C55298xhM.dp2px$default(224.0f - ((5 - c47627ttg.AEQbTJ().size()) * 36.0f), null, 1, null);
                                } else {
                                    iDp2px$default = C55298xhM.dp2px$default(224.0f, null, 1, null);
                                }
                                layoutParams.height = iDp2px$default;
                                frameLayout.setLayoutParams(layoutParams);
                            }
                            C46271tOd c46271tOd3 = c47622ttb.OLrzqt;
                            if (c46271tOd3 != null && (c55113xdn = c46271tOd3.AEQbTJ) != null) {
                                c55113xdn.setVisibility(8);
                            }
                            c47622ttb.copydefault.setItems(CollectionsKt___CollectionsKt.AhwBna((Iterable) c47627ttg.KWHzl(), 5));
                            c47622ttb.copydefault.notifyDataSetChanged();
                            if (C33129mqd.KWHzl((Collection) c47627ttg.KWHzl())) {
                                C46271tOd c46271tOd4 = c47622ttb.OLrzqt;
                                if (c46271tOd4 != null && (textView2 = c46271tOd4.EZpvd) != null) {
                                    textView2.setVisibility(8);
                                }
                                c47622ttb.EZpvd().copydefault(true);
                            } else {
                                C46271tOd c46271tOd5 = c47622ttb.OLrzqt;
                                if (c46271tOd5 != null && (textView = c46271tOd5.EZpvd) != null) {
                                    textView.setVisibility(0);
                                }
                                c47622ttb.EZpvd().copydefault(false);
                            }
                            if (!c47622ttb.EZpvd) {
                                c47622ttb.EZpvd = true;
                                rVN.reportFullyDrawn$default((Fragment) c47622ttb, true, (String) null, 2, (Object) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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
