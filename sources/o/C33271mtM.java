package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33271mtM implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        int i;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        android.os.Bundle bundleEZpvd = C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
        if (interfaceC33171mrS.ejfBZ()) {
            i = 2;
        } else {
            bundleEZpvd.putString("path", "main/home");
            i = 1;
        }
        InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, i, false, 0, bundleEZpvd, null, 32, null);
    }
}
