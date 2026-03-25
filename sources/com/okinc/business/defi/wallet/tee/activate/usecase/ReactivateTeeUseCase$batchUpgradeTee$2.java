package com.okinc.business.defi.wallet.tee.activate.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeMiddleModel;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.model.HPKEInfoData;
import com.okinc.business.defi.wallet.tee.common.model.TeeBatchAuthorizeReqData;
import com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResult;
import com.okinc.business.defi.wallet.tee.common.model.UpgradeTeeResultItem;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C13934dbu;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.fTG;
import o.fTT;
import o.fTU;
import o.fTV;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class ReactivateTeeUseCase$batchUpgradeTee$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TeeOperateSuccessState>>>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ fTG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactivateTeeUseCase$batchUpgradeTee$2(fTG ftg, AbstractC12782ctV abstractC12782ctV, String str, ActivateTeeModel activateTeeModel, Continuation<? super ReactivateTeeUseCase$batchUpgradeTee$2> continuation) {
        super(2, continuation);
        this.this$0 = ftg;
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.$activateTeeModel = activateTeeModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactivateTeeUseCase$batchUpgradeTee$2(this.this$0, this.$wallet, this.$password, this.$activateTeeModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TeeOperateSuccessState>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<TeeOperateSuccessState>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<TeeOperateSuccessState>>> continuation) {
        return ((ReactivateTeeUseCase$batchUpgradeTee$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b0  */
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
        Object objEZpvd;
        AttestationParseData attestationParseData2;
        Throwable thM7380exceptionOrNullimpl2;
        UpgradeTeeResultItem upgradeTeeResultItem;
        Long expireTimestamp;
        Object objOLrzqt;
        ActivateTeeMiddleModel activateTeeMiddleModel2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.KWHzl, "ReactivateTeeUseCase start ");
            fTU ftu = this.this$0.OLrzqt;
            this.label = 1;
            objKWHzl = ftu.KWHzl(this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            AttestationParseData attestationParseData3 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            attestationParseData = attestationParseData3;
            fTG ftg = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
                activateTeeMiddleModel = (ActivateTeeMiddleModel) objCopydefault;
                C13934dbu c13934dbu = this.this$0.AhwBna;
                String strUSBtdM = this.$wallet.USBtdM();
                String strDbNXlk = this.$wallet.DbNXlk();
                String strAUsmxb = this.$wallet.aUsmxb();
                TeeBatchAuthorizeReqData teeBatchAuthorizeReqData = new TeeBatchAuthorizeReqData(C56402yEa.EZpvd(activateTeeMiddleModel.getActivateTEERequest()), activateTeeMiddleModel.getActivateTEERequest().getFrontendPubkeyVersionSelected());
                this.L$0 = attestationParseData;
                this.L$1 = activateTeeMiddleModel;
                this.label = 3;
                objEZpvd = c13934dbu.EZpvd(strUSBtdM, strDbNXlk, strAUsmxb, teeBatchAuthorizeReqData, this);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                attestationParseData2 = attestationParseData;
                fTG ftg2 = this.this$0;
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
                if (thM7380exceptionOrNullimpl2 == null) {
                }
            } else {
                pUU.copydefault(ftg.KWHzl, "activateTeeMiddleData operation is failed = " + thM7380exceptionOrNullimpl.getMessage());
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                UpgradeTeeResultItem upgradeTeeResultItem2 = (UpgradeTeeResultItem) this.L$1;
                activateTeeMiddleModel2 = (ActivateTeeMiddleModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                upgradeTeeResultItem = upgradeTeeResultItem2;
                objOLrzqt = obj;
                if (!((Boolean) objOLrzqt).booleanValue()) {
                    pUU.copydefault(this.this$0.KWHzl, "batchUpgradeTee teeHPKEDecrypt is success and return data");
                    Result.Application application2 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56402yEa.EZpvd(new TeeOperateSuccessState(upgradeTeeResultItem.getExpireTimestamp().longValue(), Intrinsics.EZpvd(upgradeTeeResultItem.getAutoRenew(), C56443yFo.KWHzl(true)), activateTeeMiddleModel2.getActivateTEERequest().getTeeId(), this.$wallet.DbNXlk(), upgradeTeeResultItem.isActive()))));
                }
                Result.Application application3 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.KWHzl + ": reactivate tee result HPKE sdk verify failed"))));
            }
            ActivateTeeMiddleModel activateTeeMiddleModel3 = (ActivateTeeMiddleModel) this.L$1;
            attestationParseData2 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
            activateTeeMiddleModel = activateTeeMiddleModel3;
            fTG ftg22 = this.this$0;
            thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objEZpvd);
            if (thM7380exceptionOrNullimpl2 == null) {
                pUU.copydefault(ftg22.KWHzl, "batchUpgradeTee request is failed = " + thM7380exceptionOrNullimpl2.getMessage());
                Result.Application application4 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
            }
            UpgradeTeeResult upgradeTeeResult = (UpgradeTeeResult) objEZpvd;
            List<UpgradeTeeResultItem> teeResultList = upgradeTeeResult.getTeeResultList();
            if (teeResultList == null || teeResultList.isEmpty()) {
                Result.Application application5 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.KWHzl + ": reactivate tee result backend api teeResultList"))));
            }
            upgradeTeeResultItem = (UpgradeTeeResultItem) CollectionsKt___CollectionsKt.AuCTelauCTel(upgradeTeeResult.getTeeResultList());
            HPKEInfoData hpkeInfo = upgradeTeeResultItem.getHpkeInfo();
            if (hpkeInfo == null) {
                Result.Application application6 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.KWHzl + ": reactivate tee hpkeInfo is null"))));
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
            if (ciphertext.length() != 0 && ad.length() != 0 && str.length() != 0 && upgradeTeeResultItem.getExpireTimestamp() != null && ((expireTimestamp = upgradeTeeResultItem.getExpireTimestamp()) == null || expireTimestamp.longValue() != 0)) {
                fTV ftv = this.this$0.AEQbTJ;
                String priKeyHex = activateTeeMiddleModel.getHPKEKeypair().getPriKeyHex();
                String userDataHex = attestationParseData2.getUserDataHex();
                this.L$0 = activateTeeMiddleModel;
                this.L$1 = upgradeTeeResultItem;
                this.label = 4;
                objOLrzqt = ftv.OLrzqt(ciphertext, ad, str, priKeyHex, userDataHex, this);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                activateTeeMiddleModel2 = activateTeeMiddleModel;
                if (!((Boolean) objOLrzqt).booleanValue()) {
                }
            } else {
                Result.Application application7 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.KWHzl + ": reactivate tee  backend api ciphertext ad encapsulatedKey are null or empty or expireTimestamp is empty"))));
            }
        }
        fTG ftg3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl3 == null) {
            attestationParseData = (AttestationParseData) objKWHzl;
            fTT ftt = this.this$0.EZpvd;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            String str2 = this.$password;
            ActivateTeeModel activateTeeModel = this.$activateTeeModel;
            this.L$0 = attestationParseData;
            this.label = 2;
            objCopydefault = ftt.copydefault(abstractC12782ctV, str2, activateTeeModel, attestationParseData, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fTG ftg4 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            pUU.copydefault(ftg3.KWHzl, "attestation period failed = " + thM7380exceptionOrNullimpl3.getMessage());
            Result.Application application8 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl3)));
        }
    }
}
