package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51604vqE extends RecyclerView.Adapter<Application> {
    public final java.util.List<java.util.List<RecommendBulletItem>> OLrzqt;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<com.okinc.unify_trade.biz.RecommendBulletItem>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51604vqE(@NotNull java.util.List<? extends java.util.List<RecommendBulletItem>> list, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.copydefault = function1;
    }

    /* JADX INFO: renamed from: o.vqE$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.view.ViewGroup EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.view.ViewGroup copydefault;
        public final android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.ViewGroup EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.ViewGroup copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.getListView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.warmup);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.onKeyDown);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.valueOf = (android.widget.TextView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C48033uCm.Application.IPostMessageService);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.KWHzl = (android.widget.ImageView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C48033uCm.Application.RZOtbZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.EZpvd = (android.view.ViewGroup) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C48033uCm.Application.SePrCP);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.copydefault = (android.view.ViewGroup) viewFindViewById6;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C48033uCm.Activity.DcMfJKDIADVb, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        int size = i % this.OLrzqt.size();
        if (!this.OLrzqt.isEmpty()) {
            if (this.OLrzqt.get(size).size() > 1) {
                RecommendBulletItem recommendBulletItem = this.OLrzqt.get(size).get(1);
                C51651vqz.EZpvd(application.AhwBna(), recommendBulletItem);
                InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
                android.content.Context context = application.KWHzl().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                interfaceC49317umK.copydefault(context, application.KWHzl(), recommendBulletItem.getNickName(), recommendBulletItem.getPortrait(), recommendBulletItem.getTargetId());
                application.copydefault().setVisibility(0);
                android.view.ViewGroup viewGroupCopydefault = application.copydefault();
                viewGroupCopydefault.setOnClickListener(new TaskDescription(viewGroupCopydefault, 1000L, this, size, application));
            } else {
                application.copydefault().setVisibility(8);
            }
            RecommendBulletItem recommendBulletItem2 = this.OLrzqt.get(size).get(0);
            C51651vqz.EZpvd(application.OLrzqt(), recommendBulletItem2);
            InterfaceC49317umK interfaceC49317umK2 = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
            android.content.Context context2 = application.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            interfaceC49317umK2.copydefault(context2, application.AEQbTJ(), recommendBulletItem2.getNickName(), recommendBulletItem2.getPortrait(), recommendBulletItem2.getTargetId());
            android.view.ViewGroup viewGroupEZpvd = application.EZpvd();
            viewGroupEZpvd.setOnClickListener(new StateListAnimator(viewGroupEZpvd, 1000L, this, size, application));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!this.OLrzqt.isEmpty()) {
            return this.OLrzqt.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.vqE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C51604vqE AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Application KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51604vqE c51604vqE, int i, Application application) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c51604vqE;
            this.OLrzqt = i;
            this.KWHzl = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String underlyingId = ((RecommendBulletItem) ((java.util.List) this.AEQbTJ.OLrzqt.get(this.OLrzqt)).get(0)).getUnderlyingId();
                if (underlyingId != null) {
                    C55867xrz.KWHzl.copydefault(underlyingId);
                    C51651vqz.AEQbTJ(this.KWHzl.EZpvd(), underlyingId);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vqE$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51604vqE KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Application copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51604vqE c51604vqE, int i, Application application) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c51604vqE;
            this.AEQbTJ = i;
            this.copydefault = application;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.KWHzl.OLrzqt() != null) {
                    java.lang.String underlyingId = ((RecommendBulletItem) ((java.util.List) this.KWHzl.OLrzqt.get(this.AEQbTJ)).get(1)).getUnderlyingId();
                    if (underlyingId != null) {
                        C55867xrz.KWHzl.copydefault(underlyingId);
                        this.KWHzl.OLrzqt().invoke(underlyingId);
                        return;
                    }
                    return;
                }
                java.lang.String underlyingId2 = ((RecommendBulletItem) ((java.util.List) this.KWHzl.OLrzqt.get(this.AEQbTJ)).get(1)).getUnderlyingId();
                if (underlyingId2 != null) {
                    C55867xrz.KWHzl.copydefault(underlyingId2);
                    C51651vqz.AEQbTJ(this.copydefault.copydefault(), underlyingId2);
                }
            }
        }
    }
}
