package com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel;

import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44487sRq;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerBoardViewModel$retryForError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ StickerBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardViewModel$retryForError$1(StickerBoardViewModel stickerBoardViewModel, Continuation<? super StickerBoardViewModel$retryForError$1> continuation) {
        super(2, continuation);
        this.this$0 = stickerBoardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardViewModel$retryForError$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerBoardViewModel$retryForError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        StickerConfigResponse stickerConfigResponse;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44487sRq interfaceC44487sRq = this.this$0.uzCIH;
            this.label = 1;
            obj = interfaceC44487sRq.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stickerConfigResponse = (StickerConfigResponse) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (((AbstractC43419rot) obj).EZpvd()) {
                    this.this$0.valueOf.tryEmit(stickerConfigResponse);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        StickerConfigResponse stickerConfigResponse2 = (StickerConfigResponse) ((AbstractC43419rot) obj).copydefault();
        InterfaceC44487sRq interfaceC44487sRq2 = this.this$0.uzCIH;
        this.L$0 = stickerConfigResponse2;
        this.label = 2;
        Object objEZpvd = interfaceC44487sRq2.EZpvd(this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        stickerConfigResponse = stickerConfigResponse2;
        obj = objEZpvd;
        if (((AbstractC43419rot) obj).EZpvd()) {
        }
        return Unit.INSTANCE;
    }
}
