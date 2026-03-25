package o;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: o.yyD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58271yyD {
    private C58271yyD() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> void copydefault(InterfaceC60096zvd<? extends T> interfaceC60096zvd, InterfaceC60097zve<? super T> interfaceC60097zve) {
        java.lang.Object objPoll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        interfaceC60096zvd.subscribe(blockingSubscriber);
        do {
            try {
                if (blockingSubscriber.isCancelled()) {
                    return;
                }
                objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.isCancelled()) {
                        return;
                    }
                    C56336yBp.EZpvd();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.isCancelled() || objPoll == BlockingSubscriber.TERMINATED) {
                    return;
                }
            } catch (java.lang.InterruptedException e) {
                blockingSubscriber.cancel();
                interfaceC60097zve.onError(e);
                return;
            }
        } while (!NotificationLite.acceptFull(objPoll, interfaceC60097zve));
    }

    public static <T> void copydefault(InterfaceC60096zvd<? extends T> interfaceC60096zvd, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        copydefault(interfaceC60096zvd, new LambdaSubscriber(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, Functions.AkhnZx));
    }
}
