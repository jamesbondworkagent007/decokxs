package com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36962okp;
import o.InterfaceC44494sRx;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerBoardViewModel$fetchStickerPacks$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends InterfaceC44494sRx>>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ StickerBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardViewModel$fetchStickerPacks$2(StickerBoardViewModel stickerBoardViewModel, Continuation<? super StickerBoardViewModel$fetchStickerPacks$2> continuation) {
        super(3, continuation);
        this.this$0 = stickerBoardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends InterfaceC44494sRx>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new StickerBoardViewModel$fetchStickerPacks$2(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AEQbTJ.tryEmit(InterfaceC36962okp.StateListAnimator.copydefault);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
