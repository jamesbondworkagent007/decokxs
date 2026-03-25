package com.reown.sign.storage.data.dao.namespace;

import com.reown.sign.storage.data.dao.namespace.NamespaceDao;
import com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries;
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
import o.yHS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class NamespaceDaoQueries extends ContentResolver {
    public final NamespaceDao.Adapter NamespaceDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NamespaceDaoQueries(@NotNull PackageManager packageManager, @NotNull NamespaceDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.NamespaceDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getNamespaces(long j, @NotNull final yHS<? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> yhs) {
        Intrinsics.checkNotNullParameter(yhs, "");
        return new GetNamespacesQuery(this, j, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.getNamespaces.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHS<? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHS<String, List<String>, List<String>, List<String>, List<String>, T> yhs2 = yhs;
                String strKWHzl = assetManager.KWHzl(0);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(1);
                List<String> listDecode = strKWHzl2 != null ? this.NamespaceDaoAdapter.getChainsAdapter().decode(strKWHzl2) : null;
                LoaderManager<List<String>, String> accountsAdapter = this.NamespaceDaoAdapter.getAccountsAdapter();
                String strKWHzl3 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl3);
                List<String> listDecode2 = accountsAdapter.decode(strKWHzl3);
                LoaderManager<List<String>, String> methodsAdapter = this.NamespaceDaoAdapter.getMethodsAdapter();
                String strKWHzl4 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl4);
                List<String> listDecode3 = methodsAdapter.decode(strKWHzl4);
                LoaderManager<List<String>, String> eventsAdapter = this.NamespaceDaoAdapter.getEventsAdapter();
                String strKWHzl5 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl5);
                return (T) yhs2.invoke(strKWHzl, listDecode, listDecode2, listDecode3, eventsAdapter.decode(strKWHzl5));
            }
        });
    }

    public final AssistContent<GetNamespaces> getNamespaces(long j) {
        return getNamespaces(j, new yHS<String, List<? extends String>, List<? extends String>, List<? extends String>, List<? extends String>, GetNamespaces>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.getNamespaces.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHS
            public /* bridge */ /* synthetic */ GetNamespaces invoke(String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3, List<? extends String> list4) {
                return invoke2(str, (List<String>) list, (List<String>) list2, (List<String>) list3, (List<String>) list4);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final GetNamespaces invoke2(@NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                Intrinsics.checkNotNullParameter(list4, "");
                return new GetNamespaces(str, list, list2, list3, list4);
            }
        });
    }

    public final AssistContent<Boolean> isUpdateNamespaceRequestValid(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IsUpdateNamespaceRequestValidQuery(this, j, str, new Function1<AssetManager, Boolean>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.isUpdateNamespaceRequestValid.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                Boolean boolOLrzqt = assetManager.OLrzqt(0);
                Intrinsics.copydefault(boolOLrzqt);
                return boolOLrzqt;
            }
        });
    }

    public final void insertOrAbortNamespace(final long j, @NotNull final String str, final List<String> list, @NotNull final List<String> list2, @NotNull final List<String> list3, @NotNull final List<String> list4, final long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        getDriver().AEQbTJ(1896248463, "INSERT OR ABORT INTO NamespaceDao(session_id, key, chains, accounts, methods, events, request_id)\nVALUES (?, ?, ?,?,?, ?, ?)", 7, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.insertOrAbortNamespace.1
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
                List<String> list5 = list;
                configuration.copydefault(2, list5 != null ? this.NamespaceDaoAdapter.getChainsAdapter().encode(list5) : null);
                configuration.copydefault(3, this.NamespaceDaoAdapter.getAccountsAdapter().encode(list2));
                configuration.copydefault(4, this.NamespaceDaoAdapter.getMethodsAdapter().encode(list3));
                configuration.copydefault(5, this.NamespaceDaoAdapter.getEventsAdapter().encode(list4));
                configuration.OLrzqt(6, Long.valueOf(j2));
            }
        });
        notifyQueries(1896248463, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.insertOrAbortNamespace.2
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
                function1.invoke("NamespaceDao");
            }
        });
    }

    public final void deleteNamespacesByTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(1106900269, "DELETE FROM NamespaceDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.deleteNamespacesByTopic.1
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
        notifyQueries(1106900269, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries.deleteNamespacesByTopic.2
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
                function1.invoke("NamespaceDao");
            }
        });
    }

    public final class GetNamespacesQuery<T> extends AssistContent<T> {
        public final long session_id;
        public final /* synthetic */ NamespaceDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getSession_id() {
            return this.session_id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NamespaceDao.sq:getNamespaces";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetNamespacesQuery(NamespaceDaoQueries namespaceDaoQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = namespaceDaoQueries;
            this.session_id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"NamespaceDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"NamespaceDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1467835014, "SELECT key, chains, accounts, methods, events\nFROM NamespaceDao\nWHERE session_id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries$GetNamespacesQuery$execute$1
                public final /* synthetic */ NamespaceDaoQueries.GetNamespacesQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries$GetNamespacesQuery<? extends T> */
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

    public final class IsUpdateNamespaceRequestValidQuery<T> extends AssistContent<T> {
        public final /* synthetic */ NamespaceDaoQueries this$0;
        public final String topic;
        public final long value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "NamespaceDao.sq:isUpdateNamespaceRequestValid";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsUpdateNamespaceRequestValidQuery(NamespaceDaoQueries namespaceDaoQueries, @NotNull long j, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = namespaceDaoQueries;
            this.value = j;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"NamespaceDao", "SessionDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"NamespaceDao", "SessionDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1699224301, "SELECT ? >= (request_id / 1000)\nFROM NamespaceDao\nWHERE session_id = (\n    SELECT id\n    FROM SessionDao\n    WHERE topic = ?\n)", function1, 2, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries$IsUpdateNamespaceRequestValidQuery$execute$1
                public final /* synthetic */ NamespaceDaoQueries.IsUpdateNamespaceRequestValidQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.namespace.NamespaceDaoQueries$IsUpdateNamespaceRequestValidQuery<? extends T> */
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
                    configuration.OLrzqt(0, Long.valueOf(this.this$0.getValue()));
                    configuration.copydefault(1, this.this$0.getTopic());
                }
            });
        }
    }
}
