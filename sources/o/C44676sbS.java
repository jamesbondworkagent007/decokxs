package o;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.okinc.business.appupdate.config.AppUpdateConfigKey;
import com.okinc.modular.deeplinkv2.LinkSource;
import com.okinc.okcomponents.feature.okwalletdefi.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C43658rtT;
import o.C44677sbT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44676sbS extends C32489meZ {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String getFieldNames() {
        return "web3";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C32489meZ, o.InterfaceC32484meU
    public java.lang.String AEQbTJ() {
        return "wallet";
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public InterfaceC44099sDh AhwBna() {
        return null;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean AuCTel() {
        return false;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public int DbNXlk() {
        return BuildConfig.VERSION_CODE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C32489meZ, o.InterfaceC32484meU
    public java.lang.String EZpvd() {
        return "WALLET";
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean KWHzl() {
        return false;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean OLrzqt() {
        return false;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean copydefault() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C32489meZ, o.InterfaceC32484meU
    public java.lang.String djBIcL() {
        return "gp";
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean fARcdN() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C32489meZ, o.InterfaceC32484meU
    public java.lang.String fIwbmz() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean fJNWhG() {
        return false;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean fetchVPNInfo() {
        return true;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean gEmmrt() {
        return true;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean isConnected() {
        return true;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public void iwGUEr() {
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean valueOf() {
        return false;
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public boolean values() {
        return false;
    }

    public C44676sbS() {
        super(null, null, 0, false, null, null, false, false, false, null, false, false, false, false, false, false, false, false, null, null, null, 2097151, null);
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public java.util.Map<java.lang.String, java.lang.Integer> AkhnZx() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(AppUpdateConfigKey.KEY_APP_LOGO, java.lang.Integer.valueOf(C44677sbT.ActionBar.EZpvd)), C56390yDp.OLrzqt("NOTIFY_SMALL_ICON", java.lang.Integer.valueOf(C44677sbT.ActionBar.EZpvd)), C56390yDp.OLrzqt("NOTIFY_SMALL_ICON2", java.lang.Integer.valueOf(C44677sbT.ActionBar.EZpvd)));
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public void EZpvd(@NotNull android.content.Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(glide, "");
        Intrinsics.checkNotNullParameter(registry, "");
        registry.OLrzqt(java.lang.String.class, android.graphics.Bitmap.class, new C43658rtT.TaskDescription());
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public void copydefault(@NotNull AppCompatActivity appCompatActivity, @NotNull java.lang.String str, @NotNull LinkSource linkSource) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkSource, "");
        ((pKD) C43251rlk.copydefault(pKD.class)).EZpvd(appCompatActivity, str, linkSource);
    }

    @Override // o.C32489meZ, o.InterfaceC32484meU
    public void uzCIH() {
        C32924mmk.KWHzl.copydefault(new InterfaceC32925mml() { // from class: o.sbV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC32925mml
            public final java.lang.String OLrzqt() {
                return C44676sbS.getFieldNames();
            }
        });
    }
}
