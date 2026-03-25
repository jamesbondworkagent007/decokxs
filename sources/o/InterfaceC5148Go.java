package o;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5148Go {
    public static final Activity EZpvd = Activity.KWHzl;

    void AEQbTJ(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0);

    void EZpvd(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0);

    InterfaceC5147Gn KWHzl(@NotNull LogLevel logLevel);

    void KWHzl(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0);

    void OLrzqt(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0);

    boolean OLrzqt(@NotNull LogLevel logLevel);

    void copydefault(java.lang.Throwable th, @NotNull Function0<java.lang.String> function0);

    /* JADX INFO: renamed from: o.Go$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();
        public static final InterfaceC5148Go copydefault = C5154Gu.copydefault;

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.Go$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void trace$default(InterfaceC5148Go interfaceC5148Go, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trace");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            interfaceC5148Go.AEQbTJ(th, function0);
        }

        public static /* synthetic */ void debug$default(InterfaceC5148Go interfaceC5148Go, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            interfaceC5148Go.KWHzl(th, function0);
        }

        public static /* synthetic */ void info$default(InterfaceC5148Go interfaceC5148Go, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            interfaceC5148Go.copydefault(th, function0);
        }

        public static /* synthetic */ void warn$default(InterfaceC5148Go interfaceC5148Go, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            interfaceC5148Go.OLrzqt(th, function0);
        }

        public static /* synthetic */ void error$default(InterfaceC5148Go interfaceC5148Go, java.lang.Throwable th, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            interfaceC5148Go.EZpvd(th, function0);
        }
    }
}
