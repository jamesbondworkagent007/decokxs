package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC13761dXh;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dXJ extends AbstractC59533zio<dXN, RecyclerView.ViewHolder> {
    public final eLJ AEQbTJ;
    public final androidx.fragment.app.FragmentManager EZpvd;
    public final int KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull ApproveListItem approveListItem) {
        Intrinsics.checkNotNullParameter(approveListItem, "");
    }

    public dXJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, @NotNull eLJ elj) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(elj, "");
        this.EZpvd = fragmentManager;
        this.KWHzl = i;
        this.AEQbTJ = elj;
        this.copydefault = true;
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public StateListAnimator(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new StateListAnimator(layoutInflater.inflate(C13754dXa.TaskDescription.processStrongAuthMessage, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull dXN dxn) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(dxn, "");
        viewHolder.itemView.setNestedScrollingEnabled(true);
        AbstractC16706eow abstractC16706eow = (AbstractC16706eow) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16706eow == null) {
            return;
        }
        android.content.Context context = viewHolder.itemView.getContext();
        C43316rmw c43316rmw = new C43316rmw();
        java.util.List<ApproveListItem> listCopydefault = dxn.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ApproveListItem approveListItem : listCopydefault) {
            C13757dXd c13757dXd = C13757dXd.copydefault;
            Intrinsics.copydefault(context);
            C56406yEe.KWHzl(arrayList, c13757dXd.OLrzqt(approveListItem, context, this.AEQbTJ));
        }
        int size = arrayList.size();
        if (getPosition(viewHolder) == 0) {
            abstractC16706eow.copydefault.setImageDrawable(ContextCompat.getDrawable(context, C52761wXj.TaskDescription.ZqidTP));
            abstractC16706eow.copydefault.setVisibility(0);
            android.widget.TextView textView = abstractC16706eow.AEQbTJ;
            int i = this.KWHzl;
            if (i == 0) {
                string = context.getString(C13754dXa.FragmentManager.aVPvww);
            } else if (i == 1) {
                string = context.getString(C13754dXa.FragmentManager.dGgpab);
            }
            textView.setText(string);
            abstractC16706eow.AEQbTJ.setVisibility(0);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(dxn.OLrzqt());
        spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(64), 0, java.lang.String.valueOf(size).length(), 17);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.AkhnZx), 0, java.lang.String.valueOf(size).length(), 17);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getColor(C52761wXj.Activity.gdmIOq)), 0, java.lang.String.valueOf(size).length(), 17);
        abstractC16706eow.djBIcL.setText(spannableString);
        abstractC16706eow.OLrzqt.setVisibility(dxn.EZpvd() ? 0 : 8);
        abstractC16706eow.gEmmrt.setText(context.getString(C13754dXa.FragmentManager.search));
        ActionBar actionBar = new ActionBar(c43316rmw, dxn, abstractC16706eow, context);
        abstractC16706eow.gEmmrt.setOnClickListener(actionBar);
        abstractC16706eow.EZpvd.setOnClickListener(actionBar);
        c43316rmw.register(ApproveListItem.class, new Application(context, this));
        abstractC16706eow.KWHzl.setAdapter(c43316rmw);
        c43316rmw.setItems(dxn.EZpvd() ? dxn.copydefault().subList(0, 3) : dxn.copydefault());
        c43316rmw.notifyDataSetChanged();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AbstractC16706eow AEQbTJ;
        public final /* synthetic */ dXN EZpvd;
        public final /* synthetic */ C43316rmw KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;

        public ActionBar(C43316rmw c43316rmw, dXN dxn, AbstractC16706eow abstractC16706eow, android.content.Context context) {
            this.KWHzl = c43316rmw;
            this.EZpvd = dxn;
            this.AEQbTJ = abstractC16706eow;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (dXJ.this.copydefault) {
                this.KWHzl.setItems(this.EZpvd.copydefault());
                dXJ.this.copydefault = false;
                this.AEQbTJ.gEmmrt.setText(this.OLrzqt.getString(C13754dXa.FragmentManager.getRoot));
                this.AEQbTJ.EZpvd.setRotation(180.0f);
            } else {
                this.KWHzl.setItems(this.EZpvd.copydefault().subList(0, 3));
                dXJ.this.copydefault = true;
                this.AEQbTJ.gEmmrt.setText(this.OLrzqt.getString(C13754dXa.FragmentManager.search));
                this.AEQbTJ.EZpvd.setRotation(0.0f);
            }
            this.KWHzl.notifyDataSetChanged();
        }
    }

    public static final class Application extends dXH {
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ dXJ copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(android.content.Context context, dXJ dxj) {
            super(true);
            this.OLrzqt = context;
            this.copydefault = dxj;
        }

        @Override // o.dXH
        public void copydefault(ApproveListItem approveListItem) {
            Intrinsics.checkNotNullParameter(approveListItem, "");
            ActivityC13761dXh.Application application = ActivityC13761dXh.Companion;
            android.content.Context context = this.OLrzqt;
            Intrinsics.copydefault(context);
            ActivityC13761dXh.Application.startActivity$default(application, context, approveListItem, null, 4, null);
        }

        @Override // o.dXH
        public void KWHzl(ApproveListItem approveListItem) {
            Intrinsics.checkNotNullParameter(approveListItem, "");
            this.copydefault.EZpvd(approveListItem);
        }
    }
}
