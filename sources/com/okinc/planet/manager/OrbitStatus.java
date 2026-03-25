package com.okinc.planet.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OrbitStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrbitStatus[] $VALUES;
    public static final ActionBar Companion;
    public static final OrbitStatus NORMAL = new OrbitStatus("NORMAL", 0);
    public static final OrbitStatus ORBIT = new OrbitStatus("ORBIT", 1);
    public static final OrbitStatus ORBIT_PLUS = new OrbitStatus("ORBIT_PLUS", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrbitStatus[] $values() {
        return new OrbitStatus[]{NORMAL, ORBIT, ORBIT_PLUS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrbitStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBasicOrbiter() {
        return this == ORBIT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOrbitPlus() {
        return this == ORBIT_PLUS;
    }

    private OrbitStatus(String str, int i) {
    }

    static {
        OrbitStatus[] orbitStatusArr$values = $values();
        $VALUES = orbitStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orbitStatusArr$values);
        Companion = new ActionBar(null);
    }

    public final boolean isOrbiter() {
        return ordinal() > 0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.manager.OrbitStatus.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final OrbitStatus AEQbTJ(Integer num) {
            if (num == null || num.intValue() == 0) {
                return OrbitStatus.NORMAL;
            }
            return num.intValue() == 1 ? OrbitStatus.ORBIT : OrbitStatus.ORBIT_PLUS;
        }
    }

    public static OrbitStatus valueOf(String str) {
        return (OrbitStatus) Enum.valueOf(OrbitStatus.class, str);
    }

    public static OrbitStatus[] values() {
        return (OrbitStatus[]) $VALUES.clone();
    }
}
