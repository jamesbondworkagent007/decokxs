package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.InterfaceC56657yNm;
import o.yNG;
import o.yPP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56718yPt extends AbstractC56709yPk implements yNG {
    public java.util.List<InterfaceC56679yOh> AEQbTJ;
    public boolean AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public java.util.Map<InterfaceC56657yNm.Application<?>, java.lang.Object> AuCTelauCTel;
    public java.util.Collection<? extends yNG> AubY;
    public boolean DbNXlk;
    public InterfaceC56679yOh OLrzqt;
    public InterfaceC56679yOh copydefault;
    public boolean djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public final yNG getFieldNames;
    public volatile Function0<java.util.Collection<yNG>> getNewProxyInstance;
    public boolean hDKMBd;
    public boolean isConnected;
    public final CallableMemberDescriptor.Kind iwGUEr;
    public Modality uzCIH;
    public yNG valueOf;
    public AbstractC59233zdF wlaJM;
    public java.util.List<InterfaceC56695yOx> zLjUOn;
    public java.util.List<InterfaceC56691yOt> zsXlph;
    public yNC zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void EZpvd(yNG yng) {
        this.valueOf = yng;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void OLrzqt(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
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
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new java.lang.IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AYXKKw(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public boolean AubY() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public boolean AxsJAY() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DTwDnp() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull yNC ync) {
        if (ync == null) {
            OLrzqt(10);
        }
        this.zuBGHE = ync;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            OLrzqt(11);
        }
        this.wlaJM = abstractC59233zdF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.fJNWhG;
    }

    public abstract AbstractC56718yPt KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull CallableMemberDescriptor.Kind kind, C56935yXu c56935yXu, @NotNull yOL yol, @NotNull InterfaceC56686yOo interfaceC56686yOo);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56657yNm
    public InterfaceC56679yOh djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.fetchVPNInfo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC59233zdF gEmmrt() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(boolean z) {
        this.fIwbmz = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean hDKMBd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isConnected(boolean z) {
        this.hDKMBd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public yNG uzCIH() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void valueOf(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void values(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean values() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNG
    public boolean wlaJM() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ
    public boolean zLjUOn() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zsXlph() {
        return this.DbNXlk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56718yPt(@NotNull InterfaceC56665yNu interfaceC56665yNu, yNG yng, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull CallableMemberDescriptor.Kind kind, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        super(interfaceC56665yNu, yol, c56935yXu, interfaceC56686yOo);
        if (interfaceC56665yNu == null) {
            OLrzqt(0);
        }
        if (yol == null) {
            OLrzqt(1);
        }
        if (c56935yXu == null) {
            OLrzqt(2);
        }
        if (kind == null) {
            OLrzqt(3);
        }
        if (interfaceC56686yOo == null) {
            OLrzqt(4);
        }
        this.zuBGHE = C56669yNy.fIwbmz;
        this.ejfBZ = false;
        this.fIwbmz = false;
        this.DbNXlk = false;
        this.fJNWhG = false;
        this.hDKMBd = false;
        this.isConnected = false;
        this.AkhnZx = false;
        this.fARcdN = false;
        this.fetchVPNInfo = false;
        this.AuCTel = false;
        this.AhwBna = true;
        this.djBIcL = false;
        this.AubY = null;
        this.getNewProxyInstance = null;
        this.valueOf = null;
        this.AuCTelauCTel = null;
        this.getFieldNames = yng == null ? this : yng;
        this.iwGUEr = kind;
    }

    public AbstractC56718yPt AEQbTJ(InterfaceC56679yOh interfaceC56679yOh, InterfaceC56679yOh interfaceC56679yOh2, @NotNull java.util.List<InterfaceC56679yOh> list, @NotNull java.util.List<? extends InterfaceC56691yOt> list2, @NotNull java.util.List<InterfaceC56695yOx> list3, AbstractC59233zdF abstractC59233zdF, Modality modality, @NotNull yNC ync) {
        if (list == null) {
            OLrzqt(5);
        }
        if (list2 == null) {
            OLrzqt(6);
        }
        if (list3 == null) {
            OLrzqt(7);
        }
        if (ync == null) {
            OLrzqt(8);
        }
        this.zsXlph = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list2);
        this.zLjUOn = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list3);
        this.wlaJM = abstractC59233zdF;
        this.uzCIH = modality;
        this.zuBGHE = ync;
        this.copydefault = interfaceC56679yOh;
        this.OLrzqt = interfaceC56679yOh2;
        this.AEQbTJ = list;
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC56691yOt interfaceC56691yOt = list2.get(i);
            if (interfaceC56691yOt.AEQbTJ() != i) {
                throw new java.lang.IllegalStateException(interfaceC56691yOt + " index is " + interfaceC56691yOt.AEQbTJ() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            InterfaceC56695yOx interfaceC56695yOx = list3.get(i2);
            if (interfaceC56695yOx.isConnected() != i2) {
                throw new java.lang.IllegalStateException(interfaceC56695yOx + "index is " + interfaceC56695yOx.isConnected() + " but position is " + i2);
            }
        }
        return this;
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56679yOh> OLrzqt() {
        java.util.List<InterfaceC56679yOh> list = this.AEQbTJ;
        if (list == null) {
            OLrzqt(13);
        }
        return list;
    }

    public java.util.Collection<? extends yNG> valueOf() {
        ORxRYg();
        java.util.Collection<? extends yNG> collectionEmptyList = this.AubY;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            OLrzqt(14);
        }
        return collectionEmptyList;
    }

    public final void ORxRYg() {
        Function0<java.util.Collection<yNG>> function0 = this.getNewProxyInstance;
        if (function0 != null) {
            this.AubY = function0.invoke();
            this.getNewProxyInstance = null;
        }
    }

    @Override // o.yNJ
    public Modality isConnected() {
        Modality modality = this.uzCIH;
        if (modality == null) {
            OLrzqt(15);
        }
        return modality;
    }

    @Override // o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = this.zuBGHE;
        if (ync == null) {
            OLrzqt(16);
        }
        return ync;
    }

    @Override // o.yNG
    public boolean AwvSrB() {
        if (this.ejfBZ) {
            return true;
        }
        java.util.Iterator<? extends yNG> it = ejfBZ().valueOf().iterator();
        while (it.hasNext()) {
            if (it.next().AwvSrB()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.yNG
    public boolean AuCTelauCTel() {
        if (this.fIwbmz) {
            return true;
        }
        java.util.Iterator<? extends yNG> it = ejfBZ().valueOf().iterator();
        while (it.hasNext()) {
            if (it.next().AuCTelauCTel()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC56657yNm
    public <V> V AEQbTJ(InterfaceC56657yNm.Application<V> application) {
        java.util.Map<InterfaceC56657yNm.Application<?>, java.lang.Object> map = this.AuCTelauCTel;
        if (map == null) {
            return null;
        }
        return (V) map.get(application);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(@NotNull java.util.Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            OLrzqt(17);
        }
        this.AubY = collection;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((yNG) it.next()).AubY()) {
                this.fetchVPNInfo = true;
                return;
            }
        }
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> list = this.zsXlph;
        if (list != null) {
            return list;
        }
        throw new java.lang.IllegalStateException("typeParameters == null for " + this);
    }

    @Override // o.InterfaceC56657yNm
    public java.util.List<InterfaceC56695yOx> fetchVPNInfo() {
        java.util.List<InterfaceC56695yOx> list = this.zLjUOn;
        if (list == null) {
            OLrzqt(19);
        }
        return list;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Lo/yNm; */
    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: iwGUEr, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public yNG ejfBZ() {
        yNG yng = this.getFieldNames;
        yNG yngBT_ = yng == this ? this : yng.ejfBZ();
        if (yngBT_ == null) {
            OLrzqt(20);
        }
        return yngBT_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind bW_() {
        CallableMemberDescriptor.Kind kind = this.iwGUEr;
        if (kind == null) {
            OLrzqt(21);
        }
        return kind;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    public yNG KWHzl(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            OLrzqt(22);
        }
        return typeSubstitutor.EZpvd() ? this : copydefault(typeSubstitutor).KWHzl(ejfBZ()).EZpvd().OLrzqt(true).AEQbTJ();
    }

    /* JADX INFO: renamed from: o.yPt$StateListAnimator */
    public class StateListAnimator implements yNG.StateListAnimator<yNG> {
        public yOL AEQbTJ;
        public CallableMemberDescriptor.Kind AYXKKw;
        public boolean AhwBna;
        public InterfaceC56679yOh AkhnZx;
        public boolean AuCTel;
        public AbstractC59233zdF DbNXlk;
        public boolean EZpvd;
        public boolean KWHzl;
        public InterfaceC56679yOh OLrzqt;
        public boolean copydefault;
        public boolean djBIcL;
        public java.util.List<InterfaceC56695yOx> ejfBZ;
        public java.util.List<InterfaceC56691yOt> fARcdN;
        public yNG fIwbmz;
        public yNC fJNWhG;
        public java.lang.Boolean fetchVPNInfo;
        public java.util.List<InterfaceC56679yOh> gEmmrt;
        public AbstractC59325zes getFieldNames;
        public java.util.Map<InterfaceC56657yNm.Application<?>, java.lang.Object> getNewProxyInstance;
        public boolean hDKMBd;
        public Modality isConnected;
        public final /* synthetic */ AbstractC56718yPt uzCIH;
        public C56935yXu valueOf;
        public InterfaceC56665yNu values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void KWHzl(int i) {
            java.lang.String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            java.lang.Object[] objArr = new java.lang.Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new java.lang.IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(@NotNull CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                KWHzl(14);
            }
            this.AYXKKw = kind;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Z)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public StateListAnimator KWHzl(boolean z) {
            this.EZpvd = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
        public StateListAnimator KWHzl() {
            this.KWHzl = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
        public StateListAnimator OLrzqt() {
            this.copydefault = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator EZpvd(@NotNull java.util.List<InterfaceC56695yOx> list) {
            if (list == null) {
                KWHzl(19);
            }
            this.ejfBZ = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yNC;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(@NotNull yNC ync) {
            if (ync == null) {
                KWHzl(12);
            }
            this.fJNWhG = ync;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yOL;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(@NotNull yOL yol) {
            if (yol == null) {
                KWHzl(35);
            }
            this.AEQbTJ = yol;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yOh;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator AEQbTJ(InterfaceC56679yOh interfaceC56679yOh) {
            this.OLrzqt = interfaceC56679yOh;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator KWHzl(@NotNull java.util.List<InterfaceC56691yOt> list) {
            if (list == null) {
                KWHzl(21);
            }
            this.fARcdN = list;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(@NotNull Modality modality) {
            if (modality == null) {
                KWHzl(10);
            }
            this.isConnected = modality;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yOh;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(InterfaceC56679yOh interfaceC56679yOh) {
            this.AkhnZx = interfaceC56679yOh;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lo/yXu;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault(@NotNull C56935yXu c56935yXu) {
            if (c56935yXu == null) {
                KWHzl(17);
            }
            this.valueOf = c56935yXu;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zdF;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
            if (abstractC59233zdF == null) {
                KWHzl(23);
            }
            this.DbNXlk = abstractC59233zdF;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator OLrzqt(boolean z) {
            this.AhwBna = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yNu;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
            if (interfaceC56665yNu == null) {
                KWHzl(8);
            }
            this.values = interfaceC56665yNu;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zes;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator EZpvd(@NotNull AbstractC59325zes abstractC59325zes) {
            if (abstractC59325zes == null) {
                KWHzl(37);
            }
            this.getFieldNames = abstractC59325zes;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
        public StateListAnimator copydefault() {
            this.djBIcL = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
        public StateListAnimator valueOf() {
            this.hDKMBd = true;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator EZpvd() {
            this.AuCTel = true;
            return this;
        }

        @Override // o.yNG.StateListAnimator
        public /* synthetic */ yNG.StateListAnimator OLrzqt(@NotNull java.util.List list) {
            return EZpvd((java.util.List<InterfaceC56695yOx>) list);
        }

        @Override // o.yNG.StateListAnimator
        public /* synthetic */ yNG.StateListAnimator copydefault(@NotNull java.util.List list) {
            return KWHzl((java.util.List<InterfaceC56691yOt>) list);
        }

        public StateListAnimator(@NotNull AbstractC56718yPt abstractC56718yPt, @NotNull AbstractC59325zes abstractC59325zes, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull Modality modality, @NotNull yNC ync, @NotNull CallableMemberDescriptor.Kind kind, @NotNull java.util.List<InterfaceC56695yOx> list, java.util.List<InterfaceC56679yOh> list2, @NotNull InterfaceC56679yOh interfaceC56679yOh, AbstractC59233zdF abstractC59233zdF, C56935yXu c56935yXu) {
            if (abstractC59325zes == null) {
                KWHzl(0);
            }
            if (interfaceC56665yNu == null) {
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
            if (list == null) {
                KWHzl(5);
            }
            if (list2 == null) {
                KWHzl(6);
            }
            if (abstractC59233zdF == null) {
                KWHzl(7);
            }
            this.uzCIH = abstractC56718yPt;
            this.fIwbmz = null;
            this.OLrzqt = abstractC56718yPt.OLrzqt;
            this.EZpvd = true;
            this.hDKMBd = false;
            this.AuCTel = false;
            this.KWHzl = false;
            this.djBIcL = abstractC56718yPt.wlaJM();
            this.fARcdN = null;
            this.AEQbTJ = null;
            this.copydefault = abstractC56718yPt.AubY();
            this.getNewProxyInstance = new LinkedHashMap();
            this.fetchVPNInfo = null;
            this.AhwBna = false;
            this.getFieldNames = abstractC59325zes;
            this.values = interfaceC56665yNu;
            this.isConnected = modality;
            this.fJNWhG = ync;
            this.AYXKKw = kind;
            this.ejfBZ = list;
            this.gEmmrt = list2;
            this.AkhnZx = interfaceC56679yOh;
            this.DbNXlk = abstractC59233zdF;
            this.valueOf = c56935yXu;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Lo/yNG$StateListAnimator; */
        @Override // o.yNG.StateListAnimator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator KWHzl(CallableMemberDescriptor callableMemberDescriptor) {
            this.fIwbmz = (yNG) callableMemberDescriptor;
            return this;
        }

        public StateListAnimator EZpvd(boolean z) {
            this.fetchVPNInfo = java.lang.Boolean.valueOf(z);
            return this;
        }

        @Override // o.yNG.StateListAnimator
        public <V> yNG.StateListAnimator<yNG> KWHzl(@NotNull InterfaceC56657yNm.Application<V> application, V v) {
            if (application == null) {
                KWHzl(39);
            }
            this.getNewProxyInstance.put(application, v);
            return this;
        }

        @Override // o.yNG.StateListAnimator
        public yNG AEQbTJ() {
            return this.uzCIH.EZpvd(this);
        }
    }

    public yNG.StateListAnimator<? extends yNG> sSMYrx() {
        StateListAnimator stateListAnimatorCopydefault = copydefault(TypeSubstitutor.EZpvd);
        if (stateListAnimatorCopydefault == null) {
            OLrzqt(23);
        }
        return stateListAnimatorCopydefault;
    }

    public StateListAnimator copydefault(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            OLrzqt(24);
        }
        return new StateListAnimator(this, typeSubstitutor.KWHzl(), AuCTel(), isConnected(), getNewProxyInstance(), bW_(), fetchVPNInfo(), OLrzqt(), djBIcL(), gEmmrt(), null);
    }

    public yNG EZpvd(@NotNull StateListAnimator stateListAnimator) {
        yOL yolCopydefault;
        yPM ypm;
        InterfaceC56679yOh interfaceC56679yOh;
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        if (stateListAnimator == null) {
            OLrzqt(25);
        }
        boolean[] zArr = new boolean[1];
        if (stateListAnimator.AEQbTJ != null) {
            yolCopydefault = yOP.AEQbTJ(copydefault(), stateListAnimator.AEQbTJ);
        } else {
            yolCopydefault = copydefault();
        }
        InterfaceC56665yNu interfaceC56665yNu = stateListAnimator.values;
        yNG yng = stateListAnimator.fIwbmz;
        AbstractC56718yPt abstractC56718yPtKWHzl = KWHzl(interfaceC56665yNu, yng, stateListAnimator.AYXKKw, stateListAnimator.valueOf, yolCopydefault, EZpvd(stateListAnimator.AuCTel, yng));
        java.util.List<InterfaceC56691yOt> listAkhnZx = stateListAnimator.fARcdN == null ? AkhnZx() : stateListAnimator.fARcdN;
        zArr[0] = zArr[0] | (!listAkhnZx.isEmpty());
        java.util.ArrayList arrayList = new java.util.ArrayList(listAkhnZx.size());
        final TypeSubstitutor typeSubstitutorAEQbTJ = C59268zdo.AEQbTJ(listAkhnZx, stateListAnimator.getFieldNames, abstractC56718yPtKWHzl, arrayList, zArr);
        if (typeSubstitutorAEQbTJ == null) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!stateListAnimator.gEmmrt.isEmpty()) {
            int i = 0;
            for (InterfaceC56679yOh interfaceC56679yOh2 : stateListAnimator.gEmmrt) {
                AbstractC59233zdF abstractC59233zdFOLrzqt2 = typeSubstitutorAEQbTJ.OLrzqt(interfaceC56679yOh2.uzCIH(), Variance.IN_VARIANCE);
                if (abstractC59233zdFOLrzqt2 == null) {
                    return null;
                }
                arrayList2.add(yYI.EZpvd(abstractC56718yPtKWHzl, abstractC59233zdFOLrzqt2, ((InterfaceC59119zay) interfaceC56679yOh2.KWHzl()).EZpvd(), interfaceC56679yOh2.copydefault(), i));
                zArr[0] = (abstractC59233zdFOLrzqt2 != interfaceC56679yOh2.uzCIH()) | zArr[0];
                i++;
            }
        }
        InterfaceC56679yOh interfaceC56679yOh3 = stateListAnimator.AkhnZx;
        if (interfaceC56679yOh3 != null) {
            AbstractC59233zdF abstractC59233zdFOLrzqt3 = typeSubstitutorAEQbTJ.OLrzqt(interfaceC56679yOh3.uzCIH(), Variance.IN_VARIANCE);
            if (abstractC59233zdFOLrzqt3 == null) {
                return null;
            }
            yPM ypm2 = new yPM(abstractC56718yPtKWHzl, new C59113zas(abstractC56718yPtKWHzl, abstractC59233zdFOLrzqt3, stateListAnimator.AkhnZx.KWHzl()), stateListAnimator.AkhnZx.copydefault());
            zArr[0] = (abstractC59233zdFOLrzqt3 != stateListAnimator.AkhnZx.uzCIH()) | zArr[0];
            ypm = ypm2;
        } else {
            ypm = null;
        }
        InterfaceC56679yOh interfaceC56679yOh4 = stateListAnimator.OLrzqt;
        if (interfaceC56679yOh4 != null) {
            InterfaceC56679yOh interfaceC56679yOhKWHzl = interfaceC56679yOh4.KWHzl(typeSubstitutorAEQbTJ);
            if (interfaceC56679yOhKWHzl == null) {
                return null;
            }
            zArr[0] = zArr[0] | (interfaceC56679yOhKWHzl != stateListAnimator.OLrzqt);
            interfaceC56679yOh = interfaceC56679yOhKWHzl;
        } else {
            interfaceC56679yOh = null;
        }
        java.util.List<InterfaceC56695yOx> listCopydefault = copydefault(abstractC56718yPtKWHzl, stateListAnimator.ejfBZ, typeSubstitutorAEQbTJ, stateListAnimator.KWHzl, stateListAnimator.AuCTel, zArr);
        if (listCopydefault == null || (abstractC59233zdFOLrzqt = typeSubstitutorAEQbTJ.OLrzqt(stateListAnimator.DbNXlk, Variance.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z = zArr[0] | (abstractC59233zdFOLrzqt != stateListAnimator.DbNXlk);
        zArr[0] = z;
        if (!z && stateListAnimator.AhwBna) {
            return this;
        }
        abstractC56718yPtKWHzl.AEQbTJ(ypm, interfaceC56679yOh, arrayList2, arrayList, listCopydefault, abstractC59233zdFOLrzqt, stateListAnimator.isConnected, stateListAnimator.fJNWhG);
        abstractC56718yPtKWHzl.AYXKKw(this.ejfBZ);
        abstractC56718yPtKWHzl.gEmmrt(this.fIwbmz);
        abstractC56718yPtKWHzl.AEQbTJ(this.DbNXlk);
        abstractC56718yPtKWHzl.valueOf(this.fJNWhG);
        abstractC56718yPtKWHzl.isConnected(this.hDKMBd);
        abstractC56718yPtKWHzl.values(this.AuCTel);
        abstractC56718yPtKWHzl.OLrzqt(this.isConnected);
        abstractC56718yPtKWHzl.KWHzl(this.AkhnZx);
        abstractC56718yPtKWHzl.EZpvd(this.AhwBna);
        abstractC56718yPtKWHzl.AhwBna(stateListAnimator.djBIcL);
        abstractC56718yPtKWHzl.djBIcL(stateListAnimator.copydefault);
        abstractC56718yPtKWHzl.copydefault(stateListAnimator.fetchVPNInfo != null ? stateListAnimator.fetchVPNInfo.booleanValue() : this.djBIcL);
        if (!stateListAnimator.getNewProxyInstance.isEmpty() || this.AuCTelauCTel != null) {
            java.util.Map<InterfaceC56657yNm.Application<?>, java.lang.Object> map = stateListAnimator.getNewProxyInstance;
            java.util.Map<InterfaceC56657yNm.Application<?>, java.lang.Object> map2 = this.AuCTelauCTel;
            if (map2 != null) {
                for (Map.Entry<InterfaceC56657yNm.Application<?>, java.lang.Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC56718yPtKWHzl.AuCTelauCTel = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC56718yPtKWHzl.AuCTelauCTel = map;
            }
        }
        if (stateListAnimator.hDKMBd || uzCIH() != null) {
            abstractC56718yPtKWHzl.EZpvd((uzCIH() != null ? uzCIH() : this).OLrzqt(typeSubstitutorAEQbTJ));
        }
        if (stateListAnimator.EZpvd && !ejfBZ().valueOf().isEmpty()) {
            if (stateListAnimator.getFieldNames.EZpvd()) {
                Function0<java.util.Collection<yNG>> function0 = this.getNewProxyInstance;
                if (function0 != null) {
                    abstractC56718yPtKWHzl.getNewProxyInstance = function0;
                } else {
                    abstractC56718yPtKWHzl.copydefault(valueOf());
                }
            } else {
                abstractC56718yPtKWHzl.getNewProxyInstance = new Function0<java.util.Collection<yNG>>() { // from class: o.yPt.3
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public java.util.Collection<yNG> invoke() {
                        C59387zgA c59387zgA = new C59387zgA();
                        java.util.Iterator<? extends yNG> it = AbstractC56718yPt.this.valueOf().iterator();
                        while (it.hasNext()) {
                            c59387zgA.add(it.next().OLrzqt(typeSubstitutorAEQbTJ));
                        }
                        return c59387zgA;
                    }
                };
            }
        }
        return abstractC56718yPtKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/yNu;Lkotlin/reflect/jvm/internal/impl/descriptors/Modality;Lo/yNC;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor$Kind;Z)Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: EZpvd */
    public yNG OLrzqt(InterfaceC56665yNu interfaceC56665yNu, Modality modality, yNC ync, CallableMemberDescriptor.Kind kind, boolean z) {
        yNG yngAEQbTJ = sSMYrx().AEQbTJ(interfaceC56665yNu).copydefault(modality).copydefault(ync).copydefault(kind).KWHzl(z).AEQbTJ();
        if (yngAEQbTJ == null) {
            OLrzqt(26);
        }
        return yngAEQbTJ;
    }

    public final InterfaceC56686yOo EZpvd(boolean z, yNG yng) {
        InterfaceC56686yOo interfaceC56686yOoFARcdN;
        if (z) {
            if (yng == null) {
                yng = ejfBZ();
            }
            interfaceC56686yOoFARcdN = yng.fARcdN();
        } else {
            interfaceC56686yOoFARcdN = InterfaceC56686yOo.copydefault;
        }
        if (interfaceC56686yOoFARcdN == null) {
            OLrzqt(27);
        }
        return interfaceC56686yOoFARcdN;
    }

    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.AEQbTJ(this, d);
    }

    public static java.util.List<InterfaceC56695yOx> OLrzqt(yNG yng, @NotNull java.util.List<InterfaceC56695yOx> list, @NotNull TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            OLrzqt(28);
        }
        if (typeSubstitutor == null) {
            OLrzqt(29);
        }
        return copydefault(yng, list, typeSubstitutor, false, false, null);
    }

    public static java.util.List<InterfaceC56695yOx> copydefault(yNG yng, @NotNull java.util.List<InterfaceC56695yOx> list, @NotNull TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        Function0<java.util.List<yOC>> function0;
        if (list == null) {
            OLrzqt(30);
        }
        if (typeSubstitutor == null) {
            OLrzqt(31);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (InterfaceC56695yOx interfaceC56695yOx : list) {
            AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOx.uzCIH();
            Variance variance = Variance.IN_VARIANCE;
            AbstractC59233zdF abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(abstractC59233zdFUzCIH, variance);
            AbstractC59233zdF abstractC59233zdFEjfBZ = interfaceC56695yOx.ejfBZ();
            AbstractC59233zdF abstractC59233zdFOLrzqt2 = abstractC59233zdFEjfBZ == null ? null : typeSubstitutor.OLrzqt(abstractC59233zdFEjfBZ, variance);
            if (abstractC59233zdFOLrzqt == null) {
                return null;
            }
            if ((abstractC59233zdFOLrzqt != interfaceC56695yOx.uzCIH() || abstractC59233zdFEjfBZ != abstractC59233zdFOLrzqt2) && zArr != null) {
                zArr[0] = true;
            }
            if (interfaceC56695yOx instanceof yPP.Application) {
                final java.util.List<yOC> fieldNames = ((yPP.Application) interfaceC56695yOx).getFieldNames();
                function0 = new Function0<java.util.List<yOC>>() { // from class: o.yPt.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public java.util.List<yOC> invoke() {
                        return fieldNames;
                    }
                };
            } else {
                function0 = null;
            }
            arrayList.add(yPP.OLrzqt(yng, z ? null : interfaceC56695yOx, interfaceC56695yOx.isConnected(), interfaceC56695yOx.copydefault(), interfaceC56695yOx.bR_(), abstractC59233zdFOLrzqt, interfaceC56695yOx.EZpvd(), interfaceC56695yOx.fIwbmz(), interfaceC56695yOx.AuCTel(), abstractC59233zdFOLrzqt2, z2 ? interfaceC56695yOx.fARcdN() : InterfaceC56686yOo.copydefault, function0));
        }
        return arrayList;
    }

    public <V> void copydefault(InterfaceC56657yNm.Application<V> application, java.lang.Object obj) {
        if (this.AuCTelauCTel == null) {
            this.AuCTelauCTel = new LinkedHashMap();
        }
        this.AuCTelauCTel.put(application, obj);
    }
}
