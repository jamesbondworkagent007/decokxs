package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59322zep {
    public static final AbstractC59242zdO copydefault = C59370zfk.EZpvd(ErrorTypeKind.DONT_CARE, new java.lang.String[0]);
    public static final AbstractC59242zdO EZpvd = C59370zfk.EZpvd(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new java.lang.String[0]);
    public static final AbstractC59242zdO KWHzl = new Activity("NO_EXPECTED_TYPE");
    public static final AbstractC59242zdO OLrzqt = new Activity("UNIT_EXPECTED_TYPE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = IEncryptorType.DEFAULT_ENCRYPTOR;
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean DbNXlk(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(0);
        }
        return abstractC59233zdF == KWHzl || abstractC59233zdF == OLrzqt;
    }

    /* JADX INFO: renamed from: o.zep$Activity */
    public static class Activity extends AbstractC59267zdn {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void copydefault(int i) {
            java.lang.String str = (i == 1 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i == 2) {
                objArr[0] = "delegate";
            } else if (i == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i != 4) {
                objArr[0] = "newAttributes";
            }
            if (i == 1) {
                objArr[1] = "toString";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i == 3) {
                    objArr[2] = "refine";
                } else if (i != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            java.lang.String str2 = java.lang.String.format(str, objArr);
            if (i != 1 && i != 4) {
                throw new java.lang.IllegalArgumentException(str2);
            }
            throw new java.lang.IllegalStateException(str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zdF; */
        /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/zeG;)Lo/zdO; */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/zeG;)Lo/zey; */
        @Override // o.AbstractC59267zdn, o.AbstractC59331zey
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Activity KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG) {
            if (abstractC59287zeG == null) {
                copydefault(3);
            }
            return this;
        }

        public Activity(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // o.AbstractC59267zdn
        public AbstractC59242zdO EZpvd() {
            throw new java.lang.IllegalStateException(this.OLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeb;)Lo/zey; */
        @Override // o.AbstractC59331zey
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public AbstractC59242zdO AEQbTJ(@NotNull C59308zeb c59308zeb) {
            if (c59308zeb == null) {
                copydefault(0);
            }
            throw new java.lang.IllegalStateException(this.OLrzqt);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Z)Lo/zey; */
        @Override // o.AbstractC59331zey
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public AbstractC59242zdO AEQbTJ(boolean z) {
            throw new java.lang.IllegalStateException(this.OLrzqt);
        }

        @Override // o.AbstractC59242zdO
        public java.lang.String toString() {
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                copydefault(1);
            }
            return str;
        }

        @Override // o.AbstractC59267zdn
        public AbstractC59267zdn KWHzl(@NotNull AbstractC59242zdO abstractC59242zdO) {
            if (abstractC59242zdO == null) {
                copydefault(2);
            }
            throw new java.lang.IllegalStateException(this.OLrzqt);
        }
    }

    public static boolean gEmmrt(AbstractC59233zdF abstractC59233zdF) {
        return abstractC59233zdF != null && abstractC59233zdF.djBIcL() == copydefault.djBIcL();
    }

    public static AbstractC59233zdF djBIcL(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(1);
        }
        return EZpvd(abstractC59233zdF, true);
    }

    public static AbstractC59233zdF AhwBna(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(2);
        }
        return EZpvd(abstractC59233zdF, false);
    }

    public static AbstractC59233zdF EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF, boolean z) {
        if (abstractC59233zdF == null) {
            AEQbTJ(3);
        }
        AbstractC59331zey abstractC59331zeyAEQbTJ = abstractC59233zdF.AkhnZx().AEQbTJ(z);
        if (abstractC59331zeyAEQbTJ == null) {
            AEQbTJ(4);
        }
        return abstractC59331zeyAEQbTJ;
    }

    public static AbstractC59242zdO copydefault(@NotNull AbstractC59242zdO abstractC59242zdO, boolean z) {
        if (abstractC59242zdO == null) {
            AEQbTJ(5);
        }
        if (!z) {
            if (abstractC59242zdO == null) {
                AEQbTJ(7);
            }
            return abstractC59242zdO;
        }
        AbstractC59242zdO abstractC59242zdOAEQbTJ = abstractC59242zdO.AEQbTJ(true);
        if (abstractC59242zdOAEQbTJ == null) {
            AEQbTJ(6);
        }
        return abstractC59242zdOAEQbTJ;
    }

    public static AbstractC59233zdF AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF, boolean z) {
        if (abstractC59233zdF == null) {
            AEQbTJ(8);
        }
        if (z) {
            return djBIcL(abstractC59233zdF);
        }
        if (abstractC59233zdF == null) {
            AEQbTJ(9);
        }
        return abstractC59233zdF;
    }

    public static AbstractC59242zdO OLrzqt(InterfaceC56663yNs interfaceC56663yNs, InterfaceC59098zad interfaceC59098zad, Function1<AbstractC59287zeG, AbstractC59242zdO> function1) {
        if (C59370zfk.KWHzl(interfaceC56663yNs)) {
            C59366zfg c59366zfgEZpvd = C59370zfk.EZpvd(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC56663yNs.toString());
            if (c59366zfgEZpvd == null) {
                AEQbTJ(11);
            }
            return c59366zfgEZpvd;
        }
        return AEQbTJ(interfaceC56663yNs.fJNWhG(), interfaceC59098zad, function1);
    }

    public static AbstractC59242zdO AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull InterfaceC59098zad interfaceC59098zad, @NotNull Function1<AbstractC59287zeG, AbstractC59242zdO> function1) {
        if (interfaceC59315zei == null) {
            AEQbTJ(12);
        }
        if (interfaceC59098zad == null) {
            AEQbTJ(13);
        }
        if (function1 == null) {
            AEQbTJ(14);
        }
        AbstractC59242zdO abstractC59242zdOKWHzl = C59231zdD.KWHzl(C59308zeb.OLrzqt.copydefault(), interfaceC59315zei, (java.util.List<? extends InterfaceC59317zek>) OLrzqt(interfaceC59315zei.copydefault()), false, interfaceC59098zad, (Function1<? super AbstractC59287zeG, ? extends AbstractC59242zdO>) function1);
        if (abstractC59242zdOKWHzl == null) {
            AEQbTJ(15);
        }
        return abstractC59242zdOKWHzl;
    }

    public static java.util.List<InterfaceC59317zek> OLrzqt(@NotNull java.util.List<InterfaceC56691yOt> list) {
        if (list == null) {
            AEQbTJ(16);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<InterfaceC56691yOt> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C59323zeq(it.next().bQ_()));
        }
        java.util.List<InterfaceC59317zek> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        if (listAxsJAYsNCnLh == null) {
            AEQbTJ(17);
        }
        return listAxsJAYsNCnLh;
    }

    public static java.util.List<AbstractC59233zdF> AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(18);
        }
        TypeSubstitutor typeSubstitutorOLrzqt = TypeSubstitutor.OLrzqt(abstractC59233zdF);
        java.util.Collection<AbstractC59233zdF> collectionBV_ = abstractC59233zdF.djBIcL().bV_();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionBV_.size());
        java.util.Iterator<AbstractC59233zdF> it = collectionBV_.iterator();
        while (it.hasNext()) {
            AbstractC59233zdF abstractC59233zdFOLrzqt = OLrzqt(abstractC59233zdF, it.next(), typeSubstitutorOLrzqt);
            if (abstractC59233zdFOLrzqt != null) {
                arrayList.add(abstractC59233zdFOLrzqt);
            }
        }
        return arrayList;
    }

    public static AbstractC59233zdF OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull AbstractC59233zdF abstractC59233zdF2, @NotNull TypeSubstitutor typeSubstitutor) {
        if (abstractC59233zdF == null) {
            AEQbTJ(20);
        }
        if (abstractC59233zdF2 == null) {
            AEQbTJ(21);
        }
        if (typeSubstitutor == null) {
            AEQbTJ(22);
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt = typeSubstitutor.OLrzqt(abstractC59233zdF2, Variance.INVARIANT);
        if (abstractC59233zdFOLrzqt != null) {
            return AEQbTJ(abstractC59233zdFOLrzqt, abstractC59233zdF.AEQbTJ());
        }
        return null;
    }

    public static boolean valueOf(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(27);
        }
        if (abstractC59233zdF.AEQbTJ()) {
            return true;
        }
        if (C59278zdy.EZpvd(abstractC59233zdF) && valueOf(C59278zdy.AEQbTJ(abstractC59233zdF).AYXKKw())) {
            return true;
        }
        if (C59245zdR.AEQbTJ(abstractC59233zdF)) {
            return false;
        }
        if (AYXKKw(abstractC59233zdF)) {
            return OLrzqt(abstractC59233zdF);
        }
        if (abstractC59233zdF instanceof AbstractC59191zcQ) {
            InterfaceC56691yOt interfaceC56691yOtAEQbTJ = ((AbstractC59191zcQ) abstractC59233zdF).gEmmrt().AEQbTJ();
            return interfaceC56691yOtAEQbTJ == null || OLrzqt(interfaceC56691yOtAEQbTJ.bQ_());
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        if (interfaceC59315zeiDjBIcL instanceof C59228zdA) {
            java.util.Iterator<AbstractC59233zdF> it = interfaceC59315zeiDjBIcL.bV_().iterator();
            while (it.hasNext()) {
                if (valueOf(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(28);
        }
        if (abstractC59233zdF.AEQbTJ()) {
            return true;
        }
        return C59278zdy.EZpvd(abstractC59233zdF) && copydefault(C59278zdy.AEQbTJ(abstractC59233zdF).AYXKKw());
    }

    public static boolean OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(29);
        }
        if (abstractC59233zdF.djBIcL().OLrzqt() instanceof InterfaceC56658yNn) {
            return false;
        }
        java.util.Iterator<AbstractC59233zdF> it = AEQbTJ(abstractC59233zdF).iterator();
        while (it.hasNext()) {
            if (valueOf(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC56658yNn EZpvd(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(30);
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsKWHzl;
        }
        return null;
    }

    public static boolean OLrzqt(AbstractC59233zdF abstractC59233zdF, @NotNull Function1<AbstractC59331zey, java.lang.Boolean> function1) {
        if (function1 == null) {
            AEQbTJ(43);
        }
        return EZpvd(abstractC59233zdF, function1, null);
    }

    public static boolean EZpvd(AbstractC59233zdF abstractC59233zdF, @NotNull Function1<AbstractC59331zey, java.lang.Boolean> function1, C59388zgB<AbstractC59233zdF> c59388zgB) {
        if (function1 == null) {
            AEQbTJ(44);
        }
        if (abstractC59233zdF == null) {
            return false;
        }
        AbstractC59331zey abstractC59331zeyAkhnZx = abstractC59233zdF.AkhnZx();
        if (DbNXlk(abstractC59233zdF)) {
            return function1.invoke(abstractC59331zeyAkhnZx).booleanValue();
        }
        if (c59388zgB != null && c59388zgB.contains(abstractC59233zdF)) {
            return false;
        }
        if (function1.invoke(abstractC59331zeyAkhnZx).booleanValue()) {
            return true;
        }
        if (c59388zgB == null) {
            c59388zgB = C59388zgB.copydefault();
        }
        c59388zgB.add(abstractC59233zdF);
        AbstractC59272zds abstractC59272zds = abstractC59331zeyAkhnZx instanceof AbstractC59272zds ? (AbstractC59272zds) abstractC59331zeyAkhnZx : null;
        if (abstractC59272zds != null && (EZpvd(abstractC59272zds.valueOf(), function1, c59388zgB) || EZpvd(abstractC59272zds.AYXKKw(), function1, c59388zgB))) {
            return true;
        }
        if ((abstractC59331zeyAkhnZx instanceof C59265zdl) && EZpvd(((C59265zdl) abstractC59331zeyAkhnZx).AhwBna(), function1, c59388zgB)) {
            return true;
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59233zdF.djBIcL();
        if (interfaceC59315zeiDjBIcL instanceof C59228zdA) {
            java.util.Iterator<AbstractC59233zdF> it = ((C59228zdA) interfaceC59315zeiDjBIcL).bV_().iterator();
            while (it.hasNext()) {
                if (EZpvd(it.next(), function1, c59388zgB)) {
                    return true;
                }
            }
            return false;
        }
        for (InterfaceC59317zek interfaceC59317zek : abstractC59233zdF.bY_()) {
            if (!interfaceC59317zek.AEQbTJ() && EZpvd(interfaceC59317zek.OLrzqt(), function1, c59388zgB)) {
                return true;
            }
        }
        return false;
    }

    public static InterfaceC59317zek EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        if (interfaceC56691yOt == null) {
            AEQbTJ(45);
        }
        return new C59250zdW(interfaceC56691yOt);
    }

    public static InterfaceC59317zek EZpvd(@NotNull InterfaceC56691yOt interfaceC56691yOt, C59274zdu c59274zdu) {
        if (interfaceC56691yOt == null) {
            AEQbTJ(46);
        }
        if (c59274zdu.OLrzqt() == TypeUsage.SUPERTYPE) {
            return new C59323zeq(C59252zdY.EZpvd(interfaceC56691yOt));
        }
        return new C59250zdW(interfaceC56691yOt);
    }

    public static boolean AYXKKw(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(60);
        }
        return KWHzl(abstractC59233zdF) != null || (abstractC59233zdF.djBIcL() instanceof InterfaceC59297zeQ);
    }

    public static InterfaceC56691yOt KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            AEQbTJ(63);
        }
        if (abstractC59233zdF.djBIcL().OLrzqt() instanceof InterfaceC56691yOt) {
            return (InterfaceC56691yOt) abstractC59233zdF.djBIcL().OLrzqt();
        }
        return null;
    }
}
