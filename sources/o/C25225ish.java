package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ish, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25225ish extends C43318rmy<C25149irK, AbstractC23439hyJ> {
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
        onBindViewHolder((C43312rms<AbstractC23439hyJ>) c43312rms, (C25149irK) obj);
    }

    public C25225ish() {
        super(C23274hvD.Activity.QSBOWP, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23439hyJ> c43312rms, @NotNull final C25149irK c25149irK) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25149irK, "");
        C55320xhi c55320xhi = ((AbstractC23439hyJ) c43312rms.OLrzqt()).OLrzqt;
        c55320xhi.setText(c25149irK.copydefault());
        if (c25149irK.KWHzl() == null) {
            c55320xhi.AYXKKw();
        } else {
            c55320xhi.gEmmrt();
            C25352ivB.setOnDoubleCheckClickListener$default(c55320xhi, 0L, new Function1() { // from class: o.isi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25225ish.KWHzl(c25149irK, (android.view.View) obj);
                }
            }, 1, null);
        }
        AppCompatTextView appCompatTextView = ((AbstractC23439hyJ) c43312rms.OLrzqt()).AEQbTJ;
        appCompatTextView.setText(c25149irK.OLrzqt());
        appCompatTextView.setMaxWidth(C33129mqd.AhwBna(C23313hvq.mulCheckS$default(C23313hvq.subCheckS$default(java.lang.Integer.valueOf(C33570myu.AEQbTJ()), java.lang.Integer.valueOf(C55298xhM.dpInt$default(48.0f, (android.content.Context) null, 1, (java.lang.Object) null)), null, null, null, 14, null), java.lang.Double.valueOf(0.6d), null, null, null, 14, null)));
        appCompatTextView.invalidate();
        ((AbstractC23439hyJ) c43312rms.OLrzqt()).OLrzqt.invalidate();
        int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.RlQdEF);
        AppCompatTextView appCompatTextView2 = ((AbstractC23439hyJ) c43312rms.OLrzqt()).AEQbTJ;
        if (c25149irK.EZpvd() == null) {
            appCompatTextView2.setCompoundDrawables(null, null, null, null);
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(appCompatTextView2, 0L, new Function1() { // from class: o.isk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25225ish.copydefault(c25149irK, (android.view.View) obj);
            }
        }, 1, null);
        AppCompatTextView appCompatTextView3 = ((AbstractC23439hyJ) c43312rms.OLrzqt()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        C25352ivB.KWHzl(appCompatTextView3, C52761wXj.TaskDescription.DGUQLI, iOLrzqt, true, java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab));
    }

    public static final Unit KWHzl(C25149irK c25149irK, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0KWHzl = c25149irK.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C25149irK c25149irK, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0EZpvd = c25149irK.EZpvd();
        if (function0EZpvd != null) {
            function0EZpvd.invoke();
        }
        return Unit.INSTANCE;
    }
}
