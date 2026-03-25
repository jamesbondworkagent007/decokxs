package com.okinc.business.market.features.meme.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalType[] $VALUES;
    public static final Application Companion;
    public static final SignalType UNKNOWN = new SignalType("UNKNOWN", 0);
    public static final SignalType SMART_MONEY = new SignalType("SMART_MONEY", 1);
    public static final SignalType KOL = new SignalType("KOL", 2);
    public static final SignalType FOLLOWING = new SignalType("FOLLOWING", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalType[] $values() {
        return new SignalType[]{UNKNOWN, SMART_MONEY, KOL, FOLLOWING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalType> getEntries() {
        return $ENTRIES;
    }

    private SignalType(String str, int i) {
    }

    static {
        SignalType[] signalTypeArr$values = $values();
        $VALUES = signalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.domain.model.SignalType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static SignalType valueOf(String str) {
        return (SignalType) Enum.valueOf(SignalType.class, str);
    }

    public static SignalType[] values() {
        return (SignalType[]) $VALUES.clone();
    }
}
