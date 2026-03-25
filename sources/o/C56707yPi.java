package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56707yPi extends AbstractC56718yPt implements InterfaceC56656yNl {
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56718yPt, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void copydefault(@NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            EZpvd(22);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56660yNp
    public boolean getFieldNames() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56707yPi(@NotNull InterfaceC56658yNn interfaceC56658yNn, InterfaceC56660yNp interfaceC56660yNp, @NotNull yOL yol, boolean z, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56658yNn, interfaceC56660yNp, yol, C56938yXx.valueOf, kind, interfaceC56686yOo);
        if (interfaceC56658yNn == null) {
            EZpvd(0);
        }
        if (yol == null) {
            EZpvd(1);
        }
        if (kind == null) {
            EZpvd(2);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(3);
        }
        this.EZpvd = z;
    }

    public static C56707yPi copydefault(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull yOL yol, boolean z, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56658yNn == null) {
            EZpvd(4);
        }
        if (yol == null) {
            EZpvd(5);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(6);
        }
        return new C56707yPi(interfaceC56658yNn, null, yol, z, CallableMemberDescriptor.Kind.DECLARATION, interfaceC56686yOo);
    }

    public C56707yPi EZpvd(@NotNull java.util.List<InterfaceC56695yOx> list, @NotNull yNC ync, @NotNull java.util.List<InterfaceC56691yOt> list2) {
        if (list == null) {
            EZpvd(10);
        }
        if (ync == null) {
            EZpvd(11);
        }
        if (list2 == null) {
            EZpvd(12);
        }
        super.AEQbTJ(null, gHZMYf(), zuBGHE(), list2, list, null, Modality.FINAL, ync);
        return this;
    }

    public C56707yPi AEQbTJ(@NotNull java.util.List<InterfaceC56695yOx> list, @NotNull yNC ync) {
        if (list == null) {
            EZpvd(13);
        }
        if (ync == null) {
            EZpvd(14);
        }
        EZpvd(list, ync, AuCTel().AkhnZx());
        return this;
    }

    public InterfaceC56679yOh gHZMYf() {
        InterfaceC56658yNn interfaceC56658yNnAuCTel = AuCTel();
        if (!interfaceC56658yNnAuCTel.gHZMYf()) {
            return null;
        }
        InterfaceC56665yNu interfaceC56665yNuAuCTel = interfaceC56658yNnAuCTel.AuCTel();
        if (interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn) {
            return ((InterfaceC56658yNn) interfaceC56665yNuAuCTel).DTwDnp();
        }
        return null;
    }

    public final java.util.List<InterfaceC56679yOh> zuBGHE() {
        InterfaceC56658yNn interfaceC56658yNnAuCTel = AuCTel();
        if (!interfaceC56658yNnAuCTel.AxsJAY().isEmpty()) {
            java.util.List<InterfaceC56679yOh> listAxsJAY = interfaceC56658yNnAuCTel.AxsJAY();
            if (listAxsJAY == null) {
                EZpvd(15);
            }
            return listAxsJAY;
        }
        java.util.List<InterfaceC56679yOh> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(16);
        }
        return listEmptyList;
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: AuCTel()Lo/yNo; */
    @Override // o.InterfaceC56660yNp
    /* JADX INFO: renamed from: QOLQEE, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn AuCTel() {
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) super.AuCTel();
        if (interfaceC56658yNn == null) {
            EZpvd(17);
        }
        return interfaceC56658yNn;
    }

    @Override // o.InterfaceC56660yNp
    public InterfaceC56658yNn fIwbmz() {
        InterfaceC56658yNn interfaceC56658yNnAuCTel = AuCTel();
        if (interfaceC56658yNnAuCTel == null) {
            EZpvd(18);
        }
        return interfaceC56658yNnAuCTel;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.AbstractC56718yPt, o.yNG
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56656yNl bT_() {
        InterfaceC56656yNl interfaceC56656yNl = (InterfaceC56656yNl) super.bT_();
        if (interfaceC56656yNl == null) {
            EZpvd(19);
        }
        return interfaceC56656yNl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNp; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNG; */
    @Override // o.AbstractC56718yPt, o.yNG
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56656yNl OLrzqt(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            EZpvd(20);
        }
        return (InterfaceC56656yNl) super.OLrzqt(typeSubstitutor);
    }

    @Override // o.AbstractC56718yPt, o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.EZpvd(this, d);
    }

    @Override // o.AbstractC56718yPt, o.yNG, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, o.InterfaceC56657yNm
    public java.util.Collection<? extends yNG> valueOf() {
        java.util.Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            EZpvd(21);
        }
        return setEmptySet;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/yNu;Lo/yNG;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Lo/yXu;Lo/yOL;Lo/yOo;)Lo/yPt; */
    @Override // o.AbstractC56718yPt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C56707yPi KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            EZpvd(23);
        }
        if (kind == null) {
            EZpvd(24);
        }
        if (yol == null) {
            EZpvd(25);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(26);
        }
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2 && kind != CallableMemberDescriptor.Kind.SYNTHESIZED) {
            throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC56665yNu + "\nkind: " + kind);
        }
        return new C56707yPi((InterfaceC56658yNn) interfaceC56665yNu, this, yol, this.EZpvd, kind2, interfaceC56686yOo);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lo/yNG; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // o.AbstractC56718yPt, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC56656yNl OLrzqt(InterfaceC56665yNu interfaceC56665yNu, Modality modality, yNC ync, CallableMemberDescriptor.Kind kind, boolean z) {
        InterfaceC56656yNl interfaceC56656yNl = (InterfaceC56656yNl) super.OLrzqt(interfaceC56665yNu, modality, ync, kind, z);
        if (interfaceC56656yNl == null) {
            EZpvd(27);
        }
        return interfaceC56656yNl;
    }
}
