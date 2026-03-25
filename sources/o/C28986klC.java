package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$getSearchAlert$1;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$getTokenOverview$1;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$getTokenOverview0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$getTransactionDataByHour$1;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$getTransactionDataByHourBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.overview.domain.OverviewUseCase$saveSearchAlert$1;
import com.okinc.business.market.features.overview.domain.TransactionStatistic;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28986klC {
    public final CoroutineDispatcher AEQbTJ;
    public final C27670jza KWHzl;
    public final InterfaceC29035klz copydefault;

    @yCM
    public C28986klC(@NotNull InterfaceC29035klz interfaceC29035klz, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C27670jza c27670jza) {
        Intrinsics.checkNotNullParameter(interfaceC29035klz, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        this.copydefault = interfaceC29035klz;
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c27670jza;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull FilterTimeDuration filterTimeDuration, @NotNull Continuation<? super Result<TransactionStatistic>> continuation) {
        OverviewUseCase$getTransactionDataByHour$1 overviewUseCase$getTransactionDataByHour$1;
        if (continuation instanceof OverviewUseCase$getTransactionDataByHour$1) {
            overviewUseCase$getTransactionDataByHour$1 = (OverviewUseCase$getTransactionDataByHour$1) continuation;
            int i = overviewUseCase$getTransactionDataByHour$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overviewUseCase$getTransactionDataByHour$1.label = i - Integer.MIN_VALUE;
            } else {
                overviewUseCase$getTransactionDataByHour$1 = new OverviewUseCase$getTransactionDataByHour$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = overviewUseCase$getTransactionDataByHour$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = overviewUseCase$getTransactionDataByHour$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            OverviewUseCase$getTransactionDataByHourBWLJW6A$$inlined$dexRunCatching$1 overviewUseCase$getTransactionDataByHourBWLJW6A$$inlined$dexRunCatching$1 = new OverviewUseCase$getTransactionDataByHourBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, filterTimeDuration);
            overviewUseCase$getTransactionDataByHour$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, overviewUseCase$getTransactionDataByHourBWLJW6A$$inlined$dexRunCatching$1, overviewUseCase$getTransactionDataByHour$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<Overview>> continuation) {
        OverviewUseCase$getTokenOverview$1 overviewUseCase$getTokenOverview$1;
        if (continuation instanceof OverviewUseCase$getTokenOverview$1) {
            overviewUseCase$getTokenOverview$1 = (OverviewUseCase$getTokenOverview$1) continuation;
            int i = overviewUseCase$getTokenOverview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overviewUseCase$getTokenOverview$1.label = i - Integer.MIN_VALUE;
            } else {
                overviewUseCase$getTokenOverview$1 = new OverviewUseCase$getTokenOverview$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = overviewUseCase$getTokenOverview$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = overviewUseCase$getTokenOverview$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            OverviewUseCase$getTokenOverview0E7RQCE$$inlined$dexRunCatching$1 overviewUseCase$getTokenOverview0E7RQCE$$inlined$dexRunCatching$1 = new OverviewUseCase$getTokenOverview0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            overviewUseCase$getTokenOverview$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, overviewUseCase$getTokenOverview0E7RQCE$$inlined$dexRunCatching$1, overviewUseCase$getTokenOverview$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OverviewUseCase$saveSearchAlert$1 overviewUseCase$saveSearchAlert$1;
        if (continuation instanceof OverviewUseCase$saveSearchAlert$1) {
            overviewUseCase$saveSearchAlert$1 = (OverviewUseCase$saveSearchAlert$1) continuation;
            int i = overviewUseCase$saveSearchAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overviewUseCase$saveSearchAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                overviewUseCase$saveSearchAlert$1 = new OverviewUseCase$saveSearchAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = overviewUseCase$saveSearchAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = overviewUseCase$saveSearchAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27670jza c27670jza = this.KWHzl;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
            overviewUseCase$saveSearchAlert$1.label = 1;
            if (c27670jza.EZpvd("dex_search_alert", kSerializerSerializer, boolKWHzl, overviewUseCase$saveSearchAlert$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        OverviewUseCase$getSearchAlert$1 overviewUseCase$getSearchAlert$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof OverviewUseCase$getSearchAlert$1) {
            overviewUseCase$getSearchAlert$1 = (OverviewUseCase$getSearchAlert$1) continuation;
            int i = overviewUseCase$getSearchAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overviewUseCase$getSearchAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                overviewUseCase$getSearchAlert$1 = new OverviewUseCase$getSearchAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = overviewUseCase$getSearchAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = overviewUseCase$getSearchAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27670jza c27670jza = this.KWHzl;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            overviewUseCase$getSearchAlert$1.label = 1;
            objAEQbTJ = c27670jza.AEQbTJ("dex_search_alert", kSerializerSerializer, overviewUseCase$getSearchAlert$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) objAEQbTJ;
        return C56443yFo.KWHzl(bool != null ? bool.booleanValue() : true);
    }
}
