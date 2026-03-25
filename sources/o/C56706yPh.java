package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56706yPh extends AbstractC56708yPj {
    public java.util.Set<InterfaceC56656yNl> AEQbTJ;
    public final InterfaceC59315zei AhwBna;
    public final ClassKind EZpvd;
    public final Modality copydefault;
    public InterfaceC56656yNl djBIcL;
    public InterfaceC59098zad gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new java.lang.IllegalStateException(str2);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
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
    public final void OLrzqt(@NotNull InterfaceC59098zad interfaceC59098zad, @NotNull java.util.Set<InterfaceC56656yNl> set, InterfaceC56656yNl interfaceC56656yNl) {
        if (interfaceC59098zad == null) {
            AEQbTJ(7);
        }
        if (set == null) {
            AEQbTJ(8);
        }
        this.gEmmrt = interfaceC59098zad;
        this.AEQbTJ = set;
        this.djBIcL = interfaceC56656yNl;
    }

    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return false;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn
    public InterfaceC56656yNl uzCIH() {
        return this.djBIcL;
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
    public C56706yPh(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull C56935yXu c56935yXu, @NotNull Modality modality, @NotNull ClassKind classKind, @NotNull java.util.Collection<AbstractC59233zdF> collection, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(interfaceC59187zcM, interfaceC56665yNu, c56935yXu, interfaceC56686yOo, z);
        if (interfaceC56665yNu == null) {
            AEQbTJ(0);
        }
        if (c56935yXu == null) {
            AEQbTJ(1);
        }
        if (modality == null) {
            AEQbTJ(2);
        }
        if (classKind == null) {
            AEQbTJ(3);
        }
        if (collection == null) {
            AEQbTJ(4);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(5);
        }
        if (interfaceC59187zcM == null) {
            AEQbTJ(6);
        }
        this.copydefault = modality;
        this.EZpvd = classKind;
        this.AhwBna = new C59256zdc(this, Collections.emptyList(), collection, interfaceC59187zcM);
    }

    @Override // o.yOB
    public yOL copydefault() {
        yOL yolOLrzqt = yOL.KWHzl.OLrzqt();
        if (yolOLrzqt == null) {
            AEQbTJ(9);
        }
        return yolOLrzqt;
    }

    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        InterfaceC59315zei interfaceC59315zei = this.AhwBna;
        if (interfaceC59315zei == null) {
            AEQbTJ(10);
        }
        return interfaceC59315zei;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56656yNl> djBIcL() {
        java.util.Set<InterfaceC56656yNl> set = this.AEQbTJ;
        if (set == null) {
            AEQbTJ(11);
        }
        return set;
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59287zeG == null) {
            AEQbTJ(12);
        }
        InterfaceC59098zad interfaceC59098zad = this.gEmmrt;
        if (interfaceC59098zad == null) {
            AEQbTJ(13);
        }
        return interfaceC59098zad;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ejfBZ() {
        InterfaceC59098zad.ActionBar actionBar = InterfaceC59098zad.ActionBar.copydefault;
        if (actionBar == null) {
            AEQbTJ(14);
        }
        return actionBar;
    }

    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        ClassKind classKind = this.EZpvd;
        if (classKind == null) {
            AEQbTJ(15);
        }
        return classKind;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        Modality modality = this.copydefault;
        if (modality == null) {
            AEQbTJ(16);
        }
        return modality;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC ync = C56669yNy.fetchVPNInfo;
        if (ync == null) {
            AEQbTJ(17);
        }
        return ync;
    }

    public java.lang.String toString() {
        return "class " + bR_();
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List<InterfaceC56691yOt> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AEQbTJ(18);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
        java.util.List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            AEQbTJ(19);
        }
        return listEmptyList;
    }
}
