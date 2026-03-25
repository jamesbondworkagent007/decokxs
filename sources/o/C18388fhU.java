package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18388fhU {
    public static final java.lang.String AEQbTJ(@NotNull C10854bwM c10854bwM) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        java.lang.String strCopydefault = c10854bwM.copydefault();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            return strCopydefault;
        }
        java.lang.Character chWlaJM = C59454zhO.wlaJM(c10854bwM.djBIcL());
        java.lang.String strOLrzqt = (chWlaJM == null || (string = chWlaJM.toString()) == null) ? null : C9700baY.OLrzqt(string);
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public static final long OLrzqt(@NotNull java.util.List<C10854bwM> list, int i) {
        C10854bwM c10854bwMIsConnected;
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object obj = null;
        if (i == 1) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((C10854bwM) next).OBJEWx()) {
                    obj = next;
                    break;
                }
            }
            c10854bwMIsConnected = (C10854bwM) obj;
            if (c10854bwMIsConnected == null) {
                c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            }
        } else if (i == 4) {
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (((C10854bwM) next2).fdOvFl()) {
                    obj = next2;
                    break;
                }
            }
            c10854bwMIsConnected = (C10854bwM) obj;
            if (c10854bwMIsConnected == null) {
                c10854bwMIsConnected = C10954byG.EZpvd.valueOf().hDKMBd();
            }
        } else if (i == 5) {
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next3 = it3.next();
                if (((C10854bwM) next3).gGvvIC()) {
                    obj = next3;
                    break;
                }
            }
            c10854bwMIsConnected = (C10854bwM) obj;
            if (c10854bwMIsConnected == null) {
                c10854bwMIsConnected = C10954byG.EZpvd.valueOf().AEQbTJ();
            }
        } else if (i == 6) {
            java.util.Iterator<T> it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                java.lang.Object next4 = it4.next();
                if (((C10854bwM) next4).AxsJAYaxsJAY()) {
                    obj = next4;
                    break;
                }
            }
            c10854bwMIsConnected = (C10854bwM) obj;
            if (c10854bwMIsConnected == null) {
                c10854bwMIsConnected = C10954byG.EZpvd.valueOf().copydefault();
            }
        } else {
            java.util.Iterator<T> it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                java.lang.Object next5 = it5.next();
                if (((C10854bwM) next5).gGvvIC()) {
                    obj = next5;
                    break;
                }
            }
            c10854bwMIsConnected = (C10854bwM) obj;
            if (c10854bwMIsConnected == null) {
                c10854bwMIsConnected = C10954byG.EZpvd.valueOf().AEQbTJ();
            }
        }
        if (c10854bwMIsConnected == null) {
            c10854bwMIsConnected = (C10854bwM) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
        return c10854bwMIsConnected.AEQbTJ();
    }
}
