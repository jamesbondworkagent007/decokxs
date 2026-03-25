package o;

import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6609aSa {
    public final android.content.Context KWHzl;

    @yCM
    public C6609aSa(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    public final boolean OLrzqt() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.KWHzl) == 0;
    }
}
