package com.okinc.business.defi.biz.database.wallet;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.ViewInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.database.wallet.dao.PasswordDao;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C11290cIt;
import o.C11319cJv;
import o.C11334cKj;
import o.C11341cKq;
import o.C11344cKt;
import o.C11357cLf;
import o.C11360cLi;
import o.C11386cMh;
import o.C11434cOb;
import o.C11440cOh;
import o.C11445cOm;
import o.InterfaceC11289cIs;
import o.InterfaceC11321cJx;
import o.InterfaceC11330cKf;
import o.InterfaceC11338cKn;
import o.InterfaceC11342cKr;
import o.InterfaceC11353cLb;
import o.InterfaceC11356cLe;
import o.InterfaceC11384cMf;
import o.InterfaceC11433cOa;
import o.InterfaceC11435cOc;
import o.InterfaceC11443cOk;
import o.cIL;
import o.cIM;
import o.cJJ;
import o.cJN;
import o.cJP;
import o.cJS;
import o.cKE;
import o.cKU;
import o.cKV;
import o.cLB;
import o.cLC;
import o.cLG;
import o.cLH;
import o.cNL;
import o.cNP;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletDatabase_Impl extends WalletDatabase {
    public volatile cJN RcXXUw;
    public volatile InterfaceC11321cJx UeEOUB;
    public volatile cJS aKErDB;
    public volatile InterfaceC11289cIs dNCPSb;
    public volatile cIL djSkpj;
    public volatile InterfaceC11330cKf dvKsVJ;
    public volatile PasswordDao dxcTrN;
    public volatile InterfaceC11338cKn fFgQHt;
    public volatile InterfaceC11342cKr fZBcTu;
    public volatile cKU finit;
    public volatile cNP flVtFt;
    public volatile InterfaceC11384cMf fvQaOB;
    public volatile cLB gGvvIC;
    public volatile InterfaceC11353cLb gasjUx;
    public volatile cLG giSNqX;
    public volatile InterfaceC11443cOk gkJEwt;
    public volatile InterfaceC11435cOc iRxXKY;
    public volatile InterfaceC11433cOa iZzfmt;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: gkJEwt, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(46, "09b2e1efd35c5b02e9064b1def649f16", "819e68bbf3a57efb00cbaa5d3e514675") { // from class: com.okinc.business.defi.biz.database.wallet.WalletDatabase_Impl.2
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `chain_address` (`walletId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `address` TEXT NOT NULL, `addressType` INTEGER NOT NULL, `publicKey` TEXT NOT NULL, `derivePath` TEXT NOT NULL, `proxyAddress` TEXT NOT NULL, `eoaAddress` TEXT NOT NULL, PRIMARY KEY(`walletId`, `chainId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `EOSInfo` (`walletId` TEXT NOT NULL, `accountName` TEXT NOT NULL, `state` INTEGER NOT NULL, `pubKey` TEXT NOT NULL, `activeKey` TEXT NOT NULL, `ownerKey` TEXT NOT NULL, `shouldBeDeleted` INTEGER NOT NULL, PRIMARY KEY(`walletId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sepInfo` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, `state` TEXT NOT NULL, PRIMARY KEY(`walletId`, `coinId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `coin_asset` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, `amount` TEXT NOT NULL, `amountInt` TEXT NOT NULL, `ccyAmount` TEXT NOT NULL, `dailyChange` TEXT NOT NULL, `orderValue` INTEGER NOT NULL, `address` TEXT NOT NULL DEFAULT '', `voucherToken` INTEGER NOT NULL, `unPnl` TEXT NOT NULL, `unPnlYield` TEXT NOT NULL, `platformName` TEXT NOT NULL DEFAULT '', `walletInvestmentType` TEXT NOT NULL DEFAULT '', `spotBalance` TEXT NOT NULL, `holdAvgPrice` TEXT NOT NULL, PRIMARY KEY(`walletId`, `coinId`, `address`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `defi` (`walletId` TEXT NOT NULL, `assetId` TEXT NOT NULL, `bean` TEXT NOT NULL, PRIMARY KEY(`walletId`, `assetId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `nft_v2` (`walletId` TEXT NOT NULL, `assetId` TEXT NOT NULL, `bean` TEXT NOT NULL, PRIMARY KEY(`walletId`, `assetId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `closed_coin` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `opened_coin` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wallet` (`id` TEXT NOT NULL, `type` INTEGER NOT NULL, `data` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `language` TEXT NOT NULL, `name` TEXT NOT NULL, `modifiedName` INTEGER NOT NULL, `backup` INTEGER NOT NULL, `cloudBackup` INTEGER NOT NULL, `iHuaweiBackup` INTEGER NOT NULL, `main` INTEGER NOT NULL, `xpub` TEXT NOT NULL, `xpriv` TEXT NOT NULL, `isSegWit` INTEGER NOT NULL, `fromCreate` INTEGER NOT NULL, `createAt` INTEGER NOT NULL, `orderValue` INTEGER NOT NULL, `rootWalletId` TEXT NOT NULL DEFAULT '', `addressIndex` INTEGER NOT NULL, `syncStatus` INTEGER NOT NULL, `completedSyncOperation` TEXT NOT NULL, `syncOperation` TEXT, `eoaWalletType` INTEGER NOT NULL, `aaWalletStatus` INTEGER NOT NULL, `createVersion` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`id`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_wallet_rootWalletId` ON `wallet` (`rootWalletId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `address` (`address` TEXT NOT NULL, `coinId` INTEGER NOT NULL, `remark` TEXT NOT NULL, `createAt` INTEGER NOT NULL, `domain` TEXT NOT NULL, PRIMARY KEY(`address`, `coinId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `keyValues` (`_key` TEXT NOT NULL, `_value` TEXT NOT NULL, PRIMARY KEY(`_key`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `message` (`walletId` TEXT NOT NULL, `id` INTEGER NOT NULL, `rowId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `read` INTEGER NOT NULL, `msg` TEXT NOT NULL, PRIMARY KEY(`walletId`, `id`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `sync` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `data` TEXT NOT NULL)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `dapp_favorite_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `dapp_history_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `dapp_tab_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `dapp_search_history` (`balance` TEXT NOT NULL, `category` INTEGER NOT NULL, `deepLink` TEXT NOT NULL, `id` TEXT NOT NULL, `logo` TEXT NOT NULL, `user` TEXT NOT NULL, `volume` TEXT NOT NULL, `name` TEXT NOT NULL, `shortDescribe` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`deepLink`, `type`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `chain_address_segwit` (`walletId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `addressType` INTEGER NOT NULL, `address` TEXT NOT NULL, `publicKey` TEXT NOT NULL, `derivePath` TEXT NOT NULL, PRIMARY KEY(`walletId`, `chainId`, `addressType`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `root_wallet` (`rootId` TEXT NOT NULL, `name` TEXT NOT NULL, `sortIndex` INTEGER NOT NULL, `createAt` INTEGER NOT NULL, `createIndex` INTEGER NOT NULL, PRIMARY KEY(`rootId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tx_log` (`txId` TEXT NOT NULL, `txInfo` TEXT NOT NULL, `txTime` INTEGER NOT NULL, PRIMARY KEY(`txId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `hardware_info` (`hardwareUniqueId` TEXT NOT NULL, `hardwarePassphraseId` TEXT NOT NULL, `hardwareName` TEXT NOT NULL, `hardwareSystem` TEXT NOT NULL, `hardwareType` INTEGER NOT NULL, `rootWalletId` TEXT NOT NULL, `createAt` INTEGER NOT NULL, `data` TEXT, PRIMARY KEY(`rootWalletId`, `hardwareUniqueId`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `MPCInfo` (`rootWalletId` TEXT NOT NULL, `copiedEscapeListString` TEXT NOT NULL, `mpcId` TEXT NOT NULL, `uid` TEXT NOT NULL, `status` INTEGER NOT NULL, `version` TEXT NOT NULL, `accountName` TEXT NOT NULL, `displayAccountName` TEXT NOT NULL, `encryptShareKey` TEXT NOT NULL, `ecdsaPubkey` TEXT NOT NULL, `ecdsaChainCode` TEXT NOT NULL, `ed25519Pubkey` TEXT NOT NULL, `ed25519ChainCode` TEXT NOT NULL, `isEscape` INTEGER NOT NULL, `mpcCreateAt` INTEGER NOT NULL, `createType` INTEGER NOT NULL, PRIMARY KEY(`rootWalletId`, `uid`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_meta` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `chain_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `from_custom` INTEGER NOT NULL, `rpc_url` TEXT NOT NULL, `faucet_url` TEXT NOT NULL, `explorer_url` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`, `rpc_url`))");
                SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_custom_chain_meta_rpc_url` ON `custom_chain_meta` (`rpc_url`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_meta_status` (`chain_id` INTEGER NOT NULL, `used` INTEGER NOT NULL, PRIMARY KEY(`chain_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_coin_meta` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `coin_id` INTEGER NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `contract_address` TEXT NOT NULL, `base_coin_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `decimal_num` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`, `coin_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_custom_chain_coin_meta_coin_id` ON `custom_chain_coin_meta` (`coin_id`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_wallet_coin` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_custom_chain_wallet_coin_coin_id` ON `custom_chain_wallet_coin` (`coin_id`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_address` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `address` TEXT NOT NULL, `public_key` TEXT NOT NULL, `derive_path` TEXT NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_custom_chain_address_coin_id` ON `custom_chain_address` (`coin_id`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_coin_balance` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `amount` TEXT NOT NULL, `ccy_amount` TEXT NOT NULL, `order_value` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_custom_chain_coin_balance_coin_id` ON `custom_chain_coin_balance` (`coin_id`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_chain_transaction` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `tx_hash` TEXT NOT NULL, `tx_id` TEXT NOT NULL, `origin_tx_hash` TEXT NOT NULL, `sub_tx_hashes` TEXT NOT NULL, `chain_id` INTEGER NOT NULL, `tx_type` INTEGER NOT NULL, `repeat_tx_type` INTEGER NOT NULL, `tx_status` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `nonce` INTEGER NOT NULL, `gas_price` TEXT NOT NULL, `gas_limit` TEXT NOT NULL, `coin_amount` TEXT NOT NULL, `input_data` TEXT NOT NULL, `raw_tx` TEXT NOT NULL, `fail_reason` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `confirm_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`, `tx_hash`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_custom_chain_transaction_coin_id` ON `custom_chain_transaction` (`coin_id`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `walletRepair` (`walletId` TEXT NOT NULL, `identifierType` INTEGER NOT NULL, `status` INTEGER NOT NULL, `reserved` TEXT NOT NULL, `extJson` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`walletId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `custom_fee` (`chain_id` INTEGER NOT NULL, `gas_price` TEXT NOT NULL, `base_fee` TEXT NOT NULL, `priority_fee` TEXT NOT NULL, PRIMARY KEY(`chain_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wallet_sign_data` (`wallet_id` TEXT NOT NULL, `op_type` INTEGER NOT NULL, `sync_type` INTEGER NOT NULL, `address_type` INTEGER NOT NULL, `chain_index` INTEGER NOT NULL, `chain_sign` TEXT NOT NULL, `base_chain_index` INTEGER, `base_chain_sign` TEXT, PRIMARY KEY(`wallet_id`, `op_type`, `sync_type`, `address_type`, `chain_index`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `total_asset` (`walletId` TEXT NOT NULL, `tokenAsset` TEXT NOT NULL, `tokenAssetFilterSmall` TEXT NOT NULL, `nftAsset` TEXT NOT NULL, `defiAsset` TEXT NOT NULL, `updateTime` TEXT NOT NULL, PRIMARY KEY(`walletId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `eip_7702_info` (`wallet_id` TEXT NOT NULL, `chain_index` INTEGER NOT NULL, `upgrade_status` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `chain_index`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wallet_tee` (`account_id` TEXT NOT NULL, `tee_id` TEXT NOT NULL, `is_created` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, `expired_timestamp` INTEGER NOT NULL, `is_verify` INTEGER NOT NULL, `has_show_expired_alert` INTEGER NOT NULL, `is_disabled_by_user` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, `model` INTEGER NOT NULL, `canUseSa2` INTEGER NOT NULL, `auto_renew` INTEGER NOT NULL, `upgrade_status` INTEGER NOT NULL, PRIMARY KEY(`account_id`), FOREIGN KEY(`account_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `wallet_jwt_info` (`account_id` TEXT NOT NULL, `enc_jwt` TEXT NOT NULL, PRIMARY KEY(`account_id`), FOREIGN KEY(`account_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `JoindChainAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths, group_concat(proxyAddress, ',') AS proxyAddresses , group_concat(eoaAddress, ',') AS eoaAddresses FROM (SELECT * FROM chain_address) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens, group_concat(unPnl, ',') AS unPnls, group_concat(unPnlYield, ',') AS unPnlYields, group_concat(platformName, ',') AS platformNames, group_concat(walletInvestmentType, ',') AS walletInvestmentTypes, group_concat(spotBalance, ',') AS spotBalances, group_concat(holdAvgPrice, ',') AS holdAvgPrices FROM (SELECT * FROM coin_asset) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `JoindSepInfos` AS SELECT walletId,group_concat(sepInfo.coinId, ',') as coinIds,group_concat(sepInfo.state, ',') as states from sepInfo group by walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `JoinedDefi` AS SELECT walletId, group_concat(assetId, ',') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM defi) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `JoinedNft` AS SELECT walletId, group_concat(assetId, '&-&') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM nft_v2) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `closed_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM closed_coin) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `opened_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM opened_coin) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `JoinedChainSegWitAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths FROM (SELECT * FROM chain_address_segwit) GROUP BY walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, (CASE WHEN wallet.type IS 7 THEN wallet.eoaWalletType ELSE wallet.type END) AS type, sortIndex, createIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwarePassphraseId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt, hardware_info.data as hardwareData, MPCInfo.rootWalletId AS mpcRootWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, MPCInfo.copiedEscapeListString AS copiedEscapeListString FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId LEFT JOIN MPCInfo ON wallet.rootWalletId == MPCInfo.rootWalletId GROUP BY root_wallet.rootId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `view_custom_chain_address` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(address, ',') AS addresses, group_concat(public_key, ',') AS public_keys, group_concat(derive_path, ',') AS derive_paths FROM custom_chain_address GROUP BY wallet_id");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `view_custom_chain_coin_meta` AS SELECT chain.chain_id, chain.real_chain_id, chain.chain_name, chain.icon_url, chain.from_custom, chain.rpc_url, chain.faucet_url, chain.explorer_url, chain.create_at, chain.update_at, group_concat(coin.coin_id, ',') AS coin_ids, group_concat(coin.symbol, ',') AS symbols, group_concat(coin.name, ',') AS names, group_concat(coin.icon_url, ',') AS icon_urls, group_concat(coin.contract_address, ',') AS contract_addresses, group_concat(coin.base_coin_id, ',') AS base_coin_ids, group_concat(coin.coin_type, ',') AS coin_types, group_concat(coin.decimal_num, ',') AS decimal_nums, group_concat(coin.create_at, ',') AS create_ats FROM custom_chain_meta AS chain LEFT JOIN custom_chain_coin_meta AS coin ON chain.chain_id = coin.chain_id GROUP BY chain.rpc_url");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `view_custom_chain_wallet_coin` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(create_at, ',') AS create_ats FROM custom_chain_wallet_coin GROUP BY wallet_id");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `view_custom_chain_coin_balance` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(amount, ',') AS amounts, group_concat(ccy_amount, ',') AS ccy_amounts, group_concat(order_value, ',') AS order_values, group_concat(create_at, ',') AS create_ats FROM custom_chain_coin_balance GROUP BY wallet_id");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `WalletRepairView` AS SELECT walletId, group_concat(walletRepair.identifierType) as identifierType, group_concat(walletRepair.status) as repairStatus, group_concat(walletRepair.reserved) as repairReserved, group_concat(walletRepair.extJson) as repairExtJson, group_concat(walletRepair.timestamp) as repairTimestamp from walletRepair group by walletId");
                SQLite.execSQL(sQLiteConnection, "CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.unPnls AS unPnls, joined_coin_asset.unPnlYields AS unPnlYields, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, joined_coin_asset.spotBalances AS spotBalances, joined_coin_asset.holdAvgPrices AS holdAvgPrices, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt, wallet_tee.model as model, wallet_tee.canUseSa2 as canUseSa2, wallet_tee.auto_renew as autoRenew, wallet_tee.upgrade_status as upgradeStatus from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '09b2e1efd35c5b02e9064b1def649f16')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `chain_address`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `EOSInfo`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sepInfo`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `coin_asset`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `defi`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `nft_v2`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `closed_coin`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `opened_coin`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wallet`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `address`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `keyValues`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `message`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `sync`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `dapp_favorite_new`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `dapp_history_new`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `dapp_tab_new`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `dapp_search_history`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `chain_address_segwit`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `root_wallet`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `tx_log`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `hardware_info`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `MPCInfo`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_meta`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_meta_status`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_coin_meta`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_wallet_coin`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_address`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_coin_balance`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_chain_transaction`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `walletRepair`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `custom_fee`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wallet_sign_data`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `total_asset`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `eip_7702_info`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wallet_tee`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `wallet_jwt_info`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `JoindChainAddress`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `joined_coin_asset`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `JoindSepInfos`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `JoinedDefi`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `JoinedNft`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `closed_coin_view`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `opened_coin_view`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `JoinedChainSegWitAddress`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `OKRootWallet`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `view_custom_chain_address`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `view_custom_chain_coin_meta`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `view_custom_chain_wallet_coin`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `view_custom_chain_coin_balance`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `WalletRepairView`");
                SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `WalletView`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
                WalletDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(8);
                map.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 2, null, 1));
                map.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 0, null, 1));
                map.put("addressType", new TableInfo.Column("addressType", "INTEGER", true, 0, null, 1));
                map.put("publicKey", new TableInfo.Column("publicKey", "TEXT", true, 0, null, 1));
                map.put("derivePath", new TableInfo.Column("derivePath", "TEXT", true, 0, null, 1));
                map.put("proxyAddress", new TableInfo.Column("proxyAddress", "TEXT", true, 0, null, 1));
                map.put("eoaAddress", new TableInfo.Column("eoaAddress", "TEXT", true, 0, null, 1));
                HashSet hashSet = new HashSet(1);
                hashSet.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo = new TableInfo("chain_address", map, hashSet, new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "chain_address");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "chain_address(com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(7);
                map2.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map2.put("accountName", new TableInfo.Column("accountName", "TEXT", true, 0, null, 1));
                map2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                map2.put("pubKey", new TableInfo.Column("pubKey", "TEXT", true, 0, null, 1));
                map2.put("activeKey", new TableInfo.Column("activeKey", "TEXT", true, 0, null, 1));
                map2.put("ownerKey", new TableInfo.Column("ownerKey", "TEXT", true, 0, null, 1));
                map2.put("shouldBeDeleted", new TableInfo.Column("shouldBeDeleted", "INTEGER", true, 0, null, 1));
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo3 = new TableInfo("EOSInfo", map2, hashSet2, new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "EOSInfo");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "EOSInfo(com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(3);
                map3.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map3.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                map3.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo5 = new TableInfo("sepInfo", map3, hashSet3, new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "sepInfo");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "sepInfo(com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(15);
                map4.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map4.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                map4.put(OtcExtraKeys.AMOUNT, new TableInfo.Column(OtcExtraKeys.AMOUNT, "TEXT", true, 0, null, 1));
                map4.put("amountInt", new TableInfo.Column("amountInt", "TEXT", true, 0, null, 1));
                map4.put("ccyAmount", new TableInfo.Column("ccyAmount", "TEXT", true, 0, null, 1));
                map4.put("dailyChange", new TableInfo.Column("dailyChange", "TEXT", true, 0, null, 1));
                map4.put("orderValue", new TableInfo.Column("orderValue", "INTEGER", true, 0, null, 1));
                map4.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 3, "''", 1));
                map4.put("voucherToken", new TableInfo.Column("voucherToken", "INTEGER", true, 0, null, 1));
                map4.put("unPnl", new TableInfo.Column("unPnl", "TEXT", true, 0, null, 1));
                map4.put("unPnlYield", new TableInfo.Column("unPnlYield", "TEXT", true, 0, null, 1));
                map4.put("platformName", new TableInfo.Column("platformName", "TEXT", true, 0, "''", 1));
                map4.put("walletInvestmentType", new TableInfo.Column("walletInvestmentType", "TEXT", true, 0, "''", 1));
                map4.put("spotBalance", new TableInfo.Column("spotBalance", "TEXT", true, 0, null, 1));
                map4.put("holdAvgPrice", new TableInfo.Column("holdAvgPrice", "TEXT", true, 0, null, 1));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo7 = new TableInfo("coin_asset", map4, hashSet4, new HashSet(0));
                TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "coin_asset");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "coin_asset(com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(3);
                map5.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map5.put("assetId", new TableInfo.Column("assetId", "TEXT", true, 2, null, 1));
                map5.put("bean", new TableInfo.Column("bean", "TEXT", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo9 = new TableInfo("defi", map5, hashSet5, new HashSet(0));
                TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "defi");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "defi(com.okinc.business.defi.biz.database.wallet.entity.WalletDefiEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(3);
                map6.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map6.put("assetId", new TableInfo.Column("assetId", "TEXT", true, 2, null, 1));
                map6.put("bean", new TableInfo.Column("bean", "TEXT", true, 0, null, 1));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo11 = new TableInfo("nft_v2", map6, hashSet6, new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "nft_v2");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "nft_v2(com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                HashMap map7 = new HashMap(2);
                map7.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map7.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo13 = new TableInfo("closed_coin", map7, hashSet7, new HashSet(0));
                TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "closed_coin");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "closed_coin(com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                HashMap map8 = new HashMap(2);
                map8.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map8.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo15 = new TableInfo("opened_coin", map8, hashSet8, new HashSet(0));
                TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "opened_coin");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "opened_coin(com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                HashMap map9 = new HashMap(25);
                map9.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
                map9.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
                map9.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
                map9.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 0, null, 1));
                map9.put("language", new TableInfo.Column("language", "TEXT", true, 0, null, 1));
                map9.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map9.put("modifiedName", new TableInfo.Column("modifiedName", "INTEGER", true, 0, null, 1));
                map9.put("backup", new TableInfo.Column("backup", "INTEGER", true, 0, null, 1));
                map9.put("cloudBackup", new TableInfo.Column("cloudBackup", "INTEGER", true, 0, null, 1));
                map9.put("iHuaweiBackup", new TableInfo.Column("iHuaweiBackup", "INTEGER", true, 0, null, 1));
                map9.put("main", new TableInfo.Column("main", "INTEGER", true, 0, null, 1));
                map9.put("xpub", new TableInfo.Column("xpub", "TEXT", true, 0, null, 1));
                map9.put("xpriv", new TableInfo.Column("xpriv", "TEXT", true, 0, null, 1));
                map9.put("isSegWit", new TableInfo.Column("isSegWit", "INTEGER", true, 0, null, 1));
                map9.put("fromCreate", new TableInfo.Column("fromCreate", "INTEGER", true, 0, null, 1));
                map9.put("createAt", new TableInfo.Column("createAt", "INTEGER", true, 0, null, 1));
                map9.put("orderValue", new TableInfo.Column("orderValue", "INTEGER", true, 0, null, 1));
                map9.put("rootWalletId", new TableInfo.Column("rootWalletId", "TEXT", true, 0, "''", 1));
                map9.put("addressIndex", new TableInfo.Column("addressIndex", "INTEGER", true, 0, null, 1));
                map9.put("syncStatus", new TableInfo.Column("syncStatus", "INTEGER", true, 0, null, 1));
                map9.put("completedSyncOperation", new TableInfo.Column("completedSyncOperation", "TEXT", true, 0, null, 1));
                map9.put("syncOperation", new TableInfo.Column("syncOperation", "TEXT", false, 0, null, 1));
                map9.put("eoaWalletType", new TableInfo.Column("eoaWalletType", "INTEGER", true, 0, null, 1));
                map9.put("aaWalletStatus", new TableInfo.Column("aaWalletStatus", "INTEGER", true, 0, null, 1));
                map9.put("createVersion", new TableInfo.Column("createVersion", "TEXT", true, 0, "''", 1));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new TableInfo.ForeignKey("root_wallet", "CASCADE", "NO ACTION", Arrays.asList("rootWalletId"), Arrays.asList("rootId")));
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.Index("index_wallet_rootWalletId", false, Arrays.asList("rootWalletId"), Arrays.asList("ASC")));
                TableInfo tableInfo17 = new TableInfo("wallet", map9, hashSet9, hashSet10);
                TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "wallet");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "wallet(com.okinc.business.defi.biz.database.wallet.entity.WalletEntity).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                HashMap map10 = new HashMap(5);
                map10.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 1, null, 1));
                map10.put("coinId", new TableInfo.Column("coinId", "INTEGER", true, 2, null, 1));
                map10.put(OtcExtraKeys.TRADING_TERMS, new TableInfo.Column(OtcExtraKeys.TRADING_TERMS, "TEXT", true, 0, null, 1));
                map10.put("createAt", new TableInfo.Column("createAt", "INTEGER", true, 0, null, 1));
                map10.put("domain", new TableInfo.Column("domain", "TEXT", true, 0, null, 1));
                TableInfo tableInfo19 = new TableInfo(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, map10, new HashSet(0), new HashSet(0));
                TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
                if (!tableInfo19.equals(tableInfo20)) {
                    return new RoomOpenDelegate.ValidationResult(false, "address(com.okinc.business.defi.biz.database.wallet.entity.AddressEntity).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
                }
                HashMap map11 = new HashMap(2);
                map11.put("_key", new TableInfo.Column("_key", "TEXT", true, 1, null, 1));
                map11.put("_value", new TableInfo.Column("_value", "TEXT", true, 0, null, 1));
                TableInfo tableInfo21 = new TableInfo("keyValues", map11, new HashSet(0), new HashSet(0));
                TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "keyValues");
                if (!tableInfo21.equals(tableInfo22)) {
                    return new RoomOpenDelegate.ValidationResult(false, "keyValues(com.okinc.business.defi.biz.database.wallet.entity.KVEntity).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
                }
                HashMap map12 = new HashMap(6);
                map12.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map12.put("id", new TableInfo.Column("id", "INTEGER", true, 2, null, 1));
                map12.put("rowId", new TableInfo.Column("rowId", "TEXT", true, 0, null, 1));
                map12.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                map12.put("read", new TableInfo.Column("read", "INTEGER", true, 0, null, 1));
                map12.put("msg", new TableInfo.Column("msg", "TEXT", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(1);
                hashSet11.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo23 = new TableInfo("message", map12, hashSet11, new HashSet(0));
                TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, "message");
                if (!tableInfo23.equals(tableInfo24)) {
                    return new RoomOpenDelegate.ValidationResult(false, "message(com.okinc.business.defi.biz.database.wallet.entity.MessageItemEntity).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
                }
                HashMap map13 = new HashMap(2);
                map13.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map13.put("data", new TableInfo.Column("data", "TEXT", true, 0, null, 1));
                TableInfo tableInfo25 = new TableInfo("sync", map13, new HashSet(0), new HashSet(0));
                TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, "sync");
                if (!tableInfo25.equals(tableInfo26)) {
                    return new RoomOpenDelegate.ValidationResult(false, "sync(com.okinc.business.defi.biz.database.wallet.entity.SyncItemEntity).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
                }
                HashMap map14 = new HashMap(12);
                map14.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, 1));
                map14.put(MTPushConstants.PlatformNode.KEY_PLATFORM, new TableInfo.Column(MTPushConstants.PlatformNode.KEY_PLATFORM, "TEXT", true, 0, null, 1));
                map14.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
                map14.put("network", new TableInfo.Column("network", "TEXT", true, 0, null, 1));
                map14.put("tvl", new TableInfo.Column("tvl", "REAL", true, 0, null, 1));
                map14.put("intro", new TableInfo.Column("intro", "TEXT", true, 0, null, 1));
                map14.put("tag", new TableInfo.Column("tag", "TEXT", true, 0, null, 1));
                map14.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map14.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, 1));
                map14.put("dau", new TableInfo.Column("dau", "INTEGER", true, 0, null, 1));
                map14.put(OtcExtraKeys.ORDER, new TableInfo.Column(OtcExtraKeys.ORDER, "INTEGER", true, 0, null, 1));
                map14.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo27 = new TableInfo("dapp_favorite_new", map14, new HashSet(0), new HashSet(0));
                TableInfo tableInfo28 = TableInfo.read(sQLiteConnection, "dapp_favorite_new");
                if (!tableInfo27.equals(tableInfo28)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dapp_favorite_new(com.okinc.business.defi.biz.database.wallet.entity.DAppFavoriteEntity).\n Expected:\n" + tableInfo27 + "\n Found:\n" + tableInfo28);
                }
                HashMap map15 = new HashMap(12);
                map15.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, 1));
                map15.put(MTPushConstants.PlatformNode.KEY_PLATFORM, new TableInfo.Column(MTPushConstants.PlatformNode.KEY_PLATFORM, "TEXT", true, 0, null, 1));
                map15.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
                map15.put("network", new TableInfo.Column("network", "TEXT", true, 0, null, 1));
                map15.put("tvl", new TableInfo.Column("tvl", "REAL", true, 0, null, 1));
                map15.put("intro", new TableInfo.Column("intro", "TEXT", true, 0, null, 1));
                map15.put("tag", new TableInfo.Column("tag", "TEXT", true, 0, null, 1));
                map15.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map15.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, 1));
                map15.put("dau", new TableInfo.Column("dau", "INTEGER", true, 0, null, 1));
                map15.put(OtcExtraKeys.ORDER, new TableInfo.Column(OtcExtraKeys.ORDER, "INTEGER", true, 0, null, 1));
                map15.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo29 = new TableInfo("dapp_history_new", map15, new HashSet(0), new HashSet(0));
                TableInfo tableInfo30 = TableInfo.read(sQLiteConnection, "dapp_history_new");
                if (!tableInfo29.equals(tableInfo30)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dapp_history_new(com.okinc.business.defi.biz.database.wallet.entity.DAppHistoryEntity).\n Expected:\n" + tableInfo29 + "\n Found:\n" + tableInfo30);
                }
                HashMap map16 = new HashMap(12);
                map16.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, 1));
                map16.put(MTPushConstants.PlatformNode.KEY_PLATFORM, new TableInfo.Column(MTPushConstants.PlatformNode.KEY_PLATFORM, "TEXT", true, 0, null, 1));
                map16.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
                map16.put("network", new TableInfo.Column("network", "TEXT", true, 0, null, 1));
                map16.put("tvl", new TableInfo.Column("tvl", "REAL", true, 0, null, 1));
                map16.put("intro", new TableInfo.Column("intro", "TEXT", true, 0, null, 1));
                map16.put("tag", new TableInfo.Column("tag", "TEXT", true, 0, null, 1));
                map16.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map16.put("url", new TableInfo.Column("url", "TEXT", true, 1, null, 1));
                map16.put("dau", new TableInfo.Column("dau", "INTEGER", true, 0, null, 1));
                map16.put(OtcExtraKeys.ORDER, new TableInfo.Column(OtcExtraKeys.ORDER, "INTEGER", true, 0, null, 1));
                map16.put("timeStamp", new TableInfo.Column("timeStamp", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo31 = new TableInfo("dapp_tab_new", map16, new HashSet(0), new HashSet(0));
                TableInfo tableInfo32 = TableInfo.read(sQLiteConnection, "dapp_tab_new");
                if (!tableInfo31.equals(tableInfo32)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dapp_tab_new(com.okinc.business.defi.biz.database.wallet.entity.DAppTabEntity).\n Expected:\n" + tableInfo31 + "\n Found:\n" + tableInfo32);
                }
                HashMap map17 = new HashMap(11);
                map17.put("balance", new TableInfo.Column("balance", "TEXT", true, 0, null, 1));
                map17.put("category", new TableInfo.Column("category", "INTEGER", true, 0, null, 1));
                map17.put("deepLink", new TableInfo.Column("deepLink", "TEXT", true, 1, null, 1));
                map17.put("id", new TableInfo.Column("id", "TEXT", true, 0, null, 1));
                map17.put("logo", new TableInfo.Column("logo", "TEXT", true, 0, null, 1));
                map17.put("user", new TableInfo.Column("user", "TEXT", true, 0, null, 1));
                map17.put("volume", new TableInfo.Column("volume", "TEXT", true, 0, null, 1));
                map17.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map17.put("shortDescribe", new TableInfo.Column("shortDescribe", "TEXT", true, 0, null, 1));
                map17.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                map17.put("type", new TableInfo.Column("type", "INTEGER", true, 2, null, 1));
                TableInfo tableInfo33 = new TableInfo("dapp_search_history", map17, new HashSet(0), new HashSet(0));
                TableInfo tableInfo34 = TableInfo.read(sQLiteConnection, "dapp_search_history");
                if (!tableInfo33.equals(tableInfo34)) {
                    return new RoomOpenDelegate.ValidationResult(false, "dapp_search_history(com.okinc.business.defi.biz.database.wallet.entity.DAppSearchHistoryEntity).\n Expected:\n" + tableInfo33 + "\n Found:\n" + tableInfo34);
                }
                HashMap map18 = new HashMap(6);
                map18.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map18.put("chainId", new TableInfo.Column("chainId", "INTEGER", true, 2, null, 1));
                map18.put("addressType", new TableInfo.Column("addressType", "INTEGER", true, 3, null, 1));
                map18.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 0, null, 1));
                map18.put("publicKey", new TableInfo.Column("publicKey", "TEXT", true, 0, null, 1));
                map18.put("derivePath", new TableInfo.Column("derivePath", "TEXT", true, 0, null, 1));
                HashSet hashSet12 = new HashSet(1);
                hashSet12.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo35 = new TableInfo("chain_address_segwit", map18, hashSet12, new HashSet(0));
                TableInfo tableInfo36 = TableInfo.read(sQLiteConnection, "chain_address_segwit");
                if (!tableInfo35.equals(tableInfo36)) {
                    return new RoomOpenDelegate.ValidationResult(false, "chain_address_segwit(com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity).\n Expected:\n" + tableInfo35 + "\n Found:\n" + tableInfo36);
                }
                HashMap map19 = new HashMap(5);
                map19.put("rootId", new TableInfo.Column("rootId", "TEXT", true, 1, null, 1));
                map19.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map19.put("sortIndex", new TableInfo.Column("sortIndex", "INTEGER", true, 0, null, 1));
                map19.put("createAt", new TableInfo.Column("createAt", "INTEGER", true, 0, null, 1));
                map19.put("createIndex", new TableInfo.Column("createIndex", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo37 = new TableInfo("root_wallet", map19, new HashSet(0), new HashSet(0));
                TableInfo tableInfo38 = TableInfo.read(sQLiteConnection, "root_wallet");
                if (!tableInfo37.equals(tableInfo38)) {
                    return new RoomOpenDelegate.ValidationResult(false, "root_wallet(com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity).\n Expected:\n" + tableInfo37 + "\n Found:\n" + tableInfo38);
                }
                HashMap map20 = new HashMap(3);
                map20.put("txId", new TableInfo.Column("txId", "TEXT", true, 1, null, 1));
                map20.put("txInfo", new TableInfo.Column("txInfo", "TEXT", true, 0, null, 1));
                map20.put("txTime", new TableInfo.Column("txTime", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo39 = new TableInfo("tx_log", map20, new HashSet(0), new HashSet(0));
                TableInfo tableInfo40 = TableInfo.read(sQLiteConnection, "tx_log");
                if (!tableInfo39.equals(tableInfo40)) {
                    return new RoomOpenDelegate.ValidationResult(false, "tx_log(com.okinc.business.defi.biz.database.wallet.entity.TxLogEntity).\n Expected:\n" + tableInfo39 + "\n Found:\n" + tableInfo40);
                }
                HashMap map21 = new HashMap(8);
                map21.put("hardwareUniqueId", new TableInfo.Column("hardwareUniqueId", "TEXT", true, 2, null, 1));
                map21.put("hardwarePassphraseId", new TableInfo.Column("hardwarePassphraseId", "TEXT", true, 0, null, 1));
                map21.put("hardwareName", new TableInfo.Column("hardwareName", "TEXT", true, 0, null, 1));
                map21.put("hardwareSystem", new TableInfo.Column("hardwareSystem", "TEXT", true, 0, null, 1));
                map21.put("hardwareType", new TableInfo.Column("hardwareType", "INTEGER", true, 0, null, 1));
                map21.put("rootWalletId", new TableInfo.Column("rootWalletId", "TEXT", true, 1, null, 1));
                map21.put("createAt", new TableInfo.Column("createAt", "INTEGER", true, 0, null, 1));
                map21.put("data", new TableInfo.Column("data", "TEXT", false, 0, null, 1));
                HashSet hashSet13 = new HashSet(1);
                hashSet13.add(new TableInfo.ForeignKey("root_wallet", "CASCADE", "NO ACTION", Arrays.asList("rootWalletId"), Arrays.asList("rootId")));
                TableInfo tableInfo41 = new TableInfo("hardware_info", map21, hashSet13, new HashSet(0));
                TableInfo tableInfo42 = TableInfo.read(sQLiteConnection, "hardware_info");
                if (!tableInfo41.equals(tableInfo42)) {
                    return new RoomOpenDelegate.ValidationResult(false, "hardware_info(com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity).\n Expected:\n" + tableInfo41 + "\n Found:\n" + tableInfo42);
                }
                HashMap map22 = new HashMap(16);
                map22.put("rootWalletId", new TableInfo.Column("rootWalletId", "TEXT", true, 1, null, 1));
                map22.put("copiedEscapeListString", new TableInfo.Column("copiedEscapeListString", "TEXT", true, 0, null, 1));
                map22.put("mpcId", new TableInfo.Column("mpcId", "TEXT", true, 0, null, 1));
                map22.put("uid", new TableInfo.Column("uid", "TEXT", true, 2, null, 1));
                map22.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map22.put("version", new TableInfo.Column("version", "TEXT", true, 0, null, 1));
                map22.put("accountName", new TableInfo.Column("accountName", "TEXT", true, 0, null, 1));
                map22.put("displayAccountName", new TableInfo.Column("displayAccountName", "TEXT", true, 0, null, 1));
                map22.put("encryptShareKey", new TableInfo.Column("encryptShareKey", "TEXT", true, 0, null, 1));
                map22.put("ecdsaPubkey", new TableInfo.Column("ecdsaPubkey", "TEXT", true, 0, null, 1));
                map22.put("ecdsaChainCode", new TableInfo.Column("ecdsaChainCode", "TEXT", true, 0, null, 1));
                map22.put("ed25519Pubkey", new TableInfo.Column("ed25519Pubkey", "TEXT", true, 0, null, 1));
                map22.put("ed25519ChainCode", new TableInfo.Column("ed25519ChainCode", "TEXT", true, 0, null, 1));
                map22.put("isEscape", new TableInfo.Column("isEscape", "INTEGER", true, 0, null, 1));
                map22.put("mpcCreateAt", new TableInfo.Column("mpcCreateAt", "INTEGER", true, 0, null, 1));
                map22.put("createType", new TableInfo.Column("createType", "INTEGER", true, 0, null, 1));
                HashSet hashSet14 = new HashSet(1);
                hashSet14.add(new TableInfo.ForeignKey("root_wallet", "CASCADE", "NO ACTION", Arrays.asList("rootWalletId"), Arrays.asList("rootId")));
                TableInfo tableInfo43 = new TableInfo("MPCInfo", map22, hashSet14, new HashSet(0));
                TableInfo tableInfo44 = TableInfo.read(sQLiteConnection, "MPCInfo");
                if (!tableInfo43.equals(tableInfo44)) {
                    return new RoomOpenDelegate.ValidationResult(false, "MPCInfo(com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity).\n Expected:\n" + tableInfo43 + "\n Found:\n" + tableInfo44);
                }
                HashMap map23 = new HashMap(10);
                map23.put("chain_id", new TableInfo.Column("chain_id", "INTEGER", true, 1, null, 1));
                map23.put("real_chain_id", new TableInfo.Column("real_chain_id", "INTEGER", true, 0, null, 1));
                map23.put("chain_name", new TableInfo.Column("chain_name", "TEXT", true, 0, null, 1));
                map23.put("icon_url", new TableInfo.Column("icon_url", "TEXT", true, 0, null, 1));
                map23.put("from_custom", new TableInfo.Column("from_custom", "INTEGER", true, 0, null, 1));
                map23.put("rpc_url", new TableInfo.Column("rpc_url", "TEXT", true, 2, null, 1));
                map23.put("faucet_url", new TableInfo.Column("faucet_url", "TEXT", true, 0, null, 1));
                map23.put("explorer_url", new TableInfo.Column("explorer_url", "TEXT", true, 0, null, 1));
                map23.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                map23.put("update_at", new TableInfo.Column("update_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet15 = new HashSet(0);
                HashSet hashSet16 = new HashSet(1);
                hashSet16.add(new TableInfo.Index("index_custom_chain_meta_rpc_url", true, Arrays.asList("rpc_url"), Arrays.asList("ASC")));
                TableInfo tableInfo45 = new TableInfo("custom_chain_meta", map23, hashSet15, hashSet16);
                TableInfo tableInfo46 = TableInfo.read(sQLiteConnection, "custom_chain_meta");
                if (!tableInfo45.equals(tableInfo46)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_meta(com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity).\n Expected:\n" + tableInfo45 + "\n Found:\n" + tableInfo46);
                }
                HashMap map24 = new HashMap(2);
                map24.put("chain_id", new TableInfo.Column("chain_id", "INTEGER", true, 1, null, 1));
                map24.put("used", new TableInfo.Column("used", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo47 = new TableInfo("custom_chain_meta_status", map24, new HashSet(0), new HashSet(0));
                TableInfo tableInfo48 = TableInfo.read(sQLiteConnection, "custom_chain_meta_status");
                if (!tableInfo47.equals(tableInfo48)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_meta_status(com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity).\n Expected:\n" + tableInfo47 + "\n Found:\n" + tableInfo48);
                }
                HashMap map25 = new HashMap(11);
                map25.put("chain_id", new TableInfo.Column("chain_id", "INTEGER", true, 1, null, 1));
                map25.put("real_chain_id", new TableInfo.Column("real_chain_id", "INTEGER", true, 0, null, 1));
                map25.put("coin_id", new TableInfo.Column("coin_id", "INTEGER", true, 2, null, 1));
                map25.put("symbol", new TableInfo.Column("symbol", "TEXT", true, 0, null, 1));
                map25.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map25.put("icon_url", new TableInfo.Column("icon_url", "TEXT", true, 0, null, 1));
                map25.put("contract_address", new TableInfo.Column("contract_address", "TEXT", true, 0, null, 1));
                map25.put("base_coin_id", new TableInfo.Column("base_coin_id", "INTEGER", true, 0, null, 1));
                map25.put("coin_type", new TableInfo.Column("coin_type", "INTEGER", true, 0, null, 1));
                map25.put("decimal_num", new TableInfo.Column("decimal_num", "INTEGER", true, 0, null, 1));
                map25.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet17 = new HashSet(0);
                HashSet hashSet18 = new HashSet(1);
                hashSet18.add(new TableInfo.Index("index_custom_chain_coin_meta_coin_id", true, Arrays.asList("coin_id"), Arrays.asList("ASC")));
                TableInfo tableInfo49 = new TableInfo("custom_chain_coin_meta", map25, hashSet17, hashSet18);
                TableInfo tableInfo50 = TableInfo.read(sQLiteConnection, "custom_chain_coin_meta");
                if (!tableInfo49.equals(tableInfo50)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_coin_meta(com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity).\n Expected:\n" + tableInfo49 + "\n Found:\n" + tableInfo50);
                }
                HashMap map26 = new HashMap(3);
                map26.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map26.put("coin_id", new TableInfo.Column("coin_id", "INTEGER", true, 2, null, 1));
                map26.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet19 = new HashSet(2);
                hashSet19.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                hashSet19.add(new TableInfo.ForeignKey("custom_chain_coin_meta", "NO ACTION", "NO ACTION", Arrays.asList("coin_id"), Arrays.asList("coin_id")));
                HashSet hashSet20 = new HashSet(1);
                hashSet20.add(new TableInfo.Index("index_custom_chain_wallet_coin_coin_id", false, Arrays.asList("coin_id"), Arrays.asList("ASC")));
                TableInfo tableInfo51 = new TableInfo("custom_chain_wallet_coin", map26, hashSet19, hashSet20);
                TableInfo tableInfo52 = TableInfo.read(sQLiteConnection, "custom_chain_wallet_coin");
                if (!tableInfo51.equals(tableInfo52)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_wallet_coin(com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity).\n Expected:\n" + tableInfo51 + "\n Found:\n" + tableInfo52);
                }
                HashMap map27 = new HashMap(6);
                map27.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map27.put("coin_id", new TableInfo.Column("coin_id", "INTEGER", true, 2, null, 1));
                map27.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, new TableInfo.Column(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "TEXT", true, 0, null, 1));
                map27.put("public_key", new TableInfo.Column("public_key", "TEXT", true, 0, null, 1));
                map27.put("derive_path", new TableInfo.Column("derive_path", "TEXT", true, 0, null, 1));
                map27.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet21 = new HashSet(2);
                hashSet21.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                hashSet21.add(new TableInfo.ForeignKey("custom_chain_coin_meta", "CASCADE", "NO ACTION", Arrays.asList("coin_id"), Arrays.asList("coin_id")));
                HashSet hashSet22 = new HashSet(1);
                hashSet22.add(new TableInfo.Index("index_custom_chain_address_coin_id", false, Arrays.asList("coin_id"), Arrays.asList("ASC")));
                TableInfo tableInfo53 = new TableInfo("custom_chain_address", map27, hashSet21, hashSet22);
                TableInfo tableInfo54 = TableInfo.read(sQLiteConnection, "custom_chain_address");
                if (!tableInfo53.equals(tableInfo54)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_address(com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity).\n Expected:\n" + tableInfo53 + "\n Found:\n" + tableInfo54);
                }
                HashMap map28 = new HashMap(6);
                map28.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map28.put("coin_id", new TableInfo.Column("coin_id", "INTEGER", true, 2, null, 1));
                map28.put(OtcExtraKeys.AMOUNT, new TableInfo.Column(OtcExtraKeys.AMOUNT, "TEXT", true, 0, null, 1));
                map28.put("ccy_amount", new TableInfo.Column("ccy_amount", "TEXT", true, 0, null, 1));
                map28.put("order_value", new TableInfo.Column("order_value", "INTEGER", true, 0, null, 1));
                map28.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet23 = new HashSet(2);
                hashSet23.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                hashSet23.add(new TableInfo.ForeignKey("custom_chain_coin_meta", "CASCADE", "NO ACTION", Arrays.asList("coin_id"), Arrays.asList("coin_id")));
                HashSet hashSet24 = new HashSet(1);
                hashSet24.add(new TableInfo.Index("index_custom_chain_coin_balance_coin_id", false, Arrays.asList("coin_id"), Arrays.asList("ASC")));
                TableInfo tableInfo55 = new TableInfo("custom_chain_coin_balance", map28, hashSet23, hashSet24);
                TableInfo tableInfo56 = TableInfo.read(sQLiteConnection, "custom_chain_coin_balance");
                if (!tableInfo55.equals(tableInfo56)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_coin_balance(com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity).\n Expected:\n" + tableInfo55 + "\n Found:\n" + tableInfo56);
                }
                HashMap map29 = new HashMap(21);
                map29.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map29.put("coin_id", new TableInfo.Column("coin_id", "INTEGER", true, 2, null, 1));
                map29.put("tx_hash", new TableInfo.Column("tx_hash", "TEXT", true, 3, null, 1));
                map29.put("tx_id", new TableInfo.Column("tx_id", "TEXT", true, 0, null, 1));
                map29.put("origin_tx_hash", new TableInfo.Column("origin_tx_hash", "TEXT", true, 0, null, 1));
                map29.put("sub_tx_hashes", new TableInfo.Column("sub_tx_hashes", "TEXT", true, 0, null, 1));
                map29.put("chain_id", new TableInfo.Column("chain_id", "INTEGER", true, 0, null, 1));
                map29.put("tx_type", new TableInfo.Column("tx_type", "INTEGER", true, 0, null, 1));
                map29.put("repeat_tx_type", new TableInfo.Column("repeat_tx_type", "INTEGER", true, 0, null, 1));
                map29.put("tx_status", new TableInfo.Column("tx_status", "INTEGER", true, 0, null, 1));
                map29.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, 1));
                map29.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, 1));
                map29.put("nonce", new TableInfo.Column("nonce", "INTEGER", true, 0, null, 1));
                map29.put("gas_price", new TableInfo.Column("gas_price", "TEXT", true, 0, null, 1));
                map29.put("gas_limit", new TableInfo.Column("gas_limit", "TEXT", true, 0, null, 1));
                map29.put("coin_amount", new TableInfo.Column("coin_amount", "TEXT", true, 0, null, 1));
                map29.put("input_data", new TableInfo.Column("input_data", "TEXT", true, 0, null, 1));
                map29.put("raw_tx", new TableInfo.Column("raw_tx", "TEXT", true, 0, null, 1));
                map29.put("fail_reason", new TableInfo.Column("fail_reason", "TEXT", true, 0, null, 1));
                map29.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                map29.put("confirm_at", new TableInfo.Column("confirm_at", "INTEGER", true, 0, null, 1));
                HashSet hashSet25 = new HashSet(2);
                hashSet25.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                hashSet25.add(new TableInfo.ForeignKey("custom_chain_coin_meta", "NO ACTION", "NO ACTION", Arrays.asList("coin_id"), Arrays.asList("coin_id")));
                HashSet hashSet26 = new HashSet(1);
                hashSet26.add(new TableInfo.Index("index_custom_chain_transaction_coin_id", false, Arrays.asList("coin_id"), Arrays.asList("ASC")));
                TableInfo tableInfo57 = new TableInfo("custom_chain_transaction", map29, hashSet25, hashSet26);
                TableInfo tableInfo58 = TableInfo.read(sQLiteConnection, "custom_chain_transaction");
                if (!tableInfo57.equals(tableInfo58)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_chain_transaction(com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity).\n Expected:\n" + tableInfo57 + "\n Found:\n" + tableInfo58);
                }
                HashMap map30 = new HashMap(6);
                map30.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map30.put("identifierType", new TableInfo.Column("identifierType", "INTEGER", true, 0, null, 1));
                map30.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map30.put("reserved", new TableInfo.Column("reserved", "TEXT", true, 0, null, 1));
                map30.put("extJson", new TableInfo.Column("extJson", "TEXT", true, 0, null, 1));
                map30.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                HashSet hashSet27 = new HashSet(1);
                hashSet27.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo59 = new TableInfo("walletRepair", map30, hashSet27, new HashSet(0));
                TableInfo tableInfo60 = TableInfo.read(sQLiteConnection, "walletRepair");
                if (!tableInfo59.equals(tableInfo60)) {
                    return new RoomOpenDelegate.ValidationResult(false, "walletRepair(com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity).\n Expected:\n" + tableInfo59 + "\n Found:\n" + tableInfo60);
                }
                HashMap map31 = new HashMap(4);
                map31.put("chain_id", new TableInfo.Column("chain_id", "INTEGER", true, 1, null, 1));
                map31.put("gas_price", new TableInfo.Column("gas_price", "TEXT", true, 0, null, 1));
                map31.put("base_fee", new TableInfo.Column("base_fee", "TEXT", true, 0, null, 1));
                map31.put("priority_fee", new TableInfo.Column("priority_fee", "TEXT", true, 0, null, 1));
                TableInfo tableInfo61 = new TableInfo("custom_fee", map31, new HashSet(0), new HashSet(0));
                TableInfo tableInfo62 = TableInfo.read(sQLiteConnection, "custom_fee");
                if (!tableInfo61.equals(tableInfo62)) {
                    return new RoomOpenDelegate.ValidationResult(false, "custom_fee(com.okinc.business.defi.biz.database.wallet.entity.CustomFeeEntity).\n Expected:\n" + tableInfo61 + "\n Found:\n" + tableInfo62);
                }
                HashMap map32 = new HashMap(8);
                map32.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map32.put("op_type", new TableInfo.Column("op_type", "INTEGER", true, 2, null, 1));
                map32.put("sync_type", new TableInfo.Column("sync_type", "INTEGER", true, 3, null, 1));
                map32.put("address_type", new TableInfo.Column("address_type", "INTEGER", true, 4, null, 1));
                map32.put("chain_index", new TableInfo.Column("chain_index", "INTEGER", true, 5, null, 1));
                map32.put("chain_sign", new TableInfo.Column("chain_sign", "TEXT", true, 0, null, 1));
                map32.put("base_chain_index", new TableInfo.Column("base_chain_index", "INTEGER", false, 0, null, 1));
                map32.put("base_chain_sign", new TableInfo.Column("base_chain_sign", "TEXT", false, 0, null, 1));
                HashSet hashSet28 = new HashSet(1);
                hashSet28.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                TableInfo tableInfo63 = new TableInfo("wallet_sign_data", map32, hashSet28, new HashSet(0));
                TableInfo tableInfo64 = TableInfo.read(sQLiteConnection, "wallet_sign_data");
                if (!tableInfo63.equals(tableInfo64)) {
                    return new RoomOpenDelegate.ValidationResult(false, "wallet_sign_data(com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity).\n Expected:\n" + tableInfo63 + "\n Found:\n" + tableInfo64);
                }
                HashMap map33 = new HashMap(6);
                map33.put("walletId", new TableInfo.Column("walletId", "TEXT", true, 1, null, 1));
                map33.put("tokenAsset", new TableInfo.Column("tokenAsset", "TEXT", true, 0, null, 1));
                map33.put("tokenAssetFilterSmall", new TableInfo.Column("tokenAssetFilterSmall", "TEXT", true, 0, null, 1));
                map33.put("nftAsset", new TableInfo.Column("nftAsset", "TEXT", true, 0, null, 1));
                map33.put("defiAsset", new TableInfo.Column("defiAsset", "TEXT", true, 0, null, 1));
                map33.put("updateTime", new TableInfo.Column("updateTime", "TEXT", true, 0, null, 1));
                HashSet hashSet29 = new HashSet(1);
                hashSet29.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("walletId"), Arrays.asList("id")));
                TableInfo tableInfo65 = new TableInfo("total_asset", map33, hashSet29, new HashSet(0));
                TableInfo tableInfo66 = TableInfo.read(sQLiteConnection, "total_asset");
                if (!tableInfo65.equals(tableInfo66)) {
                    return new RoomOpenDelegate.ValidationResult(false, "total_asset(com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity).\n Expected:\n" + tableInfo65 + "\n Found:\n" + tableInfo66);
                }
                HashMap map34 = new HashMap(3);
                map34.put("wallet_id", new TableInfo.Column("wallet_id", "TEXT", true, 1, null, 1));
                map34.put("chain_index", new TableInfo.Column("chain_index", "INTEGER", true, 2, null, 1));
                map34.put("upgrade_status", new TableInfo.Column("upgrade_status", "INTEGER", true, 0, null, 1));
                HashSet hashSet30 = new HashSet(1);
                hashSet30.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("wallet_id"), Arrays.asList("id")));
                TableInfo tableInfo67 = new TableInfo("eip_7702_info", map34, hashSet30, new HashSet(0));
                TableInfo tableInfo68 = TableInfo.read(sQLiteConnection, "eip_7702_info");
                if (!tableInfo67.equals(tableInfo68)) {
                    return new RoomOpenDelegate.ValidationResult(false, "eip_7702_info(com.okinc.business.defi.biz.database.wallet.entity.EIP7702InfoEntity).\n Expected:\n" + tableInfo67 + "\n Found:\n" + tableInfo68);
                }
                HashMap map35 = new HashMap(14);
                map35.put("account_id", new TableInfo.Column("account_id", "TEXT", true, 1, null, 1));
                map35.put("tee_id", new TableInfo.Column("tee_id", "TEXT", true, 0, null, 1));
                map35.put("is_created", new TableInfo.Column("is_created", "INTEGER", true, 0, null, 1));
                map35.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, 1));
                map35.put("expired_timestamp", new TableInfo.Column("expired_timestamp", "INTEGER", true, 0, null, 1));
                map35.put("is_verify", new TableInfo.Column("is_verify", "INTEGER", true, 0, null, 1));
                map35.put("has_show_expired_alert", new TableInfo.Column("has_show_expired_alert", "INTEGER", true, 0, null, 1));
                map35.put("is_disabled_by_user", new TableInfo.Column("is_disabled_by_user", "INTEGER", true, 0, null, 1));
                map35.put("create_at", new TableInfo.Column("create_at", "INTEGER", true, 0, null, 1));
                map35.put("update_at", new TableInfo.Column("update_at", "INTEGER", true, 0, null, 1));
                map35.put("model", new TableInfo.Column("model", "INTEGER", true, 0, null, 1));
                map35.put("canUseSa2", new TableInfo.Column("canUseSa2", "INTEGER", true, 0, null, 1));
                map35.put("auto_renew", new TableInfo.Column("auto_renew", "INTEGER", true, 0, null, 1));
                map35.put("upgrade_status", new TableInfo.Column("upgrade_status", "INTEGER", true, 0, null, 1));
                HashSet hashSet31 = new HashSet(1);
                hashSet31.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                TableInfo tableInfo69 = new TableInfo("wallet_tee", map35, hashSet31, new HashSet(0));
                TableInfo tableInfo70 = TableInfo.read(sQLiteConnection, "wallet_tee");
                if (!tableInfo69.equals(tableInfo70)) {
                    return new RoomOpenDelegate.ValidationResult(false, "wallet_tee(com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity).\n Expected:\n" + tableInfo69 + "\n Found:\n" + tableInfo70);
                }
                HashMap map36 = new HashMap(2);
                map36.put("account_id", new TableInfo.Column("account_id", "TEXT", true, 1, null, 1));
                map36.put("enc_jwt", new TableInfo.Column("enc_jwt", "TEXT", true, 0, null, 1));
                HashSet hashSet32 = new HashSet(1);
                hashSet32.add(new TableInfo.ForeignKey("wallet", "CASCADE", "NO ACTION", Arrays.asList("account_id"), Arrays.asList("id")));
                TableInfo tableInfo71 = new TableInfo("wallet_jwt_info", map36, hashSet32, new HashSet(0));
                TableInfo tableInfo72 = TableInfo.read(sQLiteConnection, "wallet_jwt_info");
                if (!tableInfo71.equals(tableInfo72)) {
                    return new RoomOpenDelegate.ValidationResult(false, "wallet_jwt_info(com.okinc.business.defi.biz.database.wallet.entity.WalletJwtInfoEntity).\n Expected:\n" + tableInfo71 + "\n Found:\n" + tableInfo72);
                }
                ViewInfo viewInfo = new ViewInfo("JoindChainAddress", "CREATE VIEW `JoindChainAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths, group_concat(proxyAddress, ',') AS proxyAddresses , group_concat(eoaAddress, ',') AS eoaAddresses FROM (SELECT * FROM chain_address) GROUP BY walletId");
                ViewInfo viewInfo2 = ViewInfo.read(sQLiteConnection, "JoindChainAddress");
                if (!viewInfo.equals(viewInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "JoindChainAddress(com.okinc.business.defi.biz.database.wallet.view.JoindChainAddressView).\n Expected:\n" + viewInfo + "\n Found:\n" + viewInfo2);
                }
                ViewInfo viewInfo3 = new ViewInfo("joined_coin_asset", "CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens, group_concat(unPnl, ',') AS unPnls, group_concat(unPnlYield, ',') AS unPnlYields, group_concat(platformName, ',') AS platformNames, group_concat(walletInvestmentType, ',') AS walletInvestmentTypes, group_concat(spotBalance, ',') AS spotBalances, group_concat(holdAvgPrice, ',') AS holdAvgPrices FROM (SELECT * FROM coin_asset) GROUP BY walletId");
                ViewInfo viewInfo4 = ViewInfo.read(sQLiteConnection, "joined_coin_asset");
                if (!viewInfo3.equals(viewInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "joined_coin_asset(com.okinc.business.defi.biz.database.wallet.view.JoindCoinView).\n Expected:\n" + viewInfo3 + "\n Found:\n" + viewInfo4);
                }
                ViewInfo viewInfo5 = new ViewInfo("JoindSepInfos", "CREATE VIEW `JoindSepInfos` AS SELECT walletId,group_concat(sepInfo.coinId, ',') as coinIds,group_concat(sepInfo.state, ',') as states from sepInfo group by walletId");
                ViewInfo viewInfo6 = ViewInfo.read(sQLiteConnection, "JoindSepInfos");
                if (!viewInfo5.equals(viewInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "JoindSepInfos(com.okinc.business.defi.biz.database.wallet.view.JoindSepInfosView).\n Expected:\n" + viewInfo5 + "\n Found:\n" + viewInfo6);
                }
                ViewInfo viewInfo7 = new ViewInfo("JoinedDefi", "CREATE VIEW `JoinedDefi` AS SELECT walletId, group_concat(assetId, ',') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM defi) GROUP BY walletId");
                ViewInfo viewInfo8 = ViewInfo.read(sQLiteConnection, "JoinedDefi");
                if (!viewInfo7.equals(viewInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "JoinedDefi(com.okinc.business.defi.biz.database.wallet.view.JoindDefiView).\n Expected:\n" + viewInfo7 + "\n Found:\n" + viewInfo8);
                }
                ViewInfo viewInfo9 = new ViewInfo("JoinedNft", "CREATE VIEW `JoinedNft` AS SELECT walletId, group_concat(assetId, '&-&') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM nft_v2) GROUP BY walletId");
                ViewInfo viewInfo10 = ViewInfo.read(sQLiteConnection, "JoinedNft");
                if (!viewInfo9.equals(viewInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "JoinedNft(com.okinc.business.defi.biz.database.wallet.view.JoinedNftView).\n Expected:\n" + viewInfo9 + "\n Found:\n" + viewInfo10);
                }
                ViewInfo viewInfo11 = new ViewInfo("closed_coin_view", "CREATE VIEW `closed_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM closed_coin) GROUP BY walletId");
                ViewInfo viewInfo12 = ViewInfo.read(sQLiteConnection, "closed_coin_view");
                if (!viewInfo11.equals(viewInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "closed_coin_view(com.okinc.business.defi.biz.database.wallet.view.ClosedCoinView).\n Expected:\n" + viewInfo11 + "\n Found:\n" + viewInfo12);
                }
                ViewInfo viewInfo13 = new ViewInfo("opened_coin_view", "CREATE VIEW `opened_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM opened_coin) GROUP BY walletId");
                ViewInfo viewInfo14 = ViewInfo.read(sQLiteConnection, "opened_coin_view");
                if (!viewInfo13.equals(viewInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "opened_coin_view(com.okinc.business.defi.biz.database.wallet.view.OpenedCoinView).\n Expected:\n" + viewInfo13 + "\n Found:\n" + viewInfo14);
                }
                ViewInfo viewInfo15 = new ViewInfo("JoinedChainSegWitAddress", "CREATE VIEW `JoinedChainSegWitAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths FROM (SELECT * FROM chain_address_segwit) GROUP BY walletId");
                ViewInfo viewInfo16 = ViewInfo.read(sQLiteConnection, "JoinedChainSegWitAddress");
                if (!viewInfo15.equals(viewInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "JoinedChainSegWitAddress(com.okinc.business.defi.biz.database.wallet.view.JoinedChainSegWitAddressView).\n Expected:\n" + viewInfo15 + "\n Found:\n" + viewInfo16);
                }
                ViewInfo viewInfo17 = new ViewInfo("OKRootWallet", "CREATE VIEW `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, (CASE WHEN wallet.type IS 7 THEN wallet.eoaWalletType ELSE wallet.type END) AS type, sortIndex, createIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwarePassphraseId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt, hardware_info.data as hardwareData, MPCInfo.rootWalletId AS mpcRootWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, MPCInfo.copiedEscapeListString AS copiedEscapeListString FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId LEFT JOIN MPCInfo ON wallet.rootWalletId == MPCInfo.rootWalletId GROUP BY root_wallet.rootId");
                ViewInfo viewInfo18 = ViewInfo.read(sQLiteConnection, "OKRootWallet");
                if (!viewInfo17.equals(viewInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "OKRootWallet(com.okinc.business.defi.biz.database.wallet.view.RootWalletView).\n Expected:\n" + viewInfo17 + "\n Found:\n" + viewInfo18);
                }
                ViewInfo viewInfo19 = new ViewInfo("view_custom_chain_address", "CREATE VIEW `view_custom_chain_address` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(address, ',') AS addresses, group_concat(public_key, ',') AS public_keys, group_concat(derive_path, ',') AS derive_paths FROM custom_chain_address GROUP BY wallet_id");
                ViewInfo viewInfo20 = ViewInfo.read(sQLiteConnection, "view_custom_chain_address");
                if (!viewInfo19.equals(viewInfo20)) {
                    return new RoomOpenDelegate.ValidationResult(false, "view_custom_chain_address(com.okinc.business.defi.biz.database.wallet.view.CustomChainAddressView).\n Expected:\n" + viewInfo19 + "\n Found:\n" + viewInfo20);
                }
                ViewInfo viewInfo21 = new ViewInfo("view_custom_chain_coin_meta", "CREATE VIEW `view_custom_chain_coin_meta` AS SELECT chain.chain_id, chain.real_chain_id, chain.chain_name, chain.icon_url, chain.from_custom, chain.rpc_url, chain.faucet_url, chain.explorer_url, chain.create_at, chain.update_at, group_concat(coin.coin_id, ',') AS coin_ids, group_concat(coin.symbol, ',') AS symbols, group_concat(coin.name, ',') AS names, group_concat(coin.icon_url, ',') AS icon_urls, group_concat(coin.contract_address, ',') AS contract_addresses, group_concat(coin.base_coin_id, ',') AS base_coin_ids, group_concat(coin.coin_type, ',') AS coin_types, group_concat(coin.decimal_num, ',') AS decimal_nums, group_concat(coin.create_at, ',') AS create_ats FROM custom_chain_meta AS chain LEFT JOIN custom_chain_coin_meta AS coin ON chain.chain_id = coin.chain_id GROUP BY chain.rpc_url");
                ViewInfo viewInfo22 = ViewInfo.read(sQLiteConnection, "view_custom_chain_coin_meta");
                if (!viewInfo21.equals(viewInfo22)) {
                    return new RoomOpenDelegate.ValidationResult(false, "view_custom_chain_coin_meta(com.okinc.business.defi.biz.database.wallet.view.CustomChainCoinMetaView).\n Expected:\n" + viewInfo21 + "\n Found:\n" + viewInfo22);
                }
                ViewInfo viewInfo23 = new ViewInfo("view_custom_chain_wallet_coin", "CREATE VIEW `view_custom_chain_wallet_coin` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(create_at, ',') AS create_ats FROM custom_chain_wallet_coin GROUP BY wallet_id");
                ViewInfo viewInfo24 = ViewInfo.read(sQLiteConnection, "view_custom_chain_wallet_coin");
                if (!viewInfo23.equals(viewInfo24)) {
                    return new RoomOpenDelegate.ValidationResult(false, "view_custom_chain_wallet_coin(com.okinc.business.defi.biz.database.wallet.view.CustomChainWalletCoinView).\n Expected:\n" + viewInfo23 + "\n Found:\n" + viewInfo24);
                }
                ViewInfo viewInfo25 = new ViewInfo("view_custom_chain_coin_balance", "CREATE VIEW `view_custom_chain_coin_balance` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(amount, ',') AS amounts, group_concat(ccy_amount, ',') AS ccy_amounts, group_concat(order_value, ',') AS order_values, group_concat(create_at, ',') AS create_ats FROM custom_chain_coin_balance GROUP BY wallet_id");
                ViewInfo viewInfo26 = ViewInfo.read(sQLiteConnection, "view_custom_chain_coin_balance");
                if (!viewInfo25.equals(viewInfo26)) {
                    return new RoomOpenDelegate.ValidationResult(false, "view_custom_chain_coin_balance(com.okinc.business.defi.biz.database.wallet.view.CustomChainCoinBalanceView).\n Expected:\n" + viewInfo25 + "\n Found:\n" + viewInfo26);
                }
                ViewInfo viewInfo27 = new ViewInfo("WalletRepairView", "CREATE VIEW `WalletRepairView` AS SELECT walletId, group_concat(walletRepair.identifierType) as identifierType, group_concat(walletRepair.status) as repairStatus, group_concat(walletRepair.reserved) as repairReserved, group_concat(walletRepair.extJson) as repairExtJson, group_concat(walletRepair.timestamp) as repairTimestamp from walletRepair group by walletId");
                ViewInfo viewInfo28 = ViewInfo.read(sQLiteConnection, "WalletRepairView");
                if (!viewInfo27.equals(viewInfo28)) {
                    return new RoomOpenDelegate.ValidationResult(false, "WalletRepairView(com.okinc.business.defi.biz.database.wallet.view.WalletRepairView).\n Expected:\n" + viewInfo27 + "\n Found:\n" + viewInfo28);
                }
                ViewInfo viewInfo29 = new ViewInfo("WalletView", "CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.unPnls AS unPnls, joined_coin_asset.unPnlYields AS unPnlYields, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, joined_coin_asset.spotBalances AS spotBalances, joined_coin_asset.holdAvgPrices AS holdAvgPrices, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt, wallet_tee.model as model, wallet_tee.canUseSa2 as canUseSa2, wallet_tee.auto_renew as autoRenew, wallet_tee.upgrade_status as upgradeStatus from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
                ViewInfo viewInfo30 = ViewInfo.read(sQLiteConnection, "WalletView");
                if (!viewInfo29.equals(viewInfo30)) {
                    return new RoomOpenDelegate.ValidationResult(false, "WalletView(com.okinc.business.defi.biz.database.wallet.view.WalletView).\n Expected:\n" + viewInfo29 + "\n Found:\n" + viewInfo30);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        HashMap map = new HashMap(0);
        HashMap map2 = new HashMap(15);
        HashSet hashSet = new HashSet(1);
        hashSet.add("chain_address");
        map2.put("joindchainaddress", hashSet);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add("coin_asset");
        map2.put("joined_coin_asset", hashSet2);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add("sepInfo");
        map2.put("joindsepinfos", hashSet3);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add("defi");
        map2.put("joineddefi", hashSet4);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add("nft_v2");
        map2.put("joinednft", hashSet5);
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add("closed_coin");
        map2.put("closed_coin_view", hashSet6);
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add("opened_coin");
        map2.put("opened_coin_view", hashSet7);
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add("chain_address_segwit");
        map2.put("joinedchainsegwitaddress", hashSet8);
        HashSet hashSet9 = new HashSet(4);
        hashSet9.add("root_wallet");
        hashSet9.add("wallet");
        hashSet9.add("hardware_info");
        hashSet9.add("MPCInfo");
        map2.put("okrootwallet", hashSet9);
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add("custom_chain_address");
        map2.put("view_custom_chain_address", hashSet10);
        HashSet hashSet11 = new HashSet(2);
        hashSet11.add("custom_chain_meta");
        hashSet11.add("custom_chain_coin_meta");
        map2.put("view_custom_chain_coin_meta", hashSet11);
        HashSet hashSet12 = new HashSet(1);
        hashSet12.add("custom_chain_wallet_coin");
        map2.put("view_custom_chain_wallet_coin", hashSet12);
        HashSet hashSet13 = new HashSet(1);
        hashSet13.add("custom_chain_coin_balance");
        map2.put("view_custom_chain_coin_balance", hashSet13);
        HashSet hashSet14 = new HashSet(1);
        hashSet14.add("walletRepair");
        map2.put("walletrepairview", hashSet14);
        HashSet hashSet15 = new HashSet(16);
        hashSet15.add("wallet");
        hashSet15.add("EOSInfo");
        hashSet15.add("total_asset");
        hashSet15.add("wallet_tee");
        hashSet15.add("chain_address");
        hashSet15.add("coin_asset");
        hashSet15.add("sepInfo");
        hashSet15.add("defi");
        hashSet15.add("nft_v2");
        hashSet15.add("closed_coin");
        hashSet15.add("opened_coin");
        hashSet15.add("chain_address_segwit");
        hashSet15.add("custom_chain_address");
        hashSet15.add("custom_chain_wallet_coin");
        hashSet15.add("custom_chain_coin_balance");
        hashSet15.add("walletRepair");
        map2.put("walletview", hashSet15);
        return new InvalidationTracker(this, map, map2, "chain_address", "EOSInfo", "sepInfo", "coin_asset", "defi", "nft_v2", "closed_coin", "opened_coin", "wallet", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "keyValues", "message", "sync", "dapp_favorite_new", "dapp_history_new", "dapp_tab_new", "dapp_search_history", "chain_address_segwit", "root_wallet", "tx_log", "hardware_info", "MPCInfo", "custom_chain_meta", "custom_chain_meta_status", "custom_chain_coin_meta", "custom_chain_wallet_coin", "custom_chain_address", "custom_chain_coin_balance", "custom_chain_transaction", "walletRepair", "custom_fee", "wallet_sign_data", "total_asset", "eip_7702_info", "wallet_tee", "wallet_jwt_info");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(true, "chain_address", "EOSInfo", "sepInfo", "coin_asset", "defi", "nft_v2", "closed_coin", "opened_coin", "wallet", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "keyValues", "message", "sync", "dapp_favorite_new", "dapp_history_new", "dapp_tab_new", "dapp_search_history", "chain_address_segwit", "root_wallet", "tx_log", "hardware_info", "MPCInfo", "custom_chain_meta", "custom_chain_meta_status", "custom_chain_wallet_coin", "custom_chain_address", "custom_chain_coin_balance", "custom_chain_transaction", "custom_chain_coin_meta", "walletRepair", "custom_fee", "wallet_sign_data", "total_asset", "eip_7702_info", "wallet_tee", "wallet_jwt_info");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC11338cKn.class, C11344cKt.OLrzqt());
        map.put(InterfaceC11384cMf.class, C11386cMh.values());
        map.put(cLG.class, cLH.KWHzl());
        map.put(cNP.class, cNL.copydefault());
        map.put(InterfaceC11353cLb.class, C11360cLi.EZpvd());
        map.put(InterfaceC11443cOk.class, C11445cOm.copydefault());
        map.put(cLB.class, cLC.KWHzl());
        map.put(PasswordDao.class, cKE.valueOf());
        map.put(InterfaceC11289cIs.class, C11290cIt.AEQbTJ());
        map.put(InterfaceC11342cKr.class, C11341cKq.OLrzqt());
        map.put(cJS.class, cJP.djBIcL());
        map.put(InterfaceC11356cLe.class, C11357cLf.AEQbTJ());
        map.put(cIL.class, cIM.AEQbTJ());
        map.put(InterfaceC11321cJx.class, C11319cJv.KWHzl());
        map.put(cJN.class, cJJ.KWHzl());
        map.put(InterfaceC11433cOa.class, C11440cOh.copydefault());
        map.put(InterfaceC11330cKf.class, C11334cKj.copydefault());
        map.put(cKU.class, cKV.EZpvd());
        map.put(InterfaceC11435cOc.class, C11434cOb.KWHzl());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11338cKn fZBcTu() {
        InterfaceC11338cKn interfaceC11338cKn;
        if (this.fFgQHt != null) {
            return this.fFgQHt;
        }
        synchronized (this) {
            if (this.fFgQHt == null) {
                this.fFgQHt = new C11344cKt(this);
            }
            interfaceC11338cKn = this.fFgQHt;
        }
        return interfaceC11338cKn;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11384cMf giSNqX() {
        InterfaceC11384cMf interfaceC11384cMf;
        if (this.fvQaOB != null) {
            return this.fvQaOB;
        }
        synchronized (this) {
            if (this.fvQaOB == null) {
                this.fvQaOB = new C11386cMh(this);
            }
            interfaceC11384cMf = this.fvQaOB;
        }
        return interfaceC11384cMf;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cLG gasjUx() {
        cLG clg;
        if (this.giSNqX != null) {
            return this.giSNqX;
        }
        synchronized (this) {
            if (this.giSNqX == null) {
                this.giSNqX = new cLH(this);
            }
            clg = this.giSNqX;
        }
        return clg;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cNP fvQaOB() {
        cNP cnp;
        if (this.flVtFt != null) {
            return this.flVtFt;
        }
        synchronized (this) {
            if (this.flVtFt == null) {
                this.flVtFt = new cNL(this);
            }
            cnp = this.flVtFt;
        }
        return cnp;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11353cLb gGvvIC() {
        InterfaceC11353cLb interfaceC11353cLb;
        if (this.gasjUx != null) {
            return this.gasjUx;
        }
        synchronized (this) {
            if (this.gasjUx == null) {
                this.gasjUx = new C11360cLi(this);
            }
            interfaceC11353cLb = this.gasjUx;
        }
        return interfaceC11353cLb;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11443cOk hUfVAv() {
        InterfaceC11443cOk interfaceC11443cOk;
        if (this.gkJEwt != null) {
            return this.gkJEwt;
        }
        synchronized (this) {
            if (this.gkJEwt == null) {
                this.gkJEwt = new C11445cOm(this);
            }
            interfaceC11443cOk = this.gkJEwt;
        }
        return interfaceC11443cOk;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cLB flVtFt() {
        cLB clb;
        if (this.gGvvIC != null) {
            return this.gGvvIC;
        }
        synchronized (this) {
            if (this.gGvvIC == null) {
                this.gGvvIC = new cLC(this);
            }
            clb = this.gGvvIC;
        }
        return clb;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public PasswordDao dxcTrN() {
        PasswordDao passwordDao;
        if (this.dxcTrN != null) {
            return this.dxcTrN;
        }
        synchronized (this) {
            if (this.dxcTrN == null) {
                this.dxcTrN = new cKE(this);
            }
            passwordDao = this.dxcTrN;
        }
        return passwordDao;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11289cIs RcXXUw() {
        InterfaceC11289cIs interfaceC11289cIs;
        if (this.dNCPSb != null) {
            return this.dNCPSb;
        }
        synchronized (this) {
            if (this.dNCPSb == null) {
                this.dNCPSb = new C11290cIt(this);
            }
            interfaceC11289cIs = this.dNCPSb;
        }
        return interfaceC11289cIs;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11342cKr fFgQHt() {
        InterfaceC11342cKr interfaceC11342cKr;
        if (this.fZBcTu != null) {
            return this.fZBcTu;
        }
        synchronized (this) {
            if (this.fZBcTu == null) {
                this.fZBcTu = new C11341cKq(this);
            }
            interfaceC11342cKr = this.fZBcTu;
        }
        return interfaceC11342cKr;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cJS dNCPSb() {
        cJS cjs;
        if (this.aKErDB != null) {
            return this.aKErDB;
        }
        synchronized (this) {
            if (this.aKErDB == null) {
                this.aKErDB = new cJP(this);
            }
            cjs = this.aKErDB;
        }
        return cjs;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cIL aKErDB() {
        cIL cil;
        if (this.djSkpj != null) {
            return this.djSkpj;
        }
        synchronized (this) {
            if (this.djSkpj == null) {
                this.djSkpj = new cIM(this);
            }
            cil = this.djSkpj;
        }
        return cil;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11321cJx UeEOUB() {
        InterfaceC11321cJx interfaceC11321cJx;
        if (this.UeEOUB != null) {
            return this.UeEOUB;
        }
        synchronized (this) {
            if (this.UeEOUB == null) {
                this.UeEOUB = new C11319cJv(this);
            }
            interfaceC11321cJx = this.UeEOUB;
        }
        return interfaceC11321cJx;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cJN djSkpj() {
        cJN cjn;
        if (this.RcXXUw != null) {
            return this.RcXXUw;
        }
        synchronized (this) {
            if (this.RcXXUw == null) {
                this.RcXXUw = new cJJ(this);
            }
            cjn = this.RcXXUw;
        }
        return cjn;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11433cOa AxsJAYaxsJAY() {
        InterfaceC11433cOa interfaceC11433cOa;
        if (this.iZzfmt != null) {
            return this.iZzfmt;
        }
        synchronized (this) {
            if (this.iZzfmt == null) {
                this.iZzfmt = new C11440cOh(this);
            }
            interfaceC11433cOa = this.iZzfmt;
        }
        return interfaceC11433cOa;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11330cKf finit() {
        InterfaceC11330cKf interfaceC11330cKf;
        if (this.dvKsVJ != null) {
            return this.dvKsVJ;
        }
        synchronized (this) {
            if (this.dvKsVJ == null) {
                this.dvKsVJ = new C11334cKj(this);
            }
            interfaceC11330cKf = this.dvKsVJ;
        }
        return interfaceC11330cKf;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public cKU dvKsVJ() {
        cKU cku;
        if (this.finit != null) {
            return this.finit;
        }
        synchronized (this) {
            if (this.finit == null) {
                this.finit = new cKV(this);
            }
            cku = this.finit;
        }
        return cku;
    }

    @Override // com.okinc.business.defi.biz.database.wallet.WalletDatabase
    public InterfaceC11435cOc iRxXKY() {
        InterfaceC11435cOc interfaceC11435cOc;
        if (this.iRxXKY != null) {
            return this.iRxXKY;
        }
        synchronized (this) {
            if (this.iRxXKY == null) {
                this.iRxXKY = new C11434cOb(this);
            }
            interfaceC11435cOc = this.iRxXKY;
        }
        return interfaceC11435cOc;
    }
}
