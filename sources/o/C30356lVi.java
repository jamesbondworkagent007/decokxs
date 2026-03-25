package o;

import android.view.View;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30356lVi extends lUN<CryptoListItem.ActionBar, lxF> {
    public final boolean AEQbTJ;
    public final Function1<CryptoListItem.ActionBar, Unit> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.CryptoListItem$ActionBar, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30356lVi(boolean z, @NotNull Function1<? super CryptoListItem.ActionBar, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.UlJrfe);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = z;
        this.KWHzl = function1;
        this.copydefault = str;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/okinc/buysell/view/cryptolist/CryptoListItem;Lo/rms;)V */
    @Override // o.lUN
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull final CryptoListItem.ActionBar actionBar, @NotNull C43312rms<lxF> c43312rms) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxF) c43312rms.OLrzqt()).KWHzl;
        c55021xcA.gEmmrt().setTokens(actionBar.copydefault());
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        if (this.AEQbTJ) {
            C55021xcA.setCryptoText$default(c55021xcA, actionBar.getCryptoName(), null, 2, null);
            c55021xcA.KWHzl().setText(actionBar.getCryptoId());
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, actionBar.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(actionBar.getCryptoName());
        }
        c55021xcA.AYXKKw().setText(actionBar.KWHzl());
        android.widget.TextView textViewValues = c55021xcA.values();
        textViewValues.setText(actionBar.AEQbTJ());
        textViewValues.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lVh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30356lVi.KWHzl(this.copydefault, actionBar, view);
            }
        });
    }

    public static final void KWHzl(C30356lVi c30356lVi, CryptoListItem.ActionBar actionBar, android.view.View view) {
        c30356lVi.KWHzl.invoke(actionBar);
    }
}
