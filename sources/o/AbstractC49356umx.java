package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.share.view.FootViewTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49356umx extends android.widget.FrameLayout implements InterfaceC48895ueM {
    public abstract InterfaceC48895ueM AhwBna();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC49356umx(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC49356umx(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC49356umx(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    @Override // o.InterfaceC48895ueM
    public void setIcon(android.graphics.drawable.Drawable drawable) {
        AhwBna().setIcon(drawable);
    }

    @Override // o.InterfaceC48895ueM
    public void setTitle(java.lang.CharSequence charSequence) {
        AhwBna().setTitle(charSequence);
    }

    @Override // o.InterfaceC48895ueM
    public void setSubTitle(java.lang.CharSequence charSequence) {
        AhwBna().setSubTitle(charSequence);
    }

    @Override // o.InterfaceC48895ueM
    public void setQRCode(java.lang.String str) {
        AhwBna().setQRCode(str);
    }

    @Override // o.InterfaceC48895ueM
    public java.lang.String OLrzqt() {
        return AhwBna().OLrzqt();
    }

    @Override // o.InterfaceC48895ueM
    public void setFrom(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AhwBna().setFrom(str);
    }

    @Override // o.InterfaceC48895ueM
    public java.lang.String AEQbTJ() {
        return AhwBna().AEQbTJ();
    }

    @Override // o.InterfaceC48895ueM
    public void setSrcFrom(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AhwBna().setSrcFrom(str, function0);
    }

    @Override // o.InterfaceC48895ueM
    public void setTheme(@NotNull FootViewTheme footViewTheme) {
        Intrinsics.checkNotNullParameter(footViewTheme, "");
        AhwBna().setTheme(footViewTheme);
    }

    @Override // o.InterfaceC48895ueM
    public FootViewTheme copydefault() {
        return AhwBna().copydefault();
    }

    @Override // o.InterfaceC48895ueM
    public void KWHzl(LifecycleOwner lifecycleOwner, java.lang.String str, @NotNull C48891ueI c48891ueI, @NotNull Function1<? super C48887ueE, Unit> function1) {
        Intrinsics.checkNotNullParameter(c48891ueI, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AhwBna().KWHzl(lifecycleOwner, str, c48891ueI, function1);
    }

    @Override // o.InterfaceC48895ueM
    public boolean KWHzl() {
        return AhwBna().KWHzl();
    }

    @Override // o.InterfaceC48895ueM
    public boolean EZpvd() {
        return AhwBna().EZpvd();
    }
}
