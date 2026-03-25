package o;

import io.reactivex.exceptions.CompositeException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58091yuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58059yuD {
    public final java.util.List<InterfaceC58091yuj.TaskDescription> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.yuj$TaskDescription> */
    /* JADX WARN: Multi-variable type inference failed */
    public C58059yuD(@NotNull java.util.List<? extends InterfaceC58091yuj.TaskDescription> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    public final InterfaceC58091yuj<java.lang.Object, java.lang.Object> KWHzl(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<InterfaceC58091yuj.TaskDescription> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            try {
                return it.next().create(type);
            } catch (java.lang.Throwable th) {
                arrayList.add(th);
            }
        }
        java.lang.Throwable[] thArr = (java.lang.Throwable[]) arrayList.toArray(new java.lang.Throwable[0]);
        throw new java.lang.IllegalStateException("Cannot resolve stream adapter for type " + type + '.', new CompositeException((java.lang.Throwable[]) java.util.Arrays.copyOf(thArr, thArr.length)));
    }
}
