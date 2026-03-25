package o;

import android.view.View;
import android.view.ViewGroup;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50041uzt extends AbstractC59533zio<EmptyData, C50044uzw> {
    public final Function1<EmptyData, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C50041uzt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.EmptyData, kotlin.Unit>):void (m)] (LINE:13) call: o.uzt.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C50041uzt(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.bot.data.EmptyData, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50041uzt(Function1<? super EmptyData, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C50044uzw onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C50044uzw(new C55173xeu(context, null, 0, 6, null));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C50044uzw c50044uzw, @NotNull final EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(c50044uzw, "");
        Intrinsics.checkNotNullParameter(emptyData, "");
        android.view.View view = c50044uzw.itemView;
        C55173xeu c55173xeu = view instanceof C55173xeu ? (C55173xeu) view : null;
        if (c55173xeu != null) {
            c55173xeu.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, emptyData.getMatchHeight() ? -1 : -2));
            c55173xeu.setTitle(emptyData.getTitle());
            c55173xeu.setSubTitle((java.lang.CharSequence) emptyData.getMsg());
            c55173xeu.setRetry(emptyData.getBtnText());
            c55173xeu.setImage(emptyData.getImage());
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.uzv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50041uzt.copydefault(this.copydefault, emptyData, view2);
                }
            });
            if (!C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(emptyData.getEmptyType()), (java.lang.Object) 0)) {
                c55173xeu.setEmptyTypeImage(emptyData.getEmptyType());
            } else {
                c55173xeu.setImage(emptyData.getImage());
            }
            if (emptyData.isCenter()) {
                c55173xeu.setGravity(17);
                return;
            }
            c55173xeu.setGravity(49);
            android.widget.ImageView imageViewCopydefault = c55173xeu.copydefault();
            if (emptyData.getMarginTop() > 0) {
                ViewGroup.LayoutParams layoutParams = imageViewCopydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = C55298xhM.dpInt$default(emptyData.getMarginTop(), (android.content.Context) null, 1, (java.lang.Object) null);
                imageViewCopydefault.setLayoutParams(marginLayoutParams);
            }
            if (emptyData.getMarginBottom() > 0) {
                ViewGroup.LayoutParams layoutParams2 = c55173xeu.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = C55298xhM.dpInt$default(emptyData.getMarginBottom(), (android.content.Context) null, 1, (java.lang.Object) null);
                    c55173xeu.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    public static final void copydefault(C50041uzt c50041uzt, EmptyData emptyData, android.view.View view) {
        Function1<EmptyData, Unit> function1 = c50041uzt.copydefault;
        if (function1 != null) {
            function1.invoke(emptyData);
        }
    }
}
