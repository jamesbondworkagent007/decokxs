package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5306Mq {
    void AEQbTJ(@NotNull java.lang.String str, java.lang.Throwable th);

    void KWHzl(@NotNull java.lang.String str);

    void copydefault(@NotNull java.lang.String str, java.lang.Throwable th);

    /* JADX INFO: renamed from: o.Mq$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ void w$default(InterfaceC5306Mq interfaceC5306Mq, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            interfaceC5306Mq.AEQbTJ(str, th);
        }

        public static /* synthetic */ void e$default(InterfaceC5306Mq interfaceC5306Mq, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            interfaceC5306Mq.copydefault(str, th);
        }
    }
}
