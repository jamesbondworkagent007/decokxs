package com.okinc.business.defi.biz.database.wallet;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.dao.PasswordDao;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11287cIq;
import o.C13458dMb;
import o.C32866mlf;
import o.InterfaceC11289cIs;
import o.InterfaceC11321cJx;
import o.InterfaceC11330cKf;
import o.InterfaceC11338cKn;
import o.InterfaceC11342cKr;
import o.InterfaceC11353cLb;
import o.InterfaceC11384cMf;
import o.InterfaceC11433cOa;
import o.InterfaceC11435cOc;
import o.InterfaceC11443cOk;
import o.cGO;
import o.cIL;
import o.cJN;
import o.cJS;
import o.cKU;
import o.cLB;
import o.cLG;
import o.cNP;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WalletDatabase extends RoomDatabase {
    public static final Application Companion = new Application(null);
    public static final TaskStackBuilder AYXKKw = new TaskStackBuilder();
    public static final Intent getNewProxyInstance = new Intent();
    public static final PackageItemInfo gHZMYf = new PackageItemInfo();
    public static final TypedArray DTwDnp = new TypedArray();
    public static final Canvas QKVWgx = new Canvas();
    public static final SQLiteDatabase QbewEr = new SQLiteDatabase();
    public static final SQLiteClosable QUSxYX = new SQLiteClosable();
    public static final CursorFactory QVAiDq = new CursorFactory();
    public static final Bitmap RJOkX = new Bitmap();
    public static final TaskDescription OLrzqt = new TaskDescription();
    public static final Paint QfsBiF = new Paint();
    public static final ActionBar copydefault = new ActionBar();
    public static final Activity EZpvd = new Activity();
    public static final StateListAnimator KWHzl = new StateListAnimator();
    public static final FragmentManager AEQbTJ = new FragmentManager();
    public static final Dialog gEmmrt = new Dialog();
    public static final LoaderManager djBIcL = new LoaderManager();
    public static final PendingIntent valueOf = new PendingIntent();
    public static final Fragment AhwBna = new Fragment();
    public static final PictureInPictureParams fetchVPNInfo = new PictureInPictureParams();
    public static final VoiceInteractor AkhnZx = new VoiceInteractor();
    public static final SharedElementCallback values = new SharedElementCallback();
    public static final AssistContent isConnected = new AssistContent();
    public static final ComponentName DbNXlk = new ComponentName();
    public static final ClipData AuCTel = new ClipData();
    public static final ComponentCallbacks ejfBZ = new ComponentCallbacks();
    public static final ComponentCallbacks2 fARcdN = new ComponentCallbacks2();
    public static final BroadcastReceiver fIwbmz = new BroadcastReceiver();
    public static final ContentResolver fJNWhG = new ContentResolver();
    public static final ContextWrapper uzCIH = new ContextWrapper();
    public static final DialogInterface iwGUEr = new DialogInterface();
    public static final Context hDKMBd = new Context();
    public static final SharedPreferences getFieldNames = new SharedPreferences();
    public static final IntentSender wlaJM = new IntentSender();
    public static final ApplicationInfo AubY = new ApplicationInfo();
    public static final IntentFilter zsXlph = new IntentFilter();
    public static final ServiceConnection zLjUOn = new ServiceConnection();
    public static final AssetManager AuCTelauCTel = new AssetManager();
    public static final ColorStateList zuBGHE = new ColorStateList();
    public static final Configuration sSMYrx = new Configuration();
    public static final PackageManager AxsJAY = new PackageManager();
    public static final DatabaseErrorHandler AwvSrB = new DatabaseErrorHandler();
    public static final Theme QOLQEE = new Theme();
    public static final Cursor OcIXYQ = new Cursor();
    public static final Resources ORxRYg = new Resources();

    public abstract InterfaceC11433cOa AxsJAYaxsJAY();

    public abstract InterfaceC11289cIs RcXXUw();

    public abstract InterfaceC11321cJx UeEOUB();

    public abstract cIL aKErDB();

    public abstract cJS dNCPSb();

    public abstract cJN djSkpj();

    public abstract cKU dvKsVJ();

    public abstract PasswordDao dxcTrN();

    public abstract InterfaceC11342cKr fFgQHt();

    public abstract InterfaceC11338cKn fZBcTu();

    public abstract InterfaceC11330cKf finit();

    public abstract cLB flVtFt();

    public abstract cNP fvQaOB();

    public abstract InterfaceC11353cLb gGvvIC();

    public abstract cLG gasjUx();

    public abstract InterfaceC11384cMf giSNqX();

    public abstract InterfaceC11443cOk hUfVAv();

    public abstract InterfaceC11435cOc iRxXKY();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.database.wallet.WalletDatabase.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WalletDatabase OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AxsJAY();
        }

        public final WalletDatabase copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            return (WalletDatabase) Room.databaseBuilder(applicationContext, WalletDatabase.class, "wallet.db").addCallback(new StateListAnimator()).addMigrations(WalletDatabase.AYXKKw, WalletDatabase.getNewProxyInstance, WalletDatabase.gHZMYf, WalletDatabase.DTwDnp, WalletDatabase.QKVWgx, WalletDatabase.QbewEr, WalletDatabase.QUSxYX, WalletDatabase.QVAiDq, WalletDatabase.RJOkX, WalletDatabase.OLrzqt, WalletDatabase.QfsBiF, WalletDatabase.copydefault, WalletDatabase.EZpvd, WalletDatabase.KWHzl, WalletDatabase.AEQbTJ, WalletDatabase.gEmmrt, WalletDatabase.djBIcL, WalletDatabase.valueOf, WalletDatabase.AhwBna, WalletDatabase.fetchVPNInfo, WalletDatabase.AkhnZx, WalletDatabase.values, WalletDatabase.isConnected, WalletDatabase.DbNXlk, WalletDatabase.AuCTel, WalletDatabase.ejfBZ, WalletDatabase.fARcdN, WalletDatabase.fIwbmz, WalletDatabase.fJNWhG, WalletDatabase.uzCIH, WalletDatabase.iwGUEr, WalletDatabase.hDKMBd, WalletDatabase.getFieldNames, WalletDatabase.wlaJM, WalletDatabase.AubY, WalletDatabase.zsXlph, WalletDatabase.zLjUOn, WalletDatabase.AuCTelauCTel, WalletDatabase.zuBGHE, WalletDatabase.sSMYrx, WalletDatabase.AxsJAY, WalletDatabase.AwvSrB, WalletDatabase.QOLQEE, WalletDatabase.OcIXYQ, WalletDatabase.ORxRYg).build();
        }

        public static final class StateListAnimator extends RoomDatabase.Callback {
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
                super.onOpen(supportSQLiteDatabase);
                pUU.KWHzl("WalletDatabase", "database onOpen");
                WalletDatabase.Companion.OLrzqt(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomDatabase.Callback
            public void onDestructiveMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
                super.onDestructiveMigration(supportSQLiteDatabase);
                pUU.copydefault("WalletDatabase", "database onDestructiveMigration");
            }
        }

        public final void OLrzqt(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (SPUtils.getBoolean("wallet_db_wrong_cardano_address_deleted", false, "wallet_biz_sp_file")) {
                return;
            }
            supportSQLiteDatabase.beginTransaction();
            try {
                WalletType walletType = WalletType.HDWallet;
                supportSQLiteDatabase.execSQL("DELETE FROM chain_address WHERE chainId = ? AND walletId IN (SELECT id FROM wallet WHERE addressIndex >= ? AND type = ?)", new Long[]{20600L, 1L, Long.valueOf(walletType.ordinal())});
                supportSQLiteDatabase.execSQL("DELETE FROM wallet_sign_data WHERE chain_index = ? AND wallet_id IN (SELECT id FROM wallet WHERE addressIndex >= ? AND type = ?)", new Long[]{1815L, 1L, Long.valueOf(walletType.ordinal())});
                supportSQLiteDatabase.setTransactionSuccessful();
                SPUtils.commit("wallet_db_wrong_cardano_address_deleted", Boolean.TRUE, "wallet_biz_sp_file");
                OLrzqt(1815L, null);
            } finally {
                try {
                } finally {
                }
            }
        }

        public final void OLrzqt(final long j, Throwable th) {
            final String str;
            final String str2;
            str = "";
            if (th == null) {
                str2 = "success";
            } else {
                String message = th.getMessage();
                str = message != null ? message : "";
                str2 = EopTrackEvent.KEY_RESULT_FAILED;
            }
            C32866mlf.onEvent$default("Web3Wallet_WalletAddress_FixResult_View", (TrackChannel[]) null, new Function1() { // from class: o.cIn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletDatabase.Application.copydefault(str2, j, str, (EventParamsList) obj);
                }
            }, 1, (Object) null);
        }

        public static final Unit copydefault(String str, long j, String str2, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("status", str, true);
            EventParamsList.put$default(eventParamsList, "chain_index", String.valueOf(j), false, 4, null);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, str2, false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final class TaskStackBuilder extends cGO {
        public TaskStackBuilder() {
            super(1, 2);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `dapp_favorite`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `dapp_history`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS dapp_tab");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dapp_favorite_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dapp_history_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dapp_tab_new` (`id` INTEGER NOT NULL, `platform` TEXT NOT NULL, `logo` TEXT NOT NULL, `network` TEXT NOT NULL, `tvl` REAL NOT NULL, `intro` TEXT NOT NULL, `tag` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, `dau` INTEGER NOT NULL, `order` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`url`))");
        }
    }

    public static final class Intent extends cGO {
        public Intent() {
            super(2, 3);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin ADD COLUMN `amountInt` TEXT NOT NULL DEFAULT '0'");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin ADD COLUMN `ccyAmount` TEXT NOT NULL DEFAULT '0'");
            supportSQLiteDatabase.execSQL("ALTER TABLE defi ADD COLUMN `balance` TEXT NOT NULL DEFAULT '0'");
            supportSQLiteDatabase.execSQL("ALTER TABLE defi ADD COLUMN `dailyChange` TEXT NOT NULL DEFAULT '0'");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindCoin`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindDefi`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedCoin` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(orderValue, ',') AS orderValues FROM (SELECT * FROM coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedDefi` AS SELECT walletId, group_concat(assetId, ',') AS assetIds, group_concat(balance, ',') AS balances, group_concat(dailyChange, ',') AS dailyChanges FROM (SELECT * FROM defi) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoinedCoin.walletId AS coinWalletId, JoinedCoin.coinIds AS coinIds, JoinedCoin.amounts AS amounts, JoinedCoin.amountInts AS amountInts, JoinedCoin.ccyAmounts AS ccyAmounts, JoinedCoin.orderValues AS orderValues, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.balances AS defiBalances, JoinedDefi.dailyChanges AS defiDailyChanges, JoindNft.assetIds AS nftAssetIds, JoindNft.amounts AS nftAmounts, JoindNft.details AS nftDetails from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedCoin ON wallet.id = JoinedCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoindNft ON wallet.id == JoindNft.walletId");
        }
    }

    public static final class PackageItemInfo extends cGO {
        public PackageItemInfo() {
            super(3, 4);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin ADD COLUMN `dailyChange` TEXT NOT NULL DEFAULT '0'");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedCoin`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoindCoin` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues FROM (SELECT * FROM coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `OKWallet` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.balances AS defiBalances, JoinedDefi.dailyChanges AS defiDailyChanges, JoindNft.assetIds AS nftAssetIds, JoindNft.amounts AS nftAmounts, JoindNft.details AS nftDetails from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoindNft ON wallet.id == JoindNft.walletId");
        }
    }

    public static final class TypedArray extends cGO {
        public TypedArray() {
            super(4, 5);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `closed_coin` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
        }
    }

    public static final class Canvas extends cGO {
        public Canvas() {
            super(5, 6);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `CloseCoin`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `CloseCoin` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM closed_coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.balances AS defiBalances, JoinedDefi.dailyChanges AS defiDailyChanges, JoindNft.assetIds AS nftAssetIds, JoindNft.amounts AS nftAmounts, JoindNft.details AS nftDetails from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoindNft ON wallet.id == JoindNft.walletId");
        }
    }

    public static final class SQLiteDatabase extends cGO {
        public SQLiteDatabase() {
            super(6, 7);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `nft`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindNft`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `nft_v2` (`walletId` TEXT NOT NULL, `assetId` TEXT NOT NULL, `bean` TEXT NOT NULL, PRIMARY KEY(`walletId`, `assetId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedNft` AS SELECT walletId, group_concat(assetId, ',') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM nft_v2) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView_v2` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.balances AS defiBalances, JoinedDefi.dailyChanges AS defiDailyChanges, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId");
        }
    }

    public static final class SQLiteClosable extends cGO {
        public SQLiteClosable() {
            super(7, 8);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `orderValue` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OpenCoin`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView_v2`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `opened_coin` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("CREATE VIEW `OpenCoin` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM opened_coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.balances AS defiBalances, JoinedDefi.dailyChanges AS defiDailyChanges, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class CursorFactory extends cGO {
        public CursorFactory() {
            super(8, 9);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `defi`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedDefi`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `defi` (`walletId` TEXT NOT NULL, `assetId` TEXT NOT NULL, `bean` TEXT NOT NULL, PRIMARY KEY(`walletId`, `assetId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedDefi` AS SELECT walletId, group_concat(assetId, ',') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM defi) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class Bitmap extends cGO {
        public Bitmap() {
            super(9, 10);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dapp_search_history` (`id` TEXT NOT NULL, `balance` TEXT NOT NULL,`category` INTEGER NOT NULL, `deepLink` TEXT NOT NULL,`logo` TEXT NOT NULL,`user` TEXT NOT NULL,`volume` TEXT NOT NULL,`name` TEXT NOT NULL,`shortDescribe` TEXT NOT NULL, PRIMARY KEY(`deepLink`))");
        }
    }

    public static final class TaskDescription extends cGO {
        public TaskDescription() {
            super(10, 11);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `message`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `message` (`walletId` TEXT NOT NULL, `id` INTEGER NOT NULL, `rowId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `read` INTEGER NOT NULL, `msg` TEXT NOT NULL, PRIMARY KEY(`walletId`, `id`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
        }
    }

    public static final class Paint extends cGO {
        public Paint() {
            super(11, 12);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedNft`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedNft` AS SELECT walletId, group_concat(assetId, '&-&') AS assetIds, group_concat(bean, '-') AS beans FROM (SELECT * FROM nft_v2) GROUP BY walletId");
        }
    }

    public static final class ActionBar extends cGO {
        public ActionBar() {
            super(12, 13);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address ADD COLUMN `addressType` INTEGER NOT NULL DEFAULT 1");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindChainAddress`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoindChainAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses FROM (SELECT * FROM chain_address) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `chain_address_segwit` (`walletId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `addressType` INTEGER NOT NULL,`address` TEXT NOT NULL, PRIMARY KEY(`walletId`, `chainId`,`addressType`))");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedChainSegWitAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses FROM (SELECT * FROM chain_address_segwit) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class Activity extends cGO {
        public Activity() {
            super(13, 14);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `rootWalletId` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `addressIndex` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `root_wallet`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `root_wallet` (`rootId` TEXT NOT NULL, `name` TEXT NOT NULL, `sortIndex` INTEGER NOT NULL, `createAt` INTEGER NOT NULL, PRIMARY KEY (`rootId`))");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, sortIndex, root_wallet.createAt as createAt FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId GROUP BY rootWalletId");
        }
    }

    public static final class StateListAnimator extends cGO {
        public StateListAnimator() {
            super(14, 15);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `tx_log` (`txId` TEXT NOT NULL, `txInfo` TEXT NOT NULL, `txTime` INTEGER NOT NULL, PRIMARY KEY(`txId`))");
        }
    }

    public static final class FragmentManager extends cGO {
        public FragmentManager() {
            super(15, 16);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `syncStatus` INTEGER NOT NULL DEFAULT 5");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name,type, sortIndex, root_wallet.createAt as createAt FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId GROUP BY rootWalletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId,syncStatus, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class Dialog extends cGO {
        public Dialog() {
            super(16, 17);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address ADD COLUMN `publicKey` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address ADD COLUMN `derivePath` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `hardware_info` (`hardwareUniqueId` TEXT NOT NULL, `hardwareName` TEXT NOT NULL, `hardwareSystem` TEXT NOT NULL, `hardwareType` INTEGER NOT NULL, `rootWalletId` TEXT NOT NULL, `createAt` INTEGER NOT NULL, PRIMARY KEY(`rootWalletId`, `hardwareUniqueId`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindChainAddress`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoindChainAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths FROM (SELECT * FROM chain_address) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, type, sortIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId GROUP BY root_wallet.rootId");
        }
    }

    public static final class LoaderManager extends cGO {
        public LoaderManager() {
            super(17, 18);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `completedSyncOperation` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `syncOperation` TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address_segwit ADD COLUMN `publicKey` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address_segwit ADD COLUMN `derivePath` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedChainSegWitAddress`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedChainSegWitAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths FROM (SELECT * FROM chain_address_segwit) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, backup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class PendingIntent extends cGO {
        public PendingIntent() {
            super(18, 19);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `cloudBackup` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class Fragment extends cGO {
        public Fragment() {
            super(19, 20);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `modifiedName` INTEGER NOT NULL DEFAULT 1");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class PictureInPictureParams extends cGO {
        public PictureInPictureParams() {
            super(20, 21);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MPCInfo` (`walletId` TEXT NOT NULL, `mpcId` TEXT NOT NULL, `uid` TEXT NOT NULL, `status` INTEGER NOT NULL DEFAULT 0, `version` TEXT NOT NULL, `accountName` TEXT NOT NULL, `encryptShareKey` TEXT NOT NULL, `ecdsaPubkey` TEXT NOT NULL, `ecdsaChainCode` TEXT NOT NULL, `ed25519Pubkey` TEXT NOT NULL, `ed25519ChainCode` TEXT NOT NULL, `isEscape` INTEGER NOT NULL DEFAULT 0, `mpcCreateAt` INTEGER NOT NULL DEFAULT 0, `createType` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`walletId`, `mpcId`, `uid`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class VoiceInteractor extends cGO {
        public VoiceInteractor() {
            super(21, 22);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedChainSegWitAddress`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `chain_address_segwit_new` (`walletId` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `addressType` INTEGER NOT NULL, `address` TEXT NOT NULL, `publicKey` TEXT NOT NULL, `derivePath` TEXT NOT NULL, PRIMARY KEY(`walletId`, `chainId`, `addressType`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("INSERT INTO chain_address_segwit_new(walletId,chainId,addressType,address,publicKey,derivePath) SELECT walletId,chainId,addressType,address,publicKey,derivePath FROM chain_address_segwit");
            supportSQLiteDatabase.execSQL("DROP TABLE chain_address_segwit");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address_segwit_new RENAME TO chain_address_segwit");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wallet_new` (`id` TEXT NOT NULL, `type` INTEGER NOT NULL, `data` TEXT NOT NULL, `chainId` INTEGER NOT NULL, `language` TEXT NOT NULL, `name` TEXT NOT NULL, `modifiedName` INTEGER NOT NULL, `backup` INTEGER NOT NULL, `cloudBackup` INTEGER NOT NULL, `main` INTEGER NOT NULL, `xpub` TEXT NOT NULL, `xpriv` TEXT NOT NULL, `isSegWit` INTEGER NOT NULL, `fromCreate` INTEGER NOT NULL, `createAt` INTEGER NOT NULL, `orderValue` INTEGER NOT NULL, `rootWalletId` TEXT NOT NULL DEFAULT '', `addressIndex` INTEGER NOT NULL, `syncStatus` INTEGER NOT NULL, `completedSyncOperation` TEXT NOT NULL, `syncOperation` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("INSERT INTO wallet_new(id,type,data,chainId,language,name,modifiedName,backup,cloudBackup,main,xpub,xpriv,isSegWit,fromCreate,createAt,orderValue,rootWalletId,addressIndex,syncStatus,completedSyncOperation,syncOperation) SELECT id,type,data,chainId,language,name,modifiedName,backup,cloudBackup,main,xpub,xpriv,isSegWit,fromCreate,createAt,orderValue,rootWalletId,addressIndex,syncStatus,completedSyncOperation,syncOperation FROM wallet");
            supportSQLiteDatabase.execSQL("DROP TABLE wallet");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet_new RENAME TO wallet");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_wallet_rootWalletId` ON `wallet` (`rootWalletId`)");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedChainSegWitAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths FROM (SELECT * FROM chain_address_segwit) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, type, sortIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId GROUP BY root_wallet.rootId");
        }
    }

    public static final class SharedElementCallback extends cGO {
        public SharedElementCallback() {
            super(22, 23);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE `MPCInfo` ADD COLUMN `displayAccountName` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths,JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, JoindCoin.walletId AS coinWalletId, JoindCoin.coinIds AS coinIds, JoindCoin.amounts AS amounts, JoindCoin.amountInts AS amountInts, JoindCoin.ccyAmounts AS ccyAmounts, JoindCoin.dailyChanges AS coinDailyChanges, JoindCoin.orderValues AS orderValues, CloseCoin.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, OpenCoin.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN JoindCoin ON wallet.id = JoindCoin.walletId LEFT JOIN CloseCoin ON wallet.id = CloseCoin.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN OpenCoin ON wallet.id = OpenCoin.walletId");
        }
    }

    public static final class AssistContent extends cGO {
        public AssistContent() {
            super(23, 24);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `coin_asset` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, `amount` TEXT NOT NULL, `amountInt` TEXT NOT NULL, `ccyAmount` TEXT NOT NULL, `dailyChange` TEXT NOT NULL, `orderValue` INTEGER NOT NULL, `address` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`walletId`, `coinId`, `address`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("INSERT INTO coin_asset(walletId,coinId,amount,amountInt,ccyAmount,dailyChange,orderValue) SELECT walletId,coinId,amount,amountInt,ccyAmount,dailyChange,orderValue FROM coin");
            supportSQLiteDatabase.execSQL("DROP TABLE coin");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindCoin`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues FROM (SELECT * FROM coin_asset) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OpenCoin`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `opened_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM opened_coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `CloseCoin`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `closed_coin_view` AS SELECT walletId, group_concat(coinId, ',') AS coinIds FROM (SELECT * FROM closed_coin) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName,MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
        }
    }

    public static final class ComponentName extends cGO {
        public ComponentName() {
            super(24, 25);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoindChainAddress`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address ADD COLUMN `proxyAddress` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE chain_address ADD COLUMN `eoaAddress` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `eoaWalletType` INTEGER NOT NULL DEFAULT 7");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `aaWalletStatus` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MPCInfoTemp` (`walletId` TEXT NOT NULL, `mpcId` TEXT NOT NULL, `uid` TEXT NOT NULL, `status` INTEGER NOT NULL DEFAULT 0, `version` TEXT NOT NULL, `accountName` TEXT NOT NULL, `displayAccountName` TEXT NOT NULL, `encryptShareKey` TEXT NOT NULL, `ecdsaPubkey` TEXT NOT NULL, `ecdsaChainCode` TEXT NOT NULL, `ed25519Pubkey` TEXT NOT NULL, `ed25519ChainCode` TEXT NOT NULL, `isEscape` INTEGER NOT NULL DEFAULT 0, `mpcCreateAt` INTEGER NOT NULL DEFAULT 0, `createType` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`walletId`, `uid`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("INSERT INTO MPCInfoTemp (walletId,mpcId,uid,status,version,accountName,displayAccountName,encryptShareKey,ecdsaPubkey,ecdsaChainCode,ed25519Pubkey,ed25519ChainCode,isEscape,mpcCreateAt,createType) select  walletId, mpcId, uid, status, version, accountName, displayAccountName, encryptShareKey, ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, isEscape, mpcCreateAt, createType  from MPCInfo");
            supportSQLiteDatabase.execSQL("DROP TABLE MPCInfo");
            supportSQLiteDatabase.execSQL("ALTER TABLE MPCInfoTemp RENAME TO MPCInfo");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoindChainAddress` AS SELECT walletId, group_concat(chainId, ',') AS chainIds, group_concat(addressType, ',') AS addressTypes, group_concat(address, ',') AS addresses, group_concat(publicKey, ',') AS publicKeys, group_concat(derivePath, ',') AS derivePaths, group_concat(proxyAddress, ',') AS proxyAddresses , group_concat(eoaAddress, ',') AS eoaAddresses FROM (SELECT * FROM chain_address) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName,MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs,JoindChainAddress.addressTypes AS chainAddrTypes,JoindChainAddress.publicKeys AS chainAddressPublicKeys,JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses,JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId,JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds,JoinedChainSegWitAddress.addresses AS chainSegWitAddresses,JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, (CASE WHEN wallet.type IS 7 THEN wallet.eoaWalletType ELSE wallet.type END) AS type, sortIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId GROUP BY root_wallet.rootId");
        }
    }

    public static final class ClipData extends cGO {
        public ClipData() {
            super(25, 26);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_meta` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `chain_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `from_custom` INTEGER NOT NULL, `rpc_url` TEXT NOT NULL, `faucet_url` TEXT NOT NULL, `explorer_url` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_coin_meta` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `coin_id` INTEGER NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL,  `contract_address` TEXT NOT NULL, `base_coin_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `decimal_num` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`, `coin_id`), FOREIGN KEY(`chain_id`) REFERENCES `custom_chain_meta`(`chain_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_custom_chain_coin_meta_coin_id` ON `custom_chain_coin_meta` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_wallet_coin` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_wallet_coin_coin_id` ON `custom_chain_wallet_coin` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_address` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `address` TEXT NOT NULL, `public_key` TEXT NOT NULL, `derive_path` TEXT NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_address_coin_id` ON `custom_chain_address` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_coin_balance` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `amount` TEXT NOT NULL, `ccy_amount` TEXT NOT NULL, `order_value` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_coin_balance_coin_id` ON `custom_chain_coin_balance` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_transaction` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `tx_hash` TEXT NOT NULL, `tx_id` TEXT NOT NULL, `origin_tx_hash` TEXT NOT NULL, `sub_tx_hashes` TEXT NOT NULL, `chain_id` INTEGER NOT NULL, `tx_type` INTEGER NOT NULL, `repeat_tx_type` INTEGER NOT NULL, `tx_status` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `nonce` INTEGER NOT NULL, `gas_price` TEXT NOT NULL, `gas_limit` TEXT NOT NULL, `coin_amount` TEXT NOT NULL, `input_data` TEXT NOT NULL, `raw_tx` TEXT NOT NULL, `fail_reason` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `confirm_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`, `tx_hash`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_transaction_coin_id` ON `custom_chain_transaction` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_address` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(address, ',') AS addresses, group_concat(public_key, ',') AS public_keys, group_concat(derive_path, ',') AS derive_paths FROM custom_chain_address GROUP BY wallet_id");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_coin_meta` AS SELECT chain.chain_id, chain.real_chain_id, chain.chain_name, chain.icon_url, chain.from_custom, chain.rpc_url, chain.faucet_url, chain.explorer_url, chain.create_at, chain.update_at, group_concat(coin.coin_id, ',') AS coin_ids, group_concat(coin.symbol, ',') AS symbols, group_concat(coin.name, ',') AS names, group_concat(coin.icon_url, ',') AS icon_urls, group_concat(coin.contract_address, ',') AS contract_addresses, group_concat(coin.base_coin_id, ',') AS base_coin_ids, group_concat(coin.coin_type, ',') AS coin_types, group_concat(coin.decimal_num, ',') AS decimal_nums, group_concat(coin.create_at, ',') AS create_ats FROM custom_chain_meta AS chain LEFT JOIN custom_chain_coin_meta AS coin ON chain.chain_id = coin.chain_id GROUP BY chain.chain_id");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_wallet_coin` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(create_at, ',') AS create_ats FROM custom_chain_wallet_coin GROUP BY wallet_id");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_coin_balance` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(amount, ',') AS amounts, group_concat(ccy_amount, ',') AS ccy_amounts, group_concat(order_value, ',') AS order_values, group_concat(create_at, ',') AS create_ats FROM custom_chain_coin_balance GROUP BY wallet_id");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
        }
    }

    public static final class ComponentCallbacks extends cGO {
        public ComponentCallbacks() {
            super(26, 27);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE root_wallet ADD COLUMN `createIndex` INTEGER NOT NULL DEFAULT -1");
            supportSQLiteDatabase.execSQL("ALTER TABLE hardware_info ADD COLUMN `hardwarePassphraseId` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE hardware_info ADD COLUMN `data` TEXT");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, (CASE WHEN wallet.type IS 7 THEN wallet.eoaWalletType ELSE wallet.type END) AS type, sortIndex, createIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwarePassphraseId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt, hardware_info.data as hardwareData FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId GROUP BY root_wallet.rootId");
        }
    }

    public static final class ComponentCallbacks2 extends cGO {
        public ComponentCallbacks2() {
            super(27, 28);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `voucherToken` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `joined_coin_asset`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens FROM (SELECT * FROM coin_asset) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
        }
    }

    public static final class BroadcastReceiver extends cGO {
        public BroadcastReceiver() {
            super(28, 29);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_meta_status` (`chain_id` INTEGER NOT NULL, `used` INTEGER NOT NULL, PRIMARY KEY(`chain_id`))");
        }
    }

    public static final class ContentResolver extends cGO {
        public ContentResolver() {
            super(29, 30);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `iHuaweiBackup` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
        }
    }

    public static final class ContextWrapper extends cGO {
        public ContextWrapper() {
            super(30, 31);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet ADD COLUMN `createVersion` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId");
        }
    }

    public static final class DialogInterface extends cGO {
        public DialogInterface() {
            super(31, 32);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `walletRepair` (`walletId` TEXT NOT NULL, `identifierType` INTEGER NOT NULL DEFAULT 0, `status` INTEGER NOT NULL DEFAULT 0, `reserved` TEXT NOT NULL DEFAULT '', `extJson` TEXT NOT NULL DEFAULT '', `timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`walletId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `WalletRepairView` AS SELECT walletId, group_concat(walletRepair.identifierType) as identifierType, group_concat(walletRepair.status) as repairStatus, group_concat(walletRepair.reserved) as repairReserved, group_concat(walletRepair.extJson) as repairExtJson, group_concat(walletRepair.timestamp) as repairTimestamp from walletRepair group by walletId");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, MPCInfo.walletId AS mpcWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN MPCInfo ON wallet.id == MPCInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId");
        }
    }

    public static final class Context extends cGO {
        public Context() {
            super(32, 33);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `OKRootWallet`");
            supportSQLiteDatabase.execSQL("ALTER TABLE MPCInfo ADD COLUMN `copiedEscapeListString` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MPCInfoTemp` (`rootWalletId` TEXT NOT NULL, `mpcId` TEXT NOT NULL, `uid` TEXT NOT NULL, `status` INTEGER NOT NULL DEFAULT 0, `version` TEXT NOT NULL, `accountName` TEXT NOT NULL, `displayAccountName` TEXT NOT NULL, `encryptShareKey` TEXT NOT NULL, `ecdsaPubkey` TEXT NOT NULL, `ecdsaChainCode` TEXT NOT NULL, `ed25519Pubkey` TEXT NOT NULL, `ed25519ChainCode` TEXT NOT NULL, `isEscape` INTEGER NOT NULL DEFAULT 0, `mpcCreateAt` INTEGER NOT NULL DEFAULT 0, `createType` INTEGER NOT NULL DEFAULT 0, `copiedEscapeListString` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`rootWalletId`, `uid`), FOREIGN KEY(`rootWalletId`) REFERENCES `root_wallet`(`rootId`) ON UPDATE NO ACTION ON DELETE CASCADE)");
            supportSQLiteDatabase.execSQL("INSERT INTO MPCInfoTemp (rootWalletId, mpcId, uid, status, version, accountName, displayAccountName, encryptShareKey, ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, isEscape, mpcCreateAt, createType, copiedEscapeListString) select  walletId, mpcId, uid, status, version, accountName, displayAccountName, encryptShareKey, ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, isEscape, mpcCreateAt, createType, copiedEscapeListString FROM MPCInfo");
            supportSQLiteDatabase.execSQL("DROP TABLE MPCInfo");
            supportSQLiteDatabase.execSQL("ALTER TABLE MPCInfoTemp RENAME TO MPCInfo");
            supportSQLiteDatabase.execSQL("CREATE VIEW IF NOT EXISTS `OKRootWallet` AS SELECT root_wallet.rootId as rootWalletId, group_concat(id, ',') AS walletIds, root_wallet.name as name, (CASE WHEN wallet.type IS 7 THEN wallet.eoaWalletType ELSE wallet.type END) AS type, sortIndex, createIndex, root_wallet.createAt as createAt, hardwareUniqueId, hardwarePassphraseId, hardwareName, hardwareType, hardwareSystem, hardware_info.createAt as hardwareCreateAt, hardware_info.data as hardwareData, MPCInfo.rootWalletId AS mpcRootWalletId, MPCInfo.mpcId AS mpcId, MPCInfo.uid AS uid, MPCInfo.status AS status, MPCInfo.version AS version, MPCInfo.accountName AS accountName, MPCInfo.displayAccountName AS displayAccountName, MPCInfo.encryptShareKey AS encryptShareKey, MPCInfo.ecdsaPubkey AS ecdsaPubkey, MPCInfo.ecdsaChainCode AS ecdsaChainCode, MPCInfo.ed25519Pubkey AS ed25519Pubkey, MPCInfo.ed25519ChainCode AS ed25519ChainCode, MPCInfo.isEscape AS isEscape, MPCInfo.mpcCreateAt AS mpcCreateAt, MPCInfo.createType AS createType, MPCInfo.copiedEscapeListString AS copiedEscapeListString FROM root_wallet LEFT JOIN wallet ON root_wallet.rootId = wallet.rootWalletId LEFT JOIN hardware_info on wallet.rootWalletId = hardware_info.rootWalletId LEFT JOIN MPCInfo ON wallet.rootWalletId == MPCInfo.rootWalletId GROUP BY root_wallet.rootId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId");
        }
    }

    public static final class SharedPreferences extends cGO {
        public SharedPreferences() {
            super(33, 34);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Object obj;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            android.database.Cursor cursorQuery = supportSQLiteDatabase.query("select * from custom_chain_meta");
            if (cursorQuery.moveToFirst()) {
                HashMap map = new HashMap();
                do {
                    int columnIndex = cursorQuery.getColumnIndex("chain_id");
                    int columnIndex2 = cursorQuery.getColumnIndex("rpc_url");
                    int columnIndex3 = cursorQuery.getColumnIndex("create_at");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                        String string = cursorQuery.getString(columnIndex2);
                        Object arrayList = map.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(string, arrayList);
                        }
                        String string2 = cursorQuery.getString(columnIndex);
                        Intrinsics.checkNotNullExpressionValue(string2, "");
                        Intrinsics.copydefault((Object) string);
                        ((ArrayList) arrayList).add(new C11287cIq(string2, string, cursorQuery.getLong(columnIndex3)));
                    }
                } while (cursorQuery.moveToNext());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = (ArrayList) ((Map.Entry) it.next()).getValue();
                    if (arrayList2.size() > 1) {
                        Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                long jOLrzqt = ((C11287cIq) next).OLrzqt();
                                do {
                                    Object next2 = it2.next();
                                    long jOLrzqt2 = ((C11287cIq) next2).OLrzqt();
                                    if (jOLrzqt > jOLrzqt2) {
                                        next = next2;
                                        jOLrzqt = jOLrzqt2;
                                    }
                                } while (it2.hasNext());
                            }
                            obj = next;
                        } else {
                            obj = null;
                        }
                        C11287cIq c11287cIq = (C11287cIq) obj;
                        if (c11287cIq == null) {
                            return;
                        } else {
                            supportSQLiteDatabase.delete("custom_chain_meta", "chain_id = ? and rpc_url = ?", new String[]{c11287cIq.KWHzl(), c11287cIq.AEQbTJ()});
                        }
                    }
                }
            }
            cursorQuery.close();
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `view_custom_chain_coin_meta`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `view_custom_chain_wallet_coin`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_meta_temp` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `chain_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `from_custom` INTEGER NOT NULL, `rpc_url` TEXT NOT NULL, `faucet_url` TEXT NOT NULL, `explorer_url` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`,`rpc_url`))");
            supportSQLiteDatabase.execSQL("INSERT INTO custom_chain_meta_temp (chain_id, real_chain_id, chain_name, icon_url, from_custom, rpc_url,faucet_url,explorer_url,create_at,update_at) select  chain_id, real_chain_id, chain_name, icon_url, from_custom, rpc_url,faucet_url,explorer_url,create_at,update_at FROM custom_chain_meta");
            supportSQLiteDatabase.execSQL("DROP TABLE custom_chain_meta");
            supportSQLiteDatabase.execSQL("ALTER TABLE custom_chain_meta_temp RENAME TO custom_chain_meta");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_custom_chain_meta_rpc_url` ON `custom_chain_meta` (`rpc_url`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_coin_meta_temp` (`chain_id` INTEGER NOT NULL, `real_chain_id` INTEGER NOT NULL, `coin_id` INTEGER NOT NULL, `symbol` TEXT NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL,  `contract_address` TEXT NOT NULL, `base_coin_id` INTEGER NOT NULL, `coin_type` INTEGER NOT NULL, `decimal_num` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`chain_id`, `coin_id`))");
            supportSQLiteDatabase.execSQL("INSERT INTO custom_chain_coin_meta_temp (chain_id, real_chain_id, coin_id, symbol, name, icon_url, contract_address, base_coin_id, coin_type, decimal_num, create_at) select  chain_id, real_chain_id, coin_id, symbol, name, icon_url, contract_address, base_coin_id, coin_type, decimal_num, create_at FROM custom_chain_coin_meta");
            supportSQLiteDatabase.execSQL("DROP TABLE custom_chain_coin_meta");
            supportSQLiteDatabase.execSQL("ALTER TABLE custom_chain_coin_meta_temp RENAME TO custom_chain_coin_meta");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_custom_chain_coin_meta_coin_id` ON `custom_chain_coin_meta` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_wallet_coin_temp` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
            supportSQLiteDatabase.execSQL("INSERT INTO custom_chain_wallet_coin_temp (wallet_id, coin_id, create_at) select  wallet_id, coin_id ,create_at  FROM custom_chain_wallet_coin");
            supportSQLiteDatabase.execSQL("DROP TABLE custom_chain_wallet_coin");
            supportSQLiteDatabase.execSQL("ALTER TABLE custom_chain_wallet_coin_temp RENAME TO custom_chain_wallet_coin");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_wallet_coin_coin_id` ON `custom_chain_wallet_coin` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_chain_transaction_temp` (`wallet_id` TEXT NOT NULL, `coin_id` INTEGER NOT NULL, `tx_hash` TEXT NOT NULL, `tx_id` TEXT NOT NULL, `origin_tx_hash` TEXT NOT NULL, `sub_tx_hashes` TEXT NOT NULL, `chain_id` INTEGER NOT NULL, `tx_type` INTEGER NOT NULL, `repeat_tx_type` INTEGER NOT NULL, `tx_status` INTEGER NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `nonce` INTEGER NOT NULL, `gas_price` TEXT NOT NULL, `gas_limit` TEXT NOT NULL, `coin_amount` TEXT NOT NULL, `input_data` TEXT NOT NULL, `raw_tx` TEXT NOT NULL, `fail_reason` TEXT NOT NULL, `create_at` INTEGER NOT NULL, `confirm_at` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `coin_id`, `tx_hash`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`coin_id`) REFERENCES `custom_chain_coin_meta`(`coin_id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
            supportSQLiteDatabase.execSQL("INSERT INTO custom_chain_transaction_temp (wallet_id, coin_id, tx_hash ,tx_id ,origin_tx_hash ,sub_tx_hashes ,chain_id ,tx_type ,repeat_tx_type ,tx_status, `from`,`to` ,`nonce`,`gas_price` , `gas_limit` , `coin_amount` , `input_data` , `raw_tx` , `fail_reason` , `create_at` , `confirm_at`) select  wallet_id, coin_id, tx_hash ,tx_id ,origin_tx_hash ,sub_tx_hashes ,chain_id ,tx_type ,repeat_tx_type ,tx_status, `from`,`to` ,`nonce`,`gas_price` , `gas_limit` , `coin_amount` , `input_data` , `raw_tx` , `fail_reason` , `create_at` , `confirm_at`  FROM custom_chain_transaction");
            supportSQLiteDatabase.execSQL("DROP TABLE custom_chain_transaction");
            supportSQLiteDatabase.execSQL("ALTER TABLE custom_chain_transaction_temp RENAME TO custom_chain_transaction");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_custom_chain_transaction_coin_id` ON `custom_chain_transaction` (`coin_id`)");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_coin_meta` AS SELECT chain.chain_id, chain.real_chain_id, chain.chain_name, chain.icon_url, chain.from_custom, chain.rpc_url, chain.faucet_url, chain.explorer_url, chain.create_at, chain.update_at, group_concat(coin.coin_id, ',') AS coin_ids, group_concat(coin.symbol, ',') AS symbols, group_concat(coin.name, ',') AS names, group_concat(coin.icon_url, ',') AS icon_urls, group_concat(coin.contract_address, ',') AS contract_addresses, group_concat(coin.base_coin_id, ',') AS base_coin_ids, group_concat(coin.coin_type, ',') AS coin_types, group_concat(coin.decimal_num, ',') AS decimal_nums, group_concat(coin.create_at, ',') AS create_ats FROM custom_chain_meta AS chain LEFT JOIN custom_chain_coin_meta AS coin ON chain.chain_id = coin.chain_id GROUP BY chain.rpc_url");
            supportSQLiteDatabase.execSQL("CREATE VIEW `view_custom_chain_wallet_coin` AS SELECT wallet_id, group_concat(coin_id, ',') AS coin_ids, group_concat(create_at, ',') AS create_ats FROM custom_chain_wallet_coin GROUP BY wallet_id");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId");
        }
    }

    public static final class IntentSender extends cGO {
        public IntentSender() {
            super(34, 35);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `custom_fee` (`chain_id` INTEGER NOT NULL, `gas_price` TEXT NOT NULL, `base_fee` TEXT NOT NULL, `priority_fee` TEXT NOT NULL, PRIMARY KEY(`chain_id`))");
        }
    }

    public static final class ApplicationInfo extends cGO {
        public ApplicationInfo() {
            super(35, 36);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wallet_sign_data` (`wallet_id` TEXT NOT NULL, `op_type` INTEGER NOT NULL, `sync_type` INTEGER NOT NULL, `address_type` INTEGER NOT NULL, `chain_index` INTEGER NOT NULL, `chain_sign` TEXT NOT NULL, `base_chain_index` INTEGER, `base_chain_sign` TEXT, PRIMARY KEY(`wallet_id`, `op_type`, `sync_type`, `address_type`, `chain_index`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        }
    }

    public static final class IntentFilter extends cGO {
        public IntentFilter() {
            super(36, 37);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `selected_fee` (`chain_id` INTEGER NOT NULL, `selected_fee_type` INTEGER NOT NULL, PRIMARY KEY(`chain_id`))");
        }
    }

    public static final class ServiceConnection extends cGO {
        public ServiceConnection() {
            super(37, 38);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `selected_fee`");
        }
    }

    public static final class AssetManager extends cGO {
        public AssetManager() {
            super(38, 39);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `total_asset` (`walletId` TEXT NOT NULL, `tokenAsset` TEXT NOT NULL, `tokenAssetFilterSmall` TEXT NOT NULL, `nftAsset` TEXT NOT NULL, `defiAsset` TEXT NOT NULL, `updateTime` TEXT NOT NULL, PRIMARY KEY(`walletId`), FOREIGN KEY(`walletId`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId");
        }
    }

    public static final class ColorStateList extends cGO {
        public ColorStateList() {
            super(39, 40);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `eip_7702_info` (`wallet_id` TEXT NOT NULL, `chain_index` INTEGER NOT NULL, `upgrade_status` INTEGER NOT NULL, PRIMARY KEY(`wallet_id`, `chain_index`), FOREIGN KEY(`wallet_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        }
    }

    public static final class Configuration extends cGO {
        public Configuration() {
            super(40, 41);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wallet_tee` ( `account_id` TEXT NOT NULL, `tee_id` TEXT NOT NULL, `is_created` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, `expired_timestamp` INTEGER NOT NULL, `is_verify` INTEGER NOT NULL, `has_show_expired_alert` INTEGER NOT NULL, `is_disabled_by_user` INTEGER NOT NULL, `create_at` INTEGER NOT NULL, `update_at` INTEGER NOT NULL, PRIMARY KEY(`account_id`), FOREIGN KEY(`account_id`) REFERENCES `wallet`(`id`) ON DELETE CASCADE);");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
        }
    }

    public static final class PackageManager extends cGO {
        public PackageManager() {
            super(41, 42);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE dapp_search_history ADD COLUMN `timestamp` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static final class DatabaseErrorHandler extends cGO {
        public DatabaseErrorHandler() {
            super(42, 43);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `joined_coin_asset`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `platformName` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `walletInvestmentType` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens, group_concat(platformName, ',') AS platformNames, group_concat(walletInvestmentType, ',') AS walletInvestmentTypes FROM (SELECT * FROM coin_asset) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
        }
    }

    public static final class Theme extends cGO {
        public Theme() {
            super(43, 44);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `wallet_jwt_info` (`account_id` TEXT NOT NULL, `enc_jwt` TEXT NOT NULL, PRIMARY KEY(`account_id`), FOREIGN KEY(`account_id`) REFERENCES `wallet`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet_tee ADD COLUMN model INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet_tee ADD COLUMN canUseSa2 INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("UPDATE wallet_tee \nSET model = \n    CASE \n        WHEN is_created = 1 AND is_active = 1 THEN 3 \n        ELSE 0 \n    END");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `joined_coin_asset`");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `unPnl` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `unPnlYield` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens, group_concat(unPnl, ',') AS unPnls, group_concat(unPnlYield, ',') AS unPnlYields, group_concat(platformName, ',') AS platformNames, group_concat(walletInvestmentType, ',') AS walletInvestmentTypes FROM (SELECT * FROM coin_asset) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.unPnls AS unPnls, joined_coin_asset.unPnlYields AS unPnlYields, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt, wallet_tee.model as model, wallet_tee.canUseSa2 as canUseSa2 from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
        }
    }

    public static final class Cursor extends cGO {
        public Cursor() {
            super(44, 45);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `spotBalance` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_asset ADD COLUMN `holdAvgPrice` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `joined_coin_asset`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `joined_coin_asset` AS SELECT walletId, group_concat(coinId, ',') AS coinIds, group_concat(address, ',') AS addresses, group_concat(amount, ',') AS amounts, group_concat(amountInt, ',') AS amountInts, group_concat(ccyAmount, ',') AS ccyAmounts, group_concat(dailyChange, ',') AS dailyChanges, group_concat(orderValue, ',') AS orderValues, group_concat(voucherToken, ',') AS voucherTokens, group_concat(unPnl, ',') AS unPnls, group_concat(unPnlYield, ',') AS unPnlYields, group_concat(platformName, ',') AS platformNames, group_concat(walletInvestmentType, ',') AS walletInvestmentTypes, group_concat(spotBalance, ',') AS spotBalances, group_concat(holdAvgPrice, ',') AS holdAvgPrices FROM (SELECT * FROM coin_asset) GROUP BY walletId");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.unPnls AS unPnls, joined_coin_asset.unPnlYields AS unPnlYields, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, joined_coin_asset.spotBalances AS spotBalances, joined_coin_asset.holdAvgPrices AS holdAvgPrices, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt, wallet_tee.model as model, wallet_tee.canUseSa2 as canUseSa2 from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
        }
    }

    public static final class Resources extends cGO {
        public Resources() {
            super(45, 46);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet_tee ADD COLUMN `auto_renew` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE wallet_tee ADD COLUMN `upgrade_status` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `WalletView`");
            supportSQLiteDatabase.execSQL("CREATE VIEW `WalletView` AS SELECT id, type, data, chainId, language, name, modifiedName, backup, cloudBackup, iHuaweiBackup, main, xpub, isSegWit, xpriv, fromCreate, createAt, orderValue, addressIndex, rootWalletId, syncStatus, completedSyncOperation, syncOperation, eoaWalletType, aaWalletStatus, createVersion, EOSInfo.walletId AS EOSWalletId, EOSInfo.accountName AS eosAccountName, EOSInfo.activeKey AS eosActiveKey, EOSInfo.ownerKey AS EOSOwnerKey, EOSInfo.pubKey AS EOSPubKey, EOSInfo.shouldBeDeleted AS EOSShouldBeDeleted, EOSInfo.state AS EOSState, JoindChainAddress.walletId AS chainAddrWalletId, JoindChainAddress.chainIds AS chainIds, JoindChainAddress.addresses AS chainAddrs, JoindChainAddress.addressTypes AS chainAddrTypes, JoindChainAddress.publicKeys AS chainAddressPublicKeys, JoindChainAddress.derivePaths AS chainAddsDerivePaths, JoindChainAddress.eoaAddresses AS chainAddsEoaAddresses, JoindChainAddress.proxyAddresses AS chainAddsProxyAddresses, JoinedChainSegWitAddress.walletId AS chainSegWitWalletId, JoinedChainSegWitAddress.chainIds AS chainSegWitChainIds, JoinedChainSegWitAddress.addresses AS chainSegWitAddresses, JoinedChainSegWitAddress.addressTypes AS chainSegWitAddTypes, JoinedChainSegWitAddress.publicKeys as chainSegWitAddressPublicKeys, JoinedChainSegWitAddress.derivePaths as chainSegWitAddressDerivePaths, view_custom_chain_address.coin_ids AS customChainIds, view_custom_chain_address.addresses AS customChainAddrs, view_custom_chain_address.public_keys AS customChainAddressPublicKeys, view_custom_chain_address.derive_paths AS customChainAddsDerivePaths, joined_coin_asset.walletId AS coinWalletId, joined_coin_asset.coinIds AS coinIds, joined_coin_asset.addresses AS coinAddresses, joined_coin_asset.amounts AS amounts, joined_coin_asset.amountInts AS amountInts, joined_coin_asset.ccyAmounts AS ccyAmounts, joined_coin_asset.dailyChanges AS coinDailyChanges, joined_coin_asset.orderValues AS orderValues, joined_coin_asset.voucherTokens AS voucherTokens, joined_coin_asset.unPnls AS unPnls, joined_coin_asset.unPnlYields AS unPnlYields, joined_coin_asset.platformNames AS platformNames, joined_coin_asset.walletInvestmentTypes AS walletInvestmentTypes, joined_coin_asset.spotBalances AS spotBalances, joined_coin_asset.holdAvgPrices AS holdAvgPrices, closed_coin_view.coinIds AS closedCoinIds, JoindSepInfos.walletId AS sepInfoWalletId, JoindSepInfos.coinIds AS sepCoinIds, JoindSepInfos.states AS sepStates, JoinedDefi.assetIds AS defiAssetIds, JoinedDefi.beans AS defiBeans, JoinedNft.assetIds AS nftAssetIds, JoinedNft.beans AS nftBeans, total_asset.tokenAsset AS tokenAsset, total_asset.tokenAssetFilterSmall AS tokenAssetFilterSmall, total_asset.nftAsset AS nftAsset, total_asset.defiAsset AS defiAsset, total_asset.updateTime AS totalAssetUpdateTime, opened_coin_view.coinIds AS openedCoinIds, WalletRepairView.walletId AS repairWalletId, WalletRepairView.identifierType AS identifierType, WalletRepairView.repairStatus AS repairStatus, WalletRepairView.repairReserved AS repairReserved, WalletRepairView.repairExtJson AS repairExtJson, WalletRepairView.repairTimestamp AS repairTimestamp, view_custom_chain_coin_balance.coin_ids AS customCoinIds, view_custom_chain_coin_balance.amounts AS customCoinAmounts, view_custom_chain_coin_balance.ccy_amounts AS customCoinCcyAmounts, view_custom_chain_coin_balance.order_values AS customCoinOrderValues, view_custom_chain_coin_balance.create_ats AS customCoinCreateAts,view_custom_chain_wallet_coin.coin_ids AS customWalletCoinIds, view_custom_chain_wallet_coin.create_ats AS customWalletCoinCreateAts, wallet_tee.is_created AS isTeeCreated, wallet_tee.is_active AS isTeeActive, wallet_tee.expired_timestamp AS teeExpiredTimestamp, wallet_tee.is_verify AS isTeeVerify, wallet_tee.has_show_expired_alert AS hasShowTeeExpiredAlert, wallet_tee.tee_id AS teeId, wallet_tee.create_at as teeCreateAt, wallet_tee.update_at as teeUpdateAt, wallet_tee.model as model, wallet_tee.canUseSa2 as canUseSa2, wallet_tee.auto_renew as autoRenew, wallet_tee.upgrade_status as upgradeStatus from wallet LEFT JOIN JoindChainAddress ON wallet.id = JoindChainAddress.walletId LEFT JOIN JoinedChainSegWitAddress ON wallet.id = JoinedChainSegWitAddress.walletId LEFT JOIN view_custom_chain_address ON wallet.id = view_custom_chain_address.wallet_id LEFT JOIN view_custom_chain_coin_balance ON wallet.id = view_custom_chain_coin_balance.wallet_id LEFT JOIN view_custom_chain_wallet_coin ON wallet.id = view_custom_chain_wallet_coin.wallet_id LEFT JOIN joined_coin_asset ON wallet.id = joined_coin_asset.walletId LEFT JOIN closed_coin_view ON wallet.id = closed_coin_view.walletId LEFT JOIN JoindSepInfos ON wallet.id == JoindSepInfos.walletId LEFT JOIN EOSInfo ON wallet.id == EOSInfo.walletId LEFT JOIN JoinedDefi ON wallet.id == JoinedDefi.walletId LEFT JOIN JoinedNft ON wallet.id == JoinedNft.walletId LEFT JOIN opened_coin_view ON wallet.id = opened_coin_view.walletId LEFT JOIN total_asset ON wallet.id = total_asset.walletId LEFT JOIN WalletRepairView ON wallet.id == WalletRepairView.walletId LEFT JOIN wallet_tee ON wallet.id = wallet_tee.account_id");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `dapp_search_history_new` (\n    `id` TEXT NOT NULL,\n    `balance` TEXT NOT NULL,\n    `category` INTEGER NOT NULL,\n    `deepLink` TEXT NOT NULL,\n    `logo` TEXT NOT NULL,\n    `user` TEXT NOT NULL,\n    `volume` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `shortDescribe` TEXT NOT NULL,\n    `timestamp` INTEGER NOT NULL,\n    `type` INTEGER NOT NULL DEFAULT 0,\n    PRIMARY KEY(`deepLink`, `type`)\n)");
            supportSQLiteDatabase.execSQL("INSERT INTO `dapp_search_history_new` \n(`id`, `balance`, `category`, `deepLink`, `logo`, `user`, `volume`, `name`, `shortDescribe`, `timestamp`, `type`)\nSELECT `id`, `balance`, `category`, `deepLink`, `logo`, `user`, `volume`, `name`, `shortDescribe`, `timestamp`, 0\nFROM `dapp_search_history`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `dapp_search_history`");
            supportSQLiteDatabase.execSQL("ALTER TABLE `dapp_search_history_new` RENAME TO `dapp_search_history`");
        }
    }
}
