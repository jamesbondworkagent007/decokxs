package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public final class yAC<T, B, V> extends AbstractC58349yzc<T, AbstractC58247yxg<T>> {
    public final int AEQbTJ;
    public final InterfaceC58255yxo<B> KWHzl;
    public final InterfaceC58229yxO<? super B, ? extends InterfaceC58255yxo<V>> copydefault;

    public yAC(InterfaceC58255yxo<T> interfaceC58255yxo, InterfaceC58255yxo<B> interfaceC58255yxo2, InterfaceC58229yxO<? super B, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, int i) {
        super(interfaceC58255yxo);
        this.KWHzl = interfaceC58255yxo2;
        this.copydefault = interfaceC58229yxO;
        this.AEQbTJ = i;
    }

    @Override // o.AbstractC58247yxg
    public void subscribeActual(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp) {
        this.OLrzqt.subscribe(new StateListAnimator(new yBE(interfaceC58256yxp), this.KWHzl, this.copydefault, this.AEQbTJ));
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<T, B, V> extends AbstractC58316yyw<T, java.lang.Object, AbstractC58247yxg<T>> implements InterfaceC58217yxC {
        public final AtomicReference<InterfaceC58217yxC> AYXKKw;
        public final InterfaceC58255yxo<B> AhwBna;
        public final C58216yxB AkhnZx;
        public InterfaceC58217yxC DbNXlk;
        public final AtomicBoolean fetchVPNInfo;
        public final InterfaceC58229yxO<? super B, ? extends InterfaceC58255yxo<V>> gEmmrt;
        public final AtomicLong isConnected;
        public final int valueOf;
        public final java.util.List<UnicastSubject<T>> values;

        @Override // o.AbstractC58316yyw, o.InterfaceC56342yBv
        public void copydefault(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp, java.lang.Object obj) {
        }

        public StateListAnimator(InterfaceC58256yxp<? super AbstractC58247yxg<T>> interfaceC58256yxp, InterfaceC58255yxo<B> interfaceC58255yxo, InterfaceC58229yxO<? super B, ? extends InterfaceC58255yxo<V>> interfaceC58229yxO, int i) {
            super(interfaceC58256yxp, new MpscLinkedQueue());
            this.AYXKKw = new AtomicReference<>();
            AtomicLong atomicLong = new AtomicLong();
            this.isConnected = atomicLong;
            this.fetchVPNInfo = new AtomicBoolean();
            this.AhwBna = interfaceC58255yxo;
            this.gEmmrt = interfaceC58229yxO;
            this.valueOf = i;
            this.AkhnZx = new C58216yxB();
            this.values = new java.util.ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // o.InterfaceC58256yxp
        public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            if (DisposableHelper.validate(this.DbNXlk, interfaceC58217yxC)) {
                this.DbNXlk = interfaceC58217yxC;
                this.OLrzqt.onSubscribe(this);
                if (this.fetchVPNInfo.get()) {
                    return;
                }
                Activity activity = new Activity(this);
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.AYXKKw, null, activity)) {
                    this.AhwBna.subscribe(activity);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // o.InterfaceC58256yxp
        public void onNext(T t) {
            if (OLrzqt()) {
                java.util.Iterator<UnicastSubject<T>> it = this.values.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (AEQbTJ(-1) == 0) {
                    return;
                }
            } else {
                this.EZpvd.offer((U) NotificationLite.next(t));
                if (!KWHzl()) {
                    return;
                }
            }
            AYXKKw();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.copydefault) {
                yBG.copydefault(th);
                return;
            }
            this.AEQbTJ = th;
            this.copydefault = true;
            if (KWHzl()) {
                AYXKKw();
            }
            if (this.isConnected.decrementAndGet() == 0) {
                this.AkhnZx.dispose();
            }
            this.OLrzqt.onError(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            if (KWHzl()) {
                AYXKKw();
            }
            if (this.isConnected.decrementAndGet() == 0) {
                this.AkhnZx.dispose();
            }
            this.OLrzqt.onComplete();
        }

        public void OLrzqt(java.lang.Throwable th) {
            this.DbNXlk.dispose();
            this.AkhnZx.dispose();
            onError(th);
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.fetchVPNInfo.compareAndSet(false, true)) {
                DisposableHelper.dispose(this.AYXKKw);
                if (this.isConnected.decrementAndGet() == 0) {
                    this.DbNXlk.dispose();
                }
            }
        }

        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.fetchVPNInfo.get();
        }

        public void djBIcL() {
            this.AkhnZx.dispose();
            DisposableHelper.dispose(this.AYXKKw);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: io.reactivex.subjects.UnicastSubject */
        /* JADX WARN: Multi-variable type inference failed */
        public void AYXKKw() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.EZpvd;
            InterfaceC58256yxp<? super V> interfaceC58256yxp = this.OLrzqt;
            java.util.List<UnicastSubject<T>> list = this.values;
            int iAEQbTJ = 1;
            while (true) {
                boolean z = this.copydefault;
                java.lang.Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    djBIcL();
                    java.lang.Throwable th = this.AEQbTJ;
                    if (th != null) {
                        java.util.Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (objPoll instanceof ActionBar) {
                        ActionBar actionBar = (ActionBar) objPoll;
                        UnicastSubject<T> unicastSubject = actionBar.OLrzqt;
                        if (unicastSubject != null) {
                            if (list.remove(unicastSubject)) {
                                actionBar.OLrzqt.onComplete();
                                if (this.isConnected.decrementAndGet() == 0) {
                                    djBIcL();
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.fetchVPNInfo.get()) {
                            UnicastSubject<T> unicastSubjectAEQbTJ = UnicastSubject.AEQbTJ(this.valueOf);
                            list.add(unicastSubjectAEQbTJ);
                            interfaceC58256yxp.onNext(unicastSubjectAEQbTJ);
                            try {
                                InterfaceC58255yxo interfaceC58255yxo = (InterfaceC58255yxo) C58297yyd.AEQbTJ(this.gEmmrt.apply(actionBar.EZpvd), "The ObservableSource supplied is null");
                                TaskDescription taskDescription = new TaskDescription(this, unicastSubjectAEQbTJ);
                                if (this.AkhnZx.AEQbTJ(taskDescription)) {
                                    this.isConnected.getAndIncrement();
                                    interfaceC58255yxo.subscribe(taskDescription);
                                }
                            } catch (java.lang.Throwable th2) {
                                C58218yxD.AEQbTJ(th2);
                                this.fetchVPNInfo.set(true);
                                interfaceC58256yxp.onError(th2);
                            }
                        }
                    } else {
                        java.util.Iterator<UnicastSubject<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(NotificationLite.getValue(objPoll));
                        }
                    }
                } else {
                    iAEQbTJ = AEQbTJ(-iAEQbTJ);
                    if (iAEQbTJ == 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void OLrzqt(B b) {
            this.EZpvd.offer((U) new ActionBar(null, b));
            if (KWHzl()) {
                AYXKKw();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void OLrzqt(TaskDescription<T, V> taskDescription) {
            this.AkhnZx.OLrzqt(taskDescription);
            this.EZpvd.offer((U) new ActionBar(taskDescription.EZpvd, null));
            if (KWHzl()) {
                AYXKKw();
            }
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar<T, B> {
        public final B EZpvd;
        public final UnicastSubject<T> OLrzqt;

        public ActionBar(UnicastSubject<T> unicastSubject, B b) {
            this.OLrzqt = unicastSubject;
            this.EZpvd = b;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T, B> extends AbstractC56345yBy<B> {
        public final StateListAnimator<T, B, ?> copydefault;

        public Activity(StateListAnimator<T, B, ?> stateListAnimator) {
            this.copydefault = stateListAnimator;
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(B b) {
            this.copydefault.OLrzqt(b);
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            this.copydefault.OLrzqt(th);
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            this.copydefault.onComplete();
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription<T, V> extends AbstractC56345yBy<V> {
        public final UnicastSubject<T> EZpvd;
        public boolean KWHzl;
        public final StateListAnimator<T, ?, V> copydefault;

        public TaskDescription(StateListAnimator<T, ?, V> stateListAnimator, UnicastSubject<T> unicastSubject) {
            this.copydefault = stateListAnimator;
            this.EZpvd = unicastSubject;
        }

        @Override // o.InterfaceC58256yxp
        public void onNext(V v) {
            dispose();
            onComplete();
        }

        @Override // o.InterfaceC58256yxp
        public void onError(java.lang.Throwable th) {
            if (this.KWHzl) {
                yBG.copydefault(th);
            } else {
                this.KWHzl = true;
                this.copydefault.OLrzqt(th);
            }
        }

        @Override // o.InterfaceC58256yxp
        public void onComplete() {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
            this.copydefault.OLrzqt((TaskDescription) this);
        }
    }
}
