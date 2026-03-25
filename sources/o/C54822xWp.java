package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54822xWp extends ViewModel {
    public final MutableLiveData<MarketCoinInfo> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> AYXKKw = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();
    public java.lang.String EZpvd = "insights";
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MarketCoinInfo> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> valueOf() {
        return this.copydefault;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AYXKKw.setValue(str);
        this.AhwBna.setValue(str2);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String instrumentId;
        MarketCoinInfo value = this.KWHzl.getValue();
        return (value == null || (instrumentId = value.getInstrumentId()) == null) ? "" : instrumentId;
    }

    public final java.lang.String EZpvd() {
        java.lang.String instrumentType;
        MarketCoinInfo value = this.KWHzl.getValue();
        return (value == null || (instrumentType = value.getInstrumentType()) == null) ? "" : instrumentType;
    }

    public final boolean DbNXlk() {
        MarketCoinInfo value = this.KWHzl.getValue();
        if (!Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getInstrumentType() : null), (java.lang.Object) "SPOT")) {
            MarketCoinInfo value2 = this.KWHzl.getValue();
            if (!Intrinsics.EZpvd((java.lang.Object) (value2 != null ? value2.getInstrumentType() : null), (java.lang.Object) "MARGIN")) {
                MarketCoinInfo value3 = this.KWHzl.getValue();
                if (!Intrinsics.EZpvd((java.lang.Object) (value3 != null ? value3.getInstrumentType() : null), (java.lang.Object) "SWAP")) {
                    MarketCoinInfo value4 = this.KWHzl.getValue();
                    if (!Intrinsics.EZpvd((java.lang.Object) (value4 != null ? value4.getInstrumentType() : null), (java.lang.Object) "FUTURES")) {
                        MarketCoinInfo value5 = this.KWHzl.getValue();
                        if (!Intrinsics.EZpvd((java.lang.Object) (value5 != null ? value5.getInstrumentType() : null), (java.lang.Object) "OPTION")) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public final boolean AYXKKw() {
        MarketCoinInfo value = this.KWHzl.getValue();
        return Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getInstrumentType() : null), (java.lang.Object) "SWAP");
    }
}
