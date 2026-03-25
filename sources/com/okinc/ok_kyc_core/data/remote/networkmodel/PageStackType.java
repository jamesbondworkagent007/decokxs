package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PageStackType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PageStackType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final PageStackType FULLSCREEN = new PageStackType("FULLSCREEN", 0, "fullscreen");
    public static final PageStackType APP_RESIZING_BOTTOM_SHEET = new PageStackType("APP_RESIZING_BOTTOM_SHEET", 1, "appResizingBottomSheet");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PageStackType[] $values() {
        return new PageStackType[]{FULLSCREEN, APP_RESIZING_BOTTOM_SHEET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PageStackType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PageStackType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PageStackType[] pageStackTypeArr$values = $values();
        $VALUES = pageStackTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(pageStackTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageStackType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final PageStackType copydefault(String str) {
            PageStackType next;
            Iterator<PageStackType> it = PageStackType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            PageStackType pageStackType = next;
            return pageStackType == null ? PageStackType.FULLSCREEN : pageStackType;
        }
    }

    public static PageStackType valueOf(String str) {
        return (PageStackType) Enum.valueOf(PageStackType.class, str);
    }

    public static PageStackType[] values() {
        return (PageStackType[]) $VALUES.clone();
    }
}
