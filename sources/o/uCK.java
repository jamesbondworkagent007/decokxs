package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetAiHomeUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCK extends vNH<Unit, AiHomeDto> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCK(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super AiHomeDto> continuation) throws java.lang.Throwable {
        GetAiHomeUseCase$execute$1 getAiHomeUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof GetAiHomeUseCase$execute$1) {
            getAiHomeUseCase$execute$1 = (GetAiHomeUseCase$execute$1) continuation;
            int i = getAiHomeUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAiHomeUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getAiHomeUseCase$execute$1 = new GetAiHomeUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getAiHomeUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAiHomeUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                getAiHomeUseCase$execute$1.label = 1;
                objEZpvd = interfaceC50055vAf.EZpvd(getAiHomeUseCase$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            responseData = (ResponseData) objEZpvd;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        return CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) stateListAnimator.AEQbTJ());
    }
}
