package o;

import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.core.ok_app.modeswitch.liteSubMode.AppModeSwitchView$createSwitch$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33384mvT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33373mvI {
    public static final C33373mvI KWHzl = new C33373mvI();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33373mvI.copydefault();
        }
    });
    public static final int OLrzqt = 8;

    private C33373mvI() {
    }

    public final C33369mvE EZpvd() {
        return (C33369mvE) EZpvd.getValue();
    }

    public static final C33369mvE copydefault() {
        return new C33369mvE();
    }

    public final android.view.View AEQbTJ(@NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        android.view.View viewAEQbTJ = C33385mvU.copydefault.AEQbTJ(context, fragmentManager, lifecycleOwner, str, function2);
        android.view.View viewCopydefault = C33377mvM.copydefault.copydefault(context, lifecycleOwner, str, function2);
        linearLayout.addView(viewAEQbTJ);
        linearLayout.addView(viewCopydefault, new LinearLayout.LayoutParams(-2, -2));
        KWHzl.OLrzqt(linearLayout, viewCopydefault, viewAEQbTJ);
        C33367mvC.KWHzl(lifecycleOwner, new AppModeSwitchView$createSwitch$1$1(linearLayout, viewCopydefault, viewAEQbTJ, null));
        return linearLayout;
    }

    public final void OLrzqt(android.view.View view, android.view.View view2, android.view.View view3) {
        AbstractC33384mvT abstractC33384mvTOLrzqt = EZpvd().OLrzqt();
        view2.setVisibility(abstractC33384mvTOLrzqt instanceof AbstractC33384mvT.TaskDescription ? 0 : 8);
        view3.setVisibility(abstractC33384mvTOLrzqt instanceof AbstractC33384mvT.Activity ? 0 : 8);
        view.setVisibility(Intrinsics.EZpvd(abstractC33384mvTOLrzqt, AbstractC33384mvT.Application.AEQbTJ) ^ true ? 0 : 8);
    }
}
