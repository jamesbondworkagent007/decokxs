package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC29291kqq {
    void AEQbTJ(int i);

    void AEQbTJ(int i, @NotNull java.util.List<java.lang.Integer> list);

    /* JADX INFO: renamed from: o.kqq$Activity */
    public static final class Activity {
        public static void EZpvd(@NotNull InterfaceC29291kqq interfaceC29291kqq, int i, @NotNull java.util.List<java.lang.Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (list.contains(java.lang.Integer.valueOf(i))) {
                return;
            }
            list.add(java.lang.Integer.valueOf(i));
            interfaceC29291kqq.AEQbTJ(i);
        }
    }
}
