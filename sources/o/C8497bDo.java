package o;

import io.reactivex.BackpressureStrategy;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8497bDo {
    public final java.util.HashMap<java.lang.Integer, java.util.HashMap<java.lang.String, AbstractC9832bcy>> KWHzl = new java.util.HashMap<>();
    public final CopyOnWriteArrayList<TaskDescription> EZpvd = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o.bDo$TaskDescription */
    public interface TaskDescription {
        void copydefault(@NotNull java.util.HashMap<java.lang.Integer, AbstractC9832bcy> map);
    }

    public final void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy) {
        Intrinsics.checkNotNullParameter(abstractC9832bcy, "");
        EZpvd(abstractC9832bcy);
        EZpvd();
    }

    public final void EZpvd(AbstractC9832bcy abstractC9832bcy) {
        if (this.KWHzl.get(java.lang.Integer.valueOf(abstractC9832bcy.valueOf())) == null) {
            this.KWHzl.put(java.lang.Integer.valueOf(abstractC9832bcy.valueOf()), new java.util.HashMap<>());
        }
        java.util.HashMap<java.lang.String, AbstractC9832bcy> map = this.KWHzl.get(java.lang.Integer.valueOf(abstractC9832bcy.valueOf()));
        if (map != null) {
            map.put(C60067zuq.KWHzl(C56524yIo.AEQbTJ(abstractC9832bcy.getClass())), abstractC9832bcy);
        }
    }

    public final void EZpvd() {
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault = copydefault();
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).copydefault(mapCopydefault);
        }
    }

    public final void copydefault(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd.add(taskDescription);
    }

    public final void KWHzl(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd.remove(taskDescription);
    }

    /* JADX INFO: renamed from: o.bDo$StateListAnimator */
    public static final class StateListAnimator implements TaskDescription {
        public final /* synthetic */ Ref.ObjectRef<InterfaceC58181ywT<java.util.Collection<AbstractC9832bcy>>> copydefault;

        public StateListAnimator(Ref.ObjectRef<InterfaceC58181ywT<java.util.Collection<AbstractC9832bcy>>> objectRef) {
            this.copydefault = objectRef;
        }

        @Override // o.C8497bDo.TaskDescription
        public void copydefault(java.util.HashMap<java.lang.Integer, AbstractC9832bcy> map) {
            Intrinsics.checkNotNullParameter(map, "");
            InterfaceC58181ywT<java.util.Collection<AbstractC9832bcy>> interfaceC58181ywT = this.copydefault.element;
            if (interfaceC58181ywT != null) {
                interfaceC58181ywT.onNext(map.values());
            }
        }
    }

    public final AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> AEQbTJ() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final StateListAnimator stateListAnimator = new StateListAnimator(objectRef);
        AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C8497bDo.KWHzl(objectRef, this, stateListAnimator, interfaceC58184ywW);
            }
        }, BackpressureStrategy.LATEST).EZpvd(new InterfaceC58222yxH() { // from class: o.bDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C8497bDo.KWHzl(this.copydefault, stateListAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ywW */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.ObjectRef objectRef, C8497bDo c8497bDo, StateListAnimator stateListAnimator, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        objectRef.element = interfaceC58184ywW;
        interfaceC58184ywW.onNext(c8497bDo.copydefault().values());
        c8497bDo.copydefault(stateListAnimator);
    }

    public static final void KWHzl(C8497bDo c8497bDo, StateListAnimator stateListAnimator) {
        c8497bDo.KWHzl(stateListAnimator);
    }

    public final AbstractC9832bcy AEQbTJ(int i) {
        return copydefault().get(java.lang.Integer.valueOf(i));
    }

    public final <T extends AbstractC9832bcy> boolean copydefault(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault = copydefault();
        if (!mapCopydefault.isEmpty()) {
            java.util.Iterator<Map.Entry<java.lang.Integer, AbstractC9832bcy>> it = mapCopydefault.entrySet().iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(C56524yIo.AEQbTJ(it.next().getValue().getClass()), interfaceC56551yJo)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.util.HashMap<java.lang.Integer, AbstractC9832bcy> copydefault() {
        java.lang.Object next;
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> map = new java.util.HashMap<>();
        for (Map.Entry<java.lang.Integer, java.util.HashMap<java.lang.String, AbstractC9832bcy>> entry : this.KWHzl.entrySet()) {
            java.util.Collection<AbstractC9832bcy> collectionValues = entry.getValue().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            java.util.Iterator it = CollectionsKt___CollectionsKt.EZpvd(collectionValues, new Application()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!((AbstractC9832bcy) next).AhwBna()) {
                    break;
                }
            }
            AbstractC9832bcy abstractC9832bcy = (AbstractC9832bcy) next;
            if (abstractC9832bcy != null) {
                map.put(entry.getKey(), abstractC9832bcy);
            }
        }
        return map;
    }

    public final <T extends AbstractC9832bcy> boolean AEQbTJ(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        return KWHzl(interfaceC56551yJo) != null;
    }

    /* JADX INFO: renamed from: o.bDo$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((AbstractC9832bcy) t).AYXKKw()), java.lang.Integer.valueOf(((AbstractC9832bcy) t2).AYXKKw()));
        }
    }

    public final java.util.HashMap<java.lang.String, AbstractC9832bcy> EZpvd(int i) {
        return this.KWHzl.get(java.lang.Integer.valueOf(i));
    }

    public final void OLrzqt(@NotNull java.util.List<? extends AbstractC9832bcy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            EZpvd((AbstractC9832bcy) it.next());
        }
        EZpvd();
    }

    public final <T extends AbstractC9832bcy> T KWHzl(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        java.util.Iterator<Map.Entry<java.lang.Integer, java.util.HashMap<java.lang.String, AbstractC9832bcy>>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<java.lang.String, AbstractC9832bcy> entry : it.next().getValue().entrySet()) {
                if (!entry.getValue().AhwBna() && Intrinsics.EZpvd(C56524yIo.AEQbTJ(entry.getValue().getClass()), interfaceC56551yJo)) {
                    AbstractC9832bcy value = entry.getValue();
                    Intrinsics.copydefault(value, "");
                    return (T) value;
                }
            }
        }
        return null;
    }
}
