package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37738ozW extends C35694oAf {
    public android.graphics.drawable.Drawable EZpvd;
    public java.lang.CharSequence KWHzl;
    public final java.lang.CharSequence OLrzqt;
    public final java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37738ozW(@NotNull java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.graphics.drawable.Drawable drawable, @NotNull java.lang.CharSequence charSequence3) {
        super(charSequence, false, charSequence3, 2, null);
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        this.copydefault = charSequence;
        this.KWHzl = charSequence2;
        this.EZpvd = drawable;
        this.OLrzqt = charSequence3;
    }
}
