package o;

import com.okinc.business.defi.biz.net.bean.DeriveInfoList;
import com.okinc.business.defi.biz.net.bean.DeriveItem;
import com.okinc.business.defi.wallet.mine.walletmanage.repository.MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1;
import com.okinc.business.defi.wallet.mine.walletmanage.repository.MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$taskList$1$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fDX implements fDZ {
    public final CoroutineScope AEQbTJ;
    public final C13934dbu KWHzl;

    public fDX(@NotNull C13934dbu c13934dbu, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.KWHzl = c13934dbu;
        this.AEQbTJ = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fDZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<DeriveItem>> continuation) throws java.lang.Throwable {
        MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1 mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1;
        java.util.List<DeriveItem> listAhwBna;
        if (continuation instanceof MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1) {
            mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1 = (MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1) continuation;
            int i = mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1.label = i - Integer.MIN_VALUE;
            } else {
                mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1 = new MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1(this, continuation);
            }
        }
        java.lang.Object objAwaitAll = mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwaitAll);
            java.util.List listValueOf = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) list, 50);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            java.util.Iterator it = listValueOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(this.AEQbTJ, null, null, new MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$taskList$1$1(this, (java.util.List) it.next(), null), 3, null));
            }
            mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1.label = 1;
            objAwaitAll = AwaitKt.awaitAll(arrayList, mpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1);
            if (objAwaitAll == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwaitAll);
        }
        java.lang.Iterable<AbstractC43419rot> iterable = (java.lang.Iterable) objAwaitAll;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (AbstractC43419rot abstractC43419rot : iterable) {
            if (abstractC43419rot.EZpvd()) {
                DeriveInfoList deriveInfoList = (DeriveInfoList) abstractC43419rot.copydefault();
                if (deriveInfoList == null || (listAhwBna = deriveInfoList.getDeriveInfoList()) == null) {
                    listAhwBna = yDY.AhwBna();
                }
            } else {
                listAhwBna = yDY.AhwBna();
            }
            arrayList2.add(listAhwBna);
        }
        return C56403yEb.QOLQEE(arrayList2);
    }
}
