package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.net.bean.AddressVerifyStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus;
import com.okinc.business.defi.wallet.tee.review.viewmodel.usecase.ReNewEnableUseCaseImpl$activeTeeState$1;
import com.okinc.business.defi.wallet.tee.review.viewmodel.usecase.ReNewEnableUseCaseImpl$getTeeStatus$1;
import com.okinc.business.defi.wallet.tee.review.viewmodel.usecase.ReNewEnableUseCaseImpl$getTeeUpgradeStatus$1;
import com.okinc.business.defi.wallet.tee.review.viewmodel.usecase.ReNewEnableUseCaseImpl$updateTeeExpireTime$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fWV implements fWU {
    public final fVP AEQbTJ;
    public final fWR EZpvd;
    public java.lang.String KWHzl;
    public final fVJ OLrzqt;
    public final fVN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.fWU
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    @yCM
    public fWV(@NotNull fVN fvn, @NotNull fVP fvp, @NotNull fWR fwr, @NotNull fVJ fvj) {
        Intrinsics.checkNotNullParameter(fvn, "");
        Intrinsics.checkNotNullParameter(fvp, "");
        Intrinsics.checkNotNullParameter(fwr, "");
        Intrinsics.checkNotNullParameter(fvj, "");
        this.copydefault = fvn;
        this.AEQbTJ = fvp;
        this.EZpvd = fwr;
        this.OLrzqt = fvj;
        this.KWHzl = "";
    }

    @Override // o.fWU
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super TeeMetadata> continuation) {
        return this.copydefault.EZpvd(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fWU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super TeeUpgradeStatus> continuation) throws java.lang.Throwable {
        ReNewEnableUseCaseImpl$getTeeUpgradeStatus$1 reNewEnableUseCaseImpl$getTeeUpgradeStatus$1;
        fWV fwv;
        java.lang.String strEjfBZ;
        java.lang.Object objCopydefault;
        if (continuation instanceof ReNewEnableUseCaseImpl$getTeeUpgradeStatus$1) {
            reNewEnableUseCaseImpl$getTeeUpgradeStatus$1 = (ReNewEnableUseCaseImpl$getTeeUpgradeStatus$1) continuation;
            int i = reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableUseCaseImpl$getTeeUpgradeStatus$1 = new ReNewEnableUseCaseImpl$getTeeUpgradeStatus$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault2 = reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.result;
        java.lang.Object objCopydefault3 = C56442yFn.copydefault();
        int i2 = reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault2);
            reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.L$0 = this;
            reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.label = 1;
            objCopydefault2 = copydefault(reNewEnableUseCaseImpl$getTeeUpgradeStatus$1);
            if (objCopydefault2 == objCopydefault3) {
                return objCopydefault3;
            }
            fwv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault2);
                objCopydefault = ((Result) objCopydefault2).m7386unboximpl();
                if (Result.m7383isFailureimpl(objCopydefault)) {
                    return objCopydefault;
                }
                return null;
            }
            fwv = (fWV) reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault2);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objCopydefault2;
        fVP fvp = fwv.AEQbTJ;
        if (abstractC12782ctV == null || (strEjfBZ = abstractC12782ctV.ejfBZ()) == null) {
            strEjfBZ = "";
        }
        reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.L$0 = null;
        reNewEnableUseCaseImpl$getTeeUpgradeStatus$1.label = 2;
        objCopydefault = fvp.copydefault(strEjfBZ, reNewEnableUseCaseImpl$getTeeUpgradeStatus$1);
        if (objCopydefault == objCopydefault3) {
            return objCopydefault3;
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
        }
    }

    @Override // o.fWU
    public java.lang.Object copydefault(@NotNull Continuation<? super AbstractC12782ctV> continuation) {
        return this.EZpvd.copydefault(this.KWHzl, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fWU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super SingleTeeStatus> continuation) throws java.lang.Throwable {
        ReNewEnableUseCaseImpl$getTeeStatus$1 reNewEnableUseCaseImpl$getTeeStatus$1;
        fWV fwv;
        java.lang.String strEjfBZ;
        if (continuation instanceof ReNewEnableUseCaseImpl$getTeeStatus$1) {
            reNewEnableUseCaseImpl$getTeeStatus$1 = (ReNewEnableUseCaseImpl$getTeeStatus$1) continuation;
            int i = reNewEnableUseCaseImpl$getTeeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableUseCaseImpl$getTeeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableUseCaseImpl$getTeeStatus$1 = new ReNewEnableUseCaseImpl$getTeeStatus$1(this, continuation);
            }
        }
        ReNewEnableUseCaseImpl$getTeeStatus$1 reNewEnableUseCaseImpl$getTeeStatus$12 = reNewEnableUseCaseImpl$getTeeStatus$1;
        java.lang.Object objCopydefault = reNewEnableUseCaseImpl$getTeeStatus$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableUseCaseImpl$getTeeStatus$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            reNewEnableUseCaseImpl$getTeeStatus$12.L$0 = this;
            reNewEnableUseCaseImpl$getTeeStatus$12.label = 1;
            objCopydefault = copydefault(reNewEnableUseCaseImpl$getTeeStatus$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fwv = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fwv = (fWV) reNewEnableUseCaseImpl$getTeeStatus$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objCopydefault;
        fVJ fvj = fwv.OLrzqt;
        java.lang.String str = fwv.KWHzl;
        if (abstractC12782ctV == null || (strEjfBZ = abstractC12782ctV.ejfBZ()) == null) {
            strEjfBZ = "";
        }
        reNewEnableUseCaseImpl$getTeeStatus$12.L$0 = null;
        reNewEnableUseCaseImpl$getTeeStatus$12.label = 2;
        objCopydefault = fvj.AEQbTJ(str, strEjfBZ, false, true, reNewEnableUseCaseImpl$getTeeStatus$12);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fWU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReNewEnableUseCaseImpl$updateTeeExpireTime$1 reNewEnableUseCaseImpl$updateTeeExpireTime$1;
        fWV fwv;
        if (continuation instanceof ReNewEnableUseCaseImpl$updateTeeExpireTime$1) {
            reNewEnableUseCaseImpl$updateTeeExpireTime$1 = (ReNewEnableUseCaseImpl$updateTeeExpireTime$1) continuation;
            int i = reNewEnableUseCaseImpl$updateTeeExpireTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableUseCaseImpl$updateTeeExpireTime$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableUseCaseImpl$updateTeeExpireTime$1 = new ReNewEnableUseCaseImpl$updateTeeExpireTime$1(this, continuation);
            }
        }
        ReNewEnableUseCaseImpl$updateTeeExpireTime$1 reNewEnableUseCaseImpl$updateTeeExpireTime$12 = reNewEnableUseCaseImpl$updateTeeExpireTime$1;
        java.lang.Object objCopydefault = reNewEnableUseCaseImpl$updateTeeExpireTime$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableUseCaseImpl$updateTeeExpireTime$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            reNewEnableUseCaseImpl$updateTeeExpireTime$12.L$0 = this;
            reNewEnableUseCaseImpl$updateTeeExpireTime$12.J$0 = j;
            reNewEnableUseCaseImpl$updateTeeExpireTime$12.label = 1;
            objCopydefault = copydefault(reNewEnableUseCaseImpl$updateTeeExpireTime$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fwv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                C56443yFo.KWHzl(((java.lang.Number) objCopydefault).longValue());
                return Unit.INSTANCE;
            }
            j = reNewEnableUseCaseImpl$updateTeeExpireTime$12.J$0;
            fwv = (fWV) reNewEnableUseCaseImpl$updateTeeExpireTime$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        long j2 = j;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objCopydefault;
        if (abstractC12782ctV != null) {
            fVJ fvj = fwv.OLrzqt;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strEjfBZ = abstractC12782ctV.ejfBZ();
            reNewEnableUseCaseImpl$updateTeeExpireTime$12.L$0 = null;
            reNewEnableUseCaseImpl$updateTeeExpireTime$12.label = 2;
            objCopydefault = fvj.OLrzqt(strDbNXlk, strEjfBZ, j2, reNewEnableUseCaseImpl$updateTeeExpireTime$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            C56443yFo.KWHzl(((java.lang.Number) objCopydefault).longValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.fWU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ReNewEnableUseCaseImpl$activeTeeState$1 reNewEnableUseCaseImpl$activeTeeState$1;
        long j2;
        fWV fwv;
        if (continuation instanceof ReNewEnableUseCaseImpl$activeTeeState$1) {
            reNewEnableUseCaseImpl$activeTeeState$1 = (ReNewEnableUseCaseImpl$activeTeeState$1) continuation;
            int i = reNewEnableUseCaseImpl$activeTeeState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableUseCaseImpl$activeTeeState$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableUseCaseImpl$activeTeeState$1 = new ReNewEnableUseCaseImpl$activeTeeState$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = reNewEnableUseCaseImpl$activeTeeState$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableUseCaseImpl$activeTeeState$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            reNewEnableUseCaseImpl$activeTeeState$1.L$0 = this;
            j2 = j;
            reNewEnableUseCaseImpl$activeTeeState$1.J$0 = j2;
            reNewEnableUseCaseImpl$activeTeeState$1.label = 1;
            objCopydefault = copydefault(reNewEnableUseCaseImpl$activeTeeState$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fwv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                C56443yFo.KWHzl(((java.lang.Number) objCopydefault).longValue());
                return Unit.INSTANCE;
            }
            j2 = reNewEnableUseCaseImpl$activeTeeState$1.J$0;
            fwv = (fWV) reNewEnableUseCaseImpl$activeTeeState$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        long j3 = j2;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objCopydefault;
        if (abstractC12782ctV != null) {
            fVJ fvj = fwv.OLrzqt;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strEjfBZ = abstractC12782ctV.ejfBZ();
            SingleTeeStatus singleTeeStatus = new SingleTeeStatus(abstractC12782ctV.DbNXlk(), abstractC12782ctV.ejfBZ(), new TeeStatus(true, true, j3, null, false, null, null, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null), new AddressVerifyStatus(true), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
            reNewEnableUseCaseImpl$activeTeeState$1.L$0 = null;
            reNewEnableUseCaseImpl$activeTeeState$1.label = 2;
            objCopydefault = fvj.AEQbTJ(strDbNXlk, strEjfBZ, singleTeeStatus, reNewEnableUseCaseImpl$activeTeeState$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            C56443yFo.KWHzl(((java.lang.Number) objCopydefault).longValue());
        }
        return Unit.INSTANCE;
    }
}
