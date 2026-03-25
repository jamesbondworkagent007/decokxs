package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dxV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C15075dxV extends AbstractC33073mpa {
    public C15059dxF EZpvd = new C15059dxF();

    public static /* synthetic */ void dappLikeOrUnlike$default(C15075dxV c15075dxV, java.lang.String str, long j, androidx.fragment.app.FragmentManager fragmentManager, boolean z, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dappLikeOrUnlike");
        }
        c15075dxV.AEQbTJ(str, j, fragmentManager, z, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, function0);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, final long j, final androidx.fragment.app.FragmentManager fragmentManager, final boolean z, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        C14923duc c14923duc = C14923duc.EZpvd;
        if (!c14923duc.zsXlph()) {
            if (fragmentManager != null) {
                C14923duc.showConnectWalletDialog$default(c14923duc, c14923duc.AuCTel(), fragmentManager, new Function0() { // from class: o.dxW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C15075dxV.OLrzqt(this.OLrzqt, str, j, fragmentManager, z, str2, str3, function0);
                    }
                }, null, 8, null);
            }
            return;
        }
        if (C54819xWm.KWHzl().AEQbTJ() instanceof AbstractActivityC33041mov) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(activityAEQbTJ, "");
            ((AbstractActivityC33041mov) activityAEQbTJ).showLoading();
        }
        C58216yxB c58216yxBCall = call();
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.EZpvd.copydefault(j, (24 & 2) != 0 ? 0 : 0, (24 & 4) != 0 ? "" : str2, (24 & 8) != 0 ? "" : null, (24 & 16) != 0 ? "" : null, (24 & 32) != 0 ? "" : str3, (24 & 64) != 0 ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(str), z ? 2 : 1), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.dxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15075dxV.EZpvd(function0, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15075dxV.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15075dxV.EZpvd((java.lang.Throwable) obj);
            }
        };
        c58216yxBCall.AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15075dxV.AEQbTJ(function12, obj);
            }
        }));
    }

    public static final Unit OLrzqt(C15075dxV c15075dxV, java.lang.String str, long j, androidx.fragment.app.FragmentManager fragmentManager, boolean z, java.lang.String str2, java.lang.String str3, Function0 function0) {
        c15075dxV.AEQbTJ(str, j, fragmentManager, z, str2, str3, function0);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function0 function0, java.lang.Boolean bool) {
        if (C54819xWm.KWHzl().AEQbTJ() instanceof AbstractActivityC33041mov) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(activityAEQbTJ, "");
            ((AbstractActivityC33041mov) activityAEQbTJ).dismissLoading();
        }
        function0.invoke();
        C7323ahf.KWHzl().AEQbTJ("refreshFavourite", null, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        if (C54819xWm.KWHzl().AEQbTJ() instanceof AbstractActivityC33041mov) {
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            Intrinsics.copydefault(activityAEQbTJ, "");
            ((AbstractActivityC33041mov) activityAEQbTJ).dismissLoading();
        }
        C33134mqi.AEQbTJ(th.getMessage());
        return Unit.INSTANCE;
    }
}
