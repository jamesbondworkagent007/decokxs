package com.okinc.im.imui.conversation.message.provider.base.moreaction;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33134mqi;
import o.C33730nDs;
import o.C35399nuc;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class MenuAddCustomStickerAction$saveCustomSticker$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $stickerId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuAddCustomStickerAction$saveCustomSticker$1(String str, Continuation<? super MenuAddCustomStickerAction$saveCustomSticker$1> continuation) {
        super(2, continuation);
        this.$stickerId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MenuAddCustomStickerAction$saveCustomSticker$1(this.$stickerId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MenuAddCustomStickerAction$saveCustomSticker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            MenuAddCustomStickerAction$saveCustomSticker$1$result$1 menuAddCustomStickerAction$saveCustomSticker$1$result$1 = new MenuAddCustomStickerAction$saveCustomSticker$1$result$1(this.$stickerId, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherCopydefault, menuAddCustomStickerAction$saveCustomSticker$1$result$1, this);
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
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C33134mqi.AEQbTJ(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage());
        } else {
            if (!(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            RxBus.AEQbTJ(new C33730nDs());
            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.aVPvww, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
