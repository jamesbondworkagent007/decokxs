package o;

import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57453yih extends android.widget.LinearLayout {
    public C57455yij AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57453yih(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57453yih(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:11) call: o.yih.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57453yih(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57453yih(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57455yij c57455yijOLrzqt = C57455yij.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57455yijOLrzqt, "");
        this.AEQbTJ = c57455yijOLrzqt;
        setOrientation(1);
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView EZpvd() {
        android.widget.TextView textView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setViewDataBean(@NotNull TransactionAddressInfoBean transactionAddressInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAddressInfoBean, "");
        setHeaderTitleInfo(transactionAddressInfoBean.getHeaderTitle());
        setContentInfo(transactionAddressInfoBean.getContentInfo());
    }

    public final void setHeaderTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55307xhV.AEQbTJ(AEQbTJ(), str);
    }

    public final void setContentInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        C55307xhV.AEQbTJ(EZpvd(), charSequence);
    }
}
