package o;

import o.InterfaceC8028auw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.auw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC8028auw<BigType extends InterfaceC8028auw<BigType>> {
    BigType AEQbTJ(@NotNull BigType bigtype);

    BigType EZpvd(@NotNull BigType bigtype);

    BigType KWHzl(@NotNull BigType bigtype);

    BigType OLrzqt(@NotNull BigType bigtype);

    BigType copydefault(@NotNull BigType bigtype);

    /* JADX INFO: renamed from: o.auw$Activity */
    public interface Activity<BigType> {
        BigType EZpvd(@NotNull java.lang.String str, int i);

        BigType KWHzl(float f, boolean z);

        BigType KWHzl(int i);

        BigType copydefault(double d, boolean z);

        /* JADX INFO: renamed from: o.auw$Activity$Application */
        public static final class Application {
            public static /* synthetic */ java.lang.Object parseString$default(Activity activity, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseString");
                }
                if ((i2 & 2) != 0) {
                    i = 10;
                }
                return activity.EZpvd(str, i);
            }

            public static /* synthetic */ java.lang.Object tryFromFloat$default(Activity activity, float f, boolean z, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromFloat");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                return activity.KWHzl(f, z);
            }

            public static /* synthetic */ java.lang.Object tryFromDouble$default(Activity activity, double d, boolean z, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryFromDouble");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                return activity.copydefault(d, z);
            }
        }
    }
}
