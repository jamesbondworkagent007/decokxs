package o;

import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ism, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25230ism extends C43318rmy<C25154irP, AbstractC23517hzi> {
    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
        onBindViewHolder((C43312rms<AbstractC23517hzi>) c43312rms, (C25154irP) obj);
    }

    public C25230ism() {
        super(C23274hvD.Activity.DLWbHP, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23517hzi> c43312rms, @NotNull final C25154irP c25154irP) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25154irP, "");
        ((AbstractC23517hzi) c43312rms.OLrzqt()).KWHzl.setText(c25154irP.AEQbTJ());
        ((AbstractC23517hzi) c43312rms.OLrzqt()).OLrzqt.setText(c25154irP.OLrzqt());
        ((AbstractC23517hzi) c43312rms.OLrzqt()).EZpvd.setText(c25154irP.EZpvd());
        ((AbstractC23517hzi) c43312rms.OLrzqt()).OLrzqt.setTextColor(c25154irP.copydefault());
        AppCompatTextView appCompatTextView = ((AbstractC23517hzi) c43312rms.OLrzqt()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c25154irP.EZpvd()) ? 0 : 8);
        C25352ivB.setOnDoubleCheckClickListener$default(((AbstractC23517hzi) c43312rms.OLrzqt()).OLrzqt, 0L, new Function1() { // from class: o.isq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25230ism.copydefault(c25154irP, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(C25154irP c25154irP, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0KWHzl = c25154irP.KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }
}
