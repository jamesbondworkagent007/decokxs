package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.account.PasskeyReminderType;

/* JADX INFO: renamed from: o.zWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58981zWr {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean EZpvd;
    public PasskeyReminderType KWHzl;
    public java.util.List<C58983zWt> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.zWr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58981zWr copy$default(C58981zWr c58981zWr, java.util.List list, boolean z, PasskeyReminderType passkeyReminderType, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c58981zWr.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c58981zWr.AEQbTJ;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            passkeyReminderType = c58981zWr.KWHzl;
        }
        PasskeyReminderType passkeyReminderType2 = passkeyReminderType;
        if ((i & 8) != 0) {
            z2 = c58981zWr.copydefault;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = c58981zWr.EZpvd;
        }
        return c58981zWr.OLrzqt(list, z4, passkeyReminderType2, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyReminderType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58983zWt> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58981zWr OLrzqt(@NotNull java.util.List<C58983zWt> list, boolean z, @NotNull PasskeyReminderType passkeyReminderType, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(passkeyReminderType, "");
        return new C58981zWr(list, z, passkeyReminderType, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58981zWr)) {
            return false;
        }
        C58981zWr c58981zWr = (C58981zWr) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c58981zWr.OLrzqt) && this.AEQbTJ == c58981zWr.AEQbTJ && this.KWHzl == c58981zWr.KWHzl && this.copydefault == c58981zWr.copydefault && this.EZpvd == c58981zWr.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyListState(items=" + this.OLrzqt + ", allowUnlink=" + this.AEQbTJ + ", reminderType=" + this.KWHzl + ", showFeatureToggle=" + this.copydefault + ", featureToggleOn=" + this.EZpvd + ")";
    }

    public C58981zWr(@NotNull java.util.List<C58983zWt> list, boolean z, @NotNull PasskeyReminderType passkeyReminderType, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(passkeyReminderType, "");
        this.OLrzqt = list;
        this.AEQbTJ = z;
        this.KWHzl = passkeyReminderType;
        this.copydefault = z2;
        this.EZpvd = z3;
    }
}
