package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.favorites.editing.ui.adapter.MarketFavoritesCryptosInGroupAdapter$1;
import com.okinc.business.market.features.favorites.editing.ui.adapter.MarketFavoritesCryptosInGroupAdapter$2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jTH extends C40512qYp {
    public final Function1<java.lang.Boolean, Unit> EZpvd;
    public final yHO<java.lang.Integer, java.lang.Boolean, C26175jUs, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super o.jUs, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public jTH(@NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull yHO<? super java.lang.Integer, ? super java.lang.Boolean, ? super C26175jUs, Unit> yho, @NotNull Function1<? super RecyclerView.ViewHolder, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.EZpvd = function1;
        this.copydefault = yho;
        register(C26178jUv.class, new jTQ(new MarketFavoritesCryptosInGroupAdapter$1(this)));
        register(C26175jUs.class, new jTN(new MarketFavoritesCryptosInGroupAdapter$2(this), function12));
    }

    public final void AEQbTJ(int i, int i2) {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) EZpvd());
        Collections.swap(listFJNWhG, i, i2);
        AbstractC40521qYy.submitList$default(this, listFJNWhG, null, 2, null);
    }

    @Override // o.C59534zip
    public java.util.List<InterfaceC26171jUo> getItems() {
        java.util.List<InterfaceC40516qYt> listEZpvd = EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (obj instanceof InterfaceC26171jUo) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull java.util.List<C26175jUs> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        EZpvd(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new C26178jUv(false)), (java.lang.Iterable) list), function0);
    }

    public final boolean OLrzqt() {
        return EZpvd().size() <= 1;
    }

    public final void copydefault(@NotNull java.util.List<C26175jUs> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) EZpvd());
        listFJNWhG.removeAll(list);
        EZpvd(listFJNWhG, function0);
    }

    public final void OLrzqt(final boolean z) {
        java.util.List<InterfaceC26171jUo> items = getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(items, 10));
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC26171jUo) it.next()).KWHzl(z));
        }
        EZpvd(arrayList, new Function0() { // from class: o.jTF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jTH.OLrzqt(this.KWHzl, z);
            }
        });
    }

    public static final Unit OLrzqt(jTH jth, boolean z) {
        jth.EZpvd.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public final void EZpvd(final int i, final boolean z, final C26175jUs c26175jUs) {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) getItems());
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(listFJNWhG.indexOf(c26175jUs));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            listFJNWhG.set(numValueOf.intValue(), c26175jUs.KWHzl(z));
            java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(listFJNWhG, 0);
            C26178jUv c26178jUv = objAkhnZx instanceof C26178jUv ? (C26178jUv) objAkhnZx : null;
            if (c26178jUv != null) {
                boolean z2 = true;
                java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listFJNWhG, 1);
                if (!(listDjBIcL instanceof java.util.Collection) || !listDjBIcL.isEmpty()) {
                    java.util.Iterator it = listDjBIcL.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (!((InterfaceC26171jUo) it.next()).OLrzqt()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                listFJNWhG.set(0, c26178jUv.KWHzl(z2));
            }
            EZpvd(listFJNWhG, new Function0() { // from class: o.jTD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jTH.EZpvd(this.EZpvd, i, z, c26175jUs);
                }
            });
        }
    }

    public static final Unit EZpvd(jTH jth, int i, boolean z, C26175jUs c26175jUs) {
        jth.copydefault.invoke(java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), c26175jUs);
        return Unit.INSTANCE;
    }
}
