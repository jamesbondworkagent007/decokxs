package o;

import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;

/* JADX INFO: renamed from: o.jsG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27279jsG implements android.text.InputFilter {
    public int EZpvd;

    public C27279jsG(int i) {
        this.EZpvd = i;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        int i5 = this.EZpvd;
        Intrinsics.copydefault(spanned);
        int length = i5 - (spanned.length() - (i4 - i3));
        if (length >= i2 - i) {
            return null;
        }
        if (length <= 0) {
            EZpvd();
            return "";
        }
        int i6 = length + i;
        Intrinsics.copydefault(charSequence);
        if (java.lang.Character.isHighSurrogate(charSequence.charAt(i6 - 1)) && i6 - 1 == i) {
            EZpvd();
            return "";
        }
        EZpvd();
        return charSequence.subSequence(i, i6);
    }

    public final void EZpvd() {
        C57599ylU.AEQbTJ(C25493ixk.FragmentManager.getLocation);
    }
}
