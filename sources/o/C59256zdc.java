package o;

import java.util.Collections;
import o.InterfaceC56685yOn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59256zdc extends AbstractC59184zcJ {
    public final java.util.Collection<AbstractC59233zdF> AEQbTJ;
    public final InterfaceC56658yNn KWHzl;
    public final java.util.List<InterfaceC56691yOt> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void EZpvd(int i) {
        java.lang.String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // o.InterfaceC59315zei
    public boolean gEmmrt() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59256zdc(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull java.util.Collection<AbstractC59233zdF> collection, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(interfaceC59187zcM);
        if (interfaceC56658yNn == null) {
            EZpvd(0);
        }
        if (list == null) {
            EZpvd(1);
        }
        if (collection == null) {
            EZpvd(2);
        }
        if (interfaceC59187zcM == null) {
            EZpvd(3);
        }
        this.KWHzl = interfaceC56658yNn;
        this.copydefault = Collections.unmodifiableList(new java.util.ArrayList(list));
        this.AEQbTJ = Collections.unmodifiableCollection(collection);
    }

    @Override // o.InterfaceC59315zei
    public java.util.List<InterfaceC56691yOt> copydefault() {
        java.util.List<InterfaceC56691yOt> list = this.copydefault;
        if (list == null) {
            EZpvd(4);
        }
        return list;
    }

    public java.lang.String toString() {
        return yYH.AEQbTJ((InterfaceC56665yNu) this.KWHzl).KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
    @Override // o.AbstractC59184zcJ, o.AbstractC59262zdi, o.InterfaceC59315zei
    public InterfaceC56658yNn OLrzqt() {
        InterfaceC56658yNn interfaceC56658yNn = this.KWHzl;
        if (interfaceC56658yNn == null) {
            EZpvd(5);
        }
        return interfaceC56658yNn;
    }

    @Override // o.AbstractC59197zcW
    public java.util.Collection<AbstractC59233zdF> AEQbTJ() {
        java.util.Collection<AbstractC59233zdF> collection = this.AEQbTJ;
        if (collection == null) {
            EZpvd(6);
        }
        return collection;
    }

    @Override // o.AbstractC59197zcW
    public InterfaceC56685yOn djBIcL() {
        InterfaceC56685yOn.Activity activity = InterfaceC56685yOn.Activity.KWHzl;
        if (activity == null) {
            EZpvd(7);
        }
        return activity;
    }
}
