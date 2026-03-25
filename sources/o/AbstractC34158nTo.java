package o;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC34158nTo {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC34158nTo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34158nTo() {
    }

    /* JADX INFO: renamed from: o.nTo$ActionBar */
    public static final class ActionBar extends AbstractC34158nTo {
        public static final int AEQbTJ = GroupMemberInfo.$stable;
        public final GroupMemberInfo EZpvd;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, GroupMemberInfo groupMemberInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                groupMemberInfo = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str = actionBar.KWHzl;
            }
            return actionBar.KWHzl(groupMemberInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull GroupMemberInfo groupMemberInfo, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(groupMemberInfo, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupMemberInfo copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MemberItem(memberInfo=" + this.EZpvd + ", memberDisplayName=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull GroupMemberInfo groupMemberInfo, @NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = groupMemberInfo;
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.nTo$StateListAnimator */
    public static final class StateListAnimator extends AbstractC34158nTo {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }
}
