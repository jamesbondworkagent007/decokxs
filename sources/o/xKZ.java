package o;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.refactor.usecase.coroutine.ResponseHandler$doInMain$2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xKZ<Resp, UIResp> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public Function1<? super ResponseData<Resp>, Unit> AYXKKw;
    public java.lang.reflect.Type AhwBna;
    public InterfaceC56387yDm<? extends MutableLiveData<java.lang.Exception>> EZpvd;
    public InterfaceC54501xKt<Resp, ?> KWHzl;
    public MutableLiveData<java.lang.Boolean> OLrzqt;
    public MutableLiveData<UIResp> djBIcL;
    public Function1<? super ResponseData<UIResp>, Unit> fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public boolean valueOf;

    public xKZ(MutableLiveData<UIResp> mutableLiveData, @NotNull MutableLiveData<java.lang.Boolean> mutableLiveData2, @NotNull InterfaceC56387yDm<? extends MutableLiveData<java.lang.Exception>> interfaceC56387yDm, @NotNull InterfaceC54501xKt<Resp, ?> interfaceC54501xKt, boolean z, boolean z2, Function1<? super ResponseData<Resp>, Unit> function1, @NotNull java.lang.reflect.Type type, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(mutableLiveData2, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(interfaceC54501xKt, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.djBIcL = mutableLiveData;
        this.OLrzqt = mutableLiveData2;
        this.EZpvd = interfaceC56387yDm;
        this.KWHzl = interfaceC54501xKt;
        this.AEQbTJ = z;
        this.valueOf = z2;
        this.AYXKKw = function1;
        this.AhwBna = type;
        this.gEmmrt = function0;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (o.C33129mqd.KWHzl((java.util.Collection) (r0 instanceof java.util.List ? (java.util.List) r0 : null)) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        if (r4.getData() != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
    
        r0 = r3.KWHzl;
        r4 = r4.getData();
        kotlin.jvm.internal.Intrinsics.copydefault(r4);
        r4 = r0.KWHzl(r4);
        r4 = EZpvd(new o.C54509xLa(r3, r4), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4 != o.C56442yFn.copydefault()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull final ResponseData<Resp> responseData, @NotNull Continuation<? super Unit> continuation) {
        if (this.AYXKKw != null) {
            java.lang.Object objEZpvd = EZpvd(new Function0() { // from class: o.xLb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xKZ.copydefault(this.EZpvd, responseData);
                }
            }, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        if (this.fetchVPNInfo != null) {
            Resp data = responseData.getData();
            java.lang.Object objKWHzl = data != null ? this.KWHzl.KWHzl(data) : null;
            final java.lang.Object obj = objKWHzl != null ? objKWHzl : null;
            java.lang.Object objEZpvd2 = EZpvd(new Function0() { // from class: o.xKY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xKZ.EZpvd(this.AEQbTJ, responseData, obj);
                }
            }, continuation);
            return objEZpvd2 == C56442yFn.copydefault() ? objEZpvd2 : Unit.INSTANCE;
        }
        if (this.AEQbTJ) {
            if (responseData.getCode() == 0) {
                Resp data2 = responseData.getData();
            }
            java.lang.Object objEZpvd3 = EZpvd(new Function0() { // from class: o.xKX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xKZ.EZpvd(this.copydefault, responseData);
                }
            }, continuation);
            return objEZpvd3 != C56442yFn.copydefault() ? objEZpvd3 : Unit.INSTANCE;
        }
        if (responseData.getCode() == 0) {
        }
        java.lang.Object objEZpvd32 = EZpvd(new Function0() { // from class: o.xKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xKZ.EZpvd(this.copydefault, responseData);
            }
        }, continuation);
        if (objEZpvd32 != C56442yFn.copydefault()) {
        }
    }

    public static final Unit copydefault(xKZ xkz, ResponseData responseData) {
        Function1<? super ResponseData<Resp>, Unit> function1 = xkz.AYXKKw;
        if (function1 != null) {
            function1.invoke(responseData);
        }
        xkz.gEmmrt.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xKZ xkz, ResponseData responseData, java.lang.Object obj) {
        Function1<? super ResponseData<UIResp>, Unit> function1 = xkz.fetchVPNInfo;
        if (function1 != null) {
            function1.invoke(new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), null, obj, responseData.getError_code(), 8, null));
        }
        xkz.gEmmrt.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xKZ xkz, java.lang.Object obj) {
        xkz.OLrzqt.setValue(java.lang.Boolean.FALSE);
        MutableLiveData<UIResp> mutableLiveData = xkz.djBIcL;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(obj);
        }
        xkz.gEmmrt.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xKZ xkz, ResponseData responseData) {
        xkz.OLrzqt.setValue(java.lang.Boolean.FALSE);
        xkz.EZpvd().setValue(new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r8v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v20, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v13, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v16, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17, types: [T, java.lang.CharSequence, java.lang.String] */
    public final java.lang.Object OLrzqt(@NotNull OKServerException oKServerException, @NotNull Continuation<? super Unit> continuation) {
        final java.lang.Object objFromJson;
        ?? asString;
        ?? asString2;
        ?? asString3;
        ?? asString4;
        JsonObject response = oKServerException.getResponse();
        JsonElement jsonElement = response != null ? response.get("data") : 0;
        if (jsonElement != 0) {
            try {
                objFromJson = new Gson().fromJson(jsonElement, this.AhwBna);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                objFromJson = Unit.INSTANCE;
                pUU.copydefault("ResponseHandlerCoroutine", "not support json " + jsonElement + " cause by " + objFromJson);
            }
        } else {
            objFromJson = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = java.lang.String.valueOf(oKServerException.getCode());
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        java.lang.String message = oKServerException.getMessage();
        T t = message;
        if (message == null) {
            t = "";
        }
        objectRef2.element = t;
        if (this.valueOf) {
            if (jsonElement instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) jsonElement;
                JsonElement jsonElement2 = jsonObject.get("sCode");
                if (jsonElement2 != null && (asString4 = jsonElement2.getAsString()) != 0 && asString4.length() > 0) {
                    objectRef.element = asString4;
                }
                JsonElement jsonElement3 = jsonObject.get("sMsg");
                if (jsonElement3 != null && (asString3 = jsonElement3.getAsString()) != 0 && asString3.length() > 0) {
                    objectRef2.element = asString3;
                }
            } else if (jsonElement instanceof JsonArray) {
                java.lang.Object objRcXXUw = CollectionsKt___CollectionsKt.RcXXUw((java.lang.Iterable) jsonElement);
                JsonObject jsonObject2 = objRcXXUw instanceof JsonObject ? (JsonObject) objRcXXUw : null;
                if (jsonObject2 != null) {
                    JsonElement jsonElement4 = jsonObject2.get("sCode");
                    if (jsonElement4 != null && (asString2 = jsonElement4.getAsString()) != 0 && asString2.length() > 0) {
                        objectRef.element = asString2;
                    }
                    JsonElement jsonElement5 = jsonObject2.get("sMsg");
                    if (jsonElement5 != null && (asString = jsonElement5.getAsString()) != 0 && asString.length() > 0) {
                        objectRef2.element = asString;
                    }
                }
            }
        }
        java.lang.Object objEZpvd = EZpvd(new Function0() { // from class: o.xLe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xKZ.OLrzqt(this.OLrzqt, objectRef, objectRef2, objFromJson);
            }
        }, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(xKZ xkz, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.Object obj) {
        java.lang.Object objKWHzl;
        Function1<? super ResponseData<Resp>, Unit> function1 = xkz.AYXKKw;
        if (function1 != null || xkz.fetchVPNInfo != null) {
            if (function1 != null) {
                function1.invoke(new ResponseData(C33129mqd.AhwBna(objectRef.element), (java.lang.String) objectRef2.element, null, null, obj, null, 44, null));
            }
            Function1<? super ResponseData<UIResp>, Unit> function12 = xkz.fetchVPNInfo;
            if (function12 != null) {
                int iAhwBna = C33129mqd.AhwBna(objectRef.element);
                java.lang.String str = (java.lang.String) objectRef2.element;
                if (obj != null) {
                    try {
                        objKWHzl = xkz.KWHzl.KWHzl(obj);
                    } catch (java.lang.Throwable th) {
                        pUU.copydefault("ResponseHandlerCoroutine", "dispatchOnError convert data exception: " + C43422row.OLrzqt(th));
                    }
                } else {
                    objKWHzl = null;
                }
                java.lang.Object obj2 = objKWHzl == null ? null : objKWHzl;
                function12.invoke(new ResponseData(iAhwBna, str, null, null, obj2, null, 44, null));
            }
        } else {
            xkz.OLrzqt.setValue(java.lang.Boolean.FALSE);
            xkz.EZpvd().setValue(new BizApiException((java.lang.String) objectRef2.element, (java.lang.String) objectRef.element, null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    public final MutableLiveData<java.lang.Exception> EZpvd() {
        return this.EZpvd.getValue();
    }

    public final java.lang.Object EZpvd(Function0<Unit> function0, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new ResponseHandler$doInMain$2(function0, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
