package o;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35179nqT extends InterfaceC43216rlB {
    void AEQbTJ(@NotNull OKMessage oKMessage);

    void AEQbTJ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull OKMessage oKMessage, GroupInfo groupInfo, C35285nsT c35285nsT);

    void AEQbTJ(@NotNull C35893oHp c35893oHp, IMUserInfo iMUserInfo);

    void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull OKMessage oKMessage, GroupInfo groupInfo, boolean z, C35285nsT c35285nsT);

    boolean EZpvd(@NotNull java.lang.String str);

    void KWHzl(@NotNull android.widget.ImageView imageView, IMUserInfo iMUserInfo);

    void KWHzl(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, boolean z);

    void KWHzl(@NotNull C35893oHp c35893oHp, OfficialTagInfo officialTagInfo, @NotNull TagSize tagSize);

    boolean KWHzl(@NotNull OKMessage oKMessage);

    void OLrzqt(@NotNull java.util.List<OKMessage> list);

    void copydefault(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i);

    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull OKMessage oKMessage, java.lang.String str);

    /* JADX INFO: renamed from: o.nqT$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public static /* synthetic */ void updateVipTagViewWithTagInfo$default(InterfaceC35179nqT interfaceC35179nqT, android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateVipTagViewWithTagInfo");
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            interfaceC35179nqT.KWHzl(textView, officialTagInfo, i, z);
        }

        public static /* synthetic */ void mentionMemberByMessage$default(InterfaceC35179nqT interfaceC35179nqT, AbstractActivityC33041mov abstractActivityC33041mov, OKMessage oKMessage, GroupInfo groupInfo, boolean z, C35285nsT c35285nsT, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mentionMemberByMessage");
            }
            GroupInfo groupInfo2 = (i & 4) != 0 ? null : groupInfo;
            if ((i & 8) != 0) {
                z = false;
            }
            interfaceC35179nqT.EZpvd(abstractActivityC33041mov, oKMessage, groupInfo2, z, (i & 16) != 0 ? null : c35285nsT);
        }

        public static /* synthetic */ void openMentionAndRemoveMemberBottomSheetORMentionUserOnly$default(InterfaceC35179nqT interfaceC35179nqT, AbstractActivityC33041mov abstractActivityC33041mov, OKMessage oKMessage, GroupInfo groupInfo, C35285nsT c35285nsT, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openMentionAndRemoveMemberBottomSheetORMentionUserOnly");
            }
            if ((i & 4) != 0) {
                groupInfo = null;
            }
            if ((i & 8) != 0) {
                c35285nsT = null;
            }
            interfaceC35179nqT.AEQbTJ(abstractActivityC33041mov, oKMessage, groupInfo, c35285nsT);
        }
    }
}
