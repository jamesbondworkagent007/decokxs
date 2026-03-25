package o;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: o.yzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58361yzo {
    private C58361yzo() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> void AEQbTJ(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        interfaceC58256yxp.onSubscribe(blockingObserver);
        interfaceC58255yxo.subscribe(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            java.lang.Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (java.lang.InterruptedException e) {
                    blockingObserver.dispose();
                    interfaceC58256yxp.onError(e);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || objPoll == BlockingObserver.TERMINATED || NotificationLite.acceptFull(objPoll, interfaceC58256yxp)) {
                return;
            }
        }
    }

    public static <T> void EZpvd(InterfaceC58255yxo<? extends T> interfaceC58255yxo) {
        C56335yBo c56335yBo = new C56335yBo();
        LambdaObserver lambdaObserver = new LambdaObserver(Functions.KWHzl(), c56335yBo, c56335yBo, Functions.KWHzl());
        interfaceC58255yxo.subscribe(lambdaObserver);
        C56336yBp.AEQbTJ(c56335yBo, lambdaObserver);
        java.lang.Throwable th = c56335yBo.AEQbTJ;
        if (th != null) {
            throw ExceptionHelper.AEQbTJ(th);
        }
    }

    public static <T> void KWHzl(InterfaceC58255yxo<? extends T> interfaceC58255yxo, InterfaceC58227yxM<? super T> interfaceC58227yxM, InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2, InterfaceC58222yxH interfaceC58222yxH) {
        C58297yyd.AEQbTJ(interfaceC58227yxM, "onNext is null");
        C58297yyd.AEQbTJ(interfaceC58227yxM2, "onError is null");
        C58297yyd.AEQbTJ(interfaceC58222yxH, "onComplete is null");
        AEQbTJ(interfaceC58255yxo, new LambdaObserver(interfaceC58227yxM, interfaceC58227yxM2, interfaceC58222yxH, Functions.KWHzl()));
    }
}
