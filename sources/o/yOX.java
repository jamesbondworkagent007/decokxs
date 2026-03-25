package o;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yOX extends AbstractC56704yPf {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void EZpvd(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yOX(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull Variance variance, boolean z, int i, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull InterfaceC56685yOn interfaceC56685yOn) {
        super(interfaceC59187zcM, interfaceC56665yNu, yol, c56935yXu, variance, z, i, interfaceC56686yOo, interfaceC56685yOn);
        if (interfaceC59187zcM == null) {
            EZpvd(0);
        }
        if (interfaceC56665yNu == null) {
            EZpvd(1);
        }
        if (yol == null) {
            EZpvd(2);
        }
        if (c56935yXu == null) {
            EZpvd(3);
        }
        if (variance == null) {
            EZpvd(4);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(5);
        }
        if (interfaceC56685yOn == null) {
            EZpvd(6);
        }
    }

    @Override // o.AbstractC56711yPm
    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = "";
        objArr[0] = isConnected() ? "reified " : "";
        if (values() != Variance.INVARIANT) {
            str = values() + " ";
        }
        objArr[1] = str;
        objArr[2] = bR_();
        return java.lang.String.format("%s%s%s", objArr);
    }
}
