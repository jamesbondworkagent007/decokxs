package com.okinc.business.market.features.smart_money.signal.ui.widget;

import com.okinc.business.market.data.model.smart_money.SignalGemType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalMultiplierTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalMultiplierTagType[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final SignalMultiplierTagType GOLD = new SignalMultiplierTagType("GOLD", 0, "1");
    public static final SignalMultiplierTagType SILVER = new SignalMultiplierTagType("SILVER", 1, "2");
    public static final SignalMultiplierTagType BRONZE = new SignalMultiplierTagType("BRONZE", 2, "3");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalMultiplierTagType[] $values() {
        return new SignalMultiplierTagType[]{GOLD, SILVER, BRONZE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalMultiplierTagType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SignalMultiplierTagType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SignalMultiplierTagType[] signalMultiplierTagTypeArr$values = $values();
        $VALUES = signalMultiplierTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalMultiplierTagTypeArr$values);
        Companion = new Application(null);
    }

    public static final class Application {

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[SignalGemType.values().length];
                try {
                    iArr[SignalGemType.GOLD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SignalGemType.SILVER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final SignalMultiplierTagType EZpvd(@NotNull SignalGemType signalGemType) {
            Intrinsics.checkNotNullParameter(signalGemType, "");
            int i = Activity.AEQbTJ[signalGemType.ordinal()];
            if (i == 1) {
                return SignalMultiplierTagType.GOLD;
            }
            if (i == 2) {
                return SignalMultiplierTagType.SILVER;
            }
            return SignalMultiplierTagType.BRONZE;
        }

        public final SignalMultiplierTagType KWHzl(@NotNull String str) {
            SignalMultiplierTagType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<SignalMultiplierTagType> it = SignalMultiplierTagType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static SignalMultiplierTagType valueOf(String str) {
        return (SignalMultiplierTagType) Enum.valueOf(SignalMultiplierTagType.class, str);
    }

    public static SignalMultiplierTagType[] values() {
        return (SignalMultiplierTagType[]) $VALUES.clone();
    }
}
