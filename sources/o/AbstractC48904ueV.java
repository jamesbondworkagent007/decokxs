package o;

import com.okinc.share.api.edit.EditMenuType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48904ueV extends AbstractC48896ueN implements android.widget.Checkable {
    public boolean EZpvd;
    public final EditMenuType KWHzl;
    public java.lang.CharSequence djBIcL;
    public android.graphics.drawable.Drawable gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48901ueS
    public java.lang.CharSequence OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48901ueS
    public java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.EZpvd = z;
    }

    public AbstractC48904ueV(@NotNull java.lang.String str, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = charSequence;
        this.gEmmrt = drawable;
        this.EZpvd = z;
        this.valueOf = str;
        this.KWHzl = EditMenuType.CHECKABLE;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r3v0 java.lang.CharSequence))
  (wrap:android.graphics.drawable.Drawable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.drawable.Drawable) : (r4v0 android.graphics.drawable.Drawable))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.CharSequence, android.graphics.drawable.Drawable, boolean):void (m)] (LINE:13) call: o.ueV.<init>(java.lang.String, java.lang.CharSequence, android.graphics.drawable.Drawable, boolean):void type: THIS */
    public /* synthetic */ AbstractC48904ueV(java.lang.String str, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : drawable, (i & 8) != 0 ? false : z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
