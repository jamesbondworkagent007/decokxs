package com.okinc.tradingbot.impl.order.strategy.recurring.view.data;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class FirstTimeBuyOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FirstTimeBuyOption[] $VALUES;
    public static final Application Companion;
    private final Integer descriptionStringRes;
    private final int orderParamCode;
    private final int titleStringRes;
    public static final FirstTimeBuyOption BUY_NOW = new FirstTimeBuyOption("BUY_NOW", 0, C48033uCm.Fragment.profile, Integer.valueOf(C48033uCm.Fragment.RuDPQV), 2);
    public static final FirstTimeBuyOption BUY_CUSTOM = new FirstTimeBuyOption("BUY_CUSTOM", 1, C48033uCm.Fragment.zpGcln, null, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FirstTimeBuyOption[] $values() {
        return new FirstTimeBuyOption[]{BUY_NOW, BUY_CUSTOM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FirstTimeBuyOption> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDescriptionStringRes() {
        return this.descriptionStringRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderParamCode() {
        return this.orderParamCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleStringRes() {
        return this.titleStringRes;
    }

    private FirstTimeBuyOption(String str, int i, int i2, Integer num, int i3) {
        this.titleStringRes = i2;
        this.descriptionStringRes = num;
        this.orderParamCode = i3;
    }

    static {
        FirstTimeBuyOption[] firstTimeBuyOptionArr$values = $values();
        $VALUES = firstTimeBuyOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(firstTimeBuyOptionArr$values);
        Companion = new Application(null);
    }

    public final String getTitleString() {
        return C33070mpX.AYXKKw(this.titleStringRes);
    }

    public final String getDescriptionString() {
        Integer num = this.descriptionStringRes;
        String strAYXKKw = num != null ? C33070mpX.AYXKKw(num.intValue()) : null;
        return strAYXKKw == null ? "" : strAYXKKw;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final FirstTimeBuyOption EZpvd() {
            return FirstTimeBuyOption.BUY_NOW;
        }

        public final FirstTimeBuyOption AEQbTJ(@NotNull String str) {
            FirstTimeBuyOption next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<FirstTimeBuyOption> it = FirstTimeBuyOption.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getOrderParamCode() == C33129mqd.AhwBna(str)) {
                    break;
                }
            }
            FirstTimeBuyOption firstTimeBuyOption = next;
            return firstTimeBuyOption == null ? EZpvd() : firstTimeBuyOption;
        }
    }

    public static FirstTimeBuyOption valueOf(String str) {
        return (FirstTimeBuyOption) Enum.valueOf(FirstTimeBuyOption.class, str);
    }

    public static FirstTimeBuyOption[] values() {
        return (FirstTimeBuyOption[]) $VALUES.clone();
    }
}
