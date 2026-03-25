package o;

import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52581wQs {
    public static /* synthetic */ Triple genContent$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.UCQKYV);
        }
        return EZpvd(str, str2, i);
    }

    public static final Triple<java.lang.String, java.lang.String, java.lang.Integer> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Triple<>(str, str2, java.lang.Integer.valueOf(i));
    }
}
