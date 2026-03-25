package com.okinc.business.dexlogic.track.enums;

import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class BusinessType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessType[] $VALUES;
    public static final TaskDescription Companion;
    private final String value;
    public static final BusinessType SIMPLE = new BusinessType("SIMPLE", 0, "simple");
    public static final BusinessType MEME = new BusinessType("MEME", 1, TabTitleInfo.KEY_MEME);
    public static final BusinessType QUICK = new BusinessType("QUICK", 2, "quick");
    public static final BusinessType SWAP = new BusinessType("SWAP", 3, "swap");
    public static final BusinessType BRIDGE = new BusinessType("BRIDGE", 4, TabTitleInfo.KEY_BRIDGE);
    public static final BusinessType LIMIT = new BusinessType("LIMIT", 5, "limit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{SIMPLE, MEME, QUICK, SWAP, BRIDGE, LIMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private BusinessType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        BusinessType[] businessTypeArr$values = $values();
        $VALUES = businessTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.track.enums.BusinessType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String KWHzl(boolean z) {
            return (z ? BusinessType.SWAP : BusinessType.BRIDGE).getValue();
        }
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
