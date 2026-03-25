package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.C33160mrH;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33465mwv extends AbstractC33469mwz {
    @Override // o.AbstractC33469mwz
    public java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C33160mrH.TaskDescription.AEQbTJ);
    }

    @Override // o.AbstractC33469mwz
    public java.util.List<AbstractC33244msm> OLrzqt() {
        return yDY.gEmmrt(AbstractC33244msm.Activity.KWHzl, AbstractC33244msm.TaskDescription.KWHzl, AbstractC33244msm.Fragment.KWHzl, AbstractC33244msm.ActionBar.KWHzl, AbstractC33244msm.PendingIntent.KWHzl);
    }

    @Override // o.AbstractC33469mwz
    public void EZpvd(@NotNull AbstractC33244msm abstractC33244msm, @NotNull C33302mtr c33302mtr) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        Intrinsics.checkNotNullParameter(c33302mtr, "");
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl)) {
            c33302mtr.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
            c33302mtr.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.copydefault));
            c33302mtr.OLrzqt.setImageResource(C52761wXj.TaskDescription.getPostValueLengthLimit);
            android.widget.ImageView imageView = c33302mtr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            c33302mtr.AEQbTJ.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm));
            return;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl)) {
            c33302mtr.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.uzCIH));
            c33302mtr.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.iwGUEr));
            c33302mtr.OLrzqt.setImageResource(C33160mrH.Activity.EZpvd);
            android.widget.ImageView imageView2 = c33302mtr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            c33302mtr.AEQbTJ.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm));
            return;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl)) {
            c33302mtr.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AhwBna));
            c33302mtr.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.copydefault));
            c33302mtr.OLrzqt.setImageResource(C52761wXj.TaskDescription.getPostValueLengthLimit);
            android.widget.ImageView imageView3 = c33302mtr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            c33302mtr.AEQbTJ.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm));
            return;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl)) {
            c33302mtr.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
            c33302mtr.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.OLrzqt));
            c33302mtr.OLrzqt.setImageResource(C52761wXj.TaskDescription.OFhtUX);
            android.widget.ImageView imageView4 = c33302mtr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
            c33302mtr.AEQbTJ.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm));
            return;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            c33302mtr.AhwBna.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.valueOf));
            c33302mtr.EZpvd.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.EZpvd));
            c33302mtr.OLrzqt.setImageResource(C52761wXj.TaskDescription.QOLQEE);
            android.widget.ImageView imageView5 = c33302mtr.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
            c33302mtr.AEQbTJ.setContentDescription(C33421mwD.OLrzqt(abstractC33244msm));
        }
    }
}
