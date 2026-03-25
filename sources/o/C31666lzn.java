package o;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.CeDeFiWalletResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailSetResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailStateInfo;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeProcessInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyFromSource;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateEmailInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoSource;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.WalletCreationError;
import com.okinc.buysell.data.cedefi.BuySellDexCreateWalletResult;
import com.okinc.buysell.data.cedefi.BuySellDexEmailSetResult;
import com.okinc.buysell.data.cedefi.BuySellDexEmailState;
import com.okinc.buysell.data.cedefi.BuySellDexEscapeResult;
import com.okinc.buysell.data.cedefi.BuySellDexUpdateInfoResult;
import com.okinc.buysell.data.cedefi.BuySellDexWalletCreationError;
import com.okinc.buysell.external.OKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC31396ltI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31666lzn extends AbstractC43215rlA implements InterfaceC31668lzp {
    public static final Activity Companion = new Activity(null);

    /* JADX INFO: renamed from: o.lzn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lzn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC31668lzp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super Result<BuySellDexEmailState>> continuation) {
        OKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1 oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof OKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1) {
            oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1 = (OKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1) continuation;
            int i = oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1.label = i - Integer.MIN_VALUE;
            } else {
                oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1 = new OKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1(this, continuation);
            }
        }
        java.lang.Object obj = oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("okt_dex_wallet", "validateEmail called");
                InterfaceC9916bec interfaceC9916bec = (InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class);
                oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1.label = 1;
                objCopydefault = interfaceC9916bec.copydefault(oKBuySellCeDefiExternalBridgeProtocolImpl$validateEmail$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
            }
            if (!Result.m7384isSuccessimpl(objCopydefault)) {
                return Result.m7377constructorimpl(objCopydefault);
            }
            Result.Application application = Result.Companion;
            EmailStateInfo emailStateInfo = (EmailStateInfo) objCopydefault;
            BuySellDexEmailState buySellDexEmailState = new BuySellDexEmailState(emailStateInfo.isValidEmail(), emailStateInfo.getNoEmail());
            pUU.KWHzl("okt_dex_wallet", "validateEmail result: isValidEmail=" + buySellDexEmailState.isValidEmail() + ", noEmail=" + buySellDexEmailState.getNoEmail());
            return Result.m7377constructorimpl(buySellDexEmailState);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("okt_dex_wallet", "validateEmail failed: " + e.getMessage());
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }

    @Override // o.InterfaceC31668lzp
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super BuySellDexCreateWalletResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("okt_dex_wallet", "createCeDeFiWallet called");
        ((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).copydefault(fragmentManager, lifecycleOwner, new CeDeFiWalletInput(""), new Function1() { // from class: o.lzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31666lzn.copydefault(function1, this, (CeDeFiWalletResult) obj);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, C31666lzn c31666lzn, CeDeFiWalletResult ceDeFiWalletResult) {
        Intrinsics.checkNotNullParameter(ceDeFiWalletResult, "");
        pUU.KWHzl("okt_dex_wallet", "createCeDeFiWallet result: " + ceDeFiWalletResult);
        if (ceDeFiWalletResult instanceof CeDeFiWalletResult.Success) {
            CeDeFiWalletResult.Success success = (CeDeFiWalletResult.Success) ceDeFiWalletResult;
            PasskeyFromSource passkeyFromSourceEZpvd = success.EZpvd();
            PasskeyFromSource passkeyFromSource = PasskeyFromSource.LINK_EXTERNAL_DEVICE;
            if (passkeyFromSourceEZpvd == passkeyFromSource) {
                pUU.KWHzl("okt_dex_wallet", "createCeDeFiWallet result is from external link");
            }
            function1.invoke(new BuySellDexCreateWalletResult.Success(success.EZpvd() == passkeyFromSource));
        } else if (ceDeFiWalletResult instanceof CeDeFiWalletResult.Cancelled) {
            function1.invoke(BuySellDexCreateWalletResult.Cancelled.OLrzqt);
        } else if (ceDeFiWalletResult instanceof CeDeFiWalletResult.Failed) {
            function1.invoke(new BuySellDexCreateWalletResult.Failed(c31666lzn.KWHzl(((CeDeFiWalletResult.Failed) ceDeFiWalletResult).AEQbTJ())));
        } else {
            if (!Intrinsics.EZpvd(ceDeFiWalletResult, CeDeFiWalletResult.Ignored.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(BuySellDexCreateWalletResult.Ignored.EZpvd);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31668lzp
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull final Function1<? super BuySellDexEscapeResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("okt_dex_wallet", "startCedefiWalletEscapeFlow called");
        ((InterfaceC9914bea) C43251rlk.copydefault(InterfaceC9914bea.class)).KWHzl(lifecycleOwner, fragmentManager, new EscapeProcessInput(ProjectSource.CeDeFi), new Function1() { // from class: o.lzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31666lzn.EZpvd(function1, (EscapeResult) obj);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, EscapeResult escapeResult) {
        Intrinsics.checkNotNullParameter(escapeResult, "");
        pUU.KWHzl("okt_dex_wallet", "startCedefiWalletEscapeFlow result: " + escapeResult);
        if (Intrinsics.EZpvd(escapeResult, EscapeResult.Cancelled.AEQbTJ)) {
            function1.invoke(BuySellDexEscapeResult.Cancelled.AEQbTJ);
        } else {
            if (!Intrinsics.EZpvd(escapeResult, EscapeResult.Success.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(BuySellDexEscapeResult.Success.OLrzqt);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31668lzp
    public void OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull InterfaceC31396ltI interfaceC31396ltI, @NotNull final Function1<? super BuySellDexUpdateInfoResult, Unit> function1) {
        UpdateInfoSource updateInfoSource;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC31396ltI, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("okt_dex_wallet", "updateInfo called with chainIndex: " + str + ", updateInfoData: " + interfaceC31396ltI);
        if (Intrinsics.EZpvd(interfaceC31396ltI, InterfaceC31396ltI.ActionBar.AEQbTJ)) {
            updateInfoSource = UpdateInfoSource.CHANGE_EMAIL;
        } else {
            if (!Intrinsics.EZpvd(interfaceC31396ltI, InterfaceC31396ltI.Application.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            updateInfoSource = UpdateInfoSource.ADD_PASSKEY;
        }
        ((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).AEQbTJ(lifecycleOwner, fragmentManager, new UpdateInfoInput(updateInfoSource, str), new Function1() { // from class: o.lzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31666lzn.EZpvd(function1, (UpdateInfoResult) obj);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, UpdateInfoResult updateInfoResult) {
        Intrinsics.checkNotNullParameter(updateInfoResult, "");
        pUU.KWHzl("okt_dex_wallet", "updateInfo result: " + updateInfoResult);
        if (updateInfoResult instanceof UpdateInfoResult.Success) {
            function1.invoke(BuySellDexUpdateInfoResult.Success.OLrzqt);
        } else if (updateInfoResult instanceof UpdateInfoResult.Cancelled) {
            function1.invoke(BuySellDexUpdateInfoResult.Cancelled.AEQbTJ);
        } else {
            if (!(updateInfoResult instanceof UpdateInfoResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String strKWHzl = ((UpdateInfoResult.Failed) updateInfoResult).KWHzl();
            function1.invoke(new BuySellDexUpdateInfoResult.Failed(strKWHzl != null ? strKWHzl : ""));
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31668lzp
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull final Function1<? super BuySellDexEmailSetResult, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.KWHzl("okt_dex_wallet", "updateOrBindWalletEmail called with chainIndex: " + str);
        ((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).KWHzl(fragmentManager, lifecycleOwner, new UpdateEmailInput(str), new Function1() { // from class: o.lzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31666lzn.OLrzqt(function1, (EmailSetResult) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, EmailSetResult emailSetResult) {
        Intrinsics.checkNotNullParameter(emailSetResult, "");
        pUU.KWHzl("okt_dex_wallet", "updateOrBindWalletEmail result: " + emailSetResult);
        if (Intrinsics.EZpvd(emailSetResult, EmailSetResult.Cancelled.KWHzl)) {
            function1.invoke(BuySellDexEmailSetResult.Cancelled.OLrzqt);
        } else if (emailSetResult instanceof EmailSetResult.Failed) {
            function1.invoke(new BuySellDexEmailSetResult.Failed(((EmailSetResult.Failed) emailSetResult).OLrzqt()));
        } else {
            if (!Intrinsics.EZpvd(emailSetResult, EmailSetResult.Success.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(BuySellDexEmailSetResult.Success.EZpvd);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC31668lzp
    public ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> copydefault() {
        return ((InterfaceC9916bec) C43251rlk.copydefault(InterfaceC9916bec.class)).EZpvd();
    }

    @Override // o.InterfaceC31668lzp
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return ((InterfaceC8196ayF) C43251rlk.copydefault(InterfaceC8196ayF.class)).copydefault(new PasskeyScenario.CedefiWallet("BSC", false, 2, null), true, continuation);
    }

    public final BuySellDexWalletCreationError KWHzl(WalletCreationError walletCreationError) {
        BuySellDexWalletCreationError buySellDexWalletCreationError;
        BuySellDexWalletCreationError passkeyNetworkFailure;
        pUU.KWHzl("okt_dex_wallet", "mapWalletCreationError called with error: " + walletCreationError);
        if (walletCreationError instanceof WalletCreationError.ReachMaximum) {
            buySellDexWalletCreationError = BuySellDexWalletCreationError.ReachMaximum.EZpvd;
        } else {
            if (walletCreationError instanceof WalletCreationError.PasskeySdkError) {
                passkeyNetworkFailure = new BuySellDexWalletCreationError.PasskeySdkError(((WalletCreationError.PasskeySdkError) walletCreationError).EZpvd());
            } else if (walletCreationError instanceof WalletCreationError.AccountFrozen) {
                buySellDexWalletCreationError = BuySellDexWalletCreationError.AccountFrozen.AEQbTJ;
            } else if (walletCreationError instanceof WalletCreationError.WalletNetworkFailure) {
                passkeyNetworkFailure = new BuySellDexWalletCreationError.WalletNetworkFailure(((WalletCreationError.WalletNetworkFailure) walletCreationError).AEQbTJ());
            } else if (walletCreationError instanceof WalletCreationError.PasskeyNetworkFailure) {
                passkeyNetworkFailure = new BuySellDexWalletCreationError.PasskeyNetworkFailure(((WalletCreationError.PasskeyNetworkFailure) walletCreationError).copydefault());
            } else if (walletCreationError instanceof WalletCreationError.RiskControl) {
                buySellDexWalletCreationError = BuySellDexWalletCreationError.RiskControl.KWHzl;
            } else {
                if (!(walletCreationError instanceof WalletCreationError.GeneralFailure)) {
                    throw new NoWhenBranchMatchedException();
                }
                buySellDexWalletCreationError = BuySellDexWalletCreationError.GeneralFailure.copydefault;
            }
            buySellDexWalletCreationError = passkeyNetworkFailure;
        }
        pUU.KWHzl("okt_dex_wallet", "mapWalletCreationError result: " + buySellDexWalletCreationError);
        return buySellDexWalletCreationError;
    }
}
