package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.aiBot.domain.usecase.GetDefaultPromptTemplateUseCase$execute$1;
import com.okinc.tradingbot.impl.aiBot.dto.DefaultPromptTemplateDto;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCO extends vNH<Unit, java.lang.String> {
    public final InterfaceC50055vAf EZpvd;
    public final CoroutineDispatcher KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public uCO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GetDefaultPromptTemplateUseCase$execute$1 getDefaultPromptTemplateUseCase$execute$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        java.util.List<java.lang.String> listCopydefault;
        ResponseData responseData;
        if (continuation instanceof GetDefaultPromptTemplateUseCase$execute$1) {
            getDefaultPromptTemplateUseCase$execute$1 = (GetDefaultPromptTemplateUseCase$execute$1) continuation;
            int i = getDefaultPromptTemplateUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getDefaultPromptTemplateUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getDefaultPromptTemplateUseCase$execute$1 = new GetDefaultPromptTemplateUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getDefaultPromptTemplateUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getDefaultPromptTemplateUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC50055vAf interfaceC50055vAf = this.EZpvd;
                getDefaultPromptTemplateUseCase$execute$1.label = 1;
                objKWHzl = interfaceC50055vAf.KWHzl(getDefaultPromptTemplateUseCase$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            DefaultPromptTemplateDto defaultPromptTemplateDto = (DefaultPromptTemplateDto) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
            if (defaultPromptTemplateDto != null) {
            }
            if (str != null) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            DefaultPromptTemplateDto defaultPromptTemplateDto2 = (DefaultPromptTemplateDto) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator.AEQbTJ());
            java.lang.String str = (defaultPromptTemplateDto2 != null || (listCopydefault = defaultPromptTemplateDto2.copydefault()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
            return str != null ? "" : str;
        }
    }
}
