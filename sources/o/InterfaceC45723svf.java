package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.okex.lite.hero.data.model.HeroResponseRootModel;
import com.okinc.okex.lite.hero.data.model.HeroSection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC45723svf {
    void AEQbTJ(boolean z);

    boolean EZpvd();

    java.lang.Object KWHzl(HeroSection heroSection, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<HeroResponseRootModel, OKServerException>> continuation);

    SharedFlow<HeroSection> OLrzqt();

    HeroSection copydefault();
}
