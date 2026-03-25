package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$performTokenValidation$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28163kRf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;
import o.kQF;
import o.kQQ;
import o.kTE;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$performTokenValidation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $baseToken;
    final /* synthetic */ boolean $fromQuickMode;
    final /* synthetic */ DexMultiTokenInfoBean $quoteToken;
    Object L$0;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$performTokenValidation$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z, Continuation<? super AdvancedPlaceOrderVM$performTokenValidation$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$quoteToken = dexMultiTokenInfoBean;
        this.$baseToken = dexMultiTokenInfoBean2;
        this.$fromQuickMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$performTokenValidation$1(this.this$0, this.$quoteToken, this.$baseToken, this.$fromQuickMode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$performTokenValidation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        final kTE.Application application;
        kQF kqf;
        String str;
        DexMultiTokenInfoBean value;
        String strEZpvd;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kTE kte = this.this$0.DCJXGO;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$quoteToken;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$baseToken;
            AdvancedTradeType advancedTradeType = (AdvancedTradeType) this.this$0.fARcdN.getValue();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk = this.this$0.DbNXlk();
            InterfaceC30595leC interfaceC30595leC = (InterfaceC30595leC) this.this$0.fIwbmz.getValue();
            AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1 advancedPlaceOrderVM$performTokenValidation$1$outcome$1 = new AdvancedPlaceOrderVM$performTokenValidation$1$outcome$1(this.this$0, null);
            boolean z = this.$fromQuickMode;
            this.label = 1;
            objKWHzl = kte.KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, advancedTradeType, dexMultiTokenInfoBeanDbNXlk, interfaceC30595leC, advancedPlaceOrderVM$performTokenValidation$1$outcome$1, z, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objOLrzqt = ((Result) obj).m7386unboximpl();
                        Result.m7376boximpl(objOLrzqt);
                        return Unit.INSTANCE;
                    }
                    application = (kTE.Application) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.zsXlph.EZpvd(this.this$0.DCJXGO.copydefault().getValue());
                    this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
                    C28163kRf c28163kRf = this.this$0.dNCPSb;
                    String str2 = this.this$0.accept;
                    String strAEQbTJ = ((kTE.Application.StateListAnimator) application).AEQbTJ();
                    this.L$0 = null;
                    this.label = 4;
                    objOLrzqt = c28163kRf.OLrzqt(str2, strAEQbTJ, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    Result.m7376boximpl(objOLrzqt);
                    return Unit.INSTANCE;
                }
                application = (kTE.Application) this.L$0;
                C56391yDq.AEQbTJ(obj);
                kqf = this.this$0.hDKMBd;
                str = (String) this.this$0.ejfBZ.getValue();
                value = this.this$0.ejfBZ().getValue();
                strEZpvd = this.this$0.DTwDnp.EZpvd();
                if (strEZpvd.length() == 0) {
                    strEZpvd = "11";
                }
                this.L$0 = application;
                this.label = 3;
                if (kqf.copydefault(str, value, strEZpvd, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.zsXlph.EZpvd(this.this$0.DCJXGO.copydefault().getValue());
                this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
                C28163kRf c28163kRf2 = this.this$0.dNCPSb;
                String str22 = this.this$0.accept;
                String strAEQbTJ2 = ((kTE.Application.StateListAnimator) application).AEQbTJ();
                this.L$0 = null;
                this.label = 4;
                objOLrzqt = c28163kRf2.OLrzqt(str22, strAEQbTJ2, this);
                if (objOLrzqt == objCopydefault) {
                }
                Result.m7376boximpl(objOLrzqt);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        }
        application = (kTE.Application) objKWHzl;
        if (application instanceof kTE.Application.StateListAnimator) {
            kTE.Application.StateListAnimator stateListAnimator = (kTE.Application.StateListAnimator) application;
            this.this$0.EZpvd(stateListAnimator.EZpvd());
            if (stateListAnimator.copydefault()) {
                this.this$0.DTwDnp.copydefault();
                kQQ kqq = this.this$0.zsXlph;
                DexMultiTokenInfoBean value2 = this.this$0.ejfBZ().getValue();
                Intrinsics.copydefault(value2);
                this.L$0 = application;
                this.label = 2;
                if (kqq.KWHzl(value2, this) == objCopydefault) {
                    return objCopydefault;
                }
                kqf = this.this$0.hDKMBd;
                str = (String) this.this$0.ejfBZ.getValue();
                value = this.this$0.ejfBZ().getValue();
                strEZpvd = this.this$0.DTwDnp.EZpvd();
                if (strEZpvd.length() == 0) {
                }
                this.L$0 = application;
                this.label = 3;
                if (kqf.copydefault(str, value, strEZpvd, this) == objCopydefault) {
                }
            }
            this.this$0.zsXlph.EZpvd(this.this$0.DCJXGO.copydefault().getValue());
            this.this$0.dNCPSb.OLrzqt(this.this$0.accept);
            C28163kRf c28163kRf22 = this.this$0.dNCPSb;
            String str222 = this.this$0.accept;
            String strAEQbTJ22 = ((kTE.Application.StateListAnimator) application).AEQbTJ();
            this.L$0 = null;
            this.label = 4;
            objOLrzqt = c28163kRf22.OLrzqt(str222, strAEQbTJ22, this);
            if (objOLrzqt == objCopydefault) {
            }
            Result.m7376boximpl(objOLrzqt);
            return Unit.INSTANCE;
        }
        if (!(application instanceof kTE.Application.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        final AdvancedPlaceOrderVM advancedPlaceOrderVM = this.this$0;
        advancedPlaceOrderVM.EZpvd(new InterfaceC30595leC.Intent(new Function0() { // from class: o.kTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderVM$performTokenValidation$1.invokeSuspend$lambda$1(advancedPlaceOrderVM, application);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, kTE.Application application) {
        kTE.Application.ActionBar actionBar = (kTE.Application.ActionBar) application;
        advancedPlaceOrderVM.KWHzl(actionBar.EZpvd(), actionBar.copydefault(), actionBar.OLrzqt());
        return Unit.INSTANCE;
    }
}
