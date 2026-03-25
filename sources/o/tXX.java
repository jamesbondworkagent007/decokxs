package o;

import com.okinc.localization.bean.LanguageItem;
import com.okinc.preference.ui.theme.ColorPreferenceBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXX extends AbstractC43215rlA implements InterfaceC46552tYo {
    @Override // o.InterfaceC46552tYo
    public void EZpvd(@NotNull android.content.Context context, boolean z, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        tYG.Companion.copydefault(context, z, java.lang.Integer.valueOf(i));
    }

    @Override // o.InterfaceC46552tYo
    public void KWHzl(@NotNull android.content.Context context, @NotNull LanguageItem.NameType nameType, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(nameType, "");
        ActivityC46568tZd.Companion.KWHzl(context, nameType);
    }

    @Override // o.InterfaceC46552tYo
    public void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        C46561tYx.Companion.OLrzqt(fragmentManager);
    }

    @Override // o.InterfaceC46552tYo
    public void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        ColorPreferenceBottomSheet.Companion.AEQbTJ(fragmentManager, z, z2);
    }
}
