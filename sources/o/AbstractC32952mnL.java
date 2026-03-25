package o;

import com.okinc.core.arch.data.StatefulData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC32952mnL<T> extends AbstractC32960mnT<T> {
    public final AtomicLong OLrzqt = new AtomicLong(0);
    public final ConcurrentHashMap<java.lang.String, InterfaceC58217yxC> EZpvd = new ConcurrentHashMap<>();

    public abstract InterfaceC58217yxC EZpvd(long j);

    public final long EZpvd() {
        return this.OLrzqt.incrementAndGet();
    }

    @Override // o.AbstractC32960mnT
    public final boolean copydefault() {
        long jEZpvd = EZpvd();
        InterfaceC58217yxC interfaceC58217yxCEZpvd = EZpvd(jEZpvd);
        if (interfaceC58217yxCEZpvd != null && !interfaceC58217yxCEZpvd.isDisposed()) {
            this.EZpvd.put(java.lang.String.valueOf(jEZpvd), interfaceC58217yxCEZpvd);
        }
        EZpvd(true);
        return true;
    }

    public final boolean KWHzl(long j) {
        return this.OLrzqt.get() != j;
    }

    public final void EZpvd(@NotNull StatefulData<T> statefulData, long j) {
        Intrinsics.checkNotNullParameter(statefulData, "");
        if (KWHzl(j)) {
            return;
        }
        setValue(statefulData);
    }

    public final void OLrzqt() {
        if (this.EZpvd.size() > 0) {
            java.util.Iterator<Map.Entry<java.lang.String, InterfaceC58217yxC>> it = this.EZpvd.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().dispose();
                it.remove();
            }
        }
    }
}
