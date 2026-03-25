package com.okinc.kline.util;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class CompareIndicatorUtils$glideAsBitmap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $height;
    final /* synthetic */ String $url;
    final /* synthetic */ int $width;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompareIndicatorUtils$glideAsBitmap$2(Context context, String str, int i, int i2, Continuation<? super CompareIndicatorUtils$glideAsBitmap$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$width = i;
        this.$height = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompareIndicatorUtils$glideAsBitmap$2(this.$context, this.$url, this.$width, this.$height, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((CompareIndicatorUtils$glideAsBitmap$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                return (Bitmap) Glide.AEQbTJ(this.$context).EZpvd().copydefault(this.$url).copydefault(this.$width, this.$height).AEQbTJ().get();
            } catch (Exception e) {
                pUU.copydefault("ChartView", "glideAsBitmap error: " + e.getMessage() + " url: " + this.$url);
                return Bitmap.createBitmap(this.$width, this.$height, Bitmap.Config.ARGB_8888);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
