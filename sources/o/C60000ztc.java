package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C60000ztc;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60000ztc {
    public static /* synthetic */ C60060zuj createFragmentScope$default(androidx.fragment.app.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return copydefault(fragment, z);
    }

    public static final C60060zuj copydefault(@NotNull androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (!(fragment instanceof InterfaceC59938zsT)) {
            throw new java.lang.IllegalStateException("Fragment should implement AndroidScopeComponent".toString());
        }
        C60060zuj c60060zujOLrzqt = C59932zsN.EZpvd(fragment).OLrzqt(C59973ztB.KWHzl(fragment));
        if (c60060zujOLrzqt == null) {
            c60060zujOLrzqt = C60001ztd.OLrzqt(fragment, fragment);
        }
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C60060zuj c60060zujEZpvd = C60001ztd.EZpvd(fragmentActivityRequireActivity);
            if (c60060zujEZpvd != null) {
                c60060zujOLrzqt.AEQbTJ(c60060zujEZpvd);
            } else {
                c60060zujOLrzqt.EZpvd().EZpvd("Fragment '" + fragment + "' can't be linked to parent activity scope");
            }
        }
        return c60060zujOLrzqt;
    }

    public static final InterfaceC56387yDm<C60060zuj> AEQbTJ(@NotNull final androidx.fragment.app.Fragment fragment, final boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return C56392yDr.copydefault(new Function0<C60060zuj>() { // from class: org.koin.androidx.scope.FragmentExtKt$fragmentScope$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final C60060zuj invoke() {
                return C60000ztc.copydefault(fragment, z);
            }
        });
    }

    public static /* synthetic */ InterfaceC56387yDm fragmentScope$default(androidx.fragment.app.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return AEQbTJ(fragment, z);
    }

    public static final C60060zuj KWHzl(@NotNull androidx.fragment.app.Fragment fragment, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return C59932zsN.EZpvd(fragment).OLrzqt(C59973ztB.KWHzl(fragment), C59973ztB.OLrzqt(fragment), obj);
    }

    public static /* synthetic */ C60060zuj createScope$default(androidx.fragment.app.Fragment fragment, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return KWHzl(fragment, obj);
    }
}
