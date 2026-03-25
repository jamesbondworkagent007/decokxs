package com.okinc.planet.biz_content.input;

import android.content.Context;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet_api.RichShareToFeedImage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C47546tsE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputViewModel$addShareImageAndUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<ImageItem> $current;
    final /* synthetic */ List<RichShareToFeedImage> $shareImages;
    int label;
    final /* synthetic */ C47546tsE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputViewModel$addShareImageAndUpload$1(List<ImageItem> list, C47546tsE c47546tsE, List<RichShareToFeedImage> list2, Context context, Continuation<? super GenericInputViewModel$addShareImageAndUpload$1> continuation) {
        super(2, continuation);
        this.$current = list;
        this.this$0 = c47546tsE;
        this.$shareImages = list2;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$addShareImageAndUpload$1(this.$current, this.this$0, this.$shareImages, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputViewModel$addShareImageAndUpload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            GenericInputViewModel$addShareImageAndUpload$1$newItems$1 genericInputViewModel$addShareImageAndUpload$1$newItems$1 = new GenericInputViewModel$addShareImageAndUpload$1$newItems$1(this.$shareImages, this.$context, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, genericInputViewModel$addShareImageAndUpload$1$newItems$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        List<ImageItem> list = (List) obj;
        this.$current.addAll(list);
        this.this$0.copydefault((List<ImageItem>) this.$current);
        C47546tsE c47546tsE = this.this$0;
        Context context = this.$context;
        for (ImageItem imageItem : list) {
            String netPathUrl = imageItem.getNetPathUrl();
            if (netPathUrl == null || netPathUrl.length() == 0) {
                C47546tsE.startUpload$default(c47546tsE, context, imageItem, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
