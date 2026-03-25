package o;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19931gUq extends LinearLayoutCompat {
    public final C23528hzt AEQbTJ;
    public Function0<Unit> EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRemoveClickListener(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19931gUq(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C23528hzt c23528hztKWHzl = C23528hzt.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23528hztKWHzl, "");
        this.AEQbTJ = c23528hztKWHzl;
        this.OLrzqt = "";
        setOrientation(0);
        setPaddingRelative(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getPaddingBottom());
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxLines(2);
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(66);
            android.text.InputFilter[] filters = c55001xbhAkhnZx.getFilters();
            Intrinsics.copydefault(filters);
            c55001xbhAkhnZx.setFilters((android.text.InputFilter[]) yDT.EZpvd((InputFilter.LengthFilter[]) filters, lengthFilter));
        }
        AppCompatImageView appCompatImageView = c23528hztKWHzl.copydefault;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt), dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx2.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx3 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.addTextChangedListener(new StateListAnimator());
        }
        setupRemoveButtonCentering();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19931gUq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23528hzt c23528hztKWHzl = C23528hzt.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23528hztKWHzl, "");
        this.AEQbTJ = c23528hztKWHzl;
        this.OLrzqt = "";
        setOrientation(0);
        setPaddingRelative(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getPaddingBottom());
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxLines(2);
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(66);
            android.text.InputFilter[] filters = c55001xbhAkhnZx.getFilters();
            Intrinsics.copydefault(filters);
            c55001xbhAkhnZx.setFilters((android.text.InputFilter[]) yDT.EZpvd((InputFilter.LengthFilter[]) filters, lengthFilter));
        }
        AppCompatImageView appCompatImageView = c23528hztKWHzl.copydefault;
        appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt), dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx2.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx3 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.addTextChangedListener(new TaskDescription());
        }
        setupRemoveButtonCentering();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19931gUq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23528hzt c23528hztKWHzl = C23528hzt.KWHzl(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23528hztKWHzl, "");
        this.AEQbTJ = c23528hztKWHzl;
        this.OLrzqt = "";
        setOrientation(0);
        setPaddingRelative(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.finit), getPaddingBottom());
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxLines(2);
            InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(66);
            android.text.InputFilter[] filters = c55001xbhAkhnZx.getFilters();
            Intrinsics.copydefault(filters);
            c55001xbhAkhnZx.setFilters((android.text.InputFilter[]) yDT.EZpvd((InputFilter.LengthFilter[]) filters, lengthFilter));
        }
        AppCompatImageView appCompatImageView = c23528hztKWHzl.copydefault;
        appCompatImageView.setOnClickListener(new LoaderManager(appCompatImageView, 1000L, this));
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuWLRA);
            c55009xbpFIwbmz.setPaddingRelative(c55009xbpFIwbmz.getPaddingStart(), dimensionPixelSize, getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.fFgQHt), dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = c55009xbpFIwbmz.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                c55009xbpFIwbmz.setLayoutParams(layoutParams);
                c55009xbpFIwbmz.setMinimumHeight(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTelauCTel));
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx2 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            ViewGroup.LayoutParams layoutParams2 = c55001xbhAkhnZx2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -2;
                c55001xbhAkhnZx2.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        C55001xbh c55001xbhAkhnZx3 = copydefault().AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.addTextChangedListener(new Activity());
        }
        setupRemoveButtonCentering();
    }

    public final C55008xbo copydefault() {
        C55008xbo c55008xbo = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        return c55008xbo;
    }

    /* JADX INFO: renamed from: o.gUq$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19931gUq.this.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.gUq$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19931gUq.this.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.gUq$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C19931gUq.this.AEQbTJ();
        }
    }

    public final void setupRemoveButtonCentering() {
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz == null) {
            return;
        }
        c55009xbpFIwbmz.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.gUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C19931gUq.setupRemoveButtonCentering$lambda$6(this.KWHzl, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        post(new java.lang.Runnable() { // from class: o.gUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19931gUq.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void setupRemoveButtonCentering$lambda$6(C19931gUq c19931gUq, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i6 == i2 && i8 == i4) {
            return;
        }
        c19931gUq.EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(C19931gUq c19931gUq) {
        c19931gUq.EZpvd();
    }

    public final void EZpvd() {
        int iIntValue;
        C55009xbp c55009xbpFIwbmz = copydefault().fIwbmz();
        if (c55009xbpFIwbmz == null) {
            return;
        }
        AppCompatImageView appCompatImageView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        int measuredHeight = c55009xbpFIwbmz.getMeasuredHeight();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(appCompatImageView.getHeight());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(appCompatImageView.getLayoutParams().height);
            java.lang.Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
            if (num == null) {
                return;
            } else {
                iIntValue = num.intValue();
            }
        }
        int i = (measuredHeight - iIntValue) / 2;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            appCompatImageView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        int i;
        if (!OLrzqt()) {
            copydefault().setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.GCXiNH));
            copydefault().setState(2);
            return;
        }
        C55008xbo c55008xboCopydefault = copydefault();
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        if (c55001xbhAkhnZx != null) {
            i = !c55001xbhAkhnZx.isFocused() ? 0 : 1;
        }
        c55008xboCopydefault.setState(i);
        copydefault().values();
    }

    public final boolean OLrzqt() {
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = copydefault().AkhnZx();
        java.lang.String string = (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) ? null : text.toString();
        if (string == null || string.length() == 0 || this.OLrzqt.length() == 0) {
            return true;
        }
        return AEQbTJ(string);
    }

    public final void setChainId(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        AEQbTJ();
    }

    public final void setRemoveEnabled(boolean z) {
        this.AEQbTJ.copydefault.setEnabled(z);
        ImageViewCompat.setImageTintList(this.AEQbTJ.copydefault, ContextCompat.getColorStateList(getContext(), z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AhwBna().AEQbTJ(str, C33129mqd.valueOf(this.OLrzqt));
    }

    /* JADX INFO: renamed from: o.gUq$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C19931gUq KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19931gUq c19931gUq) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c19931gUq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.view.ViewParent parent = this.KWHzl.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.KWHzl);
                }
                Function0 function0 = this.KWHzl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gUq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C19931gUq KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19931gUq c19931gUq) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c19931gUq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.view.ViewParent parent = this.KWHzl.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.KWHzl);
                }
                Function0 function0 = this.KWHzl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gUq$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C19931gUq AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C19931gUq c19931gUq) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c19931gUq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.view.ViewParent parent = this.AEQbTJ.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.AEQbTJ);
                }
                Function0 function0 = this.AEQbTJ.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
