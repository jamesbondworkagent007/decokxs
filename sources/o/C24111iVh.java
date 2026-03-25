package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24111iVh extends iTL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final boolean EZpvd;
    public iVW KWHzl;
    public final boolean OLrzqt;
    public AbstractC23837iLd gEmmrt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.iVi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C24111iVh.KWHzl(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.iVl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(C24111iVh.copydefault(this.copydefault));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(iVW ivw) {
        this.KWHzl = ivw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iVW KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.iVh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C24111iVh AEQbTJ(long j, int i, java.util.ArrayList<InvestValidatorListItems> arrayList) {
            C24111iVh c24111iVh = new C24111iVh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("validatorDetails", arrayList);
            bundle.putLong("oldInvestmentId", j);
            bundle.putInt("type_invest", i);
            c24111iVh.setArguments(bundle);
            return c24111iVh;
        }
    }

    private final int copydefault() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int KWHzl(C24111iVh c24111iVh) {
        android.os.Bundle arguments = c24111iVh.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final long OLrzqt() {
        return ((java.lang.Number) this.valueOf.getValue()).longValue();
    }

    public static final long copydefault(C24111iVh c24111iVh) {
        android.os.Bundle arguments = c24111iVh.getArguments();
        if (arguments != null) {
            return arguments.getLong("oldInvestmentId");
        }
        return 0L;
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC23837iLd abstractC23837iLd = null;
        AbstractC23837iLd abstractC23837iLd2 = (AbstractC23837iLd) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.gtCCJH, null, false);
        this.gEmmrt = abstractC23837iLd2;
        if (abstractC23837iLd2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23837iLd = abstractC23837iLd2;
        }
        return abstractC23837iLd.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC23837iLd abstractC23837iLd = this.gEmmrt;
        AbstractC23837iLd abstractC23837iLd2 = null;
        if (abstractC23837iLd == null) {
            Intrinsics.gEmmrt("");
            abstractC23837iLd = null;
        }
        abstractC23837iLd.KWHzl.setLayoutManager(new LinearLayoutManager(requireActivity()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle arguments = getArguments();
        java.util.ArrayList<InvestValidatorListItems> parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("validatorDetails") : null;
        if (parcelableArrayList != null) {
            for (InvestValidatorListItems investValidatorListItems : parcelableArrayList) {
                java.lang.Long investmentId = investValidatorListItems.getInvestmentId();
                arrayList.add(new C24109iVf(investmentId != null ? java.lang.Long.valueOf(investmentId.longValue()) : null, investValidatorListItems.getValidatorName(), investValidatorListItems.getStakedAmount(), null, investValidatorListItems.getTvl(), investValidatorListItems.getRate(), investValidatorListItems.getTokenSymbol(), 8, null));
            }
        }
        if (copydefault() == 1) {
            AbstractC23837iLd abstractC23837iLd3 = this.gEmmrt;
            if (abstractC23837iLd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23837iLd3 = null;
            }
            abstractC23837iLd3.KWHzl.setAdapter(new iST(OLrzqt(), arrayList, new ActionBar()));
        } else {
            AbstractC23837iLd abstractC23837iLd4 = this.gEmmrt;
            if (abstractC23837iLd4 == null) {
                Intrinsics.gEmmrt("");
                abstractC23837iLd4 = null;
            }
            abstractC23837iLd4.KWHzl.setAdapter(new iSK(OLrzqt(), arrayList, new Activity()));
        }
        AbstractC23837iLd abstractC23837iLd5 = this.gEmmrt;
        if (abstractC23837iLd5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23837iLd2 = abstractC23837iLd5;
        }
        abstractC23837iLd2.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.iVj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C24111iVh.OLrzqt(this.EZpvd, view2);
            }
        });
    }

    /* JADX INFO: renamed from: o.iVh$ActionBar */
    public static final class ActionBar implements iSW {
        public ActionBar() {
        }

        @Override // o.iSW
        public void KWHzl(C24109iVf c24109iVf) {
            Intrinsics.checkNotNullParameter(c24109iVf, "");
            iVW ivwKWHzl = C24111iVh.this.KWHzl();
            if (ivwKWHzl != null) {
                ivwKWHzl.OLrzqt(c24109iVf.copydefault());
            }
            C24111iVh.this.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.iVh$Activity */
    public static final class Activity implements iSN {
        public Activity() {
        }

        @Override // o.iSN
        public void KWHzl(C24109iVf c24109iVf) {
            Intrinsics.checkNotNullParameter(c24109iVf, "");
            iVW ivwKWHzl = C24111iVh.this.KWHzl();
            if (ivwKWHzl != null) {
                ivwKWHzl.OLrzqt(c24109iVf.copydefault());
            }
            C24111iVh.this.dismissAllowingStateLoss();
        }
    }

    public static final void OLrzqt(C24111iVh c24111iVh, android.view.View view) {
        c24111iVh.dismissAllowingStateLoss();
    }
}
