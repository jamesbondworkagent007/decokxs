package com.okinc.business.market.features.smart_money.signal.ui.model;

import androidx.annotation.StringRes;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class SignalGemsUiSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalGemsUiSortType[] $VALUES;
    public static final TaskDescription Companion;
    private final int bottomSheetKey;
    private final int displayKey;
    private final String eventTrackingKey;
    private final String value;
    public static final SignalGemsUiSortType MARKET_CAP_INCREASE = new SignalGemsUiSortType("MARKET_CAP_INCREASE", 0, "1", C23274hvD.Fragment.flVtFt, C23274hvD.Fragment.SePrCP, "max_increase_high_to_low");
    public static final SignalGemsUiSortType MARKET_CAP = new SignalGemsUiSortType("MARKET_CAP", 1, "2", C23274hvD.Fragment.giSNqX, C23274hvD.Fragment.sendBehavioSecData, "mcap_high_to_low");
    public static final SignalGemsUiSortType FIRST_SIGNAL_TIME = new SignalGemsUiSortType("FIRST_SIGNAL_TIME", 2, "3", C23274hvD.Fragment.fFgQHt, C23274hvD.Fragment.DtA, "first_signal_time_new_to_old");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalGemsUiSortType[] $values() {
        return new SignalGemsUiSortType[]{MARKET_CAP_INCREASE, MARKET_CAP, FIRST_SIGNAL_TIME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalGemsUiSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBottomSheetKey() {
        return this.bottomSheetKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayKey() {
        return this.displayKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventTrackingKey() {
        return this.eventTrackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SignalGemsUiSortType(String str, @StringRes int i, @StringRes String str2, int i2, int i3, String str3) {
        this.value = str2;
        this.bottomSheetKey = i2;
        this.displayKey = i3;
        this.eventTrackingKey = str3;
    }

    static {
        SignalGemsUiSortType[] signalGemsUiSortTypeArr$values = $values();
        $VALUES = signalGemsUiSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalGemsUiSortTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SignalGemsUiSortType KWHzl(@NotNull String str) {
            SignalGemsUiSortType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<SignalGemsUiSortType> it = SignalGemsUiSortType.getEntries().iterator();
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
            SignalGemsUiSortType signalGemsUiSortType = next;
            return signalGemsUiSortType == null ? SignalGemsUiSortType.FIRST_SIGNAL_TIME : signalGemsUiSortType;
        }
    }

    public static SignalGemsUiSortType valueOf(String str) {
        return (SignalGemsUiSortType) Enum.valueOf(SignalGemsUiSortType.class, str);
    }

    public static SignalGemsUiSortType[] values() {
        return (SignalGemsUiSortType[]) $VALUES.clone();
    }
}
