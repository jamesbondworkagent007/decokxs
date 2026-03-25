package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C35694oAf {
    public final java.lang.CharSequence DbNXlk;
    public final java.lang.CharSequence isConnected;
    public final boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.CharSequence OLrzqt() {
        return this.isConnected;
    }

    public C35694oAf(@NotNull java.lang.CharSequence charSequence, boolean z, @NotNull java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        this.isConnected = charSequence;
        this.values = z;
        this.DbNXlk = charSequence2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.CharSequence)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 java.lang.CharSequence)
 A[MD:(java.lang.CharSequence, boolean, java.lang.CharSequence):void (m)] (LINE:13) call: o.oAf.<init>(java.lang.CharSequence, boolean, java.lang.CharSequence):void type: THIS */
    public /* synthetic */ C35694oAf(java.lang.CharSequence charSequence, boolean z, java.lang.CharSequence charSequence2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? true : z, charSequence2);
    }
}
