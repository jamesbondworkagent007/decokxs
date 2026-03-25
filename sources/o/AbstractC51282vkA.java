package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradingbot.impl.strategy.bean.StrategyItemData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC51282vkA {
    public java.lang.String EZpvd = "";
    public final MutableLiveData<StrategyItemData> KWHzl = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<StrategyItemData> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    public int AYXKKw() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return C52761wXj.PendingIntent.uzCIH;
    }

    public void AkhnZx() {
    }

    public boolean DbNXlk() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    public boolean valueOf() {
        return true;
    }

    public java.util.ArrayList<java.lang.String> copydefault() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.EZpvd)) {
            arrayList.add("btn_detail");
        }
        arrayList.add("btn_more");
        return arrayList;
    }

    public java.lang.String OLrzqt() {
        return C33070mpX.AYXKKw(C55688xof.Application.fmdvVn);
    }

    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C55688xof.Application.dkJJWw);
    }

    public java.util.ArrayList<xKK> djBIcL() {
        return new java.util.ArrayList<>();
    }

    public int EZpvd() {
        return C33070mpX.copydefault(C52761wXj.Activity.aappFQ);
    }
}
