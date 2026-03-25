package o;

import com.okinc.business.market.data.model.AddressLoginResponse;
import com.okinc.business.market.data.model.DexJwtData;
import com.okinc.business.market.data.repository.DexJwtRepo$getJwt$1;
import com.okinc.business.market.data.repository.DexJwtRepo$getJwtData$1;
import com.okinc.business.market.data.repository.DexJwtRepo$getJwtgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.data.repository.DexJwtRepo$storeJwt$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27612jyV {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C27670jza OLrzqt;

    public C27612jyV(@NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c27670jza;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Result<AddressLoginResponse>> continuation) {
        DexJwtRepo$getJwt$1 dexJwtRepo$getJwt$1;
        if (continuation instanceof DexJwtRepo$getJwt$1) {
            dexJwtRepo$getJwt$1 = (DexJwtRepo$getJwt$1) continuation;
            int i = dexJwtRepo$getJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexJwtRepo$getJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                dexJwtRepo$getJwt$1 = new DexJwtRepo$getJwt$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dexJwtRepo$getJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexJwtRepo$getJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            DexJwtRepo$getJwtgIAlus$$inlined$dexRunCatching$1 dexJwtRepo$getJwtgIAlus$$inlined$dexRunCatching$1 = new DexJwtRepo$getJwtgIAlus$$inlined$dexRunCatching$1(null, this, str);
            dexJwtRepo$getJwt$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dexJwtRepo$getJwtgIAlus$$inlined$dexRunCatching$1, dexJwtRepo$getJwt$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull AddressLoginResponse addressLoginResponse, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        DexJwtRepo$storeJwt$1 dexJwtRepo$storeJwt$1;
        boolean zM7384isSuccessimpl;
        C27612jyV c27612jyV;
        java.lang.Object objEZpvd;
        if (continuation instanceof DexJwtRepo$storeJwt$1) {
            dexJwtRepo$storeJwt$1 = (DexJwtRepo$storeJwt$1) continuation;
            int i = dexJwtRepo$storeJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexJwtRepo$storeJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                dexJwtRepo$storeJwt$1 = new DexJwtRepo$storeJwt$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = dexJwtRepo$storeJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexJwtRepo$storeJwt$1.label;
        try {
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            zM7384isSuccessimpl = false;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            dexJwtRepo$storeJwt$1.L$0 = this;
            dexJwtRepo$storeJwt$1.L$1 = str;
            dexJwtRepo$storeJwt$1.L$2 = addressLoginResponse;
            dexJwtRepo$storeJwt$1.label = 1;
            objAEQbTJ = AEQbTJ(dexJwtRepo$storeJwt$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c27612jyV = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                objEZpvd = ((Result) objAEQbTJ).m7386unboximpl();
                zM7384isSuccessimpl = Result.m7384isSuccessimpl(objEZpvd);
                return C56443yFo.KWHzl(zM7384isSuccessimpl);
            }
            addressLoginResponse = (AddressLoginResponse) dexJwtRepo$storeJwt$1.L$2;
            str = (java.lang.String) dexJwtRepo$storeJwt$1.L$1;
            c27612jyV = (C27612jyV) dexJwtRepo$storeJwt$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.Map mapIsConnected = C56424yEw.isConnected(((DexJwtData) objAEQbTJ).EZpvd());
        mapIsConnected.put(str, addressLoginResponse);
        C27670jza c27670jza = c27612jyV.OLrzqt;
        KSerializer<DexJwtData> kSerializerSerializer = DexJwtData.Companion.serializer();
        DexJwtData dexJwtData = new DexJwtData(mapIsConnected);
        dexJwtRepo$storeJwt$1.L$0 = null;
        dexJwtRepo$storeJwt$1.L$1 = null;
        dexJwtRepo$storeJwt$1.L$2 = null;
        dexJwtRepo$storeJwt$1.label = 2;
        objEZpvd = c27670jza.EZpvd("key.dex_jwt", kSerializerSerializer, dexJwtData, dexJwtRepo$storeJwt$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        zM7384isSuccessimpl = Result.m7384isSuccessimpl(objEZpvd);
        return C56443yFo.KWHzl(zM7384isSuccessimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super DexJwtData> continuation) throws java.lang.Throwable {
        DexJwtRepo$getJwtData$1 dexJwtRepo$getJwtData$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof DexJwtRepo$getJwtData$1) {
            dexJwtRepo$getJwtData$1 = (DexJwtRepo$getJwtData$1) continuation;
            int i = dexJwtRepo$getJwtData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexJwtRepo$getJwtData$1.label = i - Integer.MIN_VALUE;
            } else {
                dexJwtRepo$getJwtData$1 = new DexJwtRepo$getJwtData$1(this, continuation);
            }
        }
        java.lang.Object obj = dexJwtRepo$getJwtData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexJwtRepo$getJwtData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C27670jza c27670jza = this.OLrzqt;
                KSerializer<DexJwtData> kSerializerSerializer = DexJwtData.Companion.serializer();
                dexJwtRepo$getJwtData$1.label = 1;
                objAEQbTJ = c27670jza.AEQbTJ("key.dex_jwt", kSerializerSerializer, dexJwtRepo$getJwtData$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            return (DexJwtData) objAEQbTJ;
        } catch (java.lang.Exception unused) {
            return new DexJwtData(C56424yEw.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.jyV$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jyV.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
