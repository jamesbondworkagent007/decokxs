package o;

import com.okinc.im.usecase.group.join.SubmitJoinRequestUseCase$invoke$1;
import com.okinc.im.usecase.group.join.SubmitJoinRequestUseCase$invoke$result$1$1;
import com.okinc.okimcore.model.remote.GroupJoinApplicationRequest;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.sOA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDN {
    public final CoroutineDispatcher KWHzl;
    public final sIR OLrzqt;
    public final Regex copydefault;

    @yCM
    public oDN(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sir;
        this.KWHzl = coroutineDispatcher;
        this.copydefault = new Regex("\\s+");
    }

    public static /* synthetic */ java.lang.Object invoke$default(oDN odn, java.lang.String str, long j, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return odn.OLrzqt(str, j, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, java.lang.String str2, @NotNull Continuation<? super sOA> continuation) throws java.lang.Throwable {
        SubmitJoinRequestUseCase$invoke$1 submitJoinRequestUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof SubmitJoinRequestUseCase$invoke$1) {
            submitJoinRequestUseCase$invoke$1 = (SubmitJoinRequestUseCase$invoke$1) continuation;
            int i = submitJoinRequestUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                submitJoinRequestUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                submitJoinRequestUseCase$invoke$1 = new SubmitJoinRequestUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = submitJoinRequestUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = submitJoinRequestUseCase$invoke$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (str2 != null) {
                java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) this.copydefault.replace(str2, " ")).toString();
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                    string = null;
                }
                GroupJoinApplicationRequest groupJoinApplicationRequest = new GroupJoinApplicationRequest(str, j, string);
                Result.Application application2 = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                SubmitJoinRequestUseCase$invoke$result$1$1 submitJoinRequestUseCase$invoke$result$1$1 = new SubmitJoinRequestUseCase$invoke$result$1$1(this, groupJoinApplicationRequest, null);
                submitJoinRequestUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, submitJoinRequestUseCase$invoke$result$1$1, submitJoinRequestUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                objM7377constructorimpl = new sOA.Activity(-1, thM7380exceptionOrNullimpl);
            }
            return (sOA) objM7377constructorimpl;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objWithContext);
        objM7377constructorimpl = Result.m7377constructorimpl((sOA) objWithContext);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return (sOA) objM7377constructorimpl;
    }
}
