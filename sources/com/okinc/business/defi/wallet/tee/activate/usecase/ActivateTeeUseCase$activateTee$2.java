package com.okinc.business.defi.wallet.tee.activate.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeMiddleModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeActivateOperateSuccessState;
import com.okinc.business.defi.wallet.tee.common.model.ActivateTEERequest;
import com.okinc.business.defi.wallet.tee.common.model.ActivateTEEResult;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTB;
import o.fTT;
import o.fTU;
import o.fTV;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateTeeUseCase$activateTee$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TeeActivateOperateSuccessState>>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fTB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTeeUseCase$activateTee$2(fTB ftb, AbstractC12782ctV abstractC12782ctV, String str, ActivateTeeModel activateTeeModel, Continuation<? super ActivateTeeUseCase$activateTee$2> continuation) {
        super(2, continuation);
        this.this$0 = ftb;
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.$activateTeeModel = activateTeeModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateTeeUseCase$activateTee$2(this.this$0, this.$wallet, this.$password, this.$activateTeeModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TeeActivateOperateSuccessState>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TeeActivateOperateSuccessState>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TeeActivateOperateSuccessState>> continuation) {
        return ((ActivateTeeUseCase$activateTee$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        AttestationParseData attestationParseData;
        Object objCopydefault;
        Throwable thM7380exceptionOrNullimpl;
        ActivateTeeMiddleModel activateTeeMiddleModel;
        Object objCopydefault2;
        AttestationParseData attestationParseData2;
        Throwable thM7380exceptionOrNullimpl2;
        ActivateTEEResult activateTEEResult;
        Long expireTimestamp;
        Object objOLrzqt;
        ActivateTeeMiddleModel activateTeeMiddleModel2;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.AEQbTJ, "activateTee start");
            fTU ftu = this.this$0.KWHzl;
            this.label = 1;
            objKWHzl = ftu.KWHzl(this);
            if (objKWHzl == objCopydefault3) {
                return objCopydefault3;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            AttestationParseData attestationParseData3 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            attestationParseData = attestationParseData3;
            fTB ftb = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
                activateTeeMiddleModel = (ActivateTeeMiddleModel) objCopydefault;
                C13934dbu c13934dbu = this.this$0.AYXKKw;
                String strUSBtdM = this.$wallet.USBtdM();
                String strDbNXlk = this.$wallet.DbNXlk();
                String strAUsmxb = this.$wallet.aUsmxb();
                ActivateTEERequest activateTEERequest = activateTeeMiddleModel.getActivateTEERequest();
                this.L$0 = attestationParseData;
                this.L$1 = activateTeeMiddleModel;
                this.label = 3;
                objCopydefault2 = c13934dbu.copydefault(strUSBtdM, strDbNXlk, strAUsmxb, activateTEERequest, this);
                if (objCopydefault2 == objCopydefault3) {
                    return objCopydefault3;
                }
                attestationParseData2 = attestationParseData;
                fTB ftb2 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objCopydefault2);
                if (thM7380exceptionOrNullimpl2 == null) {
                }
            } else {
                pUU.copydefault(ftb.AEQbTJ, "activateTeeMiddleData operation is failed = " + thM7380exceptionOrNullimpl.getMessage());
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ActivateTEEResult activateTEEResult2 = (ActivateTEEResult) this.L$1;
                activateTeeMiddleModel2 = (ActivateTeeMiddleModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                activateTEEResult = activateTEEResult2;
                objOLrzqt = obj;
                if (!((Boolean) objOLrzqt).booleanValue()) {
                    pUU.copydefault(this.this$0.AEQbTJ, "activateTee request end and return success");
                    Result.Application application2 = Result.Companion;
                    Boolean boolIsActive = activateTEEResult.isActive();
                    boolean zBooleanValue = boolIsActive != null ? boolIsActive.booleanValue() : false;
                    long jLongValue = activateTEEResult.getExpireTimestamp().longValue();
                    Long extendExpirePeriodDay = activateTEEResult.getExtendExpirePeriodDay();
                    return Result.m7376boximpl(Result.m7377constructorimpl(new TeeActivateOperateSuccessState(zBooleanValue, jLongValue, extendExpirePeriodDay != null ? extendExpirePeriodDay.longValue() : 15L, Intrinsics.EZpvd(activateTEEResult.getAutoRenew(), C56443yFo.KWHzl(true)), activateTeeMiddleModel2.getActivateTEERequest().getTeeId(), this.$wallet.DbNXlk())));
                }
                Result.Application application3 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + ": activate tee result hpke sdk verify failed"))));
            }
            ActivateTeeMiddleModel activateTeeMiddleModel3 = (ActivateTeeMiddleModel) this.L$1;
            attestationParseData2 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault2 = ((Result) obj).m7386unboximpl();
            activateTeeMiddleModel = activateTeeMiddleModel3;
            fTB ftb22 = this.this$0;
            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objCopydefault2);
            if (thM7380exceptionOrNullimpl2 == null) {
                pUU.copydefault(ftb22.AEQbTJ, "activateTee request is failed = " + thM7380exceptionOrNullimpl2.getMessage());
                Result.Application application4 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
            }
            activateTEEResult = (ActivateTEEResult) objCopydefault2;
            HPKEInfoData hpkeInfo = activateTEEResult.getHpkeInfo();
            if (hpkeInfo == null) {
                Result.Application application5 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.AEQbTJ + ": activate tee hpkeInfo is null"))));
            }
            String ciphertext = hpkeInfo.getCiphertext();
            if (ciphertext == null) {
                ciphertext = "";
            }
            String ad = hpkeInfo.getAD();
            if (ad == null) {
                ad = "";
            }
            String encapsulatedKey = hpkeInfo.getEncapsulatedKey();
            String str = encapsulatedKey != null ? encapsulatedKey : "";
            if (ciphertext.length() != 0 && ad.length() != 0 && str.length() != 0 && activateTEEResult.getExpireTimestamp() != null && ((expireTimestamp = activateTEEResult.getExpireTimestamp()) == null || expireTimestamp.longValue() != 0)) {
                fTV ftv = this.this$0.OLrzqt;
                String priKeyHex = activateTeeMiddleModel.getHPKEKeypair().getPriKeyHex();
                String userDataHex = attestationParseData2.getUserDataHex();
                this.L$0 = activateTeeMiddleModel;
                this.L$1 = activateTEEResult;
                this.label = 4;
                objOLrzqt = ftv.OLrzqt(ciphertext, ad, str, priKeyHex, userDataHex, this);
                if (objOLrzqt == objCopydefault3) {
                    return objCopydefault3;
                }
                activateTeeMiddleModel2 = activateTeeMiddleModel;
                if (!((Boolean) objOLrzqt).booleanValue()) {
                }
            } else {
                Result.Application application6 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.AEQbTJ + ": activate tee ciphertext ad encapsulatedKey backend api are null or empty || expireTimestamp is null or 0"))));
            }
        }
        fTB ftb3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl3 == null) {
            attestationParseData = (AttestationParseData) objKWHzl;
            fTT ftt = this.this$0.copydefault;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            String str2 = this.$password;
            ActivateTeeModel activateTeeModel = this.$activateTeeModel;
            this.L$0 = attestationParseData;
            this.label = 2;
            objCopydefault = ftt.copydefault(abstractC12782ctV, str2, activateTeeModel, attestationParseData, this);
            if (objCopydefault == objCopydefault3) {
                return objCopydefault3;
            }
            fTB ftb4 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            pUU.copydefault(ftb3.AEQbTJ, "attestation period failed = " + thM7380exceptionOrNullimpl3.getMessage());
            Result.Application application7 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl3)));
        }
    }
}
