package com.okinc.business.defi.wallet.tee.extend.usecase;

import com.okinc.business.defi.biz.core.error.TeeGeneratedError;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.common.model.ExtendPayloadData;
import com.okinc.business.defi.wallet.tee.common.model.ExtendTeeReqData;
import com.okinc.business.defi.wallet.tee.common.model.ExtendTeeResult;
import com.okinc.business.defi.wallet.tee.common.model.TeeExtendReqItemData;
import com.okinc.business.defi.wallet.tee.common.model.TeeExtendResultItemData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import o.C17871fVj;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.fTW;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class ExtendTeeUseCase$extendTee$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TeeOperateSuccessState>>, Object> {
    final /* synthetic */ ActivateTeeModel $activateTeeModel;
    final /* synthetic */ String $password;
    final /* synthetic */ AbstractC12782ctV $wallet;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ C17871fVj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendTeeUseCase$extendTee$2(C17871fVj c17871fVj, AbstractC12782ctV abstractC12782ctV, String str, ActivateTeeModel activateTeeModel, Continuation<? super ExtendTeeUseCase$extendTee$2> continuation) {
        super(2, continuation);
        this.this$0 = c17871fVj;
        this.$wallet = abstractC12782ctV;
        this.$password = str;
        this.$activateTeeModel = activateTeeModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExtendTeeUseCase$extendTee$2(this.this$0, this.$wallet, this.$password, this.$activateTeeModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TeeOperateSuccessState>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TeeOperateSuccessState>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TeeOperateSuccessState>> continuation) {
        return ((ExtendTeeUseCase$extendTee$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        String json;
        Object objAEQbTJ;
        Throwable thM7380exceptionOrNullimpl;
        Long expireTimestamp;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault(this.this$0.AEQbTJ, "ExtendTeeUseCase start");
            C10854bwM c10854bwMIsConnected = this.this$0.OLrzqt.isConnected();
            if (c10854bwMIsConnected == null) {
                Result.Application application = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.KWHzl(this.this$0.AEQbTJ + ": extend tee get eth chainId failed"))));
            }
            long jAEQbTJ = c10854bwMIsConnected.AEQbTJ();
            try {
                AbstractC58260yxt abstractC58260yxtPrivateKeyForChainId$default = AbstractC12782ctV.privateKeyForChainId$default(this.$wallet, this.$password, jAEQbTJ, 0, 4, null);
                this.J$0 = jAEQbTJ;
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtPrivateKeyForChainId$default, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                j = jAEQbTJ;
            } catch (Throwable th) {
                th = th;
                j = jAEQbTJ;
                pUU.AEQbTJ(this.this$0.AEQbTJ, "Failed to get privateKey for chainId=" + j, th);
                Result.Application application2 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + " get privateKey failed"))));
            }
        } else if (i == 1) {
            j = this.J$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th2) {
                th = th2;
                pUU.AEQbTJ(this.this$0.AEQbTJ, "Failed to get privateKey for chainId=" + j, th);
                Result.Application application22 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.OLrzqt(this.this$0.AEQbTJ + " get privateKey failed"))));
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
                C17871fVj c17871fVj = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault(c17871fVj.AEQbTJ, "batchExtendTee request failed = " + thM7380exceptionOrNullimpl.getMessage());
                    Result.Application application3 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
                }
                ExtendTeeResult extendTeeResult = (ExtendTeeResult) objAEQbTJ;
                List<TeeExtendResultItemData> teeResultList = extendTeeResult.getTeeResultList();
                if (teeResultList == null || teeResultList.isEmpty()) {
                    Result.Application application4 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.AEQbTJ + ": extend tee backend api result teeResultList is null or empty"))));
                }
                TeeExtendResultItemData teeExtendResultItemData = (TeeExtendResultItemData) CollectionsKt___CollectionsKt.AuCTelauCTel(extendTeeResult.getTeeResultList());
                if (teeExtendResultItemData.getExpireTimestamp() != null && ((expireTimestamp = teeExtendResultItemData.getExpireTimestamp()) == null || expireTimestamp.longValue() != 0)) {
                    pUU.copydefault(this.this$0.AEQbTJ, "batchExtendTee operate end and verify success and return data");
                    Result.Application application5 = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(new TeeOperateSuccessState(teeExtendResultItemData.getExpireTimestamp().longValue(), Intrinsics.EZpvd(teeExtendResultItemData.getAutoRenew(), C56443yFo.KWHzl(true)), this.$wallet.ejfBZ(), this.$wallet.DbNXlk(), true)));
                }
                Result.Application application6 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(TeeGeneratedError.Companion.EZpvd(this.this$0.AEQbTJ + ": extend tee backend api core params is null or empty || expireTimestamp is null or 0"))));
            }
            json = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            TeeExtendReqItemData teeExtendReqItemData = new TeeExtendReqItemData(this.$wallet.DbNXlk(), json, (String) obj);
            C13934dbu c13934dbu = this.this$0.djBIcL;
            String strUSBtdM = this.$wallet.USBtdM();
            String strDbNXlk = this.$wallet.DbNXlk();
            String strAUsmxb = this.$wallet.aUsmxb();
            ExtendTeeReqData extendTeeReqData = new ExtendTeeReqData(C56402yEa.EZpvd(teeExtendReqItemData));
            this.L$0 = null;
            this.label = 3;
            objAEQbTJ = c13934dbu.AEQbTJ(strUSBtdM, strDbNXlk, strAUsmxb, extendTeeReqData, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            C17871fVj c17871fVj2 = this.this$0;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
            if (thM7380exceptionOrNullimpl != null) {
            }
        }
        String str = (String) obj;
        json = new ExtendPayloadData(this.$wallet.ejfBZ(), this.$activateTeeModel.getTimestamp(), this.$activateTeeModel.getExpireTimestamp(), this.$activateTeeModel.getAutoRenew(), this.$activateTeeModel.getCommand().getCommand()).toJson();
        fTW ftw = this.this$0.KWHzl;
        Intrinsics.copydefault((Object) str);
        this.L$0 = json;
        this.label = 2;
        obj = ftw.OLrzqt(str, json, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        TeeExtendReqItemData teeExtendReqItemData2 = new TeeExtendReqItemData(this.$wallet.DbNXlk(), json, (String) obj);
        C13934dbu c13934dbu2 = this.this$0.djBIcL;
        String strUSBtdM2 = this.$wallet.USBtdM();
        String strDbNXlk2 = this.$wallet.DbNXlk();
        String strAUsmxb2 = this.$wallet.aUsmxb();
        ExtendTeeReqData extendTeeReqData2 = new ExtendTeeReqData(C56402yEa.EZpvd(teeExtendReqItemData2));
        this.L$0 = null;
        this.label = 3;
        objAEQbTJ = c13934dbu2.AEQbTJ(strUSBtdM2, strDbNXlk2, strAUsmxb2, extendTeeReqData2, this);
        if (objAEQbTJ == objCopydefault) {
        }
        C17871fVj c17871fVj22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
        }
    }
}
