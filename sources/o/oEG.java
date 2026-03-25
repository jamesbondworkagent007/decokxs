package o;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oEG {
    @yCM
    public oEG() {
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final class Activity extends ActionBar {
            public static final Activity copydefault = new Activity();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1188273860;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Disabled";
            }

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.oEG$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0900ActionBar extends ActionBar {
            public static final C0900ActionBar copydefault = new C0900ActionBar();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0900ActionBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -233058533;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FullAccess";
            }

            private C0900ActionBar() {
                super(null);
            }
        }

        public static final class Application extends ActionBar {
            public static final Application copydefault = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1597890831;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RestrictedToPrivileged";
            }

            private Application() {
                super(null);
            }
        }
    }

    public final boolean copydefault(GroupInfo groupInfo) {
        GroupRole role;
        GroupUserSettingInfo userSettingInfo = groupInfo.getUserSettingInfo();
        return (userSettingInfo == null || (role = userSettingInfo.getRole()) == null || !C44170sFx.KWHzl(role)) ? false : true;
    }

    public final boolean EZpvd(C35285nsT c35285nsT) {
        return c35285nsT != null && c35285nsT.values();
    }

    public final boolean copydefault(GroupMemberInfo groupMemberInfo) {
        return C44170sFx.KWHzl(groupMemberInfo.getRole()) || C44170sFx.OLrzqt(groupMemberInfo.getOfficialTags());
    }

    public final ActionBar KWHzl(GroupInfo groupInfo, C35285nsT c35285nsT) {
        if (EZpvd(c35285nsT)) {
            return ActionBar.Activity.copydefault;
        }
        if (groupInfo == null) {
            return ActionBar.Activity.copydefault;
        }
        if (!groupInfo.isAllowMentionOthers() && !copydefault(groupInfo)) {
            return ActionBar.Application.copydefault;
        }
        return ActionBar.C0900ActionBar.copydefault;
    }

    public final boolean OLrzqt(GroupInfo groupInfo, C35285nsT c35285nsT) {
        return !Intrinsics.EZpvd(KWHzl(groupInfo, c35285nsT), ActionBar.Activity.copydefault);
    }

    public final boolean EZpvd(GroupInfo groupInfo, @NotNull GroupMemberInfo groupMemberInfo, C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        ActionBar actionBarKWHzl = KWHzl(groupInfo, c35285nsT);
        if (Intrinsics.EZpvd(actionBarKWHzl, ActionBar.Activity.copydefault)) {
            return false;
        }
        if (Intrinsics.EZpvd(actionBarKWHzl, ActionBar.C0900ActionBar.copydefault)) {
            return true;
        }
        if (Intrinsics.EZpvd(actionBarKWHzl, ActionBar.Application.copydefault)) {
            return copydefault(groupMemberInfo);
        }
        throw new NoWhenBranchMatchedException();
    }
}
