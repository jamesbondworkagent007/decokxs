package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27265jrt extends ConstraintLayout {
    public View.OnClickListener KWHzl;
    public iMW OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.KWHzl = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27265jrt(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27265jrt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27265jrt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        iMW imwEZpvd = iMW.EZpvd(android.view.LayoutInflater.from(getContext()), this, false);
        this.OLrzqt = imwEZpvd;
        iMW imw = null;
        if (imwEZpvd == null) {
            Intrinsics.gEmmrt("");
            imwEZpvd = null;
        }
        addView(imwEZpvd.getRoot());
        iMW imw2 = this.OLrzqt;
        if (imw2 == null) {
            Intrinsics.gEmmrt("");
            imw2 = null;
        }
        imw2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27265jrt.AEQbTJ(this.EZpvd, view);
            }
        });
        iMW imw3 = this.OLrzqt;
        if (imw3 == null) {
            Intrinsics.gEmmrt("");
            imw3 = null;
        }
        imw3.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.jrx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27265jrt.copydefault(this.copydefault, view);
            }
        });
        iMW imw4 = this.OLrzqt;
        if (imw4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imw = imw4;
        }
        imw.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.jry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27265jrt.gEmmrt(this.EZpvd, view);
            }
        });
    }

    public static final void AEQbTJ(C27265jrt c27265jrt, android.view.View view) {
        View.OnClickListener onClickListener = c27265jrt.KWHzl;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void copydefault(C27265jrt c27265jrt, android.view.View view) {
        View.OnClickListener onClickListener = c27265jrt.KWHzl;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void gEmmrt(C27265jrt c27265jrt, android.view.View view) {
        View.OnClickListener onClickListener = c27265jrt.KWHzl;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iMW imw = this.OLrzqt;
        if (imw == null) {
            Intrinsics.gEmmrt("");
            imw = null;
        }
        imw.AEQbTJ.setText(str);
    }

    public final void setData(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        iMW imw = null;
        if (z) {
            iMW imw2 = this.OLrzqt;
            if (imw2 == null) {
                Intrinsics.gEmmrt("");
                imw2 = null;
            }
            imw2.OLrzqt.setText("");
            iMW imw3 = this.OLrzqt;
            if (imw3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imw = imw3;
            }
            imw.EZpvd.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, "0", null, null, null, 14, null));
            return;
        }
        if (z2) {
            iMW imw4 = this.OLrzqt;
            if (imw4 == null) {
                Intrinsics.gEmmrt("");
                imw4 = null;
            }
            imw4.OLrzqt.setText("--");
            iMW imw5 = this.OLrzqt;
            if (imw5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                imw = imw5;
            }
            imw.EZpvd.setText("--");
            return;
        }
        iMW imw6 = this.OLrzqt;
        if (imw6 == null) {
            Intrinsics.gEmmrt("");
            imw6 = null;
        }
        android.widget.TextView textView = imw6.OLrzqt;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C33069mpW.KWHzl(context, C25493ixk.FragmentManager.invokespecialhlXVux, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str))));
        iMW imw7 = this.OLrzqt;
        if (imw7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imw = imw7;
        }
        imw.EZpvd.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, str2, null, null, null, 14, null));
    }
}
