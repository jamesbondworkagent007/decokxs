package o;

import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.exception.BizSystemException;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54493xKl<Resp, UIResp> {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public MutableLiveData<java.lang.Boolean> AYXKKw;
    public final Function1<java.lang.Throwable, Unit> AhwBna;
    public boolean AkhnZx;
    public MutableLiveData<ResponseData<Resp>> DbNXlk;
    public InterfaceC54501xKt<Resp, ?> EZpvd;
    public MutableLiveData<java.lang.Exception> KWHzl;
    public InterfaceC54492xKk<Resp> copydefault;
    public MutableLiveData<java.lang.String> djBIcL;
    public Function0<Unit> fetchVPNInfo;
    public boolean gEmmrt;
    public java.lang.reflect.Type isConnected;
    public final Function1<ResponseData<Resp>, Unit> valueOf;
    public MutableLiveData<UIResp> values;

    public C54493xKl(MutableLiveData<UIResp> mutableLiveData, @NotNull MutableLiveData<java.lang.Boolean> mutableLiveData2, @NotNull MutableLiveData<java.lang.Exception> mutableLiveData3, @NotNull MutableLiveData<ResponseData<Resp>> mutableLiveData4, @NotNull MutableLiveData<java.lang.String> mutableLiveData5, InterfaceC54501xKt<Resp, ?> interfaceC54501xKt, boolean z, boolean z2, boolean z3, InterfaceC54492xKk<Resp> interfaceC54492xKk, @NotNull java.lang.reflect.Type type, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(mutableLiveData2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData3, "");
        Intrinsics.checkNotNullParameter(mutableLiveData4, "");
        Intrinsics.checkNotNullParameter(mutableLiveData5, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.values = mutableLiveData;
        this.AYXKKw = mutableLiveData2;
        this.KWHzl = mutableLiveData3;
        this.DbNXlk = mutableLiveData4;
        this.djBIcL = mutableLiveData5;
        this.EZpvd = interfaceC54501xKt;
        this.AEQbTJ = z;
        this.AkhnZx = z2;
        this.gEmmrt = z3;
        this.copydefault = interfaceC54492xKk;
        this.isConnected = type;
        this.fetchVPNInfo = function0;
        this.valueOf = new Function1() { // from class: o.xKs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54493xKl.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        this.AhwBna = new Function1() { // from class: o.xKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54493xKl.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
    }

    /* JADX INFO: renamed from: o.xKl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C54493xKl c54493xKl, ResponseData responseData) {
        boolean z;
        Intrinsics.checkNotNullParameter(responseData, "");
        InterfaceC54492xKk<Resp> interfaceC54492xKk = c54493xKl.copydefault;
        if (interfaceC54492xKk != null) {
            interfaceC54492xKk.KWHzl(responseData);
        }
        if (c54493xKl.AkhnZx) {
            c54493xKl.DbNXlk.postValue(responseData);
        }
        if (c54493xKl.AEQbTJ) {
            if (responseData.getCode() == 0) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data, "");
                z = C33129mqd.KWHzl((java.util.Collection) data);
            }
        } else if (responseData.getCode() != 0 || responseData.getData() == null) {
        }
        c54493xKl.AYXKKw.setValue(java.lang.Boolean.FALSE);
        if (z) {
            c54493xKl.fetchVPNInfo.invoke();
            java.lang.Object data2 = responseData.getData();
            if (data2 != null) {
                if (c54493xKl.EZpvd == null) {
                    c54493xKl.EZpvd = new xKC();
                }
                MutableLiveData<UIResp> mutableLiveData = c54493xKl.values;
                if (mutableLiveData != null) {
                    InterfaceC54501xKt<Resp, ?> interfaceC54501xKt = c54493xKl.EZpvd;
                    Intrinsics.copydefault(interfaceC54501xKt);
                    mutableLiveData.setValue((UIResp) interfaceC54501xKt.KWHzl((Resp) data2));
                }
                c54493xKl.djBIcL.setValue("code is :" + responseData.getCode() + ", msg is :" + responseData.getMsg() + ",  error_code is :" + responseData.getError_code() + ", data is :" + responseData.getData());
            }
        } else {
            c54493xKl.KWHzl.postValue(new BizApiException(responseData.getMsg(), java.lang.String.valueOf(responseData.getCode()), null, null, null, 28, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: com.google.gson.JsonElement */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: com.google.gson.JsonElement */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8 A[PHI: r1 r15
  0x00e8: PHI (r1v14 java.lang.String) = (r1v12 java.lang.String), (r1v15 java.lang.String) binds: [B:55:0x00e6, B:35:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00e8: PHI (r15v14 java.lang.String) = (r15v12 java.lang.String), (r15v17 java.lang.String) binds: [B:55:0x00e6, B:35:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C54493xKl c54493xKl, java.lang.Throwable th) {
        java.lang.Object objFromJson;
        java.lang.Object obj;
        java.lang.String asString;
        java.lang.String asString2;
        java.lang.String asString3;
        Intrinsics.checkNotNullParameter(th, "");
        pUU.KWHzl("ResponseHandler", " onError " + th.getMessage());
        c54493xKl.EZpvd(th);
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            JsonObject response = oKServerException.getResponse();
            JsonElement jsonElement = response != null ? response.get("data") : 0;
            if (jsonElement != 0) {
                try {
                    objFromJson = new Gson().fromJson(jsonElement, c54493xKl.isConnected);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                    java.lang.Object obj2 = Unit.INSTANCE;
                    pUU.copydefault("ResponseHandler", "not support json " + jsonElement + " cause by " + obj2);
                    objFromJson = obj2;
                }
                obj = objFromJson;
            } else {
                obj = null;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(oKServerException.getCode());
            java.lang.String message = th.getMessage();
            java.lang.String str = message != null ? message : "";
            if (c54493xKl.gEmmrt) {
                if (jsonElement instanceof JsonObject) {
                    JsonObject jsonObject = (JsonObject) jsonElement;
                    JsonElement jsonElement2 = jsonObject.get("sCode");
                    if (jsonElement2 != null && (asString3 = jsonElement2.getAsString()) != null && asString3.length() > 0) {
                        strValueOf = asString3;
                    }
                    JsonElement jsonElement3 = jsonObject.get("sMsg");
                    if (jsonElement3 != null && (asString = jsonElement3.getAsString()) != null && asString.length() > 0) {
                        str = asString;
                    }
                } else if (jsonElement instanceof JsonArray) {
                    java.lang.Object objRcXXUw = CollectionsKt___CollectionsKt.RcXXUw((java.lang.Iterable) jsonElement);
                    JsonObject jsonObject2 = objRcXXUw instanceof JsonObject ? (JsonObject) objRcXXUw : null;
                    if (jsonObject2 != null) {
                        JsonElement jsonElement4 = jsonObject2.get("sCode");
                        if (jsonElement4 != null && (asString2 = jsonElement4.getAsString()) != null && asString2.length() > 0) {
                            strValueOf = asString2;
                        }
                        JsonElement jsonElement5 = jsonObject2.get("sMsg");
                        if (jsonElement5 != null && (asString = jsonElement5.getAsString()) != null && asString.length() > 0) {
                        }
                    }
                }
            }
            c54493xKl.KWHzl.setValue(new BizApiException(str, strValueOf, null, null, null, 28, null));
            ResponseData<Resp> responseData = new ResponseData<>(C33129mqd.AhwBna(strValueOf), str, null, null, obj, null, 44, null);
            InterfaceC54492xKk<Resp> interfaceC54492xKk = c54493xKl.copydefault;
            if (interfaceC54492xKk != null) {
                interfaceC54492xKk.KWHzl(responseData);
            }
            if (c54493xKl.AkhnZx) {
                c54493xKl.DbNXlk.setValue(responseData);
            }
        } else {
            if (c54493xKl.AkhnZx) {
                MutableLiveData<ResponseData<Resp>> mutableLiveData = c54493xKl.DbNXlk;
                java.lang.String message2 = th.getMessage();
                mutableLiveData.postValue(new ResponseData<>(0, message2 == null ? "" : message2, null, null, null, null, 61, null));
            }
            InterfaceC54492xKk<Resp> interfaceC54492xKk2 = c54493xKl.copydefault;
            if (interfaceC54492xKk2 != null) {
                java.lang.String message3 = th.getMessage();
                interfaceC54492xKk2.KWHzl(new ResponseData<>(0, message3 == null ? "" : message3, null, null, null, null, 61, null));
            }
            c54493xKl.KWHzl.postValue(new BizSystemException(th.getMessage()));
        }
        c54493xKl.AYXKKw.postValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.Throwable th) {
        java.lang.Throwable targetException;
        java.lang.Throwable cause = th.getCause();
        InvocationTargetException invocationTargetException = cause instanceof InvocationTargetException ? (InvocationTargetException) cause : null;
        if (invocationTargetException == null || (targetException = invocationTargetException.getTargetException()) == null) {
            return;
        }
        java.util.Iterator itEZpvd = yHX.EZpvd(targetException.getStackTrace());
        java.lang.String str = "";
        while (itEZpvd.hasNext()) {
            str = str + "\n" + itEZpvd.next();
        }
        pUU.copydefault("ResponseHandler", "please handle this exception: " + str);
    }

    public final InterfaceC58217yxC EZpvd(AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywX, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractC58185ywX == null) {
            pUU.KWHzl("ResponseHandler", "handle flowable is null");
        }
        if (abstractC58185ywX != null) {
            final Function1 function1 = new Function1() { // from class: o.xKn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54493xKl.KWHzl(str, (InterfaceC60094zvb) obj);
                }
            };
            AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywXEZpvd = abstractC58185ywX.EZpvd(new InterfaceC58227yxM() { // from class: o.xKq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C54493xKl.OLrzqt(function1, obj);
                }
            });
            if (abstractC58185ywXEZpvd != null) {
                return C33024moe.subscribeOnIO$default(abstractC58185ywXEZpvd, this.AhwBna, (Function0) null, this.valueOf, 2, (java.lang.Object) null);
            }
        }
        return null;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.String str, InterfaceC60094zvb interfaceC60094zvb) {
        pUU.KWHzl("ResponseHandler", str + ",Flowable subscribed");
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC KWHzl(AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywX) {
        AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywXCopydefault;
        AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywXKWHzl;
        if (abstractC58185ywX == null || (abstractC58185ywXCopydefault = abstractC58185ywX.copydefault(C58266yxz.OLrzqt())) == null || (abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(C58266yxz.OLrzqt())) == null) {
            return null;
        }
        final Function1<ResponseData<Resp>, Unit> function1 = this.valueOf;
        InterfaceC58227yxM<? super ResponseData<Resp>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54493xKl.copydefault(function1, obj);
            }
        };
        final Function1<java.lang.Throwable, Unit> function12 = this.AhwBna;
        return abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54493xKl.AYXKKw(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
