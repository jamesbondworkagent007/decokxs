package com.okinc.core.widget.tipswindow;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.widget.PopupWindowCompat;
import o.C52761wXj;
import o.C55296xhK;
import o.C55302xhQ;
import o.mAF;

/* JADX INFO: loaded from: classes8.dex */
public class AnchorPopupWindow extends PopupWindow {
    public FrameLayout KWHzl;
    public View OLrzqt;
    public View copydefault;

    public enum Style {
        Gray,
        Blue
    }

    public static int EZpvd(int i) {
        return i != -2 ? 1073741824 : 0;
    }

    public enum VerticalPosition {
        CENTER(0),
        ABOVE(1),
        BELOW(2),
        ALIGN_TOP(3),
        ALIGN_BOTTOM(4);

        private int value;

        VerticalPosition(int i) {
            this.value = i;
        }
    }

    public enum HorizontalPosition {
        CENTER(0),
        LEFT(1),
        RIGHT(2),
        ALIGN_LEFT(3),
        ALIGN_RIGHT(4);

        private int value;

        HorizontalPosition(int i) {
            this.value = i;
        }
    }

    public AnchorPopupWindow(Context context) {
        super(context);
    }

    public AnchorPopupWindow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnchorPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnchorPopupWindow() {
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (this.KWHzl == null) {
            View viewInflate = LayoutInflater.from(view.getContext()).inflate(C52761wXj.Fragment.accept, (ViewGroup) null, false);
            this.OLrzqt = viewInflate;
            viewInflate.setContentDescription("OKToolTips");
            this.KWHzl = (FrameLayout) this.OLrzqt.findViewById(C52761wXj.FragmentManager.QbewEr);
            this.copydefault = this.OLrzqt.findViewById(C52761wXj.FragmentManager.copydefault);
            super.setContentView(this.OLrzqt);
        }
        if (this.KWHzl.getChildCount() > 0) {
            this.KWHzl.removeAllViews();
        }
        this.KWHzl.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public void AEQbTJ(boolean z) {
        this.copydefault.setVisibility(z ? 0 : 8);
    }

    public void KWHzl(@NonNull View view, Style style, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition) {
        OLrzqt(view, style, verticalPosition, horizontalPosition, 0, 0);
    }

    public void copydefault(@NonNull View view, Style style, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition, boolean z) {
        AEQbTJ(view, style, verticalPosition, horizontalPosition, 0, 0, z);
    }

    public void OLrzqt(@NonNull View view, Style style, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition, int i, int i2) {
        AEQbTJ(view, style, verticalPosition, horizontalPosition, i, i2, true);
    }

    public void AEQbTJ(@NonNull final View view, final Style style, final VerticalPosition verticalPosition, final HorizontalPosition horizontalPosition, final int i, final int i2, final boolean z) {
        setClippingEnabled(z);
        View contentView = getContentView();
        setWidth(-2);
        setHeight(-2);
        contentView.measure(KWHzl(getWidth()), KWHzl(getHeight()));
        int measuredWidth = contentView.getMeasuredWidth();
        int measuredHeight = contentView.getMeasuredHeight();
        KWHzl(this.copydefault, verticalPosition, horizontalPosition, view, contentView, style);
        int[] iArrAEQbTJ = AEQbTJ(view, measuredHeight, measuredWidth, verticalPosition, horizontalPosition, i, i2, z);
        if (z) {
            PopupWindowCompat.showAsDropDown(this, view, iArrAEQbTJ[0], iArrAEQbTJ[1] + C55302xhQ.AEQbTJ(this.copydefault.getContext()), 0);
        } else {
            showAtLocation(view, 0, iArrAEQbTJ[0], iArrAEQbTJ[1]);
        }
        OLrzqt(contentView, new Runnable() { // from class: o.mAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.EZpvd.OLrzqt(view, verticalPosition, horizontalPosition, i, i2, z, style);
            }
        });
    }

    public final /* synthetic */ void OLrzqt(View view, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition, int i, int i2, boolean z, Style style) {
        if (!isShowing() || getContentView() == null) {
            return;
        }
        int width = getContentView().getWidth();
        int height = getContentView().getHeight();
        int[] iArrAEQbTJ = AEQbTJ(view, height, width, verticalPosition, horizontalPosition, i, i2, z);
        KWHzl(this.copydefault, verticalPosition, horizontalPosition, view, getContentView(), style);
        update(view, iArrAEQbTJ[0], iArrAEQbTJ[1], width, height);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[PHI: r6
  0x0061: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:17:0x0044, B:26:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] AEQbTJ(@NonNull View view, int i, int i2, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition, int i3, int i4, boolean z) {
        int i5;
        int width;
        if (!z) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            i3 += iArr[0];
            i4 += iArr[1] + view.getHeight();
        }
        int i6 = AnonymousClass4.AEQbTJ[verticalPosition.ordinal()];
        if (i6 == 1) {
            i += view.getHeight();
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    i4 -= (view.getHeight() / 2) + (i / 2);
                } else if (i6 == 4) {
                    i = view.getHeight();
                }
            }
            i5 = AnonymousClass4.KWHzl[horizontalPosition.ordinal()];
            if (i5 == 1) {
                i3 -= i2;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    width = (view.getWidth() / 2) - (i2 / 2);
                } else if (i5 == 5) {
                    width = view.getWidth();
                }
                i3 += width;
            } else {
                i2 -= view.getWidth();
                i3 -= i2;
            }
            return new int[]{i3, i4};
        }
        i4 -= i;
        i5 = AnonymousClass4.KWHzl[horizontalPosition.ordinal()];
        if (i5 == 1) {
        }
        return new int[]{i3, i4};
    }

    /* JADX INFO: renamed from: com.okinc.core.widget.tipswindow.AnchorPopupWindow$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[HorizontalPosition.values().length];
            KWHzl = iArr;
            try {
                iArr[HorizontalPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[HorizontalPosition.ALIGN_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KWHzl[HorizontalPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KWHzl[HorizontalPosition.ALIGN_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KWHzl[HorizontalPosition.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[VerticalPosition.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[VerticalPosition.ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[VerticalPosition.ALIGN_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[VerticalPosition.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AEQbTJ[VerticalPosition.ALIGN_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[VerticalPosition.BELOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(View view, VerticalPosition verticalPosition, HorizontalPosition horizontalPosition, View view2, View view3, Style style) {
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.hDKMBd);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.flVtFt);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = -1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.KWHzl.getLayoutParams();
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view3.getLocationOnScreen(iArr2);
        int width = (iArr[0] + (view2.getWidth() / 2)) - iArr2[0];
        int i = AnonymousClass4.AEQbTJ[verticalPosition.ordinal()];
        if (i == 1) {
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = 0;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
        } else if (i == 2) {
            layoutParams.gravity = 80;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
        } else if (i == 3) {
            layoutParams.gravity = 16;
        } else if (i == 4) {
            layoutParams.gravity = 48;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
        } else if (i == 5) {
            layoutParams.topMargin = 0;
            layoutParams.gravity = 48;
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = 0;
        }
        int i2 = AnonymousClass4.KWHzl[horizontalPosition.ordinal()];
        if (i2 == 1) {
            layoutParams.gravity |= 8388611;
            layoutParams.setMarginStart((width - dimensionPixelSize2) - (dimensionPixelSize / 2));
        } else if (i2 == 2) {
            layoutParams.gravity |= 8388613;
            layoutParams.setMarginEnd(view3.getWidth() - ((width + dimensionPixelSize2) + (dimensionPixelSize / 2)));
        } else if (i2 == 3) {
            layoutParams.gravity |= 1;
        } else if (i2 != 4) {
            if (i2 == 5) {
            }
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(mAF.EZpvd(layoutParams.width, layoutParams.height, !(verticalPosition == VerticalPosition.ALIGN_TOP || verticalPosition == VerticalPosition.ABOVE)));
        Paint paint = shapeDrawable.getPaint();
        if (style == Style.Blue) {
            paint.setColor(resources.getColor(C52761wXj.Activity.DcMfJKOmnske));
            this.KWHzl.setBackgroundResource(C52761wXj.TaskDescription.SdSTJp);
        } else {
            this.KWHzl.setBackgroundResource(C52761wXj.TaskDescription.DdI);
            paint.setColor(resources.getColor(C52761wXj.Activity.svY));
        }
        paint.setPathEffect(new CornerPathEffect(0));
        view.setBackground(shapeDrawable);
        view.setLayoutParams(layoutParams);
        this.KWHzl.setLayoutParams(layoutParams2);
    }

    public final void AEQbTJ(View view, View view2, VerticalPosition verticalPosition, int i, int i2, Style style) {
        boolean z;
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C52761wXj.StateListAnimator.AwvSrB);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = -1;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int width = view2.getWidth() / 2;
        int i4 = dimensionPixelSize / 2;
        if (AnonymousClass4.AEQbTJ[verticalPosition.ordinal()] == 1) {
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = i2;
            z = true;
        } else {
            layoutParams.topMargin = i2;
            layoutParams.gravity = 48;
            z = false;
        }
        layoutParams.leftMargin = ((i3 + width) - i4) + i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(mAF.EZpvd(layoutParams.width, layoutParams.height, !z));
        Paint paint = shapeDrawable.getPaint();
        if (style == Style.Blue) {
            paint.setColor(resources.getColor(C52761wXj.Activity.DcMfJKOmnske));
            this.KWHzl.setBackgroundResource(C52761wXj.TaskDescription.SdSTJp);
        } else {
            this.KWHzl.setBackgroundResource(C52761wXj.TaskDescription.DdI);
            paint.setColor(resources.getColor(C52761wXj.Activity.svY));
        }
        paint.setPathEffect(new CornerPathEffect(0));
        view.setBackground(shapeDrawable);
        view.setLayoutParams(layoutParams);
    }

    public void KWHzl(View view, VerticalPosition verticalPosition, int i, int i2, int i3, int i4, Rect rect, Rect rect2, int[] iArr, Style style) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("locationOff->param的size必须大于2");
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        FrameLayout frameLayout = this.KWHzl;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (AnonymousClass4.AEQbTJ[verticalPosition.ordinal()] == 1) {
                layoutParams.gravity = i3 | 48;
            } else {
                layoutParams.gravity = i3 | 80;
            }
            C55296xhK.AEQbTJ(layoutParams, rect.left, rect.top, rect.right, rect.bottom);
            this.KWHzl.setPaddingRelative(rect2.left, rect2.top, rect2.right, rect2.bottom);
            this.KWHzl.setLayoutParams(layoutParams);
        }
        getContentView().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setWidth(getContentView().getMeasuredWidth());
        setHeight(getContentView().getMeasuredHeight() + this.copydefault.getMeasuredHeight());
        AEQbTJ(this.copydefault, view, verticalPosition, i, i2, style);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.flVtFt);
        try {
            if (AnonymousClass4.AEQbTJ[verticalPosition.ordinal()] == 1) {
                showAtLocation(view, i4 | 48, iArr[0], ((iArr2[1] - getHeight()) - dimensionPixelSize) - iArr[1]);
            } else {
                showAtLocation(view, i4 | 48, iArr[0], iArr2[1] + view.getMeasuredHeight() + dimensionPixelSize + iArr[1]);
            }
        } catch (Exception e) {
            getClass().getSimpleName();
            e.toString();
        }
    }

    public static int KWHzl(int i) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), EZpvd(i));
    }

    public final void OLrzqt(final View view, final Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.okinc.core.widget.tipswindow.AnchorPopupWindow.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                AnchorPopupWindow.this.isShowing();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }
}
