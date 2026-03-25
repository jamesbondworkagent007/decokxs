package o;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC56657yNm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPI extends yPW implements InterfaceC56676yOe {
    public yND AEQbTJ;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final boolean AuCTel;
    public final boolean DbNXlk;
    public yND EZpvd;
    public java.util.List<InterfaceC56679yOh> OLrzqt;
    public InterfaceC56679yOh copydefault;
    public yPL djBIcL;
    public final Modality ejfBZ;
    public final CallableMemberDescriptor.Kind fARcdN;
    public final InterfaceC56676yOe fIwbmz;
    public java.util.Collection<? extends InterfaceC56676yOe> fJNWhG;
    public final boolean fetchVPNInfo;
    public boolean getFieldNames;
    public yNC getNewProxyInstance;
    public InterfaceC56680yOi hDKMBd;
    public final boolean isConnected;
    public java.util.List<InterfaceC56691yOt> uzCIH;
    public InterfaceC56679yOh valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yPT, o.InterfaceC56657yNm
    public InterfaceC56679yOh AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOC
    public boolean AuCTelauCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56676yOe
    public yND EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull yNC ync) {
        if (ync == null) {
            OLrzqt(20);
        }
        this.getNewProxyInstance = ync;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void copydefault(@NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            OLrzqt(40);
        }
        this.fJNWhG = collection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(yPL ypl, InterfaceC56680yOi interfaceC56680yOi, yND ynd, yND ynd2) {
        this.djBIcL = ypl;
        this.hDKMBd = interfaceC56680yOi;
        this.EZpvd = ynd;
        this.AEQbTJ = ynd2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            OLrzqt(14);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yPT, o.InterfaceC56657yNm
    public InterfaceC56679yOh djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56676yOe
    public yND fIwbmz() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gHZMYf() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56676yOe
    public InterfaceC56680yOi getFieldNames() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean hDKMBd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOF
    public boolean sSMYrx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yPT, o.yOC
    public boolean wlaJM() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean zLjUOn() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean zsXlph() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/yOd; */
    @Override // o.InterfaceC56676yOe
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] */
    public yPL ejfBZ() {
        return this.djBIcL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPI(@NotNull InterfaceC56665yNu interfaceC56665yNu, InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(interfaceC56665yNu, yol, c56935yXu, null, z, interfaceC56686yOo);
        if (interfaceC56665yNu == null) {
            OLrzqt(0);
        }
        if (yol == null) {
            OLrzqt(1);
        }
        if (modality == null) {
            OLrzqt(2);
        }
        if (ync == null) {
            OLrzqt(3);
        }
        if (c56935yXu == null) {
            OLrzqt(4);
        }
        if (kind == null) {
            OLrzqt(5);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(6);
        }
        this.fJNWhG = null;
        this.OLrzqt = Collections.emptyList();
        this.ejfBZ = modality;
        this.getNewProxyInstance = ync;
        this.fIwbmz = interfaceC56676yOe == null ? this : interfaceC56676yOe;
        this.fARcdN = kind;
        this.AuCTel = z2;
        this.isConnected = z3;
        this.DbNXlk = z4;
        this.AhwBna = z5;
        this.fetchVPNInfo = z6;
        this.AkhnZx = z7;
    }

    public static yPI KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull Modality modality, @NotNull yNC ync, boolean z, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (interfaceC56665yNu == null) {
            OLrzqt(7);
        }
        if (yol == null) {
            OLrzqt(8);
        }
        if (modality == null) {
            OLrzqt(9);
        }
        if (ync == null) {
            OLrzqt(10);
        }
        if (c56935yXu == null) {
            OLrzqt(11);
        }
        if (kind == null) {
            OLrzqt(12);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(13);
        }
        return new yPI(interfaceC56665yNu, null, yol, modality, ync, z, c56935yXu, kind, interfaceC56686yOo, z2, z3, z4, z5, z6, z7);
    }

    public void AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull java.util.List<? extends InterfaceC56691yOt> list, InterfaceC56679yOh interfaceC56679yOh, InterfaceC56679yOh interfaceC56679yOh2, @NotNull java.util.List<InterfaceC56679yOh> list2) {
        if (abstractC59233zdF == null) {
            OLrzqt(17);
        }
        if (list == null) {
            OLrzqt(18);
        }
        if (list2 == null) {
            OLrzqt(19);
        }
        AEQbTJ(abstractC59233zdF);
        this.uzCIH = new java.util.ArrayList(list);
        this.valueOf = interfaceC56679yOh2;
        this.copydefault = interfaceC56679yOh;
        this.OLrzqt = list2;
    }

    public void AEQbTJ(yPL ypl, InterfaceC56680yOi interfaceC56680yOi) {
        copydefault(ypl, interfaceC56680yOi, null, null);
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> list = this.uzCIH;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public java.util.List<InterfaceC56679yOh> OLrzqt() {
        java.util.List<InterfaceC56679yOh> list = this.OLrzqt;
        if (list == null) {
            OLrzqt(22);
        }
        return list;
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public AbstractC59233zdF gEmmrt() {
        AbstractC59233zdF abstractC59233zdFUzCIH = uzCIH();
        if (abstractC59233zdFUzCIH == null) {
            OLrzqt(23);
        }
        return abstractC59233zdFUzCIH;
    }

    @Override // o.yNJ
    public Modality isConnected() {
        Modality modality = this.ejfBZ;
        if (modality == null) {
            OLrzqt(24);
        }
        return modality;
    }

    @Override // o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = this.getNewProxyInstance;
        if (ync == null) {
            OLrzqt(25);
        }
        return ync;
    }

    @Override // o.InterfaceC56676yOe
    public java.util.List<InterfaceC56677yOf> KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        yPL ypl = this.djBIcL;
        if (ypl != null) {
            arrayList.add(ypl);
        }
        InterfaceC56680yOi interfaceC56680yOi = this.hDKMBd;
        if (interfaceC56680yOi != null) {
            arrayList.add(interfaceC56680yOi);
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yOC; */
    @Override // o.yOC
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56676yOe copydefault(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            OLrzqt(27);
        }
        return typeSubstitutor.EZpvd() ? this : AxsJAY().KWHzl(typeSubstitutor.KWHzl()).OLrzqt((CallableMemberDescriptor) AhwBna()).AEQbTJ();
    }

    public class TaskDescription {
        public CallableMemberDescriptor.Kind AEQbTJ;
        public yNC DbNXlk;
        public InterfaceC56679yOh EZpvd;
        public C56935yXu KWHzl;
        public Modality copydefault;
        public AbstractC59233zdF djBIcL;
        public InterfaceC56665yNu valueOf;
        public InterfaceC56676yOe AYXKKw = null;
        public boolean gEmmrt = false;
        public AbstractC59325zes fetchVPNInfo = AbstractC59325zes.valueOf;
        public boolean OLrzqt = true;
        public java.util.List<InterfaceC56691yOt> AhwBna = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void KWHzl(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription AEQbTJ(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                KWHzl(10);
            }
            this.AEQbTJ = kind;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription AEQbTJ(@NotNull Modality modality) {
            if (modality == null) {
                KWHzl(6);
            }
            this.copydefault = modality;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription AEQbTJ(boolean z) {
            this.OLrzqt = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription EZpvd(@NotNull yNC ync) {
            if (ync == null) {
                KWHzl(8);
            }
            this.DbNXlk = ync;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription KWHzl(@NotNull AbstractC59325zes abstractC59325zes) {
            if (abstractC59325zes == null) {
                KWHzl(15);
            }
            this.fetchVPNInfo = abstractC59325zes;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription OLrzqt(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
            if (interfaceC56665yNu == null) {
                KWHzl(0);
            }
            this.valueOf = interfaceC56665yNu;
            return this;
        }

        public TaskDescription() {
            this.valueOf = yPI.this.AuCTel();
            this.copydefault = yPI.this.isConnected();
            this.DbNXlk = yPI.this.getNewProxyInstance();
            this.AEQbTJ = yPI.this.bW_();
            this.EZpvd = yPI.this.copydefault;
            this.KWHzl = yPI.this.bR_();
            this.djBIcL = yPI.this.uzCIH();
        }

        public TaskDescription OLrzqt(CallableMemberDescriptor callableMemberDescriptor) {
            this.AYXKKw = (InterfaceC56676yOe) callableMemberDescriptor;
            return this;
        }

        public InterfaceC56676yOe AEQbTJ() {
            return yPI.this.AEQbTJ(this);
        }

        public InterfaceC56675yOd EZpvd() {
            InterfaceC56676yOe interfaceC56676yOe = this.AYXKKw;
            if (interfaceC56676yOe == null) {
                return null;
            }
            return interfaceC56676yOe.ejfBZ();
        }

        public InterfaceC56680yOi OLrzqt() {
            InterfaceC56676yOe interfaceC56676yOe = this.AYXKKw;
            if (interfaceC56676yOe == null) {
                return null;
            }
            return interfaceC56676yOe.getFieldNames();
        }
    }

    public TaskDescription AxsJAY() {
        return new TaskDescription();
    }

    public final InterfaceC56686yOo EZpvd(boolean z, InterfaceC56676yOe interfaceC56676yOe) {
        InterfaceC56686yOo interfaceC56686yOoFARcdN;
        if (z) {
            if (interfaceC56676yOe == null) {
                interfaceC56676yOe = AhwBna();
            }
            interfaceC56686yOoFARcdN = interfaceC56676yOe.fARcdN();
        } else {
            interfaceC56686yOoFARcdN = InterfaceC56686yOo.copydefault;
        }
        if (interfaceC56686yOoFARcdN == null) {
            OLrzqt(28);
        }
        return interfaceC56686yOoFARcdN;
    }

    public InterfaceC56676yOe AEQbTJ(@NotNull TaskDescription taskDescription) {
        InterfaceC56679yOh interfaceC56679yOh;
        Function0<InterfaceC59180zcF<AbstractC56975yZg<?>>> function0;
        if (taskDescription == null) {
            OLrzqt(29);
        }
        yPI ypiAEQbTJ = AEQbTJ(taskDescription.valueOf, taskDescription.copydefault, taskDescription.DbNXlk, taskDescription.AYXKKw, taskDescription.AEQbTJ, taskDescription.KWHzl, EZpvd(taskDescription.gEmmrt, taskDescription.AYXKKw));
        java.util.List<InterfaceC56691yOt> listAkhnZx = taskDescription.AhwBna == null ? AkhnZx() : taskDescription.AhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList(listAkhnZx.size());
        TypeSubstitutor typeSubstitutorAEQbTJ = C59268zdo.AEQbTJ(listAkhnZx, taskDescription.fetchVPNInfo, ypiAEQbTJ, arrayList);
        AbstractC59233zdF abstractC59233zdF = taskDescription.djBIcL;
        AbstractC59233zdF abstractC59233zdFOLrzqt = typeSubstitutorAEQbTJ.OLrzqt(abstractC59233zdF, Variance.OUT_VARIANCE);
        if (abstractC59233zdFOLrzqt == null) {
            return null;
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt2 = typeSubstitutorAEQbTJ.OLrzqt(abstractC59233zdF, Variance.IN_VARIANCE);
        if (abstractC59233zdFOLrzqt2 != null) {
            ypiAEQbTJ.copydefault(abstractC59233zdFOLrzqt2);
        }
        InterfaceC56679yOh interfaceC56679yOh2 = taskDescription.EZpvd;
        if (interfaceC56679yOh2 != null) {
            InterfaceC56679yOh interfaceC56679yOhKWHzl = interfaceC56679yOh2.KWHzl(typeSubstitutorAEQbTJ);
            if (interfaceC56679yOhKWHzl == null) {
                return null;
            }
            interfaceC56679yOh = interfaceC56679yOhKWHzl;
        } else {
            interfaceC56679yOh = null;
        }
        InterfaceC56679yOh interfaceC56679yOh3 = this.valueOf;
        InterfaceC56679yOh interfaceC56679yOhCopydefault = interfaceC56679yOh3 != null ? copydefault(typeSubstitutorAEQbTJ, ypiAEQbTJ, interfaceC56679yOh3) : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<InterfaceC56679yOh> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            InterfaceC56679yOh interfaceC56679yOhAEQbTJ = AEQbTJ(typeSubstitutorAEQbTJ, ypiAEQbTJ, it.next());
            if (interfaceC56679yOhAEQbTJ != null) {
                arrayList2.add(interfaceC56679yOhAEQbTJ);
            }
        }
        ypiAEQbTJ.AEQbTJ(abstractC59233zdFOLrzqt, arrayList, interfaceC56679yOh, interfaceC56679yOhCopydefault, arrayList2);
        yPL ypl = this.djBIcL;
        yPL ypl2 = ypl == null ? null : new yPL(ypiAEQbTJ, ypl.copydefault(), taskDescription.copydefault, KWHzl(this.djBIcL.getNewProxyInstance(), taskDescription.AEQbTJ), this.djBIcL.AuCTel(), this.djBIcL.zsXlph(), this.djBIcL.EZpvd(), taskDescription.AEQbTJ, taskDescription.EZpvd(), InterfaceC56686yOo.copydefault);
        if (ypl2 != null) {
            AbstractC59233zdF abstractC59233zdFGEmmrt = this.djBIcL.gEmmrt();
            ypl2.AEQbTJ(KWHzl(typeSubstitutorAEQbTJ, this.djBIcL));
            ypl2.OLrzqt(abstractC59233zdFGEmmrt != null ? typeSubstitutorAEQbTJ.OLrzqt(abstractC59233zdFGEmmrt, Variance.OUT_VARIANCE) : null);
        }
        InterfaceC56680yOi interfaceC56680yOi = this.hDKMBd;
        yPN ypn = interfaceC56680yOi == null ? null : new yPN(ypiAEQbTJ, interfaceC56680yOi.copydefault(), taskDescription.copydefault, KWHzl(this.hDKMBd.getNewProxyInstance(), taskDescription.AEQbTJ), this.hDKMBd.AuCTel(), this.hDKMBd.zsXlph(), this.hDKMBd.EZpvd(), taskDescription.AEQbTJ, taskDescription.OLrzqt(), InterfaceC56686yOo.copydefault);
        if (ypn != null) {
            java.util.List<InterfaceC56695yOx> listCopydefault = AbstractC56718yPt.copydefault(ypn, this.hDKMBd.fetchVPNInfo(), typeSubstitutorAEQbTJ, false, false, null);
            if (listCopydefault == null) {
                ypiAEQbTJ.EZpvd(true);
                listCopydefault = Collections.singletonList(yPN.AEQbTJ(ypn, yZE.AEQbTJ(taskDescription.valueOf).getFieldNames(), this.hDKMBd.fetchVPNInfo().get(0).copydefault()));
            }
            if (listCopydefault.size() != 1) {
                throw new java.lang.IllegalStateException();
            }
            ypn.AEQbTJ(KWHzl(typeSubstitutorAEQbTJ, this.hDKMBd));
            ypn.OLrzqt(listCopydefault.get(0));
        }
        yND ynd = this.EZpvd;
        C56715yPq c56715yPq = ynd == null ? null : new C56715yPq(ynd.copydefault(), ypiAEQbTJ);
        yND ynd2 = this.AEQbTJ;
        ypiAEQbTJ.copydefault(ypl2, ypn, c56715yPq, ynd2 != null ? new C56715yPq(ynd2.copydefault(), ypiAEQbTJ) : null);
        if (taskDescription.OLrzqt) {
            C59388zgB c59388zgBCopydefault = C59388zgB.copydefault();
            java.util.Iterator<? extends InterfaceC56676yOe> it2 = valueOf().iterator();
            while (it2.hasNext()) {
                c59388zgBCopydefault.add(it2.next().copydefault(typeSubstitutorAEQbTJ));
            }
            ypiAEQbTJ.copydefault(c59388zgBCopydefault);
        }
        if (wlaJM() && (function0 = this.AuCTelauCTel) != null) {
            ypiAEQbTJ.OLrzqt(this.AubY, function0);
        }
        return ypiAEQbTJ;
    }

    public static yNC KWHzl(yNC ync, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && C56669yNy.EZpvd(ync.KWHzl())) ? C56669yNy.valueOf : ync;
    }

    public static InterfaceC56679yOh copydefault(TypeSubstitutor typeSubstitutor, InterfaceC56676yOe interfaceC56676yOe, InterfaceC56679yOh interfaceC56679yOh) {
        AbstractC59233zdF abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(interfaceC56679yOh.uzCIH(), Variance.IN_VARIANCE);
        if (abstractC59233zdFOLrzqt == null) {
            return null;
        }
        return new yPM(interfaceC56676yOe, new C59113zas(interfaceC56676yOe, abstractC59233zdFOLrzqt, interfaceC56679yOh.KWHzl()), interfaceC56679yOh.copydefault());
    }

    public static InterfaceC56679yOh AEQbTJ(TypeSubstitutor typeSubstitutor, InterfaceC56676yOe interfaceC56676yOe, InterfaceC56679yOh interfaceC56679yOh) {
        AbstractC59233zdF abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(interfaceC56679yOh.uzCIH(), Variance.IN_VARIANCE);
        if (abstractC59233zdFOLrzqt == null) {
            return null;
        }
        return new yPM(interfaceC56676yOe, new C59114zat(interfaceC56676yOe, abstractC59233zdFOLrzqt, ((InterfaceC59119zay) interfaceC56679yOh.KWHzl()).EZpvd(), interfaceC56679yOh.KWHzl()), interfaceC56679yOh.copydefault());
    }

    public static yNG KWHzl(@NotNull TypeSubstitutor typeSubstitutor, @NotNull InterfaceC56677yOf interfaceC56677yOf) {
        if (typeSubstitutor == null) {
            OLrzqt(30);
        }
        if (interfaceC56677yOf == null) {
            OLrzqt(31);
        }
        if (interfaceC56677yOf.uzCIH() != null) {
            return interfaceC56677yOf.uzCIH().OLrzqt(typeSubstitutor);
        }
        return null;
    }

    public yPI AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull Modality modality, @NotNull yNC ync, InterfaceC56676yOe interfaceC56676yOe, @NotNull CallableMemberDescriptor.Kind kind, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56665yNu == null) {
            OLrzqt(32);
        }
        if (modality == null) {
            OLrzqt(33);
        }
        if (ync == null) {
            OLrzqt(34);
        }
        if (kind == null) {
            OLrzqt(35);
        }
        if (c56935yXu == null) {
            OLrzqt(36);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(37);
        }
        return new yPI(interfaceC56665yNu, interfaceC56676yOe, copydefault(), modality, ync, AubY(), c56935yXu, kind, interfaceC56686yOo, AuCTelauCTel(), wlaJM(), zLjUOn(), hDKMBd(), zsXlph(), sSMYrx());
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.AEQbTJ(this, d);
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: AwvSrB()Lo/yOC; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56676yOe fJNWhG() {
        InterfaceC56676yOe interfaceC56676yOe = this.fIwbmz;
        InterfaceC56676yOe interfaceC56676yOeBT_ = interfaceC56676yOe == this ? this : interfaceC56676yOe.AhwBna();
        if (interfaceC56676yOeBT_ == null) {
            OLrzqt(38);
        }
        return interfaceC56676yOeBT_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind bW_() {
        CallableMemberDescriptor.Kind kind = this.fARcdN;
        if (kind == null) {
            OLrzqt(39);
        }
        return kind;
    }

    @Override // o.yPT, o.InterfaceC56657yNm
    public java.util.Collection<? extends InterfaceC56676yOe> valueOf() {
        java.util.Collection<? extends InterfaceC56676yOe> collectionEmptyList = this.fJNWhG;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            OLrzqt(41);
        }
        return collectionEmptyList;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC56676yOe OLrzqt(InterfaceC56665yNu interfaceC56665yNu, Modality modality, yNC ync, CallableMemberDescriptor.Kind kind, boolean z) {
        InterfaceC56676yOe interfaceC56676yOeAEQbTJ = AxsJAY().OLrzqt(interfaceC56665yNu).OLrzqt((CallableMemberDescriptor) null).AEQbTJ(modality).EZpvd(ync).AEQbTJ(kind).AEQbTJ(z).AEQbTJ();
        if (interfaceC56676yOeAEQbTJ == null) {
            OLrzqt(42);
        }
        return interfaceC56676yOeAEQbTJ;
    }
}
