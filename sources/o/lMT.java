package o;

import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class lMT implements InterfaceC30133lNc {
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30133lNc
    public boolean AYXKKw() {
        return this.copydefault;
    }

    @Override // o.InterfaceC30133lNc
    public boolean AhwBna() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public boolean AkhnZx() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public boolean DbNXlk() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30133lNc
    public void KWHzl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30133lNc
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.InterfaceC30133lNc
    public boolean fJNWhG() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public boolean fetchVPNInfo() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public boolean gEmmrt() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public boolean isConnected() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public java.lang.String valueOf() {
        return null;
    }

    @Override // o.InterfaceC30133lNc
    public boolean values() {
        return false;
    }

    @Override // o.InterfaceC30133lNc
    public kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ() {
        if (fARcdN().getChangeDisplay()) {
            return new kotlin.Pair<>(fARcdN().getDisplayIconUrl(), fARcdN().getDisplayIconUrlNight());
        }
        return new kotlin.Pair<>(fARcdN().getIconUrl(), fARcdN().getIconUrlNight());
    }

    @Override // o.InterfaceC30133lNc
    public java.lang.String djBIcL() {
        return fARcdN().getChangeDisplay() ? fARcdN().getDisplayName() : fARcdN().getDepositName();
    }

    @Override // o.InterfaceC30133lNc
    public java.lang.String EZpvd() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.OFhtUX);
    }

    @Override // o.InterfaceC30133lNc
    public android.text.SpannableString copydefault() {
        return new android.text.SpannableString(KWHzl());
    }
}
