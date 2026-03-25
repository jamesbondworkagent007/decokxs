package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC41645qui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41575qtR<T extends InterfaceC41645qui<T>> extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends T>, ? extends java.lang.String>, java.util.List<? extends T>> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41575qtR(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qtJ.matchingV2$default(o.qtJ, java.util.List, java.lang.String, kotlin.jvm.functions.Function1, boolean, boolean, int, java.lang.Object):java.util.List */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<? extends T>, java.lang.String> pair, @NotNull Continuation<? super java.util.List<? extends T>> continuation) {
        java.util.List<? extends T> listComponent1 = pair.component1();
        java.lang.String strComponent2 = pair.component2();
        C41434qqj.KWHzl.KWHzl("SearchInstrumentUseCase", "searching instrument, raw list size=" + listComponent1.size() + ", keyword=" + strComponent2);
        java.lang.String string = strComponent2 != null ? StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strComponent2).toString() : null;
        java.lang.String str = C33129mqd.OLrzqt((java.lang.CharSequence) string) ? string : null;
        if (str == null) {
            return listComponent1;
        }
        java.util.List listMatchingV2$default = C41567qtJ.matchingV2$default(C41567qtJ.AEQbTJ, listComponent1, str, null, true, false, 20, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listMatchingV2$default, 10));
        java.util.Iterator it = listMatchingV2$default.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC41645qui) it.next()).copydefault(str));
        }
        pUU.KWHzl("SearchInstrumentUseCase", "search instrument result size=" + arrayList.size() + ", keyword=" + strComponent2);
        return arrayList;
    }
}
