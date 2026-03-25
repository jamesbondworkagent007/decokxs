package o;

import o.yOJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yOG implements yOJ {
    public final AbstractC59233zdF AEQbTJ;
    public final InterfaceC56686yOo KWHzl;
    public final java.util.Map<C56935yXu, AbstractC56975yZg<?>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public yOG(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.Map<C56935yXu, AbstractC56975yZg<?>> map, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (abstractC59233zdF == null) {
            EZpvd(0);
        }
        if (map == null) {
            EZpvd(1);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(2);
        }
        this.AEQbTJ = abstractC59233zdF;
        this.copydefault = map;
        this.KWHzl = interfaceC56686yOo;
    }

    @Override // o.yOJ
    public AbstractC59233zdF AEQbTJ() {
        AbstractC59233zdF abstractC59233zdF = this.AEQbTJ;
        if (abstractC59233zdF == null) {
            EZpvd(3);
        }
        return abstractC59233zdF;
    }

    @Override // o.yOJ
    public C56933yXs KWHzl() {
        return yOJ.ActionBar.AEQbTJ(this);
    }

    @Override // o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        java.util.Map<C56935yXu, AbstractC56975yZg<?>> map = this.copydefault;
        if (map == null) {
            EZpvd(4);
        }
        return map;
    }

    @Override // o.yOJ
    public InterfaceC56686yOo EZpvd() {
        InterfaceC56686yOo interfaceC56686yOo = this.KWHzl;
        if (interfaceC56686yOo == null) {
            EZpvd(5);
        }
        return interfaceC56686yOo;
    }

    public java.lang.String toString() {
        return yXX.gEmmrt.OLrzqt(this, null);
    }
}
