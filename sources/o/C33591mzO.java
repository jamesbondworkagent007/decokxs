package o;

import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33590mzN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33591mzO<B extends C33590mzN> extends AbstractViewOnClickListenerC33585mzI<B> {
    public android.widget.TextView AhwBna;

    @Override // o.AbstractViewOnClickListenerC33585mzI, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33591mzO(@NotNull android.view.View view, boolean z) {
        super(view, z);
        Intrinsics.checkNotNullParameter(view, "");
        android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.ejfBZ);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.AhwBna = (android.widget.TextView) viewFindViewById;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(ILo/mzG;)V */
    @Override // o.AbstractViewOnClickListenerC33585mzI
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(int i, @NotNull B b) {
        Intrinsics.checkNotNullParameter(b, "");
        this.AhwBna.setText(b.EZpvd());
        this.AhwBna.setCompoundDrawablesRelativeWithIntrinsicBounds(0, b.copydefault(), 0, 0);
    }
}
