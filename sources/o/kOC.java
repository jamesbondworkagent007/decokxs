package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.domain.model.PathRouterUi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kOC extends ViewModel {
    public final C25413iwJ AEQbTJ = new C25413iwJ();
    public final MutableLiveData<C55276xgr> KWHzl = new MutableLiveData<>();

    public static /* synthetic */ java.util.List mapBridgeToPathUi$default(kOC koc, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        return koc.AEQbTJ(list, z, str);
    }

    public final java.util.List<PathRouterUi> AEQbTJ(@NotNull java.util.List<PathSelectionRouterItem> list, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.copydefault(list, z, str);
    }
}
