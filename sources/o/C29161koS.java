package o;

import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.business.market.features.rwa.data.RwaStatusRepoImpl$getRwaStatuses$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29161koS implements InterfaceC29159koQ {
    public final InterfaceC27595jyE KWHzl;

    @yCM
    public C29161koS(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        this.KWHzl = interfaceC27595jyE;
    }

    @Override // o.InterfaceC29159koQ
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<TagMetaData>, OKServerException>> continuation) {
        return kAB.EZpvd(new RwaStatusRepoImpl$getRwaStatuses$2(this, str, null), continuation);
    }
}
