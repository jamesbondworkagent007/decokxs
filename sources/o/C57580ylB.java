package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C28102kOz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57580ylB extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final kOW KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57580ylB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57580ylB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.ylB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57580ylB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57580ylB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        kOW kowCopydefault = kOW.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(kowCopydefault, "");
        this.KWHzl = kowCopydefault;
    }

    /* JADX INFO: renamed from: o.ylB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ylB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            KWHzl(str, str2);
        } else {
            EZpvd(str2);
        }
        function1.invoke(java.lang.Boolean.TRUE);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        kOW kow = this.KWHzl;
        kow.AuCTel.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.uzCIH));
        C55051xce c55051xce = C55051xce.OLrzqt;
        android.graphics.Typeface typefaceDjBIcL = c55051xce.djBIcL();
        if (typefaceDjBIcL != null) {
            kow.AuCTel.setTypeface(typefaceDjBIcL);
        }
        kow.AuCTel.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        kow.DbNXlk.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.fARcdN));
        android.graphics.Typeface typefaceCopydefault = c55051xce.copydefault();
        if (typefaceCopydefault != null) {
            kow.DbNXlk.setTypeface(typefaceCopydefault);
        }
        kow.DbNXlk.setTextColor(C33070mpX.copydefault(C28102kOz.Application.KWHzl));
        C6995aZr.setContent$default(kow.valueOf, str2, false, 8.0f, 2, (java.lang.Object) null);
        kow.AkhnZx.setText(str);
        kow.AkhnZx.setMaxLines(1);
        kow.AkhnZx.setTextColor(C33070mpX.copydefault(C28102kOz.Application.KWHzl));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C28102kOz.Fragment.AuCTel);
        kow.fetchVPNInfo.setText(strAYXKKw);
        kow.values.setText(strAYXKKw);
        kow.isConnected.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C28102kOz.Fragment.fIwbmz), C56423yEv.EZpvd(C56390yDp.OLrzqt("inviteLink", str2))));
        kow.isConnected.setTextAppearance(C52761wXj.LoaderManager.DCJXGO);
        kow.isConnected.setTextColor(C33070mpX.copydefault(C28102kOz.Application.KWHzl));
        float fMeasureText = kow.AkhnZx.getPaint().measureText(str);
        float fMeasureText2 = kow.fetchVPNInfo.getPaint().measureText(strAYXKKw);
        pUU.KWHzl("WholeSaleVipRevampShareView", "bottomTitleWidth=" + fMeasureText + ";bottomDecWidth=" + fMeasureText2);
        float f = (float) 88;
        float f2 = (float) 7;
        float f3 = (float) 72;
        if (((((C55298xhM.dp2pxFloat$default(375.0f, null, 1, null) - (C55298xhM.dp2pxFloat$default(1.0f, null, 1, null) * f)) - (C55298xhM.dp2pxFloat$default(1.0f, null, 1, null) * f2)) - (18 * C55298xhM.dp2pxFloat$default(1.0f, null, 1, null))) - (fMeasureText2 + C55298xhM.dp2pxFloat$default(6.0f, null, 1, null))) - (C55298xhM.dp2pxFloat$default(1.0f, null, 1, null) * f3) < fMeasureText) {
            kow.OLrzqt.setVisibility(8);
            kow.fetchVPNInfo.setVisibility(8);
            kow.AYXKKw.setVisibility(0);
            kow.AkhnZx.setMaxWidth(C33129mqd.AhwBna(java.lang.Float.valueOf(((C55298xhM.dp2pxFloat$default(375.0f, null, 1, null) - (f * C55298xhM.dp2pxFloat$default(1.0f, null, 1, null))) - (f2 * C55298xhM.dp2pxFloat$default(1.0f, null, 1, null))) - (f3 * C55298xhM.dp2pxFloat$default(1.0f, null, 1, null)))));
            kow.AkhnZx.requestLayout();
        }
    }

    public final void EZpvd(java.lang.String str) {
        kOW kow = this.KWHzl;
        kow.AuCTel.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.uzCIH));
        C55051xce c55051xce = C55051xce.OLrzqt;
        android.graphics.Typeface typefaceDjBIcL = c55051xce.djBIcL();
        if (typefaceDjBIcL != null) {
            kow.AuCTel.setTypeface(typefaceDjBIcL);
        }
        kow.AuCTel.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        kow.DbNXlk.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.fARcdN));
        android.graphics.Typeface typefaceCopydefault = c55051xce.copydefault();
        if (typefaceCopydefault != null) {
            kow.DbNXlk.setTypeface(typefaceCopydefault);
        }
        kow.DbNXlk.setTextColor(C33070mpX.copydefault(C28102kOz.Application.KWHzl));
        C6995aZr.setContent$default(kow.valueOf, str, false, 8.0f, 2, (java.lang.Object) null);
        kow.AkhnZx.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.ejfBZ));
        kow.AkhnZx.setMaxLines(2);
        kow.AkhnZx.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        kow.isConnected.setText(str);
        kow.isConnected.setTextAppearance(C52761wXj.LoaderManager.zuWLRA);
        kow.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        kow.fJNWhG.setVisibility(8);
        kow.OLrzqt.setVisibility(8);
        kow.fetchVPNInfo.setVisibility(8);
    }
}
