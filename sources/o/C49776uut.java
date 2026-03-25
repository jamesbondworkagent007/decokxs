package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49776uut extends AbstractC59533zio<C49777uuu, C49780uux> {
    public final Function2<C49777uuu, java.lang.Boolean, Unit> AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.uuu, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C49776uut(@NotNull Function2<? super C49777uuu, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
        this.KWHzl = true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C49780uux onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C49511upt.StateListAnimator.AYXKKw, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C49780uux((AbstractC49526uqH) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C49780uux c49780uux, @NotNull final C49777uuu c49777uuu) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(c49780uux, "");
        Intrinsics.checkNotNullParameter(c49777uuu, "");
        android.widget.TextView textView = c49780uux.OLrzqt().OLrzqt;
        try {
            textView.setText(c49777uuu.OLrzqt());
            textView.setSelected(c49777uuu.KWHzl());
            if (getAdapter().getItems().size() > 0) {
                int adapterPosition = c49780uux.getAdapterPosition();
                if (adapterPosition == 0) {
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 != null) {
                        android.content.Context context = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        layoutParams3.leftMargin = C33052mpF.EZpvd(4.0f, context);
                    }
                    ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams5 = layoutParams4 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams4 : null;
                    if (layoutParams5 != null) {
                        android.content.Context context2 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        layoutParams5.rightMargin = C33052mpF.EZpvd(4.0f, context2);
                    }
                } else if (adapterPosition == getAdapter().getItems().size() - 1) {
                    ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
                    if (layoutParams7 != null) {
                        android.content.Context context3 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "");
                        layoutParams7.rightMargin = C33052mpF.EZpvd(4.0f, context3);
                    }
                    ViewGroup.LayoutParams layoutParams8 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams9 = layoutParams8 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams8 : null;
                    if (layoutParams9 != null) {
                        android.content.Context context4 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        layoutParams9.leftMargin = C33052mpF.EZpvd(4.0f, context4);
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams10 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams11 = layoutParams10 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams10 : null;
                    if (layoutParams11 != null) {
                        layoutParams11.leftMargin = 0;
                    }
                    ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams13 = layoutParams12 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams12 : null;
                    if (layoutParams13 != null) {
                        layoutParams13.rightMargin = 0;
                    }
                }
                if (getAdapter().getItems().size() == 1) {
                    ViewGroup.LayoutParams layoutParams14 = textView.getLayoutParams();
                    layoutParams = layoutParams14 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams14 : null;
                    if (layoutParams != null) {
                        C33566myq c33566myq = C33566myq.EZpvd;
                        android.content.Context context5 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "");
                        int iEZpvd = c33566myq.EZpvd(context5);
                        android.content.Context context6 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context6, "");
                        layoutParams.width = iEZpvd - C33052mpF.EZpvd(40.0f, context6);
                    }
                } else if (getAdapter().getItems().size() <= 6) {
                    ViewGroup.LayoutParams layoutParams15 = textView.getLayoutParams();
                    layoutParams = layoutParams15 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams15 : null;
                    if (layoutParams != null) {
                        C33566myq c33566myq2 = C33566myq.EZpvd;
                        android.content.Context context7 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "");
                        int iEZpvd2 = c33566myq2.EZpvd(context7);
                        android.content.Context context8 = textView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context8, "");
                        layoutParams.width = (iEZpvd2 - C33052mpF.EZpvd(48.0f, context8)) / getAdapter().getItems().size();
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        c49780uux.OLrzqt().getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.uuw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49776uut.copydefault(this.AEQbTJ, c49777uuu, view);
            }
        });
    }

    public static final void copydefault(C49776uut c49776uut, C49777uuu c49777uuu, android.view.View view) {
        if (c49776uut.KWHzl) {
            if (c49777uuu.KWHzl()) {
                c49776uut.AEQbTJ.invoke(c49777uuu, java.lang.Boolean.FALSE);
                return;
            }
            java.util.List<?> items = c49776uut.getAdapter().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            for (java.lang.Object obj : items) {
                C49777uuu c49777uuu2 = obj instanceof C49777uuu ? (C49777uuu) obj : null;
                if (c49777uuu2 != null) {
                    c49777uuu2.KWHzl(false);
                }
            }
            c49777uuu.KWHzl(true);
            c49776uut.AEQbTJ.invoke(c49777uuu, java.lang.Boolean.TRUE);
            c49776uut.getAdapter().notifyDataSetChanged();
        }
    }
}
