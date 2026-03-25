package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.djW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC14334djW {
    void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov);

    void KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, int i, @NotNull Function0<Unit> function0);

    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov);

    /* JADX INFO: renamed from: o.djW$Application */
    public static final class Application {
        public static /* synthetic */ void judgeCloudServerStatus$default(InterfaceC14334djW interfaceC14334djW, AbstractActivityC33041mov abstractActivityC33041mov, int i, Function0 function0, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: judgeCloudServerStatus");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            interfaceC14334djW.KWHzl(abstractActivityC33041mov, i, function0);
        }
    }
}
