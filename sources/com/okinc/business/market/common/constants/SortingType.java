package com.okinc.business.market.common.constants;

import androidx.annotation.StringRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerialName;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class SortingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortingType[] $VALUES;
    public static final Activity Companion;
    private final int titleResId;
    private final String value;

    @SerialName("1")
    public static final SortingType PnL = new SortingType("PnL", 0, "1", C23274hvD.Fragment.DuQ);

    @SerialName("2")
    public static final SortingType WinRate = new SortingType("WinRate", 1, "2", C23274hvD.Fragment.sSi);

    @SerialName("3")
    public static final SortingType Transaction = new SortingType("Transaction", 2, "3", C23274hvD.Fragment.ZGRCNj);

    @SerialName("4")
    public static final SortingType Volume = new SortingType("Volume", 3, "4", C23274hvD.Fragment.ZGRCNj);

    @SerialName("5")
    public static final SortingType ROI = new SortingType("ROI", 4, "5", C23274hvD.Fragment.ZGRCNj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortingType[] $values() {
        return new SortingType[]{PnL, WinRate, Transaction, Volume, ROI};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private SortingType(String str, @StringRes int i, String str2, int i2) {
        this.value = str2;
        this.titleResId = i2;
    }

    static {
        SortingType[] sortingTypeArr$values = $values();
        $VALUES = sortingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortingTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.SortingType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static SortingType valueOf(String str) {
        return (SortingType) Enum.valueOf(SortingType.class, str);
    }

    public static SortingType[] values() {
        return (SortingType[]) $VALUES.clone();
    }
}
