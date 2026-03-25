package o;

import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.localization.bean.LanguageItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZK extends AbstractC43215rlA implements xWJ {
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.cZN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cZK.EZpvd();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cZJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cZK.KWHzl();
        }
    });

    public final InterfaceC46554tYq gEmmrt() {
        return (InterfaceC46554tYq) this.AEQbTJ.getValue();
    }

    public static final InterfaceC46554tYq EZpvd() {
        return (InterfaceC46554tYq) C43251rlk.copydefault(InterfaceC46554tYq.class);
    }

    public final InterfaceC46552tYo valueOf() {
        return (InterfaceC46552tYo) this.EZpvd.getValue();
    }

    public static final InterfaceC46552tYo KWHzl() {
        return (InterfaceC46552tYo) C43251rlk.copydefault(InterfaceC46552tYo.class);
    }

    @Override // o.xWJ
    public void copydefault(boolean z) {
        gEmmrt().AEQbTJ(z);
    }

    @Override // o.xWJ
    public boolean AYXKKw() {
        return gEmmrt().copydefault();
    }

    @Override // o.xWJ
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.String> continuation) {
        return gEmmrt().AEQbTJ(LanguageItem.NameType.OTHERS, continuation);
    }

    @Override // o.xWJ
    public int copydefault() {
        return gEmmrt().KWHzl();
    }

    @Override // o.xWJ
    public java.lang.String AhwBna() {
        return gEmmrt().AEQbTJ();
    }

    @Override // o.xWJ
    public void copydefault(@NotNull android.content.Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        valueOf().EZpvd(context, true, i);
    }

    @Override // o.xWJ
    public void AEQbTJ(@NotNull android.content.Context context, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        valueOf().KWHzl(context, LanguageItem.NameType.OTHERS, function0, function1);
    }

    @Override // o.xWJ
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        valueOf().copydefault(fragmentManager);
    }

    @Override // o.xWJ
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        fragmentManager.setFragmentResultListener("REQUEST_UPDATE_COLOR", lifecycleOwner, new FragmentResultListener() { // from class: o.cZL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                cZK.OLrzqt(function0, str, bundle);
            }
        });
        valueOf().EZpvd(fragmentManager, true, z);
    }

    public static final void OLrzqt(Function0 function0, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("REQUEST_UPDATE_COLOR")) {
            function0.invoke();
        }
    }
}
