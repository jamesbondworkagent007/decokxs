package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPL extends yPG implements InterfaceC56675yOd {
    public AbstractC59233zdF AkhnZx;
    public final InterfaceC56675yOd isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void KWHzl(int i) {
        java.lang.String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
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
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56657yNm
    public AbstractC59233zdF gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: o.yPL */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: o.yPL */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: o.yPL */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yPL(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, boolean z2, boolean z3, @NotNull CallableMemberDescriptor.Kind kind, InterfaceC56675yOd interfaceC56675yOd, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        InterfaceC56675yOd interfaceC56675yOd2;
        yPL ypl;
        super(modality, ync, interfaceC56676yOe, yol, C56935yXu.copydefault("<get-" + interfaceC56676yOe.bR_() + ">"), z, z2, z3, kind, interfaceC56686yOo);
        if (interfaceC56676yOe == null) {
            KWHzl(0);
        }
        if (yol == null) {
            KWHzl(1);
        }
        if (modality == null) {
            KWHzl(2);
        }
        if (ync == null) {
            KWHzl(3);
        }
        if (kind == null) {
            KWHzl(4);
        }
        if (interfaceC56686yOo == null) {
            KWHzl(5);
        }
        if (interfaceC56675yOd != null) {
            ypl = this;
            interfaceC56675yOd2 = interfaceC56675yOd;
        } else {
            interfaceC56675yOd2 = this;
            ypl = interfaceC56675yOd2;
        }
        ypl.isConnected = interfaceC56675yOd2;
    }

    public void OLrzqt(AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            abstractC59233zdF = fIwbmz().uzCIH();
        }
        this.AkhnZx = abstractC59233zdF;
    }

    @Override // o.yNG, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, o.InterfaceC56657yNm
    public java.util.Collection<? extends InterfaceC56675yOd> valueOf() {
        java.util.Collection<InterfaceC56677yOf> collectionAEQbTJ = super.AEQbTJ(true);
        if (collectionAEQbTJ == null) {
            KWHzl(6);
        }
        return collectionAEQbTJ;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56695yOx> fetchVPNInfo() {
        java.util.List<InterfaceC56695yOx> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            KWHzl(7);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.AEQbTJ((InterfaceC56675yOd) this, (java.lang.Object) d);
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/yOf; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.yPG, o.yNG
    /* JADX INFO: renamed from: getFieldNames, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56675yOd ejfBZ() {
        InterfaceC56675yOd interfaceC56675yOd = this.isConnected;
        if (interfaceC56675yOd == null) {
            KWHzl(8);
        }
        return interfaceC56675yOd;
    }
}
