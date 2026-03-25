package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.qAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39864qAp extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public InterfaceC39865qAq AEQbTJ;
    public C42713rbc OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39864qAp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39864qAp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39865qAq KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC39865qAq interfaceC39865qAq) {
        this.AEQbTJ = interfaceC39865qAq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.qAp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39864qAp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39864qAp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42713rbc c42713rbcEZpvd = C42713rbc.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42713rbcEZpvd, "");
        this.OLrzqt = c42713rbcEZpvd;
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
        C42713rbc c42713rbc = this.OLrzqt;
        c42713rbc.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.qAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.valueOf(this.AEQbTJ, view);
            }
        });
        c42713rbc.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.qAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.AhwBna(this.EZpvd, view);
            }
        });
        c42713rbc.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.qAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.AYXKKw(this.OLrzqt, view);
            }
        });
        c42713rbc.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.qAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.djBIcL(this.AEQbTJ, view);
            }
        });
        c42713rbc.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.qAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.AkhnZx(this.EZpvd, view);
            }
        });
        c42713rbc.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.qAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39864qAp.fetchVPNInfo(this.KWHzl, view);
            }
        });
        AppCompatTextView appCompatTextView = c42713rbc.AEQbTJ;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.qAp$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qAp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final void valueOf(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd(Marker.ANY_NON_NULL_MARKER);
        }
    }

    public static final void AhwBna(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd("-");
        }
    }

    public static final void AYXKKw(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd("×");
        }
    }

    public static final void djBIcL(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd("÷");
        }
    }

    public static final void AkhnZx(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd("(");
        }
    }

    public static final void fetchVPNInfo(C39864qAp c39864qAp, android.view.View view) {
        InterfaceC39865qAq interfaceC39865qAq = c39864qAp.AEQbTJ;
        if (interfaceC39865qAq != null) {
            interfaceC39865qAq.EZpvd(")");
        }
    }

    public final android.view.View AEQbTJ() {
        ConstraintLayout constraintLayout = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    /* JADX INFO: renamed from: o.qAp$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C39864qAp KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C39864qAp c39864qAp) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c39864qAp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC39865qAq interfaceC39865qAqKWHzl = this.KWHzl.KWHzl();
                if (interfaceC39865qAqKWHzl != null) {
                    interfaceC39865qAqKWHzl.AEQbTJ();
                }
            }
        }
    }
}
