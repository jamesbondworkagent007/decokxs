package com.okinc.planet.biz_content.input.topic;

import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C47627ttg;
import o.C47629tti;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class TopicViewModel$filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PublisherTopicInfo> $allTopics;
    final /* synthetic */ String $q;
    int label;
    final /* synthetic */ C47629tti this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicViewModel$filter$1(String str, List<PublisherTopicInfo> list, C47629tti c47629tti, Continuation<? super TopicViewModel$filter$1> continuation) {
        super(2, continuation);
        this.$q = str;
        this.$allTopics = list;
        this.this$0 = c47629tti;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicViewModel$filter$1(this.$q, this.$allTopics, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopicViewModel$filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String lowerCase = StringsKt__StringsKt.hDKMBd((CharSequence) this.$q).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            List<PublisherTopicInfo> list = this.$allTopics;
            if (lowerCase.length() != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    PublisherTopicInfo publisherTopicInfo = (PublisherTopicInfo) obj2;
                    String tag = publisherTopicInfo.getTag();
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = tag.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) lowerCase, false, 2, (Object) null)) {
                        String lowerCase3 = publisherTopicInfo.getTag().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
                        if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) lowerCase, false, 2, (Object) null)) {
                        }
                    }
                    arrayList.add(obj2);
                }
                list = arrayList;
            }
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            List<PublisherTopicInfo> list2 = this.$allTopics;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ((C47627ttg) value).OLrzqt(list2, list)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
