package uniffi.buy_sell;

import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class BscQuickConvertStateVariant {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BscQuickConvertStateVariant[] $VALUES;
    public static final BscQuickConvertStateVariant SUBMITTING = new BscQuickConvertStateVariant("SUBMITTING", 0);
    public static final BscQuickConvertStateVariant SUCCESS = new BscQuickConvertStateVariant("SUCCESS", 1);
    public static final BscQuickConvertStateVariant FAILED = new BscQuickConvertStateVariant(CardSyncResponse.FAILED, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BscQuickConvertStateVariant[] $values() {
        return new BscQuickConvertStateVariant[]{SUBMITTING, SUCCESS, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BscQuickConvertStateVariant> getEntries() {
        return $ENTRIES;
    }

    private BscQuickConvertStateVariant(String str, int i) {
    }

    static {
        BscQuickConvertStateVariant[] bscQuickConvertStateVariantArr$values = $values();
        $VALUES = bscQuickConvertStateVariantArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bscQuickConvertStateVariantArr$values);
    }

    public static BscQuickConvertStateVariant valueOf(String str) {
        return (BscQuickConvertStateVariant) Enum.valueOf(BscQuickConvertStateVariant.class, str);
    }

    public static BscQuickConvertStateVariant[] values() {
        return (BscQuickConvertStateVariant[]) $VALUES.clone();
    }
}
