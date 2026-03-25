package com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel;

import com.okinc.im.imui.sticker.model.StickerPackModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C33492mxV;
import o.C35399nuc;
import o.C44492sRv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC36962okp;
import o.InterfaceC44494sRx;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerBoardViewModel$fetchStickerPacks$1 extends SuspendLambda implements Function2<List<? extends InterfaceC44494sRx>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickerBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardViewModel$fetchStickerPacks$1(StickerBoardViewModel stickerBoardViewModel, Continuation<? super StickerBoardViewModel$fetchStickerPacks$1> continuation) {
        super(2, continuation);
        this.this$0 = stickerBoardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StickerBoardViewModel$fetchStickerPacks$1 stickerBoardViewModel$fetchStickerPacks$1 = new StickerBoardViewModel$fetchStickerPacks$1(this.this$0, continuation);
        stickerBoardViewModel$fetchStickerPacks$1.L$0 = obj;
        return stickerBoardViewModel$fetchStickerPacks$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends InterfaceC44494sRx> list, Continuation<? super Unit> continuation) {
        return ((StickerBoardViewModel$fetchStickerPacks$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<InterfaceC44494sRx> list = (List) this.L$0;
            if (list.isEmpty()) {
                this.this$0.AEQbTJ.tryEmit(InterfaceC36962okp.StateListAnimator.copydefault);
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (InterfaceC44494sRx interfaceC44494sRx : list) {
                    arrayList.add(new StickerPackModel(interfaceC44494sRx.getPackId(), C44492sRv.EZpvd(interfaceC44494sRx) ? C33070mpX.AYXKKw(C35399nuc.LoaderManager.DYICSh) : interfaceC44494sRx.getTitle(), C33492mxV.OLrzqt() ? interfaceC44494sRx.getIconUrlNight() : interfaceC44494sRx.getIconUrlDay(), C44492sRv.EZpvd(interfaceC44494sRx)));
                }
                this.this$0.AEQbTJ.tryEmit(new InterfaceC36962okp.Application(arrayList));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
