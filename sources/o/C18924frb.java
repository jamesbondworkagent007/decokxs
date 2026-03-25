package o;

import com.okinc.business.defi.wallet.mine.search.banner.data.model.WalletBannerEventData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18924frb implements InterfaceC18926frd {
    public final C13934dbu copydefault;

    @yCM
    public C18924frb(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.copydefault = c13934dbu;
    }

    @Override // o.InterfaceC18926frd
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletBannerEventData>, OKServerException>> continuation) {
        return this.copydefault.ejfBZ(continuation);
    }
}
