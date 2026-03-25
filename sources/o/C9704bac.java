package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@yCR
public final class C9704bac implements InterfaceC43234rlT {
    public final kKG EZpvd;
    public final InterfaceC25414iwK OLrzqt;
    public final C9708bag copydefault;

    @yCM
    public C9704bac(@NotNull C9708bag c9708bag, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull kKG kkg) {
        Intrinsics.checkNotNullParameter(c9708bag, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        this.copydefault = c9708bag;
        this.OLrzqt = interfaceC25414iwK;
        this.EZpvd = kkg;
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        C9702baa.copydefault.OLrzqt(context, interfaceC43233rlS.OLrzqt(), C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0])), this.copydefault, this.OLrzqt, this.EZpvd);
    }
}
