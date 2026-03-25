package o;

import android.view.View;
import com.okinc.business.market.features.smart_money.common.filter.ui.MultiSelectItemBinder$1;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29497kuk extends AbstractC25436iwg<SignalMultiSelectUiModel, hCZ> {
    public final Function1<java.lang.String, java.lang.Boolean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, java.lang.Boolean> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29497kuk(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
        super(MultiSelectItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<hCZ> c25435iwf, @NotNull SignalMultiSelectUiModel signalMultiSelectUiModel) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(signalMultiSelectUiModel, "");
        final hCZ hcz = (hCZ) c25435iwf.EZpvd();
        hcz.KWHzl.setText(signalMultiSelectUiModel.OLrzqt());
        if (signalMultiSelectUiModel.EZpvd() != null) {
            android.widget.ImageView imageView = hcz.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            hcz.OLrzqt.setImageResource(signalMultiSelectUiModel.EZpvd().intValue());
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) signalMultiSelectUiModel.AEQbTJ())) {
            android.widget.ImageView imageView2 = hcz.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            android.widget.ImageView imageView3 = hcz.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C25392ivp.loadImageBitmap$default(imageView3, signalMultiSelectUiModel.AEQbTJ(), new AbstractC5396Qc[0], null, new Function2() { // from class: o.kum
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29497kuk.copydefault(hcz, (android.graphics.Bitmap) obj, (java.lang.Throwable) obj2);
                }
            }, 4, null);
        } else {
            android.widget.ImageView imageView4 = hcz.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
        }
        if (signalMultiSelectUiModel.valueOf()) {
            drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.RlQdEF);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.accept);
        }
        hcz.EZpvd.setImageDrawable(drawableKWHzl);
        android.widget.LinearLayout root = hcz.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, signalMultiSelectUiModel));
    }

    public static final Unit copydefault(hCZ hcz, android.graphics.Bitmap bitmap, java.lang.Throwable th) {
        android.widget.ImageView imageView = hcz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(th == null ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kuk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29497kuk KWHzl;
        public final /* synthetic */ SignalMultiSelectUiModel OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29497kuk c29497kuk, SignalMultiSelectUiModel signalMultiSelectUiModel) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c29497kuk;
            this.OLrzqt = signalMultiSelectUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.KWHzl().invoke(this.OLrzqt.copydefault());
            }
        }
    }
}
