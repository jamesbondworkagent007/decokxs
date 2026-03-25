package o;

import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8142axE extends MX {
    public TimeZone giSNqX;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeZone AEQbTJ() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "");
        this.giSNqX = timeZone;
    }

    public C8142axE(int i) {
        super(i);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "");
        this.giSNqX = timeZone;
    }
}
