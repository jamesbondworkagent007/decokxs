package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.trade.features.home.meme.repository.MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2;
import com.okinc.network.okg.response.OKServerException;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28277kVl implements InterfaceC28281kVp {
    public InterfaceC28279kVn AEQbTJ;
    public final InterfaceC28370kYx EZpvd;
    public final InterfaceC23234huQ copydefault;

    @yCM
    public C28277kVl(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC28370kYx interfaceC28370kYx) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC28370kYx, "");
        this.copydefault = interfaceC23234huQ;
        this.EZpvd = interfaceC28370kYx;
        this.AEQbTJ = C28278kVm.KWHzl.EZpvd(C31172lox.Companion.KWHzl());
    }

    public final void copydefault(int i) {
        this.AEQbTJ = C28278kVm.KWHzl.EZpvd(i);
    }

    public final androidx.collection.LruCache<java.lang.String, java.util.List<MemeCurrencyBean>> copydefault() {
        return this.AEQbTJ.EZpvd();
    }

    @Override // o.InterfaceC28281kVp
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MemeCurrencyBean>, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeCurrencySupportRepositoryImpl$getMemeCurrencyTokenList$2(this, str, str2, str3, str4, null), continuation);
    }

    @Override // o.InterfaceC28281kVp
    public java.util.List<MemeCurrencyBean> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<MemeCurrencyBean> list = copydefault().get(str);
        return list == null ? yDY.AhwBna() : list;
    }

    @Override // o.InterfaceC28281kVp
    public java.util.ArrayList<MemeCurrencyBean> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.List<MemeCurrencyBean> list = copydefault().get(str);
        if (list == null) {
            return new java.util.ArrayList<>();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!C59449zhJ.gEmmrt(((MemeCurrencyBean) obj).getCurrencyTokenInfo().getTokenContractAddress(), str2, !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "501"))) {
                arrayList.add(obj);
            }
        }
        return new java.util.ArrayList<>(arrayList);
    }

    @Override // o.InterfaceC28281kVp
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MemeCurrencyBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        copydefault().put(str, list);
    }

    @Override // o.InterfaceC28281kVp
    public MemeCurrencyBean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList<MemeCurrencyBean> arrayListAEQbTJ = AEQbTJ(str, str2);
        java.lang.String strEZpvd = this.EZpvd.EZpvd(str);
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((MemeCurrencyBean) next).getCurrencyTokenInfo().getTokenContractAddress(), (java.lang.Object) strEZpvd)) {
                break;
            }
        }
        MemeCurrencyBean memeCurrencyBean = (MemeCurrencyBean) next;
        if (memeCurrencyBean != null) {
            return memeCurrencyBean;
        }
        MemeCurrencyBean memeCurrencyBean2 = (MemeCurrencyBean) CollectionsKt___CollectionsKt.firstOrNull(arrayListAEQbTJ);
        if (memeCurrencyBean2 == null) {
            return null;
        }
        androidx.collection.LruCache<java.lang.String, java.util.List<MemeCurrencyBean>> lruCacheCopydefault = copydefault();
        java.util.List<MemeCurrencyBean> listAhwBna = lruCacheCopydefault.get(str);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        lruCacheCopydefault.put(str, listAhwBna);
        return memeCurrencyBean2;
    }

    @Override // o.InterfaceC28281kVp
    public DexMultiTokenInfoBean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        DexMultiTokenInfoBean currencyTokenInfo;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList<MemeCurrencyBean> arrayListAEQbTJ = AEQbTJ(str, str2);
        java.lang.String strEZpvd = this.EZpvd.EZpvd(str);
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((MemeCurrencyBean) next).getCurrencyTokenInfo().getTokenContractAddress(), (java.lang.Object) strEZpvd)) {
                break;
            }
        }
        MemeCurrencyBean memeCurrencyBean = (MemeCurrencyBean) next;
        if (memeCurrencyBean != null && (currencyTokenInfo = memeCurrencyBean.getCurrencyTokenInfo()) != null) {
            return currencyTokenInfo;
        }
        MemeCurrencyBean memeCurrencyBean2 = (MemeCurrencyBean) CollectionsKt___CollectionsKt.firstOrNull(arrayListAEQbTJ);
        if (memeCurrencyBean2 == null) {
            return null;
        }
        androidx.collection.LruCache<java.lang.String, java.util.List<MemeCurrencyBean>> lruCacheCopydefault = copydefault();
        java.util.List<MemeCurrencyBean> listAhwBna = lruCacheCopydefault.get(str);
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        lruCacheCopydefault.put(str, listAhwBna);
        return memeCurrencyBean2.getCurrencyTokenInfo();
    }

    @Override // o.InterfaceC28281kVp
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd.copydefault(str, str2);
    }

    @Override // o.InterfaceC28281kVp
    public void KWHzl() {
        java.util.Iterator<T> it = C28278kVm.KWHzl.OLrzqt().iterator();
        while (it.hasNext()) {
            androidx.collection.LruCache<java.lang.String, java.util.List<MemeCurrencyBean>> lruCacheEZpvd = ((InterfaceC28279kVn) it.next()).EZpvd();
            for (Map.Entry<java.lang.String, java.util.List<MemeCurrencyBean>> entry : lruCacheEZpvd.snapshot().entrySet()) {
                lruCacheEZpvd.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
