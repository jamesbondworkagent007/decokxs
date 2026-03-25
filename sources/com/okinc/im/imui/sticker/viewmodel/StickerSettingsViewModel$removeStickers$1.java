package com.okinc.im.imui.sticker.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44487sRq;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerSettingsViewModel$removeStickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<String> $value;
    int label;
    final /* synthetic */ StickerSettingsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSettingsViewModel$removeStickers$1(StickerSettingsViewModel stickerSettingsViewModel, Set<String> set, Continuation<? super StickerSettingsViewModel$removeStickers$1> continuation) {
        super(2, continuation);
        this.this$0 = stickerSettingsViewModel;
        this.$value = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerSettingsViewModel$removeStickers$1(this.this$0, this.$value, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerSettingsViewModel$removeStickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44487sRq interfaceC44487sRq = this.this$0.fARcdN;
            Set<String> set = this.$value;
            this.label = 1;
            obj = interfaceC44487sRq.copydefault(set, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        StickerSettingsViewModel stickerSettingsViewModel = this.this$0;
        Set<String> set2 = this.$value;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            pUU.EZpvd("sticker_log", "Stickers removed successfully");
            stickerSettingsViewModel.KWHzl.tryEmit(C56443yFo.KWHzl(false));
            stickerSettingsViewModel.djBIcL.tryEmit(C56443yFo.AEQbTJ(set2.size()));
        }
        StickerSettingsViewModel stickerSettingsViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            pUU.copydefault("sticker_log", "Failed to remove stickers: " + oKServerException.getMessage());
            stickerSettingsViewModel2.KWHzl.tryEmit(C56443yFo.KWHzl(false));
            String message = oKServerException.getMessage();
            if (message != null) {
                stickerSettingsViewModel2.copydefault.tryEmit(message);
            }
        }
        return Unit.INSTANCE;
    }
}
