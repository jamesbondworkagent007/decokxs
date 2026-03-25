package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C50654vWk extends AbstractC52796wYr {
    public Function1<? super java.lang.Integer, Unit> KWHzl;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final java.lang.String EZpvd = "RecurringCycleStep1Sheet";

    /* JADX INFO: renamed from: o.vWk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vWk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(false);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.atDTRm));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.AbstractC52796wYr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.ArrayList<java.lang.String> arrayList;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getStringArrayList("select_times_key")) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        AEQbTJ(arrayList);
    }

    public final void AEQbTJ(java.util.ArrayList<java.lang.String> arrayList) {
        android.content.Context context = getContext();
        if (context != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayList.size();
            for (final int i = 0; i < size; i++) {
                C55377xim c55377xim = new C55377xim(context, null, 2, null);
                c55377xim.setOKDSSize(-5);
                if (i == 0) {
                    C55258xgZ c55258xgZAhwBna = c55377xim.AhwBna();
                    android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(requireActivity());
                    int i2 = C48033uCm.Activity.zLAIeZ;
                    C55312xha c55312xhaValueOf = c55377xim.AhwBna().valueOf();
                    c55258xgZAhwBna.setAttachingView(layoutInflaterFrom.inflate(i2, (android.view.ViewGroup) (c55312xhaValueOf != null ? c55312xhaValueOf.EZpvd() : null), false));
                }
                c55377xim.setTitleText(arrayList.get(i));
                c55377xim.setClickCallback(new Function0() { // from class: o.vWm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50654vWk.AEQbTJ(this.OLrzqt, i);
                    }
                });
                arrayList2.add(c55377xim);
            }
            EZpvd(arrayList2);
        }
    }

    public static final Unit AEQbTJ(C50654vWk c50654vWk, int i) {
        Function1<? super java.lang.Integer, Unit> function1 = c50654vWk.KWHzl;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
        c50654vWk.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vWk$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C50654vWk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50654vWk c50654vWk) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c50654vWk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
