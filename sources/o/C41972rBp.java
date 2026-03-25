package o;

import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41972rBp {
    public final InterfaceC41969rBm copydefault;

    public C41972rBp(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.copydefault = interfaceC41969rBm;
    }

    public java.lang.Object OLrzqt(java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objOLrzqt = this.copydefault.OLrzqt(map, (Continuation<? super AbstractC43728ruk<java.lang.String, ResponseFailedException>>) continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }
}
