package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57851yqH {
    void KWHzl(boolean z, @NotNull java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.Long l, long j, @NotNull java.lang.String str3);

    /* JADX INFO: renamed from: o.yqH$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.yqH */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logNetwork$default(InterfaceC57851yqH interfaceC57851yqH, boolean z, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.Long l, long j, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logNetwork");
            }
            interfaceC57851yqH.KWHzl(z, str, str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : l, (i & 32) != 0 ? C57850yqG.AEQbTJ() : j, (i & 64) != 0 ? C57850yqG.KWHzl() : str3);
        }
    }
}
