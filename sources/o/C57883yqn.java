package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57883yqn extends AbstractC57879yqj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57883yqn(@NotNull InterfaceC57827ypk interfaceC57827ypk) {
        super(interfaceC57827ypk);
        Intrinsics.checkNotNullParameter(interfaceC57827ypk, "");
    }

    @Override // o.InterfaceC57887yqr
    public void OLrzqt(@NotNull JSONObject jSONObject, @NotNull InterfaceC57828ypl interfaceC57828ypl) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(interfaceC57828ypl, "");
        OLrzqt().KWHzl("outcomes/measure", jSONObject, interfaceC57828ypl);
    }
}
