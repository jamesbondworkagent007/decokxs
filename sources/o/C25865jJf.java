package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C32113mPz;
import o.C52761wXj;
import o.pVX;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25865jJf extends AbstractC25866jJg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public C42656raY AYXKKw;
    public final InterfaceC5318Nc gEmmrt = new InterfaceC5318Nc() { // from class: o.jJn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5318Nc
        public final void copydefault(Date date, android.view.View view) {
            C25865jJf.copydefault(this.OLrzqt, date, view);
        }
    };
    public Date valueOf;

    /* JADX INFO: renamed from: o.jJf$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jJf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C25865jJf copydefault(long j, long j2, long j3) {
            C25865jJf c25865jJf = new C25865jJf();
            android.os.Bundle bundleCopydefault = C6779aVn.copydefault(c25865jJf);
            bundleCopydefault.putLong("key.from_date", j);
            bundleCopydefault.putLong("key.end_date", j2);
            bundleCopydefault.putLong("key.current_date", j3);
            return c25865jJf;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        C55118xds root;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        C54946xaf binding = getBinding();
        if (binding == null || (root = binding.getRoot()) == null) {
            return;
        }
        root.setBackgroundColor(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        Calendar calendar = Calendar.getInstance();
        android.os.Bundle arguments = getArguments();
        calendar.setTimeInMillis(arguments != null ? arguments.getLong("key.from_date") : 0L);
        Calendar calendar2 = Calendar.getInstance();
        android.os.Bundle arguments2 = getArguments();
        calendar2.setTimeInMillis(arguments2 != null ? arguments2.getLong("key.end_date") : 0L);
        Calendar calendar3 = Calendar.getInstance();
        android.os.Bundle arguments3 = getArguments();
        calendar3.setTimeInMillis(arguments3 != null ? arguments3.getLong("key.current_date") : 0L);
        if (calendar.getTimeInMillis() > calendar2.getTimeInMillis()) {
            dismiss();
            return;
        }
        C42656raY c42656raYAEQbTJ = C42656raY.AEQbTJ(getCustomLayoutInflater(), constraintLayout);
        Intrinsics.copydefault(c42656raYAEQbTJ);
        Intrinsics.copydefault(calendar);
        Intrinsics.copydefault(calendar2);
        Intrinsics.copydefault(calendar3);
        EZpvd(c42656raYAEQbTJ, calendar, calendar2, calendar3);
        c42656raYAEQbTJ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jJk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25865jJf.AEQbTJ(this.OLrzqt, view);
            }
        });
        this.AYXKKw = c42656raYAEQbTJ;
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C25865jJf c25865jJf, android.view.View view) {
        Date date = c25865jJf.valueOf;
        if (date != null) {
            FragmentKt.setFragmentResult(c25865jJf, "request_key.month_picker", BundleKt.bundleOf(C56390yDp.OLrzqt("key.select_date", java.lang.Long.valueOf(date.getTime()))));
        }
        c25865jJf.dismiss();
    }

    public static final void copydefault(C25865jJf c25865jJf, Date date, android.view.View view) {
        pUU.EZpvd("CalendarMonthPickerDialogFragment", "onTimeSelect: " + date);
        c25865jJf.valueOf = date;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [T, o.Nj, o.Nk] */
    public final void EZpvd(C42656raY c42656raY, Calendar calendar, Calendar calendar2, Calendar calendar3) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? EZpvd = new MZ(getContext(), this.gEmmrt).AEQbTJ(pVX.Application.djBIcL, new MY() { // from class: o.jJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view) {
                C25865jJf.copydefault(this.KWHzl, view);
            }
        }).KWHzl(new boolean[]{true, true, false, false, false, false}).KWHzl(20).copydefault(calendar2).KWHzl(calendar, calendar2).copydefault(calendar3).AEQbTJ(c42656raY.copydefault).EZpvd(0).OLrzqt(0).EZpvd(false).copydefault(2.5f).AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)).AYXKKw(C33070mpX.copydefault(C32113mPz.ActionBar.getFieldNames)).copydefault(7).KWHzl(false).copydefault(new InterfaceC5319Nd() { // from class: o.jJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                C25865jJf.OLrzqt(objectRef, date);
            }
        }).EZpvd();
        objectRef.element = EZpvd;
        if (EZpvd != 0) {
            EZpvd.OLrzqt(false);
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = (ViewOnClickListenerC5326Nk) objectRef.element;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.AEQbTJ(c42656raY.copydefault, false);
        }
    }

    public static final void copydefault(C25865jJf c25865jJf, android.view.View view) {
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            c25865jJf.copydefault(viewGroup);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(Ref.ObjectRef objectRef, Date date) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = (ViewOnClickListenerC5326Nk) objectRef.element;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.fetchVPNInfo();
        }
    }

    public final void copydefault(android.view.ViewGroup viewGroup) {
        android.view.View view = new android.view.View(viewGroup.getContext());
        view.setBackgroundResource(qZH.Activity.fARcdN);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C55298xhM.dp$default(50, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams.gravity = 16;
        layoutParams.setMarginStart((int) C55298xhM.dp$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
        layoutParams.setMarginEnd(layoutParams.getMarginStart());
        viewGroup.addView(view, 0, layoutParams);
        viewGroup.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.GhqvEQ));
    }
}
