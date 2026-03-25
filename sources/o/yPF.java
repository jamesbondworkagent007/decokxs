package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yPF extends AbstractC56708yPj {
    public Modality AEQbTJ;
    public java.util.List<InterfaceC56691yOt> AhwBna;
    public final ClassKind EZpvd;
    public final boolean copydefault;
    public final java.util.Collection<AbstractC59233zdF> djBIcL;
    public yNC fetchVPNInfo;
    public InterfaceC59315zei gEmmrt;
    public final InterfaceC59187zcM valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull Modality modality) {
        if (modality == null) {
            AEQbTJ(6);
        }
        this.AEQbTJ = modality;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull yNC ync) {
        if (ync == null) {
            AEQbTJ(9);
        }
        this.fetchVPNInfo = ync;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AuCTelauCTel() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AubY() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public boolean AwvSrB() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return this.copydefault;
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public yOA<AbstractC59242zdO> iwGUEr() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public boolean sSMYrx() {
        return false;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56656yNl uzCIH() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56658yNn valueOf() {
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public boolean wlaJM() {
        return false;
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPF(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull ClassKind classKind, boolean z, boolean z2, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(interfaceC59187zcM, interfaceC56665yNu, c56935yXu, interfaceC56686yOo, z2);
        if (interfaceC56665yNu == null) {
            AEQbTJ(0);
        }
        if (classKind == null) {
            AEQbTJ(1);
        }
        if (c56935yXu == null) {
            AEQbTJ(2);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(3);
        }
        if (interfaceC59187zcM == null) {
            AEQbTJ(4);
        }
        this.djBIcL = new java.util.ArrayList();
        this.valueOf = interfaceC59187zcM;
        this.EZpvd = classKind;
        this.copydefault = z;
    }

    @Override // o.yOB
    public yOL copydefault() {
        yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
        if (yolOLrzqt == null) {
            AEQbTJ(5);
        }
        return yolOLrzqt;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        Modality modality = this.AEQbTJ;
        if (modality == null) {
            AEQbTJ(7);
        }
        return modality;
    }

    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        ClassKind classKind = this.EZpvd;
        if (classKind == null) {
            AEQbTJ(8);
        }
        return classKind;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = this.fetchVPNInfo;
        if (ync == null) {
            AEQbTJ(10);
        }
        return ync;
    }

    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        InterfaceC59315zei interfaceC59315zei = this.gEmmrt;
        if (interfaceC59315zei == null) {
            AEQbTJ(11);
        }
        return interfaceC59315zei;
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL()Ljava/util/Collection; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public java.util.Set<InterfaceC56656yNl> djBIcL() {
        java.util.Set<InterfaceC56656yNl> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            AEQbTJ(13);
        }
        return setEmptySet;
    }

    public void KWHzl(@NotNull java.util.List<InterfaceC56691yOt> list) {
        if (list == null) {
            AEQbTJ(14);
        }
        if (this.AhwBna != null) {
            throw new java.lang.IllegalStateException("Type parameters are already set for " + bR_());
        }
        this.AhwBna = new java.util.ArrayList(list);
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> list = this.AhwBna;
        if (list == null) {
            AEQbTJ(15);
        }
        return list;
    }

    public void AEQbTJ() {
        this.gEmmrt = new C59256zdc(this, this.AhwBna, this.djBIcL, this.valueOf);
        java.util.Iterator<InterfaceC56656yNl> it = djBIcL().iterator();
        while (it.hasNext()) {
            ((C56707yPi) it.next()).EZpvd(bQ_());
        }
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59287zeG == null) {
            AEQbTJ(16);
        }
        InterfaceC59098zad.ActionBar actionBar = InterfaceC59098zad.ActionBar.copydefault;
        if (actionBar == null) {
            AEQbTJ(17);
        }
        return actionBar;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ejfBZ() {
        InterfaceC59098zad.ActionBar actionBar = InterfaceC59098zad.ActionBar.copydefault;
        if (actionBar == null) {
            AEQbTJ(18);
        }
        return actionBar;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
        java.util.List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AEQbTJ(19);
        }
        return listEmptyList;
    }

    public java.lang.String toString() {
        return AbstractC56711yPm.KWHzl(this);
    }
}
