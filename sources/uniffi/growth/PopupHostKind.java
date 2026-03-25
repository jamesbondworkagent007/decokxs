package uniffi.growth;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class PopupHostKind {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PopupHostKind[] $VALUES;
    public static final PopupHostKind ANDROID_ACTIVITY = new PopupHostKind("ANDROID_ACTIVITY", 0);
    public static final PopupHostKind ANDROID_FRAGMENT = new PopupHostKind("ANDROID_FRAGMENT", 1);
    public static final PopupHostKind IOS_VIEW_CONTROLLER = new PopupHostKind("IOS_VIEW_CONTROLLER", 2);
    public static final PopupHostKind OTHER = new PopupHostKind("OTHER", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PopupHostKind[] $values() {
        return new PopupHostKind[]{ANDROID_ACTIVITY, ANDROID_FRAGMENT, IOS_VIEW_CONTROLLER, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PopupHostKind> getEntries() {
        return $ENTRIES;
    }

    private PopupHostKind(String str, int i) {
    }

    static {
        PopupHostKind[] popupHostKindArr$values = $values();
        $VALUES = popupHostKindArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(popupHostKindArr$values);
    }

    public static PopupHostKind valueOf(String str) {
        return (PopupHostKind) Enum.valueOf(PopupHostKind.class, str);
    }

    public static PopupHostKind[] values() {
        return (PopupHostKind[]) $VALUES.clone();
    }
}
