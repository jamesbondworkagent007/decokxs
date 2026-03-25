package o;

import com.okinc.market.watch.database.MarketFavDataBase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40461qWs extends C40462qWt {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40461qWs(@NotNull qVF qvf, @NotNull InterfaceC40448qWf interfaceC40448qWf, @NotNull InterfaceC40441qVz interfaceC40441qVz) {
        super(qvf, interfaceC40448qWf, interfaceC40441qVz);
        Intrinsics.checkNotNullParameter(qvf, "");
        Intrinsics.checkNotNullParameter(interfaceC40448qWf, "");
        Intrinsics.checkNotNullParameter(interfaceC40441qVz, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yCM
    public C40461qWs() {
        MarketFavDataBase.TaskDescription taskDescription = MarketFavDataBase.Companion;
        this(MarketFavDataBase.TaskDescription.instance$default(taskDescription, null, 1, null).OLrzqt(), MarketFavDataBase.TaskDescription.instance$default(taskDescription, null, 1, null).djBIcL(), MarketFavDataBase.TaskDescription.instance$default(taskDescription, null, 1, null).EZpvd());
    }
}
