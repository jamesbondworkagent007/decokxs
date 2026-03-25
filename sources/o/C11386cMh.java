package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.okinc.business.defi.biz.database.wallet.bean.WalletViewForWalletManagement;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletDefiEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o.InterfaceC11384cMf;

/* JADX INFO: renamed from: o.cMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C11386cMh implements InterfaceC11384cMf {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<ChainAddressEntity> copydefault = new EntityInsertAdapter<ChainAddressEntity>() { // from class: o.cMh.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `chain_address` (`walletId`,`chainId`,`address`,`addressType`,`publicKey`,`derivePath`,`proxyAddress`,`eoaAddress`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull ChainAddressEntity chainAddressEntity) {
            if (chainAddressEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, chainAddressEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, chainAddressEntity.getChainId());
            if (chainAddressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, chainAddressEntity.getAddress());
            }
            sQLiteStatement.mo5793bindLong(4, chainAddressEntity.getAddressType());
            if (chainAddressEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, chainAddressEntity.getPublicKey());
            }
            if (chainAddressEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, chainAddressEntity.getDerivePath());
            }
            if (chainAddressEntity.getProxyAddress() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, chainAddressEntity.getProxyAddress());
            }
            if (chainAddressEntity.getEoaAddress() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, chainAddressEntity.getEoaAddress());
            }
        }
    };
    public final EntityInsertAdapter<ChainAddressSegWitEntity> KWHzl = new EntityInsertAdapter<ChainAddressSegWitEntity>() { // from class: o.cMh.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `chain_address_segwit` (`walletId`,`chainId`,`addressType`,`address`,`publicKey`,`derivePath`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull ChainAddressSegWitEntity chainAddressSegWitEntity) {
            if (chainAddressSegWitEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, chainAddressSegWitEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, chainAddressSegWitEntity.getChainId());
            sQLiteStatement.mo5793bindLong(3, chainAddressSegWitEntity.getAddressType());
            if (chainAddressSegWitEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, chainAddressSegWitEntity.getAddress());
            }
            if (chainAddressSegWitEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, chainAddressSegWitEntity.getPublicKey());
            }
            if (chainAddressSegWitEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, chainAddressSegWitEntity.getDerivePath());
            }
        }
    };
    public final EntityInsertAdapter<WalletDefiEntity> AYXKKw = new EntityInsertAdapter<WalletDefiEntity>() { // from class: o.cMh.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `defi` (`walletId`,`assetId`,`bean`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletDefiEntity walletDefiEntity) {
            if (walletDefiEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletDefiEntity.getWalletId());
            }
            if (walletDefiEntity.getAssetId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, walletDefiEntity.getAssetId());
            }
            if (walletDefiEntity.getBean() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletDefiEntity.getBean());
            }
        }
    };
    public final EntityInsertAdapter<WalletNftEntity> valueOf = new EntityInsertAdapter<WalletNftEntity>() { // from class: o.cMh.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `nft_v2` (`walletId`,`assetId`,`bean`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletNftEntity walletNftEntity) {
            if (walletNftEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletNftEntity.getWalletId());
            }
            if (walletNftEntity.getAssetId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, walletNftEntity.getAssetId());
            }
            if (walletNftEntity.getBean() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, walletNftEntity.getBean());
            }
        }
    };
    public final EntityInsertAdapter<RootWalletEntity> OLrzqt = new EntityInsertAdapter<RootWalletEntity>() { // from class: o.cMh.8
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `root_wallet` (`rootId`,`name`,`sortIndex`,`createAt`,`createIndex`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull RootWalletEntity rootWalletEntity) {
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, rootWalletEntity.getRootId());
            }
            if (rootWalletEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, rootWalletEntity.getName());
            }
            sQLiteStatement.mo5793bindLong(3, rootWalletEntity.getSortIndex());
            sQLiteStatement.mo5793bindLong(4, rootWalletEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(5, rootWalletEntity.getCreateIndex());
        }
    };
    public final EntityInsertAdapter<EOSInfoEntity> AEQbTJ = new EntityInsertAdapter<EOSInfoEntity>() { // from class: o.cMh.9
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `EOSInfo` (`walletId`,`accountName`,`state`,`pubKey`,`activeKey`,`ownerKey`,`shouldBeDeleted`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull EOSInfoEntity eOSInfoEntity) {
            if (eOSInfoEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, eOSInfoEntity.getWalletId());
            }
            if (eOSInfoEntity.getAccountName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, eOSInfoEntity.getAccountName());
            }
            sQLiteStatement.mo5793bindLong(3, eOSInfoEntity.getState());
            if (eOSInfoEntity.getPubKey() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, eOSInfoEntity.getPubKey());
            }
            if (eOSInfoEntity.getActiveKey() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, eOSInfoEntity.getActiveKey());
            }
            if (eOSInfoEntity.getOwnerKey() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, eOSInfoEntity.getOwnerKey());
            }
            sQLiteStatement.mo5793bindLong(7, eOSInfoEntity.getShouldBeDeleted());
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletEntity> djBIcL = new EntityDeleteOrUpdateAdapter<WalletEntity>() { // from class: o.cMh.7
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `wallet` SET `id` = ?,`type` = ?,`data` = ?,`chainId` = ?,`language` = ?,`name` = ?,`modifiedName` = ?,`backup` = ?,`cloudBackup` = ?,`iHuaweiBackup` = ?,`main` = ?,`xpub` = ?,`xpriv` = ?,`isSegWit` = ?,`fromCreate` = ?,`createAt` = ?,`orderValue` = ?,`rootWalletId` = ?,`addressIndex` = ?,`syncStatus` = ?,`completedSyncOperation` = ?,`syncOperation` = ?,`eoaWalletType` = ?,`aaWalletStatus` = ?,`createVersion` = ? WHERE `id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
    public final EntityDeleteOrUpdateAdapter<RootWalletEntity> gEmmrt = new EntityDeleteOrUpdateAdapter<RootWalletEntity>() { // from class: o.cMh.10
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `root_wallet` SET `rootId` = ?,`name` = ?,`sortIndex` = ?,`createAt` = ?,`createIndex` = ? WHERE `rootId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull RootWalletEntity rootWalletEntity) {
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, rootWalletEntity.getRootId());
            }
            if (rootWalletEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, rootWalletEntity.getName());
            }
            sQLiteStatement.mo5793bindLong(3, rootWalletEntity.getSortIndex());
            sQLiteStatement.mo5793bindLong(4, rootWalletEntity.getCreateAt());
            sQLiteStatement.mo5793bindLong(5, rootWalletEntity.getCreateIndex());
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, rootWalletEntity.getRootId());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<MPCWalletEntity> AhwBna = new EntityDeleteOrUpdateAdapter<MPCWalletEntity>() { // from class: o.cMh.6
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
    public final EntityDeleteOrUpdateAdapter<WalletRepairEntity> AkhnZx = new EntityDeleteOrUpdateAdapter<WalletRepairEntity>() { // from class: o.cMh.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `walletRepair` SET `walletId` = ?,`identifierType` = ?,`status` = ?,`reserved` = ?,`extJson` = ?,`timestamp` = ? WHERE `walletId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletRepairEntity walletRepairEntity) {
            if (walletRepairEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletRepairEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletRepairEntity.getIdentifierType());
            sQLiteStatement.mo5793bindLong(3, walletRepairEntity.getStatus());
            if (walletRepairEntity.getReserved() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, walletRepairEntity.getReserved());
            }
            if (walletRepairEntity.getExtJson() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, walletRepairEntity.getExtJson());
            }
            sQLiteStatement.mo5793bindLong(6, walletRepairEntity.getTimestamp());
            if (walletRepairEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, walletRepairEntity.getWalletId());
            }
        }
    };

    public C11386cMh(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object KWHzl(final java.util.List<ChainAddressEntity> list, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> valueOf(final java.util.List<ChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.djBIcL(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List djBIcL(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<ChainAddressSegWitEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public long EZpvd(final WalletNftEntity walletNftEntity) {
        walletNftEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(walletNftEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(WalletNftEntity walletNftEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.valueOf.insertAndReturnId(sQLiteConnection, walletNftEntity));
    }

    @Override // o.InterfaceC11384cMf
    public long copydefault(final RootWalletEntity rootWalletEntity) {
        rootWalletEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.EZpvd(rootWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long EZpvd(RootWalletEntity rootWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.OLrzqt.insertAndReturnId(sQLiteConnection, rootWalletEntity));
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> AYXKKw(final java.util.List<WalletDefiEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AYXKKw.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> AhwBna(final java.util.List<WalletNftEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.valueOf.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> EZpvd(final java.util.List<ChainAddressSegWitEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.InterfaceC11384cMf
    public long EZpvd(final EOSInfoEntity eOSInfoEntity) {
        eOSInfoEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(eOSInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long KWHzl(EOSInfoEntity eOSInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AEQbTJ.insertAndReturnId(sQLiteConnection, eOSInfoEntity));
    }

    @Override // o.InterfaceC11384cMf
    public int gEmmrt(final java.util.List<WalletEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AYXKKw(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer AYXKKw(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.djBIcL.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object gEmmrt(final java.util.List<WalletEntity> list, Continuation<? super java.lang.Integer> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.cNo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.valueOf(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Integer valueOf(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.djBIcL.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11384cMf
    public int EZpvd(final WalletEntity walletEntity) {
        walletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer EZpvd(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.djBIcL.handle(sQLiteConnection, walletEntity));
    }

    @Override // o.InterfaceC11384cMf
    public int EZpvd(final RootWalletEntity rootWalletEntity) {
        rootWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(rootWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(RootWalletEntity rootWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.gEmmrt.handle(sQLiteConnection, rootWalletEntity));
    }

    @Override // o.InterfaceC11384cMf
    public int copydefault(final MPCWalletEntity mPCWalletEntity) {
        mPCWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(mPCWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(MPCWalletEntity mPCWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AhwBna.handle(sQLiteConnection, mPCWalletEntity));
    }

    @Override // o.InterfaceC11384cMf
    public int AkhnZx(final java.util.List<WalletRepairEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.gEmmrt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer gEmmrt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AkhnZx.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.InterfaceC11384cMf
    public C11571cTe AYXKKw() {
        return (C11571cTe) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AwvSrB((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ C11571cTe AwvSrB(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11384cMf.ActionBar.KWHzl(this);
    }

    @Override // o.InterfaceC11384cMf
    public int fARcdN(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.OcIXYQ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OcIXYQ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(InterfaceC11384cMf.ActionBar.OLrzqt(this, str));
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object KWHzl(final java.util.List<ChainAddressEntity> list, final java.lang.String str, final java.util.List<C11283cIm> list2, Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return DBUtil.performInTransactionSuspending(this.EZpvd, new Function1() { // from class: o.cMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(list, str, list2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object AEQbTJ(java.util.List list, java.lang.String str, java.util.List list2, Continuation continuation) {
        return InterfaceC11384cMf.ActionBar.EZpvd(this, list, str, list2, continuation);
    }

    @Override // o.InterfaceC11384cMf
    public void OLrzqt(final java.lang.String str, final java.util.List<ChainAddressEntity> list) {
        DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.fARcdN(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit fARcdN(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        InterfaceC11384cMf.ActionBar.copydefault(this, str, (java.util.List<ChainAddressEntity>) list);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object OLrzqt(final java.util.List<WalletEntity> list, final java.util.List<SyncWalletReqNew> list2, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performInTransactionSuspending(this.EZpvd, new Function1() { // from class: o.cNm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(list, list2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object EZpvd(java.util.List list, java.util.List list2, Continuation continuation) {
        return InterfaceC11384cMf.ActionBar.EZpvd(this, list, list2, continuation);
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object copydefault(final java.util.List<WalletEntity> list, final java.util.List<java.lang.String> list2, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performInTransactionSuspending(this.EZpvd, new Function1() { // from class: o.cNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(list, list2, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object KWHzl(java.util.List list, java.util.List list2, Continuation continuation) {
        return InterfaceC11384cMf.ActionBar.copydefault(this, list, list2, continuation);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> copydefault(final java.lang.String str, final java.util.List<WalletDefiEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.iwGUEr(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List iwGUEr(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11384cMf.ActionBar.AEQbTJ(this, str, list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> AEQbTJ(final java.lang.String str, final java.util.List<WalletNftEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.hDKMBd(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List hDKMBd(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11384cMf.ActionBar.KWHzl(this, str, (java.util.List<WalletNftEntity>) list);
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<java.lang.Long> EZpvd(final java.lang.String str, final java.util.List<ChainAddressSegWitEntity> list) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.fIwbmz(str, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List fIwbmz(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return InterfaceC11384cMf.ActionBar.EZpvd(this, str, list);
    }

    @Override // o.InterfaceC11384cMf
    public long OLrzqt(final java.lang.String str, final EOSInfoEntity eOSInfoEntity) {
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(str, eOSInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long OLrzqt(java.lang.String str, EOSInfoEntity eOSInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(InterfaceC11384cMf.ActionBar.copydefault(this, str, eOSInfoEntity));
    }

    @Override // o.InterfaceC11384cMf
    public int AEQbTJ(final java.util.HashMap<java.lang.String, java.lang.Integer> map, final java.util.HashMap<java.lang.String, java.lang.Integer> map2) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(map, map2, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(java.util.HashMap map, java.util.HashMap map2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(InterfaceC11384cMf.ActionBar.KWHzl(this, (java.util.HashMap<java.lang.String, java.lang.Integer>) map, (java.util.HashMap<java.lang.String, java.lang.Integer>) map2));
    }

    @Override // o.InterfaceC11384cMf
    public int djBIcL() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.hDKMBd((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer hDKMBd(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM wallet");
        try {
            int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public boolean DbNXlk() {
        return ((java.lang.Boolean) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.zLjUOn((androidx.sqlite.SQLiteConnection) obj);
            }
        })).booleanValue();
    }

    public static /* synthetic */ java.lang.Boolean zLjUOn(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT EXISTS(SELECT 1 FROM wallet)");
        try {
            boolean z = false;
            if (sQLiteStatementPrepare.step()) {
                if (((int) sQLiteStatementPrepare.getLong(0)) != 0) {
                    z = true;
                }
            }
            sQLiteStatementPrepare.close();
            return java.lang.Boolean.valueOf(z);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public int AkhnZx() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AuCTelauCTel((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AuCTelauCTel(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM walletRepair where identifierType = 2 and status = 3");
        try {
            int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<C11571cTe> valueOf(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AubY(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AubY(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String text4;
        int i9;
        java.lang.String text5;
        int i10;
        int i11;
        java.lang.String text6;
        int i12;
        int i13;
        java.lang.String text7;
        int i14;
        int i15;
        int i16;
        java.lang.Integer numValueOf;
        int i17;
        int i18;
        int i19;
        java.lang.Integer numValueOf2;
        int i20;
        java.lang.String text8;
        int i21;
        java.lang.String text9;
        int i22;
        int i23;
        java.lang.String text10;
        int i24;
        java.lang.String text11;
        int i25;
        java.lang.String text12;
        int i26;
        java.lang.String text13;
        int i27;
        int i28;
        int i29;
        java.lang.Integer numValueOf3;
        int i30;
        int i31;
        java.lang.Integer numValueOf4;
        int i32;
        java.lang.String text14;
        int i33;
        java.lang.String text15;
        int i34;
        int i35;
        java.lang.String text16;
        int i36;
        java.lang.String text17;
        int i37;
        java.lang.String text18;
        int i38;
        java.lang.String text19;
        int i39;
        java.lang.String text20;
        int i40;
        java.lang.String text21;
        int i41;
        java.lang.String text22;
        int i42;
        java.lang.String text23;
        int i43;
        java.lang.String text24;
        int i44;
        java.lang.String text25;
        int i45;
        java.lang.String text26;
        int i46;
        java.lang.String text27;
        int i47;
        java.lang.String text28;
        int i48;
        java.lang.String text29;
        int i49;
        java.lang.String text30;
        int i50;
        java.lang.String text31;
        int i51;
        java.lang.String text32;
        int i52;
        java.lang.String text33;
        int i53;
        java.lang.String text34;
        int i54;
        java.lang.String text35;
        int i55;
        java.lang.String text36;
        int i56;
        java.lang.String text37;
        int i57;
        java.lang.String text38;
        int i58;
        java.lang.String text39;
        int i59;
        java.lang.String text40;
        int i60;
        java.lang.String text41;
        int i61;
        java.lang.String text42;
        int i62;
        java.lang.String text43;
        int i63;
        java.lang.String text44;
        int i64;
        java.lang.String text45;
        int i65;
        java.lang.String text46;
        int i66;
        java.lang.String text47;
        int i67;
        java.lang.String text48;
        int i68;
        java.lang.String text49;
        int i69;
        java.lang.String text50;
        int i70;
        java.lang.String text51;
        int i71;
        java.lang.String text52;
        int i72;
        java.lang.String text53;
        int i73;
        java.lang.String text54;
        int i74;
        java.lang.String text55;
        int i75;
        java.lang.String text56;
        int i76;
        java.lang.String text57;
        int i77;
        java.lang.String text58;
        int i78;
        java.lang.String text59;
        int i79;
        java.lang.String text60;
        int i80;
        java.lang.String text61;
        int i81;
        int i82;
        int i83;
        java.lang.Integer numValueOf5;
        int i84;
        int i85;
        java.lang.Integer numValueOf6;
        int i86;
        java.lang.String text62;
        int i87;
        java.lang.String text63;
        int i88;
        int i89;
        java.lang.Long lValueOf;
        int i90;
        java.lang.String text64;
        int i91;
        java.lang.String text65;
        int i92;
        java.lang.String text66;
        int i93;
        java.lang.String text67;
        int i94;
        java.lang.String text68;
        int i95;
        java.lang.String text69;
        int i96;
        java.lang.String text70;
        int i97;
        int i98;
        int i99;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i100;
        int i101;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i102;
        java.lang.Long lValueOf2;
        int i103;
        int i104;
        int i105;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i106;
        int i107;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i108;
        int i109;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView WHERE rootWalletId = ? ORDER BY orderValue,addressIndex");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i2 = columnIndexOrThrow13;
                    i = columnIndexOrThrow14;
                    text = null;
                } else {
                    i = columnIndexOrThrow14;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow13;
                }
                int i110 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i4 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i4 = columnIndexOrThrow2;
                }
                int i111 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i112 = columnIndexOrThrow4;
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i114 = columnIndexOrThrow5;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i116 = columnIndexOrThrow6;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i118 = columnIndexOrThrow7;
                int i119 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                }
                int i120 = columnIndexOrThrow8;
                int i121 = (int) sQLiteStatementPrepare.getLong(i6);
                int i122 = i;
                if (sQLiteStatementPrepare.isNull(i122)) {
                    i7 = i122;
                    i8 = columnIndexOrThrow10;
                    text4 = null;
                } else {
                    i7 = i122;
                    i8 = columnIndexOrThrow10;
                    text4 = sQLiteStatementPrepare.getText(i122);
                }
                int i123 = columnIndexOrThrow;
                int i124 = columnIndexOrThrow15;
                int i125 = (int) sQLiteStatementPrepare.getLong(i124);
                int i126 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i126);
                int i127 = columnIndexOrThrow17;
                int i128 = columnIndexOrThrow11;
                int i129 = (int) sQLiteStatementPrepare.getLong(i127);
                int i130 = columnIndexOrThrow18;
                int i131 = (int) sQLiteStatementPrepare.getLong(i130);
                int i132 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i132)) {
                    i10 = i127;
                    i9 = i132;
                    i11 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i9 = i132;
                    text5 = sQLiteStatementPrepare.getText(i132);
                    i10 = i127;
                    i11 = columnIndexOrThrow20;
                }
                int i133 = (int) sQLiteStatementPrepare.getLong(i11);
                int i134 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i134)) {
                    i12 = i11;
                    i13 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i134);
                    i12 = i11;
                    i13 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow22 = i13;
                    i14 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i13);
                    columnIndexOrThrow22 = i13;
                    i14 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    i15 = i134;
                    i16 = columnIndexOrThrow12;
                    i17 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i15 = i134;
                    i16 = columnIndexOrThrow12;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i14));
                    i17 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i18 = i131;
                    i19 = i133;
                    i20 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i18 = i131;
                    i19 = i133;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i17));
                    i20 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i20)) {
                    i21 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i20);
                    i21 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    i22 = i14;
                    i23 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i21);
                    i22 = i14;
                    i23 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    columnIndexOrThrow27 = i23;
                    i24 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i23;
                    text10 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    columnIndexOrThrow28 = i24;
                    i25 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i24;
                    text11 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    columnIndexOrThrow29 = i25;
                    i26 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i25;
                    text12 = sQLiteStatementPrepare.getText(i25);
                    i26 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i26)) {
                    columnIndexOrThrow30 = i26;
                    i27 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i26;
                    text13 = sQLiteStatementPrepare.getText(i26);
                    i27 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i27)) {
                    i28 = i20;
                    i29 = i21;
                    i30 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i28 = i20;
                    i29 = i21;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i27));
                    i30 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = i17;
                    i32 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i31 = i17;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                    i32 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i32)) {
                    i33 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i32);
                    i33 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    i34 = i27;
                    i35 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i33);
                    i34 = i27;
                    i35 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow35 = i35;
                    i36 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i35;
                    text16 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    columnIndexOrThrow36 = i36;
                    i37 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i36;
                    text17 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow37 = i37;
                    i38 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i37;
                    text18 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow38 = i38;
                    i39 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i38;
                    text19 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow39 = i39;
                    i40 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i39;
                    text20 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow40 = i40;
                    i41 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i40;
                    text21 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow41 = i41;
                    i42 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i41;
                    text22 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow42 = i42;
                    i43 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i42;
                    text23 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow43 = i43;
                    i44 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i43;
                    text24 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow44 = i44;
                    i45 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i44;
                    text25 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow45 = i45;
                    i46 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i45;
                    text26 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow46 = i46;
                    i47 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i46;
                    text27 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow47 = i47;
                    i48 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i47;
                    text28 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow48 = i48;
                    i49 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i48;
                    text29 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow49 = i49;
                    i50 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i49;
                    text30 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow50 = i50;
                    i51 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i50;
                    text31 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow51 = i51;
                    i52 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i51;
                    text32 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow52 = i52;
                    i53 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i52;
                    text33 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow53 = i53;
                    i54 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i53;
                    text34 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow54 = i54;
                    i55 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i54;
                    text35 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow55 = i55;
                    i56 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i55;
                    text36 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow56 = i56;
                    i57 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i56;
                    text37 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow57 = i57;
                    i58 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i57;
                    text38 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow58 = i58;
                    i59 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i58;
                    text39 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow59 = i59;
                    i60 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i59;
                    text40 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow60 = i60;
                    i61 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i60;
                    text41 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow61 = i61;
                    i62 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i61;
                    text42 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow62 = i62;
                    i63 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i62;
                    text43 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow63 = i63;
                    i64 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i63;
                    text44 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow64 = i64;
                    i65 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i64;
                    text45 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow65 = i65;
                    i66 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i65;
                    text46 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow66 = i66;
                    i67 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i66;
                    text47 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow67 = i67;
                    i68 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i67;
                    text48 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow68 = i68;
                    i69 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i68;
                    text49 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow69 = i69;
                    i70 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i69;
                    text50 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow70 = i70;
                    i71 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i70;
                    text51 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow71 = i71;
                    i72 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i71;
                    text52 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow72 = i72;
                    i73 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i72;
                    text53 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow73 = i73;
                    i74 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i73;
                    text54 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow74 = i74;
                    i75 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i74;
                    text55 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow75 = i75;
                    i76 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i75;
                    text56 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow76 = i76;
                    i77 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i76;
                    text57 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow77 = i77;
                    i78 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i77;
                    text58 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow78 = i78;
                    i79 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i78;
                    text59 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    columnIndexOrThrow79 = i79;
                    i80 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i79;
                    text60 = sQLiteStatementPrepare.getText(i79);
                    i80 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i80)) {
                    columnIndexOrThrow80 = i80;
                    i81 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i80;
                    text61 = sQLiteStatementPrepare.getText(i80);
                    i81 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i81)) {
                    i82 = i30;
                    i83 = i32;
                    i84 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i82 = i30;
                    i83 = i32;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i81));
                    i84 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i84)) {
                    i85 = i33;
                    i86 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i85 = i33;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i84));
                    i86 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i86)) {
                    i87 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i86);
                    i87 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i87)) {
                    i88 = i81;
                    i89 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i87);
                    i88 = i81;
                    i89 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    columnIndexOrThrow85 = i89;
                    i90 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i89;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i89));
                    i90 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i90)) {
                    columnIndexOrThrow86 = i90;
                    i91 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i90;
                    text64 = sQLiteStatementPrepare.getText(i90);
                    i91 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow87 = i91;
                    i92 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i91;
                    text65 = sQLiteStatementPrepare.getText(i91);
                    i92 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow88 = i92;
                    i93 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i92;
                    text66 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow89 = i93;
                    i94 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i93;
                    text67 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow90 = i94;
                    i95 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i94;
                    text68 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    columnIndexOrThrow91 = i95;
                    i96 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i95;
                    text69 = sQLiteStatementPrepare.getText(i95);
                    i96 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i96)) {
                    columnIndexOrThrow92 = i96;
                    i97 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i96;
                    text70 = sQLiteStatementPrepare.getText(i96);
                    i97 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i97)) {
                    i98 = i84;
                    i99 = i86;
                    numValueOf7 = null;
                } else {
                    i98 = i84;
                    i99 = i86;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i97));
                }
                if (numValueOf7 == null) {
                    i100 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i100 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i100)) {
                    i101 = i87;
                    numValueOf8 = null;
                } else {
                    i101 = i87;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i100));
                }
                if (numValueOf8 == null) {
                    i102 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i102 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i102)) {
                    i103 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i102));
                    i103 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i103)) {
                    i104 = i100;
                    i105 = i102;
                    numValueOf9 = null;
                } else {
                    i104 = i100;
                    i105 = i102;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i103));
                }
                if (numValueOf9 == null) {
                    i106 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i106 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i106)) {
                    i107 = i103;
                    numValueOf10 = null;
                } else {
                    i107 = i103;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i106));
                }
                if (numValueOf10 == null) {
                    i108 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i108 = columnIndexOrThrow98;
                }
                int i135 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108);
                long j3 = sQLiteStatementPrepare.getLong(i135);
                int i136 = i97;
                int i137 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i137);
                columnIndexOrThrow100 = i137;
                int i138 = i106;
                int i139 = columnIndexOrThrow101;
                int i140 = i108;
                int i141 = (int) sQLiteStatementPrepare.getLong(i139);
                int i142 = columnIndexOrThrow102;
                int i143 = i18;
                if (((int) sQLiteStatementPrepare.getLong(i142)) != 0) {
                    i109 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i109 = columnIndexOrThrow103;
                    z = false;
                }
                int i144 = columnIndexOrThrow104;
                int i145 = i109;
                arrayList.add(new C11571cTe(text, i110, text71, j, text72, text2, i111, i113, i115, i117, i119, text3, text4, i121, i125, j2, i129, i143, text5, i19, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i141, z, (int) sQLiteStatementPrepare.getLong(i109), (int) sQLiteStatementPrepare.getLong(i144), text43, text44, text45, text46));
                columnIndexOrThrow13 = i6;
                columnIndexOrThrow2 = i4;
                columnIndexOrThrow11 = i128;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow18 = i130;
                columnIndexOrThrow20 = i12;
                columnIndexOrThrow12 = i16;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow25 = i28;
                columnIndexOrThrow26 = i29;
                columnIndexOrThrow24 = i31;
                columnIndexOrThrow31 = i34;
                columnIndexOrThrow32 = i82;
                columnIndexOrThrow33 = i83;
                columnIndexOrThrow34 = i85;
                columnIndexOrThrow81 = i88;
                columnIndexOrThrow82 = i98;
                columnIndexOrThrow83 = i99;
                columnIndexOrThrow84 = i101;
                columnIndexOrThrow94 = i104;
                columnIndexOrThrow95 = i105;
                columnIndexOrThrow96 = i107;
                columnIndexOrThrow93 = i136;
                columnIndexOrThrow97 = i138;
                columnIndexOrThrow98 = i140;
                columnIndexOrThrow102 = i142;
                columnIndexOrThrow103 = i145;
                columnIndexOrThrow8 = i120;
                columnIndexOrThrow99 = i135;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow4 = i112;
                columnIndexOrThrow5 = i114;
                columnIndexOrThrow6 = i116;
                columnIndexOrThrow7 = i118;
                columnIndexOrThrow9 = i5;
                columnIndexOrThrow14 = i7;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow21 = i15;
                columnIndexOrThrow101 = i139;
                columnIndexOrThrow104 = i144;
                columnIndexOrThrow10 = i8;
                columnIndexOrThrow = i123;
                columnIndexOrThrow15 = i124;
                columnIndexOrThrow16 = i126;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public C11571cTe djBIcL(final java.lang.String str) {
        return (C11571cTe) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.hDKMBd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ C11571cTe hDKMBd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        java.lang.String text2;
        int i2;
        java.lang.String text3;
        int i3;
        java.lang.String text4;
        int i4;
        java.lang.String text5;
        int i5;
        java.lang.Integer numValueOf;
        int i6;
        java.lang.Integer numValueOf2;
        int i7;
        java.lang.String text6;
        int i8;
        java.lang.String text7;
        int i9;
        java.lang.String text8;
        int i10;
        java.lang.String text9;
        int i11;
        java.lang.String text10;
        int i12;
        java.lang.String text11;
        int i13;
        java.lang.Integer numValueOf3;
        int i14;
        java.lang.Integer numValueOf4;
        int i15;
        java.lang.String text12;
        int i16;
        java.lang.String text13;
        int i17;
        java.lang.String text14;
        int i18;
        java.lang.String text15;
        int i19;
        java.lang.String text16;
        int i20;
        java.lang.String text17;
        int i21;
        java.lang.String text18;
        int i22;
        java.lang.String text19;
        int i23;
        java.lang.String text20;
        int i24;
        java.lang.String text21;
        int i25;
        java.lang.String text22;
        int i26;
        java.lang.String text23;
        int i27;
        java.lang.String text24;
        int i28;
        java.lang.String text25;
        int i29;
        java.lang.String text26;
        int i30;
        java.lang.String text27;
        int i31;
        java.lang.String text28;
        int i32;
        java.lang.String text29;
        int i33;
        java.lang.String text30;
        int i34;
        java.lang.String text31;
        int i35;
        java.lang.String text32;
        int i36;
        java.lang.String text33;
        int i37;
        java.lang.String text34;
        int i38;
        java.lang.String text35;
        int i39;
        java.lang.String text36;
        int i40;
        java.lang.String text37;
        int i41;
        java.lang.String text38;
        int i42;
        java.lang.String text39;
        int i43;
        java.lang.String text40;
        int i44;
        java.lang.String text41;
        int i45;
        java.lang.String text42;
        int i46;
        java.lang.String text43;
        int i47;
        java.lang.String text44;
        int i48;
        java.lang.String text45;
        int i49;
        java.lang.String text46;
        int i50;
        java.lang.String text47;
        int i51;
        java.lang.String text48;
        int i52;
        java.lang.String text49;
        int i53;
        java.lang.String text50;
        int i54;
        java.lang.String text51;
        int i55;
        java.lang.String text52;
        int i56;
        java.lang.String text53;
        int i57;
        java.lang.String text54;
        int i58;
        java.lang.String text55;
        int i59;
        java.lang.String text56;
        int i60;
        java.lang.String text57;
        int i61;
        java.lang.String text58;
        int i62;
        java.lang.String text59;
        int i63;
        java.lang.Integer numValueOf5;
        int i64;
        java.lang.Integer numValueOf6;
        int i65;
        java.lang.String text60;
        int i66;
        java.lang.String text61;
        int i67;
        java.lang.Long lValueOf;
        int i68;
        java.lang.String text62;
        int i69;
        java.lang.String text63;
        int i70;
        java.lang.String text64;
        int i71;
        java.lang.String text65;
        int i72;
        java.lang.String text66;
        int i73;
        java.lang.String text67;
        int i74;
        java.lang.String text68;
        int i75;
        java.lang.Boolean boolValueOf;
        int i76;
        java.lang.Boolean boolValueOf2;
        int i77;
        java.lang.Long lValueOf2;
        int i78;
        java.lang.Boolean boolValueOf3;
        int i79;
        java.lang.Boolean boolValueOf4;
        int i80;
        int i81;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView WHERE id = ?");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
            C11571cTe c11571cTe = null;
            if (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow104;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i = columnIndexOrThrow104;
                }
                int i82 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text69 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text70 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                int i83 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i84 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i85 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i86 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i87 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                int i88 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i2 = columnIndexOrThrow15;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i2 = columnIndexOrThrow15;
                }
                int i89 = (int) sQLiteStatementPrepare.getLong(i2);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow16);
                int i90 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17);
                int i91 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow18);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                    i3 = columnIndexOrThrow20;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                    i3 = columnIndexOrThrow20;
                }
                int i92 = (int) sQLiteStatementPrepare.getLong(i3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow21)) {
                    i4 = columnIndexOrThrow22;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                    i4 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow23;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i5));
                    i6 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    i7 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i6));
                    i7 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    i8 = columnIndexOrThrow26;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i7);
                    i8 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i8)) {
                    i9 = columnIndexOrThrow27;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i8);
                    i9 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i9)) {
                    i10 = columnIndexOrThrow28;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i9);
                    i10 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = columnIndexOrThrow29;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i10);
                    i11 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = columnIndexOrThrow30;
                    text10 = null;
                } else {
                    text10 = sQLiteStatementPrepare.getText(i11);
                    i12 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = columnIndexOrThrow31;
                    text11 = null;
                } else {
                    text11 = sQLiteStatementPrepare.getText(i12);
                    i13 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    i14 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i13));
                    i14 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    i15 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i14));
                    i15 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i16 = columnIndexOrThrow34;
                    text12 = null;
                } else {
                    text12 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    i17 = columnIndexOrThrow35;
                    text13 = null;
                } else {
                    text13 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    i18 = columnIndexOrThrow36;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = columnIndexOrThrow37;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = columnIndexOrThrow38;
                    text16 = null;
                } else {
                    text16 = sQLiteStatementPrepare.getText(i19);
                    i20 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i20)) {
                    i21 = columnIndexOrThrow39;
                    text17 = null;
                } else {
                    text17 = sQLiteStatementPrepare.getText(i20);
                    i21 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    i22 = columnIndexOrThrow40;
                    text18 = null;
                } else {
                    text18 = sQLiteStatementPrepare.getText(i21);
                    i22 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i23 = columnIndexOrThrow41;
                    text19 = null;
                } else {
                    text19 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i24 = columnIndexOrThrow42;
                    text20 = null;
                } else {
                    text20 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    i25 = columnIndexOrThrow43;
                    text21 = null;
                } else {
                    text21 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = columnIndexOrThrow44;
                    text22 = null;
                } else {
                    text22 = sQLiteStatementPrepare.getText(i25);
                    i26 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i26)) {
                    i27 = columnIndexOrThrow45;
                    text23 = null;
                } else {
                    text23 = sQLiteStatementPrepare.getText(i26);
                    i27 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i27)) {
                    i28 = columnIndexOrThrow46;
                    text24 = null;
                } else {
                    text24 = sQLiteStatementPrepare.getText(i27);
                    i28 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = columnIndexOrThrow47;
                    text25 = null;
                } else {
                    text25 = sQLiteStatementPrepare.getText(i28);
                    i29 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i29)) {
                    i30 = columnIndexOrThrow48;
                    text26 = null;
                } else {
                    text26 = sQLiteStatementPrepare.getText(i29);
                    i30 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = columnIndexOrThrow49;
                    text27 = null;
                } else {
                    text27 = sQLiteStatementPrepare.getText(i30);
                    i31 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i31)) {
                    i32 = columnIndexOrThrow50;
                    text28 = null;
                } else {
                    text28 = sQLiteStatementPrepare.getText(i31);
                    i32 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i32)) {
                    i33 = columnIndexOrThrow51;
                    text29 = null;
                } else {
                    text29 = sQLiteStatementPrepare.getText(i32);
                    i33 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    i34 = columnIndexOrThrow52;
                    text30 = null;
                } else {
                    text30 = sQLiteStatementPrepare.getText(i33);
                    i34 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    i35 = columnIndexOrThrow53;
                    text31 = null;
                } else {
                    text31 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i36 = columnIndexOrThrow54;
                    text32 = null;
                } else {
                    text32 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    i37 = columnIndexOrThrow55;
                    text33 = null;
                } else {
                    text33 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    i38 = columnIndexOrThrow56;
                    text34 = null;
                } else {
                    text34 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    i39 = columnIndexOrThrow57;
                    text35 = null;
                } else {
                    text35 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    i40 = columnIndexOrThrow58;
                    text36 = null;
                } else {
                    text36 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i41 = columnIndexOrThrow59;
                    text37 = null;
                } else {
                    text37 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    i42 = columnIndexOrThrow60;
                    text38 = null;
                } else {
                    text38 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    i43 = columnIndexOrThrow61;
                    text39 = null;
                } else {
                    text39 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    i44 = columnIndexOrThrow62;
                    text40 = null;
                } else {
                    text40 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    i45 = columnIndexOrThrow63;
                    text41 = null;
                } else {
                    text41 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    i46 = columnIndexOrThrow64;
                    text42 = null;
                } else {
                    text42 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    i47 = columnIndexOrThrow65;
                    text43 = null;
                } else {
                    text43 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    i48 = columnIndexOrThrow66;
                    text44 = null;
                } else {
                    text44 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    i49 = columnIndexOrThrow67;
                    text45 = null;
                } else {
                    text45 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    i50 = columnIndexOrThrow68;
                    text46 = null;
                } else {
                    text46 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    i51 = columnIndexOrThrow69;
                    text47 = null;
                } else {
                    text47 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    i52 = columnIndexOrThrow70;
                    text48 = null;
                } else {
                    text48 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    i53 = columnIndexOrThrow71;
                    text49 = null;
                } else {
                    text49 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    i54 = columnIndexOrThrow72;
                    text50 = null;
                } else {
                    text50 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    i55 = columnIndexOrThrow73;
                    text51 = null;
                } else {
                    text51 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    i56 = columnIndexOrThrow74;
                    text52 = null;
                } else {
                    text52 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    i57 = columnIndexOrThrow75;
                    text53 = null;
                } else {
                    text53 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    i58 = columnIndexOrThrow76;
                    text54 = null;
                } else {
                    text54 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    i59 = columnIndexOrThrow77;
                    text55 = null;
                } else {
                    text55 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    i60 = columnIndexOrThrow78;
                    text56 = null;
                } else {
                    text56 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    i61 = columnIndexOrThrow79;
                    text57 = null;
                } else {
                    text57 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    i62 = columnIndexOrThrow80;
                    text58 = null;
                } else {
                    text58 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    i63 = columnIndexOrThrow81;
                    text59 = null;
                } else {
                    text59 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    i64 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i63));
                    i64 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    i65 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i64));
                    i65 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    i66 = columnIndexOrThrow84;
                    text60 = null;
                } else {
                    text60 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    i67 = columnIndexOrThrow85;
                    text61 = null;
                } else {
                    text61 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    i68 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i67));
                    i68 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    i69 = columnIndexOrThrow87;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    i70 = columnIndexOrThrow88;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    i71 = columnIndexOrThrow89;
                    text64 = null;
                } else {
                    text64 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    i72 = columnIndexOrThrow90;
                    text65 = null;
                } else {
                    text65 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    i73 = columnIndexOrThrow91;
                    text66 = null;
                } else {
                    text66 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    i74 = columnIndexOrThrow92;
                    text67 = null;
                } else {
                    text67 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    i75 = columnIndexOrThrow93;
                    text68 = null;
                } else {
                    text68 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow93;
                }
                java.lang.Integer numValueOf7 = sQLiteStatementPrepare.isNull(i75) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i75));
                if (numValueOf7 == null) {
                    i76 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i76 = columnIndexOrThrow94;
                }
                java.lang.Integer numValueOf8 = sQLiteStatementPrepare.isNull(i76) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i76));
                if (numValueOf8 == null) {
                    i77 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i77 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    i78 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i77));
                    i78 = columnIndexOrThrow96;
                }
                java.lang.Integer numValueOf9 = sQLiteStatementPrepare.isNull(i78) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i78));
                if (numValueOf9 == null) {
                    i79 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i79 = columnIndexOrThrow97;
                }
                java.lang.Integer numValueOf10 = sQLiteStatementPrepare.isNull(i79) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i79));
                if (numValueOf10 == null) {
                    i80 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i80 = columnIndexOrThrow98;
                }
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i80) ? null : sQLiteStatementPrepare.getText(i80);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow99);
                long j4 = sQLiteStatementPrepare.getLong(columnIndexOrThrow100);
                int i93 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow101);
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow102)) != 0) {
                    i81 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i81 = columnIndexOrThrow103;
                    z = false;
                }
                c11571cTe = new C11571cTe(text, i82, text69, j, text70, text71, i83, i84, i85, i86, i87, text72, text2, i88, i89, j2, i90, i91, text3, i92, text4, text5, numValueOf, numValueOf2, text6, text7, text8, text9, text10, text11, numValueOf3, numValueOf4, text12, text13, text14, text15, text16, text17, text19, text18, text30, text31, text32, text33, text34, text35, text36, text37, text38, text39, text40, text45, text46, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text62, text63, text64, text65, text66, text67, text68, text59, numValueOf5, numValueOf6, text60, text61, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i93, z, (int) sQLiteStatementPrepare.getLong(i81), (int) sQLiteStatementPrepare.getLong(i), text41, text42, text43, text44);
            }
            return c11571cTe;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<C11571cTe> gEmmrt() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.getNewProxyInstance((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List getNewProxyInstance(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        java.lang.String text5;
        int i8;
        int i9;
        java.lang.String text6;
        int i10;
        int i11;
        java.lang.String text7;
        int i12;
        int i13;
        int i14;
        java.lang.Integer numValueOf;
        int i15;
        int i16;
        int i17;
        java.lang.Integer numValueOf2;
        int i18;
        java.lang.String text8;
        int i19;
        java.lang.String text9;
        int i20;
        int i21;
        java.lang.String text10;
        int i22;
        java.lang.String text11;
        int i23;
        java.lang.String text12;
        int i24;
        java.lang.String text13;
        int i25;
        int i26;
        int i27;
        java.lang.Integer numValueOf3;
        int i28;
        int i29;
        java.lang.Integer numValueOf4;
        int i30;
        java.lang.String text14;
        int i31;
        java.lang.String text15;
        int i32;
        int i33;
        java.lang.String text16;
        int i34;
        java.lang.String text17;
        int i35;
        java.lang.String text18;
        int i36;
        java.lang.String text19;
        int i37;
        java.lang.String text20;
        int i38;
        java.lang.String text21;
        int i39;
        java.lang.String text22;
        int i40;
        java.lang.String text23;
        int i41;
        java.lang.String text24;
        int i42;
        java.lang.String text25;
        int i43;
        java.lang.String text26;
        int i44;
        java.lang.String text27;
        int i45;
        java.lang.String text28;
        int i46;
        java.lang.String text29;
        int i47;
        java.lang.String text30;
        int i48;
        java.lang.String text31;
        int i49;
        java.lang.String text32;
        int i50;
        java.lang.String text33;
        int i51;
        java.lang.String text34;
        int i52;
        java.lang.String text35;
        int i53;
        java.lang.String text36;
        int i54;
        java.lang.String text37;
        int i55;
        java.lang.String text38;
        int i56;
        java.lang.String text39;
        int i57;
        java.lang.String text40;
        int i58;
        java.lang.String text41;
        int i59;
        java.lang.String text42;
        int i60;
        java.lang.String text43;
        int i61;
        java.lang.String text44;
        int i62;
        java.lang.String text45;
        int i63;
        java.lang.String text46;
        int i64;
        java.lang.String text47;
        int i65;
        java.lang.String text48;
        int i66;
        java.lang.String text49;
        int i67;
        java.lang.String text50;
        int i68;
        java.lang.String text51;
        int i69;
        java.lang.String text52;
        int i70;
        java.lang.String text53;
        int i71;
        java.lang.String text54;
        int i72;
        java.lang.String text55;
        int i73;
        java.lang.String text56;
        int i74;
        java.lang.String text57;
        int i75;
        java.lang.String text58;
        int i76;
        java.lang.String text59;
        int i77;
        java.lang.String text60;
        int i78;
        java.lang.String text61;
        int i79;
        int i80;
        int i81;
        java.lang.Integer numValueOf5;
        int i82;
        int i83;
        java.lang.Integer numValueOf6;
        int i84;
        java.lang.String text62;
        int i85;
        java.lang.String text63;
        int i86;
        int i87;
        java.lang.Long lValueOf;
        int i88;
        java.lang.String text64;
        int i89;
        java.lang.String text65;
        int i90;
        java.lang.String text66;
        int i91;
        java.lang.String text67;
        int i92;
        java.lang.String text68;
        int i93;
        java.lang.String text69;
        int i94;
        java.lang.String text70;
        int i95;
        int i96;
        int i97;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i98;
        int i99;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i100;
        java.lang.Long lValueOf2;
        int i101;
        int i102;
        int i103;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i104;
        int i105;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i106;
        int i107;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView WHERE main == 1");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
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
                int i108 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i109 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i110 = columnIndexOrThrow4;
                int i111 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i112 = columnIndexOrThrow5;
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i114 = columnIndexOrThrow6;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i116 = columnIndexOrThrow7;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i4 = columnIndexOrThrow8;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i4 = columnIndexOrThrow8;
                }
                int i118 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                int i119 = i;
                if (sQLiteStatementPrepare.isNull(i119)) {
                    i5 = i119;
                    i6 = columnIndexOrThrow9;
                    text4 = null;
                } else {
                    i5 = i119;
                    text4 = sQLiteStatementPrepare.getText(i119);
                    i6 = columnIndexOrThrow9;
                }
                int i120 = columnIndexOrThrow;
                int i121 = columnIndexOrThrow15;
                int i122 = (int) sQLiteStatementPrepare.getLong(i121);
                int i123 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i123);
                int i124 = columnIndexOrThrow17;
                int i125 = columnIndexOrThrow10;
                int i126 = (int) sQLiteStatementPrepare.getLong(i124);
                int i127 = columnIndexOrThrow12;
                int i128 = columnIndexOrThrow18;
                int i129 = columnIndexOrThrow11;
                int i130 = (int) sQLiteStatementPrepare.getLong(i128);
                int i131 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i131)) {
                    i8 = i124;
                    i7 = i131;
                    i9 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i7 = i131;
                    text5 = sQLiteStatementPrepare.getText(i131);
                    i8 = i124;
                    i9 = columnIndexOrThrow20;
                }
                int i132 = columnIndexOrThrow13;
                int i133 = (int) sQLiteStatementPrepare.getLong(i9);
                int i134 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i134)) {
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i134);
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i11);
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i133;
                    i14 = i134;
                    i15 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i13 = i133;
                    i14 = i134;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i12));
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i16 = i128;
                    i17 = i130;
                    i18 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i16 = i128;
                    i17 = i130;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i15));
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i19);
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    columnIndexOrThrow27 = i21;
                    i22 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i21;
                    text10 = sQLiteStatementPrepare.getText(i21);
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    columnIndexOrThrow28 = i22;
                    i23 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i22;
                    text11 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    columnIndexOrThrow29 = i23;
                    i24 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i23;
                    text12 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    columnIndexOrThrow30 = i24;
                    i25 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i24;
                    text13 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = i18;
                    i27 = i19;
                    i28 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i26 = i18;
                    i27 = i19;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i25));
                    i28 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = i15;
                    i30 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i29 = i15;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i28));
                    i30 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i30);
                    i31 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i31)) {
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i31);
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    columnIndexOrThrow35 = i33;
                    i34 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i33;
                    text16 = sQLiteStatementPrepare.getText(i33);
                    i34 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow36 = i34;
                    i35 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i34;
                    text17 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow37 = i35;
                    i36 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i35;
                    text18 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    columnIndexOrThrow38 = i36;
                    i37 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i36;
                    text19 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow39 = i37;
                    i38 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i37;
                    text20 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow40 = i38;
                    i39 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i38;
                    text21 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow41 = i39;
                    i40 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i39;
                    text22 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow42 = i40;
                    i41 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i40;
                    text23 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow43 = i41;
                    i42 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i41;
                    text24 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow44 = i42;
                    i43 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i42;
                    text25 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow45 = i43;
                    i44 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i43;
                    text26 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow46 = i44;
                    i45 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i44;
                    text27 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow47 = i45;
                    i46 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i45;
                    text28 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow48 = i46;
                    i47 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i46;
                    text29 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow49 = i47;
                    i48 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i47;
                    text30 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow50 = i48;
                    i49 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i48;
                    text31 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow51 = i49;
                    i50 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i49;
                    text32 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow52 = i50;
                    i51 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i50;
                    text33 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow53 = i51;
                    i52 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i51;
                    text34 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow54 = i52;
                    i53 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i52;
                    text35 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow55 = i53;
                    i54 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i53;
                    text36 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow56 = i54;
                    i55 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i54;
                    text37 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow57 = i55;
                    i56 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i55;
                    text38 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow58 = i56;
                    i57 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i56;
                    text39 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow59 = i57;
                    i58 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i57;
                    text40 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow60 = i58;
                    i59 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i58;
                    text41 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow61 = i59;
                    i60 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i59;
                    text42 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow62 = i60;
                    i61 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i60;
                    text43 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow63 = i61;
                    i62 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i61;
                    text44 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow64 = i62;
                    i63 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i62;
                    text45 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow65 = i63;
                    i64 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i63;
                    text46 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow66 = i64;
                    i65 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i64;
                    text47 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow67 = i65;
                    i66 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i65;
                    text48 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow68 = i66;
                    i67 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i66;
                    text49 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow69 = i67;
                    i68 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i67;
                    text50 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow70 = i68;
                    i69 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i68;
                    text51 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow71 = i69;
                    i70 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i69;
                    text52 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow72 = i70;
                    i71 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i70;
                    text53 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow73 = i71;
                    i72 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i71;
                    text54 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow74 = i72;
                    i73 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i72;
                    text55 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow75 = i73;
                    i74 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i73;
                    text56 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow76 = i74;
                    i75 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i74;
                    text57 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow77 = i75;
                    i76 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i75;
                    text58 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow78 = i76;
                    i77 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i76;
                    text59 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow79 = i77;
                    i78 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i77;
                    text60 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow80 = i78;
                    i79 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i78;
                    text61 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    i80 = i28;
                    i81 = i30;
                    i82 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i80 = i28;
                    i81 = i30;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i79));
                    i82 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i82)) {
                    i83 = i31;
                    i84 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i83 = i31;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i82));
                    i84 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i84)) {
                    i85 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i84);
                    i85 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i85)) {
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i85);
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i87)) {
                    columnIndexOrThrow85 = i87;
                    i88 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i87;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i87));
                    i88 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i88)) {
                    columnIndexOrThrow86 = i88;
                    i89 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i88;
                    text64 = sQLiteStatementPrepare.getText(i88);
                    i89 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    columnIndexOrThrow87 = i89;
                    i90 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i89;
                    text65 = sQLiteStatementPrepare.getText(i89);
                    i90 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i90)) {
                    columnIndexOrThrow88 = i90;
                    i91 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i90;
                    text66 = sQLiteStatementPrepare.getText(i90);
                    i91 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow89 = i91;
                    i92 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i91;
                    text67 = sQLiteStatementPrepare.getText(i91);
                    i92 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow90 = i92;
                    i93 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i92;
                    text68 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow91 = i93;
                    i94 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i93;
                    text69 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow92 = i94;
                    i95 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i94;
                    text70 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = null;
                } else {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i95));
                }
                if (numValueOf7 == null) {
                    i98 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i98 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i98)) {
                    i99 = i85;
                    numValueOf8 = null;
                } else {
                    i99 = i85;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i98));
                }
                if (numValueOf8 == null) {
                    i100 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i100 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i100)) {
                    i101 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i100));
                    i101 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i101)) {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = null;
                } else {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i101));
                }
                if (numValueOf9 == null) {
                    i104 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i104 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i104)) {
                    i105 = i101;
                    numValueOf10 = null;
                } else {
                    i105 = i101;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i104));
                }
                if (numValueOf10 == null) {
                    i106 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i106 = columnIndexOrThrow98;
                }
                int i135 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                long j3 = sQLiteStatementPrepare.getLong(i135);
                int i136 = i95;
                int i137 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i137);
                columnIndexOrThrow100 = i137;
                int i138 = i104;
                int i139 = columnIndexOrThrow101;
                int i140 = i106;
                int i141 = (int) sQLiteStatementPrepare.getLong(i139);
                int i142 = columnIndexOrThrow102;
                int i143 = i16;
                if (((int) sQLiteStatementPrepare.getLong(i142)) != 0) {
                    i107 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i107 = columnIndexOrThrow103;
                    z = false;
                }
                int i144 = columnIndexOrThrow104;
                int i145 = i107;
                C11571cTe c11571cTe = new C11571cTe(text, i108, text71, j, text72, text2, i109, i111, i113, i115, i117, text3, text4, i118, i122, j2, i126, i17, text5, i13, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i141, z, (int) sQLiteStatementPrepare.getLong(i107), (int) sQLiteStatementPrepare.getLong(i144), text43, text44, text45, text46);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(c11571cTe);
                columnIndexOrThrow10 = i125;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow13 = i132;
                columnIndexOrThrow20 = i10;
                columnIndexOrThrow23 = i20;
                columnIndexOrThrow25 = i26;
                columnIndexOrThrow26 = i27;
                columnIndexOrThrow24 = i29;
                columnIndexOrThrow31 = i32;
                columnIndexOrThrow32 = i80;
                columnIndexOrThrow33 = i81;
                columnIndexOrThrow34 = i83;
                columnIndexOrThrow81 = i86;
                columnIndexOrThrow82 = i96;
                columnIndexOrThrow83 = i97;
                columnIndexOrThrow84 = i99;
                columnIndexOrThrow94 = i102;
                columnIndexOrThrow95 = i103;
                columnIndexOrThrow96 = i105;
                columnIndexOrThrow93 = i136;
                columnIndexOrThrow97 = i138;
                columnIndexOrThrow98 = i140;
                columnIndexOrThrow9 = i6;
                columnIndexOrThrow99 = i135;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i110;
                columnIndexOrThrow5 = i112;
                columnIndexOrThrow6 = i114;
                columnIndexOrThrow7 = i116;
                columnIndexOrThrow8 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow12 = i127;
                columnIndexOrThrow19 = i7;
                columnIndexOrThrow21 = i14;
                columnIndexOrThrow101 = i139;
                columnIndexOrThrow = i120;
                columnIndexOrThrow15 = i121;
                columnIndexOrThrow16 = i123;
                int i146 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i146;
                columnIndexOrThrow104 = i144;
                columnIndexOrThrow11 = i129;
                columnIndexOrThrow18 = i143;
                columnIndexOrThrow102 = i142;
                columnIndexOrThrow103 = i145;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<C11571cTe> copydefault() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.uzCIH((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List uzCIH(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        java.lang.String text5;
        int i8;
        int i9;
        java.lang.String text6;
        int i10;
        int i11;
        java.lang.String text7;
        int i12;
        int i13;
        int i14;
        java.lang.Integer numValueOf;
        int i15;
        int i16;
        int i17;
        java.lang.Integer numValueOf2;
        int i18;
        java.lang.String text8;
        int i19;
        java.lang.String text9;
        int i20;
        int i21;
        java.lang.String text10;
        int i22;
        java.lang.String text11;
        int i23;
        java.lang.String text12;
        int i24;
        java.lang.String text13;
        int i25;
        int i26;
        int i27;
        java.lang.Integer numValueOf3;
        int i28;
        int i29;
        java.lang.Integer numValueOf4;
        int i30;
        java.lang.String text14;
        int i31;
        java.lang.String text15;
        int i32;
        int i33;
        java.lang.String text16;
        int i34;
        java.lang.String text17;
        int i35;
        java.lang.String text18;
        int i36;
        java.lang.String text19;
        int i37;
        java.lang.String text20;
        int i38;
        java.lang.String text21;
        int i39;
        java.lang.String text22;
        int i40;
        java.lang.String text23;
        int i41;
        java.lang.String text24;
        int i42;
        java.lang.String text25;
        int i43;
        java.lang.String text26;
        int i44;
        java.lang.String text27;
        int i45;
        java.lang.String text28;
        int i46;
        java.lang.String text29;
        int i47;
        java.lang.String text30;
        int i48;
        java.lang.String text31;
        int i49;
        java.lang.String text32;
        int i50;
        java.lang.String text33;
        int i51;
        java.lang.String text34;
        int i52;
        java.lang.String text35;
        int i53;
        java.lang.String text36;
        int i54;
        java.lang.String text37;
        int i55;
        java.lang.String text38;
        int i56;
        java.lang.String text39;
        int i57;
        java.lang.String text40;
        int i58;
        java.lang.String text41;
        int i59;
        java.lang.String text42;
        int i60;
        java.lang.String text43;
        int i61;
        java.lang.String text44;
        int i62;
        java.lang.String text45;
        int i63;
        java.lang.String text46;
        int i64;
        java.lang.String text47;
        int i65;
        java.lang.String text48;
        int i66;
        java.lang.String text49;
        int i67;
        java.lang.String text50;
        int i68;
        java.lang.String text51;
        int i69;
        java.lang.String text52;
        int i70;
        java.lang.String text53;
        int i71;
        java.lang.String text54;
        int i72;
        java.lang.String text55;
        int i73;
        java.lang.String text56;
        int i74;
        java.lang.String text57;
        int i75;
        java.lang.String text58;
        int i76;
        java.lang.String text59;
        int i77;
        java.lang.String text60;
        int i78;
        java.lang.String text61;
        int i79;
        int i80;
        int i81;
        java.lang.Integer numValueOf5;
        int i82;
        int i83;
        java.lang.Integer numValueOf6;
        int i84;
        java.lang.String text62;
        int i85;
        java.lang.String text63;
        int i86;
        int i87;
        java.lang.Long lValueOf;
        int i88;
        java.lang.String text64;
        int i89;
        java.lang.String text65;
        int i90;
        java.lang.String text66;
        int i91;
        java.lang.String text67;
        int i92;
        java.lang.String text68;
        int i93;
        java.lang.String text69;
        int i94;
        java.lang.String text70;
        int i95;
        int i96;
        int i97;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i98;
        int i99;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i100;
        java.lang.Long lValueOf2;
        int i101;
        int i102;
        int i103;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i104;
        int i105;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i106;
        int i107;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView ORDER BY orderValue,rootWalletId");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
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
                int i108 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i109 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i110 = columnIndexOrThrow4;
                int i111 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i112 = columnIndexOrThrow5;
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i114 = columnIndexOrThrow6;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i116 = columnIndexOrThrow7;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i4 = columnIndexOrThrow8;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i4 = columnIndexOrThrow8;
                }
                int i118 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                int i119 = i;
                if (sQLiteStatementPrepare.isNull(i119)) {
                    i5 = i119;
                    i6 = columnIndexOrThrow9;
                    text4 = null;
                } else {
                    i5 = i119;
                    text4 = sQLiteStatementPrepare.getText(i119);
                    i6 = columnIndexOrThrow9;
                }
                int i120 = columnIndexOrThrow;
                int i121 = columnIndexOrThrow15;
                int i122 = (int) sQLiteStatementPrepare.getLong(i121);
                int i123 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i123);
                int i124 = columnIndexOrThrow17;
                int i125 = columnIndexOrThrow10;
                int i126 = (int) sQLiteStatementPrepare.getLong(i124);
                int i127 = columnIndexOrThrow12;
                int i128 = columnIndexOrThrow18;
                int i129 = columnIndexOrThrow11;
                int i130 = (int) sQLiteStatementPrepare.getLong(i128);
                int i131 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i131)) {
                    i8 = i124;
                    i7 = i131;
                    i9 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i7 = i131;
                    text5 = sQLiteStatementPrepare.getText(i131);
                    i8 = i124;
                    i9 = columnIndexOrThrow20;
                }
                int i132 = columnIndexOrThrow13;
                int i133 = (int) sQLiteStatementPrepare.getLong(i9);
                int i134 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i134)) {
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i134);
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i11);
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i133;
                    i14 = i134;
                    i15 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i13 = i133;
                    i14 = i134;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i12));
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i16 = i128;
                    i17 = i130;
                    i18 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i16 = i128;
                    i17 = i130;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i15));
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i19);
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    columnIndexOrThrow27 = i21;
                    i22 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i21;
                    text10 = sQLiteStatementPrepare.getText(i21);
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    columnIndexOrThrow28 = i22;
                    i23 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i22;
                    text11 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    columnIndexOrThrow29 = i23;
                    i24 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i23;
                    text12 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    columnIndexOrThrow30 = i24;
                    i25 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i24;
                    text13 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = i18;
                    i27 = i19;
                    i28 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i26 = i18;
                    i27 = i19;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i25));
                    i28 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = i15;
                    i30 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i29 = i15;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i28));
                    i30 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i30);
                    i31 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i31)) {
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i31);
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    columnIndexOrThrow35 = i33;
                    i34 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i33;
                    text16 = sQLiteStatementPrepare.getText(i33);
                    i34 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow36 = i34;
                    i35 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i34;
                    text17 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow37 = i35;
                    i36 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i35;
                    text18 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    columnIndexOrThrow38 = i36;
                    i37 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i36;
                    text19 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow39 = i37;
                    i38 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i37;
                    text20 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow40 = i38;
                    i39 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i38;
                    text21 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow41 = i39;
                    i40 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i39;
                    text22 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow42 = i40;
                    i41 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i40;
                    text23 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow43 = i41;
                    i42 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i41;
                    text24 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow44 = i42;
                    i43 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i42;
                    text25 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow45 = i43;
                    i44 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i43;
                    text26 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow46 = i44;
                    i45 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i44;
                    text27 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow47 = i45;
                    i46 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i45;
                    text28 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow48 = i46;
                    i47 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i46;
                    text29 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow49 = i47;
                    i48 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i47;
                    text30 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow50 = i48;
                    i49 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i48;
                    text31 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow51 = i49;
                    i50 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i49;
                    text32 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow52 = i50;
                    i51 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i50;
                    text33 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow53 = i51;
                    i52 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i51;
                    text34 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow54 = i52;
                    i53 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i52;
                    text35 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow55 = i53;
                    i54 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i53;
                    text36 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow56 = i54;
                    i55 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i54;
                    text37 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow57 = i55;
                    i56 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i55;
                    text38 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow58 = i56;
                    i57 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i56;
                    text39 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow59 = i57;
                    i58 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i57;
                    text40 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow60 = i58;
                    i59 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i58;
                    text41 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow61 = i59;
                    i60 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i59;
                    text42 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow62 = i60;
                    i61 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i60;
                    text43 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow63 = i61;
                    i62 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i61;
                    text44 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow64 = i62;
                    i63 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i62;
                    text45 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow65 = i63;
                    i64 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i63;
                    text46 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow66 = i64;
                    i65 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i64;
                    text47 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow67 = i65;
                    i66 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i65;
                    text48 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow68 = i66;
                    i67 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i66;
                    text49 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow69 = i67;
                    i68 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i67;
                    text50 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow70 = i68;
                    i69 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i68;
                    text51 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow71 = i69;
                    i70 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i69;
                    text52 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow72 = i70;
                    i71 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i70;
                    text53 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow73 = i71;
                    i72 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i71;
                    text54 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow74 = i72;
                    i73 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i72;
                    text55 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow75 = i73;
                    i74 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i73;
                    text56 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow76 = i74;
                    i75 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i74;
                    text57 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow77 = i75;
                    i76 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i75;
                    text58 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow78 = i76;
                    i77 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i76;
                    text59 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow79 = i77;
                    i78 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i77;
                    text60 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow80 = i78;
                    i79 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i78;
                    text61 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    i80 = i28;
                    i81 = i30;
                    i82 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i80 = i28;
                    i81 = i30;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i79));
                    i82 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i82)) {
                    i83 = i31;
                    i84 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i83 = i31;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i82));
                    i84 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i84)) {
                    i85 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i84);
                    i85 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i85)) {
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i85);
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i87)) {
                    columnIndexOrThrow85 = i87;
                    i88 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i87;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i87));
                    i88 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i88)) {
                    columnIndexOrThrow86 = i88;
                    i89 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i88;
                    text64 = sQLiteStatementPrepare.getText(i88);
                    i89 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    columnIndexOrThrow87 = i89;
                    i90 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i89;
                    text65 = sQLiteStatementPrepare.getText(i89);
                    i90 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i90)) {
                    columnIndexOrThrow88 = i90;
                    i91 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i90;
                    text66 = sQLiteStatementPrepare.getText(i90);
                    i91 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow89 = i91;
                    i92 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i91;
                    text67 = sQLiteStatementPrepare.getText(i91);
                    i92 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow90 = i92;
                    i93 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i92;
                    text68 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow91 = i93;
                    i94 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i93;
                    text69 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow92 = i94;
                    i95 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i94;
                    text70 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = null;
                } else {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i95));
                }
                if (numValueOf7 == null) {
                    i98 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i98 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i98)) {
                    i99 = i85;
                    numValueOf8 = null;
                } else {
                    i99 = i85;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i98));
                }
                if (numValueOf8 == null) {
                    i100 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i100 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i100)) {
                    i101 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i100));
                    i101 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i101)) {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = null;
                } else {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i101));
                }
                if (numValueOf9 == null) {
                    i104 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i104 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i104)) {
                    i105 = i101;
                    numValueOf10 = null;
                } else {
                    i105 = i101;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i104));
                }
                if (numValueOf10 == null) {
                    i106 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i106 = columnIndexOrThrow98;
                }
                int i135 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                long j3 = sQLiteStatementPrepare.getLong(i135);
                int i136 = i95;
                int i137 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i137);
                columnIndexOrThrow100 = i137;
                int i138 = i104;
                int i139 = columnIndexOrThrow101;
                int i140 = i106;
                int i141 = (int) sQLiteStatementPrepare.getLong(i139);
                int i142 = columnIndexOrThrow102;
                int i143 = i16;
                if (((int) sQLiteStatementPrepare.getLong(i142)) != 0) {
                    i107 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i107 = columnIndexOrThrow103;
                    z = false;
                }
                int i144 = columnIndexOrThrow104;
                int i145 = i107;
                C11571cTe c11571cTe = new C11571cTe(text, i108, text71, j, text72, text2, i109, i111, i113, i115, i117, text3, text4, i118, i122, j2, i126, i17, text5, i13, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i141, z, (int) sQLiteStatementPrepare.getLong(i107), (int) sQLiteStatementPrepare.getLong(i144), text43, text44, text45, text46);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(c11571cTe);
                columnIndexOrThrow10 = i125;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow13 = i132;
                columnIndexOrThrow20 = i10;
                columnIndexOrThrow23 = i20;
                columnIndexOrThrow25 = i26;
                columnIndexOrThrow26 = i27;
                columnIndexOrThrow24 = i29;
                columnIndexOrThrow31 = i32;
                columnIndexOrThrow32 = i80;
                columnIndexOrThrow33 = i81;
                columnIndexOrThrow34 = i83;
                columnIndexOrThrow81 = i86;
                columnIndexOrThrow82 = i96;
                columnIndexOrThrow83 = i97;
                columnIndexOrThrow84 = i99;
                columnIndexOrThrow94 = i102;
                columnIndexOrThrow95 = i103;
                columnIndexOrThrow96 = i105;
                columnIndexOrThrow93 = i136;
                columnIndexOrThrow97 = i138;
                columnIndexOrThrow98 = i140;
                columnIndexOrThrow9 = i6;
                columnIndexOrThrow99 = i135;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i110;
                columnIndexOrThrow5 = i112;
                columnIndexOrThrow6 = i114;
                columnIndexOrThrow7 = i116;
                columnIndexOrThrow8 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow12 = i127;
                columnIndexOrThrow19 = i7;
                columnIndexOrThrow21 = i14;
                columnIndexOrThrow101 = i139;
                columnIndexOrThrow = i120;
                columnIndexOrThrow15 = i121;
                columnIndexOrThrow16 = i123;
                int i146 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i146;
                columnIndexOrThrow104 = i144;
                columnIndexOrThrow11 = i129;
                columnIndexOrThrow18 = i143;
                columnIndexOrThrow102 = i142;
                columnIndexOrThrow103 = i145;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object KWHzl(Continuation<? super java.util.List<C11571cTe>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cNF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AubY((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List AubY(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        java.lang.String text5;
        int i8;
        int i9;
        java.lang.String text6;
        int i10;
        int i11;
        java.lang.String text7;
        int i12;
        int i13;
        int i14;
        java.lang.Integer numValueOf;
        int i15;
        int i16;
        int i17;
        java.lang.Integer numValueOf2;
        int i18;
        java.lang.String text8;
        int i19;
        java.lang.String text9;
        int i20;
        int i21;
        java.lang.String text10;
        int i22;
        java.lang.String text11;
        int i23;
        java.lang.String text12;
        int i24;
        java.lang.String text13;
        int i25;
        int i26;
        int i27;
        java.lang.Integer numValueOf3;
        int i28;
        int i29;
        java.lang.Integer numValueOf4;
        int i30;
        java.lang.String text14;
        int i31;
        java.lang.String text15;
        int i32;
        int i33;
        java.lang.String text16;
        int i34;
        java.lang.String text17;
        int i35;
        java.lang.String text18;
        int i36;
        java.lang.String text19;
        int i37;
        java.lang.String text20;
        int i38;
        java.lang.String text21;
        int i39;
        java.lang.String text22;
        int i40;
        java.lang.String text23;
        int i41;
        java.lang.String text24;
        int i42;
        java.lang.String text25;
        int i43;
        java.lang.String text26;
        int i44;
        java.lang.String text27;
        int i45;
        java.lang.String text28;
        int i46;
        java.lang.String text29;
        int i47;
        java.lang.String text30;
        int i48;
        java.lang.String text31;
        int i49;
        java.lang.String text32;
        int i50;
        java.lang.String text33;
        int i51;
        java.lang.String text34;
        int i52;
        java.lang.String text35;
        int i53;
        java.lang.String text36;
        int i54;
        java.lang.String text37;
        int i55;
        java.lang.String text38;
        int i56;
        java.lang.String text39;
        int i57;
        java.lang.String text40;
        int i58;
        java.lang.String text41;
        int i59;
        java.lang.String text42;
        int i60;
        java.lang.String text43;
        int i61;
        java.lang.String text44;
        int i62;
        java.lang.String text45;
        int i63;
        java.lang.String text46;
        int i64;
        java.lang.String text47;
        int i65;
        java.lang.String text48;
        int i66;
        java.lang.String text49;
        int i67;
        java.lang.String text50;
        int i68;
        java.lang.String text51;
        int i69;
        java.lang.String text52;
        int i70;
        java.lang.String text53;
        int i71;
        java.lang.String text54;
        int i72;
        java.lang.String text55;
        int i73;
        java.lang.String text56;
        int i74;
        java.lang.String text57;
        int i75;
        java.lang.String text58;
        int i76;
        java.lang.String text59;
        int i77;
        java.lang.String text60;
        int i78;
        java.lang.String text61;
        int i79;
        int i80;
        int i81;
        java.lang.Integer numValueOf5;
        int i82;
        int i83;
        java.lang.Integer numValueOf6;
        int i84;
        java.lang.String text62;
        int i85;
        java.lang.String text63;
        int i86;
        int i87;
        java.lang.Long lValueOf;
        int i88;
        java.lang.String text64;
        int i89;
        java.lang.String text65;
        int i90;
        java.lang.String text66;
        int i91;
        java.lang.String text67;
        int i92;
        java.lang.String text68;
        int i93;
        java.lang.String text69;
        int i94;
        java.lang.String text70;
        int i95;
        int i96;
        int i97;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i98;
        int i99;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i100;
        java.lang.Long lValueOf2;
        int i101;
        int i102;
        int i103;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i104;
        int i105;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i106;
        int i107;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView ORDER BY orderValue,rootWalletId");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
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
                int i108 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i109 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i110 = columnIndexOrThrow4;
                int i111 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i112 = columnIndexOrThrow5;
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i114 = columnIndexOrThrow6;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i116 = columnIndexOrThrow7;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i4 = columnIndexOrThrow8;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i4 = columnIndexOrThrow8;
                }
                int i118 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                int i119 = i;
                if (sQLiteStatementPrepare.isNull(i119)) {
                    i5 = i119;
                    i6 = columnIndexOrThrow9;
                    text4 = null;
                } else {
                    i5 = i119;
                    text4 = sQLiteStatementPrepare.getText(i119);
                    i6 = columnIndexOrThrow9;
                }
                int i120 = columnIndexOrThrow;
                int i121 = columnIndexOrThrow15;
                int i122 = (int) sQLiteStatementPrepare.getLong(i121);
                int i123 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i123);
                int i124 = columnIndexOrThrow17;
                int i125 = columnIndexOrThrow10;
                int i126 = (int) sQLiteStatementPrepare.getLong(i124);
                int i127 = columnIndexOrThrow12;
                int i128 = columnIndexOrThrow18;
                int i129 = columnIndexOrThrow11;
                int i130 = (int) sQLiteStatementPrepare.getLong(i128);
                int i131 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i131)) {
                    i8 = i124;
                    i7 = i131;
                    i9 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i7 = i131;
                    text5 = sQLiteStatementPrepare.getText(i131);
                    i8 = i124;
                    i9 = columnIndexOrThrow20;
                }
                int i132 = columnIndexOrThrow13;
                int i133 = (int) sQLiteStatementPrepare.getLong(i9);
                int i134 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i134)) {
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i134);
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i11);
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i133;
                    i14 = i134;
                    i15 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i13 = i133;
                    i14 = i134;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i12));
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i16 = i128;
                    i17 = i130;
                    i18 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i16 = i128;
                    i17 = i130;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i15));
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i19);
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    columnIndexOrThrow27 = i21;
                    i22 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i21;
                    text10 = sQLiteStatementPrepare.getText(i21);
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    columnIndexOrThrow28 = i22;
                    i23 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i22;
                    text11 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    columnIndexOrThrow29 = i23;
                    i24 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i23;
                    text12 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    columnIndexOrThrow30 = i24;
                    i25 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i24;
                    text13 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = i18;
                    i27 = i19;
                    i28 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i26 = i18;
                    i27 = i19;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i25));
                    i28 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = i15;
                    i30 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i29 = i15;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i28));
                    i30 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i30);
                    i31 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i31)) {
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i31);
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    columnIndexOrThrow35 = i33;
                    i34 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i33;
                    text16 = sQLiteStatementPrepare.getText(i33);
                    i34 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow36 = i34;
                    i35 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i34;
                    text17 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow37 = i35;
                    i36 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i35;
                    text18 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    columnIndexOrThrow38 = i36;
                    i37 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i36;
                    text19 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow39 = i37;
                    i38 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i37;
                    text20 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow40 = i38;
                    i39 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i38;
                    text21 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow41 = i39;
                    i40 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i39;
                    text22 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow42 = i40;
                    i41 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i40;
                    text23 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow43 = i41;
                    i42 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i41;
                    text24 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow44 = i42;
                    i43 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i42;
                    text25 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow45 = i43;
                    i44 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i43;
                    text26 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow46 = i44;
                    i45 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i44;
                    text27 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow47 = i45;
                    i46 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i45;
                    text28 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow48 = i46;
                    i47 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i46;
                    text29 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow49 = i47;
                    i48 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i47;
                    text30 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow50 = i48;
                    i49 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i48;
                    text31 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow51 = i49;
                    i50 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i49;
                    text32 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow52 = i50;
                    i51 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i50;
                    text33 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow53 = i51;
                    i52 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i51;
                    text34 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow54 = i52;
                    i53 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i52;
                    text35 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow55 = i53;
                    i54 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i53;
                    text36 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow56 = i54;
                    i55 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i54;
                    text37 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow57 = i55;
                    i56 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i55;
                    text38 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow58 = i56;
                    i57 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i56;
                    text39 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow59 = i57;
                    i58 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i57;
                    text40 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow60 = i58;
                    i59 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i58;
                    text41 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow61 = i59;
                    i60 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i59;
                    text42 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow62 = i60;
                    i61 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i60;
                    text43 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow63 = i61;
                    i62 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i61;
                    text44 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow64 = i62;
                    i63 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i62;
                    text45 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow65 = i63;
                    i64 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i63;
                    text46 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow66 = i64;
                    i65 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i64;
                    text47 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow67 = i65;
                    i66 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i65;
                    text48 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow68 = i66;
                    i67 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i66;
                    text49 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow69 = i67;
                    i68 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i67;
                    text50 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow70 = i68;
                    i69 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i68;
                    text51 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow71 = i69;
                    i70 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i69;
                    text52 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow72 = i70;
                    i71 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i70;
                    text53 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow73 = i71;
                    i72 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i71;
                    text54 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow74 = i72;
                    i73 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i72;
                    text55 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow75 = i73;
                    i74 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i73;
                    text56 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow76 = i74;
                    i75 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i74;
                    text57 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow77 = i75;
                    i76 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i75;
                    text58 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow78 = i76;
                    i77 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i76;
                    text59 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow79 = i77;
                    i78 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i77;
                    text60 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow80 = i78;
                    i79 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i78;
                    text61 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    i80 = i28;
                    i81 = i30;
                    i82 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i80 = i28;
                    i81 = i30;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i79));
                    i82 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i82)) {
                    i83 = i31;
                    i84 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i83 = i31;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i82));
                    i84 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i84)) {
                    i85 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i84);
                    i85 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i85)) {
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i85);
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i87)) {
                    columnIndexOrThrow85 = i87;
                    i88 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i87;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i87));
                    i88 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i88)) {
                    columnIndexOrThrow86 = i88;
                    i89 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i88;
                    text64 = sQLiteStatementPrepare.getText(i88);
                    i89 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    columnIndexOrThrow87 = i89;
                    i90 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i89;
                    text65 = sQLiteStatementPrepare.getText(i89);
                    i90 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i90)) {
                    columnIndexOrThrow88 = i90;
                    i91 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i90;
                    text66 = sQLiteStatementPrepare.getText(i90);
                    i91 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow89 = i91;
                    i92 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i91;
                    text67 = sQLiteStatementPrepare.getText(i91);
                    i92 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow90 = i92;
                    i93 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i92;
                    text68 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow91 = i93;
                    i94 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i93;
                    text69 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow92 = i94;
                    i95 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i94;
                    text70 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = null;
                } else {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i95));
                }
                if (numValueOf7 == null) {
                    i98 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i98 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i98)) {
                    i99 = i85;
                    numValueOf8 = null;
                } else {
                    i99 = i85;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i98));
                }
                if (numValueOf8 == null) {
                    i100 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i100 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i100)) {
                    i101 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i100));
                    i101 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i101)) {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = null;
                } else {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i101));
                }
                if (numValueOf9 == null) {
                    i104 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i104 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i104)) {
                    i105 = i101;
                    numValueOf10 = null;
                } else {
                    i105 = i101;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i104));
                }
                if (numValueOf10 == null) {
                    i106 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i106 = columnIndexOrThrow98;
                }
                int i135 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                long j3 = sQLiteStatementPrepare.getLong(i135);
                int i136 = i95;
                int i137 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i137);
                columnIndexOrThrow100 = i137;
                int i138 = i104;
                int i139 = columnIndexOrThrow101;
                int i140 = i106;
                int i141 = (int) sQLiteStatementPrepare.getLong(i139);
                int i142 = columnIndexOrThrow102;
                int i143 = i16;
                if (((int) sQLiteStatementPrepare.getLong(i142)) != 0) {
                    i107 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i107 = columnIndexOrThrow103;
                    z = false;
                }
                int i144 = columnIndexOrThrow104;
                int i145 = i107;
                C11571cTe c11571cTe = new C11571cTe(text, i108, text71, j, text72, text2, i109, i111, i113, i115, i117, text3, text4, i118, i122, j2, i126, i17, text5, i13, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i141, z, (int) sQLiteStatementPrepare.getLong(i107), (int) sQLiteStatementPrepare.getLong(i144), text43, text44, text45, text46);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(c11571cTe);
                columnIndexOrThrow10 = i125;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow13 = i132;
                columnIndexOrThrow20 = i10;
                columnIndexOrThrow23 = i20;
                columnIndexOrThrow25 = i26;
                columnIndexOrThrow26 = i27;
                columnIndexOrThrow24 = i29;
                columnIndexOrThrow31 = i32;
                columnIndexOrThrow32 = i80;
                columnIndexOrThrow33 = i81;
                columnIndexOrThrow34 = i83;
                columnIndexOrThrow81 = i86;
                columnIndexOrThrow82 = i96;
                columnIndexOrThrow83 = i97;
                columnIndexOrThrow84 = i99;
                columnIndexOrThrow94 = i102;
                columnIndexOrThrow95 = i103;
                columnIndexOrThrow96 = i105;
                columnIndexOrThrow93 = i136;
                columnIndexOrThrow97 = i138;
                columnIndexOrThrow98 = i140;
                columnIndexOrThrow9 = i6;
                columnIndexOrThrow99 = i135;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i110;
                columnIndexOrThrow5 = i112;
                columnIndexOrThrow6 = i114;
                columnIndexOrThrow7 = i116;
                columnIndexOrThrow8 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow12 = i127;
                columnIndexOrThrow19 = i7;
                columnIndexOrThrow21 = i14;
                columnIndexOrThrow101 = i139;
                columnIndexOrThrow = i120;
                columnIndexOrThrow15 = i121;
                columnIndexOrThrow16 = i123;
                int i146 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i146;
                columnIndexOrThrow104 = i144;
                columnIndexOrThrow11 = i129;
                columnIndexOrThrow18 = i143;
                columnIndexOrThrow102 = i142;
                columnIndexOrThrow103 = i145;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<C11571cTe> EZpvd(final int i, final int i2) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.KWHzl(i, i2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(int i, int i2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i3;
        java.lang.String text;
        int i4;
        int i5;
        java.lang.String text2;
        int i6;
        java.lang.String text3;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.String text4;
        int i11;
        java.lang.String text5;
        int i12;
        int i13;
        java.lang.String text6;
        int i14;
        int i15;
        java.lang.String text7;
        int i16;
        int i17;
        int i18;
        java.lang.Integer numValueOf;
        int i19;
        int i20;
        int i21;
        java.lang.Integer numValueOf2;
        int i22;
        java.lang.String text8;
        int i23;
        java.lang.String text9;
        int i24;
        int i25;
        java.lang.String text10;
        int i26;
        java.lang.String text11;
        int i27;
        java.lang.String text12;
        int i28;
        java.lang.String text13;
        int i29;
        int i30;
        int i31;
        java.lang.Integer numValueOf3;
        int i32;
        int i33;
        java.lang.Integer numValueOf4;
        int i34;
        java.lang.String text14;
        int i35;
        java.lang.String text15;
        int i36;
        int i37;
        java.lang.String text16;
        int i38;
        java.lang.String text17;
        int i39;
        java.lang.String text18;
        int i40;
        java.lang.String text19;
        int i41;
        java.lang.String text20;
        int i42;
        java.lang.String text21;
        int i43;
        java.lang.String text22;
        int i44;
        java.lang.String text23;
        int i45;
        java.lang.String text24;
        int i46;
        java.lang.String text25;
        int i47;
        java.lang.String text26;
        int i48;
        java.lang.String text27;
        int i49;
        java.lang.String text28;
        int i50;
        java.lang.String text29;
        int i51;
        java.lang.String text30;
        int i52;
        java.lang.String text31;
        int i53;
        java.lang.String text32;
        int i54;
        java.lang.String text33;
        int i55;
        java.lang.String text34;
        int i56;
        java.lang.String text35;
        int i57;
        java.lang.String text36;
        int i58;
        java.lang.String text37;
        int i59;
        java.lang.String text38;
        int i60;
        java.lang.String text39;
        int i61;
        java.lang.String text40;
        int i62;
        java.lang.String text41;
        int i63;
        java.lang.String text42;
        int i64;
        java.lang.String text43;
        int i65;
        java.lang.String text44;
        int i66;
        java.lang.String text45;
        int i67;
        java.lang.String text46;
        int i68;
        java.lang.String text47;
        int i69;
        java.lang.String text48;
        int i70;
        java.lang.String text49;
        int i71;
        java.lang.String text50;
        int i72;
        java.lang.String text51;
        int i73;
        java.lang.String text52;
        int i74;
        java.lang.String text53;
        int i75;
        java.lang.String text54;
        int i76;
        java.lang.String text55;
        int i77;
        java.lang.String text56;
        int i78;
        java.lang.String text57;
        int i79;
        java.lang.String text58;
        int i80;
        java.lang.String text59;
        int i81;
        java.lang.String text60;
        int i82;
        java.lang.String text61;
        int i83;
        int i84;
        int i85;
        java.lang.Integer numValueOf5;
        int i86;
        int i87;
        java.lang.Integer numValueOf6;
        int i88;
        java.lang.String text62;
        int i89;
        java.lang.String text63;
        int i90;
        int i91;
        java.lang.Long lValueOf;
        int i92;
        java.lang.String text64;
        int i93;
        java.lang.String text65;
        int i94;
        java.lang.String text66;
        int i95;
        java.lang.String text67;
        int i96;
        java.lang.String text68;
        int i97;
        java.lang.String text69;
        int i98;
        java.lang.String text70;
        int i99;
        int i100;
        int i101;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i102;
        int i103;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i104;
        java.lang.Long lValueOf2;
        int i105;
        int i106;
        int i107;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i108;
        int i109;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i110;
        int i111;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView WHERE type = ? AND eoaWalletType = ? ORDER BY orderValue,rootWalletId");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            sQLiteStatementPrepare.mo5793bindLong(2, i2);
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i4 = columnIndexOrThrow13;
                    i3 = columnIndexOrThrow14;
                    text = null;
                } else {
                    i3 = columnIndexOrThrow14;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i4 = columnIndexOrThrow13;
                }
                int i112 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i6 = columnIndexOrThrow;
                    i5 = columnIndexOrThrow2;
                    text2 = null;
                } else {
                    i5 = columnIndexOrThrow2;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i6 = columnIndexOrThrow;
                }
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i114 = columnIndexOrThrow3;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i116 = columnIndexOrThrow4;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i118 = columnIndexOrThrow5;
                int i119 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i120 = columnIndexOrThrow6;
                int i121 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i7 = columnIndexOrThrow8;
                    i8 = i4;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i7 = columnIndexOrThrow8;
                    i8 = i4;
                }
                int i122 = columnIndexOrThrow7;
                int i123 = (int) sQLiteStatementPrepare.getLong(i8);
                int i124 = i3;
                if (sQLiteStatementPrepare.isNull(i124)) {
                    i9 = i8;
                    i10 = i124;
                    text4 = null;
                } else {
                    i9 = i8;
                    i10 = i124;
                    text4 = sQLiteStatementPrepare.getText(i124);
                }
                int i125 = columnIndexOrThrow15;
                int i126 = columnIndexOrThrow9;
                int i127 = (int) sQLiteStatementPrepare.getLong(i125);
                int i128 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i128);
                int i129 = columnIndexOrThrow17;
                int i130 = columnIndexOrThrow10;
                int i131 = (int) sQLiteStatementPrepare.getLong(i129);
                int i132 = columnIndexOrThrow12;
                int i133 = columnIndexOrThrow18;
                int i134 = columnIndexOrThrow11;
                int i135 = (int) sQLiteStatementPrepare.getLong(i133);
                int i136 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i136)) {
                    i12 = i129;
                    i11 = i135;
                    i13 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i11 = i135;
                    text5 = sQLiteStatementPrepare.getText(i136);
                    i12 = i129;
                    i13 = columnIndexOrThrow20;
                }
                int i137 = (int) sQLiteStatementPrepare.getLong(i13);
                int i138 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i138)) {
                    i14 = i13;
                    i15 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i138);
                    i14 = i13;
                    i15 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow22 = i15;
                    i16 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i15);
                    columnIndexOrThrow22 = i15;
                    i16 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    i17 = i138;
                    i18 = i136;
                    i19 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i17 = i138;
                    i18 = i136;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i16));
                    i19 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i131;
                    i21 = i137;
                    i22 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i20 = i131;
                    i21 = i137;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i19));
                    i22 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i23 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i24 = i16;
                    i25 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i23);
                    i24 = i16;
                    i25 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    columnIndexOrThrow27 = i25;
                    i26 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i25;
                    text10 = sQLiteStatementPrepare.getText(i25);
                    i26 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i26)) {
                    columnIndexOrThrow28 = i26;
                    i27 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i26;
                    text11 = sQLiteStatementPrepare.getText(i26);
                    i27 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i27)) {
                    columnIndexOrThrow29 = i27;
                    i28 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i27;
                    text12 = sQLiteStatementPrepare.getText(i27);
                    i28 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    columnIndexOrThrow30 = i28;
                    i29 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i28;
                    text13 = sQLiteStatementPrepare.getText(i28);
                    i29 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i29)) {
                    i30 = i22;
                    i31 = i23;
                    i32 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i30 = i22;
                    i31 = i23;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i29));
                    i32 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i32)) {
                    i33 = i19;
                    i34 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i33 = i19;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i32));
                    i34 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    i35 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i36 = i29;
                    i37 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i35);
                    i36 = i29;
                    i37 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow35 = i37;
                    i38 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i37;
                    text16 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow36 = i38;
                    i39 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i38;
                    text17 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow37 = i39;
                    i40 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i39;
                    text18 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow38 = i40;
                    i41 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i40;
                    text19 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow39 = i41;
                    i42 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i41;
                    text20 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow40 = i42;
                    i43 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i42;
                    text21 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow41 = i43;
                    i44 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i43;
                    text22 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow42 = i44;
                    i45 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i44;
                    text23 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow43 = i45;
                    i46 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i45;
                    text24 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow44 = i46;
                    i47 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i46;
                    text25 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow45 = i47;
                    i48 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i47;
                    text26 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow46 = i48;
                    i49 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i48;
                    text27 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow47 = i49;
                    i50 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i49;
                    text28 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow48 = i50;
                    i51 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i50;
                    text29 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow49 = i51;
                    i52 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i51;
                    text30 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow50 = i52;
                    i53 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i52;
                    text31 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow51 = i53;
                    i54 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i53;
                    text32 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow52 = i54;
                    i55 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i54;
                    text33 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow53 = i55;
                    i56 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i55;
                    text34 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow54 = i56;
                    i57 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i56;
                    text35 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow55 = i57;
                    i58 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i57;
                    text36 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow56 = i58;
                    i59 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i58;
                    text37 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow57 = i59;
                    i60 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i59;
                    text38 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow58 = i60;
                    i61 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i60;
                    text39 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow59 = i61;
                    i62 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i61;
                    text40 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow60 = i62;
                    i63 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i62;
                    text41 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow61 = i63;
                    i64 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i63;
                    text42 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow62 = i64;
                    i65 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i64;
                    text43 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow63 = i65;
                    i66 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i65;
                    text44 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow64 = i66;
                    i67 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i66;
                    text45 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow65 = i67;
                    i68 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i67;
                    text46 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow66 = i68;
                    i69 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i68;
                    text47 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow67 = i69;
                    i70 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i69;
                    text48 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow68 = i70;
                    i71 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i70;
                    text49 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow69 = i71;
                    i72 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i71;
                    text50 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow70 = i72;
                    i73 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i72;
                    text51 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow71 = i73;
                    i74 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i73;
                    text52 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow72 = i74;
                    i75 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i74;
                    text53 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow73 = i75;
                    i76 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i75;
                    text54 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow74 = i76;
                    i77 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i76;
                    text55 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow75 = i77;
                    i78 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i77;
                    text56 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow76 = i78;
                    i79 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i78;
                    text57 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    columnIndexOrThrow77 = i79;
                    i80 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i79;
                    text58 = sQLiteStatementPrepare.getText(i79);
                    i80 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i80)) {
                    columnIndexOrThrow78 = i80;
                    i81 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i80;
                    text59 = sQLiteStatementPrepare.getText(i80);
                    i81 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i81)) {
                    columnIndexOrThrow79 = i81;
                    i82 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i81;
                    text60 = sQLiteStatementPrepare.getText(i81);
                    i82 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i82)) {
                    columnIndexOrThrow80 = i82;
                    i83 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i82;
                    text61 = sQLiteStatementPrepare.getText(i82);
                    i83 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i83)) {
                    i84 = i32;
                    i85 = i34;
                    i86 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i84 = i32;
                    i85 = i34;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i83));
                    i86 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i86)) {
                    i87 = i35;
                    i88 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i87 = i35;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i86));
                    i88 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i88)) {
                    i89 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i88);
                    i89 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    i90 = i83;
                    i91 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i89);
                    i90 = i83;
                    i91 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow85 = i91;
                    i92 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i91;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i91));
                    i92 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow86 = i92;
                    i93 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i92;
                    text64 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow87 = i93;
                    i94 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i93;
                    text65 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow88 = i94;
                    i95 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i94;
                    text66 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    columnIndexOrThrow89 = i95;
                    i96 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i95;
                    text67 = sQLiteStatementPrepare.getText(i95);
                    i96 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i96)) {
                    columnIndexOrThrow90 = i96;
                    i97 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i96;
                    text68 = sQLiteStatementPrepare.getText(i96);
                    i97 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i97)) {
                    columnIndexOrThrow91 = i97;
                    i98 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i97;
                    text69 = sQLiteStatementPrepare.getText(i97);
                    i98 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i98)) {
                    columnIndexOrThrow92 = i98;
                    i99 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i98;
                    text70 = sQLiteStatementPrepare.getText(i98);
                    i99 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i99)) {
                    i100 = i86;
                    i101 = i88;
                    numValueOf7 = null;
                } else {
                    i100 = i86;
                    i101 = i88;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i99));
                }
                if (numValueOf7 == null) {
                    i102 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i102 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i102)) {
                    i103 = i89;
                    numValueOf8 = null;
                } else {
                    i103 = i89;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i102));
                }
                if (numValueOf8 == null) {
                    i104 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i104 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i104)) {
                    i105 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i104));
                    i105 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i105)) {
                    i106 = i102;
                    i107 = i104;
                    numValueOf9 = null;
                } else {
                    i106 = i102;
                    i107 = i104;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i105));
                }
                if (numValueOf9 == null) {
                    i108 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i108 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i108)) {
                    i109 = i105;
                    numValueOf10 = null;
                } else {
                    i109 = i105;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i108));
                }
                if (numValueOf10 == null) {
                    i110 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i110 = columnIndexOrThrow98;
                }
                int i139 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i110) ? null : sQLiteStatementPrepare.getText(i110);
                long j3 = sQLiteStatementPrepare.getLong(i139);
                int i140 = i99;
                int i141 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i141);
                columnIndexOrThrow100 = i141;
                int i142 = i108;
                int i143 = columnIndexOrThrow101;
                int i144 = i110;
                int i145 = (int) sQLiteStatementPrepare.getLong(i143);
                int i146 = columnIndexOrThrow102;
                int i147 = i20;
                if (((int) sQLiteStatementPrepare.getLong(i146)) != 0) {
                    i111 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i111 = columnIndexOrThrow103;
                    z = false;
                }
                int i148 = columnIndexOrThrow104;
                int i149 = i111;
                arrayList.add(new C11571cTe(text, i112, text71, j, text72, text2, i113, i115, i117, i119, i121, text3, text4, i123, i127, j2, i147, i11, text5, i21, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i145, z, (int) sQLiteStatementPrepare.getLong(i111), (int) sQLiteStatementPrepare.getLong(i148), text43, text44, text45, text46));
                columnIndexOrThrow9 = i126;
                columnIndexOrThrow15 = i125;
                columnIndexOrThrow = i6;
                columnIndexOrThrow11 = i134;
                columnIndexOrThrow18 = i133;
                columnIndexOrThrow20 = i14;
                columnIndexOrThrow24 = i33;
                columnIndexOrThrow32 = i84;
                columnIndexOrThrow34 = i87;
                columnIndexOrThrow82 = i100;
                columnIndexOrThrow84 = i103;
                columnIndexOrThrow94 = i106;
                columnIndexOrThrow95 = i107;
                columnIndexOrThrow96 = i109;
                columnIndexOrThrow97 = i142;
                columnIndexOrThrow102 = i146;
                columnIndexOrThrow103 = i149;
                columnIndexOrThrow7 = i122;
                columnIndexOrThrow99 = i139;
                columnIndexOrThrow13 = i9;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow3 = i114;
                columnIndexOrThrow4 = i116;
                columnIndexOrThrow5 = i118;
                columnIndexOrThrow8 = i7;
                columnIndexOrThrow14 = i10;
                columnIndexOrThrow16 = i128;
                columnIndexOrThrow12 = i132;
                columnIndexOrThrow21 = i17;
                columnIndexOrThrow104 = i148;
                columnIndexOrThrow10 = i130;
                columnIndexOrThrow17 = i12;
                columnIndexOrThrow19 = i18;
                columnIndexOrThrow23 = i24;
                columnIndexOrThrow25 = i30;
                columnIndexOrThrow26 = i31;
                columnIndexOrThrow31 = i36;
                columnIndexOrThrow33 = i85;
                columnIndexOrThrow81 = i90;
                columnIndexOrThrow83 = i101;
                columnIndexOrThrow93 = i140;
                columnIndexOrThrow98 = i144;
                columnIndexOrThrow101 = i143;
                columnIndexOrThrow6 = i120;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<C11571cTe> AhwBna() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.getFieldNames((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List getFieldNames(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        int i5;
        java.lang.String text4;
        int i6;
        int i7;
        java.lang.String text5;
        int i8;
        int i9;
        java.lang.String text6;
        int i10;
        int i11;
        java.lang.String text7;
        int i12;
        int i13;
        int i14;
        java.lang.Integer numValueOf;
        int i15;
        int i16;
        int i17;
        java.lang.Integer numValueOf2;
        int i18;
        java.lang.String text8;
        int i19;
        java.lang.String text9;
        int i20;
        int i21;
        java.lang.String text10;
        int i22;
        java.lang.String text11;
        int i23;
        java.lang.String text12;
        int i24;
        java.lang.String text13;
        int i25;
        int i26;
        int i27;
        java.lang.Integer numValueOf3;
        int i28;
        int i29;
        java.lang.Integer numValueOf4;
        int i30;
        java.lang.String text14;
        int i31;
        java.lang.String text15;
        int i32;
        int i33;
        java.lang.String text16;
        int i34;
        java.lang.String text17;
        int i35;
        java.lang.String text18;
        int i36;
        java.lang.String text19;
        int i37;
        java.lang.String text20;
        int i38;
        java.lang.String text21;
        int i39;
        java.lang.String text22;
        int i40;
        java.lang.String text23;
        int i41;
        java.lang.String text24;
        int i42;
        java.lang.String text25;
        int i43;
        java.lang.String text26;
        int i44;
        java.lang.String text27;
        int i45;
        java.lang.String text28;
        int i46;
        java.lang.String text29;
        int i47;
        java.lang.String text30;
        int i48;
        java.lang.String text31;
        int i49;
        java.lang.String text32;
        int i50;
        java.lang.String text33;
        int i51;
        java.lang.String text34;
        int i52;
        java.lang.String text35;
        int i53;
        java.lang.String text36;
        int i54;
        java.lang.String text37;
        int i55;
        java.lang.String text38;
        int i56;
        java.lang.String text39;
        int i57;
        java.lang.String text40;
        int i58;
        java.lang.String text41;
        int i59;
        java.lang.String text42;
        int i60;
        java.lang.String text43;
        int i61;
        java.lang.String text44;
        int i62;
        java.lang.String text45;
        int i63;
        java.lang.String text46;
        int i64;
        java.lang.String text47;
        int i65;
        java.lang.String text48;
        int i66;
        java.lang.String text49;
        int i67;
        java.lang.String text50;
        int i68;
        java.lang.String text51;
        int i69;
        java.lang.String text52;
        int i70;
        java.lang.String text53;
        int i71;
        java.lang.String text54;
        int i72;
        java.lang.String text55;
        int i73;
        java.lang.String text56;
        int i74;
        java.lang.String text57;
        int i75;
        java.lang.String text58;
        int i76;
        java.lang.String text59;
        int i77;
        java.lang.String text60;
        int i78;
        java.lang.String text61;
        int i79;
        int i80;
        int i81;
        java.lang.Integer numValueOf5;
        int i82;
        int i83;
        java.lang.Integer numValueOf6;
        int i84;
        java.lang.String text62;
        int i85;
        java.lang.String text63;
        int i86;
        int i87;
        java.lang.Long lValueOf;
        int i88;
        java.lang.String text64;
        int i89;
        java.lang.String text65;
        int i90;
        java.lang.String text66;
        int i91;
        java.lang.String text67;
        int i92;
        java.lang.String text68;
        int i93;
        java.lang.String text69;
        int i94;
        java.lang.String text70;
        int i95;
        int i96;
        int i97;
        java.lang.Integer numValueOf7;
        java.lang.Boolean boolValueOf;
        int i98;
        int i99;
        java.lang.Integer numValueOf8;
        java.lang.Boolean boolValueOf2;
        int i100;
        java.lang.Long lValueOf2;
        int i101;
        int i102;
        int i103;
        java.lang.Integer numValueOf9;
        java.lang.Boolean boolValueOf3;
        int i104;
        int i105;
        java.lang.Integer numValueOf10;
        java.lang.Boolean boolValueOf4;
        int i106;
        int i107;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM WalletView ORDER BY orderValue");
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
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isSegWit");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "xpriv");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fromCreate");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValue");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressIndex");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncStatus");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedSyncOperation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "syncOperation");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaWalletType");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "aaWalletStatus");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createVersion");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSWalletId");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosAccountName");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eosActiveKey");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSOwnerKey");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSPubKey");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSShouldBeDeleted");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "EOSState");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrWalletId");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainIds");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrs");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddrTypes");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddressPublicKeys");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsDerivePaths");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsEoaAddresses");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainAddsProxyAddresses");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitWalletId");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitChainIds");
            int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddresses");
            int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddTypes");
            int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressPublicKeys");
            int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainSegWitAddressDerivePaths");
            int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainIds");
            int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddrs");
            int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddressPublicKeys");
            int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customChainAddsDerivePaths");
            int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinWalletId");
            int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinIds");
            int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinAddresses");
            int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amounts");
            int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amountInts");
            int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ccyAmounts");
            int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "coinDailyChanges");
            int columnIndexOrThrow58 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "orderValues");
            int columnIndexOrThrow59 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "voucherTokens");
            int columnIndexOrThrow60 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnls");
            int columnIndexOrThrow61 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unPnlYields");
            int columnIndexOrThrow62 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "platformNames");
            int columnIndexOrThrow63 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletInvestmentTypes");
            int columnIndexOrThrow64 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "spotBalances");
            int columnIndexOrThrow65 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "holdAvgPrices");
            int columnIndexOrThrow66 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedCoinIds");
            int columnIndexOrThrow67 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepInfoWalletId");
            int columnIndexOrThrow68 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepCoinIds");
            int columnIndexOrThrow69 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sepStates");
            int columnIndexOrThrow70 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAssetIds");
            int columnIndexOrThrow71 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiBeans");
            int columnIndexOrThrow72 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAssetIds");
            int columnIndexOrThrow73 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftBeans");
            int columnIndexOrThrow74 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAsset");
            int columnIndexOrThrow75 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tokenAssetFilterSmall");
            int columnIndexOrThrow76 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nftAsset");
            int columnIndexOrThrow77 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defiAsset");
            int columnIndexOrThrow78 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalAssetUpdateTime");
            int columnIndexOrThrow79 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openedCoinIds");
            int columnIndexOrThrow80 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairWalletId");
            int columnIndexOrThrow81 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow82 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairStatus");
            int columnIndexOrThrow83 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairReserved");
            int columnIndexOrThrow84 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairExtJson");
            int columnIndexOrThrow85 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repairTimestamp");
            int columnIndexOrThrow86 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinIds");
            int columnIndexOrThrow87 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinAmounts");
            int columnIndexOrThrow88 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCcyAmounts");
            int columnIndexOrThrow89 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinOrderValues");
            int columnIndexOrThrow90 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customCoinCreateAts");
            int columnIndexOrThrow91 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinIds");
            int columnIndexOrThrow92 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customWalletCoinCreateAts");
            int columnIndexOrThrow93 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeCreated");
            int columnIndexOrThrow94 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeActive");
            int columnIndexOrThrow95 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeExpiredTimestamp");
            int columnIndexOrThrow96 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTeeVerify");
            int columnIndexOrThrow97 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hasShowTeeExpiredAlert");
            int columnIndexOrThrow98 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeId");
            int columnIndexOrThrow99 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeCreateAt");
            int columnIndexOrThrow100 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "teeUpdateAt");
            int columnIndexOrThrow101 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "model");
            int columnIndexOrThrow102 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "canUseSa2");
            int columnIndexOrThrow103 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "autoRenew");
            int columnIndexOrThrow104 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "upgradeStatus");
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
                int i108 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text71 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text72 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i3 = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i2 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i3 = columnIndexOrThrow2;
                }
                int i109 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i110 = columnIndexOrThrow4;
                int i111 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i112 = columnIndexOrThrow5;
                int i113 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i114 = columnIndexOrThrow6;
                int i115 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i116 = columnIndexOrThrow7;
                int i117 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    i4 = columnIndexOrThrow8;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                    i4 = columnIndexOrThrow8;
                }
                int i118 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                int i119 = i;
                if (sQLiteStatementPrepare.isNull(i119)) {
                    i5 = i119;
                    i6 = columnIndexOrThrow9;
                    text4 = null;
                } else {
                    i5 = i119;
                    text4 = sQLiteStatementPrepare.getText(i119);
                    i6 = columnIndexOrThrow9;
                }
                int i120 = columnIndexOrThrow;
                int i121 = columnIndexOrThrow15;
                int i122 = (int) sQLiteStatementPrepare.getLong(i121);
                int i123 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i123);
                int i124 = columnIndexOrThrow17;
                int i125 = columnIndexOrThrow10;
                int i126 = (int) sQLiteStatementPrepare.getLong(i124);
                int i127 = columnIndexOrThrow12;
                int i128 = columnIndexOrThrow18;
                int i129 = columnIndexOrThrow11;
                int i130 = (int) sQLiteStatementPrepare.getLong(i128);
                int i131 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i131)) {
                    i8 = i124;
                    i7 = i131;
                    i9 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    i7 = i131;
                    text5 = sQLiteStatementPrepare.getText(i131);
                    i8 = i124;
                    i9 = columnIndexOrThrow20;
                }
                int i132 = columnIndexOrThrow13;
                int i133 = (int) sQLiteStatementPrepare.getLong(i9);
                int i134 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i134)) {
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i134);
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i11);
                    columnIndexOrThrow22 = i11;
                    i12 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i133;
                    i14 = i134;
                    i15 = columnIndexOrThrow24;
                    numValueOf = null;
                } else {
                    i13 = i133;
                    i14 = i134;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i12));
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    i16 = i128;
                    i17 = i130;
                    i18 = columnIndexOrThrow25;
                    numValueOf2 = null;
                } else {
                    i16 = i128;
                    i17 = i130;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i15));
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = columnIndexOrThrow26;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i19);
                    i20 = i12;
                    i21 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    columnIndexOrThrow27 = i21;
                    i22 = columnIndexOrThrow28;
                    text10 = null;
                } else {
                    columnIndexOrThrow27 = i21;
                    text10 = sQLiteStatementPrepare.getText(i21);
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    columnIndexOrThrow28 = i22;
                    i23 = columnIndexOrThrow29;
                    text11 = null;
                } else {
                    columnIndexOrThrow28 = i22;
                    text11 = sQLiteStatementPrepare.getText(i22);
                    i23 = columnIndexOrThrow29;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    columnIndexOrThrow29 = i23;
                    i24 = columnIndexOrThrow30;
                    text12 = null;
                } else {
                    columnIndexOrThrow29 = i23;
                    text12 = sQLiteStatementPrepare.getText(i23);
                    i24 = columnIndexOrThrow30;
                }
                if (sQLiteStatementPrepare.isNull(i24)) {
                    columnIndexOrThrow30 = i24;
                    i25 = columnIndexOrThrow31;
                    text13 = null;
                } else {
                    columnIndexOrThrow30 = i24;
                    text13 = sQLiteStatementPrepare.getText(i24);
                    i25 = columnIndexOrThrow31;
                }
                if (sQLiteStatementPrepare.isNull(i25)) {
                    i26 = i18;
                    i27 = i19;
                    i28 = columnIndexOrThrow32;
                    numValueOf3 = null;
                } else {
                    i26 = i18;
                    i27 = i19;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i25));
                    i28 = columnIndexOrThrow32;
                }
                if (sQLiteStatementPrepare.isNull(i28)) {
                    i29 = i15;
                    i30 = columnIndexOrThrow33;
                    numValueOf4 = null;
                } else {
                    i29 = i15;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i28));
                    i30 = columnIndexOrThrow33;
                }
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i31 = columnIndexOrThrow34;
                    text14 = null;
                } else {
                    text14 = sQLiteStatementPrepare.getText(i30);
                    i31 = columnIndexOrThrow34;
                }
                if (sQLiteStatementPrepare.isNull(i31)) {
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                    text15 = null;
                } else {
                    text15 = sQLiteStatementPrepare.getText(i31);
                    i32 = i25;
                    i33 = columnIndexOrThrow35;
                }
                if (sQLiteStatementPrepare.isNull(i33)) {
                    columnIndexOrThrow35 = i33;
                    i34 = columnIndexOrThrow36;
                    text16 = null;
                } else {
                    columnIndexOrThrow35 = i33;
                    text16 = sQLiteStatementPrepare.getText(i33);
                    i34 = columnIndexOrThrow36;
                }
                if (sQLiteStatementPrepare.isNull(i34)) {
                    columnIndexOrThrow36 = i34;
                    i35 = columnIndexOrThrow37;
                    text17 = null;
                } else {
                    columnIndexOrThrow36 = i34;
                    text17 = sQLiteStatementPrepare.getText(i34);
                    i35 = columnIndexOrThrow37;
                }
                if (sQLiteStatementPrepare.isNull(i35)) {
                    columnIndexOrThrow37 = i35;
                    i36 = columnIndexOrThrow38;
                    text18 = null;
                } else {
                    columnIndexOrThrow37 = i35;
                    text18 = sQLiteStatementPrepare.getText(i35);
                    i36 = columnIndexOrThrow38;
                }
                if (sQLiteStatementPrepare.isNull(i36)) {
                    columnIndexOrThrow38 = i36;
                    i37 = columnIndexOrThrow39;
                    text19 = null;
                } else {
                    columnIndexOrThrow38 = i36;
                    text19 = sQLiteStatementPrepare.getText(i36);
                    i37 = columnIndexOrThrow39;
                }
                if (sQLiteStatementPrepare.isNull(i37)) {
                    columnIndexOrThrow39 = i37;
                    i38 = columnIndexOrThrow40;
                    text20 = null;
                } else {
                    columnIndexOrThrow39 = i37;
                    text20 = sQLiteStatementPrepare.getText(i37);
                    i38 = columnIndexOrThrow40;
                }
                if (sQLiteStatementPrepare.isNull(i38)) {
                    columnIndexOrThrow40 = i38;
                    i39 = columnIndexOrThrow41;
                    text21 = null;
                } else {
                    columnIndexOrThrow40 = i38;
                    text21 = sQLiteStatementPrepare.getText(i38);
                    i39 = columnIndexOrThrow41;
                }
                if (sQLiteStatementPrepare.isNull(i39)) {
                    columnIndexOrThrow41 = i39;
                    i40 = columnIndexOrThrow42;
                    text22 = null;
                } else {
                    columnIndexOrThrow41 = i39;
                    text22 = sQLiteStatementPrepare.getText(i39);
                    i40 = columnIndexOrThrow42;
                }
                if (sQLiteStatementPrepare.isNull(i40)) {
                    columnIndexOrThrow42 = i40;
                    i41 = columnIndexOrThrow43;
                    text23 = null;
                } else {
                    columnIndexOrThrow42 = i40;
                    text23 = sQLiteStatementPrepare.getText(i40);
                    i41 = columnIndexOrThrow43;
                }
                if (sQLiteStatementPrepare.isNull(i41)) {
                    columnIndexOrThrow43 = i41;
                    i42 = columnIndexOrThrow44;
                    text24 = null;
                } else {
                    columnIndexOrThrow43 = i41;
                    text24 = sQLiteStatementPrepare.getText(i41);
                    i42 = columnIndexOrThrow44;
                }
                if (sQLiteStatementPrepare.isNull(i42)) {
                    columnIndexOrThrow44 = i42;
                    i43 = columnIndexOrThrow45;
                    text25 = null;
                } else {
                    columnIndexOrThrow44 = i42;
                    text25 = sQLiteStatementPrepare.getText(i42);
                    i43 = columnIndexOrThrow45;
                }
                if (sQLiteStatementPrepare.isNull(i43)) {
                    columnIndexOrThrow45 = i43;
                    i44 = columnIndexOrThrow46;
                    text26 = null;
                } else {
                    columnIndexOrThrow45 = i43;
                    text26 = sQLiteStatementPrepare.getText(i43);
                    i44 = columnIndexOrThrow46;
                }
                if (sQLiteStatementPrepare.isNull(i44)) {
                    columnIndexOrThrow46 = i44;
                    i45 = columnIndexOrThrow47;
                    text27 = null;
                } else {
                    columnIndexOrThrow46 = i44;
                    text27 = sQLiteStatementPrepare.getText(i44);
                    i45 = columnIndexOrThrow47;
                }
                if (sQLiteStatementPrepare.isNull(i45)) {
                    columnIndexOrThrow47 = i45;
                    i46 = columnIndexOrThrow48;
                    text28 = null;
                } else {
                    columnIndexOrThrow47 = i45;
                    text28 = sQLiteStatementPrepare.getText(i45);
                    i46 = columnIndexOrThrow48;
                }
                if (sQLiteStatementPrepare.isNull(i46)) {
                    columnIndexOrThrow48 = i46;
                    i47 = columnIndexOrThrow49;
                    text29 = null;
                } else {
                    columnIndexOrThrow48 = i46;
                    text29 = sQLiteStatementPrepare.getText(i46);
                    i47 = columnIndexOrThrow49;
                }
                if (sQLiteStatementPrepare.isNull(i47)) {
                    columnIndexOrThrow49 = i47;
                    i48 = columnIndexOrThrow50;
                    text30 = null;
                } else {
                    columnIndexOrThrow49 = i47;
                    text30 = sQLiteStatementPrepare.getText(i47);
                    i48 = columnIndexOrThrow50;
                }
                if (sQLiteStatementPrepare.isNull(i48)) {
                    columnIndexOrThrow50 = i48;
                    i49 = columnIndexOrThrow51;
                    text31 = null;
                } else {
                    columnIndexOrThrow50 = i48;
                    text31 = sQLiteStatementPrepare.getText(i48);
                    i49 = columnIndexOrThrow51;
                }
                if (sQLiteStatementPrepare.isNull(i49)) {
                    columnIndexOrThrow51 = i49;
                    i50 = columnIndexOrThrow52;
                    text32 = null;
                } else {
                    columnIndexOrThrow51 = i49;
                    text32 = sQLiteStatementPrepare.getText(i49);
                    i50 = columnIndexOrThrow52;
                }
                if (sQLiteStatementPrepare.isNull(i50)) {
                    columnIndexOrThrow52 = i50;
                    i51 = columnIndexOrThrow53;
                    text33 = null;
                } else {
                    columnIndexOrThrow52 = i50;
                    text33 = sQLiteStatementPrepare.getText(i50);
                    i51 = columnIndexOrThrow53;
                }
                if (sQLiteStatementPrepare.isNull(i51)) {
                    columnIndexOrThrow53 = i51;
                    i52 = columnIndexOrThrow54;
                    text34 = null;
                } else {
                    columnIndexOrThrow53 = i51;
                    text34 = sQLiteStatementPrepare.getText(i51);
                    i52 = columnIndexOrThrow54;
                }
                if (sQLiteStatementPrepare.isNull(i52)) {
                    columnIndexOrThrow54 = i52;
                    i53 = columnIndexOrThrow55;
                    text35 = null;
                } else {
                    columnIndexOrThrow54 = i52;
                    text35 = sQLiteStatementPrepare.getText(i52);
                    i53 = columnIndexOrThrow55;
                }
                if (sQLiteStatementPrepare.isNull(i53)) {
                    columnIndexOrThrow55 = i53;
                    i54 = columnIndexOrThrow56;
                    text36 = null;
                } else {
                    columnIndexOrThrow55 = i53;
                    text36 = sQLiteStatementPrepare.getText(i53);
                    i54 = columnIndexOrThrow56;
                }
                if (sQLiteStatementPrepare.isNull(i54)) {
                    columnIndexOrThrow56 = i54;
                    i55 = columnIndexOrThrow57;
                    text37 = null;
                } else {
                    columnIndexOrThrow56 = i54;
                    text37 = sQLiteStatementPrepare.getText(i54);
                    i55 = columnIndexOrThrow57;
                }
                if (sQLiteStatementPrepare.isNull(i55)) {
                    columnIndexOrThrow57 = i55;
                    i56 = columnIndexOrThrow58;
                    text38 = null;
                } else {
                    columnIndexOrThrow57 = i55;
                    text38 = sQLiteStatementPrepare.getText(i55);
                    i56 = columnIndexOrThrow58;
                }
                if (sQLiteStatementPrepare.isNull(i56)) {
                    columnIndexOrThrow58 = i56;
                    i57 = columnIndexOrThrow59;
                    text39 = null;
                } else {
                    columnIndexOrThrow58 = i56;
                    text39 = sQLiteStatementPrepare.getText(i56);
                    i57 = columnIndexOrThrow59;
                }
                if (sQLiteStatementPrepare.isNull(i57)) {
                    columnIndexOrThrow59 = i57;
                    i58 = columnIndexOrThrow60;
                    text40 = null;
                } else {
                    columnIndexOrThrow59 = i57;
                    text40 = sQLiteStatementPrepare.getText(i57);
                    i58 = columnIndexOrThrow60;
                }
                if (sQLiteStatementPrepare.isNull(i58)) {
                    columnIndexOrThrow60 = i58;
                    i59 = columnIndexOrThrow61;
                    text41 = null;
                } else {
                    columnIndexOrThrow60 = i58;
                    text41 = sQLiteStatementPrepare.getText(i58);
                    i59 = columnIndexOrThrow61;
                }
                if (sQLiteStatementPrepare.isNull(i59)) {
                    columnIndexOrThrow61 = i59;
                    i60 = columnIndexOrThrow62;
                    text42 = null;
                } else {
                    columnIndexOrThrow61 = i59;
                    text42 = sQLiteStatementPrepare.getText(i59);
                    i60 = columnIndexOrThrow62;
                }
                if (sQLiteStatementPrepare.isNull(i60)) {
                    columnIndexOrThrow62 = i60;
                    i61 = columnIndexOrThrow63;
                    text43 = null;
                } else {
                    columnIndexOrThrow62 = i60;
                    text43 = sQLiteStatementPrepare.getText(i60);
                    i61 = columnIndexOrThrow63;
                }
                if (sQLiteStatementPrepare.isNull(i61)) {
                    columnIndexOrThrow63 = i61;
                    i62 = columnIndexOrThrow64;
                    text44 = null;
                } else {
                    columnIndexOrThrow63 = i61;
                    text44 = sQLiteStatementPrepare.getText(i61);
                    i62 = columnIndexOrThrow64;
                }
                if (sQLiteStatementPrepare.isNull(i62)) {
                    columnIndexOrThrow64 = i62;
                    i63 = columnIndexOrThrow65;
                    text45 = null;
                } else {
                    columnIndexOrThrow64 = i62;
                    text45 = sQLiteStatementPrepare.getText(i62);
                    i63 = columnIndexOrThrow65;
                }
                if (sQLiteStatementPrepare.isNull(i63)) {
                    columnIndexOrThrow65 = i63;
                    i64 = columnIndexOrThrow66;
                    text46 = null;
                } else {
                    columnIndexOrThrow65 = i63;
                    text46 = sQLiteStatementPrepare.getText(i63);
                    i64 = columnIndexOrThrow66;
                }
                if (sQLiteStatementPrepare.isNull(i64)) {
                    columnIndexOrThrow66 = i64;
                    i65 = columnIndexOrThrow67;
                    text47 = null;
                } else {
                    columnIndexOrThrow66 = i64;
                    text47 = sQLiteStatementPrepare.getText(i64);
                    i65 = columnIndexOrThrow67;
                }
                if (sQLiteStatementPrepare.isNull(i65)) {
                    columnIndexOrThrow67 = i65;
                    i66 = columnIndexOrThrow68;
                    text48 = null;
                } else {
                    columnIndexOrThrow67 = i65;
                    text48 = sQLiteStatementPrepare.getText(i65);
                    i66 = columnIndexOrThrow68;
                }
                if (sQLiteStatementPrepare.isNull(i66)) {
                    columnIndexOrThrow68 = i66;
                    i67 = columnIndexOrThrow69;
                    text49 = null;
                } else {
                    columnIndexOrThrow68 = i66;
                    text49 = sQLiteStatementPrepare.getText(i66);
                    i67 = columnIndexOrThrow69;
                }
                if (sQLiteStatementPrepare.isNull(i67)) {
                    columnIndexOrThrow69 = i67;
                    i68 = columnIndexOrThrow70;
                    text50 = null;
                } else {
                    columnIndexOrThrow69 = i67;
                    text50 = sQLiteStatementPrepare.getText(i67);
                    i68 = columnIndexOrThrow70;
                }
                if (sQLiteStatementPrepare.isNull(i68)) {
                    columnIndexOrThrow70 = i68;
                    i69 = columnIndexOrThrow71;
                    text51 = null;
                } else {
                    columnIndexOrThrow70 = i68;
                    text51 = sQLiteStatementPrepare.getText(i68);
                    i69 = columnIndexOrThrow71;
                }
                if (sQLiteStatementPrepare.isNull(i69)) {
                    columnIndexOrThrow71 = i69;
                    i70 = columnIndexOrThrow72;
                    text52 = null;
                } else {
                    columnIndexOrThrow71 = i69;
                    text52 = sQLiteStatementPrepare.getText(i69);
                    i70 = columnIndexOrThrow72;
                }
                if (sQLiteStatementPrepare.isNull(i70)) {
                    columnIndexOrThrow72 = i70;
                    i71 = columnIndexOrThrow73;
                    text53 = null;
                } else {
                    columnIndexOrThrow72 = i70;
                    text53 = sQLiteStatementPrepare.getText(i70);
                    i71 = columnIndexOrThrow73;
                }
                if (sQLiteStatementPrepare.isNull(i71)) {
                    columnIndexOrThrow73 = i71;
                    i72 = columnIndexOrThrow74;
                    text54 = null;
                } else {
                    columnIndexOrThrow73 = i71;
                    text54 = sQLiteStatementPrepare.getText(i71);
                    i72 = columnIndexOrThrow74;
                }
                if (sQLiteStatementPrepare.isNull(i72)) {
                    columnIndexOrThrow74 = i72;
                    i73 = columnIndexOrThrow75;
                    text55 = null;
                } else {
                    columnIndexOrThrow74 = i72;
                    text55 = sQLiteStatementPrepare.getText(i72);
                    i73 = columnIndexOrThrow75;
                }
                if (sQLiteStatementPrepare.isNull(i73)) {
                    columnIndexOrThrow75 = i73;
                    i74 = columnIndexOrThrow76;
                    text56 = null;
                } else {
                    columnIndexOrThrow75 = i73;
                    text56 = sQLiteStatementPrepare.getText(i73);
                    i74 = columnIndexOrThrow76;
                }
                if (sQLiteStatementPrepare.isNull(i74)) {
                    columnIndexOrThrow76 = i74;
                    i75 = columnIndexOrThrow77;
                    text57 = null;
                } else {
                    columnIndexOrThrow76 = i74;
                    text57 = sQLiteStatementPrepare.getText(i74);
                    i75 = columnIndexOrThrow77;
                }
                if (sQLiteStatementPrepare.isNull(i75)) {
                    columnIndexOrThrow77 = i75;
                    i76 = columnIndexOrThrow78;
                    text58 = null;
                } else {
                    columnIndexOrThrow77 = i75;
                    text58 = sQLiteStatementPrepare.getText(i75);
                    i76 = columnIndexOrThrow78;
                }
                if (sQLiteStatementPrepare.isNull(i76)) {
                    columnIndexOrThrow78 = i76;
                    i77 = columnIndexOrThrow79;
                    text59 = null;
                } else {
                    columnIndexOrThrow78 = i76;
                    text59 = sQLiteStatementPrepare.getText(i76);
                    i77 = columnIndexOrThrow79;
                }
                if (sQLiteStatementPrepare.isNull(i77)) {
                    columnIndexOrThrow79 = i77;
                    i78 = columnIndexOrThrow80;
                    text60 = null;
                } else {
                    columnIndexOrThrow79 = i77;
                    text60 = sQLiteStatementPrepare.getText(i77);
                    i78 = columnIndexOrThrow80;
                }
                if (sQLiteStatementPrepare.isNull(i78)) {
                    columnIndexOrThrow80 = i78;
                    i79 = columnIndexOrThrow81;
                    text61 = null;
                } else {
                    columnIndexOrThrow80 = i78;
                    text61 = sQLiteStatementPrepare.getText(i78);
                    i79 = columnIndexOrThrow81;
                }
                if (sQLiteStatementPrepare.isNull(i79)) {
                    i80 = i28;
                    i81 = i30;
                    i82 = columnIndexOrThrow82;
                    numValueOf5 = null;
                } else {
                    i80 = i28;
                    i81 = i30;
                    numValueOf5 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i79));
                    i82 = columnIndexOrThrow82;
                }
                if (sQLiteStatementPrepare.isNull(i82)) {
                    i83 = i31;
                    i84 = columnIndexOrThrow83;
                    numValueOf6 = null;
                } else {
                    i83 = i31;
                    numValueOf6 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i82));
                    i84 = columnIndexOrThrow83;
                }
                if (sQLiteStatementPrepare.isNull(i84)) {
                    i85 = columnIndexOrThrow84;
                    text62 = null;
                } else {
                    text62 = sQLiteStatementPrepare.getText(i84);
                    i85 = columnIndexOrThrow84;
                }
                if (sQLiteStatementPrepare.isNull(i85)) {
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                    text63 = null;
                } else {
                    text63 = sQLiteStatementPrepare.getText(i85);
                    i86 = i79;
                    i87 = columnIndexOrThrow85;
                }
                if (sQLiteStatementPrepare.isNull(i87)) {
                    columnIndexOrThrow85 = i87;
                    i88 = columnIndexOrThrow86;
                    lValueOf = null;
                } else {
                    columnIndexOrThrow85 = i87;
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i87));
                    i88 = columnIndexOrThrow86;
                }
                if (sQLiteStatementPrepare.isNull(i88)) {
                    columnIndexOrThrow86 = i88;
                    i89 = columnIndexOrThrow87;
                    text64 = null;
                } else {
                    columnIndexOrThrow86 = i88;
                    text64 = sQLiteStatementPrepare.getText(i88);
                    i89 = columnIndexOrThrow87;
                }
                if (sQLiteStatementPrepare.isNull(i89)) {
                    columnIndexOrThrow87 = i89;
                    i90 = columnIndexOrThrow88;
                    text65 = null;
                } else {
                    columnIndexOrThrow87 = i89;
                    text65 = sQLiteStatementPrepare.getText(i89);
                    i90 = columnIndexOrThrow88;
                }
                if (sQLiteStatementPrepare.isNull(i90)) {
                    columnIndexOrThrow88 = i90;
                    i91 = columnIndexOrThrow89;
                    text66 = null;
                } else {
                    columnIndexOrThrow88 = i90;
                    text66 = sQLiteStatementPrepare.getText(i90);
                    i91 = columnIndexOrThrow89;
                }
                if (sQLiteStatementPrepare.isNull(i91)) {
                    columnIndexOrThrow89 = i91;
                    i92 = columnIndexOrThrow90;
                    text67 = null;
                } else {
                    columnIndexOrThrow89 = i91;
                    text67 = sQLiteStatementPrepare.getText(i91);
                    i92 = columnIndexOrThrow90;
                }
                if (sQLiteStatementPrepare.isNull(i92)) {
                    columnIndexOrThrow90 = i92;
                    i93 = columnIndexOrThrow91;
                    text68 = null;
                } else {
                    columnIndexOrThrow90 = i92;
                    text68 = sQLiteStatementPrepare.getText(i92);
                    i93 = columnIndexOrThrow91;
                }
                if (sQLiteStatementPrepare.isNull(i93)) {
                    columnIndexOrThrow91 = i93;
                    i94 = columnIndexOrThrow92;
                    text69 = null;
                } else {
                    columnIndexOrThrow91 = i93;
                    text69 = sQLiteStatementPrepare.getText(i93);
                    i94 = columnIndexOrThrow92;
                }
                if (sQLiteStatementPrepare.isNull(i94)) {
                    columnIndexOrThrow92 = i94;
                    i95 = columnIndexOrThrow93;
                    text70 = null;
                } else {
                    columnIndexOrThrow92 = i94;
                    text70 = sQLiteStatementPrepare.getText(i94);
                    i95 = columnIndexOrThrow93;
                }
                if (sQLiteStatementPrepare.isNull(i95)) {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = null;
                } else {
                    i96 = i82;
                    i97 = i84;
                    numValueOf7 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i95));
                }
                if (numValueOf7 == null) {
                    i98 = columnIndexOrThrow94;
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                    i98 = columnIndexOrThrow94;
                }
                if (sQLiteStatementPrepare.isNull(i98)) {
                    i99 = i85;
                    numValueOf8 = null;
                } else {
                    i99 = i85;
                    numValueOf8 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i98));
                }
                if (numValueOf8 == null) {
                    i100 = columnIndexOrThrow95;
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                    i100 = columnIndexOrThrow95;
                }
                if (sQLiteStatementPrepare.isNull(i100)) {
                    i101 = columnIndexOrThrow96;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i100));
                    i101 = columnIndexOrThrow96;
                }
                if (sQLiteStatementPrepare.isNull(i101)) {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = null;
                } else {
                    i102 = i98;
                    i103 = i100;
                    numValueOf9 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i101));
                }
                if (numValueOf9 == null) {
                    i104 = columnIndexOrThrow97;
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                    i104 = columnIndexOrThrow97;
                }
                if (sQLiteStatementPrepare.isNull(i104)) {
                    i105 = i101;
                    numValueOf10 = null;
                } else {
                    i105 = i101;
                    numValueOf10 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i104));
                }
                if (numValueOf10 == null) {
                    i106 = columnIndexOrThrow98;
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                    i106 = columnIndexOrThrow98;
                }
                int i135 = columnIndexOrThrow99;
                java.lang.String text73 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                long j3 = sQLiteStatementPrepare.getLong(i135);
                int i136 = i95;
                int i137 = columnIndexOrThrow100;
                long j4 = sQLiteStatementPrepare.getLong(i137);
                columnIndexOrThrow100 = i137;
                int i138 = i104;
                int i139 = columnIndexOrThrow101;
                int i140 = i106;
                int i141 = (int) sQLiteStatementPrepare.getLong(i139);
                int i142 = columnIndexOrThrow102;
                int i143 = i16;
                if (((int) sQLiteStatementPrepare.getLong(i142)) != 0) {
                    i107 = columnIndexOrThrow103;
                    z = true;
                } else {
                    i107 = columnIndexOrThrow103;
                    z = false;
                }
                int i144 = columnIndexOrThrow104;
                int i145 = i107;
                C11571cTe c11571cTe = new C11571cTe(text, i108, text71, j, text72, text2, i109, i111, i113, i115, i117, text3, text4, i118, i122, j2, i126, i17, text5, i13, text6, text7, numValueOf, numValueOf2, text8, text9, text10, text11, text12, text13, numValueOf3, numValueOf4, text14, text15, text16, text17, text18, text19, text21, text20, text32, text33, text34, text35, text36, text37, text38, text39, text40, text41, text42, text47, text48, text49, text50, text51, text52, text53, text54, text55, text56, text57, text58, text59, text60, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text64, text65, text66, text67, text68, text69, text70, text61, numValueOf5, numValueOf6, text62, text63, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, text73, j3, j4, i141, z, (int) sQLiteStatementPrepare.getLong(i107), (int) sQLiteStatementPrepare.getLong(i144), text43, text44, text45, text46);
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(c11571cTe);
                columnIndexOrThrow10 = i125;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow13 = i132;
                columnIndexOrThrow20 = i10;
                columnIndexOrThrow23 = i20;
                columnIndexOrThrow25 = i26;
                columnIndexOrThrow26 = i27;
                columnIndexOrThrow24 = i29;
                columnIndexOrThrow31 = i32;
                columnIndexOrThrow32 = i80;
                columnIndexOrThrow33 = i81;
                columnIndexOrThrow34 = i83;
                columnIndexOrThrow81 = i86;
                columnIndexOrThrow82 = i96;
                columnIndexOrThrow83 = i97;
                columnIndexOrThrow84 = i99;
                columnIndexOrThrow94 = i102;
                columnIndexOrThrow95 = i103;
                columnIndexOrThrow96 = i105;
                columnIndexOrThrow93 = i136;
                columnIndexOrThrow97 = i138;
                columnIndexOrThrow98 = i140;
                columnIndexOrThrow9 = i6;
                columnIndexOrThrow99 = i135;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i110;
                columnIndexOrThrow5 = i112;
                columnIndexOrThrow6 = i114;
                columnIndexOrThrow7 = i116;
                columnIndexOrThrow8 = i4;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow12 = i127;
                columnIndexOrThrow19 = i7;
                columnIndexOrThrow21 = i14;
                columnIndexOrThrow101 = i139;
                columnIndexOrThrow = i120;
                columnIndexOrThrow15 = i121;
                columnIndexOrThrow16 = i123;
                int i146 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i146;
                columnIndexOrThrow104 = i144;
                columnIndexOrThrow11 = i129;
                columnIndexOrThrow18 = i143;
                columnIndexOrThrow102 = i142;
                columnIndexOrThrow103 = i145;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletViewForWalletManagement> valueOf() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.iwGUEr((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List iwGUEr(androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        androidx.sqlite.SQLiteStatement sQLiteStatement;
        int i;
        java.lang.Integer numValueOf;
        java.lang.Boolean boolValueOf;
        java.lang.Boolean boolValueOf2;
        java.lang.Boolean boolValueOf3;
        java.lang.Boolean boolValueOf4;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, xpriv, isSegWit, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, eoaWalletType, aaWalletStatus, createVersion, eosAccountName, eosActiveKey, EOSOwnerKey, EOSPubKey, EOSShouldBeDeleted, EOSState, chainIds, chainAddrs, chainAddrTypes, chainAddressPublicKeys, chainAddsDerivePaths, chainAddsProxyAddresses, chainAddsEoaAddresses, coinIds, ccyAmounts, voucherTokens, defiBeans, nftBeans, tokenAsset, tokenAssetFilterSmall, nftAsset, defiAsset, totalAssetUpdateTime, chainSegWitChainIds, chainSegWitAddresses, chainSegWitAddTypes, chainSegWitAddressPublicKeys, chainSegWitAddressDerivePaths, identifierType, repairStatus, repairReserved, repairExtJson, repairTimestamp, isTeeCreated, isTeeActive, teeExpiredTimestamp, isTeeVerify, hasShowTeeExpiredAlert, teeId, teeCreateAt, teeUpdateAt, model, closedCoinIds, canUseSa2, autoRenew, upgradeStatus FROM WalletView ORDER BY orderValue");
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getText(0);
                int i2 = (int) sQLiteStatementPrepare.getLong(1);
                java.lang.String text2 = sQLiteStatementPrepare.isNull(2) ? null : sQLiteStatementPrepare.getText(2);
                long j = sQLiteStatementPrepare.getLong(3);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(4) ? null : sQLiteStatementPrepare.getText(4);
                java.lang.String text4 = sQLiteStatementPrepare.isNull(5) ? null : sQLiteStatementPrepare.getText(5);
                int i3 = (int) sQLiteStatementPrepare.getLong(6);
                int i4 = (int) sQLiteStatementPrepare.getLong(7);
                int i5 = (int) sQLiteStatementPrepare.getLong(8);
                int i6 = (int) sQLiteStatementPrepare.getLong(9);
                int i7 = (int) sQLiteStatementPrepare.getLong(10);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(11) ? null : sQLiteStatementPrepare.getText(11);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(12) ? null : sQLiteStatementPrepare.getText(12);
                int i8 = (int) sQLiteStatementPrepare.getLong(13);
                int i9 = (int) sQLiteStatementPrepare.getLong(14);
                long j2 = sQLiteStatementPrepare.getLong(15);
                int i10 = (int) sQLiteStatementPrepare.getLong(16);
                int i11 = (int) sQLiteStatementPrepare.getLong(17);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(18) ? null : sQLiteStatementPrepare.getText(18);
                int i12 = (int) sQLiteStatementPrepare.getLong(19);
                if (sQLiteStatementPrepare.isNull(20)) {
                    i = i12;
                    numValueOf = null;
                } else {
                    i = i12;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(20));
                }
                java.lang.Integer numValueOf2 = sQLiteStatementPrepare.isNull(21) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(21));
                java.lang.String text8 = sQLiteStatementPrepare.isNull(22) ? null : sQLiteStatementPrepare.getText(22);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(23) ? null : sQLiteStatementPrepare.getText(23);
                java.lang.String text10 = sQLiteStatementPrepare.isNull(24) ? null : sQLiteStatementPrepare.getText(24);
                java.lang.String text11 = sQLiteStatementPrepare.isNull(25) ? null : sQLiteStatementPrepare.getText(25);
                java.lang.String text12 = sQLiteStatementPrepare.isNull(26) ? null : sQLiteStatementPrepare.getText(26);
                java.lang.Integer numValueOf3 = sQLiteStatementPrepare.isNull(27) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(27));
                java.lang.Integer numValueOf4 = sQLiteStatementPrepare.isNull(28) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(28));
                java.lang.String text13 = sQLiteStatementPrepare.isNull(29) ? null : sQLiteStatementPrepare.getText(29);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(30) ? null : sQLiteStatementPrepare.getText(30);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(31) ? null : sQLiteStatementPrepare.getText(31);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(32) ? null : sQLiteStatementPrepare.getText(32);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(33) ? null : sQLiteStatementPrepare.getText(33);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(34) ? null : sQLiteStatementPrepare.getText(34);
                java.lang.String text19 = sQLiteStatementPrepare.isNull(35) ? null : sQLiteStatementPrepare.getText(35);
                java.lang.String text20 = sQLiteStatementPrepare.isNull(36) ? null : sQLiteStatementPrepare.getText(36);
                java.lang.String text21 = sQLiteStatementPrepare.isNull(37) ? null : sQLiteStatementPrepare.getText(37);
                java.lang.String text22 = sQLiteStatementPrepare.isNull(38) ? null : sQLiteStatementPrepare.getText(38);
                java.lang.String text23 = sQLiteStatementPrepare.isNull(39) ? null : sQLiteStatementPrepare.getText(39);
                java.lang.String text24 = sQLiteStatementPrepare.isNull(40) ? null : sQLiteStatementPrepare.getText(40);
                java.lang.String text25 = sQLiteStatementPrepare.isNull(41) ? null : sQLiteStatementPrepare.getText(41);
                java.lang.String text26 = sQLiteStatementPrepare.isNull(42) ? null : sQLiteStatementPrepare.getText(42);
                java.lang.String text27 = sQLiteStatementPrepare.isNull(43) ? null : sQLiteStatementPrepare.getText(43);
                java.lang.String text28 = sQLiteStatementPrepare.isNull(44) ? null : sQLiteStatementPrepare.getText(44);
                java.lang.String text29 = sQLiteStatementPrepare.isNull(45) ? null : sQLiteStatementPrepare.getText(45);
                java.lang.String text30 = sQLiteStatementPrepare.isNull(46) ? null : sQLiteStatementPrepare.getText(46);
                java.lang.String text31 = sQLiteStatementPrepare.isNull(47) ? null : sQLiteStatementPrepare.getText(47);
                java.lang.String text32 = sQLiteStatementPrepare.isNull(48) ? null : sQLiteStatementPrepare.getText(48);
                java.lang.String text33 = sQLiteStatementPrepare.isNull(49) ? null : sQLiteStatementPrepare.getText(49);
                java.lang.String text34 = sQLiteStatementPrepare.isNull(50) ? null : sQLiteStatementPrepare.getText(50);
                java.lang.Integer numValueOf5 = sQLiteStatementPrepare.isNull(51) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(51));
                java.lang.Integer numValueOf6 = sQLiteStatementPrepare.isNull(52) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(52));
                java.lang.String text35 = sQLiteStatementPrepare.isNull(53) ? null : sQLiteStatementPrepare.getText(53);
                java.lang.String text36 = sQLiteStatementPrepare.isNull(54) ? null : sQLiteStatementPrepare.getText(54);
                java.lang.Long lValueOf = sQLiteStatementPrepare.isNull(55) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(55));
                java.lang.Integer numValueOf7 = sQLiteStatementPrepare.isNull(56) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(56));
                if (numValueOf7 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = java.lang.Boolean.valueOf(numValueOf7.intValue() != 0);
                }
                java.lang.Integer numValueOf8 = sQLiteStatementPrepare.isNull(57) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(57));
                if (numValueOf8 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = java.lang.Boolean.valueOf(numValueOf8.intValue() != 0);
                }
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(58) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(58));
                java.lang.Integer numValueOf9 = sQLiteStatementPrepare.isNull(59) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(59));
                if (numValueOf9 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = java.lang.Boolean.valueOf(numValueOf9.intValue() != 0);
                }
                java.lang.Integer numValueOf10 = sQLiteStatementPrepare.isNull(60) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(60));
                if (numValueOf10 == null) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = java.lang.Boolean.valueOf(numValueOf10.intValue() != 0);
                }
                sQLiteStatement = sQLiteStatementPrepare;
                try {
                    arrayList.add(new WalletViewForWalletManagement(text, i2, text2, j, text3, text4, i3, i4, i5, i6, i7, text5, text6, i8, i9, j2, i10, i11, text7, i, numValueOf, numValueOf2, text8, text9, text10, text11, text12, numValueOf3, numValueOf4, text13, text14, text15, text16, text17, text18, text19, text20, text21, text22, text23, text24, text25, text26, text27, text28, text29, text30, text31, text32, text33, text34, numValueOf5, numValueOf6, text35, text36, lValueOf, boolValueOf, boolValueOf2, lValueOf2, boolValueOf3, boolValueOf4, sQLiteStatementPrepare.isNull(61) ? null : sQLiteStatementPrepare.getText(61), sQLiteStatementPrepare.getLong(62), sQLiteStatementPrepare.getLong(63), (int) sQLiteStatementPrepare.getLong(64), sQLiteStatementPrepare.isNull(65) ? null : sQLiteStatementPrepare.getText(65), ((int) sQLiteStatementPrepare.getLong(66)) != 0, (int) sQLiteStatementPrepare.getLong(67), (int) sQLiteStatementPrepare.getLong(68)));
                    sQLiteStatementPrepare = sQLiteStatement;
                } catch (java.lang.Throwable th) {
                    th = th;
                    sQLiteStatement.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteStatement = sQLiteStatementPrepare;
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> OLrzqt(final java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet WHERE id IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.ejfBZ(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List ejfBZ(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i13);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i13, str2);
                }
                i13++;
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
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
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
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i16 = columnIndexOrThrow4;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i18 = columnIndexOrThrow5;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i20 = columnIndexOrThrow6;
                int i21 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i22 = columnIndexOrThrow7;
                int i23 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
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
                int i24 = columnIndexOrThrow8;
                int i25 = (int) sQLiteStatementPrepare.getLong(i5);
                int i26 = columnIndexOrThrow15;
                int i27 = columnIndexOrThrow10;
                int i28 = columnIndexOrThrow11;
                int i29 = (int) sQLiteStatementPrepare.getLong(i26);
                int i30 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i30);
                int i31 = columnIndexOrThrow;
                int i32 = columnIndexOrThrow17;
                int i33 = columnIndexOrThrow12;
                int i34 = (int) sQLiteStatementPrepare.getLong(i32);
                int i35 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i7 = i32;
                    i6 = i35;
                    i8 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    i6 = i35;
                    text4 = sQLiteStatementPrepare.getText(i35);
                    i7 = i32;
                    i8 = columnIndexOrThrow19;
                }
                int i36 = columnIndexOrThrow13;
                int i37 = (int) sQLiteStatementPrepare.getLong(i8);
                int i38 = columnIndexOrThrow20;
                int i39 = (int) sQLiteStatementPrepare.getLong(i38);
                int i40 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i40);
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = i40;
                    i12 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i11 = i40;
                    text6 = sQLiteStatementPrepare.getText(i10);
                    columnIndexOrThrow22 = i10;
                    i12 = columnIndexOrThrow23;
                }
                int i41 = columnIndexOrThrow24;
                int i42 = columnIndexOrThrow25;
                int i43 = i12;
                WalletEntity walletEntity = new WalletEntity(text, i14, text7, j, text8, text2, i15, i17, i19, i21, i23, text9, text3, i25, i29, j2, i34, text4, i37, i39, text5, text6, (int) sQLiteStatementPrepare.getLong(i12), (int) sQLiteStatementPrepare.getLong(i41), sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i27;
                columnIndexOrThrow = i31;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow24 = i41;
                columnIndexOrThrow13 = i36;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow20 = i38;
                columnIndexOrThrow23 = i43;
                columnIndexOrThrow8 = i24;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow6 = i20;
                columnIndexOrThrow7 = i22;
                columnIndexOrThrow9 = i4;
                columnIndexOrThrow11 = i28;
                columnIndexOrThrow16 = i30;
                columnIndexOrThrow21 = i11;
                columnIndexOrThrow25 = i42;
                columnIndexOrThrow12 = i33;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i6;
                int i44 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i44;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object djBIcL(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM chain_address WHERE walletId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fJNWhG(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map fJNWhG(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list2;
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "proxyAddress");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eoaAddress");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list2 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list2 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow8) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    list2.add(new ChainAddressEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<ChainAddressSegWitEntity> KWHzl(final java.lang.String str, final long j) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.KWHzl(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM chain_address_segwit WHERE walletId=? AND chainId=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new ChainAddressSegWitEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object EZpvd(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM chain_address_segwit WHERE walletId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fetchVPNInfo(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.Map fetchVPNInfo(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.List list2;
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
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chainId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "addressType");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publicKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "derivePath");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                if (linkedHashMap.containsKey(text)) {
                    list2 = (java.util.List) linkedHashMap.get(text);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap.put(text, arrayList);
                    list2 = arrayList;
                }
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow5) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow6) || !sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                    list2.add(new ChainAddressSegWitEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)));
                }
            }
            return linkedHashMap;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<cSX> AEQbTJ() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.ejfBZ((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List ejfBZ(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        int i3;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        int i5;
        int i6;
        java.lang.String text3;
        int i7;
        java.lang.String text4;
        int i8;
        int i9;
        int i10;
        java.lang.Integer numValueOf3;
        int i11;
        java.lang.String text5;
        int i12;
        java.lang.String text6;
        int i13;
        int i14;
        java.lang.String text7;
        int i15;
        java.lang.String text8;
        int i16;
        java.lang.String text9;
        int i17;
        java.lang.String text10;
        int i18;
        java.lang.String text11;
        int i19;
        java.lang.String text12;
        int i20;
        int i21;
        int i22;
        java.lang.Integer numValueOf4;
        int i23;
        java.lang.Long lValueOf;
        int i24;
        int i25;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM OKRootWallet ORDER BY sortIndex");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i26 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i27 = columnIndexOrThrow4;
                int i28 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow;
                    i7 = columnIndexOrThrow17;
                    text3 = null;
                } else {
                    i6 = columnIndexOrThrow;
                    text3 = sQLiteStatementPrepare.getText(i5);
                    i7 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    columnIndexOrThrow17 = i7;
                    i8 = columnIndexOrThrow18;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i7;
                    text4 = sQLiteStatementPrepare.getText(i7);
                    i8 = columnIndexOrThrow18;
                }
                if (sQLiteStatementPrepare.isNull(i8)) {
                    i9 = i4;
                    i10 = i5;
                    i11 = columnIndexOrThrow19;
                    numValueOf3 = null;
                } else {
                    i9 = i4;
                    i10 = i5;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i8));
                    i11 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i11);
                    i12 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i8;
                    i14 = columnIndexOrThrow21;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i12);
                    i13 = i8;
                    i14 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow21 = i14;
                    i15 = columnIndexOrThrow22;
                    text7 = null;
                } else {
                    columnIndexOrThrow21 = i14;
                    text7 = sQLiteStatementPrepare.getText(i14);
                    i15 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow22 = i15;
                    i16 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    columnIndexOrThrow22 = i15;
                    text8 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow23 = i16;
                    i17 = columnIndexOrThrow24;
                    text9 = null;
                } else {
                    columnIndexOrThrow23 = i16;
                    text9 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow24 = i17;
                    i18 = columnIndexOrThrow25;
                    text10 = null;
                } else {
                    columnIndexOrThrow24 = i17;
                    text10 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow25 = i18;
                    i19 = columnIndexOrThrow26;
                    text11 = null;
                } else {
                    columnIndexOrThrow25 = i18;
                    text11 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    columnIndexOrThrow26 = i19;
                    i20 = columnIndexOrThrow27;
                    text12 = null;
                } else {
                    columnIndexOrThrow26 = i19;
                    text12 = sQLiteStatementPrepare.getText(i19);
                    i20 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i20)) {
                    i21 = i11;
                    i22 = i12;
                    i23 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    i21 = i11;
                    i22 = i12;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i20));
                    i23 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i24 = columnIndexOrThrow6;
                    i25 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i23));
                    i24 = columnIndexOrThrow6;
                    i25 = columnIndexOrThrow29;
                }
                int i29 = columnIndexOrThrow7;
                int i30 = columnIndexOrThrow30;
                int i31 = i20;
                arrayList.add(new cSX(text13, text14, text15, numValueOf, i26, j, text16, text17, text18, text19, numValueOf2, lValueOf2, text, i28, text2, text3, text4, numValueOf3, text5, text6, text7, text8, text9, text10, text11, text12, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i25), sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30)));
                columnIndexOrThrow = i6;
                columnIndexOrThrow15 = i9;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i21;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow6 = i24;
                columnIndexOrThrow27 = i31;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow28 = i23;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow7 = i29;
                columnIndexOrThrow4 = i27;
                columnIndexOrThrow29 = i25;
                columnIndexOrThrow5 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object AEQbTJ(Continuation<? super java.util.List<cSX>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.wlaJM((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List wlaJM(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        int i3;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        int i5;
        int i6;
        java.lang.String text3;
        int i7;
        java.lang.String text4;
        int i8;
        int i9;
        int i10;
        java.lang.Integer numValueOf3;
        int i11;
        java.lang.String text5;
        int i12;
        java.lang.String text6;
        int i13;
        int i14;
        java.lang.String text7;
        int i15;
        java.lang.String text8;
        int i16;
        java.lang.String text9;
        int i17;
        java.lang.String text10;
        int i18;
        java.lang.String text11;
        int i19;
        java.lang.String text12;
        int i20;
        int i21;
        int i22;
        java.lang.Integer numValueOf4;
        int i23;
        java.lang.Long lValueOf;
        int i24;
        int i25;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM OKRootWallet ORDER BY sortIndex");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i26 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i27 = columnIndexOrThrow4;
                int i28 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow;
                    i7 = columnIndexOrThrow17;
                    text3 = null;
                } else {
                    i6 = columnIndexOrThrow;
                    text3 = sQLiteStatementPrepare.getText(i5);
                    i7 = columnIndexOrThrow17;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    columnIndexOrThrow17 = i7;
                    i8 = columnIndexOrThrow18;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i7;
                    text4 = sQLiteStatementPrepare.getText(i7);
                    i8 = columnIndexOrThrow18;
                }
                if (sQLiteStatementPrepare.isNull(i8)) {
                    i9 = i4;
                    i10 = i5;
                    i11 = columnIndexOrThrow19;
                    numValueOf3 = null;
                } else {
                    i9 = i4;
                    i10 = i5;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i8));
                    i11 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i11);
                    i12 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    i13 = i8;
                    i14 = columnIndexOrThrow21;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i12);
                    i13 = i8;
                    i14 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow21 = i14;
                    i15 = columnIndexOrThrow22;
                    text7 = null;
                } else {
                    columnIndexOrThrow21 = i14;
                    text7 = sQLiteStatementPrepare.getText(i14);
                    i15 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow22 = i15;
                    i16 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    columnIndexOrThrow22 = i15;
                    text8 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow23 = i16;
                    i17 = columnIndexOrThrow24;
                    text9 = null;
                } else {
                    columnIndexOrThrow23 = i16;
                    text9 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow24 = i17;
                    i18 = columnIndexOrThrow25;
                    text10 = null;
                } else {
                    columnIndexOrThrow24 = i17;
                    text10 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow25 = i18;
                    i19 = columnIndexOrThrow26;
                    text11 = null;
                } else {
                    columnIndexOrThrow25 = i18;
                    text11 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    columnIndexOrThrow26 = i19;
                    i20 = columnIndexOrThrow27;
                    text12 = null;
                } else {
                    columnIndexOrThrow26 = i19;
                    text12 = sQLiteStatementPrepare.getText(i19);
                    i20 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i20)) {
                    i21 = i11;
                    i22 = i12;
                    i23 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    i21 = i11;
                    i22 = i12;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i20));
                    i23 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i23)) {
                    i24 = columnIndexOrThrow6;
                    i25 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i23));
                    i24 = columnIndexOrThrow6;
                    i25 = columnIndexOrThrow29;
                }
                int i29 = columnIndexOrThrow7;
                int i30 = columnIndexOrThrow30;
                int i31 = i20;
                arrayList.add(new cSX(text13, text14, text15, numValueOf, i26, j, text16, text17, text18, text19, numValueOf2, lValueOf2, text, i28, text2, text3, text4, numValueOf3, text5, text6, text7, text8, text9, text10, text11, text12, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i25), sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30)));
                columnIndexOrThrow = i6;
                columnIndexOrThrow15 = i9;
                columnIndexOrThrow16 = i10;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i21;
                columnIndexOrThrow20 = i22;
                columnIndexOrThrow6 = i24;
                columnIndexOrThrow27 = i31;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow28 = i23;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow7 = i29;
                columnIndexOrThrow4 = i27;
                columnIndexOrThrow29 = i25;
                columnIndexOrThrow5 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<cSX> KWHzl(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.iwGUEr(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List iwGUEr(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        int i3;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        int i5;
        int i6;
        int i7;
        java.lang.String text3;
        java.lang.String text4;
        int i8;
        int i9;
        java.lang.Integer numValueOf3;
        int i10;
        java.lang.String text5;
        int i11;
        java.lang.String text6;
        int i12;
        int i13;
        java.lang.String text7;
        int i14;
        java.lang.String text8;
        int i15;
        java.lang.String text9;
        int i16;
        java.lang.String text10;
        int i17;
        java.lang.String text11;
        int i18;
        java.lang.String text12;
        int i19;
        int i20;
        int i21;
        java.lang.Integer numValueOf4;
        int i22;
        java.lang.Long lValueOf;
        int i23;
        int i24;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM OKRootWallet WHERE rootWalletId =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i25 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i26 = columnIndexOrThrow4;
                int i27 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow;
                    i7 = columnIndexOrThrow17;
                    text3 = null;
                } else {
                    i6 = columnIndexOrThrow;
                    i7 = columnIndexOrThrow17;
                    text3 = sQLiteStatementPrepare.getText(i5);
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    columnIndexOrThrow17 = i7;
                    i8 = columnIndexOrThrow18;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i7);
                    columnIndexOrThrow17 = i7;
                    i8 = columnIndexOrThrow18;
                }
                if (sQLiteStatementPrepare.isNull(i8)) {
                    i9 = i4;
                    columnIndexOrThrow16 = i5;
                    i10 = columnIndexOrThrow19;
                    numValueOf3 = null;
                } else {
                    i9 = i4;
                    columnIndexOrThrow16 = i5;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i8));
                    i10 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i10);
                    i11 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = i8;
                    i13 = columnIndexOrThrow21;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i11);
                    i12 = i8;
                    i13 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow21 = i13;
                    i14 = columnIndexOrThrow22;
                    text7 = null;
                } else {
                    columnIndexOrThrow21 = i13;
                    text7 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow22 = i14;
                    i15 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    columnIndexOrThrow22 = i14;
                    text8 = sQLiteStatementPrepare.getText(i14);
                    i15 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow23 = i15;
                    i16 = columnIndexOrThrow24;
                    text9 = null;
                } else {
                    columnIndexOrThrow23 = i15;
                    text9 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow24 = i16;
                    i17 = columnIndexOrThrow25;
                    text10 = null;
                } else {
                    columnIndexOrThrow24 = i16;
                    text10 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow25 = i17;
                    i18 = columnIndexOrThrow26;
                    text11 = null;
                } else {
                    columnIndexOrThrow25 = i17;
                    text11 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow26 = i18;
                    i19 = columnIndexOrThrow27;
                    text12 = null;
                } else {
                    columnIndexOrThrow26 = i18;
                    text12 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i10;
                    i21 = i11;
                    i22 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    i20 = i10;
                    i21 = i11;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i19));
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i23 = columnIndexOrThrow6;
                    i24 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i22));
                    i23 = columnIndexOrThrow6;
                    i24 = columnIndexOrThrow29;
                }
                int i28 = columnIndexOrThrow7;
                int i29 = columnIndexOrThrow30;
                int i30 = i19;
                arrayList.add(new cSX(text13, text14, text15, numValueOf, i25, j, text16, text17, text18, text19, numValueOf2, lValueOf2, text, i27, text2, text3, text4, numValueOf3, text5, text6, text7, text8, text9, text10, text11, text12, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i24), sQLiteStatementPrepare.isNull(i29) ? null : sQLiteStatementPrepare.getText(i29)));
                columnIndexOrThrow = i6;
                columnIndexOrThrow15 = i9;
                columnIndexOrThrow18 = i12;
                columnIndexOrThrow19 = i20;
                columnIndexOrThrow20 = i21;
                columnIndexOrThrow6 = i23;
                columnIndexOrThrow27 = i30;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow28 = i22;
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow7 = i28;
                columnIndexOrThrow4 = i26;
                columnIndexOrThrow29 = i24;
                columnIndexOrThrow5 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object AEQbTJ(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, cSX>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM OKRootWallet WHERE rootWalletId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cNI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AkhnZx(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028a A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0299 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a8 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b9 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e0 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ef A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02fe A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030f A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0327 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033a A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0352 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0368 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x037e A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0395 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ae A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03ca A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03df A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03f6 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040d A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0424 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043b A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0452 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0469 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0482 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a2 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04c3 A[Catch: all -> 0x050d, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e0 A[Catch: all -> 0x050d, TRY_LEAVE, TryCatch #0 {all -> 0x050d, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0104, B:14:0x010a, B:18:0x011e, B:20:0x0124, B:22:0x012a, B:24:0x0130, B:26:0x0136, B:28:0x013c, B:30:0x0142, B:32:0x0148, B:34:0x014e, B:36:0x0154, B:38:0x015a, B:40:0x0160, B:42:0x0166, B:44:0x016c, B:46:0x0174, B:48:0x017e, B:50:0x0188, B:52:0x0192, B:54:0x019c, B:56:0x01a6, B:58:0x01b0, B:60:0x01ba, B:62:0x01c4, B:64:0x01ce, B:66:0x01d8, B:68:0x01e2, B:70:0x01ec, B:72:0x01f6, B:74:0x0200, B:76:0x020a, B:78:0x0214, B:98:0x0281, B:102:0x0290, B:106:0x029f, B:110:0x02ae, B:114:0x02c6, B:118:0x02e6, B:122:0x02f5, B:126:0x0304, B:130:0x031c, B:134:0x032f, B:139:0x0345, B:144:0x035b, B:149:0x0371, B:153:0x0388, B:157:0x039f, B:161:0x03bf, B:165:0x03d2, B:169:0x03e9, B:173:0x0400, B:177:0x0417, B:181:0x042e, B:185:0x0445, B:189:0x045c, B:193:0x0473, B:197:0x0493, B:202:0x04b1, B:206:0x04cb, B:208:0x04e0, B:205:0x04c3, B:201:0x04a2, B:196:0x0482, B:192:0x0469, B:188:0x0452, B:184:0x043b, B:180:0x0424, B:176:0x040d, B:172:0x03f6, B:168:0x03df, B:164:0x03ca, B:160:0x03ae, B:156:0x0395, B:152:0x037e, B:148:0x0368, B:143:0x0352, B:138:0x033a, B:133:0x0327, B:129:0x030f, B:125:0x02fe, B:121:0x02ef, B:117:0x02e0, B:113:0x02b9, B:109:0x02a8, B:105:0x0299, B:101:0x028a, B:17:0x0116), top: B:215:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.util.Map AkhnZx(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        LinkedHashMap linkedHashMap;
        java.lang.Integer numValueOf;
        int i3;
        java.lang.Integer numValueOf2;
        java.lang.String text2;
        int i4;
        int i5;
        int i6;
        java.lang.String text3;
        int i7;
        java.lang.String text4;
        int i8;
        int i9;
        java.lang.String str2;
        java.lang.String text5;
        int i10;
        int i11;
        int i12;
        java.lang.Integer numValueOf3;
        int i13;
        java.lang.String text6;
        int i14;
        java.lang.String text7;
        int i15;
        int i16;
        java.lang.String text8;
        int i17;
        java.lang.String text9;
        int i18;
        java.lang.String text10;
        int i19;
        java.lang.String text11;
        int i20;
        java.lang.String text12;
        int i21;
        java.lang.String text13;
        int i22;
        int i23;
        int i24;
        java.lang.Integer numValueOf4;
        int i25;
        java.lang.Long lValueOf;
        int i26;
        int i27;
        int i28;
        java.lang.String text14;
        int i29;
        LinkedHashMap linkedHashMap2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i30 = 1;
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (str3 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i30);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i30, str3);
                }
                i30++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                LinkedHashMap linkedHashMap4 = linkedHashMap3;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2) && sQLiteStatementPrepare.isNull(columnIndexOrThrow3) && sQLiteStatementPrepare.isNull(columnIndexOrThrow4) && sQLiteStatementPrepare.isNull(columnIndexOrThrow5) && sQLiteStatementPrepare.isNull(columnIndexOrThrow6) && sQLiteStatementPrepare.isNull(columnIndexOrThrow7) && sQLiteStatementPrepare.isNull(columnIndexOrThrow8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow9) && sQLiteStatementPrepare.isNull(columnIndexOrThrow10) && sQLiteStatementPrepare.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13) && sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    int i31 = columnIndexOrThrow15;
                    if (sQLiteStatementPrepare.isNull(i31)) {
                        columnIndexOrThrow15 = i31;
                        int i32 = columnIndexOrThrow16;
                        if (sQLiteStatementPrepare.isNull(i32)) {
                            columnIndexOrThrow16 = i32;
                            int i33 = columnIndexOrThrow17;
                            if (sQLiteStatementPrepare.isNull(i33)) {
                                columnIndexOrThrow17 = i33;
                                int i34 = columnIndexOrThrow18;
                                if (sQLiteStatementPrepare.isNull(i34)) {
                                    columnIndexOrThrow18 = i34;
                                    int i35 = columnIndexOrThrow19;
                                    if (sQLiteStatementPrepare.isNull(i35)) {
                                        columnIndexOrThrow19 = i35;
                                        int i36 = columnIndexOrThrow20;
                                        if (sQLiteStatementPrepare.isNull(i36)) {
                                            columnIndexOrThrow20 = i36;
                                            int i37 = columnIndexOrThrow21;
                                            if (sQLiteStatementPrepare.isNull(i37)) {
                                                columnIndexOrThrow21 = i37;
                                                int i38 = columnIndexOrThrow22;
                                                if (sQLiteStatementPrepare.isNull(i38)) {
                                                    columnIndexOrThrow22 = i38;
                                                    int i39 = columnIndexOrThrow23;
                                                    if (sQLiteStatementPrepare.isNull(i39)) {
                                                        columnIndexOrThrow23 = i39;
                                                        int i40 = columnIndexOrThrow24;
                                                        if (sQLiteStatementPrepare.isNull(i40)) {
                                                            columnIndexOrThrow24 = i40;
                                                            int i41 = columnIndexOrThrow25;
                                                            if (sQLiteStatementPrepare.isNull(i41)) {
                                                                columnIndexOrThrow25 = i41;
                                                                int i42 = columnIndexOrThrow26;
                                                                if (sQLiteStatementPrepare.isNull(i42)) {
                                                                    columnIndexOrThrow26 = i42;
                                                                    int i43 = columnIndexOrThrow27;
                                                                    if (sQLiteStatementPrepare.isNull(i43)) {
                                                                        columnIndexOrThrow27 = i43;
                                                                        int i44 = columnIndexOrThrow28;
                                                                        if (sQLiteStatementPrepare.isNull(i44)) {
                                                                            columnIndexOrThrow28 = i44;
                                                                            int i45 = columnIndexOrThrow29;
                                                                            if (sQLiteStatementPrepare.isNull(i45)) {
                                                                                columnIndexOrThrow29 = i45;
                                                                                int i46 = columnIndexOrThrow30;
                                                                                if (sQLiteStatementPrepare.isNull(i46)) {
                                                                                    columnIndexOrThrow30 = i46;
                                                                                    int i47 = columnIndexOrThrow31;
                                                                                    if (sQLiteStatementPrepare.isNull(i47)) {
                                                                                        columnIndexOrThrow31 = i47;
                                                                                        linkedHashMap3 = linkedHashMap4;
                                                                                        linkedHashMap3.put(text, null);
                                                                                        columnIndexOrThrow14 = columnIndexOrThrow14;
                                                                                        columnIndexOrThrow = i;
                                                                                    } else {
                                                                                        i2 = columnIndexOrThrow14;
                                                                                        columnIndexOrThrow31 = i47;
                                                                                    }
                                                                                } else {
                                                                                    i2 = columnIndexOrThrow14;
                                                                                    columnIndexOrThrow30 = i46;
                                                                                }
                                                                            } else {
                                                                                i2 = columnIndexOrThrow14;
                                                                                columnIndexOrThrow29 = i45;
                                                                            }
                                                                        } else {
                                                                            i2 = columnIndexOrThrow14;
                                                                            columnIndexOrThrow28 = i44;
                                                                        }
                                                                    } else {
                                                                        i2 = columnIndexOrThrow14;
                                                                        columnIndexOrThrow27 = i43;
                                                                    }
                                                                } else {
                                                                    i2 = columnIndexOrThrow14;
                                                                    columnIndexOrThrow26 = i42;
                                                                }
                                                            } else {
                                                                i2 = columnIndexOrThrow14;
                                                                columnIndexOrThrow25 = i41;
                                                            }
                                                        } else {
                                                            i2 = columnIndexOrThrow14;
                                                            columnIndexOrThrow24 = i40;
                                                        }
                                                    } else {
                                                        i2 = columnIndexOrThrow14;
                                                        columnIndexOrThrow23 = i39;
                                                    }
                                                } else {
                                                    i2 = columnIndexOrThrow14;
                                                    columnIndexOrThrow22 = i38;
                                                }
                                            } else {
                                                i2 = columnIndexOrThrow14;
                                                columnIndexOrThrow21 = i37;
                                            }
                                        } else {
                                            i2 = columnIndexOrThrow14;
                                            columnIndexOrThrow20 = i36;
                                        }
                                    } else {
                                        i2 = columnIndexOrThrow14;
                                        columnIndexOrThrow19 = i35;
                                    }
                                } else {
                                    i2 = columnIndexOrThrow14;
                                    columnIndexOrThrow18 = i34;
                                }
                            } else {
                                i2 = columnIndexOrThrow14;
                                columnIndexOrThrow17 = i33;
                            }
                        } else {
                            i2 = columnIndexOrThrow14;
                            columnIndexOrThrow16 = i32;
                        }
                    } else {
                        i2 = columnIndexOrThrow14;
                        columnIndexOrThrow15 = i31;
                    }
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    }
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    }
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    }
                    int i48 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                    int i49 = columnIndexOrThrow3;
                    int i50 = columnIndexOrThrow4;
                    int i51 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                    long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    }
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    }
                    if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    }
                    if (!sQLiteStatementPrepare.isNull(i4)) {
                    }
                    i5 = columnIndexOrThrow15;
                    if (sQLiteStatementPrepare.isNull(i5)) {
                    }
                    i7 = columnIndexOrThrow16;
                    if (sQLiteStatementPrepare.isNull(i7)) {
                    }
                    i8 = columnIndexOrThrow17;
                    if (sQLiteStatementPrepare.isNull(i8)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i9)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i10)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i13)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i14)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i16)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i17)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i18)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i19)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i20)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i21)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i22)) {
                    }
                    if (sQLiteStatementPrepare.isNull(i25)) {
                    }
                    int i52 = columnIndexOrThrow7;
                    int i53 = (int) sQLiteStatementPrepare.getLong(i27);
                    i28 = columnIndexOrThrow31;
                    if (sQLiteStatementPrepare.isNull(i28)) {
                    }
                    cSX csx = new cSX(text, text, text, numValueOf, i48, j, text, text, text, text2, numValueOf2, lValueOf, text3, i51, text4, str2, text5, numValueOf3, text6, text7, text8, text9, text10, text11, text12, text13, numValueOf4, lValueOf, i53, text14);
                    linkedHashMap2 = linkedHashMap;
                    if (!linkedHashMap2.containsKey(text)) {
                    }
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow19 = i15;
                    columnIndexOrThrow20 = i23;
                    columnIndexOrThrow21 = i24;
                    columnIndexOrThrow6 = i26;
                    columnIndexOrThrow28 = i29;
                    columnIndexOrThrow14 = i11;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow29 = i25;
                    columnIndexOrThrow31 = i28;
                    columnIndexOrThrow7 = i52;
                    columnIndexOrThrow4 = i50;
                    columnIndexOrThrow30 = i27;
                    columnIndexOrThrow5 = i3;
                    linkedHashMap3 = linkedHashMap2;
                    columnIndexOrThrow3 = i49;
                } else {
                    i2 = columnIndexOrThrow14;
                    java.lang.String text15 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    java.lang.String text16 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    java.lang.String text17 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                        linkedHashMap = linkedHashMap4;
                        numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                    } else {
                        numValueOf = null;
                        linkedHashMap = linkedHashMap4;
                    }
                    int i482 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                    int i492 = columnIndexOrThrow3;
                    int i502 = columnIndexOrThrow4;
                    int i512 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                    long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                    java.lang.String text18 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    java.lang.String text19 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                    java.lang.String text20 = !sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow12)) {
                        i3 = columnIndexOrThrow5;
                        numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                    } else {
                        i3 = columnIndexOrThrow5;
                        numValueOf2 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                        text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        i4 = i2;
                    } else {
                        i4 = i2;
                        text2 = null;
                    }
                    java.lang.Long lValueOf2 = !sQLiteStatementPrepare.isNull(i4) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i4));
                    i5 = columnIndexOrThrow15;
                    if (sQLiteStatementPrepare.isNull(i5)) {
                        i6 = columnIndexOrThrow2;
                        text3 = sQLiteStatementPrepare.getText(i5);
                    } else {
                        i6 = columnIndexOrThrow2;
                        text3 = null;
                    }
                    i7 = columnIndexOrThrow16;
                    if (sQLiteStatementPrepare.isNull(i7)) {
                        columnIndexOrThrow16 = i7;
                        text4 = sQLiteStatementPrepare.getText(i7);
                    } else {
                        columnIndexOrThrow16 = i7;
                        text4 = null;
                    }
                    i8 = columnIndexOrThrow17;
                    if (sQLiteStatementPrepare.isNull(i8)) {
                        java.lang.String text21 = sQLiteStatementPrepare.getText(i8);
                        columnIndexOrThrow17 = i8;
                        i9 = columnIndexOrThrow18;
                        str2 = text21;
                    } else {
                        columnIndexOrThrow17 = i8;
                        i9 = columnIndexOrThrow18;
                        str2 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i9)) {
                        text5 = sQLiteStatementPrepare.getText(i9);
                        columnIndexOrThrow18 = i9;
                        i10 = columnIndexOrThrow19;
                    } else {
                        columnIndexOrThrow18 = i9;
                        i10 = columnIndexOrThrow19;
                        text5 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i10)) {
                        i11 = i4;
                        i12 = i5;
                        numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i10));
                        i13 = columnIndexOrThrow20;
                    } else {
                        i11 = i4;
                        i12 = i5;
                        i13 = columnIndexOrThrow20;
                        numValueOf3 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i13)) {
                        text6 = sQLiteStatementPrepare.getText(i13);
                        i14 = columnIndexOrThrow21;
                    } else {
                        i14 = columnIndexOrThrow21;
                        text6 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i14)) {
                        text7 = sQLiteStatementPrepare.getText(i14);
                        i15 = i10;
                        i16 = columnIndexOrThrow22;
                    } else {
                        i15 = i10;
                        i16 = columnIndexOrThrow22;
                        text7 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i16)) {
                        columnIndexOrThrow22 = i16;
                        text8 = sQLiteStatementPrepare.getText(i16);
                        i17 = columnIndexOrThrow23;
                    } else {
                        columnIndexOrThrow22 = i16;
                        i17 = columnIndexOrThrow23;
                        text8 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i17)) {
                        columnIndexOrThrow23 = i17;
                        text9 = sQLiteStatementPrepare.getText(i17);
                        i18 = columnIndexOrThrow24;
                    } else {
                        columnIndexOrThrow23 = i17;
                        i18 = columnIndexOrThrow24;
                        text9 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i18)) {
                        columnIndexOrThrow24 = i18;
                        text10 = sQLiteStatementPrepare.getText(i18);
                        i19 = columnIndexOrThrow25;
                    } else {
                        columnIndexOrThrow24 = i18;
                        i19 = columnIndexOrThrow25;
                        text10 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i19)) {
                        columnIndexOrThrow25 = i19;
                        text11 = sQLiteStatementPrepare.getText(i19);
                        i20 = columnIndexOrThrow26;
                    } else {
                        columnIndexOrThrow25 = i19;
                        i20 = columnIndexOrThrow26;
                        text11 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i20)) {
                        columnIndexOrThrow26 = i20;
                        text12 = sQLiteStatementPrepare.getText(i20);
                        i21 = columnIndexOrThrow27;
                    } else {
                        columnIndexOrThrow26 = i20;
                        i21 = columnIndexOrThrow27;
                        text12 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i21)) {
                        columnIndexOrThrow27 = i21;
                        text13 = sQLiteStatementPrepare.getText(i21);
                        i22 = columnIndexOrThrow28;
                    } else {
                        columnIndexOrThrow27 = i21;
                        i22 = columnIndexOrThrow28;
                        text13 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i22)) {
                        i23 = i13;
                        i24 = i14;
                        numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i22));
                        i25 = columnIndexOrThrow29;
                    } else {
                        i23 = i13;
                        i24 = i14;
                        i25 = columnIndexOrThrow29;
                        numValueOf4 = null;
                    }
                    if (sQLiteStatementPrepare.isNull(i25)) {
                        lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i25));
                        i26 = columnIndexOrThrow6;
                        i27 = columnIndexOrThrow30;
                    } else {
                        i26 = columnIndexOrThrow6;
                        i27 = columnIndexOrThrow30;
                        lValueOf = null;
                    }
                    int i522 = columnIndexOrThrow7;
                    int i532 = (int) sQLiteStatementPrepare.getLong(i27);
                    i28 = columnIndexOrThrow31;
                    if (sQLiteStatementPrepare.isNull(i28)) {
                        text14 = sQLiteStatementPrepare.getText(i28);
                        i29 = i22;
                    } else {
                        i29 = i22;
                        text14 = null;
                    }
                    cSX csx2 = new cSX(text15, text16, text17, numValueOf, i482, j2, text18, text19, text20, text2, numValueOf2, lValueOf2, text3, i512, text4, str2, text5, numValueOf3, text6, text7, text8, text9, text10, text11, text12, text13, numValueOf4, lValueOf, i532, text14);
                    linkedHashMap2 = linkedHashMap;
                    if (!linkedHashMap2.containsKey(text)) {
                        linkedHashMap2.put(text, csx2);
                    }
                    columnIndexOrThrow2 = i6;
                    columnIndexOrThrow15 = i12;
                    columnIndexOrThrow19 = i15;
                    columnIndexOrThrow20 = i23;
                    columnIndexOrThrow21 = i24;
                    columnIndexOrThrow6 = i26;
                    columnIndexOrThrow28 = i29;
                    columnIndexOrThrow14 = i11;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow29 = i25;
                    columnIndexOrThrow31 = i28;
                    columnIndexOrThrow7 = i522;
                    columnIndexOrThrow4 = i502;
                    columnIndexOrThrow30 = i27;
                    columnIndexOrThrow5 = i3;
                    linkedHashMap3 = linkedHashMap2;
                    columnIndexOrThrow3 = i492;
                }
            }
            return linkedHashMap3;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<cSX> copydefault(final java.util.List<java.lang.Integer> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM OKRootWallet WHERE type IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") ORDER BY sortIndex");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.isConnected(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List isConnected(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        int i3;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i4;
        java.lang.String text2;
        int i5;
        int i6;
        java.lang.String text3;
        int i7;
        java.lang.String str2;
        int i8;
        java.lang.Integer numValueOf3;
        int i9;
        java.lang.String text4;
        int i10;
        java.lang.String text5;
        int i11;
        int i12;
        java.lang.String text6;
        int i13;
        java.lang.String text7;
        int i14;
        java.lang.String text8;
        int i15;
        java.lang.String text9;
        int i16;
        java.lang.String text10;
        int i17;
        java.lang.String text11;
        int i18;
        int i19;
        int i20;
        java.lang.Integer numValueOf4;
        int i21;
        java.lang.Long lValueOf;
        int i22;
        int i23;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i24 = 1;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i24);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i24, r3.intValue());
                }
                i24++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i25 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i26 = columnIndexOrThrow4;
                int i27 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i3 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i4 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i4 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i4)) {
                    i5 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i4);
                    i5 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow;
                    text3 = null;
                } else {
                    i6 = columnIndexOrThrow;
                    text3 = sQLiteStatementPrepare.getText(i5);
                }
                int i28 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i28)) {
                    columnIndexOrThrow17 = i28;
                    i7 = columnIndexOrThrow18;
                    str2 = null;
                } else {
                    java.lang.String text19 = sQLiteStatementPrepare.getText(i28);
                    columnIndexOrThrow17 = i28;
                    i7 = columnIndexOrThrow18;
                    str2 = text19;
                }
                if (sQLiteStatementPrepare.isNull(i7)) {
                    i8 = i4;
                    columnIndexOrThrow16 = i5;
                    i9 = columnIndexOrThrow19;
                    numValueOf3 = null;
                } else {
                    i8 = i4;
                    columnIndexOrThrow16 = i5;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i7));
                    i9 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i9)) {
                    i10 = columnIndexOrThrow20;
                    text4 = null;
                } else {
                    text4 = sQLiteStatementPrepare.getText(i9);
                    i10 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = i7;
                    i12 = columnIndexOrThrow21;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i10);
                    i11 = i7;
                    i12 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    columnIndexOrThrow21 = i12;
                    i13 = columnIndexOrThrow22;
                    text6 = null;
                } else {
                    columnIndexOrThrow21 = i12;
                    text6 = sQLiteStatementPrepare.getText(i12);
                    i13 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow22 = i13;
                    i14 = columnIndexOrThrow23;
                    text7 = null;
                } else {
                    columnIndexOrThrow22 = i13;
                    text7 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow23 = i14;
                    i15 = columnIndexOrThrow24;
                    text8 = null;
                } else {
                    columnIndexOrThrow23 = i14;
                    text8 = sQLiteStatementPrepare.getText(i14);
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow24 = i15;
                    i16 = columnIndexOrThrow25;
                    text9 = null;
                } else {
                    columnIndexOrThrow24 = i15;
                    text9 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow25 = i16;
                    i17 = columnIndexOrThrow26;
                    text10 = null;
                } else {
                    columnIndexOrThrow25 = i16;
                    text10 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow26 = i17;
                    i18 = columnIndexOrThrow27;
                    text11 = null;
                } else {
                    columnIndexOrThrow26 = i17;
                    text11 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    i19 = i9;
                    i20 = i10;
                    i21 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    i19 = i9;
                    i20 = i10;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i18));
                    i21 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i21)) {
                    i22 = columnIndexOrThrow6;
                    i23 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i21));
                    i22 = columnIndexOrThrow6;
                    i23 = columnIndexOrThrow29;
                }
                int i29 = columnIndexOrThrow7;
                int i30 = columnIndexOrThrow30;
                int i31 = i18;
                arrayList.add(new cSX(text12, text13, text14, numValueOf, i25, j, text15, text16, text17, text18, numValueOf2, lValueOf2, text, i27, text2, text3, str2, numValueOf3, text4, text5, text6, text7, text8, text9, text10, text11, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i23), sQLiteStatementPrepare.isNull(i30) ? null : sQLiteStatementPrepare.getText(i30)));
                columnIndexOrThrow = i6;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow18 = i11;
                columnIndexOrThrow19 = i19;
                columnIndexOrThrow20 = i20;
                columnIndexOrThrow6 = i22;
                columnIndexOrThrow27 = i31;
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow28 = i21;
                columnIndexOrThrow30 = i30;
                columnIndexOrThrow7 = i29;
                columnIndexOrThrow4 = i26;
                columnIndexOrThrow29 = i23;
                columnIndexOrThrow5 = i3;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> KWHzl() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fIwbmz((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List fIwbmz(androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet ORDER BY orderValue");
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

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> KWHzl(final java.util.List<java.lang.Integer> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet WHERE type IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") ORDER BY orderValue");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.DbNXlk(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List DbNXlk(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i13);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i13, r3.intValue());
                }
                i13++;
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
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
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
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i16 = columnIndexOrThrow4;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i18 = columnIndexOrThrow5;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i20 = columnIndexOrThrow6;
                int i21 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i22 = columnIndexOrThrow7;
                int i23 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
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
                int i24 = columnIndexOrThrow8;
                int i25 = (int) sQLiteStatementPrepare.getLong(i5);
                int i26 = columnIndexOrThrow15;
                int i27 = columnIndexOrThrow10;
                int i28 = columnIndexOrThrow11;
                int i29 = (int) sQLiteStatementPrepare.getLong(i26);
                int i30 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i30);
                int i31 = columnIndexOrThrow;
                int i32 = columnIndexOrThrow17;
                int i33 = columnIndexOrThrow12;
                int i34 = (int) sQLiteStatementPrepare.getLong(i32);
                int i35 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i7 = i32;
                    i6 = i35;
                    i8 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    i6 = i35;
                    text4 = sQLiteStatementPrepare.getText(i35);
                    i7 = i32;
                    i8 = columnIndexOrThrow19;
                }
                int i36 = columnIndexOrThrow13;
                int i37 = (int) sQLiteStatementPrepare.getLong(i8);
                int i38 = columnIndexOrThrow20;
                int i39 = (int) sQLiteStatementPrepare.getLong(i38);
                int i40 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i40);
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = i40;
                    i12 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i11 = i40;
                    text6 = sQLiteStatementPrepare.getText(i10);
                    columnIndexOrThrow22 = i10;
                    i12 = columnIndexOrThrow23;
                }
                int i41 = columnIndexOrThrow24;
                int i42 = columnIndexOrThrow25;
                int i43 = i12;
                WalletEntity walletEntity = new WalletEntity(text, i14, text7, j, text8, text2, i15, i17, i19, i21, i23, text9, text3, i25, i29, j2, i34, text4, i37, i39, text5, text6, (int) sQLiteStatementPrepare.getLong(i12), (int) sQLiteStatementPrepare.getLong(i41), sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i27;
                columnIndexOrThrow = i31;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow24 = i41;
                columnIndexOrThrow13 = i36;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow20 = i38;
                columnIndexOrThrow23 = i43;
                columnIndexOrThrow8 = i24;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow6 = i20;
                columnIndexOrThrow7 = i22;
                columnIndexOrThrow9 = i4;
                columnIndexOrThrow11 = i28;
                columnIndexOrThrow16 = i30;
                columnIndexOrThrow21 = i11;
                columnIndexOrThrow25 = i42;
                columnIndexOrThrow12 = i33;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i6;
                int i44 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i44;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object copydefault(final java.util.List<java.lang.Integer> list, Continuation<? super java.util.List<WalletEntity>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM wallet WHERE type IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(") ORDER BY orderValue");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.values(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List values(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i13);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i13, r3.intValue());
                }
                i13++;
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
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
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
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i16 = columnIndexOrThrow4;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i18 = columnIndexOrThrow5;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i20 = columnIndexOrThrow6;
                int i21 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i22 = columnIndexOrThrow7;
                int i23 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
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
                int i24 = columnIndexOrThrow8;
                int i25 = (int) sQLiteStatementPrepare.getLong(i5);
                int i26 = columnIndexOrThrow15;
                int i27 = columnIndexOrThrow10;
                int i28 = columnIndexOrThrow11;
                int i29 = (int) sQLiteStatementPrepare.getLong(i26);
                int i30 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i30);
                int i31 = columnIndexOrThrow;
                int i32 = columnIndexOrThrow17;
                int i33 = columnIndexOrThrow12;
                int i34 = (int) sQLiteStatementPrepare.getLong(i32);
                int i35 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i7 = i32;
                    i6 = i35;
                    i8 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    i6 = i35;
                    text4 = sQLiteStatementPrepare.getText(i35);
                    i7 = i32;
                    i8 = columnIndexOrThrow19;
                }
                int i36 = columnIndexOrThrow13;
                int i37 = (int) sQLiteStatementPrepare.getLong(i8);
                int i38 = columnIndexOrThrow20;
                int i39 = (int) sQLiteStatementPrepare.getLong(i38);
                int i40 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i40);
                    i9 = i8;
                    i10 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    i11 = i40;
                    i12 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i11 = i40;
                    text6 = sQLiteStatementPrepare.getText(i10);
                    columnIndexOrThrow22 = i10;
                    i12 = columnIndexOrThrow23;
                }
                int i41 = columnIndexOrThrow24;
                int i42 = columnIndexOrThrow25;
                int i43 = i12;
                WalletEntity walletEntity = new WalletEntity(text, i14, text7, j, text8, text2, i15, i17, i19, i21, i23, text9, text3, i25, i29, j2, i34, text4, i37, i39, text5, text6, (int) sQLiteStatementPrepare.getLong(i12), (int) sQLiteStatementPrepare.getLong(i41), sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i27;
                columnIndexOrThrow = i31;
                columnIndexOrThrow14 = i5;
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow24 = i41;
                columnIndexOrThrow13 = i36;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow20 = i38;
                columnIndexOrThrow23 = i43;
                columnIndexOrThrow8 = i24;
                columnIndexOrThrow3 = i2;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow6 = i20;
                columnIndexOrThrow7 = i22;
                columnIndexOrThrow9 = i4;
                columnIndexOrThrow11 = i28;
                columnIndexOrThrow16 = i30;
                columnIndexOrThrow21 = i11;
                columnIndexOrThrow25 = i42;
                columnIndexOrThrow12 = i33;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i6;
                int i44 = i3;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i44;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object OLrzqt(final int i, Continuation<? super java.util.List<WalletEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.EZpvd(i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List EZpvd(int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        int i6;
        int i7;
        java.lang.String text4;
        int i8;
        int i9;
        java.lang.String text5;
        int i10;
        int i11;
        int i12;
        java.lang.String text6;
        int i13;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE syncStatus !=? ORDER BY orderValue");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
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
                    i2 = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow14;
                }
                int i14 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i4 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow3;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i4 = columnIndexOrThrow2;
                }
                int i15 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i16 = columnIndexOrThrow4;
                int i17 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                int i18 = columnIndexOrThrow5;
                int i19 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                int i20 = columnIndexOrThrow6;
                int i21 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10);
                int i22 = columnIndexOrThrow7;
                int i23 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11);
                java.lang.String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                }
                int i24 = columnIndexOrThrow8;
                int i25 = (int) sQLiteStatementPrepare.getLong(i6);
                int i26 = columnIndexOrThrow15;
                int i27 = columnIndexOrThrow10;
                int i28 = columnIndexOrThrow11;
                int i29 = (int) sQLiteStatementPrepare.getLong(i26);
                int i30 = columnIndexOrThrow16;
                long j2 = sQLiteStatementPrepare.getLong(i30);
                int i31 = columnIndexOrThrow;
                int i32 = columnIndexOrThrow17;
                int i33 = columnIndexOrThrow12;
                int i34 = (int) sQLiteStatementPrepare.getLong(i32);
                int i35 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i35)) {
                    i8 = i32;
                    i7 = i35;
                    i9 = columnIndexOrThrow19;
                    text4 = null;
                } else {
                    i7 = i35;
                    text4 = sQLiteStatementPrepare.getText(i35);
                    i8 = i32;
                    i9 = columnIndexOrThrow19;
                }
                int i36 = columnIndexOrThrow13;
                int i37 = (int) sQLiteStatementPrepare.getLong(i9);
                int i38 = columnIndexOrThrow20;
                int i39 = (int) sQLiteStatementPrepare.getLong(i38);
                int i40 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i40)) {
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i40);
                    i10 = i9;
                    i11 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    columnIndexOrThrow22 = i11;
                    i12 = i40;
                    i13 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    i12 = i40;
                    text6 = sQLiteStatementPrepare.getText(i11);
                    columnIndexOrThrow22 = i11;
                    i13 = columnIndexOrThrow23;
                }
                int i41 = columnIndexOrThrow24;
                int i42 = columnIndexOrThrow25;
                int i43 = i13;
                WalletEntity walletEntity = new WalletEntity(text, i14, text7, j, text8, text2, i15, i17, i19, i21, i23, text9, text3, i25, i29, j2, i34, text4, i37, i39, text5, text6, (int) sQLiteStatementPrepare.getLong(i13), (int) sQLiteStatementPrepare.getLong(i41), sQLiteStatementPrepare.isNull(i42) ? null : sQLiteStatementPrepare.getText(i42));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i27;
                columnIndexOrThrow = i31;
                columnIndexOrThrow14 = i6;
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow24 = i41;
                columnIndexOrThrow13 = i36;
                columnIndexOrThrow19 = i10;
                columnIndexOrThrow20 = i38;
                columnIndexOrThrow23 = i43;
                columnIndexOrThrow8 = i24;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow6 = i20;
                columnIndexOrThrow7 = i22;
                columnIndexOrThrow9 = i5;
                columnIndexOrThrow11 = i28;
                columnIndexOrThrow16 = i30;
                columnIndexOrThrow21 = i12;
                columnIndexOrThrow25 = i42;
                columnIndexOrThrow12 = i33;
                columnIndexOrThrow17 = i8;
                columnIndexOrThrow18 = i7;
                int i44 = i4;
                arrayList2 = arrayList3;
                columnIndexOrThrow2 = i44;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> AYXKKw(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.getNewProxyInstance(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List getNewProxyInstance(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE rootWalletId =? ORDER BY orderValue");
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

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> fetchVPNInfo(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.zLjUOn(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List zLjUOn(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE rootWalletId =? LIMIT 1");
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

    @Override // o.InterfaceC11384cMf
    public WalletEntity gEmmrt(final java.lang.String str) {
        return (WalletEntity) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.zsXlph(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ WalletEntity zsXlph(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.lang.String text;
        int i;
        int i2;
        java.lang.String text2;
        int i3;
        java.lang.String text3;
        int i4;
        java.lang.String text4;
        int i5;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE id = ?");
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

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> EZpvd() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AuCTel((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AuCTel(androidx.sqlite.SQLiteConnection sQLiteConnection) {
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

    @Override // o.InterfaceC11384cMf
    public java.lang.Object OLrzqt(Continuation<? super java.util.List<java.lang.String>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fARcdN((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List fARcdN(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT id FROM wallet");
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

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletEntity> AEQbTJ(final java.lang.String str, final long j, final int i, final java.lang.String str2) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.KWHzl(i, str2, str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List KWHzl(int i, java.lang.String str, java.lang.String str2, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        java.util.ArrayList arrayList;
        java.lang.String text;
        int i2;
        int i3;
        java.lang.String text2;
        int i4;
        java.lang.String text3;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String text4;
        java.lang.String text5;
        int i9;
        int i10;
        java.lang.String text6;
        int i11;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM wallet WHERE type = ? AND rootWalletId IN (SELECT rootWalletId FROM hardware_info WHERE hardwareUniqueId = ?) AND id IN (SELECT walletId FROM chain_address WHERE address = ? AND chainId = ?)");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(3);
            } else {
                sQLiteStatementPrepare.mo5795bindText(3, str2);
            }
            sQLiteStatementPrepare.mo5793bindLong(4, j);
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
                    i2 = columnIndexOrThrow14;
                    arrayList = arrayList2;
                    text = null;
                } else {
                    arrayList = arrayList2;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                    i2 = columnIndexOrThrow14;
                }
                int i12 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                java.lang.String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                java.lang.String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow6)) {
                    i4 = columnIndexOrThrow;
                    i3 = columnIndexOrThrow2;
                    text2 = null;
                } else {
                    i3 = columnIndexOrThrow2;
                    text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                    i4 = columnIndexOrThrow;
                }
                int i13 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                int i14 = columnIndexOrThrow3;
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
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                    text3 = null;
                } else {
                    text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                    i5 = columnIndexOrThrow9;
                    i6 = i2;
                }
                int i23 = columnIndexOrThrow8;
                int i24 = (int) sQLiteStatementPrepare.getLong(i6);
                int i25 = columnIndexOrThrow15;
                int i26 = columnIndexOrThrow10;
                int i27 = columnIndexOrThrow11;
                int i28 = (int) sQLiteStatementPrepare.getLong(i25);
                int i29 = columnIndexOrThrow16;
                long j3 = sQLiteStatementPrepare.getLong(i29);
                int i30 = columnIndexOrThrow17;
                int i31 = columnIndexOrThrow12;
                int i32 = (int) sQLiteStatementPrepare.getLong(i30);
                int i33 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i33)) {
                    i7 = i30;
                    i8 = i33;
                    text4 = null;
                } else {
                    i7 = i30;
                    i8 = i33;
                    text4 = sQLiteStatementPrepare.getText(i33);
                }
                int i34 = columnIndexOrThrow19;
                int i35 = columnIndexOrThrow13;
                int i36 = (int) sQLiteStatementPrepare.getLong(i34);
                int i37 = columnIndexOrThrow20;
                int i38 = (int) sQLiteStatementPrepare.getLong(i37);
                int i39 = columnIndexOrThrow21;
                if (sQLiteStatementPrepare.isNull(i39)) {
                    i9 = i34;
                    i10 = columnIndexOrThrow22;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i39);
                    i9 = i34;
                    i10 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    columnIndexOrThrow22 = i10;
                    columnIndexOrThrow20 = i37;
                    i11 = columnIndexOrThrow23;
                    text6 = null;
                } else {
                    columnIndexOrThrow20 = i37;
                    text6 = sQLiteStatementPrepare.getText(i10);
                    columnIndexOrThrow22 = i10;
                    i11 = columnIndexOrThrow23;
                }
                int i40 = columnIndexOrThrow24;
                int i41 = columnIndexOrThrow25;
                int i42 = i11;
                WalletEntity walletEntity = new WalletEntity(text, i12, text7, j2, text8, text2, i13, i16, i18, i20, i22, text9, text3, i24, i28, j3, i32, text4, i36, i38, text5, text6, (int) sQLiteStatementPrepare.getLong(i11), (int) sQLiteStatementPrepare.getLong(i40), sQLiteStatementPrepare.isNull(i41) ? null : sQLiteStatementPrepare.getText(i41));
                java.util.ArrayList arrayList3 = arrayList;
                arrayList3.add(walletEntity);
                columnIndexOrThrow10 = i26;
                columnIndexOrThrow3 = i14;
                columnIndexOrThrow14 = i6;
                columnIndexOrThrow15 = i25;
                columnIndexOrThrow24 = i40;
                columnIndexOrThrow8 = i23;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow4 = i15;
                columnIndexOrThrow5 = i17;
                columnIndexOrThrow6 = i19;
                columnIndexOrThrow7 = i21;
                columnIndexOrThrow9 = i5;
                columnIndexOrThrow11 = i27;
                columnIndexOrThrow16 = i29;
                columnIndexOrThrow13 = i35;
                columnIndexOrThrow19 = i9;
                columnIndexOrThrow21 = i39;
                columnIndexOrThrow23 = i42;
                columnIndexOrThrow25 = i41;
                columnIndexOrThrow12 = i31;
                columnIndexOrThrow17 = i7;
                columnIndexOrThrow18 = i8;
                int i43 = i4;
                arrayList2 = arrayList3;
                columnIndexOrThrow = i43;
            }
            return arrayList2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<cSX> KWHzl(final java.util.List<java.lang.Integer> list, final java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM OKRootWallet WHERE type IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sb, size);
        sb.append(") AND hardwareUniqueId = ");
        sb.append("?");
        sb.append(" AND rootWalletId in (SELECT rootWalletId FROM hardware_info) ORDER BY sortIndex");
        final java.lang.String string = sb.toString();
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.EZpvd(string, list, size, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List EZpvd(java.lang.String str, java.util.List list, int i, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        java.lang.Integer numValueOf;
        int i4;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i5;
        java.lang.String text2;
        int i6;
        int i7;
        java.lang.String text3;
        java.lang.String text4;
        int i8;
        int i9;
        java.lang.Integer numValueOf3;
        java.lang.String text5;
        int i10;
        java.lang.String text6;
        int i11;
        int i12;
        java.lang.String text7;
        int i13;
        java.lang.String text8;
        int i14;
        java.lang.String text9;
        int i15;
        java.lang.String text10;
        int i16;
        java.lang.String text11;
        int i17;
        java.lang.String text12;
        int i18;
        int i19;
        java.lang.Integer numValueOf4;
        int i20;
        java.lang.Long lValueOf;
        int i21;
        int i22;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i23 = 1;
            while (it.hasNext()) {
                if (((java.lang.Integer) it.next()) == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i23);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i23, r5.intValue());
                }
                i23++;
            }
            int i24 = i + 1;
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(i24);
            } else {
                sQLiteStatementPrepare.mo5795bindText(i24, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow2;
                    i3 = columnIndexOrThrow3;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i25 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i26 = columnIndexOrThrow4;
                int i27 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i4 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i4 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i5 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i5);
                    i6 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    i7 = columnIndexOrThrow;
                    text3 = null;
                } else {
                    i7 = columnIndexOrThrow;
                    text3 = sQLiteStatementPrepare.getText(i6);
                }
                int i28 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i28)) {
                    columnIndexOrThrow17 = i28;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i28;
                    text4 = sQLiteStatementPrepare.getText(i28);
                }
                int i29 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i29)) {
                    i8 = i5;
                    i9 = i6;
                    numValueOf3 = null;
                } else {
                    i8 = i5;
                    i9 = i6;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i29));
                }
                int i30 = columnIndexOrThrow19;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i10 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i30);
                    i10 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = i29;
                    i12 = columnIndexOrThrow21;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i10);
                    i11 = i29;
                    i12 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i12)) {
                    columnIndexOrThrow21 = i12;
                    i13 = columnIndexOrThrow22;
                    text7 = null;
                } else {
                    text7 = sQLiteStatementPrepare.getText(i12);
                    columnIndexOrThrow21 = i12;
                    i13 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow22 = i13;
                    i14 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    text8 = sQLiteStatementPrepare.getText(i13);
                    columnIndexOrThrow22 = i13;
                    i14 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow23 = i14;
                    i15 = columnIndexOrThrow24;
                    text9 = null;
                } else {
                    text9 = sQLiteStatementPrepare.getText(i14);
                    columnIndexOrThrow23 = i14;
                    i15 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow24 = i15;
                    i16 = columnIndexOrThrow25;
                    text10 = null;
                } else {
                    text10 = sQLiteStatementPrepare.getText(i15);
                    columnIndexOrThrow24 = i15;
                    i16 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow25 = i16;
                    i17 = columnIndexOrThrow26;
                    text11 = null;
                } else {
                    text11 = sQLiteStatementPrepare.getText(i16);
                    columnIndexOrThrow25 = i16;
                    i17 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow26 = i17;
                    i18 = columnIndexOrThrow27;
                    text12 = null;
                } else {
                    text12 = sQLiteStatementPrepare.getText(i17);
                    columnIndexOrThrow26 = i17;
                    i18 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow19 = i30;
                    i19 = i10;
                    i20 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    columnIndexOrThrow19 = i30;
                    i19 = i10;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i18));
                    i20 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i20)) {
                    i21 = columnIndexOrThrow6;
                    i22 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i20));
                    i21 = columnIndexOrThrow6;
                    i22 = columnIndexOrThrow29;
                }
                int i31 = columnIndexOrThrow7;
                int i32 = columnIndexOrThrow30;
                int i33 = i18;
                arrayList.add(new cSX(text13, text14, text15, numValueOf, i25, j, text16, text17, text18, text19, numValueOf2, lValueOf2, text, i27, text2, text3, text4, numValueOf3, text5, text6, text7, text8, text9, text10, text11, text12, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i22), sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32)));
                columnIndexOrThrow = i7;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow18 = i11;
                columnIndexOrThrow20 = i19;
                columnIndexOrThrow6 = i21;
                columnIndexOrThrow27 = i33;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow3 = i3;
                columnIndexOrThrow28 = i20;
                columnIndexOrThrow30 = i32;
                columnIndexOrThrow7 = i31;
                columnIndexOrThrow4 = i26;
                columnIndexOrThrow29 = i22;
                columnIndexOrThrow5 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<cSX> copydefault(final java.lang.String str, final java.lang.String str2, final int i) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AEQbTJ(str, str2, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, java.lang.String str2, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i2;
        int i3;
        java.lang.Integer numValueOf;
        int i4;
        java.lang.Integer numValueOf2;
        java.lang.String text;
        int i5;
        java.lang.String text2;
        int i6;
        int i7;
        java.lang.String text3;
        java.lang.String text4;
        int i8;
        int i9;
        java.lang.Integer numValueOf3;
        int i10;
        java.lang.String text5;
        int i11;
        java.lang.String text6;
        int i12;
        int i13;
        java.lang.String text7;
        int i14;
        java.lang.String text8;
        int i15;
        java.lang.String text9;
        int i16;
        java.lang.String text10;
        int i17;
        java.lang.String text11;
        int i18;
        java.lang.String text12;
        int i19;
        int i20;
        int i21;
        java.lang.Integer numValueOf4;
        int i22;
        java.lang.Long lValueOf;
        int i23;
        int i24;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM OKRootWallet WHERE hardwareUniqueId = ? AND hardwarePassphraseId =? AND type =? ORDER BY sortIndex");
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
            sQLiteStatementPrepare.mo5793bindLong(3, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletIds");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortIndex");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createIndex");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareCreateAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareData");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcRootWalletId");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                java.lang.String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    i2 = columnIndexOrThrow;
                    i3 = columnIndexOrThrow2;
                    numValueOf = null;
                } else {
                    i2 = columnIndexOrThrow;
                    i3 = columnIndexOrThrow2;
                    numValueOf = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4));
                }
                int i25 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                int i26 = columnIndexOrThrow3;
                int i27 = columnIndexOrThrow4;
                int i28 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6);
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                java.lang.String text16 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                java.lang.String text17 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                java.lang.String text18 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11)) {
                    i4 = columnIndexOrThrow5;
                    numValueOf2 = null;
                } else {
                    i4 = columnIndexOrThrow5;
                    numValueOf2 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                }
                java.lang.String text19 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                java.lang.Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow13));
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                    i5 = columnIndexOrThrow15;
                    text = null;
                } else {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                    i5 = columnIndexOrThrow15;
                }
                if (sQLiteStatementPrepare.isNull(i5)) {
                    i6 = columnIndexOrThrow16;
                    text2 = null;
                } else {
                    text2 = sQLiteStatementPrepare.getText(i5);
                    i6 = columnIndexOrThrow16;
                }
                if (sQLiteStatementPrepare.isNull(i6)) {
                    i7 = i26;
                    text3 = null;
                } else {
                    i7 = i26;
                    text3 = sQLiteStatementPrepare.getText(i6);
                }
                int i29 = columnIndexOrThrow17;
                if (sQLiteStatementPrepare.isNull(i29)) {
                    columnIndexOrThrow17 = i29;
                    text4 = null;
                } else {
                    columnIndexOrThrow17 = i29;
                    text4 = sQLiteStatementPrepare.getText(i29);
                }
                int i30 = columnIndexOrThrow18;
                if (sQLiteStatementPrepare.isNull(i30)) {
                    i8 = i5;
                    i9 = i6;
                    i10 = columnIndexOrThrow19;
                    numValueOf3 = null;
                } else {
                    i8 = i5;
                    i9 = i6;
                    numValueOf3 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i30));
                    i10 = columnIndexOrThrow19;
                }
                if (sQLiteStatementPrepare.isNull(i10)) {
                    i11 = columnIndexOrThrow20;
                    text5 = null;
                } else {
                    text5 = sQLiteStatementPrepare.getText(i10);
                    i11 = columnIndexOrThrow20;
                }
                if (sQLiteStatementPrepare.isNull(i11)) {
                    i12 = i30;
                    i13 = columnIndexOrThrow21;
                    text6 = null;
                } else {
                    text6 = sQLiteStatementPrepare.getText(i11);
                    i12 = i30;
                    i13 = columnIndexOrThrow21;
                }
                if (sQLiteStatementPrepare.isNull(i13)) {
                    columnIndexOrThrow21 = i13;
                    i14 = columnIndexOrThrow22;
                    text7 = null;
                } else {
                    columnIndexOrThrow21 = i13;
                    text7 = sQLiteStatementPrepare.getText(i13);
                    i14 = columnIndexOrThrow22;
                }
                if (sQLiteStatementPrepare.isNull(i14)) {
                    columnIndexOrThrow22 = i14;
                    i15 = columnIndexOrThrow23;
                    text8 = null;
                } else {
                    columnIndexOrThrow22 = i14;
                    text8 = sQLiteStatementPrepare.getText(i14);
                    i15 = columnIndexOrThrow23;
                }
                if (sQLiteStatementPrepare.isNull(i15)) {
                    columnIndexOrThrow23 = i15;
                    i16 = columnIndexOrThrow24;
                    text9 = null;
                } else {
                    columnIndexOrThrow23 = i15;
                    text9 = sQLiteStatementPrepare.getText(i15);
                    i16 = columnIndexOrThrow24;
                }
                if (sQLiteStatementPrepare.isNull(i16)) {
                    columnIndexOrThrow24 = i16;
                    i17 = columnIndexOrThrow25;
                    text10 = null;
                } else {
                    columnIndexOrThrow24 = i16;
                    text10 = sQLiteStatementPrepare.getText(i16);
                    i17 = columnIndexOrThrow25;
                }
                if (sQLiteStatementPrepare.isNull(i17)) {
                    columnIndexOrThrow25 = i17;
                    i18 = columnIndexOrThrow26;
                    text11 = null;
                } else {
                    columnIndexOrThrow25 = i17;
                    text11 = sQLiteStatementPrepare.getText(i17);
                    i18 = columnIndexOrThrow26;
                }
                if (sQLiteStatementPrepare.isNull(i18)) {
                    columnIndexOrThrow26 = i18;
                    i19 = columnIndexOrThrow27;
                    text12 = null;
                } else {
                    columnIndexOrThrow26 = i18;
                    text12 = sQLiteStatementPrepare.getText(i18);
                    i19 = columnIndexOrThrow27;
                }
                if (sQLiteStatementPrepare.isNull(i19)) {
                    i20 = i10;
                    i21 = i11;
                    i22 = columnIndexOrThrow28;
                    numValueOf4 = null;
                } else {
                    i20 = i10;
                    i21 = i11;
                    numValueOf4 = java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(i19));
                    i22 = columnIndexOrThrow28;
                }
                if (sQLiteStatementPrepare.isNull(i22)) {
                    i23 = columnIndexOrThrow6;
                    i24 = columnIndexOrThrow29;
                    lValueOf = null;
                } else {
                    lValueOf = java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(i22));
                    i23 = columnIndexOrThrow6;
                    i24 = columnIndexOrThrow29;
                }
                int i31 = columnIndexOrThrow7;
                int i32 = columnIndexOrThrow30;
                int i33 = i19;
                arrayList.add(new cSX(text13, text14, text15, numValueOf, i25, j, text16, text17, text18, text19, numValueOf2, lValueOf2, text, i28, text2, text3, text4, numValueOf3, text5, text6, text7, text8, text9, text10, text11, text12, numValueOf4, lValueOf, (int) sQLiteStatementPrepare.getLong(i24), sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32)));
                columnIndexOrThrow3 = i7;
                columnIndexOrThrow15 = i8;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow18 = i12;
                columnIndexOrThrow19 = i20;
                columnIndexOrThrow20 = i21;
                columnIndexOrThrow6 = i23;
                columnIndexOrThrow27 = i33;
                columnIndexOrThrow = i2;
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow28 = i22;
                columnIndexOrThrow30 = i32;
                columnIndexOrThrow7 = i31;
                columnIndexOrThrow4 = i27;
                columnIndexOrThrow29 = i24;
                columnIndexOrThrow5 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<HardwareInfoEntity> AhwBna(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.wlaJM(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List wlaJM(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM hardware_info WHERE hardwareUniqueId =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareUniqueId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwarePassphraseId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareName");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareSystem");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "hardwareType");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createAt");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new HardwareInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<MPCWalletEntity> EZpvd(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.uzCIH(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List uzCIH(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MPCInfo WHERE uid =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
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
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow3 = i;
                columnIndexOrThrow = i5;
                columnIndexOrThrow15 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<MPCWalletEntity> OLrzqt(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.getFieldNames(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List getFieldNames(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MPCInfo WHERE rootWalletId =?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
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
                columnIndexOrThrow16 = i6;
                columnIndexOrThrow2 = i2;
                columnIndexOrThrow4 = i3;
                columnIndexOrThrow3 = i;
                columnIndexOrThrow = i5;
                columnIndexOrThrow15 = i4;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object OLrzqt(final java.util.List<java.lang.String> list, Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<MPCWalletEntity>>> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM MPCInfo WHERE rootWalletId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cNE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.gEmmrt(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0206 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d9 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7 A[Catch: all -> 0x025c, TryCatch #0 {all -> 0x025c, blocks: (B:3:0x000a, B:4:0x000f, B:6:0x0015, B:8:0x001d, B:10:0x0024, B:9:0x0021, B:11:0x0027, B:12:0x0094, B:14:0x009a, B:18:0x00af, B:20:0x00b5, B:22:0x00c9, B:24:0x00cf, B:26:0x00d5, B:28:0x00db, B:30:0x00e1, B:32:0x00e7, B:34:0x00ed, B:36:0x00f3, B:38:0x00f9, B:40:0x00ff, B:42:0x0105, B:44:0x010b, B:46:0x0111, B:48:0x0119, B:50:0x0123, B:52:0x012d, B:60:0x015a, B:64:0x0169, B:68:0x0178, B:72:0x0187, B:76:0x019e, B:80:0x01b2, B:84:0x01c1, B:88:0x01d0, B:92:0x01df, B:96:0x01ee, B:100:0x01fd, B:104:0x020c, B:108:0x021c, B:107:0x0217, B:103:0x0206, B:99:0x01f7, B:95:0x01e8, B:91:0x01d9, B:87:0x01ca, B:83:0x01bb, B:79:0x01ac, B:75:0x0194, B:71:0x0181, B:67:0x0172, B:63:0x0163, B:21:0x00be, B:17:0x00a7), top: B:115:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.util.Map gEmmrt(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        java.util.List list2;
        java.util.List list3;
        int i3;
        LinkedHashMap linkedHashMap;
        int i4;
        int i5;
        int i6;
        java.lang.String text2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = list.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i7);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i7, str2);
                }
                i7++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "rootWalletId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "copiedEscapeListString");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcId");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uid");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "version");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayAccountName");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "encryptShareKey");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaPubkey");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ecdsaChainCode");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519Pubkey");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ed25519ChainCode");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEscape");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "mpcCreateAt");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createType");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (sQLiteStatementPrepare.step()) {
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i = columnIndexOrThrow;
                    text = null;
                } else {
                    i = columnIndexOrThrow;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                if (linkedHashMap2.containsKey(text)) {
                    list2 = (java.util.List) linkedHashMap2.get(text);
                    i2 = columnIndexOrThrow14;
                } else {
                    i2 = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    linkedHashMap2.put(text, arrayList);
                    list2 = arrayList;
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2) && sQLiteStatementPrepare.isNull(columnIndexOrThrow3) && sQLiteStatementPrepare.isNull(columnIndexOrThrow4) && sQLiteStatementPrepare.isNull(columnIndexOrThrow5) && sQLiteStatementPrepare.isNull(columnIndexOrThrow6) && sQLiteStatementPrepare.isNull(columnIndexOrThrow7) && sQLiteStatementPrepare.isNull(columnIndexOrThrow8) && sQLiteStatementPrepare.isNull(columnIndexOrThrow9) && sQLiteStatementPrepare.isNull(columnIndexOrThrow10) && sQLiteStatementPrepare.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                    columnIndexOrThrow14 = i2;
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                        linkedHashMap = linkedHashMap2;
                        i4 = columnIndexOrThrow15;
                        if (sQLiteStatementPrepare.isNull(i4)) {
                            list3 = list2;
                            int i8 = columnIndexOrThrow16;
                            if (sQLiteStatementPrepare.isNull(i8)) {
                                columnIndexOrThrow16 = i8;
                                i3 = columnIndexOrThrow17;
                                if (sQLiteStatementPrepare.isNull(i3)) {
                                    columnIndexOrThrow17 = i3;
                                    columnIndexOrThrow15 = i4;
                                    linkedHashMap2 = linkedHashMap;
                                    columnIndexOrThrow = i;
                                } else {
                                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                                    }
                                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                                    }
                                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                                    }
                                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                                    }
                                    int i9 = columnIndexOrThrow5;
                                    int i10 = columnIndexOrThrow16;
                                    int i11 = columnIndexOrThrow6;
                                    list3.add(new MPCWalletEntity(text, text, text, text2, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(i4), sQLiteStatementPrepare.getLong(i10), (int) sQLiteStatementPrepare.getLong(i3)));
                                    columnIndexOrThrow3 = i5;
                                    columnIndexOrThrow6 = i11;
                                    columnIndexOrThrow4 = i6;
                                    columnIndexOrThrow17 = i3;
                                    columnIndexOrThrow15 = i4;
                                    linkedHashMap2 = linkedHashMap;
                                    columnIndexOrThrow5 = i9;
                                    columnIndexOrThrow = i;
                                    columnIndexOrThrow16 = i10;
                                }
                            } else {
                                columnIndexOrThrow16 = i8;
                            }
                        } else {
                            list3 = list2;
                        }
                    } else {
                        list3 = list2;
                        linkedHashMap = linkedHashMap2;
                        i4 = columnIndexOrThrow15;
                    }
                    i3 = columnIndexOrThrow17;
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    }
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    }
                    int i92 = columnIndexOrThrow5;
                    int i102 = columnIndexOrThrow16;
                    int i112 = columnIndexOrThrow6;
                    list3.add(new MPCWalletEntity(text, text, text, text2, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(i4), sQLiteStatementPrepare.getLong(i102), (int) sQLiteStatementPrepare.getLong(i3)));
                    columnIndexOrThrow3 = i5;
                    columnIndexOrThrow6 = i112;
                    columnIndexOrThrow4 = i6;
                    columnIndexOrThrow17 = i3;
                    columnIndexOrThrow15 = i4;
                    linkedHashMap2 = linkedHashMap;
                    columnIndexOrThrow5 = i92;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow16 = i102;
                } else {
                    list3 = list2;
                    columnIndexOrThrow14 = i2;
                    i3 = columnIndexOrThrow17;
                    linkedHashMap = linkedHashMap2;
                    i4 = columnIndexOrThrow15;
                    java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                    java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                    java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                    if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                        i5 = columnIndexOrThrow3;
                        i6 = columnIndexOrThrow4;
                        text2 = null;
                    } else {
                        i5 = columnIndexOrThrow3;
                        i6 = columnIndexOrThrow4;
                        text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                    }
                    int i922 = columnIndexOrThrow5;
                    int i1022 = columnIndexOrThrow16;
                    int i1122 = columnIndexOrThrow6;
                    list3.add(new MPCWalletEntity(text3, text4, text5, text2, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), (int) sQLiteStatementPrepare.getLong(i4), sQLiteStatementPrepare.getLong(i1022), (int) sQLiteStatementPrepare.getLong(i3)));
                    columnIndexOrThrow3 = i5;
                    columnIndexOrThrow6 = i1122;
                    columnIndexOrThrow4 = i6;
                    columnIndexOrThrow17 = i3;
                    columnIndexOrThrow15 = i4;
                    linkedHashMap2 = linkedHashMap;
                    columnIndexOrThrow5 = i922;
                    columnIndexOrThrow = i;
                    columnIndexOrThrow16 = i1022;
                }
            }
            return linkedHashMap2;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<MPCWalletEntity> OLrzqt() {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fJNWhG((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List fJNWhG(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        java.lang.String text;
        int i2;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM MPCInfo ORDER BY mpcCreateAt");
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

    @Override // o.InterfaceC11384cMf
    public java.util.List<WalletRepairEntity> KWHzl(final int i, final int i2) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AEQbTJ(i, i2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(int i, int i2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM walletRepair WHERE identifierType = ? AND status =?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            sQLiteStatementPrepare.mo5793bindLong(2, i2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "identifierType");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reserved");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extJson");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new WalletRepairEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public int OLrzqt(final java.lang.String str, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cNB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.copydefault(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT MAX(addressIndex) FROM wallet WHERE rootWalletId = ?  AND type = ? ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            int i2 = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i2);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.lang.Object AEQbTJ(final java.lang.String str, final int i, Continuation<? super java.lang.Integer> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.cMv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.KWHzl(str, i, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Integer KWHzl(java.lang.String str, int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT MAX(addressIndex) FROM wallet WHERE rootWalletId = ?  AND type = ? ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, i);
            return (!sQLiteStatementPrepare.step() || sQLiteStatementPrepare.isNull(0)) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(0));
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public int copydefault(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.ejfBZ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer ejfBZ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT COALESCE(MAX(addressIndex), -1) FROM wallet WHERE rootWalletId = ? AND type = 7 ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public java.util.List<EOSInfoEntity> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.cMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.fJNWhG(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List fJNWhG(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM EOSInfo WHERE walletId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "walletId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accountName");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pubKey");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activeKey");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerKey");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shouldBeDeleted");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new EOSInfoEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC11384cMf
    public int isConnected() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.zsXlph((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer zsXlph(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET main = 0 WHERE main = 1");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public int fJNWhG(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.ORxRYg(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer ORxRYg(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET main = 1 WHERE id = ?");
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

    @Override // o.InterfaceC11384cMf
    public int DbNXlk(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AuCTelauCTel(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AuCTelauCTel(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM chain_address WHERE walletId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int AEQbTJ(final java.lang.String str, final long j) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.copydefault(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM chain_address WHERE walletId = ? AND chainId=?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.InterfaceC11384cMf
    public int KWHzl(final java.lang.String str, final java.lang.String str2, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.OLrzqt(str2, i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, int i, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET name = ?, modifiedName =? WHERE id = ?");
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

    @Override // o.InterfaceC11384cMf
    public int AEQbTJ(final java.lang.String str, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.OLrzqt(i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(int i, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET aaWalletStatus = ? WHERE id = ?");
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

    @Override // o.InterfaceC11384cMf
    public int EZpvd(final java.lang.String str, final java.lang.String str2) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.OLrzqt(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM nft_v2 WHERE walletId = ? AND assetId =?");
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

    @Override // o.InterfaceC11384cMf
    public int fIwbmz(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.sSMYrx(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer sSMYrx(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM root_wallet WHERE rootId =?");
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

    @Override // o.InterfaceC11384cMf
    public int djBIcL(final java.util.List<java.lang.String> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM root_wallet WHERE rootId IN (");
        StringUtil.appendPlaceholders(sb, list.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AuCTel(string, list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AuCTel(java.lang.String str, java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
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

    @Override // o.InterfaceC11384cMf
    public int OLrzqt(final java.lang.String str, final java.lang.String str2) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AEQbTJ(str2, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AEQbTJ(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE hardware_info SET hardwareName =? WHERE hardwareUniqueId =?");
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

    @Override // o.InterfaceC11384cMf
    public int isConnected(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AxsJAY(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AxsJAY(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM defi WHERE walletId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int AuCTel(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.zuBGHE(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer zuBGHE(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM nft_v2 WHERE walletId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int AkhnZx(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.AwvSrB(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AwvSrB(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM chain_address_segwit WHERE walletId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int values(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cMx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.gHZMYf(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer gHZMYf(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM EOSInfo WHERE walletId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int copydefault(final java.lang.String str, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.KWHzl(i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer KWHzl(int i, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE root_wallet SET sortIndex = ? WHERE rootId = ?");
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

    @Override // o.InterfaceC11384cMf
    public int KWHzl(final java.lang.String str, final int i) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.valueOf(i, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer valueOf(int i, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET orderValue = ? WHERE id = ?");
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

    @Override // o.InterfaceC11384cMf
    public int copydefault(final java.lang.String str, final long j) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.cNy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11386cMh.copydefault(j, str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer copydefault(long j, java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("UPDATE wallet SET chainId = ? WHERE id = ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, j);
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

    public static java.util.List<java.lang.Class<?>> values() {
        return Collections.emptyList();
    }
}
