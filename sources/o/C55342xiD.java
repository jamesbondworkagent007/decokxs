package o;

import androidx.core.widget.TextViewCompat;
import com.okinc.uilib.hyperlink.state.HyperlinkFontWeight;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C55342xiD extends AbstractC55339xiA {
    public static final ActionBar Companion = new ActionBar(null);
    public int copydefault = -1;

    @Override // o.AbstractC55339xiA
    public void AEQbTJ(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        HyperlinkFontWeight hyperlinkFontWeightCopydefault = c55356xiR.copydefault();
        if (hyperlinkFontWeightCopydefault != null) {
            int iOLrzqt = OLrzqt(hyperlinkFontWeightCopydefault);
            TextViewCompat.setTextAppearance(c55425xjh, iOLrzqt);
            this.copydefault = iOLrzqt;
        }
    }

    @Override // o.AbstractC55339xiA
    public boolean copydefault(@NotNull C55425xjh c55425xjh, @NotNull C55356xiR c55356xiR) {
        Intrinsics.checkNotNullParameter(c55425xjh, "");
        Intrinsics.checkNotNullParameter(c55356xiR, "");
        HyperlinkFontWeight hyperlinkFontWeightCopydefault = c55356xiR.copydefault();
        return !(hyperlinkFontWeightCopydefault != null && this.copydefault == OLrzqt(hyperlinkFontWeightCopydefault));
    }

    public final int OLrzqt(HyperlinkFontWeight hyperlinkFontWeight) {
        return hyperlinkFontWeight.getFontWeight$OKUILib_uilib() < 500 ? C52761wXj.LoaderManager.gGvvIC : hyperlinkFontWeight.getFontWeight$OKUILib_uilib() < 700 ? C52761wXj.LoaderManager.giSNqX : C52761wXj.LoaderManager.fFgQHt;
    }

    /* JADX INFO: renamed from: o.xiD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xiD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
