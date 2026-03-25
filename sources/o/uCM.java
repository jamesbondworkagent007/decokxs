package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.model.IndicatorSectionUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetTechnicalIndicatorsUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.TechnicalIndicatorsResponseDto;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCM extends vNH<Unit, java.util.List<? extends IndicatorSectionUiModel>> {
    public final InterfaceC50055vAf EZpvd;
    public final C48046uCz KWHzl;
    public final CoroutineDispatcher OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull C48046uCz c48046uCz) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(c48046uCz, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
        this.KWHzl = c48046uCz;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:23:0x004c, B:25:0x0054, B:27:0x005a, B:28:0x0067), top: B:35:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<IndicatorSectionUiModel>> continuation) throws java.lang.Throwable {
        GetTechnicalIndicatorsUseCase$execute$1 getTechnicalIndicatorsUseCase$execute$1;
        java.lang.Throwable th;
        uCM ucm;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof GetTechnicalIndicatorsUseCase$execute$1) {
            getTechnicalIndicatorsUseCase$execute$1 = (GetTechnicalIndicatorsUseCase$execute$1) continuation;
            int i = getTechnicalIndicatorsUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTechnicalIndicatorsUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getTechnicalIndicatorsUseCase$execute$1 = new GetTechnicalIndicatorsUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getTechnicalIndicatorsUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getTechnicalIndicatorsUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                getTechnicalIndicatorsUseCase$execute$1.L$0 = this;
                getTechnicalIndicatorsUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(getTechnicalIndicatorsUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                ucm = this;
                responseData = (ResponseData) objCopydefault;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ucm = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ucm = (uCM) getTechnicalIndicatorsUseCase$execute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                responseData = (ResponseData) objCopydefault;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        return ucm.KWHzl.AEQbTJ((TechnicalIndicatorsResponseDto) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) actionBar.AEQbTJ()));
    }
}
