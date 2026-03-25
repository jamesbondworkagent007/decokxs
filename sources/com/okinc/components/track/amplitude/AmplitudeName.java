package com.okinc.components.track.amplitude;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AmplitudeName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AmplitudeName[] $VALUES;
    public static final TaskDescription Companion;
    private final String amplitude;
    private final String displayName;
    private final String skylab;
    public static final AmplitudeName CEFI = new AmplitudeName("CEFI", 0, "cefi", "cefi", "cefi");
    public static final AmplitudeName WEB3 = new AmplitudeName("WEB3", 1, "web3", "web3", "web3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AmplitudeName[] $values() {
        return new AmplitudeName[]{CEFI, WEB3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AmplitudeName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmplitude() {
        return this.amplitude;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSkylab() {
        return this.skylab;
    }

    private AmplitudeName(String str, int i, String str2, String str3, String str4) {
        this.amplitude = str2;
        this.skylab = str3;
        this.displayName = str4;
    }

    static {
        AmplitudeName[] amplitudeNameArr$values = $values();
        $VALUES = amplitudeNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(amplitudeNameArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.amplitude.AmplitudeName.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AmplitudeName AEQbTJ(String str) {
            for (AmplitudeName amplitudeName : AmplitudeName.values()) {
                if (Intrinsics.EZpvd((Object) amplitudeName.getAmplitude(), (Object) str)) {
                    return amplitudeName;
                }
            }
            return null;
        }
    }

    public static AmplitudeName valueOf(String str) {
        return (AmplitudeName) Enum.valueOf(AmplitudeName.class, str);
    }

    public static AmplitudeName[] values() {
        return (AmplitudeName[]) $VALUES.clone();
    }
}
