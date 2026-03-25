package uniffi.account;

import com.bytedance.applog.log.LogUtils;
import com.google.android.gms.stats.CodePackage;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes25.dex */
public final class Page {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Page[] $VALUES;
    public static final Page PROFILE = new Page(LogUtils.EVENT_TYPE_PROFILE, 0);
    public static final Page SECURITY = new Page(CodePackage.SECURITY, 1);
    public static final Page PREFERENCES = new Page("PREFERENCES", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Page[] $values() {
        return new Page[]{PROFILE, SECURITY, PREFERENCES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Page> getEntries() {
        return $ENTRIES;
    }

    private Page(String str, int i) {
    }

    static {
        Page[] pageArr$values = $values();
        $VALUES = pageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pageArr$values);
    }

    public static Page valueOf(String str) {
        return (Page) Enum.valueOf(Page.class, str);
    }

    public static Page[] values() {
        return (Page[]) $VALUES.clone();
    }
}
