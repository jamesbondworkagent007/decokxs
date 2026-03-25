package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.uilab.richtext.htmlspanner.style.Style;
import com.okinc.uilab.richtext.htmlspanner.style.StyleValue;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44053sBp extends C55135xeI {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44053sBp(@NotNull android.content.Context context, @NotNull InterfaceC55228xfw interfaceC55228xfw) {
        super(context, interfaceC55228xfw);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC55228xfw, "");
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        Style styleAEQbTJ = new Style().copydefault(java.lang.Integer.valueOf(iCopydefault)).AEQbTJ(Style.DisplayStyle.BLOCK);
        StyleValue.Unit unit = StyleValue.Unit.EM;
        EZpvd(TtmlNode.TAG_DIV, new C55218xfm(KWHzl(new C55216xfk(styleAEQbTJ.OLrzqt(new StyleValue(1.0f, unit))))));
        EZpvd(TtmlNode.TAG_P, new C55209xfd(1.0f, 0.1f, iCopydefault));
        C55216xfk c55216xfk = new C55216xfk(new Style().copydefault(java.lang.Integer.valueOf(iCopydefault)).AhwBna(new StyleValue(1.0f, unit)).AEQbTJ(new StyleValue(2.0f, unit)));
        EZpvd("blockquote", c55216xfk);
        EZpvd("ul", c55216xfk);
        EZpvd("ol", c55216xfk);
        EZpvd("li", new C55210xfe(iCopydefault));
        C55216xfk c55216xfkKWHzl = KWHzl(new C55206xfa(1.125f, 0.1f, iCopydefault));
        C55216xfk c55216xfkKWHzl2 = KWHzl(new C55206xfa(1.0f, 0.1f, iCopydefault));
        EZpvd("h4", c55216xfkKWHzl);
        EZpvd("h5", c55216xfkKWHzl2);
    }

    public final C55216xfk KWHzl(C55216xfk c55216xfk) {
        return new C55217xfl(new C55219xfn(c55216xfk));
    }
}
