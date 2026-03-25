package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C27275jsC;
import o.C27278jsF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27282jsJ extends android.widget.FrameLayout {
    public final int AEQbTJ;
    public C27275jsC AYXKKw;
    public android.widget.ImageView AhwBna;
    public android.widget.ImageView AkhnZx;
    public final int EZpvd;
    public final java.util.ArrayList<AbstractC27276jsD> KWHzl;
    public android.widget.LinearLayout OLrzqt;
    public TaskDescription copydefault;
    public final android.os.Handler djBIcL;
    public android.view.View gEmmrt;
    public android.widget.HorizontalScrollView valueOf;

    /* JADX INFO: renamed from: o.jsJ$TaskDescription */
    public interface TaskDescription {
        void OLrzqt();

        void copydefault();

        void copydefault(android.text.Editable editable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC27276jsD> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnChipListener(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.copydefault = taskDescription;
    }

    /* JADX INFO: renamed from: o.jsJ$Activity */
    public static final class Activity extends android.os.Handler {
        public Activity(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            int i = message.what;
            if (i == C27282jsJ.this.AEQbTJ) {
                C27282jsJ.this.AhwBna();
                return;
            }
            if (i == C27282jsJ.this.EZpvd) {
                int i2 = C55296xhK.AEQbTJ(C27282jsJ.this) ? 17 : 66;
                android.widget.HorizontalScrollView horizontalScrollView = C27282jsJ.this.valueOf;
                if (horizontalScrollView == null) {
                    Intrinsics.gEmmrt("");
                    horizontalScrollView = null;
                }
                horizontalScrollView.fullScroll(i2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27282jsJ(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27282jsJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27282jsJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new java.util.ArrayList<>();
        this.AEQbTJ = 10;
        this.EZpvd = 11;
        this.djBIcL = new Activity(android.os.Looper.getMainLooper());
        djBIcL();
        OLrzqt(context, attributeSet);
    }

    public final void djBIcL() {
        android.view.View.inflate(getContext(), C25493ixk.Activity.DPhTBN, this);
        this.AkhnZx = (android.widget.ImageView) findViewById(C25493ixk.ActionBar.zeUYeG);
        this.OLrzqt = (android.widget.LinearLayout) findViewById(C25493ixk.ActionBar.QwvEab);
        this.valueOf = (android.widget.HorizontalScrollView) findViewById(C25493ixk.ActionBar.hdBMmm);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C25493ixk.ActionBar.dlRikr);
        this.AhwBna = imageView;
        android.view.View view = null;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.jsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C27282jsJ.copydefault(this.AEQbTJ, view2);
            }
        });
        android.view.View viewFindViewById = findViewById(C25493ixk.ActionBar.frkDMe);
        this.gEmmrt = viewFindViewById;
        if (viewFindViewById == null) {
            Intrinsics.gEmmrt("");
        } else {
            view = viewFindViewById;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: o.jsK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C27282jsJ.djBIcL(this.EZpvd, view2);
            }
        });
        OLrzqt();
    }

    public static final void copydefault(C27282jsJ c27282jsJ, android.view.View view) {
        c27282jsJ.copydefault();
    }

    public static final void djBIcL(C27282jsJ c27282jsJ, android.view.View view) {
        c27282jsJ.djBIcL.sendEmptyMessage(c27282jsJ.EZpvd);
        C27275jsC c27275jsC = c27282jsJ.AYXKKw;
        C27275jsC c27275jsC2 = null;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        C27275jsC c27275jsC3 = c27282jsJ.AYXKKw;
        if (c27275jsC3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC2 = c27275jsC3;
        }
        android.text.Editable text = c27275jsC2.getText();
        c27275jsC.setSelection(text != null ? text.length() : 0);
        c27282jsJ.valueOf();
        c27282jsJ.AYXKKw();
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        C27275jsC c27275jsC = null;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() > 1) {
            android.widget.LinearLayout linearLayout2 = this.OLrzqt;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
                linearLayout2 = null;
            }
            android.widget.LinearLayout linearLayout3 = this.OLrzqt;
            if (linearLayout3 == null) {
                Intrinsics.gEmmrt("");
                linearLayout3 = null;
            }
            linearLayout2.removeViews(0, linearLayout3.getChildCount() - 1);
        }
        this.KWHzl.clear();
        C27275jsC c27275jsC2 = this.AYXKKw;
        if (c27275jsC2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC = c27275jsC2;
        }
        c27275jsC.setText("");
        TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null) {
            taskDescription.copydefault();
        }
        AYXKKw();
    }

    public final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C25493ixk.PendingIntent.AYXKKw);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                setEnable(typedArrayObtainStyledAttributes.getBoolean(C25493ixk.PendingIntent.djBIcL, true));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final void OLrzqt() {
        C27275jsC c27275jsC = (C27275jsC) findViewById(C25493ixk.ActionBar.DIIpTV);
        this.AYXKKw = c27275jsC;
        C27275jsC c27275jsC2 = null;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        c27275jsC.setSelection(0);
        C27275jsC c27275jsC3 = this.AYXKKw;
        if (c27275jsC3 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC3 = null;
        }
        c27275jsC3.setFilters(new C27279jsG[]{new C27279jsG(10)});
        C27275jsC c27275jsC4 = this.AYXKKw;
        if (c27275jsC4 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC4 = null;
        }
        c27275jsC4.addTextChangedListener(new Application());
        C27275jsC c27275jsC5 = this.AYXKKw;
        if (c27275jsC5 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC5 = null;
        }
        c27275jsC5.setOnKeyboardListener(new StateListAnimator());
        C27275jsC c27275jsC6 = this.AYXKKw;
        if (c27275jsC6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC2 = c27275jsC6;
        }
        c27275jsC2.setOnClickListener(new View.OnClickListener() { // from class: o.jsH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27282jsJ.AEQbTJ(this.copydefault, view);
            }
        });
    }

    /* JADX INFO: renamed from: o.jsJ$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C27282jsJ.this.gEmmrt();
            C27282jsJ.this.valueOf();
            C27275jsC c27275jsC = C27282jsJ.this.AYXKKw;
            if (c27275jsC == null) {
                Intrinsics.gEmmrt("");
                c27275jsC = null;
            }
            c27275jsC.setCursorVisible(true);
            TaskDescription taskDescription = C27282jsJ.this.copydefault;
            if (taskDescription != null) {
                taskDescription.copydefault(editable);
            }
            C27282jsJ.this.djBIcL.sendEmptyMessage(C27282jsJ.this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.jsJ$StateListAnimator */
    public static final class StateListAnimator implements C27275jsC.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C27275jsC.StateListAnimator
        public void AEQbTJ() {
            C27275jsC c27275jsC = C27282jsJ.this.AYXKKw;
            C27275jsC c27275jsC2 = null;
            if (c27275jsC == null) {
                Intrinsics.gEmmrt("");
                c27275jsC = null;
            }
            android.text.Editable text = c27275jsC.getText();
            if (text == null || text.length() == 0) {
                android.widget.LinearLayout linearLayout = C27282jsJ.this.OLrzqt;
                if (linearLayout == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout = null;
                }
                if (linearLayout.getChildCount() <= 1) {
                    return;
                }
                android.widget.LinearLayout linearLayout2 = C27282jsJ.this.OLrzqt;
                if (linearLayout2 == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout2 = null;
                }
                android.widget.LinearLayout linearLayout3 = C27282jsJ.this.OLrzqt;
                if (linearLayout3 == null) {
                    Intrinsics.gEmmrt("");
                    linearLayout3 = null;
                }
                android.view.View view = ViewGroupKt.get(linearLayout2, linearLayout3.getChildCount() - 2);
                Intrinsics.copydefault(view, "");
                C27278jsF c27278jsF = (C27278jsF) view;
                if (c27278jsF.isSelected()) {
                    C27282jsJ.this.KWHzl(c27278jsF);
                    C27275jsC c27275jsC3 = C27282jsJ.this.AYXKKw;
                    if (c27275jsC3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c27275jsC2 = c27275jsC3;
                    }
                    c27275jsC2.setCursorVisible(true);
                    return;
                }
                c27278jsF.setSelected(true);
                C27275jsC c27275jsC4 = C27282jsJ.this.AYXKKw;
                if (c27275jsC4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c27275jsC2 = c27275jsC4;
                }
                c27275jsC2.setCursorVisible(false);
            }
        }

        @Override // o.C27275jsC.StateListAnimator
        public void copydefault(java.lang.String str) {
            TaskDescription taskDescription = C27282jsJ.this.copydefault;
            if (taskDescription != null) {
                taskDescription.OLrzqt();
            }
        }
    }

    public static final void AEQbTJ(C27282jsJ c27282jsJ, android.view.View view) {
        c27282jsJ.valueOf();
        c27282jsJ.AYXKKw();
    }

    public final void AYXKKw() {
        C27275jsC c27275jsC = this.AYXKKw;
        C27275jsC c27275jsC2 = null;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        c27275jsC.setCursorVisible(true);
        android.content.Context context = getContext();
        C27275jsC c27275jsC3 = this.AYXKKw;
        if (c27275jsC3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC2 = c27275jsC3;
        }
        C33570myu.AEQbTJ(context, (android.widget.EditText) c27275jsC2);
    }

    public final void AEQbTJ() {
        C27275jsC c27275jsC = this.AYXKKw;
        C27275jsC c27275jsC2 = null;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        c27275jsC.setCursorVisible(false);
        android.content.Context context = getContext();
        C27275jsC c27275jsC3 = this.AYXKKw;
        if (c27275jsC3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC2 = c27275jsC3;
        }
        C33570myu.AEQbTJ(context, (android.view.View) c27275jsC2);
    }

    public final android.widget.EditText KWHzl() {
        C27275jsC c27275jsC = this.AYXKKw;
        if (c27275jsC != null) {
            return c27275jsC;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void AhwBna() {
        C27275jsC c27275jsC = this.AYXKKw;
        C27275jsC c27275jsC2 = null;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        C27275jsC c27275jsC3 = this.AYXKKw;
        if (c27275jsC3 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC3 = null;
        }
        int iKWHzl = (int) c27275jsC.KWHzl(java.lang.String.valueOf(c27275jsC3.getText()));
        C27275jsC c27275jsC4 = this.AYXKKw;
        if (c27275jsC4 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC4 = null;
        }
        int paddingStart = c27275jsC4.getPaddingStart();
        C27275jsC c27275jsC5 = this.AYXKKw;
        if (c27275jsC5 == null) {
            Intrinsics.gEmmrt("");
            c27275jsC5 = null;
        }
        int paddingEnd = c27275jsC5.getPaddingEnd();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = iKWHzl + paddingStart + paddingEnd + C55298xhM.OLrzqt(1, context);
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        int width = 0;
        for (int i = 0; i < childCount - 1; i++) {
            android.widget.LinearLayout linearLayout2 = this.OLrzqt;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
                linearLayout2 = null;
            }
            width += ViewGroupKt.get(linearLayout2, i).getWidth();
        }
        android.view.View view = this.gEmmrt;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        int left = view.getLeft();
        android.widget.ImageView imageView = this.AkhnZx;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        int width2 = imageView.getWidth();
        android.widget.ImageView imageView2 = this.AkhnZx;
        if (imageView2 == null) {
            Intrinsics.gEmmrt("");
            imageView2 = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams) : 0;
        android.widget.ImageView imageView3 = this.AkhnZx;
        if (imageView3 == null) {
            Intrinsics.gEmmrt("");
            imageView3 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
        int marginEnd = ((left - width2) - marginStart) - (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2) : 0);
        if (width + iOLrzqt < marginEnd) {
            C27275jsC c27275jsC6 = this.AYXKKw;
            if (c27275jsC6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c27275jsC2 = c27275jsC6;
            }
            c27275jsC2.setWidth(marginEnd - width);
        } else {
            C27275jsC c27275jsC7 = this.AYXKKw;
            if (c27275jsC7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c27275jsC2 = c27275jsC7;
            }
            c27275jsC2.setWidth(iOLrzqt);
        }
        this.djBIcL.sendEmptyMessage(this.EZpvd);
    }

    public final void gEmmrt() {
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        C27275jsC c27275jsC = null;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() <= 1) {
            C27275jsC c27275jsC2 = this.AYXKKw;
            if (c27275jsC2 == null) {
                Intrinsics.gEmmrt("");
                c27275jsC2 = null;
            }
            android.text.Editable text = c27275jsC2.getText();
            if (text == null || text.length() == 0) {
                android.widget.ImageView imageView = this.AhwBna;
                if (imageView == null) {
                    Intrinsics.gEmmrt("");
                    imageView = null;
                }
                imageView.setVisibility(8);
                android.view.View view = this.gEmmrt;
                if (view == null) {
                    Intrinsics.gEmmrt("");
                    view = null;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.width = C55298xhM.copydefault(8.0f, context);
                C27275jsC c27275jsC3 = this.AYXKKw;
                if (c27275jsC3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c27275jsC = c27275jsC3;
                }
                c27275jsC.setHint(getContext().getString(C25493ixk.FragmentManager.pause));
                return;
            }
        }
        android.widget.ImageView imageView2 = this.AhwBna;
        if (imageView2 == null) {
            Intrinsics.gEmmrt("");
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        android.view.View view2 = this.gEmmrt;
        if (view2 == null) {
            Intrinsics.gEmmrt("");
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams2.width = C55298xhM.copydefault(40.0f, context2);
        C27275jsC c27275jsC4 = this.AYXKKw;
        if (c27275jsC4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC = c27275jsC4;
        }
        c27275jsC.setHint("");
    }

    public final void valueOf() {
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        android.widget.LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() <= 1) {
            return;
        }
        android.widget.LinearLayout linearLayout3 = this.OLrzqt;
        if (linearLayout3 == null) {
            Intrinsics.gEmmrt("");
            linearLayout3 = null;
        }
        android.widget.LinearLayout linearLayout4 = this.OLrzqt;
        if (linearLayout4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            linearLayout2 = linearLayout4;
        }
        android.view.View view = ViewGroupKt.get(linearLayout3, linearLayout2.getChildCount() - 2);
        if (view.isSelected()) {
            view.setSelected(false);
        }
    }

    public final void AEQbTJ(@NotNull AbstractC27276jsD abstractC27276jsD) {
        Intrinsics.checkNotNullParameter(abstractC27276jsD, "");
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C27278jsF c27278jsF = new C27278jsF(context);
        c27278jsF.setChip(abstractC27276jsD);
        c27278jsF.setOnDeleteClicked(new ActionBar());
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        C27275jsC c27275jsC = null;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        android.widget.LinearLayout linearLayout2 = this.OLrzqt;
        if (linearLayout2 == null) {
            Intrinsics.gEmmrt("");
            linearLayout2 = null;
        }
        linearLayout.addView(c27278jsF, linearLayout2.getChildCount() - 1);
        this.KWHzl.add(abstractC27276jsD);
        C27275jsC c27275jsC2 = this.AYXKKw;
        if (c27275jsC2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c27275jsC = c27275jsC2;
        }
        c27275jsC.setText("");
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.jsJ$ActionBar */
    public static final class ActionBar implements C27278jsF.Application {
        public ActionBar() {
        }

        @Override // o.C27278jsF.Application
        public void KWHzl(C27278jsF c27278jsF) {
            Intrinsics.checkNotNullParameter(c27278jsF, "");
            C27282jsJ.this.KWHzl(c27278jsF);
        }
    }

    public final void KWHzl(C27278jsF c27278jsF) {
        java.util.ArrayList<AbstractC27276jsD> arrayList = this.KWHzl;
        C56532yIw.EZpvd(arrayList).remove(c27278jsF.KWHzl());
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        linearLayout.removeView(c27278jsF);
        gEmmrt();
        this.djBIcL.sendEmptyMessage(this.AEQbTJ);
        TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null) {
            taskDescription.copydefault();
        }
    }

    public final void setEnable(boolean z) {
        android.widget.HorizontalScrollView horizontalScrollView = this.valueOf;
        android.widget.ImageView imageView = null;
        if (horizontalScrollView == null) {
            Intrinsics.gEmmrt("");
            horizontalScrollView = null;
        }
        horizontalScrollView.setEnabled(z);
        C27275jsC c27275jsC = this.AYXKKw;
        if (c27275jsC == null) {
            Intrinsics.gEmmrt("");
            c27275jsC = null;
        }
        c27275jsC.setEnabled(z);
        android.view.View view = this.gEmmrt;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setEnabled(z);
        android.widget.ImageView imageView2 = this.AhwBna;
        if (imageView2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imageView = imageView2;
        }
        imageView.setEnabled(z);
    }
}
