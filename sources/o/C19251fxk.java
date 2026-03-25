package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19251fxk extends android.view.ViewGroup {
    public int AEQbTJ;
    public int EZpvd;
    public final java.util.List<C18985fsj> KWHzl;
    public Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19251fxk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19251fxk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.fxk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C19251fxk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19251fxk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new Function0() { // from class: o.fxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19251fxk.OLrzqt();
            }
        };
        this.KWHzl = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13754dXa.PendingIntent.fARcdN, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13754dXa.PendingIntent.fIwbmz, 0);
            this.EZpvd = typedArrayObtainStyledAttributes.getDimensionPixelSize(C13754dXa.PendingIntent.fJNWhG, C55298xhM.dp2px$default(16.0f, null, 1, null));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int childCount = (getChildCount() * this.EZpvd) + (getChildCount() != 0 ? (getChildCount() - 1) * this.AEQbTJ : 0);
        if (mode == Integer.MIN_VALUE) {
            size = java.lang.Math.min(childCount, size);
        } else if (mode != 1073741824) {
            size = childCount;
        }
        int i3 = this.AEQbTJ;
        int i4 = (size + i3) / (this.EZpvd + i3);
        int childCount2 = getChildCount();
        int i5 = 0;
        while (i5 < childCount2) {
            android.view.View childAt = getChildAt(i5);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            childAt.setVisibility(i5 < i4 ? 0 : 8);
            i5++;
        }
        setMeasuredDimension(size, this.EZpvd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            Intrinsics.copydefault(childAt);
            if (childAt.getVisibility() == 0) {
                int i7 = this.EZpvd;
                childAt.layout(i5, 0, i5 + i7, i7);
                i5 += this.EZpvd + this.AEQbTJ;
            }
        }
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fxk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTags$default(C19251fxk c19251fxk, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.fxq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19251fxk.AEQbTJ();
                }
            };
        }
        c19251fxk.setTags(list, function0);
    }

    public final void setTags(@NotNull java.util.List<C18985fsj> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (Intrinsics.EZpvd(list, this.KWHzl)) {
            return;
        }
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        removeAllViews();
        this.OLrzqt = function0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (C18985fsj c18985fsj : list) {
                if (c18985fsj.OLrzqt().length() > 0 || c18985fsj.KWHzl() != null) {
                    setVisibility(0);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        C18985fsj c18985fsj2 = (C18985fsj) obj;
                        if (c18985fsj2.OLrzqt().length() > 0 || c18985fsj2.KWHzl() != null) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OLrzqt((C18985fsj) it.next());
                    }
                    setOnClickListener(new StateListAnimator(this, 1000L, this));
                    return;
                }
            }
        }
        setVisibility(8);
    }

    public final void OLrzqt(C18985fsj c18985fsj) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        int i = this.EZpvd;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (c18985fsj.OLrzqt().length() > 0) {
            C33054mpH.loadUrl$default(imageView, c18985fsj.OLrzqt(), null, 0, 0, 14, null);
        } else {
            imageView.setImageDrawable(c18985fsj.KWHzl());
        }
        addView(imageView);
    }

    /* JADX INFO: renamed from: o.fxk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C19251fxk KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C19251fxk c19251fxk) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c19251fxk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke();
            }
        }
    }
}
