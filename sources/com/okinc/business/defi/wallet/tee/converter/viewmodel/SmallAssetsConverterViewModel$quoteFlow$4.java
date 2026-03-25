package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.tee.converter.viewmodel.SmallAssetsConverterViewModel$quoteFlow$4;
import com.okinc.business.dex.api.bean.sa_small_assets.DustToken;
import com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59467zhb;
import o.fTY;
import o.fTZ;
import o.fUX;
import o.gKO;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$quoteFlow$4 extends SuspendLambda implements yHO<FlowCollector<? super Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>>, Pair<? extends fTY, ? extends Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$quoteFlow$4(fUX fux, Continuation<? super SmallAssetsConverterViewModel$quoteFlow$4> continuation) {
        super(3, continuation);
        this.this$0 = fux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends Boolean, ? extends AbstractC43419rot<? extends SmallAssetQuoteData, ? extends OKServerException>>> flowCollector, Pair<? extends fTY, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>>) flowCollector, (Pair<fTY, Boolean>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Pair<Boolean, ? extends AbstractC43419rot<SmallAssetQuoteData, OKServerException>>> flowCollector, Pair<fTY, Boolean> pair, Continuation<? super Unit> continuation) {
        SmallAssetsConverterViewModel$quoteFlow$4 smallAssetsConverterViewModel$quoteFlow$4 = new SmallAssetsConverterViewModel$quoteFlow$4(this.this$0, continuation);
        smallAssetsConverterViewModel$quoteFlow$4.L$0 = flowCollector;
        smallAssetsConverterViewModel$quoteFlow$4.L$1 = pair;
        return smallAssetsConverterViewModel$quoteFlow$4.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Boolean boolKWHzl;
        AbstractC43419rot abstractC43419rot;
        Object objAEQbTJ;
        FlowCollector flowCollector2;
        Boolean bool;
        ChainAddress chainAddressEZpvd;
        Pair pairOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            Pair pair = (Pair) this.L$1;
            fTY fty = (fTY) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            boolKWHzl = C56443yFo.KWHzl(zBooleanValue);
            fUX fux = this.this$0;
            if (!zBooleanValue) {
                List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(fty.KWHzl()), new Function1() { // from class: o.fVd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(((fTZ.Application) obj2).copydefault());
                    }
                }), new Function1() { // from class: o.fVc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SmallAssetsConverterViewModel$quoteFlow$4.invokeSuspend$lambda$2$lambda$1((fTZ.Application) obj2);
                    }
                }));
                if (!listZuBGHE.isEmpty()) {
                    gKO gko = fux.getFieldNames;
                    long jGEmmrt = fux.gEmmrt();
                    String value = fux.AkhnZx().getValue();
                    AbstractC12782ctV value2 = fux.fARcdN().getValue();
                    String address = (value2 == null || (chainAddressEZpvd = value2.EZpvd(fux.gEmmrt(), (Integer) null)) == null) ? null : chainAddressEZpvd.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    DustTokenQuoteParam dustTokenQuoteParam = new DustTokenQuoteParam(String.valueOf(jGEmmrt), listZuBGHE, value, "CUSTOM", "11111111111111111111111111111111", address);
                    this.L$0 = flowCollector;
                    this.L$1 = boolKWHzl;
                    this.label = 1;
                    objAEQbTJ = gko.AEQbTJ(dustTokenQuoteParam, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    flowCollector2 = flowCollector;
                    bool = boolKWHzl;
                }
            }
            abstractC43419rot = null;
            pairOLrzqt = C56390yDp.OLrzqt(boolKWHzl, abstractC43419rot);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flowCollector.emit(pairOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        bool = (Boolean) this.L$1;
        FlowCollector flowCollector3 = (FlowCollector) this.L$0;
        C56391yDq.AEQbTJ(obj);
        flowCollector2 = flowCollector3;
        objAEQbTJ = obj;
        abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        boolKWHzl = bool;
        flowCollector = flowCollector2;
        pairOLrzqt = C56390yDp.OLrzqt(boolKWHzl, abstractC43419rot);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector.emit(pairOLrzqt, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DustToken invokeSuspend$lambda$2$lambda$1(fTZ.Application application) {
        return new DustToken(application.AEQbTJ(), application.OLrzqt().OLrzqt());
    }
}
