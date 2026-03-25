package o;

import android.view.View;
import android.widget.LinearLayout;
import com.okinc.buysell.view.cryptolist.ConvertListItem;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lUX extends lUN<ConvertListItem.TaskDescription, lxF> {
    public final Function1<ConvertListItem.TaskDescription, Unit> AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;

    @Override // o.lUN
    public /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        KWHzl((ConvertListItem.TaskDescription) cryptoListItem, (C43312rms<lxF>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.ConvertListItem$TaskDescription, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lUX(boolean z, @NotNull Function1<? super ConvertListItem.TaskDescription, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.UlJrfe);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.AEQbTJ = function1;
        this.KWHzl = str;
    }

    public void KWHzl(@NotNull final ConvertListItem.TaskDescription taskDescription, @NotNull C43312rms<lxF> c43312rms) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxF) c43312rms.OLrzqt()).KWHzl;
        C33054mpH.loadUrl$default(c55021xcA.gEmmrt(), taskDescription.OLrzqt(), null, 0, 0, 14, null);
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        c55021xcA.gEmmrt().setLayoutParams(new LinearLayout.LayoutParams(c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OqFWZa), c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.wlaJM)));
        if (this.EZpvd) {
            C55021xcA.setCryptoText$default(c55021xcA, taskDescription.getCryptoName(), null, 2, null);
            c55021xcA.KWHzl().setText(taskDescription.getCryptoId());
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, taskDescription.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(taskDescription.getCryptoName());
        }
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lUX.KWHzl(this.KWHzl, taskDescription, view);
            }
        });
    }

    public static final void KWHzl(lUX lux, ConvertListItem.TaskDescription taskDescription, android.view.View view) {
        lux.AEQbTJ.invoke(taskDescription);
    }
}
