package o;

import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10536bqM implements java.util.Comparator<AddressChildBean> {
    public static final C10536bqM AEQbTJ = new C10536bqM();

    private C10536bqM() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull AddressChildBean addressChildBean, @NotNull AddressChildBean addressChildBean2) {
        Intrinsics.checkNotNullParameter(addressChildBean, "");
        Intrinsics.checkNotNullParameter(addressChildBean2, "");
        return AEQbTJ(addressChildBean.getAddressType()) < AEQbTJ(addressChildBean2.getAddressType()) ? -1 : 1;
    }

    public final int AEQbTJ(int i) {
        if (i == AddressType.P2TRType.getValue()) {
            return 1;
        }
        if (i == AddressType.Legacy.getValue()) {
            return 2;
        }
        if (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) {
            return 3;
        }
        return (i == AddressType.BCHPubKeyAddr.getValue() || i == AddressType.Bech32Type.getValue()) ? 4 : -1;
    }
}
