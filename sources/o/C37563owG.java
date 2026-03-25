package o;

import com.okinc.im.imui.selectgroupvoicecallmember.model.SearchGroupCallMemberPayload;
import com.okinc.im.imui.selectgroupvoicecallmember.model.SelectionStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37563owG {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final SelectionStatus AEQbTJ;
    public final java.lang.String EZpvd;
    public final C34282nYe copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37563owG copy$default(C37563owG c37563owG, C34282nYe c34282nYe, java.lang.String str, SelectionStatus selectionStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c34282nYe = c37563owG.copydefault;
        }
        if ((i & 2) != 0) {
            str = c37563owG.EZpvd;
        }
        if ((i & 4) != 0) {
            selectionStatus = c37563owG.AEQbTJ;
        }
        return c37563owG.EZpvd(c34282nYe, str, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37563owG EZpvd(@NotNull C34282nYe c34282nYe, java.lang.String str, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        return new C37563owG(c34282nYe, str, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionStatus KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34282nYe OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37563owG)) {
            return false;
        }
        C37563owG c37563owG = (C37563owG) obj;
        return Intrinsics.EZpvd(this.copydefault, c37563owG.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37563owG.EZpvd) && this.AEQbTJ == c37563owG.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.EZpvd;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchGroupCallMember(groupMemberDisplayModel=" + this.copydefault + ", keyword=" + this.EZpvd + ", selectionStatus=" + this.AEQbTJ + ")";
    }

    public C37563owG(@NotNull C34282nYe c34282nYe, java.lang.String str, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        this.copydefault = c34282nYe;
        this.EZpvd = str;
        this.AEQbTJ = selectionStatus;
    }

    /* JADX INFO: renamed from: o.owG$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.owG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.util.List<SearchGroupCallMemberPayload> copydefault(@NotNull C37563owG c37563owG, @NotNull C37563owG c37563owG2) {
            Intrinsics.checkNotNullParameter(c37563owG, "");
            Intrinsics.checkNotNullParameter(c37563owG2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!Intrinsics.EZpvd((java.lang.Object) c37563owG.copydefault(), (java.lang.Object) c37563owG2.copydefault())) {
                arrayList.add(SearchGroupCallMemberPayload.KEYWORD);
            }
            if (c37563owG.KWHzl() != c37563owG2.KWHzl()) {
                arrayList.add(SearchGroupCallMemberPayload.SELECTION);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }
}
