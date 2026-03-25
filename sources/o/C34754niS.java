package o;

import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34754niS {
    public static boolean OLrzqt;
    public static final C34754niS AEQbTJ = new C34754niS();
    public static PaymentsReporterProperty.PaymentsReportSource KWHzl = PaymentsReporterProperty.PaymentsReportSource.PAYMENT_ENTRANCE;
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return OLrzqt ? "SimpleFlow" : "DefaultFlow";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull PaymentsReporterProperty.PaymentsReportSource paymentsReportSource) {
        Intrinsics.checkNotNullParameter(paymentsReportSource, "");
        KWHzl = paymentsReportSource;
    }

    private C34754niS() {
    }
}
