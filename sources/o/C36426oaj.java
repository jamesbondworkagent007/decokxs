package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.bean.tag.TagSize;
import com.okinc.im.imui.impl.OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1;
import com.okinc.im.imui.impl.OKIMInnerServiceImpl$startContactProfileByMessage$1$1;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oaj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36426oaj extends AbstractC43215rlA implements InterfaceC35179nqT {
    public final oEG EZpvd() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DXXBbs();
    }

    public final oDP KWHzl() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).OqFWZa();
    }

    @Override // o.InterfaceC35179nqT
    public void OLrzqt(@NotNull java.util.List<OKMessage> list) {
        sKH skhCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null || (skhCopydefault = interfaceC35180nqU.copydefault()) == null) {
            return;
        }
        skhCopydefault.KWHzl(list);
    }

    @Override // o.InterfaceC35179nqT
    public void KWHzl(@NotNull android.widget.ImageView imageView, IMUserInfo iMUserInfo) {
        Intrinsics.checkNotNullParameter(imageView, "");
        C35891oHn.EZpvd(imageView, iMUserInfo);
    }

    @Override // o.InterfaceC35179nqT
    public void AEQbTJ(@NotNull C35893oHp c35893oHp, IMUserInfo iMUserInfo) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        C35891oHn.EZpvd(c35893oHp, iMUserInfo);
    }

    @Override // o.InterfaceC35179nqT
    public void KWHzl(@NotNull C35893oHp c35893oHp, OfficialTagInfo officialTagInfo, @NotNull TagSize tagSize) {
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        Intrinsics.checkNotNullParameter(tagSize, "");
        C37716ozA.KWHzl(c35893oHp, officialTagInfo, tagSize);
    }

    @Override // o.InterfaceC35179nqT
    public void copydefault(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, officialTagInfo, i, null, false, false, false, 44, null);
    }

    @Override // o.InterfaceC35179nqT
    public void KWHzl(@NotNull android.widget.TextView textView, OfficialTagInfo officialTagInfo, int i, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, officialTagInfo, i, null, false, true, z, 12, null);
    }

    @Override // o.InterfaceC35179nqT
    public void AEQbTJ(@NotNull OKMessage oKMessage) {
        sKH skhCopydefault;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU == null || (skhCopydefault = interfaceC35180nqU.copydefault()) == null) {
            return;
        }
        skhCopydefault.AEQbTJ(oKMessage);
    }

    @Override // o.InterfaceC35179nqT
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return sDZ.AEQbTJ.AhwBna().KWHzl().KWHzl(str);
    }

    @Override // o.InterfaceC35179nqT
    public boolean KWHzl(@NotNull OKMessage oKMessage) {
        InterfaceC35180nqU interfaceC35180nqU;
        java.lang.Boolean boolValueOf;
        GroupUserSettingInfo userSettingInfo;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getConversationType() != OKConversationType.GROUP || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return false;
        }
        GroupInfo groupInfoOLrzqt = interfaceC35180nqU.EZpvd().OLrzqt(oKMessage.getTargetId());
        if (groupInfoOLrzqt == null || (userSettingInfo = groupInfoOLrzqt.getUserSettingInfo()) == null) {
            boolValueOf = null;
        } else {
            int code = userSettingInfo.getRole().getCode();
            boolValueOf = java.lang.Boolean.valueOf(code == GroupRole.Owner.getCode() || code == GroupRole.Administrator.getCode());
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // o.InterfaceC35179nqT
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull OKMessage oKMessage, java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), Dispatchers.getIO(), null, new OKIMInnerServiceImpl$startContactProfileByMessage$1$1(senderUserId, str, abstractActivityC33041mov, oKMessage, null), 2, null);
        }
    }

    @Override // o.InterfaceC35179nqT
    public void EZpvd(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull OKMessage oKMessage, final GroupInfo groupInfo, final boolean z, final C35285nsT c35285nsT) {
        java.lang.String senderUserId;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (groupInfo == null || (senderUserId = oKMessage.getSenderUserId()) == null) {
            return;
        }
        abstractActivityC33041mov.showLoading();
        C37683oyU.KWHzl(senderUserId, oKMessage.getTargetId(), abstractActivityC33041mov, new Function1() { // from class: o.oar
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36426oaj.AEQbTJ(abstractActivityC33041mov, this, groupInfo, c35285nsT, z, (GroupMemberInfo) obj);
            }
        }, new Function1() { // from class: o.oap
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36426oaj.AEQbTJ(abstractActivityC33041mov, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, C36426oaj c36426oaj, GroupInfo groupInfo, C35285nsT c35285nsT, boolean z, GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        abstractActivityC33041mov.dismissLoading();
        boolean zEZpvd = c36426oaj.EZpvd().EZpvd(groupInfo, groupMemberInfo, c35285nsT);
        if (z) {
            if (zEZpvd && !groupMemberInfo.isCurrentUser()) {
                C36404oaN.EZpvd.EZpvd(C56402yEa.EZpvd(groupMemberInfo));
            }
        } else if (zEZpvd) {
            C36404oaN.EZpvd.EZpvd(C56402yEa.EZpvd(groupMemberInfo));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C44124sEe.KWHzl("OKIMInnerServiceImpl.mentionMemberByMessage(...): ", th);
        abstractActivityC33041mov.dismissLoading();
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35179nqT
    public void AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final OKMessage oKMessage, final GroupInfo groupInfo, final C35285nsT c35285nsT) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        final java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId != null) {
            abstractActivityC33041mov.showLoading();
            C37683oyU.KWHzl(senderUserId, oKMessage.getTargetId(), abstractActivityC33041mov, new Function1() { // from class: o.oao
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36426oaj.EZpvd(abstractActivityC33041mov, groupInfo, this, c35285nsT, oKMessage, senderUserId, (GroupMemberInfo) obj);
                }
            }, new Function1() { // from class: o.oaq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36426oaj.copydefault(abstractActivityC33041mov, (java.lang.Throwable) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, GroupInfo groupInfo, C36426oaj c36426oaj, C35285nsT c35285nsT, OKMessage oKMessage, java.lang.String str, GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        abstractActivityC33041mov.dismissLoading();
        if (groupInfo != null && c36426oaj.EZpvd().EZpvd(groupInfo, groupMemberInfo, c35285nsT)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), null, null, new OKIMInnerServiceImpl$openMentionAndRemoveMemberBottomSheetORMentionUserOnly$1$1$1(c36426oaj, oKMessage, str, groupInfo, groupMemberInfo, abstractActivityC33041mov, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C44157sFk.KWHzl(th);
        C44124sEe.KWHzl("OKIMInnerServiceImpl.mentionMemberByMessage(...): ", th);
        abstractActivityC33041mov.dismissLoading();
        return Unit.INSTANCE;
    }
}
