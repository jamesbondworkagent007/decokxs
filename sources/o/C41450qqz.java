package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC40404qUp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41450qqz implements InterfaceC41441qqq {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qqy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41450qqz.AEQbTJ();
        }
    });

    @yCM
    public C41450qqz() {
    }

    /* JADX INFO: renamed from: o.qqz$Activity */
    public static final class Activity implements InterfaceC40404qUp {
        public Flow<java.util.List<PeriodTickersPo>> AEQbTJ(java.lang.String str, PeriodEnum periodEnum) {
            return InterfaceC40404qUp.TaskDescription.EZpvd(this, str, periodEnum);
        }

        public Flow<java.util.List<PeriodTickersPo>> copydefault(java.util.List<java.lang.String> list, PeriodEnum periodEnum) {
            return InterfaceC40404qUp.TaskDescription.AEQbTJ(this, list, periodEnum);
        }
    }

    public final Activity KWHzl() {
        return (Activity) this.KWHzl.getValue();
    }

    public static final Activity AEQbTJ() {
        return new Activity();
    }

    @Override // o.InterfaceC41441qqq
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull PeriodEnum periodEnum, @NotNull Continuation<? super Flow<? extends java.util.List<PeriodTickersPo>>> continuation) {
        return KWHzl().AEQbTJ(str, periodEnum);
    }

    @Override // o.InterfaceC41441qqq
    public java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull PeriodEnum periodEnum, @NotNull Continuation<? super Flow<? extends java.util.List<PeriodTickersPo>>> continuation) {
        return KWHzl().copydefault(list, periodEnum);
    }
}
