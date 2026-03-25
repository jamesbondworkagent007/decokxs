package com.okinc.business.invest_biz.mln.service;

import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C23673iFb;
import o.C23686iFo;
import o.C23927iOm;
import o.C23936iOv;
import o.C56391yDq;
import o.C56442yFn;
import o.iOG;

/* JADX INFO: loaded from: classes23.dex */
public final class DeFiLuaDataService$showPositionAssetsDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $investmentId;
    final /* synthetic */ InvestmentKind $kind;
    final /* synthetic */ String $tokenId;
    Object L$0;
    int label;
    final /* synthetic */ C23936iOv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiLuaDataService$showPositionAssetsDetails$1(C23936iOv c23936iOv, long j, InvestmentKind investmentKind, String str, Continuation<? super DeFiLuaDataService$showPositionAssetsDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = c23936iOv;
        this.$investmentId = j;
        this.$kind = investmentKind;
        this.$tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeFiLuaDataService$showPositionAssetsDetails$1(this.this$0, this.$investmentId, this.$kind, this.$tokenId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeFiLuaDataService$showPositionAssetsDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        C23673iFb c23673iFb;
        Object objAEQbTJ;
        InvestUserAssetDetailByPosition investUserAssetDetailByPosition;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iOG iog = this.this$0.EZpvd;
            long j = this.$investmentId;
            InvestmentKind investmentKind = this.$kind;
            this.label = 1;
            objKWHzl = iog.KWHzl(j, investmentKind, this);
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
                    return Unit.INSTANCE;
                }
                C23673iFb c23673iFb2 = (C23673iFb) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c23673iFb = c23673iFb2;
                objAEQbTJ = obj;
                investUserAssetDetailByPosition = (InvestUserAssetDetailByPosition) objAEQbTJ;
                if (investUserAssetDetailByPosition != null) {
                    return Unit.INSTANCE;
                }
                ChainInfo chainInfo = new ChainInfo(c23673iFb.AEQbTJ().OLrzqt(), c23673iFb.AEQbTJ().copydefault(), null, null, null, 28, null);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, investUserAssetDetailByPosition, this.$investmentId, chainInfo, null);
                this.L$0 = null;
                this.label = 3;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        c23673iFb = (C23673iFb) objKWHzl;
        if (c23673iFb == null) {
            return Unit.INSTANCE;
        }
        iOG iog2 = this.this$0.EZpvd;
        String str = this.$tokenId;
        long j2 = this.$investmentId;
        C23686iFo c23686iFoAEQbTJ = c23673iFb.AEQbTJ();
        long jOLrzqt = c23686iFoAEQbTJ != null ? c23686iFoAEQbTJ.OLrzqt() : 0L;
        this.L$0 = c23673iFb;
        this.label = 2;
        objAEQbTJ = iog2.AEQbTJ(str, j2, jOLrzqt, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        investUserAssetDetailByPosition = (InvestUserAssetDetailByPosition) objAEQbTJ;
        if (investUserAssetDetailByPosition != null) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.mln.service.DeFiLuaDataService$showPositionAssetsDetails$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChainInfo $chainInfo;
        final /* synthetic */ long $investmentId;
        final /* synthetic */ InvestUserAssetDetailByPosition $positionData;
        int label;
        final /* synthetic */ C23936iOv this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C23936iOv c23936iOv, InvestUserAssetDetailByPosition investUserAssetDetailByPosition, long j, ChainInfo chainInfo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c23936iOv;
            this.$positionData = investUserAssetDetailByPosition;
            this.$investmentId = j;
            this.$chainInfo = chainInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$positionData, this.$investmentId, this.$chainInfo, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C23927iOm c23927iOm = this.this$0.AEQbTJ;
                if (c23927iOm != null) {
                    c23927iOm.KWHzl(new ProductDetailsClickAction.Application(this.$positionData, this.$investmentId, this.$chainInfo));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
