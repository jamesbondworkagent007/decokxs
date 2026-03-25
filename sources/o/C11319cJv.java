package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11321cJx;

/* JADX INFO: renamed from: o.cJv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11319cJv implements InterfaceC11321cJx {
    public final RoomDatabase AEQbTJ;
    public final EntityInsertAdapter<CustomChainTransactionEntity> OLrzqt = new EntityInsertAdapter<CustomChainTransactionEntity>() { // from class: o.cJv.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_transaction` (`wallet_id`,`coin_id`,`tx_hash`,`tx_id`,`origin_tx_hash`,`sub_tx_hashes`,`chain_id`,`tx_type`,`repeat_tx_type`,`tx_status`,`from`,`to`,`nonce`,`gas_price`,`gas_limit`,`coin_amount`,`input_data`,`raw_tx`,`fail_reason`,`create_at`,`confirm_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainTransactionEntity customChainTransactionEntity) {
            if (customChainTransactionEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, customChainTransactionEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, customChainTransactionEntity.getCoinId());
            if (customChainTransactionEntity.getTxHash() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, customChainTransactionEntity.getTxHash());
            }
            if (customChainTransactionEntity.getTxId() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainTransactionEntity.getTxId());
            }
            if (customChainTransactionEntity.getOriginTxHash() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, customChainTransactionEntity.getOriginTxHash());
            }
            if (customChainTransactionEntity.getSubTxHashes() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, customChainTransactionEntity.getSubTxHashes());
            }
            sQLiteStatement.mo5793bindLong(7, customChainTransactionEntity.getChainId());
            sQLiteStatement.mo5793bindLong(8, customChainTransactionEntity.getTxType());
            sQLiteStatement.mo5793bindLong(9, customChainTransactionEntity.getRepeatTxType());
            sQLiteStatement.mo5793bindLong(10, customChainTransactionEntity.getTxStatus());
            if (customChainTransactionEntity.getFromAddress() == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, customChainTransactionEntity.getFromAddress());
            }
            if (customChainTransactionEntity.getToAddress() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, customChainTransactionEntity.getToAddress());
            }
            sQLiteStatement.mo5793bindLong(13, customChainTransactionEntity.getNonce());
            if (customChainTransactionEntity.getGasPrice() == null) {
                sQLiteStatement.mo5794bindNull(14);
            } else {
                sQLiteStatement.mo5795bindText(14, customChainTransactionEntity.getGasPrice());
            }
            if (customChainTransactionEntity.getGasLimit() == null) {
                sQLiteStatement.mo5794bindNull(15);
            } else {
                sQLiteStatement.mo5795bindText(15, customChainTransactionEntity.getGasLimit());
            }
            if (customChainTransactionEntity.getCoinAmount() == null) {
                sQLiteStatement.mo5794bindNull(16);
            } else {
                sQLiteStatement.mo5795bindText(16, customChainTransactionEntity.getCoinAmount());
            }
            if (customChainTransactionEntity.getInputData() == null) {
                sQLiteStatement.mo5794bindNull(17);
            } else {
                sQLiteStatement.mo5795bindText(17, customChainTransactionEntity.getInputData());
            }
            if (customChainTransactionEntity.getRawTx() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5795bindText(18, customChainTransactionEntity.getRawTx());
            }
            if (customChainTransactionEntity.getFailReason() == null) {
                sQLiteStatement.mo5794bindNull(19);
            } else {
                sQLiteStatement.mo5795bindText(19, customChainTransactionEntity.getFailReason());
            }
            sQLiteStatement.mo5793bindLong(20, customChainTransactionEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(21, customChainTransactionEntity.getConfirmAt());
        }
    };

    public C11319cJv(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // o.InterfaceC11321cJx
    public long EZpvd(final CustomChainTransactionEntity customChainTransactionEntity) {
        customChainTransactionEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(customChainTransactionEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(CustomChainTransactionEntity customChainTransactionEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.OLrzqt.insertAndReturnId(sQLiteConnection, customChainTransactionEntity));
    }

    @Override // o.InterfaceC11321cJx
    public void copydefault(final CustomChainTransactionEntity customChainTransactionEntity, final java.lang.String str) {
        DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(customChainTransactionEntity, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit KWHzl(CustomChainTransactionEntity customChainTransactionEntity, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        InterfaceC11321cJx.ActionBar.copydefault(this, customChainTransactionEntity, str);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<CustomChainTransactionEntity> OLrzqt(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String str2;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM custom_chain_transaction WHERE tx_hash = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_hash");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin_tx_hash");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sub_tx_hashes");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repeat_tx_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nonce");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_price");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_limit");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_amount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_data");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw_tx");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fail_reason");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "confirm_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i6 = columnIndexOrThrow2;
                int i7 = columnIndexOrThrow3;
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i9 = columnIndexOrThrow4;
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i11 = columnIndexOrThrow5;
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text2 = sQLiteStatementPrepare.getText(i);
                }
                int i13 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow16 = i13;
                    i3 = columnIndexOrThrow17;
                    str2 = null;
                } else {
                    java.lang.String text12 = sQLiteStatementPrepare.getText(i13);
                    columnIndexOrThrow16 = i13;
                    i3 = columnIndexOrThrow17;
                    str2 = text12;
                }
                if (sQLiteStatementPrepare.isNull(i3)) {
                    columnIndexOrThrow17 = i3;
                    i4 = columnIndexOrThrow18;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(i3);
                    columnIndexOrThrow17 = i3;
                    i4 = columnIndexOrThrow18;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    columnIndexOrThrow18 = i4;
                    i5 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i4);
                    columnIndexOrThrow18 = i4;
                    i5 = columnIndexOrThrow19;
                }
                java.lang.String text13 = sQLiteStatementPrepare.isNull(i5) ? null : sQLiteStatementPrepare.getText(i5);
                columnIndexOrThrow19 = i5;
                int i14 = columnIndexOrThrow20;
                java.lang.String str3 = text13;
                long j4 = sQLiteStatementPrepare.getLong(i14);
                columnIndexOrThrow20 = i14;
                int i15 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i15;
                arrayList.add(new CustomChainTransactionEntity(text5, j, text6, text7, text8, text9, j2, i8, i10, i12, text10, text11, j3, text, text2, str2, text3, text4, str3, j4, sQLiteStatementPrepare.getLong(i15)));
                columnIndexOrThrow = i2;
                columnIndexOrThrow15 = i;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow3 = i7;
                columnIndexOrThrow4 = i9;
                columnIndexOrThrow5 = i11;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<CustomChainTransactionEntity> AEQbTJ(final java.lang.String str, final java.util.List<java.lang.Integer> list, final int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM custom_chain_transaction WHERE tx_id = ");
        sb.append("?");
        sb.append(" AND (sub_tx_hashes = '' AND tx_status = ");
        sb.append("?");
        sb.append(" OR tx_status IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append("))");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.copydefault(string, str, i, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, java.lang.String str2, int i, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        java.lang.String text3;
        java.lang.String text4;
        java.lang.String text5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            java.util.Iterator it = list.iterator();
            int i4 = 3;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i4);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i4, r3.intValue());
                }
                i4++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_hash");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin_tx_hash");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sub_tx_hashes");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repeat_tx_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nonce");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_price");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_limit");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_amount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_data");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw_tx");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fail_reason");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "confirm_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i8 = columnIndexOrThrow4;
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i10 = columnIndexOrThrow5;
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i2 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i2 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i2)) {
                    i3 = columnIndexOrThrow;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow;
                    text2 = sQLiteStatementPrepare.getText(i2);
                }
                int i12 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i12)) {
                    columnIndexOrThrow16 = i12;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i12;
                    text3 = sQLiteStatementPrepare.getText(i12);
                }
                int i13 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow17 = i13;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i13;
                    text4 = sQLiteStatementPrepare.getText(i13);
                }
                int i14 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow18 = i14;
                    text5 = null;
                } else {
                    columnIndexOrThrow18 = i14;
                    text5 = sQLiteStatementPrepare.getText(i14);
                }
                int i15 = columnIndexOrThrow19;
                java.lang.String text13 = sQLiteStatementPrepare.isNull(i15) ? null : sQLiteStatementPrepare.getText(i15);
                columnIndexOrThrow19 = i15;
                int i16 = columnIndexOrThrow20;
                java.lang.String str3 = text13;
                long j4 = sQLiteStatementPrepare.getLong(i16);
                columnIndexOrThrow20 = i16;
                int i17 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i17;
                arrayList.add(new CustomChainTransactionEntity(text6, j, text7, text8, text9, text10, j2, i7, i9, i11, text11, text12, j3, text, text2, text3, text4, text5, str3, j4, sQLiteStatementPrepare.getLong(i17)));
                columnIndexOrThrow = i3;
                columnIndexOrThrow15 = i2;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow3 = i6;
                columnIndexOrThrow4 = i8;
                columnIndexOrThrow5 = i10;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<CustomChainTransactionEntity> OLrzqt(final java.lang.String str, final long j, final int i, final int i2, final java.util.List<java.lang.Integer> list, final int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM custom_chain_transaction WHERE wallet_id = ");
        sb.append("?");
        sb.append(" AND coin_id = ");
        sb.append("?");
        sb.append(" AND (sub_tx_hashes = '' AND tx_status = ");
        sb.append("?");
        sb.append(" OR tx_status IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(")) ORDER BY create_at DESC LIMIT ");
        sb.append("?");
        sb.append(" OFFSET ");
        sb.append("?");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.copydefault(string, str, j, i3, list, size, i, i2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, java.lang.String str2, long j, int i, java.util.List list, int i2, int i3, int i4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i5;
        int i6;
        java.lang.String text2;
        java.lang.String text3;
        java.lang.String text4;
        java.lang.String text5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            java.util.Iterator it = list.iterator();
            int i7 = 4;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i7);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i7, r3.intValue());
                }
                i7++;
            }
            sQLiteStatementPrepare.mo5793bindLong(i2 + 4, i3);
            sQLiteStatementPrepare.mo5793bindLong(i2 + 5, i4);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_hash");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin_tx_hash");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sub_tx_hashes");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repeat_tx_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nonce");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_price");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_limit");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_amount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_data");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw_tx");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fail_reason");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "confirm_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i8 = columnIndexOrThrow2;
                int i9 = columnIndexOrThrow3;
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i11 = columnIndexOrThrow4;
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i13 = columnIndexOrThrow5;
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i5 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow;
                    text2 = null;
                } else {
                    i6 = columnIndexOrThrow;
                    text2 = sQLiteStatementPrepare.getText(i5);
                }
                int i15 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow16 = i15;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i15;
                    text3 = sQLiteStatementPrepare.getText(i15);
                }
                int i16 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow17 = i16;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i16;
                    text4 = sQLiteStatementPrepare.getText(i16);
                }
                int i17 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow18 = i17;
                    text5 = null;
                } else {
                    columnIndexOrThrow18 = i17;
                    text5 = sQLiteStatementPrepare.getText(i17);
                }
                int i18 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i18;
                java.lang.String text13 = sQLiteStatementPrepare.isNull(i18) ? null : sQLiteStatementPrepare.getText(i18);
                int i19 = columnIndexOrThrow20;
                long j5 = sQLiteStatementPrepare.getLong(i19);
                columnIndexOrThrow20 = i19;
                int i20 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i20;
                arrayList.add(new CustomChainTransactionEntity(text6, j2, text7, text8, text9, text10, j3, i10, i12, i14, text11, text12, j4, text, text2, text3, text4, text5, text13, j5, sQLiteStatementPrepare.getLong(i20)));
                columnIndexOrThrow = i6;
                columnIndexOrThrow2 = i8;
                columnIndexOrThrow3 = i9;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow15 = i5;
                columnIndexOrThrow5 = i13;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<CustomChainTransactionEntity> OLrzqt(final java.lang.String str, final long j, final long j2, final java.util.List<java.lang.Integer> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM custom_chain_transaction WHERE wallet_id = ");
        sb.append("?");
        sb.append(" AND chain_id = ");
        sb.append("?");
        sb.append(" AND nonce < ");
        sb.append("?");
        sb.append(" AND tx_status IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") ORDER BY create_at DESC");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.OLrzqt(string, str, j, j2, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(java.lang.String str, java.lang.String str2, long j, long j2, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        java.lang.String text3;
        java.lang.String text4;
        java.lang.String text5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, j2);
            java.util.Iterator it = list.iterator();
            int i3 = 4;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i3);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i3, r3.intValue());
                }
                i3++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_hash");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin_tx_hash");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sub_tx_hashes");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repeat_tx_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nonce");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_price");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_limit");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_amount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_data");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw_tx");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fail_reason");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "confirm_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i4 = columnIndexOrThrow2;
                int i5 = columnIndexOrThrow3;
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i7 = columnIndexOrThrow4;
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i9 = columnIndexOrThrow5;
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text2 = sQLiteStatementPrepare.getText(i);
                }
                int i11 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow16 = i11;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i11;
                    text3 = sQLiteStatementPrepare.getText(i11);
                }
                int i12 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i12)) {
                    columnIndexOrThrow17 = i12;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i12;
                    text4 = sQLiteStatementPrepare.getText(i12);
                }
                int i13 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow18 = i13;
                    text5 = null;
                } else {
                    columnIndexOrThrow18 = i13;
                    text5 = sQLiteStatementPrepare.getText(i13);
                }
                int i14 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i14;
                java.lang.String text13 = sQLiteStatementPrepare.isNull(i14) ? null : sQLiteStatementPrepare.getText(i14);
                int i15 = columnIndexOrThrow20;
                long j6 = sQLiteStatementPrepare.getLong(i15);
                columnIndexOrThrow20 = i15;
                int i16 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i16;
                arrayList.add(new CustomChainTransactionEntity(text6, j3, text7, text8, text9, text10, j4, i6, i8, i10, text11, text12, j5, text, text2, text3, text4, text5, text13, j6, sQLiteStatementPrepare.getLong(i16)));
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow15 = i;
                columnIndexOrThrow3 = i5;
                columnIndexOrThrow4 = i7;
                columnIndexOrThrow5 = i9;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<CustomChainTransactionEntity> AEQbTJ(final java.lang.String str, final long j, final long j2) {
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.copydefault(str, j, j2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, long j, long j2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        java.lang.String text3;
        java.lang.String text4;
        java.lang.String text5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM custom_chain_transaction WHERE wallet_id = ? AND chain_id = ? AND nonce = ? ORDER BY create_at DESC");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.mo5793bindLong(3, j2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "wallet_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_id");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_hash");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "origin_tx_hash");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sub_tx_hashes");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chain_id");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_type");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repeat_tx_type");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tx_status");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nonce");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_price");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gas_limit");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coin_amount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "input_data");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "raw_tx");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fail_reason");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "create_at");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "confirm_at");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i3 = columnIndexOrThrow2;
                int i4 = columnIndexOrThrow3;
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i6 = columnIndexOrThrow4;
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i8 = columnIndexOrThrow5;
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                long j5 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i)) {
                    i2 = columnIndexOrThrow;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow;
                    text2 = sQLiteStatementPrepare.getText(i);
                }
                int i10 = columnIndexOrThrow16;
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow16 = i10;
                    text3 = null;
                } else {
                    columnIndexOrThrow16 = i10;
                    text3 = sQLiteStatementPrepare.getText(i10);
                }
                int i11 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow17 = i11;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i11;
                    text4 = sQLiteStatementPrepare.getText(i11);
                }
                int i12 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i12)) {
                    columnIndexOrThrow18 = i12;
                    text5 = null;
                } else {
                    columnIndexOrThrow18 = i12;
                    text5 = sQLiteStatementPrepare.getText(i12);
                }
                int i13 = columnIndexOrThrow19;
                columnIndexOrThrow19 = i13;
                java.lang.String text13 = sQLiteStatementPrepare.isNull(i13) ? null : sQLiteStatementPrepare.getText(i13);
                int i14 = columnIndexOrThrow20;
                long j6 = sQLiteStatementPrepare.getLong(i14);
                columnIndexOrThrow20 = i14;
                int i15 = columnIndexOrThrow21;
                columnIndexOrThrow21 = i15;
                arrayList.add(new CustomChainTransactionEntity(text6, j3, text7, text8, text9, text10, j4, i5, i7, i9, text11, text12, j5, text, text2, text3, text4, text5, text13, j6, sQLiteStatementPrepare.getLong(i15)));
                columnIndexOrThrow = i2;
                columnIndexOrThrow15 = i;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i4;
                columnIndexOrThrow4 = i6;
                columnIndexOrThrow5 = i8;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public java.util.List<java.lang.Long> OLrzqt(final long j, final java.lang.String str, final int i) {
        return (java.util.List) DBUtil.performBlocking(this.AEQbTJ, true, false, new Function1() { // from class: o.cJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.AEQbTJ(j, str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(long j, java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT nonce FROM custom_chain_transaction WHERE chain_id = ? AND `from` = ? AND tx_status = ? ORDER BY nonce ASC");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.isNull(0) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(0)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11321cJx
    public int OLrzqt(final java.lang.String str, final long j, final java.lang.String str2, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.OLrzqt(j, str2, i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(long j, java.lang.String str, int i, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_transaction SET confirm_at = ?, gas_limit = ?, tx_status = ? WHERE tx_hash = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(4);
            } else {
                sQLiteStatementPrepare.mo5795bindText(4, str2);
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

    @Override // o.InterfaceC11321cJx
    public int EZpvd(final java.lang.String str, final java.lang.String str2, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.copydefault(str2, i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(java.lang.String str, int i, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_transaction SET gas_limit = ?, tx_status = ? WHERE tx_hash = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str2);
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

    @Override // o.InterfaceC11321cJx
    public int copydefault(final java.lang.String str, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.EZpvd(i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer EZpvd(int i, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_transaction SET tx_status = ? WHERE tx_hash = ?");
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

    @Override // o.InterfaceC11321cJx
    public int KWHzl(final java.lang.String str, final java.lang.String str2) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.EZpvd(str2, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer EZpvd(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE custom_chain_transaction SET sub_tx_hashes = ? WHERE tx_hash = ?");
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

    @Override // o.InterfaceC11321cJx
    public int copydefault(final java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM custom_chain_transaction WHERE tx_hash IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return ((java.lang.Integer) DBUtil.performBlocking(this.AEQbTJ, false, true, new Function1() { // from class: o.cJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11319cJv.copydefault(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i = 1;
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

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
