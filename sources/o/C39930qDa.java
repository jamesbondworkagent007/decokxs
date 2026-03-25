package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48917uei;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39930qDa extends android.view.ViewGroup {
    public boolean AEQbTJ;
    public final int AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final int KWHzl;
    public java.util.List<kotlin.Pair<C52794wYp, android.graphics.Rect>> OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public Function1<? super C48917uei.Application, Unit> valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39930qDa(@NotNull final android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C55298xhM.KWHzl(8.0f, context);
        this.AhwBna = C55298xhM.KWHzl(8.0f, context);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.qCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39930qDa.KWHzl(context, this);
            }
        });
        this.OLrzqt = new java.util.ArrayList();
    }

    private final kotlin.Pair<C52794wYp, android.graphics.Rect> EZpvd() {
        return (kotlin.Pair) this.EZpvd.getValue();
    }

    public static final kotlin.Pair KWHzl(android.content.Context context, final C39930qDa c39930qDa) {
        final C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c52794wYp.setOKDSSize(28);
        c52794wYp.setOKDSType(260);
        c39930qDa.AEQbTJ(c52794wYp);
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.qCZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39930qDa.copydefault(this.OLrzqt, c52794wYp, view);
            }
        });
        return C56390yDp.OLrzqt(c52794wYp, new android.graphics.Rect());
    }

    public static final void copydefault(C39930qDa c39930qDa, C52794wYp c52794wYp, android.view.View view) {
        c39930qDa.AEQbTJ = !c39930qDa.AEQbTJ;
        c39930qDa.AEQbTJ(c52794wYp);
        Function1<? super java.lang.Boolean, Unit> function1 = c39930qDa.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(c39930qDa.AEQbTJ));
        }
        c52794wYp.requestLayout();
    }

    public final boolean AEQbTJ() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final <T extends C48917uei.Application> void setHistoryData$OKMarket_market_impl(@NotNull java.util.List<? extends T> list, boolean z, @NotNull Function1<? super T, Unit> function1, @NotNull Function1<? super java.lang.Boolean, Unit> function12) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = z;
        this.valueOf = (Function1) C56532yIw.KWHzl(function1, 1);
        this.copydefault = function12;
        KWHzl(list);
        requestLayout();
    }

    public final void KWHzl(java.util.List<? extends C48917uei.Application> list) {
        removeAllViews();
        this.OLrzqt.clear();
        for (C48917uei.Application application : list) {
            java.lang.String strOnGetTitle = application.onGetTitle();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOnGetTitle)) {
                C52794wYp c52794wYpEZpvd = EZpvd(strOnGetTitle, application);
                this.OLrzqt.add(C56390yDp.OLrzqt(c52794wYpEZpvd, new android.graphics.Rect()));
                addView(c52794wYpEZpvd);
            }
        }
        addView(EZpvd().getFirst());
    }

    public final C52794wYp EZpvd(java.lang.String str, final C48917uei.Application application) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSSize(28);
        c52794wYp.setOKDSType(260);
        c52794wYp.setText(str);
        android.content.Context context2 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c52794wYp.setMaxWidth(C55298xhM.KWHzl(192.0f, context2));
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.qCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39930qDa.AEQbTJ(this.copydefault, application, view);
            }
        });
        return c52794wYp;
    }

    public static final void AEQbTJ(C39930qDa c39930qDa, C48917uei.Application application, android.view.View view) {
        Function1<? super C48917uei.Application, Unit> function1 = c39930qDa.valueOf;
        if (function1 != null) {
            function1.invoke(application);
        }
    }

    public final void AEQbTJ(C52794wYp c52794wYp) {
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), this.AEQbTJ ? C52761wXj.TaskDescription.jNexW : C52761wXj.TaskDescription.bindToGooglePlayService);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(c52794wYp.getContext(), C52761wXj.Activity.aappFQ));
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.OLrzqt.isEmpty()) {
            setMeasuredDimension(0, 0);
            return;
        }
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            measureChild((android.view.View) pair.getFirst(), i, i2);
            ((android.graphics.Rect) pair.getSecond()).set(0, 0, ((C52794wYp) pair.getFirst()).getMeasuredWidth(), ((C52794wYp) pair.getFirst()).getMeasuredHeight());
        }
        measureChild(EZpvd().getFirst(), i, i2);
        setMeasuredDimension(size, EZpvd(size));
    }

    public final int EZpvd(int i) {
        kotlin.Pair<C52794wYp, android.graphics.Rect> pairEZpvd = EZpvd();
        pairEZpvd.getSecond().set(0, 0, pairEZpvd.getFirst().getMeasuredWidth(), pairEZpvd.getFirst().getMeasuredHeight());
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            ((android.graphics.Rect) pair.getSecond()).set(0, 0, ((C52794wYp) pair.getFirst()).getMeasuredWidth(), ((C52794wYp) pair.getFirst()).getMeasuredHeight());
        }
        if (AEQbTJ()) {
            return KWHzl(i);
        }
        return AEQbTJ(i);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.OLrzqt.clear();
        EZpvd().getSecond().setEmpty();
        super.removeAllViews();
    }

    public final int AEQbTJ(int i) {
        android.graphics.Rect rect;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (java.lang.Object obj : this.OLrzqt) {
            if (i4 < 0) {
                yDY.AYXKKw();
            }
            android.graphics.Rect rect2 = (android.graphics.Rect) ((kotlin.Pair) obj).getSecond();
            rect2.offsetTo(i6 == 0 ? 0 : i6 + this.KWHzl, i5 == 0 ? 0 : i5);
            if (rect2.right > i) {
                i7++;
                rect2.offsetTo(0, i5 + this.AhwBna + rect2.height());
            }
            i6 = rect2.right;
            i5 = rect2.top;
            if (i7 == 1) {
                i3 = i4;
            }
            i4++;
        }
        android.graphics.Rect second = EZpvd().getSecond();
        if (i3 == yDY.AuCTel(this.OLrzqt) || i3 == 0) {
            second.setEmpty();
            kotlin.Pair pair = (kotlin.Pair) CollectionsKt___CollectionsKt.wlaJM(this.OLrzqt);
            if (pair == null || (rect = (android.graphics.Rect) pair.getSecond()) == null) {
                return 0;
            }
            return rect.bottom;
        }
        if (this.AEQbTJ) {
            android.graphics.Rect rect3 = (android.graphics.Rect) ((kotlin.Pair) CollectionsKt___CollectionsKt.AubY(this.OLrzqt)).getSecond();
            second.offsetTo(rect3.right + this.KWHzl, rect3.top);
            if (second.right > i) {
                second.offsetTo(0, second.bottom + this.AhwBna);
            }
            return second.bottom;
        }
        android.graphics.Rect second2 = this.OLrzqt.get(i3).getSecond();
        int i8 = second2.bottom;
        second.offsetTo(second2.right + this.KWHzl, second2.top);
        if (second.right > i) {
            second.offsetTo(second2.left, second2.top);
            for (java.lang.Object obj2 : this.OLrzqt) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair2 = (kotlin.Pair) obj2;
                if (i2 >= i3) {
                    ((android.graphics.Rect) pair2.getSecond()).setEmpty();
                }
                i2++;
            }
        } else {
            for (java.lang.Object obj3 : this.OLrzqt) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair3 = (kotlin.Pair) obj3;
                if (i2 > i3) {
                    ((android.graphics.Rect) pair3.getSecond()).setEmpty();
                }
                i2++;
            }
        }
        return i8;
    }

    public final int KWHzl(int i) {
        android.graphics.Rect rect;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (java.lang.Object obj : this.OLrzqt) {
            if (i5 < 0) {
                yDY.AYXKKw();
            }
            android.graphics.Rect rect2 = (android.graphics.Rect) ((kotlin.Pair) obj).getSecond();
            rect2.offsetTo((i3 == i ? i : i3 - this.KWHzl) - rect2.width(), i6 == 0 ? 0 : i6);
            if (rect2.left < 0) {
                i7++;
                rect2.offsetTo(i - rect2.width(), i6 + this.AhwBna + rect2.height());
            }
            i3 = rect2.left;
            i6 = rect2.top;
            if (i7 == 1) {
                i4 = i5;
            }
            i5++;
        }
        android.graphics.Rect second = EZpvd().getSecond();
        if (i4 == yDY.AuCTel(this.OLrzqt) || i4 == 0) {
            second.setEmpty();
            kotlin.Pair pair = (kotlin.Pair) CollectionsKt___CollectionsKt.wlaJM(this.OLrzqt);
            if (pair == null || (rect = (android.graphics.Rect) pair.getSecond()) == null) {
                return 0;
            }
            return rect.bottom;
        }
        if (this.AEQbTJ) {
            android.graphics.Rect rect3 = (android.graphics.Rect) ((kotlin.Pair) CollectionsKt___CollectionsKt.AubY(this.OLrzqt)).getSecond();
            second.offsetTo((rect3.left - this.KWHzl) - second.width(), rect3.top);
            if (second.left < 0) {
                second.offsetTo(i - second.width(), second.bottom + this.AhwBna);
            }
            return second.bottom;
        }
        android.graphics.Rect second2 = this.OLrzqt.get(i4).getSecond();
        int i8 = second2.bottom;
        second.offsetTo((second2.left - this.KWHzl) - second.width(), second2.top);
        if (second.left < 0) {
            second.offsetTo(second2.right - second.width(), second2.top);
            for (java.lang.Object obj2 : this.OLrzqt) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair2 = (kotlin.Pair) obj2;
                if (i2 >= i4) {
                    ((android.graphics.Rect) pair2.getSecond()).setEmpty();
                }
                i2++;
            }
        } else {
            for (java.lang.Object obj3 : this.OLrzqt) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                kotlin.Pair pair3 = (kotlin.Pair) obj3;
                if (i2 > i4) {
                    ((android.graphics.Rect) pair3.getSecond()).setEmpty();
                }
                i2++;
            }
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            C52794wYp c52794wYp = (C52794wYp) pair.getFirst();
            android.graphics.Rect rect = (android.graphics.Rect) pair.getSecond();
            c52794wYp.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        kotlin.Pair<C52794wYp, android.graphics.Rect> pairEZpvd = EZpvd();
        C52794wYp first = pairEZpvd.getFirst();
        android.graphics.Rect second = pairEZpvd.getSecond();
        first.layout(second.left, second.top, second.right, second.bottom);
    }
}
