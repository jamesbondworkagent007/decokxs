package uniffi.buy_sell;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class ConvertBottomSheetAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertBottomSheetAction[] $VALUES;
    public static final ConvertBottomSheetAction DISMISS = new ConvertBottomSheetAction("DISMISS", 0);
    public static final ConvertBottomSheetAction REVIEW_DETAILS = new ConvertBottomSheetAction("REVIEW_DETAILS", 1);
    public static final ConvertBottomSheetAction DONE = new ConvertBottomSheetAction("DONE", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertBottomSheetAction[] $values() {
        return new ConvertBottomSheetAction[]{DISMISS, REVIEW_DETAILS, DONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertBottomSheetAction> getEntries() {
        return $ENTRIES;
    }

    private ConvertBottomSheetAction(String str, int i) {
    }

    static {
        ConvertBottomSheetAction[] convertBottomSheetActionArr$values = $values();
        $VALUES = convertBottomSheetActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertBottomSheetActionArr$values);
    }

    public static ConvertBottomSheetAction valueOf(String str) {
        return (ConvertBottomSheetAction) Enum.valueOf(ConvertBottomSheetAction.class, str);
    }

    public static ConvertBottomSheetAction[] values() {
        return (ConvertBottomSheetAction[]) $VALUES.clone();
    }
}
