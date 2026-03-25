package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25814jHi extends RecyclerView.ViewHolder {
    public final C22327hdK copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22327hdK AEQbTJ() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25814jHi(@NotNull C22327hdK c22327hdK) {
        super(c22327hdK.getRoot());
        Intrinsics.checkNotNullParameter(c22327hdK, "");
        this.copydefault = c22327hdK;
    }

    public final void AEQbTJ(@NotNull AlertGroupUiItem alertGroupUiItem) {
        android.graphics.drawable.Drawable drawableKWHzl;
        android.graphics.drawable.Drawable drawableKWHzl2;
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        C22327hdK c22327hdK = this.copydefault;
        android.widget.ImageView imageView = c22327hdK.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.graphics.drawable.Drawable drawable = null;
        C25386ivj.loadImageWithBorder$default(imageView, alertGroupUiItem.valueOf(), null, 2, null);
        android.widget.ImageView imageView2 = c22327hdK.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C33054mpH.AEQbTJ(imageView2, alertGroupUiItem.AEQbTJ());
        c22327hdK.valueOf.setText(alertGroupUiItem.gEmmrt());
        c22327hdK.AhwBna.setText(EZpvd(alertGroupUiItem));
        android.widget.TextView textView = c22327hdK.AYXKKw;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format(java.lang.String.valueOf(alertGroupUiItem.EZpvd().size()), java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "");
        textView.setText(str);
        android.widget.ImageView imageView3 = c22327hdK.copydefault;
        if (alertGroupUiItem.AhwBna()) {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DNMMPQ);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DCUTEIddSDPG);
        }
        imageView3.setImageDrawable(drawableKWHzl);
        if (alertGroupUiItem.AYXKKw()) {
            android.widget.ImageView imageView4 = c22327hdK.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(0);
            android.widget.ImageView imageView5 = c22327hdK.KWHzl;
            if (alertGroupUiItem.fetchVPNInfo()) {
                drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqESXP);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                    drawable = drawableKWHzl2;
                }
            } else {
                drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.QqiRNA);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
                    drawable = drawableKWHzl2;
                }
            }
            imageView5.setImageDrawable(drawable);
            return;
        }
        android.widget.ImageView imageView6 = c22327hdK.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView6, "");
        imageView6.setVisibility(8);
    }

    public final java.lang.String EZpvd(AlertGroupUiItem alertGroupUiItem) {
        if (alertGroupUiItem.djBIcL().length() <= 10) {
            return alertGroupUiItem.djBIcL();
        }
        java.lang.String strSubstring = alertGroupUiItem.djBIcL().substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = alertGroupUiItem.djBIcL().substring(alertGroupUiItem.djBIcL().length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring + "..." + strSubstring2;
    }

    /* JADX INFO: renamed from: o.jHi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jHi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C25814jHi OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C22327hdK c22327hdKEZpvd = C22327hdK.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c22327hdKEZpvd, "");
            return new C25814jHi(c22327hdKEZpvd);
        }
    }
}
