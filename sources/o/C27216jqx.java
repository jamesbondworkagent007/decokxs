package o;

import android.text.Layout;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27216jqx extends android.widget.FrameLayout {
    public int AEQbTJ;
    public final C23878iMr AYXKKw;
    public android.text.DynamicLayout EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27216jqx(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27216jqx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.jqx.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27216jqx(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27216jqx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23878iMr c23878iMrEZpvd = C23878iMr.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c23878iMrEZpvd, "");
        this.AYXKKw = c23878iMrEZpvd;
        this.copydefault = 3;
        this.OLrzqt = "";
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.AYXKKw.copydefault.setMaxLines(this.copydefault);
        this.AYXKKw.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.jqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27216jqx.EZpvd(this.copydefault, view);
            }
        });
    }

    public static final void EZpvd(C27216jqx c27216jqx, android.view.View view) {
        c27216jqx.KWHzl = !c27216jqx.KWHzl;
        c27216jqx.AYXKKw.copydefault.setText(c27216jqx.OLrzqt);
        if (c27216jqx.KWHzl) {
            c27216jqx.AYXKKw.copydefault.setMaxLines(Integer.MAX_VALUE);
            c27216jqx.AYXKKw.OLrzqt.setRotation(180.0f);
        } else {
            c27216jqx.AYXKKw.copydefault.setMaxLines(c27216jqx.copydefault);
            c27216jqx.AYXKKw.OLrzqt.setRotation(0.0f);
        }
    }

    public final void setContent(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AYXKKw.copydefault.setText(str);
        if (getWidth() <= 0) {
            post(new java.lang.Runnable() { // from class: o.jqy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.AEQbTJ.OLrzqt(str);
                }
            });
        } else {
            OLrzqt(str);
        }
    }

    public final void AEQbTJ(int i) {
        this.copydefault = i;
        this.AYXKKw.copydefault.setMaxLines(i);
    }

    public final void OLrzqt(java.lang.String str) {
        this.OLrzqt = str;
        android.text.DynamicLayout dynamicLayout = new android.text.DynamicLayout(str, this.AYXKKw.copydefault.getPaint(), getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.2f, 0.0f, true);
        this.EZpvd = dynamicLayout;
        Intrinsics.copydefault(dynamicLayout);
        this.AEQbTJ = dynamicLayout.getLineCount();
        android.widget.ImageView imageView = this.AYXKKw.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(this.AEQbTJ > this.copydefault ? 0 : 8);
    }
}
