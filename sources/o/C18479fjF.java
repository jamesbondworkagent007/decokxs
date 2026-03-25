package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.data.DerviationEVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18479fjF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18479fjF extends wXX {
    public C43316rmw EZpvd;
    public Function1<? super DerviationEVM, Unit> KWHzl;
    public java.lang.String OLrzqt;
    public java.util.ArrayList<DerviationEVM> copydefault = new java.util.ArrayList<>();
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fjF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.fjF$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C18479fjF newInstance$default(Activity activity, java.util.List list, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return activity.copydefault(list, str, function1);
        }

        public final C18479fjF copydefault(java.util.List<DerviationEVM> list, @NotNull java.lang.String str, Function1<? super DerviationEVM, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            C18479fjF c18479fjF = new C18479fjF();
            c18479fjF.KWHzl = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putSerializable("dataList", new java.util.ArrayList(list));
            bundle.putString("selectAddress", str);
            c18479fjF.setArguments(bundle);
            return c18479fjF;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        c52781wYc.setOnClickListener(new View.OnClickListener() { // from class: o.fjD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18479fjF.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(C18479fjF c18479fjF, android.view.View view) {
        c18479fjF.dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.io.Serializable serializable = arguments.getSerializable("dataList");
            Intrinsics.copydefault(serializable, "");
            this.copydefault = (java.util.ArrayList) serializable;
            this.OLrzqt = arguments.getString("selectAddress");
        }
        AbstractC16555emD abstractC16555emD = (AbstractC16555emD) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C13754dXa.TaskDescription.DPHsZd, constraintLayout, true);
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.setItems(this.copydefault);
        c43316rmw.register(DerviationEVM.class, new ActionBar(this, new Function1() { // from class: o.fjE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18479fjF.copydefault(this.KWHzl, (DerviationEVM) obj);
            }
        }));
        this.EZpvd = c43316rmw;
        RecyclerView recyclerView = abstractC16555emD.copydefault;
        recyclerView.setAdapter(c43316rmw);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemViewCacheSize(0);
    }

    public static final Unit copydefault(C18479fjF c18479fjF, DerviationEVM derviationEVM) {
        Intrinsics.checkNotNullParameter(derviationEVM, "");
        c18479fjF.OLrzqt = derviationEVM.getAddress();
        C43316rmw c43316rmw = c18479fjF.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
        Function1<? super DerviationEVM, Unit> function1 = c18479fjF.KWHzl;
        if (function1 != null) {
            function1.invoke(derviationEVM);
        }
        c18479fjF.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fjF$ActionBar */
    public final class ActionBar extends AbstractC59533zio<DerviationEVM, StateListAnimator> {
        public final Function1<DerviationEVM, Unit> KWHzl;
        public final /* synthetic */ C18479fjF copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.data.DerviationEVM, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C18479fjF c18479fjF, Function1<? super DerviationEVM, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = c18479fjF;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C18479fjF c18479fjF = this.copydefault;
            android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKDDUqPf, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(c18479fjF, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull final DerviationEVM derviationEVM) {
            float f;
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(derviationEVM, "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) derviationEVM.getTag())) {
                android.widget.TextView textViewKWHzl = stateListAnimator.KWHzl();
                if (textViewKWHzl != null) {
                    textViewKWHzl.setVisibility(0);
                }
                android.widget.TextView textViewKWHzl2 = stateListAnimator.KWHzl();
                if (textViewKWHzl2 != null) {
                    textViewKWHzl2.setText(derviationEVM.getTag());
                }
                f = 8.0f;
            } else {
                android.widget.TextView textViewKWHzl3 = stateListAnimator.KWHzl();
                if (textViewKWHzl3 != null) {
                    textViewKWHzl3.setVisibility(8);
                }
                f = 16.0f;
            }
            android.widget.TextView textViewAEQbTJ = stateListAnimator.AEQbTJ();
            if (textViewAEQbTJ != null) {
                C55296xhK.OLrzqt(textViewAEQbTJ, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
            }
            android.widget.TextView textViewAEQbTJ2 = stateListAnimator.AEQbTJ();
            if (textViewAEQbTJ2 != null) {
                C8322bAY c8322bAY = C8322bAY.KWHzl;
                java.lang.Integer addressType = derviationEVM.getAddressType();
                textViewAEQbTJ2.setText(c8322bAY.OLrzqt(addressType != null ? addressType.intValue() : -1, true) + " | " + derviationEVM.getDerivePath());
            }
            android.widget.TextView textViewEZpvd = stateListAnimator.EZpvd();
            if (textViewEZpvd != null) {
                C55307xhV.AEQbTJ(textViewEZpvd, derviationEVM.getAddress());
            }
            android.widget.TextView textViewCopydefault = stateListAnimator.copydefault();
            if (textViewCopydefault != null) {
                C55307xhV.AEQbTJ(textViewCopydefault, derviationEVM.getCurrencyAmount());
            }
            android.widget.ImageView imageViewOLrzqt = stateListAnimator.OLrzqt();
            if (imageViewOLrzqt != null) {
                imageViewOLrzqt.setVisibility(Intrinsics.EZpvd((java.lang.Object) derviationEVM.getAddress(), (java.lang.Object) this.copydefault.OLrzqt) ? 0 : 8);
            }
            stateListAnimator.itemView.setSelected(Intrinsics.EZpvd((java.lang.Object) derviationEVM.getAddress(), (java.lang.Object) this.copydefault.OLrzqt));
            stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.fjH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C18479fjF.ActionBar.KWHzl(this.AEQbTJ, derviationEVM, view);
                }
            });
        }

        public static final void KWHzl(ActionBar actionBar, DerviationEVM derviationEVM, android.view.View view) {
            actionBar.KWHzl.invoke(derviationEVM);
        }
    }

    /* JADX INFO: renamed from: o.fjF$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.TextView EZpvd;
        public android.widget.ImageView KWHzl;
        public android.widget.TextView OLrzqt;
        public android.widget.TextView copydefault;
        public final /* synthetic */ C18479fjF djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C18479fjF c18479fjF, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.djBIcL = c18479fjF;
            this.copydefault = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.AnyRes);
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.Rid);
            this.OLrzqt = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.onStart);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.R);
            this.KWHzl = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.UUsvzU);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.fjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18479fjF.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(C18479fjF c18479fjF) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18479fjF, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
