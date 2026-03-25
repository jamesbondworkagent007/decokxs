package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.impl.passkey.data.PasskeyToggleRemoteDataSource;
import com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5981aGi;
import o.C56391yDq;
import o.C56442yFn;
import o.C5974aGb;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyToggleSwitchUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC5981aGi>, Object> {
    final /* synthetic */ SwitchPasskeyToggleRequest $request;
    int label;
    final /* synthetic */ C5974aGb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyToggleSwitchUseCase$invoke$2(C5974aGb c5974aGb, SwitchPasskeyToggleRequest switchPasskeyToggleRequest, Continuation<? super PasskeyToggleSwitchUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5974aGb;
        this.$request = switchPasskeyToggleRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyToggleSwitchUseCase$invoke$2(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC5981aGi> continuation) {
        return ((PasskeyToggleSwitchUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5981aGi.ActionBar actionBar;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                PasskeyToggleRemoteDataSource passkeyToggleRemoteDataSource = this.this$0.AEQbTJ;
                SwitchPasskeyToggleRequest switchPasskeyToggleRequest = this.$request;
                this.label = 1;
                obj = passkeyToggleRemoteDataSource.switchPasskeyToggle(switchPasskeyToggleRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            responseData = (ResponseData) obj;
        } catch (Exception e) {
            pUU.copydefault("Error in PasskeyToggleSwitchUseCase: " + e.getMessage());
            actionBar = new AbstractC5981aGi.ActionBar(e.getMessage());
        }
        if (responseData.getCode() == 0) {
            return AbstractC5981aGi.Application.OLrzqt;
        }
        actionBar = new AbstractC5981aGi.ActionBar(responseData.getMsg());
        return actionBar;
    }
}
