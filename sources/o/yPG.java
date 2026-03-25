package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import o.InterfaceC56657yNm;
import o.yNG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yPG extends AbstractC56709yPk implements InterfaceC56677yOf {
    public final boolean AEQbTJ;
    public final boolean AhwBna;
    public yNC DbNXlk;
    public final InterfaceC56676yOe EZpvd;
    public yNG OLrzqt;
    public boolean copydefault;
    public final CallableMemberDescriptor.Kind djBIcL;
    public final Modality valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(str2);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // o.InterfaceC56657yNm
    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(yNG yng) {
        this.OLrzqt = yng;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56677yOf
    public boolean AuCTel() {
        return this.copydefault;
    }

    @Override // o.yNG
    public boolean AuCTelauCTel() {
        return false;
    }

    @Override // o.yNG
    public boolean AubY() {
        return false;
    }

    @Override // o.yNG
    public boolean AwvSrB() {
        return false;
    }

    @Override // o.yNG
    public boolean AxsJAY() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public boolean EZpvd() {
        return this.AhwBna;
    }

    @Override // o.yNG
    public boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    public yNG KWHzl(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            EZpvd(7);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(yNC ync) {
        this.DbNXlk = ync;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void copydefault(@NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            EZpvd(16);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    /* JADX DEBUG: Method merged with bridge method: iwGUEr()Lo/yNG; */
    @Override // o.yNG
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract InterfaceC56677yOf fJNWhG();

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public yNG uzCIH() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC56657yNm
    public boolean values() {
        return false;
    }

    @Override // o.yNG
    public boolean wlaJM() {
        return false;
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean zsXlph() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPG(@NotNull Modality modality, @NotNull yNC ync, @NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, boolean z, boolean z2, boolean z3, CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56676yOe.AuCTel(), yol, c56935yXu, interfaceC56686yOo);
        if (modality == null) {
            EZpvd(0);
        }
        if (ync == null) {
            EZpvd(1);
        }
        if (interfaceC56676yOe == null) {
            EZpvd(2);
        }
        if (yol == null) {
            EZpvd(3);
        }
        if (c56935yXu == null) {
            EZpvd(4);
        }
        if (interfaceC56686yOo == null) {
            EZpvd(5);
        }
        this.OLrzqt = null;
        this.valueOf = modality;
        this.DbNXlk = ync;
        this.EZpvd = interfaceC56676yOe;
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.AhwBna = z3;
        this.djBIcL = kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind bW_() {
        CallableMemberDescriptor.Kind kind = this.djBIcL;
        if (kind == null) {
            EZpvd(6);
        }
        return kind;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            EZpvd(9);
        }
        return listEmptyList;
    }

    @Override // o.yNJ
    public Modality isConnected() {
        Modality modality = this.valueOf;
        if (modality == null) {
            EZpvd(10);
        }
        return modality;
    }

    @Override // o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = this.DbNXlk;
        if (ync == null) {
            EZpvd(11);
        }
        return ync;
    }

    @Override // o.InterfaceC56677yOf
    public InterfaceC56676yOe fIwbmz() {
        InterfaceC56676yOe interfaceC56676yOe = this.EZpvd;
        if (interfaceC56676yOe == null) {
            EZpvd(13);
        }
        return interfaceC56676yOe;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56679yOh> OLrzqt() {
        java.util.List<InterfaceC56679yOh> listOLrzqt = fIwbmz().OLrzqt();
        if (listOLrzqt == null) {
            EZpvd(14);
        }
        return listOLrzqt;
    }

    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh djBIcL() {
        return fIwbmz().djBIcL();
    }

    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh AEQbTJ() {
        return fIwbmz().AEQbTJ();
    }

    @Override // o.yNG
    public yNG.StateListAnimator<? extends yNG> sSMYrx() {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC56677yOf OLrzqt(InterfaceC56665yNu interfaceC56665yNu, Modality modality, yNC ync, CallableMemberDescriptor.Kind kind, boolean z) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public java.util.Collection<InterfaceC56677yOf> AEQbTJ(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (InterfaceC56676yOe interfaceC56676yOe : fIwbmz().valueOf()) {
            yNG yngEjfBZ = z ? interfaceC56676yOe.ejfBZ() : interfaceC56676yOe.getFieldNames();
            if (yngEjfBZ != null) {
                arrayList.add(yngEjfBZ);
            }
        }
        return arrayList;
    }
}
