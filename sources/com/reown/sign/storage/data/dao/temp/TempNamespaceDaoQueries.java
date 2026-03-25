package com.reown.sign.storage.data.dao.temp;

import com.reown.sign.storage.data.dao.temp.TempNamespaceDao;
import com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries;
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
import o.yHQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TempNamespaceDaoQueries extends ContentResolver {
    public final TempNamespaceDao.Adapter TempNamespaceDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempNamespaceDaoQueries(@NotNull PackageManager packageManager, @NotNull TempNamespaceDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.TempNamespaceDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getTempNamespacesByRequestId(long j, @NotNull final yHQ<? super Long, ? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> yhq) {
        Intrinsics.checkNotNullParameter(yhq, "");
        return new GetTempNamespacesByRequestIdQuery(this, j, new Function1<AssetManager, T>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.getTempNamespacesByRequestId.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super java.lang.Long, ? super java.lang.String, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHQ<Long, String, List<String>, List<String>, List<String>, List<String>, T> yhq2 = yhq;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                List<String> listDecode = strKWHzl2 != null ? this.TempNamespaceDaoAdapter.getChainsAdapter().decode(strKWHzl2) : null;
                LoaderManager<List<String>, String> accountsAdapter = this.TempNamespaceDaoAdapter.getAccountsAdapter();
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                List<String> listDecode2 = accountsAdapter.decode(strKWHzl3);
                LoaderManager<List<String>, String> methodsAdapter = this.TempNamespaceDaoAdapter.getMethodsAdapter();
                String strKWHzl4 = assetManager.KWHzl(4);
                Intrinsics.copydefault((Object) strKWHzl4);
                List<String> listDecode3 = methodsAdapter.decode(strKWHzl4);
                LoaderManager<List<String>, String> eventsAdapter = this.TempNamespaceDaoAdapter.getEventsAdapter();
                String strKWHzl5 = assetManager.KWHzl(5);
                Intrinsics.copydefault((Object) strKWHzl5);
                return (T) yhq2.invoke(lEZpvd, strKWHzl, listDecode, listDecode2, listDecode3, eventsAdapter.decode(strKWHzl5));
            }
        });
    }

    public final AssistContent<GetTempNamespacesByRequestId> getTempNamespacesByRequestId(long j) {
        return getTempNamespacesByRequestId(j, new yHQ<Long, String, List<? extends String>, List<? extends String>, List<? extends String>, List<? extends String>, GetTempNamespacesByRequestId>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.getTempNamespacesByRequestId.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHQ
            public /* synthetic */ GetTempNamespacesByRequestId invoke(Long l, String str, List<? extends String> list, List<? extends String> list2, List<? extends String> list3, List<? extends String> list4) {
                return invoke(l.longValue(), str, (List<String>) list, (List<String>) list2, (List<String>) list3, (List<String>) list4);
            }

            public final GetTempNamespacesByRequestId invoke(long j2, @NotNull String str, List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                Intrinsics.checkNotNullParameter(list4, "");
                return new GetTempNamespacesByRequestId(j2, str, list, list2, list3, list4);
            }
        });
    }

    public final AssistContent<Boolean> isUpdateNamespaceRequestValid(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IsUpdateNamespaceRequestValidQuery(this, str, j, new Function1<AssetManager, Boolean>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.isUpdateNamespaceRequestValid.1
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

    public final void insertOrAbortNamespace(final long j, @NotNull final String str, @NotNull final String str2, final List<String> list, @NotNull final List<String> list2, @NotNull final List<String> list3, @NotNull final List<String> list4, final Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        getDriver().AEQbTJ(1383279906, "INSERT OR ABORT INTO TempNamespaceDao(session_id, topic, key, chains, accounts, methods, events, request_id)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?)", 8, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.insertOrAbortNamespace.1
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
                configuration.copydefault(2, str2);
                List<String> list5 = list;
                configuration.copydefault(3, list5 != null ? this.TempNamespaceDaoAdapter.getChainsAdapter().encode(list5) : null);
                configuration.copydefault(4, this.TempNamespaceDaoAdapter.getAccountsAdapter().encode(list2));
                configuration.copydefault(5, this.TempNamespaceDaoAdapter.getMethodsAdapter().encode(list3));
                configuration.copydefault(6, this.TempNamespaceDaoAdapter.getEventsAdapter().encode(list4));
                configuration.OLrzqt(7, l);
            }
        });
        notifyQueries(1383279906, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.insertOrAbortNamespace.2
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
                function1.invoke("TempNamespaceDao");
            }
        });
    }

    public final void markNamespaceAcknowledged(final long j) {
        getDriver().AEQbTJ(60190747, "UPDATE TempNamespaceDao\nSET isAcknowledged = 1\nWHERE request_id = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.markNamespaceAcknowledged.1
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
            }
        });
        notifyQueries(60190747, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.markNamespaceAcknowledged.2
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
                function1.invoke("TempNamespaceDao");
            }
        });
    }

    public final void deleteTempNamespacesByRequestId(final long j) {
        getDriver().AEQbTJ(1755505633, "DELETE FROM TempNamespaceDao\nWHERE request_id = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.deleteTempNamespacesByRequestId.1
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
            }
        });
        notifyQueries(1755505633, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.deleteTempNamespacesByRequestId.2
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
                function1.invoke("TempNamespaceDao");
            }
        });
    }

    public final void deleteTempNamespacesByTopic(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(-1170956154, "DELETE FROM TempNamespaceDao\nWHERE topic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.deleteTempNamespacesByTopic.1
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
        notifyQueries(-1170956154, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries.deleteTempNamespacesByTopic.2
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
                function1.invoke("TempNamespaceDao");
            }
        });
    }

    public final class GetTempNamespacesByRequestIdQuery<T> extends AssistContent<T> {
        public final long request_id;
        public final /* synthetic */ TempNamespaceDaoQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getRequest_id() {
            return this.request_id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TempNamespaceDao.sq:getTempNamespacesByRequestId";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTempNamespacesByRequestIdQuery(TempNamespaceDaoQueries tempNamespaceDaoQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = tempNamespaceDaoQueries;
            this.request_id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"TempNamespaceDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"TempNamespaceDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-817201940, "SELECT session_id, key, chains, accounts, methods, events\nFROM TempNamespaceDao\nWHERE request_id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries$GetTempNamespacesByRequestIdQuery$execute$1
                public final /* synthetic */ TempNamespaceDaoQueries.GetTempNamespacesByRequestIdQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries$GetTempNamespacesByRequestIdQuery<? extends T> */
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
                    configuration.OLrzqt(0, Long.valueOf(this.this$0.getRequest_id()));
                }
            });
        }
    }

    public final class IsUpdateNamespaceRequestValidQuery<T> extends AssistContent<T> {
        public final /* synthetic */ TempNamespaceDaoQueries this$0;
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
            return "TempNamespaceDao.sq:isUpdateNamespaceRequestValid";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IsUpdateNamespaceRequestValidQuery(@NotNull TempNamespaceDaoQueries tempNamespaceDaoQueries, String str, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = tempNamespaceDaoQueries;
            this.topic = str;
            this.value = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"TempNamespaceDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"TempNamespaceDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(-790026502, "SELECT COUNT(*) = 0\nFROM TempNamespaceDao\nWHERE topic = ? AND request_id / 1000 >= ? AND isAcknowledged = 1", function1, 2, new Function1<Configuration, Unit>(this) { // from class: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries$IsUpdateNamespaceRequestValidQuery$execute$1
                public final /* synthetic */ TempNamespaceDaoQueries.IsUpdateNamespaceRequestValidQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.sign.storage.data.dao.temp.TempNamespaceDaoQueries$IsUpdateNamespaceRequestValidQuery<? extends T> */
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
                    configuration.OLrzqt(1, Long.valueOf(this.this$0.getValue()));
                }
            });
        }
    }
}
