package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchChartData$1;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC12782ctV;
import o.AbstractC18281ffT;
import o.AbstractC43419rot;
import o.C10407bnq;
import o.C10614brl;
import o.C10854bwM;
import o.C13934dbu;
import o.C18275ffN;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9852bdR;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeKlineViewModel$fetchChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $mainWallet;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C18275ffN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeKlineViewModel$fetchChartData$1(C18275ffN c18275ffN, AbstractC12782ctV abstractC12782ctV, Continuation<? super WalletHomeKlineViewModel$fetchChartData$1> continuation) {
        super(2, continuation);
        this.this$0 = c18275ffN;
        this.$mainWallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeKlineViewModel$fetchChartData$1(this.this$0, this.$mainWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeKlineViewModel$fetchChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0199  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Continuation continuation;
        Object objCopydefault;
        long j;
        AbstractC43419rot abstractC43419rot;
        final C18275ffN c18275ffN;
        Object objWithContext;
        AbstractC43419rot abstractC43419rot2;
        final List list;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd = true;
            if (!this.$mainWallet.zLjUOn()) {
                this.this$0.KWHzl(new Function1() { // from class: o.ffM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletHomeKlineViewModel$fetchChartData$1.invokeSuspend$lambda$0((AbstractC18281ffT) obj2);
                    }
                });
                this.this$0.EZpvd = false;
                return Unit.INSTANCE;
            }
            long jValueOf = C33129mqd.valueOf(C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(this.$mainWallet.DbNXlk()).getGeneralChainId());
            AbstractC12782ctV abstractC12782ctV = this.$mainWallet;
            Intrinsics.copydefault(abstractC12782ctV, "");
            List<C10854bwM> listIZzfmt = abstractC12782ctV.iZzfmt();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listIZzfmt, 10));
            Iterator<T> it = listIZzfmt.iterator();
            while (it.hasNext()) {
                arrayList.add(C56443yFo.KWHzl(((C10854bwM) it.next()).AhwBna()));
            }
            InterfaceC9852bdR interfaceC9852bdR = this.this$0.djBIcL;
            OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelOLrzqt = interfaceC9852bdR != null ? interfaceC9852bdR.OLrzqt() : null;
            Double dAEQbTJ = (oKWalletHiddenSmallAssetTokenModelOLrzqt == null || !oKWalletHiddenSmallAssetTokenModelOLrzqt.getEnableHidden()) ? null : C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(oKWalletHiddenSmallAssetTokenModelOLrzqt.getHiddenValue()));
            C13934dbu c13934dbu = this.this$0.fetchVPNInfo;
            String strUSBtdM = this.$mainWallet.USBtdM();
            String strAUsmxb = this.$mainWallet.aUsmxb();
            String strDbNXlk = this.$mainWallet.DbNXlk();
            List<String> listEZpvd = C56402yEa.EZpvd(this.$mainWallet.DbNXlk());
            int iOLrzqt = this.this$0.valueOf.OLrzqt();
            String strAhwBna = this.this$0.isConnected.AhwBna();
            Long lKWHzl = C56443yFo.KWHzl(jValueOf);
            if (lKWHzl.longValue() <= -1) {
                lKWHzl = null;
            }
            boolean zCopydefault = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(this.$mainWallet) ? false : this.this$0.DbNXlk.copydefault();
            this.J$0 = jValueOf;
            this.label = 1;
            continuation = null;
            objCopydefault = c13934dbu.copydefault(strUSBtdM, strAUsmxb, strDbNXlk, listEZpvd, iOLrzqt, strAhwBna, lKWHzl, zCopydefault, dAEQbTJ, arrayList, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            j = jValueOf;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$2;
                AbstractC43419rot abstractC43419rot3 = (AbstractC43419rot) this.L$1;
                C18275ffN c18275ffN2 = (C18275ffN) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c18275ffN = c18275ffN2;
                abstractC43419rot2 = abstractC43419rot3;
                objWithContext = obj;
                final ChartData chartData = (ChartData) objWithContext;
                c18275ffN.KWHzl(new Function1() { // from class: o.ffR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletHomeKlineViewModel$fetchChartData$1.invokeSuspend$lambda$4$lambda$3(c18275ffN, list, chartData, (AbstractC18281ffT) obj2);
                    }
                });
                c18275ffN.EZpvd = false;
                abstractC43419rot = abstractC43419rot2;
                C18275ffN c18275ffN3 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    if (((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getCode() == C18275ffN.AEQbTJ) {
                        c18275ffN3.KWHzl(new Function1() { // from class: o.ffO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return WalletHomeKlineViewModel$fetchChartData$1.invokeSuspend$lambda$7$lambda$5((AbstractC18281ffT) obj2);
                            }
                        });
                    } else {
                        c18275ffN3.KWHzl(new Function1() { // from class: o.ffS
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return WalletHomeKlineViewModel$fetchChartData$1.invokeSuspend$lambda$7$lambda$6((AbstractC18281ffT) obj2);
                            }
                        });
                    }
                    c18275ffN3.EZpvd = false;
                }
                return Unit.INSTANCE;
            }
            long j2 = this.J$0;
            C56391yDq.AEQbTJ(obj);
            j = j2;
            continuation = null;
            objCopydefault = obj;
        }
        abstractC43419rot = (AbstractC43419rot) objCopydefault;
        c18275ffN = this.this$0;
        AbstractC12782ctV abstractC12782ctV2 = this.$mainWallet;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list2 = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (list2.isEmpty()) {
                c18275ffN.valueOf();
            } else {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1 walletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1 = new WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1(j, abstractC12782ctV2, continuation);
                this.L$0 = c18275ffN;
                this.L$1 = abstractC43419rot;
                this.L$2 = list2;
                this.label = 2;
                objWithContext = BuildersKt.withContext(io2, walletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1, this);
                if (objWithContext == objCopydefault2) {
                    return objCopydefault2;
                }
                abstractC43419rot2 = abstractC43419rot;
                list = list2;
                final ChartData chartData2 = (ChartData) objWithContext;
                c18275ffN.KWHzl(new Function1() { // from class: o.ffR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletHomeKlineViewModel$fetchChartData$1.invokeSuspend$lambda$4$lambda$3(c18275ffN, list, chartData2, (AbstractC18281ffT) obj2);
                    }
                });
                c18275ffN.EZpvd = false;
                abstractC43419rot = abstractC43419rot2;
            }
        }
        C18275ffN c18275ffN32 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$0(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.StateListAnimator.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$4$lambda$3(C18275ffN c18275ffN, List list, ChartData chartData, AbstractC18281ffT abstractC18281ffT) {
        return c18275ffN.EZpvd((List<ChartData>) list, chartData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$7$lambda$5(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.StateListAnimator.OLrzqt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$7$lambda$6(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.TaskDescription.KWHzl;
    }
}
