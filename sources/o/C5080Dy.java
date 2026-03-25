package o;

import aws.smithy.kotlin.runtime.io.middleware.ModifyRequestMiddleware$handle$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5080Dy<Request, Response> implements InterfaceC5075Dt<Request, Response> {
    public final InterfaceC5076Du<Request> EZpvd;

    public C5080Dy(@NotNull InterfaceC5076Du<Request> interfaceC5076Du) {
        Intrinsics.checkNotNullParameter(interfaceC5076Du, "");
        this.EZpvd = interfaceC5076Du;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5075Dt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super Request, ? extends Response>> java.lang.Object EZpvd(Request request, @NotNull H h, @NotNull Continuation<? super Response> continuation) throws java.lang.Throwable {
        ModifyRequestMiddleware$handle$1 modifyRequestMiddleware$handle$1;
        if (continuation instanceof ModifyRequestMiddleware$handle$1) {
            modifyRequestMiddleware$handle$1 = (ModifyRequestMiddleware$handle$1) continuation;
            int i = modifyRequestMiddleware$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                modifyRequestMiddleware$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                modifyRequestMiddleware$handle$1 = new ModifyRequestMiddleware$handle$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = modifyRequestMiddleware$handle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = modifyRequestMiddleware$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC5076Du<Request> interfaceC5076Du = this.EZpvd;
            modifyRequestMiddleware$handle$1.L$0 = h;
            modifyRequestMiddleware$handle$1.label = 1;
            objKWHzl = interfaceC5076Du.KWHzl(request, modifyRequestMiddleware$handle$1);
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
            h = (H) modifyRequestMiddleware$handle$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        modifyRequestMiddleware$handle$1.L$0 = null;
        modifyRequestMiddleware$handle$1.label = 2;
        objKWHzl = h.OLrzqt(objKWHzl, modifyRequestMiddleware$handle$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
