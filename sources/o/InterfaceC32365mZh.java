package o;

import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.FilterAction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mZh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC32365mZh {

    /* JADX INFO: renamed from: o.mZh$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull InterfaceC32365mZh interfaceC32365mZh, @NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
            Intrinsics.checkNotNullParameter(filterAction, "");
            Intrinsics.checkNotNullParameter(tokenFilter, "");
        }
    }

    void EZpvd(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter);

    void OLrzqt(@NotNull TokenFilter tokenFilter);
}
