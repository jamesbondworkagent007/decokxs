package o;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt$flatMap$1;
import kotlin.sequences.SequencesKt___SequencesKt$flatMap$2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59467zhb extends C59409zgW {
    public static final java.lang.Object djBIcL(java.lang.Object obj) {
        return obj;
    }

    public static final boolean gEmmrt(java.lang.Object obj) {
        return obj == null;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.zhb$Application */
    public static final class Application<T> implements java.lang.Iterable<T>, InterfaceC56535yIz {
        public final /* synthetic */ Sequence EZpvd;

        public Application(Sequence sequence) {
            this.EZpvd = sequence;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<T> iterator() {
            return this.EZpvd.iterator();
        }
    }

    public static <T> boolean copydefault(@NotNull Sequence<? extends T> sequence, T t) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return EZpvd(sequence, t) >= 0;
    }

    public static <T> T EZpvd(@NotNull Sequence<? extends T> sequence, final int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return (T) copydefault(sequence, i, new Function1() { // from class: o.zhc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59467zhb.OLrzqt(i, ((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final java.lang.Object OLrzqt(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + '.');
    }

    public static final <T> T copydefault(@NotNull Sequence<? extends T> sequence, int i, @NotNull Function1<? super java.lang.Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (i < 0) {
            return function1.invoke(java.lang.Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : sequence) {
            if (i == i2) {
                return t;
            }
            i2++;
        }
        return function1.invoke(java.lang.Integer.valueOf(i));
    }

    public static <T> T AubY(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return it.next();
    }

    public static <T> T zLjUOn(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> int EZpvd(@NotNull Sequence<? extends T> sequence, T t) {
        Intrinsics.checkNotNullParameter(sequence, "");
        int i = 0;
        for (T t2 : sequence) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> T zsXlph(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T gHZMYf(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> copydefault(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof InterfaceC59394zgH ? ((InterfaceC59394zgH) sequence).KWHzl(i) : new C59396zgJ(sequence, i);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> Sequence<T> DbNXlk(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59395zgI(sequence, true, function1);
    }

    public static <T> Sequence<T> values(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59395zgI(sequence, false, function1);
    }

    public static <T> Sequence<T> wlaJM(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Sequence<T> sequenceValues = values(sequence, new Function1() { // from class: o.zgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C59467zhb.gEmmrt(obj));
            }
        });
        Intrinsics.copydefault(sequenceValues, "");
        return sequenceValues;
    }

    public static <T> Sequence<T> AYXKKw(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        if (i >= 0) {
            if (i == 0) {
                return C59405zgS.OLrzqt();
            }
            return sequence instanceof InterfaceC59394zgH ? ((InterfaceC59394zgH) sequence).AEQbTJ(i) : new C59472zhg(sequence, i);
        }
        throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> Sequence<T> AuCTel(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59470zhe(sequence, function1);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.zhb$ActionBar */
    public static final class ActionBar<T> implements Sequence<T> {
        public final /* synthetic */ Sequence<T> KWHzl;
        public final /* synthetic */ java.util.Comparator<? super T> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.sequences.Sequence<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Sequence<? extends T> sequence, java.util.Comparator<? super T> comparator) {
            this.KWHzl = sequence;
            this.copydefault = comparator;
        }

        @Override // kotlin.sequences.Sequence
        public java.util.Iterator<T> iterator() {
            java.util.List listAxsJAY = C59467zhb.AxsJAY(this.KWHzl);
            C56407yEf.copydefault(listAxsJAY, this.copydefault);
            return listAxsJAY.iterator();
        }
    }

    public static <T> Sequence<T> KWHzl(@NotNull Sequence<? extends T> sequence, @NotNull java.util.Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return new ActionBar(sequence, comparator);
    }

    public static <T, C extends java.util.Collection<? super T>> C OLrzqt(@NotNull Sequence<? extends T> sequence, @NotNull C c) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(c, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> java.util.List<T> zuBGHE(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return yDY.AhwBna();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C56402yEa.EZpvd(next);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> java.util.List<T> AxsJAY(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return (java.util.List) OLrzqt(sequence, new java.util.ArrayList());
    }

    public static <T> java.util.Set<T> sSMYrx(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return yEE.copydefault();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return yED.AEQbTJ(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static <T, R> Sequence<R> AkhnZx(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends java.lang.Iterable<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59398zgL(sequence, function1, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static <T, R> Sequence<R> isConnected(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59398zgL(sequence, function1, SequencesKt___SequencesKt$flatMap$2.INSTANCE);
    }

    public static <T, R> Sequence<R> fetchVPNInfo(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59474zhi(sequence, function1);
    }

    public static <T, R> Sequence<R> fJNWhG(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return wlaJM(new C59474zhi(sequence, function1));
    }

    public static <T> Sequence<T> AuCTelauCTel(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return valueOf(sequence, new Function1() { // from class: o.zhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59467zhb.djBIcL(obj);
            }
        });
    }

    public static final <T, K> Sequence<T> valueOf(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59393zgG(sequence, function1);
    }

    public static <T> boolean iwGUEr(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.iterator().hasNext();
    }

    public static <T> int uzCIH(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                yDY.djBIcL();
            }
        }
        return i;
    }

    public static <T extends java.lang.Comparable<? super T>> T AwvSrB(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> Sequence<T> fIwbmz(@NotNull Sequence<? extends T> sequence, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return fetchVPNInfo(sequence, new Function1() { // from class: o.zha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59467zhb.OLrzqt(function1, obj);
            }
        });
    }

    public static final java.lang.Object OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
        return obj;
    }

    public static <T> Sequence<T> KWHzl(@NotNull Sequence<? extends T> sequence, T t) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return C59405zgS.fIwbmz(C59405zgS.EZpvd((java.lang.Object[]) new Sequence[]{sequence, C59405zgS.EZpvd(t)}));
    }

    public static <T> Sequence<T> copydefault(@NotNull Sequence<? extends T> sequence, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        return C59405zgS.fIwbmz(C59405zgS.EZpvd((java.lang.Object[]) new Sequence[]{sequence, CollectionsKt___CollectionsKt.QVAiDq(iterable)}));
    }

    public static <T> Sequence<T> EZpvd(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> sequence2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(sequence2, "");
        return C59405zgS.fIwbmz(C59405zgS.EZpvd((java.lang.Object[]) new Sequence[]{sequence, sequence2}));
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return OLrzqt(sequence, i, i2, z);
    }

    public static final <T> Sequence<java.util.List<T>> OLrzqt(@NotNull Sequence<? extends T> sequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return yEH.KWHzl((Sequence) sequence, i, i2, z, false);
    }

    public static /* synthetic */ Sequence windowed$default(Sequence sequence, int i, int i2, boolean z, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return KWHzl(sequence, i, i2, z, function1);
    }

    public static final <T, R> Sequence<R> KWHzl(@NotNull Sequence<? extends T> sequence, int i, int i2, boolean z, @NotNull Function1<? super java.util.List<? extends T>, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return fetchVPNInfo(yEH.KWHzl((Sequence) sequence, i, i2, z, true), function1);
    }

    public static final <T, A extends java.lang.Appendable> A KWHzl(@NotNull Sequence<? extends T> sequence, @NotNull A a2, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super T, ? extends java.lang.CharSequence> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(a2, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : sequence) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C59440zhA.copydefault(a2, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static /* synthetic */ java.lang.String joinToString$default(Sequence sequence, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return EZpvd(sequence, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    public static final <T> java.lang.String EZpvd(@NotNull Sequence<? extends T> sequence, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, int i, @NotNull java.lang.CharSequence charSequence4, Function1<? super T, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((java.lang.StringBuilder) KWHzl(sequence, new java.lang.StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static <T> java.lang.Iterable<T> getFieldNames(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return new Application(sequence);
    }
}
