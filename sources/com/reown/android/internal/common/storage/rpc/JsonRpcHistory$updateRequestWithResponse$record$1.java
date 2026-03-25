package com.reown.android.internal.common.storage.rpc;

import com.reown.android.internal.common.json_rpc.model.JsonRpcHistoryRecord;
import com.reown.android.internal.common.model.TransportType;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.yHQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class JsonRpcHistory$updateRequestWithResponse$record$1 extends FunctionReferenceImpl implements yHQ<Long, String, String, String, String, TransportType, JsonRpcHistoryRecord> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonRpcHistory$updateRequestWithResponse$record$1(Object obj) {
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
