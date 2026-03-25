package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindNonceRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindNonceResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.WalletBindCeFiDetailsConfirmUseCase$getData$1;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.SignStatus;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19333fzM extends AbstractC19325fzE<Activity, Application> {
    public final InterfaceC54824xWr EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final WalletBindApiService copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19333fzM(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC54824xWr interfaceC54824xWr, @NotNull WalletBindApiService walletBindApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC54824xWr, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC54824xWr;
        this.copydefault = walletBindApiService;
    }

    /* JADX INFO: renamed from: o.fzM$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final androidx.fragment.app.FragmentManager EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AYXKKw;
            }
            if ((i & 2) != 0) {
                str2 = activity.djBIcL;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = activity.AEQbTJ;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                fragmentManager = activity.EZpvd;
            }
            androidx.fragment.app.FragmentManager fragmentManager2 = fragmentManager;
            if ((i & 16) != 0) {
                str4 = activity.copydefault;
            }
            java.lang.String str9 = str4;
            if ((i & 32) != 0) {
                str5 = activity.OLrzqt;
            }
            java.lang.String str10 = str5;
            if ((i & 64) != 0) {
                str6 = activity.KWHzl;
            }
            return activity.KWHzl(str, str7, str8, fragmentManager2, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.FragmentManager AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Activity(str, str2, str3, fragmentManager, str4, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AYXKKw;
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
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.AYXKKw.hashCode() * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(walletAccountId=" + this.AYXKKw + ", walletAccountName=" + this.djBIcL + ", avatar=" + this.AEQbTJ + ", fragmentManager=" + this.EZpvd + ", nonce=" + this.copydefault + ", uid=" + this.OLrzqt + ", verifyToken=" + this.KWHzl + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.AYXKKw = str;
            this.djBIcL = str2;
            this.AEQbTJ = str3;
            this.EZpvd = fragmentManager;
            this.copydefault = str4;
            this.OLrzqt = str5;
            this.KWHzl = str6;
        }
    }

    /* JADX INFO: renamed from: o.fzM$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Application {

        /* JADX INFO: renamed from: o.fzM$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SignSuccess(signResult=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: o.fzM$Application$Activity */
        public static final class Activity implements Application {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.EZpvd;
                }
                return activity.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(java.lang.String str) {
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.EZpvd;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SignError(message=" + this.EZpvd + ")";
            }

            public Activity(java.lang.String str) {
                this.EZpvd = str;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC19325fzE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Activity activity, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        WalletBindCeFiDetailsConfirmUseCase$getData$1 walletBindCeFiDetailsConfirmUseCase$getData$1;
        C19333fzM c19333fzM;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objOLrzqt;
        Activity activity2;
        java.lang.String str;
        C54837xXd c54837xXd;
        if (continuation instanceof WalletBindCeFiDetailsConfirmUseCase$getData$1) {
            walletBindCeFiDetailsConfirmUseCase$getData$1 = (WalletBindCeFiDetailsConfirmUseCase$getData$1) continuation;
            int i = walletBindCeFiDetailsConfirmUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindCeFiDetailsConfirmUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindCeFiDetailsConfirmUseCase$getData$1 = new WalletBindCeFiDetailsConfirmUseCase$getData$1(this, continuation);
            }
        }
        java.lang.Object bindNonce$default = walletBindCeFiDetailsConfirmUseCase$getData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindCeFiDetailsConfirmUseCase$getData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(bindNonce$default);
            C19339fzS.EZpvd.OLrzqt("[Bind Sign]", "sign bind data start");
            try {
                Result.Application application = Result.Companion;
                WalletBindApiService walletBindApiService = this.copydefault;
                BindNonceRequestBody bindNonceRequestBody = new BindNonceRequestBody(activity.OLrzqt(), activity.KWHzl());
                walletBindCeFiDetailsConfirmUseCase$getData$1.L$0 = this;
                walletBindCeFiDetailsConfirmUseCase$getData$1.L$1 = activity;
                walletBindCeFiDetailsConfirmUseCase$getData$1.label = 1;
                bindNonce$default = WalletBindApiService.TaskDescription.getBindNonce$default(walletBindApiService, bindNonceRequestBody, null, walletBindCeFiDetailsConfirmUseCase$getData$1, 2, null);
                if (bindNonce$default == objCopydefault) {
                    return objCopydefault;
                }
                c19333fzM = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c19333fzM = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) walletBindCeFiDetailsConfirmUseCase$getData$1.L$1;
                activity2 = (Activity) walletBindCeFiDetailsConfirmUseCase$getData$1.L$0;
                C56391yDq.AEQbTJ(bindNonce$default);
                objOLrzqt = ((Result) bindNonce$default).m7386unboximpl();
                c54837xXd = (C54837xXd) (!Result.m7383isFailureimpl(objOLrzqt) ? null : objOLrzqt);
                if (c54837xXd == null) {
                    if (c54837xXd.KWHzl() == SignStatus.Success) {
                        C19339fzS.EZpvd.OLrzqt("[Bind Sign]", "sign bind data succeed");
                        return new Application.StateListAnimator("signature=" + c54837xXd.OLrzqt() + ",chainIndex=" + c54837xXd.AEQbTJ() + ",addressType=" + c54837xXd.EZpvd() + ",accountId=" + activity2.OLrzqt() + ",walletName=" + activity2.EZpvd() + ",walletIcon=" + activity2.copydefault() + ",bindNonce=" + str);
                    }
                    C19339fzS.EZpvd.OLrzqt("[Bind Sign]", "sign bind data failed: " + c54837xXd.copydefault());
                    return new Application.Activity(c54837xXd.KWHzl().name() + c54837xXd.copydefault());
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    C19339fzS.EZpvd.OLrzqt("[Bind Sign]", "sign bind data failed: " + thM7380exceptionOrNullimpl.getMessage());
                    return new Application.Activity(thM7380exceptionOrNullimpl.getMessage());
                }
                return new Application.Activity(null);
            }
            activity = (Activity) walletBindCeFiDetailsConfirmUseCase$getData$1.L$1;
            c19333fzM = (C19333fzM) walletBindCeFiDetailsConfirmUseCase$getData$1.L$0;
            try {
                C56391yDq.AEQbTJ(bindNonce$default);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((BindNonceResponseBody) ((ResponseData) bindNonce$default).getData());
        BindNonceResponseBody bindNonceResponseBody = (BindNonceResponseBody) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        java.lang.String nonce = bindNonceResponseBody != null ? bindNonceResponseBody.getNonce() : null;
        if (nonce == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) nonce)) {
            java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            java.lang.String message = thM7380exceptionOrNullimpl2 != null ? thM7380exceptionOrNullimpl2.getMessage() : null;
            C19339fzS.EZpvd.OLrzqt("[UnBind Wallet]", "get unbind nonce error:" + message);
            return new Application.Activity(message);
        }
        C54834xXa c54834xXa = new C54834xXa(activity.OLrzqt(), activity.KWHzl() + activity.OLrzqt() + nonce);
        InterfaceC54824xWr interfaceC54824xWr = c19333fzM.EZpvd;
        androidx.fragment.app.FragmentManager fragmentManagerAEQbTJ = activity.AEQbTJ();
        walletBindCeFiDetailsConfirmUseCase$getData$1.L$0 = activity;
        walletBindCeFiDetailsConfirmUseCase$getData$1.L$1 = nonce;
        walletBindCeFiDetailsConfirmUseCase$getData$1.label = 2;
        objOLrzqt = interfaceC54824xWr.OLrzqt(fragmentManagerAEQbTJ, c54834xXa, walletBindCeFiDetailsConfirmUseCase$getData$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        activity2 = activity;
        str = nonce;
        c54837xXd = (C54837xXd) (!Result.m7383isFailureimpl(objOLrzqt) ? null : objOLrzqt);
        if (c54837xXd == null) {
        }
    }
}
