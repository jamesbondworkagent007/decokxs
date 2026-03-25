package o;

import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15838eXd {
    public static final C15838eXd KWHzl = new C15838eXd();
    public static final java.util.ArrayList<java.lang.String> AEQbTJ = yDY.copydefault("wallet");
    public static final java.util.ArrayList<java.lang.Integer> OLrzqt = yDY.copydefault(java.lang.Integer.valueOf(C13754dXa.FragmentManager.GiPPlLRPuVlr));
    public static final int EZpvd = 8;

    private C15838eXd() {
    }

    public final java.util.List<java.lang.String> OLrzqt(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AEQbTJ.clear();
        for (java.lang.String str : arrayList) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "collectibles")) {
                if (!C14687dqE.OLrzqt.AkhnZx()) {
                    AEQbTJ.add("collectibles");
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "portfolio")) {
                if (!C14687dqE.OLrzqt.isConnected()) {
                    AEQbTJ.add("portfolio");
                }
            } else {
                AEQbTJ.add(str);
            }
        }
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [50=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.List<java.lang.Integer> copydefault(@NotNull java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        OLrzqt.clear();
        for (java.lang.String str : arrayList) {
            switch (str.hashCode()) {
                case -1655966961:
                    if (str.equals(MTCommonConstants.Lifecycle.KEY_ACTIVITY)) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.from));
                    }
                    break;
                case -795192327:
                    if (str.equals("wallet")) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.GiPPlLRPuVlr));
                    }
                    break;
                case 167124155:
                    if (str.equals("approve_manager")) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.GiPPlLQAswws));
                    }
                    break;
                case 350388810:
                    if (str.equals("recent_pnl")) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.QqiRNA));
                    }
                    break;
                case 1121781064:
                    if (str.equals("portfolio") && !C14687dqE.OLrzqt.isConnected()) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.zvzmfz));
                    }
                    break;
                case 1635687287:
                    if (str.equals("collectibles") && !C14687dqE.OLrzqt.AkhnZx()) {
                        OLrzqt.add(java.lang.Integer.valueOf(C13754dXa.FragmentManager.onReceive));
                    }
                    break;
            }
        }
        return OLrzqt;
    }

    public final int EZpvd(java.lang.String str) {
        return CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.String>) ((java.util.List<? extends java.lang.Object>) AEQbTJ), str);
    }
}
