package o;

import java.util.Collections;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56704yPf extends AbstractC56709yPk implements InterfaceC56691yOt {
    public final int AEQbTJ;
    public final Variance AhwBna;
    public final boolean EZpvd;
    public final InterfaceC59187zcM OLrzqt;
    public final InterfaceC59182zcH<AbstractC59242zdO> copydefault;
    public final InterfaceC59182zcH<InterfaceC59315zei> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
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
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new java.lang.IllegalStateException(str2);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract java.util.List<AbstractC59233zdF> AkhnZx();

    public abstract void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF);

    @Override // o.InterfaceC56691yOt
    public boolean fetchVPNInfo() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public boolean isConnected() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56704yPf(@NotNull final InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull final C56935yXu c56935yXu, @NotNull Variance variance, boolean z, int i, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull final InterfaceC56685yOn interfaceC56685yOn) {
        super(interfaceC56665yNu, yol, c56935yXu, interfaceC56686yOo);
        if (interfaceC59187zcM == null) {
            AEQbTJ(0);
        }
        if (interfaceC56665yNu == null) {
            AEQbTJ(1);
        }
        if (yol == null) {
            AEQbTJ(2);
        }
        if (c56935yXu == null) {
            AEQbTJ(3);
        }
        if (variance == null) {
            AEQbTJ(4);
        }
        if (interfaceC56686yOo == null) {
            AEQbTJ(5);
        }
        if (interfaceC56685yOn == null) {
            AEQbTJ(6);
        }
        this.AhwBna = variance;
        this.EZpvd = z;
        this.AEQbTJ = i;
        this.valueOf = interfaceC59187zcM.KWHzl(new Function0<InterfaceC59315zei>() { // from class: o.yPf.5
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public InterfaceC59315zei invoke() {
                return new ActionBar(AbstractC56704yPf.this, interfaceC59187zcM, interfaceC56685yOn);
            }
        });
        this.copydefault = interfaceC59187zcM.KWHzl(new Function0<AbstractC59242zdO>() { // from class: o.yPf.1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public AbstractC59242zdO invoke() {
                return C59231zdD.OLrzqt(C59308zeb.OLrzqt.copydefault(), AbstractC56704yPf.this.fJNWhG(), Collections.emptyList(), false, new yZZ(new Function0<InterfaceC59098zad>() { // from class: o.yPf.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public InterfaceC59098zad invoke() {
                        return C59108zan.OLrzqt("Scope for type parameter " + c56935yXu.AEQbTJ(), AbstractC56704yPf.this.djBIcL());
                    }
                }));
            }
        });
        this.OLrzqt = interfaceC59187zcM;
    }

    @Override // o.InterfaceC56691yOt
    public Variance values() {
        Variance variance = this.AhwBna;
        if (variance == null) {
            AEQbTJ(7);
        }
        return variance;
    }

    @Override // o.InterfaceC56691yOt
    public java.util.List<AbstractC59233zdF> djBIcL() {
        java.util.List<AbstractC59233zdF> listBV_ = ((ActionBar) fJNWhG()).bV_();
        if (listBV_ == null) {
            AEQbTJ(8);
        }
        return listBV_;
    }

    @Override // o.InterfaceC56691yOt, o.InterfaceC56663yNs
    public final InterfaceC59315zei fJNWhG() {
        InterfaceC59315zei interfaceC59315zeiInvoke = this.valueOf.invoke();
        if (interfaceC59315zeiInvoke == null) {
            AEQbTJ(9);
        }
        return interfaceC59315zeiInvoke;
    }

    @Override // o.InterfaceC56663yNs
    public AbstractC59242zdO bQ_() {
        AbstractC59242zdO abstractC59242zdOInvoke = this.copydefault.invoke();
        if (abstractC59242zdOInvoke == null) {
            AEQbTJ(10);
        }
        return abstractC59242zdOInvoke;
    }

    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bS_()Lo/yNs; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56709yPk, o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56691yOt ejfBZ() {
        InterfaceC56691yOt interfaceC56691yOt = (InterfaceC56691yOt) super.bT_();
        if (interfaceC56691yOt == null) {
            AEQbTJ(11);
        }
        return interfaceC56691yOt;
    }

    public java.util.List<AbstractC59233zdF> copydefault(@NotNull java.util.List<AbstractC59233zdF> list) {
        if (list == null) {
            AEQbTJ(12);
        }
        if (list == null) {
            AEQbTJ(13);
        }
        return list;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.AEQbTJ(this, d);
    }

    @Override // o.InterfaceC56691yOt
    public InterfaceC59187zcM AhwBna() {
        InterfaceC59187zcM interfaceC59187zcM = this.OLrzqt;
        if (interfaceC59187zcM == null) {
            AEQbTJ(14);
        }
        return interfaceC59187zcM;
    }

    /* JADX INFO: renamed from: o.yPf$ActionBar */
    public class ActionBar extends AbstractC59197zcW {
        public final InterfaceC56685yOn AEQbTJ;
        public final /* synthetic */ AbstractC56704yPf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void copydefault(int i) {
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC56704yPf abstractC56704yPf, InterfaceC59187zcM interfaceC59187zcM, InterfaceC56685yOn interfaceC56685yOn) {
            super(interfaceC59187zcM);
            if (interfaceC59187zcM == null) {
                copydefault(0);
            }
            this.copydefault = abstractC56704yPf;
            this.AEQbTJ = interfaceC56685yOn;
        }

        @Override // o.AbstractC59197zcW
        public java.util.Collection<AbstractC59233zdF> AEQbTJ() {
            java.util.List<AbstractC59233zdF> listAkhnZx = this.copydefault.AkhnZx();
            if (listAkhnZx == null) {
                copydefault(1);
            }
            return listAkhnZx;
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            java.util.List<InterfaceC56691yOt> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                copydefault(2);
            }
            return listEmptyList;
        }

        @Override // o.AbstractC59262zdi, o.InterfaceC59315zei
        /* JADX INFO: renamed from: KWHzl */
        public InterfaceC56663yNs OLrzqt() {
            AbstractC56704yPf abstractC56704yPf = this.copydefault;
            if (abstractC56704yPf == null) {
                copydefault(3);
            }
            return abstractC56704yPf;
        }

        @Override // o.InterfaceC59315zei
        public AbstractC56640yMw bU_() {
            AbstractC56640yMw abstractC56640yMwAEQbTJ = yZE.AEQbTJ(this.copydefault);
            if (abstractC56640yMwAEQbTJ == null) {
                copydefault(4);
            }
            return abstractC56640yMwAEQbTJ;
        }

        public java.lang.String toString() {
            return this.copydefault.bR_().toString();
        }

        @Override // o.AbstractC59197zcW
        public InterfaceC56685yOn djBIcL() {
            InterfaceC56685yOn interfaceC56685yOn = this.AEQbTJ;
            if (interfaceC56685yOn == null) {
                copydefault(5);
            }
            return interfaceC56685yOn;
        }

        @Override // o.AbstractC59197zcW
        public void copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
            if (abstractC59233zdF == null) {
                copydefault(6);
            }
            this.copydefault.copydefault(abstractC59233zdF);
        }

        @Override // o.AbstractC59197zcW
        public java.util.List<AbstractC59233zdF> OLrzqt(@NotNull java.util.List<AbstractC59233zdF> list) {
            if (list == null) {
                copydefault(7);
            }
            java.util.List<AbstractC59233zdF> listCopydefault = this.copydefault.copydefault(list);
            if (listCopydefault == null) {
                copydefault(8);
            }
            return listCopydefault;
        }

        @Override // o.AbstractC59197zcW
        public AbstractC59233zdF valueOf() {
            return C59370zfk.EZpvd(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new java.lang.String[0]);
        }

        @Override // o.AbstractC59262zdi
        public boolean EZpvd(@NotNull InterfaceC56663yNs interfaceC56663yNs) {
            if (interfaceC56663yNs == null) {
                copydefault(9);
            }
            return (interfaceC56663yNs instanceof InterfaceC56691yOt) && yYE.AEQbTJ.EZpvd(this.copydefault, (InterfaceC56691yOt) interfaceC56663yNs, true);
        }
    }
}
