package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.recurring.edit.model.RecurringFrequencyOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lQN extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public RecurringFrequencyOption KWHzl;
    public java.util.List<RecurringFrequencyOption> OLrzqt = yDY.AhwBna();
    public Function1<? super RecurringFrequencyOption, Unit> copydefault = new Function1() { // from class: o.lQO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return lQN.copydefault((RecurringFrequencyOption) obj);
        }
    };
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lQP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return lQN.AEQbTJ();
        }
    });

    public static final Unit copydefault(RecurringFrequencyOption recurringFrequencyOption) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        return Unit.INSTANCE;
    }

    public static final lQU AEQbTJ() {
        return new lQU();
    }

    public final lQU EZpvd() {
        return (lQU) this.AEQbTJ.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(8);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.OLrzqt.isEmpty() || this.copydefault == null) {
            dismissAllowingStateLoss();
        } else {
            EZpvd().register(RecurringFrequencyOption.class, new lQQ(this.KWHzl, new Function1() { // from class: o.lQT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lQN.KWHzl(this.OLrzqt, (RecurringFrequencyOption) obj);
                }
            }));
            mHT.submitList$default(EZpvd(), this.OLrzqt, null, 2, null);
        }
    }

    public static final Unit KWHzl(lQN lqn, RecurringFrequencyOption recurringFrequencyOption) {
        Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
        lqn.KWHzl(recurringFrequencyOption);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31490lux abstractC31490luxKWHzl = AbstractC31490lux.KWHzl(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(abstractC31490luxKWHzl, "");
        RecyclerView recyclerView = abstractC31490luxKWHzl.AEQbTJ;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(EZpvd());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addItemDecoration(new C57593ylO(recyclerView.getContext().getResources().getDimensionPixelSize(mDC.Activity.copydefault), false, false));
        abstractC31490luxKWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lQN.KWHzl(this.EZpvd, view);
            }
        });
        abstractC31490luxKWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lQN.OLrzqt(this.copydefault, view);
            }
        });
        constraintLayout.addView(abstractC31490luxKWHzl.getRoot(), -1, -2);
    }

    public static final void KWHzl(lQN lqn, android.view.View view) {
        lqn.KWHzl();
    }

    public static final void OLrzqt(lQN lqn, android.view.View view) {
        lqn.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.copydefault == null) {
            dismissAllowingStateLoss();
        }
    }

    public final void KWHzl() {
        Function1<? super RecurringFrequencyOption, Unit> function1;
        RecurringFrequencyOption recurringFrequencyOption = this.KWHzl;
        if (recurringFrequencyOption != null && (function1 = this.copydefault) != null) {
            function1.invoke(recurringFrequencyOption);
        }
        dismissAllowingStateLoss();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lQN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final lQN copydefault(@NotNull java.util.List<RecurringFrequencyOption> list, @NotNull RecurringFrequencyOption recurringFrequencyOption, @NotNull Function1<? super RecurringFrequencyOption, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(recurringFrequencyOption, "");
            Intrinsics.checkNotNullParameter(function1, "");
            lQN lqn = new lQN();
            lqn.OLrzqt = list;
            lqn.KWHzl = recurringFrequencyOption;
            lqn.copydefault = function1;
            return lqn;
        }
    }

    public final void KWHzl(RecurringFrequencyOption recurringFrequencyOption) {
        this.KWHzl = recurringFrequencyOption;
        java.util.List<RecurringFrequencyOption> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RecurringFrequencyOption recurringFrequencyOption2 : list) {
            arrayList.add(RecurringFrequencyOption.copy$default(recurringFrequencyOption2, null, null, null, null, Intrinsics.EZpvd(recurringFrequencyOption2, recurringFrequencyOption), 15, null));
        }
        this.OLrzqt = arrayList;
        mHT.submitList$default(EZpvd(), this.OLrzqt, null, 2, null);
    }
}
