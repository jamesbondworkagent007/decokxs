package o;

import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gFD extends AbstractC33073mpa {
    public final C13934dbu AEQbTJ;
    public RegisterStatusResp KWHzl;

    public gFD(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.AEQbTJ = c13934dbu;
    }

    public final void copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull final Function1<? super RegisterStatusResp, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        RegisterStatusResp registerStatusResp = this.KWHzl;
        if (registerStatusResp != null) {
            Intrinsics.copydefault(registerStatusResp);
            function1.invoke(registerStatusResp);
        } else {
            call().AEQbTJ(yBI.subscribeBy$default(C32962mnV.unwrapResponseData$default(C13934dbu.queryAddressRegisterStatus$default(this.AEQbTJ, j, str, str2, null, 8, null), (Function1) null, 1, (java.lang.Object) null), (Function1) null, (Function0) null, new Function1() { // from class: o.gFF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gFD.AEQbTJ(this.KWHzl, function1, (RegisterStatusResp) obj);
                }
            }, 3, (java.lang.Object) null));
        }
    }

    public static final Unit AEQbTJ(gFD gfd, Function1 function1, RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        gfd.KWHzl = registerStatusResp;
        function1.invoke(registerStatusResp);
        return Unit.INSTANCE;
    }
}
