package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C37740ozY extends C35694oAf {
    public final java.lang.CharSequence EZpvd;
    public final java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37740ozY(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        super(charSequence, false, charSequence2, 2, null);
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.copydefault = charSequence;
        this.EZpvd = charSequence2;
    }
}
