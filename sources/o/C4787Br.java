package o;

import aws.smithy.kotlin.runtime.http.middleware.DefaultValidateResponse$handle$1;
import aws.smithy.kotlin.runtime.http.middleware.HttpResponseException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4787Br implements BU {
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lo/CG;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC5075Dt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super BP<C5036Cg>, ? extends C58859zS>> java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull H h, @NotNull Continuation<? super C58859zS> continuation) throws java.lang.Throwable {
        DefaultValidateResponse$handle$1 defaultValidateResponse$handle$1;
        C58859zS c58859zS;
        HttpResponseException httpResponseException;
        HttpResponseException httpResponseException2;
        HttpResponseException httpResponseException3;
        if (continuation instanceof DefaultValidateResponse$handle$1) {
            defaultValidateResponse$handle$1 = (DefaultValidateResponse$handle$1) continuation;
            int i = defaultValidateResponse$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultValidateResponse$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultValidateResponse$handle$1 = new DefaultValidateResponse$handle$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = defaultValidateResponse$handle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultValidateResponse$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            defaultValidateResponse$handle$1.label = 1;
            objOLrzqt = h.OLrzqt(bp, defaultValidateResponse$handle$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                httpResponseException = (HttpResponseException) defaultValidateResponse$handle$1.L$3;
                httpResponseException3 = (HttpResponseException) defaultValidateResponse$handle$1.L$2;
                httpResponseException2 = (HttpResponseException) defaultValidateResponse$handle$1.L$1;
                c58859zS = (C58859zS) defaultValidateResponse$handle$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                httpResponseException.setBody((byte[]) objOLrzqt);
                httpResponseException3.setRequest(c58859zS.OLrzqt());
                throw httpResponseException2;
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C58859zS c58859zS2 = (C58859zS) objOLrzqt;
        if (zT.copydefault(c58859zS2.AEQbTJ().OLrzqt())) {
            return c58859zS2;
        }
        HttpResponseException httpResponseException4 = new HttpResponseException("received unsuccessful HTTP call.response: " + c58859zS2.AEQbTJ().OLrzqt());
        httpResponseException4.setStatusCode(c58859zS2.AEQbTJ().OLrzqt());
        httpResponseException4.setHeaders(c58859zS2.AEQbTJ().AEQbTJ());
        zP zPVarEZpvd = c58859zS2.AEQbTJ().EZpvd();
        defaultValidateResponse$handle$1.L$0 = c58859zS2;
        defaultValidateResponse$handle$1.L$1 = httpResponseException4;
        defaultValidateResponse$handle$1.L$2 = httpResponseException4;
        defaultValidateResponse$handle$1.L$3 = httpResponseException4;
        defaultValidateResponse$handle$1.label = 2;
        java.lang.Object objCopydefault2 = C58752zO.copydefault(zPVarEZpvd, defaultValidateResponse$handle$1);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        c58859zS = c58859zS2;
        httpResponseException = httpResponseException4;
        httpResponseException2 = httpResponseException;
        objOLrzqt = objCopydefault2;
        httpResponseException3 = httpResponseException2;
        httpResponseException.setBody((byte[]) objOLrzqt);
        httpResponseException3.setRequest(c58859zS.OLrzqt());
        throw httpResponseException2;
    }
}
