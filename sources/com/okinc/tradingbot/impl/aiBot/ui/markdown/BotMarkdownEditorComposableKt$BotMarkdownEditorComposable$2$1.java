package com.okinc.tradingbot.impl.aiBot.ui.markdown;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
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
public final class BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $footerBufferPx;
    final /* synthetic */ MutableIntState $height$delegate;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult$delegate;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1(float f, TextFieldValue textFieldValue, ScrollState scrollState, MutableState<TextLayoutResult> mutableState, MutableIntState mutableIntState, Continuation<? super BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1> continuation) {
        super(2, continuation);
        this.$footerBufferPx = f;
        this.$value = textFieldValue;
        this.$scrollState = scrollState;
        this.$layoutResult$delegate = mutableState;
        this.$height$delegate = mutableIntState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1(this.$footerBufferPx, this.$value, this.$scrollState, this.$layoutResult$delegate, this.$height$delegate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotMarkdownEditorComposableKt$BotMarkdownEditorComposable$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TextLayoutResult textLayoutResultKWHzl = C48086uEl.KWHzl((MutableState<TextLayoutResult>) this.$layoutResult$delegate);
            if (textLayoutResultKWHzl == null) {
                return Unit.INSTANCE;
            }
            float fCopydefault = C56548yJl.copydefault(C48086uEl.KWHzl(this.$height$delegate) - this.$footerBufferPx, 0.0f);
            if (!C48086uEl.copydefault(this.$value, textLayoutResultKWHzl, fCopydefault, this.$scrollState.getValue())) {
                float fAEQbTJ = C48086uEl.AEQbTJ(this.$value, textLayoutResultKWHzl, fCopydefault, this.$scrollState.getValue());
                if (fAEQbTJ != 0.0f) {
                    ScrollState scrollState = this.$scrollState;
                    this.label = 1;
                    if (ScrollExtensionsKt.scrollBy(scrollState, fAEQbTJ, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
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
