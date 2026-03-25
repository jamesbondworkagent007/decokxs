package o;

import com.okinc.im.usecase.group.GetTrendingGroupsUseCase$invoke$1;
import com.okinc.im.usecase.group.GetTrendingGroupsUseCase$invoke$2;
import com.okinc.okimcore.model.remote.GroupRecommendations;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35775oDf {
    public final CoroutineDispatcher AEQbTJ;
    public final sIR EZpvd;

    @yCM
    public C35775oDf(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = sir;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8701invoke0E7RQCE$default(C35775oDf c35775oDf, java.lang.Boolean bool, java.lang.Integer num, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c35775oDf.OLrzqt(bool, num, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.Boolean bool, java.lang.Integer num, @NotNull Continuation<? super Result<? extends java.util.List<GroupRecommendations>>> continuation) throws java.lang.Throwable {
        GetTrendingGroupsUseCase$invoke$1 getTrendingGroupsUseCase$invoke$1;
        if (continuation instanceof GetTrendingGroupsUseCase$invoke$1) {
            getTrendingGroupsUseCase$invoke$1 = (GetTrendingGroupsUseCase$invoke$1) continuation;
            int i = getTrendingGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTrendingGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getTrendingGroupsUseCase$invoke$1 = new GetTrendingGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getTrendingGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTrendingGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetTrendingGroupsUseCase$invoke$2 getTrendingGroupsUseCase$invoke$2 = new GetTrendingGroupsUseCase$invoke$2(this, bool, num, null);
            getTrendingGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getTrendingGroupsUseCase$invoke$2, getTrendingGroupsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
