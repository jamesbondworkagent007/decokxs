package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30121lMr extends C43318rmy<InterfaceC30115lMl, AbstractC31572lwa> {
    public final androidx.fragment.app.FragmentManager AEQbTJ;
    public final Function1<InterfaceC30115lMl, Unit> EZpvd;
    public final com.okinc.okpaymentapi.data.remote.model.management.Channel KWHzl;
    public final Function0<Unit> OLrzqt;
    public final Function1<InterfaceC30115lMl, Unit> copydefault;
    public final Function1<PaymentMethod, Unit> gEmmrt;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super o.lMl, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.lMl, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30121lMr(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, Function1<? super InterfaceC30115lMl, Unit> function1, Function1<? super InterfaceC30115lMl, Unit> function12, Function0<Unit> function0, Function1<? super PaymentMethod, Unit> function13) {
        super(C31351lsQ.ActionBar.iRxXKY, 0);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(channel, "");
        this.AEQbTJ = fragmentManager;
        this.KWHzl = channel;
        this.EZpvd = function1;
        this.copydefault = function12;
        this.OLrzqt = function0;
        this.gEmmrt = function13;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31572lwa> c43312rms, @NotNull final InterfaceC30115lMl interfaceC30115lMl) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        AbstractC31572lwa abstractC31572lwa = (AbstractC31572lwa) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC31572lwa.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C30114lMk.OLrzqt(interfaceC30115lMl, imageView);
        android.widget.TextView textView = abstractC31572lwa.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C30114lMk.EZpvd(interfaceC30115lMl, textView);
        android.widget.TextView textView2 = abstractC31572lwa.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        C30114lMk.copydefault(interfaceC30115lMl, textView2);
        android.widget.TextView textView3 = abstractC31572lwa.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        C30114lMk.AEQbTJ(interfaceC30115lMl, textView3);
        android.widget.TextView textView4 = abstractC31572lwa.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        C30114lMk.OLrzqt(interfaceC30115lMl, textView4);
        if (interfaceC30115lMl.hDKMBd()) {
            ViewGroup.LayoutParams layoutParams = abstractC31572lwa.AkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.bottomToTop = C31351lsQ.Application.BVXAa;
            abstractC31572lwa.AkhnZx.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView5 = abstractC31572lwa.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        C30114lMk.OLrzqt(interfaceC30115lMl, textView5, C33070mpX.copydefault(interfaceC30115lMl.KWHzl()));
        android.widget.TextView textView6 = abstractC31572lwa.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        C30114lMk.EZpvd(interfaceC30115lMl, textView6, interfaceC30115lMl.zLjUOn());
        android.widget.TextView textView7 = abstractC31572lwa.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        C30114lMk.KWHzl(interfaceC30115lMl, textView7);
        if (interfaceC30115lMl.zLjUOn()) {
            abstractC31572lwa.AhwBna.setVisibility(0);
            abstractC31572lwa.AhwBna.setChecked(interfaceC30115lMl.isConnected());
            abstractC31572lwa.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lMp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30121lMr.copydefault(this.OLrzqt, interfaceC30115lMl, view);
                }
            });
        } else {
            abstractC31572lwa.AhwBna.setVisibility(8);
        }
        abstractC31572lwa.AYXKKw.setVisibility(8);
        abstractC31572lwa.valueOf.setVisibility(0);
        abstractC31572lwa.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30121lMr.KWHzl(this.EZpvd, interfaceC30115lMl, view);
            }
        });
        if (interfaceC30115lMl.uzCIH()) {
            abstractC31572lwa.copydefault.setVisibility(0);
            abstractC31572lwa.copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC)));
            abstractC31572lwa.copydefault.setText(interfaceC30115lMl.AhwBna());
            android.widget.TextView textView8 = abstractC31572lwa.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView8, "");
            C30114lMk.EZpvd(interfaceC30115lMl, textView8);
            abstractC31572lwa.values.setVisibility(8);
        } else {
            abstractC31572lwa.copydefault.setVisibility(8);
            abstractC31572lwa.OLrzqt.setVisibility(8);
            ViewGroup.LayoutParams layoutParams3 = abstractC31572lwa.djBIcL.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.guidePercent = 1.0f;
            abstractC31572lwa.djBIcL.setLayoutParams(layoutParams4);
        }
        abstractC31572lwa.EZpvd.setVisibility(8);
    }

    public static final void copydefault(C30121lMr c30121lMr, InterfaceC30115lMl interfaceC30115lMl, android.view.View view) {
        Function1<InterfaceC30115lMl, Unit> function1 = c30121lMr.EZpvd;
        if (function1 != null) {
            function1.invoke(interfaceC30115lMl);
        }
    }

    public static final void KWHzl(C30121lMr c30121lMr, InterfaceC30115lMl interfaceC30115lMl, android.view.View view) {
        Function1<InterfaceC30115lMl, Unit> function1 = c30121lMr.copydefault;
        if (function1 != null) {
            function1.invoke(interfaceC30115lMl);
        }
    }
}
