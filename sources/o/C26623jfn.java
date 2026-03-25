package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import com.okinc.business.invest_biz.ui.screens.search.SearchSuggestionsItemBinder$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26623jfn extends AbstractC27118jpE<InvestChip, C23798iJs> {
    public final Function1<InvestChip, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestChip, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26623jfn(@NotNull Function1<? super InvestChip, Unit> function1) {
        super(SearchSuggestionsItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public static final Unit KWHzl(C26623jfn c26623jfn, InvestChip investChip) {
        c26623jfn.EZpvd.invoke(investChip);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/jpG;Ljava/lang/Object;)V */
    @Override // o.AbstractC27118jpE
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C27120jpG<C23798iJs> c27120jpG, @NotNull final InvestChip investChip) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(investChip, "");
        EZpvd((C23798iJs) c27120jpG.KWHzl(), investChip, new Function0() { // from class: o.jfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26623jfn.KWHzl(this.OLrzqt, investChip);
            }
        });
    }

    public final void EZpvd(C23798iJs c23798iJs, InvestChip investChip, Function0<Unit> function0) {
        ConstraintLayout root = c23798iJs.getRoot();
        root.setOnClickListener(new Application(root, 1000L, function0));
        android.widget.TextView textView = c23798iJs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) investChip.KWHzl()) ? 0 : 8);
        c23798iJs.EZpvd.setText(investChip.KWHzl());
        android.widget.TextView textView2 = c23798iJs.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) investChip.EZpvd()) ? 0 : 8);
        c23798iJs.copydefault.setText(investChip.EZpvd());
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        c23798iJs.getRoot().setBackgroundResource(CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends InvestChip>) ((java.util.List<? extends java.lang.Object>) items), investChip) == 0 ? C52761wXj.Activity.AEQbTJ : C52761wXj.Activity.OLrzqt);
    }

    /* JADX INFO: renamed from: o.jfn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }
}
