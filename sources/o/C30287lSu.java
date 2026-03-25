package o;

import androidx.compose.material3.CalendarModelKt;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30287lSu implements InterfaceC3950Ave {
    public final C30325lUe OLrzqt;

    @yCM
    public C30287lSu(@NotNull C30325lUe c30325lUe) {
        Intrinsics.checkNotNullParameter(c30325lUe, "");
        this.OLrzqt = c30325lUe;
    }

    @Override // o.InterfaceC3950Ave
    public java.lang.String EZpvd(long j) {
        if (android.text.format.DateUtils.isToday(j)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.aKhcqp);
        }
        if (android.text.format.DateUtils.isToday(j - CalendarModelKt.MillisecondsIn24Hours)) {
            return this.OLrzqt.EZpvd(C31351lsQ.Activity.dIjzlO);
        }
        return pTA.formatStandardDate$default(new Date(j), null, 1, null);
    }
}
