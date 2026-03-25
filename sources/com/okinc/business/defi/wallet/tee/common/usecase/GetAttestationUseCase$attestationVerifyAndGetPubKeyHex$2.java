package com.okinc.business.defi.wallet.tee.common.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.common.model.AttestationFileResult;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.wallet.core.tee.TeeAttestationVerifyData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C17835fUa;
import o.C54905xZr;
import o.C56391yDq;
import o.C56442yFn;
import o.fTQ;
import o.fTU;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AttestationParseData>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fTU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2(fTU ftu, Continuation<? super GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2> continuation) {
        super(2, continuation);
        this.this$0 = ftu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AttestationParseData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<AttestationParseData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<AttestationParseData>> continuation) {
        return ((GetAttestationUseCase$attestationVerifyAndGetPubKeyHex$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String str;
        String str2;
        String str3;
        TeeAttestationVerifyData teeAttestationVerifyData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.AEQbTJ, "attestation file start");
            fTU ftu = this.this$0;
            this.label = 1;
            objOLrzqt = ftu.OLrzqt((Continuation<? super Result<AttestationFileResult>>) this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                teeAttestationVerifyData = (TeeAttestationVerifyData) obj;
                if (teeAttestationVerifyData != null) {
                    Result.Application application = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + " : sdk attestation file parse failed"))));
                }
                String pubKeyHex = teeAttestationVerifyData.getPubKeyHex();
                if (pubKeyHex == null) {
                    pubKeyHex = "";
                }
                String userDataHex = teeAttestationVerifyData.getUserDataHex();
                String str4 = userDataHex != null ? userDataHex : "";
                if (pubKeyHex.length() == 0 || str4.length() == 0) {
                    Result.Application application2 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + " : sdk attestation file parse failed"))));
                }
                AttestationParseData attestationParseData = new AttestationParseData(pubKeyHex, str4, str3);
                pUU.copydefault(this.this$0.AEQbTJ, "attestation file end and return success");
                Result.Application application3 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(attestationParseData));
            }
            str = (String) this.L$1;
            str2 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                fTQ ftq = this.this$0.OLrzqt;
                this.L$0 = str;
                this.L$1 = null;
                this.label = 3;
                obj = ftq.OLrzqt(str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
                teeAttestationVerifyData = (TeeAttestationVerifyData) obj;
                if (teeAttestationVerifyData != null) {
                }
            } else {
                Result.Application application4 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + " : sdk RSA verify failed"))));
            }
        }
        fTU ftu2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault(ftu2.AEQbTJ, "attestation file request failed = " + thM7380exceptionOrNullimpl.getMessage());
            Result.Application application5 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
        AttestationFileResult attestationFileResult = (AttestationFileResult) objOLrzqt;
        String signData = attestationFileResult.getSignData();
        if (signData == null) {
            signData = "";
        }
        String backendSignature = attestationFileResult.getBackendSignature();
        if (backendSignature == null) {
            backendSignature = "";
        }
        String frontendPubkeyVersionSelected = attestationFileResult.getFrontendPubkeyVersionSelected();
        if (frontendPubkeyVersionSelected == null) {
            frontendPubkeyVersionSelected = "";
        }
        String str5 = C54905xZr.EZpvd().get(frontendPubkeyVersionSelected);
        if (str5 == null) {
            str5 = "";
        }
        if (signData.length() != 0 && backendSignature.length() != 0 && str5.length() != 0 && frontendPubkeyVersionSelected.length() != 0) {
            C17835fUa c17835fUa = this.this$0.copydefault;
            this.L$0 = signData;
            this.L$1 = frontendPubkeyVersionSelected;
            this.label = 2;
            Object objCopydefault2 = c17835fUa.copydefault(signData, str5, backendSignature, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            String str6 = signData;
            str = frontendPubkeyVersionSelected;
            obj = objCopydefault2;
            str2 = str6;
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            Result.Application application6 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.AEQbTJ + " : get attestation file core backend api response is null or empty"))));
        }
    }
}
