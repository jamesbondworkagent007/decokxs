package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.bean.DAppInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hIi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21680hIi extends RecyclerView.ViewHolder {
    public final C23483hzA AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23483hzA copydefault() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21680hIi(@NotNull C23483hzA c23483hzA) {
        super(c23483hzA.getRoot());
        Intrinsics.checkNotNullParameter(c23483hzA, "");
        this.AEQbTJ = c23483hzA;
    }

    public final void KWHzl(@NotNull DAppInfo dAppInfo, int i) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        this.AEQbTJ.getRoot().setContentDescription("web3_dex_dapp_selection_item_" + i);
        this.AEQbTJ.copydefault.setText(dAppInfo.getDappName());
        android.widget.ImageView imageView = this.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        java.lang.String dappLogo = dAppInfo.getDappLogo();
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
            Unit unit = Unit.INSTANCE;
            drawable = drawableKWHzl;
        } else {
            drawable = null;
        }
        android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
        if (drawableKWHzl2 != null) {
            drawableKWHzl2.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
            Unit unit2 = Unit.INSTANCE;
            drawable2 = drawableKWHzl2;
        } else {
            drawable2 = null;
        }
        C25386ivj.KWHzl(imageView, dappLogo, new C25385ivi(drawable, drawable2, 0.0f, 0, 12, null));
    }
}
