package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59108zan extends yZX {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final InterfaceC59098zad OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 o.zad) A[MD:(java.lang.String, o.zad):void (m)] call: o.zan.<init>(java.lang.String, o.zad):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59108zan(java.lang.String str, InterfaceC59098zad interfaceC59098zad, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC59098zad);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC56657yNm EZpvd(InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        return interfaceC56657yNm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC56657yNm EZpvd(InterfaceC56687yOp interfaceC56687yOp) {
        Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
        return interfaceC56687yOp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC59098zad OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Collection<? extends AbstractC59233zdF> collection) {
        return copydefault.AEQbTJ(str, collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final InterfaceC56657yNm copydefault(InterfaceC56676yOe interfaceC56676yOe) {
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        return interfaceC56676yOe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yZX
    public InterfaceC59098zad KWHzl() {
        return this.OLrzqt;
    }

    public C59108zan(java.lang.String str, InterfaceC59098zad interfaceC59098zad) {
        this.AEQbTJ = str;
        this.OLrzqt = interfaceC59098zad;
    }

    @Override // o.yZX, o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yYN.EZpvd(super.AEQbTJ(c56935yXu, yqv), C59112zar.KWHzl);
    }

    @Override // o.yZX, o.InterfaceC59098zad
    public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yYN.EZpvd(super.copydefault(c56935yXu, yqv), C59109zao.KWHzl);
    }

    @Override // o.yZX, o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = super.copydefault(yzu, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : collectionCopydefault) {
            if (((InterfaceC56665yNu) obj) instanceof InterfaceC56657yNm) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
        java.util.List list = (java.util.List) pair.component1();
        java.util.List list2 = (java.util.List) pair.component2();
        Intrinsics.copydefault(list, "");
        return CollectionsKt___CollectionsKt.djBIcL(yYN.EZpvd(list, C59111zaq.KWHzl), (java.lang.Iterable) list2);
    }

    /* JADX INFO: renamed from: o.zan$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zan.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final InterfaceC59098zad AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Collection<? extends AbstractC59233zdF> collection) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(collection, "");
            java.util.Collection<? extends AbstractC59233zdF> collection2 = collection;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC59233zdF) it.next()).OLrzqt());
            }
            C59387zgA<InterfaceC59098zad> c59387zgAKWHzl = C59424zgl.KWHzl(arrayList);
            InterfaceC59098zad interfaceC59098zadAEQbTJ = yZW.OLrzqt.AEQbTJ(str, (java.util.List<? extends InterfaceC59098zad>) c59387zgAKWHzl);
            return c59387zgAKWHzl.size() <= 1 ? interfaceC59098zadAEQbTJ : new C59108zan(str, interfaceC59098zadAEQbTJ, null);
        }
    }
}
