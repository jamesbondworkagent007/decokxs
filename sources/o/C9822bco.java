package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9822bco extends C9785bcD {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9822bco(boolean z, @NotNull java.lang.String str) {
        super(z, true);
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }
}
