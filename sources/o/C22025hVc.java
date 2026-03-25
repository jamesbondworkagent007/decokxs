package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.swap.history.detail.adapter.ItemType;
import com.okinc.business.dexui.main.swap.history.detail.adapter.MainOrderAdapter$register$1;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22025hVc extends C43316rmw {
    public boolean AEQbTJ;
    public final java.util.Set<java.lang.String> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<hUT> EZpvd;
    public RecyclerView KWHzl;
    public final java.util.Map<DetailSection, java.lang.Boolean> OLrzqt;
    public final java.util.Set<java.lang.String> copydefault;

    /* JADX INFO: renamed from: o.hVc$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DetailSection.values().length];
            try {
                iArr[DetailSection.OrderInfo.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DetailSection.TradeInfo.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public C22025hVc(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.OLrzqt = new LinkedHashMap();
        this.copydefault = yEE.AhwBna(ItemType.ITEM_TYPE_ORDER_TYPE.getValue(), ItemType.ITEM_TYPE_CREATE_TIME.getValue(), ItemType.ITEM_TYPE_NETWORK.getValue(), ItemType.ITEM_TYPE_SLIPPAGE.getValue(), ItemType.ITEM_TYPE_SWAP_NETWORK_FEE_FROM.getValue(), ItemType.ITEM_TYPE_SERVICE_FEE.getValue(), ItemType.ITEM_TYPE_SWAP_MEV.getValue(), ItemType.ITEM_TYPE_BOOST_VOLUME.getValue());
        this.AYXKKw = yEE.AhwBna(ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue(), ItemType.ITEM_TYPE_SWAP_TIME.getValue(), ItemType.ITEM_TYPE_SWAP_RADIO.getValue(), ItemType.ITEM_TYPE_APPROVE_METHOD.getValue(), ItemType.ITEM_TYPE_SWAP_DE_FI_PLATFORM.getValue(), ItemType.ITEM_TYPE_WALLET_USED.getValue(), ItemType.ITEM_TYPE_TX_HASH.getValue(), ItemType.ITEM_TYPE_WITHDRAW_HASH.getValue());
        this.EZpvd = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.KWHzl = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.KWHzl = null;
    }

    public final void AEQbTJ() {
        register(hUY.class, new hVW());
        register(C22027hVe.class, new C22051hWb());
        register(C22029hVg.class, new C22052hWc(this.AhwBna));
        register(C22023hVa.class, new C22054hWe());
        register(C22028hVf.class, new C22062hWm());
        register(C22032hVj.class, new C22066hWq());
        register(C22026hVd.class, new C22055hWf());
        register(C22033hVk.class, new C22070hWu());
        register(C22024hVb.class, new hVY());
        register(hUX.class, new hVV());
        register(C22031hVi.class, new C22061hWl(new MainOrderAdapter$register$1(this)));
        register(hUZ.class, new C22050hWa());
    }

    public final void OLrzqt(@NotNull java.util.List<? extends hUT> list) {
        Intrinsics.checkNotNullParameter(list, "");
        copydefault();
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        setItems(KWHzl(list));
        notifyDataSetChanged();
    }

    private final void copydefault() {
        java.util.List<?> items = getItems();
        Intrinsics.copydefault(items, "");
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            hUT hut = (hUT) it.next();
            if (hut instanceof C22031hVi) {
                C22031hVi c22031hVi = (C22031hVi) hut;
                if (c22031hVi.AEQbTJ()) {
                    this.OLrzqt.put(c22031hVi.EZpvd(), java.lang.Boolean.valueOf(c22031hVi.OLrzqt()));
                }
            }
        }
    }

    private final java.util.List<hUT> KWHzl(java.util.List<? extends hUT> list) {
        java.util.Set<java.lang.String> set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (hUT hut : list) {
            if (hut instanceof C22031hVi) {
                C22031hVi c22031hVi = (C22031hVi) hut;
                if (c22031hVi.AEQbTJ()) {
                    DetailSection detailSectionEZpvd = c22031hVi.EZpvd();
                    java.lang.Boolean bool = this.OLrzqt.get(detailSectionEZpvd);
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                    arrayList.add(C22031hVi.copy$default(c22031hVi, null, null, zBooleanValue, false, 11, null));
                    if (zBooleanValue) {
                        int i = StateListAnimator.OLrzqt[detailSectionEZpvd.ordinal()];
                        if (i == 1) {
                            set = this.copydefault;
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            set = this.AYXKKw;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : list) {
                            if (set.contains(((hUT) obj).copydefault())) {
                                arrayList2.add(obj);
                            }
                        }
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((hUT) it.next());
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (hut instanceof hUZ) {
                arrayList.add(hut);
            } else {
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    for (hUT hut2 : list) {
                        if (!(hut2 instanceof C22031hVi) || !((C22031hVi) hut2).AEQbTJ()) {
                        }
                    }
                }
                arrayList.add(hut);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hVi.copy$default(o.hVi, com.okinc.business.dexlogic.bean.OrderDetailBean, com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection, boolean, boolean, int, java.lang.Object):o.hVi */
    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(DetailSection detailSection, boolean z) {
        final int i;
        java.util.Set<java.lang.String> set;
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        this.OLrzqt.put(detailSection, java.lang.Boolean.valueOf(z));
        java.util.List<?> items = getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (obj instanceof hUT) {
                arrayList.add(obj);
            }
        }
        final java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        java.util.Iterator<?> it = listFJNWhG.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            hUT hut = (hUT) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) hut.copydefault(), (java.lang.Object) ItemType.ITEM_TYPE_SECTION_TITLE.getValue())) {
                Intrinsics.copydefault(hut, "");
                if (((C22031hVi) hut).EZpvd() == detailSection) {
                    i = i2;
                    break;
                }
            }
            i2++;
        }
        if (i == -1) {
            this.AEQbTJ = false;
            return;
        }
        java.lang.Object obj2 = listFJNWhG.get(i);
        Intrinsics.copydefault(obj2, "");
        listFJNWhG.set(i, C22031hVi.copy$default((C22031hVi) obj2, null, null, z, false, 11, null));
        int i3 = StateListAnimator.OLrzqt[detailSection.ordinal()];
        if (i3 == 1) {
            set = this.copydefault;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            set = this.AYXKKw;
        }
        if (!z) {
            final Ref.IntRef intRef = new Ref.IntRef();
            int i4 = i + 1;
            int size = listFJNWhG.size();
            for (int i5 = i4; i5 < size && set.contains(((hUT) listFJNWhG.get(i5)).copydefault()); i5++) {
                intRef.element++;
            }
            int i6 = intRef.element;
            if (i6 == 0) {
                notifyItemChanged(i);
                setItems(listFJNWhG);
                this.AEQbTJ = false;
                return;
            }
            RecyclerView recyclerView = this.KWHzl;
            if (recyclerView != null) {
                C25321iuX.AEQbTJ.copydefault(recyclerView, i, i6, getItemCount(), (48 & 16) != 0 ? 300L : 0L, (48 & 32) != 0 ? 24.0f : 0.0f, new Function0() { // from class: o.hVh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C22025hVc.EZpvd(intRef, this, i, listFJNWhG);
                    }
                });
                return;
            }
            for (int i7 = 0; i7 < i6; i7++) {
                listFJNWhG.remove(i4);
            }
            notifyItemChanged(i);
            notifyItemRangeRemoved(i4, intRef.element);
            setItems(listFJNWhG);
            this.AEQbTJ = false;
            return;
        }
        java.util.List<hUT> list = this.EZpvd;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (set.contains(((hUT) obj3).copydefault())) {
                arrayList2.add(obj3);
            }
        }
        int i8 = i + 1;
        listFJNWhG.addAll(i8, arrayList2);
        setItems(listFJNWhG);
        notifyItemChanged(i);
        notifyItemRangeInserted(i8, arrayList2.size());
        this.AEQbTJ = false;
    }

    public static final Unit EZpvd(Ref.IntRef intRef, C22025hVc c22025hVc, int i, java.util.List list) {
        int i2 = intRef.element;
        for (int i3 = 0; i3 < i2; i3++) {
            list.remove(i + 1);
        }
        c22025hVc.notifyItemChanged(i);
        c22025hVc.notifyItemRangeRemoved(i + 1, intRef.element);
        c22025hVc.setItems(list);
        c22025hVc.AEQbTJ = false;
        return Unit.INSTANCE;
    }
}
