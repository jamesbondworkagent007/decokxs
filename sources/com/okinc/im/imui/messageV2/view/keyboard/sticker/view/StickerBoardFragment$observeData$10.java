package com.okinc.im.imui.messageV2.view.keyboard.sticker.view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.view.StickerBoardFragment$observeData$10;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C36965oks;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nKF;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerBoardFragment$observeData$10 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C36965oks this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardFragment$observeData$10(C36965oks c36965oks, Continuation<? super StickerBoardFragment$observeData$10> continuation) {
        super(2, continuation);
        this.this$0 = c36965oks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardFragment$observeData$10(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((StickerBoardFragment$observeData$10) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RecyclerView recyclerView;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            nKF nkf = this.this$0.AkhnZx;
            if (nkf != null && (recyclerView = nkf.isConnected) != null) {
                final C36965oks c36965oks = this.this$0;
                C56443yFo.KWHzl(recyclerView.post(new Runnable() { // from class: o.okL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        StickerBoardFragment$observeData$10.invokeSuspend$lambda$0(c36965oks);
                    }
                }));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C36965oks c36965oks) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (c36965oks.valueOf().getItemCount() > 0) {
            nKF nkf = c36965oks.AkhnZx;
            RecyclerView.LayoutManager layoutManager = (nkf == null || (recyclerView2 = nkf.isConnected) == null) ? null : recyclerView2.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.scrollToPositionWithOffset(0, 0);
                return;
            }
            return;
        }
        nKF nkf2 = c36965oks.AkhnZx;
        if (nkf2 == null || (recyclerView = nkf2.isConnected) == null) {
            return;
        }
        recyclerView.scrollTo(0, 0);
    }
}
