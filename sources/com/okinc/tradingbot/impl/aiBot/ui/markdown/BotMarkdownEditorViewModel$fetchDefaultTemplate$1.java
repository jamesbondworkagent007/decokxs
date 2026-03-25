package com.okinc.tradingbot.impl.aiBot.ui.markdown;

import com.okinc.tradingbot.impl.aiBot.ui.markdown.BotMarkdownEditorViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uCO;

/* JADX INFO: loaded from: classes11.dex */
public final class BotMarkdownEditorViewModel$fetchDefaultTemplate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotMarkdownEditorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarkdownEditorViewModel$fetchDefaultTemplate$1(BotMarkdownEditorViewModel botMarkdownEditorViewModel, Continuation<? super BotMarkdownEditorViewModel$fetchDefaultTemplate$1> continuation) {
        super(2, continuation);
        this.this$0 = botMarkdownEditorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotMarkdownEditorViewModel$fetchDefaultTemplate$1 botMarkdownEditorViewModel$fetchDefaultTemplate$1 = new BotMarkdownEditorViewModel$fetchDefaultTemplate$1(this.this$0, continuation);
        botMarkdownEditorViewModel$fetchDefaultTemplate$1.L$0 = obj;
        return botMarkdownEditorViewModel$fetchDefaultTemplate$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotMarkdownEditorViewModel$fetchDefaultTemplate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BotMarkdownEditorViewModel botMarkdownEditorViewModel = this.this$0;
                Result.Application application = Result.Companion;
                uCO uco = botMarkdownEditorViewModel.OLrzqt;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                obj = uco.KWHzl(unit, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((String) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        BotMarkdownEditorViewModel botMarkdownEditorViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            String str = (String) objM7377constructorimpl;
            if (true ^ StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                botMarkdownEditorViewModel2.EZpvd(new BotMarkdownEditorViewModel.Activity.C0634Activity(str));
            }
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }
}
