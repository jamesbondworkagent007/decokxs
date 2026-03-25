package com.okinc.planet.biz_content.publisher;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ToolFragmentType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ToolFragmentType[] $VALUES;
    public static final ToolFragmentType NONE = new ToolFragmentType("NONE", 0);
    public static final ToolFragmentType IMAGE_SELECT = new ToolFragmentType("IMAGE_SELECT", 1);
    public static final ToolFragmentType TOPIC_LIST = new ToolFragmentType("TOPIC_LIST", 2);
    public static final ToolFragmentType TOKEN_LIST = new ToolFragmentType("TOKEN_LIST", 3);
    public static final ToolFragmentType PLUGIN_LIST = new ToolFragmentType("PLUGIN_LIST", 4);
    public static final ToolFragmentType REPLY_TEST = new ToolFragmentType("REPLY_TEST", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ToolFragmentType[] $values() {
        return new ToolFragmentType[]{NONE, IMAGE_SELECT, TOPIC_LIST, TOKEN_LIST, PLUGIN_LIST, REPLY_TEST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ToolFragmentType> getEntries() {
        return $ENTRIES;
    }

    private ToolFragmentType(String str, int i) {
    }

    static {
        ToolFragmentType[] toolFragmentTypeArr$values = $values();
        $VALUES = toolFragmentTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(toolFragmentTypeArr$values);
    }

    public static ToolFragmentType valueOf(String str) {
        return (ToolFragmentType) Enum.valueOf(ToolFragmentType.class, str);
    }

    public static ToolFragmentType[] values() {
        return (ToolFragmentType[]) $VALUES.clone();
    }
}
