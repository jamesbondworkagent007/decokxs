package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20082gaF;
import o.C13754dXa;
import o.C52761wXj;
import o.C57230yeW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gde, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20266gde extends C20191gcI<C9216bRR> {
    public final Activity fARcdN = new Activity();

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C9216bRR KWHzl(C20266gde c20266gde) {
        return (C9216bRR) c20266gde.ejfBZ();
    }

    @Override // o.C20191gcI, o.C20150gbU, o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<C9216bRR>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        djBIcL(actionBar);
        actionBar.KWHzl(Unit.INSTANCE);
        actionBar.OLrzqt(AbstractC20102gaZ.moreView$default(this, false, null, new Function1() { // from class: o.gdb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20266gde.EZpvd(this.copydefault, (AbstractC20082gaF.ActionBar) obj);
            }
        }, 3, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C20266gde c20266gde, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(c20266gde.QVAiDq());
        actionBar.OLrzqt(c20266gde.QUSxYX());
        actionBar.copydefault(AbstractC20102gaZ.normalDataInMoreView$default(c20266gde, null, ((C9216bRR) c20266gde.ejfBZ()).AEQbTJ(true), 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gde$Activity */
    public static final class Activity extends C57230yeW.Application {
        public Activity() {
        }

        @Override // o.C57230yeW.Application
        public void OLrzqt(java.lang.String str) {
            C20266gde.KWHzl(C20266gde.this).AhwBna(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.view.View QUSxYX() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55008xbo c55008xbo = new C55008xbo(contextRequireContext, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        c55008xbo.setLayoutParams(marginLayoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        appCompatTextView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hKJZrr));
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        c55008xbo.setLabelView(appCompatTextView);
        android.view.View viewInflate = getLayoutInflater().inflate(C13754dXa.TaskDescription.OeawrHRnVkix, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        C57230yeW c57230yeW = (C57230yeW) viewInflate;
        c57230yeW.setMaxDecimalValue(0);
        java.lang.String strRcXXUw = ((C9216bRR) ejfBZ()).RcXXUw();
        C57230yeW.setTextWrapper$default(c57230yeW, strRcXXUw, null, 2, null);
        c57230yeW.setHint(strRcXXUw != null ? pTB.formatLocalized$default(strRcXXUw, null, 1, null) : null);
        c57230yeW.EZpvd(this.fARcdN);
        c57230yeW.AEQbTJ(this.fARcdN);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        c55008xbo.setContentView(viewInflate);
        return c55008xbo;
    }
}
