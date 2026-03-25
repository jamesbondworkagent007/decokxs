package com.reown.android.internal.common.storage.rpc;

import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.sdk.storage.data.dao.JsonRpcHistoryQueries;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.yHQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class JsonRpcHistory {
    public final JsonRpcHistoryQueries jsonRpcHistoryQueries;
    public final Logger logger;

    public JsonRpcHistory(@NotNull JsonRpcHistoryQueries jsonRpcHistoryQueries, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(jsonRpcHistoryQueries, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcHistoryQueries = jsonRpcHistoryQueries;
        this.logger = logger;
    }

    public final boolean setRequest(long j, @NotNull Topic topic, @NotNull String str, @NotNull String str2, @NotNull TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(transportType, "");
        try {
            if (this.jsonRpcHistoryQueries.doesJsonRpcNotExist(j).executeAsOne().booleanValue()) {
                this.jsonRpcHistoryQueries.insertOrAbortJsonRpcHistory(j, topic.getValue(), str, str2, transportType);
                if (this.jsonRpcHistoryQueries.selectLastInsertedRowId().executeAsOne().longValue() > 0) {
                    return true;
                }
            } else {
                this.logger.error("Duplicated JsonRpc RequestId: " + j);
            }
        } catch (Exception e) {
            this.logger.error(e);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonRpcHistoryRecord updateRequestWithResponse(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JsonRpcHistoryRecord jsonRpcHistoryRecord = (JsonRpcHistoryRecord) this.jsonRpcHistoryQueries.getJsonRpcHistoryRecord(j, new JsonRpcHistory$updateRequestWithResponse$record$1(this)).executeAsOneOrNull();
        if (jsonRpcHistoryRecord != null) {
            return updateRecord(jsonRpcHistoryRecord, j, str);
        }
        this.logger.log("No JsonRpcRequest matching response");
        return null;
    }

    public final JsonRpcHistoryRecord updateRecord(JsonRpcHistoryRecord jsonRpcHistoryRecord, long j, String str) {
        if (jsonRpcHistoryRecord.getResponse() != null) {
            this.logger.log("Duplicated JsonRpc RequestId: " + j);
            return null;
        }
        this.jsonRpcHistoryQueries.updateJsonRpcHistory(str, j);
        return jsonRpcHistoryRecord;
    }

    public final void deleteRecordsByTopic(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        this.jsonRpcHistoryQueries.deleteJsonRpcHistory(topic.getValue());
    }

    public final void deleteRecordById(long j) {
        this.jsonRpcHistoryQueries.deleteJsonRpcHistoryByRequestId(j);
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.rpc.JsonRpcHistory$getListOfPendingRecordsByTopic$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C18051 extends FunctionReferenceImpl implements yHQ<Long, String, String, String, String, TransportType, JsonRpcHistoryRecord> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18051(Object obj) {
            super(6, obj, JsonRpcHistory.class, "toRecord", "toRecord(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reown/android/internal/common/model/TransportType;)Lcom/reown/android/internal/common/json_rpc/model/JsonRpcHistoryRecord;", 0);
        }

        public final JsonRpcHistoryRecord invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return ((JsonRpcHistory) this.receiver).toRecord(j, str, str2, str3, str4, transportType);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHQ
        public /* synthetic */ JsonRpcHistoryRecord invoke(Long l, String str, String str2, String str3, String str4, TransportType transportType) {
            return invoke(l.longValue(), str, str2, str3, str4, transportType);
        }
    }

    public final List<JsonRpcHistoryRecord> getListOfPendingRecordsByTopic(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        Collection collectionExecuteAsList = this.jsonRpcHistoryQueries.getJsonRpcRecordsByTopic(topic.getValue(), new C18051(this)).executeAsList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionExecuteAsList) {
            if (((JsonRpcHistoryRecord) obj).getResponse() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.rpc.JsonRpcHistory$getListOfPendingRecords$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements yHQ<Long, String, String, String, String, TransportType, JsonRpcHistoryRecord> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(6, obj, JsonRpcHistory.class, "toRecord", "toRecord(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reown/android/internal/common/model/TransportType;)Lcom/reown/android/internal/common/json_rpc/model/JsonRpcHistoryRecord;", 0);
        }

        public final JsonRpcHistoryRecord invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return ((JsonRpcHistory) this.receiver).toRecord(j, str, str2, str3, str4, transportType);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHQ
        public /* synthetic */ JsonRpcHistoryRecord invoke(Long l, String str, String str2, String str3, String str4, TransportType transportType) {
            return invoke(l.longValue(), str, str2, str3, str4, transportType);
        }
    }

    public final List<JsonRpcHistoryRecord> getListOfPendingRecords() {
        Collection collectionExecuteAsList = this.jsonRpcHistoryQueries.getJsonRpcRecords(new AnonymousClass1(this)).executeAsList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionExecuteAsList) {
            if (((JsonRpcHistoryRecord) obj).getResponse() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonRpcHistoryRecord getPendingRecordById(long j) {
        JsonRpcHistoryRecord jsonRpcHistoryRecord = (JsonRpcHistoryRecord) this.jsonRpcHistoryQueries.getJsonRpcHistoryRecord(j, new JsonRpcHistory$getPendingRecordById$record$1(this)).executeAsOneOrNull();
        if (jsonRpcHistoryRecord == null || jsonRpcHistoryRecord.getResponse() != null) {
            return null;
        }
        return jsonRpcHistoryRecord;
    }

    /* JADX INFO: renamed from: com.reown.android.internal.common.storage.rpc.JsonRpcHistory$getRecordById$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C18061 extends FunctionReferenceImpl implements yHQ<Long, String, String, String, String, TransportType, JsonRpcHistoryRecord> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C18061(Object obj) {
            super(6, obj, JsonRpcHistory.class, "toRecord", "toRecord(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reown/android/internal/common/model/TransportType;)Lcom/reown/android/internal/common/json_rpc/model/JsonRpcHistoryRecord;", 0);
        }

        public final JsonRpcHistoryRecord invoke(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, TransportType transportType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return ((JsonRpcHistory) this.receiver).toRecord(j, str, str2, str3, str4, transportType);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHQ
        public /* synthetic */ JsonRpcHistoryRecord invoke(Long l, String str, String str2, String str3, String str4, TransportType transportType) {
            return invoke(l.longValue(), str, str2, str3, str4, transportType);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: RowType */
    /* JADX WARN: Multi-variable type inference failed */
    public final JsonRpcHistoryRecord getRecordById(long j) {
        return (JsonRpcHistoryRecord) this.jsonRpcHistoryQueries.getJsonRpcHistoryRecord(j, new C18061(this)).executeAsOneOrNull();
    }

    public final JsonRpcHistoryRecord toRecord(long j, String str, String str2, String str3, String str4, TransportType transportType) {
        return new JsonRpcHistoryRecord(j, str, str2, str3, str4, transportType);
    }
}
