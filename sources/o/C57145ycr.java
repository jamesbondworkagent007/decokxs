package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57145ycr {
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0) {
            if (C59449zhJ.startsWith$default(str, "MI", false, 2, null)) {
                return "mini";
            }
            if (C59449zhJ.startsWith$default(str, ExifInterface.GPS_DIRECTION_TRUE, false, 2, null)) {
                return "touch";
            }
        }
        return "classic";
    }
}
