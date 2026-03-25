package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.tradingbot.impl.usecase.bot.FetchInterestInfoUseCase$execute$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTT extends vNH<java.lang.String, InterestInfoResponse> {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC50055vAf OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public wTT(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC50055vAf interfaceC50055vAf) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = interfaceC50055vAf;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super InterestInfoResponse> continuation) throws java.lang.Throwable {
        FetchInterestInfoUseCase$execute$1 fetchInterestInfoUseCase$execute$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar2;
        ResponseData responseData;
        if (continuation instanceof FetchInterestInfoUseCase$execute$1) {
            fetchInterestInfoUseCase$execute$1 = (FetchInterestInfoUseCase$execute$1) continuation;
            int i = fetchInterestInfoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchInterestInfoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchInterestInfoUseCase$execute$1 = new FetchInterestInfoUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = fetchInterestInfoUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = fetchInterestInfoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC50055vAf interfaceC50055vAf = this.OLrzqt;
                fetchInterestInfoUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(str, fetchInterestInfoUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            responseData = (ResponseData) objCopydefault;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            return actionBar2.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar2 = new AbstractC43419rot.StateListAnimator((InterestInfoResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar2 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar2.AEQbTJ();
    }
}
