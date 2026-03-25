package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kMW<T> {
    java.util.List<T> AEQbTJ();

    public static final class TaskDescription {
        public static <T> void KWHzl(@NotNull kMW<T> kmw, int i, int i2) {
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    kMV.KWHzl(kmw.AEQbTJ(), i, i3);
                    i = i3;
                }
                return;
            }
            int i4 = i2 + 1;
            if (i4 > i) {
                return;
            }
            while (true) {
                kMV.KWHzl(kmw.AEQbTJ(), i, i - 1);
                if (i == i4) {
                    return;
                } else {
                    i--;
                }
            }
        }

        public static <T> java.util.List<T> copydefault(@NotNull kMW<T> kmw) {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(kmw.AEQbTJ());
        }
    }
}
