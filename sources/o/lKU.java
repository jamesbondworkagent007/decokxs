package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.buysell.data.Icon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lKU extends lzL {
    public Function0<Unit> AEQbTJ;
    public Function0<Unit> OLrzqt;
    public final MutableLiveData<C32989mnw<java.lang.String>> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Icon>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<C32989mnw<Icon>> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Icon>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Icon>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.String>> copydefault() {
        return this.KWHzl;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        mHA.OLrzqt.OLrzqt(this.KWHzl, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lKU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateEndIcon$default(lKU lku, Icon icon, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        lku.copydefault(icon, function0);
    }

    public final void copydefault(@NotNull Icon icon, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(icon, "");
        mHA.OLrzqt.OLrzqt(this.copydefault, icon);
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lKU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateStartIcon$default(lKU lku, Icon icon, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        lku.AEQbTJ(icon, function0);
    }

    public final void AEQbTJ(@NotNull Icon icon, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(icon, "");
        mHA.OLrzqt.OLrzqt(this.EZpvd, icon);
        this.OLrzqt = function0;
    }
}
