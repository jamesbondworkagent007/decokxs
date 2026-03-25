package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.DetailSection;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.ItemType;
import com.okinc.business.dexui.main.limitorder.orderdetail.adapter.LimitMainOrderAdapter$register$1;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21800hMu extends C43316rmw {
    public final java.util.Set<java.lang.String> AEQbTJ;
    public final java.util.List<AbstractC21793hMn> EZpvd;
    public boolean KWHzl;
    public RecyclerView OLrzqt;
    public final java.util.Map<DetailSection, java.lang.Boolean> copydefault;
    public final java.lang.String djBIcL;
    public final java.util.Set<java.lang.String> gEmmrt;

    /* JADX INFO: renamed from: o.hMu$StateListAnimator */
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

    public C21800hMu(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
        this.copydefault = new LinkedHashMap();
        this.AEQbTJ = yEE.AhwBna(ItemType.ITEM_TYPE_ORDER_TYPE.getValue(), ItemType.ITEM_TYPE_LIMIT_TYPE.getValue(), ItemType.ITEM_TYPE_LIMIT_CREATE_TIME.getValue(), ItemType.ITEM_TYPE_LIMIT_EXPIRY_TIME.getValue(), ItemType.ITEM_TYPE_LIMIT_TRIGGER_RATE.getValue(), ItemType.ITEM_TYPE_TRIGGER_PRICE_M_CAP.getValue(), ItemType.ITEM_TYPE_TRIGGER_PRICE.getValue(), ItemType.ITEM_TYPE_LIMIT_NETWORK.getValue(), ItemType.ITEM_TYPE_SLIPPAGE.getValue(), ItemType.ITEM_TYPE_LIMIT_NETWORK_FEE.getValue(), ItemType.ITEM_TYPE_LIMIT_SERVICE_FEE.getValue(), ItemType.ITEM_TYPE_ROUTE_SELECTION.getValue(), ItemType.ITEM_TYPE_COPY_TRADING_STRATEGY_TYPE.getValue(), ItemType.ITEM_TYPE_BOOST_VOLUME.getValue());
        this.gEmmrt = yEE.AhwBna(ItemType.ITEM_TYPE_TRANSACTION_TYPE.getValue(), ItemType.ITEM_TYPE_CLOSING_TIME.getValue(), ItemType.ITEM_TYPE_SWAP_DURATION.getValue(), ItemType.ITEM_TYPE_EXECUTION_RATE.getValue(), ItemType.ITEM_TYPE_LIMIT_EXECUTE_PRICE.getValue(), ItemType.ITEM_TYPE_APPROVE_METHOD.getValue(), ItemType.ITEM_TYPE_PROVIDER.getValue(), ItemType.ITEM_TYPE_WALLET_USED.getValue(), ItemType.ITEM_TYPE_TX_HASH.getValue());
        this.EZpvd = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.OLrzqt = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.OLrzqt = null;
    }

    public final void KWHzl() {
        register(C21797hMr.class, new hMD());
        register(C21802hMw.class, new hMF());
        register(C21798hMs.class, new hMG(this.djBIcL));
        register(C21805hMz.class, new hMH());
        register(C21801hMv.class, new hML());
        register(C21803hMx.class, new hMK(new LimitMainOrderAdapter$register$1(this)));
        register(C21796hMq.class, new hMI());
        register(C21804hMy.class, new hMO());
        register(C21795hMp.class, new hME());
    }

    public final void EZpvd(@NotNull java.util.List<? extends AbstractC21793hMn> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt();
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        setItems(KWHzl(list));
        notifyDataSetChanged();
    }

    public final void OLrzqt() {
        java.util.List<?> items = getItems();
        Intrinsics.copydefault(items, "");
        java.util.Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            AbstractC21793hMn abstractC21793hMn = (AbstractC21793hMn) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) abstractC21793hMn.AEQbTJ(), (java.lang.Object) ItemType.ITEM_TYPE_SECTION_TITLE.getValue())) {
                Intrinsics.copydefault(abstractC21793hMn, "");
                C21803hMx c21803hMx = (C21803hMx) abstractC21793hMn;
                this.copydefault.put(c21803hMx.copydefault(), java.lang.Boolean.valueOf(c21803hMx.KWHzl()));
            }
        }
    }

    public final java.util.List<AbstractC21793hMn> KWHzl(java.util.List<? extends AbstractC21793hMn> list) {
        java.util.Set<java.lang.String> set;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (AbstractC21793hMn abstractC21793hMn : list) {
            java.lang.String strAEQbTJ = abstractC21793hMn.AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_SECTION_TITLE.getValue())) {
                Intrinsics.copydefault(abstractC21793hMn, "");
                C21803hMx c21803hMx = (C21803hMx) abstractC21793hMn;
                DetailSection detailSectionCopydefault = c21803hMx.copydefault();
                java.lang.Boolean bool = this.copydefault.get(detailSectionCopydefault);
                boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
                arrayList.add(C21803hMx.copy$default(c21803hMx, null, null, zBooleanValue, 3, null));
                if (zBooleanValue) {
                    int i = StateListAnimator.OLrzqt[detailSectionCopydefault.ordinal()];
                    if (i == 1) {
                        set = this.AEQbTJ;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        set = this.gEmmrt;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (set.contains(((AbstractC21793hMn) obj).AEQbTJ())) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((AbstractC21793hMn) it.next());
                    }
                } else {
                    continue;
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) ItemType.ITEM_TYPE_DIVIDER.getValue())) {
                arrayList.add(abstractC21793hMn);
            } else {
                boolean zContains = this.AEQbTJ.contains(abstractC21793hMn.AEQbTJ());
                boolean zContains2 = this.gEmmrt.contains(abstractC21793hMn.AEQbTJ());
                if (!zContains && !zContains2) {
                    arrayList.add(abstractC21793hMn);
                }
            }
        }
        return arrayList;
    }

    public final void KWHzl(DetailSection detailSection, boolean z) {
        final int i;
        java.util.Set<java.lang.String> set;
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        this.copydefault.put(detailSection, java.lang.Boolean.valueOf(z));
        java.util.List<?> items = getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (obj instanceof AbstractC21793hMn) {
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
            AbstractC21793hMn abstractC21793hMn = (AbstractC21793hMn) it.next();
            if (Intrinsics.EZpvd((java.lang.Object) abstractC21793hMn.AEQbTJ(), (java.lang.Object) ItemType.ITEM_TYPE_SECTION_TITLE.getValue())) {
                Intrinsics.copydefault(abstractC21793hMn, "");
                if (((C21803hMx) abstractC21793hMn).copydefault() == detailSection) {
                    i = i2;
                    break;
                }
            }
            i2++;
        }
        if (i == -1) {
            this.KWHzl = false;
            return;
        }
        java.lang.Object obj2 = listFJNWhG.get(i);
        Intrinsics.copydefault(obj2, "");
        listFJNWhG.set(i, C21803hMx.copy$default((C21803hMx) obj2, null, null, z, 3, null));
        int i3 = StateListAnimator.OLrzqt[detailSection.ordinal()];
        if (i3 == 1) {
            set = this.AEQbTJ;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            set = this.gEmmrt;
        }
        if (!z) {
            final Ref.IntRef intRef = new Ref.IntRef();
            int i4 = i + 1;
            int size = listFJNWhG.size();
            for (int i5 = i4; i5 < size && set.contains(((AbstractC21793hMn) listFJNWhG.get(i5)).AEQbTJ()); i5++) {
                intRef.element++;
            }
            int i6 = intRef.element;
            if (i6 == 0) {
                notifyItemChanged(i);
                setItems(listFJNWhG);
                this.KWHzl = false;
                return;
            }
            RecyclerView recyclerView = this.OLrzqt;
            if (recyclerView != null) {
                C25321iuX.AEQbTJ.copydefault(recyclerView, i, i6, getItemCount(), (48 & 16) != 0 ? 300L : 0L, (48 & 32) != 0 ? 24.0f : 0.0f, new Function0() { // from class: o.hMt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21800hMu.EZpvd(intRef, this, i, listFJNWhG);
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
            this.KWHzl = false;
            return;
        }
        java.util.List<AbstractC21793hMn> list = this.EZpvd;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (set.contains(((AbstractC21793hMn) obj3).AEQbTJ())) {
                arrayList2.add(obj3);
            }
        }
        int i8 = i + 1;
        listFJNWhG.addAll(i8, arrayList2);
        setItems(listFJNWhG);
        notifyItemChanged(i);
        notifyItemRangeInserted(i8, arrayList2.size());
        this.KWHzl = false;
    }

    public static final Unit EZpvd(Ref.IntRef intRef, C21800hMu c21800hMu, int i, java.util.List list) {
        int i2 = intRef.element;
        for (int i3 = 0; i3 < i2; i3++) {
            list.remove(i + 1);
        }
        c21800hMu.notifyItemChanged(i);
        c21800hMu.notifyItemRangeRemoved(i + 1, intRef.element);
        c21800hMu.setItems(list);
        c21800hMu.KWHzl = false;
        return Unit.INSTANCE;
    }
}
