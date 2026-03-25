package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43297rmd extends AbstractC43215rlA implements InterfaceC43299rmf, InterfaceC43298rme {
    public final java.util.Map<java.lang.Class<?>, java.util.Set<Application<InterfaceC43295rmb>>> OLrzqt = new LinkedHashMap();
    public android.content.Context copydefault;

    /* JADX INFO: renamed from: o.rmd$Application */
    public interface Application<T extends InterfaceC43295rmb> {
        T AEQbTJ(@NotNull android.content.Context context);
    }

    @Override // o.AbstractC43215rlA
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onInit(context);
        this.copydefault = context;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: o.rmd$StateListAnimator */
    public static final class StateListAnimator<E> implements Application<E> {

        /* JADX INFO: Incorrect field signature: TE; */
        public final /* synthetic */ InterfaceC43295rmb AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect return type in method signature: (Landroid/content/Context;)TE; */
        @Override // o.C43297rmd.Application
        public InterfaceC43295rmb AEQbTJ(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return this.AEQbTJ;
        }

        /* JADX WARN: Incorrect types in method signature: (TE;)V */
        public StateListAnimator(InterfaceC43295rmb interfaceC43295rmb) {
            this.AEQbTJ = interfaceC43295rmb;
        }
    }

    @Override // o.InterfaceC43299rmf
    public <E extends InterfaceC43295rmb> void KWHzl(@NotNull java.lang.Class<E> cls, @NotNull E e) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(e, "");
        java.util.Set<Application<InterfaceC43295rmb>> setAEQbTJ = this.OLrzqt.get(cls);
        if (setAEQbTJ == null) {
            setAEQbTJ = AEQbTJ(cls);
        }
        setAEQbTJ.add(new StateListAnimator(e));
    }

    public final <E extends InterfaceC43295rmb> java.util.Set<Application<InterfaceC43295rmb>> AEQbTJ(java.lang.Class<E> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.OLrzqt.put(cls, linkedHashSet);
        return linkedHashSet;
    }

    @Override // o.InterfaceC43299rmf
    public <E extends InterfaceC43295rmb> void EZpvd(@NotNull java.lang.Class<E> cls, @NotNull InterfaceC56387yDm<? extends E> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        java.util.Set<Application<InterfaceC43295rmb>> setAEQbTJ = this.OLrzqt.get(cls);
        if (setAEQbTJ == null) {
            setAEQbTJ = AEQbTJ(cls);
        }
        setAEQbTJ.add(new TaskDescription(interfaceC56387yDm));
    }

    @Override // o.InterfaceC43298rme
    public <E extends InterfaceC43295rmb> java.util.List<E> KWHzl(@NotNull java.lang.Class<E> cls) {
        java.lang.Object objM7377constructorimpl;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cls, "");
        java.util.Set<InterfaceComponentCallbacks2C43266rlz> setKWHzl = C43230rlP.Companion.KWHzl(cls);
        if (setKWHzl != null) {
            java.util.Iterator<T> it = setKWHzl.iterator();
            while (it.hasNext()) {
                ((InterfaceComponentCallbacks2C43266rlz) it.next()).doOnCreate();
            }
        }
        java.util.Set<Application<InterfaceC43295rmb>> set = this.OLrzqt.get(cls);
        try {
            Result.Application application = Result.Companion;
            java.util.Set<Application<InterfaceC43295rmb>> set2 = set;
            if (set2 != null) {
                java.util.Set<Application<InterfaceC43295rmb>> set3 = set2;
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set3, 10));
                java.util.Iterator<T> it2 = set3.iterator();
                while (it2.hasNext()) {
                    Application application2 = (Application) it2.next();
                    android.content.Context context = this.copydefault;
                    if (context == null) {
                        Intrinsics.gEmmrt("");
                        context = null;
                    }
                    arrayList.add(application2.AEQbTJ(context));
                }
            } else {
                arrayList = null;
            }
            java.util.List listAhwBna = arrayList instanceof java.util.List ? arrayList : null;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna2 = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna2;
        }
        return (java.util.List) objM7377constructorimpl;
    }

    /* JADX INFO: renamed from: o.rmd$TaskDescription */
    public static final class TaskDescription<T extends InterfaceC43295rmb> implements Application<T>, InterfaceC56387yDm<T> {
        public final /* synthetic */ InterfaceC56387yDm<T> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getValue()Ljava/lang/Object; */
        @Override // o.InterfaceC56387yDm
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public T getValue() {
            return this.OLrzqt.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56387yDm
        public boolean isInitialized() {
            return this.OLrzqt.isInitialized();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yDm<? extends T extends o.rmb> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull InterfaceC56387yDm<? extends T> interfaceC56387yDm) {
            Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
            this.OLrzqt = interfaceC56387yDm;
        }

        @Override // o.C43297rmd.Application
        public T AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            T t = (T) getValue();
            t.init(context);
            return t;
        }
    }
}
