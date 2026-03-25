package o;

import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressChainUiData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18715fnd {
    public static /* synthetic */ AddressChainUiData toAddressChainUiData$default(C10854bwM c10854bwM, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(c10854bwM, z);
    }

    public static final AddressChainUiData OLrzqt(@NotNull C10854bwM c10854bwM, boolean z) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new AddressChainUiData(c10854bwM.djBIcL(), c10854bwM.AEQbTJ(), c10854bwM.copydefault(), c10854bwM.ejfBZ(), c10854bwM.fARcdN(), c10854bwM.fIwbmz(), c10854bwM.iRxXKY(), z);
    }
}
