package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25152irN extends C43318rmy<C25144irF, AbstractC23432hyC> {
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
        onBindViewHolder((C43312rms<AbstractC23432hyC>) c43312rms, (C25144irF) obj);
    }

    public C25152irN() {
        super(C23274hvD.Activity.DCUTEI, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23432hyC> c43312rms, @NotNull final C25144irF c25144irF) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25144irF, "");
        AbstractC23432hyC abstractC23432hyC = (AbstractC23432hyC) c43312rms.OLrzqt();
        abstractC23432hyC.KWHzl.setText(c25144irF.OLrzqt());
        C25352ivB.setOnDoubleCheckClickListener$default(abstractC23432hyC.copydefault, 0L, new Function1() { // from class: o.irO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25152irN.EZpvd(c25144irF, (android.view.View) obj);
            }
        }, 1, null);
        C55251xgS c55251xgS = abstractC23432hyC.EZpvd;
        c55251xgS.setText(c25144irF.EZpvd());
        c55251xgS.setVisibility(c25144irF.EZpvd().length() > 0 ? 0 : 8);
        C25352ivB.setOnDoubleCheckClickListener$default(c55251xgS, 0L, new Function1() { // from class: o.irW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25152irN.AEQbTJ(c25144irF, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C25144irF c25144irF, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0AEQbTJ = c25144irF.AEQbTJ();
        if (function0AEQbTJ != null) {
            function0AEQbTJ.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C25144irF c25144irF, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0KWHzl = c25144irF.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }
}
