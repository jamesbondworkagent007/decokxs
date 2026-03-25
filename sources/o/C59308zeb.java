package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59308zeb extends AbstractC59354zfU<AbstractC59311zee<?>, AbstractC59311zee<?>> implements java.lang.Iterable<AbstractC59311zee<?>> {
    public static final Activity OLrzqt = new Activity(null);
    public static final C59308zeb AEQbTJ = new C59308zeb((java.util.List<? extends AbstractC59311zee<?>>) yDY.AhwBna());

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (wrap:java.util.List<? extends o.zee<?>>:?: CAST (java.util.List<? extends o.zee<?>>) (r1v0 java.util.List)) A[MD:(java.util.List<? extends o.zee<?>>):void (m)] call: o.zeb.<init>(java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59308zeb(java.util.List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.List<? extends AbstractC59311zee<?>>) list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59348zfO
    public AbstractC59425zgm<AbstractC59311zee<?>, AbstractC59311zee<?>> copydefault() {
        return OLrzqt;
    }

    public C59308zeb(java.util.List<? extends AbstractC59311zee<?>> list) {
        for (AbstractC59311zee<?> abstractC59311zee : list) {
            OLrzqt(abstractC59311zee.copydefault(), abstractC59311zee);
        }
    }

    /* JADX INFO: renamed from: o.zeb$Activity */
    public static final class Activity extends AbstractC59425zgm<AbstractC59311zee<?>, AbstractC59311zee<?>> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zeb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        @Override // o.AbstractC59425zgm
        public int OLrzqt(@NotNull ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, java.lang.Integer> function1) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            java.lang.Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                java.lang.Integer num2 = concurrentHashMap.get(str);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    java.lang.Integer numInvoke = function1.invoke(str);
                    concurrentHashMap.putIfAbsent(str, java.lang.Integer.valueOf(numInvoke.intValue()));
                    iIntValue = numInvoke.intValue();
                }
            }
            return iIntValue;
        }

        public final C59308zeb copydefault() {
            return C59308zeb.AEQbTJ;
        }

        public final C59308zeb KWHzl(@NotNull java.util.List<? extends AbstractC59311zee<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (list.isEmpty()) {
                return copydefault();
            }
            return new C59308zeb(list, null);
        }
    }

    public C59308zeb(AbstractC59311zee<?> abstractC59311zee) {
        this((java.util.List<? extends AbstractC59311zee<?>>) C56402yEa.EZpvd(abstractC59311zee));
    }

    public final boolean EZpvd(@NotNull AbstractC59311zee<?> abstractC59311zee) {
        Intrinsics.checkNotNullParameter(abstractC59311zee, "");
        return KWHzl().AEQbTJ(OLrzqt.KWHzl((InterfaceC56551yJo) abstractC59311zee.copydefault())) != null;
    }

    public final C59308zeb copydefault(@NotNull AbstractC59311zee<?> abstractC59311zee) {
        Intrinsics.checkNotNullParameter(abstractC59311zee, "");
        if (EZpvd(abstractC59311zee)) {
            return this;
        }
        if (OLrzqt()) {
            return new C59308zeb(abstractC59311zee);
        }
        return OLrzqt.KWHzl(CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends AbstractC59311zee<?>>) CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this), abstractC59311zee));
    }

    public final C59308zeb KWHzl(@NotNull AbstractC59311zee<?> abstractC59311zee) {
        Intrinsics.checkNotNullParameter(abstractC59311zee, "");
        if (OLrzqt()) {
            return this;
        }
        AbstractC59346zfM<AbstractC59311zee<?>> abstractC59346zfMKWHzl = KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AbstractC59311zee<?> abstractC59311zee2 : abstractC59346zfMKWHzl) {
            if (!Intrinsics.EZpvd(abstractC59311zee2, abstractC59311zee)) {
                arrayList.add(abstractC59311zee2);
            }
        }
        return arrayList.size() == KWHzl().OLrzqt() ? this : OLrzqt.KWHzl(arrayList);
    }

    public final C59308zeb AEQbTJ(@NotNull C59308zeb c59308zeb) {
        AbstractC59311zee abstractC59311zeeOLrzqt;
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        if (OLrzqt() && c59308zeb.OLrzqt()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = OLrzqt.AEQbTJ().iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            AbstractC59311zee<?> abstractC59311zeeAEQbTJ = KWHzl().AEQbTJ(iIntValue);
            AbstractC59311zee<?> abstractC59311zeeAEQbTJ2 = c59308zeb.KWHzl().AEQbTJ(iIntValue);
            if (abstractC59311zeeAEQbTJ == null) {
                abstractC59311zeeOLrzqt = abstractC59311zeeAEQbTJ2 != null ? abstractC59311zeeAEQbTJ2.OLrzqt(abstractC59311zeeAEQbTJ) : null;
            } else {
                abstractC59311zeeOLrzqt = abstractC59311zeeAEQbTJ.OLrzqt(abstractC59311zeeAEQbTJ2);
            }
            C59433zgu.EZpvd(arrayList, abstractC59311zeeOLrzqt);
        }
        return OLrzqt.KWHzl(arrayList);
    }

    public final C59308zeb KWHzl(@NotNull C59308zeb c59308zeb) {
        AbstractC59311zee abstractC59311zeeEZpvd;
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        if (OLrzqt() && c59308zeb.OLrzqt()) {
            return this;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = OLrzqt.AEQbTJ().iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            AbstractC59311zee<?> abstractC59311zeeAEQbTJ = KWHzl().AEQbTJ(iIntValue);
            AbstractC59311zee<?> abstractC59311zeeAEQbTJ2 = c59308zeb.KWHzl().AEQbTJ(iIntValue);
            if (abstractC59311zeeAEQbTJ == null) {
                abstractC59311zeeEZpvd = abstractC59311zeeAEQbTJ2 != null ? abstractC59311zeeAEQbTJ2.EZpvd(abstractC59311zeeAEQbTJ) : null;
            } else {
                abstractC59311zeeEZpvd = abstractC59311zeeAEQbTJ.EZpvd(abstractC59311zeeAEQbTJ2);
            }
            C59433zgu.EZpvd(arrayList, abstractC59311zeeEZpvd);
        }
        return OLrzqt.KWHzl(arrayList);
    }
}
