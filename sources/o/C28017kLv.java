package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.widget.bottom_sheet.SingleSelectionUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kLv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C28017kLv extends kMD<SingleSelectionUiModel> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C28017kLv(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21543hDg c21543hDgEZpvd = C21543hDg.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21543hDgEZpvd, "");
        return c21543hDgEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull SingleSelectionUiModel singleSelectionUiModel) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(singleSelectionUiModel, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        C21543hDg c21543hDg = viewBindingAEQbTJ instanceof C21543hDg ? (C21543hDg) viewBindingAEQbTJ : null;
        if (c21543hDg == null) {
            return;
        }
        LinearLayoutCompat root = c21543hDg.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, singleSelectionUiModel));
        c21543hDg.AEQbTJ.setText(singleSelectionUiModel.EZpvd());
        wYC wyc = c21543hDg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(singleSelectionUiModel.AEQbTJ() ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.kLv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28017kLv EZpvd;
        public final /* synthetic */ SingleSelectionUiModel OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28017kLv c28017kLv, SingleSelectionUiModel singleSelectionUiModel) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c28017kLv;
            this.OLrzqt = singleSelectionUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl.invoke(this.OLrzqt.KWHzl());
            }
        }
    }
}
