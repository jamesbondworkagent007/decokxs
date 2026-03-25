package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.SimpleFaqArticle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21823hNq extends AbstractC59533zio<SimpleFaqArticle, Application> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C21823hNq() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("web3_dex_faq_swap_") : (r2v0 java.lang.String))
 A[MD:(boolean, java.lang.String):void (m)] (LINE:19) call: o.hNq.<init>(boolean, java.lang.String):void type: THIS */
    public /* synthetic */ C21823hNq(boolean z, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "web3_dex_faq_swap_" : str);
    }

    /* JADX INFO: renamed from: o.hNq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hNq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public C21823hNq(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = z;
        this.KWHzl = str;
    }

    public final java.lang.String KWHzl(int i) {
        return this.KWHzl + i;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hDD hddCopydefault = hDD.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hddCopydefault, "");
        return new Application(this, hddCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final Application application, @NotNull final SimpleFaqArticle simpleFaqArticle) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(simpleFaqArticle, "");
        application.itemView.setContentDescription(KWHzl(application.getLayoutPosition()));
        application.OLrzqt().setText(simpleFaqArticle.getTitle());
        application.EZpvd().setText(simpleFaqArticle.getContent());
        if (this.AEQbTJ) {
            application.AEQbTJ().setVisibility(0);
            application.KWHzl().setVisibility(0);
            application.EZpvd().setVisibility(simpleFaqArticle.isOpenStatus() ? 0 : 8);
            application.KWHzl().setImageResource(simpleFaqArticle.isOpenStatus() ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
            C25352ivB.setOnDoubleCheckClickListener$default(application.copydefault(), 0L, new Function1() { // from class: o.hNt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21823hNq.copydefault(simpleFaqArticle, application, (android.view.View) obj);
                }
            }, 1, null);
            return;
        }
        application.EZpvd().setVisibility(0);
        application.KWHzl().setVisibility(8);
        application.AEQbTJ().setVisibility(application.getLayoutPosition() >= getAdapter().getItemCount() + (-1) ? 8 : 0);
        application.copydefault().setOnClickListener(null);
    }

    public static final Unit copydefault(SimpleFaqArticle simpleFaqArticle, Application application, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (!simpleFaqArticle.isOpenStatus()) {
            application.EZpvd().setVisibility(0);
            application.KWHzl().setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            simpleFaqArticle.setOpenStatus(true);
        } else {
            application.EZpvd().setVisibility(8);
            application.KWHzl().setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            simpleFaqArticle.setOpenStatus(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.hNq$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final android.view.View AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final /* synthetic */ C21823hNq EZpvd;
        public final android.widget.RelativeLayout KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.RelativeLayout copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C21823hNq c21823hNq, hDD hdd) {
            super(hdd.getRoot());
            Intrinsics.checkNotNullParameter(hdd, "");
            this.EZpvd = c21823hNq;
            android.widget.TextView textView = hdd.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            this.AYXKKw = textView;
            android.widget.TextView textView2 = hdd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            this.copydefault = textView2;
            android.widget.RelativeLayout relativeLayout = hdd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            this.KWHzl = relativeLayout;
            android.widget.ImageView imageView = hdd.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            this.OLrzqt = imageView;
            android.view.View view = hdd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            this.AEQbTJ = view;
        }
    }
}
