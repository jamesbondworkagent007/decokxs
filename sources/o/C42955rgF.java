package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42955rgF {
    public static final int AEQbTJ;
    public static final MutableLiveData<java.lang.String> EZpvd;
    public static final C42955rgF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> copydefault() {
        return EZpvd;
    }

    private C42955rgF() {
    }

    static {
        C42955rgF c42955rgF = new C42955rgF();
        copydefault = c42955rgF;
        MutableLiveData<java.lang.String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(c42955rgF.OLrzqt());
        EZpvd = mutableLiveData;
        AEQbTJ = 8;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String string = SPUtils.getString("key_market_unit", "Volume");
        return string == null ? "" : string;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Volume") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Turnover")) {
            SPUtils.commit("key_market_unit", str);
            EZpvd.postValue(str);
        }
    }
}
