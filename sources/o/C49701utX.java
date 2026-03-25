package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49720utq;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49701utX extends android.widget.LinearLayout implements InterfaceC49582urK {
    public boolean AEQbTJ;
    public Observer<xMJ.StateListAnimator> AhwBna;
    public Observer<xMJ.TaskDescription> EZpvd;
    public InterfaceC49572urA KWHzl;
    public BizInstrument OLrzqt;
    public final AbstractC49729utz copydefault;
    public final InterfaceC49574urC valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBizInstrument(BizInstrument bizInstrument) {
        this.OLrzqt = bizInstrument;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMIsLeftLegal(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r10v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r11v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (r13v0 com.okinc.unify_trade.biz.BizInstrument)
  (r14v0 boolean)
  (wrap:o.urC:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.urC) : (r15v0 o.urC))
 A[MD:(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void (m)] (LINE:31) call: o.utX.<init>(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void type: THIS */
    public /* synthetic */ C49701utX(android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bizInstrument, z, (i2 & 32) != 0 ? null : interfaceC49574urC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49701utX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = bizInstrument;
        this.AEQbTJ = z;
        this.valueOf = interfaceC49574urC;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49720utq.ActionBar.OLrzqt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.copydefault = (AbstractC49729utz) viewDataBindingInflate;
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        if (bizInstrumentOLrzqt != null) {
            bizInstrumentOLrzqt.getInstId();
        }
        gEmmrt();
    }

    private final void gEmmrt() {
        this.AhwBna = new Observer() { // from class: o.utW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49701utX.copydefault(this.OLrzqt, (xMJ.StateListAnimator) obj);
            }
        };
        this.EZpvd = new Observer() { // from class: o.utV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49701utX.EZpvd(this.AEQbTJ, (xMJ.TaskDescription) obj);
            }
        };
    }

    public static final void copydefault(C49701utX c49701utX, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC49681utD abstractC49681utD = c49701utX.copydefault.EZpvd;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtMarkPriceWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49701utX.OLrzqt(), false, 4, null));
    }

    public static final void EZpvd(C49701utX c49701utX, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC49681utD abstractC49681utD = c49701utX.copydefault.copydefault;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtIndexTickerWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49701utX.OLrzqt(), false, 4, null));
    }

    @Override // o.InterfaceC49582urK
    public void AEQbTJ() {
        InterfaceC49572urA interfaceC49572urA;
        LiveData<xMJ.TaskDescription> liveDataCopydefault;
        InterfaceC49572urA interfaceC49572urA2;
        LiveData<xMJ.StateListAnimator> liveDataKWHzl;
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        if (bizInstrumentOLrzqt != null) {
            bizInstrumentOLrzqt.getInstId();
        }
        InterfaceC49574urC interfaceC49574urC = this.valueOf;
        InterfaceC49572urA interfaceC49572urACopydefault = interfaceC49574urC != null ? interfaceC49574urC.copydefault(copydefault()) : null;
        this.KWHzl = interfaceC49572urACopydefault;
        if (interfaceC49572urACopydefault != null) {
            interfaceC49572urACopydefault.AhwBna();
        }
        if (AYXKKw()) {
            this.copydefault.AEQbTJ.setVisibility(8);
            this.copydefault.EZpvd.KWHzl(true);
            this.copydefault.copydefault.KWHzl(true);
        } else {
            this.copydefault.AEQbTJ.setVisibility(8);
            this.copydefault.EZpvd.KWHzl(true);
            this.copydefault.copydefault.KWHzl(true);
        }
        Observer<xMJ.StateListAnimator> observer = this.AhwBna;
        if (observer != null && (interfaceC49572urA2 = this.KWHzl) != null && (liveDataKWHzl = interfaceC49572urA2.KWHzl()) != null) {
            liveDataKWHzl.observeForever(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.EZpvd;
        if (observer2 == null || (interfaceC49572urA = this.KWHzl) == null || (liveDataCopydefault = interfaceC49572urA.copydefault()) == null) {
            return;
        }
        liveDataCopydefault.observeForever(observer2);
    }

    @Override // o.InterfaceC49582urK
    public void KWHzl() {
        InterfaceC49572urA interfaceC49572urA;
        LiveData<xMJ.TaskDescription> liveDataCopydefault;
        InterfaceC49572urA interfaceC49572urA2;
        LiveData<xMJ.StateListAnimator> liveDataKWHzl;
        BizInstrument bizInstrumentOLrzqt = OLrzqt();
        if (bizInstrumentOLrzqt != null) {
            bizInstrumentOLrzqt.getInstId();
        }
        InterfaceC49572urA interfaceC49572urA3 = this.KWHzl;
        if (interfaceC49572urA3 != null) {
            interfaceC49572urA3.djBIcL();
        }
        Observer<xMJ.StateListAnimator> observer = this.AhwBna;
        if (observer != null && (interfaceC49572urA2 = this.KWHzl) != null && (liveDataKWHzl = interfaceC49572urA2.KWHzl()) != null) {
            liveDataKWHzl.removeObserver(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.EZpvd;
        if (observer2 == null || (interfaceC49572urA = this.KWHzl) == null || (liveDataCopydefault = interfaceC49572urA.copydefault()) == null) {
            return;
        }
        liveDataCopydefault.removeObserver(observer2);
    }

    @Override // o.InterfaceC49582urK
    public void EZpvd() {
        C54782xVc c54782xVc = C54782xVc.AEQbTJ;
        c54782xVc.KWHzl().setValue(c54782xVc.KWHzl().getValue());
        c54782xVc.copydefault().setValue(c54782xVc.copydefault().getValue());
    }

    private final boolean AYXKKw() {
        xOU xouWlaJM;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C49955uyM.copydefault(context) instanceof InterfaceC49514upw) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "arbitrage")) {
                return true;
            }
        }
        return false;
    }
}
