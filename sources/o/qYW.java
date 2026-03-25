package o;

import android.graphics.Paint;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.okinc.market.widget.calendar.AttrsHolder;
import java.text.DateFormatSymbols;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYW extends AppCompatTextView {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public boolean EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<android.graphics.Rect> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qYW(@NotNull android.content.Context context, @NotNull AttrsHolder attrsHolder) {
        java.lang.String strCopydefault;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        TextViewCompat.setTextAppearance(this, attrsHolder.QOLQEE());
        setTextColor(attrsHolder.DTwDnp());
        setBackgroundColor(attrsHolder.sSMYrx());
        setLayoutParams(new LinearLayout.LayoutParams(-1, attrsHolder.AwvSrB()));
        java.lang.String[] shortWeekdays = new DateFormatSymbols().getShortWeekdays();
        java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> listEZpvd = Companion.EZpvd(attrsHolder);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            int iIntValue = ((java.lang.Number) pair.component1()).intValue();
            int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
            if (this.EZpvd) {
                strCopydefault = shortWeekdays[iIntValue];
            } else {
                strCopydefault = C41431qqg.copydefault(this, iIntValue2);
            }
            arrayList.add(strCopydefault);
        }
        this.KWHzl = arrayList;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(new android.graphics.Rect());
        }
        this.copydefault = arrayList2;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qYW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> EZpvd(@NotNull AttrsHolder attrsHolder) {
            Intrinsics.checkNotNullParameter(attrsHolder, "");
            java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> listGEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt(1, java.lang.Integer.valueOf(pVX.LoaderManager.AxsJAY)), C56390yDp.OLrzqt(2, java.lang.Integer.valueOf(pVX.LoaderManager.zLjUOn)), C56390yDp.OLrzqt(3, java.lang.Integer.valueOf(pVX.LoaderManager.gHZMYf)), C56390yDp.OLrzqt(4, java.lang.Integer.valueOf(pVX.LoaderManager.zuBGHE)), C56390yDp.OLrzqt(5, java.lang.Integer.valueOf(pVX.LoaderManager.AwvSrB)), C56390yDp.OLrzqt(6, java.lang.Integer.valueOf(pVX.LoaderManager.zsXlph)), C56390yDp.OLrzqt(7, java.lang.Integer.valueOf(pVX.LoaderManager.sSMYrx)));
            return attrsHolder.uzCIH() == AttrsHolder.FirstDayOfWeek.MONDAY ? CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends java.lang.Object>) CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listGEmmrt, 1), CollectionsKt___CollectionsKt.AuCTelauCTel(listGEmmrt)) : listGEmmrt;
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:12:0x007c */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        getPaint().setTextAlign(Paint.Align.CENTER);
        int size = this.KWHzl.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            this.copydefault.get(i).set((getWidth() * i) / this.KWHzl.size(), 0, (getWidth() * i2) / this.KWHzl.size(), getHeight());
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            float f = 2;
            int iCenterY = (int) ((r3.centerY() - (fontMetrics.top / f)) - (fontMetrics.bottom / f));
            if (this.AEQbTJ) {
                java.util.List<java.lang.String> list = this.KWHzl;
                str = list.get(i2 > list.size() + (-1) ? 0 : i2);
            } else {
                str = this.KWHzl.get(i);
            }
            canvas.drawText(str, r3.centerX(), iCenterY, getPaint());
            i = i2;
        }
    }
}
