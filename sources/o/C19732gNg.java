package o;

import com.okinc.business.dex.tee.domain.TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1;
import com.okinc.business.dex.tee.domain.TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$1;
import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19732gNg implements InterfaceC19729gNd {
    public final InterfaceC23225huH AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C19732gNg(@NotNull InterfaceC23225huH interfaceC23225huH, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23225huH;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:12:0x0029, B:34:0x0074, B:35:0x0076, B:37:0x007c, B:39:0x0082, B:40:0x008f, B:17:0x003d, B:25:0x005b, B:31:0x0063, B:21:0x0048), top: B:45:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC19729gNd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull CreateOrderParams createOrderParams, @NotNull Continuation<? super AbstractC43419rot<LimitOrderDetailBean, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$1 teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1;
        AbstractC43419rot.ActionBar actionBar;
        C19732gNg c19732gNg;
        ResponseData responseData;
        if (continuation instanceof TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$1) {
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1 = (TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$1) continuation;
            int i = teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1 = new TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            if (coroutineDispatcher == null) {
                c19732gNg = this;
                InterfaceC23225huH interfaceC23225huH = c19732gNg.AEQbTJ;
                teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$0 = null;
                teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$1 = null;
                teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label = 2;
                objWithContext = interfaceC23225huH.copydefault(createOrderParams, teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1 teeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1 = new TeeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1(null, this, createOrderParams);
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$0 = this;
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$1 = createOrderParams;
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, teeLimitOrderPlaceOrderRepositoryImpl$createOrder$$inlined$getApiResultWithJwtCheck$1, teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c19732gNg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            createOrderParams = (CreateOrderParams) teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$1;
            c19732gNg = (C19732gNg) teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        responseData = (ResponseData) objWithContext;
        if (responseData == null) {
            InterfaceC23225huH interfaceC23225huH2 = c19732gNg.AEQbTJ;
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$0 = null;
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.L$1 = null;
            teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1.label = 2;
            objWithContext = interfaceC23225huH2.copydefault(createOrderParams, teeLimitOrderPlaceOrderRepositoryImpl$createOrder$1);
            if (objWithContext == objCopydefault) {
            }
            responseData = (ResponseData) objWithContext;
        }
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }
}
