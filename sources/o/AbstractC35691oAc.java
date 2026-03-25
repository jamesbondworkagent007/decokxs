package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35691oAc implements InterfaceC35283nsR {
    public final C35254nrp EZpvd(int i, @NotNull RecyclerView.Adapter<?> adapter) {
        java.util.List<C35254nrp> currentList;
        Intrinsics.checkNotNullParameter(adapter, "");
        if (i < 0) {
            return null;
        }
        C37005olf c37005olf = adapter instanceof C37005olf ? (C37005olf) adapter : null;
        C35254nrp c35254nrp = (c37005olf == null || (currentList = c37005olf.getCurrentList()) == null) ? null : (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(currentList, i);
        if (c35254nrp == null) {
            return null;
        }
        return c35254nrp;
    }
}
