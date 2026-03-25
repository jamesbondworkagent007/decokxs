package o;

import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC18392fhY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18378fhK extends AbstractC59533zio<InterfaceC18392fhY.Application, C18387fhT> {
    public final Function1<InterfaceC18392fhY.Application, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.fhY$Application, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C18378fhK(@NotNull Function1<? super InterfaceC18392fhY.Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C18387fhT onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C16793eqd c16793eqdOLrzqt = C16793eqd.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c16793eqdOLrzqt, "");
        return new C18387fhT(c16793eqdOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C18387fhT c18387fhT, @NotNull final InterfaceC18392fhY.Application application) {
        Intrinsics.checkNotNullParameter(c18387fhT, "");
        Intrinsics.checkNotNullParameter(application, "");
        c18387fhT.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18378fhK.KWHzl(application, this, view);
            }
        });
        if (application.EZpvd().copydefault()) {
            c18387fhT.itemView.setBackgroundResource(C13754dXa.Activity.gEmmrt);
            c18387fhT.itemView.setAlpha(0.6f);
            android.widget.TextView textView = c18387fhT.KWHzl().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            c18387fhT.itemView.setBackgroundResource(C13754dXa.Activity.valueOf);
            c18387fhT.itemView.setAlpha(1.0f);
            android.widget.TextView textView2 = c18387fhT.KWHzl().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
        c18387fhT.itemView.setSelected(application.OLrzqt());
        c18387fhT.KWHzl().AEQbTJ.setText(application.EZpvd().AEQbTJ().djBIcL());
        ShapeableImageView shapeableImageView = c18387fhT.KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C33054mpH.KWHzl(shapeableImageView, C18388fhU.AEQbTJ(application.EZpvd().AEQbTJ()));
    }

    public static final void KWHzl(InterfaceC18392fhY.Application application, C18378fhK c18378fhK, android.view.View view) {
        if (application.EZpvd().copydefault()) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C19605gIo.toastWithFailedIcon$default(context, C13754dXa.FragmentManager.ColorLong, 0, 2, (java.lang.Object) null);
            return;
        }
        c18378fhK.copydefault.invoke(application);
    }
}
