package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindCeFiRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindCeFiResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindNonceRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindNonceResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.UnbindWalletUseCase$getData$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.SignStatus;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19334fzN extends AbstractC19325fzE<StateListAnimator, TaskDescription> {
    public final WalletBindApiService AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC54824xWr copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19334fzN(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull WalletBindApiService walletBindApiService, @NotNull InterfaceC54824xWr interfaceC54824xWr) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        Intrinsics.checkNotNullParameter(interfaceC54824xWr, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = walletBindApiService;
        this.copydefault = interfaceC54824xWr;
    }

    /* JADX INFO: renamed from: o.fzN$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final androidx.fragment.app.FragmentManager OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.KWHzl;
            }
            if ((i & 4) != 0) {
                fragmentManager = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.KWHzl(str, str2, fragmentManager);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.FragmentManager KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            return new StateListAnimator(str, str2, fragmentManager);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(accountId=" + this.AEQbTJ + ", accountName=" + this.KWHzl + ", fragmentManager=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.AEQbTJ = str;
            this.KWHzl = str2;
            this.OLrzqt = fragmentManager;
        }
    }

    /* JADX INFO: renamed from: o.fzN$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.fzN$TaskDescription$Application */
        public static final class Application implements TaskDescription {
            public static final Application KWHzl = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 160284684;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success";
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.fzN$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                return stateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(java.lang.String str) {
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(message=" + this.KWHzl + ")";
            }

            public StateListAnimator(java.lang.String str) {
                this.KWHzl = str;
            }
        }

        /* JADX INFO: renamed from: o.fzN$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0851TaskDescription implements TaskDescription {
            public static final C0851TaskDescription copydefault = new C0851TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0851TaskDescription)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 364273641;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UserCancelSigning";
            }

            private C0851TaskDescription() {
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    @Override // o.AbstractC19325fzE
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super TaskDescription> continuation) throws java.lang.Throwable {
        UnbindWalletUseCase$getData$1 unbindWalletUseCase$getData$1;
        java.lang.Object objM7377constructorimpl;
        StateListAnimator stateListAnimator2;
        C19334fzN c19334fzN;
        WalletBindApiService walletBindApiService;
        UnBindNonceRequestBody unBindNonceRequestBody;
        java.lang.Object objM7377constructorimpl2;
        C19334fzN c19334fzN2;
        StateListAnimator stateListAnimator3;
        java.lang.String unbindNonce;
        java.lang.Object objAEQbTJ;
        SignStatus signStatusKWHzl;
        if (continuation instanceof UnbindWalletUseCase$getData$1) {
            unbindWalletUseCase$getData$1 = (UnbindWalletUseCase$getData$1) continuation;
            int i = unbindWalletUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unbindWalletUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                unbindWalletUseCase$getData$1 = new UnbindWalletUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object unbindNonce$default = unbindWalletUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unbindWalletUseCase$getData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(unbindNonce$default);
                try {
                    Result.Application application = Result.Companion;
                    walletBindApiService = this.AEQbTJ;
                    unBindNonceRequestBody = new UnBindNonceRequestBody(stateListAnimator.copydefault(), stateListAnimator.EZpvd());
                    unbindWalletUseCase$getData$1.L$0 = this;
                    stateListAnimator2 = stateListAnimator;
                } catch (java.lang.Throwable th) {
                    th = th;
                    stateListAnimator2 = stateListAnimator;
                }
                try {
                    unbindWalletUseCase$getData$1.L$1 = stateListAnimator2;
                    unbindWalletUseCase$getData$1.label = 1;
                    unbindNonce$default = WalletBindApiService.TaskDescription.getUnbindNonce$default(walletBindApiService, unBindNonceRequestBody, null, unbindWalletUseCase$getData$1, 2, null);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c19334fzN = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c19334fzN2 = c19334fzN;
                    stateListAnimator3 = stateListAnimator2;
                    UnBindNonceResponseBody unBindNonceResponseBody = (UnBindNonceResponseBody) (!Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                    if (unBindNonceResponseBody == null) {
                    }
                    if (unbindNonce != null) {
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce error:" + message);
                    return new TaskDescription.StateListAnimator(message);
                }
                if (unbindNonce$default == objCopydefault) {
                    return objCopydefault;
                }
                c19334fzN = this;
                objM7377constructorimpl2 = Result.m7377constructorimpl((UnBindNonceResponseBody) ((ResponseData) unbindNonce$default).getData());
                c19334fzN2 = c19334fzN;
                stateListAnimator3 = stateListAnimator2;
                UnBindNonceResponseBody unBindNonceResponseBody2 = (UnBindNonceResponseBody) (!Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                if (unBindNonceResponseBody2 == null) {
                }
                if (unbindNonce != null) {
                }
                java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                }
                C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce error:" + message);
                return new TaskDescription.StateListAnimator(message);
            }
            if (i2 == 1) {
                StateListAnimator stateListAnimator4 = (StateListAnimator) unbindWalletUseCase$getData$1.L$1;
                c19334fzN = (C19334fzN) unbindWalletUseCase$getData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(unbindNonce$default);
                    stateListAnimator2 = stateListAnimator4;
                    try {
                        objM7377constructorimpl2 = Result.m7377constructorimpl((UnBindNonceResponseBody) ((ResponseData) unbindNonce$default).getData());
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    stateListAnimator2 = stateListAnimator4;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    c19334fzN2 = c19334fzN;
                    stateListAnimator3 = stateListAnimator2;
                    UnBindNonceResponseBody unBindNonceResponseBody22 = (UnBindNonceResponseBody) (!Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                    if (unBindNonceResponseBody22 == null) {
                    }
                    if (unbindNonce != null) {
                    }
                    java.lang.Throwable thM7380exceptionOrNullimpl22 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl22 != null) {
                    }
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce error:" + message);
                    return new TaskDescription.StateListAnimator(message);
                }
                c19334fzN2 = c19334fzN;
                stateListAnimator3 = stateListAnimator2;
                UnBindNonceResponseBody unBindNonceResponseBody222 = (UnBindNonceResponseBody) (!Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                unbindNonce = unBindNonceResponseBody222 == null ? unBindNonceResponseBody222.getUnbindNonce() : null;
                if (unbindNonce != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) unbindNonce)) {
                    java.lang.Throwable thM7380exceptionOrNullimpl222 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    java.lang.String message = thM7380exceptionOrNullimpl222 != null ? thM7380exceptionOrNullimpl222.getMessage() : null;
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce error:" + message);
                    return new TaskDescription.StateListAnimator(message);
                }
                C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce succeed");
                C54834xXa c54834xXa = new C54834xXa(stateListAnimator3.copydefault(), stateListAnimator3.copydefault() + unbindNonce);
                InterfaceC54824xWr interfaceC54824xWr = c19334fzN2.copydefault;
                androidx.fragment.app.FragmentManager fragmentManagerKWHzl = stateListAnimator3.KWHzl();
                unbindWalletUseCase$getData$1.L$0 = c19334fzN2;
                unbindWalletUseCase$getData$1.L$1 = stateListAnimator3;
                unbindWalletUseCase$getData$1.L$2 = unbindNonce;
                unbindWalletUseCase$getData$1.label = 2;
                objAEQbTJ = interfaceC54824xWr.AEQbTJ(fragmentManagerKWHzl, c54834xXa, unbindWalletUseCase$getData$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                java.lang.String str = unbindNonce;
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                }
                C54837xXd c54837xXd = (C54837xXd) objAEQbTJ;
                if (c54837xXd == null) {
                }
                if (c54837xXd == null) {
                }
                if (c54837xXd == null) {
                }
                if (c54837xXd == null) {
                }
                if (c54837xXd == null) {
                }
                if (signStatusKWHzl != SignStatus.UserCancel) {
                }
            } else if (i2 == 2) {
                unbindNonce = (java.lang.String) unbindWalletUseCase$getData$1.L$2;
                stateListAnimator3 = (StateListAnimator) unbindWalletUseCase$getData$1.L$1;
                c19334fzN2 = (C19334fzN) unbindWalletUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(unbindNonce$default);
                objAEQbTJ = ((Result) unbindNonce$default).m7386unboximpl();
                java.lang.String str2 = unbindNonce;
                if (Result.m7383isFailureimpl(objAEQbTJ)) {
                    objAEQbTJ = null;
                }
                C54837xXd c54837xXd2 = (C54837xXd) objAEQbTJ;
                java.lang.String strCopydefault = c54837xXd2 == null ? c54837xXd2.copydefault() : null;
                signStatusKWHzl = c54837xXd2 == null ? c54837xXd2.KWHzl() : null;
                java.lang.String strOLrzqt = c54837xXd2 == null ? c54837xXd2.OLrzqt() : null;
                java.lang.Long lAEQbTJ = c54837xXd2 == null ? c54837xXd2.AEQbTJ() : null;
                java.lang.Integer numEZpvd = c54837xXd2 == null ? c54837xXd2.EZpvd() : null;
                if (signStatusKWHzl != SignStatus.UserCancel) {
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "sign unbind data error, status=" + c54837xXd2.KWHzl());
                    return TaskDescription.C0851TaskDescription.copydefault;
                }
                if (signStatusKWHzl != SignStatus.Success || strOLrzqt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt) || lAEQbTJ == null || numEZpvd == null) {
                    C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "sign unbind data error, status=" + (c54837xXd2 != null ? c54837xXd2.KWHzl() : null) + ", chainIndex=" + lAEQbTJ + ", addressType=" + numEZpvd + ", message=" + strCopydefault);
                    return new TaskDescription.StateListAnimator(strCopydefault);
                }
                C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "sign unbind data success");
                Result.Application application3 = Result.Companion;
                WalletBindApiService walletBindApiService2 = c19334fzN2.AEQbTJ;
                UnBindCeFiRequestBody unBindCeFiRequestBody = new UnBindCeFiRequestBody(stateListAnimator3.copydefault(), strOLrzqt, str2, C33129mqd.gEmmrt(numEZpvd), C33129mqd.gEmmrt(lAEQbTJ));
                unbindWalletUseCase$getData$1.L$0 = null;
                unbindWalletUseCase$getData$1.L$1 = null;
                unbindWalletUseCase$getData$1.L$2 = null;
                unbindWalletUseCase$getData$1.label = 3;
                unbindNonce$default = WalletBindApiService.TaskDescription.unbind$default(walletBindApiService2, unBindCeFiRequestBody, null, unbindWalletUseCase$getData$1, 2, null);
                if (unbindNonce$default == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) unbindNonce$default);
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(unbindNonce$default);
                objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) unbindNonce$default);
            }
        } catch (java.lang.Throwable th5) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th5));
        }
        ResponseData responseData = (ResponseData) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (responseData != null) {
            UnBindCeFiResponse unBindCeFiResponse = (UnBindCeFiResponse) responseData.getData();
            if (unBindCeFiResponse != null && unBindCeFiResponse.getRes()) {
                C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "unbind wallet success");
                return TaskDescription.Application.KWHzl;
            }
            C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "unbind wallet failed");
            return new TaskDescription.StateListAnimator(responseData.getDetailMsg());
        }
        java.lang.Throwable thM7380exceptionOrNullimpl3 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl3 != null) {
            C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "unbind wallet failed");
            return new TaskDescription.StateListAnimator(thM7380exceptionOrNullimpl3.getMessage());
        }
        return new TaskDescription.StateListAnimator("");
    }
}
