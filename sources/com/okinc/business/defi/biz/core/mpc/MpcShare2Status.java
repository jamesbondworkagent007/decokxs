package com.okinc.business.defi.biz.core.mpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MpcShare2Status {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MpcShare2Status[] $VALUES;
    public static final Application Companion;
    public static final MpcShare2Status SHARE2_INVALID = new MpcShare2Status("SHARE2_INVALID", 0, 0);
    public static final MpcShare2Status SHARE2_VALID = new MpcShare2Status("SHARE2_VALID", 1, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MpcShare2Status[] $values() {
        return new MpcShare2Status[]{SHARE2_INVALID, SHARE2_VALID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MpcShare2Status> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MpcShare2Status(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MpcShare2Status[] mpcShare2StatusArr$values = $values();
        $VALUES = mpcShare2StatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(mpcShare2StatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.mpc.MpcShare2Status.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static MpcShare2Status valueOf(String str) {
        return (MpcShare2Status) Enum.valueOf(MpcShare2Status.class, str);
    }

    public static MpcShare2Status[] values() {
        return (MpcShare2Status[]) $VALUES.clone();
    }
}
