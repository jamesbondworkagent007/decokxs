package o;

import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C55159xeg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wVK extends C55159xeg.ActionBar<ShareChartDataPoint> {
    public final boolean OLrzqt;

    @Override // o.C55159xeg.ActionBar
    public float AEQbTJ() {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/xeq;)Ljava/lang/String; */
    @Override // o.C55159xeg.ActionBar
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String AEQbTJ(@NotNull ShareChartDataPoint shareChartDataPoint) {
        Intrinsics.checkNotNullParameter(shareChartDataPoint, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xeq;)Ljava/lang/String; */
    @Override // o.C55159xeg.ActionBar
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.String EZpvd(@NotNull ShareChartDataPoint shareChartDataPoint) {
        Intrinsics.checkNotNullParameter(shareChartDataPoint, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
    @Override // o.C55159xeg.ActionBar
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(ShareChartDataPoint shareChartDataPoint) {
        return this.OLrzqt;
    }

    public wVK(boolean z) {
        this.OLrzqt = z;
    }

    public static /* synthetic */ void drawChart$default(wVK wvk, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        wvk.EZpvd((java.util.List<ShareChartDataPoint>) list, z);
    }

    @Override // o.C55159xeg.ActionBar
    public C55170xer OLrzqt() {
        java.util.List<ShareChartDataPoint> listKWHzl = KWHzl();
        if (listKWHzl.isEmpty()) {
            return new C55170xer(0.0f, 1.0f);
        }
        java.util.Iterator<T> it = listKWHzl.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((ShareChartDataPoint) next).KWHzl().floatValue();
            do {
                java.lang.Object next2 = it.next();
                float fFloatValue2 = ((ShareChartDataPoint) next2).KWHzl().floatValue();
                if (java.lang.Float.compare(fFloatValue, fFloatValue2) > 0) {
                    next = next2;
                    fFloatValue = fFloatValue2;
                }
            } while (it.hasNext());
        }
        float fFloatValue3 = ((ShareChartDataPoint) next).KWHzl().floatValue();
        java.util.Iterator<T> it2 = listKWHzl.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        java.lang.Object next3 = it2.next();
        if (it2.hasNext()) {
            float fFloatValue4 = ((ShareChartDataPoint) next3).KWHzl().floatValue();
            do {
                java.lang.Object next4 = it2.next();
                float fFloatValue5 = ((ShareChartDataPoint) next4).KWHzl().floatValue();
                if (java.lang.Float.compare(fFloatValue4, fFloatValue5) < 0) {
                    next3 = next4;
                    fFloatValue4 = fFloatValue5;
                }
            } while (it2.hasNext());
        }
        return new C55170xer(fFloatValue3, ((ShareChartDataPoint) next3).KWHzl().floatValue());
    }

    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((ShareChartDataPoint) t).OLrzqt()), java.lang.Long.valueOf(((ShareChartDataPoint) t2).OLrzqt()));
        }
    }

    public final void EZpvd(@NotNull java.util.List<ShareChartDataPoint> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(list, new Application()));
        if (listFJNWhG.size() == 1) {
            listFJNWhG.add(0, new ShareChartDataPoint(0.0f, 0L, null, 4, null));
        }
        KWHzl(listFJNWhG, z);
    }
}
