package o;

import android.graphics.drawable.RotateDrawable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55239xgG extends SwitchCompat implements InterfaceC55066xct {
    public static final int copydefault = 8;
    public final C55240xgH KWHzl;
    public final C55065xcs gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55239xgG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55239xgG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.DCUTEIddSDPG int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.xgG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55239xgG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.DCUTEIddSDPG : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55239xgG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C55240xgH c55240xgH = new C55240xgH(this);
        this.KWHzl = c55240xgH;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.gEmmrt = c55065xcs;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55240xgH, attributeSet, i, 0, 4, null);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        if (c55065xcs.copydefault() == -5) {
            setWidth(c55240xgH.AEQbTJ());
            setHeight(c55240xgH.KWHzl());
        } else {
            setWidth(c55240xgH.OLrzqt());
            setHeight(c55240xgH.EZpvd());
        }
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.SFHvfS);
        if (C55296xhK.OLrzqt(context)) {
            RotateDrawable rotateDrawable = new RotateDrawable();
            rotateDrawable.setDrawable(drawable);
            rotateDrawable.setFromDegrees(0.0f);
            rotateDrawable.setToDegrees(180.0f);
            rotateDrawable.setLevel(10000);
            setBackground(rotateDrawable);
            return;
        }
        setBackground(drawable);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        if (i == -5) {
            setWidth(this.KWHzl.AEQbTJ());
            setHeight(this.KWHzl.KWHzl());
        } else {
            setWidth(this.KWHzl.OLrzqt());
            setHeight(this.KWHzl.EZpvd());
        }
        requestLayout();
    }
}
