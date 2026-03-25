package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.im.bean.LiveChatRoomConfig;
import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC36555odF;
import o.C36547ocy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36545ocw;
import o.oCJ;
import o.pUU;
import o.sDZ;
import o.sGF;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$initConversation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LiveChatRoomConfig $config;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$initConversation$1(LiveChatRoomConfig liveChatRoomConfig, C36547ocy c36547ocy, Continuation<? super LivestreamChatViewModel$initConversation$1> continuation) {
        super(2, continuation);
        this.$config = liveChatRoomConfig;
        this.this$0 = c36547ocy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LivestreamChatViewModel$initConversation$1 livestreamChatViewModel$initConversation$1 = new LivestreamChatViewModel$initConversation$1(this.$config, this.this$0, continuation);
        livestreamChatViewModel$initConversation$1.L$0 = obj;
        return livestreamChatViewModel$initConversation$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$initConversation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        C36547ocy c36547ocy;
        LiveChatRoomConfig liveChatRoomConfig;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LiveChatRoomConfig liveChatRoomConfig2 = this.$config;
            c36547ocy = this.this$0;
            Result.Application application2 = Result.Companion;
            sGF sgfAYXKKw = sDZ.AEQbTJ.AYXKKw();
            String strCopydefault = liveChatRoomConfig2.copydefault();
            this.L$0 = liveChatRoomConfig2;
            this.L$1 = c36547ocy;
            this.label = 1;
            if (sgfAYXKKw.OLrzqt(strCopydefault, this) == objCopydefault) {
                return objCopydefault;
            }
            liveChatRoomConfig = liveChatRoomConfig2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) obj);
                C36547ocy c36547ocy2 = this.this$0;
                LiveChatRoomConfig liveChatRoomConfig3 = this.$config;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    OKConversation oKConversation = (OKConversation) objM7377constructorimpl;
                    pUU.KWHzl("LivestreamChatViewModel", "initConversation: success");
                    c36547ocy2.copydefault.tryEmit(new AbstractC36555odF.StateListAnimator(IMPageType.NORMAL_IM, oKConversation));
                    if (!liveChatRoomConfig3.AhwBna()) {
                        c36547ocy2.copydefault(InterfaceC36545ocw.TaskDescription.OLrzqt);
                    } else if (liveChatRoomConfig3.AYXKKw()) {
                        c36547ocy2.copydefault(InterfaceC36545ocw.ActionBar.copydefault);
                    } else {
                        c36547ocy2.copydefault(InterfaceC36545ocw.Activity.OLrzqt);
                    }
                    c36547ocy2.AEQbTJ(oKConversation.getTargetId());
                }
                C36547ocy c36547ocy3 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.KWHzl("LivestreamChatViewModel", "initConversation failed: " + thM7380exceptionOrNullimpl.getMessage());
                    MutableSharedFlow mutableSharedFlow = c36547ocy3.copydefault;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    mutableSharedFlow.tryEmit(new AbstractC36555odF.TaskDescription(message));
                }
                return Unit.INSTANCE;
            }
            c36547ocy = (C36547ocy) this.L$1;
            liveChatRoomConfig = (LiveChatRoomConfig) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        oCJ ocj = c36547ocy.fIwbmz;
        String strCopydefault2 = liveChatRoomConfig.copydefault();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = ocj.AEQbTJ(strCopydefault2, null, null, null, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((OKConversation) obj);
        C36547ocy c36547ocy22 = this.this$0;
        LiveChatRoomConfig liveChatRoomConfig32 = this.$config;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        C36547ocy c36547ocy32 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
