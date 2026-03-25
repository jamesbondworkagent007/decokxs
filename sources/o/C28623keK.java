package o;

import com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData;
import com.okinc.business.market.features.meme.bundle_detail.domain.repository.BundleDetailRepositoryImpl$getBundleDetail$$inlined$getApiResult$1;
import com.okinc.business.market.features.meme.bundle_detail.domain.repository.BundleDetailRepositoryImpl$getBundleDetail$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28623keK implements InterfaceC28619keG {
    public final InterfaceC23229huL AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23229huL OLrzqt() {
        return this.AEQbTJ;
    }

    @yCM
    public C28623keK(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23229huL;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28619keG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<BundleDetailData, OKServerException>> continuation) throws java.lang.Throwable {
        BundleDetailRepositoryImpl$getBundleDetail$1 bundleDetailRepositoryImpl$getBundleDetail$1;
        if (continuation instanceof BundleDetailRepositoryImpl$getBundleDetail$1) {
            bundleDetailRepositoryImpl$getBundleDetail$1 = (BundleDetailRepositoryImpl$getBundleDetail$1) continuation;
            int i = bundleDetailRepositoryImpl$getBundleDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bundleDetailRepositoryImpl$getBundleDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                bundleDetailRepositoryImpl$getBundleDetail$1 = new BundleDetailRepositoryImpl$getBundleDetail$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = bundleDetailRepositoryImpl$getBundleDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = bundleDetailRepositoryImpl$getBundleDetail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                BundleDetailRepositoryImpl$getBundleDetail$$inlined$getApiResult$1 bundleDetailRepositoryImpl$getBundleDetail$$inlined$getApiResult$1 = new BundleDetailRepositoryImpl$getBundleDetail$$inlined$getApiResult$1(null, this, str, str2);
                bundleDetailRepositoryImpl$getBundleDetail$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, bundleDetailRepositoryImpl$getBundleDetail$$inlined$getApiResult$1, bundleDetailRepositoryImpl$getBundleDetail$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }
}
