package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.okinc.business.defi.share.bean.ShareLinkBean;
import com.okinc.business.defi.share.bean.ShareLinkReq;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.mln.api.ArcBuyBean;
import com.okinc.wallet.mln.api.NFTApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57104ycC {
    public final NFTApiService EZpvd() {
        return NFTApiService.Companion.KWHzl();
    }

    public static final ResponseData wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXAEQbTJ = AEQbTJ(map, jsonObject, z);
        final Function1 function1 = new Function1() { // from class: o.ycW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.djBIcL((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ycY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57104ycC.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData djBIcL(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(0, null, null, null, null, null, 63, null).copy(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), java.lang.String.valueOf(responseData.getData()), responseData.getError_code());
    }

    public static final ResponseData uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXValueOf = valueOf(map, jsonObject);
        final Function1 function1 = new Function1() { // from class: o.ydh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AhwBna((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXValueOf.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ydi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57104ycC.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AhwBna(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(0, null, null, null, null, null, 63, null).copy(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), java.lang.String.valueOf(responseData.getData()), responseData.getError_code());
    }

    public static final ResponseData getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonArray, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXEZpvd = EZpvd(map, jsonArray);
        final Function1 function1 = new Function1() { // from class: o.ycT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AYXKKw((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ycU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57104ycC.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AYXKKw(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(0, null, null, null, null, null, 63, null).copy(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), java.lang.String.valueOf(responseData.getData()), responseData.getError_code());
    }

    public static final ResponseData ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXOLrzqt = OLrzqt(map, jsonObject);
        final Function1 function1 = new Function1() { // from class: o.ycO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.gEmmrt((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ycX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57104ycC.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData gEmmrt(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return new ResponseData(0, null, null, null, null, null, 63, null).copy(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), java.lang.String.valueOf(responseData.getData()), responseData.getError_code());
    }

    public static final ResponseData fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        AbstractC58185ywX<ResponseData<ArcBuyBean>> abstractC58185ywXEZpvd = EZpvd(map, jsonObject);
        final Function1 function1 = new Function1() { // from class: o.ydg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.valueOf((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ydk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57104ycC.fARcdN(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData valueOf(ResponseData responseData) {
        java.lang.String txHash;
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        ArcBuyBean arcBuyBean = (ArcBuyBean) responseData.getData();
        return responseData2.copy(code, responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), (arcBuyBean == null || (txHash = arcBuyBean.getTxHash()) == null) ? "" : txHash, responseData.getError_code());
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> OLrzqt(final java.util.Map<java.lang.String, java.lang.String> map, final JsonObject jsonObject) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXCopydefault = C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.ycE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C57104ycC.copydefault(jsonObject, objectRef, this, map, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.ycG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57104ycC.djBIcL(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [T, o.yxC] */
    public static final void copydefault(JsonObject jsonObject, Ref.ObjectRef objectRef, C57104ycC c57104ycC, java.util.Map map, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse("application/json");
        java.lang.String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.btcSaveInscribeTxReqApi$default(c57104ycC.EZpvd(), map, companion.create(mediaType, string), null, null, 12, null), null, 1, null));
        final Function1 function1 = new Function1() { // from class: o.ycS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AhwBna(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ycV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.yda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AYXKKw(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ycZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.iwGUEr(function12, obj);
            }
        });
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        interfaceC58184ywW.onNext(responseData);
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<ArcBuyBean>> EZpvd(final java.util.Map<java.lang.String, java.lang.String> map, final JsonObject jsonObject) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<ArcBuyBean>> abstractC58185ywXCopydefault = C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.ydl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C57104ycC.OLrzqt(jsonObject, objectRef, this, map, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.ydm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57104ycC.gEmmrt(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [T, o.yxC] */
    public static final void OLrzqt(JsonObject jsonObject, Ref.ObjectRef objectRef, C57104ycC c57104ycC, java.util.Map map, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse("application/json");
        java.lang.String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.arc20TxReqApi$default(c57104ycC.EZpvd(), map, companion.create(mediaType, string), null, null, 12, null), null, 1, null));
        final Function1 function1 = new Function1() { // from class: o.ydc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.valueOf(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.yde
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.fIwbmz(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ydf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AhwBna(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ydj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.AuCTel(function12, obj);
            }
        });
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        interfaceC58184ywW.onNext(responseData);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> EZpvd(final java.util.Map<java.lang.String, java.lang.String> map, final JsonArray jsonArray) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXCopydefault = C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.ycJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C57104ycC.KWHzl(jsonArray, objectRef, this, map, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.ycP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57104ycC.valueOf(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [T, o.yxC] */
    public static final void KWHzl(JsonArray jsonArray, Ref.ObjectRef objectRef, C57104ycC c57104ycC, java.util.Map map, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse("application/json");
        java.lang.String string = jsonArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.btcSaveTxReq$default(c57104ycC.EZpvd(), map, companion.create(mediaType, string), null, null, 12, null), null, 1, null));
        final Function1 function1 = new Function1() { // from class: o.ycN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.djBIcL(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ycM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.hDKMBd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ycQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.gEmmrt(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ycR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.getFieldNames(function12, obj);
            }
        });
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        interfaceC58184ywW.onNext(responseData);
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> AEQbTJ(final java.util.Map<java.lang.String, java.lang.String> map, final JsonObject jsonObject, final boolean z) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXCopydefault = C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.ydn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C57104ycC.EZpvd(objectRef, this, map, jsonObject, z, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.ydp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57104ycC.AhwBna(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, o.yxC] */
    public static final void EZpvd(Ref.ObjectRef objectRef, C57104ycC c57104ycC, java.util.Map map, JsonObject jsonObject, boolean z, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXKWHzl = c57104ycC.KWHzl(map, jsonObject, z);
        final Function1 function1 = new Function1() { // from class: o.ycL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.gEmmrt(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.Object>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ycK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.zsXlph(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ycI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.djBIcL(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ycH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.AubY(function12, obj);
            }
        });
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        interfaceC58184ywW.onNext(responseData);
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> KWHzl(java.util.Map<java.lang.String, java.lang.String> map, JsonObject jsonObject, boolean z) {
        jsonObject.addProperty("devid", xVW.copydefault());
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse("application/json");
        java.lang.String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        RequestBody requestBodyCreate = companion.create(mediaType, string);
        if (z) {
            return C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.saveBatchTxReq$default(EZpvd(), map, requestBodyCreate, null, null, 12, null), null, 1, null));
        }
        return C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.saveTxReq$default(EZpvd(), map, requestBodyCreate, null, null, 12, null), null, 1, null));
    }

    public final AbstractC58185ywX<ResponseData<java.lang.Object>> valueOf(final java.util.Map<java.lang.String, java.lang.String> map, final JsonObject jsonObject) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXCopydefault = C57197ydq.KWHzl(new InterfaceC58187ywZ() { // from class: o.ydd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C57104ycC.AYXKKw(jsonObject, objectRef, this, map, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.ydb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C57104ycC.AYXKKw(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.wallet.mln.api.NFTApiService.Application.saveP2PTxReq$default(com.okinc.wallet.mln.api.NFTApiService, java.util.Map, okhttp3.RequestBody, java.lang.String, com.okinc.network.okg.cor.SubdomainStrategy, int, java.lang.Object):o.ywX */
    /* JADX WARN: Type inference failed for: r10v5, types: [T, o.yxC] */
    public static final void AYXKKw(JsonObject jsonObject, Ref.ObjectRef objectRef, C57104ycC c57104ycC, java.util.Map map, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = MediaType.Companion.parse("application/json");
        java.lang.String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C13933dbt.okServerExceptionFilter$default(NFTApiService.Application.saveP2PTxReq$default(c57104ycC.EZpvd(), map, companion.create(mediaType, string), null, null, 12, null), null, 1, null));
        final Function1 function1 = new Function1() { // from class: o.ydo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.AYXKKw(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ydt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.AuCTelauCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ycD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57104ycC.valueOf(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ycF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C57104ycC.zLjUOn(function12, obj);
            }
        });
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        interfaceC58184ywW.onNext(responseData);
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final AbstractC58185ywX<ResponseData<ShareLinkBean>> OLrzqt(@NotNull ShareLinkReq shareLinkReq) {
        Intrinsics.checkNotNullParameter(shareLinkReq, "");
        return C33024moe.KWHzl(NFTApiService.Application.getShareLinkConfig$default(EZpvd(), shareLinkReq, null, null, 6, null));
    }
}
