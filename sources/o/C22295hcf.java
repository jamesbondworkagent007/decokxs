package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hcf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22295hcf extends AbstractC31189lpN<C20073gZx<java.lang.Object>, C21542hDf> {
    public final Function1<C20073gZx<java.lang.Object>, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZx<java.lang.Object>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22295hcf(@NotNull Function1<? super C20073gZx<java.lang.Object>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21542hDf KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21542hDf c21542hDfCopydefault = C21542hDf.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21542hDfCopydefault, "");
        return c21542hDfCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    public void KWHzl(@NotNull C21542hDf c21542hDf, @NotNull C20073gZx<java.lang.Object> c20073gZx) {
        Intrinsics.checkNotNullParameter(c21542hDf, "");
        Intrinsics.checkNotNullParameter(c20073gZx, "");
        c21542hDf.OLrzqt.setTag(c20073gZx);
        c21542hDf.OLrzqt.setText(c20073gZx.OLrzqt());
        if (!c20073gZx.copydefault()) {
            c21542hDf.OLrzqt.setEnabled(false);
            return;
        }
        c21542hDf.OLrzqt.setEnabled(true);
        c21542hDf.OLrzqt.setSelected(c20073gZx.KWHzl());
        C25352ivB.setOnDoubleCheckClickListener$default(c21542hDf.OLrzqt, 0L, new Function1() { // from class: o.hce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22295hcf.OLrzqt(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C22295hcf c22295hcf, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<C20073gZx<java.lang.Object>, Unit> function1 = c22295hcf.copydefault;
        java.lang.Object tag = view.getTag();
        Intrinsics.copydefault(tag, "");
        function1.invoke((C20073gZx) tag);
        return Unit.INSTANCE;
    }
}
