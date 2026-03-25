package com.reown.sign.storage.data.dao.proposal;

import com.reown.sign.storage.data.dao.proposal.ProposalDao;
import com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.LoaderManager;
import o.PackageManager;
import o.VoiceInteractor;
import o.yHD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposalDaoQueries extends ContentResolver {
    public final ProposalDao.Adapter ProposalDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProposalDaoQueries(@NotNull PackageManager packageManager, @NotNull ProposalDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.ProposalDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getProposalByKey(@NotNull String str, @NotNull final yHD<? super Long, ? super String, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? super String, ? super String, ? super Map<String, String>, ? super String, ? super Long, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yhd, "");
        return new GetProposalByKeyQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getProposalByKey.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.String, ? super java.lang.Long, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<Long, String, String, String, String, List<String>, String, String, String, Map<String, String>, String, Long, T> yhd2 = yhd;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                LoaderManager<List<String>, String> iconsAdapter = this.ProposalDaoAdapter.getIconsAdapter();
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                List<String> listDecode = iconsAdapter.decode(strKWHzl5);
                String strKWHzl6 = assetManager.KWHzl(6);
                Intrinsics.copydefault((Object) strKWHzl6);
                String strKWHzl7 = assetManager.KWHzl(7);
                String strKWHzl8 = assetManager.KWHzl(8);
                Intrinsics.copydefault((Object) strKWHzl8);
                String strKWHzl9 = assetManager.KWHzl(9);
                Map<String, String> mapDecode = strKWHzl9 != null ? this.ProposalDaoAdapter.getPropertiesAdapter().decode(strKWHzl9) : null;
                String strKWHzl10 = assetManager.KWHzl(10);
                Intrinsics.copydefault((Object) strKWHzl10);
                return (T) yhd2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, listDecode, strKWHzl6, strKWHzl7, strKWHzl8, mapDecode, strKWHzl10, assetManager.EZpvd(11));
            }
        });
    }

    public final AssistContent<ProposalDao> getProposalByKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getProposalByKey(str, new yHD<Long, String, String, String, String, List<? extends String>, String, String, String, Map<String, ? extends String>, String, Long, ProposalDao>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getProposalByKey.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ ProposalDao invoke(Long l, String str2, String str3, String str4, String str5, List<? extends String> list, String str6, String str7, String str8, Map<String, ? extends String> map, String str9, Long l2) {
                return invoke(l.longValue(), str2, str3, str4, str5, (List<String>) list, str6, str7, str8, (Map<String, String>) map, str9, l2);
            }

            public final ProposalDao invoke(long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull String str6, String str7, @NotNull String str8, Map<String, String> map, @NotNull String str9, Long l) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                return new ProposalDao(j, str2, str3, str4, str5, list, str6, str7, str8, map, str9, l);
            }
        });
    }

    public final <T> AssistContent<T> getListOfProposalDaos(@NotNull final yHD<? super Long, ? super String, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? super String, ? super String, ? super Map<String, String>, ? super String, ? super Long, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(yhd, "");
        return VoiceInteractor.OLrzqt(1540279732, new String[]{"ProposalDao"}, getDriver(), "ProposalDao.sq", "getListOfProposalDaos", "SELECT pd.request_id, pd.pairingTopic, pd.name, pd.description, pd.url, pd.icons, pd.relay_protocol, pd.relay_data, pd.proposer_key, pd.properties, pd.redirect, pd.expiry\nFROM ProposalDao pd", new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getListOfProposalDaos.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.String, ? super java.lang.Long, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<Long, String, String, String, String, List<String>, String, String, String, Map<String, String>, String, Long, T> yhd2 = yhd;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                LoaderManager<List<String>, String> iconsAdapter = this.ProposalDaoAdapter.getIconsAdapter();
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                List<String> listDecode = iconsAdapter.decode(strKWHzl5);
                String strKWHzl6 = assetManager.KWHzl(6);
                Intrinsics.copydefault((Object) strKWHzl6);
                String strKWHzl7 = assetManager.KWHzl(7);
                String strKWHzl8 = assetManager.KWHzl(8);
                Intrinsics.copydefault((Object) strKWHzl8);
                String strKWHzl9 = assetManager.KWHzl(9);
                Map<String, String> mapDecode = strKWHzl9 != null ? this.ProposalDaoAdapter.getPropertiesAdapter().decode(strKWHzl9) : null;
                String strKWHzl10 = assetManager.KWHzl(10);
                Intrinsics.copydefault((Object) strKWHzl10);
                return (T) yhd2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, listDecode, strKWHzl6, strKWHzl7, strKWHzl8, mapDecode, strKWHzl10, assetManager.EZpvd(11));
            }
        });
    }

    public final AssistContent<ProposalDao> getListOfProposalDaos() {
        return getListOfProposalDaos(new yHD<Long, String, String, String, String, List<? extends String>, String, String, String, Map<String, ? extends String>, String, Long, ProposalDao>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getListOfProposalDaos.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ ProposalDao invoke(Long l, String str, String str2, String str3, String str4, List<? extends String> list, String str5, String str6, String str7, Map<String, ? extends String> map, String str8, Long l2) {
                return invoke(l.longValue(), str, str2, str3, str4, (List<String>) list, str5, str6, str7, (Map<String, String>) map, str8, l2);
            }

            public final ProposalDao invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list, @NotNull String str5, String str6, @NotNull String str7, Map<String, String> map, @NotNull String str8, Long l) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                return new ProposalDao(j, str, str2, str3, str4, list, str5, str6, str7, map, str8, l);
            }
        });
    }

    public final <T> AssistContent<T> getProposalByPairingTopic(@NotNull String str, @NotNull final yHD<? super Long, ? super String, ? super String, ? super String, ? super String, ? super List<String>, ? super String, ? super String, ? super String, ? super Map<String, String>, ? super String, ? super Long, ? extends T> yhd) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yhd, "");
        return new GetProposalByPairingTopicQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getProposalByPairingTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHD<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, ? super java.lang.String, ? super java.lang.Long, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHD<Long, String, String, String, String, List<String>, String, String, String, Map<String, String>, String, Long, T> yhd2 = yhd;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                LoaderManager<List<String>, String> iconsAdapter = this.ProposalDaoAdapter.getIconsAdapter();
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                List<String> listDecode = iconsAdapter.decode(strKWHzl5);
                String strKWHzl6 = assetManager.KWHzl(6);
                Intrinsics.copydefault((Object) strKWHzl6);
                String strKWHzl7 = assetManager.KWHzl(7);
                String strKWHzl8 = assetManager.KWHzl(8);
                Intrinsics.copydefault((Object) strKWHzl8);
                String strKWHzl9 = assetManager.KWHzl(9);
                Map<String, String> mapDecode = strKWHzl9 != null ? this.ProposalDaoAdapter.getPropertiesAdapter().decode(strKWHzl9) : null;
                String strKWHzl10 = assetManager.KWHzl(10);
                Intrinsics.copydefault((Object) strKWHzl10);
                return (T) yhd2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, listDecode, strKWHzl6, strKWHzl7, strKWHzl8, mapDecode, strKWHzl10, assetManager.EZpvd(11));
            }
        });
    }

    public final AssistContent<ProposalDao> getProposalByPairingTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getProposalByPairingTopic(str, new yHD<Long, String, String, String, String, List<? extends String>, String, String, String, Map<String, ? extends String>, String, Long, ProposalDao>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.getProposalByPairingTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHD
            public /* synthetic */ ProposalDao invoke(Long l, String str2, String str3, String str4, String str5, List<? extends String> list, String str6, String str7, String str8, Map<String, ? extends String> map, String str9, Long l2) {
                return invoke(l.longValue(), str2, str3, str4, str5, (List<String>) list, str6, str7, str8, (Map<String, String>) map, str9, l2);
            }

            public final ProposalDao invoke(long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull String str6, String str7, @NotNull String str8, Map<String, String> map, @NotNull String str9, Long l) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                return new ProposalDao(j, str2, str3, str4, str5, list, str6, str7, str8, map, str9, l);
            }
        });
    }

    public final void insertOrAbortSession(final Long l, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final List<String> list, @NotNull final String str5, final String str6, @NotNull final String str7, final Map<String, String> map, @NotNull final String str8, final Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        getDriver().AEQbTJ(1381780556, "INSERT OR ABORT INTO ProposalDao(request_id, pairingTopic, name, description, url, icons, relay_protocol, relay_data, proposer_key, properties, redirect, expiry)\nVALUES (?,?,?,?,?,?,?,?,?,?,?, ?)", 12, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.insertOrAbortSession.1
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
                configuration.OLrzqt(0, l);
                configuration.copydefault(1, str);
                configuration.copydefault(2, str2);
                configuration.copydefault(3, str3);
                configuration.copydefault(4, str4);
                configuration.copydefault(5, this.ProposalDaoAdapter.getIconsAdapter().encode(list));
                configuration.copydefault(6, str5);
                configuration.copydefault(7, str6);
                configuration.copydefault(8, str7);
                Map<String, String> map2 = map;
                configuration.copydefault(9, map2 != null ? this.ProposalDaoAdapter.getPropertiesAdapter().encode(map2) : null);
                configuration.copydefault(10, str8);
                configuration.OLrzqt(11, l2);
            }
        });
        notifyQueries(1381780556, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.insertOrAbortSession.2
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
                function1.invoke("ProposalDao");
            }
        });
    }

    public final void deleteProposal(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-1977294937, "DELETE FROM ProposalDao\nWHERE proposer_key = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.deleteProposal.1
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
        notifyQueries(-1977294937, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries.deleteProposal.2
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
                function1.invoke("ProposalDao");
            }
        });
    }

    public final class GetProposalByKeyQuery<T> extends AssistContent<T> {
        public final String proposer_key;
        public final /* synthetic */ ProposalDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProposer_key() {
            return this.proposer_key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProposalDao.sq:getProposalByKey";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProposalByKeyQuery(@NotNull ProposalDaoQueries proposalDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = proposalDaoQueries;
            this.proposer_key = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"ProposalDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"ProposalDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-1015209366, "SELECT pd.request_id, pd.pairingTopic, pd.name, pd.description, pd.url, pd.icons, pd.relay_protocol, pd.relay_data, pd.proposer_key, pd.properties, pd.redirect, pd.expiry\nFROM ProposalDao pd\nWHERE proposer_key = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries$GetProposalByKeyQuery$execute$1
                public final /* synthetic */ ProposalDaoQueries.GetProposalByKeyQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries$GetProposalByKeyQuery<? extends T> */
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
                    configuration.copydefault(0, this.this$0.getProposer_key());
                }
            });
        }
    }

    public final class GetProposalByPairingTopicQuery<T> extends AssistContent<T> {
        public final String pairingTopic;
        public final /* synthetic */ ProposalDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProposalDao.sq:getProposalByPairingTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProposalByPairingTopicQuery(@NotNull ProposalDaoQueries proposalDaoQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = proposalDaoQueries;
            this.pairingTopic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"ProposalDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"ProposalDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1614390172, "SELECT pd.request_id, pd.pairingTopic, pd.name, pd.description, pd.url, pd.icons, pd.relay_protocol, pd.relay_data, pd.proposer_key, pd.properties, pd.redirect, pd.expiry\nFROM ProposalDao pd\nWHERE pairingTopic = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries$GetProposalByPairingTopicQuery$execute$1
                public final /* synthetic */ ProposalDaoQueries.GetProposalByPairingTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.proposal.ProposalDaoQueries$GetProposalByPairingTopicQuery<? extends T> */
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
}
