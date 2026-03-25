package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.nmk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34984nmk {
    public static /* synthetic */ void initShowAllItemView$default(InterfaceC34987nmn interfaceC34987nmn, C34910nlP c34910nlP, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC34987nmn = null;
        }
        KWHzl(interfaceC34987nmn, c34910nlP, i);
    }

    public static final void KWHzl(final InterfaceC34987nmn interfaceC34987nmn, @NotNull C34910nlP c34910nlP, final int i) {
        Intrinsics.checkNotNullParameter(c34910nlP, "");
        c34910nlP.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34984nmk.KWHzl(interfaceC34987nmn, i, view);
            }
        });
    }

    public static final void KWHzl(InterfaceC34987nmn interfaceC34987nmn, int i, android.view.View view) {
        if (interfaceC34987nmn != null) {
            interfaceC34987nmn.copydefault(i);
        }
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "";
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        java.lang.String percent$default = pTB.formatPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(dAEQbTJ)), 0, null, 3, null);
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return Marker.ANY_NON_NULL_MARKER + percent$default;
        }
        return java.lang.String.valueOf(percent$default);
    }
}
