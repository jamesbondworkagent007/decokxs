package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wVd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52701wVd extends android.widget.LinearLayout {
    public yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super java.lang.Boolean, Unit> EZpvd;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52701wVd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52701wVd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectedChanged(yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super java.lang.Boolean, Unit> yho) {
        this.EZpvd = yho;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.wVd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52701wVd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52701wVd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
        this.OLrzqt = -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        EZpvd();
    }

    public final void EZpvd() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt instanceof C52702wVe) {
                ((C52702wVe) childAt).setOnClickListener(new View.OnClickListener() { // from class: o.wVc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C52701wVd.AEQbTJ(this.OLrzqt, view);
                    }
                });
            }
        }
    }

    public static final void AEQbTJ(C52701wVd c52701wVd, android.view.View view) {
        c52701wVd.setSelectedId(view.getId(), true);
    }

    public static /* synthetic */ void setSelectedId$default(C52701wVd c52701wVd, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c52701wVd.setSelectedId(i, z);
    }

    public final void setSelectedId(@androidx.annotation.IdRes int i, boolean z) {
        EZpvd(this.OLrzqt, false, z);
        EZpvd(i, true, z);
        this.OLrzqt = i;
    }

    public final void EZpvd(int i, boolean z, boolean z2) {
        yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super java.lang.Boolean, Unit> yho = this.EZpvd;
        if (yho != null) {
            yho.invoke(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
        }
        if (i == -1) {
            return;
        }
        android.view.View viewFindViewById = findViewById(i);
        if (viewFindViewById instanceof C52702wVe) {
            ((C52702wVe) viewFindViewById).setSelected(z);
        }
    }
}
