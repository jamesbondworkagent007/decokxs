package o;

import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18056fbG {
    public final C13934dbu EZpvd;

    public C18056fbG(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MoreFunctionModuleInfo>, OKServerException>> continuation) {
        return this.EZpvd.fetchVPNInfo(continuation);
    }
}
