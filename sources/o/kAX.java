package o;

import com.okinc.business.market.data.model.VibesChartData;
import com.okinc.business.market.features.vibes.repo.VibesChartRepositoryImpl$getChartInfo$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAX implements kAQ {
    public final InterfaceC23231huN OLrzqt;

    public kAX(@NotNull InterfaceC23231huN interfaceC23231huN) {
        Intrinsics.checkNotNullParameter(interfaceC23231huN, "");
        this.OLrzqt = interfaceC23231huN;
    }

    @Override // o.kAQ
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<VibesChartData, OKServerException>> continuation) {
        return kAB.EZpvd(new VibesChartRepositoryImpl$getChartInfo$2(this, str, str2, str3, null), continuation);
    }
}
