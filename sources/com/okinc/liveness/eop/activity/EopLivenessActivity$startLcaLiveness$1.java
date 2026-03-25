package com.okinc.liveness.eop.activity;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC38205pQc;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC42441rSz;
import o.pRY;
import o.pUU;
import o.rSF;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessActivity$startLcaLiveness$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$startLcaLiveness$1(ActivityC38205pQc activityC38205pQc, Continuation<? super EopLivenessActivity$startLcaLiveness$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC38205pQc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessActivity$startLcaLiveness$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$startLcaLiveness$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("kyc_in_house", "Eop start LCA liveness");
            rSF rsf = (rSF) C43251rlk.OLrzqt(rSF.class);
            if (rsf != null) {
                ActivityC38205pQc activityC38205pQc = this.this$0;
                EopLivenessBasicViewModel eopLivenessBasicViewModel = activityC38205pQc.KWHzl;
                LcaSdkLivenessConfig fieldNames = eopLivenessBasicViewModel != null ? eopLivenessBasicViewModel.getFieldNames() : null;
                EopLivenessBasicViewModel eopLivenessBasicViewModel2 = this.this$0.KWHzl;
                String strDTwDnp = eopLivenessBasicViewModel2 != null ? eopLivenessBasicViewModel2.DTwDnp() : null;
                EopLivenessBasicViewModel eopLivenessBasicViewModel3 = this.this$0.KWHzl;
                String strUzCIH = eopLivenessBasicViewModel3 != null ? eopLivenessBasicViewModel3.uzCIH() : null;
                String strFIwbmz = this.this$0.fIwbmz();
                String strAuCTel = this.this$0.AuCTel();
                String strFARcdN = this.this$0.fARcdN();
                String strCopydefault = this.this$0.copydefault();
                pRY pry = this.this$0.EZpvd;
                FacialExtParams facialExtParamsOLrzqt = pry != null ? pry.OLrzqt() : null;
                final ActivityC38205pQc activityC38205pQc2 = this.this$0;
                InterfaceC42441rSz interfaceC42441rSz = new InterfaceC42441rSz() { // from class: com.okinc.liveness.eop.activity.EopLivenessActivity$startLcaLiveness$1.1
                    @Override // o.InterfaceC42441rSz
                    public void EZpvd(String str, Function0<Unit> function0) {
                        Intrinsics.checkNotNullParameter(str, "");
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc2), null, null, new EopLivenessActivity$startLcaLiveness$1$1$onSuccess$1(activityC38205pQc2, str, function0, null), 3, null);
                    }

                    @Override // o.InterfaceC42441rSz
                    public void EZpvd() {
                        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = activityC38205pQc2.KWHzl;
                        if (eopLivenessBasicViewModel4 != null) {
                            eopLivenessBasicViewModel4.RcXXUw();
                        }
                    }

                    @Override // o.InterfaceC42441rSz
                    public void EZpvd(String str, String str2, boolean z) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc2), null, null, new EopLivenessActivity$startLcaLiveness$1$1$onRetry$1(z, activityC38205pQc2, str, null), 3, null);
                    }

                    @Override // o.InterfaceC42441rSz
                    public void AEQbTJ(Function0<Unit> function0) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc2), null, null, new EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1(activityC38205pQc2, function0, null), 3, null);
                    }

                    @Override // o.InterfaceC42441rSz
                    public void EZpvd(Function0<Unit> function0) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc2), null, null, new EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1(activityC38205pQc2, function0, null), 3, null);
                    }

                    @Override // o.InterfaceC42441rSz
                    public void copydefault() {
                        pUU.KWHzl("qjf", "LcaLaunchListener-onFDDownSuccess");
                        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = activityC38205pQc2.KWHzl;
                        if (eopLivenessBasicViewModel4 != null) {
                            eopLivenessBasicViewModel4.UeEOUB();
                        }
                    }

                    @Override // o.InterfaceC42441rSz
                    public void AEQbTJ() {
                        pUU.KWHzl("qjf", "LcaLaunchListener-onFDDownloadError");
                        EopLivenessBasicViewModel eopLivenessBasicViewModel4 = activityC38205pQc2.KWHzl;
                        if (eopLivenessBasicViewModel4 != null) {
                            eopLivenessBasicViewModel4.djSkpj();
                        }
                    }
                };
                this.label = 1;
                if (rsf.KWHzl(activityC38205pQc, fieldNames, strDTwDnp, strUzCIH, strFIwbmz, strAuCTel, strFARcdN, strCopydefault, facialExtParamsOLrzqt, interfaceC42441rSz, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
