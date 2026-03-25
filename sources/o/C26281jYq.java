package o;

import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26281jYq implements kMU {
    public static final C26281jYq AEQbTJ = new C26281jYq();

    private C26281jYq() {
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
