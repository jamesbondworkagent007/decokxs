package uniffi.growth;

import com.bytedance.applog.log.LogUtils;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class PopupNextAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PopupNextAction[] $VALUES;
    public static final PopupNextAction CONTINUE = new PopupNextAction("CONTINUE", 0);
    public static final PopupNextAction TERMINATE = new PopupNextAction(LogUtils.EVENT_TYPE_TERMINATE, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PopupNextAction[] $values() {
        return new PopupNextAction[]{CONTINUE, TERMINATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PopupNextAction> getEntries() {
        return $ENTRIES;
    }

    private PopupNextAction(String str, int i) {
    }

    static {
        PopupNextAction[] popupNextActionArr$values = $values();
        $VALUES = popupNextActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(popupNextActionArr$values);
    }

    public static PopupNextAction valueOf(String str) {
        return (PopupNextAction) Enum.valueOf(PopupNextAction.class, str);
    }

    public static PopupNextAction[] values() {
        return (PopupNextAction[]) $VALUES.clone();
    }
}
