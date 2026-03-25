package o;

import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33596mzT extends AbstractC33598mzV {
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33598mzV, o.AbstractC33587mzK
    public int AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.AbstractC33587mzK
    public AbstractViewOnClickListenerC33585mzI<C33583mzG> EZpvd(@NotNull android.content.Context context, @NotNull android.view.ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C32113mPz.Fragment.AhwBna, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate, z);
    }

    /* JADX INFO: renamed from: o.mzT$StateListAnimator */
    public static final class StateListAnimator<B extends C33601mzY> extends AbstractViewOnClickListenerC33585mzI<B> {
        public android.widget.TextView AhwBna;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view, boolean z) {
            super(view, z);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.fIwbmz);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById;
        }

        /* JADX DEBUG: Method merged with bridge method: OLrzqt(ILo/mzG;)V */
        @Override // o.AbstractViewOnClickListenerC33585mzI
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void OLrzqt(int i, @NotNull B b) {
            Intrinsics.checkNotNullParameter(b, "");
            this.AhwBna.setText(b.copydefault());
        }
    }
}
