package o;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: o.yBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56336yBp {
    private C56336yBp() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static void AEQbTJ(CountDownLatch countDownLatch, InterfaceC58217yxC interfaceC58217yxC) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            EZpvd();
            countDownLatch.await();
        } catch (java.lang.InterruptedException e) {
            interfaceC58217yxC.dispose();
            java.lang.Thread.currentThread().interrupt();
            throw new java.lang.IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }

    public static void EZpvd() {
        if (yBG.EZpvd()) {
            if ((java.lang.Thread.currentThread() instanceof yAV) || yBG.copydefault()) {
                throw new java.lang.IllegalStateException("Attempt to block on a Scheduler " + java.lang.Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
