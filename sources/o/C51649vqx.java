package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51649vqx extends RecyclerView.Adapter<StateListAnimator> {
    public final java.util.List<RecommendBulletItem> KWHzl;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    public C51649vqx(@NotNull java.util.List<RecommendBulletItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX INFO: renamed from: o.vqx$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final LinearLayoutCompat KWHzl;
        public final android.widget.ImageView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LinearLayoutCompat KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.HJWChPRAkuRW);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.RKcVTr);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.copydefault = (android.widget.ImageView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.ComponentActivity5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (LinearLayoutCompat) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C48033uCm.Activity.sbu, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        try {
            if (C33512mxp.AEQbTJ.isConnected() == 0) {
                android.graphics.drawable.Drawable background = stateListAnimator.KWHzl().getBackground();
                Intrinsics.checkNotNullExpressionValue(background, "");
                C33057mpK.copydefault(background, C33070mpX.copydefault(C52761wXj.Activity.DcqEDu));
            } else {
                android.graphics.drawable.Drawable background2 = stateListAnimator.KWHzl().getBackground();
                Intrinsics.checkNotNullExpressionValue(background2, "");
                C33057mpK.copydefault(background2, C33070mpX.copydefault(C52761wXj.Activity.fHqPtx));
            }
        } catch (java.lang.Exception unused) {
        }
        int size = i % this.KWHzl.size();
        C51651vqz.EZpvd(stateListAnimator.OLrzqt(), this.KWHzl.get(size));
        InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
        android.content.Context context = stateListAnimator.copydefault().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        interfaceC49317umK.copydefault(context, stateListAnimator.copydefault(), this.KWHzl.get(size).getNickName(), this.KWHzl.get(size).getPortrait(), this.KWHzl.get(size).getTargetId());
        LinearLayoutCompat linearLayoutCompatKWHzl = stateListAnimator.KWHzl();
        linearLayoutCompatKWHzl.setOnClickListener(new ActionBar(linearLayoutCompatKWHzl, 1000L, this, size));
    }

    /* JADX INFO: renamed from: o.vqx$Application */
    public static final class Application implements Function1<AbstractC43238rlX, Unit> {
        public static final Application KWHzl = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            KWHzl(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.vqx$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ C51649vqx OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51649vqx c51649vqx, int i) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c51649vqx;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.app.Activity activityKWHzl = C35334ntP.KWHzl((LinearLayoutCompat) this.copydefault);
                C55867xrz.KWHzl.copydefault(((RecommendBulletItem) this.OLrzqt.KWHzl.get(this.KWHzl)).getUnderlyingId());
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                C56071xvr c56071xvr = C56071xvr.gEmmrt;
                java.lang.String underlyingId = ((RecommendBulletItem) this.OLrzqt.KWHzl.get(this.KWHzl)).getUnderlyingId();
                if (underlyingId == null) {
                    underlyingId = "";
                }
                InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityKWHzl, c56071xvr.KWHzl(underlyingId, "trade_bot_main_page_smartpicks_card"), null, Application.KWHzl, 4, null);
            }
        }
    }
}
