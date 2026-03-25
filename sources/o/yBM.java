package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C56338yBr;

/* JADX INFO: loaded from: classes13.dex */
public final class yBM<T> extends yBU<T> {
    public final Lock AYXKKw;
    public final AtomicReference<java.lang.Throwable> AhwBna;
    public final ReadWriteLock KWHzl;
    public long OLrzqt;
    public final Lock djBIcL;
    public final AtomicReference<java.lang.Object> gEmmrt;
    public final AtomicReference<Activity<T>[]> valueOf;
    public static final java.lang.Object[] copydefault = new java.lang.Object[0];
    public static final Activity[] EZpvd = new Activity[0];
    public static final Activity[] AEQbTJ = new Activity[0];

    public static <T> yBM<T> AEQbTJ() {
        return new yBM<>();
    }

    public yBM() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.KWHzl = reentrantReadWriteLock;
        this.AYXKKw = reentrantReadWriteLock.readLock();
        this.djBIcL = reentrantReadWriteLock.writeLock();
        this.valueOf = new AtomicReference<>(EZpvd);
        this.gEmmrt = new AtomicReference<>();
        this.AhwBna = new AtomicReference<>();
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super T> interfaceC58256yxp) {
        Activity<T> activity = new Activity<>(interfaceC58256yxp, this);
        interfaceC58256yxp.onSubscribe(activity);
        if (copydefault(activity)) {
            if (activity.EZpvd) {
                OLrzqt((Activity) activity);
                return;
            } else {
                activity.AEQbTJ();
                return;
            }
        }
        java.lang.Throwable th = this.AhwBna.get();
        if (th == ExceptionHelper.OLrzqt) {
            interfaceC58256yxp.onComplete();
        } else {
            interfaceC58256yxp.onError(th);
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
        if (this.AhwBna.get() != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onNext(T t) {
        C58297yyd.AEQbTJ((java.lang.Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.AhwBna.get() != null) {
            return;
        }
        java.lang.Object next = NotificationLite.next(t);
        AEQbTJ(next);
        for (Activity<T> activity : this.valueOf.get()) {
            activity.OLrzqt(next, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onError(java.lang.Throwable th) {
        C58297yyd.AEQbTJ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.AhwBna, null, th)) {
            yBG.copydefault(th);
            return;
        }
        java.lang.Object objError = NotificationLite.error(th);
        for (Activity<T> activity : OLrzqt(objError)) {
            activity.OLrzqt(objError, this.OLrzqt);
        }
    }

    @Override // o.InterfaceC58256yxp
    public void onComplete() {
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.AhwBna, null, ExceptionHelper.OLrzqt)) {
            java.lang.Object objComplete = NotificationLite.complete();
            for (Activity<T> activity : OLrzqt(objComplete)) {
                activity.OLrzqt(objComplete, this.OLrzqt);
            }
        }
    }

    public boolean copydefault(Activity<T> activity) {
        Activity<T>[] activityArr;
        Activity[] activityArr2;
        do {
            activityArr = this.valueOf.get();
            if (activityArr == AEQbTJ) {
                return false;
            }
            int length = activityArr.length;
            activityArr2 = new Activity[length + 1];
            java.lang.System.arraycopy(activityArr, 0, activityArr2, 0, length);
            activityArr2[length] = activity;
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.valueOf, activityArr, activityArr2));
        return true;
    }

    public void OLrzqt(Activity<T> activity) {
        Activity<T>[] activityArr;
        Activity[] activityArr2;
        do {
            activityArr = this.valueOf.get();
            int length = activityArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (activityArr[i] == activity) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                activityArr2 = EZpvd;
            } else {
                Activity[] activityArr3 = new Activity[length - 1];
                java.lang.System.arraycopy(activityArr, 0, activityArr3, 0, i);
                java.lang.System.arraycopy(activityArr, i + 1, activityArr3, i, (length - i) - 1);
                activityArr2 = activityArr3;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.valueOf, activityArr, activityArr2));
    }

    public Activity<T>[] OLrzqt(java.lang.Object obj) {
        AtomicReference<Activity<T>[]> atomicReference = this.valueOf;
        Activity<T>[] activityArr = AEQbTJ;
        Activity<T>[] andSet = atomicReference.getAndSet(activityArr);
        if (andSet != activityArr) {
            AEQbTJ(obj);
        }
        return andSet;
    }

    public void AEQbTJ(java.lang.Object obj) {
        this.djBIcL.lock();
        this.OLrzqt++;
        this.gEmmrt.lazySet(obj);
        this.djBIcL.unlock();
    }

    public static final class Activity<T> implements InterfaceC58217yxC, C56338yBr.Application<java.lang.Object> {
        public long AEQbTJ;
        public C56338yBr<java.lang.Object> AhwBna;
        public volatile boolean EZpvd;
        public boolean KWHzl;
        public boolean OLrzqt;
        public final InterfaceC58256yxp<? super T> copydefault;
        public final yBM<T> gEmmrt;
        public boolean valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.EZpvd;
        }

        public Activity(InterfaceC58256yxp<? super T> interfaceC58256yxp, yBM<T> ybm) {
            this.copydefault = interfaceC58256yxp;
            this.gEmmrt = ybm;
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.EZpvd) {
                return;
            }
            this.EZpvd = true;
            this.gEmmrt.OLrzqt((Activity) this);
        }

        public void AEQbTJ() {
            if (this.EZpvd) {
                return;
            }
            synchronized (this) {
                if (this.EZpvd) {
                    return;
                }
                if (this.valueOf) {
                    return;
                }
                yBM<T> ybm = this.gEmmrt;
                Lock lock = ybm.AYXKKw;
                lock.lock();
                this.AEQbTJ = ybm.OLrzqt;
                java.lang.Object obj = ybm.gEmmrt.get();
                lock.unlock();
                this.KWHzl = obj != null;
                this.valueOf = true;
                if (obj == null || test(obj)) {
                    return;
                }
                EZpvd();
            }
        }

        public void OLrzqt(java.lang.Object obj, long j) {
            if (this.EZpvd) {
                return;
            }
            if (!this.OLrzqt) {
                synchronized (this) {
                    if (this.EZpvd) {
                        return;
                    }
                    if (this.AEQbTJ == j) {
                        return;
                    }
                    if (this.KWHzl) {
                        C56338yBr<java.lang.Object> c56338yBr = this.AhwBna;
                        if (c56338yBr == null) {
                            c56338yBr = new C56338yBr<>(4);
                            this.AhwBna = c56338yBr;
                        }
                        c56338yBr.copydefault(obj);
                        return;
                    }
                    this.valueOf = true;
                    this.OLrzqt = true;
                }
            }
            test(obj);
        }

        @Override // o.C56338yBr.Application, o.InterfaceC58239yxY
        public boolean test(java.lang.Object obj) {
            return this.EZpvd || NotificationLite.accept(obj, this.copydefault);
        }

        public void EZpvd() {
            C56338yBr<java.lang.Object> c56338yBr;
            while (!this.EZpvd) {
                synchronized (this) {
                    c56338yBr = this.AhwBna;
                    if (c56338yBr == null) {
                        this.KWHzl = false;
                        return;
                    }
                    this.AhwBna = null;
                }
                c56338yBr.EZpvd(this);
            }
        }
    }
}
