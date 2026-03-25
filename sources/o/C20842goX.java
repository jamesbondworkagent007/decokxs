package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C21004gra;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20842goX extends AbstractC59533zio<C21004gra.Application, ActionBar> {
    public final int AEQbTJ;
    public final java.lang.Long EZpvd;
    public final Function2<java.lang.String, java.lang.Boolean, Unit> KWHzl;
    public final C20931gqG OLrzqt;
    public final java.lang.Long copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C20842goX(@NotNull C20931gqG c20931gqG, java.lang.Long l, java.lang.Long l2, int i, Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(c20931gqG, "");
        this.OLrzqt = c20931gqG;
        this.EZpvd = l;
        this.copydefault = l2;
        this.AEQbTJ = i;
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16784eqU abstractC16784eqUOLrzqt = AbstractC16784eqU.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16784eqUOLrzqt, "");
        return new ActionBar(abstractC16784eqUOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, @NotNull final C21004gra.Application application) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(application, "");
        actionBar.EZpvd().AEQbTJ.setText(application.OLrzqt().AkhnZx());
        FragmentActivity activity = this.OLrzqt.getActivity();
        if (activity != null) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrCopydefault = Glide.copydefault(activity);
            java.lang.String strAEQbTJ = application.OLrzqt().AEQbTJ();
            componentCallbacks2C5333NrCopydefault.KWHzl(strAEQbTJ != null ? new wXL(strAEQbTJ, 0, 2, null) : null).EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null))).KWHzl(C52761wXj.Activity.scanPackages).EZpvd((android.widget.ImageView) actionBar.EZpvd().EZpvd);
        }
        C14079deg c14079deg = C14079deg.EZpvd;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = application.OLrzqt();
        java.lang.Long l = this.EZpvd;
        java.lang.String addressStr$default = C14079deg.getAddressStr$default(c14079deg, interfaceC9738bbJOLrzqt.EZpvd(l != null ? l.longValue() : -1L), false, 2, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) addressStr$default)) {
            actionBar.EZpvd().KWHzl.setVisibility(0);
            actionBar.EZpvd().OLrzqt.setVisibility(0);
            actionBar.EZpvd().KWHzl.setText(addressStr$default);
        } else {
            actionBar.EZpvd().OLrzqt.setVisibility(8);
            actionBar.EZpvd().KWHzl.setVisibility(8);
        }
        actionBar.EZpvd().AYXKKw.setText(C33069mpW.copydefault(this.OLrzqt, C13754dXa.FragmentManager.observeReporter, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", application.EZpvd()), C56390yDp.OLrzqt("num", application.AEQbTJ()))));
        if (EZpvd()) {
            actionBar.EZpvd().gEmmrt.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.UrRBLY));
        } else {
            actionBar.EZpvd().gEmmrt.setImageDrawable(C33070mpX.KWHzl(C13754dXa.Activity.DWgRXt));
        }
        actionBar.EZpvd().gEmmrt.setSelected(application.KWHzl());
        actionBar.EZpvd().getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.gpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20842goX.OLrzqt(this.AEQbTJ, application, view);
            }
        });
        if (C33129mqd.AEQbTJ(application.copydefault(), 0)) {
            actionBar.EZpvd().valueOf.setAlpha(1.0f);
            actionBar.EZpvd().gEmmrt.setEnabled(true);
        } else {
            actionBar.EZpvd().valueOf.setAlpha(0.3f);
            actionBar.EZpvd().gEmmrt.setEnabled(false);
            actionBar.EZpvd().valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.gpc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20842goX.copydefault(this.EZpvd, application, view);
                }
            });
        }
    }

    public static final void OLrzqt(C20842goX c20842goX, C21004gra.Application application, android.view.View view) {
        Function2<java.lang.String, java.lang.Boolean, Unit> function2 = c20842goX.KWHzl;
        if (function2 != null) {
            function2.invoke(application.OLrzqt().DbNXlk(), java.lang.Boolean.FALSE);
        }
    }

    public static final void copydefault(C20842goX c20842goX, C21004gra.Application application, android.view.View view) {
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(c20842goX.OLrzqt, C13754dXa.FragmentManager.getResultContract, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", application.EZpvd()))), 0, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.goX$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final AbstractC16784eqU EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC16784eqU EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull AbstractC16784eqU abstractC16784eqU) {
            super(abstractC16784eqU.getRoot());
            Intrinsics.checkNotNullParameter(abstractC16784eqU, "");
            this.EZpvd = abstractC16784eqU;
        }
    }

    public final boolean EZpvd() {
        return this.AEQbTJ == MultiTransferMode.MODE_MANY_TO_ONE.getValue() || this.AEQbTJ == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }
}
