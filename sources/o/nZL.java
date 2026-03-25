package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.okimcore.model.remote.PaidGroupTransactionHistoryDetail;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes18.dex */
public final class nZL {

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionStatus.values().length];
            try {
                iArr[TransactionStatus.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionStatus.PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionStatus.FROZEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final nZM OLrzqt(@NotNull PaidGroupTransactionHistoryDetail paidGroupTransactionHistoryDetail, java.lang.String str) {
        Intrinsics.checkNotNullParameter(paidGroupTransactionHistoryDetail, "");
        return new nZM(paidGroupTransactionHistoryDetail.getTransactionId(), paidGroupTransactionHistoryDetail.getAmount(), paidGroupTransactionHistoryDetail.getDecimalPoint(), paidGroupTransactionHistoryDetail.getCurrencySymbol(), paidGroupTransactionHistoryDetail.getNickname(), paidGroupTransactionHistoryDetail.getUpdateTime(), paidGroupTransactionHistoryDetail.getTransactionStatus(), str, paidGroupTransactionHistoryDetail.getPaymentTime());
    }

    public static final int AEQbTJ(@NotNull nZM nzm) {
        Intrinsics.checkNotNullParameter(nzm, "");
        TransactionStatus transactionStatusGEmmrt = nzm.gEmmrt();
        int i = transactionStatusGEmmrt == null ? -1 : Application.AEQbTJ[transactionStatusGEmmrt.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.DQzvGN : C52761wXj.Activity.gdmIOq : C52761wXj.Activity.DcMfJK;
    }

    public static final java.lang.String KWHzl(@NotNull nZM nzm) {
        Intrinsics.checkNotNullParameter(nzm, "");
        return pTA.formatDate$default(new Date(C33129mqd.valueOf(nzm.djBIcL())), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
    }

    public static final java.lang.String EZpvd(@NotNull nZM nzm) {
        Intrinsics.checkNotNullParameter(nzm, "");
        TransactionStatus transactionStatusGEmmrt = nzm.gEmmrt();
        int i = transactionStatusGEmmrt == null ? -1 : Application.AEQbTJ[transactionStatusGEmmrt.ordinal()];
        if (i == 1) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.QhYuFg);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.fJNWhG);
        }
        if (i != 3) {
            return i != 4 ? "" : C33070mpX.AYXKKw(C35399nuc.LoaderManager.gqESXP);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.dtVxwd);
    }

    public static final java.lang.String copydefault(@NotNull nZM nzm) {
        Intrinsics.checkNotNullParameter(nzm, "");
        TransactionStatus transactionStatusGEmmrt = nzm.gEmmrt();
        return (transactionStatusGEmmrt != null && Application.AEQbTJ[transactionStatusGEmmrt.ordinal()] == 4) ? "-" : Marker.ANY_NON_NULL_MARKER;
    }
}
