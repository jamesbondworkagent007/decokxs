package com.reown.sign.storage.sequence;

import android.database.sqlite.SQLiteException;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.TransportType;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.SessionRequestQueueKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries;
import com.reown.sign.storage.data.dao.optionalnamespaces.OptionalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries;
import com.reown.sign.storage.data.dao.session.SessionDaoQueries;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries;
import com.reown.utils.UtilFunctionsKt;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56424yEw;
import o.C56529yIt;
import o.C56548yJl;
import o.yHD;
import o.yHQ;
import o.yHS;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionStorageRepository {
    public final NamespaceDaoQueries namespaceDaoQueries;
    public /* synthetic */ Function1<? super Topic, Unit> onSessionExpired;
    public final OptionalNamespaceDaoQueries optionalNamespaceDaoQueries;
    public final ProposalNamespaceDaoQueries requiredNamespaceDaoQueries;
    public final SessionDaoQueries sessionDaoQueries;
    public final TempNamespaceDaoQueries tempNamespaceDaoQueries;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.reown.foundation.common.model.Topic, kotlin.Unit>, kotlin.jvm.functions.Function1<com.reown.foundation.common.model.Topic, kotlin.Unit> */
    public final Function1<Topic, Unit> getOnSessionExpired() {
        return this.onSessionExpired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSessionExpired(@NotNull Function1<? super Topic, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onSessionExpired = function1;
    }

    public SessionStorageRepository(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull NamespaceDaoQueries namespaceDaoQueries, @NotNull ProposalNamespaceDaoQueries proposalNamespaceDaoQueries, @NotNull OptionalNamespaceDaoQueries optionalNamespaceDaoQueries, @NotNull TempNamespaceDaoQueries tempNamespaceDaoQueries) {
        Intrinsics.checkNotNullParameter(sessionDaoQueries, "");
        Intrinsics.checkNotNullParameter(namespaceDaoQueries, "");
        Intrinsics.checkNotNullParameter(proposalNamespaceDaoQueries, "");
        Intrinsics.checkNotNullParameter(optionalNamespaceDaoQueries, "");
        Intrinsics.checkNotNullParameter(tempNamespaceDaoQueries, "");
        this.sessionDaoQueries = sessionDaoQueries;
        this.namespaceDaoQueries = namespaceDaoQueries;
        this.requiredNamespaceDaoQueries = proposalNamespaceDaoQueries;
        this.optionalNamespaceDaoQueries = optionalNamespaceDaoQueries;
        this.tempNamespaceDaoQueries = tempNamespaceDaoQueries;
        this.onSessionExpired = new Function1<Topic, Unit>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository$onSessionExpired$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Topic topic) {
                Intrinsics.checkNotNullParameter(topic, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Topic topic) {
                invoke2(topic);
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: com.reown.sign.storage.sequence.SessionStorageRepository$getListOfSessionVOsWithoutMetadata$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C20281 extends FunctionReferenceImpl implements yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, ? extends String>, TransportType, SessionVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C20281(Object obj) {
            super(12, obj, SessionStorageRepository.class, "mapSessionDaoToSessionVO", "mapSessionDaoToSessionVO(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lcom/reown/android/internal/common/model/TransportType;)Lcom/reown/sign/common/model/vo/sequence/SessionVO;", 0);
        }

        public final SessionVO invoke(long j, @NotNull String str, long j2, @NotNull String str2, String str3, String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, Map<String, String> map, TransportType transportType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return ((SessionStorageRepository) this.receiver).mapSessionDaoToSessionVO(j, str, j2, str2, str3, str4, str5, str6, z, str7, map, transportType);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHD
        public /* synthetic */ SessionVO invoke(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Map<String, ? extends String> map, TransportType transportType) {
            return invoke(l.longValue(), str, l2.longValue(), str2, str3, str4, str5, str6, bool.booleanValue(), str7, (Map<String, String>) map, transportType);
        }
    }

    public final /* synthetic */ List getListOfSessionVOsWithoutMetadata() {
        return this.sessionDaoQueries.getListOfSessionDaos(new C20281(this)).executeAsList();
    }

    public final /* synthetic */ boolean isSessionValid(final Topic topic) {
        Long lExecuteAsOneOrNull;
        Intrinsics.checkNotNullParameter(topic, "");
        if (this.sessionDaoQueries.hasTopic(topic.getValue()).executeAsOneOrNull() == null || (lExecuteAsOneOrNull = this.sessionDaoQueries.getExpiry(topic.getValue()).executeAsOneOrNull()) == null) {
            return false;
        }
        return verifyExpiry(lExecuteAsOneOrNull.longValue(), topic, new Function0<Unit>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository$isSessionValid$1$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.sessionDaoQueries.deleteSession(topic.getValue());
            }
        });
    }

    public final /* synthetic */ Expiry getSessionExpiryByTopic(Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        Long lExecuteAsOneOrNull = this.sessionDaoQueries.getExpiry(topic.getValue()).executeAsOneOrNull();
        if (lExecuteAsOneOrNull != null) {
            return new Expiry(lExecuteAsOneOrNull.longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: com.reown.sign.storage.sequence.SessionStorageRepository$getSessionWithoutMetadataByTopic$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C20321 extends FunctionReferenceImpl implements yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, ? extends String>, TransportType, SessionVO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C20321(Object obj) {
            super(12, obj, SessionStorageRepository.class, "mapSessionDaoToSessionVO", "mapSessionDaoToSessionVO(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Lcom/reown/android/internal/common/model/TransportType;)Lcom/reown/sign/common/model/vo/sequence/SessionVO;", 0);
        }

        public final SessionVO invoke(long j, @NotNull String str, long j2, @NotNull String str2, String str3, String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, Map<String, String> map, TransportType transportType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return ((SessionStorageRepository) this.receiver).mapSessionDaoToSessionVO(j, str, j2, str2, str3, str4, str5, str6, z, str7, map, transportType);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHD
        public /* synthetic */ SessionVO invoke(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Map<String, ? extends String> map, TransportType transportType) {
            return invoke(l.longValue(), str, l2.longValue(), str2, str3, str4, str5, str6, bool.booleanValue(), str7, (Map<String, String>) map, transportType);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ SessionVO getSessionWithoutMetadataByTopic(Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        return (SessionVO) this.sessionDaoQueries.getSessionByTopic(topic.getValue(), new C20321(this)).executeAsOne();
    }

    public final /* synthetic */ List getAllSessionTopicsByPairingTopic(Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        return this.sessionDaoQueries.getAllSessionTopicsByPairingTopic(topic.getValue()).executeAsList();
    }

    public final /* synthetic */ void insertSession(SessionVO sessionVO, long j) throws SQLiteException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(sessionVO, "");
            SessionDaoQueries sessionDaoQueries = this.sessionDaoQueries;
            String value = sessionVO.getTopic().getValue();
            String pairingTopic = sessionVO.getPairingTopic();
            long seconds = sessionVO.getExpiry().getSeconds();
            String strM7339getSelfPublicKeyuN_RPug = sessionVO.m7339getSelfPublicKeyuN_RPug();
            String relayProtocol = sessionVO.getRelayProtocol();
            String strM7337getControllerKeyeO6xuyU = sessionVO.m7337getControllerKeyeO6xuyU();
            String str = strM7337getControllerKeyeO6xuyU == null ? null : strM7337getControllerKeyeO6xuyU;
            String strM7338getPeerPublicKeyeO6xuyU = sessionVO.m7338getPeerPublicKeyeO6xuyU();
            sessionDaoQueries.insertOrAbortSession(value, pairingTopic, seconds, relayProtocol, sessionVO.getRelayData(), str, strM7339getSelfPublicKeyuN_RPug, strM7338getPeerPublicKeyeO6xuyU == null ? null : strM7338getPeerPublicKeyeO6xuyU, sessionVO.isAcknowledged(), sessionVO.getProperties(), sessionVO.getTransportType());
            long jLongValue = this.sessionDaoQueries.lastInsertedRow().executeAsOne().longValue();
            insertNamespace(sessionVO.getSessionNamespaces(), jLongValue, j);
            insertRequiredNamespace(sessionVO.getRequiredNamespaces(), jLongValue);
            insertOptionalNamespace(sessionVO.getOptionalNamespaces(), jLongValue);
        }
    }

    public final /* synthetic */ void acknowledgeSession(Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        this.sessionDaoQueries.acknowledgeSession(true, topic.getValue());
    }

    public final /* synthetic */ void extendSession(Topic topic, long j) {
        Intrinsics.checkNotNullParameter(topic, "");
        this.sessionDaoQueries.updateSessionExpiry(j, topic.getValue());
    }

    public final /* synthetic */ void insertTempNamespaces(String str, Map map, long j) throws SQLiteException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        long jLongValue = this.sessionDaoQueries.getSessionIdByTopic(str).executeAsOne().longValue();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Namespace.Session session = (Namespace.Session) entry.getValue();
            this.tempNamespaceDaoQueries.insertOrAbortNamespace(jLongValue, str, str2, session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents(), Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.storage.sequence.SessionStorageRepository$getTempNamespaces$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C20331 extends FunctionReferenceImpl implements yHQ<Long, String, List<? extends String>, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Session>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C20331(Object obj) {
            super(6, obj, SessionStorageRepository.class, "mapTempNamespaceToNamespaceVO", "mapTempNamespaceToNamespaceVO(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHQ
        public /* synthetic */ Pair<? extends String, ? extends Namespace.Session> invoke(Long l, String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3, List<? extends String> list4) {
            return invoke(l.longValue(), str, (List<String>) list, (List<String>) list2, (List<String>) list3, (List<String>) list4);
        }

        public final Pair<String, Namespace.Session> invoke(long j, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            return ((SessionStorageRepository) this.receiver).mapTempNamespaceToNamespaceVO(j, str, list, list2, list3, list4);
        }
    }

    public final /* synthetic */ Map getTempNamespaces(long j) {
        Collection<Pair> collectionExecuteAsList = this.tempNamespaceDaoQueries.getTempNamespacesByRequestId(j, new C20331(this)).executeAsList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(collectionExecuteAsList, 10)), 16));
        for (Pair pair : collectionExecuteAsList) {
            Pair pairOLrzqt = C56390yDp.OLrzqt((String) pair.component1(), (Namespace.Session) pair.component2());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return linkedHashMap;
    }

    public final /* synthetic */ void deleteNamespaceAndInsertNewNamespace(String str, Map map, long j) throws SQLiteException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        long jLongValue = this.sessionDaoQueries.getSessionIdByTopic(str).executeAsOne().longValue();
        this.namespaceDaoQueries.deleteNamespacesByTopic(str);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Namespace.Session session = (Namespace.Session) entry.getValue();
            this.namespaceDaoQueries.insertOrAbortNamespace(jLongValue, str2, session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents(), j);
        }
    }

    public final /* synthetic */ boolean isUpdatedNamespaceValid(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean boolExecuteAsOneOrNull = this.namespaceDaoQueries.isUpdateNamespaceRequestValid(j, str).executeAsOneOrNull();
        if (boolExecuteAsOneOrNull != null) {
            return boolExecuteAsOneOrNull.booleanValue();
        }
        return false;
    }

    public final /* synthetic */ boolean isUpdatedNamespaceResponseValid(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean boolExecuteAsOneOrNull = this.tempNamespaceDaoQueries.isUpdateNamespaceRequestValid(str, j).executeAsOneOrNull();
        if (boolExecuteAsOneOrNull != null) {
            return boolExecuteAsOneOrNull.booleanValue();
        }
        return false;
    }

    public final /* synthetic */ void markUnAckNamespaceAcknowledged(long j) {
        this.tempNamespaceDaoQueries.markNamespaceAcknowledged(j);
    }

    public final /* synthetic */ void deleteTempNamespacesByRequestId(long j) {
        this.tempNamespaceDaoQueries.deleteTempNamespacesByRequestId(j);
    }

    public final /* synthetic */ void deleteSession(final Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        C56406yEe.djBIcL(SessionRequestQueueKt.getSessionRequestEventsQueue(), new Function1<EngineDO.SessionRequestEvent, Boolean>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository.deleteSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EngineDO.SessionRequestEvent sessionRequestEvent) {
                return Boolean.valueOf(Intrinsics.EZpvd((Object) sessionRequestEvent.getRequest().getTopic(), (Object) topic.getValue()));
            }
        });
        this.namespaceDaoQueries.deleteNamespacesByTopic(topic.getValue());
        this.requiredNamespaceDaoQueries.deleteProposalNamespacesByTopic(topic.getValue());
        this.optionalNamespaceDaoQueries.deleteOptionalNamespacesByTopic(topic.getValue());
        this.tempNamespaceDaoQueries.deleteTempNamespacesByTopic(topic.getValue());
        this.sessionDaoQueries.deleteSession(topic.getValue());
    }

    public final boolean verifyExpiry(long j, Topic topic, Function0<Unit> function0) {
        if (UtilFunctionsKt.isSequenceValid(new Expiry(j))) {
            return true;
        }
        function0.invoke();
        this.onSessionExpired.invoke(topic);
        return false;
    }

    public final SessionVO mapSessionDaoToSessionVO(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Map<String, String> map, TransportType transportType) {
        return new SessionVO(new Topic(str), new Expiry(j2), str2, str3, PublicKey.m7317constructorimpl(str4 == null ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str4), PublicKey.m7317constructorimpl(str5), null, PublicKey.m7317constructorimpl(str6 == null ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str6), null, getSessionNamespaces(j), getRequiredNamespaces(j), getOptionalNamespaces(j), map, z, str7, transportType, null);
    }

    public final Map<String, Namespace.Proposal> getRequiredNamespaces(long j) {
        return C56424yEw.copydefault(this.requiredNamespaceDaoQueries.getProposalNamespaces(j, new yHT<String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Proposal>>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository.getRequiredNamespaces.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Namespace.Proposal> invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, Namespace.Proposal> invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return C56390yDp.OLrzqt(str, new Namespace.Proposal(list2, list, list3));
            }
        }).executeAsList());
    }

    public final Map<String, Namespace.Proposal> getOptionalNamespaces(long j) {
        return C56424yEw.copydefault(this.optionalNamespaceDaoQueries.getOptionalNamespaces(j, new yHT<String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Proposal>>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository.getOptionalNamespaces.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Namespace.Proposal> invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, Namespace.Proposal> invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return C56390yDp.OLrzqt(str, new Namespace.Proposal(list2, list, list3));
            }
        }).executeAsList());
    }

    public final Map<String, Namespace.Session> getSessionNamespaces(long j) {
        return C56424yEw.copydefault(this.namespaceDaoQueries.getNamespaces(j, new yHS<String, List<? extends String>, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends Namespace.Session>>() { // from class: com.reown.sign.storage.sequence.SessionStorageRepository.getSessionNamespaces.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHS
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Namespace.Session> invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3, List<? extends String> list4) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3, (List<String>) list4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, Namespace.Session> invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                Intrinsics.checkNotNullParameter(list4, "");
                return C56390yDp.OLrzqt(str, new Namespace.Session(list, list2, list3, list4));
            }
        }).executeAsList());
    }

    public final Pair<String, Namespace.Session> mapTempNamespaceToNamespaceVO(long j, String str, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        return C56390yDp.OLrzqt(str, new Namespace.Session(list, list2, list3, list4));
    }

    public final void insertNamespace(Map<String, Namespace.Session> map, long j, long j2) throws SQLiteException {
        for (Map.Entry<String, Namespace.Session> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace.Session value = entry.getValue();
            this.namespaceDaoQueries.insertOrAbortNamespace(j, key, value.getChains(), value.getAccounts(), value.getMethods(), value.getEvents(), j2);
        }
    }

    public final void insertRequiredNamespace(Map<String, Namespace.Proposal> map, long j) throws SQLiteException {
        for (Map.Entry<String, Namespace.Proposal> entry : map.entrySet()) {
            String key = entry.getKey();
            Namespace.Proposal value = entry.getValue();
            this.requiredNamespaceDaoQueries.insertOrAbortProposalNamespace(j, key, value.getChains(), value.getMethods(), value.getEvents());
        }
    }

    public final void insertOptionalNamespace(Map<String, Namespace.Proposal> map, long j) throws SQLiteException {
        if (map != null) {
            for (Map.Entry<String, Namespace.Proposal> entry : map.entrySet()) {
                String key = entry.getKey();
                Namespace.Proposal value = entry.getValue();
                this.optionalNamespaceDaoQueries.insertOrAbortOptionalNamespace(j, key, value.getChains(), value.getMethods(), value.getEvents());
            }
        }
    }
}
