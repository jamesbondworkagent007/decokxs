package o;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42920rfX extends AppCompatTextView {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public java.lang.Double OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseTrColor(boolean z) {
        this.copydefault = z;
    }

    private final android.graphics.drawable.Drawable isConnected() {
        return (android.graphics.drawable.Drawable) this.EZpvd.getValue();
    }

    public static final android.graphics.drawable.Drawable AEQbTJ() {
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPHhYHK);
    }

    private final android.graphics.drawable.Drawable fetchVPNInfo() {
        return (android.graphics.drawable.Drawable) this.AEQbTJ.getValue();
    }

    public static final android.graphics.drawable.Drawable KWHzl() {
        return C33070mpX.KWHzl(C52761wXj.TaskDescription.RhjxDW);
    }

    private final android.graphics.drawable.Drawable DbNXlk() {
        return (android.graphics.drawable.Drawable) this.KWHzl.getValue();
    }

    public static final android.graphics.drawable.Drawable AhwBna() {
        return C33070mpX.KWHzl(qZH.Activity.EZpvd);
    }

    public final int AkhnZx() {
        if (this.copydefault) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRise$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeRiseHighlightsContent$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public final int djBIcL() {
        if (this.copydefault) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeFall$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallHighlightsContent$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public final int AYXKKw() {
        if (this.copydefault) {
            return C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo);
        }
        int i = C52761wXj.ActionBar.QSBOWP;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C55366xib.KWHzl(i, context);
    }

    public final int gEmmrt() {
        if (this.copydefault) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c33512mxp.fJNWhG(context, 0.1f);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallHighlightsFill$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public final int values() {
        if (this.copydefault) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c33512mxp.zsXlph(context, 0.1f);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeRiseHighlightsFill$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    public final int valueOf() {
        if (this.copydefault) {
            return C33522mxz.OLrzqt(C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo), 0.1f);
        }
        int i = C52761wXj.ActionBar.RdAHlO;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C55366xib.KWHzl(i, context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42920rfX(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AEQbTJ();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.KWHzl();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AhwBna();
            }
        });
        ejfBZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42920rfX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AEQbTJ();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.KWHzl();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AhwBna();
            }
        });
        ejfBZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42920rfX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AEQbTJ();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.KWHzl();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42920rfX.AhwBna();
            }
        });
        ejfBZ();
    }

    private final void ejfBZ() {
        setSingleLine(true);
    }

    public static /* synthetic */ void setChangePercentAndShow$default(C42920rfX c42920rfX, java.lang.Double d, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c42920rfX.setChangePercentAndShow(d, str, z);
    }

    public final void setChangePercentAndShow(java.lang.Double d, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = z;
        this.OLrzqt = d;
        setText(pTF.KWHzl.AEQbTJ(str));
        EZpvd(d);
        copydefault(d);
    }

    public final void copydefault(java.lang.Double d) {
        int iAkhnZx;
        if (d == null) {
            setTextColor(AYXKKw());
            return;
        }
        d.doubleValue();
        if (d.doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE) {
            iAkhnZx = djBIcL();
        } else {
            iAkhnZx = d.doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE ? AkhnZx() : AYXKKw();
        }
        setTextColor(iAkhnZx);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public final void EZpvd(java.lang.Double d) {
        int iValues;
        android.graphics.drawable.Drawable drawableFetchVPNInfo;
        if (d == null) {
            setBackground(null);
            return;
        }
        d.doubleValue();
        if (d.doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE) {
            iValues = gEmmrt();
        } else {
            iValues = d.doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE ? values() : valueOf();
        }
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(iValues));
        d.doubleValue();
        if (d.doubleValue() < AudioStats.AUDIO_AMPLITUDE_NONE) {
            drawableFetchVPNInfo = isConnected();
        } else {
            drawableFetchVPNInfo = d.doubleValue() > AudioStats.AUDIO_AMPLITUDE_NONE ? fetchVPNInfo() : DbNXlk();
        }
        setBackground(drawableFetchVPNInfo);
    }
}
