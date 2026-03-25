package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48934uez extends ViewModel {
    public int AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final MultiShareConfig OLrzqt;
    public MutableLiveData<ShareConfig> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ShareConfig> OLrzqt() {
        return this.copydefault;
    }

    public C48934uez(@NotNull MultiShareConfig multiShareConfig) {
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        this.OLrzqt = multiShareConfig;
        this.copydefault = new MutableLiveData<>(multiShareConfig.getFirstShareConfig());
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ueA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48934uez.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final C48929ueu OLrzqt(C48934uez c48934uez) {
        ShareConfig value = c48934uez.copydefault.getValue();
        if (value == null) {
            value = c48934uez.OLrzqt.getFirstShareConfig();
        }
        return new C48929ueu(value);
    }

    public final C48929ueu copydefault() {
        return (C48929ueu) this.KWHzl.getValue();
    }

    public final C48929ueu AEQbTJ() {
        return copydefault();
    }

    public final void OLrzqt(int i) {
        ShareConfig shareConfig = (ShareConfig) CollectionsKt___CollectionsKt.AkhnZx(this.OLrzqt.getConfigList(), i);
        if (shareConfig != null) {
            this.AEQbTJ = i;
            OLrzqt().setValue(shareConfig);
            copydefault().AEQbTJ(shareConfig);
            copydefault().copydefault();
            return;
        }
        pUU.copydefault("OKShare", "onPageSelected->invalid position:" + i);
    }

    public final boolean EZpvd() {
        return this.OLrzqt.getConfigList().size() > 1;
    }
}
