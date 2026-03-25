package o;

import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28727kgI {
    public final InterfaceC28726kgH copydefault;

    @yCM
    public C28727kgI(@NotNull InterfaceC28726kgH interfaceC28726kgH) {
        Intrinsics.checkNotNullParameter(interfaceC28726kgH, "");
        this.copydefault = interfaceC28726kgH;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<HolderInfoData, OKServerException>> continuation) {
        return this.copydefault.KWHzl(str, str2, str3, continuation);
    }
}
