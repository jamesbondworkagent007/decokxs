package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yPT extends AbstractC56709yPk implements yOC {
    public AbstractC59233zdF iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void copydefault(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        return null;
    }

    public InterfaceC56679yOh AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(AbstractC59233zdF abstractC59233zdF) {
        this.iwGUEr = abstractC59233zdF;
    }

    public InterfaceC56679yOh djBIcL() {
        return null;
    }

    @Override // o.InterfaceC56657yNm
    public boolean values() {
        return false;
    }

    public boolean wlaJM() {
        return false;
    }

    /* JADX INFO: renamed from: AEQbTJ */
    public /* synthetic */ InterfaceC56666yNv OLrzqt(TypeSubstitutor typeSubstitutor) {
        return copydefault(typeSubstitutor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPT(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, AbstractC59233zdF abstractC59233zdF, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56665yNu, yol, c56935yXu, interfaceC56686yOo);
        if (interfaceC56665yNu == null) {
            copydefault(0);
        }
        if (yol == null) {
            copydefault(1);
        }
        if (c56935yXu == null) {
            copydefault(2);
        }
        if (interfaceC56686yOo == null) {
            copydefault(3);
        }
        this.iwGUEr = abstractC59233zdF;
    }

    @Override // o.InterfaceC56697yOz
    public AbstractC59233zdF uzCIH() {
        AbstractC59233zdF abstractC59233zdF = this.iwGUEr;
        if (abstractC59233zdF == null) {
            copydefault(4);
        }
        return abstractC59233zdF;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56709yPk, o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AwvSrB, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yOC iwGUEr() {
        yOC yoc = (yOC) super.iwGUEr();
        if (yoc == null) {
            copydefault(5);
        }
        return yoc;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56695yOx> fetchVPNInfo() {
        java.util.List<InterfaceC56695yOx> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            copydefault(6);
        }
        return listEmptyList;
    }

    public java.util.Collection<? extends InterfaceC56657yNm> valueOf() {
        java.util.Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            copydefault(7);
        }
        return setEmptySet;
    }

    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            copydefault(8);
        }
        return listEmptyList;
    }

    public java.util.List<InterfaceC56679yOh> OLrzqt() {
        java.util.List<InterfaceC56679yOh> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            copydefault(9);
        }
        return listEmptyList;
    }

    public AbstractC59233zdF gEmmrt() {
        AbstractC59233zdF abstractC59233zdFUzCIH = uzCIH();
        if (abstractC59233zdFUzCIH == null) {
            copydefault(10);
        }
        return abstractC59233zdFUzCIH;
    }
}
