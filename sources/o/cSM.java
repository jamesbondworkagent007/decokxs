package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import com.okinc.business.defi.biz.database.wallet.repository.WalletSignRepository$queryCreateDataList$1;
import com.okinc.business.defi.biz.database.wallet.repository.WalletSignRepository$querySyncDataList$1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cSM {
    public final InterfaceC11433cOa copydefault;

    public cSM(@NotNull InterfaceC11433cOa interfaceC11433cOa) {
        Intrinsics.checkNotNullParameter(interfaceC11433cOa, "");
        this.copydefault = interfaceC11433cOa;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<C11291cIu> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        for (C11291cIu c11291cIu : list) {
            java.util.Iterator<T> it = c11291cIu.copydefault().iterator();
            while (it.hasNext()) {
                listOLrzqt.add(copydefault(c11291cIu.AEQbTJ(), 1, 1, (C11283cIm) it.next()));
            }
        }
        return this.copydefault.copydefault(C56402yEa.fARcdN(listOLrzqt), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<C11288cIr> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        for (C11288cIr c11288cIr : list) {
            java.util.Iterator<T> it = c11288cIr.KWHzl().iterator();
            while (it.hasNext()) {
                listOLrzqt.add(copydefault(c11288cIr.AEQbTJ(), 2, 2, (C11283cIm) it.next()));
            }
            java.util.Iterator<T> it2 = c11288cIr.EZpvd().iterator();
            while (it2.hasNext()) {
                listOLrzqt.add(copydefault(c11288cIr.AEQbTJ(), 2, 3, (C11283cIm) it2.next()));
            }
        }
        return this.copydefault.copydefault(C56402yEa.fARcdN(listOLrzqt), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<C11291cIu>> continuation) throws java.lang.Throwable {
        WalletSignRepository$queryCreateDataList$1 walletSignRepository$queryCreateDataList$1;
        cSM csm;
        if (continuation instanceof WalletSignRepository$queryCreateDataList$1) {
            walletSignRepository$queryCreateDataList$1 = (WalletSignRepository$queryCreateDataList$1) continuation;
            int i = walletSignRepository$queryCreateDataList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSignRepository$queryCreateDataList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSignRepository$queryCreateDataList$1 = new WalletSignRepository$queryCreateDataList$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletSignRepository$queryCreateDataList$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletSignRepository$queryCreateDataList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC11433cOa interfaceC11433cOa = this.copydefault;
            walletSignRepository$queryCreateDataList$1.L$0 = this;
            walletSignRepository$queryCreateDataList$1.label = 1;
            objCopydefault = interfaceC11433cOa.copydefault(list, 1, walletSignRepository$queryCreateDataList$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            csm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            csm = (cSM) walletSignRepository$queryCreateDataList$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.Map map = (java.util.Map) objCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(csm.OLrzqt((WalletSignDataEntity) it.next()));
            }
            arrayList.add(new C11291cIu(str, arrayList2));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<C11288cIr>> continuation) {
        WalletSignRepository$querySyncDataList$1 walletSignRepository$querySyncDataList$1;
        cSM csm;
        java.util.List listAhwBna;
        if (continuation instanceof WalletSignRepository$querySyncDataList$1) {
            walletSignRepository$querySyncDataList$1 = (WalletSignRepository$querySyncDataList$1) continuation;
            int i = walletSignRepository$querySyncDataList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSignRepository$querySyncDataList$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSignRepository$querySyncDataList$1 = new WalletSignRepository$querySyncDataList$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletSignRepository$querySyncDataList$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletSignRepository$querySyncDataList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC11433cOa interfaceC11433cOa = this.copydefault;
            walletSignRepository$querySyncDataList$1.L$0 = this;
            walletSignRepository$querySyncDataList$1.label = 1;
            objCopydefault = interfaceC11433cOa.copydefault(list, 2, walletSignRepository$querySyncDataList$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            csm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            csm = (cSM) walletSignRepository$querySyncDataList$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.Map map = (java.util.Map) objCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : list2) {
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(((WalletSignDataEntity) obj).getSyncType());
                java.lang.Object arrayList2 = linkedHashMap.get(numAEQbTJ);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(numAEQbTJ, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            java.util.List list3 = (java.util.List) linkedHashMap.get(C56443yFo.AEQbTJ(2));
            java.util.List listAhwBna2 = null;
            if (list3 != null) {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
                java.util.Iterator it = list3.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(csm.OLrzqt((WalletSignDataEntity) it.next()));
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List list4 = (java.util.List) linkedHashMap.get(C56443yFo.AEQbTJ(3));
            if (list4 != null) {
                listAhwBna2 = new java.util.ArrayList(C56403yEb.AYXKKw(list4, 10));
                java.util.Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    listAhwBna2.add(csm.OLrzqt((WalletSignDataEntity) it2.next()));
                }
            }
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            arrayList.add(new C11288cIr(str, listAhwBna2, listAhwBna));
        }
        return arrayList;
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.copydefault.AEQbTJ(list, 1, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, int i, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.copydefault.KWHzl(2, str, list, i, continuation);
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cSM.EZpvd(this.EZpvd, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer EZpvd(cSM csm, java.lang.String str, long j) {
        return java.lang.Integer.valueOf(csm.copydefault.EZpvd(str, j));
    }

    public final WalletSignDataEntity copydefault(java.lang.String str, int i, int i2, C11283cIm c11283cIm) {
        return new WalletSignDataEntity(str, i, i2, c11283cIm.copydefault(), c11283cIm.KWHzl(), c11283cIm.OLrzqt(), c11283cIm.EZpvd(), c11283cIm.AEQbTJ());
    }

    public final C11283cIm OLrzqt(WalletSignDataEntity walletSignDataEntity) {
        return new C11283cIm(walletSignDataEntity.getAddressType(), walletSignDataEntity.getChainIndex(), walletSignDataEntity.getChainSign(), walletSignDataEntity.getBaseChainIndex(), walletSignDataEntity.getBaseChainSign());
    }
}
