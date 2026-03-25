package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.ui.screens.home.binder.BonusProductItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26509jdf extends AbstractC27119jpF<C26523jdt, C23756iId> {
    public final Function1<C26526jdw, Unit> EZpvd;
    public final Function0<android.app.Activity> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends android.app.Activity> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jdw, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26509jdf(@NotNull Function0<? extends android.app.Activity> function0, @NotNull Function1<? super C26526jdw, Unit> function1) {
        super(BonusProductItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function0;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23756iId c23756iId, @NotNull C26523jdt c26523jdt) {
        Intrinsics.checkNotNullParameter(c23756iId, "");
        Intrinsics.checkNotNullParameter(c26523jdt, "");
        ConstraintLayout root = c23756iId.getRoot();
        android.content.Context context = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(24.0f, context);
        android.content.Context context2 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault2 = C55298xhM.copydefault(16.0f, context2);
        android.content.Context context3 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iCopydefault3 = C55298xhM.copydefault(24.0f, context3);
        android.content.Context context4 = root.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        root.setPaddingRelative(iCopydefault, iCopydefault2, iCopydefault3, C55298xhM.copydefault(0.0f, context4));
        ConstraintLayout constraintLayout = c23756iId.OLrzqt;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        android.content.Context context5 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        constraintLayout.setBackground(C27569jxf.generateSolidBackground$default(c27569jxf, context5, 16, java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialaKhcqp), 0.0f, null, 24, null));
        android.content.Context context6 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        int iCopydefault4 = C55298xhM.copydefault(16.0f, context6);
        android.content.Context context7 = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        constraintLayout.setPaddingRelative(0, iCopydefault4, 0, C55298xhM.copydefault(8.0f, context7));
        c23756iId.EZpvd.setData(c26523jdt.KWHzl(), this.copydefault, this.EZpvd);
        C27334jtI c27334jtI = c23756iId.KWHzl;
        c27334jtI.setOnClickListener(new Application(c27334jtI, 1000L, this, c26523jdt));
        c23756iId.KWHzl.setData(c26523jdt.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.jdf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C26509jdf OLrzqt;
        public final /* synthetic */ C26523jdt copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26509jdf c26509jdf, C26523jdt c26523jdt) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c26509jdf;
            this.copydefault = c26523jdt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.copydefault.KWHzl());
            }
        }
    }
}
