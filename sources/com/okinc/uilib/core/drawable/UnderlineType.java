package com.okinc.uilib.core.drawable;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class UnderlineType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnderlineType[] $VALUES;
    public static final Application Companion;
    public static final UnderlineType DOTTED = new UnderlineType("DOTTED", 0, 0);
    public static final UnderlineType SOLID = new UnderlineType("SOLID", 1, 1);
    private final int id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnderlineType[] $values() {
        return new UnderlineType[]{DOTTED, SOLID};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnderlineType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    private UnderlineType(String str, int i, int i2) {
        this.id = i2;
    }

    static {
        UnderlineType[] underlineTypeArr$values = $values();
        $VALUES = underlineTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(underlineTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilib.core.drawable.UnderlineType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final UnderlineType EZpvd(int i) {
            UnderlineType underlineType;
            UnderlineType[] underlineTypeArrValues = UnderlineType.values();
            int length = underlineTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    underlineType = null;
                    break;
                }
                underlineType = underlineTypeArrValues[i2];
                if (underlineType.getId() == i) {
                    break;
                }
                i2++;
            }
            return underlineType == null ? UnderlineType.DOTTED : underlineType;
        }
    }

    public static UnderlineType valueOf(String str) {
        return (UnderlineType) Enum.valueOf(UnderlineType.class, str);
    }

    public static UnderlineType[] values() {
        return (UnderlineType[]) $VALUES.clone();
    }
}
