package o;

import com.okinc.business.defi.biz.database.wallet.dao.WalletTotalAssetDao$insertTotalAssets$1;
import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11443cOk {
    java.lang.Object AEQbTJ(@NotNull java.util.List<WalletTotalAssetEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<WalletTotalAssetEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    /* JADX INFO: renamed from: o.cOk$Activity */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object OLrzqt(@NotNull InterfaceC11443cOk interfaceC11443cOk, @NotNull java.util.List<WalletTotalAssetEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) throws java.lang.Throwable {
            WalletTotalAssetDao$insertTotalAssets$1 walletTotalAssetDao$insertTotalAssets$1;
            if (continuation instanceof WalletTotalAssetDao$insertTotalAssets$1) {
                walletTotalAssetDao$insertTotalAssets$1 = (WalletTotalAssetDao$insertTotalAssets$1) continuation;
                int i = walletTotalAssetDao$insertTotalAssets$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    walletTotalAssetDao$insertTotalAssets$1.label = i - Integer.MIN_VALUE;
                } else {
                    walletTotalAssetDao$insertTotalAssets$1 = new WalletTotalAssetDao$insertTotalAssets$1(continuation);
                }
            }
            java.lang.Object objKWHzl = walletTotalAssetDao$insertTotalAssets$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = walletTotalAssetDao$insertTotalAssets$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                walletTotalAssetDao$insertTotalAssets$1.L$0 = interfaceC11443cOk;
                walletTotalAssetDao$insertTotalAssets$1.L$1 = list;
                walletTotalAssetDao$insertTotalAssets$1.label = 1;
                objKWHzl = interfaceC11443cOk.KWHzl(walletTotalAssetDao$insertTotalAssets$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(objKWHzl);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) walletTotalAssetDao$insertTotalAssets$1.L$1;
                interfaceC11443cOk = (InterfaceC11443cOk) walletTotalAssetDao$insertTotalAssets$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            java.util.List list2 = (java.util.List) objKWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (list2.contains(((WalletTotalAssetEntity) obj).getWalletId())) {
                    arrayList.add(obj);
                }
            }
            walletTotalAssetDao$insertTotalAssets$1.L$0 = null;
            walletTotalAssetDao$insertTotalAssets$1.L$1 = null;
            walletTotalAssetDao$insertTotalAssets$1.label = 2;
            objKWHzl = interfaceC11443cOk.OLrzqt(arrayList, walletTotalAssetDao$insertTotalAssets$1);
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        }
    }
}
