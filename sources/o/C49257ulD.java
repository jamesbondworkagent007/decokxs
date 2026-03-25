package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.share.api.params.IShareParams;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.C49257ulD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49257ulD extends AbstractC32996moC implements InterfaceC48897ueO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ;
    public java.lang.Integer AYXKKw;
    public java.util.HashMap<java.lang.String, java.lang.Boolean> KWHzl;
    public final java.util.ArrayList<InterfaceC48901ueS> OLrzqt;
    public C49016ugb copydefault;
    public final C59534zip gEmmrt;
    public InterfaceC48898ueP valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int KWHzl(int i, InterfaceC48901ueS interfaceC48901ueS) {
        Intrinsics.checkNotNullParameter(interfaceC48901ueS, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Integer num) {
        if (num != null) {
            this.AYXKKw = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC48898ueP interfaceC48898ueP) {
        Intrinsics.checkNotNullParameter(interfaceC48898ueP, "");
        this.valueOf = interfaceC48898ueP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C49257ulD() {
        java.util.ArrayList<InterfaceC48901ueS> arrayList = new java.util.ArrayList<>();
        this.OLrzqt = arrayList;
        this.gEmmrt = new C59534zip(arrayList);
        this.valueOf = new C48900ueR();
        this.AEQbTJ = C48931uew.Application.gEmmrt;
        this.KWHzl = new java.util.HashMap<>();
    }

    /* JADX INFO: renamed from: o.ulD$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C49257ulD createEditBottomFragment$default(StateListAnimator stateListAnimator, java.util.List list, InterfaceC48898ueP interfaceC48898ueP, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = null;
            }
            return stateListAnimator.copydefault(list, interfaceC48898ueP, num);
        }

        public final C49257ulD copydefault(@NotNull java.util.List<? extends InterfaceC48901ueS> list, @NotNull InterfaceC48898ueP interfaceC48898ueP, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC48898ueP, "");
            C49257ulD c49257ulD = new C49257ulD();
            c49257ulD.copydefault(list);
            c49257ulD.KWHzl(interfaceC48898ueP);
            c49257ulD.EZpvd(num);
            return c49257ulD;
        }
    }

    public final void copydefault(@NotNull java.util.List<? extends InterfaceC48901ueS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
    }

    @Override // o.InterfaceC48897ueO
    public boolean copydefault() {
        java.util.List<InterfaceC48901ueS> listEZpvd = EZpvd();
        if (listEZpvd == null || listEZpvd.isEmpty()) {
            return false;
        }
        boolean z = !this.KWHzl.equals(EZpvd(listEZpvd));
        pUU.KWHzl("OKShare", "isModified->:" + z);
        return z;
    }

    @Override // o.InterfaceC48897ueO
    public void OLrzqt() {
        C49016ugb c49016ugb = this.copydefault;
        if (c49016ugb == null) {
            Intrinsics.gEmmrt("");
            c49016ugb = null;
        }
        c49016ugb.KWHzl.performClick();
    }

    public java.util.List<InterfaceC48901ueS> EZpvd() {
        return new java.util.ArrayList(this.OLrzqt);
    }

    public InterfaceC48969ufh<?, ?> gEmmrt() {
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            return interfaceC48892ueJCopydefault.AkhnZx();
        }
        return null;
    }

    public void AEQbTJ() {
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.fIwbmz();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C49016ugb.EZpvd(view);
        valueOf();
        C49016ugb c49016ugb = this.copydefault;
        C49016ugb c49016ugb2 = null;
        if (c49016ugb == null) {
            Intrinsics.gEmmrt("");
            c49016ugb = null;
        }
        C52794wYp c52794wYp = c49016ugb.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        C49016ugb c49016ugb3 = this.copydefault;
        if (c49016ugb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49016ugb2 = c49016ugb3;
        }
        C52794wYp c52794wYp2 = c49016ugb2.copydefault;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, this));
    }

    public final void valueOf() {
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        java.lang.Integer num;
        int size = this.OLrzqt.size();
        int i = (size / 2) + (size % 2 == 0 ? 0 : 1);
        C49016ugb c49016ugb = null;
        if (i == 1) {
            numValueOf = java.lang.Integer.valueOf(C48931uew.ActionBar.copydefault);
        } else if (i == 2) {
            numValueOf = java.lang.Integer.valueOf(C48931uew.ActionBar.OLrzqt);
        } else {
            numValueOf = i >= 3 ? java.lang.Integer.valueOf(C48931uew.ActionBar.AEQbTJ) : null;
        }
        if (numValueOf != null) {
            numValueOf.intValue();
            numValueOf2 = java.lang.Integer.valueOf(getResources().getDimensionPixelSize(numValueOf.intValue()));
        } else {
            numValueOf2 = null;
        }
        pUU.KWHzl("OKShare", "ImageEditPanel ->resolveAndSetMinHeight->recommendHeight:" + this.AYXKKw + " minHeight:" + numValueOf2 + " size:" + size + " lines:" + i);
        if (numValueOf2 == null || (num = this.AYXKKw) == null) {
            return;
        }
        Intrinsics.copydefault(num);
        int iIntValue = num.intValue();
        if (iIntValue > numValueOf2.intValue()) {
            C49016ugb c49016ugb2 = this.copydefault;
            if (c49016ugb2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c49016ugb = c49016ugb2;
            }
            c49016ugb.AEQbTJ.setMinimumHeight(iIntValue);
            pUU.KWHzl("OKShare", "ImageEditPanel ->recommendHeight:" + iIntValue);
            return;
        }
        C49016ugb c49016ugb3 = this.copydefault;
        if (c49016ugb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49016ugb = c49016ugb3;
        }
        c49016ugb.AEQbTJ.setMinimumHeight(numValueOf2.intValue());
        pUU.KWHzl("OKShare", "ImageEditPanel ->minHeight:" + numValueOf2);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (this.OLrzqt.isEmpty()) {
            AEQbTJ();
            return;
        }
        AEQbTJ(this.OLrzqt);
        InterfaceC48969ufh<?, ?> interfaceC48969ufhGEmmrt = gEmmrt();
        if (interfaceC48969ufhGEmmrt != null) {
            IShareParams iShareParamsRequireShareParams = interfaceC48969ufhGEmmrt.requireShareParams();
            C48992ugD.KWHzl.OLrzqt(iShareParamsRequireShareParams.getTriggerSource(), iShareParamsRequireShareParams.getShareFrom());
            copydefault(interfaceC48969ufhGEmmrt);
        }
        this.KWHzl = EZpvd(this.OLrzqt);
        view.post(new java.lang.Runnable() { // from class: o.ulB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49257ulD.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(C49257ulD c49257ulD) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49257ulD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        while (it.hasNext()) {
            ((InterfaceC48901ueS) it.next()).AEQbTJ(null);
        }
    }

    /* JADX INFO: renamed from: o.ulD$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C49257ulD OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C49257ulD c49257ulD) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c49257ulD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC48969ufh<?, ?> interfaceC48969ufhGEmmrt;
            InterfaceC48892ueJ shareDialog;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                InterfaceC48898ueP interfaceC48898ueP = this.OLrzqt.valueOf;
                Intrinsics.copydefault(c52794wYp);
                if (interfaceC48898ueP.AEQbTJ(c52794wYp) || (interfaceC48969ufhGEmmrt = this.OLrzqt.gEmmrt()) == null || (shareDialog = interfaceC48969ufhGEmmrt.getShareDialog()) == null) {
                    return;
                }
                shareDialog.fIwbmz();
            }
        }
    }

    /* JADX INFO: renamed from: o.ulD$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C49257ulD KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C49257ulD c49257ulD) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c49257ulD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC48969ufh<?, ?> interfaceC48969ufhGEmmrt;
            InterfaceC48892ueJ shareDialog;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.OLrzqt;
                InterfaceC48898ueP interfaceC48898ueP = this.KWHzl.valueOf;
                Intrinsics.copydefault(c52794wYp);
                if (interfaceC48898ueP.copydefault(c52794wYp) || (interfaceC48969ufhGEmmrt = this.KWHzl.gEmmrt()) == null || (shareDialog = interfaceC48969ufhGEmmrt.getShareDialog()) == null) {
                    return;
                }
                shareDialog.fIwbmz();
            }
        }
    }

    public final void copydefault(InterfaceC48969ufh<?, ?> interfaceC48969ufh) {
        android.view.ViewGroup previewContainer = interfaceC48969ufh.getPreviewContainer();
        for (InterfaceC48901ueS interfaceC48901ueS : this.OLrzqt) {
            interfaceC48901ueS.AEQbTJ(this);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            android.view.View viewKWHzl = interfaceC48901ueS.KWHzl(contextRequireContext, interfaceC48969ufh);
            if (viewKWHzl != null) {
                android.view.ViewParent parent = viewKWHzl.getParent();
                if (parent == null) {
                    previewContainer.addView(viewKWHzl);
                } else if (previewContainer.indexOfChild(viewKWHzl) == -1) {
                    ((android.view.ViewGroup) parent).removeView(viewKWHzl);
                    previewContainer.addView(viewKWHzl);
                }
            }
        }
    }

    public final void AEQbTJ(java.util.List<? extends InterfaceC48901ueS> list) {
        C49016ugb c49016ugb = this.copydefault;
        C49016ugb c49016ugb2 = null;
        if (c49016ugb == null) {
            Intrinsics.gEmmrt("");
            c49016ugb = null;
        }
        if (c49016ugb.AhwBna.getAdapter() == null) {
            int iDpInt$default = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
            int iDpInt$default2 = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
            C49016ugb c49016ugb3 = this.copydefault;
            if (c49016ugb3 == null) {
                Intrinsics.gEmmrt("");
                c49016ugb3 = null;
            }
            c49016ugb3.AhwBna.addItemDecoration(new C55370xif(iDpInt$default, iDpInt$default2, 2));
            C49016ugb c49016ugb4 = this.copydefault;
            if (c49016ugb4 == null) {
                Intrinsics.gEmmrt("");
                c49016ugb4 = null;
            }
            c49016ugb4.AhwBna.setLayoutManager(new GridLayoutManager(requireContext(), 2, 1, false));
            KWHzl(this.gEmmrt);
            C49016ugb c49016ugb5 = this.copydefault;
            if (c49016ugb5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c49016ugb2 = c49016ugb5;
            }
            c49016ugb2.AhwBna.setAdapter(this.gEmmrt);
            return;
        }
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        this.gEmmrt.notifyDataSetChanged();
    }

    public final void KWHzl(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        c59534zip.register(InterfaceC48901ueS.class).copydefault(new Activity()).AEQbTJ(new InterfaceC59531zim() { // from class: o.ulA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return C49257ulD.KWHzl(i, (InterfaceC48901ueS) obj);
            }
        });
    }

    @Override // o.InterfaceC48897ueO
    public void KWHzl() {
        this.gEmmrt.notifyDataSetChanged();
    }

    public final java.util.HashMap<java.lang.String, java.lang.Boolean> EZpvd(java.util.List<? extends InterfaceC48901ueS> list) {
        java.util.HashMap<java.lang.String, java.lang.Boolean> map = new java.util.HashMap<>(list.size());
        for (InterfaceC48901ueS interfaceC48901ueS : list) {
            map.put(interfaceC48901ueS.copydefault(), java.lang.Boolean.valueOf(interfaceC48901ueS instanceof AbstractC48904ueV ? ((AbstractC48904ueV) interfaceC48901ueS).isChecked() : interfaceC48901ueS.KWHzl()));
        }
        return map;
    }

    /* JADX INFO: renamed from: o.ulD$Activity */
    public final class Activity extends AbstractC43310rmq<InterfaceC48901ueS, AbstractC49022ugh> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48931uew.Application.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C48927ues.AEQbTJ;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final C43312rms<AbstractC49022ugh> c43312rms, @NotNull final InterfaceC48901ueS interfaceC48901ueS) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(interfaceC48901ueS, "");
            super.onBindViewHolder((C43312rms) c43312rms, interfaceC48901ueS);
            ViewDataBinding viewDataBindingOLrzqt = c43312rms.OLrzqt();
            final C49257ulD c49257ulD = C49257ulD.this;
            AbstractC49022ugh abstractC49022ugh = (AbstractC49022ugh) viewDataBindingOLrzqt;
            android.content.Context context = c43312rms.itemView.getContext();
            AppCompatTextView appCompatTextView = abstractC49022ugh.OLrzqt;
            Intrinsics.copydefault(context);
            java.lang.CharSequence charSequenceOLrzqt = interfaceC48901ueS.OLrzqt(context);
            appCompatTextView.setText(charSequenceOLrzqt != null ? charSequenceOLrzqt : "");
            AbstractC48904ueV abstractC48904ueV = (AbstractC48904ueV) interfaceC48901ueS;
            pUU.KWHzl("OKShare", "onBindViewHolder->item:" + abstractC48904ueV.copydefault() + " isChecked:" + abstractC48904ueV.isChecked());
            if (abstractC48904ueV.OLrzqt()) {
                abstractC49022ugh.KWHzl.setEnabled(true);
                abstractC49022ugh.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.ulE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C49257ulD.Activity.copydefault(c43312rms, c49257ulD, interfaceC48901ueS, view);
                    }
                });
            } else {
                abstractC49022ugh.KWHzl.setEnabled(false);
                abstractC49022ugh.getRoot().setOnClickListener(null);
            }
            abstractC49022ugh.KWHzl.setChecked(abstractC48904ueV.isChecked());
        }

        public static final void copydefault(C43312rms c43312rms, C49257ulD c49257ulD, InterfaceC48901ueS interfaceC48901ueS, android.view.View view) {
            int adapterPosition = c43312rms.getAdapterPosition();
            InterfaceC48898ueP interfaceC48898ueP = c49257ulD.valueOf;
            if (interfaceC48898ueP != null) {
                android.view.View view2 = c43312rms.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                interfaceC48898ueP.OLrzqt(adapterPosition, interfaceC48901ueS, view2);
            }
            InterfaceC48969ufh<?, ?> interfaceC48969ufhGEmmrt = c49257ulD.gEmmrt();
            if (interfaceC48969ufhGEmmrt != null) {
                IShareParams iShareParamsRequireShareParams = interfaceC48969ufhGEmmrt.requireShareParams();
                C48992ugD.KWHzl.EZpvd(iShareParamsRequireShareParams.getTriggerSource(), iShareParamsRequireShareParams.getShareFrom(), java.lang.String.valueOf(((AbstractC48904ueV) interfaceC48901ueS).copydefault()), interfaceC48969ufhGEmmrt.isMultiShare() ? java.lang.Integer.valueOf(interfaceC48969ufhGEmmrt.requirePageIndex()) : null);
            }
        }
    }
}
