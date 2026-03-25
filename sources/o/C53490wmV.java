package o;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.LinearLayout;
import com.okinc.unify_trade.biz.Distribution;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.wUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53490wmV {
    public static final C53490wmV KWHzl = new C53490wmV();

    public final int OLrzqt(int i, int i2) {
        if (i == 0) {
            return 8388611;
        }
        return i == i2 - 1 ? 8388613 : 1;
    }

    private C53490wmV() {
    }

    /* JADX INFO: renamed from: o.wmV$Application */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final BigDecimal EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, BigDecimal bigDecimal, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            if ((i & 2) != 0) {
                bigDecimal = application.EZpvd;
            }
            return application.copydefault(str, bigDecimal);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, @NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new Application(str, bigDecimal);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AdjustedDistribution(name=" + this.AEQbTJ + ", displayPercent=" + this.EZpvd + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.AEQbTJ = str;
            this.EZpvd = bigDecimal;
        }
    }

    public final java.util.List<Application> copydefault(java.util.List<Distribution> list) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        BigDecimal bigDecimal = new BigDecimal("100");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (Distribution distribution : list) {
            BigDecimal scale = pTB.OLrzqt((java.lang.Object) distribution.getRatio()).multiply(bigDecimal).setScale(2, RoundingMode.UP);
            java.lang.String name = distribution.getName();
            Intrinsics.copydefault(scale);
            arrayList.add(new Application(name, scale));
        }
        java.util.List<Application> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it = listFJNWhG.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((Application) it.next()).copydefault());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        BigDecimal bigDecimalSubtract = bigDecimalValueOf.subtract(new BigDecimal("100"));
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalSubtract.compareTo(bigDecimal2) == 0) {
            return listFJNWhG;
        }
        BigDecimal bigDecimal3 = new BigDecimal("0.01");
        if (bigDecimalSubtract.compareTo(bigDecimal2) < 0) {
            BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
            Application application = listFJNWhG.get(0);
            BigDecimal bigDecimalAdd = listFJNWhG.get(0).copydefault().add(bigDecimalAbs);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
            listFJNWhG.set(0, Application.copy$default(application, null, bigDecimalAdd, 1, null));
        } else {
            int size = listFJNWhG.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    BigDecimal bigDecimal4 = BigDecimal.ZERO;
                    if (bigDecimalSubtract.compareTo(bigDecimal4) <= 0) {
                        break;
                    }
                    BigDecimal bigDecimalCopydefault = listFJNWhG.get(size).copydefault();
                    BigDecimal bigDecimalMin = bigDecimalSubtract.min(bigDecimalCopydefault.subtract(bigDecimal3).max(bigDecimal4));
                    if (bigDecimalMin.compareTo(bigDecimal4) > 0) {
                        Application application2 = listFJNWhG.get(size);
                        BigDecimal bigDecimalSubtract2 = bigDecimalCopydefault.subtract(bigDecimalMin);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "");
                        listFJNWhG.set(size, Application.copy$default(application2, null, bigDecimalSubtract2, 1, null));
                        bigDecimalSubtract = bigDecimalSubtract.subtract(bigDecimalMin);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            if (bigDecimalSubtract.compareTo(BigDecimal.ZERO) > 0 && (!listFJNWhG.isEmpty())) {
                Application application3 = listFJNWhG.get(0);
                BigDecimal bigDecimalSubtract3 = listFJNWhG.get(0).copydefault().subtract(bigDecimalSubtract);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract3, "");
                listFJNWhG.set(0, Application.copy$default(application3, null, bigDecimalSubtract3, 1, null));
            }
        }
        return listFJNWhG;
    }

    public final void copydefault(@NotNull android.content.Context context, java.util.List<Distribution> list, @NotNull wUX wux, @NotNull android.widget.TextView textView, @NotNull android.widget.LinearLayout linearLayout, android.view.View view, java.util.List<? extends android.view.View> list2, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(wux, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(linearLayout, "");
        if (list == null || list.isEmpty()) {
            copydefault(8, wux, textView, linearLayout);
            if (view != null) {
                view.setVisibility(8);
            }
            if (list2 != null) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    ((android.view.View) it.next()).setVisibility(8);
                }
                return;
            }
            return;
        }
        java.util.List<Distribution> listEZpvd = EZpvd(list);
        if (listEZpvd.isEmpty()) {
            copydefault(8, wux, textView, linearLayout);
            if (view != null) {
                view.setVisibility(8);
            }
            if (list2 != null) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    ((android.view.View) it2.next()).setVisibility(8);
                }
                return;
            }
            return;
        }
        java.util.List<java.lang.Integer> listEZpvd2 = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(((Distribution) obj).getRatio());
            if (bigDecimalFARcdN == null) {
                bigDecimalFARcdN = BigDecimal.ZERO;
            }
            Intrinsics.copydefault(bigDecimalFARcdN);
            arrayList.add(new wUX.ActionBar(bigDecimalFARcdN, listEZpvd2.get(i % listEZpvd2.size()).intValue()));
            i++;
        }
        wux.OLrzqt(arrayList);
        copydefault(0, wux, textView, linearLayout);
        if (view != null) {
            view.setVisibility(0);
        }
        if (list2 != null) {
            java.util.Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                ((android.view.View) it3.next()).setVisibility(0);
            }
        }
        KWHzl(context, listEZpvd, listEZpvd2, linearLayout, z);
    }

    public final java.util.List<java.lang.Integer> EZpvd() {
        return yDY.gEmmrt(java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), java.lang.Integer.valueOf(C33512mxp.AEQbTJ.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ), 0.5f)), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zuBGHE)));
    }

    public static /* synthetic */ void updateCoinTextLayout$default(C53490wmV c53490wmV, android.content.Context context, java.util.List list, java.util.List list2, android.widget.LinearLayout linearLayout, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        c53490wmV.KWHzl(context, list, list2, linearLayout, z);
    }

    public final void KWHzl(android.content.Context context, java.util.List<Distribution> list, java.util.List<java.lang.Integer> list2, android.widget.LinearLayout linearLayout, boolean z) {
        int i;
        android.text.SpannableString spannableString;
        linearLayout.removeAllViews();
        float fDp2px$default = C55298xhM.dp2px$default(6.0f, null, 1, null);
        java.util.List<Application> listCopydefault = copydefault(list);
        int size = listCopydefault.size();
        int i2 = 0;
        int i3 = 0;
        for (java.lang.Object obj : listCopydefault) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            Application application = (Application) obj;
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
            linearLayout2.setOrientation(i2);
            C53490wmV c53490wmV = KWHzl;
            linearLayout2.setGravity(c53490wmV.OLrzqt(i3, size));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, -2);
            layoutParams.weight = 1.0f;
            linearLayout2.setLayoutParams(layoutParams);
            android.widget.TextView textView = new android.widget.TextView(context);
            java.lang.String str = application.AEQbTJ() + " " + pTB.formatICUPercent$default(application.copydefault(), null, null, null, java.lang.Double.valueOf(1.0d), null, 23, null);
            ShapeDrawable shapeDrawableEZpvd = c53490wmV.EZpvd(list2.get(i3 % list2.size()).intValue());
            if (z) {
                textView.setCompoundDrawables(shapeDrawableEZpvd, null, null, null);
                textView.setCompoundDrawablePadding(C55298xhM.dp2px$default(4.0f, null, 1, null));
            }
            Activity activityEZpvd = c53490wmV.EZpvd(shapeDrawableEZpvd, fDp2px$default);
            if (z) {
                spannableString = new android.text.SpannableString(C55296xhK.OLrzqt(context) ? " " + str : java.lang.String.valueOf(str));
                i = 0;
            } else {
                android.text.SpannableString spannableString2 = new android.text.SpannableString(C55296xhK.OLrzqt(context) ? "  " + str : " " + str);
                i = 0;
                spannableString2.setSpan(activityEZpvd, 0, 1, 33);
                spannableString = spannableString2;
            }
            try {
                textView.setTextAppearance(C52761wXj.LoaderManager.QSLkRj);
            } catch (java.lang.Exception unused) {
            }
            textView.setText(spannableString);
            textView.setTextSize(12.0f);
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textView.setGravity(z ? 8388611 : KWHzl.OLrzqt(i3, size));
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.addView(textView);
            linearLayout.addView(linearLayout2);
            i3++;
            i2 = i;
        }
    }

    public final ShapeDrawable EZpvd(int i) {
        int iDp2px$default = C55298xhM.dp2px$default(6.0f, null, 1, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        try {
            android.graphics.Paint paint = shapeDrawable.getPaint();
            paint.setColor(i);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
        } catch (java.lang.Exception unused) {
        }
        shapeDrawable.setBounds(0, 0, iDp2px$default, iDp2px$default);
        return shapeDrawable;
    }

    /* JADX INFO: renamed from: o.wmV$Activity */
    public static final class Activity extends android.text.style.ImageSpan {
        public final /* synthetic */ float OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(ShapeDrawable shapeDrawable, float f) {
            super(shapeDrawable, 1);
            this.OLrzqt = f;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, android.graphics.Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(paint, "");
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float fHeight = ((fontMetrics.descent - fontMetrics.ascent) - getDrawable().getBounds().height()) / 2.0f;
            float f2 = fontMetrics.ascent;
            int iSave = canvas.save();
            canvas.translate(f, i4 + fHeight + f2);
            try {
                getDrawable().draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Intrinsics.checkNotNullParameter(paint, "");
            if (fontMetricsInt != null) {
                int i3 = fontMetricsInt.descent;
                int i4 = fontMetricsInt.ascent;
                float f = (((i3 - i4) - r3) / 2.0f) + fontMetricsInt.ascent;
                float fHeight = getDrawable().getBounds().height();
                int i5 = (int) f;
                fontMetricsInt.ascent = i5;
                int i6 = (int) (fHeight + f);
                fontMetricsInt.descent = i6;
                fontMetricsInt.top = i5;
                fontMetricsInt.bottom = i6;
            }
            return getDrawable().getBounds().width() + ((int) this.OLrzqt);
        }
    }

    public final Activity EZpvd(ShapeDrawable shapeDrawable, float f) {
        return new Activity(shapeDrawable, f);
    }

    public final java.util.List<Distribution> EZpvd(java.util.List<Distribution> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(((Distribution) obj).getRatio());
            if (bigDecimalFARcdN == null) {
                bigDecimalFARcdN = BigDecimal.ZERO;
            }
            if (bigDecimalFARcdN.compareTo(BigDecimal.ZERO) > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void copydefault(int i, android.view.View... viewArr) {
        for (android.view.View view : viewArr) {
            view.setVisibility(i);
        }
    }
}
