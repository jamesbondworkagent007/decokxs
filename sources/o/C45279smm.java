package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45279smm implements InterfaceC45302snI {
    public final InterfaceC47278tmy AEQbTJ;
    public final C45300snG copydefault;

    @yCM
    public C45279smm(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.copydefault = c45300snG;
        this.AEQbTJ = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("CommonChangeLoginPasswordHandler: invoke", null, 2, null);
        if (this.AEQbTJ.values()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT == null) {
                return Unit.INSTANCE;
            }
            interfaceC8104awT.AEQbTJ(context, "security/modifyLoginPassword");
            return Unit.INSTANCE;
        }
        java.lang.Object objRunCommonService$OKSupport_support_impl$default = C45300snG.runCommonService$OKSupport_support_impl$default(this.copydefault, CommonServiceKey.OpenLogin, context, null, continuation, 4, null);
        return objRunCommonService$OKSupport_support_impl$default == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default : Unit.INSTANCE;
    }
}
