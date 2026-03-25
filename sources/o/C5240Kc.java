package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5240Kc {
    public static final C5240Kc EZpvd = new C5240Kc();

    private C5240Kc() {
    }

    public final java.lang.Class<?> AEQbTJ(java.lang.String str, Logger logger) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            if (logger == null) {
                return null;
            }
            logger.OLrzqt("Class not available:" + str + ": " + e);
            return null;
        } catch (java.lang.UnsatisfiedLinkError e2) {
            if (logger == null) {
                return null;
            }
            logger.EZpvd("Failed to load (UnsatisfiedLinkError) " + str + ": " + e2);
            return null;
        } catch (java.lang.Throwable th) {
            if (logger == null) {
                return null;
            }
            logger.EZpvd("Failed to initialize " + str + ": " + th);
            return null;
        }
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, Logger logger) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(str, logger) != null;
    }
}
