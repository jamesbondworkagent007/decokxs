package uniffi.account;

import com.google.api.client.googleapis.notifications.ResourceStates;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class PromotionButtonName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PromotionButtonName[] $VALUES;
    public static final PromotionButtonName SYNC = new PromotionButtonName(ResourceStates.SYNC, 0);
    public static final PromotionButtonName LATER = new PromotionButtonName("LATER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PromotionButtonName[] $values() {
        return new PromotionButtonName[]{SYNC, LATER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PromotionButtonName> getEntries() {
        return $ENTRIES;
    }

    private PromotionButtonName(String str, int i) {
    }

    static {
        PromotionButtonName[] promotionButtonNameArr$values = $values();
        $VALUES = promotionButtonNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(promotionButtonNameArr$values);
    }

    public static PromotionButtonName valueOf(String str) {
        return (PromotionButtonName) Enum.valueOf(PromotionButtonName.class, str);
    }

    public static PromotionButtonName[] values() {
        return (PromotionButtonName[]) $VALUES.clone();
    }
}
