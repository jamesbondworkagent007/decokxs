package com.okinc.business.market.features.tag.domain;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C29713kyo;
import o.C29715kyq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TagWrapper>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ List<TagWrapper> $tagWrappers;
    int label;
    final /* synthetic */ C29713kyo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1(List<TagWrapper> list, C29713kyo c29713kyo, String str, Continuation<? super FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1> continuation) {
        super(2, continuation);
        this.$tagWrappers = list;
        this.this$0 = c29713kyo;
        this.$key = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1(this.$tagWrappers, this.this$0, this.$key, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TagWrapper> continuation) {
        return ((FetchTokenTagAttributesUseCase$invoke$2$1$staticTags$staticTagDeferred$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objM8679getTagMeta0E7RQCE$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<TagWrapper> list = this.$tagWrappers;
            String str = this.$key;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((TagWrapper) next).OLrzqt(), (Object) str)) {
                    break;
                }
            }
            TagWrapper tagWrapper = (TagWrapper) next;
            if (tagWrapper != null) {
                return tagWrapper;
            }
            C29715kyq c29715kyq = this.this$0.OLrzqt;
            String str2 = this.$key;
            this.label = 1;
            objM8679getTagMeta0E7RQCE$default = C29715kyq.m8679getTagMeta0E7RQCE$default(c29715kyq, str2, false, this, 2, null);
            if (objM8679getTagMeta0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8679getTagMeta0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8679getTagMeta0E7RQCE$default)) {
            objM8679getTagMeta0E7RQCE$default = null;
        }
        return new TagWrapper(null, (TagMeta) objM8679getTagMeta0E7RQCE$default, 1, null);
    }
}
