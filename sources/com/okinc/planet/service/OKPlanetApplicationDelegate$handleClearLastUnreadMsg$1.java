package com.okinc.planet.service;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_userprofile.data.PlanetMarkMessageReadRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C43401rob;
import o.C43422row;
import o.C46418tTp;
import o.C47904tys;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $topUnreadMsgId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46418tTp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1(C46418tTp c46418tTp, Long l, Continuation<? super OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1> continuation) {
        super(2, continuation);
        this.this$0 = c46418tTp;
        this.$topUnreadMsgId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1 oKPlanetApplicationDelegate$handleClearLastUnreadMsg$1 = new OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1(this.this$0, this.$topUnreadMsgId, continuation);
        oKPlanetApplicationDelegate$handleClearLastUnreadMsg$1.L$0 = obj;
        return oKPlanetApplicationDelegate$handleClearLastUnreadMsg$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C46418tTp c46418tTp = this.this$0;
                    Long l = this.$topUnreadMsgId;
                    tQP tqpQOLQEE = c46418tTp.QOLQEE();
                    PlanetMarkMessageReadRequest planetMarkMessageReadRequest = new PlanetMarkMessageReadRequest(0, C56443yFo.KWHzl(C33129mqd.valueOf(l)), 1, (DefaultConstructorMarker) null);
                    this.label = 1;
                    obj = tqpQOLQEE.copydefault(planetMarkMessageReadRequest, (Continuation<? super ResponseData<Object>>) this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                ResponseData responseData = (ResponseData) obj;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            actionBar.AEQbTJ();
            SPUtils.remove(C47904tys.EZpvd.KWHzl());
        } catch (Exception e) {
            pUU.copydefault("qjf", "Exception = " + e.getMessage());
        }
        return Unit.INSTANCE;
    }
}
