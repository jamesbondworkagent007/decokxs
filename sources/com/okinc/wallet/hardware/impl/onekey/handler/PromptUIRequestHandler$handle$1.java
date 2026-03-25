package com.okinc.wallet.hardware.impl.onekey.handler;

import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import com.okinc.wallet.hardware.impl.onekey.data.Empty;
import com.okinc.wallet.hardware.impl.onekey.handler.PromptUIRequestHandler;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C57149ycv;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class PromptUIRequestHandler$handle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $params;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ PromptUIRequestHandler this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptUIRequestHandler$handle$1(PromptUIRequestHandler promptUIRequestHandler, String str, String str2, Continuation<? super PromptUIRequestHandler$handle$1> continuation) {
        super(2, continuation);
        this.this$0 = promptUIRequestHandler;
        this.$requestId = str;
        this.$params = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PromptUIRequestHandler$handle$1(this.this$0, this.$requestId, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PromptUIRequestHandler$handle$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        OneKeyAuthStage oneKeyAuthStage;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcherKWHzl = this.this$0.KWHzl();
            PromptUIRequestHandler$handle$1$prompt$1 promptUIRequestHandler$handle$1$prompt$1 = new PromptUIRequestHandler$handle$1$prompt$1(this.$params, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherKWHzl, promptUIRequestHandler$handle$1$prompt$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        PromptUIRequestHandler.PromptUIRequest promptUIRequest = (PromptUIRequestHandler.PromptUIRequest) obj;
        String type = promptUIRequest.getType();
        switch (type.hashCode()) {
            case -1682527990:
                if (type.equals("ui-request_passphrase_on_device")) {
                    oneKeyAuthStage = OneKeyAuthStage.WAIT_FOR_PASSPHRASE;
                }
                pUU.valueOf("PromptUIRequestHandler", "Unknown UI request type: " + promptUIRequest.getType());
                oneKeyAuthStage = null;
                break;
            case -1394158036:
                if (type.equals("ui-request_pin")) {
                    oneKeyAuthStage = OneKeyAuthStage.WAIT_FOR_PIN;
                }
                pUU.valueOf("PromptUIRequestHandler", "Unknown UI request type: " + promptUIRequest.getType());
                oneKeyAuthStage = null;
                break;
            case 676119955:
                if (!type.equals("ui-request_passphrase")) {
                    pUU.valueOf("PromptUIRequestHandler", "Unknown UI request type: " + promptUIRequest.getType());
                }
                oneKeyAuthStage = null;
                break;
            case 1492956299:
                if (type.equals("ui-button")) {
                    oneKeyAuthStage = OneKeyAuthStage.WAIT_FOR_BUTTON_CLICK;
                }
                pUU.valueOf("PromptUIRequestHandler", "Unknown UI request type: " + promptUIRequest.getType());
                oneKeyAuthStage = null;
                break;
            case 1633565360:
                if (type.equals("ui-close_window")) {
                    oneKeyAuthStage = OneKeyAuthStage.CLOSE_WINDOW;
                }
                pUU.valueOf("PromptUIRequestHandler", "Unknown UI request type: " + promptUIRequest.getType());
                oneKeyAuthStage = null;
                break;
        }
        if (oneKeyAuthStage != null) {
            this.this$0.EZpvd().AEQbTJ(oneKeyAuthStage);
        }
        C57149ycv c57149ycvDjBIcL = this.this$0.EZpvd().djBIcL();
        BuildersKt__Builders_commonKt.launch$default(c57149ycvDjBIcL.valueOf, null, null, new PromptUIRequestHandler$handle$1$invokeSuspend$$inlined$nativeResponse$1(c57149ycvDjBIcL, this.$requestId, Empty.INSTANCE, null), 3, null);
        return Unit.INSTANCE;
    }
}
