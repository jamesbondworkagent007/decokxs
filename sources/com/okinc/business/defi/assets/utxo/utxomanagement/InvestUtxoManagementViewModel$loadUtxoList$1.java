package com.okinc.business.defi.assets.utxo.utxomanagement;

import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C13754dXa;
import o.C13934dbu;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC10317bmF;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel$loadUtxoList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UtxoWalletInfo $info;
    Object L$0;
    int label;
    final /* synthetic */ InvestUtxoManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoManagementViewModel$loadUtxoList$1(InvestUtxoManagementViewModel investUtxoManagementViewModel, UtxoWalletInfo utxoWalletInfo, Continuation<? super InvestUtxoManagementViewModel$loadUtxoList$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoManagementViewModel;
        this.$info = utxoWalletInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoManagementViewModel$loadUtxoList$1(this.this$0, this.$info, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoManagementViewModel$loadUtxoList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            InterfaceC10317bmF.ActionBar actionBar = InterfaceC10317bmF.ActionBar.KWHzl;
            this.label = 1;
            if (mutableStateFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC43419rot = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    InvestUtxoManagementViewModel investUtxoManagementViewModel = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                        pUU.KWHzl(oKServerException);
                        MutableStateFlow mutableStateFlow2 = investUtxoManagementViewModel.KWHzl;
                        InterfaceC10317bmF.TaskDescription taskDescription = new InterfaceC10317bmF.TaskDescription(oKServerException);
                        this.L$0 = abstractC43419rot;
                        this.label = 5;
                        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                InvestUtxoManagementViewModel investUtxoManagementViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    UtxoResponseItem utxoResponseItem = (UtxoResponseItem) CollectionsKt___CollectionsKt.firstOrNull((List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
                    UtxoByType utxoByTypeOLrzqt = utxoResponseItem != null ? utxoResponseItem.OLrzqt() : null;
                    if (utxoByTypeOLrzqt != null) {
                        MutableStateFlow mutableStateFlow3 = investUtxoManagementViewModel2.KWHzl;
                        InterfaceC10317bmF.Application application = new InterfaceC10317bmF.Application(utxoByTypeOLrzqt.AEQbTJ(), utxoByTypeOLrzqt.EZpvd());
                        this.L$0 = abstractC43419rot;
                        this.label = 3;
                        if (mutableStateFlow3.emit(application, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableStateFlow mutableStateFlow4 = investUtxoManagementViewModel2.KWHzl;
                        InterfaceC10317bmF.TaskDescription taskDescription2 = new InterfaceC10317bmF.TaskDescription(new Exception(C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfm)));
                        this.L$0 = abstractC43419rot;
                        this.label = 4;
                        if (mutableStateFlow4.emit(taskDescription2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                InvestUtxoManagementViewModel investUtxoManagementViewModel3 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C13934dbu c13934dbu = this.this$0.AkhnZx;
        long jAEQbTJ = this.$info.AEQbTJ();
        String strOLrzqt = this.$info.OLrzqt();
        this.label = 2;
        obj = c13934dbu.AEQbTJ(jAEQbTJ, 12, strOLrzqt, (Integer) null, (Integer) null, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        InvestUtxoManagementViewModel investUtxoManagementViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        InvestUtxoManagementViewModel investUtxoManagementViewModel32 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
