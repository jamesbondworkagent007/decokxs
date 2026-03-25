package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.AccountPreCheckResult;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C13023cxy;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.fJQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyAddressCheckViewModel extends AbstractC33073mpa {
    public final StateFlow<InterfaceC49371unL<Boolean>> AEQbTJ;
    public final fJQ EZpvd;
    public final MutableStateFlow<InterfaceC49371unL<AccountPreCheckResult>> KWHzl;
    public final MutableStateFlow<InterfaceC49371unL<Boolean>> OLrzqt;
    public final StateFlow<InterfaceC49371unL<AccountPreCheckResult>> copydefault;
    public final C13934dbu djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC49371unL<Boolean>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC49371unL<AccountPreCheckResult>> KWHzl() {
        return this.copydefault;
    }

    @yCM
    public EscapePassKeyAddressCheckViewModel(@NotNull C13934dbu c13934dbu, @NotNull fJQ fjq) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(fjq, "");
        this.djBIcL = c13934dbu;
        this.EZpvd = fjq;
        MutableStateFlow<InterfaceC49371unL<Boolean>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC49371unL<AccountPreCheckResult>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EscapePassKeyAddressCheckViewModel$checkAddress$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(AccountPreCheckResult accountPreCheckResult, Object obj, Continuation<? super Unit> continuation) throws Throwable {
        EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1 escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1;
        Object objCopydefault;
        EscapePassKeyAddressCheckViewModel escapePassKeyAddressCheckViewModel;
        if (continuation instanceof EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1) {
            escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1 = (EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1) continuation;
            int i = escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1 = new EscapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1(this, continuation);
            }
        }
        Object obj2 = escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            if (!(accountPreCheckResult instanceof AccountPreCheckResult.Success)) {
                return Unit.INSTANCE;
            }
            if (Result.m7383isFailureimpl(obj) || !C13023cxy.Application.getInstance$default(C13023cxy.Companion, null, 1, null).KWHzl()) {
                this.OLrzqt.setValue(new InterfaceC49371unL.Activity(C56443yFo.KWHzl(true)));
                return Unit.INSTANCE;
            }
            C13934dbu c13934dbu = this.djBIcL;
            escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.L$0 = this;
            escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.label = 1;
            objCopydefault = c13934dbu.copydefault(escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            escapePassKeyAddressCheckViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            escapePassKeyAddressCheckViewModel = (EscapePassKeyAddressCheckViewModel) escapePassKeyAddressCheckViewModel$handlePreCheckSuccess$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objCopydefault = ((Result) obj2).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            escapePassKeyAddressCheckViewModel.OLrzqt.setValue(new InterfaceC49371unL.Activity(C56443yFo.KWHzl(((Boolean) objCopydefault).booleanValue())));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            escapePassKeyAddressCheckViewModel.OLrzqt.setValue(new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null));
        }
        return Unit.INSTANCE;
    }
}
