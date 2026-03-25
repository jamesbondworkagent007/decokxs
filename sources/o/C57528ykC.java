package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57528ykC extends AbstractC57556yke {
    public final java.util.HashMap<java.lang.String, java.lang.Object> AYXKKw;
    public final Function2<AbstractC33132mqg, OKIncomingData, Unit> AhwBna;
    public final Function1<OKWsConnectionState, Unit> DbNXlk;
    public final java.util.HashMap<java.lang.String, java.lang.Object> djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.core.livelistener.OKWsConnectionState, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super o.mqg, ? super com.okinc.core.livelistener.OKIncomingData, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57528ykC(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends InterfaceC57559ykh> arrayList, Function1<? super OKWsConnectionState, Unit> function1, Function2<? super AbstractC33132mqg, ? super OKIncomingData, Unit> function2) {
        super(str, arrayList);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.DbNXlk = function1;
        this.AhwBna = function2;
        this.AYXKKw = new java.util.HashMap<>();
        this.djBIcL = new java.util.HashMap<>();
    }

    @Override // o.AbstractC33132mqg
    public void EZpvd(@NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        if (oKIncomingData.getPayload() instanceof java.util.HashMap) {
            if (OLrzqt() != null) {
                java.util.HashMap<java.lang.String, java.lang.Object> map = this.AYXKKw;
                java.lang.Object payload = oKIncomingData.getPayload();
                Intrinsics.copydefault(payload, "");
                map.putAll((java.util.Map) payload);
            } else {
                java.util.HashMap<java.lang.String, java.lang.Object> map2 = this.djBIcL;
                java.lang.Object payload2 = oKIncomingData.getPayload();
                Intrinsics.copydefault(payload2, "");
                map2.putAll((java.util.Map) payload2);
            }
        }
        super.EZpvd(oKIncomingData);
    }

    @Override // o.AbstractC33132mqg
    public void OLrzqt(@NotNull AbstractC33132mqg abstractC33132mqg, @NotNull OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        Function2<AbstractC33132mqg, OKIncomingData, Unit> function2 = this.AhwBna;
        if (function2 != null) {
            function2.invoke(abstractC33132mqg, oKIncomingData);
        }
    }

    @Override // o.AbstractC33132mqg
    public void AEQbTJ(@NotNull OKWsConnectionState oKWsConnectionState) {
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        Function1<OKWsConnectionState, Unit> function1 = this.DbNXlk;
        if (function1 != null) {
            function1.invoke(oKWsConnectionState);
        }
    }
}
