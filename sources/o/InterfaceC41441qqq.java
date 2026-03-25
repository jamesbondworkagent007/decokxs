package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41441qqq {
    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull PeriodEnum periodEnum, @NotNull Continuation<? super Flow<? extends java.util.List<PeriodTickersPo>>> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull PeriodEnum periodEnum, @NotNull Continuation<? super Flow<? extends java.util.List<PeriodTickersPo>>> continuation);
}
