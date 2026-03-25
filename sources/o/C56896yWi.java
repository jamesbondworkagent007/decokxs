package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import o.yMB;
import o.yVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56896yWi {
    public static /* synthetic */ java.lang.String computeJvmDescriptor$default(yNG yng, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return copydefault(yng, z, z2);
    }

    public static final java.lang.String copydefault(@NotNull yNG yng, boolean z, boolean z2) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(yng, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z2) {
            if (yng instanceof InterfaceC56660yNp) {
                strAEQbTJ = "<init>";
            } else {
                strAEQbTJ = yng.bR_().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            }
            sb.append(strAEQbTJ);
        }
        sb.append("(");
        InterfaceC56679yOh interfaceC56679yOhDjBIcL = yng.djBIcL();
        if (interfaceC56679yOhDjBIcL != null) {
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56679yOhDjBIcL.uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
            copydefault(sb, abstractC59233zdFUzCIH);
        }
        java.util.Iterator<InterfaceC56695yOx> it = yng.fetchVPNInfo().iterator();
        while (it.hasNext()) {
            AbstractC59233zdF abstractC59233zdFUzCIH2 = it.next().uzCIH();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH2, "");
            copydefault(sb, abstractC59233zdFUzCIH2);
        }
        sb.append(")");
        if (z) {
            if (yVQ.copydefault(yng)) {
                sb.append(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
            } else {
                AbstractC59233zdF abstractC59233zdFGEmmrt = yng.gEmmrt();
                Intrinsics.copydefault(abstractC59233zdFGEmmrt);
                copydefault(sb, abstractC59233zdFGEmmrt);
            }
        }
        return sb.toString();
    }

    public static final boolean KWHzl(@NotNull InterfaceC56657yNm interfaceC56657yNm) {
        yNG yngKWHzl;
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        if (!(interfaceC56657yNm instanceof yNG)) {
            return false;
        }
        yNG yng = (yNG) interfaceC56657yNm;
        if (!Intrinsics.EZpvd((java.lang.Object) yng.bR_().AEQbTJ(), (java.lang.Object) "remove") || yng.fetchVPNInfo().size() != 1 || yRG.fetchVPNInfo((CallableMemberDescriptor) interfaceC56657yNm)) {
            return false;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fJNWhG().fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        AbstractC59233zdF abstractC59233zdFUzCIH = ((InterfaceC56695yOx) CollectionsKt___CollectionsKt.gHZMYf(listFetchVPNInfo)).uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        yVX yvxOLrzqt = OLrzqt(abstractC59233zdFUzCIH);
        yVX.Activity activity = yvxOLrzqt instanceof yVX.Activity ? (yVX.Activity) yvxOLrzqt : null;
        if ((activity != null ? activity.valueOf() : null) != JvmPrimitiveType.INT || (yngKWHzl = C56754yRb.KWHzl(yng)) == null) {
            return false;
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = yngKWHzl.fJNWhG().fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
        AbstractC59233zdF abstractC59233zdFUzCIH2 = ((InterfaceC56695yOx) CollectionsKt___CollectionsKt.gHZMYf(listFetchVPNInfo2)).uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH2, "");
        yVX yvxOLrzqt2 = OLrzqt(abstractC59233zdFUzCIH2);
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = yngKWHzl.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
        return Intrinsics.EZpvd(yZE.valueOf(interfaceC56665yNuAYXKKw), yMB.Application.fZBcTu.AYXKKw()) && (yvxOLrzqt2 instanceof yVX.ActionBar) && Intrinsics.EZpvd((java.lang.Object) ((yVX.ActionBar) yvxOLrzqt2).AYXKKw(), (java.lang.Object) "java/lang/Object");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yVQ.computeInternalName$default(o.yNn, o.yWh, int, java.lang.Object):java.lang.String */
    public static final java.lang.String EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        C56929yXo c56929yXoAEQbTJ = yML.OLrzqt.AEQbTJ(yZE.EZpvd((InterfaceC56665yNu) interfaceC56658yNn).AYXKKw());
        if (c56929yXoAEQbTJ != null) {
            java.lang.String strOLrzqt = yZQ.OLrzqt(c56929yXoAEQbTJ);
            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            return strOLrzqt;
        }
        return yVQ.computeInternalName$default(interfaceC56658yNn, null, 2, null);
    }

    public static final void copydefault(java.lang.StringBuilder sb, AbstractC59233zdF abstractC59233zdF) {
        sb.append(OLrzqt(abstractC59233zdF));
    }

    public static final yVX OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        return (yVX) yVQ.mapType$default(abstractC59233zdF, yVW.copydefault, C56900yWm.OLrzqt, C56899yWl.OLrzqt, null, null, 32, null);
    }

    public static final java.lang.String copydefault(@NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        C56894yWg c56894yWg = C56894yWg.AEQbTJ;
        if (yYH.fIwbmz(interfaceC56657yNm)) {
            return null;
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56657yNm.AuCTel();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuAYXKKw instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAYXKKw : null;
        if (interfaceC56658yNn == null || interfaceC56658yNn.bR_().OLrzqt()) {
            return null;
        }
        InterfaceC56657yNm interfaceC56657yNmAhwBna = interfaceC56657yNm.fJNWhG();
        InterfaceC56687yOp interfaceC56687yOp = interfaceC56657yNmAhwBna instanceof InterfaceC56687yOp ? (InterfaceC56687yOp) interfaceC56657yNmAhwBna : null;
        if (interfaceC56687yOp == null) {
            return null;
        }
        return C56889yWb.AEQbTJ(c56894yWg, interfaceC56658yNn, computeJvmDescriptor$default(interfaceC56687yOp, false, false, 3, null));
    }
}
