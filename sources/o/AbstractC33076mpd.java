package o;

import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC33076mpd implements InterfaceC33080mph {
    public java.util.Map<java.lang.String, java.lang.Object> AEQbTJ;
    public java.util.List<InterfaceC33082mpj> EZpvd;

    public AbstractC33076mpd() {
        java.util.Map<java.lang.String, java.lang.Object> mapSynchronizedMap = Collections.synchronizedMap(new java.util.HashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "");
        this.AEQbTJ = mapSynchronizedMap;
        EZpvd(mapSynchronizedMap);
    }

    public <T> T KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        T t = (T) this.AEQbTJ.get(str);
        return KWHzl(str, t) ? (T) this.AEQbTJ.get(str) : t;
    }

    public <T> void OLrzqt(@NotNull java.lang.String str, T t) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(str, this.AEQbTJ.put(str, t), t);
    }

    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.containsKey(str);
    }

    public final boolean KWHzl(java.lang.String str, java.lang.Object obj) {
        java.util.List<InterfaceC33082mpj> list = this.EZpvd;
        boolean z = false;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC33082mpj) it.next()).EZpvd(str, obj)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void KWHzl(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        java.util.List<InterfaceC33082mpj> list = this.EZpvd;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC33082mpj) it.next()).OLrzqt(str, obj, obj2);
            }
        }
    }
}
