package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52850waR extends android.widget.PopupWindow {
    public java.lang.String AEQbTJ;
    public C48329uNl EZpvd;
    public final android.content.Context KWHzl;
    public OKSortTextView.SortType OLrzqt;
    public Activity copydefault;

    /* JADX INFO: renamed from: o.waR$Activity */
    public interface Activity {
        void copydefault(@NotNull java.lang.String str, @NotNull OKSortTextView.SortType sortType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Activity activity) {
        this.copydefault = activity;
    }

    public C52850waR(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.AEQbTJ = "3d";
        this.OLrzqt = OKSortTextView.SortType.NONE;
        AEQbTJ();
        resetViewState$default(this, null, null, 3, null);
        C48329uNl c48329uNl = this.EZpvd;
        if (c48329uNl != null) {
            KWHzl(c48329uNl);
        }
        copydefault();
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull OKSortTextView.SortType sortType, android.view.View view) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        this.OLrzqt = sortType;
        this.AEQbTJ = str;
        showAsDropDown(view, 0, 0, 8388611);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i, int i2, int i3) {
        C48329uNl c48329uNl;
        CardView root;
        int iOLrzqt;
        if (view == null || (c48329uNl = this.EZpvd) == null || (root = c48329uNl.getRoot()) == null) {
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        boolean zOLrzqt = C55296xhK.OLrzqt(this.KWHzl);
        int iOLrzqt2 = C55302xhQ.OLrzqt(this.KWHzl);
        int i4 = iArr[0];
        if (zOLrzqt) {
            iOLrzqt = (root.getMeasuredWidth() - (iArr[0] + view.getWidth())) + C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
        } else {
            int measuredWidth = iOLrzqt2 - (i4 + root.getMeasuredWidth());
            if (measuredWidth < 0) {
                iOLrzqt = (measuredWidth + i) - C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
            } else {
                iOLrzqt = i - C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
            }
        }
        super.showAsDropDown(view, iOLrzqt, i2 + C55298xhM.copydefault(4.0f, this.KWHzl), i3);
    }

    public final void AEQbTJ() {
        this.EZpvd = C48329uNl.KWHzl(android.view.LayoutInflater.from(this.KWHzl), null, false);
    }

    public final void copydefault(android.view.View view, boolean z) {
        view.setSelected(z);
        if (z) {
            view.setBackgroundColor(ContextCompat.getColor(this.KWHzl, C32113mPz.ActionBar.fARcdN));
        } else {
            view.setBackgroundColor(ContextCompat.getColor(this.KWHzl, C32113mPz.ActionBar.RJOkX));
        }
    }

    public final void EZpvd(final android.widget.TextView textView, final java.lang.String str) {
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.waU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52850waR.OLrzqt(textView, this, str, view);
            }
        });
    }

    public static final void OLrzqt(android.widget.TextView textView, C52850waR c52850waR, java.lang.String str, android.view.View view) {
        if (textView.isSelected()) {
            return;
        }
        c52850waR.AEQbTJ = str;
        resetViewState$default(c52850waR, null, null, 3, null);
        c52850waR.EZpvd();
    }

    public final void OLrzqt(final ShapeableImageView shapeableImageView, final OKSortTextView.SortType sortType) {
        shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: o.waV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52850waR.KWHzl(shapeableImageView, this, sortType, view);
            }
        });
    }

    public static final void KWHzl(ShapeableImageView shapeableImageView, C52850waR c52850waR, OKSortTextView.SortType sortType, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        if (shapeableImageView.isSelected()) {
            return;
        }
        C48329uNl c48329uNl = c52850waR.EZpvd;
        if (c48329uNl != null && (linearLayout = c48329uNl.AEQbTJ) != null) {
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = linearLayout.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                if ((childAt instanceof ShapeableImageView) && !Intrinsics.EZpvd(childAt, shapeableImageView)) {
                    c52850waR.copydefault((ShapeableImageView) childAt, false);
                }
            }
        }
        c52850waR.copydefault(shapeableImageView, true);
        c52850waR.OLrzqt = sortType;
        c52850waR.EZpvd();
        c52850waR.dismiss();
    }

    public final void KWHzl(C48329uNl c48329uNl) {
        android.widget.TextView textView = c48329uNl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView, "3d");
        android.widget.TextView textView2 = c48329uNl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        EZpvd(textView2, "30d");
        android.widget.TextView textView3 = c48329uNl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        EZpvd(textView3, "90d");
        ShapeableImageView shapeableImageView = c48329uNl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        OLrzqt(shapeableImageView, OKSortTextView.SortType.NONE);
        ShapeableImageView shapeableImageView2 = c48329uNl.copydefault;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        OLrzqt(shapeableImageView2, OKSortTextView.SortType.DOWN);
        ShapeableImageView shapeableImageView3 = c48329uNl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
        OLrzqt(shapeableImageView3, OKSortTextView.SortType.UP);
    }

    public final void copydefault() {
        CardView root;
        C48329uNl c48329uNl = this.EZpvd;
        if (c48329uNl == null || (root = c48329uNl.getRoot()) == null) {
            return;
        }
        AEQbTJ(root);
        setContentView(root);
        setWidth(root.getMeasuredWidth());
        setHeight(root.getMeasuredHeight());
        setElevation(C55298xhM.EZpvd(20.0f, this.KWHzl));
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public static /* synthetic */ void resetViewState$default(C52850waR c52850waR, java.lang.String str, OKSortTextView.SortType sortType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c52850waR.AEQbTJ;
        }
        if ((i & 2) != 0) {
            sortType = c52850waR.OLrzqt;
        }
        c52850waR.AEQbTJ(str, sortType);
    }

    public final void AEQbTJ(java.lang.String str, OKSortTextView.SortType sortType) {
        C48329uNl c48329uNl = this.EZpvd;
        if (c48329uNl != null) {
            android.widget.TextView textView = c48329uNl.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            copydefault(textView, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "3d"));
            android.widget.TextView textView2 = c48329uNl.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            copydefault(textView2, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "30d"));
            android.widget.TextView textView3 = c48329uNl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            copydefault(textView3, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "90d"));
        }
        C48329uNl c48329uNl2 = this.EZpvd;
        if (c48329uNl2 != null) {
            ShapeableImageView shapeableImageView = c48329uNl2.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            copydefault(shapeableImageView, sortType == OKSortTextView.SortType.NONE);
            ShapeableImageView shapeableImageView2 = c48329uNl2.copydefault;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
            copydefault(shapeableImageView2, sortType == OKSortTextView.SortType.DOWN);
            ShapeableImageView shapeableImageView3 = c48329uNl2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView3, "");
            copydefault(shapeableImageView3, sortType == OKSortTextView.SortType.UP);
        }
    }

    public final void copydefault(ShapeableImageView shapeableImageView, boolean z) {
        C55280xgv c55280xgv = new C55280xgv();
        int i = C32113mPz.ActionBar.RJOkX;
        android.content.Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55280xgv c55280xgvValues = c55280xgv.values(C33070mpX.OLrzqt(i, context));
        c55280xgvValues.EZpvd(C55298xhM.dp2pxFloat$default(4.0f, null, 1, null));
        if (z) {
            c55280xgvValues.fetchVPNInfo(C55298xhM.dp2px$default(1.0f, null, 1, null));
            int i2 = C32113mPz.ActionBar.fIwbmz;
            android.content.Context context2 = shapeableImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c55280xgvValues.EZpvd(C33070mpX.copydefault(i2, context2));
        }
        c55280xgvValues.OLrzqt(shapeableImageView);
    }

    public final void EZpvd() {
        Activity activity = this.copydefault;
        if (activity != null) {
            activity.copydefault(this.AEQbTJ, this.OLrzqt);
        }
    }

    public final void AEQbTJ(android.view.View view) {
        C8124awn c8124awn = C8124awn.EZpvd;
        view.measure(View.MeasureSpec.makeMeasureSpec(c8124awn.copydefault(this.KWHzl), 0), View.MeasureSpec.makeMeasureSpec(c8124awn.OLrzqt(this.KWHzl), 0));
    }
}
