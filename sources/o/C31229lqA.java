package o;

import com.okinc.business.web3pay.lib.features.account.data.model.AccountInfoApiModel;
import com.okinc.business.web3pay.lib.features.account.model.AccountInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31229lqA {
    public static final AccountInfo EZpvd(@NotNull AccountInfoApiModel accountInfoApiModel) {
        AccountInfo.Status status;
        Intrinsics.checkNotNullParameter(accountInfoApiModel, "");
        AccountInfo.Status[] statusArrValues = AccountInfo.Status.values();
        int length = statusArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                status = null;
                break;
            }
            status = statusArrValues[i];
            if (status.getValue() == accountInfoApiModel.getStatus()) {
                break;
            }
            i++;
        }
        return new AccountInfo(status, accountInfoApiModel.getAccountId(), accountInfoApiModel.getAddressList());
    }
}
