package com.okinc.business.dexlogic.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.reown.android.pulse.model.EventType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class MevUnstableShowLevelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MevUnstableShowLevelType[] $VALUES;
    public static final Activity Companion;
    private final String type;
    public static final MevUnstableShowLevelType NORMAL = new MevUnstableShowLevelType("NORMAL", 0, MultiTransferSignData.DEFAULT_INTERVAL);
    public static final MevUnstableShowLevelType WARNING = new MevUnstableShowLevelType("WARNING", 1, "0");
    public static final MevUnstableShowLevelType ERROR = new MevUnstableShowLevelType(EventType.ERROR, 2, "1");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MevUnstableShowLevelType[] $values() {
        return new MevUnstableShowLevelType[]{NORMAL, WARNING, ERROR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MevUnstableShowLevelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private MevUnstableShowLevelType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        MevUnstableShowLevelType[] mevUnstableShowLevelTypeArr$values = $values();
        $VALUES = mevUnstableShowLevelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mevUnstableShowLevelTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MevUnstableShowLevelType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MevUnstableShowLevelType copydefault(String str) {
            MevUnstableShowLevelType next;
            Iterator<MevUnstableShowLevelType> it = MevUnstableShowLevelType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getType(), (Object) str)) {
                    break;
                }
            }
            MevUnstableShowLevelType mevUnstableShowLevelType = next;
            return mevUnstableShowLevelType == null ? MevUnstableShowLevelType.NORMAL : mevUnstableShowLevelType;
        }
    }

    public static MevUnstableShowLevelType valueOf(String str) {
        return (MevUnstableShowLevelType) Enum.valueOf(MevUnstableShowLevelType.class, str);
    }

    public static MevUnstableShowLevelType[] values() {
        return (MevUnstableShowLevelType[]) $VALUES.clone();
    }
}
