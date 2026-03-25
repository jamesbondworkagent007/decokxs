package com.okinc.tradingbot.impl.aiBot.ui.markdown;

import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ActivityC48077uEc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class BotMarkdownEditorActivity$observeViewModel$1 extends SuspendLambda implements Function2<BotMarkdownEditorViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC48077uEc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarkdownEditorActivity$observeViewModel$1(ActivityC48077uEc activityC48077uEc, Continuation<? super BotMarkdownEditorActivity$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC48077uEc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotMarkdownEditorActivity$observeViewModel$1 botMarkdownEditorActivity$observeViewModel$1 = new BotMarkdownEditorActivity$observeViewModel$1(this.this$0, continuation);
        botMarkdownEditorActivity$observeViewModel$1.L$0 = obj;
        return botMarkdownEditorActivity$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BotMarkdownEditorViewModel.Activity activity, Continuation<? super Unit> continuation) {
        return ((BotMarkdownEditorActivity$observeViewModel$1) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BotMarkdownEditorViewModel.Activity activity = (BotMarkdownEditorViewModel.Activity) this.L$0;
            if (activity instanceof BotMarkdownEditorViewModel.Activity.C0634Activity) {
                this.this$0.gEmmrt = ((BotMarkdownEditorViewModel.Activity.C0634Activity) activity).OLrzqt();
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
