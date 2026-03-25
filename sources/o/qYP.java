package o;

import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.widget.TextViewCompat;
import com.okinc.market.widget.calendar.AttrsHolder;
import com.okinc.market.widget.calendar.DayItem;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYP extends AppCompatTextView {
    public qYV AEQbTJ;
    public qYZ AYXKKw;
    public int AhwBna;
    public Calendar EZpvd;
    public boolean KWHzl;
    public final AttrsHolder OLrzqt;
    public java.util.List<DayItem> copydefault;
    public final int djBIcL;
    public android.view.GestureDetector gEmmrt;
    public C40524qZa valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qYP(@NotNull android.content.Context context, @NotNull AttrsHolder attrsHolder) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        this.OLrzqt = attrsHolder;
        this.copydefault = new java.util.ArrayList();
        this.djBIcL = 7;
        this.KWHzl = true;
        TextViewCompat.setTextAppearance(this, attrsHolder.DbNXlk());
        setTextColor(attrsHolder.fetchVPNInfo());
        setGravity(17);
        if (isInEditMode()) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            EZpvd(qYU.AEQbTJ(calendar));
        }
        this.gEmmrt = new android.view.GestureDetector(context, new ActionBar());
    }

    public final void setDate$OKMarket_market_common_impl(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date == null) {
            return;
        }
        calendar.setTime(date);
        EZpvd(calendar);
    }

    private final void EZpvd(Calendar calendar) {
        Calendar calendar2 = this.EZpvd;
        if (calendar2 != null && calendar != null) {
            Intrinsics.copydefault(calendar2);
            if (qYU.AEQbTJ(calendar2, calendar)) {
                return;
            }
        }
        java.lang.Object objClone = calendar != null ? calendar.clone() : null;
        this.EZpvd = objClone instanceof Calendar ? (Calendar) objClone : null;
        AEQbTJ();
    }

    public final void AEQbTJ() {
        DayItem.MonthType monthType;
        kotlin.Pair pairOLrzqt;
        Calendar calendar = this.EZpvd;
        java.lang.Object objClone = calendar != null ? calendar.clone() : null;
        Calendar calendar2 = objClone instanceof Calendar ? (Calendar) objClone : null;
        if (calendar2 == null) {
            return;
        }
        int i = calendar2.get(2);
        calendar2.setFirstDayOfWeek(this.OLrzqt.uzCIH() == AttrsHolder.FirstDayOfWeek.SUNDAY ? 1 : 2);
        calendar2.set(5, 1);
        calendar2.setMinimalDaysInFirstWeek(1);
        this.AhwBna = calendar2.getActualMaximum(4);
        java.util.Iterator<kotlin.Pair<java.lang.Integer, java.lang.Integer>> it = qYW.Companion.EZpvd(this.OLrzqt).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (calendar2.get(7) == it.next().getFirst().intValue()) {
                break;
            } else {
                i2++;
            }
        }
        calendar2.add(5, -(i2 + 1));
        Calendar calendar3 = Calendar.getInstance();
        int i3 = this.djBIcL * this.AhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            calendar2.add(5, 1);
            int i5 = calendar2.get(2);
            if (i5 < i) {
                monthType = DayItem.MonthType.PREV_MONTH;
            } else if (i5 > i) {
                monthType = DayItem.MonthType.NEXT_MONTH;
            } else {
                monthType = DayItem.MonthType.CURRENT_MONTH;
            }
            DayItem.MonthType monthType2 = monthType;
            if (monthType2 == DayItem.MonthType.CURRENT_MONTH) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.OLrzqt.fetchVPNInfo()), java.lang.Boolean.FALSE);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(this.OLrzqt.values()), java.lang.Boolean.valueOf(this.OLrzqt.isConnected()));
            }
            int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
            boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component2()).booleanValue();
            Date time = calendar2.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            int i6 = calendar2.get(5);
            Intrinsics.copydefault(calendar3);
            arrayList.add(new DayItem(time, java.lang.String.valueOf(i6), monthType2, zBooleanValue, iIntValue, qYU.EZpvd(calendar3, calendar2), calendar3.before(calendar2), null, null, MLKEMEngine.KyberPolyBytes, null));
        }
        this.copydefault = arrayList;
        if (this.OLrzqt.ejfBZ()) {
            this.AYXKKw = new qYZ(this.OLrzqt, this.AhwBna);
        }
        AttrsHolder attrsHolder = this.OLrzqt;
        android.text.TextPaint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        this.AEQbTJ = new qYV(attrsHolder, paint, this.copydefault, this.AhwBna);
        if (this.OLrzqt.EZpvd()) {
            getPaint().setTextAlign(Paint.Align.CENTER);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AttrsHolder attrsHolder2 = this.OLrzqt;
            android.text.TextPaint paint2 = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "");
            this.valueOf = new C40524qZa(context, attrsHolder2, paint2, this.copydefault);
        }
        copydefault();
        requestLayout();
        invalidate();
    }

    public final void copydefault() {
        if (isInEditMode()) {
            java.security.SecureRandom secureRandom = new java.security.SecureRandom();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "");
            Calendar calendarAEQbTJ = qYU.AEQbTJ(calendar);
            calendarAEQbTJ.set(5, 1);
            int i = 0;
            int i2 = 0;
            while (i2 < 7) {
                java.lang.Object objClone = calendarAEQbTJ.getTime().clone();
                Intrinsics.copydefault(objClone, "");
                arrayList.add(new qYM("", (Date) objClone, java.lang.String.valueOf(secureRandom.nextInt(100)), C41431qqg.getRaiseColor$default(this, i, i, 3, null), 0, 0, 48, null));
                calendarAEQbTJ.add(5, secureRandom.nextInt(4) + 1);
                i2++;
                i = 0;
            }
            setExtraData$OKMarket_market_common_impl(arrayList);
        }
    }

    public static final class ActionBar extends GestureDetector.SimpleOnGestureListener {

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[DayItem.MonthType.values().length];
                try {
                    iArr[DayItem.MonthType.CURRENT_MONTH.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[DayItem.MonthType.PREV_MONTH.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[DayItem.MonthType.NEXT_MONTH.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                KWHzl = iArr;
            }
        }

        public ActionBar() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(motionEvent, "");
            return qYP.this.OLrzqt(motionEvent) != null;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
            Function1<DayItem, java.lang.Boolean> function1ZLjUOn;
            Function1<DayItem, java.lang.Boolean> function1ZsXlph;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            DayItem dayItemOLrzqt = qYP.this.OLrzqt(motionEvent);
            DayItem.MonthType monthTypeCopydefault = dayItemOLrzqt != null ? dayItemOLrzqt.copydefault() : null;
            int i = monthTypeCopydefault == null ? -1 : Application.KWHzl[monthTypeCopydefault.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 || !dayItemOLrzqt.EZpvd(qYP.this.OLrzqt) || (function1ZsXlph = qYP.this.OLrzqt.zsXlph()) == null || !function1ZsXlph.invoke(dayItemOLrzqt).booleanValue()) {
                        return false;
                    }
                } else if (!dayItemOLrzqt.EZpvd(qYP.this.OLrzqt) || (function1ZLjUOn = qYP.this.OLrzqt.zLjUOn()) == null || !function1ZLjUOn.invoke(dayItemOLrzqt).booleanValue()) {
                    return false;
                }
            } else {
                if (dayItemOLrzqt.valueOf() && !qYP.this.OLrzqt.KWHzl()) {
                    return false;
                }
                Function1<DayItem, Unit> function1AuCTelauCTel = qYP.this.OLrzqt.AuCTelauCTel();
                if (function1AuCTelauCTel != null) {
                    function1AuCTelauCTel.invoke(dayItemOLrzqt);
                }
            }
            return true;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.gEmmrt.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final DayItem OLrzqt(android.view.MotionEvent motionEvent) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DayItem) next).EZpvd().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                break;
            }
        }
        return (DayItem) next;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!isDirty() && !this.KWHzl) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.AhwBna * this.OLrzqt.djBIcL()), 1073741824));
        qYZ qyz = this.AYXKKw;
        if (qyz != null) {
            qyz.EZpvd(getMeasuredWidth(), getMeasuredHeight());
        }
        qYV qyv = this.AEQbTJ;
        if (qyv != null) {
            qyv.OLrzqt(getMeasuredWidth(), getMeasuredHeight());
        }
        C40524qZa c40524qZa = this.valueOf;
        if (c40524qZa != null) {
            c40524qZa.AEQbTJ(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            this.KWHzl = true;
        }
        if (isDirty() || this.KWHzl) {
            qYZ qyz = this.AYXKKw;
            if (qyz != null) {
                qyz.EZpvd(z, i, i2, i3, i4);
            }
            qYV qyv = this.AEQbTJ;
            if (qyv != null) {
                qyv.KWHzl(z, i, i2, i3, i4);
            }
            C40524qZa c40524qZa = this.valueOf;
            if (c40524qZa != null) {
                c40524qZa.copydefault(z, i, i2, i3, i4);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        qYZ qyz = this.AYXKKw;
        if (qyz != null) {
            qyz.OLrzqt(canvas);
        }
        qYV qyv = this.AEQbTJ;
        if (qyv != null) {
            qyv.KWHzl(canvas);
        }
        C40524qZa c40524qZa = this.valueOf;
        if (c40524qZa != null) {
            c40524qZa.AEQbTJ(canvas);
        }
        KWHzl(canvas);
        this.KWHzl = false;
    }

    public final void KWHzl(android.graphics.Canvas canvas) {
        Date time;
        if (isInEditMode()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM", java.util.Locale.getDefault());
            Calendar calendar = this.EZpvd;
            if (calendar == null || (time = calendar.getTime()) == null) {
                return;
            }
            java.lang.String str = simpleDateFormat.format(time);
            int color = getPaint().getColor();
            float textSize = getPaint().getTextSize();
            getPaint().setColor(SupportMenu.CATEGORY_MASK);
            android.text.TextPaint paint = getPaint();
            paint.setTextSize(paint.getTextSize() * 0.5f);
            canvas.drawText(str, 0.0f, getPaint().getFontMetrics().bottom - getPaint().getFontMetrics().top, getPaint());
            getPaint().setTextSize(textSize);
            getPaint().setColor(color);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setExtraData$OKMarket_market_common_impl(java.util.List<qYM> list) {
        java.util.ArrayList arrayList;
        qYM qym;
        java.lang.Object next;
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (qYM qym2 : list) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(qym2.EZpvd());
                arrayList.add(C56390yDp.OLrzqt(calendar, qym2));
            }
        } else {
            arrayList = null;
        }
        Calendar calendar2 = Calendar.getInstance();
        for (DayItem dayItem : this.copydefault) {
            calendar2.setTime(dayItem.OLrzqt());
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Intrinsics.copydefault(calendar2);
                    java.lang.Object first = ((kotlin.Pair) next).getFirst();
                    Intrinsics.checkNotNullExpressionValue(first, "");
                    if (qYU.EZpvd(calendar2, (Calendar) first)) {
                        break;
                    }
                }
                kotlin.Pair pair = (kotlin.Pair) next;
                qym = pair != null ? (qYM) pair.getSecond() : null;
            }
            dayItem.KWHzl(qym);
        }
        this.KWHzl = true;
        invalidate();
    }
}
