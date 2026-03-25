package o;

import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51998vxb extends C55258xgZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public uXT AEQbTJ;
    public java.lang.String EZpvd;
    public int OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51998vxb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51998vxb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.vxb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51998vxb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51998vxb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "";
        this.copydefault = "";
        this.OLrzqt = 2;
        uXT uxt = (uXT) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.QiTXOm, this, false);
        this.AEQbTJ = uxt;
        uxt.EZpvd.setText("...");
        android.view.View viewOLrzqt = OLrzqt();
        if (viewOLrzqt != null) {
            viewOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.vwY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51998vxb.copydefault(this.AEQbTJ, view);
                }
            });
        }
        if (C55296xhK.OLrzqt(context)) {
            this.AEQbTJ.getRoot().setLayoutDirection(1);
        } else {
            this.AEQbTJ.getRoot().setLayoutDirection(0);
        }
        setAttachingView(this.AEQbTJ.getRoot());
        setAttachmentViewVisibility(false);
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setOnClickListener(new View.OnClickListener() { // from class: o.vwZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51998vxb.AEQbTJ(this.EZpvd, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.vxb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vxb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final void copydefault(C51998vxb c51998vxb, android.view.View view) {
        c51998vxb.EZpvd();
    }

    public static final void AEQbTJ(C51998vxb c51998vxb, android.view.View view) {
        c51998vxb.EZpvd();
    }

    public static /* synthetic */ void setText$default(C51998vxb c51998vxb, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        c51998vxb.setText(str, i);
    }

    public final void setText(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        setTextValue(str);
        this.EZpvd = str;
        this.OLrzqt = i;
        fIwbmz();
    }

    private final void fIwbmz() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        java.lang.String str = this.EZpvd;
        android.text.TextPaint paint = c55320xhiKWHzl.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        android.text.StaticLayout staticLayoutKWHzl = KWHzl(str, paint);
        int lineCount = staticLayoutKWHzl.getLineCount();
        int i = this.OLrzqt;
        if (lineCount > i) {
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                int lineEnd = staticLayoutKWHzl.getLineEnd(i3);
                java.lang.String str2 = this.copydefault;
                java.lang.CharSequence text = c55320xhiKWHzl.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                this.copydefault = str2 + text.subSequence(i2, lineEnd).toString();
                i3++;
                i2 = lineEnd;
            }
            java.lang.String strSubstring = this.copydefault.substring(i2 - 5, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String string = StringsKt__StringsKt.copydefault(this.copydefault, i2 - (copydefault(strSubstring) < 3 ? 7 : 3), i2).toString();
            this.copydefault = string;
            c55320xhiKWHzl.setText(string);
            c55320xhiKWHzl.setShowAttachmentView(true);
            AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            this.AEQbTJ.AEQbTJ.setSelected(false);
            if (Build.VERSION.SDK_INT >= 29) {
                c55320xhiKWHzl.setBreakStrategy(0);
            }
        }
    }

    public final int copydefault(java.lang.String str) {
        int i = 0;
        while (Pattern.compile("[一-龥]").matcher(str).find()) {
            i++;
        }
        return i;
    }

    public final android.text.StaticLayout KWHzl(java.lang.String str, android.text.TextPaint textPaint) {
        return new android.text.StaticLayout(str, 0, str.length(), textPaint, C33570myu.djBIcL(getContext()) - C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, 0);
    }

    public final void EZpvd() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null || !c55320xhiKWHzl.OLrzqt()) {
            return;
        }
        boolean zIsSelected = this.AEQbTJ.AEQbTJ.isSelected();
        this.AEQbTJ.AEQbTJ.setSelected(!zIsSelected);
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zIsSelected ? 0 : 8);
        setText(zIsSelected ? this.copydefault : this.EZpvd);
        setAttachingView(this.AEQbTJ.getRoot());
    }
}
