package o;

import com.okinc.business.defi.wallet.walletaddressbinding.WalletCefiBindingResultBottomSheet;
import com.okinc.wallet.api.WalletCefiBindingService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJV implements InterfaceC43234rlT {
    public final java.lang.String AEQbTJ = "RedirectLinkHandlerV2";

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletCefiBindingService.WalletCefiBindingStatus.values().length];
            try {
                iArr[WalletCefiBindingService.WalletCefiBindingStatus.CANCEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletCefiBindingService.WalletCefiBindingStatus.SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletCefiBindingService.WalletCefiBindingStatus.ALREADY_BOUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        final java.lang.String string;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("status");
        if (obj != null) {
            final int iAhwBna = C33129mqd.AhwBna(obj);
            java.lang.Object obj2 = map.get("requestId");
            if (obj2 == null || (string = obj2.toString()) == null) {
                return;
            }
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: o.dJU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        dJV.copydefault(iAhwBna, string);
                    }
                }, 500L)));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault(this.AEQbTJ, "OKWallet: showCefiBindingResultPage failed: " + thM7380exceptionOrNullimpl.getMessage());
            }
        }
    }

    public static final void copydefault(int i, java.lang.String str) {
        WalletCefiBindingResultBottomSheet.CefiResultStatus cefiResultStatus;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        AbstractActivityC33041mov abstractActivityC33041mov = activityAEQbTJ instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activityAEQbTJ : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        WalletCefiBindingService.WalletCefiBindingStatus walletCefiBindingStatusAEQbTJ = WalletCefiBindingService.WalletCefiBindingStatus.Companion.AEQbTJ(i);
        int i2 = walletCefiBindingStatusAEQbTJ == null ? -1 : Activity.AEQbTJ[walletCefiBindingStatusAEQbTJ.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.CANCEL;
            } else if (i2 == 2) {
                cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.SUCCESS;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cefiResultStatus = WalletCefiBindingResultBottomSheet.CefiResultStatus.ALREADY_BOUND;
            }
            C13850daP c13850daP = C13850daP.KWHzl;
            c13850daP.KWHzl(abstractActivityC33041mov, cefiResultStatus);
            c13850daP.KWHzl(str, i);
        }
    }
}
