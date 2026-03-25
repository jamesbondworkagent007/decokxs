package o;

import com.just.agentweb.DefaultChromeClient;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yYH {
    public static final C56933yXs EZpvd = new C56933yXs("kotlin.jvm.JvmName");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void copydefault(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case DefaultChromeClient.FROM_CODE_INTENTION_LOCATION /* 96 */:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    private yYH() {
    }

    public static InterfaceC56679yOh EZpvd(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(0);
        }
        if (interfaceC56665yNu instanceof InterfaceC56658yNn) {
            return ((InterfaceC56658yNn) interfaceC56665yNu).DTwDnp();
        }
        return null;
    }

    public static boolean fIwbmz(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(1);
        }
        while (interfaceC56665yNu != null) {
            if (valueOf(interfaceC56665yNu) || fetchVPNInfo(interfaceC56665yNu)) {
                return true;
            }
            interfaceC56665yNu = interfaceC56665yNu.AuCTel();
        }
        return false;
    }

    public static boolean fetchVPNInfo(InterfaceC56665yNu interfaceC56665yNu) {
        return (interfaceC56665yNu instanceof InterfaceC56668yNx) && ((InterfaceC56668yNx) interfaceC56665yNu).getNewProxyInstance() == C56669yNy.AYXKKw;
    }

    public static C56930yXp AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(2);
        }
        C56933yXs c56933yXsAYXKKw = AYXKKw(interfaceC56665yNu);
        return c56933yXsAYXKKw != null ? c56933yXsAYXKKw.AYXKKw() : AhwBna(interfaceC56665yNu);
    }

    public static C56933yXs gEmmrt(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(3);
        }
        C56933yXs c56933yXsAYXKKw = AYXKKw(interfaceC56665yNu);
        if (c56933yXsAYXKKw == null) {
            c56933yXsAYXKKw = AhwBna(interfaceC56665yNu).djBIcL();
        }
        if (c56933yXsAYXKKw == null) {
            copydefault(4);
        }
        return c56933yXsAYXKKw;
    }

    public static C56933yXs AYXKKw(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(5);
        }
        if ((interfaceC56665yNu instanceof yNP) || C59370zfk.KWHzl(interfaceC56665yNu)) {
            return C56933yXs.EZpvd;
        }
        if (interfaceC56665yNu instanceof yNY) {
            return ((yNY) interfaceC56665yNu).KWHzl();
        }
        if (interfaceC56665yNu instanceof yNW) {
            return ((yNW) interfaceC56665yNu).KWHzl();
        }
        return null;
    }

    public static C56930yXp AhwBna(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(6);
        }
        C56930yXp c56930yXpAEQbTJ = AEQbTJ(interfaceC56665yNu.AuCTel()).AEQbTJ(interfaceC56665yNu.bR_());
        if (c56930yXpAEQbTJ == null) {
            copydefault(7);
        }
        return c56930yXpAEQbTJ;
    }

    public static boolean ejfBZ(InterfaceC56665yNu interfaceC56665yNu) {
        return interfaceC56665yNu != null && (interfaceC56665yNu.AuCTel() instanceof yNW);
    }

    public static boolean AEQbTJ(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull InterfaceC56665yNu interfaceC56665yNu2) {
        if (interfaceC56665yNu == null) {
            copydefault(16);
        }
        if (interfaceC56665yNu2 == null) {
            copydefault(17);
        }
        return OLrzqt(interfaceC56665yNu).equals(OLrzqt(interfaceC56665yNu2));
    }

    public static <D extends InterfaceC56665yNu> D AEQbTJ(InterfaceC56665yNu interfaceC56665yNu, @NotNull java.lang.Class<D> cls) {
        if (cls == null) {
            copydefault(18);
        }
        return (D) EZpvd(interfaceC56665yNu, cls, true);
    }

    public static <D extends InterfaceC56665yNu> D EZpvd(InterfaceC56665yNu interfaceC56665yNu, @NotNull java.lang.Class<D> cls, boolean z) {
        if (cls == null) {
            copydefault(19);
        }
        if (interfaceC56665yNu == null) {
            return null;
        }
        if (z) {
            interfaceC56665yNu = (D) interfaceC56665yNu.AuCTel();
        }
        while (interfaceC56665yNu != null) {
            if (cls.isInstance(interfaceC56665yNu)) {
                return (D) interfaceC56665yNu;
            }
            interfaceC56665yNu = (D) interfaceC56665yNu.AuCTel();
        }
        return null;
    }

    public static yNP copydefault(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            copydefault(20);
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl == null) {
            return null;
        }
        return copydefault(interfaceC56663yNsKWHzl);
    }

    public static yNP OLrzqt(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(21);
        }
        yNP ynpCopydefault = copydefault(interfaceC56665yNu);
        if (ynpCopydefault == null) {
            copydefault(22);
        }
        return ynpCopydefault;
    }

    public static yNP copydefault(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(23);
        }
        while (interfaceC56665yNu != null) {
            if (interfaceC56665yNu instanceof yNP) {
                return (yNP) interfaceC56665yNu;
            }
            if (interfaceC56665yNu instanceof yNY) {
                return ((yNY) interfaceC56665yNu).djBIcL();
            }
            interfaceC56665yNu = interfaceC56665yNu.AuCTel();
        }
        return null;
    }

    public static boolean OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56658yNn interfaceC56658yNn2) {
        if (interfaceC56658yNn == null) {
            copydefault(26);
        }
        if (interfaceC56658yNn2 == null) {
            copydefault(27);
        }
        java.util.Iterator<AbstractC59233zdF> it = interfaceC56658yNn.fJNWhG().bV_().iterator();
        while (it.hasNext()) {
            if (AEQbTJ(it.next(), interfaceC56658yNn2.bT_())) {
                return true;
            }
        }
        return false;
    }

    public static boolean EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC56658yNn interfaceC56658yNn2) {
        if (interfaceC56658yNn == null) {
            copydefault(28);
        }
        if (interfaceC56658yNn2 == null) {
            copydefault(29);
        }
        return KWHzl(interfaceC56658yNn.bQ_(), interfaceC56658yNn2.bT_());
    }

    public static boolean AEQbTJ(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (abstractC59233zdF == null) {
            copydefault(30);
        }
        if (interfaceC56665yNu == null) {
            copydefault(31);
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().OLrzqt();
        if (interfaceC56663yNsKWHzl == null) {
            return false;
        }
        InterfaceC56665yNu interfaceC56665yNuBT_ = interfaceC56663yNsKWHzl.fJNWhG();
        return (interfaceC56665yNuBT_ instanceof InterfaceC56663yNs) && (interfaceC56665yNu instanceof InterfaceC56663yNs) && ((InterfaceC56663yNs) interfaceC56665yNu).fJNWhG().equals(((InterfaceC56663yNs) interfaceC56665yNuBT_).fJNWhG());
    }

    public static boolean KWHzl(@NotNull AbstractC59233zdF abstractC59233zdF, @NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (abstractC59233zdF == null) {
            copydefault(32);
        }
        if (interfaceC56665yNu == null) {
            copydefault(33);
        }
        if (AEQbTJ(abstractC59233zdF, interfaceC56665yNu)) {
            return true;
        }
        java.util.Iterator<AbstractC59233zdF> it = abstractC59233zdF.djBIcL().bV_().iterator();
        while (it.hasNext()) {
            if (KWHzl(it.next(), interfaceC56665yNu)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isConnected(InterfaceC56665yNu interfaceC56665yNu) {
        return KWHzl(interfaceC56665yNu, ClassKind.OBJECT) && ((InterfaceC56658yNn) interfaceC56665yNu).AuCTelauCTel();
    }

    public static boolean fARcdN(InterfaceC56665yNu interfaceC56665yNu) {
        return (KWHzl(interfaceC56665yNu, ClassKind.CLASS) || KWHzl(interfaceC56665yNu, ClassKind.INTERFACE)) && ((InterfaceC56658yNn) interfaceC56665yNu).isConnected() == Modality.SEALED;
    }

    public static boolean valueOf(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(34);
        }
        return DbNXlk(interfaceC56665yNu) && interfaceC56665yNu.bR_().equals(C56938yXx.isConnected);
    }

    public static boolean fJNWhG(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(36);
        }
        return KWHzl(interfaceC56665yNu, ClassKind.ENUM_ENTRY);
    }

    public static boolean values(InterfaceC56665yNu interfaceC56665yNu) {
        return KWHzl(interfaceC56665yNu, ClassKind.ENUM_CLASS);
    }

    public static boolean djBIcL(InterfaceC56665yNu interfaceC56665yNu) {
        return KWHzl(interfaceC56665yNu, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean AuCTel(InterfaceC56665yNu interfaceC56665yNu) {
        return KWHzl(interfaceC56665yNu, ClassKind.INTERFACE);
    }

    public static boolean DbNXlk(InterfaceC56665yNu interfaceC56665yNu) {
        return KWHzl(interfaceC56665yNu, ClassKind.CLASS);
    }

    public static boolean AkhnZx(InterfaceC56665yNu interfaceC56665yNu) {
        return DbNXlk(interfaceC56665yNu) || values(interfaceC56665yNu);
    }

    public static boolean KWHzl(InterfaceC56665yNu interfaceC56665yNu, @NotNull ClassKind classKind) {
        if (classKind == null) {
            copydefault(37);
        }
        return (interfaceC56665yNu instanceof InterfaceC56658yNn) && ((InterfaceC56658yNn) interfaceC56665yNu).DbNXlk() == classKind;
    }

    public static InterfaceC56658yNn EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        if (interfaceC56658yNn == null) {
            copydefault(44);
        }
        java.util.Iterator<AbstractC59233zdF> it = interfaceC56658yNn.fJNWhG().bV_().iterator();
        while (it.hasNext()) {
            InterfaceC56658yNn interfaceC56658yNnOLrzqt = OLrzqt(it.next());
            if (interfaceC56658yNnOLrzqt.DbNXlk() != ClassKind.INTERFACE) {
                return interfaceC56658yNnOLrzqt;
            }
        }
        return null;
    }

    public static InterfaceC56658yNn OLrzqt(@NotNull AbstractC59233zdF abstractC59233zdF) {
        if (abstractC59233zdF == null) {
            copydefault(45);
        }
        return EZpvd(abstractC59233zdF.djBIcL());
    }

    public static InterfaceC56658yNn EZpvd(@NotNull InterfaceC59315zei interfaceC59315zei) {
        if (interfaceC59315zei == null) {
            copydefault(46);
        }
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC59315zei.OLrzqt();
        if (interfaceC56658yNn == null) {
            copydefault(47);
        }
        return interfaceC56658yNn;
    }

    public static yNC EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, boolean z) {
        if (interfaceC56658yNn == null) {
            copydefault(48);
        }
        ClassKind classKindDbNXlk = interfaceC56658yNn.DbNXlk();
        if (classKindDbNXlk == ClassKind.ENUM_CLASS || classKindDbNXlk.isSingleton()) {
            yNC ync = C56669yNy.AkhnZx;
            if (ync == null) {
                copydefault(49);
            }
            return ync;
        }
        if (fARcdN(interfaceC56658yNn)) {
            if (z) {
                yNC ync2 = C56669yNy.isConnected;
                if (ync2 == null) {
                    copydefault(50);
                }
                return ync2;
            }
            yNC ync3 = C56669yNy.AkhnZx;
            if (ync3 == null) {
                copydefault(51);
            }
            return ync3;
        }
        if (valueOf(interfaceC56658yNn)) {
            yNC ync4 = C56669yNy.OLrzqt;
            if (ync4 == null) {
                copydefault(52);
            }
            return ync4;
        }
        yNC ync5 = C56669yNy.fetchVPNInfo;
        if (ync5 == null) {
            copydefault(53);
        }
        return ync5;
    }

    public static <D extends CallableMemberDescriptor> D OLrzqt(@NotNull D d) {
        if (d == null) {
            copydefault(59);
        }
        while (d.bW_() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            java.util.Collection<? extends CallableMemberDescriptor> collectionValueOf = d.valueOf();
            if (collectionValueOf.isEmpty()) {
                throw new java.lang.IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
            d = (D) collectionValueOf.iterator().next();
        }
        return d;
    }

    public static <D extends InterfaceC56668yNx> D AEQbTJ(@NotNull D d) {
        if (d == null) {
            copydefault(64);
        }
        if (d instanceof CallableMemberDescriptor) {
            return OLrzqt((CallableMemberDescriptor) d);
        }
        if (d == null) {
            copydefault(65);
        }
        return d;
    }

    public static boolean EZpvd(@NotNull yOC yoc, @NotNull AbstractC59233zdF abstractC59233zdF) {
        if (yoc == null) {
            copydefault(66);
        }
        if (abstractC59233zdF == null) {
            copydefault(67);
        }
        if (!yoc.AubY() && !C59238zdK.AEQbTJ(abstractC59233zdF)) {
            if (C59322zep.copydefault(abstractC59233zdF)) {
                return true;
            }
            AbstractC56640yMw abstractC56640yMwAEQbTJ = yZE.AEQbTJ(yoc);
            if (AbstractC56640yMw.fetchVPNInfo(abstractC59233zdF)) {
                return true;
            }
            InterfaceC59284zeD interfaceC59284zeD = InterfaceC59284zeD.OLrzqt;
            if (interfaceC59284zeD.OLrzqt(abstractC56640yMwAEQbTJ.AxsJAY(), abstractC59233zdF) || interfaceC59284zeD.OLrzqt(abstractC56640yMwAEQbTJ.wlaJM().bQ_(), abstractC59233zdF) || interfaceC59284zeD.OLrzqt(abstractC56640yMwAEQbTJ.AhwBna(), abstractC59233zdF)) {
                return true;
            }
            yMH ymh = yMH.EZpvd;
            if (yMH.copydefault(abstractC59233zdF)) {
                return true;
            }
        }
        return false;
    }

    public static <D extends InterfaceC56657yNm> java.util.Set<D> EZpvd(@NotNull D d) {
        if (d == null) {
            copydefault(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OLrzqt(d.fJNWhG(), linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<D extends o.yNm> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <D extends InterfaceC56657yNm> void OLrzqt(@NotNull D d, @NotNull java.util.Set<D> set) {
        if (d == null) {
            copydefault(73);
        }
        if (set == 0) {
            copydefault(74);
        }
        if (set.contains(d)) {
            return;
        }
        java.util.Iterator<? extends InterfaceC56657yNm> it = d.fJNWhG().valueOf().iterator();
        while (it.hasNext()) {
            InterfaceC56657yNm interfaceC56657yNmAhwBna = it.next().fJNWhG();
            OLrzqt(interfaceC56657yNmAhwBna, set);
            set.add(interfaceC56657yNmAhwBna);
        }
    }

    public static InterfaceC56684yOm KWHzl(@NotNull InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu == null) {
            copydefault(82);
        }
        if (interfaceC56665yNu instanceof InterfaceC56680yOi) {
            interfaceC56665yNu = ((InterfaceC56680yOi) interfaceC56665yNu).fIwbmz();
        }
        if (interfaceC56665yNu instanceof InterfaceC56664yNt) {
            InterfaceC56684yOm interfaceC56684yOmCopydefault = ((InterfaceC56664yNt) interfaceC56665yNu).fARcdN().copydefault();
            if (interfaceC56684yOmCopydefault == null) {
                copydefault(83);
            }
            return interfaceC56684yOmCopydefault;
        }
        InterfaceC56684yOm interfaceC56684yOm = InterfaceC56684yOm.EZpvd;
        if (interfaceC56684yOm == null) {
            copydefault(84);
        }
        return interfaceC56684yOm;
    }
}
