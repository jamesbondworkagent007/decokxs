package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$generateSignMessage$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$getJwt$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$getJwtgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$isValidJwt$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$isValidJwtgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$login$1;
import com.okinc.business.market.features.jwt.domain.GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28603kdr {
    public final CoroutineDispatcher AEQbTJ;
    public final C28605kdt AYXKKw;
    public final C28600kdo EZpvd;
    public final C28601kdp KWHzl;
    public final C27612jyV OLrzqt;
    public final C28595kdj copydefault;
    public final Json valueOf;

    @yCM
    public C28603kdr(@NotNull C28601kdp c28601kdp, @NotNull C28600kdo c28600kdo, @NotNull C28605kdt c28605kdt, @NotNull C28595kdj c28595kdj, @NotNull C27612jyV c27612jyV, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28601kdp, "");
        Intrinsics.checkNotNullParameter(c28600kdo, "");
        Intrinsics.checkNotNullParameter(c28605kdt, "");
        Intrinsics.checkNotNullParameter(c28595kdj, "");
        Intrinsics.checkNotNullParameter(c27612jyV, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c28601kdp;
        this.EZpvd = c28600kdo;
        this.AYXKKw = c28605kdt;
        this.copydefault = c28595kdj;
        this.OLrzqt = c27612jyV;
        this.valueOf = json;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<DappSignArgs>> continuation) throws java.lang.Throwable {
        GenericJwtUseCase$generateSignMessage$1 genericJwtUseCase$generateSignMessage$1;
        if (continuation instanceof GenericJwtUseCase$generateSignMessage$1) {
            genericJwtUseCase$generateSignMessage$1 = (GenericJwtUseCase$generateSignMessage$1) continuation;
            int i = genericJwtUseCase$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                genericJwtUseCase$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                genericJwtUseCase$generateSignMessage$1 = new GenericJwtUseCase$generateSignMessage$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = genericJwtUseCase$generateSignMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = genericJwtUseCase$generateSignMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1 genericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1 = new GenericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1(null, this, str, j);
            genericJwtUseCase$generateSignMessage$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, genericJwtUseCase$generateSignMessage0E7RQCE$$inlined$dexRunCatching$1, genericJwtUseCase$generateSignMessage$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, android.os.Bundle bundle, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GenericJwtUseCase$login$1 genericJwtUseCase$login$1;
        if (continuation instanceof GenericJwtUseCase$login$1) {
            genericJwtUseCase$login$1 = (GenericJwtUseCase$login$1) continuation;
            int i = genericJwtUseCase$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                genericJwtUseCase$login$1.label = i - Integer.MIN_VALUE;
            } else {
                genericJwtUseCase$login$1 = new GenericJwtUseCase$login$1(this, continuation);
            }
        }
        GenericJwtUseCase$login$1 genericJwtUseCase$login$12 = genericJwtUseCase$login$1;
        java.lang.Object objWithContext = genericJwtUseCase$login$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = genericJwtUseCase$login$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1 genericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1 = new GenericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1(null, this, bundle, str, j);
            genericJwtUseCase$login$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, genericJwtUseCase$loginBWLJW6A$$inlined$dexRunCatching$1, genericJwtUseCase$login$12);
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
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GenericJwtUseCase$isValidJwt$1 genericJwtUseCase$isValidJwt$1;
        if (continuation instanceof GenericJwtUseCase$isValidJwt$1) {
            genericJwtUseCase$isValidJwt$1 = (GenericJwtUseCase$isValidJwt$1) continuation;
            int i = genericJwtUseCase$isValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                genericJwtUseCase$isValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                genericJwtUseCase$isValidJwt$1 = new GenericJwtUseCase$isValidJwt$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = genericJwtUseCase$isValidJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = genericJwtUseCase$isValidJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenericJwtUseCase$isValidJwtgIAlus$$inlined$dexRunCatching$1 genericJwtUseCase$isValidJwtgIAlus$$inlined$dexRunCatching$1 = new GenericJwtUseCase$isValidJwtgIAlus$$inlined$dexRunCatching$1(null, this, str);
            genericJwtUseCase$isValidJwt$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, genericJwtUseCase$isValidJwtgIAlus$$inlined$dexRunCatching$1, genericJwtUseCase$isValidJwt$1);
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
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        GenericJwtUseCase$getJwt$1 genericJwtUseCase$getJwt$1;
        if (continuation instanceof GenericJwtUseCase$getJwt$1) {
            genericJwtUseCase$getJwt$1 = (GenericJwtUseCase$getJwt$1) continuation;
            int i = genericJwtUseCase$getJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                genericJwtUseCase$getJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                genericJwtUseCase$getJwt$1 = new GenericJwtUseCase$getJwt$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = genericJwtUseCase$getJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = genericJwtUseCase$getJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GenericJwtUseCase$getJwtgIAlus$$inlined$dexRunCatching$1 genericJwtUseCase$getJwtgIAlus$$inlined$dexRunCatching$1 = new GenericJwtUseCase$getJwtgIAlus$$inlined$dexRunCatching$1(null, this, str);
            genericJwtUseCase$getJwt$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, genericJwtUseCase$getJwtgIAlus$$inlined$dexRunCatching$1, genericJwtUseCase$getJwt$1);
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
}
