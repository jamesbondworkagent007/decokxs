package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52789wYk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52789wYk extends wXX {
    public java.util.List<C55371xig> AYXKKw = new java.util.ArrayList();
    public C43316rmw AhwBna;
    public C55317xhf KWHzl;
    public C54924xaJ djBIcL;
    public android.widget.TextView gEmmrt;
    public android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C55371xig> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55317xhf OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView valueOf() {
        return this.valueOf;
    }

    public void OLrzqt(@NotNull java.util.List<C55371xig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
        C43316rmw c43316rmw = this.AhwBna;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C52761wXj.LoaderManager.call);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.setBackground(ContextCompat.getDrawable(requireActivity(), C52761wXj.TaskDescription.fvQaOB));
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54924xaJ c54924xaJEZpvd = C54924xaJ.EZpvd(getCustomLayoutInflater(), constraintLayout);
        this.djBIcL = c54924xaJEZpvd;
        this.gEmmrt = c54924xaJEZpvd != null ? c54924xaJEZpvd.OLrzqt : null;
        this.valueOf = c54924xaJEZpvd != null ? c54924xaJEZpvd.copydefault : null;
        this.KWHzl = c54924xaJEZpvd != null ? c54924xaJEZpvd.EZpvd : null;
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.setItems(EZpvd());
        c43316rmw.register(C55371xig.class, new TaskDescription());
        this.AhwBna = c43316rmw;
        C54924xaJ c54924xaJ = this.djBIcL;
        if (c54924xaJ == null || (recyclerView = c54924xaJ.KWHzl) == null) {
            return;
        }
        recyclerView.setAdapter(c43316rmw);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemViewCacheSize(0);
    }

    /* JADX INFO: renamed from: o.wYk$TaskDescription */
    public static final class TaskDescription extends AbstractC59533zio<C55371xig, Activity> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC52789wYk abstractC52789wYk = AbstractC52789wYk.this;
            android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.getNewProxyInstance, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(abstractC52789wYk, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(Activity activity, final C55371xig c55371xig) {
            C55318xhg c55318xhgEZpvd;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(c55371xig, "");
            C55371xig c55371xigOLrzqt = activity.OLrzqt();
            if (c55371xigOLrzqt != null) {
                c55371xigOLrzqt.AhwBna().setAttachmentViewId(-1);
                c55371xigOLrzqt.setTitleText(c55371xig.valueOf());
                c55371xigOLrzqt.setDescriptionText(c55371xig.OLrzqt());
                c55371xigOLrzqt.setCustomViewId(c55371xig.AEQbTJ());
                c55371xigOLrzqt.setImageDrawable(c55371xig.copydefault());
                c55371xigOLrzqt.setInterceptEvent(c55371xig.EZpvd());
                if (c55371xig.AhwBna().djBIcL() == -1 && c55371xig.AhwBna().OLrzqt() == null) {
                    C55312xha c55312xhaValueOf = c55371xigOLrzqt.AhwBna().valueOf();
                    if (c55312xhaValueOf != null && (c55318xhgEZpvd = c55312xhaValueOf.EZpvd()) != null) {
                        c55318xhgEZpvd.removeAllViews();
                    }
                } else {
                    c55371xig.AhwBna().ejfBZ();
                    c55371xigOLrzqt.AhwBna().setAttachmentViewId(c55371xig.AhwBna().djBIcL());
                    c55371xigOLrzqt.AhwBna().setAttachingView(c55371xig.AhwBna().OLrzqt());
                }
                c55371xigOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wYl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        AbstractC52789wYk.TaskDescription.KWHzl(c55371xig, view);
                    }
                });
            }
        }

        public static final void KWHzl(C55371xig c55371xig, android.view.View view) {
            Function0<Unit> function0KWHzl = c55371xig.KWHzl();
            if (function0KWHzl != null) {
                function0KWHzl.invoke();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onResume();
        C54924xaJ c54924xaJ = this.djBIcL;
        ViewGroup.LayoutParams layoutParams = (c54924xaJ == null || (recyclerView2 = c54924xaJ.KWHzl) == null) ? null : recyclerView2.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        C55317xhf c55317xhf = this.KWHzl;
        if (!android.text.TextUtils.isEmpty(c55317xhf != null ? c55317xhf.AkhnZx() : null)) {
            C55317xhf c55317xhf2 = this.KWHzl;
            if (c55317xhf2 != null) {
                c55317xhf2.setVisibility(0);
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            int iKWHzl = C55298xhM.KWHzl(0.0f, fragmentActivityRequireActivity);
            int marginStart = layoutParams2.getMarginStart();
            int i = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            int marginEnd = layoutParams2.getMarginEnd();
            layoutParams2.setMarginStart(marginStart);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i;
            layoutParams2.setMarginEnd(marginEnd);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iKWHzl;
        } else {
            C55317xhf c55317xhf3 = this.KWHzl;
            if (c55317xhf3 != null) {
                c55317xhf3.setVisibility(8);
            }
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            int iKWHzl2 = C55298xhM.KWHzl(40.0f, fragmentActivityRequireActivity2);
            int marginStart2 = layoutParams2.getMarginStart();
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
            int marginEnd2 = layoutParams2.getMarginEnd();
            layoutParams2.setMarginStart(marginStart2);
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
            layoutParams2.setMarginEnd(marginEnd2);
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iKWHzl2;
        }
        C54924xaJ c54924xaJ2 = this.djBIcL;
        if (c54924xaJ2 != null && (recyclerView = c54924xaJ2.KWHzl) != null) {
            recyclerView.setLayoutParams(layoutParams2);
        }
        android.widget.TextView textView = this.gEmmrt;
        if (android.text.TextUtils.isEmpty(textView != null ? textView.getText() : null)) {
            android.widget.TextView textView2 = this.gEmmrt;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            android.widget.TextView textView3 = this.gEmmrt;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        android.widget.TextView textView4 = this.valueOf;
        if (android.text.TextUtils.isEmpty(textView4 != null ? textView4.getText() : null)) {
            android.widget.TextView textView5 = this.valueOf;
            if (textView5 != null) {
                textView5.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.TextView textView6 = this.valueOf;
        if (textView6 != null) {
            textView6.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: o.wYk$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public C55371xig OLrzqt;
        public final /* synthetic */ AbstractC52789wYk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55371xig OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractC52789wYk abstractC52789wYk, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = abstractC52789wYk;
            this.OLrzqt = (C55371xig) view.findViewById(C52761wXj.FragmentManager.DTg);
        }
    }
}
