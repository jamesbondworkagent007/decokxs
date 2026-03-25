package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45715svW extends C32981mno {
    public static final void KWHzl() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull final android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityCreated(activity, bundle);
        if ((activity instanceof InterfaceC33168mrP) && (activity instanceof FragmentActivity)) {
            InterfaceC33168mrP interfaceC33168mrP = (InterfaceC33168mrP) activity;
            interfaceC33168mrP.AEQbTJ(new Function1() { // from class: o.svZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C45715svW.EZpvd((java.lang.String) obj));
                }
            });
            interfaceC33168mrP.AEQbTJ(new yHO() { // from class: o.swb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C45715svW.AEQbTJ(this.copydefault, activity, (java.lang.String) obj, (android.os.Bundle) obj2, (Function2) obj3);
                }
            });
        }
    }

    public static final boolean EZpvd(java.lang.String str) {
        return !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) C45778swx.KWHzl()), str);
    }

    public static final Unit AEQbTJ(C45715svW c45715svW, android.app.Activity activity, java.lang.String str, android.os.Bundle bundle, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        c45715svW.KWHzl(activity, str, bundle, function2);
        return Unit.INSTANCE;
    }

    @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof InterfaceC33215msJ) {
            return;
        }
        C45776swv.KWHzl.OLrzqt(activity);
    }

    @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            ((AbstractActivityC33041mov) activity).getSupportFragmentManager().removeOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: o.svU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public final void onBackStackChanged() {
                    C45715svW.KWHzl();
                }
            });
        }
    }

    public final void KWHzl(android.app.Activity activity, java.lang.String str, android.os.Bundle bundle, Function2<? super LiteNavigationTabEnum, ? super android.os.Bundle, Unit> function2) {
        yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit> yho;
        if (C45778swx.AEQbTJ().containsKey(str)) {
            function2.invoke(C45778swx.AEQbTJ().get(str), bundle);
            return;
        }
        if (str != null) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() > 1) {
                java.lang.String str2 = listSplit$default.get(0) + "/" + listSplit$default.get(1);
                if (C45778swx.copydefault().containsKey(str2)) {
                    yHO<android.content.Context, java.lang.String, android.os.Bundle, Unit> yho2 = C45778swx.copydefault().get(str2);
                    if (yho2 != null) {
                        if (bundle == null) {
                            bundle = new android.os.Bundle();
                        }
                        yho2.invoke(activity, str, bundle);
                        return;
                    }
                    return;
                }
                if (listSplit$default.size() > 2) {
                    java.lang.String str3 = str2 + "/" + listSplit$default.get(2);
                    if (!C45778swx.copydefault().containsKey(str3) || (yho = C45778swx.copydefault().get(str3)) == null) {
                        return;
                    }
                    if (bundle == null) {
                        bundle = new android.os.Bundle();
                    }
                    yho.invoke(activity, str, bundle);
                }
            }
        }
    }
}
