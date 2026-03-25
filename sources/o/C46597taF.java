package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.okmarket.home.data.repository.CountingBannerRepository$getCountingBannerData$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46597taF {
    public final C46595taD EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C46597taF(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46595taD c46595taD) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46595taD, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = c46595taD;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super NewCoinInfo> continuation) throws java.lang.Throwable {
        CountingBannerRepository$getCountingBannerData$1 countingBannerRepository$getCountingBannerData$1;
        if (continuation instanceof CountingBannerRepository$getCountingBannerData$1) {
            countingBannerRepository$getCountingBannerData$1 = (CountingBannerRepository$getCountingBannerData$1) continuation;
            int i = countingBannerRepository$getCountingBannerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                countingBannerRepository$getCountingBannerData$1.label = i - Integer.MIN_VALUE;
            } else {
                countingBannerRepository$getCountingBannerData$1 = new CountingBannerRepository$getCountingBannerData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = countingBannerRepository$getCountingBannerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = countingBannerRepository$getCountingBannerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C46595taD c46595taD = this.EZpvd;
            countingBannerRepository$getCountingBannerData$1.label = 1;
            objKWHzl = c46595taD.KWHzl(countingBannerRepository$getCountingBannerData$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ((ResponseData) objKWHzl).getData();
        if (arrayList != null) {
            return (NewCoinInfo) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        }
        return null;
    }
}
