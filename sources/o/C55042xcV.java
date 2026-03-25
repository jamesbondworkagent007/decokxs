package o;

import android.graphics.Paint;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55042xcV extends android.view.View {
    public java.util.List<java.lang.String> AEQbTJ;
    public android.graphics.Paint AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public LinearLayoutManager KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public boolean djBIcL;
    public java.util.List<? extends InterfaceC55105xdf> fetchVPNInfo;
    public Function2<? super java.lang.Integer, ? super java.lang.String, Unit> gEmmrt;
    public ActionBar valueOf;
    public int values;

    /* JADX INFO: renamed from: o.xcV$ActionBar */
    public interface ActionBar {
        void EZpvd();

        void OLrzqt(int i, @NotNull java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55042xcV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55042xcV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinearLayoutManager OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLayoutManager(LinearLayoutManager linearLayoutManager) {
        this.KWHzl = linearLayoutManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickCharacter(Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2) {
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedIndex(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.xcV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55042xcV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55042xcV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = -1;
        this.AEQbTJ = new java.util.ArrayList();
        this.fetchVPNInfo = new java.util.ArrayList();
        this.EZpvd = C55298xhM.KWHzl(16.0f, context);
        this.AYXKKw = new android.graphics.Paint();
        EZpvd(context, attributeSet, i);
    }

    public final void setIndexDataList(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        requestLayout();
        invalidate();
    }

    public final C55042xcV OLrzqt(@NotNull java.util.List<? extends InterfaceC55105xdf> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fetchVPNInfo = list;
        EZpvd();
        return this;
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int iKWHzl = C55298xhM.KWHzl(10.0f, context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.RlQdEF, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C52761wXj.PictureInPictureParams.DCJXGO) {
                iKWHzl = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iKWHzl);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        android.graphics.Paint paint = this.AYXKKw;
        paint.setAntiAlias(true);
        paint.setTextSize(iKWHzl);
        paint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.aappFQ));
        paint.setTypeface(C55051xce.OLrzqt.AEQbTJ());
        this.valueOf = new Application();
    }

    /* JADX INFO: renamed from: o.xcV$Application */
    public static final class Application implements ActionBar {
        @Override // o.C55042xcV.ActionBar
        public void EZpvd() {
        }

        public Application() {
        }

        @Override // o.C55042xcV.ActionBar
        public void OLrzqt(int i, java.lang.String str) {
            LinearLayoutManager linearLayoutManagerOLrzqt;
            Intrinsics.checkNotNullParameter(str, "");
            int iKWHzl = C55042xcV.this.KWHzl(str);
            if (iKWHzl == -1 || (linearLayoutManagerOLrzqt = C55042xcV.this.OLrzqt()) == null) {
                return;
            }
            linearLayoutManagerOLrzqt.scrollToPositionWithOffset(iKWHzl, 0);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        android.graphics.Rect rect = new android.graphics.Rect();
        int size3 = this.AEQbTJ.size();
        int iCopydefault = 0;
        int iCopydefault2 = 0;
        for (int i3 = 0; i3 < size3; i3++) {
            java.lang.String str = this.AEQbTJ.get(i3);
            this.AYXKKw.getTextBounds(str, 0, str.length(), rect);
            iCopydefault = C56548yJl.copydefault(rect.width(), iCopydefault);
            iCopydefault2 = C56548yJl.copydefault(rect.height(), iCopydefault2);
        }
        int size4 = this.EZpvd * this.AEQbTJ.size();
        if (mode == Integer.MIN_VALUE) {
            size = C56548yJl.valueOf(iCopydefault, size);
        } else if (mode != 1073741824) {
            size = iCopydefault;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = C56548yJl.valueOf(size4, size2);
        } else if (mode2 != 1073741824) {
            size2 = size4;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int paddingTop = getPaddingTop();
        int size = this.AEQbTJ.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str = this.AEQbTJ.get(i);
            Paint.FontMetrics fontMetrics = this.AYXKKw.getFontMetrics();
            float f = 2;
            int i2 = (int) (((this.EZpvd - fontMetrics.bottom) - fontMetrics.top) / f);
            if (i == this.AhwBna && this.djBIcL) {
                this.djBIcL = false;
                this.AYXKKw.setColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.DeEinT));
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.xcX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C55042xcV.EZpvd(this.OLrzqt);
                    }
                }, 200L);
            } else {
                this.AYXKKw.setColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.aappFQ));
            }
            canvas.drawText(str, (this.values / 2) - (this.AYXKKw.measureText(str) / f), (this.EZpvd * i) + paddingTop + i2, this.AYXKKw);
        }
    }

    public static final void EZpvd(C55042xcV c55042xcV) {
        c55042xcV.AYXKKw.setColor(ContextCompat.getColor(c55042xcV.getContext(), C52761wXj.Activity.aappFQ));
        c55042xcV.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            android.view.ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            this.OLrzqt = false;
            int y = (int) ((motionEvent.getY() - getPaddingTop()) / this.EZpvd);
            if (y < 0) {
                y = 0;
            } else if (y >= this.AEQbTJ.size()) {
                y = this.AEQbTJ.size() - 1;
            }
            if (this.AhwBna == y) {
                return true;
            }
            this.AhwBna = y;
            this.djBIcL = true;
            invalidate();
            if (y > -1 && y < this.AEQbTJ.size()) {
                Function2<? super java.lang.Integer, ? super java.lang.String, Unit> function2 = this.gEmmrt;
                if (function2 != null) {
                    function2.invoke(java.lang.Integer.valueOf(y), this.AEQbTJ.get(y));
                }
                ActionBar actionBar = this.valueOf;
                if (actionBar != null) {
                    actionBar.OLrzqt(y, this.AEQbTJ.get(y));
                }
                performHapticFeedback(0, 3);
            }
        } else if (action == 1) {
            android.view.ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            this.djBIcL = true;
            invalidate();
            setBackgroundResource(android.R.color.transparent);
            ActionBar actionBar2 = this.valueOf;
            if (actionBar2 != null) {
                actionBar2.EZpvd();
            }
        } else if (action != 2) {
            if (action == 3) {
                android.view.ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(false);
                }
                setBackgroundResource(android.R.color.transparent);
                ActionBar actionBar3 = this.valueOf;
                if (actionBar3 != null) {
                    actionBar3.EZpvd();
                }
            } else {
                setBackgroundResource(android.R.color.transparent);
                ActionBar actionBar4 = this.valueOf;
                if (actionBar4 != null) {
                    actionBar4.EZpvd();
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.values = i;
        this.copydefault = i2;
        if (this.AEQbTJ.isEmpty()) {
            return;
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.EZpvd = C55298xhM.KWHzl(16.0f, context);
    }

    public final int KWHzl(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return -1;
        }
        int size = this.fetchVPNInfo.size();
        for (int i = 0; i < size; i++) {
            if (android.text.TextUtils.equals(this.fetchVPNInfo.get(i).getSuspensionTag(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final void EZpvd() {
        if (this.fetchVPNInfo.isEmpty()) {
            return;
        }
        KWHzl(this.fetchVPNInfo, this.AEQbTJ);
        AEQbTJ();
    }

    public final void KWHzl(java.util.List<? extends InterfaceC55105xdf> list, java.util.List<java.lang.String> list2) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.String suspensionTag = list.get(i).getSuspensionTag();
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list2), suspensionTag) && !android.text.TextUtils.isEmpty(suspensionTag)) {
                Intrinsics.copydefault((java.lang.Object) suspensionTag);
                list2.add(suspensionTag);
            }
        }
    }
}
