package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49352umt extends AbstractC49356umx {
    public InterfaceC48895ueM OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49352umt(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49352umt(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AEQbTJ(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49352umt(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        AEQbTJ(context, attributeSet);
    }

    private final void AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        InterfaceC48895ueM interfaceC48895ueMKWHzl = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).KWHzl(context, attributeSet);
        this.OLrzqt = interfaceC48895ueMKWHzl;
        if (interfaceC48895ueMKWHzl == null) {
            Intrinsics.gEmmrt("");
            interfaceC48895ueMKWHzl = null;
        }
        if (interfaceC48895ueMKWHzl instanceof android.view.View) {
            InterfaceC48895ueM interfaceC48895ueM = this.OLrzqt;
            if (interfaceC48895ueM == null) {
                Intrinsics.gEmmrt("");
                interfaceC48895ueM = null;
            }
            addView(interfaceC48895ueM instanceof android.view.View ? (android.view.View) interfaceC48895ueM : null);
        }
    }

    @Override // o.AbstractC49356umx
    public InterfaceC48895ueM AhwBna() {
        InterfaceC48895ueM interfaceC48895ueM = this.OLrzqt;
        if (interfaceC48895ueM != null) {
            return interfaceC48895ueM;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
