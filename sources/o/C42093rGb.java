package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AdRevenueScheme;
import com.bumptech.glide.Glide;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C42095rGd;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.rGb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42093rGb extends AbstractC59533zio<C42095rGd.TaskDescription.C0927TaskDescription, Application> {
    public final Function1<CountryBean.Country, Unit> AEQbTJ;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core_api.model.CountryBean$Country, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C42093rGb(boolean z, boolean z2, boolean z3, @NotNull Function1<? super CountryBean.Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.copydefault = z3;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C43825rwb c43825rwbEZpvd = C43825rwb.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c43825rwbEZpvd, "");
        return new Application(c43825rwbEZpvd, this.KWHzl, this.OLrzqt, this.copydefault, this.AEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull C42095rGd.TaskDescription.C0927TaskDescription c0927TaskDescription) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c0927TaskDescription, "");
        application.KWHzl(c0927TaskDescription);
    }

    /* JADX INFO: renamed from: o.rGb$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final boolean AEQbTJ;
        public final Function1<CountryBean.Country, Unit> EZpvd;
        public final boolean KWHzl;
        public final C43825rwb OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.ok_kyc_core_api.model.CountryBean$Country, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull C43825rwb c43825rwb, boolean z, boolean z2, boolean z3, @NotNull Function1<? super CountryBean.Country, Unit> function1) {
            super(c43825rwb.getRoot());
            Intrinsics.checkNotNullParameter(c43825rwb, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = c43825rwb;
            this.copydefault = z;
            this.KWHzl = z2;
            this.AEQbTJ = z3;
            this.EZpvd = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void KWHzl(@NotNull C42095rGd.TaskDescription.C0927TaskDescription c0927TaskDescription) {
            java.lang.String strKWHzl;
            Intrinsics.checkNotNullParameter(c0927TaskDescription, "");
            CountryBean.Country countryCopydefault = c0927TaskDescription.copydefault();
            this.OLrzqt.KWHzl.setEnabled(countryCopydefault.getEnable());
            this.OLrzqt.KWHzl.setBackgroundResource(C52761wXj.Activity.registerUser);
            android.widget.TextView textView = this.OLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((this.KWHzl || !this.copydefault) ? 8 : 0);
            android.widget.ImageView imageView = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility((this.KWHzl && c0927TaskDescription.KWHzl()) ? 0 : 8);
            if (countryCopydefault.getEnable()) {
                strKWHzl = countryCopydefault.getDisplayName();
            } else {
                android.content.Context context = this.OLrzqt.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                strKWHzl = C33069mpW.KWHzl(context, C43662rtX.Dialog.fJNWhG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(AdRevenueScheme.COUNTRY, countryCopydefault.getDisplayName())));
            }
            this.OLrzqt.KWHzl.setTitle(strKWHzl);
            android.widget.ImageView imageViewOLrzqt = this.OLrzqt.KWHzl.OLrzqt();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) countryCopydefault.getCountryFlagUrl()) && this.AEQbTJ) {
                C43386roM c43386roM = C43386roM.EZpvd;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) c43386roM.EZpvd())) {
                    java.lang.String str = c43386roM.EZpvd() + countryCopydefault.getCountryFlagUrl();
                    C55297xhL.KWHzl(str, "lfit", C55298xhM.dp2px$default(24.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null));
                    int iDp2px$default = C55298xhM.dp2px$default(0.5f, null, 1, null);
                    imageViewOLrzqt.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
                    imageViewOLrzqt.setVisibility(0);
                    imageViewOLrzqt.setBackgroundResource(C43662rtX.Activity.valueOf);
                    Intrinsics.copydefault(Glide.AEQbTJ(this.OLrzqt.KWHzl.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().djBIcL()).EZpvd(imageViewOLrzqt));
                }
            } else {
                imageViewOLrzqt.setVisibility(8);
            }
            this.OLrzqt.KWHzl.setContentDescription(countryCopydefault.getId());
            this.OLrzqt.EZpvd.setText(Marker.ANY_NON_NULL_MARKER + countryCopydefault.getTelephoneCode());
            OKRegularCell oKRegularCell = this.OLrzqt.KWHzl;
            oKRegularCell.setOnClickListener(new TaskDescription(oKRegularCell, 1000L, this, countryCopydefault));
        }

        /* JADX INFO: renamed from: o.rGb$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ Application EZpvd;
            public final /* synthetic */ CountryBean.Country OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, Application application, CountryBean.Country country) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.EZpvd = application;
                this.OLrzqt = country;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.EZpvd.EZpvd.invoke(this.OLrzqt);
                }
            }
        }
    }
}
