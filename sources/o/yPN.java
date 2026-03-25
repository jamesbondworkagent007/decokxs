package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPN extends yPG implements InterfaceC56680yOi {
    public InterfaceC56695yOx fetchVPNInfo;
    public final InterfaceC56680yOi isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull InterfaceC56695yOx interfaceC56695yOx) {
        if (interfaceC56695yOx == null) {
            AEQbTJ(6);
        }
        this.fetchVPNInfo = interfaceC56695yOx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: o.yPN */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: o.yPN */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: o.yPN */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yPN(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, boolean z2, boolean z3, @NotNull CallableMemberDescriptor.Kind kind, InterfaceC56680yOi interfaceC56680yOi, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        InterfaceC56680yOi interfaceC56680yOi2;
        yPN ypn;
        super(modality, ync, interfaceC56676yOe, yol, C56935yXu.copydefault("<set-" + interfaceC56676yOe.bR_() + ">"), z, z2, z3, kind, interfaceC56686yOo);
        if (interfaceC56676yOe == null) {
            AEQbTJ(0);
        }
        if (yol == null) {
            AEQbTJ(1);
        }
        if (modality == null) {
            AEQbTJ(2);
        }
        if (ync == null) {
            AEQbTJ(3);
        }
        if (kind == null) {
            AEQbTJ(4);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(5);
        }
        if (interfaceC56680yOi != null) {
            ypn = this;
            interfaceC56680yOi2 = interfaceC56680yOi;
        } else {
            interfaceC56680yOi2 = this;
            ypn = interfaceC56680yOi2;
        }
        ypn.isConnected = interfaceC56680yOi2;
    }

    public static yPP AEQbTJ(@NotNull InterfaceC56680yOi interfaceC56680yOi, @NotNull AbstractC59233zdF abstractC59233zdF, @NotNull yOL yol) {
        if (interfaceC56680yOi == null) {
            AEQbTJ(7);
        }
        if (abstractC59233zdF == null) {
            AEQbTJ(8);
        }
        if (yol == null) {
            AEQbTJ(9);
        }
        return new yPP(interfaceC56680yOi, null, 0, yol, C56938yXx.djBIcL, abstractC59233zdF, false, false, false, null, InterfaceC56686yOo.copydefault);
    }

    @Override // o.yNG, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, o.InterfaceC56657yNm
    public java.util.Collection<? extends InterfaceC56680yOi> valueOf() {
        java.util.Collection<InterfaceC56677yOf> collectionAEQbTJ = super.AEQbTJ(false);
        if (collectionAEQbTJ == null) {
            AEQbTJ(10);
        }
        return collectionAEQbTJ;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56695yOx> fetchVPNInfo() {
        InterfaceC56695yOx interfaceC56695yOx = this.fetchVPNInfo;
        if (interfaceC56695yOx == null) {
            throw new java.lang.IllegalStateException();
        }
        java.util.List<InterfaceC56695yOx> listSingletonList = Collections.singletonList(interfaceC56695yOx);
        if (listSingletonList == null) {
            AEQbTJ(11);
        }
        return listSingletonList;
    }

    @Override // o.InterfaceC56657yNm
    public AbstractC59233zdF gEmmrt() {
        AbstractC59242zdO abstractC59242zdOSSMYrx = yZE.AEQbTJ((InterfaceC56665yNu) this).sSMYrx();
        if (abstractC59242zdOSSMYrx == null) {
            AEQbTJ(12);
        }
        return abstractC59242zdOSSMYrx;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.KWHzl(this, d);
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/yOf; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.yPG, o.yNG
    /* JADX INFO: renamed from: getFieldNames, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56680yOi bT_() {
        InterfaceC56680yOi interfaceC56680yOi = this.isConnected;
        if (interfaceC56680yOi == null) {
            AEQbTJ(13);
        }
        return interfaceC56680yOi;
    }
}
