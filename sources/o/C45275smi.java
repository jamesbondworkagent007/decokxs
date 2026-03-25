package o;

import com.okinc.okex.common.navigator.CommonServiceKey;
import com.okinc.okuser.data.User;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.smi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45275smi implements InterfaceC45302snI {
    public final C45300snG AEQbTJ;
    public final InterfaceC47278tmy EZpvd;

    @yCM
    public C45275smi(@NotNull C45300snG c45300snG, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AEQbTJ = c45300snG;
        this.EZpvd = interfaceC47278tmy;
    }

    @Override // o.InterfaceC45302snI
    public java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        com.okinc.okuser.data.UserInfo info;
        android.app.Activity activityKWHzl;
        C44760scx.log$default("CommonChangeEmailHandler: invoke", null, 2, null);
        if (this.EZpvd.values()) {
            User userOLrzqt = this.EZpvd.OLrzqt();
            if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null) {
                if (info.isVerifyEmail()) {
                    InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                    if (interfaceC8104awT == null) {
                        return Unit.INSTANCE;
                    }
                    interfaceC8104awT.AEQbTJ(context, "security/modifyEmail");
                } else {
                    InterfaceC8110awZ interfaceC8110awZ = (InterfaceC8110awZ) C43251rlk.OLrzqt(InterfaceC8110awZ.class);
                    if (interfaceC8110awZ != null && (activityKWHzl = C45357soK.KWHzl.KWHzl(context)) != null) {
                        interfaceC8110awZ.EZpvd(activityKWHzl, info.getEmail());
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        java.lang.Object objRunCommonService$OKSupport_support_impl$default = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.OpenLogin, context, null, continuation, 4, null);
        return objRunCommonService$OKSupport_support_impl$default == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default : Unit.INSTANCE;
    }
}
