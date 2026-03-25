package o;

import com.okinc.share.api.params.IShareParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48903ueU {
    public static final void copydefault(@NotNull IShareParams iShareParams, boolean z) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        iShareParams.getExtras().putBoolean(IShareParams.EXTRA_ENABLE_TOAST, z);
    }

    public static final void AEQbTJ(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        copydefault(iShareParams, false);
    }

    public static final boolean EZpvd(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        return iShareParams.getExtras().getBoolean(IShareParams.EXTRA_ENABLE_TOAST, true);
    }
}
