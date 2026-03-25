package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.cLG;

/* JADX INFO: loaded from: classes23.dex */
public final class cLH implements cLG {
    public final RoomDatabase OLrzqt;
    public final EntityInsertAdapter<RootWalletEntity> valueOf = new EntityInsertAdapter<RootWalletEntity>() { // from class: o.cLH.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `root_wallet` (`rootId`,`name`,`sortIndex`,`createAt`,`createIndex`) VALUES (?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
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
    public final EntityInsertAdapter<WalletEntity> AkhnZx = new EntityInsertAdapter<WalletEntity>() { // from class: o.cLH.6
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `wallet` (`id`,`type`,`data`,`chainId`,`language`,`name`,`modifiedName`,`backup`,`cloudBackup`,`iHuaweiBackup`,`main`,`xpub`,`xpriv`,`isSegWit`,`fromCreate`,`createAt`,`orderValue`,`rootWalletId`,`addressIndex`,`syncStatus`,`completedSyncOperation`,`syncOperation`,`eoaWalletType`,`aaWalletStatus`,`createVersion`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
        }
    };
    public final EntityInsertAdapter<ChainAddressEntity> EZpvd = new EntityInsertAdapter<ChainAddressEntity>() { // from class: o.cLH.8
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `chain_address` (`walletId`,`chainId`,`address`,`addressType`,`publicKey`,`derivePath`,`proxyAddress`,`eoaAddress`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
    public final EntityInsertAdapter<ChainAddressSegWitEntity> copydefault = new EntityInsertAdapter<ChainAddressSegWitEntity>() { // from class: o.cLH.9
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `chain_address_segwit` (`walletId`,`chainId`,`addressType`,`address`,`publicKey`,`derivePath`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
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
    public final EntityInsertAdapter<EOSInfoEntity> gEmmrt = new EntityInsertAdapter<EOSInfoEntity>() { // from class: o.cLH.7
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `EOSInfo` (`walletId`,`accountName`,`state`,`pubKey`,`activeKey`,`ownerKey`,`shouldBeDeleted`) VALUES (?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
    public final EntityInsertAdapter<MPCWalletEntity> AhwBna = new EntityInsertAdapter<MPCWalletEntity>() { // from class: o.cLH.11
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `MPCInfo` (`rootWalletId`,`copiedEscapeListString`,`mpcId`,`uid`,`status`,`version`,`accountName`,`displayAccountName`,`encryptShareKey`,`ecdsaPubkey`,`ecdsaChainCode`,`ed25519Pubkey`,`ed25519ChainCode`,`isEscape`,`mpcCreateAt`,`createType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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
        }
    };
    public final EntityInsertAdapter<SepInfoEntity> djBIcL = new EntityInsertAdapter<SepInfoEntity>() { // from class: o.cLH.14
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `sepInfo` (`walletId`,`coinId`,`state`) VALUES (?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull SepInfoEntity sepInfoEntity) {
            if (sepInfoEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, sepInfoEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, sepInfoEntity.getCoinId());
            if (sepInfoEntity.getState() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, sepInfoEntity.getState());
            }
        }
    };
    public final EntityInsertAdapter<HardwareInfoEntity> AYXKKw = new EntityInsertAdapter<HardwareInfoEntity>() { // from class: o.cLH.13
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `hardware_info` (`hardwareUniqueId`,`hardwarePassphraseId`,`hardwareName`,`hardwareSystem`,`hardwareType`,`rootWalletId`,`createAt`,`data`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull HardwareInfoEntity hardwareInfoEntity) {
            if (hardwareInfoEntity.getHardwareUniqueId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, hardwareInfoEntity.getHardwareUniqueId());
            }
            if (hardwareInfoEntity.getHardwarePassphraseId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, hardwareInfoEntity.getHardwarePassphraseId());
            }
            if (hardwareInfoEntity.getHardwareName() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, hardwareInfoEntity.getHardwareName());
            }
            if (hardwareInfoEntity.getHardwareSystem() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, hardwareInfoEntity.getHardwareSystem());
            }
            sQLiteStatement.mo5793bindLong(5, hardwareInfoEntity.getHardwareType());
            if (hardwareInfoEntity.getRootWalletId() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, hardwareInfoEntity.getRootWalletId());
            }
            sQLiteStatement.mo5793bindLong(7, hardwareInfoEntity.getCreateAt());
            if (hardwareInfoEntity.getData() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, hardwareInfoEntity.getData());
            }
        }
    };
    public final EntityInsertAdapter<CustomChainAddressEntity> KWHzl = new EntityInsertAdapter<CustomChainAddressEntity>() { // from class: o.cLH.12
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `custom_chain_address` (`wallet_id`,`coin_id`,`address`,`public_key`,`derive_path`,`create_at`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull CustomChainAddressEntity customChainAddressEntity) {
            if (customChainAddressEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, customChainAddressEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, customChainAddressEntity.getCoinId());
            if (customChainAddressEntity.getAddress() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, customChainAddressEntity.getAddress());
            }
            if (customChainAddressEntity.getPublicKey() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, customChainAddressEntity.getPublicKey());
            }
            if (customChainAddressEntity.getDerivePath() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, customChainAddressEntity.getDerivePath());
            }
            sQLiteStatement.mo5793bindLong(6, customChainAddressEntity.getCreateAt());
        }
    };
    public final EntityInsertAdapter<WalletRepairEntity> isConnected = new EntityInsertAdapter<WalletRepairEntity>() { // from class: o.cLH.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `walletRepair` (`walletId`,`identifierType`,`status`,`reserved`,`extJson`,`timestamp`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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
        }
    };
    public final EntityInsertAdapter<WalletSignDataEntity> DbNXlk = new EntityInsertAdapter<WalletSignDataEntity>() { // from class: o.cLH.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `wallet_sign_data` (`wallet_id`,`op_type`,`sync_type`,`address_type`,`chain_index`,`chain_sign`,`base_chain_index`,`base_chain_sign`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull WalletSignDataEntity walletSignDataEntity) {
            if (walletSignDataEntity.getWalletId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, walletSignDataEntity.getWalletId());
            }
            sQLiteStatement.mo5793bindLong(2, walletSignDataEntity.getOperationType());
            sQLiteStatement.mo5793bindLong(3, walletSignDataEntity.getSyncType());
            sQLiteStatement.mo5793bindLong(4, walletSignDataEntity.getAddressType());
            sQLiteStatement.mo5793bindLong(5, walletSignDataEntity.getChainIndex());
            if (walletSignDataEntity.getChainSign() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, walletSignDataEntity.getChainSign());
            }
            if (walletSignDataEntity.getBaseChainIndex() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5793bindLong(7, walletSignDataEntity.getBaseChainIndex().longValue());
            }
            if (walletSignDataEntity.getBaseChainSign() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, walletSignDataEntity.getBaseChainSign());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<MPCWalletEntity> AEQbTJ = new EntityDeleteOrUpdateAdapter<MPCWalletEntity>() { // from class: o.cLH.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `MPCInfo` WHERE `rootWalletId` = ? AND `uid` = ?";
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
            if (mPCWalletEntity.getUid() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, mPCWalletEntity.getUid());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<RootWalletEntity> values = new EntityDeleteOrUpdateAdapter<RootWalletEntity>() { // from class: o.cLH.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `root_wallet` SET `rootId` = ?,`name` = ?,`sortIndex` = ?,`createAt` = ?,`createIndex` = ? WHERE `rootId` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
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
            if (rootWalletEntity.getRootId() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, rootWalletEntity.getRootId());
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<WalletEntity> fetchVPNInfo = new EntityDeleteOrUpdateAdapter<WalletEntity>() { // from class: o.cLH.10
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

    public cLH(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.OLrzqt = roomDatabase;
    }

    @Override // o.cLG
    public long copydefault(final RootWalletEntity rootWalletEntity) {
        rootWalletEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.AEQbTJ(rootWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(RootWalletEntity rootWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.valueOf.insertAndReturnId(sQLiteConnection, rootWalletEntity));
    }

    @Override // o.cLG
    public long copydefault(final WalletEntity walletEntity) {
        walletEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long EZpvd(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AkhnZx.insertAndReturnId(sQLiteConnection, walletEntity));
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> valueOf(final java.util.List<WalletEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.djBIcL(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List djBIcL(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AkhnZx.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> OLrzqt(final java.util.List<ChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.EZpvd.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> AEQbTJ(final java.util.List<ChainAddressSegWitEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public long KWHzl(final EOSInfoEntity eOSInfoEntity) {
        eOSInfoEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.AEQbTJ(eOSInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long AEQbTJ(EOSInfoEntity eOSInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.gEmmrt.insertAndReturnId(sQLiteConnection, eOSInfoEntity));
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> copydefault(final java.util.List<MPCWalletEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.EZpvd(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List EZpvd(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.AhwBna.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> djBIcL(final java.util.List<SepInfoEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AYXKKw(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List AYXKKw(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.djBIcL.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public long copydefault(final HardwareInfoEntity hardwareInfoEntity) {
        hardwareInfoEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(hardwareInfoEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long copydefault(HardwareInfoEntity hardwareInfoEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.AYXKKw.insertAndReturnId(sQLiteConnection, hardwareInfoEntity));
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> KWHzl(final java.util.List<CustomChainAddressEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> AYXKKw(final java.util.List<WalletRepairEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.valueOf(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List valueOf(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.isConnected.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public java.util.List<java.lang.Long> EZpvd(final java.util.List<WalletSignDataEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.DbNXlk.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cLG
    public int EZpvd(final MPCWalletEntity mPCWalletEntity) {
        mPCWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(mPCWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer copydefault(MPCWalletEntity mPCWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AEQbTJ.handle(sQLiteConnection, mPCWalletEntity));
    }

    @Override // o.cLG
    public int OLrzqt(final RootWalletEntity rootWalletEntity) {
        rootWalletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(rootWalletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer copydefault(RootWalletEntity rootWalletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.values.handle(sQLiteConnection, rootWalletEntity));
    }

    @Override // o.cLG
    public int KWHzl(final WalletEntity walletEntity) {
        walletEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.OLrzqt(walletEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(WalletEntity walletEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.fetchVPNInfo.handle(sQLiteConnection, walletEntity));
    }

    @Override // o.cLG
    public int AhwBna(final java.util.List<WalletEntity> list) {
        list.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.gEmmrt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer gEmmrt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.fetchVPNInfo.handleMultiple(sQLiteConnection, list));
    }

    @Override // o.cLG
    public void EZpvd(final RootWalletEntity rootWalletEntity, final java.util.List<RootWalletEntity> list, final WalletEntity walletEntity, final java.util.List<WalletEntity> list2, final java.util.List<ChainAddressEntity> list3, final java.util.List<CustomChainAddressEntity> list4, final java.util.List<ChainAddressSegWitEntity> list5, final EOSInfoEntity eOSInfoEntity, final java.util.List<MPCWalletEntity> list6, final java.util.List<SepInfoEntity> list7, final HardwareInfoEntity hardwareInfoEntity, final java.util.List<WalletSignDataEntity> list8) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(rootWalletEntity, list, walletEntity, list2, list3, list4, list5, eOSInfoEntity, list6, list7, hardwareInfoEntity, list8, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(RootWalletEntity rootWalletEntity, java.util.List list, WalletEntity walletEntity, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, EOSInfoEntity eOSInfoEntity, java.util.List list6, java.util.List list7, HardwareInfoEntity hardwareInfoEntity, java.util.List list8, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cLG.ActionBar.copydefault(this, rootWalletEntity, list, walletEntity, list2, list3, list4, list5, eOSInfoEntity, list6, list7, hardwareInfoEntity, list8);
        return Unit.INSTANCE;
    }

    @Override // o.cLG
    public void OLrzqt(final RootWalletEntity rootWalletEntity, final java.util.List<RootWalletEntity> list, final java.util.List<WalletEntity> list2, final java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>> map, final java.util.List<WalletRepairEntity> list3, final java.util.List<ChainAddressEntity> list4) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(rootWalletEntity, list, list2, map, list3, list4, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(RootWalletEntity rootWalletEntity, java.util.List list, java.util.List list2, java.util.Map map, java.util.List list3, java.util.List list4, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cLG.ActionBar.EZpvd(this, rootWalletEntity, (java.util.List<RootWalletEntity>) list, (java.util.List<WalletEntity>) list2, (java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>) map, (java.util.List<WalletRepairEntity>) list3, (java.util.List<ChainAddressEntity>) list4);
        return Unit.INSTANCE;
    }

    @Override // o.cLG
    public void OLrzqt(final java.lang.String str, final java.util.List<RootWalletEntity> list, final java.util.List<RootWalletEntity> list2, final java.util.List<MPCWalletEntity> list3, final java.util.List<WalletEntity> list4, final java.util.List<MPCWalletEntity> list5) {
        DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ(str, list, list2, list3, list4, list5, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit AEQbTJ(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cLG.ActionBar.EZpvd(this, str, (java.util.List<RootWalletEntity>) list, (java.util.List<RootWalletEntity>) list2, (java.util.List<MPCWalletEntity>) list3, (java.util.List<WalletEntity>) list4, (java.util.List<MPCWalletEntity>) list5);
        return Unit.INSTANCE;
    }

    @Override // o.cLG
    public int OLrzqt(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.OLrzqt, false, true, new Function1() { // from class: o.cLO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cLH.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM root_wallet WHERE rootId = ?");
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

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
