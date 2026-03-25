package o;

import androidx.core.content.ContextCompat;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.im.widgets.AvatarInfo;
import com.okinc.im.widgets.GroupInviteType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35891oHn {
    public static final java.util.List<OKConversationType> AEQbTJ = yDY.gEmmrt(OKConversationType.GROUP, OKConversationType.CUSTOMER_SERVICE, OKConversationType.CHATROOM);

    public static final void OLrzqt(@NotNull C35893oHp c35893oHp, java.lang.String str, OKConversationType oKConversationType, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (oKConversationType != null && OLrzqt(oKConversationType)) {
            IMImageHelper.loadGroupAvatar$default(IMImageHelper.OLrzqt, c35893oHp, str, null, 4, null);
        } else {
            C33054mpH.loadAvatar$default(c35893oHp, str != null ? str : "", null, null, 6, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.im.imui.utils.IMImageHelper.loadGroupAvatar$default(com.okinc.im.imui.utils.IMImageHelper, android.widget.ImageView, java.lang.String, com.okinc.im.widgets.GroupInviteType, int, java.lang.Object):void */
    public static final void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        java.lang.String portraitUrl = oKConversation.getPortraitUrl();
        if (OLrzqt(oKConversation.getConversationType())) {
            IMImageHelper.loadGroupAvatar$default(IMImageHelper.OLrzqt, c35893oHp, portraitUrl, null, 4, null);
        } else {
            C33054mpH.loadAvatar$default(c35893oHp, portraitUrl == null ? "" : portraitUrl, null, null, 6, null);
        }
    }

    public static final void OLrzqt(@NotNull C35893oHp c35893oHp, RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(relationInfo != null ? relationInfo.getContactsId() : null, relationInfo != null ? relationInfo.getAvatar() : null), null, null, 6, null);
    }

    public static final void KWHzl(@NotNull C35893oHp c35893oHp, GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(groupMemberInfo != null ? groupMemberInfo.getMemberId() : null, groupMemberInfo != null ? groupMemberInfo.getAvatar() : null), null, null, 6, null);
    }

    public static final void EZpvd(@NotNull android.widget.ImageView imageView, IMUserInfo iMUserInfo) {
        Intrinsics.checkNotNullParameter(imageView, "");
        C33054mpH.loadAvatar$default(imageView, AEQbTJ(iMUserInfo != null ? iMUserInfo.getImId() : null, iMUserInfo != null ? iMUserInfo.getAvatarUrl() : null), null, null, 6, null);
    }

    public static final void AEQbTJ(@NotNull C35893oHp c35893oHp, C44461sQr c44461sQr) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        java.lang.String strAEQbTJ = c44461sQr != null ? c44461sQr.AEQbTJ() : null;
        C33054mpH.loadAvatar$default(c35893oHp, strAEQbTJ == null ? "" : strAEQbTJ, null, null, 6, null);
    }

    public static final void EZpvd(@NotNull C35893oHp c35893oHp, C37246oqH c37246oqH) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        C33054mpH.loadAvatar$default(c35893oHp, "", c37246oqH != null ? c37246oqH.EZpvd() : null, null, 4, null);
    }

    public static /* synthetic */ void loadGroupAvatar$default(C35893oHp c35893oHp, java.lang.String str, GroupInviteType groupInviteType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            groupInviteType = null;
        }
        AEQbTJ(c35893oHp, str, groupInviteType);
    }

    public static final void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull java.lang.String str, GroupInviteType groupInviteType) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(str, "");
        IMImageHelper.OLrzqt.copydefault(c35893oHp, str, groupInviteType);
    }

    public static final void KWHzl(@NotNull C35893oHp c35893oHp, @NotNull AvatarInfo avatarInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        C33054mpH.loadAvatar$default(c35893oHp, avatarInfo.copydefault(), null, null, 6, null);
    }

    public static final void OLrzqt(@NotNull C35893oHp c35893oHp, @NotNull GroupMemberInfo groupMemberInfo, boolean z) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        KWHzl(c35893oHp, z && C44170sFx.valueOf(groupMemberInfo.getOfficialTags()));
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(groupMemberInfo.getMemberId(), groupMemberInfo.getAvatar()), null, null, 6, null);
    }

    public static final void AEQbTJ(@NotNull C35893oHp c35893oHp, @NotNull C34282nYe c34282nYe) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        KWHzl(c35893oHp, C44170sFx.valueOf(c34282nYe.djBIcL()));
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(c34282nYe.AhwBna(), c34282nYe.OLrzqt()), null, null, 6, null);
    }

    public static final void KWHzl(@NotNull C35893oHp c35893oHp, @NotNull RelationInfo relationInfo, boolean z) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        KWHzl(c35893oHp, z && C44170sFx.valueOf(relationInfo.getOfficialTags()));
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(relationInfo.getContactsId(), relationInfo.getAvatar()), null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(@NotNull C35893oHp c35893oHp, IMUserInfo iMUserInfo) {
        boolean z;
        OfficialTagInfo officialTagInfo;
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        if (iMUserInfo == null || (officialTagInfo = iMUserInfo.getOfficialTagInfo()) == null) {
            z = false;
        } else {
            z = true;
            if (!C44170sFx.valueOf(officialTagInfo)) {
            }
        }
        KWHzl(c35893oHp, z);
        C33054mpH.loadAvatar$default(c35893oHp, AEQbTJ(iMUserInfo != null ? iMUserInfo.getImId() : null, iMUserInfo != null ? iMUserInfo.getAvatarUrl() : null), null, null, 6, null);
    }

    public static final void OLrzqt(@NotNull C35893oHp c35893oHp, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        KWHzl(c35893oHp, C44170sFx.AEQbTJ(oKConversation));
        AEQbTJ(c35893oHp, oKConversation);
    }

    public static final void KWHzl(@NotNull C35893oHp c35893oHp, boolean z) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        if (z) {
            c35893oHp.setBackground(ContextCompat.getDrawable(c35893oHp.getContext(), C35399nuc.ActionBar.AhwBna));
            android.content.Context context = c35893oHp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(4, context);
            c35893oHp.setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
            return;
        }
        c35893oHp.setBackground(null);
        c35893oHp.setPadding(0, 0, 0, 0);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        UserProfile profile;
        if (str != null && C44157sFk.KWHzl(str)) {
            User userOLrzqt = C44157sFk.gEmmrt().OLrzqt();
            java.lang.String profilePictureUrl = (userOLrzqt == null || (profile = userOLrzqt.getProfile()) == null) ? null : profile.getProfilePictureUrl();
            if (profilePictureUrl != null) {
                return profilePictureUrl;
            }
        } else if (str2 != null) {
            return str2;
        }
        return "";
    }

    public static final boolean OLrzqt(OKConversationType oKConversationType) {
        return AEQbTJ.contains(oKConversationType);
    }
}
