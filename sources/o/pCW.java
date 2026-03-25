package o;

import androidx.lifecycle.AndroidViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pCW extends AndroidViewModel {
    public oLU AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oLU OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pCW(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = new oLU(null, null, null, false, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 4194303, null);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.OLrzqt(str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.copydefault(str);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.EZpvd(str);
    }

    public final void AEQbTJ(boolean z) {
        this.AEQbTJ.AEQbTJ(z);
    }

    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.AEQbTJ(str);
    }

    public final void fetchVPNInfo(int i) {
        oLU olu = this.AEQbTJ;
        olu.isConnected(olu.fIwbmz() + i);
    }

    public final void KWHzl(int i) {
        oLU olu = this.AEQbTJ;
        olu.AEQbTJ(olu.copydefault() + i);
    }

    public final void AkhnZx(int i) {
        oLU olu = this.AEQbTJ;
        olu.values(olu.fARcdN() + i);
    }

    public final void DbNXlk(int i) {
        oLU olu = this.AEQbTJ;
        olu.AkhnZx(olu.fJNWhG() + i);
    }

    public final void isConnected(int i) {
        oLU olu = this.AEQbTJ;
        olu.DbNXlk(olu.AuCTel() + i);
    }

    public final void OLrzqt(int i) {
        oLU olu = this.AEQbTJ;
        olu.copydefault(olu.KWHzl() + i);
    }

    public final void AuCTel(int i) {
        oLU olu = this.AEQbTJ;
        olu.ejfBZ(olu.iwGUEr() + i);
    }

    public final void values(int i) {
        oLU olu = this.AEQbTJ;
        olu.fetchVPNInfo(olu.ejfBZ() + i);
    }

    public final void djBIcL(int i) {
        oLU olu = this.AEQbTJ;
        olu.AhwBna(olu.DbNXlk() + i);
    }

    public final void AYXKKw(int i) {
        oLU olu = this.AEQbTJ;
        olu.djBIcL(olu.fetchVPNInfo() + i);
    }

    public final void valueOf(int i) {
        oLU olu = this.AEQbTJ;
        olu.AYXKKw(olu.gEmmrt() + i);
    }

    public final void AhwBna(int i) {
        oLU olu = this.AEQbTJ;
        olu.valueOf(olu.AYXKKw() + i);
    }

    public final void EZpvd(int i) {
        oLU olu = this.AEQbTJ;
        olu.KWHzl(olu.AEQbTJ() + i);
    }

    public final void AEQbTJ(int i) {
        oLU olu = this.AEQbTJ;
        olu.EZpvd(olu.djBIcL() + i);
    }

    public final void copydefault(int i) {
        oLU olu = this.AEQbTJ;
        olu.OLrzqt(olu.AhwBna() + i);
    }

    public final void gEmmrt(int i) {
        oLU olu = this.AEQbTJ;
        olu.gEmmrt(olu.valueOf() + i);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return;
        }
        int iAhwBna = C33129mqd.AhwBna(this.AEQbTJ.values().get(str)) + 1;
        this.AEQbTJ.values().put(str, java.lang.String.valueOf(iAhwBna));
        pUU.OLrzqt("increase by click " + str + ", result is " + iAhwBna);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.hUfVAv)) ? "main_start" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.gkJEwt)) ? "task_call_method" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.hdBMmm)) ? "isAppDebuggable" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.DGOPHZ)) ? "isAppTampered" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.finit)) ? "isApplicationHooked" : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C33070mpX.AYXKKw(C35964oKf.Fragment.fZBcTu)) ? "isCertificateTampered" : "txType";
    }

    public final java.lang.String copydefault(java.lang.Integer num) {
        return (num != null && num.intValue() == 0) ? "isDeviceRooted" : (num != null && num.intValue() == 1) ? "isFileTampered" : (num != null && num.intValue() == 2) ? "isMemoryTampered" : (num != null && num.intValue() == 3) ? "isRunningInEmulator" : "";
    }
}
