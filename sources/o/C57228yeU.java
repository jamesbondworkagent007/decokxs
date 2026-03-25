package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57228yeU implements android.text.TextWatcher {
    public InterfaceC57229yeV EZpvd;
    public java.lang.CharSequence copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC57229yeV interfaceC57229yeV) {
        Intrinsics.checkNotNullParameter(interfaceC57229yeV, "");
        this.EZpvd = interfaceC57229yeV;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    public C57228yeU(@NotNull java.lang.CharSequence charSequence, @NotNull InterfaceC57229yeV interfaceC57229yeV) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(interfaceC57229yeV, "");
        this.copydefault = charSequence;
        this.EZpvd = interfaceC57229yeV;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull java.lang.CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.toString(), (java.lang.Object) charSequence.toString())) {
            return;
        }
        this.EZpvd.AEQbTJ(this.copydefault, C57225yeR.EZpvd(charSequence));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull java.lang.CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault = C57225yeR.EZpvd(charSequence);
    }
}
