package com.reown.android.sdk.storage.data.dao;

import com.reown.android.internal.common.model.TransportType;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryDao;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AssetManager;
import o.AssistContent;
import o.Configuration;
import o.ContentResolver;
import o.IntentSender;
import o.PackageManager;
import o.PictureInPictureParams;
import o.VoiceInteractor;
import o.yHQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcHistoryQueries extends ContentResolver {
    public final JsonRpcHistoryDao.Adapter JsonRpcHistoryDaoAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonRpcHistoryQueries(@NotNull PackageManager packageManager, @NotNull JsonRpcHistoryDao.Adapter adapter) {
        super(packageManager);
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        this.JsonRpcHistoryDaoAdapter = adapter;
    }

    public final <T> AssistContent<T> getJsonRpcHistoryRecord(long j, @NotNull final yHQ<? super Long, ? super String, ? super String, ? super String, ? super String, ? super TransportType, ? extends T> yhq) {
        Intrinsics.checkNotNullParameter(yhq, "");
        return new GetJsonRpcHistoryRecordQuery(this, j, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcHistoryRecord.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super com.reown.android.internal.common.model.TransportType, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHQ<Long, String, String, String, String, TransportType, T> yhq2 = yhq;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                String strKWHzl5 = assetManager.KWHzl(5);
                return yhq2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5 != null ? this.JsonRpcHistoryDaoAdapter.getTransport_typeAdapter().decode(strKWHzl5) : null);
            }
        });
    }

    public final AssistContent<GetJsonRpcHistoryRecord> getJsonRpcHistoryRecord(long j) {
        return getJsonRpcHistoryRecord(j, new yHQ<Long, String, String, String, String, TransportType, GetJsonRpcHistoryRecord>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcHistoryRecord.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHQ
            public /* synthetic */ GetJsonRpcHistoryRecord invoke(Long l, String str, String str2, String str3, String str4, TransportType transportType) {
                return invoke(l.longValue(), str, str2, str3, str4, transportType);
            }

            public final GetJsonRpcHistoryRecord invoke(long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                return new GetJsonRpcHistoryRecord(j2, str, str2, str3, str4, transportType);
            }
        });
    }

    public final <T> AssistContent<T> getJsonRpcRecordsByTopic(@NotNull String str, @NotNull final yHQ<? super Long, ? super String, ? super String, ? super String, ? super String, ? super TransportType, ? extends T> yhq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yhq, "");
        return new GetJsonRpcRecordsByTopicQuery(this, str, new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcRecordsByTopic.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super com.reown.android.internal.common.model.TransportType, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHQ<Long, String, String, String, String, TransportType, T> yhq2 = yhq;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                String strKWHzl5 = assetManager.KWHzl(5);
                return yhq2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5 != null ? this.JsonRpcHistoryDaoAdapter.getTransport_typeAdapter().decode(strKWHzl5) : null);
            }
        });
    }

    public final AssistContent<GetJsonRpcRecordsByTopic> getJsonRpcRecordsByTopic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return getJsonRpcRecordsByTopic(str, new yHQ<Long, String, String, String, String, TransportType, GetJsonRpcRecordsByTopic>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcRecordsByTopic.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHQ
            public /* synthetic */ GetJsonRpcRecordsByTopic invoke(Long l, String str2, String str3, String str4, String str5, TransportType transportType) {
                return invoke(l.longValue(), str2, str3, str4, str5, transportType);
            }

            public final GetJsonRpcRecordsByTopic invoke(long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, TransportType transportType) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new GetJsonRpcRecordsByTopic(j, str2, str3, str4, str5, transportType);
            }
        });
    }

    public final <T> AssistContent<T> getJsonRpcRecords(@NotNull final yHQ<? super Long, ? super String, ? super String, ? super String, ? super String, ? super TransportType, ? extends T> yhq) {
        Intrinsics.checkNotNullParameter(yhq, "");
        return VoiceInteractor.OLrzqt(-1374020776, new String[]{"JsonRpcHistoryDao"}, getDriver(), "JsonRpcHistory.sq", "getJsonRpcRecords", "SELECT request_id, topic, method, body, response, transport_type\nFROM JsonRpcHistoryDao", new Function1<AssetManager, T>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcRecords.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yHQ<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super com.reown.android.internal.common.model.TransportType, ? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final T invoke(@NotNull AssetManager assetManager) {
                Intrinsics.checkNotNullParameter(assetManager, "");
                yHQ<Long, String, String, String, String, TransportType, T> yhq2 = yhq;
                Long lEZpvd = assetManager.EZpvd(0);
                Intrinsics.copydefault(lEZpvd);
                String strKWHzl = assetManager.KWHzl(1);
                Intrinsics.copydefault((Object) strKWHzl);
                String strKWHzl2 = assetManager.KWHzl(2);
                Intrinsics.copydefault((Object) strKWHzl2);
                String strKWHzl3 = assetManager.KWHzl(3);
                Intrinsics.copydefault((Object) strKWHzl3);
                String strKWHzl4 = assetManager.KWHzl(4);
                String strKWHzl5 = assetManager.KWHzl(5);
                return yhq2.invoke(lEZpvd, strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, strKWHzl5 != null ? this.JsonRpcHistoryDaoAdapter.getTransport_typeAdapter().decode(strKWHzl5) : null);
            }
        });
    }

    public final AssistContent<GetJsonRpcRecords> getJsonRpcRecords() {
        return getJsonRpcRecords(new yHQ<Long, String, String, String, String, TransportType, GetJsonRpcRecords>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.getJsonRpcRecords.2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHQ
            public /* synthetic */ GetJsonRpcRecords invoke(Long l, String str, String str2, String str3, String str4, TransportType transportType) {
                return invoke(l.longValue(), str, str2, str3, str4, transportType);
            }

            public final GetJsonRpcRecords invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                return new GetJsonRpcRecords(j, str, str2, str3, str4, transportType);
            }
        });
    }

    public final AssistContent<Boolean> doesJsonRpcNotExist(long j) {
        return new DoesJsonRpcNotExistQuery(this, j, new Function1<AssetManager, Boolean>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.doesJsonRpcNotExist.1
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

    public final PictureInPictureParams<Long> selectLastInsertedRowId() {
        return VoiceInteractor.AEQbTJ(-1493166392, getDriver(), "JsonRpcHistory.sq", "selectLastInsertedRowId", "SELECT last_insert_rowid()", new Function1<AssetManager, Long>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.selectLastInsertedRowId.1
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

    public final void insertOrAbortJsonRpcHistory(final long j, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, final TransportType transportType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        getDriver().AEQbTJ(-1670151256, "INSERT OR ABORT INTO JsonRpcHistoryDao (request_id, topic, method, body, transport_type)\nVALUES (?, ?, ?, ?, ?)", 5, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.insertOrAbortJsonRpcHistory.1
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
                configuration.copydefault(3, str3);
                TransportType transportType2 = transportType;
                configuration.copydefault(4, transportType2 != null ? this.JsonRpcHistoryDaoAdapter.getTransport_typeAdapter().encode(transportType2) : null);
            }
        });
        notifyQueries(-1670151256, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.insertOrAbortJsonRpcHistory.2
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
                function1.invoke("JsonRpcHistoryDao");
            }
        });
    }

    public final void updateJsonRpcHistory(final String str, final long j) {
        getDriver().AEQbTJ(-510549181, "UPDATE JsonRpcHistoryDao\nSET response = ?\nWHERE request_id = ?", 2, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.updateJsonRpcHistory.1
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
            }
        });
        notifyQueries(-510549181, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.updateJsonRpcHistory.2
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
                function1.invoke("JsonRpcHistoryDao");
            }
        });
    }

    public final void deleteJsonRpcHistory(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getDriver().AEQbTJ(280411301, "DELETE FROM JsonRpcHistoryDao\nWHERE topic = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.deleteJsonRpcHistory.1
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
        notifyQueries(280411301, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.deleteJsonRpcHistory.2
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
                function1.invoke("JsonRpcHistoryDao");
            }
        });
    }

    public final void deleteJsonRpcHistoryByRequestId(final long j) {
        getDriver().AEQbTJ(1727437710, "DELETE FROM JsonRpcHistoryDao\nWHERE request_id = ?", 1, new Function1<Configuration, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.deleteJsonRpcHistoryByRequestId.1
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
        notifyQueries(1727437710, new Function1<Function1<? super String, ? extends Unit>, Unit>() { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries.deleteJsonRpcHistoryByRequestId.2
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
                function1.invoke("JsonRpcHistoryDao");
            }
        });
    }

    public final class GetJsonRpcHistoryRecordQuery<T> extends AssistContent<T> {
        public final long request_id;
        public final /* synthetic */ JsonRpcHistoryQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getRequest_id() {
            return this.request_id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "JsonRpcHistory.sq:getJsonRpcHistoryRecord";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetJsonRpcHistoryRecordQuery(JsonRpcHistoryQueries jsonRpcHistoryQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = jsonRpcHistoryQueries;
            this.request_id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(1274335899, "SELECT request_id, topic, method, body, response, transport_type\nFROM JsonRpcHistoryDao\nWHERE  request_id = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$GetJsonRpcHistoryRecordQuery$execute$1
                public final /* synthetic */ JsonRpcHistoryQueries.GetJsonRpcHistoryRecordQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$GetJsonRpcHistoryRecordQuery<? extends T> */
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

    public final class GetJsonRpcRecordsByTopicQuery<T> extends AssistContent<T> {
        public final /* synthetic */ JsonRpcHistoryQueries this$0;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "JsonRpcHistory.sq:getJsonRpcRecordsByTopic";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetJsonRpcRecordsByTopicQuery(@NotNull JsonRpcHistoryQueries jsonRpcHistoryQueries, @NotNull String str, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = jsonRpcHistoryQueries;
            this.topic = str;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(208828576, "SELECT request_id, topic, method, body, response, transport_type\nFROM JsonRpcHistoryDao\nWHERE topic = ?", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$GetJsonRpcRecordsByTopicQuery$execute$1
                public final /* synthetic */ JsonRpcHistoryQueries.GetJsonRpcRecordsByTopicQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$GetJsonRpcRecordsByTopicQuery<? extends T> */
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

    public final class DoesJsonRpcNotExistQuery<T> extends AssistContent<T> {
        public final long request_id;
        public final /* synthetic */ JsonRpcHistoryQueries this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getRequest_id() {
            return this.request_id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "JsonRpcHistory.sq:doesJsonRpcNotExist";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoesJsonRpcNotExistQuery(JsonRpcHistoryQueries jsonRpcHistoryQueries, @NotNull long j, Function1<? super AssetManager, ? extends T> function1) {
            super(function1);
            Intrinsics.checkNotNullParameter(function1, "");
            this.this$0 = jsonRpcHistoryQueries;
            this.request_id = j;
        }

        @Override // o.AssistContent
        public void addListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().AEQbTJ(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.AssistContent
        public void removeListener(@NotNull AssistContent.TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.this$0.getDriver().OLrzqt(new String[]{"JsonRpcHistoryDao"}, taskDescription);
        }

        @Override // o.PictureInPictureParams
        public <R> IntentSender<R> execute(@NotNull Function1<? super AssetManager, ? extends IntentSender<R>> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return this.this$0.getDriver().OLrzqt(495001253, "SELECT NOT EXISTS (\n    SELECT 1\n    FROM JsonRpcHistoryDao\n    WHERE request_id = ?\n    LIMIT 1\n)", function1, 1, new Function1<Configuration, Unit>(this) { // from class: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$DoesJsonRpcNotExistQuery$execute$1
                public final /* synthetic */ JsonRpcHistoryQueries.DoesJsonRpcNotExistQuery<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries$DoesJsonRpcNotExistQuery<? extends T> */
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
}
