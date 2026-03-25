package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.tag.ui.TagInfoItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29693kyU extends AbstractC25436iwg<C29689kyQ, C21545hDi> {
    public C29693kyU() {
        super(TagInfoItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21545hDi> c25435iwf, @NotNull C29689kyQ c29689kyQ) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29689kyQ, "");
        C21545hDi c21545hDi = (C21545hDi) c25435iwf.EZpvd();
        if (c29689kyQ.EZpvd()) {
            android.widget.ImageView imageView = c21545hDi.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadCircleImage$default(imageView, c29689kyQ.copydefault(), false, 2, null);
        } else {
            android.widget.ImageView imageView2 = c21545hDi.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.loadUrl$default(imageView2, c29689kyQ.copydefault(), null, 0, 0, 14, null);
        }
        c21545hDi.AEQbTJ.setText(c29689kyQ.OLrzqt());
        AppCompatImageView appCompatImageView = c21545hDi.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c29689kyQ.AEQbTJ() == null ? 8 : 0);
        Function0<Unit> function0AEQbTJ = c29689kyQ.AEQbTJ();
        if (function0AEQbTJ != null) {
            LinearLayoutCompat root = c21545hDi.getRoot();
            root.setOnClickListener(new Activity(root, 1000L, function0AEQbTJ));
        }
    }

    /* JADX INFO: renamed from: o.kyU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
