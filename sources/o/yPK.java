package o;

import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.InterfaceC56657yNm;
import o.yNG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPK extends AbstractC56718yPt implements InterfaceC56687yOp {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void copydefault(int i) {
        java.lang.String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPK(@NotNull InterfaceC56665yNu interfaceC56665yNu, InterfaceC56687yOp interfaceC56687yOp, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56665yNu, interfaceC56687yOp, yol, c56935yXu, kind, interfaceC56686yOo);
        if (interfaceC56665yNu == null) {
            copydefault(0);
        }
        if (yol == null) {
            copydefault(1);
        }
        if (c56935yXu == null) {
            copydefault(2);
        }
        if (kind == null) {
            copydefault(3);
        }
        if (interfaceC56686yOo == null) {
            copydefault(4);
        }
    }

    public static yPK KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            copydefault(5);
        }
        if (yol == null) {
            copydefault(6);
        }
        if (c56935yXu == null) {
            copydefault(7);
        }
        if (kind == null) {
            copydefault(8);
        }
        if (interfaceC56686yOo == null) {
            copydefault(9);
        }
        return new yPK(interfaceC56665yNu, null, yol, c56935yXu, kind, interfaceC56686yOo);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yOh;Lo/yOh;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/zdF;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;)Lo/yPt; */
    @Override // o.AbstractC56718yPt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public yPK AEQbTJ(InterfaceC56679yOh interfaceC56679yOh, InterfaceC56679yOh interfaceC56679yOh2, @NotNull java.util.List<InterfaceC56679yOh> list, @NotNull java.util.List<? extends InterfaceC56691yOt> list2, @NotNull java.util.List<InterfaceC56695yOx> list3, AbstractC59233zdF abstractC59233zdF, Modality modality, @NotNull yNC ync) {
        if (list == null) {
            copydefault(14);
        }
        if (list2 == null) {
            copydefault(15);
        }
        if (list3 == null) {
            copydefault(16);
        }
        if (ync == null) {
            copydefault(17);
        }
        yPK ypkEZpvd = EZpvd(interfaceC56679yOh, interfaceC56679yOh2, list, list2, list3, abstractC59233zdF, modality, ync, null);
        if (ypkEZpvd == null) {
            copydefault(18);
        }
        return ypkEZpvd;
    }

    public yPK EZpvd(InterfaceC56679yOh interfaceC56679yOh, InterfaceC56679yOh interfaceC56679yOh2, @NotNull java.util.List<InterfaceC56679yOh> list, @NotNull java.util.List<? extends InterfaceC56691yOt> list2, @NotNull java.util.List<InterfaceC56695yOx> list3, AbstractC59233zdF abstractC59233zdF, Modality modality, @NotNull yNC ync, java.util.Map<? extends InterfaceC56657yNm.Application<?>, ?> map) {
        if (list == null) {
            copydefault(19);
        }
        if (list2 == null) {
            copydefault(20);
        }
        if (list3 == null) {
            copydefault(21);
        }
        if (ync == null) {
            copydefault(22);
        }
        super.AEQbTJ(interfaceC56679yOh, interfaceC56679yOh2, list, list2, list3, abstractC59233zdF, modality, ync);
        if (map != null && !map.isEmpty()) {
            this.AuCTelauCTel = new LinkedHashMap(map);
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.AbstractC56718yPt, o.yNG
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56687yOp ejfBZ() {
        InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) super.ejfBZ();
        if (interfaceC56687yOp == null) {
            copydefault(24);
        }
        return interfaceC56687yOp;
    }

    @Override // o.AbstractC56718yPt
    public AbstractC56718yPt KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            copydefault(25);
        }
        if (kind == null) {
            copydefault(26);
        }
        if (yol == null) {
            copydefault(27);
        }
        if (interfaceC56686yOo == null) {
            copydefault(28);
        }
        InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) yng;
        if (c56935yXu == null) {
            c56935yXu = bR_();
        }
        return new yPK(interfaceC56665yNu, interfaceC56687yOp, yol, c56935yXu, kind, interfaceC56686yOo);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lo/yNG; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // o.AbstractC56718yPt, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: AEQbTJ */
    public InterfaceC56687yOp OLrzqt(InterfaceC56665yNu interfaceC56665yNu, Modality modality, yNC ync, CallableMemberDescriptor.Kind kind, boolean z) {
        InterfaceC56687yOp interfaceC56687yOp = (InterfaceC56687yOp) super.OLrzqt(interfaceC56665yNu, modality, ync, kind, z);
        if (interfaceC56687yOp == null) {
            copydefault(29);
        }
        return interfaceC56687yOp;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yNG$StateListAnimator<? extends o.yNG>, o.yNG$StateListAnimator<? extends o.yOp> */
    @Override // o.AbstractC56718yPt, o.yNG
    public yNG.StateListAnimator<? extends InterfaceC56687yOp> sSMYrx() {
        yNG.StateListAnimator stateListAnimatorSSMYrx = super.sSMYrx();
        if (stateListAnimatorSSMYrx == null) {
            copydefault(30);
        }
        return stateListAnimatorSSMYrx;
    }
}
