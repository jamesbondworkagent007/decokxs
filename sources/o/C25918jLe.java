package o;

import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25918jLe extends wXX {
    public C42785rcv AEQbTJ;
    public final Function1<java.lang.Boolean, Unit> EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25918jLe() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(boolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:21) call: o.jLe.<init>(boolean, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C25918jLe(boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25918jLe(boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        this.OLrzqt = z;
        this.EZpvd = function1;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42785rcv c42785rcvAEQbTJ = C42785rcv.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        this.AEQbTJ = c42785rcvAEQbTJ;
        C42785rcv c42785rcv = null;
        if (c42785rcvAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c42785rcvAEQbTJ = null;
        }
        c42785rcvAEQbTJ.EZpvd.setText(qZH.PendingIntent.DGgnkA);
        C42785rcv c42785rcv2 = this.AEQbTJ;
        if (c42785rcv2 == null) {
            Intrinsics.gEmmrt("");
            c42785rcv2 = null;
        }
        android.widget.LinearLayout linearLayout = c42785rcv2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        C42785rcv c42785rcv3 = this.AEQbTJ;
        if (c42785rcv3 == null) {
            Intrinsics.gEmmrt("");
            c42785rcv3 = null;
        }
        c42785rcv3.AhwBna.setText(qZH.PendingIntent.AYXKKw);
        C42785rcv c42785rcv4 = this.AEQbTJ;
        if (c42785rcv4 == null) {
            Intrinsics.gEmmrt("");
            c42785rcv4 = null;
        }
        c42785rcv4.AEQbTJ.setText(qZH.PendingIntent.AhwBna);
        C42785rcv c42785rcv5 = this.AEQbTJ;
        if (c42785rcv5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c42785rcv = c42785rcv5;
        }
        c42785rcv.copydefault.setChecked(this.OLrzqt);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setTextSize(16.0f);
        wxq.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.QIZEnU));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C42785rcv c42785rcv = this.AEQbTJ;
        if (c42785rcv == null) {
            Intrinsics.gEmmrt("");
            c42785rcv = null;
        }
        c42785rcv.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.jLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C25918jLe.copydefault(this.EZpvd, compoundButton, z);
            }
        });
    }

    public static final void copydefault(C25918jLe c25918jLe, android.widget.CompoundButton compoundButton, boolean z) {
        Function1<java.lang.Boolean, Unit> function1 = c25918jLe.EZpvd;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }
}
