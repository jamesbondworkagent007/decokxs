package o;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yYI {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void copydefault(int i) {
        java.lang.String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static class ActionBar extends C56707yPi {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ void KWHzl(int i) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56686yOo interfaceC56686yOo, boolean z) {
            super(interfaceC56658yNn, null, yOL.KWHzl.OLrzqt(), true, CallableMemberDescriptor.Kind.DECLARATION, interfaceC56686yOo);
            if (interfaceC56658yNn == null) {
                KWHzl(0);
            }
            if (interfaceC56686yOo == null) {
                KWHzl(1);
            }
            AEQbTJ(Collections.emptyList(), yYH.EZpvd(interfaceC56658yNn, z));
        }
    }

    public static yPN EZpvd(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull yOL yol2) {
        if (interfaceC56676yOe == null) {
            copydefault(0);
        }
        if (yol == null) {
            copydefault(1);
        }
        if (yol2 == null) {
            copydefault(2);
        }
        return EZpvd(interfaceC56676yOe, yol, yol2, true, false, false, interfaceC56676yOe.fARcdN());
    }

    public static yPN EZpvd(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull yOL yol2, boolean z, boolean z2, boolean z3, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56676yOe == null) {
            copydefault(3);
        }
        if (yol == null) {
            copydefault(4);
        }
        if (yol2 == null) {
            copydefault(5);
        }
        if (interfaceC56686yOo == null) {
            copydefault(6);
        }
        return AEQbTJ(interfaceC56676yOe, yol, yol2, z, z2, z3, interfaceC56676yOe.getNewProxyInstance(), interfaceC56686yOo);
    }

    public static yPN AEQbTJ(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, @NotNull yOL yol2, boolean z, boolean z2, boolean z3, @NotNull yNC ync, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56676yOe == null) {
            copydefault(7);
        }
        if (yol == null) {
            copydefault(8);
        }
        if (yol2 == null) {
            copydefault(9);
        }
        if (ync == null) {
            copydefault(10);
        }
        if (interfaceC56686yOo == null) {
            copydefault(11);
        }
        yPN ypn = new yPN(interfaceC56676yOe, yol, interfaceC56676yOe.isConnected(), ync, z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, interfaceC56686yOo);
        ypn.OLrzqt(yPN.AEQbTJ(ypn, interfaceC56676yOe.uzCIH(), yol2));
        return ypn;
    }

    public static yPL copydefault(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol) {
        if (interfaceC56676yOe == null) {
            copydefault(13);
        }
        if (yol == null) {
            copydefault(14);
        }
        return EZpvd(interfaceC56676yOe, yol, true, false, false);
    }

    public static yPL EZpvd(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, boolean z, boolean z2, boolean z3) {
        if (interfaceC56676yOe == null) {
            copydefault(15);
        }
        if (yol == null) {
            copydefault(16);
        }
        return AEQbTJ(interfaceC56676yOe, yol, z, z2, z3, interfaceC56676yOe.fARcdN());
    }

    public static yPL AEQbTJ(@NotNull InterfaceC56676yOe interfaceC56676yOe, @NotNull yOL yol, boolean z, boolean z2, boolean z3, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56676yOe == null) {
            copydefault(17);
        }
        if (yol == null) {
            copydefault(18);
        }
        if (interfaceC56686yOo == null) {
            copydefault(19);
        }
        return new yPL(interfaceC56676yOe, yol, interfaceC56676yOe.isConnected(), interfaceC56676yOe.getNewProxyInstance(), z, z2, z3, CallableMemberDescriptor.Kind.DECLARATION, null, interfaceC56686yOo);
    }

    public static C56707yPi OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        if (interfaceC56658yNn == null) {
            copydefault(20);
        }
        if (interfaceC56686yOo == null) {
            copydefault(21);
        }
        return new ActionBar(interfaceC56658yNn, interfaceC56686yOo, false);
    }

    public static InterfaceC56687yOp AEQbTJ(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (interfaceC56658yNn == null) {
            copydefault(22);
        }
        yPK ypkEZpvd = yPK.KWHzl(interfaceC56658yNn, yOL.KWHzl.OLrzqt(), yMB.fJNWhG, CallableMemberDescriptor.Kind.SYNTHESIZED, interfaceC56658yNn.fARcdN()).AEQbTJ(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), yZE.AEQbTJ(interfaceC56658yNn).AEQbTJ(Variance.INVARIANT, interfaceC56658yNn.bQ_()), Modality.FINAL, C56669yNy.fetchVPNInfo);
        if (ypkEZpvd == null) {
            copydefault(23);
        }
        return ypkEZpvd;
    }

    public static InterfaceC56687yOp EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (interfaceC56658yNn == null) {
            copydefault(24);
        }
        yOL.Application application = yOL.KWHzl;
        yPK ypkKWHzl = yPK.KWHzl(interfaceC56658yNn, application.OLrzqt(), yMB.fARcdN, CallableMemberDescriptor.Kind.SYNTHESIZED, interfaceC56658yNn.fARcdN());
        yPK ypkEZpvd = ypkKWHzl.AEQbTJ(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new yPP(ypkKWHzl, null, 0, application.OLrzqt(), C56935yXu.AEQbTJ("value"), yZE.AEQbTJ(interfaceC56658yNn).AxsJAY(), false, false, false, null, interfaceC56658yNn.fARcdN())), interfaceC56658yNn.bQ_(), Modality.FINAL, C56669yNy.fetchVPNInfo);
        if (ypkEZpvd == null) {
            copydefault(25);
        }
        return ypkEZpvd;
    }

    public static InterfaceC56676yOe OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (interfaceC56658yNn == null) {
            copydefault(26);
        }
        yNP ynpOLrzqt = yYH.OLrzqt(interfaceC56658yNn);
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yYS.EZpvd(ynpOLrzqt).OLrzqt(ynpOLrzqt);
        if (interfaceC56658yNnOLrzqt == null) {
            return null;
        }
        yOL.Application application = yOL.KWHzl;
        yOL yolOLrzqt = application.OLrzqt();
        Modality modality = Modality.FINAL;
        yNC ync = C56669yNy.fetchVPNInfo;
        C56935yXu c56935yXu = yMB.ejfBZ;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.SYNTHESIZED;
        yPI ypiKWHzl = yPI.KWHzl(interfaceC56658yNn, yolOLrzqt, modality, ync, false, c56935yXu, kind, interfaceC56658yNn.fARcdN(), false, false, false, false, false, false);
        yPL ypl = new yPL(ypiKWHzl, application.OLrzqt(), modality, ync, false, false, false, kind, null, interfaceC56658yNn.fARcdN());
        ypiKWHzl.AEQbTJ(ypl, (InterfaceC56680yOi) null);
        ypiKWHzl.AEQbTJ(C59231zdD.EZpvd(C59308zeb.OLrzqt.copydefault(), interfaceC56658yNnOLrzqt.fJNWhG(), Collections.singletonList(new C59323zeq(interfaceC56658yNn.bQ_())), false), Collections.emptyList(), null, null, Collections.emptyList());
        ypl.OLrzqt(ypiKWHzl.gEmmrt());
        return ypiKWHzl;
    }

    public static boolean copydefault(@NotNull yNG yng) {
        if (yng == null) {
            copydefault(27);
        }
        return yng.bR_().equals(yMB.fJNWhG) && EZpvd(yng);
    }

    public static boolean KWHzl(@NotNull yNG yng) {
        if (yng == null) {
            copydefault(28);
        }
        return yng.bR_().equals(yMB.fARcdN) && EZpvd(yng);
    }

    public static boolean EZpvd(@NotNull yNG yng) {
        if (yng == null) {
            copydefault(29);
        }
        return yng.bW_() == CallableMemberDescriptor.Kind.SYNTHESIZED && yYH.values(yng.AuCTel());
    }

    public static InterfaceC56679yOh copydefault(@NotNull InterfaceC56657yNm interfaceC56657yNm, AbstractC59233zdF abstractC59233zdF, @NotNull yOL yol) {
        if (interfaceC56657yNm == null) {
            copydefault(30);
        }
        if (yol == null) {
            copydefault(31);
        }
        if (abstractC59233zdF == null) {
            return null;
        }
        return new yPM(interfaceC56657yNm, new C59113zas(interfaceC56657yNm, abstractC59233zdF, null), yol);
    }

    public static InterfaceC56679yOh EZpvd(@NotNull InterfaceC56657yNm interfaceC56657yNm, AbstractC59233zdF abstractC59233zdF, C56935yXu c56935yXu, @NotNull yOL yol, int i) {
        if (interfaceC56657yNm == null) {
            copydefault(32);
        }
        if (yol == null) {
            copydefault(33);
        }
        if (abstractC59233zdF == null) {
            return null;
        }
        return new yPM(interfaceC56657yNm, new C59114zat(interfaceC56657yNm, abstractC59233zdF, c56935yXu, null), yol, C56936yXv.KWHzl(i));
    }

    public static InterfaceC56679yOh EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, AbstractC59233zdF abstractC59233zdF, C56935yXu c56935yXu, @NotNull yOL yol, int i) {
        if (interfaceC56658yNn == null) {
            copydefault(34);
        }
        if (yol == null) {
            copydefault(35);
        }
        if (abstractC59233zdF == null) {
            return null;
        }
        return new yPM(interfaceC56658yNn, new C59116zav(interfaceC56658yNn, abstractC59233zdF, c56935yXu, null), yol, C56936yXv.KWHzl(i));
    }
}
