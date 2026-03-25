package o;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25494ixl implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (Intrinsics.EZpvd(interfaceC43233rlS, C25496ixn.EZpvd)) {
            KWHzl(context, map);
        }
    }

    public final void KWHzl(android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        InterfaceC9775bbu interfaceC9775bbu;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || C25596izh.OLrzqt(context).KWHzl(context, new iBC(0, 0, 0, null, null, 31, null))) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            arrayList.add(C56390yDp.OLrzqt(entry.getKey(), entry.getValue()));
        }
        android.os.Bundle bundleEZpvd = C33048mpB.EZpvd((kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]));
        if (C27508jwX.AEQbTJ.EZpvd(context)) {
            C25460ixD.OLrzqt.copydefault(activity, bundleEZpvd);
            return;
        }
        java.util.List listKWHzl = C43251rlk.KWHzl(InterfaceC9775bbu.class);
        if (listKWHzl != null && (interfaceC9775bbu = (InterfaceC9775bbu) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) != null) {
            interfaceC9775bbu.AEQbTJ(context, java.lang.Integer.valueOf(C9768bbn.AYXKKw), C56424yEw.KWHzl(), new Function0() { // from class: o.ixj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25494ixl.KWHzl();
                }
            });
        }
        C25460ixD.OLrzqt.copydefault(activity, bundleEZpvd);
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }
}
