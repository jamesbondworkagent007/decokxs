package com.okinc.biz.util;

import com.okinc.biz.util.UploadUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43292rmY;
import o.C43384roK;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadUtils$checkUploadLog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UploadUtils.StateListAnimator>, Object> {
    final /* synthetic */ Map<String, String> $headers;
    final /* synthetic */ String $url;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadUtils$checkUploadLog$2(Map<String, String> map, String str, Continuation<? super UploadUtils$checkUploadLog$2> continuation) {
        super(2, continuation);
        this.$headers = map;
        this.$url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadUtils$checkUploadLog$2(this.$headers, this.$url, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UploadUtils.StateListAnimator> continuation) {
        return ((UploadUtils$checkUploadLog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Request.Builder builder = new Request.Builder();
                Map<String, String> map = this.$headers;
                String str = this.$url;
                builder.get();
                builder.addHeader("User-Agent", C43384roK.KWHzl.copydefault());
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(builder.addHeader(entry.getKey(), entry.getValue()));
                }
                if (str != null) {
                    builder.url(str);
                } else {
                    builder.url(C43292rmY.OLrzqt.fJNWhG() + "/v2/support/app/log/checkLog");
                }
                UploadUtils uploadUtils = UploadUtils.OLrzqt;
                return uploadUtils.AEQbTJ(uploadUtils.OLrzqt().newCall(builder.build()).execute());
            } catch (Exception e) {
                pUU.AEQbTJ("UploadUtils", "checkUploadLog", e);
                return new UploadUtils.StateListAnimator(UploadUtils.UploadType.NO_NEED_UPLOAD_TYPE, false, 2, null);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
