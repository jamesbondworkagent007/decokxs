package o;

import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.HomeTokenListWsData;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.kck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28543kck {
    public final java.util.Set<HomeTokenListWsData> AEQbTJ = new LinkedHashSet();
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<HomeTokenListWsData> copydefault() {
        return this.AEQbTJ;
    }

    public C28543kck(int i) {
        this.EZpvd = i;
    }

    public final boolean OLrzqt() {
        return this.AEQbTJ.size() == this.EZpvd;
    }

    public final java.util.List<HomeTokenData> AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = CollectionsKt___CollectionsKt.EZpvd(this.AEQbTJ, new Activity()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((HomeTokenListWsData) it.next()).copydefault());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.kck$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((HomeTokenListWsData) t).AEQbTJ()), java.lang.Integer.valueOf(((HomeTokenListWsData) t2).AEQbTJ()));
        }
    }
}
