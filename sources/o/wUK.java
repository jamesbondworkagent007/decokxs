package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.wUO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUK extends ConstraintLayout {
    public uRJ AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:15) call: o.wUK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uRJ urjAEQbTJ = uRJ.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        this.AEQbTJ = urjAEQbTJ;
        if (urjAEQbTJ == null || (c55312xhaValueOf = urjAEQbTJ.valueOf.valueOf()) == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
    }

    public final void setHeaderTitle(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        uRJ urj = this.AEQbTJ;
        if (urj != null) {
            urj.valueOf.setTextValue(str);
            C55258xgZ c55258xgZ = urj.valueOf;
            c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, function0));
        }
    }

    public final void setBaseCcyDisplay(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        uRJ urj = this.AEQbTJ;
        if (urj != null) {
            C55312xha c55312xhaValueOf = urj.OLrzqt.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setText(str);
            }
            urj.KWHzl.setText(str2);
        }
    }

    public final void setQuoteCcyDisplay(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        uRJ urj = this.AEQbTJ;
        if (urj != null) {
            C55312xha c55312xhaValueOf = urj.fetchVPNInfo.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setText(str);
            }
            urj.isConnected.setText(str2);
        }
    }

    public static /* synthetic */ void setChartData$default(wUK wuk, wUO.TaskDescription taskDescription, wUO.TaskDescription taskDescription2, boolean z, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 4) != 0) {
            z = true;
        }
        wuk.setChartData(taskDescription, taskDescription2, z);
    }

    public final void setChartData(@NotNull wUO.TaskDescription taskDescription, @NotNull wUO.TaskDescription taskDescription2, boolean z) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        final uRJ urj = this.AEQbTJ;
        if (urj != null) {
            urj.gEmmrt.AEQbTJ(yDY.gEmmrt(taskDescription, taskDescription2), z, 0);
            android.widget.ImageView imageView = urj.copydefault;
            java.lang.Integer numOLrzqt = taskDescription.OLrzqt();
            imageView.setImageTintList(android.content.res.ColorStateList.valueOf(numOLrzqt != null ? numOLrzqt.intValue() : 0));
            android.widget.ImageView imageView2 = urj.DbNXlk;
            java.lang.Integer numOLrzqt2 = taskDescription2.OLrzqt();
            imageView2.setImageTintList(android.content.res.ColorStateList.valueOf(numOLrzqt2 != null ? numOLrzqt2.intValue() : 0));
            urj.EZpvd.setText(taskDescription.copydefault() + " " + uLP.AEQbTJ(taskDescription.EZpvd()));
            urj.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wUI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) throws java.io.IOException {
                    wUK.setChartData$lambda$9$lambda$6(urj, view);
                }
            });
            urj.values.setText(taskDescription2.copydefault() + " " + uLP.AEQbTJ(taskDescription2.EZpvd()));
            urj.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.wUN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) throws java.io.IOException {
                    wUK.setChartData$lambda$9$lambda$8(urj, view);
                }
            });
        }
    }

    public static final void setChartData$lambda$9$lambda$6(uRJ urj, android.view.View view) throws java.io.IOException {
        urj.gEmmrt.copydefault(0);
    }

    public static final void setChartData$lambda$9$lambda$8(uRJ urj, android.view.View view) throws java.io.IOException {
        urj.gEmmrt.copydefault(1);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
