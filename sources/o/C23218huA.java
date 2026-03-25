package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23218huA<T> implements InterfaceC58241yxa<ResponseData<T>, T> {
    @Override // o.InterfaceC58241yxa
    public InterfaceC60096zvd<T> copydefault(@NotNull AbstractC58185ywX<ResponseData<T>> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) abstractC58185ywX);
        final Function1 function1 = new Function1() { // from class: o.hux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23218huA.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.huB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23218huA.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Object EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final java.lang.Object KWHzl(ResponseData responseData) throws OKServerException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return responseData.getData();
        }
        throw new OKServerException(responseData.getCode(), responseData.getMsg(), C43401rob.EZpvd(responseData), null);
    }
}
