package com.reown.sign.storage.data.dao.session;

import com.reown.android.internal.common.model.TransportType;
import com.reown.sign.storage.data.dao.session.SessionDao;
import com.reown.sign.storage.data.dao.session.SessionDaoQueries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import o.VoiceInteractor;
import o.yHD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionDaoQueries extends ContentResolver {
    public final SessionDao.Adapter SessionDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionDaoQueries(@NotNull PackageManager packageManager, @NotNull SessionDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.SessionDaoAdapter = adapter;
    }

    public final AssistContent<Long> lastInsertedRow() {
        return VoiceInteractor.OLrzqt(1635110010, new String[]{"SessionDao"}, getDriver(), "SessionDao.sq", "lastInsertedRow", "SELECT id\nFROM SessionDao\nWHERE id = (SELECT MAX(id) FROM SessionDao)", new Function1<AssetManager, Long>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.lastInsertedRow.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                return lEZpvd;
            }
        });
    }

    public final <T> AssistContent<T> getListOfSessionDaos(@NotNull final yHD<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super Map<String, String>, ? super TransportType, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(yhd, "");
        return VoiceInteractor.OLrzqt(-1635953346, new String[]{"SessionDao"}, getDriver(), "SessionDao.sq", "getListOfSessionDaos", "SELECT sd.id, sd.topic, sd.expiry, sd.relay_protocol, sd.relay_data, sd.controller_key, sd.self_participant, sd.peer_participant, sd.is_acknowledged, sd.pairingTopic, sd.properties, sd.transport_type\nFROM SessionDao sd", new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getListOfSessionDaos.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.Long, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, ? super com.reown.android.internal.common.model.TransportType, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, String>, TransportType, T> yhd2 = yhd;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd2 = assetManager.EZpvd(2);
                Intrinsics.copydefault(lEZpvd2);
                String strKWHzl2 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(4);
                String strKWHzl4 = assetManager.KWHzl(5);
                String strKWHzl5 = assetManager.KWHzl(6);
                Intrinsics.copydefault((Object) strKWHzl5);
                String strKWHzl6 = assetManager.KWHzl(7);
                Boolean boolOLrzqt = assetManager.OLrzqt(8);
                Intrinsics.copydefault(boolOLrzqt);
                String strKWHzl7 = assetManager.KWHzl(9);
                Intrinsics.copydefault((Object) strKWHzl7);
                String strKWHzl8 = assetManager.KWHzl(10);
                Map<String, String> mapDecode = strKWHzl8 != null ? this.SessionDaoAdapter.getPropertiesAdapter().decode(strKWHzl8) : null;
                String strKWHzl9 = assetManager.KWHzl(11);
                return yhd2.invoke(lEZpvd, strKWHzl, lEZpvd2, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5, strKWHzl6, boolOLrzqt, strKWHzl7, mapDecode, strKWHzl9 != null ? this.SessionDaoAdapter.getTransport_typeAdapter().decode(strKWHzl9) : null);
            }
        });
    }

    public final AssistContent<GetListOfSessionDaos> getListOfSessionDaos() {
        return getListOfSessionDaos(new yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, ? extends String>, TransportType, GetListOfSessionDaos>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getListOfSessionDaos.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ GetListOfSessionDaos invoke(Long l, String str, Long l2, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, Map<String, ? extends String> map, TransportType transportType) {
                return invoke(l.longValue(), str, l2.longValue(), str2, str3, str4, str5, str6, bool.booleanValue(), str7, (Map<String, String>) map, transportType);
            }

            public final GetListOfSessionDaos invoke(long j, @NotNull String str, long j2, @NotNull String str2, String str3, String str4, @NotNull String str5, String str6, boolean z, @NotNull String str7, Map<String, String> map, TransportType transportType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str7, "");
                return new GetListOfSessionDaos(j, str, j2, str2, str3, str4, str5, str6, z, str7, map, transportType);
            }
        });
    }

    public final <T> AssistContent<T> getSessionByTopic(@NotNull String str, @NotNull final yHD<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super Map<String, String>, ? super TransportType, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yhd, "");
        return new GetSessionByTopicQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getSessionByTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.Long, ? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, ? super com.reown.android.internal.common.model.TransportType, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, String>, TransportType, T> yhd2 = yhd;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd2 = assetManager.EZpvd(2);
                Intrinsics.copydefault(lEZpvd2);
                String strKWHzl2 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(4);
                String strKWHzl4 = assetManager.KWHzl(5);
                String strKWHzl5 = assetManager.KWHzl(6);
                Intrinsics.copydefault((Object) strKWHzl5);
                String strKWHzl6 = assetManager.KWHzl(7);
                Boolean boolOLrzqt = assetManager.OLrzqt(8);
                Intrinsics.copydefault(boolOLrzqt);
                String strKWHzl7 = assetManager.KWHzl(9);
                Intrinsics.copydefault((Object) strKWHzl7);
                String strKWHzl8 = assetManager.KWHzl(10);
                Map<String, String> mapDecode = strKWHzl8 != null ? this.SessionDaoAdapter.getPropertiesAdapter().decode(strKWHzl8) : null;
                String strKWHzl9 = assetManager.KWHzl(11);
                return yhd2.invoke(lEZpvd, strKWHzl, lEZpvd2, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5, strKWHzl6, boolOLrzqt, strKWHzl7, mapDecode, strKWHzl9 != null ? this.SessionDaoAdapter.getTransport_typeAdapter().decode(strKWHzl9) : null);
            }
        });
    }

    public final AssistContent<GetSessionByTopic> getSessionByTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getSessionByTopic(str, new yHD<Long, String, Long, String, String, String, String, String, Boolean, String, Map<String, ? extends String>, TransportType, GetSessionByTopic>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getSessionByTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ GetSessionByTopic invoke(Long l, String str2, Long l2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, Map<String, ? extends String> map, TransportType transportType) {
                return invoke(l.longValue(), str2, l2.longValue(), str3, str4, str5, str6, str7, bool.booleanValue(), str8, (Map<String, String>) map, transportType);
            }

            public final GetSessionByTopic invoke(long j, @NotNull String str2, long j2, @NotNull String str3, String str4, String str5, @NotNull String str6, String str7, boolean z, @NotNull String str8, Map<String, String> map, TransportType transportType) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str8, "");
                return new GetSessionByTopic(j, str2, j2, str3, str4, str5, str6, str7, z, str8, map, transportType);
            }
        });
    }

    public final AssistContent<Long> getSessionIdByTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetSessionIdByTopicQuery(this, str, new Function1<AssetManager, Long>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getSessionIdByTopic.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                return lEZpvd;
            }
        });
    }

    public final AssistContent<String> getAllSessionTopicsByPairingTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetAllSessionTopicsByPairingTopicQuery(this, str, new Function1<AssetManager, String>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getAllSessionTopicsByPairingTopic.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                return strKWHzl;
            }
        });
    }

    public final AssistContent<String> hasTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HasTopicQuery(this, str, new Function1<AssetManager, String>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.hasTopic.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                return strKWHzl;
            }
        });
    }

    public final AssistContent<Long> getExpiry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetExpiryQuery(this, str, new Function1<AssetManager, Long>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.getExpiry.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Long invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                return lEZpvd;
            }
        });
    }

    public final void insertOrAbortSession(@NotNull final String str, @NotNull final String str2, final long j, @NotNull final String str3, final String str4, final String str5, @NotNull final String str6, final String str7, final boolean z, final Map<String, String> map, final TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        getDriver().AEQbTJ(1649562452, "INSERT OR ABORT INTO SessionDao(topic, pairingTopic, expiry, relay_protocol, relay_data, controller_key, self_participant, peer_participant, is_acknowledged, properties, transport_type)\nVALUES (?,  ?, ?,?, ?, ?, ?, ?, ?, ?, ?)", 11, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.insertOrAbortSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
                configuration.copydefault(1, str2);
                configuration.OLrzqt(2, Long.valueOf(j));
                configuration.copydefault(3, str3);
                configuration.copydefault(4, str4);
                configuration.copydefault(5, str5);
                configuration.copydefault(6, str6);
                configuration.copydefault(7, str7);
                configuration.OLrzqt(8, Boolean.valueOf(z));
                Map<String, String> map2 = map;
                configuration.copydefault(9, map2 != null ? this.SessionDaoAdapter.getPropertiesAdapter().encode(map2) : null);
                TransportType transportType2 = transportType;
                configuration.copydefault(10, transportType2 != null ? this.SessionDaoAdapter.getTransport_typeAdapter().encode(transportType2) : null);
            }
        });
        notifyQueries(1649562452, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.insertOrAbortSession.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("SessionDao");
            }
        });
    }

    public final void acknowledgeSession(final boolean z, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(4315724, "UPDATE OR ABORT SessionDao\nSET is_acknowledged = ?\nWHERE topic = ?", 2, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.acknowledgeSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.OLrzqt(0, Boolean.valueOf(z));
                configuration.copydefault(1, str);
            }
        });
        notifyQueries(4315724, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.acknowledgeSession.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("SessionDao");
            }
        });
    }

    public final void updateSessionExpiry(final long j, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(1760992622, "UPDATE OR ABORT SessionDao\nSET expiry = ?\nWHERE topic = ?", 2, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.updateSessionExpiry.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.OLrzqt(0, Long.valueOf(j));
                configuration.copydefault(1, str);
            }
        });
        notifyQueries(1760992622, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.updateSessionExpiry.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("SessionDao");
            }
        });
    }

    public final void deleteSession(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-1835895495, "DELETE FROM SessionDao\nWHERE topic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.deleteSession.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Configuration configuration) {
                Intrinsics.checkNotNullParameter(configuration, "");
                configuration.copydefault(0, str);
            }
        });
        notifyQueries(-1835895495, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries.deleteSession.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super String, ? extends Unit> function1) {
                invoke2((Function1<? super String, Unit>) function1);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Function1<? super String, Unit> function1) {
                Intrinsics.checkNotNullParameter(function1, "");
                function1.invoke("SessionDao");
            }
        });
    }

    public final class GetSessionByTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ SessionDaoQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDao.sq:getSessionByTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetSessionByTopicQuery(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = sessionDaoQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-725267354, "SELECT sd.id, sd.topic, sd.expiry, sd.relay_protocol, sd.relay_data, sd.controller_key, sd.self_participant, sd.peer_participant, sd.is_acknowledged, sd.pairingTopic, sd.properties, sd.transport_type\nFROM SessionDao sd\nWHERE topic = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetSessionByTopicQuery$execute$1
                public final /* synthetic */ SessionDaoQueries.GetSessionByTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetSessionByTopicQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getTopic());
                }
            });
        }
    }

    public final class GetSessionIdByTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ SessionDaoQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDao.sq:getSessionIdByTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetSessionIdByTopicQuery(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = sessionDaoQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-1738352821, "SELECT id\nFROM SessionDao\nWHERE topic = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetSessionIdByTopicQuery$execute$1
                public final /* synthetic */ SessionDaoQueries.GetSessionIdByTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetSessionIdByTopicQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getTopic());
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class GetAllSessionTopicsByPairingTopicQuery<T> extends AssistContent<T> {
        public final String pairingTopic;
        public final /* synthetic */ SessionDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDao.sq:getAllSessionTopicsByPairingTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetAllSessionTopicsByPairingTopicQuery(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = sessionDaoQueries;
            this.pairingTopic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-2000327269, "SELECT topic\nFROM SessionDao\nWHERE pairingTopic = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetAllSessionTopicsByPairingTopicQuery$execute$1
                public final /* synthetic */ SessionDaoQueries.GetAllSessionTopicsByPairingTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetAllSessionTopicsByPairingTopicQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getPairingTopic());
                }
            });
        }
    }

    public final class HasTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ SessionDaoQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDao.sq:hasTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HasTopicQuery(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = sessionDaoQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(156224295, "SELECT topic\nFROM SessionDao\nWHERE ? = topic", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries$HasTopicQuery$execute$1
                public final /* synthetic */ SessionDaoQueries.HasTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.session.SessionDaoQueries$HasTopicQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getTopic());
                }
            });
        }
    }

    public final class GetExpiryQuery<T> extends AssistContent<T> {
        public final /* synthetic */ SessionDaoQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDao.sq:getExpiry";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetExpiryQuery(@NotNull SessionDaoQueries sessionDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = sessionDaoQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1203125751, "SELECT expiry\nFROM SessionDao\nWHERE ? = topic", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetExpiryQuery$execute$1
                public final /* synthetic */ SessionDaoQueries.GetExpiryQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.session.SessionDaoQueries$GetExpiryQuery<? extends T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                    invoke2(configuration);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Configuration configuration) {
                    Intrinsics.checkNotNullParameter(configuration, "");
                    configuration.copydefault(0, this.this$0.getTopic());
                }
            });
        }
    }
}
