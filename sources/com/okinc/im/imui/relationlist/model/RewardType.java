package com.okinc.im.imui.relationlist.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class RewardType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RewardType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final RewardType FIXED = new RewardType("FIXED", 0, "FIXED_REWARD");
    public static final RewardType RANDOM = new RewardType("RANDOM", 1, "RANDOM_REWARD");
    public static final RewardType NO_REWARD = new RewardType("NO_REWARD", 2, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RewardType[] $values() {
        return new RewardType[]{FIXED, RANDOM, NO_REWARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RewardType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RewardType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RewardType[] rewardTypeArr$values = $values();
        $VALUES = rewardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rewardTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.relationlist.model.RewardType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final RewardType OLrzqt(String str) {
            RewardType rewardType;
            RewardType[] rewardTypeArrValues = RewardType.values();
            int length = rewardTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    rewardType = null;
                    break;
                }
                rewardType = rewardTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) rewardType.getValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return rewardType == null ? RewardType.NO_REWARD : rewardType;
        }
    }

    public static RewardType valueOf(String str) {
        return (RewardType) Enum.valueOf(RewardType.class, str);
    }

    public static RewardType[] values() {
        return (RewardType[]) $VALUES.clone();
    }
}
