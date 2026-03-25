package com.okinc.business.invest_biz.ui.screens.defi_dashboard;

import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolParams;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23663iEs;
import o.C24204iYt;
import o.C24207iYw;
import o.C27369jtr;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.iDL;
import o.iDV;
import o.iZU;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardViewModel$loadProtocolDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    final /* synthetic */ C27369jtr $protocol;
    int label;
    final /* synthetic */ C24204iYt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$loadProtocolDetails$1(C27369jtr c27369jtr, C24204iYt c24204iYt, int i, Continuation<? super DashboardViewModel$loadProtocolDetails$1> continuation) {
        super(2, continuation);
        this.$protocol = c27369jtr;
        this.this$0 = c24204iYt;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DashboardViewModel$loadProtocolDetails$1(this.$protocol, this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DashboardViewModel$loadProtocolDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objKWHzl2;
        Object objM7386unboximpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$protocol.AkhnZx()) {
                MutableStateFlow mutableStateFlow = this.this$0.EZpvd;
                int i2 = this.$position;
                C27369jtr c27369jtr = this.$protocol;
                mutableStateFlow.setValue(new C24207iYw(i2, c27369jtr.KWHzl((15871 & 1) != 0 ? c27369jtr.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr.values : null, (15871 & 32) != 0 ? c27369jtr.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr.valueOf : null, (15871 & 128) != 0 ? c27369jtr.AhwBna : null, (15871 & 256) != 0 ? c27369jtr.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr.AEQbTJ : c27369jtr.AkhnZx(), (15871 & 1024) != 0 ? c27369jtr.EZpvd : null, (15871 & 2048) != 0 ? c27369jtr.copydefault : false, (15871 & 4096) != 0 ? c27369jtr.isConnected : null, (15871 & 8192) != 0 ? c27369jtr.fetchVPNInfo : null), false, 4, null));
                return Unit.INSTANCE;
            }
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            int i3 = this.$position;
            C27369jtr c27369jtr2 = this.$protocol;
            mutableStateFlow2.setValue(new C24207iYw(i3, c27369jtr2.KWHzl((15871 & 1) != 0 ? c27369jtr2.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr2.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr2.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr2.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr2.values : null, (15871 & 32) != 0 ? c27369jtr2.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr2.valueOf : null, (15871 & 128) != 0 ? c27369jtr2.AhwBna : null, (15871 & 256) != 0 ? c27369jtr2.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr2.AEQbTJ : false, (15871 & 1024) != 0 ? c27369jtr2.EZpvd : iZU.Application.EZpvd, (15871 & 2048) != 0 ? c27369jtr2.copydefault : false, (15871 & 4096) != 0 ? c27369jtr2.isConnected : null, (15871 & 8192) != 0 ? c27369jtr2.fetchVPNInfo : null), false, 4, null));
            iDL idl = this.this$0.AkhnZx;
            String strKWHzl = C23663iEs.KWHzl(this.$protocol.gEmmrt(), this.$protocol.copydefault());
            this.label = 1;
            objKWHzl = idl.KWHzl(strKWHzl, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    C24204iYt c24204iYt = this.this$0;
                    int i4 = this.$position;
                    C27369jtr c27369jtr3 = this.$protocol;
                    if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                        c24204iYt.EZpvd.setValue(new C24207iYw(i4, c27369jtr3.KWHzl((15871 & 1) != 0 ? c27369jtr3.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr3.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr3.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr3.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr3.values : null, (15871 & 32) != 0 ? c27369jtr3.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr3.valueOf : null, (15871 & 128) != 0 ? c27369jtr3.AhwBna : null, (15871 & 256) != 0 ? c27369jtr3.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr3.AEQbTJ : false, (15871 & 1024) != 0 ? c27369jtr3.EZpvd : new iZU.Activity((iDV) objM7386unboximpl), (15871 & 2048) != 0 ? c27369jtr3.copydefault : false, (15871 & 4096) != 0 ? c27369jtr3.isConnected : null, (15871 & 8192) != 0 ? c27369jtr3.fetchVPNInfo : null), false, 4, null));
                    }
                    C24204iYt c24204iYt2 = this.this$0;
                    int i5 = this.$position;
                    C27369jtr c27369jtr4 = this.$protocol;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.KWHzl(thM7380exceptionOrNullimpl);
                        c24204iYt2.EZpvd.setValue(new C24207iYw(i5, c27369jtr4.KWHzl((15871 & 1) != 0 ? c27369jtr4.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr4.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr4.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr4.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr4.values : null, (15871 & 32) != 0 ? c27369jtr4.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr4.valueOf : null, (15871 & 128) != 0 ? c27369jtr4.AhwBna : null, (15871 & 256) != 0 ? c27369jtr4.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr4.AEQbTJ : false, (15871 & 1024) != 0 ? c27369jtr4.EZpvd : iZU.TaskDescription.KWHzl, (15871 & 2048) != 0 ? c27369jtr4.copydefault : false, (15871 & 4096) != 0 ? c27369jtr4.isConnected : null, (15871 & 8192) != 0 ? c27369jtr4.fetchVPNInfo : null), false, 4, null));
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ProtocolDetailsParams protocolDetailsParams = new ProtocolDetailsParams(null, C56402yEa.EZpvd(new ProtocolParams(this.$protocol.gEmmrt(), this.$protocol.copydefault())));
                iDL idl2 = this.this$0.AkhnZx;
                this.label = 3;
                objKWHzl2 = idl2.KWHzl(protocolDetailsParams, this);
                if (objKWHzl2 != objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl2;
                C24204iYt c24204iYt3 = this.this$0;
                int i42 = this.$position;
                C27369jtr c27369jtr32 = this.$protocol;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                }
                C24204iYt c24204iYt22 = this.this$0;
                int i52 = this.$position;
                C27369jtr c27369jtr42 = this.$protocol;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        iDV idv = (iDV) objKWHzl;
        if (idv != null) {
            iZU.Activity activity = new iZU.Activity(idv);
            MutableStateFlow mutableStateFlow3 = this.this$0.EZpvd;
            int i6 = this.$position;
            C27369jtr c27369jtr5 = this.$protocol;
            mutableStateFlow3.setValue(new C24207iYw(i6, c27369jtr5.KWHzl((15871 & 1) != 0 ? c27369jtr5.djBIcL : 0L, (15871 & 2) != 0 ? c27369jtr5.KWHzl : 0L, (15871 & 4) != 0 ? c27369jtr5.AYXKKw : null, (15871 & 8) != 0 ? c27369jtr5.gEmmrt : null, (15871 & 16) != 0 ? c27369jtr5.values : null, (15871 & 32) != 0 ? c27369jtr5.OLrzqt : null, (15871 & 64) != 0 ? c27369jtr5.valueOf : null, (15871 & 128) != 0 ? c27369jtr5.AhwBna : null, (15871 & 256) != 0 ? c27369jtr5.AkhnZx : null, (15871 & 512) != 0 ? c27369jtr5.AEQbTJ : false, (15871 & 1024) != 0 ? c27369jtr5.EZpvd : activity, (15871 & 2048) != 0 ? c27369jtr5.copydefault : false, (15871 & 4096) != 0 ? c27369jtr5.isConnected : null, (15871 & 8192) != 0 ? c27369jtr5.fetchVPNInfo : null), true));
            return Unit.INSTANCE;
        }
        this.label = 2;
        if (DelayKt.delay(300L, this) == objCopydefault) {
            return objCopydefault;
        }
        ProtocolDetailsParams protocolDetailsParams2 = new ProtocolDetailsParams(null, C56402yEa.EZpvd(new ProtocolParams(this.$protocol.gEmmrt(), this.$protocol.copydefault())));
        iDL idl22 = this.this$0.AkhnZx;
        this.label = 3;
        objKWHzl2 = idl22.KWHzl(protocolDetailsParams2, this);
        if (objKWHzl2 != objCopydefault) {
        }
    }
}
