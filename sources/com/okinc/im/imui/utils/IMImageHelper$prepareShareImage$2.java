package com.okinc.im.imui.utils;

import android.graphics.Bitmap;
import android.view.View;
import com.okinc.biz.share.ShareFileProvider;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33570myu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class IMImageHelper$prepareShareImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ View $targetView;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMImageHelper$prepareShareImage$2(View view, Continuation<? super IMImageHelper$prepareShareImage$2> continuation) {
        super(2, continuation);
        this.$targetView = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMImageHelper$prepareShareImage$2(this.$targetView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((IMImageHelper$prepareShareImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        File fileAEQbTJ;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Bitmap bitmapEZpvd = C33570myu.EZpvd(this.$targetView);
            String absolutePath = (bitmapEZpvd == null || (fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmapEZpvd)) == null) ? null : fileAEQbTJ.getAbsolutePath();
            if (absolutePath != null) {
                return absolutePath;
            }
            throw new IllegalArgumentException("Image path was empty");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
