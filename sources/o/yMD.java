package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMD {
    public static final yPF AEQbTJ;

    static {
        C56710yPl c56710yPl = new C56710yPl(C59370zfk.AEQbTJ.copydefault(), yMB.fetchVPNInfo);
        ClassKind classKind = ClassKind.INTERFACE;
        C56935yXu c56935yXuOLrzqt = yMB.valueOf.OLrzqt();
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        InterfaceC59187zcM interfaceC59187zcM = LockBasedStorageManager.KWHzl;
        yPF ypf = new yPF(c56710yPl, classKind, false, false, c56935yXuOLrzqt, interfaceC56686yOo, interfaceC59187zcM);
        ypf.AEQbTJ(Modality.ABSTRACT);
        ypf.AEQbTJ(C56669yNy.fetchVPNInfo);
        ypf.KWHzl(C56402yEa.EZpvd(yPR.KWHzl(ypf, yOL.KWHzl.OLrzqt(), false, Variance.IN_VARIANCE, C56935yXu.AEQbTJ(ExifInterface.GPS_DIRECTION_TRUE), 0, interfaceC59187zcM)));
        ypf.AEQbTJ();
        AEQbTJ = ypf;
    }

    public static final AbstractC59242zdO EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        C56643yMz.isConnected(abstractC59233zdF);
        AbstractC56640yMw abstractC56640yMwCopydefault = C59336zfC.copydefault(abstractC59233zdF);
        yOL yolCopydefault = abstractC59233zdF.copydefault();
        AbstractC59233zdF abstractC59233zdFAEQbTJ = C56643yMz.AEQbTJ(abstractC59233zdF);
        java.util.List<AbstractC59233zdF> listEZpvd = C56643yMz.EZpvd(abstractC59233zdF);
        java.util.List<InterfaceC59317zek> listAhwBna = C56643yMz.AhwBna(abstractC59233zdF);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC59317zek) it.next()).OLrzqt());
        }
        C59308zeb c59308zebCopydefault = C59308zeb.OLrzqt.copydefault();
        InterfaceC59315zei interfaceC59315zeiFJNWhG = AEQbTJ.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        java.util.List listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends AbstractC59242zdO>) arrayList, C59231zdD.simpleType$default(c59308zebCopydefault, interfaceC59315zeiFJNWhG, C56402yEa.EZpvd(C59336zfC.EZpvd(C56643yMz.valueOf(abstractC59233zdF))), false, (AbstractC59287zeG) null, 16, (java.lang.Object) null));
        AbstractC59242zdO abstractC59242zdOIwGUEr = C59336zfC.copydefault(abstractC59233zdF).iwGUEr();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOIwGUEr, "");
        return C56643yMz.OLrzqt(abstractC56640yMwCopydefault, yolCopydefault, abstractC59233zdFAEQbTJ, listEZpvd, listCopydefault, null, abstractC59242zdOIwGUEr, (128 & 128) != 0 ? false : false).AEQbTJ(abstractC59233zdF.AEQbTJ());
    }
}
