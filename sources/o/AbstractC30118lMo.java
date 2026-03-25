package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC30118lMo implements InterfaceC30115lMl {
    public boolean AEQbTJ;
    public final PaymentMethod KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public java.lang.String AEQbTJ() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public java.lang.String AhwBna() {
        return "";
    }

    @Override // o.InterfaceC30115lMl
    public boolean AuCTel() {
        return false;
    }

    @Override // o.InterfaceC30115lMl
    public java.lang.String EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public int KWHzl() {
        return C52761wXj.Activity.fdOvFl;
    }

    @Override // o.InterfaceC30115lMl
    public java.lang.String copydefault() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public java.lang.String djBIcL() {
        return "";
    }

    @Override // o.InterfaceC30115lMl
    public boolean ejfBZ() {
        return false;
    }

    @Override // o.InterfaceC30115lMl
    public boolean fARcdN() {
        return false;
    }

    @Override // o.InterfaceC30115lMl
    public boolean fIwbmz() {
        return true;
    }

    @Override // o.InterfaceC30115lMl
    public boolean fJNWhG() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public java.lang.String fetchVPNInfo() {
        return "";
    }

    @Override // o.InterfaceC30115lMl
    public boolean getFieldNames() {
        return true;
    }

    @Override // o.InterfaceC30115lMl
    public boolean getNewProxyInstance() {
        return false;
    }

    @Override // o.InterfaceC30115lMl
    public boolean hDKMBd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public boolean isConnected() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC30115lMl
    public boolean iwGUEr() {
        return false;
    }

    @Override // o.InterfaceC30115lMl
    public boolean uzCIH() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30115lMl
    public PaymentMethod values() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC30115lMl
    public boolean zLjUOn() {
        return true;
    }

    public AbstractC30118lMo(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        this.KWHzl = paymentMethod;
    }

    @Override // o.InterfaceC30115lMl
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt() {
        return new kotlin.Pair<>(values().getIconUrl(), values().getIconUrlNight());
    }

    public java.lang.String gEmmrt() {
        return lNB.KWHzl(values());
    }

    public java.lang.String valueOf() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account == null) {
            return null;
        }
        java.lang.String accountNumber = account.getAccountNumber();
        if (accountNumber.length() < 8) {
            return accountNumber;
        }
        int length = (accountNumber.length() - 4) / 2;
        java.lang.String strSubstring = accountNumber.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = accountNumber.substring(length + 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strSubstring + "****" + strSubstring2;
    }

    @Override // o.InterfaceC30115lMl
    public android.text.SpannableStringBuilder AYXKKw() {
        return new android.text.SpannableStringBuilder("");
    }

    @Override // o.InterfaceC30115lMl
    public boolean AkhnZx() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account != null) {
            return C31662lzj.OLrzqt(account);
        }
        return false;
    }

    public boolean DbNXlk() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account != null) {
            return C31662lzj.copydefault(account);
        }
        return false;
    }
}
