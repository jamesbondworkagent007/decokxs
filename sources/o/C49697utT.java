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

/* JADX INFO: renamed from: o.utT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C49697utT extends android.widget.LinearLayout implements InterfaceC49582urK {
    public boolean AEQbTJ;
    public final InterfaceC49574urC AhwBna;
    public BizInstrument EZpvd;
    public InterfaceC49622ury KWHzl;
    public final AbstractC49729utz OLrzqt;
    public Observer<xMJ.TaskDescription> copydefault;
    public Observer<xMJ.StateListAnimator> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizInstrument copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBizInstrument(BizInstrument bizInstrument) {
        this.EZpvd = bizInstrument;
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
 A[MD:(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void (m)] (LINE:31) call: o.utT.<init>(android.content.Context, android.util.AttributeSet, int, com.okinc.unify_trade.biz.BizInstrument, boolean, o.urC):void type: THIS */
    public /* synthetic */ C49697utT(android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, bizInstrument, z, (i2 & 32) != 0 ? null : interfaceC49574urC);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49697utT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, BizInstrument bizInstrument, boolean z, InterfaceC49574urC interfaceC49574urC) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = bizInstrument;
        this.AEQbTJ = z;
        this.AhwBna = interfaceC49574urC;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49720utq.ActionBar.OLrzqt, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (AbstractC49729utz) viewDataBindingInflate;
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
        djBIcL();
    }

    private final void djBIcL() {
        this.djBIcL = new Observer() { // from class: o.utU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49697utT.AEQbTJ(this.KWHzl, (xMJ.StateListAnimator) obj);
            }
        };
        this.copydefault = new Observer() { // from class: o.utZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C49697utT.EZpvd(this.AEQbTJ, (xMJ.TaskDescription) obj);
            }
        };
    }

    public static final void AEQbTJ(C49697utT c49697utT, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC49681utD abstractC49681utD = c49697utT.OLrzqt.EZpvd;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtMarkPriceWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49697utT.copydefault(), false, 4, null));
    }

    public static final void EZpvd(C49697utT c49697utT, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC49681utD abstractC49681utD = c49697utT.OLrzqt.copydefault;
        C49579urH c49579urH = C49579urH.EZpvd;
        java.lang.String strOLrzqt = taskDescription.OLrzqt();
        abstractC49681utD.AEQbTJ(C49579urH.fmtIndexTickerWithSign$default(c49579urH, strOLrzqt == null ? "" : strOLrzqt, c49697utT.copydefault(), false, 4, null));
    }

    @Override // o.InterfaceC49582urK
    public void AEQbTJ() {
        InterfaceC49622ury interfaceC49622ury;
        LiveData<xMJ.TaskDescription> liveDataAEQbTJ;
        InterfaceC49622ury interfaceC49622ury2;
        LiveData<xMJ.StateListAnimator> liveDataKWHzl;
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
        InterfaceC49574urC interfaceC49574urC = this.AhwBna;
        InterfaceC49622ury interfaceC49622uryEZpvd = interfaceC49574urC != null ? interfaceC49574urC.EZpvd(OLrzqt()) : null;
        this.KWHzl = interfaceC49622uryEZpvd;
        if (interfaceC49622uryEZpvd != null) {
            interfaceC49622uryEZpvd.AhwBna();
        }
        this.OLrzqt.AEQbTJ.setVisibility(8);
        this.OLrzqt.EZpvd.KWHzl(true);
        this.OLrzqt.copydefault.KWHzl(true);
        Observer<xMJ.StateListAnimator> observer = this.djBIcL;
        if (observer != null && (interfaceC49622ury2 = this.KWHzl) != null && (liveDataKWHzl = interfaceC49622ury2.KWHzl()) != null) {
            liveDataKWHzl.observeForever(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.copydefault;
        if (observer2 == null || (interfaceC49622ury = this.KWHzl) == null || (liveDataAEQbTJ = interfaceC49622ury.AEQbTJ()) == null) {
            return;
        }
        liveDataAEQbTJ.observeForever(observer2);
    }

    @Override // o.InterfaceC49582urK
    public void KWHzl() {
        InterfaceC49622ury interfaceC49622ury;
        LiveData<xMJ.TaskDescription> liveDataAEQbTJ;
        InterfaceC49622ury interfaceC49622ury2;
        LiveData<xMJ.StateListAnimator> liveDataKWHzl;
        InterfaceC49622ury interfaceC49622ury3 = this.KWHzl;
        if (interfaceC49622ury3 != null) {
            interfaceC49622ury3.djBIcL();
        }
        Observer<xMJ.StateListAnimator> observer = this.djBIcL;
        if (observer != null && (interfaceC49622ury2 = this.KWHzl) != null && (liveDataKWHzl = interfaceC49622ury2.KWHzl()) != null) {
            liveDataKWHzl.removeObserver(observer);
        }
        Observer<xMJ.TaskDescription> observer2 = this.copydefault;
        if (observer2 != null && (interfaceC49622ury = this.KWHzl) != null && (liveDataAEQbTJ = interfaceC49622ury.AEQbTJ()) != null) {
            liveDataAEQbTJ.removeObserver(observer2);
        }
        BizInstrument bizInstrumentCopydefault = copydefault();
        if (bizInstrumentCopydefault != null) {
            bizInstrumentCopydefault.getInstId();
        }
    }

    @Override // o.InterfaceC49582urK
    public void EZpvd() {
        C54782xVc c54782xVc = C54782xVc.AEQbTJ;
        c54782xVc.KWHzl().setValue(c54782xVc.KWHzl().getValue());
        c54782xVc.copydefault().setValue(c54782xVc.copydefault().getValue());
    }
}
