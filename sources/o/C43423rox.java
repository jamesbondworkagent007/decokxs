package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43423rox {
    public static /* synthetic */ AbstractC58247yxg unwrapResponseData$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.roC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C43423rox.OLrzqt((ResponseData) obj2));
                }
            };
        }
        return EZpvd(abstractC58247yxg, function1);
    }

    public static final java.lang.Object AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final <T> AbstractC58247yxg<T> EZpvd(@NotNull AbstractC58247yxg<ResponseData<T>> abstractC58247yxg, @NotNull final Function1<? super ResponseData<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.roB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43423rox.OLrzqt(function1, (ResponseData) obj);
            }
        };
        AbstractC58247yxg<T> abstractC58247yxg2 = (AbstractC58247yxg<T>) abstractC58247yxg.map(new InterfaceC58229yxO() { // from class: o.roF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43423rox.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxg2, "");
        return abstractC58247yxg2;
    }

    public static final java.lang.Object OLrzqt(Function1 function1, ResponseData responseData) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (((java.lang.Boolean) function1.invoke(responseData)).booleanValue()) {
            return responseData.getData();
        }
        throw new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg());
    }

    public static /* synthetic */ AbstractC58185ywX unwrapResponseData$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.roD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C43423rox.copydefault((ResponseData) obj2));
                }
            };
        }
        return OLrzqt(abstractC58185ywX, function1);
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<ResponseData<T>> abstractC58185ywX, @NotNull final Function1<? super ResponseData<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.roz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43423rox.copydefault(function1, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<T> abstractC58185ywX2 = (AbstractC58185ywX<T>) abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.roE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43423rox.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX2, "");
        return abstractC58185ywX2;
    }

    public static final java.lang.Object copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final java.lang.Object copydefault(Function1 function1, ResponseData responseData) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (((java.lang.Boolean) function1.invoke(responseData)).booleanValue()) {
            return responseData.getData();
        }
        throw new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg());
    }

    public static final boolean OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    public static final boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
