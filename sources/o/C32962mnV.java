package o;

import com.okinc.network.okg.response.BaseResp;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mnV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32962mnV {
    public static final boolean EZpvd(BaseResp baseResp) {
        Intrinsics.checkNotNullParameter(baseResp, "");
        return baseResp.isSucceedAndDataValid();
    }

    public static /* synthetic */ AbstractC58185ywX unwrapData$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.moc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C32962mnV.EZpvd((BaseResp) obj2));
                }
            };
        }
        return OLrzqt(abstractC58185ywX, function1);
    }

    public static final java.lang.Object OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final <T> AbstractC58185ywX<T> OLrzqt(@NotNull AbstractC58185ywX<BaseResp<T>> abstractC58185ywX, @NotNull final Function1<? super BaseResp<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.moi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32962mnV.OLrzqt(function1, (BaseResp) obj);
            }
        };
        AbstractC58185ywX<T> abstractC58185ywX2 = (AbstractC58185ywX<T>) abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32962mnV.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX2, "");
        return abstractC58185ywX2;
    }

    public static final java.lang.Object OLrzqt(Function1 function1, BaseResp baseResp) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(baseResp, "");
        if (((java.lang.Boolean) function1.invoke(baseResp)).booleanValue()) {
            return baseResp.data;
        }
        int i = baseResp.code;
        java.lang.String str = baseResp.detailMsg;
        Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String str2 = baseResp.error_message;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        throw new ResponseFailedException(i, null, str, str2, 2, null);
    }

    public static final boolean OLrzqt(BaseResp baseResp) {
        Intrinsics.checkNotNullParameter(baseResp, "");
        return baseResp.isSucceedAndDataValid();
    }

    public static /* synthetic */ AbstractC58247yxg unwrapData$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.mnU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C32962mnV.OLrzqt((BaseResp) obj2));
                }
            };
        }
        return EZpvd(abstractC58247yxg, function1);
    }

    public static final <T> AbstractC58247yxg<T> EZpvd(@NotNull AbstractC58247yxg<BaseResp<T>> abstractC58247yxg, @NotNull final Function1<? super BaseResp<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.mnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32962mnV.KWHzl(function1, (BaseResp) obj);
            }
        };
        AbstractC58247yxg<T> abstractC58247yxg2 = (AbstractC58247yxg<T>) abstractC58247yxg.map(new InterfaceC58229yxO() { // from class: o.mnW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32962mnV.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxg2, "");
        return abstractC58247yxg2;
    }

    public static final java.lang.Object gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final java.lang.Object KWHzl(Function1 function1, BaseResp baseResp) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(baseResp, "");
        if (((java.lang.Boolean) function1.invoke(baseResp)).booleanValue()) {
            return baseResp.data;
        }
        int i = baseResp.code;
        java.lang.String str = baseResp.detailMsg;
        Intrinsics.checkNotNullExpressionValue(str, "");
        java.lang.String str2 = baseResp.error_message;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        throw new ResponseFailedException(i, null, str, str2, 2, null);
    }

    public static /* synthetic */ AbstractC58247yxg unwrapResponseData$default(AbstractC58247yxg abstractC58247yxg, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.mob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C32962mnV.copydefault((ResponseData) obj2));
                }
            };
        }
        return copydefault(abstractC58247yxg, function1);
    }

    public static final <T> AbstractC58247yxg<T> copydefault(@NotNull AbstractC58247yxg<ResponseData<T>> abstractC58247yxg, @NotNull final Function1<? super ResponseData<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58247yxg, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.mnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32962mnV.copydefault(function1, (ResponseData) obj);
            }
        };
        AbstractC58247yxg<T> abstractC58247yxg2 = (AbstractC58247yxg<T>) abstractC58247yxg.map(new InterfaceC58229yxO() { // from class: o.mod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32962mnV.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxg2, "");
        return abstractC58247yxg2;
    }

    public static final java.lang.Object valueOf(Function1 function1, java.lang.Object obj) {
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

    public static /* synthetic */ AbstractC58185ywX unwrapResponseData$default(AbstractC58185ywX abstractC58185ywX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.mnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C32962mnV.OLrzqt((ResponseData) obj2));
                }
            };
        }
        return AEQbTJ(abstractC58185ywX, function1);
    }

    public static final <T> AbstractC58185ywX<T> AEQbTJ(@NotNull AbstractC58185ywX<ResponseData<T>> abstractC58185ywX, @NotNull final Function1<? super ResponseData<T>, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Function1 function12 = new Function1() { // from class: o.moa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32962mnV.AEQbTJ(function1, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<T> abstractC58185ywX2 = (AbstractC58185ywX<T>) abstractC58185ywX.AEQbTJ(new InterfaceC58229yxO() { // from class: o.mof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32962mnV.AhwBna(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywX2, "");
        return abstractC58185ywX2;
    }

    public static final java.lang.Object AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function1.invoke(obj);
    }

    public static final java.lang.Object AEQbTJ(Function1 function1, ResponseData responseData) throws ResponseFailedException {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (((java.lang.Boolean) function1.invoke(responseData)).booleanValue()) {
            return responseData.getData();
        }
        throw new ResponseFailedException(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg());
    }

    public static final <T> T AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        try {
            return abstractC58185ywX.AEQbTJ();
        } catch (java.lang.Exception e) {
            if ((e instanceof java.lang.RuntimeException) && (e.getCause() instanceof OKServerException)) {
                java.lang.Throwable cause = e.getCause();
                Intrinsics.copydefault(cause, "");
                throw ((OKServerException) cause);
            }
            throw e;
        }
    }

    public static final java.lang.Integer AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof ResponseFailedException) {
            return java.lang.Integer.valueOf(((ResponseFailedException) th).getCode());
        }
        return null;
    }

    public static final boolean copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }

    public static final boolean OLrzqt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData.getCode() == 0 && responseData.getData() != null;
    }
}
