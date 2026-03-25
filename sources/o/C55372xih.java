package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55372xih extends android.view.ViewGroup {
    public boolean AEQbTJ;
    public int AYXKKw;
    public final java.util.List<StateListAnimator> AhwBna;
    public final int AkhnZx;
    public int AuCTel;
    public Function1<? super java.lang.Integer, Unit> DbNXlk;
    public boolean djBIcL;
    public int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public android.util.SparseArray<android.view.View> fJNWhG;
    public boolean fetchVPNInfo;
    public StateListAnimator gEmmrt;
    public int isConnected;
    public int valueOf;
    public Function1<? super java.lang.Integer, Unit> values;

    /* JADX INFO: renamed from: o.xih$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class ActionBar<T> {
        public abstract void OLrzqt(@NotNull java.lang.Object obj, Activity activity, android.view.View view, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55372xih(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55372xih(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpand(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxLines(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedUpdate(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFirstTimeMeasureCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.values = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMeasureCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondLineLastIndex(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.xih.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55372xih(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55372xih(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        this.fetchVPNInfo = true;
        this.isConnected = 2;
        this.AYXKKw = C55298xhM.KWHzl(12.0f, context);
        this.AuCTel = C55298xhM.KWHzl(12.0f, context);
        this.AhwBna = new java.util.ArrayList();
        this.valueOf = 1;
        this.AkhnZx = Integer.MAX_VALUE;
        this.djBIcL = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.uzCIH);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.isConnected = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.getFieldNames, 2);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.zsXlph, true);
        this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.wlaJM, C55298xhM.KWHzl(12.0f, context));
        this.AuCTel = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.AubY, C55298xhM.KWHzl(12.0f, context));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setAlignByCenter(int i) {
        this.valueOf = i;
        EZpvd();
    }

    public final void setAdapter(java.util.List<?> list, int i, @NotNull ActionBar<?> actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (list == null) {
            return;
        }
        removeAllViews();
        setHorizontalSpacing(this.AYXKKw);
        setVerticalSpacing(this.AuCTel);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            Intrinsics.copydefault(obj);
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(i, (android.view.ViewGroup) null);
            Intrinsics.copydefault(viewInflate);
            actionBar.OLrzqt(obj, new Activity(this, viewInflate), viewInflate, i2);
            addView(viewInflate);
        }
    }

    public final void setHorizontalSpacing(int i) {
        if (this.AYXKKw != i) {
            this.AYXKKw = i;
            EZpvd();
        }
    }

    public final void setVerticalSpacing(int i) {
        if (this.AuCTel != i) {
            this.AuCTel = i;
            EZpvd();
        }
    }

    public final void KWHzl() {
        this.AEQbTJ = false;
        this.fetchVPNInfo = true;
        this.djBIcL = true;
        this.ejfBZ = 0;
        this.values = null;
        this.DbNXlk = null;
        this.gEmmrt = null;
        this.fJNWhG = new android.util.SparseArray<>();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        AYXKKw();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (childAt != null && childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, mode == 1073741824 ? Integer.MIN_VALUE : mode), View.MeasureSpec.makeMeasureSpec((size2 - paddingTop) - paddingBottom, mode2 != 1073741824 ? mode2 : Integer.MIN_VALUE));
                if (this.gEmmrt == null) {
                    this.gEmmrt = new StateListAnimator();
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int i4 = this.fARcdN;
                this.fIwbmz = i4;
                int i5 = i4 + measuredWidth;
                this.fARcdN = i5;
                if (i5 <= size) {
                    StateListAnimator stateListAnimator = this.gEmmrt;
                    Intrinsics.copydefault(stateListAnimator);
                    stateListAnimator.KWHzl(childAt);
                    int i6 = this.fARcdN + this.AYXKKw;
                    this.fARcdN = i6;
                    if (i6 >= size && !copydefault()) {
                        break;
                    } else if (this.AhwBna.size() == 1) {
                        this.ejfBZ = i3;
                    }
                } else {
                    if (this.AhwBna.size() == 1) {
                        int i7 = this.fIwbmz;
                        android.content.Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        if (i7 + C55298xhM.KWHzl(28.0f, context) < size) {
                            this.ejfBZ++;
                        }
                    }
                    StateListAnimator stateListAnimator2 = this.gEmmrt;
                    Intrinsics.copydefault(stateListAnimator2);
                    if (stateListAnimator2.AEQbTJ() == 0) {
                        StateListAnimator stateListAnimator3 = this.gEmmrt;
                        Intrinsics.copydefault(stateListAnimator3);
                        stateListAnimator3.KWHzl(childAt);
                        if (!copydefault()) {
                            break;
                        }
                    } else {
                        if (!copydefault()) {
                            break;
                        }
                        StateListAnimator stateListAnimator4 = this.gEmmrt;
                        Intrinsics.copydefault(stateListAnimator4);
                        stateListAnimator4.KWHzl(childAt);
                        this.fARcdN += measuredWidth + this.AYXKKw;
                    }
                }
            }
        }
        StateListAnimator stateListAnimator5 = this.gEmmrt;
        if (stateListAnimator5 != null) {
            Intrinsics.copydefault(stateListAnimator5);
            if (stateListAnimator5.AEQbTJ() > 0 && !this.AhwBna.contains(this.gEmmrt)) {
                this.AhwBna.add(this.gEmmrt);
            }
        }
        if (this.djBIcL) {
            Function1<? super java.lang.Integer, Unit> function1 = this.values;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(this.AhwBna.size()));
            }
            this.djBIcL = false;
        } else if (this.fetchVPNInfo) {
            Function1<? super java.lang.Integer, Unit> function12 = this.DbNXlk;
            if (function12 != null) {
                function12.invoke(java.lang.Integer.valueOf(this.AhwBna.size()));
            }
            this.fetchVPNInfo = false;
        }
        int size3 = View.MeasureSpec.getSize(i);
        int size4 = this.AhwBna.size();
        int iOLrzqt = 0;
        for (int i8 = 0; i8 < size4; i8++) {
            StateListAnimator stateListAnimator6 = this.AhwBna.get(i8);
            Intrinsics.copydefault(stateListAnimator6);
            iOLrzqt += stateListAnimator6.OLrzqt();
        }
        setMeasuredDimension(size3, android.view.View.resolveSize(iOLrzqt + (this.AuCTel * (size4 - 1)) + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int width = z2 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.AhwBna.size();
        int size2 = this.isConnected;
        if (size <= size2 || this.AEQbTJ) {
            size2 = this.AhwBna.size();
        }
        for (int i5 = 0; i5 < size2; i5++) {
            StateListAnimator stateListAnimator = this.AhwBna.get(i5);
            Intrinsics.copydefault(stateListAnimator);
            stateListAnimator.AEQbTJ(width, paddingTop, z2);
            paddingTop += stateListAnimator.OLrzqt() + this.AuCTel;
        }
    }

    public static final void AEQbTJ(C55372xih c55372xih) {
        c55372xih.requestLayout();
    }

    public final void EZpvd() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.xii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C55372xih.AEQbTJ(this.KWHzl);
            }
        });
    }

    public final void AYXKKw() {
        this.AhwBna.clear();
        this.gEmmrt = new StateListAnimator();
        this.fARcdN = 0;
        this.ejfBZ = 0;
    }

    public final boolean copydefault() {
        this.AhwBna.add(this.gEmmrt);
        if (this.AhwBna.size() >= this.AkhnZx) {
            return false;
        }
        this.gEmmrt = new StateListAnimator();
        this.fARcdN = 0;
        return true;
    }

    /* JADX INFO: renamed from: o.xih$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public final class Activity {
        public android.view.View KWHzl;
        public final /* synthetic */ C55372xih OLrzqt;

        public Activity(@NotNull C55372xih c55372xih, android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c55372xih;
            this.KWHzl = view;
            c55372xih.fJNWhG = new android.util.SparseArray();
        }
    }

    /* JADX INFO: renamed from: o.xih$StateListAnimator */
    public final class StateListAnimator {
        public int EZpvd;
        public int KWHzl;
        public java.util.List<android.view.View> OLrzqt = new java.util.ArrayList();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        public final int AEQbTJ() {
            return this.OLrzqt.size();
        }

        public final void KWHzl(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt.add(view);
            this.EZpvd += view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i = this.KWHzl;
            if (i >= measuredHeight) {
                measuredHeight = i;
            }
            this.KWHzl = measuredHeight;
        }

        public final void AEQbTJ(int i, int i2, boolean z) {
            int iAEQbTJ = AEQbTJ();
            int measuredWidth = (((C55372xih.this.getMeasuredWidth() - C55372xih.this.getPaddingLeft()) - C55372xih.this.getPaddingRight()) - this.EZpvd) - (C55372xih.this.AYXKKw * (iAEQbTJ - 1));
            if (measuredWidth >= 0) {
                for (int i3 = 0; i3 < iAEQbTJ; i3++) {
                    android.view.View view = this.OLrzqt.get(i3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int i4 = (int) ((((double) (this.KWHzl - measuredHeight)) / 2.0d) + 0.5d);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    if (i3 == 0) {
                        int i5 = C55372xih.this.valueOf;
                        if (i5 == 0) {
                            i = z ? i - measuredWidth : i + measuredWidth;
                        } else if (i5 == 2) {
                            i += measuredWidth / 2;
                        }
                    }
                    if (z) {
                        int i6 = i4 + i2;
                        view.layout(i - measuredWidth2, i6, i, measuredHeight + i6);
                        i -= measuredWidth2 + C55372xih.this.AuCTel;
                    } else {
                        int i7 = i4 + i2;
                        view.layout(i, i7, i + measuredWidth2, measuredHeight + i7);
                        i += measuredWidth2 + C55372xih.this.AuCTel;
                    }
                }
            }
        }
    }
}
