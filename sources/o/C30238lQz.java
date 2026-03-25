package o;

import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30238lQz {
    public final java.util.List<RecurringFrequencyOption> EZpvd;
    public final RecurringFrequencyOption copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lQz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C30238lQz copy$default(C30238lQz c30238lQz, RecurringFrequencyOption recurringFrequencyOption, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recurringFrequencyOption = c30238lQz.copydefault;
        }
        if ((i & 2) != 0) {
            list = c30238lQz.EZpvd;
        }
        return c30238lQz.EZpvd(recurringFrequencyOption, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringFrequencyOption EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30238lQz EZpvd(@NotNull RecurringFrequencyOption recurringFrequencyOption, @NotNull java.util.List<RecurringFrequencyOption> list) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C30238lQz(recurringFrequencyOption, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RecurringFrequencyOption> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30238lQz)) {
            return false;
        }
        C30238lQz c30238lQz = (C30238lQz) obj;
        return Intrinsics.EZpvd(this.copydefault, c30238lQz.copydefault) && Intrinsics.EZpvd(this.EZpvd, c30238lQz.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailFrequencyUiModel(selectedOption=" + this.copydefault + ", availableOptions=" + this.EZpvd + ")";
    }

    public C30238lQz(@NotNull RecurringFrequencyOption recurringFrequencyOption, @NotNull java.util.List<RecurringFrequencyOption> list) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = recurringFrequencyOption;
        this.EZpvd = list;
    }
}
