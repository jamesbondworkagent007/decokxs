package o;

import com.okinc.business.defi.wallet.tee.common.model.AttestationFileResult;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.usecase.GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$1;
import com.okinc.business.defi.wallet.tee.common.usecase.GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2;
import com.okinc.business.defi.wallet.tee.common.usecase.GetAttestationUseCase$getAttestationFileRequest$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fTU {
    public final java.lang.String AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C13934dbu KWHzl;
    public final fTQ OLrzqt;
    public final C17835fUa copydefault;

    @yCM
    public fTU(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C13934dbu c13934dbu, @NotNull C17835fUa c17835fUa, @NotNull fTQ ftq) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c17835fUa, "");
        Intrinsics.checkNotNullParameter(ftq, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c13934dbu;
        this.copydefault = c17835fUa;
        this.OLrzqt = ftq;
        this.AEQbTJ = "GetAttestationUseCase";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Result<AttestationFileResult>> continuation) throws java.lang.Throwable {
        GetAttestationUseCase$getAttestationFileRequest$1 getAttestationUseCase$getAttestationFileRequest$1;
        if (continuation instanceof GetAttestationUseCase$getAttestationFileRequest$1) {
            getAttestationUseCase$getAttestationFileRequest$1 = (GetAttestationUseCase$getAttestationFileRequest$1) continuation;
            int i = getAttestationUseCase$getAttestationFileRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAttestationUseCase$getAttestationFileRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                getAttestationUseCase$getAttestationFileRequest$1 = new GetAttestationUseCase$getAttestationFileRequest$1(this, continuation);
            }
        }
        java.lang.Object obj = getAttestationUseCase$getAttestationFileRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAttestationUseCase$getAttestationFileRequest$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C13934dbu c13934dbu = this.KWHzl;
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(C54905xZr.EZpvd().keySet(), ",", null, null, 0, null, null, 62, null);
        getAttestationUseCase$getAttestationFileRequest$1.label = 1;
        java.lang.Object objValueOf = c13934dbu.valueOf(strJoinToString$default, getAttestationUseCase$getAttestationFileRequest$1);
        return objValueOf == objCopydefault ? objCopydefault : objValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Result<AttestationParseData>> continuation) {
        GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$1 getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1;
        if (continuation instanceof GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$1) {
            getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1 = (GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$1) continuation;
            int i = getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1.label = i - Integer.MIN_VALUE;
            } else {
                getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1 = new GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2 getAttestationUseCase$attestationVerifyAndGetPubKeyHex$2 = new GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2(this, null);
            getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getAttestationUseCase$attestationVerifyAndGetPubKeyHex$2, getAttestationUseCase$attestationVerifyAndGetPubKeyHex$1);
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
