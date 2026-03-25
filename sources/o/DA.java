package o;

import aws.smithy.kotlin.runtime.io.middleware.ModifyResponseMiddleware$handle$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DA<Request, Response> implements InterfaceC5075Dt<Request, Response> {
    public final InterfaceC5078Dw<Response> KWHzl;

    public DA(@NotNull InterfaceC5078Dw<Response> interfaceC5078Dw) {
        Intrinsics.checkNotNullParameter(interfaceC5078Dw, "");
        this.KWHzl = interfaceC5078Dw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5075Dt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super Request, ? extends Response>> java.lang.Object EZpvd(Request request, @NotNull H h, @NotNull Continuation<? super Response> continuation) throws java.lang.Throwable {
        ModifyResponseMiddleware$handle$1 modifyResponseMiddleware$handle$1;
        DA<Request, Response> da;
        if (continuation instanceof ModifyResponseMiddleware$handle$1) {
            modifyResponseMiddleware$handle$1 = (ModifyResponseMiddleware$handle$1) continuation;
            int i = modifyResponseMiddleware$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                modifyResponseMiddleware$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                modifyResponseMiddleware$handle$1 = new ModifyResponseMiddleware$handle$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = modifyResponseMiddleware$handle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = modifyResponseMiddleware$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            modifyResponseMiddleware$handle$1.L$0 = this;
            modifyResponseMiddleware$handle$1.label = 1;
            objOLrzqt = h.OLrzqt(request, modifyResponseMiddleware$handle$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            da = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            da = (DA) modifyResponseMiddleware$handle$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InterfaceC5078Dw<Response> interfaceC5078Dw = da.KWHzl;
        modifyResponseMiddleware$handle$1.L$0 = null;
        modifyResponseMiddleware$handle$1.label = 2;
        objOLrzqt = interfaceC5078Dw.KWHzl((Response) objOLrzqt, modifyResponseMiddleware$handle$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
