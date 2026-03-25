package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57490yjR {
    public static final java.lang.CharSequence AEQbTJ(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() <= i) {
            return charSequence;
        }
        return charSequence.subSequence(0, i).toString() + "…";
    }
}
