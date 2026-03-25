package com.okinc.okimcore.model.im;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class GroupActionFailReason {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupActionFailReason[] $VALUES;
    public static final Activity Companion;
    private final String value;
    public static final GroupActionFailReason UsersInfoMissing = new GroupActionFailReason("UsersInfoMissing", 0, "USERS_INFO_MISSING");
    public static final GroupActionFailReason InGroupBlockList = new GroupActionFailReason("InGroupBlockList", 1, "IN_GROUP_BLOCKLIST");
    public static final GroupActionFailReason AutoGroupAdditionDisallowed = new GroupActionFailReason("AutoGroupAdditionDisallowed", 2, "AUTO_GROUP_ADDITION_DISALLOWED");
    public static final GroupActionFailReason ExceededGroupSize = new GroupActionFailReason("ExceededGroupSize", 3, "EXCEEDED_GROUP_SIZE");
    public static final GroupActionFailReason UsersAlreadyInGroup = new GroupActionFailReason("UsersAlreadyInGroup", 4, "USERS_ALREADY_IN_GROUP");
    public static final GroupActionFailReason NonCompliantUsers = new GroupActionFailReason("NonCompliantUsers", 5, "NON_COMPLIANT_USERS");
    public static final GroupActionFailReason UsersAreStrangerOrNotContact = new GroupActionFailReason("UsersAreStrangerOrNotContact", 6, "USERS_ARE_STRANGER_OR_NOT_CONTACT");
    public static final GroupActionFailReason SentInvitationInstead = new GroupActionFailReason("SentInvitationInstead", 7, "SENT_INVITATION_INSTEAD");
    public static final GroupActionFailReason AdminApprovalRequired = new GroupActionFailReason("AdminApprovalRequired", 8, "ADMIN_APPROVAL_REQUIRED");
    public static final GroupActionFailReason GroupEntryVerificationsRequired = new GroupActionFailReason("GroupEntryVerificationsRequired", 9, "GROUP_ENTRY_VERIFICATIONS_REQUIRED");
    public static final GroupActionFailReason Unknown = new GroupActionFailReason("Unknown", 10, "_UNKNOWN_");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupActionFailReason[] $values() {
        return new GroupActionFailReason[]{UsersInfoMissing, InGroupBlockList, AutoGroupAdditionDisallowed, ExceededGroupSize, UsersAlreadyInGroup, NonCompliantUsers, UsersAreStrangerOrNotContact, SentInvitationInstead, AdminApprovalRequired, GroupEntryVerificationsRequired, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupActionFailReason> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private GroupActionFailReason(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        GroupActionFailReason[] groupActionFailReasonArr$values = $values();
        $VALUES = groupActionFailReasonArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupActionFailReasonArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.GroupActionFailReason.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final GroupActionFailReason OLrzqt(@NotNull String str) {
            GroupActionFailReason groupActionFailReason;
            Intrinsics.checkNotNullParameter(str, "");
            GroupActionFailReason[] groupActionFailReasonArrValues = GroupActionFailReason.values();
            int length = groupActionFailReasonArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    groupActionFailReason = null;
                    break;
                }
                groupActionFailReason = groupActionFailReasonArrValues[i];
                if (Intrinsics.EZpvd((Object) groupActionFailReason.getValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return groupActionFailReason == null ? GroupActionFailReason.Unknown : groupActionFailReason;
        }
    }

    public static GroupActionFailReason valueOf(String str) {
        return (GroupActionFailReason) Enum.valueOf(GroupActionFailReason.class, str);
    }

    public static GroupActionFailReason[] values() {
        return (GroupActionFailReason[]) $VALUES.clone();
    }
}
