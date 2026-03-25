package o;

import java.util.LinkedHashMap;
import java.util.SortedSet;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43257rlq {
    public java.util.Set<? extends InterfaceComponentCallbacks2C43266rlz> KWHzl;
    public final java.util.Map<java.lang.String, InterfaceComponentCallbacks2C43266rlz> OLrzqt = new LinkedHashMap();
    public Function1<? super java.util.Collection<? extends InterfaceComponentCallbacks2C43266rlz>, ? extends java.util.Set<? extends InterfaceComponentCallbacks2C43266rlz>> AEQbTJ = new Function1() { // from class: o.rlr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C43257rlq.KWHzl((java.util.Collection) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super java.util.Collection<? extends InterfaceComponentCallbacks2C43266rlz>, ? extends java.util.Set<? extends InterfaceComponentCallbacks2C43266rlz>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    public static final int AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final SortedSet KWHzl(java.util.Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        final Function2 function2 = new Function2() { // from class: o.rlp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(C43257rlq.KWHzl((java.lang.Integer) obj, (java.lang.Integer) obj2));
            }
        };
        return C56404yEc.OLrzqt(collection, new StateListAnimator(new java.util.Comparator() { // from class: o.rln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return C43257rlq.AEQbTJ(function2, obj, obj2);
            }
        }));
    }

    public static final int KWHzl(java.lang.Integer num, java.lang.Integer num2) {
        return num.intValue() < num2.intValue() ? -1 : 1;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceComponentCallbacks2C43266rlz, "");
        this.OLrzqt.put(str, interfaceComponentCallbacks2C43266rlz);
    }

    public final InterfaceComponentCallbacks2C43266rlz OLrzqt(@NotNull java.lang.String str) throws java.lang.Throwable {
        java.lang.Object objM7377constructorimpl;
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz2 = this.OLrzqt.get(str);
        try {
            Result.Application application = Result.Companion;
            interfaceComponentCallbacks2C43266rlz = interfaceComponentCallbacks2C43266rlz2;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (interfaceComponentCallbacks2C43266rlz == null) {
            throw new java.lang.NullPointerException("Module named [" + str + "] has not been registered.");
        }
        objM7377constructorimpl = Result.m7377constructorimpl(interfaceComponentCallbacks2C43266rlz);
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return (InterfaceComponentCallbacks2C43266rlz) objM7377constructorimpl;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Set<? extends o.rlz>, java.util.Set<o.rlz> */
    public final java.util.Set<InterfaceComponentCallbacks2C43266rlz> KWHzl() {
        java.util.Set set = this.KWHzl;
        if (set != null) {
            return set;
        }
        java.util.Set<InterfaceComponentCallbacks2C43266rlz> set2 = (java.util.Set) this.AEQbTJ.invoke(this.OLrzqt.values());
        this.KWHzl = set2;
        return set2;
    }

    /* JADX INFO: renamed from: o.rlq$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.util.Comparator comparator) {
            this.AEQbTJ = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return this.AEQbTJ.compare(java.lang.Integer.valueOf(((InterfaceComponentCallbacks2C43266rlz) t2).getPriority()), java.lang.Integer.valueOf(((InterfaceComponentCallbacks2C43266rlz) t).getPriority()));
        }
    }
}
