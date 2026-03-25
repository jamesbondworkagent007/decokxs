package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.ticker.TickerView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21665hHu implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final TickerView EZpvd;
    public final C29255kqG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C21665hHu(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull TickerView tickerView, @androidx.annotation.NonNull C29255kqG c29255kqG) {
        this.AEQbTJ = view;
        this.EZpvd = tickerView;
        this.copydefault = c29255kqG;
    }

    public static C21665hHu KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.hpmliR, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21665hHu copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.ParcelableVolumeInfo;
        TickerView tickerView = (TickerView) ViewBindings.findChildViewById(view, i);
        if (tickerView != null) {
            i = C23274hvD.Application.getBufferedPosition;
            C29255kqG c29255kqG = (C29255kqG) ViewBindings.findChildViewById(view, i);
            if (c29255kqG != null) {
                return new C21665hHu(view, tickerView, c29255kqG);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
