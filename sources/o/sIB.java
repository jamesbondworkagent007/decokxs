package o;

import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao;

/* JADX INFO: loaded from: classes10.dex */
public interface sIB {
    InHouseIMConversationSimpleInfoDao AEQbTJ();

    InHouseIMGroupMemberDao AYXKKw();

    InHouseIMMessageHandlingDao AhwBna();

    PhoneRelationEntityDao AkhnZx();

    InHouseIMGroupInfoDao EZpvd();

    InHouseIMConversationDao KWHzl();

    InHouseIMContactDao OLrzqt();

    EmojiReactionDao copydefault();

    InHouseIMMessageTagsDao djBIcL();

    InHouseIMMessageDao gEmmrt();

    InHouseIMGroupSettingDao valueOf();
}
