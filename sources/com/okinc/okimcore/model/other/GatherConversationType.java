package com.okinc.okimcore.model.other;

import com.immomo.mls.fun.lt.SISystem;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class GatherConversationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GatherConversationType[] $VALUES;
    private final String targetId;
    public static final GatherConversationType System = new GatherConversationType(SISystem.KEY, 0, "-1000");
    public static final GatherConversationType SystemDailyDynamics = new GatherConversationType("SystemDailyDynamics", 1, "-1001");
    public static final GatherConversationType SystemPriceReminder = new GatherConversationType("SystemPriceReminder", 2, "-1002");
    public static final GatherConversationType SystemNotice = new GatherConversationType("SystemNotice", 3, "-1003");
    public static final GatherConversationType SystemTradeNotice = new GatherConversationType("SystemTradeNotice", 4, "-1004");
    public static final GatherConversationType SocialTradeNews = new GatherConversationType("SocialTradeNews", 5, "-1005");
    public static final GatherConversationType Web3Push = new GatherConversationType("Web3Push", 6, "-1007");
    public static final GatherConversationType Strange = new GatherConversationType("Strange", 7, "-2000");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GatherConversationType[] $values() {
        return new GatherConversationType[]{System, SystemDailyDynamics, SystemPriceReminder, SystemNotice, SystemTradeNotice, SocialTradeNews, Web3Push, Strange};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GatherConversationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    private GatherConversationType(String str, int i, String str2) {
        this.targetId = str2;
    }

    static {
        GatherConversationType[] gatherConversationTypeArr$values = $values();
        $VALUES = gatherConversationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(gatherConversationTypeArr$values);
    }

    public static GatherConversationType valueOf(String str) {
        return (GatherConversationType) Enum.valueOf(GatherConversationType.class, str);
    }

    public static GatherConversationType[] values() {
        return (GatherConversationType[]) $VALUES.clone();
    }
}
