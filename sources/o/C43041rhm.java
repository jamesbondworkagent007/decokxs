package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C30360lVm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43041rhm implements C30360lVm.StateListAnimator {
    public static final int OLrzqt = C48834udE.EZpvd;
    public final C48834udE EZpvd = new C48834udE("[MiniApp]");

    public final java.util.List<java.io.File> AEQbTJ(java.lang.String str) {
        C43047rhs c43047rhs = C43047rhs.AEQbTJ;
        java.lang.String strOLrzqt = c43047rhs.EZpvd(str).OLrzqt();
        java.util.Set<java.lang.String> setKWHzl = c43047rhs.EZpvd(str).KWHzl();
        pUU.EZpvd("MiniAppCacheModule", "appId: " + str + ", version: " + strOLrzqt + ", reservedVersions: " + setKWHzl);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            java.io.File[] fileArrListFiles = new java.io.File(c43047rhs.copydefault(str, null)).listFiles();
            if (fileArrListFiles == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.io.File file : fileArrListFiles) {
                if (file.isDirectory() && !setKWHzl.contains(file.getName()) && C48833udD.copydefault(file.getName(), strOLrzqt) < 0) {
                    arrayList.add(file);
                }
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    @Override // o.C30360lVm.StateListAnimator
    public long OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C43047rhs.AEQbTJ.EZpvd()).iterator();
        long jAEQbTJ = 0;
        while (it.hasNext()) {
            java.util.Iterator<T> it2 = AEQbTJ((java.lang.String) it.next()).iterator();
            while (it2.hasNext()) {
                jAEQbTJ += C30360lVm.KWHzl.AEQbTJ((java.io.File) it2.next());
            }
        }
        return jAEQbTJ;
    }

    @Override // o.C30360lVm.StateListAnimator
    public void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (java.lang.String str : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(C43047rhs.AEQbTJ.EZpvd())) {
            for (java.io.File file : AEQbTJ(str)) {
                this.EZpvd.copydefault(str, "clearCache " + file.getAbsolutePath());
                yFL.AkhnZx(file);
            }
        }
    }
}
