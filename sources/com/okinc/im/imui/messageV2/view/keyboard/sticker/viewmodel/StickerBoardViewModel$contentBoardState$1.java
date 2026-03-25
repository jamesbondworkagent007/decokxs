package com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel;

import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.im.imui.sticker.model.StickerPackModel;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.InterfaceC36962okp;
import o.InterfaceC36968okv;
import o.yDY;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerBoardViewModel$contentBoardState$1 extends SuspendLambda implements yHT<InterfaceC36962okp, StickerPackModel, List<? extends ListItem>, Continuation<? super InterfaceC36968okv>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StickerBoardViewModel$contentBoardState$1(Continuation<? super StickerBoardViewModel$contentBoardState$1> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(InterfaceC36962okp interfaceC36962okp, StickerPackModel stickerPackModel, List<? extends ListItem> list, Continuation<? super InterfaceC36968okv> continuation) {
        StickerBoardViewModel$contentBoardState$1 stickerBoardViewModel$contentBoardState$1 = new StickerBoardViewModel$contentBoardState$1(continuation);
        stickerBoardViewModel$contentBoardState$1.L$0 = interfaceC36962okp;
        stickerBoardViewModel$contentBoardState$1.L$1 = stickerPackModel;
        stickerBoardViewModel$contentBoardState$1.L$2 = list;
        return stickerBoardViewModel$contentBoardState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC36962okp interfaceC36962okp = (InterfaceC36962okp) this.L$0;
            StickerPackModel stickerPackModel = (StickerPackModel) this.L$1;
            List list = (List) this.L$2;
            if ((interfaceC36962okp instanceof InterfaceC36962okp.Application) && stickerPackModel != null) {
                if (stickerPackModel.OLrzqt()) {
                    if (list.isEmpty()) {
                        return InterfaceC36968okv.ActionBar.EZpvd;
                    }
                    return new InterfaceC36968okv.TaskDescription(CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(ListItem.AddButton.copydefault), (Iterable) list));
                }
                return new InterfaceC36968okv.TaskDescription(list);
            }
            return new InterfaceC36968okv.TaskDescription(yDY.AhwBna());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
