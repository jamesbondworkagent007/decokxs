package com.okinc.planet.biz_content.publisher;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.PlanetShareTypeEnum;
import com.okinc.planet_api.PluginShareToFeedConfig;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.ShareTopic;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC47702tvB;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetPublisherActivity$observeViewModel$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC47702tvB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetPublisherActivity$observeViewModel$7(ActivityC47702tvB activityC47702tvB, Continuation<? super PlanetPublisherActivity$observeViewModel$7> continuation) {
        super(2, continuation);
        this.this$0 = activityC47702tvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetPublisherActivity$observeViewModel$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetPublisherActivity$observeViewModel$7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$7$1, reason: invalid class name */
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
                StateFlow<PlanetShareConfig> stateFlowOcIXYQ = this.this$0.AkhnZx().OcIXYQ();
                final ActivityC47702tvB activityC47702tvB = this.this$0;
                FlowCollector<? super PlanetShareConfig> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity.observeViewModel.7.1.2

                    /* JADX INFO: renamed from: com.okinc.planet.biz_content.publisher.PlanetPublisherActivity$observeViewModel$7$1$2$ActionBar */
                    public final /* synthetic */ class ActionBar {
                        public static final /* synthetic */ int[] AEQbTJ;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[PlanetShareTypeEnum.values().length];
                            try {
                                iArr[PlanetShareTypeEnum.RICH_SHARE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PlanetShareTypeEnum.PLUGIN_SHARE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            AEQbTJ = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(PlanetShareConfig planetShareConfig, Continuation<? super Unit> continuation) {
                        String content;
                        if (planetShareConfig != null) {
                            ActivityC47702tvB activityC47702tvB2 = activityC47702tvB;
                            int i2 = ActionBar.AEQbTJ[planetShareConfig.OLrzqt().ordinal()];
                            if (i2 == 1) {
                                RichShareToFeedConfig richShareToFeedConfigCopydefault = planetShareConfig.copydefault();
                                if (richShareToFeedConfigCopydefault != null) {
                                    ArrayList<PublisherTopicInfo> arrayList = new ArrayList<>();
                                    for (ShareTopic shareTopic : CollectionsKt___CollectionsKt.AhwBna((Iterable) richShareToFeedConfigCopydefault.getTopics(), 5)) {
                                        arrayList.add(new PublisherTopicInfo(shareTopic.getTag(), shareTopic.getLinkUrl(), shareTopic.getDeepLinkUrl(), shareTopic.getTopicId()));
                                    }
                                    if (!C33129mqd.OLrzqt((CharSequence) richShareToFeedConfigCopydefault.getContent())) {
                                        content = null;
                                    } else if (C33129mqd.KWHzl((Collection) richShareToFeedConfigCopydefault.getTopics())) {
                                        content = "\n" + richShareToFeedConfigCopydefault.getContent();
                                    } else {
                                        content = richShareToFeedConfigCopydefault.getContent();
                                    }
                                    activityC47702tvB2.AkhnZx().OLrzqt(arrayList, content);
                                    activityC47702tvB2.AkhnZx().AEQbTJ(richShareToFeedConfigCopydefault.getActivityCard());
                                    if (C33129mqd.KWHzl((Collection) richShareToFeedConfigCopydefault.getImageList())) {
                                        activityC47702tvB2.AkhnZx().OLrzqt(CollectionsKt___CollectionsKt.AhwBna((Iterable) richShareToFeedConfigCopydefault.getImageList(), 4));
                                    }
                                }
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                PluginShareToFeedConfig pluginShareToFeedConfigEZpvd = planetShareConfig.EZpvd();
                                if (pluginShareToFeedConfigEZpvd != null) {
                                    activityC47702tvB2.AkhnZx().copydefault(pluginShareToFeedConfigEZpvd);
                                }
                            }
                            activityC47702tvB2.AkhnZx().OLrzqt((PlanetShareConfig) null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOcIXYQ.collect(flowCollector, this) == objCopydefault) {
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
