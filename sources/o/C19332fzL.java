package o;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.business.defi.wallet.mine.walletbind.usecase.WalletBindGetBindTokenUseCase$getData$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19332fzL extends AbstractC19325fzE<Activity, Application> {
    public final CoroutineDispatcher AEQbTJ;
    public final WalletBindApiService OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C19332fzL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull WalletBindApiService walletBindApiService) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(walletBindApiService, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = walletBindApiService;
    }

    /* JADX INFO: renamed from: o.fzL$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            return activity.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(accountId=" + this.KWHzl + ", accountName=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
        }
    }

    /* JADX INFO: renamed from: o.fzL$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            return application.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OutPut(bindingToken=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC19325fzE
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Activity activity, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        WalletBindGetBindTokenUseCase$getData$1 walletBindGetBindTokenUseCase$getData$1;
        java.lang.String bindingToken;
        if (continuation instanceof WalletBindGetBindTokenUseCase$getData$1) {
            walletBindGetBindTokenUseCase$getData$1 = (WalletBindGetBindTokenUseCase$getData$1) continuation;
            int i = walletBindGetBindTokenUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletBindGetBindTokenUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletBindGetBindTokenUseCase$getData$1 = new WalletBindGetBindTokenUseCase$getData$1(this, continuation);
            }
        }
        WalletBindGetBindTokenUseCase$getData$1 walletBindGetBindTokenUseCase$getData$12 = walletBindGetBindTokenUseCase$getData$1;
        java.lang.Object bindingToken$default = walletBindGetBindTokenUseCase$getData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletBindGetBindTokenUseCase$getData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(bindingToken$default);
            WalletBindApiService walletBindApiService = this.OLrzqt;
            GetBindingTokenRequestBody getBindingTokenRequestBody = new GetBindingTokenRequestBody(activity.OLrzqt(), activity.KWHzl());
            walletBindGetBindTokenUseCase$getData$12.label = 1;
            bindingToken$default = WalletBindApiService.TaskDescription.getBindingToken$default(walletBindApiService, getBindingTokenRequestBody, null, walletBindGetBindTokenUseCase$getData$12, 2, null);
            if (bindingToken$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(bindingToken$default);
        }
        GetBindingTokenResponseBody getBindingTokenResponseBody = (GetBindingTokenResponseBody) ((ResponseData) bindingToken$default).getData();
        if (getBindingTokenResponseBody == null || (bindingToken = getBindingTokenResponseBody.getBindingToken()) == null) {
            bindingToken = "";
        }
        return new Application(bindingToken);
    }
}
