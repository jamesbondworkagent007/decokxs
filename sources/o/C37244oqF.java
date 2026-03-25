package o;

import com.okinc.im.imui.relationlist.model.SearchFriendPayload;
import com.okinc.im.imui.relationlist.model.SelectionStatus;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37244oqF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = RelationInfo.$stable;
    public final RelationInfo AEQbTJ;
    public final java.lang.String EZpvd;
    public final SelectionStatus KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37244oqF copy$default(C37244oqF c37244oqF, RelationInfo relationInfo, java.lang.String str, java.lang.String str2, SelectionStatus selectionStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            relationInfo = c37244oqF.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c37244oqF.copydefault;
        }
        if ((i & 4) != 0) {
            str2 = c37244oqF.EZpvd;
        }
        if ((i & 8) != 0) {
            selectionStatus = c37244oqF.KWHzl;
        }
        return c37244oqF.EZpvd(relationInfo, str, str2, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37244oqF EZpvd(@NotNull RelationInfo relationInfo, @NotNull java.lang.String str, java.lang.String str2, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        return new C37244oqF(relationInfo, str, str2, selectionStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionStatus KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelationInfo OLrzqt() {
        return this.AEQbTJ;
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
        if (!(obj instanceof C37244oqF)) {
            return false;
        }
        C37244oqF c37244oqF = (C37244oqF) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c37244oqF.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c37244oqF.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c37244oqF.EZpvd) && this.KWHzl == c37244oqF.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchFriend(relationInfo=" + this.AEQbTJ + ", savedPhonebookName=" + this.copydefault + ", keyword=" + this.EZpvd + ", selectionStatus=" + this.KWHzl + ")";
    }

    public C37244oqF(@NotNull RelationInfo relationInfo, @NotNull java.lang.String str, java.lang.String str2, @NotNull SelectionStatus selectionStatus) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(selectionStatus, "");
        this.AEQbTJ = relationInfo;
        this.copydefault = str;
        this.EZpvd = str2;
        this.KWHzl = selectionStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.okimcore.model.remote.RelationInfo)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:com.okinc.im.imui.relationlist.model.SelectionStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.imui.relationlist.model.SelectionStatus:0x0004: SGET  A[WRAPPED] (LINE:9) com.okinc.im.imui.relationlist.model.SelectionStatus.UNSELECTED com.okinc.im.imui.relationlist.model.SelectionStatus) : (r4v0 com.okinc.im.imui.relationlist.model.SelectionStatus))
 A[MD:(com.okinc.okimcore.model.remote.RelationInfo, java.lang.String, java.lang.String, com.okinc.im.imui.relationlist.model.SelectionStatus):void (m)] (LINE:5) call: o.oqF.<init>(com.okinc.okimcore.model.remote.RelationInfo, java.lang.String, java.lang.String, com.okinc.im.imui.relationlist.model.SelectionStatus):void type: THIS */
    public /* synthetic */ C37244oqF(RelationInfo relationInfo, java.lang.String str, java.lang.String str2, SelectionStatus selectionStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(relationInfo, str, str2, (i & 8) != 0 ? SelectionStatus.UNSELECTED : selectionStatus);
    }

    /* JADX INFO: renamed from: o.oqF$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oqF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.List<SearchFriendPayload> copydefault(@NotNull C37244oqF c37244oqF, @NotNull C37244oqF c37244oqF2) {
            Intrinsics.checkNotNullParameter(c37244oqF, "");
            Intrinsics.checkNotNullParameter(c37244oqF2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!Intrinsics.EZpvd((java.lang.Object) c37244oqF.copydefault(), (java.lang.Object) c37244oqF2.copydefault())) {
                arrayList.add(SearchFriendPayload.KEYWORD);
            }
            if (c37244oqF.KWHzl() != c37244oqF2.KWHzl()) {
                arrayList.add(SearchFriendPayload.SELECTION);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }
}
