package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.user.FfiConverterSequenceTypeCoreUser;
import uniffi.user.FfiConverterTypeCoreUser;
import uniffi.user.UniffiLib;

/* JADX INFO: renamed from: o.Bzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C5013Bzj extends AbstractC60182zxs implements InterfaceC5017Bzn {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5013Bzj(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.Bzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C5013Bzj.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C5013Bzj.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_userdatasource(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_userdatasource(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5013Bzj(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), BzK.uniffiRustBuffer, new Function2() { // from class: o.Bzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C5013Bzj.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C5013Bzj.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_free_userdatasource(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_clone_userdatasource(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC5017Bzn
    public java.util.List<BvH> OLrzqt() {
        return (java.util.List) FfiConverterSequenceTypeCoreUser.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.getAllUsers$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getAllUsers$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.getAllUsers$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getAllUsers$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_user_fn_method_userdatasource_get_all_users(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC5017Bzn
    public void AEQbTJ(@NotNull final java.util.List<BvH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bzl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.setAllUsers$lambda$7(list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit setAllUsers$lambda$7(final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.setAllUsers$lambda$7$lambda$6(j, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit setAllUsers$lambda$7$lambda$6(long j, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_userdatasource_set_all_users(j, FfiConverterSequenceTypeCoreUser.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC5017Bzn
    public void copydefault(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bzq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.updateUser$lambda$9(bvH, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit updateUser$lambda$9(final BvH bvH, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.updateUser$lambda$9$lambda$8(j, bvH, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateUser$lambda$9$lambda$8(long j, BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_userdatasource_update_user(j, FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC5017Bzn
    public void OLrzqt(@NotNull final BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.removeUser$lambda$11(bvH, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit removeUser$lambda$11(final BvH bvH, final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.removeUser$lambda$11$lambda$10(j, bvH, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit removeUser$lambda$11$lambda$10(long j, BvH bvH, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_userdatasource_remove_user(j, FfiConverterTypeCoreUser.INSTANCE.lower2((java.lang.Object) bvH), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC5017Bzn
    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bzo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.clearAll$lambda$13(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit clearAll$lambda$13(final long j) {
        C60173zxj.uniffiRustCall(BzK.uniffiRustBuffer, new Function1() { // from class: o.Bzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C5013Bzj.clearAll$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearAll$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_user_fn_method_userdatasource_clear_all(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
