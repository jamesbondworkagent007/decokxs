package com.okinc.planet.biz_content.publisher;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.biz_content.input.data.NetDraftContent;
import com.okinc.planet.biz_content.input.data.SerializableImageItem;
import com.okinc.planet.domain.remote.dto.CashTag;
import com.okinc.planet_api.ShareTopic;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC47702tvB;
import o.C33129mqd;
import o.C47546tsE;
import o.C47576tsi;
import o.C47793twn;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetPublisherActivity$observeViewModel$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC47702tvB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherActivity$observeViewModel$8(ActivityC47702tvB activityC47702tvB, Continuation<? super PlanetPublisherActivity$observeViewModel$8> continuation) {
        super(2, continuation);
        this.this$0 = activityC47702tvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherActivity$observeViewModel$8(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherActivity$observeViewModel$8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$8$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC47702tvB this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC47702tvB activityC47702tvB, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC47702tvB;
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
                StateFlow<NetDraftContent> stateFlowSSMYrx = this.this$0.AkhnZx().sSMYrx();
                final ActivityC47702tvB activityC47702tvB = this.this$0;
                FlowCollector<? super NetDraftContent> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity.observeViewModel.8.1.5
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(NetDraftContent netDraftContent, Continuation<? super Unit> continuation) {
                        C47546tsE c47546tsEFetchVPNInfo;
                        C47546tsE c47546tsEFetchVPNInfo2;
                        if (netDraftContent != null) {
                            ActivityC47702tvB activityC47702tvB2 = activityC47702tvB;
                            C47576tsi c47576tsi = activityC47702tvB2.AhwBna;
                            if (c47576tsi != null) {
                                c47576tsi.EZpvd(netDraftContent.getTextState());
                            }
                            C47576tsi c47576tsi2 = activityC47702tvB2.AhwBna;
                            if (c47576tsi2 != null && (c47546tsEFetchVPNInfo2 = c47576tsi2.fetchVPNInfo()) != null) {
                                c47546tsEFetchVPNInfo2.KWHzl(netDraftContent.getTextState().getPlainText());
                            }
                            C47576tsi c47576tsi3 = activityC47702tvB2.AhwBna;
                            if (c47576tsi3 != null && (c47546tsEFetchVPNInfo = c47576tsi3.fetchVPNInfo()) != null) {
                                List<SerializableImageItem> imageItems = netDraftContent.getImageItems();
                                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(imageItems, 10));
                                Iterator<T> it = imageItems.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((SerializableImageItem) it.next()).toImageItem());
                                }
                                c47546tsEFetchVPNInfo.AEQbTJ(arrayList);
                            }
                            if (C33129mqd.KWHzl((Collection) netDraftContent.getTopicList())) {
                                C47793twn c47793twnAkhnZx = activityC47702tvB2.AkhnZx();
                                ArrayList<ShareTopic> topicList = netDraftContent.getTopicList();
                                Intrinsics.copydefault(topicList);
                                c47793twnAkhnZx.AEQbTJ(topicList);
                                activityC47702tvB2.AkhnZx().fFgQHt();
                                activityC47702tvB2.AkhnZx().finit();
                            }
                            if (C33129mqd.KWHzl((Collection) netDraftContent.getTokenList())) {
                                C47793twn c47793twnAkhnZx2 = activityC47702tvB2.AkhnZx();
                                ArrayList<CashTag> tokenList = netDraftContent.getTokenList();
                                Intrinsics.copydefault(tokenList);
                                c47793twnAkhnZx2.copydefault(tokenList);
                                activityC47702tvB2.AkhnZx().fFgQHt();
                            }
                            activityC47702tvB2.AkhnZx().copydefault((NetDraftContent) null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowSSMYrx.collect(flowCollector, this) == objCopydefault) {
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
            ActivityC47702tvB activityC47702tvB = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC47702tvB, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC47702tvB, state, anonymousClass1, this) == objCopydefault) {
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
