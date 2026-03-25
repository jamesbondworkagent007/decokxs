package o;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRR {
    public static final yRR copydefault = new yRR();
    public static final java.util.Map<java.lang.String, EnumSet<KotlinTarget>> AEQbTJ = C56424yEw.gEmmrt(C56390yDp.OLrzqt("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), C56390yDp.OLrzqt(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), C56390yDp.OLrzqt("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), C56390yDp.OLrzqt("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), C56390yDp.OLrzqt("FIELD", EnumSet.of(KotlinTarget.FIELD)), C56390yDp.OLrzqt("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), C56390yDp.OLrzqt("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), C56390yDp.OLrzqt("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), C56390yDp.OLrzqt("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), C56390yDp.OLrzqt("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));
    public static final java.util.Map<java.lang.String, KotlinRetention> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("RUNTIME", KotlinRetention.RUNTIME), C56390yDp.OLrzqt("CLASS", KotlinRetention.BINARY), C56390yDp.OLrzqt("SOURCE", KotlinRetention.SOURCE));

    private yRR() {
    }

    public final java.util.Set<KotlinTarget> OLrzqt(java.lang.String str) {
        EnumSet<KotlinTarget> enumSet = AEQbTJ.get(str);
        return enumSet != null ? enumSet : yEE.copydefault();
    }

    public static final AbstractC59233zdF KWHzl(yNP ynp) {
        AbstractC59233zdF abstractC59233zdFUzCIH;
        Intrinsics.checkNotNullParameter(ynp, "");
        InterfaceC56695yOx interfaceC56695yOxKWHzl = yRO.KWHzl(yRM.KWHzl.KWHzl(), ynp.AEQbTJ().OLrzqt(yMB.Application.zuWLRA));
        return (interfaceC56695yOxKWHzl == null || (abstractC59233zdFUzCIH = interfaceC56695yOxKWHzl.uzCIH()) == null) ? C59370zfk.EZpvd(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new java.lang.String[0]) : abstractC59233zdFUzCIH;
    }

    public final AbstractC56975yZg<?> AEQbTJ(yTN ytn) {
        yTV ytv = ytn instanceof yTV ? (yTV) ytn : null;
        if (ytv == null) {
            return null;
        }
        java.util.Map<java.lang.String, KotlinRetention> map = OLrzqt;
        C56935yXu c56935yXuOLrzqt = ytv.OLrzqt();
        KotlinRetention kotlinRetention = map.get(c56935yXuOLrzqt != null ? c56935yXuOLrzqt.AEQbTJ() : null);
        if (kotlinRetention == null) {
            return null;
        }
        C56929yXo c56929yXoKWHzl = C56929yXo.AEQbTJ.KWHzl(yMB.Application.values);
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(kotlinRetention.name());
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return new C56981yZm(c56929yXoKWHzl, c56935yXuAEQbTJ);
    }

    public final AbstractC56975yZg<?> AEQbTJ(@NotNull java.util.List<? extends yTN> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<yTV> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof yTV) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<KotlinTarget> arrayList2 = new java.util.ArrayList();
        for (yTV ytv : arrayList) {
            yRR yrr = copydefault;
            C56935yXu c56935yXuOLrzqt = ytv.OLrzqt();
            C56406yEe.KWHzl(arrayList2, yrr.OLrzqt(c56935yXuOLrzqt != null ? c56935yXuOLrzqt.AEQbTJ() : null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            C56929yXo c56929yXoKWHzl = C56929yXo.AEQbTJ.KWHzl(yMB.Application.DbNXlk);
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
            arrayList3.add(new C56981yZm(c56929yXoKWHzl, c56935yXuAEQbTJ));
        }
        return new C56971yZc(arrayList3, yRQ.AEQbTJ);
    }
}
