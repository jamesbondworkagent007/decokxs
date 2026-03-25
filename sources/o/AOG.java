package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.FfiConverterInt;
import uniffi.growth.FfiConverterOptionalULong;
import uniffi.growth.FfiConverterTypePopupPriorityConfig;
import uniffi.growth.FfiConverterTypePopupProvider;
import uniffi.growth.FfiConverterTypePopupTriggerContext;
import uniffi.growth.UniffiLib;

/* JADX INFO: loaded from: classes25.dex */
public class AOG extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.yDv) A[MD:(o.yDv):void (m)] call: o.AOG.<init>(o.yDv):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AOG(C56396yDv c56396yDv, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56396yDv);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOG(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AOG.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AOG.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popupprioritymanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popupprioritymanager(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AOG(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ANQ.uniffiRustBuffer, new Function2() { // from class: o.AOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AOG.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AOG.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_free_popupprioritymanager(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_clone_popupprioritymanager(j, uniffiRustCallStatus);
    }

    public AOG(final C56396yDv c56396yDv) {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AOG._init_$lambda$4(c56396yDv, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long _init_$lambda$4(C56396yDv c56396yDv, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_growth_fn_constructor_popupprioritymanager_new(FfiConverterOptionalULong.INSTANCE.lower2(c56396yDv), uniffiRustCallStatus);
    }

    public static final Unit cancelActiveTrigger$lambda$6(final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.cancelActiveTrigger$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit cancelActiveTrigger$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_cancel_active_trigger(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit clearProviders$lambda$8(final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.clearProviders$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit clearProviders$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_clear_providers(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit registerProvider$lambda$10(final AOQ aoq, final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.registerProvider$lambda$10$lambda$9(j, aoq, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit registerProvider$lambda$10$lambda$9(long j, AOQ aoq, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_register_provider(j, FfiConverterTypePopupProvider.INSTANCE.lower2(aoq).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit trigger$lambda$12(final C2533APk c2533APk, final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.trigger$lambda$12$lambda$11(j, c2533APk, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trigger$lambda$12$lambda$11(long j, C2533APk c2533APk, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_trigger(j, FfiConverterTypePopupTriggerContext.INSTANCE.lower2(c2533APk).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit unregisterProvider$lambda$14(final int i, final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.unregisterProvider$lambda$14$lambda$13(j, i, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit unregisterProvider$lambda$14$lambda$13(long j, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_unregister_provider(j, FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    public static final Unit updateConfig$lambda$16(final AOH aoh, final long j) {
        C60173zxj.uniffiRustCall(ANQ.uniffiRustBuffer, new Function1() { // from class: o.AOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AOG.updateConfig$lambda$16$lambda$15(j, aoh, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit updateConfig$lambda$16$lambda$15(long j, AOH aoh, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_growth_fn_method_popupprioritymanager_update_config(j, FfiConverterTypePopupPriorityConfig.INSTANCE.lower2((java.lang.Object) aoh), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
