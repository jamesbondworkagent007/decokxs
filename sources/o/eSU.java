package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.home.QuickImportManager$handleQuickImport$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C11010bzJ;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class eSU {
    public static final eSU EZpvd = new eSU();
    public static final int KWHzl = 8;
    public static InterfaceC58217yxC copydefault;

    private eSU() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        QuickImportManager$handleQuickImport$1 quickImportManager$handleQuickImport$1;
        java.lang.String strAEQbTJ;
        java.lang.String strOLrzqt;
        eSU esu;
        Function1<? super java.lang.Throwable, Unit> function12;
        android.app.Activity activityAEQbTJ;
        java.lang.String str;
        java.lang.String str2;
        eSU esu2;
        FragmentActivity fragmentActivity;
        if (continuation instanceof QuickImportManager$handleQuickImport$1) {
            quickImportManager$handleQuickImport$1 = (QuickImportManager$handleQuickImport$1) continuation;
            int i = quickImportManager$handleQuickImport$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickImportManager$handleQuickImport$1.label = i - Integer.MIN_VALUE;
            } else {
                quickImportManager$handleQuickImport$1 = new QuickImportManager$handleQuickImport$1(this, continuation);
            }
        }
        java.lang.Object obj = quickImportManager$handleQuickImport$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = quickImportManager$handleQuickImport$1.label;
        try {
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("QuickImportManager", "handleQuickImport failed msg=" + th.getMessage(), th);
            function12.invoke(th);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("QuickImportManager", "start to handle quick import");
            mNP mnp = mNP.AEQbTJ;
            if (!mnp.copydefault()) {
                pUU.KWHzl("QuickImportManager", "not E2E env, skip import");
                function0.invoke();
                return Unit.INSTANCE;
            }
            java.lang.String strOLrzqt2 = mnp.OLrzqt("OK_Import_Wallet");
            if (strOLrzqt2 == null) {
                strOLrzqt2 = "";
            }
            java.lang.String strOLrzqt3 = mnp.OLrzqt("OK_Wallet_MNE");
            if (strOLrzqt3 == null) {
                strOLrzqt3 = "";
            }
            strAEQbTJ = C54909xZv.OLrzqt.AEQbTJ(C43246rlf.OLrzqt.valueOf(), strOLrzqt3);
            strOLrzqt = mnp.OLrzqt("OK_Wallet_Password");
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            pUU.KWHzl("QuickImportManager", "isImportWallet=" + strOLrzqt2 + ", hasMnemonic=" + (strAEQbTJ.length() > 0) + ", hasPassword=" + (strOLrzqt.length() > 0));
            if (!C59449zhJ.gEmmrt(strOLrzqt2, "true", true) || strAEQbTJ.length() == 0 || strOLrzqt.length() == 0) {
                function0.invoke();
                return Unit.INSTANCE;
            }
            quickImportManager$handleQuickImport$1.L$0 = this;
            quickImportManager$handleQuickImport$1.L$1 = function1;
            quickImportManager$handleQuickImport$1.L$2 = strAEQbTJ;
            quickImportManager$handleQuickImport$1.L$3 = strOLrzqt;
            quickImportManager$handleQuickImport$1.label = 1;
            if (DelayKt.delay(1000L, quickImportManager$handleQuickImport$1) == objCopydefault) {
                return objCopydefault;
            }
            esu = this;
            function12 = function1;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fragmentActivity = (FragmentActivity) quickImportManager$handleQuickImport$1.L$5;
                activityAEQbTJ = (android.app.Activity) quickImportManager$handleQuickImport$1.L$4;
                java.lang.String str3 = (java.lang.String) quickImportManager$handleQuickImport$1.L$3;
                java.lang.String str4 = (java.lang.String) quickImportManager$handleQuickImport$1.L$2;
                function12 = (Function1) quickImportManager$handleQuickImport$1.L$1;
                eSU esu3 = (eSU) quickImportManager$handleQuickImport$1.L$0;
                C56391yDq.AEQbTJ(obj);
                esu2 = esu3;
                str = str3;
                str2 = str4;
                pUU.KWHzl("QuickImportManager", "handleQuickImport savePassword success");
                C14471dmA.EZpvd.EZpvd();
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                esu2.KWHzl(str, str2, supportFragmentManager, new C14459dlp(activityAEQbTJ, false, 2, null), function12);
                return Unit.INSTANCE;
            }
            java.lang.String str5 = (java.lang.String) quickImportManager$handleQuickImport$1.L$3;
            strAEQbTJ = (java.lang.String) quickImportManager$handleQuickImport$1.L$2;
            function12 = (Function1) quickImportManager$handleQuickImport$1.L$1;
            esu = (eSU) quickImportManager$handleQuickImport$1.L$0;
            C56391yDq.AEQbTJ(obj);
            strOLrzqt = str5;
        }
        activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        FragmentActivity fragmentActivity2 = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        if (fragmentActivity2 == null) {
            function12.invoke(new java.lang.IllegalStateException("Current activity is null or not FragmentActivity: " + activityAEQbTJ));
            return Unit.INSTANCE;
        }
        AbstractC58260yxt<Unit> abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(strOLrzqt, true, "set");
        quickImportManager$handleQuickImport$1.L$0 = esu;
        quickImportManager$handleQuickImport$1.L$1 = function12;
        quickImportManager$handleQuickImport$1.L$2 = strAEQbTJ;
        quickImportManager$handleQuickImport$1.L$3 = strOLrzqt;
        quickImportManager$handleQuickImport$1.L$4 = activityAEQbTJ;
        quickImportManager$handleQuickImport$1.L$5 = fragmentActivity2;
        quickImportManager$handleQuickImport$1.label = 2;
        if (RxAwaitKt.await(abstractC58260yxtAEQbTJ, quickImportManager$handleQuickImport$1) == objCopydefault) {
            return objCopydefault;
        }
        str = strOLrzqt;
        str2 = strAEQbTJ;
        esu2 = esu;
        fragmentActivity = fragmentActivity2;
        pUU.KWHzl("QuickImportManager", "handleQuickImport savePassword success");
        C14471dmA.EZpvd.EZpvd();
        androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        esu2.KWHzl(str, str2, supportFragmentManager2, new C14459dlp(activityAEQbTJ, false, 2, null), function12);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eSU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object handleQuickImport$default(eSU esu, Function0 function0, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.eSX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eSU.KWHzl((java.lang.Throwable) obj2);
                }
            };
        }
        return esu.KWHzl(function0, function1, continuation);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, androidx.fragment.app.FragmentManager fragmentManager, InterfaceC14457dln interfaceC14457dln, final Function1<? super java.lang.Throwable, Unit> function1) {
        InterfaceC58217yxC interfaceC58217yxCEZpvd;
        InterfaceC58217yxC interfaceC58217yxC = copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (xYS.copydefault.copydefault(str2).getType() == 1) {
            interfaceC58217yxCEZpvd = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).copydefault(str, str2, false, false, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.eSV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eSU.AEQbTJ(function1, (AbstractC12782ctV) obj);
                }
            });
        } else {
            interfaceC58217yxCEZpvd = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).EZpvd(str, str2, false, false, fragmentManager, interfaceC14457dln, new Function1() { // from class: o.eSY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eSU.copydefault(function1, (AbstractC12782ctV) obj);
                }
            });
        }
        copydefault = interfaceC58217yxCEZpvd;
    }

    public static final Unit AEQbTJ(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            function1.invoke(new java.lang.IllegalStateException("handleQuickImport importTonWallet failed"));
        } else {
            pUU.KWHzl("QuickImportManager", "handleQuickImport importTonWallet success");
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            function1.invoke(new java.lang.IllegalStateException("handleQuickImport importHDWallet failed"));
        } else {
            pUU.KWHzl("QuickImportManager", "handleQuickImport importHDWallet success");
        }
        return Unit.INSTANCE;
    }
}
