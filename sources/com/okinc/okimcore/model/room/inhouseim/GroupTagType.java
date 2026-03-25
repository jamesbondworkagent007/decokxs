package com.okinc.okimcore.model.room.inhouseim;

import com.google.android.gms.stats.CodePackage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class GroupTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupTagType[] $VALUES;
    public static final Application Companion;
    private final int value;
    public static final GroupTagType DEFAULT = new GroupTagType("DEFAULT", 0, 100);
    public static final GroupTagType NOVICE_GROUP = new GroupTagType("NOVICE_GROUP", 1, 0);
    public static final GroupTagType CURRENCY_GROUP = new GroupTagType("CURRENCY_GROUP", 2, 1);
    public static final GroupTagType CUSTOMER_GROUP = new GroupTagType("CUSTOMER_GROUP", 3, 2);
    public static final GroupTagType COMMUNITY_GROUP = new GroupTagType("COMMUNITY_GROUP", 4, 3);
    public static final GroupTagType COMMON = new GroupTagType(CodePackage.COMMON, 5, 4);
    public static final GroupTagType MERCHANT = new GroupTagType("MERCHANT", 6, 5);
    public static final GroupTagType AFFILIATE = new GroupTagType("AFFILIATE", 7, 6);
    public static final GroupTagType SOCIAL_TRADING = new GroupTagType("SOCIAL_TRADING", 8, 7);
    public static final GroupTagType OK_ASSISTANT = new GroupTagType("OK_ASSISTANT", 9, 8);
    public static final GroupTagType VIDEO_CALL_CHAT_GROUP = new GroupTagType("VIDEO_CALL_CHAT_GROUP", 10, 9);
    public static final GroupTagType GBSC_OUTBOUND_CALL_GROUP = new GroupTagType("GBSC_OUTBOUND_CALL_GROUP", 11, 10);
    public static final GroupTagType VIP_CHAT_GROUP = new GroupTagType("VIP_CHAT_GROUP", 12, 11);
    public static final GroupTagType PAID_GROUP = new GroupTagType("PAID_GROUP", 13, 12);
    public static final GroupTagType OTC_AGENT = new GroupTagType("OTC_AGENT", 14, 13);
    public static final GroupTagType RM_VIP_GROUP = new GroupTagType("RM_VIP_GROUP", 15, 14);
    public static final GroupTagType BETA = new GroupTagType("BETA", 16, 200);
    public static final GroupTagType UNKNOWN = new GroupTagType("UNKNOWN", 17, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupTagType[] $values() {
        return new GroupTagType[]{DEFAULT, NOVICE_GROUP, CURRENCY_GROUP, CUSTOMER_GROUP, COMMUNITY_GROUP, COMMON, MERCHANT, AFFILIATE, SOCIAL_TRADING, OK_ASSISTANT, VIDEO_CALL_CHAT_GROUP, GBSC_OUTBOUND_CALL_GROUP, VIP_CHAT_GROUP, PAID_GROUP, OTC_AGENT, RM_VIP_GROUP, BETA, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupTagType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private GroupTagType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        GroupTagType[] groupTagTypeArr$values = $values();
        $VALUES = groupTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupTagTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.room.inhouseim.GroupTagType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final GroupTagType copydefault(Integer num) {
            GroupTagType groupTagType;
            GroupTagType[] groupTagTypeArrValues = GroupTagType.values();
            int length = groupTagTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    groupTagType = null;
                    break;
                }
                groupTagType = groupTagTypeArrValues[i];
                int value = groupTagType.getValue();
                if (num != null && value == num.intValue()) {
                    break;
                }
                i++;
            }
            return groupTagType == null ? GroupTagType.UNKNOWN : groupTagType;
        }
    }

    public static GroupTagType valueOf(String str) {
        return (GroupTagType) Enum.valueOf(GroupTagType.class, str);
    }

    public static GroupTagType[] values() {
        return (GroupTagType[]) $VALUES.clone();
    }
}
