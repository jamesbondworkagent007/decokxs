package o;

import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.core.util.qrcode.decode.ScanType;
import com.okinc.wallet.api.bean.WalletScanInformationBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11697cXw extends AbstractC43215rlA implements InterfaceC33530myG {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return true;
    }

    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.DEFI_WALLET_ADDRESS;
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        java.lang.String address;
        InterfaceC9773bbs interfaceC9773bbs;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3)) {
            TransactionInfo transactionInfoGEmmrt = C8349bAz.OLrzqt.gEmmrt(str);
            java.lang.String text = transactionInfoGEmmrt.getText();
            java.lang.String name = transactionInfoGEmmrt.getName();
            if (transactionInfoGEmmrt.getAddress().length() == 0) {
                address = transactionInfoGEmmrt.getText();
            } else {
                address = transactionInfoGEmmrt.getAddress();
            }
            java.lang.String str2 = address;
            java.lang.String contractAddress = transactionInfoGEmmrt.getContractAddress();
            WalletScanInformationBean walletScanInformationBean = new WalletScanInformationBean(text, name, str2, contractAddress == null ? "" : contractAddress, transactionInfoGEmmrt.getAmount(), transactionInfoGEmmrt.getTokenId(), transactionInfoGEmmrt.getNetwork());
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            if (listKWHzl != null && (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
                interfaceC9773bbs.copydefault(walletScanInformationBean);
            }
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
