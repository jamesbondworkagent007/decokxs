package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9925bel extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public boolean EZpvd;
    public DialogC55112xdm KWHzl;
    public C16530elf djBIcL;
    public final C59534zip copydefault = new C59534zip();
    public java.util.ArrayList<java.lang.Long> AEQbTJ = new java.util.ArrayList<>();
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bek
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C9925bel.AEQbTJ(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.bel$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C9925bel copydefault(@NotNull java.util.ArrayList<java.lang.Long> arrayList, boolean z) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C9925bel c9925bel = new C9925bel();
            c9925bel.AEQbTJ = arrayList;
            c9925bel.EZpvd = z;
            return c9925bel;
        }
    }

    /* JADX INFO: renamed from: o.bel$Application */
    public static final class Application implements WalletUpdateWorker.TaskDescription {
        public Application() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            java.lang.String string = C9925bel.this.getString(C13754dXa.FragmentManager.AlertControllerAlertParams);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
            DialogC55112xdm dialogC55112xdm = C9925bel.this.KWHzl;
            if (dialogC55112xdm != null) {
                dialogC55112xdm.dismiss();
            }
            C9925bel.this.dismissAllowingStateLoss();
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            java.lang.String string = C9925bel.this.getString(C13754dXa.FragmentManager.addCallbackdefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    public final Application OLrzqt() {
        return (Application) this.valueOf.getValue();
    }

    public static final Application AEQbTJ(C9925bel c9925bel) {
        return c9925bel.new Application();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16530elf c16530elfKWHzl = C16530elf.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        this.djBIcL = c16530elfKWHzl;
        C16530elf c16530elf = null;
        if (c16530elfKWHzl == null) {
            Intrinsics.gEmmrt("");
            c16530elfKWHzl = null;
        }
        c16530elfKWHzl.KWHzl.setShouldStackIcons(true);
        C16530elf c16530elf2 = this.djBIcL;
        if (c16530elf2 == null) {
            Intrinsics.gEmmrt("");
            c16530elf2 = null;
        }
        c16530elf2.AhwBna.setLayoutManager(new LinearLayoutManager(getContext()));
        this.copydefault.register(C9983bfq.class, new C10053bhG());
        C16530elf c16530elf3 = this.djBIcL;
        if (c16530elf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16530elf = c16530elf3;
        }
        c16530elf.AhwBna.setAdapter(this.copydefault);
        KWHzl();
        AEQbTJ();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.bej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C9925bel.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(C9925bel c9925bel) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c9925bel, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.AEQbTJ.size());
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String str = C38303pTu.KWHzl(locale) ? "、" : ", ";
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(((java.lang.Number) it.next()).longValue());
            if (c10854bwMCopydefault != null) {
                arrayList.add(C18388fhU.AEQbTJ(c10854bwMCopydefault));
                sb.append(c10854bwMCopydefault.djBIcL());
                sb.append(str);
            }
        }
        if (!arrayList.isEmpty()) {
            sb.delete(sb.length() - str.length(), sb.length());
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            C16530elf c16530elf = this.djBIcL;
            C16530elf c16530elf2 = null;
            if (c16530elf == null) {
                Intrinsics.gEmmrt("");
                c16530elf = null;
            }
            c14726dqr.KWHzl(c16530elf.KWHzl, arrayList, 72, 3, 1.0f, 72.0f, 2);
            int size = arrayList.size();
            if (size == 1) {
                C16530elf c16530elf3 = this.djBIcL;
                if (c16530elf3 == null) {
                    Intrinsics.gEmmrt("");
                    c16530elf3 = null;
                }
                c16530elf3.AYXKKw.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.AnimatorRes, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", sb.toString()))));
                C16530elf c16530elf4 = this.djBIcL;
                if (c16530elf4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16530elf2 = c16530elf4;
                }
                c16530elf2.djBIcL.setText("");
            } else {
                C16530elf c16530elf5 = this.djBIcL;
                if (c16530elf5 == null) {
                    Intrinsics.gEmmrt("");
                    c16530elf5 = null;
                }
                c16530elf5.AYXKKw.setText(C33069mpW.copydefault(this, C13754dXa.FragmentManager.ActivityResultContractsTakePicturePreview, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size)))));
                C16530elf c16530elf6 = this.djBIcL;
                if (c16530elf6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16530elf2 = c16530elf6;
                }
                c16530elf2.djBIcL.setText(sb.toString());
            }
            C9983bfq[] c9983bfqArr = new C9983bfq[3];
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.QOLQEE);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherOnBackPressedCancellable);
            if (size == 1) {
                strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.ActivityResultContractsPickMultipleVisualMediaCompanion, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", sb.toString())));
            } else {
                strCopydefault = C33069mpW.copydefault(this, C13754dXa.FragmentManager.getSystemFallbackPickeractivity_release, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size))));
            }
            c9983bfqArr[0] = new C9983bfq(drawableKWHzl, strAYXKKw, strCopydefault);
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.HJWChPdNQGVJ);
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcherLifecycleOnBackPressedCancellable);
            if (size == 1) {
                strCopydefault2 = C33069mpW.copydefault(this, C13754dXa.FragmentManager.isSystemFallbackPickerAvailableactivity_release, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", sb.toString())));
            } else {
                strCopydefault2 = C33069mpW.copydefault(this, C13754dXa.FragmentManager.isPhotoPickerAvailable, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size))));
            }
            c9983bfqArr[1] = new C9983bfq(drawableKWHzl2, strAYXKKw2, strCopydefault2);
            c9983bfqArr[2] = new C9983bfq(C33070mpX.KWHzl(C52761wXj.TaskDescription.DRuYWY), C33070mpX.AYXKKw(C13754dXa.FragmentManager.onBackInvoked), C33070mpX.AYXKKw(C13754dXa.FragmentManager.createOnBackInvokedCallbacklambda0));
            C33064mpR.OLrzqt(this.copydefault, yDY.copydefault(c9983bfqArr));
        }
    }

    public final void AEQbTJ() {
        C16530elf c16530elf = null;
        if (this.EZpvd) {
            C16530elf c16530elf2 = this.djBIcL;
            if (c16530elf2 == null) {
                Intrinsics.gEmmrt("");
                c16530elf2 = null;
            }
            android.content.Context context = c16530elf2.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl = new DialogC55112xdm(context, C13754dXa.LoaderManager.isConnected);
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(OLrzqt());
            C16530elf c16530elf3 = this.djBIcL;
            if (c16530elf3 == null) {
                Intrinsics.gEmmrt("");
                c16530elf3 = null;
            }
            c16530elf3.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.createOnBackInvokedCallback));
            C16530elf c16530elf4 = this.djBIcL;
            if (c16530elf4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16530elf = c16530elf4;
            }
            C52794wYp c52794wYp = c16530elf.EZpvd;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            return;
        }
        C16530elf c16530elf5 = this.djBIcL;
        if (c16530elf5 == null) {
            Intrinsics.gEmmrt("");
            c16530elf5 = null;
        }
        c16530elf5.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO));
        C16530elf c16530elf6 = this.djBIcL;
        if (c16530elf6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16530elf = c16530elf6;
        }
        C52794wYp c52794wYp2 = c16530elf.EZpvd;
        c52794wYp2.setOnClickListener(new ActionBar(c52794wYp2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.bel$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C9925bel KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C9925bel c9925bel) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c9925bel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.bel$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C9925bel AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C9925bel c9925bel) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c9925bel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                new C14461dlr(childFragmentManager, "completeAddress-chainUpgradeDialog", this.AEQbTJ.new StateListAnimator(), null, null, false, 48, null).EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.bel$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        public final void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            DialogC55112xdm dialogC55112xdm = C9925bel.this.KWHzl;
            if (dialogC55112xdm != null) {
                dialogC55112xdm.show();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            AEQbTJ(str);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.EZpvd) {
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(OLrzqt());
        }
    }

    public final void AEQbTJ(@NotNull java.util.ArrayList<java.lang.Long> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (!this.EZpvd) {
            this.EZpvd = z;
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((java.lang.Number) it.next()).longValue();
            if (!this.AEQbTJ.contains(java.lang.Long.valueOf(jLongValue))) {
                this.AEQbTJ.add(java.lang.Long.valueOf(jLongValue));
            }
        }
        KWHzl();
        AEQbTJ();
    }
}
