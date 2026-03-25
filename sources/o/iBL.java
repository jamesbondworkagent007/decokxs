package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iBL {
    public static /* synthetic */ java.lang.Object unwrapResponseData$default(ResponseData responseData, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.iBM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(iBL.copydefault((ResponseData) obj2));
                }
            };
        }
        return copydefault(responseData, function1);
    }

    public static final <T> T copydefault(@NotNull ResponseData<T> responseData, @NotNull Function1<? super ResponseData<T>, java.lang.Boolean> function1) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (function1.invoke(responseData).booleanValue()) {
            return responseData.getData();
        }
        throw new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg());
    }

    public static final boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
