package com.okinc.tradingbot.impl.botDetail.ui.eventHistory;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C48318uNa;
import o.C50027uzf;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.uIG;
import o.vNB;

/* JADX INFO: loaded from: classes16.dex */
public final class BotEventHistoryFragment$observeViewModel$1 extends SuspendLambda implements Function2<vNB<? extends List<? extends HistoryEventsDto>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uIG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotEventHistoryFragment$observeViewModel$1(uIG uig, Continuation<? super BotEventHistoryFragment$observeViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = uig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotEventHistoryFragment$observeViewModel$1 botEventHistoryFragment$observeViewModel$1 = new BotEventHistoryFragment$observeViewModel$1(this.this$0, continuation);
        botEventHistoryFragment$observeViewModel$1.L$0 = obj;
        return botEventHistoryFragment$observeViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends List<? extends HistoryEventsDto>> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<? extends List<HistoryEventsDto>>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<? extends List<HistoryEventsDto>> vnb, Continuation<? super Unit> continuation) {
        return ((BotEventHistoryFragment$observeViewModel$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        RecyclerView recyclerView2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (!(vnb instanceof vNB.Activity)) {
                if (vnb instanceof vNB.TaskDescription) {
                    List list = (List) ((vNB.TaskDescription) vnb).AEQbTJ();
                    C48318uNa c48318uNa = this.this$0.KWHzl;
                    if (c48318uNa != null && (recyclerView2 = c48318uNa.OLrzqt) != null) {
                        recyclerView2.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                    }
                    C48318uNa c48318uNa2 = this.this$0.KWHzl;
                    if (c48318uNa2 != null && (c55173xeu = c48318uNa2.KWHzl) != null) {
                        c55173xeu.setVisibility(list.isEmpty() ? 0 : 8);
                    }
                    C50027uzf.submitList$default(this.this$0.OLrzqt(), list, null, 2, null);
                } else if (vnb instanceof vNB.StateListAnimator) {
                    C48318uNa c48318uNa3 = this.this$0.KWHzl;
                    if (c48318uNa3 != null && (recyclerView = c48318uNa3.OLrzqt) != null) {
                        recyclerView.setVisibility(8);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
