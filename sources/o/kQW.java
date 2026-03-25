package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQW {
    @yCM
    public kQW() {
    }

    public final MutableLiveData<AdvancedModeParams> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C22380heK.OLrzqt.copydefault(str).EZpvd();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C22380heK.OLrzqt.copydefault(str).EZpvd().setValue(AdvancedModeParams.Companion.copydefault());
    }
}
