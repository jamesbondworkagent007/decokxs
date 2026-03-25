package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.cNP;

/* JADX INFO: loaded from: classes14.dex */
public final class cNL implements cNP {
    public static int EZpvd;
    public static int djBIcL;
    public final RoomDatabase OLrzqt;
    public final EntityDeleteOrUpdateAdapter<RootWalletEntity> copydefault = new EntityDeleteOrUpdateAdapter<RootWalletEntity>() { // from class: o.cNL.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `root_wallet` WHERE `rootId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull RootWalletEntity rootWalletEntity) {
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, rootWalletEntity.getRootId());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletEntity> KWHzl = new EntityDeleteOrUpdateAdapter<WalletEntity>() { // from class: o.cNL.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `wallet` WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletEntity walletEntity) {
            if (walletEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletEntity.getId());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletEntity> AEQbTJ = new EntityDeleteOrUpdateAdapter<WalletEntity>() { // from class: o.cNL.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `wallet` SET `id` = ?,`type` = ?,`data` = ?,`chainId` = ?,`language` = ?,`name` = ?,`modifiedName` = ?,`backup` = ?,`cloudBackup` = ?,`iHuaweiBackup` = ?,`main` = ?,`xpub` = ?,`xpriv` = ?,`isSegWit` = ?,`fromCreate` = ?,`createAt` = ?,`orderValue` = ?,`rootWalletId` = ?,`addressIndex` = ?,`syncStatus` = ?,`completedSyncOperation` = ?,`syncOperation` = ?,`eoaWalletType` = ?,`aaWalletStatus` = ?,`createVersion` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
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

    public cNL(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.OLrzqt = roomDatabase;
    }

    @Override // o.cNP
    public int EZpvd(final RootWalletEntity rootWalletEntity) {
        rootWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(rootWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer AEQbTJ(RootWalletEntity rootWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.copydefault.handle(sQLiteConnection, rootWalletEntity));
    }

    @Override // o.cNP
    public int copydefault(final WalletEntity walletEntity) {
        walletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.KWHzl.handle(sQLiteConnection, walletEntity));
    }

    @Override // o.cNP
    public void AEQbTJ(final WalletEntity walletEntity) {
        walletEntity.getClass();
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object EZpvd(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.handle(sQLiteConnection, walletEntity);
        return null;
    }

    @Override // o.cNP
    public void OLrzqt(final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.djBIcL(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit djBIcL(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cNP.Application.OLrzqt(this, str);
        return Unit.INSTANCE;
    }

    @Override // o.cNP
    public void EZpvd(final java.lang.String str) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AhwBna(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit AhwBna(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cNP.Application.AEQbTJ(this, str);
        return Unit.INSTANCE;
    }

    @Override // o.cNP
    public void EZpvd(final java.util.List<java.lang.String> list) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cNP.Application.AEQbTJ(this, (java.util.List<java.lang.String>) list);
        return Unit.INSTANCE;
    }

    @Override // o.cNP
    public void copydefault(final java.util.List<java.lang.String> list) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cNS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cNP.Application.KWHzl(this, list);
        return Unit.INSTANCE;
    }

    @Override // o.cNP
    public RootWalletEntity AEQbTJ(final java.lang.String str) {
        return (RootWalletEntity) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cNL.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ RootWalletEntity EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM root_wallet WHERE rootId =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            RootWalletEntity rootWalletEntity = null;
            if (sQLiteStatementPrepare.step()) {
                rootWalletEntity = new RootWalletEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
            }
            return rootWalletEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cNP
    public java.util.List<RootWalletEntity> OLrzqt() {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cNL.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM root_wallet ORDER BY sortIndex");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new RootWalletEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cNP
    public WalletEntity copydefault(final java.lang.String str) {
        return (WalletEntity) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cNL.gEmmrt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ WalletEntity gEmmrt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE id =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
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
            WalletEntity walletEntity = null;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow14;
                    i2 = columnIndexOrThrow25;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i = columnIndexOrThrow14;
                    i2 = columnIndexOrThrow25;
                }
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                int i7 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i8 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i9 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i10 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i11 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                int i12 = (int) sQLiteStatementPrepare.getLong(i);
                int i13 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow16);
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow18)) {
                    i3 = columnIndexOrThrow19;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                    i3 = columnIndexOrThrow19;
                }
                int i15 = (int) sQLiteStatementPrepare.getLong(i3);
                int i16 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow21)) {
                    i4 = columnIndexOrThrow22;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                    i4 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow23;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow23;
                }
                int i17 = i2;
                walletEntity = new WalletEntity(text, i6, text5, j, text6, text7, i7, i8, i9, i10, i11, text8, text9, i12, i13, j2, i14, text2, i15, i16, text3, text4, (int) sQLiteStatementPrepare.getLong(i5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow24), sQLiteStatementPrepare.isNull(i17) ? null : sQLiteStatementPrepare.getText(i17));
            }
            return walletEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cNP
    public java.util.List<WalletEntity> KWHzl(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, true, false, new Function1() { // from class: o.cNM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cNL.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE rootWalletId = ? ORDER BY orderValue");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
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
                columnIndexOrThrow = i30;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i25;
                columnIndexOrThrow24 = i40;
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

    public static java.util.List<java.lang.Class<?>> copydefault() {
        return Collections.emptyList();
    }

    public static int EZpvd() {
        int i = EZpvd;
        int i2 = i % 8797065;
        EZpvd = i + 1;
        if (i2 != 0) {
            return djBIcL;
        }
        int i3 = (int) java.lang.Runtime.getRuntime().totalMemory();
        djBIcL = i3;
        return i3;
    }
}
