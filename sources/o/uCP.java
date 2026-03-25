package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetLlmDisclaimerUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCP extends vNH<java.lang.String, java.util.List<? extends LlmDisclaimerInfoDto>> {
    public final InterfaceC50055vAf AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCP(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<LlmDisclaimerInfoDto>> continuation) throws java.lang.Throwable {
        GetLlmDisclaimerUseCase$execute$1 getLlmDisclaimerUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GetLlmDisclaimerUseCase$execute$1) {
            getLlmDisclaimerUseCase$execute$1 = (GetLlmDisclaimerUseCase$execute$1) continuation;
            int i = getLlmDisclaimerUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLlmDisclaimerUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getLlmDisclaimerUseCase$execute$1 = new GetLlmDisclaimerUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = getLlmDisclaimerUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLlmDisclaimerUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAhwBna);
                InterfaceC50055vAf interfaceC50055vAf = this.AEQbTJ;
                getLlmDisclaimerUseCase$execute$1.label = 1;
                objAhwBna = interfaceC50055vAf.AhwBna(str, getLlmDisclaimerUseCase$execute$1);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAhwBna);
            }
            responseData = (ResponseData) objAhwBna;
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
