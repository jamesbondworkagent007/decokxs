package com.okinc.business.market.features.meme.preview.domain.repository;

import com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28743kgY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;

/* JADX INFO: loaded from: classes7.dex */
public final class TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TwitterTranslateResponse>>, Object> {
    final /* synthetic */ String $id$inlined;
    final /* synthetic */ List $referencedIds$inlined;
    final /* synthetic */ int $type$inlined;
    int label;
    final /* synthetic */ C28743kgY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1(Continuation continuation, C28743kgY c28743kgY, String str, List list, int i) {
        super(2, continuation);
        this.this$0 = c28743kgY;
        this.$id$inlined = str;
        this.$referencedIds$inlined = list;
        this.$type$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1(continuation, this.this$0, this.$id$inlined, this.$referencedIds$inlined, this.$type$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TwitterTranslateResponse>> continuation) {
        return ((TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC27595jyE interfaceC27595jyE = this.this$0.EZpvd;
            String str = this.$id$inlined;
            List list = this.$referencedIds$inlined;
            String strJoinToString$default = list != null ? CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
            int i2 = this.$type$inlined;
            this.label = 1;
            obj = interfaceC27595jyE.copydefault(str, strJoinToString$default, i2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
