package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.wXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52776wXy {
    public android.graphics.drawable.Drawable AEQbTJ;
    public java.lang.CharSequence EZpvd;
    public java.lang.CharSequence KWHzl;
    public java.lang.CharSequence OLrzqt;
    public Function1<? super android.widget.ImageView, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52776wXy() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.graphics.drawable.Drawable EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit>, kotlin.jvm.functions.Function1<android.widget.ImageView, kotlin.Unit> */
    public final Function1<android.widget.ImageView, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.OLrzqt;
    }

    public C52776wXy(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.drawable.Drawable drawable, Function1<? super android.widget.ImageView, Unit> function1) {
        this.EZpvd = charSequence;
        this.OLrzqt = charSequence2;
        this.KWHzl = charSequence3;
        this.AEQbTJ = drawable;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r5v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r6v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r7v0 java.lang.CharSequence))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r8v0 android.graphics.drawable.Drawable))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r9v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit>):void (m)] (LINE:11) call: o.wXy.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.graphics.drawable.Drawable, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C52776wXy(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, android.graphics.drawable.Drawable drawable, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? null : charSequence2, (i & 4) != 0 ? null : charSequence3, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? null : function1);
    }
}
