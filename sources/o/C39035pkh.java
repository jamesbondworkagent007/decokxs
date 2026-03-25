package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C39037pkj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pkh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39035pkh {
    public static final C39037pkj copydefault(@NotNull java.util.Set<C39037pkj.TaskDescription> set) throws java.lang.ClassNotFoundException {
        java.lang.Object next;
        C39037pkj.TaskDescription taskDescription;
        Intrinsics.checkNotNullParameter(set, "");
        if (set.size() == 1) {
            taskDescription = (C39037pkj.TaskDescription) CollectionsKt___CollectionsKt.dNCPSb(set);
        } else {
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!((C39037pkj.TaskDescription) next).KWHzl()) {
                    break;
                }
            }
            taskDescription = (C39037pkj.TaskDescription) next;
            if (taskDescription == null) {
                throw new java.lang.ClassNotFoundException("pls provider your components which isDefaultComponent is not true");
            }
        }
        return taskDescription.OLrzqt().invoke();
    }
}
