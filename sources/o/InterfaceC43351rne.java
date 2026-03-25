package o;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43351rne {
    ThreadPoolExecutor AEQbTJ();

    java.lang.String EZpvd();

    Dispatcher KWHzl();

    AbstractC58253yxm OLrzqt();

    /* JADX INFO: renamed from: o.rne$ActionBar */
    public static final class ActionBar {
        public static void EZpvd(@NotNull InterfaceC43351rne interfaceC43351rne, @NotNull ThreadPoolExecutor threadPoolExecutor) {
            Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
            pUU.KWHzl("NetworkThreadPoolManager", interfaceC43351rne.EZpvd() + " ThreadPool created: core=" + threadPoolExecutor.getCorePoolSize() + ", max=" + threadPoolExecutor.getMaximumPoolSize() + " allow core timeout " + threadPoolExecutor.allowsCoreThreadTimeOut());
        }
    }
}
