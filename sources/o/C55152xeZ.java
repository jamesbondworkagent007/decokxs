package o;

import com.okinc.uilab.richtext.htmlspanner.spans.urlclick.OKURLSpan;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55152xeZ extends AbstractC55144xeR {
    public final InterfaceC55228xfw AEQbTJ;
    public final int copydefault;

    public C55152xeZ(int i, @NotNull InterfaceC55228xfw interfaceC55228xfw) {
        Intrinsics.checkNotNullParameter(interfaceC55228xfw, "");
        this.copydefault = i;
        this.AEQbTJ = interfaceC55228xfw;
    }

    @Override // o.AbstractC55144xeR
    public void copydefault(@NotNull C59895zpo c59895zpo, @NotNull android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, @NotNull C55142xeP c55142xeP) {
        Intrinsics.checkNotNullParameter(c59895zpo, "");
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "");
        Intrinsics.checkNotNullParameter(c55142xeP, "");
        java.lang.String strEZpvd = c59895zpo.EZpvd("href");
        Intrinsics.copydefault((java.lang.Object) strEZpvd);
        c55142xeP.KWHzl(new OKURLSpan(strEZpvd, this.copydefault, this.AEQbTJ), i, i2);
    }
}
