package com.okinc.tradingbot.impl.aiBot.ui.markdown;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48086uEl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes19.dex */
public final class BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $footerBufferPx;
    final /* synthetic */ MutableIntState $height$delegate;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult$delegate;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ IntSize $size;
    final /* synthetic */ TextFieldValue $value;
    int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1(IntSize intSize, ScrollState scrollState, float f, TextFieldValue textFieldValue, MutableState<TextLayoutResult> mutableState, MutableIntState mutableIntState, Continuation<? super BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1> continuation) {
        super(2, continuation);
        this.$size = intSize;
        this.$scrollState = scrollState;
        this.$footerBufferPx = f;
        this.$value = textFieldValue;
        this.$layoutResult$delegate = mutableState;
        this.$height$delegate = mutableIntState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1(this.$size, this.$scrollState, this.$footerBufferPx, this.$value, this.$layoutResult$delegate, this.$height$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            TextLayoutResult textLayoutResultKWHzl = C48086uEl.KWHzl((MutableState<TextLayoutResult>) this.$layoutResult$delegate);
            if (textLayoutResultKWHzl == null) {
                return Unit.INSTANCE;
            }
            int iM5573getHeightimpl = IntSize.m5573getHeightimpl(this.$size.m5578unboximpl());
            float value = this.$scrollState.getValue();
            float fCopydefault = C56548yJl.copydefault(iM5573getHeightimpl - this.$footerBufferPx, 0.0f);
            if (!C48086uEl.copydefault(this.$value, textLayoutResultKWHzl, fCopydefault, value) && C48086uEl.KWHzl(this.$height$delegate) > iM5573getHeightimpl) {
                float fOLrzqt = C48086uEl.OLrzqt(this.$value, textLayoutResultKWHzl, C48086uEl.KWHzl(this.$height$delegate), fCopydefault, value);
                if (fOLrzqt != 0.0f) {
                    ScrollState scrollState = this.$scrollState;
                    this.I$0 = iM5573getHeightimpl;
                    this.label = 1;
                    if (ScrollExtensionsKt.scrollBy(scrollState, fOLrzqt, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            }
            i = iM5573getHeightimpl;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
        }
        C48086uEl.AEQbTJ(this.$height$delegate, i);
        return Unit.INSTANCE;
    }
}
