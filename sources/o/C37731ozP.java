package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37731ozP {
    public static final void KWHzl(@NotNull SearchResultData.ChatAndContact chatAndContact, @NotNull C35893oHp c35893oHp) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        RelationInfo relation = chatAndContact.getRelation();
        OKConversation conversation = chatAndContact.getConversation();
        if (relation != null) {
            C37241oqC c37241oqC = C37241oqC.AEQbTJ;
            PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
            c37241oqC.AEQbTJ(c35893oHp, relation.copy(((-50331649) & 1) != 0 ? relation.contactsId : null, ((-50331649) & 2) != 0 ? relation.avatar : null, ((-50331649) & 4) != 0 ? relation.nickName : null, ((-50331649) & 8) != 0 ? relation.remarkName : null, ((-50331649) & 16) != 0 ? relation.sign : null, ((-50331649) & 32) != 0 ? relation.isBlackList : false, ((-50331649) & 64) != 0 ? relation.isNoDisturb : false, ((-50331649) & 128) != 0 ? relation.isTop : false, ((-50331649) & 256) != 0 ? relation.isFriend : false, ((-50331649) & 512) != 0 ? relation.isBothFriend : false, ((-50331649) & 1024) != 0 ? relation.isCanChat : false, ((-50331649) & 2048) != 0 ? relation.isCurrentUser : false, ((-50331649) & 4096) != 0 ? relation.displayAlphabetText : null, ((-50331649) & 8192) != 0 ? relation.officialTags : null, ((-50331649) & 16384) != 0 ? relation.timestamp : 0L, ((-50331649) & 32768) != 0 ? relation.isOpenKOL : false, (65536 & (-50331649)) != 0 ? relation.kolUniqueName : null, ((-50331649) & 131072) != 0 ? relation.enNickName : null, ((-50331649) & 262144) != 0 ? relation.allowAddContact : null, ((-50331649) & 524288) != 0 ? relation.isAllowSendMessage : null, ((-50331649) & 1048576) != 0 ? relation.showVoiceCall : null, ((-50331649) & 2097152) != 0 ? relation.showKycBanner : null, ((-50331649) & 4194304) != 0 ? relation.relationSourceType : null, ((-50331649) & 8388608) != 0 ? relation.hash : null, ((-50331649) & 16777216) != 0 ? relation.phoneName : phoneRelation != null ? phoneRelation.getName() : null, ((-50331649) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? relation.phoneRawNumber : null, ((-50331649) & 67108864) != 0 ? relation.isAllowSingleChatInGroup : null, ((-50331649) & 134217728) != 0 ? relation.showUnknownContactBanner : null, ((-50331649) & 268435456) != 0 ? relation.allowVoice : null, ((-50331649) & 536870912) != 0 ? relation.allowFile : null, ((-50331649) & 1073741824) != 0 ? relation.allowPlanetProfile : null, ((-50331649) & Integer.MIN_VALUE) != 0 ? relation.orbitBackgroundImage : null, (63 & 1) != 0 ? relation.orbitStatus : null, (63 & 2) != 0 ? relation.allowBlockUser : null, (63 & 4) != 0 ? relation.showVipPerformanceDetails : null, (63 & 8) != 0 ? relation.allowRemoveGroupMember : null, (63 & 16) != 0 ? relation.customNote : null, (63 & 32) != 0 ? relation.isAllowPay : null));
        } else if (conversation != null) {
            c35893oHp.setVisibility(0);
            C35891oHn.AEQbTJ(c35893oHp, conversation);
        }
    }

    public static final void OLrzqt(@NotNull SearchResultData.Message message, @NotNull C35893oHp c35893oHp) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(c35893oHp, "");
        C35891oHn.AEQbTJ(c35893oHp, message.getConversation());
    }

    public static final java.lang.String OLrzqt(@NotNull SearchResultData.Message message, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(context, "");
        nDD ndd = nDD.OLrzqt;
        OKMessage message2 = message.getMessage();
        return ndd.EZpvd(context, C33129mqd.valueOf(message2 != null ? java.lang.Long.valueOf(message2.getSentTime()) : null));
    }
}
