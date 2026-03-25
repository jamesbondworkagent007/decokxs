package o;

import com.okinc.business.defi.biz.rpc.RPCManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXE extends AbstractC43215rlA implements InterfaceC9846bdL {
    @Override // o.InterfaceC9846bdL
    public void copydefault(@NotNull java.lang.String str, Function1<? super java.lang.String, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        RPCManager.EZpvd.EZpvd(str, function1, function12);
    }

    @Override // o.InterfaceC9846bdL
    public void EZpvd(Function1<? super java.lang.String, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        RPCManager.EZpvd.copydefault(function1, function12);
    }
}
