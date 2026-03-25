package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vSK extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function0<Unit> KWHzl;
    public Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public uNH copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vSK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vSK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnInfoClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnToggleListener(Function1<? super java.lang.Boolean, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.vSK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vSK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vSK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
        OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final void copydefault() {
        uNH unhEZpvd = uNH.EZpvd(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = unhEZpvd;
        if (unhEZpvd != null) {
            unhEZpvd.KWHzl.setOKDSSize(-5);
            unhEZpvd.EZpvd.setHelperLabelType(1);
        }
        setLabel(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE));
    }

    private final void OLrzqt() {
        uNH unh = this.copydefault;
        if (unh != null) {
            C55258xgZ c55258xgZ = unh.EZpvd;
            c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
            unh.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vSL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    vSK.copydefault(this.copydefault, compoundButton, z);
                }
            });
        }
    }

    public static final void copydefault(vSK vsk, android.widget.CompoundButton compoundButton, boolean z) {
        pUU.EZpvd("SpotGridReinvestProfitsToggleView", "Toggle changed: " + z);
        Function1<? super java.lang.Boolean, Unit> function1 = vsk.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public final void setLabel(@NotNull java.lang.String str) {
        C55258xgZ c55258xgZ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        uNH unh = this.copydefault;
        if (unh == null || (c55258xgZ = unh.EZpvd) == null || (c55312xhaValueOf = c55258xgZ.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(str);
    }

    public final void setHelperLabelType(int i) {
        C55258xgZ c55258xgZ;
        uNH unh = this.copydefault;
        if (unh != null && (c55258xgZ = unh.EZpvd) != null) {
            c55258xgZ.setHelperLabelType(i);
        }
        OLrzqt();
    }

    public final void setToggleState(boolean z) {
        uNH unh = this.copydefault;
        if (unh != null) {
            unh.KWHzl.setChecked(z);
        }
    }

    public final java.lang.Boolean KWHzl() {
        C55239xgG c55239xgG;
        uNH unh = this.copydefault;
        if (unh == null || (c55239xgG = unh.KWHzl) == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(c55239xgG.isChecked());
    }

    public final void setEnable(boolean z) {
        uNH unh = this.copydefault;
        if (unh != null) {
            unh.KWHzl.setEnabled(z);
        }
    }

    public final void AEQbTJ() {
        this.OLrzqt = null;
        this.KWHzl = null;
        uNH unh = this.copydefault;
        if (unh != null) {
            unh.KWHzl.setChecked(false);
        }
    }

    public final void EZpvd() {
        pUU.EZpvd("SpotGridReinvestProfitsToggleView", "Releasing resources");
        this.OLrzqt = null;
        this.KWHzl = null;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vSK KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vSK vsk) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = vsk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                pUU.EZpvd("SpotGridReinvestProfitsToggleView", "Info clicked");
                Function0 function0 = this.KWHzl.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
