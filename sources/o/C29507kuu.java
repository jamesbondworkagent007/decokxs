package o;

import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewKLineUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29507kuu {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC29466kuF OLrzqt;

    @yCM
    public C29507kuu(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC29466kuF;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TimeIntervalSelector timeIntervalSelector, long j, @NotNull Continuation<? super Result<SignalOverviewKLineUiModel>> continuation) throws java.lang.Throwable {
        GetSignalOverviewKLineUseCase$invoke$1 getSignalOverviewKLineUseCase$invoke$1;
        if (continuation instanceof GetSignalOverviewKLineUseCase$invoke$1) {
            getSignalOverviewKLineUseCase$invoke$1 = (GetSignalOverviewKLineUseCase$invoke$1) continuation;
            int i = getSignalOverviewKLineUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalOverviewKLineUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalOverviewKLineUseCase$invoke$1 = new GetSignalOverviewKLineUseCase$invoke$1(this, continuation);
            }
        }
        GetSignalOverviewKLineUseCase$invoke$1 getSignalOverviewKLineUseCase$invoke$12 = getSignalOverviewKLineUseCase$invoke$1;
        java.lang.Object objWithContext = getSignalOverviewKLineUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalOverviewKLineUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 getSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new GetSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, j, this, timeIntervalSelector, str, str2);
            getSignalOverviewKLineUseCase$invoke$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalOverviewKLineUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, getSignalOverviewKLineUseCase$invoke$12);
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

    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8675invokeyxL6bBk$default(C29507kuu c29507kuu, java.lang.String str, java.lang.String str2, TimeIntervalSelector timeIntervalSelector, long j, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            j = java.lang.System.currentTimeMillis();
        }
        return c29507kuu.AEQbTJ(str, str2, timeIntervalSelector, j, continuation);
    }
}
