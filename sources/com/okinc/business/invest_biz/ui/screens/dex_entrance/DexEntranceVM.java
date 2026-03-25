package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import com.okinc.business.invest_biz.data.bean.SubTabsData;
import com.okinc.business.invest_biz.ui.screens.dex_entrance.DexEntranceVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C27493jwI;
import o.C43248rlh;
import o.C55276xgr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC26619jfj;
import o.InterfaceC58229yxO;
import o.InterfaceC9738bbJ;
import o.InterfaceC9852bdR;
import o.iFU;
import o.iFY;
import o.iWX;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceVM extends ViewModel {
    public final StateFlow<InterfaceC26619jfj> EZpvd;
    public final iFY KWHzl;
    public final iFU OLrzqt;
    public final MutableStateFlow<InterfaceC26619jfj> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final String OLrzqt(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return "";
    }

    public final void OLrzqt(C55276xgr c55276xgr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC26619jfj> copydefault() {
        return this.EZpvd;
    }

    @yCM
    public DexEntranceVM(@NotNull iFY ify, @NotNull iFU ifu) {
        Intrinsics.checkNotNullParameter(ify, "");
        Intrinsics.checkNotNullParameter(ifu, "");
        this.KWHzl = ify;
        this.OLrzqt = ifu;
        MutableStateFlow<InterfaceC26619jfj> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26619jfj.Application.AEQbTJ);
        this.copydefault = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DexEntranceVM$requestHeader$1(this, j, str, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(long j, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        DexEntranceVM$fetchHeaderData$1 dexEntranceVM$fetchHeaderData$1;
        DexEntranceVM dexEntranceVM;
        Object objCopydefault;
        DexEntranceVM dexEntranceVM2;
        if (continuation instanceof DexEntranceVM$fetchHeaderData$1) {
            dexEntranceVM$fetchHeaderData$1 = (DexEntranceVM$fetchHeaderData$1) continuation;
            int i = dexEntranceVM$fetchHeaderData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexEntranceVM$fetchHeaderData$1.label = i - Integer.MIN_VALUE;
            } else {
                dexEntranceVM$fetchHeaderData$1 = new DexEntranceVM$fetchHeaderData$1(this, continuation);
            }
        }
        Object obj = dexEntranceVM$fetchHeaderData$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = dexEntranceVM$fetchHeaderData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<InterfaceC26619jfj> mutableStateFlow = this.copydefault;
            InterfaceC26619jfj.Application application = InterfaceC26619jfj.Application.AEQbTJ;
            dexEntranceVM$fetchHeaderData$1.L$0 = this;
            dexEntranceVM$fetchHeaderData$1.L$1 = str;
            dexEntranceVM$fetchHeaderData$1.J$0 = j;
            dexEntranceVM$fetchHeaderData$1.label = 1;
            if (mutableStateFlow.emit(application, dexEntranceVM$fetchHeaderData$1) == objCopydefault2) {
                return objCopydefault2;
            }
            dexEntranceVM = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    objCopydefault = dexEntranceVM$fetchHeaderData$1.L$1;
                    dexEntranceVM2 = (DexEntranceVM) dexEntranceVM$fetchHeaderData$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                        MutableStateFlow<InterfaceC26619jfj> mutableStateFlow2 = dexEntranceVM2.copydefault;
                        InterfaceC26619jfj.StateListAnimator stateListAnimator = InterfaceC26619jfj.StateListAnimator.OLrzqt;
                        dexEntranceVM$fetchHeaderData$1.L$0 = objCopydefault;
                        dexEntranceVM$fetchHeaderData$1.L$1 = null;
                        dexEntranceVM$fetchHeaderData$1.label = 4;
                        if (mutableStateFlow2.emit(stateListAnimator, dexEntranceVM$fetchHeaderData$1) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                DexEntranceVM dexEntranceVM3 = (DexEntranceVM) dexEntranceVM$fetchHeaderData$1.L$0;
                C56391yDq.AEQbTJ(obj);
                dexEntranceVM2 = dexEntranceVM3;
                objCopydefault = ((Result) obj).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    List<SubTabsData> listAEQbTJ = ((SearchHeaderInfoResponse) objCopydefault).AEQbTJ();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                    for (SubTabsData subTabsData : listAEQbTJ) {
                        arrayList.add(new iWX(subTabsData.EZpvd(), subTabsData.KWHzl(), yDY.AhwBna(), subTabsData.copydefault()));
                    }
                    MutableStateFlow<InterfaceC26619jfj> mutableStateFlow3 = dexEntranceVM2.copydefault;
                    InterfaceC26619jfj.TaskDescription taskDescription = new InterfaceC26619jfj.TaskDescription(arrayList);
                    dexEntranceVM$fetchHeaderData$1.L$0 = dexEntranceVM2;
                    dexEntranceVM$fetchHeaderData$1.L$1 = objCopydefault;
                    dexEntranceVM$fetchHeaderData$1.label = 3;
                    if (mutableStateFlow3.emit(taskDescription, dexEntranceVM$fetchHeaderData$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                }
                return Unit.INSTANCE;
            }
            j = dexEntranceVM$fetchHeaderData$1.J$0;
            str = (String) dexEntranceVM$fetchHeaderData$1.L$1;
            dexEntranceVM = (DexEntranceVM) dexEntranceVM$fetchHeaderData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        iFU ifu = dexEntranceVM.OLrzqt;
        dexEntranceVM$fetchHeaderData$1.L$0 = dexEntranceVM;
        dexEntranceVM$fetchHeaderData$1.L$1 = null;
        dexEntranceVM$fetchHeaderData$1.label = 2;
        objCopydefault = ifu.copydefault(j, str, dexEntranceVM$fetchHeaderData$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        dexEntranceVM2 = dexEntranceVM;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DexEntranceVM$traceDexEntrancePage$1(this, j, str, null), 2, null);
    }

    public final void EZpvd(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new DexEntranceVM$traceDexTabClick$1(this, j, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(final long j, Continuation<? super String> continuation) throws Throwable {
        DexEntranceVM$getWalletString$1 dexEntranceVM$getWalletString$1;
        if (continuation instanceof DexEntranceVM$getWalletString$1) {
            dexEntranceVM$getWalletString$1 = (DexEntranceVM$getWalletString$1) continuation;
            int i = dexEntranceVM$getWalletString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexEntranceVM$getWalletString$1.label = i - Integer.MIN_VALUE;
            } else {
                dexEntranceVM$getWalletString$1 = new DexEntranceVM$getWalletString$1(this, continuation);
            }
        }
        Object objAwait = dexEntranceVM$getWalletString$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexEntranceVM$getWalletString$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).gEmmrt().KWHzl();
            final Function1 function1 = new Function1() { // from class: o.jaY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexEntranceVM.copydefault(j, (InterfaceC9738bbJ) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtAhwBna = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.jbe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DexEntranceVM.EZpvd(function1, obj);
                }
            }).AhwBna(new InterfaceC58229yxO() { // from class: o.jbf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return DexEntranceVM.OLrzqt((java.lang.Throwable) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAhwBna, "");
            dexEntranceVM$getWalletString$1.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, dexEntranceVM$getWalletString$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objAwait);
        }
        Intrinsics.checkNotNullExpressionValue(objAwait, "");
        return objAwait;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EZpvd(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String copydefault(long j, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.EZpvd(j);
    }
}
