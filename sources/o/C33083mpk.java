package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C33083mpk extends AbstractC33076mpd {
    public static final C33083mpk KWHzl = new C33083mpk();

    private C33083mpk() {
    }

    @Override // o.InterfaceC33080mph
    public void EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        for (Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            KWHzl.OLrzqt(entry.getKey(), entry.getValue());
        }
    }
}
