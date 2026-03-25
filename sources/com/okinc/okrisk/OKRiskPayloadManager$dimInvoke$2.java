package com.okinc.okrisk;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okrisk.service.DimBody;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47028tiM;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskPayloadManager$dimInvoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentAttempt;
    final /* synthetic */ String $deviceMessage;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $sv;
    final /* synthetic */ String $timestamp;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskPayloadManager$dimInvoke$2(int i, String str, String str2, String str3, String str4, Continuation<? super OKRiskPayloadManager$dimInvoke$2> continuation) {
        super(2, continuation);
        this.$currentAttempt = i;
        this.$timestamp = str;
        this.$sessionId = str2;
        this.$deviceMessage = str3;
        this.$sv = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKRiskPayloadManager$dimInvoke$2 oKRiskPayloadManager$dimInvoke$2 = new OKRiskPayloadManager$dimInvoke$2(this.$currentAttempt, this.$timestamp, this.$sessionId, this.$deviceMessage, this.$sv, continuation);
        oKRiskPayloadManager$dimInvoke$2.L$0 = obj;
        return oKRiskPayloadManager$dimInvoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskPayloadManager$dimInvoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        OKRiskPayloadManager oKRiskPayloadManager;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        Object objPostDim$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String str5 = this.$sessionId;
            String str6 = this.$deviceMessage;
            String str7 = this.$timestamp;
            String str8 = this.$sv;
            InterfaceC47028tiM interfaceC47028tiMEZpvd = InterfaceC47028tiM.Companion.EZpvd();
            DimBody dimBody = new DimBody(str5, str6, str7, 1, str8);
            this.label = 1;
            objPostDim$default = InterfaceC47028tiM.Application.postDim$default(interfaceC47028tiMEZpvd, dimBody, null, this, 2, null);
            if (objPostDim$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                str = this.$timestamp;
                str2 = this.$sessionId;
                str3 = this.$deviceMessage;
                i = this.$currentAttempt;
                str4 = this.$sv;
                this.label = 3;
                if (oKRiskPayloadManager.OLrzqt(str, str2, str3, i + 1, str4, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objPostDim$default = obj;
        }
        ResponseData responseData = (ResponseData) objPostDim$default;
        if (responseData.getCode() == 0) {
            actionBar = new AbstractC43419rot.StateListAnimator(responseData.getData());
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.$currentAttempt < OKRiskPayloadManager.AkhnZx) {
                long jPow = (long) (Math.pow(2.0d, this.$currentAttempt) * 1000);
                this.label = 2;
                if (DelayKt.delay(jPow, this) == objCopydefault) {
                    return objCopydefault;
                }
                oKRiskPayloadManager = OKRiskPayloadManager.copydefault;
                str = this.$timestamp;
                str2 = this.$sessionId;
                str3 = this.$deviceMessage;
                i = this.$currentAttempt;
                str4 = this.$sv;
                this.label = 3;
                if (oKRiskPayloadManager.OLrzqt(str, str2, str3, i + 1, str4, this) == objCopydefault) {
                }
            }
        }
        return Unit.INSTANCE;
    }
}
