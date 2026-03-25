package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27231jrL extends LinearLayoutCompat {
    public boolean AEQbTJ;
    public TaskDescription EZpvd;
    public C23959iPr OLrzqt;
    public C23888iNa copydefault;

    /* JADX INFO: renamed from: o.jrL$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeClickListener(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27231jrL(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27231jrL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27231jrL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        this.copydefault = C23888iNa.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        OLrzqt(this.AEQbTJ);
        C23888iNa c23888iNa = this.copydefault;
        if (c23888iNa == null) {
            Intrinsics.gEmmrt("");
            c23888iNa = null;
        }
        c23888iNa.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.jrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27231jrL.AEQbTJ(this.AEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(C27231jrL c27231jrL, android.view.View view) {
        TaskDescription taskDescription;
        if (c27231jrL.OLrzqt == null || !c27231jrL.AEQbTJ || (taskDescription = c27231jrL.EZpvd) == null) {
            return;
        }
        taskDescription.AEQbTJ();
    }

    public final void setData(@NotNull C23959iPr c23959iPr) {
        Intrinsics.checkNotNullParameter(c23959iPr, "");
        this.OLrzqt = c23959iPr;
        C23888iNa c23888iNa = this.copydefault;
        C23888iNa c23888iNa2 = null;
        if (c23888iNa == null) {
            Intrinsics.gEmmrt("");
            c23888iNa = null;
        }
        c23888iNa.AEQbTJ.setText(c23959iPr.EZpvd());
        C23888iNa c23888iNa3 = this.copydefault;
        if (c23888iNa3 == null) {
            Intrinsics.gEmmrt("");
            c23888iNa3 = null;
        }
        C55251xgS c55251xgS = c23888iNa3.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(c23959iPr.OLrzqt().length() > 0 ? 0 : 8);
        C23888iNa c23888iNa4 = this.copydefault;
        if (c23888iNa4 == null) {
            Intrinsics.gEmmrt("");
            c23888iNa4 = null;
        }
        C55251xgS c55251xgS2 = c23888iNa4.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C25493ixk.FragmentManager.fcfzuX;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        c55251xgS2.setText(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27492jwH.formatRatePercent$default(c27492jwH, c23959iPr.OLrzqt(), false, 2, null)))));
        C23888iNa c23888iNa5 = this.copydefault;
        if (c23888iNa5 == null) {
            Intrinsics.gEmmrt("");
            c23888iNa5 = null;
        }
        android.widget.TextView textView = c23888iNa5.valueOf;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setText(C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.invokespecialhOMIpD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", c27492jwH.valueOf(c23959iPr.AEQbTJ())), C56390yDp.OLrzqt("num2", c27492jwH.valueOf(c23959iPr.djBIcL())), C56390yDp.OLrzqt("token1", c23959iPr.copydefault()), C56390yDp.OLrzqt("token2", c23959iPr.KWHzl()))));
        C23888iNa c23888iNa6 = this.copydefault;
        if (c23888iNa6 == null) {
            Intrinsics.gEmmrt("");
            c23888iNa6 = null;
        }
        c23888iNa6.copydefault.setOKDSPill(-2);
        C23888iNa c23888iNa7 = this.copydefault;
        if (c23888iNa7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23888iNa2 = c23888iNa7;
        }
        c23888iNa2.copydefault.setTagPaint(1);
    }

    public final void copydefault(boolean z) {
        C23888iNa c23888iNa = null;
        if (z) {
            C23888iNa c23888iNa2 = this.copydefault;
            if (c23888iNa2 == null) {
                Intrinsics.gEmmrt("");
                c23888iNa2 = null;
            }
            c23888iNa2.copydefault.setText(getContext().getString(C25493ixk.FragmentManager.RihMUf));
            C23888iNa c23888iNa3 = this.copydefault;
            if (c23888iNa3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23888iNa = c23888iNa3;
            }
            c23888iNa.copydefault.setOKDSStyle(3);
            return;
        }
        C23888iNa c23888iNa4 = this.copydefault;
        if (c23888iNa4 == null) {
            Intrinsics.gEmmrt("");
            c23888iNa4 = null;
        }
        c23888iNa4.copydefault.setText(getContext().getString(C25493ixk.FragmentManager.resume));
        C23888iNa c23888iNa5 = this.copydefault;
        if (c23888iNa5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23888iNa = c23888iNa5;
        }
        c23888iNa.copydefault.setOKDSStyle(0);
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        C23888iNa c23888iNa = this.copydefault;
        if (c23888iNa == null) {
            Intrinsics.gEmmrt("");
            c23888iNa = null;
        }
        android.widget.TextView textView = c23888iNa.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        int i = C52761wXj.TaskDescription.RqmePg;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(12.0f, context);
        int color = ContextCompat.getColor(getContext(), C52761wXj.Activity.Dmq);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c27569jxf.copydefault(textView, i, iCopydefault, z, java.lang.Integer.valueOf(color), C55298xhM.copydefault(4.0f, context2));
    }
}
