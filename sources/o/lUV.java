package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.camera.video.AudioStats;
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
public final class lUV extends lUN<ConvertListItem.ActionBar, lxF> {
    public final boolean EZpvd;
    public final Function1<ConvertListItem.ActionBar, Unit> KWHzl;
    public final java.lang.String copydefault;

    @Override // o.lUN
    public /* bridge */ /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        EZpvd((ConvertListItem.ActionBar) cryptoListItem, (C43312rms<lxF>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.ConvertListItem$ActionBar, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lUV(boolean z, @NotNull Function1<? super ConvertListItem.ActionBar, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.UlJrfe);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.KWHzl = function1;
        this.copydefault = str;
    }

    public void EZpvd(@NotNull final ConvertListItem.ActionBar actionBar, @NotNull C43312rms<lxF> c43312rms) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxF) c43312rms.OLrzqt()).KWHzl;
        C33054mpH.loadUrl$default(c55021xcA.gEmmrt(), actionBar.KWHzl(), null, 0, 0, 14, null);
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        c55021xcA.gEmmrt().setLayoutParams(new LinearLayout.LayoutParams(c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OqFWZa), c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.wlaJM)));
        if (this.EZpvd) {
            C55021xcA.setCryptoText$default(c55021xcA, actionBar.getCryptoName(), null, 2, null);
            c55021xcA.KWHzl().setText(actionBar.getCryptoId());
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, actionBar.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(actionBar.getCryptoName());
        }
        if (actionBar.OLrzqt() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c55021xcA.AYXKKw().setText("");
        } else {
            c55021xcA.AYXKKw().setText(actionBar.AEQbTJ());
        }
        if (actionBar.EZpvd() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c55021xcA.values().setText("");
        } else {
            android.widget.TextView textViewValues = c55021xcA.values();
            textViewValues.setText(actionBar.gEmmrt());
            textViewValues.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
        }
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lUV.EZpvd(this.KWHzl, actionBar, view);
            }
        });
    }

    public static final void EZpvd(lUV luv, ConvertListItem.ActionBar actionBar, android.view.View view) {
        luv.KWHzl.invoke(actionBar);
    }
}
