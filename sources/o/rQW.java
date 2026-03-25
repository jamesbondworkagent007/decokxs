package o;

import com.okinc.ok_kyc_core.presentation.views.Illustrations;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rQW {
    public static final java.lang.Integer EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null) {
            return null;
        }
        for (Illustrations illustrations : Illustrations.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) illustrations.getNameValue(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) illustrations.getType(), (java.lang.Object) str2)) {
                return java.lang.Integer.valueOf(illustrations.getImageId());
            }
        }
        return null;
    }
}
