package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17407fEe {
    java.lang.CharSequence KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z);

    /* JADX INFO: renamed from: o.fEe$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.CharSequence generate$default(InterfaceC17407fEe interfaceC17407fEe, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generate");
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return interfaceC17407fEe.KWHzl(str, str2, z);
        }
    }
}
