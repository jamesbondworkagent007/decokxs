package com.okinc.business.defi.wallet.tee.disable.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.common.model.AttestationParseData;
import com.okinc.business.defi.wallet.tee.common.model.RemovePayloadData;
import com.okinc.business.defi.wallet.tee.common.model.RemoveTeeResult;
import com.okinc.business.defi.wallet.tee.common.model.TeeRemoveReqItemData;
import com.okinc.business.defi.wallet.tee.common.model.TeeRemoveRequest;
import com.okinc.business.defi.wallet.tee.common.model.TeeReqAndResultData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C13934dbu;
import o.C17869fVh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.fTU;
import o.fTV;
import o.fTW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoveTeeUseCase$removeTee$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C17869fVh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveTeeUseCase$removeTee$2(C17869fVh c17869fVh, AbstractC12782ctV abstractC12782ctV, String str, ActivateTeeModel activateTeeModel, Continuation<? super RemoveTeeUseCase$removeTee$2> continuation) {
        super(2, continuation);
        this.this$0 = c17869fVh;
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.$activateTeeModel = activateTeeModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoveTeeUseCase$removeTee$2(this.this$0, this.$wallet, this.$password, this.$activateTeeModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((RemoveTeeUseCase$removeTee$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        AttestationParseData attestationParseData;
        long jAEQbTJ;
        Object objAwait;
        long j;
        Throwable th;
        Object objOLrzqt;
        AttestationParseData attestationParseData2;
        String str;
        Object objCopydefault;
        AttestationParseData attestationParseData3;
        Throwable thM7380exceptionOrNullimpl;
        Object objOLrzqt2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.OLrzqt, "removeTee start");
            fTU ftu = this.this$0.KWHzl;
            this.label = 1;
            objKWHzl = ftu.KWHzl(this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            j = this.J$0;
            attestationParseData = (AttestationParseData) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                jAEQbTJ = j;
                objAwait = obj;
                String str2 = (String) objAwait;
                String json = new RemovePayloadData(this.$wallet.ejfBZ(), this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getCommand().getCommand()).toJson();
                fTW ftw = this.this$0.copydefault;
                Intrinsics.copydefault((Object) str2);
                this.L$0 = attestationParseData;
                this.L$1 = json;
                this.label = 3;
                objOLrzqt = ftw.OLrzqt(str2, json, this);
                if (objOLrzqt != objCopydefault2) {
                    return objCopydefault2;
                }
                attestationParseData2 = attestationParseData;
                str = json;
                TeeRemoveRequest teeRemoveRequest = new TeeRemoveRequest(this.$wallet.DbNXlk(), new TeeRemoveReqItemData(str, (String) objOLrzqt));
                C13934dbu c13934dbu = this.this$0.djBIcL;
                String strUSBtdM = this.$wallet.USBtdM();
                String strDbNXlk = this.$wallet.DbNXlk();
                String strAUsmxb = this.$wallet.aUsmxb();
                this.L$0 = attestationParseData2;
                this.L$1 = null;
                this.label = 4;
                objCopydefault = c13934dbu.copydefault(strUSBtdM, strDbNXlk, strAUsmxb, teeRemoveRequest, this);
                if (objCopydefault != objCopydefault2) {
                }
            } catch (Throwable th2) {
                th = th2;
                pUU.AEQbTJ(this.this$0.OLrzqt, "Failed to get privateKey for chainId=" + j, th);
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.OLrzqt + " get privateKey failed"))));
            }
        } else if (i == 3) {
            str = (String) this.L$1;
            AttestationParseData attestationParseData4 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            attestationParseData2 = attestationParseData4;
            objOLrzqt = obj;
            TeeRemoveRequest teeRemoveRequest2 = new TeeRemoveRequest(this.$wallet.DbNXlk(), new TeeRemoveReqItemData(str, (String) objOLrzqt));
            C13934dbu c13934dbu2 = this.this$0.djBIcL;
            String strUSBtdM2 = this.$wallet.USBtdM();
            String strDbNXlk2 = this.$wallet.DbNXlk();
            String strAUsmxb2 = this.$wallet.aUsmxb();
            this.L$0 = attestationParseData2;
            this.L$1 = null;
            this.label = 4;
            objCopydefault = c13934dbu2.copydefault(strUSBtdM2, strDbNXlk2, strAUsmxb2, teeRemoveRequest2, this);
            if (objCopydefault != objCopydefault2) {
                return objCopydefault2;
            }
            attestationParseData3 = attestationParseData2;
            C17869fVh c17869fVh = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt2 = obj;
                if (!((Boolean) objOLrzqt2).booleanValue()) {
                    pUU.copydefault(this.this$0.OLrzqt, "RemoveTee operate end and verify success and return data");
                    Result.Application application2 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56443yFo.KWHzl(true)));
                }
                Result.Application application3 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.OLrzqt + ": remove tee result hpke sdk verify failed"))));
            }
            attestationParseData3 = (AttestationParseData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
            C17869fVh c17869fVh2 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
            if (thM7380exceptionOrNullimpl == null) {
                pUU.copydefault(c17869fVh2.OLrzqt, "removeTee request failed = " + thM7380exceptionOrNullimpl.getMessage());
                Result.Application application4 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
            }
            RemoveTeeResult removeTeeResult = (RemoveTeeResult) objCopydefault;
            TeeReqAndResultData teeResult = removeTeeResult.getTeeResult();
            String payload = teeResult != null ? teeResult.getPayload() : null;
            if (payload == null) {
                payload = "";
            }
            TeeReqAndResultData teeResult2 = removeTeeResult.getTeeResult();
            String signature = teeResult2 != null ? teeResult2.getSignature() : null;
            String str3 = signature != null ? signature : "";
            if (payload.length() != 0 && str3.length() != 0) {
                fTV ftv = this.this$0.valueOf;
                String pubKeyHex = attestationParseData3.getPubKeyHex();
                this.L$0 = null;
                this.label = 5;
                objOLrzqt2 = ftv.OLrzqt(payload, pubKeyHex, str3, this);
                if (objOLrzqt2 == objCopydefault2) {
                    return objCopydefault2;
                }
                if (!((Boolean) objOLrzqt2).booleanValue()) {
                }
            } else {
                Result.Application application5 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.OLrzqt + ": remove tee backend api core params is null or empty"))));
            }
        }
        C17869fVh c17869fVh3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl2 == null) {
            attestationParseData = (AttestationParseData) objKWHzl;
            C10854bwM c10854bwMIsConnected = this.this$0.AEQbTJ.isConnected();
            if (c10854bwMIsConnected == null) {
                Result.Application application6 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.KWHzl(this.this$0.OLrzqt + ": remove tee get eth chainId failed"))));
            }
            jAEQbTJ = c10854bwMIsConnected.AEQbTJ();
            try {
                AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(this.$wallet, this.$password, jAEQbTJ, 0, 4, null);
                this.L$0 = attestationParseData;
                this.J$0 = jAEQbTJ;
                this.label = 2;
                objAwait = RxAwaitKt.await(abstractC58260yxtPrivateKeyForChainId$default, this);
                if (objAwait == objCopydefault2) {
                    return objCopydefault2;
                }
                String str22 = (String) objAwait;
                String json2 = new RemovePayloadData(this.$wallet.ejfBZ(), this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getCommand().getCommand()).toJson();
                fTW ftw2 = this.this$0.copydefault;
                Intrinsics.copydefault((Object) str22);
                this.L$0 = attestationParseData;
                this.L$1 = json2;
                this.label = 3;
                objOLrzqt = ftw2.OLrzqt(str22, json2, this);
                if (objOLrzqt != objCopydefault2) {
                }
            } catch (Throwable th3) {
                th = th3;
                j = jAEQbTJ;
                pUU.AEQbTJ(this.this$0.OLrzqt, "Failed to get privateKey for chainId=" + j, th);
                Result.Application application7 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.OLrzqt + " get privateKey failed"))));
            }
        } else {
            pUU.copydefault(c17869fVh3.OLrzqt, "attestation period failed = " + thM7380exceptionOrNullimpl2.getMessage());
            Result.Application application8 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
        }
    }
}
