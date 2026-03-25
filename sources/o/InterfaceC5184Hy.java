package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5184Hy {
    public static final Activity copydefault = Activity.KWHzl;

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super byte[]> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation);

    java.lang.String KWHzl();

    /* JADX INFO: renamed from: o.Hy$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();

        private Activity() {
        }

        public static /* synthetic */ InterfaceC5184Hy fromMap$default(Activity activity, java.util.Map map, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "/";
            }
            return activity.AEQbTJ(map, str);
        }

        public final InterfaceC5184Hy AEQbTJ(@NotNull java.util.Map<java.lang.String, byte[]> map, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new HG(C56424yEw.isConnected(map), str);
        }
    }
}
