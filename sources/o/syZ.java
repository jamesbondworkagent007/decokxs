package o;

import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class syZ extends android.widget.LinearLayout {
    public Function1<? super java.lang.Integer, Unit> AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.List<android.widget.ToggleButton> copydefault;
    public final AbstractC47526trk valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syZ(@NotNull android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public syZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnScoreClickListener(Function1<? super java.lang.Integer, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int, int):void (m)] (LINE:13) call: o.syZ.<init>(android.content.Context, android.util.AttributeSet, int, int):void type: THIS */
    public /* synthetic */ syZ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syZ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = yDY.gEmmrt(C33070mpX.AYXKKw(C47315tni.PendingIntent.OqFWZa), C33070mpX.AYXKKw(C47315tni.PendingIntent.QKudOq), C33070mpX.AYXKKw(C47315tni.PendingIntent.accept), C33070mpX.AYXKKw(C47315tni.PendingIntent.RlQdEF), C33070mpX.AYXKKw(C47315tni.PendingIntent.DAIeex), C33070mpX.AYXKKw(C47315tni.PendingIntent.AxsJAYsNCnLh), C33070mpX.AYXKKw(C47315tni.PendingIntent.DCJXGO));
        AbstractC47526trk abstractC47526trkCopydefault = AbstractC47526trk.copydefault(android.view.LayoutInflater.from(context), this, true);
        this.valueOf = abstractC47526trkCopydefault;
        this.copydefault = yDY.gEmmrt(abstractC47526trkCopydefault.KWHzl, abstractC47526trkCopydefault.AEQbTJ, abstractC47526trkCopydefault.OLrzqt, abstractC47526trkCopydefault.djBIcL, abstractC47526trkCopydefault.gEmmrt, abstractC47526trkCopydefault.AhwBna, abstractC47526trkCopydefault.valueOf);
        this.KWHzl = abstractC47526trkCopydefault.DbNXlk;
        this.EZpvd = abstractC47526trkCopydefault.AYXKKw;
        this.AhwBna = abstractC47526trkCopydefault.fetchVPNInfo;
        setupButtons();
        EZpvd();
    }

    public static final void setupButtons$lambda$3$lambda$2(syZ syz, int i, android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            java.util.Iterator<T> it = syz.copydefault.iterator();
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                android.widget.ToggleButton toggleButton = syz.copydefault.get(i2);
                if (i2 > i) {
                    z2 = false;
                }
                toggleButton.setChecked(z2);
                i2++;
            }
            syz.KWHzl.setText(syz.OLrzqt.get(i));
            syz.KWHzl.setVisibility(0);
            Function1<? super java.lang.Integer, Unit> function1 = syz.AEQbTJ;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(i + 1));
            }
            syz.EZpvd();
        }
    }

    public final void setupButtons() {
        final int i;
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((android.widget.ToggleButton) it.next()).setChecked(false);
            }
        }
        for (java.lang.Object obj : this.copydefault) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((android.widget.ToggleButton) obj).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.sze
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    syZ.setupButtons$lambda$3$lambda$2(this.EZpvd, i, compoundButton, z);
                }
            });
            i++;
        }
    }

    public final void EZpvd() {
        java.util.List<android.widget.ToggleButton> list = this.copydefault;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((android.widget.ToggleButton) it.next()).isChecked()) {
                    this.EZpvd.setVisibility(8);
                    this.AhwBna.setVisibility(8);
                    this.KWHzl.setVisibility(0);
                    return;
                }
            }
        }
        this.EZpvd.setVisibility(0);
        this.AhwBna.setVisibility(0);
        this.KWHzl.setVisibility(8);
    }
}
