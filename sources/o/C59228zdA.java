package o;

import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59228zdA implements InterfaceC59315zei, InterfaceC59375zfp {
    public final int EZpvd;
    public AbstractC59233zdF OLrzqt;
    public final LinkedHashSet<AbstractC59233zdF> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59233zdF AhwBna() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC59315zei
    public InterfaceC56663yNs KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59315zei
    public java.util.Collection<AbstractC59233zdF> bV_() {
        return this.copydefault;
    }

    @Override // o.InterfaceC59315zei
    public boolean gEmmrt() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd;
    }

    public C59228zdA(@NotNull java.util.Collection<? extends AbstractC59233zdF> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        collection.isEmpty();
        LinkedHashSet<AbstractC59233zdF> linkedHashSet = new LinkedHashSet<>(collection);
        this.copydefault = linkedHashSet;
        this.EZpvd = linkedHashSet.hashCode();
    }

    public C59228zdA(java.util.Collection<? extends AbstractC59233zdF> collection, AbstractC59233zdF abstractC59233zdF) {
        this(collection);
        this.OLrzqt = abstractC59233zdF;
    }

    @Override // o.InterfaceC59315zei
    public java.util.List<InterfaceC56691yOt> copydefault() {
        return yDY.AhwBna();
    }

    public final InterfaceC59098zad AEQbTJ() {
        return C59108zan.copydefault.AEQbTJ("member scope for intersection type", this.copydefault);
    }

    @Override // o.InterfaceC59315zei
    public AbstractC56640yMw bU_() {
        AbstractC56640yMw abstractC56640yMwBU_ = this.copydefault.iterator().next().djBIcL().bU_();
        Intrinsics.checkNotNullExpressionValue(abstractC56640yMwBU_, "");
        return abstractC56640yMwBU_;
    }

    public java.lang.String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    public static final java.lang.String copydefault(AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return abstractC59233zdF.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zdA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String makeDebugNameForIntersectionType$default(C59228zdA c59228zdA, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = C59232zdE.AEQbTJ;
        }
        return c59228zdA.KWHzl(function1);
    }

    public static final java.lang.CharSequence KWHzl(Function1 function1, AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.copydefault(abstractC59233zdF);
        return function1.invoke(abstractC59233zdF).toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C59228zdA) {
            return Intrinsics.EZpvd(this.copydefault, ((C59228zdA) obj).copydefault);
        }
        return false;
    }

    public final AbstractC59242zdO AYXKKw() {
        return C59231zdD.KWHzl(C59308zeb.OLrzqt.copydefault(), (InterfaceC59315zei) this, (java.util.List<? extends InterfaceC59317zek>) yDY.AhwBna(), false, AEQbTJ(), (Function1<? super AbstractC59287zeG, ? extends AbstractC59242zdO>) new C59229zdB(this));
    }

    public static final AbstractC59242zdO copydefault(C59228zdA c59228zdA, AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return c59228zdA.AEQbTJ(abstractC59287zeG).AYXKKw();
    }

    public final C59228zdA EZpvd(AbstractC59233zdF abstractC59233zdF) {
        return new C59228zdA(this.copydefault, abstractC59233zdF);
    }

    /* JADX INFO: renamed from: o.zdA$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC59233zdF abstractC59233zdF = (AbstractC59233zdF) t;
            Function1 function1 = this.KWHzl;
            Intrinsics.copydefault(abstractC59233zdF);
            java.lang.String string = function1.invoke(abstractC59233zdF).toString();
            AbstractC59233zdF abstractC59233zdF2 = (AbstractC59233zdF) t2;
            Function1 function12 = this.KWHzl;
            Intrinsics.copydefault(abstractC59233zdF2);
            return yET.KWHzl(string, function12.invoke(abstractC59233zdF2).toString());
        }
    }

    public final java.lang.String KWHzl(@NotNull Function1<? super AbstractC59233zdF, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.EZpvd(this.copydefault, new ActionBar(function1)), " & ", "{", "}", 0, null, new C59230zdC(function1), 24, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zei; */
    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C59228zdA AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        java.util.Collection<AbstractC59233zdF> collectionBV_ = bV_();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collectionBV_, 10));
        java.util.Iterator<T> it = collectionBV_.iterator();
        boolean z = false;
        while (it.hasNext()) {
            arrayList.add(((AbstractC59233zdF) it.next()).KWHzl(abstractC59287zeG));
            z = true;
        }
        C59228zdA c59228zdAEZpvd = null;
        if (z) {
            AbstractC59233zdF abstractC59233zdFAhwBna = AhwBna();
            c59228zdAEZpvd = new C59228zdA(arrayList).EZpvd(abstractC59233zdFAhwBna != null ? abstractC59233zdFAhwBna.KWHzl(abstractC59287zeG) : null);
        }
        return c59228zdAEZpvd == null ? this : c59228zdAEZpvd;
    }
}
