package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import android.view.View;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C33134mqi;
import o.C35399nuc;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sKH;

/* JADX INFO: loaded from: classes18.dex */
public final class MenuRecallAction$clickAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ View $msgView;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuRecallAction$clickAction$1(View view, OKMessage oKMessage, Continuation<? super MenuRecallAction$clickAction$1> continuation) {
        super(2, continuation);
        this.$msgView = view;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuRecallAction$clickAction$1(this.$msgView, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MenuRecallAction$clickAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            MenuRecallAction$clickAction$1$result$1 menuRecallAction$clickAction$1$result$1 = new MenuRecallAction$clickAction$1$result$1(this.$message, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, menuRecallAction$clickAction$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((sKH.StateListAnimator) obj) instanceof sKH.StateListAnimator.Activity) {
            C33134mqi.AEQbTJ(this.$msgView.getContext().getString(C35399nuc.LoaderManager.dzkkkq));
        }
        return Unit.INSTANCE;
    }
}
