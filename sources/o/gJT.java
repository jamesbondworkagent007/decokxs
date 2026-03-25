package o;

import com.okinc.business.defi.biz.net.bean.WalletCeFiBindQrResponse;
import com.okinc.business.defi.wallet.walletaddressbinding.repository.CeFiBindResultSyncStatus;
import com.okinc.business.defi.wallet.walletaddressbinding.repository.WalletAddressBindRepositoryImpl$getCefiBindQrData$1;
import com.okinc.business.defi.wallet.walletaddressbinding.repository.WalletAddressBindRepositoryImpl$syncCefiBindStatus$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gJT implements gJS {
    public final C13934dbu EZpvd;
    public final C12827cuN copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public gJT(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.EZpvd = c13934dbu;
        this.copydefault = c12827cuN;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gJS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<gJQ>> continuation) throws java.lang.Throwable {
        WalletAddressBindRepositoryImpl$getCefiBindQrData$1 walletAddressBindRepositoryImpl$getCefiBindQrData$1;
        if (continuation instanceof WalletAddressBindRepositoryImpl$getCefiBindQrData$1) {
            walletAddressBindRepositoryImpl$getCefiBindQrData$1 = (WalletAddressBindRepositoryImpl$getCefiBindQrData$1) continuation;
            int i = walletAddressBindRepositoryImpl$getCefiBindQrData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAddressBindRepositoryImpl$getCefiBindQrData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAddressBindRepositoryImpl$getCefiBindQrData$1 = new WalletAddressBindRepositoryImpl$getCefiBindQrData$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletAddressBindRepositoryImpl$getCefiBindQrData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletAddressBindRepositoryImpl$getCefiBindQrData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = this.EZpvd;
                walletAddressBindRepositoryImpl$getCefiBindQrData$1.label = 1;
                objOLrzqt = c13934dbu.OLrzqt(str, str2, str3, walletAddressBindRepositoryImpl$getCefiBindQrData$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            WalletCeFiBindQrResponse walletCeFiBindQrResponse = (WalletCeFiBindQrResponse) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
            return Result.m7377constructorimpl(new gJQ(walletCeFiBindQrResponse.getDeepLink(), walletCeFiBindQrResponse.getUniversalLink()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.gJS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CeFiBindResultSyncStatus ceFiBindResultSyncStatus, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        WalletAddressBindRepositoryImpl$syncCefiBindStatus$1 walletAddressBindRepositoryImpl$syncCefiBindStatus$1;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        gJT gjt;
        if (continuation instanceof WalletAddressBindRepositoryImpl$syncCefiBindStatus$1) {
            walletAddressBindRepositoryImpl$syncCefiBindStatus$1 = (WalletAddressBindRepositoryImpl$syncCefiBindStatus$1) continuation;
            int i = walletAddressBindRepositoryImpl$syncCefiBindStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAddressBindRepositoryImpl$syncCefiBindStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAddressBindRepositoryImpl$syncCefiBindStatus$1 = new WalletAddressBindRepositoryImpl$syncCefiBindStatus$1(this, continuation);
            }
        }
        WalletAddressBindRepositoryImpl$syncCefiBindStatus$1 walletAddressBindRepositoryImpl$syncCefiBindStatus$12 = walletAddressBindRepositoryImpl$syncCefiBindStatus$1;
        java.lang.Object objAwait = walletAddressBindRepositoryImpl$syncCefiBindStatus$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletAddressBindRepositoryImpl$syncCefiBindStatus$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.copydefault.copydefault(true);
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$0 = str;
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$1 = str2;
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$2 = ceFiBindResultSyncStatus;
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$3 = str3;
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$4 = this;
                walletAddressBindRepositoryImpl$syncCefiBindStatus$12.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, walletAddressBindRepositoryImpl$syncCefiBindStatus$12);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str;
                str5 = str2;
                str6 = str3;
                gjt = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objAwait);
                    ((AbstractC43419rot) objAwait).AEQbTJ();
                    return Result.m7377constructorimpl(Unit.INSTANCE);
                }
                gjt = (gJT) walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$4;
                java.lang.String str7 = (java.lang.String) walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$3;
                ceFiBindResultSyncStatus = (CeFiBindResultSyncStatus) walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$2;
                java.lang.String str8 = (java.lang.String) walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$1;
                java.lang.String str9 = (java.lang.String) walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
                str5 = str8;
                str6 = str7;
                str4 = str9;
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
            C13934dbu c13934dbu = gjt.EZpvd;
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
            java.lang.String value = ceFiBindResultSyncStatus.getValue();
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$0 = null;
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$1 = null;
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$2 = null;
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$3 = null;
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.L$4 = null;
            walletAddressBindRepositoryImpl$syncCefiBindStatus$12.label = 2;
            objAwait = c13934dbu.copydefault(strDbNXlk, strUSBtdM, str4, str5, value, str6, walletAddressBindRepositoryImpl$syncCefiBindStatus$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            ((AbstractC43419rot) objAwait).AEQbTJ();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gJT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ gJS getInstance$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return stateListAnimator.AEQbTJ(context);
        }

        public final gJS AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).zLjUOn();
        }
    }
}
