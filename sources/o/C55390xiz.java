package o;

import android.view.View;
import com.okinc.uilib.core.icon.TextEndLineIconAlignment;
import com.okinc.uilib.hyperlink.state.HyperlinkFontWeight;
import com.okinc.uilib.hyperlink.state.HyperlinkSize;
import com.okinc.uilib.hyperlink.state.HyperlinkStyle;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55357xiS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55390xiz extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public C55356xiR OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55390xiz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55390xiz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.xiz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55390xiz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55390xiz(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.EZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.xiB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55390xiz.OLrzqt(context, this);
            }
        });
        this.AEQbTJ = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.xiG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55390xiz.KWHzl();
            }
        });
        this.copydefault = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.xiH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55390xiz.copydefault();
            }
        });
        this.OLrzqt = gEmmrt().copydefault(context, attributeSet, i);
        djBIcL().AEQbTJ.setAttachmentViewAlignment(TextEndLineIconAlignment.ALIGN_BOTTOM);
        addView(djBIcL().getRoot());
        InterfaceC55357xiS interfaceC55357xiSValueOf = valueOf();
        C55425xjh c55425xjh = djBIcL().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55425xjh, "");
        interfaceC55357xiSValueOf.AEQbTJ(c55425xjh, this.OLrzqt, true);
    }

    private final C54933xaS djBIcL() {
        return (C54933xaS) this.EZpvd.getValue();
    }

    public static final C54933xaS OLrzqt(android.content.Context context, C55390xiz c55390xiz) {
        C54933xaS c54933xaSOLrzqt = C54933xaS.OLrzqt(android.view.LayoutInflater.from(context), c55390xiz, false);
        Intrinsics.checkNotNullExpressionValue(c54933xaSOLrzqt, "");
        return c54933xaSOLrzqt;
    }

    private final InterfaceC55357xiS valueOf() {
        return (InterfaceC55357xiS) this.AEQbTJ.getValue();
    }

    public static final C55354xiP KWHzl() {
        return new C55354xiP(null, 1, 0 == true ? 1 : 0);
    }

    private final InterfaceC55348xiJ gEmmrt() {
        return (InterfaceC55348xiJ) this.copydefault.getValue();
    }

    public static final C55355xiQ copydefault() {
        return new C55355xiQ();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xiS.StateListAnimator.applyState$default(o.xiS, o.xjh, o.xiR, boolean, int, java.lang.Object):void */
    private final void EZpvd(C55356xiR c55356xiR) {
        this.OLrzqt = c55356xiR;
        InterfaceC55357xiS interfaceC55357xiSValueOf = valueOf();
        C55425xjh c55425xjh = djBIcL().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55425xjh, "");
        InterfaceC55357xiS.StateListAnimator.applyState$default(interfaceC55357xiSValueOf, c55425xjh, this.OLrzqt, false, 4, null);
    }

    public final void setStyle(@NotNull HyperlinkStyle hyperlinkStyle) {
        Intrinsics.checkNotNullParameter(hyperlinkStyle, "");
        C55356xiR c55356xiR = this.OLrzqt;
        C33517mxu c33517mxu = C33517mxu.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : java.lang.Integer.valueOf(c33517mxu.OLrzqt(context, hyperlinkStyle.getTextColorRes$OKUILib_uilib())), (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : hyperlinkStyle, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
        InterfaceC55357xiS interfaceC55357xiSValueOf = valueOf();
        C55425xjh c55425xjh = djBIcL().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55425xjh, "");
        interfaceC55357xiSValueOf.AEQbTJ(c55425xjh, this.OLrzqt, true);
    }

    public final void setSize(@NotNull HyperlinkSize hyperlinkSize) {
        Intrinsics.checkNotNullParameter(hyperlinkSize, "");
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : java.lang.Integer.valueOf(getResources().getDimensionPixelSize(hyperlinkSize.getTextSize$OKUILib_uilib())), (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : java.lang.Integer.valueOf(getResources().getDimensionPixelSize(hyperlinkSize.getLineHeight$OKUILib_uilib())), (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : hyperlinkSize));
    }

    public final void setText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : charSequence, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    public final void AEQbTJ(boolean z) {
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : z, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    public final boolean AYXKKw() {
        return this.OLrzqt.AYXKKw();
    }

    public final void setTextSize(int i) {
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : java.lang.Integer.valueOf(i), (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    public final void copydefault(boolean z) {
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : z, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    public final boolean EZpvd() {
        return this.OLrzqt.djBIcL();
    }

    public final void setFontWeight(@NotNull HyperlinkFontWeight hyperlinkFontWeight) {
        Intrinsics.checkNotNullParameter(hyperlinkFontWeight, "");
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : hyperlinkFontWeight, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    public final void setTextColor(int i) {
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : java.lang.Integer.valueOf(i), (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : false, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        C55356xiR c55356xiR = this.OLrzqt;
        EZpvd(c55356xiR.AEQbTJ((895 & 1) != 0 ? c55356xiR.AYXKKw : null, (895 & 2) != 0 ? c55356xiR.valueOf : null, (895 & 4) != 0 ? c55356xiR.gEmmrt : null, (895 & 8) != 0 ? c55356xiR.KWHzl : null, (895 & 16) != 0 ? c55356xiR.djBIcL : null, (895 & 32) != 0 ? c55356xiR.EZpvd : z, (895 & 64) != 0 ? c55356xiR.copydefault : false, (895 & 128) != 0 ? c55356xiR.AhwBna : false, (895 & 256) != 0 ? c55356xiR.AEQbTJ : null, (895 & 512) != 0 ? c55356xiR.OLrzqt : null));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        djBIcL().AEQbTJ.setOnClickListener(onClickListener);
    }
}
