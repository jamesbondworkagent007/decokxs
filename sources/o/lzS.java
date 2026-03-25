package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lzS extends ViewModel {
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public Function0<Unit> AYXKKw;
    public final LiveData<java.lang.Boolean> AhwBna;
    public final MutableLiveData<java.lang.String> EZpvd;
    public final MutableLiveData<java.lang.String> KWHzl;
    public final MutableLiveData<java.lang.Boolean> OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public final LiveData<java.lang.String> djBIcL;
    public final LiveData<java.lang.Boolean> gEmmrt;
    public Function0<Unit> isConnected;
    public final LiveData<java.lang.Boolean> valueOf;
    public final LiveData<java.lang.String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    public lzS() {
        MutableLiveData<java.lang.String> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.djBIcL = mutableLiveData;
        MutableLiveData<java.lang.String> mutableLiveData2 = new MutableLiveData<>();
        this.EZpvd = mutableLiveData2;
        this.values = mutableLiveData2;
        MutableLiveData<java.lang.Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData3;
        this.AhwBna = mutableLiveData3;
        MutableLiveData<java.lang.Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData4;
        this.gEmmrt = mutableLiveData4;
        MutableLiveData<java.lang.Boolean> mutableLiveData5 = new MutableLiveData<>();
        this.copydefault = mutableLiveData5;
        this.valueOf = mutableLiveData5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.lzS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initialize$default(lzS lzs, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        if ((i & 32) != 0) {
            function0 = null;
        }
        if ((i & 64) != 0) {
            function02 = null;
        }
        lzs.OLrzqt(str, str2, z, z2, z3, function0, function02);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02) {
        if (str != null) {
            OLrzqt(str);
        }
        if (str2 != null) {
            KWHzl(str2);
        }
        EZpvd(z);
        AEQbTJ(z2);
        OLrzqt(z3);
        copydefault(function0);
        OLrzqt(function02);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(str);
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void EZpvd(boolean z) {
        this.AEQbTJ.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void OLrzqt(boolean z) {
        this.copydefault.setValue(java.lang.Boolean.valueOf(z));
    }
}
