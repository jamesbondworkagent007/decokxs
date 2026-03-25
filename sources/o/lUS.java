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
public final class lUS extends lUN<ConvertListItem.Application, lxF> {
    public final Function1<ConvertListItem.Application, Unit> AEQbTJ;
    public final boolean KWHzl;
    public final java.lang.String copydefault;

    @Override // o.lUN
    public /* bridge */ /* synthetic */ void EZpvd(CryptoListItem cryptoListItem, C43312rms c43312rms) {
        EZpvd((ConvertListItem.Application) cryptoListItem, (C43312rms<lxF>) c43312rms);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.view.cryptolist.ConvertListItem$Application, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lUS(boolean z, @NotNull Function1<? super ConvertListItem.Application, Unit> function1, @NotNull java.lang.String str) {
        super(C31351lsQ.ActionBar.UlJrfe);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = z;
        this.AEQbTJ = function1;
        this.copydefault = str;
    }

    public void EZpvd(@NotNull final ConvertListItem.Application application, @NotNull C43312rms<lxF> c43312rms) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c43312rms, "");
        C55021xcA c55021xcA = ((lxF) c43312rms.OLrzqt()).KWHzl;
        C33054mpH.loadUrl$default(c55021xcA.gEmmrt(), application.EZpvd(), null, 0, 0, 14, null);
        c55021xcA.gEmmrt().setBorderSize(0.0f);
        c55021xcA.gEmmrt().setLayoutParams(new LinearLayout.LayoutParams(c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OqFWZa), c55021xcA.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.wlaJM)));
        if (this.KWHzl) {
            C55021xcA.setCryptoText$default(c55021xcA, application.getCryptoName(), null, 2, null);
            c55021xcA.KWHzl().setText(application.getCryptoId());
        } else {
            C55021xcA.setCryptoText$default(c55021xcA, application.getCryptoId(), null, 2, null);
            c55021xcA.KWHzl().setText(application.getCryptoName());
        }
        if (application.KWHzl() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c55021xcA.AYXKKw().setText("");
        } else {
            c55021xcA.AYXKKw().setText(application.OLrzqt());
        }
        if (application.AEQbTJ() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c55021xcA.values().setText("");
        } else {
            android.widget.TextView textViewValues = c55021xcA.values();
            textViewValues.setText(application.gEmmrt());
            textViewValues.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.GzAsTt));
        }
        c55021xcA.setBackground(Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.getCryptoId()) ? C33070mpX.KWHzl(mDC.StateListAnimator.EZpvd) : null);
        c55021xcA.setOnClickListener(new View.OnClickListener() { // from class: o.lUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lUS.copydefault(this.copydefault, application, view);
            }
        });
    }

    public static final void copydefault(lUS lus, ConvertListItem.Application application, android.view.View view) {
        lus.AEQbTJ.invoke(application);
    }
}
