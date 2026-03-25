package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStatGraphItem;
import com.robinhood.ticker.TickerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.gWU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22359hdq extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C21665hHu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22359hdq(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: o.hdq.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C22359hdq(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22359hdq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21665hHu c21665hHuKWHzl = C21665hHu.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c21665hHuKWHzl, "");
        this.copydefault = c21665hHuKWHzl;
        TickerView tickerView = c21665hHuKWHzl.EZpvd;
        tickerView.setTypeface(ResourcesCompat.getFont(tickerView.getContext(), C52761wXj.Dialog.EZpvd));
        TickerView tickerView2 = c21665hHuKWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(tickerView2, "");
        tickerView2.setGravity(C55296xhK.AEQbTJ(tickerView2) ? 8388613 : 8388611);
    }

    /* JADX INFO: renamed from: o.hdq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hdq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void OLrzqt(@NotNull gWU gwu) {
        Intrinsics.checkNotNullParameter(gwu, "");
        if (gwu instanceof gWU.TaskDescription) {
            return;
        }
        if (gwu instanceof gWU.Activity) {
            gWU.Activity activity = (gWU.Activity) gwu;
            AEQbTJ(C23272hvB.KWHzl.KWHzl(activity.copydefault()));
            EZpvd(!C59449zhJ.startsWith$default(activity.copydefault(), "-", false, 2, null), activity.OLrzqt().getCopyTradeStatGraphList());
        } else {
            if (!(gwu instanceof gWU.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ();
        }
    }

    private final void AEQbTJ() {
        this.copydefault.EZpvd.setText("--");
        EZpvd();
    }

    public final void EZpvd() {
        C29255kqG c29255kqG = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c29255kqG, "");
        c29255kqG.setVisibility(8);
    }

    public final void AEQbTJ(java.lang.String str) {
        android.content.Context context = this.copydefault.getRoot().getContext();
        if (context == null) {
            return;
        }
        int length = str.length();
        float fGEmmrt = C55298xhM.gEmmrt(36.0f, context);
        float fGEmmrt2 = C55298xhM.gEmmrt(14.0f, context);
        float fGEmmrt3 = C55298xhM.gEmmrt(java.lang.Math.max(2.0f - (length * 0.05f), 0.05f), context);
        int measuredWidth = this.copydefault.copydefault.getMeasuredWidth();
        int iCopydefault = C55298xhM.copydefault(24.0f, context) * 2;
        int iCopydefault2 = C55298xhM.copydefault(20.0f, context) + iCopydefault + measuredWidth;
        int iOLrzqt = C55302xhQ.OLrzqt(context) - iCopydefault2;
        android.text.TextPaint textPaint = new android.text.TextPaint(this.copydefault.EZpvd.uzCIH);
        textPaint.setTextSize(fGEmmrt2);
        float fMeasureText = textPaint.measureText(str);
        if (iOLrzqt < iCopydefault2 || fMeasureText > iOLrzqt) {
            iOLrzqt += iCopydefault2 - iCopydefault;
        }
        textPaint.setTextSize(fGEmmrt);
        float fMeasureText2 = textPaint.measureText(str);
        while (fMeasureText2 > iOLrzqt && fGEmmrt > fGEmmrt2) {
            fGEmmrt = java.lang.Math.max(fGEmmrt - fGEmmrt3, fGEmmrt2);
            textPaint.setTextSize(fGEmmrt);
            fMeasureText2 = textPaint.measureText(str);
        }
        this.copydefault.EZpvd.setTextSize(fGEmmrt);
        this.copydefault.EZpvd.requestLayout();
        this.copydefault.EZpvd.setText(str, true);
    }

    public final void EZpvd(boolean z, java.util.List<CopyTradeStatGraphItem> list) {
        int iTradeFallGraph$default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(C33129mqd.djBIcL(((CopyTradeStatGraphItem) it.next()).getTotalPnLUsdValue())));
        }
        C29255kqG c29255kqG = this.copydefault.copydefault;
        Intrinsics.copydefault(c29255kqG);
        c29255kqG.setVisibility(arrayList.isEmpty() ^ true ? 0 : 8);
        if (z) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c29255kqG.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeFallGraph$default = C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = c29255kqG.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeFallGraph$default = C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        android.content.Context context3 = c29255kqG.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c29255kqG.setShadowLine(C55298xhM.EZpvd(1.5f, context3), iTradeFallGraph$default);
        c29255kqG.setData(arrayList);
    }
}
