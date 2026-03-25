package uniffi.user;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes14.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getAllUsers", "setAllUsers", "updateUser", "removeUser", "clearAll"})
public class UniffiVTableCallbackInterfaceUserDataSource extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceUserDataSourceMethod4 clearAll;
    public UniffiCallbackInterfaceUserDataSourceMethod0 getAllUsers;
    public UniffiCallbackInterfaceUserDataSourceMethod3 removeUser;
    public UniffiCallbackInterfaceUserDataSourceMethod1 setAllUsers;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;
    public UniffiCallbackInterfaceUserDataSourceMethod2 updateUser;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceUserDataSource() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0) : (r9v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1) : (r10v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2) : (r11v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3) : (r12v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4) : (r13v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4):void (m)] (LINE:414) call: uniffi.user.UniffiVTableCallbackInterfaceUserDataSource.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceUserDataSource(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUserDataSourceMethod0 uniffiCallbackInterfaceUserDataSourceMethod0, UniffiCallbackInterfaceUserDataSourceMethod1 uniffiCallbackInterfaceUserDataSourceMethod1, UniffiCallbackInterfaceUserDataSourceMethod2 uniffiCallbackInterfaceUserDataSourceMethod2, UniffiCallbackInterfaceUserDataSourceMethod3 uniffiCallbackInterfaceUserDataSourceMethod3, UniffiCallbackInterfaceUserDataSourceMethod4 uniffiCallbackInterfaceUserDataSourceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceUserDataSource implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0) : (r9v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1) : (r10v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2) : (r11v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3) : (r12v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3))
  (wrap:uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4) : (r13v0 uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4):void (m)] (LINE:423) call: uniffi.user.UniffiVTableCallbackInterfaceUserDataSource.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod0, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod1, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod2, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod3, uniffi.user.UniffiCallbackInterfaceUserDataSourceMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUserDataSourceMethod0 uniffiCallbackInterfaceUserDataSourceMethod0, UniffiCallbackInterfaceUserDataSourceMethod1 uniffiCallbackInterfaceUserDataSourceMethod1, UniffiCallbackInterfaceUserDataSourceMethod2 uniffiCallbackInterfaceUserDataSourceMethod2, UniffiCallbackInterfaceUserDataSourceMethod3 uniffiCallbackInterfaceUserDataSourceMethod3, UniffiCallbackInterfaceUserDataSourceMethod4 uniffiCallbackInterfaceUserDataSourceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceUserDataSourceMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUserDataSourceMethod0 uniffiCallbackInterfaceUserDataSourceMethod0, UniffiCallbackInterfaceUserDataSourceMethod1 uniffiCallbackInterfaceUserDataSourceMethod1, UniffiCallbackInterfaceUserDataSourceMethod2 uniffiCallbackInterfaceUserDataSourceMethod2, UniffiCallbackInterfaceUserDataSourceMethod3 uniffiCallbackInterfaceUserDataSourceMethod3, UniffiCallbackInterfaceUserDataSourceMethod4 uniffiCallbackInterfaceUserDataSourceMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceUserDataSourceMethod0, uniffiCallbackInterfaceUserDataSourceMethod1, uniffiCallbackInterfaceUserDataSourceMethod2, uniffiCallbackInterfaceUserDataSourceMethod3, uniffiCallbackInterfaceUserDataSourceMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceUserDataSource(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUserDataSourceMethod0 uniffiCallbackInterfaceUserDataSourceMethod0, UniffiCallbackInterfaceUserDataSourceMethod1 uniffiCallbackInterfaceUserDataSourceMethod1, UniffiCallbackInterfaceUserDataSourceMethod2 uniffiCallbackInterfaceUserDataSourceMethod2, UniffiCallbackInterfaceUserDataSourceMethod3 uniffiCallbackInterfaceUserDataSourceMethod3, UniffiCallbackInterfaceUserDataSourceMethod4 uniffiCallbackInterfaceUserDataSourceMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getAllUsers = uniffiCallbackInterfaceUserDataSourceMethod0;
        this.setAllUsers = uniffiCallbackInterfaceUserDataSourceMethod1;
        this.updateUser = uniffiCallbackInterfaceUserDataSourceMethod2;
        this.removeUser = uniffiCallbackInterfaceUserDataSourceMethod3;
        this.clearAll = uniffiCallbackInterfaceUserDataSourceMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceUserDataSource uniffiVTableCallbackInterfaceUserDataSource) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceUserDataSource, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceUserDataSource.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceUserDataSource.uniffiClone;
        this.getAllUsers = uniffiVTableCallbackInterfaceUserDataSource.getAllUsers;
        this.setAllUsers = uniffiVTableCallbackInterfaceUserDataSource.setAllUsers;
        this.updateUser = uniffiVTableCallbackInterfaceUserDataSource.updateUser;
        this.removeUser = uniffiVTableCallbackInterfaceUserDataSource.removeUser;
        this.clearAll = uniffiVTableCallbackInterfaceUserDataSource.clearAll;
    }
}
