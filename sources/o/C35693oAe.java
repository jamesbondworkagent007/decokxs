package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35693oAe extends AbstractC35691oAc {
    public static final C35693oAe AEQbTJ = new C35693oAe();

    private C35693oAe() {
    }

    @Override // o.InterfaceC35283nsR
    public void EZpvd(int i, @NotNull OKMessage oKMessage, @NotNull RecyclerView.Adapter<?> adapter, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(textView, "");
        C35254nrp c35254nrpEZpvd = EZpvd(i - 1, adapter);
        nDD ndd = nDD.OLrzqt;
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.CharSequence charSequenceAEQbTJ = ndd.AEQbTJ(context, c35254nrpEZpvd != null ? c35254nrpEZpvd.OLrzqt() : null, oKMessage);
        textView.setText(charSequenceAEQbTJ);
        if (C33129mqd.OLrzqt(charSequenceAEQbTJ)) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // o.InterfaceC35283nsR
    public void KWHzl(int i, @NotNull OKMessage oKMessage, @NotNull RecyclerView.Adapter<?> adapter, @NotNull android.widget.TextView textView, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(adapter, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = textView.getContext();
        nDD ndd = nDD.OLrzqt;
        long jAEQbTJ = ndd.AEQbTJ(oKMessage);
        Intrinsics.copydefault(context);
        java.lang.String strOLrzqt = ndd.OLrzqt(context, jAEQbTJ);
        view.setVisibility(0);
        textView.setText(strOLrzqt);
    }
}
