package o;

import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ise, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25222ise extends C43318rmy<C25147irI, AbstractC23514hzf> {
    public C25222ise() {
        super(C23274hvD.Activity.OFhtUX, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23514hzf> c43312rms, @NotNull C25147irI c25147irI) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25147irI, "");
        ((AbstractC23514hzf) c43312rms.OLrzqt()).AEQbTJ.setViewDataBean(c25147irI.OLrzqt());
        android.widget.TextView textViewCopydefault = ((AbstractC23514hzf) c43312rms.OLrzqt()).AEQbTJ.copydefault();
        android.widget.TextView textViewKWHzl = ((AbstractC23514hzf) c43312rms.OLrzqt()).AEQbTJ.KWHzl();
        if (c25147irI.EZpvd()) {
            android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(textViewCopydefault, textViewKWHzl);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
            java.util.Iterator it = arrayListCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(android.animation.ObjectAnimator.ofFloat((android.widget.TextView) it.next(), "alpha", 1.0f, 0.0f, 1.0f));
            }
            duration.playTogether(arrayList);
            duration.start();
        }
    }
}
