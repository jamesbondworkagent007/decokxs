package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46011tEn extends C46018tEu {
    public final C46278tOk AEQbTJ;
    public final boolean EZpvd;
    public final Function2<java.lang.String, java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46011tEn(@NotNull C46278tOk c46278tOk, @NotNull Function1<? super C46068tGq, Unit> function1, @NotNull Function1<? super C46068tGq, Unit> function12, @NotNull Function0<Unit> function0, boolean z, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, Function1<? super java.lang.String, Unit> function13) {
        super(c46278tOk, function1, function12, function0, function13);
        Intrinsics.checkNotNullParameter(c46278tOk, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = c46278tOk;
        this.EZpvd = z;
        this.KWHzl = function2;
    }

    @Override // o.C46018tEu
    public void OLrzqt(@NotNull final C46068tGq c46068tGq) {
        Intrinsics.checkNotNullParameter(c46068tGq, "");
        super.OLrzqt(c46068tGq);
        ConstraintLayout constraintLayout = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility((c46068tGq.zLjUOn() || c46068tGq.fetchVPNInfo() != PlanetTradeTypes.Spot) ? 0 : 8);
        if (c46068tGq.fetchVPNInfo() == PlanetTradeTypes.Spot) {
            this.AEQbTJ.EZpvd.AYXKKw.setContent(c46068tGq.AkhnZx());
        }
        if (this.EZpvd) {
            android.widget.TextView textView = this.AEQbTJ.fetchVPNInfo;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, C33070mpX.KWHzl(C52761wXj.TaskDescription.DGOPHZDGOPHZ), (android.graphics.drawable.Drawable) null);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.tEp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46011tEn.OLrzqt(this.OLrzqt, c46068tGq, view);
                }
            });
            C46466tVj c46466tVj = this.AEQbTJ.EZpvd.AYXKKw;
            c46466tVj.setContent(c46068tGq.AkhnZx());
            c46466tVj.setContentColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void OLrzqt(C46011tEn c46011tEn, C46068tGq c46068tGq, android.view.View view) {
        Function2<java.lang.String, java.lang.String, Unit> function2 = c46011tEn.KWHzl;
        if (function2 != null) {
            function2.invoke(c46068tGq.values(), c46068tGq.fetchVPNInfo().toString());
        }
    }
}
