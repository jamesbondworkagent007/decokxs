package com.okinc.planet.service;

import com.okinc.planet_api.model.LatestMessage;
import com.okinc.planet_api.model.WSMessageData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C46418tTp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetApplicationDelegate$handleWSData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WSMessageData $wsMsgData;
    int label;
    final /* synthetic */ C46418tTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetApplicationDelegate$handleWSData$1(WSMessageData wSMessageData, C46418tTp c46418tTp, Continuation<? super OKPlanetApplicationDelegate$handleWSData$1> continuation) {
        super(2, continuation);
        this.$wsMsgData = wSMessageData;
        this.this$0 = c46418tTp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKPlanetApplicationDelegate$handleWSData$1(this.$wsMsgData, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPlanetApplicationDelegate$handleWSData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WSMessageData wSMessageData = this.$wsMsgData;
            if (wSMessageData != null) {
                C46418tTp c46418tTp = this.this$0;
                Iterator<T> it = wSMessageData.getEventSourceType().iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (iIntValue == 1) {
                        C46418tTp.Companion.copydefault(wSMessageData.getLikeMsgCount());
                    } else if (iIntValue == 2) {
                        C46418tTp.Companion.OLrzqt(wSMessageData.getFollowMsgCount());
                    } else if (iIntValue == 3) {
                        C46418tTp.Companion.KWHzl(wSMessageData.getCommentMsgCount());
                    } else if (iIntValue == 4) {
                        C46418tTp.Companion.AEQbTJ(wSMessageData.getSystemMsgCount());
                    }
                }
                C46418tTp.Application application = C46418tTp.Companion;
                application.djBIcL(application.EZpvd() + application.AEQbTJ() + application.OLrzqt() + application.KWHzl());
                application.EZpvd(application.EZpvd() + application.AEQbTJ() + application.OLrzqt());
                LatestMessage latestMsg = wSMessageData.getLatestMsg();
                if (latestMsg != null) {
                    latestMsg.setLocalizedTitle(c46418tTp.AEQbTJ(latestMsg));
                }
                WSMessageData wSMessageData2 = new WSMessageData(application.AEQbTJ(), (List) null, application.OLrzqt(), application.EZpvd(), application.KWHzl(), latestMsg, (Integer) null, 66, (DefaultConstructorMarker) null);
                wSMessageData2.setTotalUnreadCount(C56443yFo.AEQbTJ(application.djBIcL()));
                pUU.KWHzl("qjf", "actWS = " + wSMessageData2);
                MutableSharedFlow mutableSharedFlow = C46418tTp.OLrzqt;
                this.label = 1;
                if (mutableSharedFlow.emit(wSMessageData2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
