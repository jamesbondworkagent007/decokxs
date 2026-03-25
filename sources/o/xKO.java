package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.refactor.usecase.coroutine.AbsCoUseCase$execute$1;
import java.lang.reflect.ParameterizedType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class xKO<Resp> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm<xKU<Resp>> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xKR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xKO.KWHzl(this.KWHzl);
        }
    });

    public abstract java.lang.Object KWHzl(@NotNull Continuation<? super ResponseData<Resp>> continuation) throws java.lang.Exception;

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final xKU KWHzl(xKO xko) {
        return xko.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <Resp> java.lang.Object OLrzqt(xKO<Resp> xko, Continuation<? super ResponseData<Resp>> continuation) throws java.lang.Throwable {
        AbsCoUseCase$execute$1 absCoUseCase$execute$1;
        if (continuation instanceof AbsCoUseCase$execute$1) {
            absCoUseCase$execute$1 = (AbsCoUseCase$execute$1) continuation;
            int i = absCoUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                absCoUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                absCoUseCase$execute$1 = new AbsCoUseCase$execute$1(xko, continuation);
            }
        }
        java.lang.Object objKWHzl = absCoUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = absCoUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                absCoUseCase$execute$1.L$0 = xko;
                absCoUseCase$execute$1.label = 1;
                objKWHzl = xko.KWHzl(absCoUseCase$execute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xko = (xKO) absCoUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            return (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            OKServerException oKServerExceptionOLrzqt = C43422row.OLrzqt(th);
            pUU.copydefault("AbsCoUseCase", "handle request catch exception: " + oKServerExceptionOLrzqt);
            return xko.OLrzqt.getValue().KWHzl(oKServerExceptionOLrzqt);
        }
    }

    public final xKU<Resp> copydefault() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        Intrinsics.copydefault(genericSuperclass, "");
        java.lang.reflect.Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        java.lang.Object objAuCTelauCTel = yDV.AuCTelauCTel(actualTypeArguments);
        Intrinsics.checkNotNullExpressionValue(objAuCTelauCTel, "");
        return new xKU<>(true, (java.lang.reflect.Type) objAuCTelauCTel);
    }
}
