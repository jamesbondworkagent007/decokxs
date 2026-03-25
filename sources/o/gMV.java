package o;

import com.okinc.business.dex.tee.data.orderdetail.TeeLimitOrderDetailRepository$getLimitOrderDetail$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class gMV {
    public final InterfaceC23225huH OLrzqt;
    public final gLS copydefault;

    @yCM
    public gMV(@NotNull InterfaceC23225huH interfaceC23225huH, @NotNull gLS gls) {
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        Intrinsics.checkNotNullParameter(gls, "");
        this.OLrzqt = interfaceC23225huH;
        this.copydefault = gls;
    }

    public static /* synthetic */ java.lang.Object getLimitOrderDetail$default(gMV gmv, java.lang.Integer num, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            num = null;
        }
        return gmv.AEQbTJ(num, i, str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r11 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.Integer num, int i, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<LimitOrderDetailBean, ? extends java.lang.Exception>> continuation) throws java.lang.Throwable {
        TeeLimitOrderDetailRepository$getLimitOrderDetail$1 teeLimitOrderDetailRepository$getLimitOrderDetail$1;
        AbstractC43419rot.ActionBar actionBar;
        gMV gmv;
        ResponseData responseData;
        if (continuation instanceof TeeLimitOrderDetailRepository$getLimitOrderDetail$1) {
            teeLimitOrderDetailRepository$getLimitOrderDetail$1 = (TeeLimitOrderDetailRepository$getLimitOrderDetail$1) continuation;
            int i2 = teeLimitOrderDetailRepository$getLimitOrderDetail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                teeLimitOrderDetailRepository$getLimitOrderDetail$1.label = i2 - Integer.MIN_VALUE;
            } else {
                teeLimitOrderDetailRepository$getLimitOrderDetail$1 = new TeeLimitOrderDetailRepository$getLimitOrderDetail$1(this, continuation);
            }
        }
        TeeLimitOrderDetailRepository$getLimitOrderDetail$1 teeLimitOrderDetailRepository$getLimitOrderDetail$12 = teeLimitOrderDetailRepository$getLimitOrderDetail$1;
        java.lang.Object objKWHzl = teeLimitOrderDetailRepository$getLimitOrderDetail$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = teeLimitOrderDetailRepository$getLimitOrderDetail$12.label;
        try {
        } catch (java.lang.Exception e) {
            actionBar = new AbstractC43419rot.ActionBar(e);
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            gmv = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                responseData = (ResponseData) objKWHzl;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    return new AbstractC43419rot.StateListAnimator(data);
                }
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
                return actionBar;
            }
            i = teeLimitOrderDetailRepository$getLimitOrderDetail$12.I$0;
            str = (java.lang.String) teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$2;
            num = (java.lang.Integer) teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$1;
            gmv = (gMV) teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            responseData = (ResponseData) objKWHzl;
        }
        java.lang.Integer num2 = num;
        int i4 = i;
        java.lang.String str2 = str;
        InterfaceC23225huH interfaceC23225huH = gmv.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = gmv.copydefault.AEQbTJ();
        java.lang.String strDbNXlk = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.DbNXlk() : null;
        teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$0 = null;
        teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$1 = null;
        teeLimitOrderDetailRepository$getLimitOrderDetail$12.L$2 = null;
        teeLimitOrderDetailRepository$getLimitOrderDetail$12.label = 2;
        objKWHzl = interfaceC23225huH.KWHzl(strDbNXlk, num2, i4, str2, teeLimitOrderDetailRepository$getLimitOrderDetail$12);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) objKWHzl;
        if (responseData.getCode() != 0) {
        }
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        return actionBar;
    }
}
