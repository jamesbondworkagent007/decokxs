package o;

import android.view.View;
import com.bumptech.glide.Glide;
import com.okinc.business.invest_biz.ui.screens.token_selection.TokenSelectionItemBinder$1;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26607jfX extends AbstractC27119jpF<C26608jfY, iJD> {
    public static final Application Companion = new Application(null);
    public final TokenSelectionAction AEQbTJ;
    public final Function1<C26608jfY, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.jfY, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C26607jfX(@NotNull TokenSelectionAction tokenSelectionAction, @NotNull Function1<? super C26608jfY, Unit> function1) {
        super(TokenSelectionItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(tokenSelectionAction, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = tokenSelectionAction;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull iJD ijd, @NotNull C26608jfY c26608jfY) {
        Intrinsics.checkNotNullParameter(ijd, "");
        Intrinsics.checkNotNullParameter(c26608jfY, "");
        C55021xcA root = ijd.getRoot();
        boolean z = true;
        root.setPaddingRelative(0, C55298xhM.dp2px$default(7.0f, null, 1, null), 0, C55298xhM.dp2px$default(7.0f, null, 1, null));
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c26608jfY));
        Glide.KWHzl(root.gEmmrt()).EZpvd(c26608jfY.KWHzl()).OLrzqt(C55298xhM.dpInt$default(36, (android.content.Context) null, 1, (java.lang.Object) null)).gEmmrt().EZpvd((android.widget.ImageView) root.gEmmrt());
        root.valueOf().setText(c26608jfY.AEQbTJ());
        root.KWHzl().setText(c26608jfY.OLrzqt());
        if (this.AEQbTJ != TokenSelectionAction.Redeem || (!C33129mqd.OLrzqt((java.lang.Object) c26608jfY.valueOf(), (java.lang.Object) 0) && !C33129mqd.OLrzqt((java.lang.Object) c26608jfY.EZpvd(), (java.lang.Object) 0))) {
            z = false;
        }
        boolean z2 = !z;
        root.AYXKKw().setVisibility(z2 ? 0 : 8);
        root.values().setVisibility(z2 ? 0 : 8);
        if (z) {
            return;
        }
        android.widget.TextView textViewAYXKKw = root.AYXKKw();
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        textViewAYXKKw.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(c27492jwH, c26608jfY.valueOf(), 6, 2, false, false, 24, null));
        root.values().setText(C27492jwH.formatCurrencyData$default(c27492jwH, c26608jfY.EZpvd(), null, null, null, 14, null));
    }

    /* JADX INFO: renamed from: o.jfX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jfX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.jfX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C26607jfX AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C26608jfY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C26607jfX c26607jfX, C26608jfY c26608jfY) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c26607jfX;
            this.copydefault = c26608jfY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault.invoke(this.copydefault);
            }
        }
    }
}
