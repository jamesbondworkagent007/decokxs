package o;

import androidx.appcompat.app.AppCompatActivity;
import com.okinc.business.defi.wallet.home.QuickResetWalletManager$handleQuickReset$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eTc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C15729eTc {
    public static final int EZpvd;
    public static final C17237eyx OLrzqt;
    public static final C15729eTc copydefault = new C15729eTc();

    private C15729eTc() {
    }

    static {
        C12827cuN.Application application = C12827cuN.Companion;
        OLrzqt = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        EZpvd = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        QuickResetWalletManager$handleQuickReset$1 quickResetWalletManager$handleQuickReset$1;
        AppCompatActivity appCompatActivity;
        if (continuation instanceof QuickResetWalletManager$handleQuickReset$1) {
            quickResetWalletManager$handleQuickReset$1 = (QuickResetWalletManager$handleQuickReset$1) continuation;
            int i = quickResetWalletManager$handleQuickReset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickResetWalletManager$handleQuickReset$1.label = i - Integer.MIN_VALUE;
            } else {
                quickResetWalletManager$handleQuickReset$1 = new QuickResetWalletManager$handleQuickReset$1(this, continuation);
            }
        }
        java.lang.Object objAwait = quickResetWalletManager$handleQuickReset$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = quickResetWalletManager$handleQuickReset$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                pUU.KWHzl("QuickResetWalletManager", "start to handle quick reset");
                mNP mnp = mNP.AEQbTJ;
                if (!mnp.copydefault()) {
                    pUU.KWHzl("QuickResetWalletManager", "not E2E env, skip reset");
                    function0.invoke();
                    return Unit.INSTANCE;
                }
                java.lang.String strOLrzqt = mnp.OLrzqt("IS_Clear_Wallet");
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                pUU.KWHzl("QuickResetWalletManager", "handleQuickReset isResetWallet=" + strOLrzqt);
                java.lang.String strOLrzqt2 = mnp.OLrzqt("OK_Import_Wallet");
                if (strOLrzqt2 == null) {
                    strOLrzqt2 = "";
                }
                java.lang.String strOLrzqt3 = mnp.OLrzqt("OK_Wallet_MNE");
                if (strOLrzqt3 == null) {
                    strOLrzqt3 = "";
                }
                java.lang.String strAEQbTJ = C54909xZv.OLrzqt.AEQbTJ(C43246rlf.OLrzqt.valueOf(), strOLrzqt3);
                java.lang.String strOLrzqt4 = mnp.OLrzqt("OK_Wallet_Password");
                java.lang.String str = strOLrzqt4 != null ? strOLrzqt4 : "";
                if (C59449zhJ.gEmmrt(strOLrzqt2, "true", true) && strAEQbTJ.length() > 0 && str.length() > 0) {
                    pUU.KWHzl("QuickResetWalletManager", "change isResetWallet value");
                    strOLrzqt = "true";
                }
                if (!C59449zhJ.gEmmrt(strOLrzqt, "true", true)) {
                    function0.invoke();
                    return Unit.INSTANCE;
                }
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                AppCompatActivity appCompatActivity2 = activityAEQbTJ instanceof AppCompatActivity ? (AppCompatActivity) activityAEQbTJ : null;
                if (appCompatActivity2 == null) {
                    function1.invoke(new java.lang.IllegalStateException("Current activity is null or not AppCompatActivity: " + activityAEQbTJ));
                    return Unit.INSTANCE;
                }
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAkhnZx = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AkhnZx();
                quickResetWalletManager$handleQuickReset$1.L$0 = function0;
                quickResetWalletManager$handleQuickReset$1.L$1 = function1;
                quickResetWalletManager$handleQuickReset$1.L$2 = appCompatActivity2;
                quickResetWalletManager$handleQuickReset$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtAkhnZx, quickResetWalletManager$handleQuickReset$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                appCompatActivity = appCompatActivity2;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AppCompatActivity appCompatActivity3 = (AppCompatActivity) quickResetWalletManager$handleQuickReset$1.L$2;
                Function0<Unit> function02 = (Function0) quickResetWalletManager$handleQuickReset$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                appCompatActivity = appCompatActivity3;
                function0 = function02;
            }
            if (C33129mqd.AEQbTJ((java.lang.Integer) objAwait, C56443yFo.AEQbTJ(0))) {
                OLrzqt.AEQbTJ(new C17260ezT(appCompatActivity, "QuickResetWalletManager", false, null, 8, null));
            } else {
                pUU.KWHzl("QuickResetWalletManager", "no wallet found, skip reset");
                function0.invoke();
            }
        } catch (java.lang.Throwable th) {
            function1.invoke(th);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eTc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object handleQuickReset$default(C15729eTc c15729eTc, Function0 function0, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.eTa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C15729eTc.KWHzl((java.lang.Throwable) obj2);
                }
            };
        }
        return c15729eTc.KWHzl(function0, function1, continuation);
    }
}
