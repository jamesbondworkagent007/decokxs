package o;

import android.icu.text.TimeZoneFormat;
import android.icu.util.TimeZone;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aXC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6848aXC {
    public static final C6848aXC EZpvd = new C6848aXC();

    private C6848aXC() {
    }

    public final java.lang.String EZpvd() {
        java.lang.String str = TimeZoneFormat.getInstance(java.util.Locale.getDefault()).format(TimeZoneFormat.Style.ISO_EXTENDED_LOCAL_FIXED, TimeZone.getDefault(), new Date().getTime());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
