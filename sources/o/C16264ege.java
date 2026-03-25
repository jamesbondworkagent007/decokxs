package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C16264ege;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ege, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16264ege extends AbstractC57674ymq {
    public java.util.Set<java.lang.String> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public java.lang.Float KWHzl = java.lang.Float.valueOf(0.98f);
    public java.lang.String OLrzqt = "";
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16264ege AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = str;
        this.EZpvd = function1;
        this.AEQbTJ = null;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C16264ege EZpvd(@NotNull java.lang.String str, @NotNull java.util.Set<java.lang.String> set, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = str;
        this.AEQbTJ = set;
        this.EZpvd = function1;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57674ymq
    public java.lang.Float OLrzqt() {
        return this.KWHzl;
    }

    @Override // o.C33003moJ, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.OLrzqt.length() == 0) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View root = ((AbstractC16974etz) DataBindingUtil.inflate(layoutInflater, C13754dXa.TaskDescription.iLAtSv, null, false)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC57674ymq
    public android.view.View AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        final RecyclerView recyclerView = new RecyclerView(layoutInflater.getContext());
        recyclerView.setOverScrollMode(2);
        recyclerView.setPaddingRelative(C33052mpF.dp2px$default(16.0f, null, 1, null), 0, C33052mpF.dp2px$default(16.0f, null, 1, null), 0);
        recyclerView.setBackgroundColor(ResourcesCompat.getColor(layoutInflater.getContext().getResources(), C52761wXj.Activity.DGgkXd, null));
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.OLrzqt, true), this);
        final Function1 function1 = new Function1() { // from class: o.egf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16264ege.EZpvd(this.KWHzl, recyclerView, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.egc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16264ege.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.egg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16264ege.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.egl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C16264ege.KWHzl(function12, obj);
            }
        });
        return recyclerView;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final C16264ege c16264ege, RecyclerView recyclerView, AbstractC12782ctV abstractC12782ctV) {
        C59534zip c59534zip = new C59534zip(C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12782ctV.hUfVAv()), new Function1() { // from class: o.egi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C16264ege.copydefault(this.EZpvd, (C10854bwM) obj));
            }
        }), new Function1() { // from class: o.egj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16264ege.AEQbTJ(this.OLrzqt, (C10854bwM) obj);
            }
        })));
        c59534zip.register(Triple.class, c16264ege.new Application());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(c59534zip);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c16264ege, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(C16264ege c16264ege, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        java.util.Set<java.lang.String> set = c16264ege.AEQbTJ;
        if (set != null) {
            Intrinsics.copydefault(set);
            if (!set.contains(java.lang.String.valueOf(c10854bwM.fetchVPNInfo()))) {
                return false;
            }
        }
        return true;
    }

    public static final Triple AEQbTJ(C16264ege c16264ege, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new Triple(c10854bwM.djBIcL(), java.lang.String.valueOf(c16264ege.AEQbTJ != null ? c10854bwM.fetchVPNInfo() : c10854bwM.AhwBna()), c10854bwM.copydefault());
    }

    /* JADX INFO: renamed from: o.ege$Application */
    public static final class Application extends AbstractC59533zio<Triple<?, ?, ?>, StateListAnimator> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new StateListAnimator(C16264ege.this, layoutInflater, viewGroup);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(StateListAnimator stateListAnimator, final Triple<?, ?, ?> triple) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(triple, "");
            android.content.Context context = stateListAnimator.itemView.getContext();
            C5335Nt<android.graphics.drawable.Drawable> c5335NtKWHzl = Glide.EZpvd(C16264ege.this).KWHzl(triple.getThird());
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            Intrinsics.copydefault(context);
            c5335NtKWHzl.OLrzqt(c14726dqr.OLrzqt(context)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, C33052mpF.dp2px$default(0.5f, null, 1, null), C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(stateListAnimator.OLrzqt());
            android.widget.TextView textViewCopydefault = stateListAnimator.copydefault();
            java.lang.Object first = triple.getFirst();
            Intrinsics.copydefault(first, "");
            textViewCopydefault.setText((java.lang.String) first);
            android.view.View view = stateListAnimator.itemView;
            final C16264ege c16264ege = C16264ege.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.egk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C16264ege.Application.AEQbTJ(c16264ege, triple, view2);
                }
            });
        }

        public static final void AEQbTJ(C16264ege c16264ege, Triple triple, android.view.View view) {
            Function1 function1 = c16264ege.EZpvd;
            if (function1 != null) {
                java.lang.Object second = triple.getSecond();
                Intrinsics.copydefault(second, "");
                function1.invoke((java.lang.String) second);
            }
            c16264ege.dismissAllowingStateLoss();
        }
    }

    public static final Unit AEQbTJ(C16264ege c16264ege, java.lang.Throwable th) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c16264ege, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.ege$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C16264ege AEQbTJ;
        public final android.widget.ImageView EZpvd;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C16264ege c16264ege, @NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            super(layoutInflater.inflate(C13754dXa.TaskDescription.bindToGooglePlayService, viewGroup, false));
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            this.AEQbTJ = c16264ege;
            android.view.View viewFindViewById = this.itemView.findViewById(C13754dXa.ActionBar.ibrGus);
            Intrinsics.copydefault(viewFindViewById);
            this.EZpvd = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = this.itemView.findViewById(C13754dXa.ActionBar.parseResult);
            Intrinsics.copydefault(viewFindViewById2);
            this.copydefault = (android.widget.TextView) viewFindViewById2;
        }
    }
}
