package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C37741ozZ extends C35694oAf {
    public android.content.res.ColorStateList AEQbTJ;
    public final java.lang.CharSequence EZpvd;
    public final java.lang.CharSequence KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C35694oAf
    public java.lang.CharSequence OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 java.lang.CharSequence)
  (r2v0 java.lang.CharSequence)
  (wrap:android.content.res.ColorStateList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:android.content.res.ColorStateList:0x000a: INVOKE 
  (wrap:int:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.DQzvGN int) STATIC call: o.mpX.copydefault(int):int A[MD:(int):int (m), WRAPPED] (LINE:36))
 STATIC call: android.content.res.ColorStateList.valueOf(int):android.content.res.ColorStateList A[MD:(int):android.content.res.ColorStateList (c), WRAPPED] (LINE:35)) : (r3v0 android.content.res.ColorStateList))
 A[MD:(java.lang.CharSequence, java.lang.CharSequence, android.content.res.ColorStateList):void (m)] (LINE:32) call: o.ozZ.<init>(java.lang.CharSequence, java.lang.CharSequence, android.content.res.ColorStateList):void type: THIS */
    public /* synthetic */ C37741ozZ(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, android.content.res.ColorStateList colorStateList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, charSequence2, (i & 4) != 0 ? android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)) : colorStateList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37741ozZ(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull android.content.res.ColorStateList colorStateList) {
        super(charSequence, false, charSequence2, 2, null);
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(colorStateList, "");
        this.KWHzl = charSequence;
        this.EZpvd = charSequence2;
        this.AEQbTJ = colorStateList;
    }
}
