package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountConfig;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.AccountShow;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.vUP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vUU extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Function1<? super java.util.ArrayList<AccountType>, Unit> KWHzl;
    public C48349uOe valueOf;
    public java.util.ArrayList<AccountShow> AEQbTJ = new java.util.ArrayList<>();
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vUT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vUU.OLrzqt();
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vUU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final vUU KWHzl(@NotNull java.util.ArrayList<AccountShow> arrayList, @NotNull java.lang.String str, @NotNull Function1<? super java.util.ArrayList<AccountType>, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            vUU vuu = new vUU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("data", arrayList);
            bundle.putString("size", str);
            vuu.setArguments(bundle);
            vuu.KWHzl = function1;
            return vuu;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(false);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKDCKfqP));
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public static final C43316rmw OLrzqt() {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(AccountShow.class, new C50663vWt());
        return c43316rmw;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        OKRegularCell oKRegularCell;
        android.widget.ImageView imageView;
        OKRegularCell oKRegularCell2;
        android.widget.TextView textViewEZpvd;
        java.lang.String string;
        java.util.ArrayList<AccountShow> parcelableArrayList;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("data")) != null) {
            this.AEQbTJ = parcelableArrayList;
        }
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("size")) != null) {
            this.copydefault = string;
        }
        android.content.Context context = getContext();
        if (context != null) {
            C48349uOe c48349uOeAEQbTJ = C48349uOe.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
            this.valueOf = c48349uOeAEQbTJ;
            if (c48349uOeAEQbTJ != null && (oKRegularCell2 = c48349uOeAEQbTJ.EZpvd) != null && (textViewEZpvd = oKRegularCell2.EZpvd()) != null) {
                textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.giSNqX);
            }
            C48349uOe c48349uOe = this.valueOf;
            if (c48349uOe != null && (imageView = c48349uOe.KWHzl) != null) {
                imageView.setEnabled(false);
            }
            C48349uOe c48349uOe2 = this.valueOf;
            if (c48349uOe2 != null && (oKRegularCell = c48349uOe2.EZpvd) != null) {
                oKRegularCell.setDescription(this.copydefault);
            }
            C48349uOe c48349uOe3 = this.valueOf;
            if (c48349uOe3 != null && (recyclerView2 = c48349uOe3.copydefault) != null) {
                recyclerView2.setLayoutManager(C33047mpA.KWHzl(context));
            }
            C48349uOe c48349uOe4 = this.valueOf;
            if (c48349uOe4 != null && (recyclerView = c48349uOe4.copydefault) != null) {
                recyclerView.setAdapter(copydefault());
            }
            C33064mpR.OLrzqt(copydefault(), (java.util.List<? extends java.lang.Object>) this.AEQbTJ);
            C48349uOe c48349uOe5 = this.valueOf;
            if (c48349uOe5 == null || (textView = c48349uOe5.AEQbTJ) == null) {
                return;
            }
            textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vUU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vUU vuu) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = vuu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ vUU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vUU vuu) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = vuu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.copydefault.KWHzl;
                if (function1 != null) {
                    java.util.ArrayList arrayList = this.copydefault.AEQbTJ;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayList) {
                        if (((AccountShow) obj).getSelect()) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((AccountShow) it.next()).getId());
                    }
                    function1.invoke(new java.util.ArrayList(arrayList3));
                }
                this.copydefault.dismiss();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vUU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vUU vuu) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = vuu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                vUP.Application application = vUP.Companion;
                java.util.ArrayList<AccountShow> arrayList = this.copydefault.AEQbTJ;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (AccountShow accountShow : arrayList) {
                    arrayList2.add(new AccountConfig(accountShow.getId(), accountShow.getTitle(), accountShow.getAvailable(), accountShow.getSelect()));
                }
                application.copydefault(new java.util.ArrayList<>(arrayList2), this.copydefault.copydefault).show(this.copydefault.getParentFragmentManager(), vUP.class.getSimpleName());
                this.copydefault.dismiss();
            }
        }
    }
}
