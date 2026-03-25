package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45281smo implements InterfaceC45302snI {
    public final InterfaceC47278tmy KWHzl;
    public final C45300snG OLrzqt;

    @yCM
    public C45281smo(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.OLrzqt = c45300snG;
        this.KWHzl = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonChangeGoogleAuthHandler: invoke", null, 2, null);
        if (this.KWHzl.values()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                interfaceC8104awT.AEQbTJ(context, "security/bindGoogle");
            }
            return Unit.INSTANCE;
        }
        java.lang.Object objRunCommonService$OKSupport_support_impl$default = C45300snG.runCommonService$OKSupport_support_impl$default(this.OLrzqt, CommonServiceKey.OpenLogin, context, null, continuation, 4, null);
        return objRunCommonService$OKSupport_support_impl$default == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default : Unit.INSTANCE;
    }
}
