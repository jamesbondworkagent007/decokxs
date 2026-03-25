package com.okinc.business.defi.assets.utxo.utxomanagement;

import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC10317bmF;
import o.InterfaceC10354bmq;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel$updateUtxoStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $action;
    final /* synthetic */ UtxoWalletInfo $info;
    final /* synthetic */ int $itemCount;
    final /* synthetic */ List<UtxoItemIdentity> $selectedItems;
    final /* synthetic */ long $tokenAmount;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InvestUtxoManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementViewModel$updateUtxoStatus$1(InvestUtxoManagementViewModel investUtxoManagementViewModel, UtxoWalletInfo utxoWalletInfo, List<UtxoItemIdentity> list, int i, int i2, long j, Continuation<? super InvestUtxoManagementViewModel$updateUtxoStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoManagementViewModel;
        this.$info = utxoWalletInfo;
        this.$selectedItems = list;
        this.$action = i;
        this.$itemCount = i2;
        this.$tokenAmount = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementViewModel$updateUtxoStatus$1(this.this$0, this.$info, this.$selectedItems, this.$action, this.$itemCount, this.$tokenAmount, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementViewModel$updateUtxoStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object objEZpvd;
        AbstractC43419rot abstractC43419rot;
        InvestUtxoManagementViewModel investUtxoManagementViewModel;
        UtxoWalletInfo utxoWalletInfo;
        int i;
        long j;
        int i2;
        UtxoStatusUpdateResponseItem utxoStatusUpdateResponseItem;
        AbstractC43419rot abstractC43419rot2;
        InterfaceC10354bmq taskDescription;
        MutableSharedFlow mutableSharedFlow;
        InvestUtxoManagementViewModel investUtxoManagementViewModel2;
        MutableSharedFlow mutableSharedFlow2;
        InterfaceC10354bmq.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(this.this$0.fetchVPNInfo.copydefault());
            C13934dbu c13934dbu = this.this$0.AkhnZx;
            String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            String strUSBtdM = abstractC12782ctV != null ? abstractC12782ctV.USBtdM() : null;
            if (strUSBtdM == null) {
                strUSBtdM = "";
            }
            String strAUsmxb = abstractC12782ctV != null ? abstractC12782ctV.aUsmxb() : null;
            String str = strAUsmxb != null ? strAUsmxb : "";
            String strOLrzqt = this.$info.OLrzqt();
            List<UtxoItemIdentity> list = this.$selectedItems;
            int i4 = this.$action;
            long jKWHzl = this.$info.KWHzl();
            this.label = 1;
            obj2 = null;
            objEZpvd = c13934dbu.EZpvd(strDbNXlk, strUSBtdM, str, strOLrzqt, list, i4, jKWHzl, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = this.I$1;
                    j = this.J$0;
                    i = this.I$0;
                    utxoStatusUpdateResponseItem = (UtxoStatusUpdateResponseItem) this.L$3;
                    abstractC43419rot = (AbstractC43419rot) this.L$2;
                    utxoWalletInfo = (UtxoWalletInfo) this.L$1;
                    investUtxoManagementViewModel = (InvestUtxoManagementViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = null;
                    investUtxoManagementViewModel.AEQbTJ(utxoWalletInfo);
                    taskDescription = utxoStatusUpdateResponseItem.OLrzqt() ? InterfaceC10354bmq.Application.copydefault : new InterfaceC10354bmq.TaskDescription(i, j, InvestUtxoManagementViewModel.AEQbTJ.contains(C56443yFo.AEQbTJ(i2)));
                    mutableSharedFlow = investUtxoManagementViewModel.OLrzqt;
                    this.L$0 = abstractC43419rot;
                    this.L$1 = obj2;
                    this.L$2 = obj2;
                    this.L$3 = obj2;
                    this.label = 3;
                    if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot2 = abstractC43419rot;
                    investUtxoManagementViewModel2 = this.this$0;
                    if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC43419rot2 = (AbstractC43419rot) this.L$1;
                    investUtxoManagementViewModel2 = (InvestUtxoManagementViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = null;
                    mutableSharedFlow2 = investUtxoManagementViewModel2.OLrzqt;
                    application = InterfaceC10354bmq.Application.copydefault;
                    this.L$0 = abstractC43419rot2;
                    this.L$1 = obj2;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(application, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = null;
                investUtxoManagementViewModel2 = this.this$0;
                if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
                    OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl();
                    pUU.KWHzl(oKServerException);
                    MutableStateFlow mutableStateFlow = investUtxoManagementViewModel2.KWHzl;
                    InterfaceC10317bmF.TaskDescription taskDescription2 = new InterfaceC10317bmF.TaskDescription(oKServerException);
                    this.L$0 = investUtxoManagementViewModel2;
                    this.L$1 = abstractC43419rot2;
                    this.label = 4;
                    if (mutableStateFlow.emit(taskDescription2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow2 = investUtxoManagementViewModel2.OLrzqt;
                    application = InterfaceC10354bmq.Application.copydefault;
                    this.L$0 = abstractC43419rot2;
                    this.L$1 = obj2;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(application, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            obj2 = null;
        }
        abstractC43419rot = (AbstractC43419rot) objEZpvd;
        investUtxoManagementViewModel = this.this$0;
        utxoWalletInfo = this.$info;
        i = this.$itemCount;
        j = this.$tokenAmount;
        i2 = this.$action;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            utxoStatusUpdateResponseItem = (UtxoStatusUpdateResponseItem) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            this.L$0 = investUtxoManagementViewModel;
            this.L$1 = utxoWalletInfo;
            this.L$2 = abstractC43419rot;
            this.L$3 = utxoStatusUpdateResponseItem;
            this.I$0 = i;
            this.J$0 = j;
            this.I$1 = i2;
            this.label = 2;
            if (DelayKt.delay(600L, this) == objCopydefault) {
                return objCopydefault;
            }
            investUtxoManagementViewModel.AEQbTJ(utxoWalletInfo);
            if (utxoStatusUpdateResponseItem.OLrzqt()) {
            }
            mutableSharedFlow = investUtxoManagementViewModel.OLrzqt;
            this.L$0 = abstractC43419rot;
            this.L$1 = obj2;
            this.L$2 = obj2;
            this.L$3 = obj2;
            this.label = 3;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
            }
        }
        abstractC43419rot2 = abstractC43419rot;
        investUtxoManagementViewModel2 = this.this$0;
        if (abstractC43419rot2 instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
