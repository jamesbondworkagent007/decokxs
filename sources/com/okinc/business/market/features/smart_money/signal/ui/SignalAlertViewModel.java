package com.okinc.business.market.features.smart_money.signal.ui;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC29476kuP;
import o.C25389ivm;
import o.C28586kda;
import o.C28603kdr;
import o.C29461kuA;
import o.C29463kuC;
import o.C29502kup;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.jAG;
import o.kKG;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalAlertViewModel extends ViewModel {
    public final MutableSharedFlow<Integer> AEQbTJ;
    public final StateFlow<C29463kuC> AYXKKw;
    public final C29502kup AhwBna;
    public final C29461kuA DbNXlk;
    public final MutableStateFlow<C29463kuC> EZpvd;
    public final jAG KWHzl;
    public final Flow<AbstractC29476kuP> OLrzqt;
    public final MutableStateFlow<AbstractC29476kuP> copydefault;
    public final C28603kdr djBIcL;
    public final C28586kda gEmmrt;
    public final kKG isConnected;
    public final SharedFlow<Integer> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29463kuC> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<AbstractC29476kuP> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> djBIcL() {
        return this.valueOf;
    }

    @yCM
    public SignalAlertViewModel(@NotNull C29502kup c29502kup, @NotNull C29461kuA c29461kuA, @NotNull C28586kda c28586kda, @NotNull kKG kkg, @NotNull C28603kdr c28603kdr, @NotNull jAG jag) {
        Intrinsics.checkNotNullParameter(c29502kup, "");
        Intrinsics.checkNotNullParameter(c29461kuA, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(jag, "");
        this.AhwBna = c29502kup;
        this.DbNXlk = c29461kuA;
        this.gEmmrt = c28586kda;
        this.isConnected = kkg;
        this.djBIcL = c28603kdr;
        this.KWHzl = jag;
        MutableStateFlow<C29463kuC> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29463kuC(false, false, null, 7, null));
        this.EZpvd = MutableStateFlow;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<AbstractC29476kuP> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow2;
        this.OLrzqt = MutableStateFlow2;
    }

    public final void copydefault() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$fetchAlerts$1(this, null), 3, null);
    }

    public final void EZpvd() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$enableNotifications$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super String> continuation) throws Throwable {
        SignalAlertViewModel$getWalletUserAddress$1 signalAlertViewModel$getWalletUserAddress$1;
        Object objOLrzqt;
        if (continuation instanceof SignalAlertViewModel$getWalletUserAddress$1) {
            signalAlertViewModel$getWalletUserAddress$1 = (SignalAlertViewModel$getWalletUserAddress$1) continuation;
            int i = signalAlertViewModel$getWalletUserAddress$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$getWalletUserAddress$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$getWalletUserAddress$1 = new SignalAlertViewModel$getWalletUserAddress$1(this, continuation);
            }
        }
        Object obj = signalAlertViewModel$getWalletUserAddress$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$getWalletUserAddress$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.gEmmrt;
            signalAlertViewModel$getWalletUserAddress$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$getWalletUserAddress$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        String strEZpvd = dexUserIdentity != null ? dexUserIdentity.EZpvd() : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Long> continuation) throws Throwable {
        SignalAlertViewModel$getWalletChainId$1 signalAlertViewModel$getWalletChainId$1;
        Object objOLrzqt;
        if (continuation instanceof SignalAlertViewModel$getWalletChainId$1) {
            signalAlertViewModel$getWalletChainId$1 = (SignalAlertViewModel$getWalletChainId$1) continuation;
            int i = signalAlertViewModel$getWalletChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$getWalletChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$getWalletChainId$1 = new SignalAlertViewModel$getWalletChainId$1(this, continuation);
            }
        }
        Object obj = signalAlertViewModel$getWalletChainId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$getWalletChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.gEmmrt;
            signalAlertViewModel$getWalletChainId$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$getWalletChainId$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        return C56443yFo.KWHzl(dexUserIdentity != null ? dexUserIdentity.OLrzqt() : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        SignalAlertViewModel$hasValidJwt$1 signalAlertViewModel$hasValidJwt$1;
        Object objOLrzqt;
        SignalAlertViewModel signalAlertViewModel;
        Object objCopydefault;
        if (continuation instanceof SignalAlertViewModel$hasValidJwt$1) {
            signalAlertViewModel$hasValidJwt$1 = (SignalAlertViewModel$hasValidJwt$1) continuation;
            int i = signalAlertViewModel$hasValidJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$hasValidJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$hasValidJwt$1 = new SignalAlertViewModel$hasValidJwt$1(this, continuation);
            }
        }
        Object obj = signalAlertViewModel$hasValidJwt$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$hasValidJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.gEmmrt;
            signalAlertViewModel$hasValidJwt$1.L$0 = this;
            signalAlertViewModel$hasValidJwt$1.label = 1;
            objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$hasValidJwt$1);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            signalAlertViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                return !Result.m7383isFailureimpl(objCopydefault) ? C56443yFo.KWHzl(false) : objCopydefault;
            }
            signalAlertViewModel = (SignalAlertViewModel) signalAlertViewModel$hasValidJwt$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity == null) {
            return C56443yFo.KWHzl(false);
        }
        C28603kdr c28603kdr = signalAlertViewModel.djBIcL;
        String strEZpvd = dexUserIdentity.EZpvd();
        signalAlertViewModel$hasValidJwt$1.L$0 = null;
        signalAlertViewModel$hasValidJwt$1.label = 2;
        objCopydefault = c28603kdr.copydefault(strEZpvd, signalAlertViewModel$hasValidJwt$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        if (!Result.m7383isFailureimpl(objCopydefault)) {
        }
    }

    public final boolean valueOf() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = this.isConnected.valueOf();
        return (this.isConnected.OLrzqt(interfaceC9738bbJValueOf) || this.isConnected.AEQbTJ(interfaceC9738bbJValueOf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        SignalAlertViewModel$isWalletSupportSignatureVerification$1 signalAlertViewModel$isWalletSupportSignatureVerification$1;
        SignalAlertViewModel signalAlertViewModel;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        Iterable iterable;
        Object objM7386unboximpl;
        DexUserIdentity dexUserIdentity;
        if (continuation instanceof SignalAlertViewModel$isWalletSupportSignatureVerification$1) {
            signalAlertViewModel$isWalletSupportSignatureVerification$1 = (SignalAlertViewModel$isWalletSupportSignatureVerification$1) continuation;
            int i = signalAlertViewModel$isWalletSupportSignatureVerification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$isWalletSupportSignatureVerification$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$isWalletSupportSignatureVerification$1 = new SignalAlertViewModel$isWalletSupportSignatureVerification$1(this, continuation);
            }
        }
        Object objAwait = signalAlertViewModel$isWalletSupportSignatureVerification$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$isWalletSupportSignatureVerification$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$isWalletSupportSignatureVerification$isAAWallet$1(this, null), 3, null);
            signalAlertViewModel$isWalletSupportSignatureVerification$1.L$0 = this;
            signalAlertViewModel$isWalletSupportSignatureVerification$1.label = 1;
            objAwait = deferredAsync$default.await(signalAlertViewModel$isWalletSupportSignatureVerification$1);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            signalAlertViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iterable = (Iterable) signalAlertViewModel$isWalletSupportSignatureVerification$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                objM7386unboximpl = ((Result) objAwait).m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                dexUserIdentity = (DexUserIdentity) objM7386unboximpl;
                if (!CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Long>) ((Iterable<? extends Object>) iterable), dexUserIdentity != null ? C56443yFo.KWHzl(dexUserIdentity.OLrzqt()) : null)) {
                    z = false;
                }
                return C56443yFo.KWHzl(z);
            }
            signalAlertViewModel = (SignalAlertViewModel) signalAlertViewModel$isWalletSupportSignatureVerification$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        if (!((Boolean) objAwait).booleanValue()) {
            InterfaceC9738bbJ interfaceC9738bbJValueOf2 = signalAlertViewModel.isConnected.valueOf();
            if ((interfaceC9738bbJValueOf2 == null || !interfaceC9738bbJValueOf2.QOLQEE()) && ((interfaceC9738bbJValueOf = signalAlertViewModel.isConnected.valueOf()) == null || !interfaceC9738bbJValueOf.AuCTelauCTel())) {
                List listGEmmrt = yDY.gEmmrt(C56443yFo.KWHzl(784L), C56443yFo.KWHzl(195L), C56443yFo.KWHzl(607L), C56443yFo.KWHzl(0L), C56443yFo.KWHzl(70000061L), C56443yFo.KWHzl(637L), C56443yFo.KWHzl(-2003L), C56443yFo.KWHzl(9004L));
                C28586kda c28586kda = signalAlertViewModel.gEmmrt;
                signalAlertViewModel$isWalletSupportSignatureVerification$1.L$0 = listGEmmrt;
                signalAlertViewModel$isWalletSupportSignatureVerification$1.label = 2;
                Object objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$isWalletSupportSignatureVerification$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                iterable = listGEmmrt;
                objM7386unboximpl = objOLrzqt;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                dexUserIdentity = (DexUserIdentity) objM7386unboximpl;
                if (!CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends Long>) ((Iterable<? extends Object>) iterable), dexUserIdentity != null ? C56443yFo.KWHzl(dexUserIdentity.OLrzqt()) : null)) {
                }
            }
        }
        return C56443yFo.KWHzl(z);
    }

    public final void KWHzl(C29463kuC.Application application) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$generateSignMsgForSignalAlert$1(this, application, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super Result<DappSignArgs>> continuation) {
        SignalAlertViewModel$generateSignMessage$1 signalAlertViewModel$generateSignMessage$1;
        Object objOLrzqt;
        SignalAlertViewModel signalAlertViewModel;
        Object objEZpvd;
        if (continuation instanceof SignalAlertViewModel$generateSignMessage$1) {
            signalAlertViewModel$generateSignMessage$1 = (SignalAlertViewModel$generateSignMessage$1) continuation;
            int i = signalAlertViewModel$generateSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$generateSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$generateSignMessage$1 = new SignalAlertViewModel$generateSignMessage$1(this, continuation);
            }
        }
        Object obj = signalAlertViewModel$generateSignMessage$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$generateSignMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.gEmmrt;
                signalAlertViewModel$generateSignMessage$1.L$0 = this;
                signalAlertViewModel$generateSignMessage$1.label = 1;
                objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$generateSignMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                signalAlertViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
                }
                signalAlertViewModel = (SignalAlertViewModel) signalAlertViewModel$generateSignMessage$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = signalAlertViewModel.djBIcL;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            signalAlertViewModel$generateSignMessage$1.L$0 = null;
            signalAlertViewModel$generateSignMessage$1.label = 2;
            objEZpvd = c28603kdr.EZpvd(strEZpvd, jOLrzqt, signalAlertViewModel$generateSignMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return Result.m7377constructorimpl((DappSignArgs) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void AEQbTJ(Bundle bundle, C29463kuC.Application application) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$loginWithTokenAlert$1(bundle, this, application, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Bundle bundle, @NotNull Continuation<? super Result<Boolean>> continuation) {
        SignalAlertViewModel$login$1 signalAlertViewModel$login$1;
        Object objOLrzqt;
        SignalAlertViewModel signalAlertViewModel;
        Object objKWHzl;
        if (continuation instanceof SignalAlertViewModel$login$1) {
            signalAlertViewModel$login$1 = (SignalAlertViewModel$login$1) continuation;
            int i = signalAlertViewModel$login$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                signalAlertViewModel$login$1.label = i - Integer.MIN_VALUE;
            } else {
                signalAlertViewModel$login$1 = new SignalAlertViewModel$login$1(this, continuation);
            }
        }
        SignalAlertViewModel$login$1 signalAlertViewModel$login$12 = signalAlertViewModel$login$1;
        Object obj = signalAlertViewModel$login$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = signalAlertViewModel$login$12.label;
        Object obj2 = null;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C28586kda c28586kda = this.gEmmrt;
                signalAlertViewModel$login$12.L$0 = this;
                signalAlertViewModel$login$12.L$1 = bundle;
                signalAlertViewModel$login$12.label = 1;
                objOLrzqt = c28586kda.OLrzqt(signalAlertViewModel$login$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                signalAlertViewModel = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objKWHzl = ((Result) obj).m7386unboximpl();
                    if (Result.m7383isFailureimpl(objKWHzl)) {
                        obj2 = objKWHzl;
                    }
                    return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
                }
                bundle = (Bundle) signalAlertViewModel$login$12.L$1;
                signalAlertViewModel = (SignalAlertViewModel) signalAlertViewModel$login$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            Bundle bundle2 = bundle;
            C56391yDq.AEQbTJ(objOLrzqt);
            DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
            C28603kdr c28603kdr = signalAlertViewModel.djBIcL;
            String strEZpvd = dexUserIdentity.EZpvd();
            long jOLrzqt = dexUserIdentity.OLrzqt();
            signalAlertViewModel$login$12.L$0 = null;
            signalAlertViewModel$login$12.L$1 = null;
            signalAlertViewModel$login$12.label = 2;
            objKWHzl = c28603kdr.KWHzl(strEZpvd, jOLrzqt, bundle2, signalAlertViewModel$login$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            if (Result.m7383isFailureimpl(objKWHzl)) {
            }
            return Result.m7377constructorimpl(C56443yFo.KWHzl(Intrinsics.EZpvd(obj2, C56443yFo.KWHzl(true))));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void AEQbTJ(C29463kuC.Application application) {
        boolean zOLrzqt;
        if (application != null) {
            zOLrzqt = this.AYXKKw.getValue().AEQbTJ().contains(application);
        } else {
            zOLrzqt = this.AYXKKw.getValue().OLrzqt();
        }
        if (zOLrzqt) {
            copydefault(application);
        } else {
            OLrzqt(application);
        }
    }

    public final void OLrzqt(C29463kuC.Application application) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$addAlert$1(this, application, null), 3, null);
    }

    public final void copydefault(C29463kuC.Application application) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$deleteAlert$1(this, application, null), 3, null);
    }

    public final void AhwBna() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalAlertViewModel$resetSignalAlertState$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        C29463kuC value;
        MutableStateFlow<C29463kuC> mutableStateFlow = this.EZpvd;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C29463kuC.copy$default(value, false, false, null, 6, null)));
    }
}
