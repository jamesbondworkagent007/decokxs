package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hMU extends android.widget.LinearLayout {
    public hFA KWHzl;
    public final InterfaceC56387yDm copydefault;

    private final kMM EZpvd() {
        return (kMM) this.copydefault.getValue();
    }

    public static final kMM copydefault() {
        hMP hmp = new hMP();
        kMM kmm = new kMM();
        kmm.register(hMR.class, hmp);
        return kmm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hMU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hMV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hMU.copydefault();
            }
        });
        KWHzl();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hMU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hMU(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setData(@NotNull hMT hmt) {
        int i;
        Intrinsics.checkNotNullParameter(hmt, "");
        setVisibility(C33129mqd.KWHzl((java.util.Collection) hmt.AEQbTJ()) ? 0 : 8);
        java.util.List<hMR> listAEQbTJ = hmt.AEQbTJ();
        hFA hfa = this.KWHzl;
        if (hfa != null) {
            RecyclerView recyclerView = hfa.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
                i = 8;
            } else {
                kMM.setData$default(EZpvd(), listAEQbTJ, null, 2, null);
                i = 0;
            }
            recyclerView.setVisibility(i);
            hfa.OLrzqt.setText(C33069mpW.copydefault(C23274hvD.Fragment.notify, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23271hvA.getShowData$default(C23271hvA.copydefault, C33129mqd.gEmmrt(hmt.OLrzqt()), false, null, false, false, 30, null)))));
            AppCompatTextView appCompatTextView = hfa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(hmt.copydefault() ? 0 : 8);
        }
    }

    public final void KWHzl() {
        RecyclerView recyclerView;
        hFA hfaOLrzqt = hFA.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        this.KWHzl = hfaOLrzqt;
        if (hfaOLrzqt == null || (recyclerView = hfaOLrzqt.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(EZpvd());
    }
}
