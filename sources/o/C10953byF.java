package o;

import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.byF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10953byF {
    public static final C10953byF KWHzl = new C10953byF();

    private C10953byF() {
    }

    public final java.lang.String AEQbTJ(long j) {
        return "coin&" + j;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "defi&" + str + ContainerUtils.FIELD_DELIMITER + str2;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return "nft&" + str + ContainerUtils.FIELD_DELIMITER + str2 + ContainerUtils.FIELD_DELIMITER + str3;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.startsWith$default(str, "coin", false, 2, null)) {
            return "coin";
        }
        if (C59449zhJ.startsWith$default(str, "defi", false, 2, null)) {
            return "defi";
        }
        return C59449zhJ.startsWith$default(str, "nft", false, 2, null) ? "nft" : "";
    }

    public final long EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null)));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.size() < 3 ? "" : (java.lang.String) listSplit$default.get(2);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "coin", false, 2, null) ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null).size() == 2 : C59449zhJ.startsWith$default(str, "defi", false, 2, null) ? StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null).size() >= 3 : C59449zhJ.startsWith$default(str, "nft", false, 2, null) && StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null).size() >= 3;
    }
}
