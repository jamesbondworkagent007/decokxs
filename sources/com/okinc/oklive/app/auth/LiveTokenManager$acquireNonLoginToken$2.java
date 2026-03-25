package com.okinc.oklive.app.auth;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.oklive.app.data.model.remote.LiveAuthRequest;
import com.okinc.oklive.app.data.repository.remote.LiveAuthResponse;
import com.okinc.oklive.app.data.repository.remote.LiveAuthService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44157sFk;
import o.C44535sTn;
import o.C44539sTr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xVW;

/* JADX INFO: loaded from: classes10.dex */
public final class LiveTokenManager$acquireNonLoginToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C44535sTn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTokenManager$acquireNonLoginToken$2(C44535sTn c44535sTn, Continuation<? super LiveTokenManager$acquireNonLoginToken$2> continuation) {
        super(2, continuation);
        this.this$0 = c44535sTn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveTokenManager$acquireNonLoginToken$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((LiveTokenManager$acquireNonLoginToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (C44157sFk.gEmmrt().values()) {
                    return C56443yFo.KWHzl(false);
                }
                if (C44539sTr.EZpvd.AEQbTJ() != null) {
                    return C56443yFo.KWHzl(true);
                }
                String strCopydefault = xVW.copydefault();
                if (strCopydefault == null) {
                    return C56443yFo.KWHzl(false);
                }
                LiveAuthRequest liveAuthRequest = new LiveAuthRequest(strCopydefault, 2);
                LiveAuthService liveAuthService = this.this$0.AEQbTJ;
                this.label = 1;
                obj = liveAuthService.getIMToken(liveAuthRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            LiveAuthResponse liveAuthResponse = (LiveAuthResponse) ((ResponseData) obj).getData();
            if (liveAuthResponse != null) {
                String token = liveAuthResponse.getToken();
                long userUid = liveAuthResponse.getUserUid();
                C44539sTr c44539sTr = C44539sTr.EZpvd;
                c44539sTr.KWHzl(String.valueOf(userUid));
                c44539sTr.OLrzqt(token);
                return C56443yFo.KWHzl(true);
            }
        } catch (Exception unused) {
        }
        return C56443yFo.KWHzl(false);
    }
}
