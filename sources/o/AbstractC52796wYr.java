package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52796wYr;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52796wYr extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int DbNXlk = 8;
    public android.widget.TextView AkhnZx;
    public java.util.List<C55377xim> AuCTel = new java.util.ArrayList();
    public RecyclerView ejfBZ;
    public android.widget.TextView fARcdN;
    public C43316rmw fIwbmz;
    public int fetchVPNInfo;
    public C52781wYc isConnected;
    public C55055xci values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<C55377xim> ejfBZ() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55055xci fIwbmz() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView fJNWhG() {
        return this.AkhnZx;
    }

    public void EZpvd(@NotNull java.util.List<C55377xim> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AuCTel = list;
        C43316rmw c43316rmw = this.fIwbmz;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        this.isConnected = c52781wYc;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54922xaH c54922xaHKWHzl = C54922xaH.KWHzl(getCustomLayoutInflater(), constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c54922xaHKWHzl, "");
        this.values = c54922xaHKWHzl.KWHzl;
        this.fARcdN = c54922xaHKWHzl.EZpvd;
        this.AkhnZx = c54922xaHKWHzl.AEQbTJ;
        this.ejfBZ = c54922xaHKWHzl.copydefault;
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.setItems(ejfBZ());
        c43316rmw.register(C55377xim.class, new Activity());
        this.fIwbmz = c43316rmw;
        RecyclerView recyclerView = c54922xaHKWHzl.copydefault;
        recyclerView.setAdapter(c43316rmw);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemViewCacheSize(0);
    }

    /* JADX INFO: renamed from: o.wYr$Activity */
    public static final class Activity extends AbstractC59533zio<C55377xim, TaskDescription> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public TaskDescription onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC52796wYr abstractC52796wYr = AbstractC52796wYr.this;
            android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.AubY, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new TaskDescription(abstractC52796wYr, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(TaskDescription taskDescription, final C55377xim c55377xim) {
            android.graphics.drawable.Drawable drawableAEQbTJ;
            C55318xhg c55318xhgEZpvd;
            Intrinsics.checkNotNullParameter(taskDescription, "");
            Intrinsics.checkNotNullParameter(c55377xim, "");
            C55377xim c55377ximKWHzl = taskDescription.KWHzl();
            if (c55377ximKWHzl != null) {
                c55377ximKWHzl.setOKDSSize(c55377xim.copydefault());
                c55377ximKWHzl.setStartDrawable(c55377xim.djBIcL());
                c55377ximKWHzl.AhwBna().setAttachmentViewId(-1);
                c55377ximKWHzl.setTitleText(c55377xim.gEmmrt());
                c55377ximKWHzl.setDescriptionText(c55377xim.EZpvd());
                if (c55377xim.AEQbTJ() == null) {
                    drawableAEQbTJ = ContextCompat.getDrawable(c55377ximKWHzl.getContext(), C52761wXj.TaskDescription.DzkRMH);
                } else {
                    drawableAEQbTJ = c55377xim.AEQbTJ();
                }
                c55377ximKWHzl.setEndDrawable(drawableAEQbTJ);
                c55377ximKWHzl.setInterceptEvent(c55377xim.OLrzqt());
                if (c55377xim.AhwBna().djBIcL() == -1 && c55377xim.AhwBna().OLrzqt() == null) {
                    C55312xha c55312xhaValueOf = c55377ximKWHzl.AhwBna().valueOf();
                    if (c55312xhaValueOf != null && (c55318xhgEZpvd = c55312xhaValueOf.EZpvd()) != null) {
                        c55318xhgEZpvd.removeAllViews();
                    }
                } else {
                    c55377xim.AhwBna().ejfBZ();
                    c55377ximKWHzl.AhwBna().setAttachmentViewId(c55377xim.AhwBna().djBIcL());
                    c55377ximKWHzl.AhwBna().setAttachingView(c55377xim.AhwBna().OLrzqt());
                }
                c55377ximKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wYt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        AbstractC52796wYr.Activity.KWHzl(c55377xim, view);
                    }
                });
            }
        }

        public static final void KWHzl(C55377xim c55377xim, android.view.View view) {
            Function0<Unit> function0KWHzl = c55377xim.KWHzl();
            if (function0KWHzl != null) {
                function0KWHzl.invoke();
            }
        }
    }

    public static /* synthetic */ void setHeaderType$default(AbstractC52796wYr abstractC52796wYr, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setHeaderType");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        abstractC52796wYr.EZpvd(i);
    }

    public final void EZpvd(int i) {
        android.widget.TextView textViewAEQbTJ;
        if (this.fetchVPNInfo == i) {
            return;
        }
        this.fetchVPNInfo = i;
        C43316rmw c43316rmw = this.fIwbmz;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        RecyclerView recyclerView = this.ejfBZ;
        ViewGroup.LayoutParams layoutParams = recyclerView != null ? recyclerView.getLayoutParams() : null;
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i == 0) {
            C52781wYc c52781wYc = this.isConnected;
            if (c52781wYc != null) {
                c52781wYc.setType(2);
                c52781wYc.setDividerVisibility(false);
            }
            android.widget.TextView textView = this.fARcdN;
            if (textView != null) {
                C52781wYc c52781wYc2 = this.isConnected;
                if (c52781wYc2 != null && (textViewAEQbTJ = c52781wYc2.AEQbTJ()) != null) {
                    text = textViewAEQbTJ.getText();
                }
                C55307xhV.AEQbTJ(textView, text);
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C55296xhK.AEQbTJ(layoutParams2, 0, C55298xhM.KWHzl(16.0f, contextRequireContext), 0, 0);
        } else {
            C52781wYc c52781wYc3 = this.isConnected;
            if (c52781wYc3 != null) {
                c52781wYc3.setType(13);
                c52781wYc3.setDividerVisibility(true);
                android.widget.TextView textViewAEQbTJ2 = c52781wYc3.AEQbTJ();
                if (textViewAEQbTJ2 != null) {
                    android.widget.TextView textView2 = this.fARcdN;
                    C55307xhV.AEQbTJ(textViewAEQbTJ2, textView2 != null ? textView2.getText() : null);
                }
            }
            android.widget.TextView textView3 = this.fARcdN;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C55296xhK.AEQbTJ(layoutParams2, 0, C55298xhM.KWHzl(8.0f, contextRequireContext2), 0, 0);
        }
        RecyclerView recyclerView2 = this.ejfBZ;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: o.wYr$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final /* synthetic */ AbstractC52796wYr EZpvd;
        public C55377xim OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55377xim KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC52796wYr abstractC52796wYr, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = abstractC52796wYr;
            this.OLrzqt = (C55377xim) view.findViewById(C52761wXj.FragmentManager.getPriority);
        }
    }

    /* JADX INFO: renamed from: o.wYr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
