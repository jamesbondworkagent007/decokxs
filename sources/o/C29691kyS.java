package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.tag.ui.TagOtherItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29691kyS extends AbstractC25436iwg<C29690kyR, C21549hDm> {
    public C29691kyS() {
        super(TagOtherItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21549hDm> c25435iwf, @NotNull C29690kyR c29690kyR) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c29690kyR, "");
        C21549hDm c21549hDm = (C21549hDm) c25435iwf.EZpvd();
        if (c29690kyR.AEQbTJ()) {
            android.widget.ImageView imageView = c21549hDm.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadCircleImage$default(imageView, c29690kyR.KWHzl(), false, 2, null);
        } else {
            android.widget.ImageView imageView2 = c21549hDm.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.loadUrl$default(imageView2, c29690kyR.KWHzl(), null, 0, 0, 14, null);
        }
        java.lang.Integer numOLrzqt = c29690kyR.OLrzqt();
        if (numOLrzqt != null) {
            c21549hDm.AEQbTJ.setImageTintList(android.content.res.ColorStateList.valueOf(numOLrzqt.intValue()));
        }
        android.widget.TextView textView = c21549hDm.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c29690kyR.EZpvd().length() > 0 ? 0 : 8);
        c21549hDm.KWHzl.setText(c29690kyR.EZpvd());
        android.widget.TextView textView2 = c21549hDm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(c29690kyR.djBIcL().length() > 0 ? 0 : 8);
        c21549hDm.EZpvd.setText(c29690kyR.djBIcL());
        AppCompatImageView appCompatImageView = c21549hDm.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(c29690kyR.copydefault() == null ? 8 : 0);
        Function0<Unit> function0Copydefault = c29690kyR.copydefault();
        if (function0Copydefault != null) {
            ConstraintLayout root = c21549hDm.getRoot();
            root.setOnClickListener(new StateListAnimator(root, 1000L, function0Copydefault));
        }
    }

    /* JADX INFO: renamed from: o.kyS$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
