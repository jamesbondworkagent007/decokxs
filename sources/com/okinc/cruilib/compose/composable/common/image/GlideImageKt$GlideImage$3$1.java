package com.okinc.cruilib.compose.composable.common.image;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mDD;
import o.mDG;

/* JADX INFO: loaded from: classes23.dex */
public final class GlideImageKt$GlideImage$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ mDD $glideImageLoader;
    final /* synthetic */ MutableState<ImageBitmap> $imageBitmap$delegate;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ Function0<Unit> $onLoadFailure;
    final /* synthetic */ Function0<Unit> $onLoadSuccess;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideImageKt$GlideImage$3$1(mDD mdd, Context context, String str, Function0<Unit> function0, Function0<Unit> function02, MutableState<ImageBitmap> mutableState, Continuation<? super GlideImageKt$GlideImage$3$1> continuation) {
        super(2, continuation);
        this.$glideImageLoader = mdd;
        this.$context = context;
        this.$imageUrl = str;
        this.$onLoadSuccess = function0;
        this.$onLoadFailure = function02;
        this.$imageBitmap$delegate = mutableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GlideImageKt$GlideImage$3$1(this.$glideImageLoader, this.$context, this.$imageUrl, this.$onLoadSuccess, this.$onLoadFailure, this.$imageBitmap$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GlideImageKt$GlideImage$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function0<Unit> function0;
        Function0<Unit> function02;
        MutableState<ImageBitmap> mutableState;
        MutableState<ImageBitmap> mutableState2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mDD mdd = this.$glideImageLoader;
            if (mdd != null) {
                Context context = this.$context;
                String str = this.$imageUrl;
                Function0<Unit> function03 = this.$onLoadSuccess;
                Function0<Unit> function04 = this.$onLoadFailure;
                MutableState<ImageBitmap> mutableState3 = this.$imageBitmap$delegate;
                this.L$0 = function03;
                this.L$1 = function04;
                this.L$2 = mutableState3;
                this.L$3 = mutableState3;
                this.label = 1;
                obj = mdd.copydefault(context, str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                function0 = function03;
                function02 = function04;
                mutableState = mutableState3;
                mutableState2 = mutableState;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState = (MutableState) this.L$3;
        mutableState2 = (MutableState) this.L$2;
        function02 = (Function0) this.L$1;
        function0 = (Function0) this.L$0;
        C56391yDq.AEQbTJ(obj);
        mDG.EZpvd(mutableState, (ImageBitmap) obj);
        if (mDG.AEQbTJ(mutableState2) != null) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
