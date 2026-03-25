package o;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yVQ {
    public static /* synthetic */ java.lang.Object mapType$default(AbstractC59233zdF abstractC59233zdF, yVY yvy, C56900yWm c56900yWm, InterfaceC56895yWh interfaceC56895yWh, yVU yvu, yHO yho, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            yho = C59430zgr.EZpvd();
        }
        return KWHzl(abstractC59233zdF, yvy, c56900yWm, interfaceC56895yWh, yvu, yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.yVY<T> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.yVU<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, java.lang.Object] */
    public static final <T> T KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull yVY<T> yvy, @NotNull C56900yWm c56900yWm, @NotNull InterfaceC56895yWh<? extends T> interfaceC56895yWh, yVU<T> yvu, @NotNull yHO<? super AbstractC59233zdF, ? super T, ? super C56900yWm, Unit> yho) {
        T t;
        AbstractC59233zdF abstractC59233zdF2;
        java.lang.Object objKWHzl;
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        Intrinsics.checkNotNullParameter(yvy, "");
        Intrinsics.checkNotNullParameter(c56900yWm, "");
        Intrinsics.checkNotNullParameter(interfaceC56895yWh, "");
        Intrinsics.checkNotNullParameter(yho, "");
        AbstractC59233zdF abstractC59233zdFKWHzl = interfaceC56895yWh.KWHzl(abstractC59233zdF);
        if (abstractC59233zdFKWHzl != null) {
            return (T) KWHzl(abstractC59233zdFKWHzl, yvy, c56900yWm, interfaceC56895yWh, yvu, yho);
        }
        if (C56643yMz.isConnected(abstractC59233zdF)) {
            return (T) KWHzl(yMD.EZpvd(abstractC59233zdF), yvy, c56900yWm, interfaceC56895yWh, yvu, yho);
        }
        C59295zeO c59295zeO = C59295zeO.copydefault;
        java.lang.Object objCopydefault = C56902yWo.copydefault(c59295zeO, abstractC59233zdF, yvy, c56900yWm);
        if (objCopydefault != null) {
            ?? r10 = (java.lang.Object) C56902yWo.OLrzqt(yvy, objCopydefault, c56900yWm.AEQbTJ());
            yho.invoke(abstractC59233zdF, r10, c56900yWm);
            return r10;
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        if (interfaceC59315zeiDjBIcL instanceof C59228zdA) {
            C59228zdA c59228zdA = (C59228zdA) interfaceC59315zeiDjBIcL;
            AbstractC59233zdF abstractC59233zdFAhwBna = c59228zdA.AhwBna();
            if (abstractC59233zdFAhwBna == null) {
                abstractC59233zdFAhwBna = interfaceC56895yWh.EZpvd(c59228zdA.bV_());
            }
            return (T) KWHzl(C59336zfC.isConnected(abstractC59233zdFAhwBna), yvy, c56900yWm, interfaceC56895yWh, yvu, yho);
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zeiDjBIcL.OLrzqt();
        if (interfaceC56663yNsKWHzl == null) {
            throw new java.lang.UnsupportedOperationException("no descriptor for type constructor of " + abstractC59233zdF);
        }
        if (C59370zfk.KWHzl(interfaceC56663yNsKWHzl)) {
            T t2 = (T) yvy.copydefault("error/NonExistentClass");
            interfaceC56895yWh.KWHzl(abstractC59233zdF, (InterfaceC56658yNn) interfaceC56663yNsKWHzl);
            if (yvu != 0) {
                yvu.copydefault(t2);
            }
            return t2;
        }
        boolean z = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn;
        if (z && AbstractC56640yMw.OLrzqt(abstractC59233zdF)) {
            if (abstractC59233zdF.bY_().size() != 1) {
                throw new java.lang.UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC59317zek interfaceC59317zek = abstractC59233zdF.bY_().get(0);
            AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
            if (interfaceC59317zek.EZpvd() == Variance.IN_VARIANCE) {
                objKWHzl = yvy.copydefault("java/lang/Object");
                if (yvu != 0) {
                    yvu.copydefault();
                    yvu.copydefault(objKWHzl);
                    yvu.EZpvd();
                }
            } else {
                if (yvu != 0) {
                    yvu.copydefault();
                }
                Variance varianceEZpvd = interfaceC59317zek.EZpvd();
                Intrinsics.checkNotNullExpressionValue(varianceEZpvd, "");
                objKWHzl = KWHzl(abstractC59233zdFOLrzqt, yvy, c56900yWm.EZpvd(varianceEZpvd, true), interfaceC56895yWh, yvu, yho);
                if (yvu != 0) {
                    yvu.EZpvd();
                }
            }
            return (T) yvy.KWHzl(AbstractJsonLexerKt.BEGIN_LIST + yvy.OLrzqt(objKWHzl));
        }
        if (z) {
            if (yYK.EZpvd(interfaceC56663yNsKWHzl) && !c56900yWm.OLrzqt() && (abstractC59233zdF2 = (AbstractC59233zdF) C59273zdt.copydefault(c59295zeO, abstractC59233zdF)) != null) {
                return (T) KWHzl(abstractC59233zdF2, yvy, c56900yWm.gEmmrt(), interfaceC56895yWh, yvu, yho);
            }
            if (c56900yWm.EZpvd() && AbstractC56640yMw.KWHzl((InterfaceC56658yNn) interfaceC56663yNsKWHzl)) {
                t = (java.lang.Object) yvy.EZpvd();
            } else {
                InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56663yNsKWHzl;
                InterfaceC56658yNn interfaceC56658yNnZuBGHE = interfaceC56658yNn.bT_();
                Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnZuBGHE, "");
                T tKWHzl = interfaceC56895yWh.KWHzl(interfaceC56658yNnZuBGHE);
                if (tKWHzl == null) {
                    if (interfaceC56658yNn.DbNXlk() == ClassKind.ENUM_ENTRY) {
                        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56658yNn.AuCTel();
                        Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
                        interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56665yNuAYXKKw;
                    }
                    InterfaceC56658yNn interfaceC56658yNnZuBGHE2 = interfaceC56658yNn.bT_();
                    Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnZuBGHE2, "");
                    t = (java.lang.Object) yvy.copydefault(OLrzqt(interfaceC56658yNnZuBGHE2, interfaceC56895yWh));
                } else {
                    t = (java.lang.Object) tKWHzl;
                }
            }
            yho.invoke(abstractC59233zdF, t, c56900yWm);
            return t;
        }
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
            AbstractC59233zdF abstractC59233zdFAEQbTJ = C59336zfC.AEQbTJ((InterfaceC56691yOt) interfaceC56663yNsKWHzl);
            if (abstractC59233zdF.AEQbTJ()) {
                abstractC59233zdFAEQbTJ = C59336zfC.AkhnZx(abstractC59233zdFAEQbTJ);
            }
            T t3 = (T) KWHzl(abstractC59233zdFAEQbTJ, yvy, c56900yWm, interfaceC56895yWh, null, C59430zgr.EZpvd());
            if (yvu != 0) {
                C56935yXu c56935yXuBR_ = interfaceC56663yNsKWHzl.bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                yvu.AEQbTJ(c56935yXuBR_, t3);
            }
            return t3;
        }
        if ((interfaceC56663yNsKWHzl instanceof InterfaceC56690yOs) && c56900yWm.copydefault()) {
            return (T) KWHzl(((InterfaceC56690yOs) interfaceC56663yNsKWHzl).valueOf(), yvy, c56900yWm, interfaceC56895yWh, yvu, yho);
        }
        throw new java.lang.UnsupportedOperationException("Unknown type " + abstractC59233zdF);
    }

    public static final boolean copydefault(@NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        if (interfaceC56657yNm instanceof InterfaceC56660yNp) {
            return true;
        }
        AbstractC59233zdF abstractC59233zdFGEmmrt = interfaceC56657yNm.gEmmrt();
        Intrinsics.copydefault(abstractC59233zdFGEmmrt);
        if (AbstractC56640yMw.fIwbmz(abstractC59233zdFGEmmrt)) {
            AbstractC59233zdF abstractC59233zdFGEmmrt2 = interfaceC56657yNm.gEmmrt();
            Intrinsics.copydefault(abstractC59233zdFGEmmrt2);
            if (!C59322zep.valueOf(abstractC59233zdFGEmmrt2) && !(interfaceC56657yNm instanceof InterfaceC56675yOd)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ java.lang.String computeInternalName$default(InterfaceC56658yNn interfaceC56658yNn, InterfaceC56895yWh interfaceC56895yWh, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC56895yWh = C56899yWl.OLrzqt;
        }
        return OLrzqt(interfaceC56658yNn, interfaceC56895yWh);
    }

    public static final java.lang.String OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56895yWh<?> interfaceC56895yWh) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(interfaceC56895yWh, "");
        java.lang.String strOLrzqt = interfaceC56895yWh.OLrzqt(interfaceC56658yNn);
        if (strOLrzqt != null) {
            return strOLrzqt;
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56658yNn.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
        java.lang.String strCopydefault = C56938yXx.AEQbTJ(interfaceC56658yNn.bR_()).copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        if (interfaceC56665yNuAYXKKw instanceof yNW) {
            C56933yXs c56933yXsKWHzl = ((yNW) interfaceC56665yNuAYXKKw).KWHzl();
            if (c56933yXsKWHzl.AEQbTJ()) {
                return strCopydefault;
            }
            return C59449zhJ.replace$default(c56933yXsKWHzl.KWHzl(), '.', JsonPointer.SEPARATOR, false, 4, (java.lang.Object) null) + JsonPointer.SEPARATOR + strCopydefault;
        }
        InterfaceC56658yNn interfaceC56658yNn2 = interfaceC56665yNuAYXKKw instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuAYXKKw : null;
        if (interfaceC56658yNn2 == null) {
            throw new java.lang.IllegalArgumentException("Unexpected container: " + interfaceC56665yNuAYXKKw + " for " + interfaceC56658yNn);
        }
        java.lang.String strEZpvd = interfaceC56895yWh.EZpvd(interfaceC56658yNn2);
        if (strEZpvd == null) {
            strEZpvd = OLrzqt(interfaceC56658yNn2, interfaceC56895yWh);
        }
        return strEZpvd + '$' + strCopydefault;
    }
}
