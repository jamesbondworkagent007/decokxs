package com.okinc.okapm.okqpl.reporter;

import com.okinc.okapm.okqpl.reporter.OkQPLReporter;
import com.okinc.okapm.okqpl.reporter.QPLReportMetricApi;
import com.okinc.okuser.data.User;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C32979mnm;
import o.C42540rWq;
import o.C42549rWz;
import o.C56391yDq;
import o.C56442yFn;
import o.C58113yvE;
import o.InterfaceC47230tmC;
import o.pUU;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter$processReport$1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends C42540rWq>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<C42540rWq> $qplRecords;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$processReport$1(OkQPLReporter okQPLReporter, List<C42540rWq> list, Continuation<? super OkQPLReporter$processReport$1> continuation) {
        super(2, continuation);
        this.this$0 = okQPLReporter;
        this.$qplRecords = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OkQPLReporter$processReport$1 okQPLReporter$processReport$1 = new OkQPLReporter$processReport$1(this.this$0, this.$qplRecords, continuation);
        okQPLReporter$processReport$1.L$0 = obj;
        return okQPLReporter$processReport$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends C42540rWq>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<C42540rWq>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<C42540rWq>> flowCollector, Continuation<? super Unit> continuation) {
        return ((OkQPLReporter$processReport$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0041 */
    /* JADX DEBUG: Type inference failed for r6v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101 A[Catch: Exception -> 0x0149, TryCatch #2 {Exception -> 0x0149, blocks: (B:45:0x00f9, B:47:0x0101, B:50:0x0113), top: B:70:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[Catch: Exception -> 0x0149, TRY_LEAVE, TryCatch #2 {Exception -> 0x0149, blocks: (B:45:0x00f9, B:47:0x0101, B:50:0x0113), top: B:70:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        String str;
        String str2;
        int i;
        Object objReportQPLEvents$default;
        ?? r7;
        Response response;
        List listEmptyList;
        FlowCollector flowCollector2;
        String uid;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        ?? r1 = 1;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strKWHzl = this.this$0.KWHzl(jCurrentTimeMillis);
                ArrayList arrayList = new ArrayList();
                User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().OLrzqt();
                if (userOLrzqt != null) {
                    try {
                        uid = userOLrzqt.getUid();
                    } catch (Exception e) {
                        e = e;
                        r1 = flowCollector3;
                        r7 = r1;
                        str = "Monitor.OkQPL";
                        str2 = "";
                        pUU.AEQbTJ(str, "error while uploading records", e);
                        listEmptyList = Collections.emptyList();
                        Intrinsics.checkNotNullExpressionValue(listEmptyList, str2);
                        this.L$0 = null;
                        this.label = 4;
                        if (r7.emit(listEmptyList, this) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    uid = null;
                }
                Iterator it = this.$qplRecords.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C42540rWq) it.next()).EZpvd());
                }
                OkQPLReporter.QplLogs qplLogs = new OkQPLReporter.QplLogs(arrayList, "release");
                pUU.EZpvd("Monitor.OkQPL", "prepared data for upload");
                String json = this.this$0.djBIcL.toJson(qplLogs);
                RequestBody.Companion companion = RequestBody.Companion;
                Intrinsics.copydefault((Object) json);
                RequestBody requestBodyCreate = companion.create(json, MediaType.Companion.get(EIP1271Verifier.mediaTypeString));
                QPLReportMetricApi qPLReportMetricApi = this.this$0.AYXKKw;
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                if (uid == null) {
                    uid = "";
                }
                String strCopydefault = C42549rWz.copydefault();
                this.L$0 = flowCollector3;
                this.label = 1;
                String strValueOf = String.valueOf(jCurrentTimeMillis);
                String str3 = strKWHzl;
                flowCollector2 = flowCollector3;
                str = "Monitor.OkQPL";
                str2 = "";
                i = 2;
                try {
                    objReportQPLEvents$default = QPLReportMetricApi.StateListAnimator.reportQPLEvents$default(qPLReportMetricApi, str3, strValueOf, uid, strCopydefault, requestBodyCreate, null, this, 32, null);
                    if (objReportQPLEvents$default == objCopydefault) {
                        return objCopydefault;
                    }
                    flowCollector = flowCollector2;
                    response = (Response) objReportQPLEvents$default;
                    if (!response.isSuccessful()) {
                    }
                } catch (Exception e2) {
                    e = e2;
                    r7 = flowCollector2;
                    pUU.AEQbTJ(str, "error while uploading records", e);
                    listEmptyList = Collections.emptyList();
                    Intrinsics.checkNotNullExpressionValue(listEmptyList, str2);
                    this.L$0 = null;
                    this.label = 4;
                    if (r7.emit(listEmptyList, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } catch (Exception e3) {
                e = e3;
                flowCollector2 = flowCollector3;
                str = "Monitor.OkQPL";
                str2 = "";
            }
        } else {
            try {
                if (i2 == 1) {
                    FlowCollector flowCollector4 = (FlowCollector) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    flowCollector = flowCollector4;
                    str = "Monitor.OkQPL";
                    str2 = "";
                    i = 2;
                    objReportQPLEvents$default = obj;
                    try {
                        response = (Response) objReportQPLEvents$default;
                        if (!response.isSuccessful()) {
                            pUU.EZpvd(str, "data has been uploaded");
                            List<C42540rWq> list = this.$qplRecords;
                            this.L$0 = flowCollector;
                            this.label = i;
                            if (flowCollector.emit(list, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            pUU.copydefault(str, "data failed to upload, response code = " + response.code() + ", message = " + response.message());
                            List listEmptyList2 = Collections.emptyList();
                            Intrinsics.checkNotNullExpressionValue(listEmptyList2, str2);
                            this.L$0 = flowCollector;
                            this.label = 3;
                            if (flowCollector.emit(listEmptyList2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r7 = flowCollector;
                        pUU.AEQbTJ(str, "error while uploading records", e);
                        listEmptyList = Collections.emptyList();
                        Intrinsics.checkNotNullExpressionValue(listEmptyList, str2);
                        this.L$0 = null;
                        this.label = 4;
                        if (r7.emit(listEmptyList, this) == objCopydefault) {
                        }
                    }
                } else if (i2 == 2 || i2 == 3) {
                    C56391yDq.AEQbTJ(obj);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e5) {
                e = e5;
                r7 = r1;
                str = "Monitor.OkQPL";
                str2 = "";
                pUU.AEQbTJ(str, "error while uploading records", e);
                listEmptyList = Collections.emptyList();
                Intrinsics.checkNotNullExpressionValue(listEmptyList, str2);
                this.L$0 = null;
                this.label = 4;
                if (r7.emit(listEmptyList, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
