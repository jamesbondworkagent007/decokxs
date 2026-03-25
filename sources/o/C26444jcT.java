package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.BackgroundImage;
import com.okinc.business.invest_biz.data.bean.LearnCardItem;
import com.okinc.business.invest_biz.ui.screens.home.InvestHomeLearnItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26444jcT extends AbstractC27118jpE<LearnCardItem, C23776iIx> {
    public static final Activity Companion = new Activity(null);
    public final Function1<LearnCardItem, Unit> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.LearnCardItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26444jcT(@NotNull Function1<? super LearnCardItem, Unit> function1) {
        super(InvestHomeLearnItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    public static final Unit KWHzl(C26444jcT c26444jcT, LearnCardItem learnCardItem) {
        c26444jcT.AEQbTJ.invoke(learnCardItem);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/jpG;Ljava/lang/Object;)V */
    @Override // o.AbstractC27118jpE
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C27120jpG<C23776iIx> c27120jpG, @NotNull final LearnCardItem learnCardItem) {
        Intrinsics.checkNotNullParameter(c27120jpG, "");
        Intrinsics.checkNotNullParameter(learnCardItem, "");
        KWHzl((C23776iIx) c27120jpG.KWHzl(), learnCardItem, new Function0() { // from class: o.jcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26444jcT.KWHzl(this.AEQbTJ, learnCardItem);
            }
        });
    }

    public final void KWHzl(C23776iIx c23776iIx, LearnCardItem learnCardItem, Function0<Unit> function0) {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context = c23776iIx.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableGenerateSolidBackground$default = C27569jxf.generateSolidBackground$default(c27569jxf, context, 12, java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialaKhcqp), 0.0f, null, 24, null);
        ConstraintLayout root = c23776iIx.getRoot();
        root.setBackground(drawableGenerateSolidBackground$default);
        root.setOnClickListener(new ActionBar(root, 1000L, function0));
        android.widget.TextView textView = c23776iIx.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) learnCardItem.copydefault()) ? 0 : 8);
        c23776iIx.copydefault.setText(learnCardItem.copydefault());
        boolean zOLrzqt = C33492mxV.OLrzqt();
        BackgroundImage backgroundImageOLrzqt = learnCardItem.OLrzqt();
        java.lang.String strKWHzl = zOLrzqt ? backgroundImageOLrzqt.KWHzl() : backgroundImageOLrzqt.OLrzqt();
        android.widget.ImageView imageView = c23776iIx.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        c27569jxf.AEQbTJ(imageView, strKWHzl, c27569jxf.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.jcT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jcT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.jcT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
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
