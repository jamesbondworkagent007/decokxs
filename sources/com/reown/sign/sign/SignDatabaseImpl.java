package com.reown.sign.sign;

import com.reown.sign.SignDatabase;
import com.reown.sign.storage.data.dao.authenticatereponse.AuthenticateResponseTopicDaoQueries;
import com.reown.sign.storage.data.dao.linkmode.LinkModeDaoQueries;
import com.reown.sign.storage.data.dao.namespace.NamespaceDao;
import com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDao;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.proposal.ProposalDao;
import com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDao;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.session.SessionDao;
import com.reown.sign.storage.data.dao.session.SessionDaoQueries;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDao;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries;
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
public final class SignDatabaseImpl extends ContentResolver implements SignDatabase {
    public final AuthenticateResponseTopicDaoQueries authenticateResponseTopicDaoQueries;
    public final LinkModeDaoQueries linkModeDaoQueries;
    public final NamespaceDaoQueries namespaceDaoQueries;
    public final OptionalNamespaceDaoQueries optionalNamespaceDaoQueries;
    public final ProposalDaoQueries proposalDaoQueries;
    public final ProposalNamespaceDaoQueries proposalNamespaceDaoQueries;
    public final SessionDaoQueries sessionDaoQueries;
    public final TempNamespaceDaoQueries tempNamespaceDaoQueries;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public AuthenticateResponseTopicDaoQueries getAuthenticateResponseTopicDaoQueries() {
        return this.authenticateResponseTopicDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public LinkModeDaoQueries getLinkModeDaoQueries() {
        return this.linkModeDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public NamespaceDaoQueries getNamespaceDaoQueries() {
        return this.namespaceDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public OptionalNamespaceDaoQueries getOptionalNamespaceDaoQueries() {
        return this.optionalNamespaceDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public ProposalDaoQueries getProposalDaoQueries() {
        return this.proposalDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public ProposalNamespaceDaoQueries getProposalNamespaceDaoQueries() {
        return this.proposalNamespaceDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public SessionDaoQueries getSessionDaoQueries() {
        return this.sessionDaoQueries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.SignDatabase
    public TempNamespaceDaoQueries getTempNamespaceDaoQueries() {
        return this.tempNamespaceDaoQueries;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignDatabaseImpl(@NotNull PackageManager packageManager, @NotNull NamespaceDao.Adapter adapter, @NotNull OptionalNamespaceDao.Adapter adapter2, @NotNull ProposalDao.Adapter adapter3, @NotNull ProposalNamespaceDao.Adapter adapter4, @NotNull SessionDao.Adapter adapter5, @NotNull TempNamespaceDao.Adapter adapter6) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(adapter2, "");
        Intrinsics.checkNotNullParameter(adapter3, "");
        Intrinsics.checkNotNullParameter(adapter4, "");
        Intrinsics.checkNotNullParameter(adapter5, "");
        Intrinsics.checkNotNullParameter(adapter6, "");
        this.authenticateResponseTopicDaoQueries = new AuthenticateResponseTopicDaoQueries(packageManager);
        this.linkModeDaoQueries = new LinkModeDaoQueries(packageManager);
        this.namespaceDaoQueries = new NamespaceDaoQueries(packageManager, adapter);
        this.optionalNamespaceDaoQueries = new OptionalNamespaceDaoQueries(packageManager, adapter2);
        this.proposalDaoQueries = new ProposalDaoQueries(packageManager, adapter3);
        this.proposalNamespaceDaoQueries = new ProposalNamespaceDaoQueries(packageManager, adapter4);
        this.sessionDaoQueries = new SessionDaoQueries(packageManager, adapter5);
        this.tempNamespaceDaoQueries = new TempNamespaceDaoQueries(packageManager, adapter6);
    }

    public static final class Schema implements ColorStateList<IntentSender.Activity<Unit>> {
        public static final Schema INSTANCE = new Schema();

        @Override // o.ColorStateList
        public long getVersion() {
            return 11L;
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender create(PackageManager packageManager) {
            return IntentSender.Activity.EZpvd(m7357create0iQ1z0(packageManager));
        }

        @Override // o.ColorStateList
        public /* synthetic */ IntentSender migrate(PackageManager packageManager, long j, long j2, SharedPreferences[] sharedPreferencesArr) {
            return IntentSender.Activity.EZpvd(m7358migratezeHU3Mk(packageManager, j, j2, sharedPreferencesArr));
        }

        /* JADX INFO: renamed from: create-0iQ1-z0, reason: not valid java name */
        public Object m7357create0iQ1z0(@NotNull PackageManager packageManager) {
            Intrinsics.checkNotNullParameter(packageManager, "");
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE AuthenticateResponseTopicDao (\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   responseTopic TEXT NOT NULL\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE LinkModeDao (\n    app_link TEXT NOT NULL UNIQUE\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE OptionalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalDao (\n   request_id INTEGER PRIMARY KEY NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   name TEXT NOT NULL,\n   description TEXT NOT NULL,\n   url TEXT NOT NULL,\n   icons TEXT NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   proposer_key TEXT NOT NULL,\n   properties TEXT,\n   redirect TEXT NOT NULL DEFAULT \"\",\n   expiry INTEGER\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL,\n   properties TEXT,\n   transport_type TEXT\n)", 0, null, 8, null);
            PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, null, 8, null);
            return IntentSender.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: renamed from: migrateInternal-ElmaSbI, reason: not valid java name */
        public final Object m7359migrateInternalElmaSbI(PackageManager packageManager, long j, long j2) {
            if (j <= 1 && j2 > 1) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS PairingDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 2 && j2 > 2) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS PairingDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 3 && j2 > 3) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS PairingDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 4 && j2 > 4) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS PairingDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \tnative TEXT,\n    icons TEXT NOT NULL,\n    type TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 5 && j2 > 5) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS MetaDataDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS PairingDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 6 && j2 > 6) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS SessionDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS OptionalNamespaceDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL,\n   properties TEXT\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE OptionalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalDao (\n   request_id INTEGER PRIMARY KEY NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   name TEXT NOT NULL,\n   description TEXT NOT NULL,\n   url TEXT NOT NULL,\n   icons TEXT NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   proposer_key TEXT NOT NULL,\n   properties TEXT\n)", 0, null, 8, null);
            }
            if (j <= 7 && j2 > 7) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE ProposalDao ADD COLUMN redirect TEXT NOT NULL DEFAULT \"\"", 0, null, 8, null);
            }
            if (j <= 8 && j2 > 8) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "DROP TABLE IF EXISTS ProposalDao", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE ProposalDao (\n   request_id INTEGER PRIMARY KEY NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   name TEXT NOT NULL,\n   description TEXT NOT NULL,\n   url TEXT NOT NULL,\n   icons TEXT NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   proposer_key TEXT NOT NULL,\n   properties TEXT,\n   redirect TEXT NOT NULL DEFAULT \"\",\n   expiry INTEGER\n)", 0, null, 8, null);
            }
            if (j <= 9 && j2 > 9) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE AuthenticateResponseTopicDao (\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   responseTopic TEXT NOT NULL\n)", 0, null, 8, null);
            }
            if (j <= 10 && j2 > 10) {
                PackageManager.StateListAnimator.execute$default(packageManager, null, "ALTER TABLE SessionDao ADD COLUMN transport_type TEXT", 0, null, 8, null);
                PackageManager.StateListAnimator.execute$default(packageManager, null, "CREATE TABLE LinkModeDao (\n    app_link TEXT NOT NULL UNIQUE\n)", 0, null, 8, null);
            }
            return IntentSender.OLrzqt.AEQbTJ();
        }

        /* JADX INFO: renamed from: migrate-zeHU3Mk, reason: not valid java name */
        public Object m7358migratezeHU3Mk(@NotNull PackageManager packageManager, long j, long j2, @NotNull SharedPreferences... sharedPreferencesArr) {
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
            for (SharedPreferences sharedPreferences2 : CollectionsKt___CollectionsKt.EZpvd(arrayList, new Comparator() { // from class: com.reown.sign.sign.SignDatabaseImpl$Schema$migrate-zeHU3Mk$$inlined$sortedBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(Long.valueOf(((SharedPreferences) t).copydefault()), Long.valueOf(((SharedPreferences) t2).copydefault()));
                }
            })) {
                INSTANCE.m7359migrateInternalElmaSbI(packageManager, jCopydefault2, sharedPreferences2.copydefault() + 1);
                sharedPreferences2.KWHzl().invoke(packageManager);
                jCopydefault2 = sharedPreferences2.copydefault() + 1;
            }
            if (jCopydefault2 < j2) {
                m7359migrateInternalElmaSbI(packageManager, jCopydefault2, j2);
            }
            return IntentSender.OLrzqt.AEQbTJ();
        }
    }
}
