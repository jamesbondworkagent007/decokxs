package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35808oEl;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.oCN;
import o.oCU;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $draftMessage;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ KeyboardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1(KeyboardViewModel keyboardViewModel, String str, String str2, Continuation<? super KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1> continuation) {
        super(2, continuation);
        this.this$0 = keyboardViewModel;
        this.$channelId = str;
        this.$draftMessage = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1 keyboardViewModel$maybeClearConversationReferenceDraftSequence$1 = new KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1(this.this$0, this.$channelId, this.$draftMessage, continuation);
        keyboardViewModel$maybeClearConversationReferenceDraftSequence$1.L$0 = obj;
        return keyboardViewModel$maybeClearConversationReferenceDraftSequence$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: all -> 0x00a4, TryCatch #0 {all -> 0x00a4, blocks: (B:7:0x0013, B:35:0x009d, B:12:0x0028, B:28:0x007d, B:30:0x0083, B:32:0x0090, B:15:0x0034, B:22:0x0060, B:24:0x0064, B:18:0x004a), top: B:44:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        KeyboardViewModel keyboardViewModel;
        oCU ocu;
        String str2;
        DraftMessageModel draftMessageModelCopy$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("KeyboardViewModel", "maybeClearConversationReferenceDraftSequence");
            KeyboardViewModel keyboardViewModel2 = this.this$0;
            str = this.$channelId;
            String str3 = this.$draftMessage;
            Result.Application application2 = Result.Companion;
            C35808oEl c35808oEl = keyboardViewModel2.fIwbmz;
            this.L$0 = keyboardViewModel2;
            this.L$1 = str;
            this.label = 1;
            Object objAEQbTJ = c35808oEl.AEQbTJ(str, str3, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            keyboardViewModel = keyboardViewModel2;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.copydefault("KeyboardViewModel", "Failed to clear conversation reference draft sequence error=" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                    }
                    return Unit.INSTANCE;
                }
                ocu = (oCU) this.L$1;
                str2 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                DraftMessageModel draftMessageModel = (DraftMessageModel) obj;
                draftMessageModelCopy$default = draftMessageModel == null ? DraftMessageModel.copy$default(draftMessageModel, null, null, null, null, 11, null) : null;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (ocu.EZpvd(str2, draftMessageModelCopy$default, this) == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            keyboardViewModel = (KeyboardViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((OKMessage) obj) == null) {
            oCU ocu2 = keyboardViewModel.QKVWgx;
            oCN ocn = keyboardViewModel.AuCTel;
            this.L$0 = str;
            this.L$1 = ocu2;
            this.label = 2;
            Object objOLrzqt = ocn.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            String str4 = str;
            ocu = ocu2;
            obj = objOLrzqt;
            str2 = str4;
            DraftMessageModel draftMessageModel2 = (DraftMessageModel) obj;
            if (draftMessageModel2 == null) {
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (ocu.EZpvd(str2, draftMessageModelCopy$default, this) == objCopydefault) {
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
