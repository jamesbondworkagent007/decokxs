package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.net.bean.AASubApprovalInfoNew;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C18455fii;
import o.C52761wXj;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C18455fii extends AbstractC14668dpm {
    public AbstractC16575emX EZpvd;
    public AASubApprovalInfoNew OLrzqt;
    public InterfaceC9736bbH copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.fii$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fii.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C18455fii KWHzl(@NotNull InterfaceC9736bbH interfaceC9736bbH) {
            Intrinsics.checkNotNullParameter(interfaceC9736bbH, "");
            C18455fii c18455fii = new C18455fii();
            c18455fii.copydefault = interfaceC9736bbH;
            return c18455fii;
        }
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.EZpvd = AbstractC16575emX.copydefault(android.view.LayoutInflater.from(getContext()), viewGroup, false);
        EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.iqMDAV));
        EZpvd(AubY());
        OLrzqt(true);
        AbstractC16575emX abstractC16575emX = this.EZpvd;
        if (abstractC16575emX == null) {
            Intrinsics.gEmmrt("");
            abstractC16575emX = null;
        }
        android.view.View root = abstractC16575emX.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final java.util.ArrayList<AASubApprovalInfoNew> arrayListKWHzl = KWHzl();
        C59534zip c59534zip = new C59534zip(arrayListKWHzl);
        c59534zip.register(AASubApprovalInfoNew.class, new Application());
        AbstractC16575emX abstractC16575emX = this.EZpvd;
        AbstractC16575emX abstractC16575emX2 = null;
        if (abstractC16575emX == null) {
            Intrinsics.gEmmrt("");
            abstractC16575emX = null;
        }
        abstractC16575emX.KWHzl.setAdapter(c59534zip);
        AbstractC16575emX abstractC16575emX3 = this.EZpvd;
        if (abstractC16575emX3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16575emX3 = null;
        }
        abstractC16575emX3.KWHzl.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        AbstractC16575emX abstractC16575emX4 = this.EZpvd;
        if (abstractC16575emX4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16575emX2 = abstractC16575emX4;
        }
        C8003auW.copydefault(abstractC16575emX2.AEQbTJ).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18455fii.OLrzqt(arrayListKWHzl, this, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.fii$Application */
    public static final class Application extends AbstractC59533zio<AASubApprovalInfoNew, StateListAnimator> {
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public StateListAnimator onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.HJWChPzRXNTw, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(StateListAnimator stateListAnimator, final AASubApprovalInfoNew aASubApprovalInfoNew) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(aASubApprovalInfoNew, "");
            android.content.Context context = C18455fii.this.getContext();
            if (context == null) {
                return;
            }
            Glide.EZpvd(C18455fii.this).EZpvd(aASubApprovalInfoNew.OLrzqt()).OLrzqt(AppCompatResources.getDrawable(context, C52761wXj.TaskDescription.aHXSQp)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC), false, 8, null)).EZpvd(stateListAnimator.AEQbTJ());
            stateListAnimator.OLrzqt().setText(aASubApprovalInfoNew.valueOf());
            if (aASubApprovalInfoNew.AhwBna()) {
                stateListAnimator.EZpvd().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO));
            } else {
                stateListAnimator.EZpvd().setText(aASubApprovalInfoNew.AEQbTJ() + " " + aASubApprovalInfoNew.valueOf());
            }
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(stateListAnimator.itemView).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            final C18455fii c18455fii = C18455fii.this;
            abstractC58247yxgThrottleFirst.subscribe(new InterfaceC58227yxM() { // from class: o.fih
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18455fii.Application.OLrzqt(c18455fii, aASubApprovalInfoNew, obj);
                }
            });
        }

        public static final void OLrzqt(C18455fii c18455fii, AASubApprovalInfoNew aASubApprovalInfoNew, java.lang.Object obj) {
            c18455fii.OLrzqt = aASubApprovalInfoNew;
            c18455fii.OLrzqt(ViewOnClickListenerC18449fic.Companion.AEQbTJ(aASubApprovalInfoNew.KWHzl(), aASubApprovalInfoNew.valueOf(), aASubApprovalInfoNew.copydefault(), aASubApprovalInfoNew.EZpvd()), 1000, true, true);
        }
    }

    /* JADX INFO: renamed from: o.fii$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.widget.ImageView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.widget.TextView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.SQPLEi);
            Intrinsics.copydefault(viewFindViewById);
            this.KWHzl = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.ActivityResultContractsStartActivityForResultCompanion);
            Intrinsics.copydefault(viewFindViewById2);
            this.OLrzqt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C13754dXa.ActionBar.postWhenReportersAreDone);
            Intrinsics.copydefault(viewFindViewById3);
            this.copydefault = (android.widget.TextView) viewFindViewById3;
        }
    }

    public final java.util.ArrayList<AASubApprovalInfoNew> KWHzl() {
        java.lang.String strAYXKKw;
        java.util.ArrayList<AASubApprovalInfoNew> arrayList = new java.util.ArrayList<>();
        InterfaceC9736bbH interfaceC9736bbH = this.copydefault;
        if (interfaceC9736bbH == null) {
            Intrinsics.gEmmrt("");
            interfaceC9736bbH = null;
        }
        int iDjBIcL = interfaceC9736bbH.djBIcL();
        for (int i = 0; i < iDjBIcL; i++) {
            InterfaceC9736bbH interfaceC9736bbH2 = this.copydefault;
            if (interfaceC9736bbH2 == null) {
                Intrinsics.gEmmrt("");
                interfaceC9736bbH2 = null;
            }
            java.lang.String approveAmount$default = InterfaceC9736bbH.StateListAnimator.getApproveAmount$default(interfaceC9736bbH2, i, false, 2, null);
            InterfaceC9736bbH interfaceC9736bbH3 = this.copydefault;
            if (interfaceC9736bbH3 == null) {
                Intrinsics.gEmmrt("");
                interfaceC9736bbH3 = null;
            }
            InterfaceC9730bbB.StateListAnimator stateListAnimatorCopydefault = interfaceC9736bbH3.copydefault(i);
            java.lang.Integer numValueOf = stateListAnimatorCopydefault != null ? java.lang.Integer.valueOf(stateListAnimatorCopydefault.copydefault()) : null;
            int iIntValue = ((numValueOf != null && numValueOf.intValue() == 0) || numValueOf == null) ? 18 : numValueOf.intValue();
            arrayList.add(new AASubApprovalInfoNew(Intrinsics.EZpvd((java.lang.Object) approveAmount$default, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935"), approveAmount$default, C54862xYb.convertToString$default(C54862xYb.divB$default(approveAmount$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iIntValue)))), 0, null, 6, null), false, null, null, 7, null), stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.OLrzqt() : null, (stateListAnimatorCopydefault == null || (strAYXKKw = stateListAnimatorCopydefault.AYXKKw()) == null) ? "" : strAYXKKw, iIntValue, stateListAnimatorCopydefault != null ? stateListAnimatorCopydefault.EZpvd() : null));
        }
        return arrayList;
    }

    @Override // o.AbstractC57212yeE
    public void AEQbTJ(int i, int i2, android.content.Intent intent) {
        java.lang.String stringExtra;
        super.AEQbTJ(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            if (intent == null || (stringExtra = intent.getStringExtra("approve_amount")) == null) {
                stringExtra = "";
            }
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.divB$default(stringExtra, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("precision", 18) : 18)))), 0, null, 6, null), false, null, null, 7, null);
            AASubApprovalInfoNew aASubApprovalInfoNew = this.OLrzqt;
            if (aASubApprovalInfoNew != null) {
                aASubApprovalInfoNew.KWHzl(Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935"));
            }
            AASubApprovalInfoNew aASubApprovalInfoNew2 = this.OLrzqt;
            if (aASubApprovalInfoNew2 != null) {
                aASubApprovalInfoNew2.AEQbTJ(strConvertToString$default);
            }
            AASubApprovalInfoNew aASubApprovalInfoNew3 = this.OLrzqt;
            if (aASubApprovalInfoNew3 != null) {
                aASubApprovalInfoNew3.KWHzl(stringExtra);
            }
            AbstractC16575emX abstractC16575emX = this.EZpvd;
            if (abstractC16575emX == null) {
                Intrinsics.gEmmrt("");
                abstractC16575emX = null;
            }
            RecyclerView.Adapter adapter = abstractC16575emX.KWHzl.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
    }

    public static final void OLrzqt(java.util.ArrayList arrayList, C18455fii c18455fii, java.lang.Object obj) {
        int i = 0;
        for (java.lang.Object obj2 : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AASubApprovalInfoNew aASubApprovalInfoNew = (AASubApprovalInfoNew) obj2;
            InterfaceC9736bbH interfaceC9736bbH = c18455fii.copydefault;
            if (interfaceC9736bbH == null) {
                Intrinsics.gEmmrt("");
                interfaceC9736bbH = null;
            }
            interfaceC9736bbH.copydefault(i, aASubApprovalInfoNew.KWHzl());
            i++;
        }
        c18455fii.AuCTelauCTel();
    }
}
