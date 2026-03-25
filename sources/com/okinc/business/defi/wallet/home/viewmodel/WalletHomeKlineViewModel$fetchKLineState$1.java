package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchKLineState$1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC18281ffT;
import o.AbstractC58260yxt;
import o.C10614brl;
import o.C18275ffN;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18271ffJ;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeKlineViewModel$fetchKLineState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC18271ffJ $action;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C18275ffN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeKlineViewModel$fetchKLineState$1(AbstractC12782ctV abstractC12782ctV, C18275ffN c18275ffN, InterfaceC18271ffJ interfaceC18271ffJ, Continuation<? super WalletHomeKlineViewModel$fetchKLineState$1> continuation) {
        super(2, continuation);
        this.$wallet = abstractC12782ctV;
        this.this$0 = c18275ffN;
        this.$action = interfaceC18271ffJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeKlineViewModel$fetchKLineState$1(this.$wallet, this.this$0, this.$action, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeKlineViewModel$fetchKLineState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC12782ctV abstractC12782ctV;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctV = this.$wallet;
            if (abstractC12782ctV == null) {
                C18275ffN c18275ffN = this.this$0;
                Result.Application application2 = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c18275ffN.AkhnZx.copydefault(false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (!C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(C33129mqd.valueOf(this.this$0.values.KWHzl(abstractC12782ctV.DbNXlk()).getChainId()))) {
                this.this$0.KWHzl(new Function1() { // from class: o.ffQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletHomeKlineViewModel$fetchKLineState$1.invokeSuspend$lambda$2((AbstractC18281ffT) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            if (((this.$action instanceof InterfaceC18271ffJ.TaskDescription) && (this.this$0.OLrzqt.getValue() instanceof AbstractC18281ffT.ActionBar)) || ((this.$action instanceof InterfaceC18271ffJ.ActionBar) && ((this.this$0.OLrzqt.getValue() instanceof AbstractC18281ffT.TaskDescription) || this.this$0.EZpvd))) {
                pUU.KWHzl("WalletHomeKlineViewModel", this.$action instanceof InterfaceC18271ffJ.ActionBar ? "OnTotalAssetChanged skipped due to fetching or error" : "Initialise skipped due to loading");
                return Unit.INSTANCE;
            }
            if (!(this.$action instanceof InterfaceC18271ffJ.ActionBar)) {
                this.this$0.KWHzl(new Function1() { // from class: o.ffW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletHomeKlineViewModel$fetchKLineState$1.invokeSuspend$lambda$3((AbstractC18281ffT) obj2);
                    }
                });
            }
            boolean zIsEmpty = this.this$0.OLrzqt().isEmpty();
            InterfaceC18271ffJ interfaceC18271ffJ = this.$action;
            if (!Intrinsics.EZpvd(interfaceC18271ffJ, InterfaceC18271ffJ.TaskDescription.EZpvd)) {
                if (!Intrinsics.EZpvd(interfaceC18271ffJ, InterfaceC18271ffJ.Application.EZpvd)) {
                    if (interfaceC18271ffJ instanceof InterfaceC18271ffJ.Activity) {
                        this.this$0.OLrzqt(((InterfaceC18271ffJ.Activity) this.$action).OLrzqt());
                    } else {
                        if (!(interfaceC18271ffJ instanceof InterfaceC18271ffJ.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC18281ffT value = this.this$0.copydefault().getValue();
                        final AbstractC18281ffT.Activity activity = value instanceof AbstractC18281ffT.Activity ? (AbstractC18281ffT.Activity) value : null;
                        if (activity == null) {
                            activity = new AbstractC18281ffT.Activity(null, null, null, null, null, null, 63, null);
                        }
                        final C18275ffN c18275ffN2 = this.this$0;
                        final InterfaceC18271ffJ interfaceC18271ffJ2 = this.$action;
                        c18275ffN2.KWHzl(new Function1() { // from class: o.ffU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return WalletHomeKlineViewModel$fetchKLineState$1.invokeSuspend$lambda$4(c18275ffN2, activity, interfaceC18271ffJ2, (AbstractC18281ffT) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                }
                if (zIsEmpty) {
                    this.this$0.OLrzqt(abstractC12782ctV);
                } else {
                    this.this$0.EZpvd(abstractC12782ctV);
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        C18275ffN c18275ffN3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletHomeKlineViewModel", "fetchKlineState error", thM7380exceptionOrNullimpl);
            c18275ffN3.valueOf();
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        if (!C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).AEQbTJ(C33129mqd.valueOf(this.this$0.values.KWHzl(abstractC12782ctV.DbNXlk()).getChainId()))) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$2(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.StateListAnimator.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$3(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.ActionBar.KWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$4(C18275ffN c18275ffN, AbstractC18281ffT.Activity activity, InterfaceC18271ffJ interfaceC18271ffJ, AbstractC18281ffT abstractC18281ffT) {
        return c18275ffN.EZpvd((List<ChartData>) activity.OLrzqt(), new ChartData(((InterfaceC18271ffJ.ActionBar) interfaceC18271ffJ).AEQbTJ(), System.currentTimeMillis()));
    }
}
