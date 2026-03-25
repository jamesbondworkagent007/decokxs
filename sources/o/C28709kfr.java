package o;

import android.view.View;
import com.okinc.business.market.features.meme.filter.blacklist.MemeBlacklistBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28709kfr extends AbstractC25436iwg<C28714kfw, C21572hEi> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public Function1<? super C28714kfw, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28709kfr(@NotNull Function1<? super C28714kfw, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        super(MemeBlacklistBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.AEQbTJ = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C21572hEi> c25435iwf, @NotNull C28714kfw c28714kfw) {
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(c28714kfw, "");
        C21572hEi c21572hEi = (C21572hEi) c25435iwf.EZpvd();
        android.widget.ImageView imageView = c21572hEi.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadSquareImage$default(imageView, c28714kfw.KWHzl(), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), null, 4, null);
        android.widget.ImageView imageView2 = c21572hEi.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.loadCircleImage$default(imageView2, c28714kfw.copydefault(), false, 2, null);
        c21572hEi.valueOf.setText(c28714kfw.AEQbTJ());
        c21572hEi.gEmmrt.setText(c28714kfw.EZpvd());
        c21572hEi.djBIcL.setText(C25352ivB.OLrzqt(c28714kfw.gEmmrt()));
        android.widget.LinearLayout linearLayout = c21572hEi.AEQbTJ;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this, c28714kfw));
        android.widget.ImageView imageView3 = c21572hEi.OLrzqt;
        imageView3.setOnClickListener(new StateListAnimator(imageView3, 1000L, this, c28714kfw));
    }

    /* JADX INFO: renamed from: o.kfr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C28709kfr EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28714kfw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28709kfr c28709kfr, C28714kfw c28714kfw) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c28709kfr;
            this.copydefault = c28714kfw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.invoke(this.copydefault.gEmmrt());
            }
        }
    }

    /* JADX INFO: renamed from: o.kfr$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C28714kfw AEQbTJ;
        public final /* synthetic */ C28709kfr KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28709kfr c28709kfr, C28714kfw c28714kfw) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c28709kfr;
            this.AEQbTJ = c28714kfw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(this.AEQbTJ);
            }
        }
    }
}
