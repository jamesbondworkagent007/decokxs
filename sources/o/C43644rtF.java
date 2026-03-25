package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rtF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43644rtF extends AbstractC33073mpa {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rtC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43644rtF.KWHzl();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData KWHzl() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<MediaInfo>> EZpvd() {
        return (MutableLiveData) this.KWHzl.getValue();
    }

    public final void KWHzl(int i) {
        EZpvd().postValue(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(i == 1 ? C43643rtE.copydefault.copydefault() : C43643rtE.copydefault.AEQbTJ()));
    }

    public final void KWHzl(int i, @NotNull java.util.ArrayList<MediaInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C43643rtE c43643rtE = C43643rtE.copydefault;
        c43643rtE.EZpvd(arrayList);
        EZpvd().postValue(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(i == 1 ? c43643rtE.copydefault() : c43643rtE.AEQbTJ()));
    }
}
