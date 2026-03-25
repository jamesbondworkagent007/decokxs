package com.okinc.okex.uploadlog.usecase;

import android.net.Uri;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44086sCv;
import o.C45307snN;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadAttachmentUseCase$invokeUri$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Triple<? extends MultipartBody.Part, ? extends String, ? extends Long>>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ C44086sCv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadAttachmentUseCase$invokeUri$2(Uri uri, C44086sCv c44086sCv, Continuation<? super UploadAttachmentUseCase$invokeUri$2> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = c44086sCv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadAttachmentUseCase$invokeUri$2(this.$uri, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Triple<? extends MultipartBody.Part, ? extends String, ? extends Long>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Triple<MultipartBody.Part, String, Long>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Triple<MultipartBody.Part, String, Long>> continuation) {
        return ((UploadAttachmentUseCase$invokeUri$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair<String, Long> pairCopydefault = C45307snN.copydefault(this.$uri, this.this$0.copydefault);
            String strComponent1 = pairCopydefault.component1();
            Long lComponent2 = pairCopydefault.component2();
            long jLongValue = lComponent2 != null ? lComponent2.longValue() : 0L;
            RequestBody requestBodyOLrzqt = C45307snN.OLrzqt(this.$uri, this.this$0.copydefault);
            if (requestBodyOLrzqt == null) {
                return new Triple(null, strComponent1, C56443yFo.KWHzl(jLongValue));
            }
            return new Triple(MultipartBody.Part.Companion.createFormData("file", strComponent1, requestBodyOLrzqt), strComponent1, C56443yFo.KWHzl(jLongValue));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
