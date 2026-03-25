package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.oSJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36213oTl extends AbstractC36244oUp<oSJ> {

    /* JADX INFO: renamed from: o.oTl$Application */
    public static final class Application extends DiffUtil.ItemCallback<oSJ> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(oSJ osj, oSJ osj2) {
            Intrinsics.checkNotNullParameter(osj, "");
            Intrinsics.checkNotNullParameter(osj2, "");
            return Intrinsics.EZpvd(osj.KWHzl(), osj2.KWHzl());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(oSJ osj, oSJ osj2) {
            Intrinsics.checkNotNullParameter(osj, "");
            Intrinsics.checkNotNullParameter(osj2, "");
            return Intrinsics.EZpvd(osj, osj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36213oTl(@NotNull oSP osp) {
        super(new Application());
        Intrinsics.checkNotNullParameter(osp, "");
        register(oSJ.Activity.class, new C36216oTo(osp));
        register(oSJ.Application.class, new C36215oTn());
        register(oSJ.StateListAnimator.class, new C36211oTj(osp));
        register(oSJ.TaskDescription.class, new C36217oTp(osp));
    }
}
