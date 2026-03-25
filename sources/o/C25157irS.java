package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25157irS extends C43318rmy<C25148irJ, AbstractC23451hyV> {
    public C25157irS() {
        super(C23274hvD.Activity.dHguZz, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23451hyV> c43312rms, @NotNull final C25148irJ c25148irJ) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25148irJ, "");
        ((AbstractC23451hyV) c43312rms.OLrzqt()).OLrzqt.setViewDataBean(c25148irJ.OLrzqt());
        ((AbstractC23451hyV) c43312rms.OLrzqt()).AEQbTJ.setText(c25148irJ.EZpvd());
        C25352ivB.setOnDoubleCheckClickListener$default(((AbstractC23451hyV) c43312rms.OLrzqt()).AEQbTJ, 0L, new Function1() { // from class: o.irZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25157irS.AEQbTJ(c25148irJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C25148irJ c25148irJ, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C25352ivB.copydefault(c25148irJ.EZpvd());
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C23274hvD.Fragment.getContract), 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }
}
