package o;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48010uBq extends ConstraintLayout {
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48010uBq(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C49511upt.StateListAnimator.QOLQEE, (android.view.ViewGroup) this, true);
        setBackgroundResource(C49511upt.TaskDescription.djBIcL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        setLayoutParams(layoutParams);
        this.OLrzqt = (android.widget.TextView) findViewById(C49511upt.Application.spnCvw);
        this.KWHzl = (android.widget.TextView) findViewById(C49511upt.Application.ixgjPv);
    }

    public final void setPopText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.OLrzqt.setText(charSequence);
        this.OLrzqt.setMaxLines(1);
        this.OLrzqt.setEllipsize(TextUtils.TruncateAt.END);
        post(new java.lang.Runnable() { // from class: o.uBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48010uBq.KWHzl(this.KWHzl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(C48010uBq c48010uBq) {
        int i = -c48010uBq.getHeight();
        ViewGroup.LayoutParams layoutParams = c48010uBq.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            c48010uBq.setLayoutParams(marginLayoutParams);
            c48010uBq.setVisibility(0);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setPopText(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (charSequence.length() == 0 && charSequence2.length() == 0) {
            return;
        }
        if (C33129mqd.OLrzqt(charSequence)) {
            this.OLrzqt.setVisibility(0);
            this.OLrzqt.setText(charSequence);
        } else {
            this.OLrzqt.setVisibility(8);
        }
        if (C33129mqd.OLrzqt(charSequence2)) {
            this.KWHzl.setVisibility(0);
            this.KWHzl.setText(charSequence2);
        } else {
            this.KWHzl.setVisibility(8);
        }
        this.OLrzqt.setMaxLines(3);
        android.widget.TextView textView = this.OLrzqt;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.KWHzl.setMaxLines(3);
        this.KWHzl.setEllipsize(truncateAt);
        post(new java.lang.Runnable() { // from class: o.uBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C48010uBq.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(C48010uBq c48010uBq) {
        int i = -c48010uBq.getHeight();
        ViewGroup.LayoutParams layoutParams = c48010uBq.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            c48010uBq.setLayoutParams(marginLayoutParams);
            c48010uBq.setVisibility(0);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
