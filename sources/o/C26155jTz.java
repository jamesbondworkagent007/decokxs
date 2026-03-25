package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26155jTz extends C40512qYp {
    public C26155jTz(@NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super C26170jUn, Unit> yho, @NotNull Function2<? super java.lang.Integer, ? super C26170jUn, Unit> function2, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> function1, @NotNull Function2<? super java.lang.Integer, ? super C26170jUn, Unit> function22) {
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function22, "");
        register(C26176jUt.class, new jTL());
        register(C26173jUq.class, new jTK());
        register(C26170jUn.class, new jTI(yho, function2, function1, function22));
    }

    public final void EZpvd(int i, int i2) {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) EZpvd());
        Collections.swap(listFJNWhG, i, i2);
        AbstractC40521qYy.submitList$default(this, listFJNWhG, null, 2, null);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<InterfaceC40516qYt> listEZpvd = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (java.lang.Object objEZpvd : listEZpvd) {
            if (objEZpvd instanceof C26170jUn) {
                C26170jUn c26170jUn = (C26170jUn) objEZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) c26170jUn.AEQbTJ().getGroupName(), (java.lang.Object) str)) {
                    objEZpvd = c26170jUn.EZpvd(MarketFavoritesGroupPo.copy$default(c26170jUn.AEQbTJ(), str2, 0, str2, false, false, null, 58, null));
                }
            }
            arrayList.add(objEZpvd);
        }
        AbstractC40521qYy.submitList$default(this, arrayList, null, 2, null);
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) EZpvd());
        final Function1 function1 = new Function1() { // from class: o.jTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C26155jTz.copydefault(str, (InterfaceC40516qYt) obj));
            }
        };
        listFJNWhG.removeIf(new java.util.function.Predicate() { // from class: o.jTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return C26155jTz.OLrzqt(function1, obj);
            }
        });
        AbstractC40521qYy.submitList$default(this, listFJNWhG, null, 2, null);
    }

    public static final boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean copydefault(java.lang.String str, InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26170jUn) && Intrinsics.EZpvd((java.lang.Object) ((C26170jUn) interfaceC40516qYt).AEQbTJ().getGroupName(), (java.lang.Object) str);
    }

    public final java.util.List<C26170jUn> OLrzqt() {
        java.util.List<InterfaceC40516qYt> listEZpvd = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof C26170jUn) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jTz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C26155jTz c26155jTz, kotlin.Pair pair, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c26155jTz.copydefault((kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>>) pair, (Function0<Unit>) function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [83=4] */
    public final void copydefault(@NotNull kotlin.Pair<? extends java.util.List<C26170jUn>, ? extends java.util.List<C26170jUn>> pair, Function0<Unit> function0) {
        java.util.List listGEmmrt;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<C26170jUn> listComponent1 = pair.component1();
        java.util.List<C26170jUn> listComponent2 = pair.component2();
        if (listComponent1.isEmpty() && listComponent2.isEmpty()) {
            EZpvd(yDY.AhwBna(), function0);
            return;
        }
        if (listComponent2.isEmpty()) {
            C56533yIx c56533yIx = new C56533yIx(2);
            c56533yIx.copydefault(C26176jUt.KWHzl);
            c56533yIx.EZpvd(listComponent1.toArray(new C26170jUn[0]));
            listGEmmrt = yDY.gEmmrt(c56533yIx.copydefault((java.lang.Object[]) new InterfaceC40516qYt[c56533yIx.KWHzl()]));
        } else {
            C56533yIx c56533yIx2 = new C56533yIx(4);
            c56533yIx2.copydefault(C26176jUt.KWHzl);
            c56533yIx2.EZpvd(listComponent1.toArray(new C26170jUn[0]));
            c56533yIx2.copydefault(C26173jUq.EZpvd);
            c56533yIx2.EZpvd(listComponent2.toArray(new C26170jUn[0]));
            listGEmmrt = yDY.gEmmrt(c56533yIx2.copydefault((java.lang.Object[]) new InterfaceC40516qYt[c56533yIx2.KWHzl()]));
        }
        EZpvd(listGEmmrt, function0);
    }
}
