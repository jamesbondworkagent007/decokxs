package o;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yPW extends yPT {
    public Function0<InterfaceC59180zcF<AbstractC56975yZg<?>>> AuCTelauCTel;
    public InterfaceC59180zcF<AbstractC56975yZg<?>> AubY;
    public final boolean zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOC
    public boolean AubY() {
        return this.zLjUOn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPW(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, AbstractC59233zdF abstractC59233zdF, boolean z, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56665yNu, yol, c56935yXu, abstractC59233zdF, interfaceC56686yOo);
        if (interfaceC56665yNu == null) {
            EZpvd(0);
        }
        if (yol == null) {
            EZpvd(1);
        }
        if (c56935yXu == null) {
            EZpvd(2);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(3);
        }
        this.zLjUOn = z;
    }

    @Override // o.yOC
    public AbstractC56975yZg<?> iwGUEr() {
        InterfaceC59180zcF<AbstractC56975yZg<?>> interfaceC59180zcF = this.AubY;
        if (interfaceC59180zcF != null) {
            return interfaceC59180zcF.invoke();
        }
        return null;
    }

    public void OLrzqt(@NotNull Function0<InterfaceC59180zcF<AbstractC56975yZg<?>>> function0) {
        if (function0 == null) {
            EZpvd(4);
        }
        OLrzqt(null, function0);
    }

    public void OLrzqt(InterfaceC59180zcF<AbstractC56975yZg<?>> interfaceC59180zcF, @NotNull Function0<InterfaceC59180zcF<AbstractC56975yZg<?>>> function0) {
        if (function0 == null) {
            EZpvd(5);
        }
        this.AuCTelauCTel = function0;
        if (interfaceC59180zcF == null) {
            interfaceC59180zcF = function0.invoke();
        }
        this.AubY = interfaceC59180zcF;
    }
}
