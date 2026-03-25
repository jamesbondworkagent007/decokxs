package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53536wnO extends ConstraintLayout {
    public final AbstractC50933vdW AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public java.lang.String djBIcL;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53536wnO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53536wnO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.wnO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53536wnO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53536wnO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OqhRBM, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC50933vdW) viewDataBindingInflate;
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        this.valueOf = C56071xvr.getRiseUpColor$default(c56071xvr, 0.0f, 1, null);
        this.EZpvd = C56071xvr.getFallDownColor$default(c56071xvr, 0.0f, 1, null);
        this.KWHzl = this.valueOf;
        this.OLrzqt = C52761wXj.TaskDescription.QOeQqh;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53536wnO.AEQbTJ();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BizInfoConfig.DefaultBizConfig AEQbTJ() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    private final BizInfoConfig.DefaultBizConfig KWHzl() {
        return (BizInfoConfig.DefaultBizConfig) this.copydefault.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPrice(@NotNull java.lang.String str) {
        xMS xmsGEmmrt;
        int i;
        java.lang.String instType;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        BizInstrument bizInstrumentEZpvd = xLX.OLrzqt(KWHzl()).EZpvd();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            xmsGEmmrt = null;
        } else {
            if (bizInstrumentEZpvd == null || (instType = bizInstrumentEZpvd.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrumentEZpvd != null && (instFamily = bizInstrumentEZpvd.getInstFamily()) != null) {
                    str2 = instFamily;
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(str2);
            }
        }
        java.lang.String strAhwBna = xmsGEmmrt != null ? xmsGEmmrt.AhwBna(str) : null;
        if (strAhwBna == null || strAhwBna.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) strAhwBna, (java.lang.Object) 0)) {
            this.AEQbTJ.EZpvd.setText("--");
            this.AEQbTJ.EZpvd.setTextColor(this.valueOf);
            this.AEQbTJ.OLrzqt.setVisibility(8);
            return;
        }
        double dSubD$default = C33129mqd.subD$default(strAhwBna, this.djBIcL, null, null, null, 14, null);
        if (dSubD$default <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (dSubD$default < AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.KWHzl = this.EZpvd;
                i = C52761wXj.TaskDescription.nriSR;
            }
            this.AEQbTJ.EZpvd.setText(pTB.formatRoundToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAhwBna), C33129mqd.AhwBna(xmsGEmmrt.AEQbTJ()), null, 2, null));
            this.AEQbTJ.EZpvd.setTextColor(this.KWHzl);
            this.AEQbTJ.OLrzqt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.KWHzl));
            this.AEQbTJ.OLrzqt.setBackgroundResource(this.OLrzqt);
            this.AEQbTJ.OLrzqt.setVisibility(0);
            this.djBIcL = strAhwBna;
        }
        this.KWHzl = this.valueOf;
        i = C52761wXj.TaskDescription.QOeQqh;
        this.OLrzqt = i;
        this.AEQbTJ.EZpvd.setText(pTB.formatRoundToFixed$default(xMR.copydefault.OLrzqt((java.lang.Object) strAhwBna), C33129mqd.AhwBna(xmsGEmmrt.AEQbTJ()), null, 2, null));
        this.AEQbTJ.EZpvd.setTextColor(this.KWHzl);
        this.AEQbTJ.OLrzqt.setBackgroundTintList(android.content.res.ColorStateList.valueOf(this.KWHzl));
        this.AEQbTJ.OLrzqt.setBackgroundResource(this.OLrzqt);
        this.AEQbTJ.OLrzqt.setVisibility(0);
        this.djBIcL = strAhwBna;
    }
}
