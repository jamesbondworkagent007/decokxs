package o;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26628jfs extends AbstractC27470jvm {
    public C26628jfs(@NotNull Function2<? super java.lang.Long, ? super TokenInvestDetail, Unit> function2, @NotNull Function2<? super java.lang.Long, ? super java.lang.Long, Unit> function22, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function0, "");
        register(C26587jfD.class, new C26626jfq());
        register(C26589jfF.class, new C26624jfo(function2, function22));
        register(C26625jfp.class, new C26627jfr(function0));
    }
}
