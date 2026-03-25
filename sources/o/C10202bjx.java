package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10202bjx extends RecyclerView.ViewHolder {
    public final AbstractC17055eva KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10202bjx(@NotNull AbstractC17055eva abstractC17055eva) {
        super(abstractC17055eva.getRoot());
        Intrinsics.checkNotNullParameter(abstractC17055eva, "");
        this.KWHzl = abstractC17055eva;
    }

    public final void KWHzl(@NotNull AbstractC10168bjP.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (!taskDescription.fetchVPNInfo()) {
            if (taskDescription.valueOf() == 4) {
                this.KWHzl.copydefault.setImageResource(C13754dXa.Activity.dmfpNf);
            } else {
                EZpvd(taskDescription);
            }
        } else {
            this.KWHzl.copydefault.setImageResource(C13754dXa.Activity.dHguZz);
        }
        java.lang.CharSequence charSequenceJointColorCharSequence$default = C10186bjh.jointColorCharSequence$default(C10186bjh.KWHzl, taskDescription.AEQbTJ() + taskDescription.copydefault(), 0, taskDescription.KWHzl(), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 2, null);
        this.KWHzl.OLrzqt.setVisibility(0);
        this.KWHzl.OLrzqt.setText(charSequenceJointColorCharSequence$default);
        if (taskDescription.djBIcL().length() > 0) {
            this.KWHzl.AEQbTJ.setVisibility(0);
            this.KWHzl.AEQbTJ.setText(taskDescription.djBIcL());
        } else {
            this.KWHzl.AEQbTJ.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(AbstractC10168bjP.TaskDescription taskDescription) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        int i;
        C5448Sc c5448ScCopydefault = copydefault(taskDescription.gEmmrt());
        java.lang.String strGEmmrt = taskDescription.gEmmrt();
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String strGEmmrt2 = "";
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = strGEmmrt.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            strGEmmrt2 = "SVG:" + taskDescription.gEmmrt();
        } else if (!taskDescription.AkhnZx()) {
            strGEmmrt2 = taskDescription.gEmmrt();
        } else {
            java.lang.Character chWlaJM = C59454zhO.wlaJM(taskDescription.KWHzl());
            if (chWlaJM != null && (string = chWlaJM.toString()) != null && (strOLrzqt = C9700baY.OLrzqt(string)) != null) {
                strGEmmrt2 = strOLrzqt;
            }
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(this.KWHzl.getRoot().getContext()).EZpvd(strGEmmrt2).OLrzqt((RX<?>) c5448ScCopydefault);
        android.content.Context context = this.KWHzl.getRoot().getContext();
        if (taskDescription.valueOf() != 2 && taskDescription.valueOf() != 5 && taskDescription.valueOf() != 3) {
            switch (taskDescription.DbNXlk()) {
                case 56:
                case 57:
                case 58:
                case 59:
                case 61:
                    i = C13754dXa.Activity.dHguZz;
                    break;
                case 62:
                    i = C13754dXa.Activity.hrNTAI;
                    break;
            }
        } else {
            i = C52761wXj.TaskDescription.aHXSQp;
        }
        c5335NtOLrzqt.OLrzqt(AppCompatResources.getDrawable(context, i)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this.KWHzl.getRoot().getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(this.KWHzl.copydefault);
    }

    private final C5448Sc copydefault(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }
}
