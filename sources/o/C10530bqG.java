package o;

import com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10530bqG implements java.util.Comparator<AddressAggregationData> {
    public static final C10530bqG EZpvd = new C10530bqG();

    private C10530bqG() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull AddressAggregationData addressAggregationData, @NotNull AddressAggregationData addressAggregationData2) {
        Intrinsics.checkNotNullParameter(addressAggregationData, "");
        Intrinsics.checkNotNullParameter(addressAggregationData2, "");
        if (addressAggregationData2.isSupported()) {
            if (addressAggregationData.isSupported()) {
                if (C33129mqd.OLrzqt(addressAggregationData.getCurrencyAmount(), addressAggregationData2.getCurrencyAmount())) {
                    if (C33129mqd.OLrzqt(addressAggregationData.getAmount(), addressAggregationData2.getAmount())) {
                        return addressAggregationData.getCoinMetaPosition() - addressAggregationData2.getCoinMetaPosition();
                    }
                    if (C33129mqd.AEQbTJ(addressAggregationData.getAmount(), addressAggregationData2.getAmount())) {
                    }
                } else if (C33129mqd.AEQbTJ(addressAggregationData.getCurrencyAmount(), addressAggregationData2.getCurrencyAmount())) {
                }
            }
            return 1;
        }
        return -1;
    }
}
