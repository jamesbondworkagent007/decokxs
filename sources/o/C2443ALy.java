package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.FfiConverterTypeFeatureRestrictionEvent;
import uniffi.feature_restriction.UniffiLib;

/* JADX INFO: renamed from: o.ALy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2443ALy extends AbstractC60182zxs implements InterfaceC2438ALt {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443ALy(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.ALw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2443ALy.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ALA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2443ALy.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictionlistener(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictionlistener(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2443ALy(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), ALB.uniffiRustBuffer, new Function2() { // from class: o.ALC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2443ALy.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.ALD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2443ALy.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_free_featurerestrictionlistener(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_feature_restriction_fn_clone_featurerestrictionlistener(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2438ALt
    public void EZpvd(@NotNull final AbstractC2440ALv abstractC2440ALv) {
        Intrinsics.checkNotNullParameter(abstractC2440ALv, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.ALx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2443ALy.onFeatureRestrictionEvent$lambda$5(abstractC2440ALv, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFeatureRestrictionEvent$lambda$5(final AbstractC2440ALv abstractC2440ALv, final long j) {
        C60173zxj.uniffiRustCall(ALB.uniffiRustBuffer, new Function1() { // from class: o.ALz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2443ALy.onFeatureRestrictionEvent$lambda$5$lambda$4(j, abstractC2440ALv, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFeatureRestrictionEvent$lambda$5$lambda$4(long j, AbstractC2440ALv abstractC2440ALv, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_feature_restriction_fn_method_featurerestrictionlistener_on_feature_restriction_event(j, FfiConverterTypeFeatureRestrictionEvent.INSTANCE.lower2((java.lang.Object) abstractC2440ALv), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
