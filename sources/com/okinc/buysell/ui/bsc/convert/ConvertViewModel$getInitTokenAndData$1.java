package com.okinc.buysell.ui.bsc.convert;

import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C30327lUg;
import o.C31389ltB;
import o.C31653lza;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyP;
import o.lyU;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertViewModel$getInitTokenAndData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BSCMasterViewModel $masterViewModel;
    Object L$0;
    int label;
    final /* synthetic */ ConvertViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertViewModel$getInitTokenAndData$1(BSCMasterViewModel bSCMasterViewModel, ConvertViewModel convertViewModel, Continuation<? super ConvertViewModel$getInitTokenAndData$1> continuation) {
        super(2, continuation);
        this.$masterViewModel = bSCMasterViewModel;
        this.this$0 = convertViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertViewModel$getInitTokenAndData$1(this.$masterViewModel, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertViewModel$getInitTokenAndData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0183  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C31653lza c31653lza;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BuySellConvertParameters fieldNames = this.$masterViewModel.getFieldNames();
            String str = null;
            String strValues = fieldNames != null ? fieldNames.values() : null;
            lyU fieldNames2 = this.this$0.getFieldNames();
            BuySellConvertParameters fieldNames3 = this.$masterViewModel.getFieldNames();
            String strCopydefault = fieldNames3 != null ? fieldNames3.copydefault() : null;
            BSCMasterViewModel bSCMasterViewModel = this.$masterViewModel;
            if ((strValues != null && strValues.length() != 0) || (!C30327lUg.OLrzqt(PaymentFeatureFlag.SIMPLE_TRADE_L2_TOKEN_CARRYOVER) && !bSCMasterViewModel.AEQbTJ(TargetTab.CONVERT))) {
                strCopydefault = null;
            }
            if (strValues != null && this.$masterViewModel.AEQbTJ(TargetTab.CONVERT)) {
                str = strValues;
            }
            String isoCode = this.this$0.fIwbmz().getIsoCode();
            this.label = 1;
            obj = fieldNames2.copydefault(strCopydefault, str, isoCode, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c31653lza = (C31653lza) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                ConvertViewModel convertViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    C31389ltB c31389ltB = (C31389ltB) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    mHA mha = mHA.OLrzqt;
                    mha.OLrzqt(convertViewModel.isConnected, new Pair(convertViewModel.fetchVPNInfo(), convertViewModel.ejfBZ()));
                    convertViewModel.gEmmrt.setValue(convertViewModel.fetchVPNInfo().getIcon());
                    convertViewModel.AhwBna.setValue(convertViewModel.fetchVPNInfo().getCcy());
                    convertViewModel.gHZMYf.setValue(convertViewModel.ejfBZ().getIcon());
                    convertViewModel.OcIXYQ.setValue(convertViewModel.ejfBZ().getCcy());
                    convertViewModel.DTwDnp.setValue(convertViewModel.EZpvd(convertViewModel.ejfBZ().getEarnOption()));
                    mha.OLrzqt(convertViewModel.fJNWhG, C56443yFo.KWHzl(convertViewModel.OLrzqt(c31653lza.copydefault(), c31653lza.EZpvd())));
                    mha.OLrzqt(convertViewModel.fIwbmz, C56443yFo.KWHzl(Intrinsics.EZpvd(c31653lza.copydefault().getFiatFlag(), C56443yFo.KWHzl(true))));
                    mha.OLrzqt(convertViewModel.DbNXlk, c31389ltB);
                }
                ConvertViewModel convertViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    mHA.OLrzqt.OLrzqt(convertViewModel2.AubY, C56443yFo.KWHzl(true));
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C31653lza c31653lza2 = (C31653lza) obj;
        this.this$0.OLrzqt(c31653lza2.AEQbTJ());
        this.this$0.EZpvd(c31653lza2.copydefault(), c31653lza2.EZpvd());
        this.this$0.AEQbTJ(c31653lza2.OLrzqt());
        this.this$0.copydefault(c31653lza2.KWHzl());
        lyP lypZLjUOn = this.this$0.zLjUOn();
        ConvertCurrencyBean convertCurrencyBeanFetchVPNInfo = this.this$0.fetchVPNInfo();
        ConvertCurrencyBean convertCurrencyBeanEjfBZ = this.this$0.ejfBZ();
        this.L$0 = c31653lza2;
        this.label = 2;
        Object objCopydefault2 = lypZLjUOn.copydefault(convertCurrencyBeanFetchVPNInfo, convertCurrencyBeanEjfBZ, this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        c31653lza = c31653lza2;
        obj = objCopydefault2;
        abstractC43419rot = (AbstractC43419rot) obj;
        ConvertViewModel convertViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        ConvertViewModel convertViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
