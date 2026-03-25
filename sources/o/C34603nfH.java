package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34603nfH extends android.view.ViewGroup {
    public final java.util.List<C34604nfI> EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34603nfH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34603nfH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.nfH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34603nfH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34603nfH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new Function0() { // from class: o.nfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34603nfH.KWHzl();
            }
        };
        this.EZpvd = new java.util.ArrayList();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.fARcdN, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.KWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(C35964oKf.PendingIntent.ejfBZ, 0);
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C35964oKf.PendingIntent.fIwbmz, C55298xhM.dp2px$default(16.0f, null, 1, null));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int childCount = (getChildCount() * this.OLrzqt) + (getChildCount() != 0 ? (getChildCount() - 1) * this.KWHzl : 0);
        if (mode == Integer.MIN_VALUE) {
            size = java.lang.Math.min(childCount, size);
        } else if (mode != 1073741824) {
            size = childCount;
        }
        int i3 = this.KWHzl;
        int i4 = (size + i3) / (this.OLrzqt + i3);
        int childCount2 = getChildCount();
        int i5 = 0;
        while (i5 < childCount2) {
            android.view.View childAt = getChildAt(i5);
            Intrinsics.checkNotNullExpressionValue(childAt, "");
            childAt.setVisibility(i5 < i4 ? 0 : 8);
            i5++;
        }
        setMeasuredDimension(size, this.OLrzqt);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            Intrinsics.copydefault(childAt);
            if (childAt.getVisibility() == 0) {
                int i7 = this.OLrzqt;
                childAt.layout(i5, 0, i5 + i7, i7);
                i5 += this.OLrzqt + this.KWHzl;
            }
        }
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.nfH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTags$default(C34603nfH c34603nfH, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.nfK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34603nfH.EZpvd();
                }
            };
        }
        c34603nfH.setTags(list, function0);
    }

    public final void setTags(@NotNull java.util.List<C34604nfI> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (Intrinsics.EZpvd(list, this.EZpvd)) {
            return;
        }
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        removeAllViews();
        this.copydefault = function0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            for (C34604nfI c34604nfI : list) {
                if (c34604nfI.OLrzqt().length() > 0 || c34604nfI.copydefault() != null) {
                    setVisibility(0);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        C34604nfI c34604nfI2 = (C34604nfI) obj;
                        if (c34604nfI2.OLrzqt().length() > 0 || c34604nfI2.copydefault() != null) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        copydefault((C34604nfI) it.next());
                    }
                    setOnClickListener(new StateListAnimator(this, 1000L, this));
                    return;
                }
            }
        }
        setVisibility(8);
    }

    public final void copydefault(C34604nfI c34604nfI) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        int i = this.OLrzqt;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (c34604nfI.OLrzqt().length() > 0) {
            C33054mpH.loadUrl$default(imageView, c34604nfI.OLrzqt(), null, 0, 0, 14, null);
        } else {
            imageView.setImageDrawable(c34604nfI.copydefault());
        }
        addView(imageView);
    }

    /* JADX INFO: renamed from: o.nfH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C34603nfH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C34603nfH c34603nfH) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c34603nfH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault.invoke();
            }
        }
    }
}
