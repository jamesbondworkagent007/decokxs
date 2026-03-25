package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetSupportedAiInstrumentsUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCL extends vNH<java.lang.String, java.util.List<? extends java.lang.String>> {
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) throws java.lang.Throwable {
        GetSupportedAiInstrumentsUseCase$execute$1 getSupportedAiInstrumentsUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GetSupportedAiInstrumentsUseCase$execute$1) {
            getSupportedAiInstrumentsUseCase$execute$1 = (GetSupportedAiInstrumentsUseCase$execute$1) continuation;
            int i = getSupportedAiInstrumentsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSupportedAiInstrumentsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getSupportedAiInstrumentsUseCase$execute$1 = new GetSupportedAiInstrumentsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAuCTel = getSupportedAiInstrumentsUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSupportedAiInstrumentsUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAuCTel);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                getSupportedAiInstrumentsUseCase$execute$1.label = 1;
                objAuCTel = interfaceC50055vAf.AuCTel(str, getSupportedAiInstrumentsUseCase$execute$1);
                if (objAuCTel == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAuCTel);
            }
            responseData = (ResponseData) objAuCTel;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return stateListAnimator.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return stateListAnimator.AEQbTJ();
    }
}
