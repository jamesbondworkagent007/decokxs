package o;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.glo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20700glo extends RecyclerView.ViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20700glo(@NotNull C16904esi c16904esi, @NotNull final Function0<Unit> function0) {
        android.view.View viewEZpvd;
        super(c16904esi.getRoot());
        Intrinsics.checkNotNullParameter(c16904esi, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final android.content.Context context = c16904esi.getRoot().getContext();
        c16904esi.getRoot().setOnItemClick(new Function1() { // from class: o.glt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20700glo.AEQbTJ(function0, ((java.lang.Integer) obj).intValue());
            }
        });
        InterfaceC52777wXz interfaceC52777wXzAEQbTJ = c16904esi.getRoot().AEQbTJ();
        if (interfaceC52777wXzAEQbTJ != null && (viewEZpvd = interfaceC52777wXzAEQbTJ.EZpvd()) != null) {
            viewEZpvd.setVisibility(8);
        }
        try {
            wXI root = c16904esi.getRoot();
            root.setCreateViewHolderCallback(new Function1() { // from class: o.glv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20700glo.copydefault(context, (ST) obj);
                }
            });
            root.KWHzl(C55298xhM.dpInt$default(96, (android.content.Context) null, 1, (java.lang.Object) null));
            Intrinsics.copydefault(root);
        } catch (java.lang.Exception e) {
            pUU.copydefault("zqh", "TransferViaXLayerBannerVH init error:" + e);
        }
        c16904esi.getRoot().setItems(yDY.AhwBna(new C52776wXy(context.getString(C13754dXa.FragmentManager.setDisplayOptions), context.getString(C13754dXa.FragmentManager.setDisplayShowTitleEnabled), null, ContextCompat.getDrawable(context, C13754dXa.Activity.RKcVTr), null, 16, null)));
    }

    public static final Unit AEQbTJ(Function0 function0, int i) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.content.Context context, ST st) {
        Intrinsics.checkNotNullParameter(st, "");
        st.itemView.setPadding(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        android.view.View viewOLrzqt = st.OLrzqt(C52761wXj.FragmentManager.gwTjWJ);
        android.widget.TextView textView = (android.widget.TextView) st.OLrzqt(C52761wXj.FragmentManager.gHZMYf);
        android.widget.TextView textView2 = (android.widget.TextView) st.OLrzqt(C52761wXj.FragmentManager.iKEqwx);
        textView2.setMaxLines(1);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView.setEllipsize(truncateAt);
        Intrinsics.copydefault(viewOLrzqt);
        ViewGroup.LayoutParams layoutParams = viewOLrzqt.getLayoutParams();
        if (layoutParams != null) {
            Intrinsics.copydefault(context);
            layoutParams.height = C55298xhM.OLrzqt(72, context);
            layoutParams.width = C55298xhM.OLrzqt(72, context);
            viewOLrzqt.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = viewOLrzqt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(C55298xhM.KWHzl(8.0f, context));
            }
            viewOLrzqt.setLayoutParams(marginLayoutParams);
            return Unit.INSTANCE;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
