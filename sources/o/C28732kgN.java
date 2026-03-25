package o;

import com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData;
import com.okinc.business.market.features.meme.holder_info.domain.repository.HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1;
import com.okinc.business.market.features.meme.holder_info.domain.repository.HolderInfoRepositoryImpl$getHolderInfo$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28732kgN implements InterfaceC28726kgH {
    public final InterfaceC23229huL EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC23229huL KWHzl() {
        return this.EZpvd;
    }

    @yCM
    public C28732kgN(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23229huL;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28726kgH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<HolderInfoData, OKServerException>> continuation) throws java.lang.Throwable {
        HolderInfoRepositoryImpl$getHolderInfo$1 holderInfoRepositoryImpl$getHolderInfo$1;
        if (continuation instanceof HolderInfoRepositoryImpl$getHolderInfo$1) {
            holderInfoRepositoryImpl$getHolderInfo$1 = (HolderInfoRepositoryImpl$getHolderInfo$1) continuation;
            int i = holderInfoRepositoryImpl$getHolderInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderInfoRepositoryImpl$getHolderInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                holderInfoRepositoryImpl$getHolderInfo$1 = new HolderInfoRepositoryImpl$getHolderInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = holderInfoRepositoryImpl$getHolderInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderInfoRepositoryImpl$getHolderInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1 holderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1 = new HolderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1(null, this, str, str2, str3);
                holderInfoRepositoryImpl$getHolderInfo$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, holderInfoRepositoryImpl$getHolderInfo$$inlined$getApiResult$1, holderInfoRepositoryImpl$getHolderInfo$1);
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
