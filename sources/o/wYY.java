package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wYY extends android.widget.FrameLayout {
    public final int AYXKKw;
    public android.graphics.Bitmap AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final java.util.List<ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent> AuCTel;
    public final int DbNXlk;
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc EZpvd;
    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent copydefault;
    public android.graphics.Bitmap djBIcL;
    public Function0<Unit> fetchVPNInfo;
    public final android.view.LayoutInflater gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public int values;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final PorterDuffXfermode KWHzl = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
    public static final float AEQbTJ = 1.5f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentViewPosInfo(ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        this.copydefault = pendingIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNext(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnClickHighlight(Function0<Unit> function0) {
        this.fetchVPNInfo = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wYY(@NotNull android.content.Context context, ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @NotNull java.util.List<ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent> list, boolean z) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = viewTreeObserverOnGlobalLayoutListenerC52808wZc;
        this.AYXKKw = i;
        this.DbNXlk = i2;
        this.AuCTel = list;
        this.valueOf = z;
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYY.copydefault();
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wYY.AEQbTJ(this.OLrzqt);
            }
        });
        this.gEmmrt = android.view.LayoutInflater.from(context);
        this.values = -1;
        setWillNotDraw(false);
    }

    private final android.graphics.Paint AhwBna() {
        return (android.graphics.Paint) this.AkhnZx.getValue();
    }

    public static final android.graphics.Paint copydefault() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(KWHzl);
        return paint;
    }

    private final android.graphics.Paint AYXKKw() {
        return (android.graphics.Paint) this.isConnected.getValue();
    }

    public static final android.graphics.Paint AEQbTJ(wYY wyy) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(wyy.DbNXlk);
        paint.setStrokeWidth(C55298xhM.dp$default(AEQbTJ, (android.content.Context) null, 1, (java.lang.Object) null));
        return paint;
    }

    public static /* synthetic */ void addViewForTip$OKUILib_uilib$default(wYY wyy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        wyy.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(boolean z) {
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc;
        int i;
        int size = this.AuCTel.size();
        int i2 = this.values;
        if (size <= i2) {
            return;
        }
        if (this.valueOf) {
            if (!z) {
                this.values = i2 - 1;
            }
            int i3 = this.values;
            if (i3 > -1 && i3 <= this.AuCTel.size() - 1) {
                if (this.values == this.AuCTel.size() - 1) {
                    ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc2 = this.EZpvd;
                    if (viewTreeObserverOnGlobalLayoutListenerC52808wZc2 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC52808wZc2.AYXKKw();
                        return;
                    }
                    return;
                }
                i = z ? this.values + 1 : 0;
                this.copydefault = this.AuCTel.get(this.values);
                djBIcL();
                OLrzqt(this.copydefault);
                viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.EZpvd;
                if (viewTreeObserverOnGlobalLayoutListenerC52808wZc == null) {
                    viewTreeObserverOnGlobalLayoutListenerC52808wZc.gEmmrt();
                    return;
                }
                return;
            }
            this.values = i;
            this.copydefault = this.AuCTel.get(this.values);
            djBIcL();
            OLrzqt(this.copydefault);
            viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.EZpvd;
            if (viewTreeObserverOnGlobalLayoutListenerC52808wZc == null) {
            }
        } else {
            java.util.Iterator<ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent> it = this.AuCTel.iterator();
            while (it.hasNext()) {
                OLrzqt(it.next());
            }
        }
    }

    public final void djBIcL() {
        removeAllViews();
    }

    public final void OLrzqt(ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        android.view.LayoutInflater layoutInflater = this.gEmmrt;
        Intrinsics.copydefault(pendingIntent);
        android.view.View viewInflate = layoutInflater.inflate(pendingIntent.copydefault(), (android.view.ViewGroup) this, false);
        viewInflate.setId(pendingIntent.copydefault());
        Intrinsics.copydefault(viewInflate);
        FrameLayout.LayoutParams layoutParamsKWHzl = KWHzl(viewInflate, pendingIntent);
        if (layoutParamsKWHzl == null) {
            return;
        }
        layoutParamsKWHzl.leftMargin = (int) pendingIntent.EZpvd().OLrzqt();
        layoutParamsKWHzl.topMargin = (int) pendingIntent.EZpvd().EZpvd();
        layoutParamsKWHzl.rightMargin = (int) pendingIntent.EZpvd().copydefault();
        int iKWHzl = (int) pendingIntent.EZpvd().KWHzl();
        layoutParamsKWHzl.bottomMargin = iKWHzl;
        if (layoutParamsKWHzl.rightMargin != 0) {
            layoutParamsKWHzl.gravity = 8388613;
        } else {
            layoutParamsKWHzl.gravity = 8388611;
        }
        if (iKWHzl != 0) {
            layoutParamsKWHzl.gravity |= 80;
        } else {
            layoutParamsKWHzl.gravity |= 48;
        }
        addView(viewInflate, layoutParamsKWHzl);
    }

    public final void AEQbTJ() {
        OLrzqt(this.djBIcL);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapAEQbTJ = AEQbTJ(measuredWidth, measuredHeight, config);
        if (bitmapAEQbTJ == null) {
            return;
        }
        this.djBIcL = bitmapAEQbTJ;
        Intrinsics.copydefault(bitmapAEQbTJ);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapAEQbTJ);
        canvas.drawColor(this.AYXKKw);
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.EZpvd;
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc != null) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.AkhnZx();
        }
        OLrzqt(this.AhwBna);
        android.graphics.Bitmap bitmapAEQbTJ2 = AEQbTJ(getMeasuredWidth(), getMeasuredHeight(), config);
        if (bitmapAEQbTJ2 == null) {
            return;
        }
        this.AhwBna = bitmapAEQbTJ2;
        if (this.valueOf) {
            EZpvd(this.copydefault);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (C33054mpH.AEQbTJ(context)) {
                EZpvd(canvas, this.copydefault);
            }
        } else {
            for (ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent : this.AuCTel) {
                EZpvd(pendingIntent);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                if (C33054mpH.AEQbTJ(context2)) {
                    EZpvd(canvas, pendingIntent);
                }
            }
        }
        android.graphics.Bitmap bitmap = this.AhwBna;
        Intrinsics.copydefault(bitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, AhwBna());
    }

    public final void EZpvd(android.graphics.Canvas canvas, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Activity activityKWHzl = pendingIntent.KWHzl();
        C52822wZq c52822wZq = activityKWHzl instanceof C52822wZq ? (C52822wZq) activityKWHzl : null;
        canvas.drawRoundRect(pendingIntent.OLrzqt(), c52822wZq != null ? c52822wZq.copydefault() : 0.0f, c52822wZq != null ? c52822wZq.KWHzl() : 0.0f, AYXKKw());
    }

    public final android.graphics.Bitmap AEQbTJ(int i, int i2, Bitmap.Config config) {
        if (i > 0 && i2 > 0) {
            try {
                return android.graphics.Bitmap.createBitmap(i, i2, config);
            } catch (java.lang.OutOfMemoryError unused) {
            }
        }
        return null;
    }

    public final void OLrzqt(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public final void EZpvd(ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Activity activityKWHzl;
        if (pendingIntent == null || (activityKWHzl = pendingIntent.KWHzl()) == null) {
            return;
        }
        activityKWHzl.copydefault(this.AhwBna, pendingIntent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || this.valueOf) {
            AEQbTJ();
            valueOf();
        }
    }

    public final void valueOf() {
        if (this.valueOf) {
            android.view.View childAt = getChildAt(0);
            Intrinsics.copydefault(childAt);
            ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent = this.copydefault;
            Intrinsics.copydefault(pendingIntent);
            childAt.setLayoutParams(KWHzl(childAt, pendingIntent));
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt2 = getChildAt(i);
            ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent2 = this.AuCTel.get(i);
            Intrinsics.copydefault(childAt2);
            childAt2.setLayoutParams(KWHzl(childAt2, pendingIntent2));
        }
    }

    public final FrameLayout.LayoutParams KWHzl(android.view.View view, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = (int) pendingIntent.EZpvd().OLrzqt();
        layoutParams2.topMargin = (int) pendingIntent.EZpvd().EZpvd();
        layoutParams2.rightMargin = (int) pendingIntent.EZpvd().copydefault();
        int iKWHzl = (int) pendingIntent.EZpvd().KWHzl();
        layoutParams2.bottomMargin = iKWHzl;
        if (layoutParams2.rightMargin != 0) {
            layoutParams2.gravity = 8388613;
        } else {
            layoutParams2.gravity = 8388611;
        }
        if (iKWHzl != 0) {
            layoutParams2.gravity |= 80;
        } else {
            layoutParams2.gravity |= 48;
        }
        return layoutParams2;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        try {
            android.graphics.Bitmap bitmap = this.djBIcL;
            Intrinsics.copydefault(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OLrzqt(this.AhwBna);
        OLrzqt(this.djBIcL);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.valueOf) {
                ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent pendingIntent = this.copydefault;
                if (pendingIntent != null && pendingIntent.OLrzqt().contains(x, y)) {
                    Function0<Unit> function0 = this.fetchVPNInfo;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return true;
                }
            } else {
                java.util.Iterator<ViewTreeObserverOnGlobalLayoutListenerC52808wZc.PendingIntent> it = this.AuCTel.iterator();
                while (it.hasNext()) {
                    if (it.next().OLrzqt().contains(x, y)) {
                        Function0<Unit> function02 = this.fetchVPNInfo;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
