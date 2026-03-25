package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22644hjJ implements InterfaceC22646hjL {
    public final MutableLiveData<java.util.List<java.lang.String>> AEQbTJ;
    public final java.util.HashMap<java.lang.String, java.util.List<LiquidityListItem>> EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public final MutableLiveData<java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22646hjL
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22646hjL
    public java.util.Map<java.lang.String, java.util.List<LiquidityListItem>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22646hjL
    public MutableLiveData<java.util.List<java.lang.String>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22646hjL
    public void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    public C22644hjJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.EZpvd = new java.util.HashMap<>();
        this.OLrzqt = true;
    }

    @Override // o.InterfaceC22646hjL
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<LiquidityListItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.put(str, list);
        this.OLrzqt = false;
    }

    @Override // o.InterfaceC22646hjL
    public void AEQbTJ() {
        this.EZpvd.values().clear();
        this.AEQbTJ.postValue(null);
        this.copydefault.postValue(null);
    }

    @Override // o.InterfaceC22646hjL
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.setValue(list);
        C58156yvv.EZpvd(C23220huC.OLrzqt(new InterfaceC58187ywZ() { // from class: o.hjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22644hjJ.copydefault(this.AEQbTJ, list, interfaceC58184ywW);
            }
        }), lifecycleOwner).DbNXlk();
        OLrzqt(lifecycleOwner, list);
    }

    public static final void copydefault(C22644hjJ c22644hjJ, java.util.List list, InterfaceC58184ywW interfaceC58184ywW) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.Collection<java.util.List<LiquidityListItem>> collectionValues = c22644hjJ.EZpvd.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.List list2 = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((LiquidityListItem) it.next()).setSelected(false);
            }
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            java.lang.String str = (java.lang.String) it2.next();
            java.util.Collection<java.util.List<LiquidityListItem>> collectionValues2 = c22644hjJ.EZpvd.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
            java.util.List list3 = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(collectionValues2);
            if (list3 != null) {
                java.util.Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((LiquidityListItem) next).getId(), (java.lang.Object) str)) {
                            break;
                        }
                    }
                }
                LiquidityListItem liquidityListItem = (LiquidityListItem) next;
                if (liquidityListItem != null) {
                    liquidityListItem.setSelected(true);
                }
            }
        }
        interfaceC58184ywW.onNext(c22644hjJ.EZpvd);
    }

    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collection<java.util.List<LiquidityListItem>> collectionValues = this.EZpvd.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.List list2 = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(collectionValues);
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        for (java.lang.String str : list) {
            java.util.Collection<java.util.List<LiquidityListItem>> collectionValues2 = this.EZpvd.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
            java.util.List list3 = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(collectionValues2);
            if (list3 != null) {
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (!Intrinsics.EZpvd((java.lang.Object) ((LiquidityListItem) next).getId(), (java.lang.Object) str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                LiquidityListItem liquidityListItem = (LiquidityListItem) next;
                if (liquidityListItem != null) {
                    arrayList.remove(liquidityListItem);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((LiquidityListItem) it2.next()).getId());
        }
        this.copydefault.setValue(arrayList2);
    }
}
