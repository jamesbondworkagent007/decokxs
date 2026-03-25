package o;

import com.okinc.okex.center.bean.FullRecentActivityPageDataV2;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModelV2;
import com.okinc.okex.common.usecase.SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$1;
import com.okinc.okex.common.usecase.SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2;
import com.okinc.okex.common.usecase.SupportTransactionV2UseCase$getRecentActivitiesPageData$1;
import com.okinc.okex.common.usecase.SupportTransactionV2UseCase$getRecentActivitiesPageData$2;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45351soE {
    public final InterfaceC44921sfz AEQbTJ;

    @yCM
    public C45351soE(@NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.AEQbTJ = interfaceC44921sfz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<FullRecentActivityPageDataV2>> continuation) throws java.lang.Throwable {
        SupportTransactionV2UseCase$getRecentActivitiesPageData$1 supportTransactionV2UseCase$getRecentActivitiesPageData$1;
        if (continuation instanceof SupportTransactionV2UseCase$getRecentActivitiesPageData$1) {
            supportTransactionV2UseCase$getRecentActivitiesPageData$1 = (SupportTransactionV2UseCase$getRecentActivitiesPageData$1) continuation;
            int i = supportTransactionV2UseCase$getRecentActivitiesPageData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportTransactionV2UseCase$getRecentActivitiesPageData$1.label = i - Integer.MIN_VALUE;
            } else {
                supportTransactionV2UseCase$getRecentActivitiesPageData$1 = new SupportTransactionV2UseCase$getRecentActivitiesPageData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportTransactionV2UseCase$getRecentActivitiesPageData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportTransactionV2UseCase$getRecentActivitiesPageData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            SupportTransactionV2UseCase$getRecentActivitiesPageData$2 supportTransactionV2UseCase$getRecentActivitiesPageData$2 = new SupportTransactionV2UseCase$getRecentActivitiesPageData$2(this, null);
            supportTransactionV2UseCase$getRecentActivitiesPageData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportTransactionV2UseCase$getRecentActivitiesPageData$2, supportTransactionV2UseCase$getRecentActivitiesPageData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(int i, int i2, @NotNull TransactionType transactionType, @NotNull Continuation<? super Result<? extends kotlin.Pair<java.lang.Boolean, ? extends java.util.List<TransactionDisplayModelV2>>>> continuation) throws java.lang.Throwable {
        SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$1 supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1;
        if (continuation instanceof SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$1) {
            supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1 = (SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$1) continuation;
            int i3 = supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1 = new SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
            SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2 supportTransactionV2UseCase$getMoreRecentActivitiesPageData$2 = new SupportTransactionV2UseCase$getMoreRecentActivitiesPageData$2(this, i, i2, transactionType, null);
            supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportTransactionV2UseCase$getMoreRecentActivitiesPageData$2, supportTransactionV2UseCase$getMoreRecentActivitiesPageData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.util.List<TransactionDisplayModelV2> KWHzl(java.util.List<TransactionDisplayModelV2> list, @NotNull java.util.List<TransactionDisplayModelV2> list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return list != null ? CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) list2) : list2;
    }
}
