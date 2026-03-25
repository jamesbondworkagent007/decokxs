package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39528ptz extends AbstractC59533zio<C48916ueh, C39483ptG> {
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39528ptz(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C39483ptG onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(layoutInflater, C35964oKf.Application.gwTjWJ, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new C39483ptG((AbstractC36043oNd) viewDataBindingInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C39483ptG c39483ptG, @NotNull final C48916ueh c48916ueh) {
        Intrinsics.checkNotNullParameter(c39483ptG, "");
        Intrinsics.checkNotNullParameter(c48916ueh, "");
        c39483ptG.EZpvd().EZpvd.setText(c48916ueh.copydefault());
        c39483ptG.EZpvd().AEQbTJ.setText(c48916ueh.OLrzqt());
        android.widget.ImageView imageView = c39483ptG.EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.AEQbTJ(imageView, c48916ueh.EZpvd());
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c39483ptG.EZpvd().getRoot()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        InterfaceC58227yxM<? super java.lang.Object> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pty
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39528ptz.KWHzl(this.copydefault, c48916ueh, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.ptA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39528ptz.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58247yxgThrottleFirst.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ptx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C39528ptz.AEQbTJ(function1, obj);
            }
        });
    }

    public static final void KWHzl(C39528ptz c39528ptz, C48916ueh c48916ueh, java.lang.Object obj) {
        c39528ptz.copydefault.invoke(c48916ueh.KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
