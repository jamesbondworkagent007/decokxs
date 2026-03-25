package com.okinc.buysell.ui.recurring.edit.model;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33069mpW;
import o.C56390yDp;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class RecurringFrequencyOption extends OKCRListItem {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    private final String desc;
    private final String frequency;
    private final String id;
    private final boolean isSelected;
    private final String label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringFrequencyOption copy$default(RecurringFrequencyOption recurringFrequencyOption, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringFrequencyOption.id;
        }
        if ((i & 2) != 0) {
            str2 = recurringFrequencyOption.label;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = recurringFrequencyOption.desc;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = recurringFrequencyOption.frequency;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = recurringFrequencyOption.isSelected;
        }
        return recurringFrequencyOption.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringFrequencyOption copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecurringFrequencyOption(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecurringFrequencyOption)) {
            return false;
        }
        RecurringFrequencyOption recurringFrequencyOption = (RecurringFrequencyOption) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) recurringFrequencyOption.id) && Intrinsics.EZpvd((Object) this.label, (Object) recurringFrequencyOption.label) && Intrinsics.EZpvd((Object) this.desc, (Object) recurringFrequencyOption.desc) && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringFrequencyOption.frequency) && this.isSelected == recurringFrequencyOption.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.frequency.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringFrequencyOption(id=" + this.id + ", label=" + this.label + ", desc=" + this.desc + ", frequency=" + this.frequency + ", isSelected=" + this.isSelected + ")";
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecurringFrequencyOption AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            RecurringFrequencyType recurringFrequencyTypeKWHzl = RecurringFrequencyType.Companion.KWHzl(str2);
            return new RecurringFrequencyOption(str, recurringFrequencyTypeKWHzl.getLabel(), C33069mpW.OLrzqt(recurringFrequencyTypeKWHzl.getDesc(), C56423yEv.EZpvd(C56390yDp.OLrzqt("nextPurchaseTime", str3))), recurringFrequencyTypeKWHzl.getValue(), z);
        }
    }

    public RecurringFrequencyOption(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.label = str2;
        this.desc = str3;
        this.frequency = str4;
        this.isSelected = z;
    }
}
