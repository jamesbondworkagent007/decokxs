package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C37739ozX extends C35694oAf {
    public android.graphics.drawable.Drawable AYXKKw;
    public final java.lang.CharSequence AhwBna;
    public final android.graphics.drawable.Drawable djBIcL;
    public final java.lang.CharSequence gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 java.lang.CharSequence)
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r9v0 android.graphics.drawable.Drawable))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r11v0 android.graphics.drawable.Drawable))
  (r12v0 java.lang.CharSequence)
 A[MD:(java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.String, android.graphics.drawable.Drawable, java.lang.CharSequence):void (m)] (LINE:53) call: o.ozX.<init>(java.lang.CharSequence, android.graphics.drawable.Drawable, java.lang.String, android.graphics.drawable.Drawable, java.lang.CharSequence):void type: THIS */
    public /* synthetic */ C37739ozX(java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.String str, android.graphics.drawable.Drawable drawable2, java.lang.CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? null : drawable, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : drawable2, charSequence2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37739ozX(@NotNull java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, java.lang.String str, android.graphics.drawable.Drawable drawable2, @NotNull java.lang.CharSequence charSequence2) {
        super(charSequence, false, charSequence2, 2, null);
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.AhwBna = charSequence;
        this.AYXKKw = drawable;
        this.valueOf = str;
        this.djBIcL = drawable2;
        this.gEmmrt = charSequence2;
    }
}
