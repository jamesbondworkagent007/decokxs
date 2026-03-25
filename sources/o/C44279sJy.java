package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.room.inhouseim.GroupMemberWithDetails;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.sJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44279sJy implements InHouseIMGroupMemberDao {
    public final RoomDatabase EZpvd;
    public final sIL copydefault = new sIL();
    public final EntityInsertAdapter<InHouseIMGroupMemberEntity> OLrzqt = new EntityInsertAdapter<InHouseIMGroupMemberEntity>() { // from class: o.sJy.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `group_member` (`member_id`,`group_id`,`invite_id`,`role`,`name`,`nick_name`,`member_avatar`,`status`,`create_time`,`update_time`,`v1`,`v2`,`v3`,`officialTagInfo`,`paidGroupMemberStatus_paymentRequiredStatus`,`paidGroupMemberStatus_lastPaymentDatetime`,`paidGroupMemberStatus_nextPaymentDatetime`,`paidGroupMemberStatus_paidGroupBillingStatus`,`paidGroupMemberStatus_billingCyclePaymentStatus`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity) {
            if (inHouseIMGroupMemberEntity.getMemberId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMGroupMemberEntity.getMemberId());
            }
            if (inHouseIMGroupMemberEntity.getGroupId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMGroupMemberEntity.getGroupId());
            }
            if (inHouseIMGroupMemberEntity.getInviteId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, inHouseIMGroupMemberEntity.getInviteId());
            }
            sQLiteStatement.mo5793bindLong(4, inHouseIMGroupMemberEntity.getRole());
            if (inHouseIMGroupMemberEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, inHouseIMGroupMemberEntity.getName());
            }
            if (inHouseIMGroupMemberEntity.getNickName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, inHouseIMGroupMemberEntity.getNickName());
            }
            if (inHouseIMGroupMemberEntity.getAvatar() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, inHouseIMGroupMemberEntity.getAvatar());
            }
            sQLiteStatement.mo5793bindLong(8, inHouseIMGroupMemberEntity.getStatus());
            sQLiteStatement.mo5793bindLong(9, inHouseIMGroupMemberEntity.getCreateTime());
            sQLiteStatement.mo5793bindLong(10, inHouseIMGroupMemberEntity.getUpdateTime());
            if (inHouseIMGroupMemberEntity.getV1Field() == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, inHouseIMGroupMemberEntity.getV1Field());
            }
            if (inHouseIMGroupMemberEntity.getV2Field() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, inHouseIMGroupMemberEntity.getV2Field());
            }
            if (inHouseIMGroupMemberEntity.getV3Field() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, inHouseIMGroupMemberEntity.getV3Field());
            }
            java.lang.String strAEQbTJ = C44279sJy.this.copydefault.AEQbTJ(inHouseIMGroupMemberEntity.getOfficialTagInfo());
            if (strAEQbTJ == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, strAEQbTJ);
            }
            PaidGroupMemberStatus paidGroupMemberStatus = inHouseIMGroupMemberEntity.getPaidGroupMemberStatus();
            if (paidGroupMemberStatus != null) {
                if (paidGroupMemberStatus.getPaymentRequiredStatus() == null) {
                    sQLiteStatement.mo5794bindNull(15);
                } else {
                    sQLiteStatement.mo5795bindText(15, C44279sJy.this.copydefault(paidGroupMemberStatus.getPaymentRequiredStatus()));
                }
                if (paidGroupMemberStatus.getLastPaymentDatetime() == null) {
                    sQLiteStatement.mo5794bindNull(16);
                } else {
                    sQLiteStatement.mo5793bindLong(16, paidGroupMemberStatus.getLastPaymentDatetime().longValue());
                }
                if (paidGroupMemberStatus.getNextPaymentDatetime() == null) {
                    sQLiteStatement.mo5794bindNull(17);
                } else {
                    sQLiteStatement.mo5793bindLong(17, paidGroupMemberStatus.getNextPaymentDatetime().longValue());
                }
                if (paidGroupMemberStatus.getPaidGroupBillingStatus() == null) {
                    sQLiteStatement.mo5794bindNull(18);
                } else {
                    sQLiteStatement.mo5795bindText(18, C44279sJy.this.copydefault(paidGroupMemberStatus.getPaidGroupBillingStatus()));
                }
                if (paidGroupMemberStatus.getBillingCyclePaymentStatus() == null) {
                    sQLiteStatement.mo5794bindNull(19);
                    return;
                } else {
                    sQLiteStatement.mo5795bindText(19, C44279sJy.this.OLrzqt(paidGroupMemberStatus.getBillingCyclePaymentStatus()));
                    return;
                }
            }
            sQLiteStatement.mo5794bindNull(15);
            sQLiteStatement.mo5794bindNull(16);
            sQLiteStatement.mo5794bindNull(17);
            sQLiteStatement.mo5794bindNull(18);
            sQLiteStatement.mo5794bindNull(19);
        }
    };

    public C44279sJy(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object insert(final InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Continuation<? super Unit> continuation) {
        inHouseIMGroupMemberEntity.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(inHouseIMGroupMemberEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit OLrzqt(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, inHouseIMGroupMemberEntity);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object insert(final java.util.List<InHouseIMGroupMemberEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.OLrzqt.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object getGroupMemberList(final java.lang.String str, Continuation<? super java.util.List<InHouseIMGroupMemberEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.sJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        PaymentRequiredStatus paymentRequiredStatusAEQbTJ;
        PaidGroupMemberStatus paidGroupMemberStatus;
        int i;
        int i2;
        java.lang.String text;
        int i3;
        java.lang.String text2;
        java.lang.String text3;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_member WHERE group_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "invite_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nick_name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "officialTagInfo");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paymentRequiredStatus");
            int i4 = columnIndexOrThrow13;
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_lastPaymentDatetime");
            int i5 = columnIndexOrThrow12;
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_nextPaymentDatetime");
            int i6 = columnIndexOrThrow11;
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paidGroupBillingStatus");
            int i7 = columnIndexOrThrow10;
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_billingCyclePaymentStatus");
            int i8 = columnIndexOrThrow9;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15) && sQLiteStatementPrepare.isNull(columnIndexOrThrow16) && sQLiteStatementPrepare.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare.isNull(columnIndexOrThrow18) && sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                    arrayList = arrayList2;
                    i = columnIndexOrThrow19;
                    paidGroupMemberStatus = null;
                } else {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = null;
                    } else {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                    }
                    paidGroupMemberStatus = new PaidGroupMemberStatus(paymentRequiredStatusAEQbTJ, sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow17)), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow18)), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow19)));
                    i = columnIndexOrThrow19;
                }
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = new InHouseIMGroupMemberEntity();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i2 = columnIndexOrThrow;
                    text = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                inHouseIMGroupMemberEntity.setMemberId(text);
                inHouseIMGroupMemberEntity.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupMemberEntity.setInviteId(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                int i9 = columnIndexOrThrow2;
                int i10 = columnIndexOrThrow3;
                inHouseIMGroupMemberEntity.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupMemberEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupMemberEntity.setNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupMemberEntity.setAvatar(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                inHouseIMGroupMemberEntity.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                int i11 = i8;
                int i12 = columnIndexOrThrow4;
                inHouseIMGroupMemberEntity.setCreateTime(sQLiteStatementPrepare.getLong(i11));
                int i13 = i7;
                int i14 = columnIndexOrThrow5;
                inHouseIMGroupMemberEntity.setUpdateTime(sQLiteStatementPrepare.getLong(i13));
                int i15 = i6;
                inHouseIMGroupMemberEntity.setV1Field(sQLiteStatementPrepare.isNull(i15) ? null : sQLiteStatementPrepare.getText(i15));
                int i16 = i5;
                if (sQLiteStatementPrepare.isNull(i16)) {
                    i3 = i9;
                    text2 = null;
                } else {
                    i3 = i9;
                    text2 = sQLiteStatementPrepare.getText(i16);
                }
                inHouseIMGroupMemberEntity.setV2Field(text2);
                int i17 = i4;
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i4 = i17;
                    text3 = null;
                } else {
                    i4 = i17;
                    text3 = sQLiteStatementPrepare.getText(i17);
                }
                inHouseIMGroupMemberEntity.setV3Field(text3);
                int i18 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i18;
                inHouseIMGroupMemberEntity.setOfficialTagInfo(this.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18)));
                inHouseIMGroupMemberEntity.setPaidGroupMemberStatus(paidGroupMemberStatus);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(inHouseIMGroupMemberEntity);
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow19 = i;
                columnIndexOrThrow = i2;
                i6 = i15;
                columnIndexOrThrow4 = i12;
                i8 = i11;
                i5 = i16;
                columnIndexOrThrow5 = i14;
                i7 = i13;
                columnIndexOrThrow3 = i10;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public Flow<java.util.List<GroupMemberWithDetails>> getGroupMemberListFlow(final java.lang.String str) {
        return FlowUtil.createFlow(this.EZpvd, false, new java.lang.String[]{"group_member", "contacts", "phone_relations"}, new Function1() { // from class: o.sJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        int i;
        java.lang.String text;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        java.util.ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        java.lang.String str2;
        java.lang.String str3;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.String str4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity;
        int i22;
        C44279sJy c44279sJy;
        PaymentRequiredStatus paymentRequiredStatusAEQbTJ;
        PaidGroupMemberStatus paidGroupMemberStatus;
        java.lang.String text4;
        java.lang.String text5;
        java.lang.String text6;
        int i23;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT\n            gm.*,\n            c.remarkName as remarkName,\n            p.name AS phoneName,\n            p.rawNumber AS phoneRawNumber\n        FROM \n            group_member AS gm\n        LEFT JOIN \n            contacts AS c ON gm.member_id = c.contactUid\n        LEFT JOIN \n            phone_relations AS p ON c.phoneHash = p.hash\n        WHERE \n            gm.group_id = ?\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "invite_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nick_name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "officialTagInfo");
            try {
                int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paymentRequiredStatus");
                int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_lastPaymentDatetime");
                int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_nextPaymentDatetime");
                int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paidGroupBillingStatus");
                int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_billingCyclePaymentStatus");
                int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remarkName");
                int i24 = columnIndexOrThrow14;
                int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneName");
                int i25 = columnIndexOrThrow13;
                int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "phoneRawNumber");
                int i26 = columnIndexOrThrow12;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (sQLiteStatementPrepare.step()) {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow20)) {
                        i = columnIndexOrThrow20;
                        text = null;
                    } else {
                        i = columnIndexOrThrow20;
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow21)) {
                        i2 = columnIndexOrThrow21;
                        text2 = null;
                    } else {
                        i2 = columnIndexOrThrow21;
                        text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow22)) {
                        i3 = columnIndexOrThrow22;
                        text3 = null;
                    } else {
                        i3 = columnIndexOrThrow22;
                        text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                    }
                    try {
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow) && sQLiteStatementPrepare.isNull(columnIndexOrThrow2) && sQLiteStatementPrepare.isNull(columnIndexOrThrow3) && sQLiteStatementPrepare.isNull(columnIndexOrThrow4) && sQLiteStatementPrepare.isNull(columnIndexOrThrow5) && sQLiteStatementPrepare.isNull(columnIndexOrThrow6) && sQLiteStatementPrepare.isNull(columnIndexOrThrow7) && sQLiteStatementPrepare.isNull(columnIndexOrThrow8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow9) && sQLiteStatementPrepare.isNull(columnIndexOrThrow10) && sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                            arrayList = arrayList2;
                            int i27 = i26;
                            if (sQLiteStatementPrepare.isNull(i27)) {
                                str4 = text;
                                int i28 = i25;
                                if (sQLiteStatementPrepare.isNull(i28)) {
                                    str2 = text3;
                                    int i29 = i24;
                                    if (sQLiteStatementPrepare.isNull(i29)) {
                                        str3 = text2;
                                        i7 = columnIndexOrThrow15;
                                        if (sQLiteStatementPrepare.isNull(i7)) {
                                            i5 = i29;
                                            i8 = columnIndexOrThrow16;
                                            if (sQLiteStatementPrepare.isNull(i8)) {
                                                i6 = i28;
                                                i11 = columnIndexOrThrow17;
                                                if (sQLiteStatementPrepare.isNull(i11)) {
                                                    i12 = i27;
                                                    i4 = columnIndexOrThrow18;
                                                    if (sQLiteStatementPrepare.isNull(i4)) {
                                                        i9 = columnIndexOrThrow11;
                                                        i10 = columnIndexOrThrow19;
                                                        if (sQLiteStatementPrepare.isNull(i10)) {
                                                            i15 = columnIndexOrThrow;
                                                            i17 = i11;
                                                            i16 = columnIndexOrThrow3;
                                                            i13 = columnIndexOrThrow4;
                                                            i18 = i7;
                                                            i20 = i12;
                                                            inHouseIMGroupMemberEntity = null;
                                                            i21 = i9;
                                                            i14 = columnIndexOrThrow2;
                                                            i19 = columnIndexOrThrow10;
                                                            java.lang.String str5 = str3;
                                                            int i30 = i21;
                                                            GroupMemberWithDetails groupMemberWithDetails = new GroupMemberWithDetails(inHouseIMGroupMemberEntity, str4, str5, str2);
                                                            java.util.ArrayList arrayList3 = arrayList;
                                                            arrayList3.add(groupMemberWithDetails);
                                                            columnIndexOrThrow2 = i14;
                                                            i26 = i20;
                                                            columnIndexOrThrow10 = i19;
                                                            columnIndexOrThrow15 = i18;
                                                            columnIndexOrThrow17 = i17;
                                                            columnIndexOrThrow21 = i2;
                                                            i25 = i6;
                                                            columnIndexOrThrow3 = i16;
                                                            columnIndexOrThrow = i15;
                                                            columnIndexOrThrow4 = i13;
                                                            columnIndexOrThrow19 = i10;
                                                            columnIndexOrThrow18 = i4;
                                                            columnIndexOrThrow16 = i8;
                                                            columnIndexOrThrow11 = i30;
                                                            columnIndexOrThrow22 = i3;
                                                            i24 = i5;
                                                            arrayList2 = arrayList3;
                                                            columnIndexOrThrow20 = i;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i6 = i28;
                                                i9 = columnIndexOrThrow11;
                                                i11 = columnIndexOrThrow17;
                                                i10 = columnIndexOrThrow19;
                                            }
                                        } else {
                                            i6 = i28;
                                            i9 = columnIndexOrThrow11;
                                            i5 = i29;
                                            i11 = columnIndexOrThrow17;
                                            i10 = columnIndexOrThrow19;
                                            i8 = columnIndexOrThrow16;
                                        }
                                        i12 = i27;
                                        i4 = columnIndexOrThrow18;
                                    } else {
                                        i6 = i28;
                                        i5 = i29;
                                        str3 = text2;
                                        i11 = columnIndexOrThrow17;
                                        i7 = columnIndexOrThrow15;
                                        i8 = columnIndexOrThrow16;
                                    }
                                    i9 = columnIndexOrThrow11;
                                    i12 = i27;
                                    i4 = columnIndexOrThrow18;
                                    i10 = columnIndexOrThrow19;
                                } else {
                                    i6 = i28;
                                    str2 = text3;
                                    i11 = columnIndexOrThrow17;
                                    i5 = i24;
                                    i8 = columnIndexOrThrow16;
                                    i12 = i27;
                                    str3 = text2;
                                    i4 = columnIndexOrThrow18;
                                    i7 = columnIndexOrThrow15;
                                }
                            } else {
                                str4 = text;
                                i11 = columnIndexOrThrow17;
                                i5 = i24;
                                i6 = i25;
                                i12 = i27;
                                str2 = text3;
                                str3 = text2;
                                i4 = columnIndexOrThrow18;
                                i7 = columnIndexOrThrow15;
                                i8 = columnIndexOrThrow16;
                            }
                            i9 = columnIndexOrThrow11;
                            i10 = columnIndexOrThrow19;
                        } else {
                            arrayList = arrayList2;
                            i4 = columnIndexOrThrow18;
                            i5 = i24;
                            i6 = i25;
                            str2 = text3;
                            str3 = text2;
                            i7 = columnIndexOrThrow15;
                            i8 = columnIndexOrThrow16;
                            i9 = columnIndexOrThrow11;
                            i10 = columnIndexOrThrow19;
                            int i31 = i26;
                            str4 = text;
                            i11 = columnIndexOrThrow17;
                            i12 = i31;
                        }
                        inHouseIMGroupMemberEntity.setOfficialTagInfo(c44279sJy.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i23) ? null : sQLiteStatementPrepare.getText(i23)));
                        inHouseIMGroupMemberEntity.setPaidGroupMemberStatus(paidGroupMemberStatus);
                        java.lang.String str52 = str3;
                        int i302 = i21;
                        GroupMemberWithDetails groupMemberWithDetails2 = new GroupMemberWithDetails(inHouseIMGroupMemberEntity, str4, str52, str2);
                        java.util.ArrayList arrayList32 = arrayList;
                        arrayList32.add(groupMemberWithDetails2);
                        columnIndexOrThrow2 = i14;
                        i26 = i20;
                        columnIndexOrThrow10 = i19;
                        columnIndexOrThrow15 = i18;
                        columnIndexOrThrow17 = i17;
                        columnIndexOrThrow21 = i2;
                        i25 = i6;
                        columnIndexOrThrow3 = i16;
                        columnIndexOrThrow = i15;
                        columnIndexOrThrow4 = i13;
                        columnIndexOrThrow19 = i10;
                        columnIndexOrThrow18 = i4;
                        columnIndexOrThrow16 = i8;
                        columnIndexOrThrow11 = i302;
                        columnIndexOrThrow22 = i3;
                        i24 = i5;
                        arrayList2 = arrayList32;
                        columnIndexOrThrow20 = i;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteStatementPrepare.close();
                        throw th;
                    }
                    if (sQLiteStatementPrepare.isNull(i7) && sQLiteStatementPrepare.isNull(i8) && sQLiteStatementPrepare.isNull(i11) && sQLiteStatementPrepare.isNull(i4) && sQLiteStatementPrepare.isNull(i10)) {
                        i17 = i11;
                        i22 = columnIndexOrThrow10;
                        i18 = i7;
                        paidGroupMemberStatus = null;
                        c44279sJy = this;
                    } else {
                        if (sQLiteStatementPrepare.isNull(i7)) {
                            i22 = columnIndexOrThrow10;
                            i18 = i7;
                            paymentRequiredStatusAEQbTJ = null;
                            c44279sJy = this;
                        } else {
                            i22 = columnIndexOrThrow10;
                            java.lang.String text7 = sQLiteStatementPrepare.getText(i7);
                            i18 = i7;
                            c44279sJy = this;
                            paymentRequiredStatusAEQbTJ = c44279sJy.AEQbTJ(text7);
                        }
                        paidGroupMemberStatus = new PaidGroupMemberStatus(paymentRequiredStatusAEQbTJ, sQLiteStatementPrepare.isNull(i8) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i8)), sQLiteStatementPrepare.isNull(i11) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i11)), sQLiteStatementPrepare.isNull(i4) ? null : c44279sJy.KWHzl(sQLiteStatementPrepare.getText(i4)), sQLiteStatementPrepare.isNull(i10) ? null : c44279sJy.OLrzqt(sQLiteStatementPrepare.getText(i10)));
                        i17 = i11;
                    }
                    inHouseIMGroupMemberEntity = new InHouseIMGroupMemberEntity();
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                        i15 = columnIndexOrThrow;
                        text4 = null;
                    } else {
                        i15 = columnIndexOrThrow;
                        text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    }
                    inHouseIMGroupMemberEntity.setMemberId(text4);
                    inHouseIMGroupMemberEntity.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                    inHouseIMGroupMemberEntity.setInviteId(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                    int i32 = columnIndexOrThrow2;
                    i16 = columnIndexOrThrow3;
                    inHouseIMGroupMemberEntity.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                    inHouseIMGroupMemberEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                    inHouseIMGroupMemberEntity.setNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                    inHouseIMGroupMemberEntity.setAvatar(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                    inHouseIMGroupMemberEntity.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                    inHouseIMGroupMemberEntity.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                    int i33 = i22;
                    i13 = columnIndexOrThrow4;
                    inHouseIMGroupMemberEntity.setUpdateTime(sQLiteStatementPrepare.getLong(i33));
                    i21 = i9;
                    inHouseIMGroupMemberEntity.setV1Field(sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                    i20 = i12;
                    if (sQLiteStatementPrepare.isNull(i20)) {
                        i14 = i32;
                        text5 = null;
                    } else {
                        i14 = i32;
                        text5 = sQLiteStatementPrepare.getText(i20);
                    }
                    inHouseIMGroupMemberEntity.setV2Field(text5);
                    int i34 = i6;
                    if (sQLiteStatementPrepare.isNull(i34)) {
                        i6 = i34;
                        text6 = null;
                    } else {
                        i6 = i34;
                        text6 = sQLiteStatementPrepare.getText(i34);
                    }
                    inHouseIMGroupMemberEntity.setV3Field(text6);
                    i23 = i5;
                    i5 = i23;
                    i19 = i33;
                }
                java.util.ArrayList arrayList4 = arrayList2;
                sQLiteStatementPrepare.close();
                return arrayList4;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object getGroupTopNMemberList(final java.lang.String str, final int i, Continuation<? super java.util.List<InHouseIMGroupMemberEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.sJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        PaymentRequiredStatus paymentRequiredStatusAEQbTJ;
        PaidGroupMemberStatus paidGroupMemberStatus;
        int i2;
        int i3;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        java.lang.String text3;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_member WHERE group_id = ? LIMIT ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "invite_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nick_name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "officialTagInfo");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paymentRequiredStatus");
            int i5 = columnIndexOrThrow13;
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_lastPaymentDatetime");
            int i6 = columnIndexOrThrow12;
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_nextPaymentDatetime");
            int i7 = columnIndexOrThrow11;
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paidGroupBillingStatus");
            int i8 = columnIndexOrThrow10;
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_billingCyclePaymentStatus");
            int i9 = columnIndexOrThrow9;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15) && sQLiteStatementPrepare.isNull(columnIndexOrThrow16) && sQLiteStatementPrepare.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare.isNull(columnIndexOrThrow18) && sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                    arrayList = arrayList2;
                    i2 = columnIndexOrThrow19;
                    paidGroupMemberStatus = null;
                } else {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = null;
                    } else {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                    }
                    paidGroupMemberStatus = new PaidGroupMemberStatus(paymentRequiredStatusAEQbTJ, sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow17)), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow18)), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow19)));
                    i2 = columnIndexOrThrow19;
                }
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = new InHouseIMGroupMemberEntity();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i3 = columnIndexOrThrow;
                    text = null;
                } else {
                    i3 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                inHouseIMGroupMemberEntity.setMemberId(text);
                inHouseIMGroupMemberEntity.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupMemberEntity.setInviteId(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                int i10 = columnIndexOrThrow2;
                int i11 = columnIndexOrThrow3;
                inHouseIMGroupMemberEntity.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupMemberEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupMemberEntity.setNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupMemberEntity.setAvatar(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                inHouseIMGroupMemberEntity.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                int i12 = i9;
                int i13 = columnIndexOrThrow4;
                inHouseIMGroupMemberEntity.setCreateTime(sQLiteStatementPrepare.getLong(i12));
                int i14 = i8;
                int i15 = columnIndexOrThrow5;
                inHouseIMGroupMemberEntity.setUpdateTime(sQLiteStatementPrepare.getLong(i14));
                int i16 = i7;
                inHouseIMGroupMemberEntity.setV1Field(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = i6;
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i4 = i10;
                    text2 = null;
                } else {
                    i4 = i10;
                    text2 = sQLiteStatementPrepare.getText(i17);
                }
                inHouseIMGroupMemberEntity.setV2Field(text2);
                int i18 = i5;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i5 = i18;
                    text3 = null;
                } else {
                    i5 = i18;
                    text3 = sQLiteStatementPrepare.getText(i18);
                }
                inHouseIMGroupMemberEntity.setV3Field(text3);
                int i19 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i19;
                inHouseIMGroupMemberEntity.setOfficialTagInfo(this.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i19) ? null : sQLiteStatementPrepare.getText(i19)));
                inHouseIMGroupMemberEntity.setPaidGroupMemberStatus(paidGroupMemberStatus);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(inHouseIMGroupMemberEntity);
                columnIndexOrThrow2 = i4;
                arrayList2 = arrayList3;
                i6 = i17;
                columnIndexOrThrow5 = i15;
                columnIndexOrThrow19 = i2;
                columnIndexOrThrow = i3;
                i8 = i14;
                columnIndexOrThrow3 = i11;
                i7 = i16;
                columnIndexOrThrow4 = i13;
                i9 = i12;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object getGroupMemberListByRole(final java.lang.String str, final int i, Continuation<? super java.util.List<InHouseIMGroupMemberEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.sJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.copydefault(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List copydefault(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        PaymentRequiredStatus paymentRequiredStatusAEQbTJ;
        PaidGroupMemberStatus paidGroupMemberStatus;
        int i2;
        int i3;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        java.lang.String text3;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_member WHERE group_id = ? AND role = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "invite_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nick_name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "officialTagInfo");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paymentRequiredStatus");
            int i5 = columnIndexOrThrow13;
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_lastPaymentDatetime");
            int i6 = columnIndexOrThrow12;
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_nextPaymentDatetime");
            int i7 = columnIndexOrThrow11;
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paidGroupBillingStatus");
            int i8 = columnIndexOrThrow10;
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_billingCyclePaymentStatus");
            int i9 = columnIndexOrThrow9;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15) && sQLiteStatementPrepare.isNull(columnIndexOrThrow16) && sQLiteStatementPrepare.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare.isNull(columnIndexOrThrow18) && sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                    arrayList = arrayList2;
                    i2 = columnIndexOrThrow19;
                    paidGroupMemberStatus = null;
                } else {
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15)) {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = null;
                    } else {
                        arrayList = arrayList2;
                        paymentRequiredStatusAEQbTJ = AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow15));
                    }
                    paidGroupMemberStatus = new PaidGroupMemberStatus(paymentRequiredStatusAEQbTJ, sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow17)), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow18)), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow19)));
                    i2 = columnIndexOrThrow19;
                }
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = new InHouseIMGroupMemberEntity();
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i3 = columnIndexOrThrow;
                    text = null;
                } else {
                    i3 = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                inHouseIMGroupMemberEntity.setMemberId(text);
                inHouseIMGroupMemberEntity.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupMemberEntity.setInviteId(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                int i10 = columnIndexOrThrow2;
                int i11 = columnIndexOrThrow3;
                inHouseIMGroupMemberEntity.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupMemberEntity.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupMemberEntity.setNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupMemberEntity.setAvatar(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                inHouseIMGroupMemberEntity.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                int i12 = i9;
                int i13 = columnIndexOrThrow4;
                inHouseIMGroupMemberEntity.setCreateTime(sQLiteStatementPrepare.getLong(i12));
                int i14 = i8;
                int i15 = columnIndexOrThrow5;
                inHouseIMGroupMemberEntity.setUpdateTime(sQLiteStatementPrepare.getLong(i14));
                int i16 = i7;
                inHouseIMGroupMemberEntity.setV1Field(sQLiteStatementPrepare.isNull(i16) ? null : sQLiteStatementPrepare.getText(i16));
                int i17 = i6;
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i4 = i10;
                    text2 = null;
                } else {
                    i4 = i10;
                    text2 = sQLiteStatementPrepare.getText(i17);
                }
                inHouseIMGroupMemberEntity.setV2Field(text2);
                int i18 = i5;
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i5 = i18;
                    text3 = null;
                } else {
                    i5 = i18;
                    text3 = sQLiteStatementPrepare.getText(i18);
                }
                inHouseIMGroupMemberEntity.setV3Field(text3);
                int i19 = columnIndexOrThrow14;
                columnIndexOrThrow14 = i19;
                inHouseIMGroupMemberEntity.setOfficialTagInfo(this.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(i19) ? null : sQLiteStatementPrepare.getText(i19)));
                inHouseIMGroupMemberEntity.setPaidGroupMemberStatus(paidGroupMemberStatus);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(inHouseIMGroupMemberEntity);
                columnIndexOrThrow2 = i4;
                arrayList2 = arrayList3;
                i6 = i17;
                columnIndexOrThrow5 = i15;
                columnIndexOrThrow19 = i2;
                columnIndexOrThrow = i3;
                i8 = i14;
                columnIndexOrThrow3 = i11;
                i7 = i16;
                columnIndexOrThrow4 = i13;
                i9 = i12;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public InHouseIMGroupMemberEntity getMemberInfoById(final java.lang.String str, final java.lang.String str2) {
        return (InHouseIMGroupMemberEntity) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.sJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ InHouseIMGroupMemberEntity EZpvd(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        PaidGroupMemberStatus paidGroupMemberStatus;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM group_member WHERE group_id = ? AND member_id = ? ");
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "invite_id");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "role");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nick_name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "member_avatar");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_time");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "update_time");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v1");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v2");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "v3");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "officialTagInfo");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paymentRequiredStatus");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_lastPaymentDatetime");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_nextPaymentDatetime");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_paidGroupBillingStatus");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidGroupMemberStatus_billingCyclePaymentStatus");
            InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = null;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow15) && sQLiteStatementPrepare.isNull(columnIndexOrThrow16) && sQLiteStatementPrepare.isNull(columnIndexOrThrow17) && sQLiteStatementPrepare.isNull(columnIndexOrThrow18) && sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                    paidGroupMemberStatus = null;
                } else {
                    paidGroupMemberStatus = new PaidGroupMemberStatus(sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : AEQbTJ(sQLiteStatementPrepare.getText(columnIndexOrThrow15)), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow16)), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow17)), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow18)), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : OLrzqt(sQLiteStatementPrepare.getText(columnIndexOrThrow19)));
                }
                InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity2 = new InHouseIMGroupMemberEntity();
                inHouseIMGroupMemberEntity2.setMemberId(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                inHouseIMGroupMemberEntity2.setGroupId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                inHouseIMGroupMemberEntity2.setInviteId(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                inHouseIMGroupMemberEntity2.setRole((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                inHouseIMGroupMemberEntity2.setName(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                inHouseIMGroupMemberEntity2.setNickName(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                inHouseIMGroupMemberEntity2.setAvatar(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                inHouseIMGroupMemberEntity2.setStatus((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                inHouseIMGroupMemberEntity2.setCreateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                inHouseIMGroupMemberEntity2.setUpdateTime(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                inHouseIMGroupMemberEntity2.setV1Field(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                inHouseIMGroupMemberEntity2.setV2Field(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                inHouseIMGroupMemberEntity2.setV3Field(sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13));
                inHouseIMGroupMemberEntity2.setOfficialTagInfo(this.copydefault.OLrzqt(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)));
                inHouseIMGroupMemberEntity2.setPaidGroupMemberStatus(paidGroupMemberStatus);
                inHouseIMGroupMemberEntity = inHouseIMGroupMemberEntity2;
            }
            return inHouseIMGroupMemberEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public void deleteGroupMemberList(final java.lang.String str) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.sJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44279sJy.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM group_member WHERE group_id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao
    public java.lang.Object deleteMemberById(final java.lang.String str, final java.lang.String str2, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44279sJy.KWHzl(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit KWHzl(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM group_member WHERE group_id = ? AND member_id = ? ");
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
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMGroupMemberDao.Application.copydefault(this);
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String copydefault(@androidx.annotation.NonNull PaymentRequiredStatus paymentRequiredStatus) {
        int i = AnonymousClass2.AEQbTJ[paymentRequiredStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "NOT_REQUIRED";
        }
        if (i == 3) {
            return "REQUIRED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + paymentRequiredStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String copydefault(@androidx.annotation.NonNull PaidGroupBillingStatus paidGroupBillingStatus) {
        int i = AnonymousClass2.OLrzqt[paidGroupBillingStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DISABLED";
        }
        if (i == 3) {
            return "ENABLED";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + paidGroupBillingStatus);
    }

    /* JADX INFO: renamed from: o.sJy$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[BillingCyclePaymentStatus.values().length];
            copydefault = iArr;
            try {
                iArr[BillingCyclePaymentStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[BillingCyclePaymentStatus.PAID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[BillingCyclePaymentStatus.OVERDUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[BillingCyclePaymentStatus.EXEMPTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                copydefault[BillingCyclePaymentStatus.DUE_SOON.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[PaidGroupBillingStatus.values().length];
            OLrzqt = iArr2;
            try {
                iArr2[PaidGroupBillingStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[PaidGroupBillingStatus.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                OLrzqt[PaidGroupBillingStatus.ENABLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[PaymentRequiredStatus.values().length];
            AEQbTJ = iArr3;
            try {
                iArr3[PaymentRequiredStatus.UNKNOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[PaymentRequiredStatus.NOT_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                AEQbTJ[PaymentRequiredStatus.REQUIRED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String OLrzqt(@androidx.annotation.NonNull BillingCyclePaymentStatus billingCyclePaymentStatus) {
        int i = AnonymousClass2.copydefault[billingCyclePaymentStatus.ordinal()];
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "PAID";
        }
        if (i == 3) {
            return "OVERDUE";
        }
        if (i == 4) {
            return "EXEMPTED";
        }
        if (i == 5) {
            return "DUE_SOON";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + billingCyclePaymentStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PaymentRequiredStatus AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1888946261) {
            if (iHashCode != 389487519) {
                b = (iHashCode == 433141802 && str.equals("UNKNOWN")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("REQUIRED")) {
                b = 1;
            }
        } else if (str.equals("NOT_REQUIRED")) {
            b = 0;
        }
        if (b == 0) {
            return PaymentRequiredStatus.NOT_REQUIRED;
        }
        if (b == 1) {
            return PaymentRequiredStatus.REQUIRED;
        }
        if (b == 2) {
            return PaymentRequiredStatus.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PaidGroupBillingStatus KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -891611359) {
            if (iHashCode != 433141802) {
                b = (iHashCode == 1053567612 && str.equals("DISABLED")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("UNKNOWN")) {
                b = 1;
            }
        } else if (str.equals("ENABLED")) {
            b = 0;
        }
        if (b == 0) {
            return PaidGroupBillingStatus.ENABLED;
        }
        if (b == 1) {
            return PaidGroupBillingStatus.UNKNOWN;
        }
        if (b == 2) {
            return PaidGroupBillingStatus.DISABLED;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BillingCyclePaymentStatus OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1553882938:
                b = !str.equals("DUE_SOON") ? (byte) -1 : (byte) 0;
                break;
            case -1460237122:
                if (str.equals("EXEMPTED")) {
                    b = 1;
                    break;
                }
                break;
            case -373312384:
                if (str.equals("OVERDUE")) {
                    b = 2;
                    break;
                }
                break;
            case 2448076:
                if (str.equals("PAID")) {
                    b = 3;
                    break;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    b = 4;
                    break;
                }
                break;
        }
        if (b == 0) {
            return BillingCyclePaymentStatus.DUE_SOON;
        }
        if (b == 1) {
            return BillingCyclePaymentStatus.EXEMPTED;
        }
        if (b == 2) {
            return BillingCyclePaymentStatus.OVERDUE;
        }
        if (b == 3) {
            return BillingCyclePaymentStatus.PAID;
        }
        if (b == 4) {
            return BillingCyclePaymentStatus.UNKNOWN;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }
}
