package o;

import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC30149lNs extends AbstractC30156lNz {
    public boolean KWHzl;

    @Override // o.AbstractC30156lNz
    public boolean AYXKKw() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public boolean AhwBna() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public boolean AkhnZx() {
        return true;
    }

    @Override // o.AbstractC30156lNz
    public void AuCTel() {
    }

    @Override // o.AbstractC30156lNz
    public boolean DbNXlk() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30154lNx
    public void EZpvd(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30154lNx
    public boolean KWHzl() {
        return this.KWHzl;
    }

    @Override // o.AbstractC30156lNz
    public boolean ejfBZ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30156lNz
    public java.lang.String fARcdN() {
        return "";
    }

    @Override // o.AbstractC30156lNz
    public boolean fIwbmz() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public void fJNWhG() {
    }

    @Override // o.AbstractC30156lNz
    public boolean fetchVPNInfo() {
        return true;
    }

    @Override // o.AbstractC30156lNz
    public boolean gEmmrt() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public boolean isConnected() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public boolean valueOf() {
        return true;
    }

    @Override // o.AbstractC30156lNz
    public boolean values() {
        return false;
    }

    @Override // o.AbstractC30156lNz
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt() {
        return new kotlin.Pair<>(iwGUEr().getIconUrl(), iwGUEr().getIconUrlNight());
    }

    @Override // o.AbstractC30156lNz
    public boolean djBIcL() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        return C33129mqd.OLrzqt((java.lang.CharSequence) (account != null ? account.getDescription() : null));
    }

    public boolean EZpvd() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        if (account != null) {
            return C31662lzj.copydefault(account);
        }
        return false;
    }

    @Override // o.AbstractC30156lNz
    public java.lang.String AEQbTJ() {
        java.lang.String description;
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        return (account == null || (description = account.getDescription()) == null) ? "" : description;
    }

    @Override // o.AbstractC30156lNz
    public android.text.SpannableStringBuilder copydefault() {
        java.lang.String strUzCIH = uzCIH();
        java.lang.String fieldNames = getFieldNames();
        android.text.SpannableString spannableString = new android.text.SpannableString(strUzCIH);
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(c43246rlf.valueOf(), C33492mxV.OLrzqt() ? C31351lsQ.PendingIntent.copydefault : C31351lsQ.PendingIntent.EZpvd), 0, strUzCIH != null ? strUzCIH.length() : 0, 33);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(fieldNames);
        spannableString2.setSpan(new android.text.style.TextAppearanceSpan(c43246rlf.valueOf(), C33492mxV.OLrzqt() ? C31351lsQ.PendingIntent.AEQbTJ : C31351lsQ.PendingIntent.KWHzl), 0, fieldNames != null ? fieldNames.length() : 0, 33);
        android.text.SpannableStringBuilder spannableStringBuilderAppend = new android.text.SpannableStringBuilder().append((java.lang.CharSequence) spannableString).append((java.lang.CharSequence) " ").append((java.lang.CharSequence) spannableString2);
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilderAppend, "");
        return spannableStringBuilderAppend;
    }
}
