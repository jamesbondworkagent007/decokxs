package com.reown.android.sdk.storage.data.dao;

import com.reown.android.sdk.storage.data.dao.MetaData;
import com.reown.android.sdk.storage.data.dao.PairingQueries;
import java.util.List;
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
public final class PairingQueries extends ContentResolver {
    public final MetaData.Adapter MetaDataAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairingQueries(@NotNull PackageManager packageManager, @NotNull MetaData.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.MetaDataAdapter = adapter;
    }

    public final <T> AssistContent<T> getListOfPairing(@NotNull final yHD<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(yhd, "");
        return VoiceInteractor.OLrzqt(117081845, new String[]{"Pairing", "MetaData"}, getDriver(), "Pairing.sq", "getListOfPairing", "SELECT pd.topic, pd.expiry, pd.relay_protocol, pd.relay_data, pd.uri, pd.methods, pd.is_proposal_received, mdd_peer.name, mdd_peer.description, mdd_peer.url, mdd_peer.icons, mdd_peer.native\nFROM Pairing pd\n    LEFT JOIN MetaData mdd_peer ON pd.topic = mdd_peer.sequence_topic AND mdd_peer.type = \"PEER\"", new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getListOfPairing.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<String>, String, T> yhd2 = yhd;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd = assetManager.EZpvd(1);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                Boolean boolOLrzqt = assetManager.OLrzqt(6);
                String strKWHzl6 = assetManager.KWHzl(7);
                String strKWHzl7 = assetManager.KWHzl(8);
                String strKWHzl8 = assetManager.KWHzl(9);
                String strKWHzl9 = assetManager.KWHzl(10);
                return yhd2.invoke(strKWHzl, lEZpvd, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5, boolOLrzqt, strKWHzl6, strKWHzl7, strKWHzl8, strKWHzl9 != null ? this.MetaDataAdapter.getIconsAdapter().decode(strKWHzl9) : null, assetManager.KWHzl(11));
            }
        });
    }

    public final AssistContent<GetListOfPairing> getListOfPairing() {
        return getListOfPairing(new yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, GetListOfPairing>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getListOfPairing.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ GetListOfPairing invoke(String str, Long l, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<? extends String> list, String str9) {
                return invoke(str, l.longValue(), str2, str3, str4, str5, bool, str6, str7, str8, (List<String>) list, str9);
            }

            public final GetListOfPairing invoke(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                return new GetListOfPairing(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
            }
        });
    }

    public final <T> AssistContent<T> getListOfPairingsWithoutRequestReceived(@NotNull final yHD<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(yhd, "");
        return VoiceInteractor.OLrzqt(-188987034, new String[]{"Pairing", "MetaData"}, getDriver(), "Pairing.sq", "getListOfPairingsWithoutRequestReceived", "SELECT pd.topic, pd.expiry, pd.relay_protocol, pd.relay_data, pd.uri, pd.methods, pd.is_proposal_received, mdd_peer.name, mdd_peer.description, mdd_peer.url, mdd_peer.icons, mdd_peer.native\nFROM Pairing pd\n    LEFT JOIN MetaData mdd_peer ON pd.topic = mdd_peer.sequence_topic AND mdd_peer.type = \"PEER\"\nWHERE pd.is_proposal_received = 0", new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getListOfPairingsWithoutRequestReceived.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<String>, String, T> yhd2 = yhd;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd = assetManager.EZpvd(1);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                Boolean boolOLrzqt = assetManager.OLrzqt(6);
                String strKWHzl6 = assetManager.KWHzl(7);
                String strKWHzl7 = assetManager.KWHzl(8);
                String strKWHzl8 = assetManager.KWHzl(9);
                String strKWHzl9 = assetManager.KWHzl(10);
                return yhd2.invoke(strKWHzl, lEZpvd, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5, boolOLrzqt, strKWHzl6, strKWHzl7, strKWHzl8, strKWHzl9 != null ? this.MetaDataAdapter.getIconsAdapter().decode(strKWHzl9) : null, assetManager.KWHzl(11));
            }
        });
    }

    public final AssistContent<GetListOfPairingsWithoutRequestReceived> getListOfPairingsWithoutRequestReceived() {
        return getListOfPairingsWithoutRequestReceived(new yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, GetListOfPairingsWithoutRequestReceived>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getListOfPairingsWithoutRequestReceived.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ GetListOfPairingsWithoutRequestReceived invoke(String str, Long l, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, List<? extends String> list, String str9) {
                return invoke(str, l.longValue(), str2, str3, str4, str5, bool, str6, str7, str8, (List<String>) list, str9);
            }

            public final GetListOfPairingsWithoutRequestReceived invoke(@NotNull String str, long j, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, Boolean bool, String str6, String str7, String str8, List<String> list, String str9) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                return new GetListOfPairingsWithoutRequestReceived(str, j, str2, str3, str4, str5, bool, str6, str7, str8, list, str9);
            }
        });
    }

    public final <T> AssistContent<T> getPairingByTopic(@NotNull String str, @NotNull final yHD<? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yhd, "");
        return new GetPairingByTopicQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getPairingByTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.String, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<String>, String, T> yhd2 = yhd;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                Long lEZpvd = assetManager.EZpvd(1);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                Boolean boolOLrzqt = assetManager.OLrzqt(6);
                String strKWHzl6 = assetManager.KWHzl(7);
                String strKWHzl7 = assetManager.KWHzl(8);
                String strKWHzl8 = assetManager.KWHzl(9);
                String strKWHzl9 = assetManager.KWHzl(10);
                return yhd2.invoke(strKWHzl, lEZpvd, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5, boolOLrzqt, strKWHzl6, strKWHzl7, strKWHzl8, strKWHzl9 != null ? this.MetaDataAdapter.getIconsAdapter().decode(strKWHzl9) : null, assetManager.KWHzl(11));
            }
        });
    }

    public final AssistContent<GetPairingByTopic> getPairingByTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getPairingByTopic(str, new yHD<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, GetPairingByTopic>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.getPairingByTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ GetPairingByTopic invoke(String str2, Long l, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, List<? extends String> list, String str10) {
                return invoke(str2, l.longValue(), str3, str4, str5, str6, bool, str7, str8, str9, (List<String>) list, str10);
            }

            public final GetPairingByTopic invoke(@NotNull String str2, long j, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, Boolean bool, String str7, String str8, String str9, List<String> list, String str10) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                return new GetPairingByTopic(str2, j, str3, str4, str5, str6, bool, str7, str8, str9, list, str10);
            }
        });
    }

    public final AssistContent<String> hasTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HasTopicQuery(this, str, new Function1<AssetManager, String>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.hasTopic.1
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

    public final void insertOrAbortPairing(@NotNull final String str, final long j, @NotNull final String str2, final String str3, @NotNull final String str4, @NotNull final String str5, final boolean z, final Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        getDriver().AEQbTJ(1243533004, "INSERT OR ABORT INTO Pairing(topic, expiry, relay_protocol,  relay_data, uri, methods, is_active, is_proposal_received)\nVALUES (?,?,?,?,?,?, ?, ?)", 8, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.insertOrAbortPairing.1
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
                configuration.OLrzqt(1, Long.valueOf(j));
                configuration.copydefault(2, str2);
                configuration.copydefault(3, str3);
                configuration.copydefault(4, str4);
                configuration.copydefault(5, str5);
                configuration.OLrzqt(6, Boolean.valueOf(z));
                configuration.OLrzqt(7, bool);
            }
        });
        notifyQueries(1243533004, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.insertOrAbortPairing.2
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
                function1.invoke("Pairing");
            }
        });
    }

    public final void deletePairing(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-507308827, "DELETE FROM Pairing\nWHERE ? = topic", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.deletePairing.1
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
        notifyQueries(-507308827, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.deletePairing.2
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
                function1.invoke("Pairing");
            }
        });
    }

    public final void setRequestReceived(final Boolean bool, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(822624134, "UPDATE OR ABORT Pairing\nSET is_proposal_received = ?\nWHERE topic = ?", 2, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.setRequestReceived.1
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
                configuration.OLrzqt(0, bool);
                configuration.copydefault(1, str);
            }
        });
        notifyQueries(822624134, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.setRequestReceived.2
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
                function1.invoke("Pairing");
            }
        });
    }

    public final void updateOrAbortExpiry(final long j, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-227929953, "UPDATE OR ABORT Pairing\nSET expiry = ?\nWHERE ? = topic", 2, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.updateOrAbortExpiry.1
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
        notifyQueries(-227929953, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries.updateOrAbortExpiry.2
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
                function1.invoke("Pairing");
            }
        });
    }

    public final class GetPairingByTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ PairingQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Pairing.sq:getPairingByTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetPairingByTopicQuery(@NotNull PairingQueries pairingQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = pairingQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"Pairing", "MetaData"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"Pairing", "MetaData"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-308819346, "SELECT pd.topic, pd.expiry, pd.relay_protocol, pd.relay_data, pd.uri, pd.methods, pd.is_proposal_received, mdd_peer.name, mdd_peer.description, mdd_peer.url, mdd_peer.icons, mdd_peer.native\nFROM Pairing pd\n    LEFT JOIN MetaData mdd_peer ON pd.topic = mdd_peer.sequence_topic AND mdd_peer.type = \"PEER\"\nWHERE ? = topic", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries$GetPairingByTopicQuery$execute$1
                public final /* synthetic */ PairingQueries.GetPairingByTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.PairingQueries$GetPairingByTopicQuery<? extends T> */
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
    public final class HasTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ PairingQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Pairing.sq:hasTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HasTopicQuery(@NotNull PairingQueries pairingQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = pairingQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"Pairing"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"Pairing"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(844624749, "SELECT topic\nFROM Pairing\nWHERE ? = topic", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.PairingQueries$HasTopicQuery$execute$1
                public final /* synthetic */ PairingQueries.HasTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.PairingQueries$HasTopicQuery<? extends T> */
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
