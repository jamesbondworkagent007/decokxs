package o;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33604mzb extends AbstractC57946yrx implements InterfaceC57927yre {
    public C31700mAr AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33604mzb() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33604mzb(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33604mzb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentView(@NotNull C31700mAr c31700mAr) {
        Intrinsics.checkNotNullParameter(c31700mAr, "");
        this.AEQbTJ = c31700mAr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:android.content.Context:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null android.content.Context) : (r2v0 android.content.Context))
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:13) call: o.mzb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C33604mzb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public C33604mzb(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        copydefault(context);
    }

    public final C31700mAr AEQbTJ() {
        C31700mAr c31700mAr = this.AEQbTJ;
        if (c31700mAr != null) {
            return c31700mAr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final void copydefault(android.content.Context context) {
        C31700mAr c31700mAr = new C31700mAr(context, null, 0, 6, null);
        c31700mAr.setVisiable();
        setCurrentView(c31700mAr);
        AEQbTJ().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        addView(AEQbTJ());
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void KWHzl(@NotNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        if (!this.KWHzl) {
            AEQbTJ().copydefault();
        } else {
            AEQbTJ().AEQbTJ(true);
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        AEQbTJ().AEQbTJ(this.KWHzl);
        return super.EZpvd(interfaceC57934yrl, z);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57927yre
    public boolean AEQbTJ(boolean z) {
        AEQbTJ().AEQbTJ(z);
        this.KWHzl = z;
        return true;
    }
}
