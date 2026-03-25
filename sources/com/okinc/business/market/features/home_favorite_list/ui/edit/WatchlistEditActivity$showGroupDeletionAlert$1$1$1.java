package com.okinc.business.market.features.home_favorite_list.ui.edit;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC28461kbH;
import o.C28422kaV;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC54939xaY;
import o.wYK;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistEditActivity$showGroupDeletionAlert$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ wYK $checkbox;
    final /* synthetic */ List<C28422kaV> $selected;
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    int label;
    final /* synthetic */ ActivityC28461kbH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistEditActivity$showGroupDeletionAlert$1$1$1(wYK wyk, ActivityC28461kbH activityC28461kbH, List<C28422kaV> list, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Continuation<? super WatchlistEditActivity$showGroupDeletionAlert$1$1$1> continuation) {
        super(2, continuation);
        this.$checkbox = wyk;
        this.this$0 = activityC28461kbH;
        this.$selected = list;
        this.$this_apply = viewOnClickListenerC54939xaY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistEditActivity$showGroupDeletionAlert$1$1$1(this.$checkbox, this.this$0, this.$selected, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistEditActivity$showGroupDeletionAlert$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Integer> listKWHzl = this.$checkbox.isChecked() ? this.this$0.AEQbTJ().KWHzl() : C56402yEa.EZpvd(C56443yFo.AEQbTJ(this.this$0.AEQbTJ().EZpvd()));
            WatchlistEditViewModel watchlistEditViewModelDjBIcL = this.this$0.djBIcL();
            List<C28422kaV> list = this.$selected;
            this.label = 1;
            objAEQbTJ = watchlistEditViewModelDjBIcL.AEQbTJ(list, listKWHzl, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        this.this$0.KWHzl(objAEQbTJ);
        this.$this_apply.dismiss();
        return Unit.INSTANCE;
    }
}
