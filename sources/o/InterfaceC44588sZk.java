package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okmarket.app.callauction.ws.data.datasource.api.MarketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1;
import com.okinc.okmarket.app.callauction.ws.data.datasource.api.MarketCallAuctionWsApi$createCallAuctionWsFlow$1;
import com.okinc.okmarket.app.callauction.ws.data.datasource.api.MarketCallAuctionWsApi$createCallAuctionWsFlow$2;
import com.okinc.okmarket.app.callauction.ws.data.datasource.api.MarketCallAuctionWsApi$createCallAuctionWsFlow$3;
import com.okinc.okmarket.app.callauction.ws.data.model.CallAuctionData;
import com.okinc.unify_find.data.EntityWsArg;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44588sZk {
    public static final /* synthetic */ StateListAnimator Companion = StateListAnimator.KWHzl;

    /* JADX INFO: renamed from: o.sZk$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.sZk$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static Flow<java.util.List<CallAuctionData>> copydefault(@NotNull InterfaceC44588sZk interfaceC44588sZk) {
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(OKComplianceRestrictionService.class));
            java.lang.String strAuCTelauCTel = oKComplianceRestrictionService != null ? oKComplianceRestrictionService.AuCTelauCTel() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (strAuCTelauCTel == null || strAuCTelauCTel.length() == 0) {
                arrayList.add(new WsArgV5("call-auction-inst-list", null, null, null, null, null, null, null, 254, null));
            } else {
                arrayList.add(new EntityWsArg("call-auction-inst-list", null, null, null, null, null, null, null, strAuCTelauCTel, 254, null));
            }
            pUU.KWHzl("MarketCallAuctionWsApi", "createCallAuctionFlow, entityId: " + strAuCTelauCTel);
            return EZpvd(interfaceC44588sZk, "call-auction-inst-list", arrayList);
        }

        /* JADX INFO: renamed from: o.sZk$Activity$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription implements Flow<java.util.List<? extends CallAuctionData>> {
            public final /* synthetic */ Flow OLrzqt;

            /* JADX INFO: renamed from: o.sZk$Activity$TaskDescription$5, reason: invalid class name */
            public static final class AnonymousClass5<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector EZpvd;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass5(FlowCollector flowCollector) {
                    this.EZpvd = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                    MarketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1 marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1;
                    if (continuation instanceof MarketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1) {
                        marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1 = (MarketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1) continuation;
                        int i = marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1 = new MarketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1(this, continuation);
                        }
                    }
                    java.lang.Object obj2 = marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1.result;
                    java.lang.Object objCopydefault = C56442yFn.copydefault();
                    int i2 = marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.EZpvd;
                        java.util.List<CallAuctionData> listEZpvd = CallAuctionData.Companion.EZpvd(((OKIncomingData) obj).getPayload().toString());
                        marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1.label = 1;
                        if (flowCollector.emit(listEZpvd, marketCallAuctionWsApi$DefaultImpls$createCallAuctionWsFlow$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public TaskDescription(Flow flow) {
                this.OLrzqt = flow;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(FlowCollector<? super java.util.List<? extends CallAuctionData>> flowCollector, Continuation continuation) {
                java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }

        public static Flow<java.util.List<CallAuctionData>> EZpvd(InterfaceC44588sZk interfaceC44588sZk, java.lang.String str, java.util.ArrayList<WsArgV5> arrayList) {
            return FlowKt.filterNotNull(new TaskDescription(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new MarketCallAuctionWsApi$createCallAuctionWsFlow$1(str, arrayList, null)), new MarketCallAuctionWsApi$createCallAuctionWsFlow$2(str, null)), new MarketCallAuctionWsApi$createCallAuctionWsFlow$3(str, null))));
        }
    }
}
