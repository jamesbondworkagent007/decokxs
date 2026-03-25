package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.oTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oTM extends AbstractC36244oUp<oTB> {

    public static final class ActionBar extends DiffUtil.ItemCallback<oTB> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(oTB otb, oTB otb2) {
            Intrinsics.checkNotNullParameter(otb, "");
            Intrinsics.checkNotNullParameter(otb2, "");
            return Intrinsics.EZpvd(otb.KWHzl(), otb2.KWHzl());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(oTB otb, oTB otb2) {
            Intrinsics.checkNotNullParameter(otb, "");
            Intrinsics.checkNotNullParameter(otb2, "");
            return Intrinsics.EZpvd(otb, otb2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oTM(@NotNull oTG otg) {
        super(new ActionBar());
        Intrinsics.checkNotNullParameter(otg, "");
        register(oTB.Activity.class, new oTV());
        register(oTB.StateListAnimator.class, new oTS(otg));
        register(oTB.TaskDescription.class, new oTT(otg));
        register(oTB.Application.class, new oTP(otg));
        register(oTB.ActionBar.class, new oTR(otg));
    }
}
