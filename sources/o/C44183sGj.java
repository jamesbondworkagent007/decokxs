package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.im.inhouseim.ContactRelationType;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.room.inhouseim.ContactWithPhoneData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.RelationPermission;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.sGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44183sGj implements InHouseIMContactDao {
    public final RoomDatabase KWHzl;
    public final sIM EZpvd = new sIM();
    public final sIH copydefault = new sIH();
    public final EntityInsertAdapter<InHouseIMContactInfoEntity> AEQbTJ = new EntityInsertAdapter<InHouseIMContactInfoEntity>() { // from class: o.sGj.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `contacts` (`contactUid`,`channelId`,`relationType`,`remarkName`,`nickname`,`enNickname`,`avatar`,`userUid`,`tags`,`blacklisted`,`relationSourceType`,`relationPermission`,`phoneHash`,`customNote`,`orbitBackgroundImage`,`orbitStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMContactInfoEntity inHouseIMContactInfoEntity) {
            if (inHouseIMContactInfoEntity.getContactUid() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMContactInfoEntity.getContactUid());
            }
            if (inHouseIMContactInfoEntity.getChannelId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMContactInfoEntity.getChannelId());
            }
            sQLiteStatement.mo5795bindText(3, C44183sGj.this.copydefault(inHouseIMContactInfoEntity.getRelationType()));
            if (inHouseIMContactInfoEntity.getRemarkName() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, inHouseIMContactInfoEntity.getRemarkName());
            }
            if (inHouseIMContactInfoEntity.getNickname() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, inHouseIMContactInfoEntity.getNickname());
            }
            if (inHouseIMContactInfoEntity.getEnNickname() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, inHouseIMContactInfoEntity.getEnNickname());
            }
            if (inHouseIMContactInfoEntity.getAvatar() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, inHouseIMContactInfoEntity.getAvatar());
            }
            if (inHouseIMContactInfoEntity.getUserUid() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, inHouseIMContactInfoEntity.getUserUid());
            }
            java.lang.String strOLrzqt = C44183sGj.this.EZpvd.OLrzqt(inHouseIMContactInfoEntity.getTags());
            if (strOLrzqt == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, strOLrzqt);
            }
            if (inHouseIMContactInfoEntity.getBlacklisted() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5793bindLong(10, inHouseIMContactInfoEntity.getBlacklisted().intValue());
            }
            if (inHouseIMContactInfoEntity.getRelationSourceType() == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, C44183sGj.this.AEQbTJ(inHouseIMContactInfoEntity.getRelationSourceType()));
            }
            java.lang.String strOLrzqt2 = C44183sGj.this.copydefault.OLrzqt(inHouseIMContactInfoEntity.getRelationPermission());
            if (strOLrzqt2 == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, strOLrzqt2);
            }
            if (inHouseIMContactInfoEntity.getPhoneHash() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, inHouseIMContactInfoEntity.getPhoneHash());
            }
            if (inHouseIMContactInfoEntity.getCustomNote() == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, inHouseIMContactInfoEntity.getCustomNote());
            }
            if (inHouseIMContactInfoEntity.getOrbitBackgroundImage() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5795bindText(15, inHouseIMContactInfoEntity.getOrbitBackgroundImage());
            }
            if (inHouseIMContactInfoEntity.getOrbitStatus() == null) {
                sQLiteStatement.mo5794bindNull(16);
            } else {
                sQLiteStatement.mo5793bindLong(16, inHouseIMContactInfoEntity.getOrbitStatus().intValue());
            }
        }
    };

    public C44183sGj(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object insertOrReplaceContact(final InHouseIMContactInfoEntity inHouseIMContactInfoEntity, Continuation<? super Unit> continuation) {
        inHouseIMContactInfoEntity.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(inHouseIMContactInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(InHouseIMContactInfoEntity inHouseIMContactInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, inHouseIMContactInfoEntity);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object insertOrReplaceContacts(final java.util.List<InHouseIMContactInfoEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object getAllContacts(Continuation<? super java.util.List<ContactWithPhoneData>> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sGm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        int i3;
        java.lang.Integer numValueOf;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        int i6;
        java.lang.String text5;
        int i7;
        int i8;
        int i9;
        java.lang.Integer numValueOf2;
        int i10;
        java.lang.String text6;
        int i11;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        Select c.*, p.name AS phoneName, p.rawNumber AS phoneRawNumber from contacts AS c \n        LEFT JOIN phone_relations AS p ON c.phoneHash = p.hash \n    ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    i = columnIndexOrThrow;
                }
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i2 = columnIndexOrThrow2;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i2 = columnIndexOrThrow2;
                }
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(text2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i3 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i4 = columnIndexOrThrow14;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i4 = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow15;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = i3;
                    i7 = columnIndexOrThrow16;
                    text5 = null;
                } else {
                    i6 = i3;
                    text5 = sQLiteStatementPrepare.getText(i5);
                    i7 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    i8 = i4;
                    i9 = i5;
                    i10 = columnIndexOrThrow17;
                    numValueOf2 = null;
                } else {
                    i8 = i4;
                    i9 = i5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i7));
                    i10 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = columnIndexOrThrow18;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i10);
                    i11 = columnIndexOrThrow18;
                }
                int i12 = i7;
                arrayList.add(new ContactWithPhoneData(text7, text, contactRelationTypeCopydefault, text8, text9, text10, text11, text12, listAEQbTJ, numValueOf, relationSourceTypeEZpvd, relationPermissionKWHzl, text3, text6, sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11), text4, text5, numValueOf2));
                columnIndexOrThrow18 = i11;
                columnIndexOrThrow = i;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow14 = i8;
                columnIndexOrThrow15 = i9;
                columnIndexOrThrow16 = i12;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public Flow<java.util.List<ContactWithPhoneData>> flowAllContacts() {
        return FlowUtil.createFlow(this.KWHzl, false, new java.lang.String[]{"contacts", "phone_relations"}, new Function1() { // from class: o.sGp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        int i3;
        java.lang.Integer numValueOf;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        int i6;
        java.lang.String text5;
        int i7;
        int i8;
        int i9;
        java.lang.Integer numValueOf2;
        int i10;
        java.lang.String text6;
        int i11;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        Select c.*, p.name AS phoneName, p.rawNumber AS phoneRawNumber from contacts AS c \n        LEFT JOIN phone_relations AS p ON c.phoneHash = p.hash \n    ");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    i = columnIndexOrThrow;
                }
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i2 = columnIndexOrThrow2;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i2 = columnIndexOrThrow2;
                }
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(text2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i3 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i4 = columnIndexOrThrow14;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i4 = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow15;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = i3;
                    i7 = columnIndexOrThrow16;
                    text5 = null;
                } else {
                    i6 = i3;
                    text5 = sQLiteStatementPrepare.getText(i5);
                    i7 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    i8 = i4;
                    i9 = i5;
                    i10 = columnIndexOrThrow17;
                    numValueOf2 = null;
                } else {
                    i8 = i4;
                    i9 = i5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i7));
                    i10 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = columnIndexOrThrow18;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i10);
                    i11 = columnIndexOrThrow18;
                }
                int i12 = i7;
                arrayList.add(new ContactWithPhoneData(text7, text, contactRelationTypeCopydefault, text8, text9, text10, text11, text12, listAEQbTJ, numValueOf, relationSourceTypeEZpvd, relationPermissionKWHzl, text3, text6, sQLiteStatementPrepare.isNull(i11) ? null : sQLiteStatementPrepare.getText(i11), text4, text5, numValueOf2));
                columnIndexOrThrow18 = i11;
                columnIndexOrThrow = i;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow14 = i8;
                columnIndexOrThrow15 = i9;
                columnIndexOrThrow16 = i12;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public Flow<java.util.List<java.lang.String>> flowAllContactsHash() {
        return FlowUtil.createFlow(this.KWHzl, false, new java.lang.String[]{"contacts"}, new Function1() { // from class: o.sGn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44183sGj.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT phoneHash FROM contacts where phoneHash IS NOT NULL");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object getContactById(final java.lang.String str, Continuation<? super ContactWithPhoneData> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sGk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ ContactWithPhoneData AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        java.lang.String text3;
        int i3;
        java.lang.Integer numValueOf;
        int i4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        Select c.*, p.name AS phoneName, p.rawNumber AS phoneRawNumber from contacts AS c \n        LEFT JOIN phone_relations AS p ON c.phoneHash = p.hash \n        where contactUid=?\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
            ContactWithPhoneData contactWithPhoneData = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                java.lang.Integer numValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i = columnIndexOrThrow14;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i);
                    i2 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i3 = columnIndexOrThrow16;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i2);
                    i3 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow17;
                    numValueOf = null;
                } else {
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i3));
                    i4 = columnIndexOrThrow17;
                }
                contactWithPhoneData = new ContactWithPhoneData(text4, text5, contactRelationTypeCopydefault, text6, text7, text8, text9, text10, listAEQbTJ, numValueOf2, relationSourceTypeEZpvd, relationPermissionKWHzl, text, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), text2, text3, numValueOf);
            }
            return contactWithPhoneData;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object getContactEntityById(final java.lang.String str, Continuation<? super InHouseIMContactInfoEntity> continuation) {
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ InHouseIMContactInfoEntity OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM contacts WHERE contactUid=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            InHouseIMContactInfoEntity inHouseIMContactInfoEntity = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                java.lang.Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i = columnIndexOrThrow14;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i);
                    i2 = columnIndexOrThrow15;
                }
                inHouseIMContactInfoEntity = new InHouseIMContactInfoEntity(text3, text4, contactRelationTypeCopydefault, text5, text6, text7, text8, text9, listAEQbTJ, numValueOf, relationSourceTypeEZpvd, relationPermissionKWHzl, text, text2, sQLiteStatementPrepare.isNull(i2) ? null : sQLiteStatementPrepare.getText(i2), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)));
            }
            return inHouseIMContactInfoEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public Flow<ContactWithPhoneData> flowContactById(final java.lang.String str) {
        return FlowUtil.createFlow(this.KWHzl, false, new java.lang.String[]{"contacts", "phone_relations"}, new Function1() { // from class: o.sGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ ContactWithPhoneData KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        java.lang.String text3;
        int i3;
        java.lang.Integer numValueOf;
        int i4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        Select c.*, p.name AS phoneName, p.rawNumber AS phoneRawNumber from contacts AS c \n        LEFT JOIN phone_relations AS p ON c.phoneHash = p.hash \n        where contactUid=?\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
            ContactWithPhoneData contactWithPhoneData = null;
            if (sQLiteStatementPrepare.step()) {
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                java.lang.Integer numValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i = columnIndexOrThrow14;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i);
                    i2 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i3 = columnIndexOrThrow16;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i2);
                    i3 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    i4 = columnIndexOrThrow17;
                    numValueOf = null;
                } else {
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i3));
                    i4 = columnIndexOrThrow17;
                }
                contactWithPhoneData = new ContactWithPhoneData(text4, text5, contactRelationTypeCopydefault, text6, text7, text8, text9, text10, listAEQbTJ, numValueOf2, relationSourceTypeEZpvd, relationPermissionKWHzl, text, sQLiteStatementPrepare.isNull(i4) ? null : sQLiteStatementPrepare.getText(i4), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), text2, text3, numValueOf);
            }
            return contactWithPhoneData;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object getAllContactIdsExcludingTypes(final java.util.List<? extends ContactRelationType> list, Continuation<? super java.util.List<java.lang.String>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT contactUid FROM contacts WHERE relationType NOT IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List EZpvd(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
            while (it.hasNext()) {
                sQLiteStatementPrepare.mo5795bindText(i, copydefault((ContactRelationType) it.next()));
                i++;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object getRelationListFromLocalByUids(final java.util.Set<java.lang.String> set, Continuation<? super java.util.List<ContactWithPhoneData>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        sb.append("        Select c.*, p.name AS phoneName, p.rawNumber AS phoneRawNumber from contacts AS c ");
        sb.append("\n");
        sb.append("        LEFT JOIN phone_relations AS p ON c.phoneHash = p.hash ");
        sb.append("\n");
        sb.append("        WHERE contactUid IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        sb.append("\n");
        sb.append("    ");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, true, false, new Function1() { // from class: o.sGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(string, set, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.lang.String str, java.util.Set set, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        int i3;
        java.lang.Integer numValueOf;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        int i6;
        java.lang.String text5;
        int i7;
        int i8;
        java.lang.Integer numValueOf2;
        int i9;
        java.lang.String text6;
        int i10;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = set.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i11);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i11, str2);
                }
                i11++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactUid");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nickname");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "enNickname");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUid");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tags");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "blacklisted");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationSourceType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relationPermission");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneHash");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customNote");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitBackgroundImage");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orbitStatus");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    i = columnIndexOrThrow;
                }
                ContactRelationType contactRelationTypeCopydefault = copydefault(sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    i2 = columnIndexOrThrow2;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    i2 = columnIndexOrThrow2;
                }
                java.util.List<UserTagType> listAEQbTJ = this.EZpvd.AEQbTJ(text2);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    i3 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                }
                RelationSourceType relationSourceTypeEZpvd = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : EZpvd(sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                RelationPermission relationPermissionKWHzl = this.copydefault.KWHzl(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i4 = columnIndexOrThrow14;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i4 = columnIndexOrThrow14;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow15;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = i3;
                    text5 = null;
                } else {
                    i6 = i3;
                    text5 = sQLiteStatementPrepare.getText(i5);
                }
                int i12 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i7 = i4;
                    i8 = i5;
                    i9 = columnIndexOrThrow17;
                    numValueOf2 = null;
                } else {
                    i7 = i4;
                    i8 = i5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i12));
                    i9 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i9)) {
                    i10 = columnIndexOrThrow18;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i9);
                    i10 = columnIndexOrThrow18;
                }
                arrayList.add(new ContactWithPhoneData(text7, text, contactRelationTypeCopydefault, text8, text9, text10, text11, text12, listAEQbTJ, numValueOf, relationSourceTypeEZpvd, relationPermissionKWHzl, text3, text6, sQLiteStatementPrepare.isNull(i10) ? null : sQLiteStatementPrepare.getText(i10), text4, text5, numValueOf2));
                columnIndexOrThrow18 = i10;
                columnIndexOrThrow = i;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow14 = i7;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i12;
                columnIndexOrThrow17 = i9;
                columnIndexOrThrow2 = i2;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object updateRemarkName(final java.lang.String str, final java.lang.String str2, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44183sGj.OLrzqt(str2, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE contacts SET remarkName=? WHERE contactUid=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object updateRemarkNames(final java.util.List<java.lang.String> list, final java.lang.String str, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UPDATE contacts SET remarkName=");
        sb.append("?");
        sb.append(" WHERE contactUid IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44183sGj.KWHzl(string, str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, java.lang.String str2, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            java.util.Iterator it = list.iterator();
            int i = 2;
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (str3 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str3);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object updateRelationTypes(final java.util.List<java.lang.String> list, final ContactRelationType contactRelationType, Continuation<? super java.lang.Integer> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UPDATE contacts SET relationType=");
        sb.append("?");
        sb.append(" WHERE contactUid IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(string, contactRelationType, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, ContactRelationType contactRelationType, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo5795bindText(1, copydefault(contactRelationType));
            java.util.Iterator it = list.iterator();
            int i = 2;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str2);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao
    public java.lang.Object updateBlackListStatus(final java.lang.String str, final int i, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.KWHzl, false, true, new Function1() { // from class: o.sGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44183sGj.AEQbTJ(i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer AEQbTJ(int i, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE contacts SET blacklisted=? WHERE contactUid=?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMContactDao.Application.AEQbTJ(this);
    }

    public static java.util.List<java.lang.Class<?>> EZpvd() {
        return Collections.emptyList();
    }

    public final java.lang.String copydefault(@androidx.annotation.NonNull ContactRelationType contactRelationType) {
        int i = AnonymousClass2.AEQbTJ[contactRelationType.ordinal()];
        if (i == 1) {
            return "STRANGER";
        }
        if (i == 2) {
            return "ONE_WAY";
        }
        if (i == 3) {
            return "TWO_WAY";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + contactRelationType);
    }

    /* JADX INFO: renamed from: o.sGj$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[RelationSourceType.values().length];
            copydefault = iArr;
            try {
                iArr[RelationSourceType.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[RelationSourceType.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[RelationSourceType.P2P.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[RelationSourceType.AFFILIATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                copydefault[RelationSourceType.SOCIAL_TRADING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                copydefault[RelationSourceType.OK_ASSISTANT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                copydefault[RelationSourceType.VIP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                copydefault[RelationSourceType.CRYPTO_GIFT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                copydefault[RelationSourceType.PAYMENT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                copydefault[RelationSourceType.ORBIT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                copydefault[RelationSourceType.GBSC.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[ContactRelationType.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[ContactRelationType.STRANGER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                AEQbTJ[ContactRelationType.ONE_WAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                AEQbTJ[ContactRelationType.TWO_WAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                AEQbTJ[ContactRelationType.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
        }
    }

    public final java.lang.String AEQbTJ(@androidx.annotation.NonNull RelationSourceType relationSourceType) {
        switch (AnonymousClass2.copydefault[relationSourceType.ordinal()]) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "NORMAL";
            case 3:
                return CustomMessageData.SERVICE_NAME_P2P;
            case 4:
                return "AFFILIATE";
            case 5:
                return "SOCIAL_TRADING";
            case 6:
                return "OK_ASSISTANT";
            case 7:
                return "VIP";
            case 8:
                return "CRYPTO_GIFT";
            case 9:
                return "PAYMENT";
            case 10:
                return "ORBIT";
            case 11:
                return "GBSC";
            default:
                throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + relationSourceType);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContactRelationType copydefault(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1724718986:
                b = !str.equals("STRANGER") ? (byte) -1 : (byte) 0;
                break;
            case -601940650:
                if (str.equals("ONE_WAY")) {
                    b = 1;
                    break;
                }
                break;
            case -192491972:
                if (str.equals("TWO_WAY")) {
                    b = 2;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    b = 3;
                    break;
                }
                break;
        }
        if (b == 0) {
            return ContactRelationType.STRANGER;
        }
        if (b == 1) {
            return ContactRelationType.ONE_WAY;
        }
        if (b == 2) {
            return ContactRelationType.TWO_WAY;
        }
        if (b == 3) {
            return ContactRelationType.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RelationSourceType EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "NORMAL":
                return RelationSourceType.NORMAL;
            case "OK_ASSISTANT":
                return RelationSourceType.OK_ASSISTANT;
            case "SOCIAL_TRADING":
                return RelationSourceType.SOCIAL_TRADING;
            case "PAYMENT":
                return RelationSourceType.PAYMENT;
            case "P2P":
                return RelationSourceType.P2P;
            case "VIP":
                return RelationSourceType.VIP;
            case "GBSC":
                return RelationSourceType.GBSC;
            case "ORBIT":
                return RelationSourceType.ORBIT;
            case "AFFILIATE":
                return RelationSourceType.AFFILIATE;
            case "UNKNOWN":
                return RelationSourceType.UNKNOWN;
            case "CRYPTO_GIFT":
                return RelationSourceType.CRYPTO_GIFT;
            default:
                throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
        }
    }
}
