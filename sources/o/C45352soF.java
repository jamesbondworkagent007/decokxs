package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.IntegratedSolutionPageData;
import com.okinc.okex.center.bean.IntegratedSolutionResponse;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.common.usecase.SupportIntegratedSolutionUseCase$getIntegratedSolution$1;
import com.okinc.okex.common.usecase.SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45352soF {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC44921sfz KWHzl;

    @yCM
    public C45352soF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = interfaceC44921sfz;
    }

    /* JADX INFO: renamed from: getIntegratedSolution-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8711getIntegratedSolutionBWLJW6A$default(C45352soF c45352soF, IntegratedSolutionPageType integratedSolutionPageType, TransactionType transactionType, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            transactionType = null;
        }
        return c45352soF.EZpvd(integratedSolutionPageType, transactionType, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull IntegratedSolutionPageType integratedSolutionPageType, TransactionType transactionType, @NotNull java.lang.String str, @NotNull Continuation<? super Result<IntegratedSolutionPageData>> continuation) {
        SupportIntegratedSolutionUseCase$getIntegratedSolution$1 supportIntegratedSolutionUseCase$getIntegratedSolution$1;
        java.lang.Object objM7377constructorimpl;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        ResponseData responseData;
        if (continuation instanceof SupportIntegratedSolutionUseCase$getIntegratedSolution$1) {
            supportIntegratedSolutionUseCase$getIntegratedSolution$1 = (SupportIntegratedSolutionUseCase$getIntegratedSolution$1) continuation;
            int i = supportIntegratedSolutionUseCase$getIntegratedSolution$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportIntegratedSolutionUseCase$getIntegratedSolution$1.label = i - Integer.MIN_VALUE;
            } else {
                supportIntegratedSolutionUseCase$getIntegratedSolution$1 = new SupportIntegratedSolutionUseCase$getIntegratedSolution$1(this, continuation);
            }
        }
        SupportIntegratedSolutionUseCase$getIntegratedSolution$1 supportIntegratedSolutionUseCase$getIntegratedSolution$12 = supportIntegratedSolutionUseCase$getIntegratedSolution$1;
        java.lang.Object objWithContext = supportIntegratedSolutionUseCase$getIntegratedSolution$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportIntegratedSolutionUseCase$getIntegratedSolution$12.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                    SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1 supportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1 = new SupportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1(this, integratedSolutionPageType, transactionType, str, null);
                    supportIntegratedSolutionUseCase$getIntegratedSolution$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportIntegratedSolutionUseCase$getIntegratedSolution$result$1$1$1, supportIntegratedSolutionUseCase$getIntegratedSolution$12);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                responseData = (ResponseData) objWithContext;
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            objM7377constructorimpl = Result.m7377constructorimpl((IntegratedSolutionResponse) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            objM7377constructorimpl = Result.m7377constructorimpl((IntegratedSolutionResponse) stateListAnimator.AEQbTJ());
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C44852sej.OLrzqt((IntegratedSolutionResponse) objM7377constructorimpl));
            }
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
    }
}
