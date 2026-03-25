package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56897yWj {
    java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.yWj$Activity */
    public static final class Activity implements InterfaceC56897yWj {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
        }

        @Override // o.InterfaceC56897yWj
        public java.util.List<java.lang.String> copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return yDY.AhwBna();
        }
    }
}
