package com.engagelab.privates.common;

import androidx.work.WorkRequest;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentLinkedQueue<Long> f334a = new ConcurrentLinkedQueue<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f334a.size() < 10) {
            f334a.offer(Long.valueOf(jCurrentTimeMillis));
            return 0;
        }
        long jLongValue = jCurrentTimeMillis - f334a.element().longValue();
        if (jLongValue < 0) {
            f334a.clear();
            MTCommonLog.w("MTOperationBusiness", "set tags/alias failed, time shaft error，please try again");
            return MTPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        if (jLongValue <= WorkRequest.MIN_BACKOFF_MILLIS) {
            MTCommonLog.w("MTOperationBusiness", "set tags/alias too soon, over 10 times in 10s");
            return MTPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        while (f334a.size() >= 10) {
            f334a.poll();
        }
        f334a.offer(Long.valueOf(jCurrentTimeMillis));
        return 0;
    }
}
