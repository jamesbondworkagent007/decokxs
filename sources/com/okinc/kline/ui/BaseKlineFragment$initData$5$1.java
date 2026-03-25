package com.okinc.kline.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC54531xLw;
import o.C36250oUv;
import o.C37925pFu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.oLT;
import o.oYA;
import o.pFP;

/* JADX INFO: loaded from: classes8.dex */
public final class BaseKlineFragment$initData$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC54531xLw $biz;
    final /* synthetic */ int $it;
    long J$0;
    int label;
    final /* synthetic */ oYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseKlineFragment$initData$5$1(oYA oya, int i, AbstractC54531xLw abstractC54531xLw, Continuation<? super BaseKlineFragment$initData$5$1> continuation) {
        super(2, continuation);
        this.this$0 = oya;
        this.$it = i;
        this.$biz = abstractC54531xLw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseKlineFragment$initData$5$1(this.this$0, this.$it, this.$biz, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseKlineFragment$initData$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        String mode;
        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        KlineSpotAverageBean klineSpotAverageBean;
        C36250oUv c36250oUvFIwbmz;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        C36250oUv c36250oUvFIwbmz2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jAEQbTJ = this.this$0.AwvSrB().getValue().AEQbTJ();
            KlineTimeAnchorViewModel value = this.this$0.AwvSrB().getValue();
            C36250oUv c36250oUvQVAiDq = this.this$0.QVAiDq();
            String str = (c36250oUvQVAiDq == null || (chartViewOutSideConfigAkhnZx = c36250oUvQVAiDq.AkhnZx()) == null || (mode = chartViewOutSideConfigAkhnZx.getMode()) == null) ? "" : mode;
            TemplateSetting templateSettingGiSNqX = this.this$0.giSNqX();
            int sPTimeInterval = templateSettingGiSNqX != null ? templateSettingGiSNqX.getSPTimeInterval() : 1440;
            String strORxRYg = this.this$0.ORxRYg();
            if (value.AEQbTJ(str, jAEQbTJ, sPTimeInterval, strORxRYg == null ? "" : strORxRYg)) {
                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb2 = this.this$0.dNCPSb();
                if (stateListAnimatorDNCPSb2 != null) {
                    stateListAnimatorDNCPSb2.AEQbTJ();
                }
                oYA oya = this.this$0;
                this.J$0 = jAEQbTJ;
                this.label = 1;
                obj = oya.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                j = jAEQbTJ;
            } else {
                oYA.initKlineData$default(this.this$0, this.$it, false, 2, null);
                this.this$0.AwvSrB().getValue().OLrzqt();
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && this.$it != -2) {
                    if (!this.this$0.OqFWZa()) {
                        if (Intrinsics.EZpvd(this.this$0.fZBcTu().KWHzl().getValue(), C56443yFo.KWHzl(false)) && (c36250oUvFIwbmz2 = this.this$0.fIwbmz()) != null) {
                            c36250oUvFIwbmz2.AYXKKw();
                        }
                    } else {
                        this.this$0.values(true);
                    }
                    if (Intrinsics.EZpvd((Object) this.this$0.aKErDB(), (Object) "TYPE_KLINE")) {
                        if (this.this$0.QVAiDq() != null) {
                            oYA oya2 = this.this$0;
                            AbstractC54531xLw abstractC54531xLw = this.$biz;
                            if (Intrinsics.EZpvd((Object) oya2.ORxRYg(), (Object) oLT.AuCTel()) || Intrinsics.EZpvd((Object) oya2.ORxRYg(), (Object) oLT.KWHzl())) {
                                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(oya2), null, null, new BaseKlineFragment$initData$5$1$1$1(oya2, abstractC54531xLw, null), 3, null);
                            } else {
                                oya2.KWHzl(false);
                            }
                        }
                        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb3 = this.this$0.dNCPSb();
                        if (stateListAnimatorDNCPSb3 != null) {
                            InterfaceC39563puh.StateListAnimator.TaskDescription.loadTradePosition$default(stateListAnimatorDNCPSb3, this.this$0, false, 2, null);
                        }
                        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb4 = this.this$0.dNCPSb();
                        if (stateListAnimatorDNCPSb4 != null) {
                            InterfaceC39563puh.StateListAnimator.TaskDescription.loadOpenOrder$default(stateListAnimatorDNCPSb4, this.this$0, false, 2, null);
                        }
                        if (Intrinsics.EZpvd((Object) this.this$0.ORxRYg(), (Object) oLT.fetchVPNInfo()) && (c36250oUvFIwbmz = this.this$0.fIwbmz()) != null && (chartViewOutSideConfigAkhnZx3 = c36250oUvFIwbmz.AkhnZx()) != null && chartViewOutSideConfigAkhnZx3.isShowSpotAveragePrice()) {
                            String strOcIXYQ = this.this$0.OcIXYQ();
                            if (strOcIXYQ != null) {
                                oYA oya3 = this.this$0;
                                int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(oya3.ORxRYg(), oya3.DTwDnp());
                                InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb5 = oya3.dNCPSb();
                                if (stateListAnimatorDNCPSb5 != null) {
                                    String strORxRYg2 = oya3.ORxRYg();
                                    Intrinsics.copydefault((Object) strORxRYg2);
                                    InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorDNCPSb5, oya3, strORxRYg2, strOcIXYQ, iAEQbTJ, false, 16, null);
                                }
                            }
                        } else {
                            C36250oUv c36250oUvFIwbmz3 = this.this$0.fIwbmz();
                            if (c36250oUvFIwbmz3 != null && (chartViewOutSideConfigAkhnZx2 = c36250oUvFIwbmz3.AkhnZx()) != null && (klineSpotAverageBean = chartViewOutSideConfigAkhnZx2.getKlineSpotAverageBean()) != null) {
                                klineSpotAverageBean.setShowSpotAverageLine(false);
                            }
                        }
                    }
                    if (!this.this$0.QKVWgx() && (stateListAnimatorDNCPSb = this.this$0.dNCPSb()) != null) {
                        stateListAnimatorDNCPSb.copydefault(this.this$0);
                    }
                    if (this.this$0.ODWQjV()) {
                        String string = SPUtils.getString("kline_indicator_version", "0");
                        InterfaceC39563puh.StateListAnimator stateListAnimatorDNCPSb6 = this.this$0.dNCPSb();
                        if (stateListAnimatorDNCPSb6 != null) {
                            oYA oya4 = this.this$0;
                            Intrinsics.copydefault((Object) string);
                            stateListAnimatorDNCPSb6.copydefault(oya4, "ALL", string);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            C56391yDq.AEQbTJ(obj);
            j = j2;
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue <= j) {
            this.this$0.AEQbTJ(j, jLongValue, KlineTimeAnchorType.AnchorLeft, KlineTimeToolType.KLineTimeAnchor, false);
            this.this$0.getNewProxyInstance();
        } else {
            oYA.initKlineData$default(this.this$0, this.$it, false, 2, null);
        }
        this.this$0.AwvSrB().getValue().OLrzqt();
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            if (!this.this$0.OqFWZa()) {
            }
            if (Intrinsics.EZpvd((Object) this.this$0.aKErDB(), (Object) "TYPE_KLINE")) {
            }
            if (!this.this$0.QKVWgx()) {
                stateListAnimatorDNCPSb.copydefault(this.this$0);
            }
            if (this.this$0.ODWQjV()) {
            }
        }
        return Unit.INSTANCE;
    }
}
