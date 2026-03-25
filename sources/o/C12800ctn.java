package o;

import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12800ctn {
    public static final java.util.List<RSV> copydefault(@NotNull java.util.List<RSV> list, @NotNull java.util.List<UTXOTxIn> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((RSV) obj).setAddressType(list2.size() > i ? list2.get(i).getAddressType() : java.lang.Integer.valueOf(AddressType.Legacy.getValue()));
            i++;
        }
        return list;
    }
}
