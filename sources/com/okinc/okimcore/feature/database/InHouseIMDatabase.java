package com.okinc.okimcore.feature.database;

import androidx.room.RoomDatabase;
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
import com.okinc.okimcore.stickers.local.StickerPacksDao;
import com.okinc.okimcore.stickers.local.StickersDao;

/* JADX INFO: loaded from: classes10.dex */
public abstract class InHouseIMDatabase extends RoomDatabase {
    public abstract InHouseIMConversationDao AEQbTJ();

    public abstract InHouseIMGroupSettingDao AYXKKw();

    public abstract InHouseIMMessageHandlingDao AhwBna();

    public abstract PhoneRelationEntityDao DbNXlk();

    public abstract InHouseIMGroupInfoDao EZpvd();

    public abstract EmojiReactionDao KWHzl();

    public abstract InHouseIMConversationSimpleInfoDao OLrzqt();

    public abstract InHouseIMContactDao copydefault();

    public abstract InHouseIMGroupMemberDao djBIcL();

    public abstract StickerPacksDao fetchVPNInfo();

    public abstract InHouseIMMessageDao gEmmrt();

    public abstract StickersDao isConnected();

    public abstract InHouseIMMessageTagsDao valueOf();
}
