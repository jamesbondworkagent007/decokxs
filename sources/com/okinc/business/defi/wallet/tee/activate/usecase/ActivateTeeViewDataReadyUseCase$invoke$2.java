package com.okinc.business.defi.wallet.tee.activate.usecase;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC12782ctV;
import o.C13821dZn;
import o.C14455dll;
import o.C17783fSc;
import o.C17784fSd;
import o.C17791fSk;
import o.C17833fTz;
import o.C33129mqd;
import o.C54880xYt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC17789fSi;
import o.pTB;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateTeeViewDataReadyUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ViewDataReady>>, Object> {
    final /* synthetic */ boolean $needToRequestAsset;
    final /* synthetic */ AbstractC12782ctV $wallet;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C17833fTz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTeeViewDataReadyUseCase$invoke$2(C17833fTz c17833fTz, AbstractC12782ctV abstractC12782ctV, boolean z, Continuation<? super ActivateTeeViewDataReadyUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c17833fTz;
        this.$wallet = abstractC12782ctV;
        this.$needToRequestAsset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivateTeeViewDataReadyUseCase$invoke$2 activateTeeViewDataReadyUseCase$invoke$2 = new ActivateTeeViewDataReadyUseCase$invoke$2(this.this$0, this.$wallet, this.$needToRequestAsset, continuation);
        activateTeeViewDataReadyUseCase$invoke$2.L$0 = obj;
        return activateTeeViewDataReadyUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ViewDataReady>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ViewDataReady>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ViewDataReady>> continuation) {
        return ((ActivateTeeViewDataReadyUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0163  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferredAsync$default;
        Object objAwait;
        Object objAwait2;
        AbstractC12782ctV abstractC12782ctV;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        InterfaceC17789fSi c17791fSk = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            pUU.copydefault(this.this$0.KWHzl, "ActivateTeeViewDataReadyUseCase start");
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ActivateTeeViewDataReadyUseCase$invoke$2$walletAssetDeferred$1(this.$needToRequestAsset, this.$wallet, this.this$0, null), 3, null);
            deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new ActivateTeeViewDataReadyUseCase$invoke$2$teeMetaDataDeferred$1(this.this$0, null), 3, null);
            this.L$0 = deferredAsync$default;
            this.label = 1;
            objAwait = deferredAsync$default2.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAwait2 = obj;
                abstractC12782ctV = abstractC12782ctV2;
                Object objM7386unboximpl = ((Result) objAwait2).m7386unboximpl();
                C17833fTz c17833fTz = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl == null) {
                    pUU.copydefault(c17833fTz.KWHzl, "teeMetaDataDeferred await failed  = " + thM7380exceptionOrNullimpl.getMessage());
                    Result.Application application = Result.Companion;
                    return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
                }
                TeeMetadata teeMetadata = (TeeMetadata) objM7386unboximpl;
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.KWHzl(teeMetadata.getUpgradeAssetThreshold()));
                String strOLrzqt = abstractC12782ctV.OLrzqt("opened");
                String valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(strOLrzqt, null, false, C14455dll.KWHzl.OLrzqt(strOLrzqt), false, 11, null);
                String valuation$default = C54880xYt.formatValuation$default(pTB.OLrzqt((Object) strGEmmrt), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
                if (this.this$0.EZpvd.zLjUOn().getCurrencyId() != 0) {
                    valuation$default = "$" + C54880xYt.formatValuation$default(pTB.OLrzqt((Object) strGEmmrt), 0, 0, null, CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY, null, null, false, 55, null) + " (" + valuation$default + ")";
                }
                boolean zZLjUOn = this.$wallet.zLjUOn();
                if (!this.$wallet.AubY()) {
                    c17791fSk = new C17784fSd();
                } else if (!zZLjUOn) {
                    c17791fSk = new C17783fSc();
                } else if (C33129mqd.AEQbTJ(strOLrzqt, strGEmmrt)) {
                    c17791fSk = new C17791fSk(valuation$default);
                }
                pUU.copydefault(this.this$0.KWHzl, " ActivateTeeViewDataReadyUseCase operation success ");
                Result.Application application2 = Result.Companion;
                return Result.m7376boximpl(Result.m7377constructorimpl(new ViewDataReady(c17791fSk, !zZLjUOn, abstractC12782ctV, C13821dZn.EZpvd.OLrzqt(valuationFromAsset$default), teeMetadata)));
            }
            deferredAsync$default = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        Object objM7386unboximpl2 = ((Result) objAwait).m7386unboximpl();
        C17833fTz c17833fTz2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.copydefault(c17833fTz2.KWHzl, "walletAssetDeferred await failed  = " + thM7380exceptionOrNullimpl2.getMessage());
            Result.Application application3 = Result.Companion;
            return Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl2)));
        }
        AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) objM7386unboximpl2;
        this.L$0 = abstractC12782ctV3;
        this.label = 2;
        objAwait2 = deferredAsync$default.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        abstractC12782ctV = abstractC12782ctV3;
        Object objM7386unboximpl3 = ((Result) objAwait2).m7386unboximpl();
        C17833fTz c17833fTz3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl3);
        if (thM7380exceptionOrNullimpl == null) {
        }
    }
}
