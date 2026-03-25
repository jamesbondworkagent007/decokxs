package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59300zeT implements InterfaceC59303zeW {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void KWHzl(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = IEncryptorType.DEFAULT_ENCRYPTOR;
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // o.InterfaceC59303zeW
    public boolean AEQbTJ(@NotNull InterfaceC59315zei interfaceC59315zei, @NotNull InterfaceC59315zei interfaceC59315zei2) {
        if (interfaceC59315zei == null) {
            KWHzl(3);
        }
        if (interfaceC59315zei2 == null) {
            KWHzl(4);
        }
        return interfaceC59315zei.equals(interfaceC59315zei2);
    }
}
