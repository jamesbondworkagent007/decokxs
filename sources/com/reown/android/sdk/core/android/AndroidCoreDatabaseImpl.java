package com.reown.android.sdk.core.android;

import com.reown.android.sdk.core.AndroidCoreDatabase;
import com.reown.android.sdk.storage.data.dao.EventDao;
import com.reown.android.sdk.storage.data.dao.EventQueries;
import com.reown.android.sdk.storage.data.dao.IdentitiesQueries;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryDao;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries;
import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.MetaDataQueries;
import com.reown.android.sdk.storage.data.dao.PairingQueries;
import com.reown.android.sdk.storage.data.dao.PushMessageQueries;
import com.reown.android.sdk.storage.data.dao.VerifyContext;
import com.reown.android.sdk.storage.data.dao.VerifyContextQueries;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.ColorStateList;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import o.SharedPreferences;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class AndroidCoreDatabaseImpl extends ContentResolver implements AndroidCoreDatabase {
    public final EventQueries eventQueries;
    public final IdentitiesQueries identitiesQueries;
    public final JsonRpcHistoryQueries jsonRpcHistoryQueries;
    public final MetaDataQueries metaDataQueries;
    public final PairingQueries pairingQueries;
    public final PushMessageQueries pushMessageQueries;
    public final VerifyContextQueries verifyContextQueries;
    public final VerifyPublicKeyQueries verifyPublicKeyQueries;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public EventQueries getEventQueries() {
        return this.eventQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public IdentitiesQueries getIdentitiesQueries() {
        return this.identitiesQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public JsonRpcHistoryQueries getJsonRpcHistoryQueries() {
        return this.jsonRpcHistoryQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public MetaDataQueries getMetaDataQueries() {
        return this.metaDataQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public PairingQueries getPairingQueries() {
        return this.pairingQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public PushMessageQueries getPushMessageQueries() {
        return this.pushMessageQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public VerifyContextQueries getVerifyContextQueries() {
        return this.verifyContextQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.sdk.core.AndroidCoreDatabase
    public VerifyPublicKeyQueries getVerifyPublicKeyQueries() {
        return this.verifyPublicKeyQueries;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCoreDatabaseImpl(@NotNull PackageManager packageManager, @NotNull EventDao.Adapter adapter, @NotNull JsonRpcHistoryDao.Adapter adapter2, @NotNull MetaData.Adapter adapter3, @NotNull VerifyContext.Adapter adapter4) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(adapter2, "");
        Intrinsics.checkNotNullParameter(adapter3, "");
        Intrinsics.checkNotNullParameter(adapter4, "");
        this.eventQueries = new EventQueries(packageManager, adapter);
        this.identitiesQueries = new IdentitiesQueries(packageManager);
        this.jsonRpcHistoryQueries = new JsonRpcHistoryQueries(packageManager, adapter2);
        this.metaDataQueries = new MetaDataQueries(packageManager, adapter3);
        this.pairingQueries = new PairingQueries(packageManager, adapter3);
        this.pushMessageQueries = new PushMessageQueries(packageManager);
        this.verifyContextQueries = new VerifyContextQueries(packageManager, adapter4);
        this.verifyPublicKeyQueries = new VerifyPublicKeyQueries(packageManager);
    }

    public static final class Schema implements ColorStateList<IntentSender.Activity<Unit>> {
        public static final Schema INSTANCE = new Schema();

        @Override // o.ColorStateList
        public long getVersion() {
            return 12L;
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender create(PackageManager packageManager) {
            return IntentSender.Activity.EZpvd(m7304create0iQ1z0(packageManager));
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender migrate(PackageManager packageManager, long j, long j2, SharedPreferences[] sharedPreferencesArr) {
            return IntentSender.Activity.EZpvd(m7305migratezeHU3Mk(packageManager, j, j2, sharedPreferencesArr));
        }

        /* JADX INFO: renamed from: create-0iQ1-z0, reason: not valid java name */
        public Object m7304create0iQ1z0(@NotNull PackageManager packageManager) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE EventDao(\n    event_id INTEGER PRIMARY KEY NOT NULL,\n    bundle_id TEXT NOT NULL,\n    timestamp INTEGER NOT NULL,\n    event_name TEXT NOT NULL,\n    type TEXT NOT NULL,\n    topic TEXT,\n    trace TEXT,\n    correlation_id INTEGER,\n    client_id TEXT,\n    direction TEXT,\n    user_agent TEXT\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE Identities (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    identity TEXT UNIQUE NOT NULL,\n    accountId TEXT NOT NULL,\n    cacao_payload TEXT DEFAULT NULL,\n    is_owner INTEGER DEFAULT 0\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT,\n  transport_type TEXT\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE MetaData(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \tnative TEXT,\n  \ttype TEXT NOT NULL,\n    app_link TEXT,\n    link_mode INTEGER,\n  \tUNIQUE(sequence_topic, type)\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE Pairing (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    is_active INTEGER NOT NULL,\n    is_proposal_received INTEGER DEFAULT 1\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PushMessage (\n\tid TEXT PRIMARY KEY NOT NULL,\n\ttopic TEXT NOT NULL,\n  \tblob TEXT NOT NULL,\n  \ttag INTEGER NOT NULL\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE VerifyContext (\n    id INTEGER PRIMARY KEY NOT NULL,\n    origin TEXT NOT NULL,\n    validation TEXT NOT NULL,\n    verify_url TEXT NOT NULL,\n    is_scam INTEGER\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE VerifyPublicKey(\n    key TEXT PRIMARY KEY NOT NULL,\n    expires_at INTEGER NOT NULL\n)", 0, null, 8, null);
            return IntentSender.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: renamed from: migrateInternal-ElmaSbI, reason: not valid java name */
        public final Object m7306migrateInternalElmaSbI(PackageManager packageManager, long j, long j2) {
            if (j <= 1 && j2 > 1) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS StoreValues", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE StoreValues (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    storeId INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    value TEXT NOT NULL,\n    timestamp INTEGER NOT NULL,\n    UNIQUE(storeId, key)\n)", 0, null, 8, null);
            }
            if (j <= 2 && j2 > 2) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE VerifyContext (\n    id INTEGER PRIMARY KEY NOT NULL,\n    origin TEXT NOT NULL,\n    validation TEXT NOT NULL,\n    verify_url TEXT NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 3 && j2 > 3) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE VerifyContext ADD COLUMN is_scam INTEGER", 0, null, 8, null);
            }
            if (j <= 4 && j2 > 4) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS StoreValues", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS Accounts", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS Stores", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE Identities ADD COLUMN cacao_payload TEXT DEFAULT NULL", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE Identities ADD COLUMN is_owner INTEGER DEFAULT 0", 0, null, 8, null);
            }
            if (j <= 5 && j2 > 5) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS Identities", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE Identities (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    identity TEXT UNIQUE NOT NULL,\n    accountId TEXT NOT NULL,\n    cacao_payload TEXT DEFAULT NULL,\n    is_owner INTEGER DEFAULT 0\n)", 0, null, 8, null);
            }
            if (j <= 6 && j2 > 6) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PushMessage (\n\tid TEXT PRIMARY KEY NOT NULL,\n\ttopic TEXT NOT NULL,\n  \tblob TEXT NOT NULL,\n  \ttag INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 7 && j2 > 7) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE Pairing ADD COLUMN is_proposal_received INTEGER DEFAULT 1", 0, null, 8, null);
            }
            if (j <= 8 && j2 > 8) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE EventDao(\n    event_id INTEGER PRIMARY KEY NOT NULL,\n    bundle_id TEXT NOT NULL,\n    timestamp INTEGER NOT NULL,\n    event_name TEXT NOT NULL,\n    type TEXT NOT NULL,\n    topic TEXT,\n    trace TEXT\n)", 0, null, 8, null);
            }
            if (j <= 9 && j2 > 9) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE JsonRpcHistoryDao ADD COLUMN transport_type TEXT", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE MetaData ADD COLUMN app_link TEXT", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE MetaData ADD COLUMN link_mode INTEGER", 0, null, 8, null);
            }
            if (j <= 10 && j2 > 10) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE EventDao ADD COLUMN correlation_id INTEGER", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE EventDao ADD COLUMN client_id TEXT", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE EventDao ADD COLUMN direction TEXT", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE VerifyPublicKey(\n    key TEXT PRIMARY KEY NOT NULL,\n    expires_at INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 11 && j2 > 11) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE EventDao ADD COLUMN user_agent TEXT", 0, null, 8, null);
            }
            return IntentSender.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: renamed from: migrate-zeHU3Mk, reason: not valid java name */
        public Object m7305migratezeHU3Mk(@NotNull PackageManager packageManager, long j, long j2, @NotNull SharedPreferences... sharedPreferencesArr) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            Intrinsics.checkNotNullParameter(sharedPreferencesArr, "");
            ArrayList arrayList = new ArrayList();
            for (SharedPreferences sharedPreferences : sharedPreferencesArr) {
                long jCopydefault = sharedPreferences.copydefault();
                if (j <= jCopydefault && jCopydefault < j2) {
                    arrayList.add(sharedPreferences);
                }
            }
            long jCopydefault2 = j;
            for (SharedPreferences sharedPreferences2 : CollectionsKt___CollectionsKt.EZpvd(arrayList, new Comparator() { // from class: com.reown.android.sdk.core.android.AndroidCoreDatabaseImpl$Schema$migrate-zeHU3Mk$$inlined$sortedBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(Long.valueOf(((SharedPreferences) t).copydefault()), Long.valueOf(((SharedPreferences) t2).copydefault()));
                }
            })) {
                INSTANCE.m7306migrateInternalElmaSbI(packageManager, jCopydefault2, sharedPreferences2.copydefault() + 1);
                sharedPreferences2.KWHzl().invoke(packageManager);
                jCopydefault2 = sharedPreferences2.copydefault() + 1;
            }
            if (jCopydefault2 < j2) {
                m7306migrateInternalElmaSbI(packageManager, jCopydefault2, j2);
            }
            return IntentSender.OLrzqt.AEQbTJ();
        }
    }
}
