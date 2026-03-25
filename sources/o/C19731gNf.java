package o;

import com.okinc.business.dex.tee.domain.TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19731gNf implements InterfaceC19736gNk {
    public final gYL AEQbTJ;

    @yCM
    public C19731gNf(@NotNull gYL gyl) {
        Intrinsics.checkNotNullParameter(gyl, "");
        this.AEQbTJ = gyl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19736gNk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull SignAndBroadcastParams signAndBroadcastParams, @NotNull Continuation<? super AbstractC43419rot<SignAndBroadcastRes, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1 teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1;
        AbstractC43419rot.ActionBar actionBar;
        C19731gNf c19731gNf;
        ResponseData responseData;
        if (continuation instanceof TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1) {
            teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1 = (TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1) continuation;
            int i = teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.label = i - Integer.MIN_VALUE;
            } else {
                teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1 = new TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            c19731gNf = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                responseData = (ResponseData) objCopydefault;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            signAndBroadcastParams = (SignAndBroadcastParams) teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.L$1;
            c19731gNf = (C19731gNf) teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            responseData = (ResponseData) objCopydefault;
        }
        gYL gyl = c19731gNf.AEQbTJ;
        teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.L$0 = null;
        teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.L$1 = null;
        teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1.label = 2;
        objCopydefault = gyl.copydefault(signAndBroadcastParams, teeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        responseData = (ResponseData) objCopydefault;
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }
}
