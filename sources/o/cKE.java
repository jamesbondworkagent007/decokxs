package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.wallet.dao.PasswordDao;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final class cKE implements PasswordDao {
    public final RoomDatabase KWHzl;
    public final EntityInsertAdapter<KVEntity> EZpvd = new EntityInsertAdapter<KVEntity>() { // from class: o.cKE.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `keyValues` (`_key`,`_value`) VALUES (?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull KVEntity kVEntity) {
            if (kVEntity.get_key() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, kVEntity.get_key());
            }
            if (kVEntity.get_value() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, kVEntity.get_value());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletEntity> copydefault = new EntityDeleteOrUpdateAdapter<WalletEntity>() { // from class: o.cKE.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `wallet` SET `id` = ?,`type` = ?,`data` = ?,`chainId` = ?,`language` = ?,`name` = ?,`modifiedName` = ?,`backup` = ?,`cloudBackup` = ?,`iHuaweiBackup` = ?,`main` = ?,`xpub` = ?,`xpriv` = ?,`isSegWit` = ?,`fromCreate` = ?,`createAt` = ?,`orderValue` = ?,`rootWalletId` = ?,`addressIndex` = ?,`syncStatus` = ?,`completedSyncOperation` = ?,`syncOperation` = ?,`eoaWalletType` = ?,`aaWalletStatus` = ?,`createVersion` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletEntity walletEntity) {
            if (walletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletEntity.getId());
            }
            sQLiteStatement.mo5793bindLong(2, walletEntity.getType());
            if (walletEntity.getData() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletEntity.getData());
            }
            sQLiteStatement.mo5793bindLong(4, walletEntity.getChainId());
            if (walletEntity.getLanguage() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletEntity.getLanguage());
            }
            if (walletEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletEntity.getName());
            }
            sQLiteStatement.mo5793bindLong(7, walletEntity.getModifiedName());
            sQLiteStatement.mo5793bindLong(8, walletEntity.getBackup());
            sQLiteStatement.mo5793bindLong(9, walletEntity.getCloudBackup());
            sQLiteStatement.mo5793bindLong(10, walletEntity.getIHuaweiBackup());
            sQLiteStatement.mo5793bindLong(11, walletEntity.getMain());
            if (walletEntity.getXpub() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, walletEntity.getXpub());
            }
            if (walletEntity.getXpriv() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, walletEntity.getXpriv());
            }
            sQLiteStatement.mo5793bindLong(14, walletEntity.isSegWit());
            sQLiteStatement.mo5793bindLong(15, walletEntity.getFromCreate());
            sQLiteStatement.mo5793bindLong(16, walletEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(17, walletEntity.getOrderValue());
            if (walletEntity.getRootWalletId() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5795bindText(18, walletEntity.getRootWalletId());
            }
            sQLiteStatement.mo5793bindLong(19, walletEntity.getAddressIndex());
            sQLiteStatement.mo5793bindLong(20, walletEntity.getSyncStatus());
            if (walletEntity.getCompletedSyncOperation() == null) {
                sQLiteStatement.mo5794bindNull(21);
            } else {
                sQLiteStatement.mo5795bindText(21, walletEntity.getCompletedSyncOperation());
            }
            if (walletEntity.getSyncOperation() == null) {
                sQLiteStatement.mo5794bindNull(22);
            } else {
                sQLiteStatement.mo5795bindText(22, walletEntity.getSyncOperation());
            }
            sQLiteStatement.mo5793bindLong(23, walletEntity.getEoaWalletType());
            sQLiteStatement.mo5793bindLong(24, walletEntity.getAaWalletStatus());
            if (walletEntity.getCreateVersion() == null) {
                sQLiteStatement.mo5794bindNull(25);
            } else {
                sQLiteStatement.mo5795bindText(25, walletEntity.getCreateVersion());
            }
            if (walletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(26);
            } else {
                sQLiteStatement.mo5795bindText(26, walletEntity.getId());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<MPCWalletEntity> AEQbTJ = new EntityDeleteOrUpdateAdapter<MPCWalletEntity>() { // from class: o.cKE.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `MPCInfo` SET `rootWalletId` = ?,`copiedEscapeListString` = ?,`mpcId` = ?,`uid` = ?,`status` = ?,`version` = ?,`accountName` = ?,`displayAccountName` = ?,`encryptShareKey` = ?,`ecdsaPubkey` = ?,`ecdsaChainCode` = ?,`ed25519Pubkey` = ?,`ed25519ChainCode` = ?,`isEscape` = ?,`mpcCreateAt` = ?,`createType` = ? WHERE `rootWalletId` = ? AND `uid` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull MPCWalletEntity mPCWalletEntity) {
            if (mPCWalletEntity.getRootWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, mPCWalletEntity.getRootWalletId());
            }
            if (mPCWalletEntity.getCopiedEscapeListString() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, mPCWalletEntity.getCopiedEscapeListString());
            }
            if (mPCWalletEntity.getMpcId() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, mPCWalletEntity.getMpcId());
            }
            if (mPCWalletEntity.getUid() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, mPCWalletEntity.getUid());
            }
            sQLiteStatement.mo5793bindLong(5, mPCWalletEntity.getStatus());
            if (mPCWalletEntity.getVersion() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, mPCWalletEntity.getVersion());
            }
            if (mPCWalletEntity.getAccountName() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, mPCWalletEntity.getAccountName());
            }
            if (mPCWalletEntity.getDisplayAccountName() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, mPCWalletEntity.getDisplayAccountName());
            }
            if (mPCWalletEntity.getEncryptShareKey() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, mPCWalletEntity.getEncryptShareKey());
            }
            if (mPCWalletEntity.getEcdsaPubkey() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, mPCWalletEntity.getEcdsaPubkey());
            }
            if (mPCWalletEntity.getEcdsaChainCode() == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, mPCWalletEntity.getEcdsaChainCode());
            }
            if (mPCWalletEntity.getEd25519Pubkey() == null) {
                sQLiteStatement.mo5794bindNull(12);
            } else {
                sQLiteStatement.mo5795bindText(12, mPCWalletEntity.getEd25519Pubkey());
            }
            if (mPCWalletEntity.getEd25519ChainCode() == null) {
                sQLiteStatement.mo5794bindNull(13);
            } else {
                sQLiteStatement.mo5795bindText(13, mPCWalletEntity.getEd25519ChainCode());
            }
            sQLiteStatement.mo5793bindLong(14, mPCWalletEntity.isEscape());
            sQLiteStatement.mo5793bindLong(15, mPCWalletEntity.getMpcCreateAt());
            sQLiteStatement.mo5793bindLong(16, mPCWalletEntity.getCreateType());
            if (mPCWalletEntity.getRootWalletId() == null) {
                sQLiteStatement.mo5794bindNull(17);
            } else {
                sQLiteStatement.mo5795bindText(17, mPCWalletEntity.getRootWalletId());
            }
            if (mPCWalletEntity.getUid() == null) {
                sQLiteStatement.mo5794bindNull(18);
            } else {
                sQLiteStatement.mo5795bindText(18, mPCWalletEntity.getUid());
            }
        }
    };

    public cKE(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public long AEQbTJ(final KVEntity kVEntity) {
        kVEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(kVEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(KVEntity kVEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.EZpvd.insertAndReturnId(sQLiteConnection, kVEntity));
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public int KWHzl(final WalletEntity walletEntity) {
        walletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer copydefault(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.copydefault.handle(sQLiteConnection, walletEntity));
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public int OLrzqt(final MPCWalletEntity mPCWalletEntity) {
        mPCWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(mPCWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer AEQbTJ(MPCWalletEntity mPCWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AEQbTJ.handle(sQLiteConnection, mPCWalletEntity));
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public void OLrzqt(final java.lang.String str, final boolean z) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(str, z, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(java.lang.String str, boolean z, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        PasswordDao.Activity.EZpvd(this, str, z);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public void EZpvd(final java.lang.String str, final java.lang.String str2, final boolean z) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(str, str2, z, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit EZpvd(java.lang.String str, java.lang.String str2, boolean z, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        PasswordDao.Activity.KWHzl(this, str, str2, z);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public void KWHzl() {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit OLrzqt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        PasswordDao.Activity.EZpvd(this);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public void AYXKKw(final java.lang.String str) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.valueOf(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit valueOf(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        PasswordDao.Activity.OLrzqt(this, str);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public void OLrzqt(final java.lang.String str) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        PasswordDao.Activity.EZpvd(this, str);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.util.List<KVEntity> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.cKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKE.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM keyValues WHERE _key = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_key");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_value");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                }
                arrayList.add(new KVEntity(text2, text));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.util.List<WalletEntity> OLrzqt() {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.cKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKE.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        int i6;
        java.lang.String text4;
        int i7;
        int i8;
        java.lang.String text5;
        int i9;
        int i10;
        int i11;
        java.lang.String text6;
        int i12;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "modifiedName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "backup");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "cloudBackup");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "iHuaweiBackup");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "main");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpub");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i = columnIndexOrThrow14;
                }
                int i13 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i15 = columnIndexOrThrow4;
                int i16 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i17 = columnIndexOrThrow5;
                int i18 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i19 = columnIndexOrThrow6;
                int i20 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i21 = columnIndexOrThrow7;
                int i22 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i4 = columnIndexOrThrow9;
                    i5 = i;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i4 = columnIndexOrThrow9;
                    i5 = i;
                }
                int i23 = columnIndexOrThrow8;
                int i24 = (int) sQLiteStatementPrepare.getLong(i5);
                int i25 = columnIndexOrThrow15;
                int i26 = columnIndexOrThrow10;
                int i27 = columnIndexOrThrow11;
                int i28 = (int) sQLiteStatementPrepare.getLong(i25);
                int i29 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i29);
                int i30 = columnIndexOrThrow;
                int i31 = columnIndexOrThrow17;
                int i32 = columnIndexOrThrow12;
                int i33 = (int) sQLiteStatementPrepare.getLong(i31);
                int i34 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i34)) {
                    i7 = i31;
                    i6 = i34;
                    i8 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    i6 = i34;
                    text4 = sQLiteStatementPrepare.getText(i34);
                    i7 = i31;
                    i8 = columnIndexOrThrow19;
                }
                int i35 = columnIndexOrThrow13;
                int i36 = (int) sQLiteStatementPrepare.getLong(i8);
                int i37 = columnIndexOrThrow20;
                int i38 = (int) sQLiteStatementPrepare.getLong(i37);
                int i39 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i39)) {
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i39);
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = i39;
                    i12 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i11 = i39;
                    text6 = sQLiteStatementPrepare.getText(i10);
                    columnIndexOrThrow22 = i10;
                    i12 = columnIndexOrThrow23;
                }
                int i40 = columnIndexOrThrow24;
                int i41 = columnIndexOrThrow25;
                int i42 = i12;
                WalletEntity walletEntity = new WalletEntity(text, i13, text7, j, text8, text2, i14, i16, i18, i20, i22, text9, text3, i24, i28, j2, i33, text4, i36, i38, text5, text6, (int) sQLiteStatementPrepare.getLong(i12), (int) sQLiteStatementPrepare.getLong(i40), sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i26;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i25;
                columnIndexOrThrow24 = i40;
                columnIndexOrThrow = i30;
                columnIndexOrThrow13 = i35;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow20 = i37;
                columnIndexOrThrow23 = i42;
                columnIndexOrThrow8 = i23;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i15;
                columnIndexOrThrow5 = i17;
                columnIndexOrThrow6 = i19;
                columnIndexOrThrow7 = i21;
                columnIndexOrThrow9 = i4;
                columnIndexOrThrow11 = i27;
                columnIndexOrThrow16 = i29;
                columnIndexOrThrow21 = i11;
                columnIndexOrThrow25 = i41;
                columnIndexOrThrow12 = i32;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i6;
                int i43 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i43;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.util.List<MPCWalletEntity> EZpvd() {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.cKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKE.AEQbTJ((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MPCInfo");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow2;
                    i = columnIndexOrThrow3;
                    text = null;
                } else {
                    i = columnIndexOrThrow3;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    i2 = columnIndexOrThrow2;
                }
                int i3 = columnIndexOrThrow4;
                int i4 = columnIndexOrThrow15;
                int i5 = columnIndexOrThrow;
                int i6 = columnIndexOrThrow16;
                int i7 = columnIndexOrThrow5;
                arrayList.add(new MPCWalletEntity(text2, text3, text4, text, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14), sQLiteStatementPrepare.getLong(i4), (int) sQLiteStatementPrepare.getLong(i6)));
                columnIndexOrThrow5 = i7;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow3 = i;
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow = i5;
                columnIndexOrThrow15 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public int EZpvd(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.cKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cKE.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM keyValues WHERE _key = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
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

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public boolean KWHzl(java.lang.String str) {
        return PasswordDao.Activity.KWHzl(this, str);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.lang.String AEQbTJ() {
        return PasswordDao.Activity.AkhnZx(this);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.lang.String copydefault(java.lang.String str) {
        return PasswordDao.Activity.AEQbTJ(this, str);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public boolean AYXKKw() {
        return PasswordDao.Activity.fIwbmz(this);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public boolean djBIcL() {
        return PasswordDao.Activity.AuCTel(this);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public java.lang.String copydefault() {
        return PasswordDao.Activity.KWHzl(this);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public long gEmmrt(java.lang.String str) {
        return PasswordDao.Activity.valueOf(this, str);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public int AhwBna() {
        return PasswordDao.Activity.iwGUEr(this);
    }

    @Override // com.okinc.business.defi.biz.database.wallet.dao.PasswordDao
    public boolean gEmmrt() {
        return PasswordDao.Activity.fARcdN(this);
    }

    public static java.util.List<java.lang.Class<?>> valueOf() {
        return Collections.emptyList();
    }
}
