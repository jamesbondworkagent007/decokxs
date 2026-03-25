package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.okinc.business.market.features.tag.domain.TagGroup;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28072kNw;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28067kNr extends android.view.ViewGroup {
    public final int AEQbTJ;
    public int EZpvd;
    public final java.util.List<TagWrapper> KWHzl;
    public int OLrzqt;
    public java.lang.Boolean copydefault;
    public int gEmmrt;
    public final java.util.Map<android.view.View, TagWrapper> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28067kNr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28067kNr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.kNr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28067kNr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28067kNr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = new java.util.ArrayList();
        this.valueOf = new LinkedHashMap();
        this.AEQbTJ = 5;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C23274hvD.LoaderManager.getNewProxyInstance, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.OLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C23274hvD.LoaderManager.hDKMBd, C55298xhM.dp2px$default(1.0f, null, 1, null));
            this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C23274hvD.LoaderManager.wlaJM, C55298xhM.dp2px$default(16.0f, null, 1, null));
            if (attributeSet != null) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxWidth});
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
                try {
                    this.EZpvd = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
                } finally {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.EZpvd > 0) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int iMin = java.lang.Math.min(size, this.EZpvd);
            if (mode == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
            } else if (mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
            }
        }
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i);
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int childCount = getChildCount();
        int iMax = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt instanceof android.widget.ImageView) {
                measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(this.gEmmrt, 1073741824));
            } else if (childAt instanceof kNE) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            } else {
                measureChild(childAt, i, i2);
            }
            iMax = java.lang.Math.max(iMax, childAt.getMeasuredHeight());
        }
        int iMax2 = java.lang.Math.max(this.gEmmrt, iMax);
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            int childCount2 = getChildCount();
            size2 = 0;
            for (int i4 = 0; i4 < childCount2; i4++) {
                size2 += getChildAt(i4).getMeasuredWidth();
                if (i4 < getChildCount() - 1) {
                    size2 += this.OLrzqt;
                }
            }
        }
        int childCount3 = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < childCount3) {
            int measuredWidth = getChildAt(i5).getMeasuredWidth() + i6 + (i5 > 0 ? this.OLrzqt : 0);
            if (measuredWidth > size2) {
                break;
            }
            i7++;
            i5++;
            i6 = measuredWidth;
        }
        if (i7 == 0) {
            setMeasuredDimension(0, 0);
            setVisibility(8);
            return;
        }
        int childCount4 = getChildCount();
        int i8 = 0;
        while (i8 < childCount4) {
            android.view.View childAt2 = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(childAt2, "");
            childAt2.setVisibility(i8 < i7 ? 0 : 8);
            i8++;
        }
        setVisibility(0);
        setMeasuredDimension(i6, iMax2);
    }

    /* JADX INFO: renamed from: o.kNr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ C28067kNr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1, C28067kNr c28067kNr) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = function1;
            this.OLrzqt = c28067kNr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke(this.OLrzqt.KWHzl());
            }
        }
    }

    /* JADX INFO: renamed from: o.kNr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ C28067kNr AhwBna;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ TagWrapper KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, C28067kNr c28067kNr, TagWrapper tagWrapper, Function1 function12) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = function1;
            this.AhwBna = c28067kNr;
            this.KWHzl = tagWrapper;
            this.AEQbTJ = function12;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.invoke(CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends TagWrapper>) this.AhwBna.KWHzl(), this.KWHzl));
                this.AEQbTJ.invoke(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.kNr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28067kNr EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1, C28067kNr c28067kNr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = function1;
            this.EZpvd = c28067kNr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke(this.EZpvd.KWHzl());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            Intrinsics.copydefault(childAt);
            if (childAt.getVisibility() == 0) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i5, i7, i5 + measuredWidth, measuredHeight + i7);
                i5 += measuredWidth + this.OLrzqt;
            }
        }
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.kNr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTags$default(C28067kNr c28067kNr, java.util.List list, boolean z, boolean z2, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        boolean z3 = (i & 2) != 0 ? false : z;
        boolean z4 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.kNv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28067kNr.KWHzl((java.util.List) obj2);
                }
            };
        }
        Function1 function13 = function1;
        if ((i & 16) != 0) {
            function12 = new Function1() { // from class: o.kNz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28067kNr.OLrzqt((TagWrapper) obj2);
                }
            };
        }
        c28067kNr.setTags(list, z3, z4, function13, function12);
    }

    public static final Unit OLrzqt(TagWrapper tagWrapper) {
        Intrinsics.checkNotNullParameter(tagWrapper, "");
        return Unit.INSTANCE;
    }

    public final void setTags(@NotNull java.util.List<TagWrapper> list, boolean z, boolean z2, @NotNull Function1<? super java.util.List<TagWrapper>, Unit> function1, @NotNull Function1<? super TagWrapper, Unit> function12) {
        int i;
        int i2;
        android.view.View viewEZpvd;
        TagMeta tagMetaAEQbTJ;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        if (Intrinsics.EZpvd(list, this.KWHzl) && Intrinsics.EZpvd(java.lang.Boolean.valueOf(z2), this.copydefault)) {
            return;
        }
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        this.copydefault = java.lang.Boolean.valueOf(z2);
        removeAllViews();
        this.valueOf.clear();
        if (list.isEmpty() && !z2) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (list.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (TagWrapper tagWrapper : list) {
                if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "duringEvent") || Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "launchpool")) {
                    i++;
                    if (i < 0) {
                        yDY.djBIcL();
                    }
                }
            }
        }
        int i3 = this.AEQbTJ;
        if (i > 0) {
            i3 -= i;
        }
        int i4 = i3;
        boolean z3 = true;
        if (z2) {
            C28072kNw.StateListAnimator stateListAnimator = C28072kNw.Companion;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C28072kNw c28072kNwCopydefault = stateListAnimator.copydefault(context, C52761wXj.TaskDescription.zNQIcI, java.lang.Integer.valueOf(C52761wXj.Activity.DQzvGN), C23274hvD.Fragment.onContextAvailable);
            android.widget.ImageView imageViewEZpvd = EZpvd(c28072kNwCopydefault);
            boolean z4 = c28072kNwCopydefault.AYXKKw() != TagGroup.NONE;
            imageViewEZpvd.setClickable(z4);
            imageViewEZpvd.setFocusable(z4);
            if (z4) {
                imageViewEZpvd.setOnClickListener(new TaskDescription(imageViewEZpvd, 1000L, function1, this));
            }
            addView(imageViewEZpvd);
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = i2;
        for (TagWrapper tagWrapper2 : list) {
            if (Intrinsics.EZpvd((java.lang.Object) tagWrapper2.OLrzqt(), (java.lang.Object) "duringEvent") || Intrinsics.EZpvd((java.lang.Object) tagWrapper2.OLrzqt(), (java.lang.Object) "launchpool")) {
                kNE kneKWHzl = KWHzl(tagWrapper2, function1, function12);
                if (kneKWHzl != null) {
                    addView(kneKWHzl);
                }
            } else if (i5 < i4) {
                C28072kNw c28072kNwEZpvd = C28074kNy.EZpvd(tagWrapper2, (z || ((tagMetaAEQbTJ = tagWrapper2.AEQbTJ()) != null && tagMetaAEQbTJ.values() == z3)) ? z3 : false, getContext());
                if (c28072kNwEZpvd != null && (c28072kNwEZpvd.KWHzl().length() > 0 || c28072kNwEZpvd.AEQbTJ() != null)) {
                    TagMeta tagMetaAEQbTJ2 = tagWrapper2.AEQbTJ();
                    if (tagMetaAEQbTJ2 != null && tagMetaAEQbTJ2.values() == z3) {
                        viewEZpvd = KWHzl(c28072kNwEZpvd);
                    } else {
                        viewEZpvd = EZpvd(c28072kNwEZpvd);
                    }
                    android.view.View view = viewEZpvd;
                    this.valueOf.put(view, tagWrapper2);
                    boolean z5 = c28072kNwEZpvd.AYXKKw() != TagGroup.NONE ? z3 : false;
                    view.setClickable(z5);
                    view.setFocusable(z5);
                    if (z5) {
                        view.setOnClickListener(new Application(view, 1000L, function1, this));
                    }
                    addView(view);
                    i5++;
                }
            }
            z3 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<TagWrapper> KWHzl() {
        java.util.Set<Map.Entry<android.view.View, TagWrapper>> setEntrySet = this.valueOf.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            android.view.View view = (android.view.View) entry.getKey();
            TagWrapper tagWrapper = (TagWrapper) entry.getValue();
            if (view.getVisibility() == 0 && view.getParent() != null && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "duringEvent") && !Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "launchpool")) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((TagWrapper) ((Map.Entry) it.next()).getValue());
        }
        return arrayList2;
    }

    public final android.widget.ImageView EZpvd(C28072kNw c28072kNw) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, this.gEmmrt));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (c28072kNw.KWHzl().length() > 0) {
            if (c28072kNw.EZpvd()) {
                C25386ivj.AEQbTJ(imageView, c28072kNw.KWHzl(), false);
            } else {
                C33054mpH.loadUrl$default(imageView, c28072kNw.KWHzl(), null, 0, 0, 14, null);
            }
        } else {
            imageView.setImageDrawable(c28072kNw.AEQbTJ());
        }
        return imageView;
    }

    public final kNE KWHzl(C28072kNw c28072kNw) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kNE kne = new kNE(context, null, 0, 6, null);
        kne.EZpvd(c28072kNw);
        kne.setLayoutParams(new ViewGroup.LayoutParams(-2, this.gEmmrt));
        return kne;
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kNr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kNE createEventTagWidget$default(C28067kNr c28067kNr, TagWrapper tagWrapper, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.kNt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28067kNr.OLrzqt((java.util.List) obj2);
                }
            };
        }
        return c28067kNr.KWHzl(tagWrapper, function1, function12);
    }

    public final kNE KWHzl(TagWrapper tagWrapper, Function1<? super java.util.List<TagWrapper>, Unit> function1, Function1<? super TagWrapper, Unit> function12) {
        C28072kNw c28072kNwEZpvd = C28074kNy.EZpvd(tagWrapper, true, getContext());
        if (c28072kNwEZpvd == null || tagWrapper.copydefault().OLrzqt().KWHzl() == null) {
            return null;
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kNE kne = new kNE(context, null, 0, 6, null);
        kne.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        kne.EZpvd(c28072kNwEZpvd);
        kne.setOnClickListener(new StateListAnimator(kne, 1000L, function1, this, tagWrapper, function12));
        return kne;
    }
}
