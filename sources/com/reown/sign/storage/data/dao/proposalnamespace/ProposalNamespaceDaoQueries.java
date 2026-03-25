package com.reown.sign.storage.data.dao.proposalnamespace;

import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDao;
import com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries;
import java.util.List;
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
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProposalNamespaceDaoQueries extends ContentResolver {
    public final ProposalNamespaceDao.Adapter ProposalNamespaceDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProposalNamespaceDaoQueries(@NotNull PackageManager packageManager, @NotNull ProposalNamespaceDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.ProposalNamespaceDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getProposalNamespaces(long j, @NotNull final yHT<? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> yht) {
        Intrinsics.checkNotNullParameter(yht, "");
        return new GetProposalNamespacesQuery(this, j, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.getProposalNamespaces.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHT<? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHT<String, List<String>, List<String>, List<String>, T> yht2 = yht;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(1);
                List<String> listDecode = strKWHzl2 != null ? this.ProposalNamespaceDaoAdapter.getChainsAdapter().decode(strKWHzl2) : null;
                LoaderManager<List<String>, String> methodsAdapter = this.ProposalNamespaceDaoAdapter.getMethodsAdapter();
                String strKWHzl3 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl3);
                List<String> listDecode2 = methodsAdapter.decode(strKWHzl3);
                LoaderManager<List<String>, String> eventsAdapter = this.ProposalNamespaceDaoAdapter.getEventsAdapter();
                String strKWHzl4 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl4);
                return (T) yht2.invoke(strKWHzl, listDecode, listDecode2, eventsAdapter.decode(strKWHzl4));
            }
        });
    }

    public final AssistContent<GetProposalNamespaces> getProposalNamespaces(long j) {
        return getProposalNamespaces(j, new yHT<String, List<? extends String>, List<? extends String>, List<? extends String>, GetProposalNamespaces>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.getProposalNamespaces.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* bridge */ /* synthetic */ GetProposalNamespaces invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final GetProposalNamespaces invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return new GetProposalNamespaces(str, list, list2, list3);
            }
        });
    }

    public final void insertOrAbortProposalNamespace(final long j, @NotNull final String str, final List<String> list, @NotNull final List<String> list2, @NotNull final List<String> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        getDriver().AEQbTJ(1451215169, "INSERT OR ABORT INTO ProposalNamespaceDao(session_id, key, chains, methods, events)\nVALUES (?, ?, ?, ?, ?)", 5, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.insertOrAbortProposalNamespace.1
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
                List<String> list4 = list;
                configuration.copydefault(2, list4 != null ? this.ProposalNamespaceDaoAdapter.getChainsAdapter().encode(list4) : null);
                configuration.copydefault(3, this.ProposalNamespaceDaoAdapter.getMethodsAdapter().encode(list2));
                configuration.copydefault(4, this.ProposalNamespaceDaoAdapter.getEventsAdapter().encode(list3));
            }
        });
        notifyQueries(1451215169, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.insertOrAbortProposalNamespace.2
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
                function1.invoke("ProposalNamespaceDao");
            }
        });
    }

    public final void deleteProposalNamespacesByTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-1341694889, "DELETE FROM ProposalNamespaceDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.deleteProposalNamespacesByTopic.1
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
        notifyQueries(-1341694889, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.deleteProposalNamespacesByTopic.2
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
                function1.invoke("ProposalNamespaceDao");
            }
        });
    }

    public final void deleteProposalNamespacesProposerKey(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-942191606, "DELETE FROM ProposalNamespaceDao\nWHERE session_id = (\n   SELECT request_id\n   FROM ProposalDao\n   WHERE proposer_key = ?\n)", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.deleteProposalNamespacesProposerKey.1
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
        notifyQueries(-942191606, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries.deleteProposalNamespacesProposerKey.2
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
                function1.invoke("ProposalNamespaceDao");
            }
        });
    }

    public final class GetProposalNamespacesQuery<T> extends AssistContent<T> {
        public final long session_id;
        public final /* synthetic */ ProposalNamespaceDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getSession_id() {
            return this.session_id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProposalNamespaceDao.sq:getProposalNamespaces";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetProposalNamespacesQuery(ProposalNamespaceDaoQueries proposalNamespaceDaoQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = proposalNamespaceDaoQueries;
            this.session_id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"ProposalNamespaceDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"ProposalNamespaceDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-697856748, "SELECT key, chains, methods, events\nFROM ProposalNamespaceDao\nWHERE session_id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries$GetProposalNamespacesQuery$execute$1
                public final /* synthetic */ ProposalNamespaceDaoQueries.GetProposalNamespacesQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.proposalnamespace.ProposalNamespaceDaoQueries$GetProposalNamespacesQuery<? extends T> */
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
                    configuration.OLrzqt(0, Long.valueOf(this.this$0.getSession_id()));
                }
            });
        }
    }
}
