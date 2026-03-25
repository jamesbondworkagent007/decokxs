package o;

import java.util.Collections;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59184zcJ extends AbstractC59197zcW {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i != 3 && i != 4) {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
    @Override // o.AbstractC59262zdi, o.InterfaceC59315zei
    public abstract InterfaceC56658yNn OLrzqt();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC59184zcJ(@NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(interfaceC59187zcM);
        if (interfaceC59187zcM == null) {
            EZpvd(0);
        }
    }

    @Override // o.InterfaceC59315zei
    public AbstractC56640yMw bU_() {
        AbstractC56640yMw abstractC56640yMwAEQbTJ = yZE.AEQbTJ(OLrzqt());
        if (abstractC56640yMwAEQbTJ == null) {
            EZpvd(1);
        }
        return abstractC56640yMwAEQbTJ;
    }

    @Override // o.AbstractC59262zdi
    public boolean EZpvd(@NotNull InterfaceC56663yNs interfaceC56663yNs) {
        if (interfaceC56663yNs == null) {
            EZpvd(2);
        }
        return (interfaceC56663yNs instanceof InterfaceC56658yNn) && EZpvd(OLrzqt(), interfaceC56663yNs);
    }

    @Override // o.AbstractC59197zcW
    public java.util.Collection<AbstractC59233zdF> copydefault(boolean z) {
        InterfaceC56665yNu interfaceC56665yNuAuCTel = OLrzqt().AuCTel();
        if (!(interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn)) {
            java.util.List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                EZpvd(3);
            }
            return listEmptyList;
        }
        C59387zgA c59387zgA = new C59387zgA();
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56665yNuAuCTel;
        c59387zgA.add(interfaceC56658yNn.bQ_());
        InterfaceC56658yNn interfaceC56658yNnValueOf = interfaceC56658yNn.valueOf();
        if (z && interfaceC56658yNnValueOf != null) {
            c59387zgA.add(interfaceC56658yNnValueOf.bQ_());
        }
        return c59387zgA;
    }

    @Override // o.AbstractC59197zcW
    public AbstractC59233zdF valueOf() {
        if (AbstractC56640yMw.copydefault(OLrzqt())) {
            return null;
        }
        return bU_().AhwBna();
    }
}
