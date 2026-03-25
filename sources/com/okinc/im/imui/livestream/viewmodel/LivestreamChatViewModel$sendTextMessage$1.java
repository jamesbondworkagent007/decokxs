package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.livestream.model.SnackBarEvent;
import com.okinc.im.imui.livestream.viewmodel.LivestreamChatViewModel$sendTextMessage$1;
import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32866mlf;
import o.C35820oEx;
import o.C36547ocy;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC36545ocw;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$sendTextMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $currentTime;
    final /* synthetic */ String $messageText;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$sendTextMessage$1(C36547ocy c36547ocy, String str, long j, Continuation<? super LivestreamChatViewModel$sendTextMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = c36547ocy;
        this.$messageText = str;
        this.$currentTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamChatViewModel$sendTextMessage$1(this.this$0, this.$messageText, this.$currentTime, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$sendTextMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        InterfaceC36545ocw.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (this.this$0.KWHzl.getValue() instanceof InterfaceC36545ocw.Application) {
                        this.this$0.KWHzl.setValue(new InterfaceC36545ocw.Application(true));
                    }
                    SendMessageRequest sendMessageRequest = new SendMessageRequest(this.this$0.DbNXlk.copydefault(), null, new SendMessageRequestParam.Text(this.$messageText, C56443yFo.KWHzl(true)));
                    C35820oEx c35820oEx = this.this$0.getFieldNames;
                    List<SendMessageRequest> listEZpvd = C56402yEa.EZpvd(sendMessageRequest);
                    this.label = 1;
                    if (c35820oEx.OLrzqt(listEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.this$0.getNewProxyInstance = this.$currentTime;
                pUU.EZpvd("LivestreamChatViewModel", "Message sent successfully: " + this.$messageText);
                final C36547ocy c36547ocy = this.this$0;
                C32866mlf.onEvent$default("Livestream_LiveChat_MessageSend_Click", (TrackChannel[]) null, new Function1() { // from class: o.ocz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return LivestreamChatViewModel$sendTextMessage$1.invokeSuspend$lambda$0(c36547ocy, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                this.this$0.AEQbTJ.tryEmit(Unit.INSTANCE);
            } catch (Exception e) {
                pUU.copydefault("LivestreamChatViewModel", "Failed to send message: " + e.getMessage());
                if (!(e instanceof OKServerException) || ((OKServerException) e).getCode() != 40005) {
                    this.this$0.AhwBna.tryEmit(SnackBarEvent.NetworkError);
                } else {
                    this.this$0.copydefault(InterfaceC36545ocw.ActionBar.copydefault);
                    this.this$0.AhwBna.tryEmit(SnackBarEvent.BeingMuted);
                }
                if (this.this$0.KWHzl.getValue() instanceof InterfaceC36545ocw.Application) {
                    mutableStateFlow = this.this$0.KWHzl;
                    application = new InterfaceC36545ocw.Application(false);
                }
            }
            if (this.this$0.KWHzl.getValue() instanceof InterfaceC36545ocw.Application) {
                mutableStateFlow = this.this$0.KWHzl;
                application = new InterfaceC36545ocw.Application(false);
                mutableStateFlow.setValue(application);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (this.this$0.KWHzl.getValue() instanceof InterfaceC36545ocw.Application) {
                this.this$0.KWHzl.setValue(new InterfaceC36545ocw.Application(false));
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C36547ocy c36547ocy, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "channel_id", c36547ocy.DbNXlk.copydefault(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.SHARE_CODE, c36547ocy.DbNXlk.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "watch_session_id", c36547ocy.DbNXlk.EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }
}
