package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.fiZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18446fiZ {

    /* JADX INFO: renamed from: o.fiZ$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.ConnectWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String EZpvd(WalletType walletType) {
        switch (StateListAnimator.KWHzl[walletType.ordinal()]) {
            case 1:
                return "HD";
            case 2:
                return "Ton";
            case 3:
                return JwtUtilsKt.DID_METHOD_KEY;
            case 4:
                return "walletConnect";
            case 5:
                return "tracking";
            case 6:
                return "hardware";
            case 7:
                return "mpc";
            case 8:
                return "aa";
            default:
                return walletType.name();
        }
    }

    public static final java.lang.String AEQbTJ(OKWBaseTransaction.TransactionType transactionType) {
        return transactionType.isTransfer() ? "sign_transaction" : transactionType.isMessage() ? "sign_message" : "sign_contract";
    }

    public static final java.lang.String KWHzl(AbstractC12782ctV abstractC12782ctV) {
        return abstractC12782ctV.sSMYrx() ? "ledger" : abstractC12782ctV.zuBGHE() ? "onekey" : abstractC12782ctV.AxsJAY() ? "keystone" : abstractC12782ctV.QwvEab().name();
    }
}
