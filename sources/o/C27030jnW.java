package o;

import android.view.View;
import com.okinc.business.invest_biz.ui.screens.validator_selection.ValidatorSelectionItemBinder$1;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorTrxType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27030jnW extends AbstractC27119jpF<C27090jod, AbstractC23846iLm> {
    public final long EZpvd;
    public final ValidatorTrxType OLrzqt;
    public final Function1<C27090jod, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.jod, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27030jnW(long j, @NotNull ValidatorTrxType validatorTrxType, @NotNull Function1<? super C27090jod, Unit> function1) {
        super(ValidatorSelectionItemBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(validatorTrxType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = j;
        this.OLrzqt = validatorTrxType;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    public void KWHzl(@NotNull AbstractC23846iLm abstractC23846iLm, @NotNull C27090jod c27090jod) {
        Intrinsics.checkNotNullParameter(abstractC23846iLm, "");
        Intrinsics.checkNotNullParameter(c27090jod, "");
        android.view.View root = abstractC23846iLm.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c27090jod));
        abstractC23846iLm.AYXKKw.setText(c27090jod.AhwBna());
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        abstractC23846iLm.gEmmrt.setText(C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, c27090jod.copydefault(), 6, 2, false, false, 24, null) + " " + c27090jod.KWHzl());
        abstractC23846iLm.KWHzl.setText(C27492jwH.formatRatePercent$default(c27492jwH, c27090jod.AEQbTJ(), false, 2, null));
        android.widget.TextView textView = abstractC23846iLm.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(this.OLrzqt != ValidatorTrxType.REDEEM ? 8 : 0);
        abstractC23846iLm.copydefault.setText(c27090jod.EZpvd() + " " + c27090jod.KWHzl());
        abstractC23846iLm.valueOf.setBackgroundResource(this.EZpvd == c27090jod.OLrzqt() ? C25493ixk.StateListAnimator.getFieldNames : C25493ixk.StateListAnimator.iwGUEr);
    }

    /* JADX INFO: renamed from: o.jnW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C27030jnW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C27090jod copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27030jnW c27030jnW, C27090jod c27090jod) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c27030jnW;
            this.copydefault = c27090jod;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault.invoke(this.copydefault);
            }
        }
    }
}
