package com.okinc.business.defi.biz.database.extra;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.okinc.business.defi.biz.database.extra.dao.PasswordKeyDao;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13458dMb;
import o.InterfaceC11262cHs;
import o.InterfaceC11269cHz;
import o.cGO;
import o.cHP;
import o.cHZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ExtraDatabase extends RoomDatabase {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final FragmentManager AEQbTJ = new FragmentManager();
    public static final PendingIntent gEmmrt = new PendingIntent();
    public static final Fragment valueOf = new Fragment();
    public static final Dialog AYXKKw = new Dialog();
    public static final LoaderManager AhwBna = new LoaderManager();
    public static final PictureInPictureParams djBIcL = new PictureInPictureParams();
    public static final SharedElementCallback isConnected = new SharedElementCallback();
    public static final VoiceInteractor values = new VoiceInteractor();
    public static final AssistContent AkhnZx = new AssistContent();
    public static final ActionBar EZpvd = new ActionBar();
    public static final StateListAnimator KWHzl = new StateListAnimator();
    public static final Activity OLrzqt = new Activity();
    public static final Application copydefault = new Application();

    public abstract PasswordKeyDao ejfBZ();

    public abstract cHZ fARcdN();

    public abstract cHP fIwbmz();

    public abstract InterfaceC11262cHs fetchVPNInfo();

    public abstract InterfaceC11269cHz values();

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.database.extra.ExtraDatabase.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ExtraDatabase AEQbTJ(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).valueOf();
        }

        public final ExtraDatabase OLrzqt(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            return (ExtraDatabase) Room.databaseBuilder(applicationContext, ExtraDatabase.class, "walletExtra.db").addMigrations(ExtraDatabase.AEQbTJ, ExtraDatabase.gEmmrt, ExtraDatabase.valueOf, ExtraDatabase.AYXKKw, ExtraDatabase.AhwBna, ExtraDatabase.djBIcL, ExtraDatabase.isConnected, ExtraDatabase.values, ExtraDatabase.AkhnZx, ExtraDatabase.EZpvd, ExtraDatabase.KWHzl, ExtraDatabase.OLrzqt, ExtraDatabase.copydefault).build();
        }
    }

    public static final class FragmentManager extends cGO {
        public FragmentManager() {
            super(1, 2);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `coin_meta` (`coinId` INTEGER NOT NULL, `baseCoinId` INTEGER NOT NULL, `chainId` INTEGER NOT NULL, `realChainId` INTEGER NOT NULL, `name` TEXT NOT NULL, `chainName` TEXT NOT NULL, `symbol` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `address` TEXT NOT NULL, `decimalNum` INTEGER NOT NULL, `vdecimalNum` INTEGER NOT NULL, `orderDecimalNum` INTEGER NOT NULL, `coinType` INTEGER NOT NULL, `tokenType` TEXT NOT NULL, `isDefault` INTEGER NOT NULL, `isVisible` INTEGER NOT NULL, `sort` INTEGER, `isHotNetwork` INTEGER NOT NULL, `hotNetworkRank` INTEGER NOT NULL, `aggregationType` INTEGER NOT NULL, `tokenSort` INTEGER NOT NULL, `supportPush` INTEGER NOT NULL, `supportShowDetail` INTEGER NOT NULL, `explorerUrl` TEXT NOT NULL, `systemToken` INTEGER, `platformType` INTEGER NOT NULL, `currencyId` INTEGER NOT NULL, `cefiSupport` INTEGER NOT NULL, `aaSupport` INTEGER, `supportVersion` INTEGER, `supportFullHistory` INTEGER, `factionType` INTEGER, `cosmosPrefix` TEXT, PRIMARY KEY(`coinId`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_coin_meta_sort` ON `coin_meta` (`sort`)");
        }
    }

    public static final class PendingIntent extends cGO {
        public PendingIntent() {
            super(2, 3);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `protocolId` INTEGER");
        }
    }

    public static final class Fragment extends cGO {
        public Fragment() {
            super(3, 4);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `protocolType` INTEGER");
        }
    }

    public static final class Dialog extends cGO {
        public Dialog() {
            super(4, 5);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `chainImageUrl` TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class LoaderManager extends cGO {
        public LoaderManager() {
            super(5, 6);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `coinCategory` INTEGER NOT NULL DEFAULT 1");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `full_asset_coin_relation` (`walletId` TEXT NOT NULL, `coinId` INTEGER NOT NULL, PRIMARY KEY(`walletId`, `coinId`))");
        }
    }

    public static final class PictureInPictureParams extends cGO {
        public PictureInPictureParams() {
            super(6, 7);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `key_value` (`k` TEXT NOT NULL, `v` TEXT NOT NULL, PRIMARY KEY(`k`))");
        }
    }

    public static final class SharedElementCallback extends cGO {
        public SharedElementCallback() {
            super(7, 8);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `riskType` INTEGER DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `isHighQuality` INTEGER DEFAULT 0");
        }
    }

    public static final class VoiceInteractor extends cGO {
        public VoiceInteractor() {
            super(8, 9);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `support_pnl_chain` (`chainId` INTEGER NOT NULL, `chainName` TEXT NOT NULL, `chainLogo` TEXT NOT NULL, PRIMARY KEY(`chainId`))");
        }
    }

    public static final class AssistContent extends cGO {
        public AssistContent() {
            super(9, 10);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `stableCoin` INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `displayPrecision` INTEGER NOT NULL DEFAULT 6");
        }
    }

    public static final class ActionBar extends cGO {
        public ActionBar() {
            super(10, 11);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `referral_info` (`walletType` TEXT NOT NULL, `walletAddress` TEXT NOT NULL, `encryptedReferralInfo` TEXT NOT NULL, `createdTime` INTEGER NOT NULL, `updatedTime` INTEGER NOT NULL, PRIMARY KEY(`walletType`, `walletAddress`))");
        }
    }

    public static final class StateListAnimator extends cGO {
        public StateListAnimator() {
            super(11, 12);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `supportStableCoinInterest` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static final class Activity extends cGO {
        public Activity() {
            super(12, 13);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE coin_meta ADD COLUMN `chainAddressPrefix` TEXT NOT NULL DEFAULT ''");
        }
    }

    public static final class Application extends cGO {
        public Application() {
            super(13, 14);
        }

        @Override // o.cGO
        public void KWHzl(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE deleted_wallet ADD COLUMN `xpub` TEXT NOT NULL DEFAULT ''");
        }
    }
}
