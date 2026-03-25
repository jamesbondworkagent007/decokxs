package o;

import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.wallet.tee.timer.TeeTimer$calculateExpiredTime$1;
import com.okinc.business.defi.wallet.tee.timer.TeeTimer$start$1;
import com.okinc.components.track.TrackChannel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import o.C9678baC;
import o.InterfaceC13426dKx;
import o.dTH;
import o.fVU;
import o.fWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17920fXe {
    public static Job AEQbTJ;
    public static AbstractC12782ctV KWHzl;
    public static final C17920fXe EZpvd = new C17920fXe();
    public static final int copydefault = 8;

    private C17920fXe() {
    }

    public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.DTwDnp() || C17922fXg.AEQbTJ(abstractC12782ctV)) {
            OLrzqt();
            KWHzl = null;
            return;
        }
        long jFIwbmz = abstractC12782ctV.fIwbmz() - java.lang.System.currentTimeMillis();
        if (jFIwbmz > 0 && jFIwbmz <= 3600000) {
            KWHzl = abstractC12782ctV;
            AEQbTJ();
        } else {
            OLrzqt();
            KWHzl = null;
        }
    }

    public final void AEQbTJ() {
        Job job = AEQbTJ;
        if (job == null || !job.isActive()) {
            AEQbTJ = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new TeeTimer$start$1(null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeTimer$calculateExpiredTime$1 teeTimer$calculateExpiredTime$1;
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        SingleTeeStatus singleTeeStatus;
        SingleTeeStatus singleTeeStatus2;
        AbstractC12782ctV abstractC12782ctV3;
        SingleTeeStatus singleTeeStatus3;
        if (continuation instanceof TeeTimer$calculateExpiredTime$1) {
            teeTimer$calculateExpiredTime$1 = (TeeTimer$calculateExpiredTime$1) continuation;
            int i = teeTimer$calculateExpiredTime$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeTimer$calculateExpiredTime$1.label = i - Integer.MIN_VALUE;
            } else {
                teeTimer$calculateExpiredTime$1 = new TeeTimer$calculateExpiredTime$1(this, continuation);
            }
        }
        java.lang.Object obj = teeTimer$calculateExpiredTime$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeTimer$calculateExpiredTime$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV4 = KWHzl;
            if (abstractC12782ctV4 != null) {
                long jFIwbmz = abstractC12782ctV4.fIwbmz() - java.lang.System.currentTimeMillis();
                if (jFIwbmz <= 0) {
                    fVJ fieldNames = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
                    java.lang.String strDbNXlk = abstractC12782ctV4.DbNXlk();
                    java.lang.String strEjfBZ = abstractC12782ctV4.ejfBZ();
                    teeTimer$calculateExpiredTime$1.L$0 = abstractC12782ctV4;
                    teeTimer$calculateExpiredTime$1.label = 1;
                    java.lang.Object objAEQbTJ = fieldNames.AEQbTJ(strDbNXlk, strEjfBZ, false, false, teeTimer$calculateExpiredTime$1);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV2 = abstractC12782ctV4;
                    obj = objAEQbTJ;
                    singleTeeStatus = (SingleTeeStatus) obj;
                    if (singleTeeStatus == null) {
                    }
                } else if (jFIwbmz <= 1800000) {
                    SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm = abstractC12782ctV4.OJuSTm();
                    if (singleTeeStatusAndWarringInfoOJuSTm != null && singleTeeStatusAndWarringInfoOJuSTm.getHasShowExpiredAlert()) {
                        return Unit.INSTANCE;
                    }
                    fVJ fieldNames2 = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
                    java.lang.String strDbNXlk2 = abstractC12782ctV4.DbNXlk();
                    java.lang.String strEjfBZ2 = abstractC12782ctV4.ejfBZ();
                    teeTimer$calculateExpiredTime$1.L$0 = abstractC12782ctV4;
                    teeTimer$calculateExpiredTime$1.label = 2;
                    java.lang.Object objAEQbTJ2 = fieldNames2.AEQbTJ(strDbNXlk2, strEjfBZ2, false, false, teeTimer$calculateExpiredTime$1);
                    if (objAEQbTJ2 == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV = abstractC12782ctV4;
                    obj = objAEQbTJ2;
                    singleTeeStatus2 = (SingleTeeStatus) obj;
                    if (singleTeeStatus2 != null) {
                    }
                    EZpvd.copydefault(abstractC12782ctV);
                    ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(new dTH.TaskDescription(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz()));
                }
            }
        } else if (i2 == 1) {
            abstractC12782ctV2 = (AbstractC12782ctV) teeTimer$calculateExpiredTime$1.L$0;
            C56391yDq.AEQbTJ(obj);
            singleTeeStatus = (SingleTeeStatus) obj;
            if (singleTeeStatus == null) {
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(C17922fXg.OLrzqt(abstractC12782ctV2));
                if (!singleTeeStatus.getTeeStatus().isActive()) {
                    EZpvd.OLrzqt();
                }
            } else {
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(new dTH.ActionBar(abstractC12782ctV2.DbNXlk()));
            }
        } else if (i2 == 2) {
            abstractC12782ctV = (AbstractC12782ctV) teeTimer$calculateExpiredTime$1.L$0;
            C56391yDq.AEQbTJ(obj);
            singleTeeStatus2 = (SingleTeeStatus) obj;
            if (singleTeeStatus2 != null) {
                dTH dthOLrzqt = C17922fXg.OLrzqt(abstractC12782ctV);
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(dthOLrzqt);
                SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfoOJuSTm2 = abstractC12782ctV.OJuSTm();
                if (singleTeeStatusAndWarringInfoOJuSTm2 != null && !singleTeeStatusAndWarringInfoOJuSTm2.getHasShowExpiredAlert() && (dthOLrzqt instanceof dTH.TaskDescription)) {
                    EZpvd.copydefault(abstractC12782ctV);
                    fVJ fieldNames3 = InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames();
                    java.lang.String strDbNXlk3 = abstractC12782ctV.DbNXlk();
                    java.lang.String strEjfBZ3 = abstractC12782ctV.ejfBZ();
                    teeTimer$calculateExpiredTime$1.L$0 = abstractC12782ctV;
                    teeTimer$calculateExpiredTime$1.L$1 = singleTeeStatus2;
                    teeTimer$calculateExpiredTime$1.label = 3;
                    if (fieldNames3.KWHzl(strDbNXlk3, strEjfBZ3, true, teeTimer$calculateExpiredTime$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC12782ctV3 = abstractC12782ctV;
                    singleTeeStatus3 = singleTeeStatus2;
                    singleTeeStatus2 = singleTeeStatus3;
                    abstractC12782ctV = abstractC12782ctV3;
                }
                if (singleTeeStatus2 == null) {
                }
            }
            EZpvd.copydefault(abstractC12782ctV);
            ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(new dTH.TaskDescription(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz()));
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleTeeStatus3 = (SingleTeeStatus) teeTimer$calculateExpiredTime$1.L$1;
            abstractC12782ctV3 = (AbstractC12782ctV) teeTimer$calculateExpiredTime$1.L$0;
            C56391yDq.AEQbTJ(obj);
            singleTeeStatus2 = singleTeeStatus3;
            abstractC12782ctV = abstractC12782ctV3;
            if (singleTeeStatus2 == null) {
                EZpvd.copydefault(abstractC12782ctV);
                ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(new dTH.TaskDescription(abstractC12782ctV.DbNXlk(), abstractC12782ctV.fIwbmz()));
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final AbstractC12782ctV abstractC12782ctV) {
        fVE.Companion.EZpvd().EZpvd(new fWX.ActionBar(abstractC12782ctV.AkhnZx(), "30", new Function0() { // from class: o.fXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17920fXe.EZpvd(abstractC12782ctV);
            }
        }));
    }

    public static final Unit EZpvd(AbstractC12782ctV abstractC12782ctV) {
        C32866mlf.onEvent$default("Web3WalletSmartAccountHomePage_SmartAccountExpiryBannerReminder_Banner_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        android.app.Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
        if (activeActivity$default != null) {
            fVU.Application.startActivity$default(fVU.Companion, activeActivity$default, abstractC12782ctV.DbNXlk(), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        Job job = AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AEQbTJ = null;
        KWHzl = null;
    }
}
