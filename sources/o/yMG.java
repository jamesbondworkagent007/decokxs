package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.yMO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMG implements yOY {
    public final InterfaceC59187zcM AEQbTJ;
    public final yNP KWHzl;

    public yMG(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ynp, "");
        this.AEQbTJ = interfaceC59187zcM;
        this.KWHzl = ynp;
    }

    @Override // o.yOY
    public boolean KWHzl(@NotNull C56933yXs c56933yXs, @NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        java.lang.String strAEQbTJ = c56935yXu.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return (C59449zhJ.startsWith$default(strAEQbTJ, "Function", false, 2, null) || C59449zhJ.startsWith$default(strAEQbTJ, "KFunction", false, 2, null) || C59449zhJ.startsWith$default(strAEQbTJ, "SuspendFunction", false, 2, null) || C59449zhJ.startsWith$default(strAEQbTJ, "KSuspendFunction", false, 2, null)) && yMO.OLrzqt.AEQbTJ().copydefault(c56933yXs, strAEQbTJ) != null;
    }

    @Override // o.yOY
    public InterfaceC56658yNn KWHzl(@NotNull C56929yXo c56929yXo) {
        C56933yXs c56933yXsOLrzqt;
        yMO.TaskDescription taskDescriptionCopydefault;
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        if (c56929yXo.AhwBna() || c56929yXo.valueOf()) {
            return null;
        }
        java.lang.String strKWHzl = c56929yXo.copydefault().KWHzl();
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strKWHzl, (java.lang.CharSequence) "Function", false, 2, (java.lang.Object) null) || (taskDescriptionCopydefault = yMO.OLrzqt.AEQbTJ().copydefault((c56933yXsOLrzqt = c56929yXo.OLrzqt()), strKWHzl)) == null) {
            return null;
        }
        yMM ymmAEQbTJ = taskDescriptionCopydefault.AEQbTJ();
        int iOLrzqt = taskDescriptionCopydefault.OLrzqt();
        java.util.List<yNW> listAEQbTJ = this.KWHzl.copydefault(c56933yXsOLrzqt).AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (obj instanceof InterfaceC56634yMq) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC56641yMx) {
                arrayList2.add(obj2);
            }
        }
        yNW ynw = (InterfaceC56641yMx) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
        if (ynw == null) {
            ynw = (InterfaceC56634yMq) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        }
        return new yMI(this.AEQbTJ, ynw, ymmAEQbTJ, iOLrzqt);
    }

    @Override // o.yOY
    public java.util.Collection<InterfaceC56658yNn> AEQbTJ(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return yEE.copydefault();
    }
}
