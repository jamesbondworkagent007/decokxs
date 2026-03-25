package o;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.business.invest_biz.ui.widget.transaction.TransactionStepItemBinder$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27526jwp extends AbstractC27119jpF<C27514jwd, iJG> {
    public final Function1<C27514jwd, java.lang.Boolean> AEQbTJ;
    public final Function1<C27514jwd, java.lang.Boolean> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.jwd, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jwd, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27526jwp(@NotNull Function1<? super C27514jwd, java.lang.Boolean> function1, @NotNull Function1<? super C27514jwd, java.lang.Boolean> function12) {
        super(TransactionStepItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull iJG ijg, @NotNull C27514jwd c27514jwd) {
        int i;
        Intrinsics.checkNotNullParameter(ijg, "");
        Intrinsics.checkNotNullParameter(c27514jwd, "");
        boolean zBooleanValue = this.AEQbTJ.invoke(c27514jwd).booleanValue();
        boolean zBooleanValue2 = this.EZpvd.invoke(c27514jwd).booleanValue();
        android.view.View view = ijg.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility((!zBooleanValue || getAdapter().getItems().size() == 2) ? 0 : 8);
        android.view.View view2 = ijg.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility((!zBooleanValue2 || getAdapter().getItems().size() == 2) ? 0 : 8);
        ijg.EZpvd.setBackgroundColor(C33070mpX.copydefault((c27514jwd.AEQbTJ() || c27514jwd.EZpvd()) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.zuBGHE));
        ijg.KWHzl.setBackgroundColor(C33070mpX.copydefault(c27514jwd.AEQbTJ() ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.zuBGHE));
        android.widget.ImageView imageView = ijg.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility((c27514jwd.EZpvd() || c27514jwd.AEQbTJ()) ? 0 : 8);
        android.widget.ImageView imageView2 = ijg.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility((c27514jwd.EZpvd() || c27514jwd.AEQbTJ()) ? 8 : 0);
        android.widget.TextView textView = ijg.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c27514jwd.AEQbTJ() ^ true ? 0 : 8);
        android.widget.TextView textView2 = ijg.valueOf;
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        textView2.setText(java.lang.String.valueOf(CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C27514jwd>) ((java.util.List<? extends java.lang.Object>) items), c27514jwd) + 1));
        android.widget.ImageView imageView3 = ijg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(c27514jwd.AEQbTJ() ? 0 : 8);
        android.widget.TextView textView3 = ijg.AhwBna;
        DisplayText displayTextCopydefault = c27514jwd.copydefault();
        android.content.Context context = ijg.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView3.setText(displayTextCopydefault.getString(context));
        ijg.AhwBna.setTextColor(C33070mpX.copydefault((c27514jwd.AEQbTJ() || c27514jwd.EZpvd()) ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
        android.widget.TextView textView4 = ijg.AhwBna;
        if (!zBooleanValue || getAdapter().getItems().size() <= 2) {
            i = (!zBooleanValue2 || getAdapter().getItems().size() <= 2) ? 17 : 8388613;
        } else {
            i = 8388611;
        }
        textView4.setGravity(i);
    }
}
