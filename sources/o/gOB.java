package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.trade.common.expire.fragment.BaseExpireTimeListDialogFragment$initView$1$3;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.gOB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gOB extends C23404hxb {
    public hDE copydefault;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gOA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gOB.KWHzl(this.copydefault);
        }
    });
    public final C43316rmw EZpvd = new C43316rmw();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Possible override for method o.hxb.EZpvd()V */
    public abstract gOM EZpvd();

    public abstract void EZpvd(Calendar calendar);

    public abstract gOJ KWHzl();

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String KWHzl(gOB gob) {
        android.os.Bundle arguments = gob.getArguments();
        if (arguments != null) {
            return arguments.getString("id");
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.QfgJNx));
        C25352ivB.setOnDoubleCheckClickListener$default(wxq.KWHzl(), 0L, new Function1() { // from class: o.gOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gOB.AEQbTJ(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        wxq.KWHzl().setContentDescription("closeButton");
    }

    public static final Unit AEQbTJ(gOB gob, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        gob.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = hDE.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        djBIcL();
        copydefault();
        AEQbTJ();
        AYXKKw();
    }

    private final void copydefault() {
        wYF wyf;
        hDE hde = this.copydefault;
        if (hde == null || (wyf = hde.copydefault) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf, 0L, new Function1() { // from class: o.gOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gOB.copydefault(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(gOB gob, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        gob.KWHzl().KWHzl().postValue(ExpireTimeData.Companion.OLrzqt());
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        hDE hde = this.copydefault;
        if (hde != null) {
            wYF wyf = hde.copydefault;
            wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.DDxOgT));
            wyf.setOKDSSize(52);
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(260);
            }
            hde.OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
            this.EZpvd.register(ExpireTimeConfig.class, new ActionBar(BaseExpireTimeListDialogFragment$initView$1$3.INSTANCE));
            hde.OLrzqt.setAdapter(this.EZpvd);
        }
    }

    public static final class ActionBar extends AbstractC25436iwg<ExpireTimeConfig, hDF> {
        public ActionBar(BaseExpireTimeListDialogFragment$initView$1$3 baseExpireTimeListDialogFragment$initView$1$3) {
            super(baseExpireTimeListDialogFragment$initView$1$3);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C25435iwf<hDF> c25435iwf, final ExpireTimeConfig expireTimeConfig) {
            Intrinsics.checkNotNullParameter(c25435iwf, "");
            Intrinsics.checkNotNullParameter(expireTimeConfig, "");
            ViewBinding viewBindingEZpvd = c25435iwf.EZpvd();
            final gOB gob = gOB.this;
            final hDF hdf = (hDF) viewBindingEZpvd;
            hdf.getRoot().setContentDescription("web3_dex_copytrading_expire_" + c25435iwf.getBindingAdapterPosition());
            hdf.KWHzl.setTitle(expireTimeConfig.getText());
            hdf.AEQbTJ.setVisibility(Intrinsics.EZpvd((java.lang.Object) expireTimeConfig.getId(), (java.lang.Object) gob.OLrzqt()) ? 0 : 8);
            C25352ivB.setOnDoubleCheckClickListener$default(hdf.getRoot(), 0L, new Function1() { // from class: o.gOG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gOB.ActionBar.AEQbTJ(c25435iwf, expireTimeConfig, gob, hdf, (android.view.View) obj);
                }
            }, 1, null);
        }

        public static final Unit AEQbTJ(C25435iwf c25435iwf, ExpireTimeConfig expireTimeConfig, gOB gob, hDF hdf, android.view.View view) {
            android.widget.LinearLayout root;
            Intrinsics.checkNotNullParameter(view, "");
            OKRegularCell oKRegularCell = ((hDF) c25435iwf.EZpvd()).KWHzl;
            int height = 0;
            if (!Intrinsics.EZpvd((java.lang.Object) expireTimeConfig.getId(), (java.lang.Object) "custom")) {
                hdf.AEQbTJ.setVisibility(0);
            }
            if (Intrinsics.EZpvd((java.lang.Object) expireTimeConfig.getId(), (java.lang.Object) "custom")) {
                MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> mutableLiveDataAEQbTJ = gob.KWHzl().AEQbTJ();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                hDE hde = gob.copydefault;
                if (hde != null && (root = hde.getRoot()) != null) {
                    height = root.getHeight();
                }
                mutableLiveDataAEQbTJ.postValue(C56390yDp.OLrzqt(bool, java.lang.Integer.valueOf(height)));
            } else {
                gob.EZpvd((Calendar) null);
                gob.KWHzl().KWHzl().postValue(new ExpireTimeData(expireTimeConfig.getId(), null, expireTimeConfig.getText(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    private final void AEQbTJ() {
        final hDE hde = this.copydefault;
        if (hde != null) {
            EZpvd().KWHzl().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gOF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gOB.OLrzqt(hde, this, (kotlin.Pair) obj);
                }
            }));
        }
    }

    public static final Unit OLrzqt(hDE hde, gOB gob, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            hde.KWHzl.setVisibility(8);
            hde.OLrzqt.setVisibility(0);
            gob.EZpvd.setItems((java.util.List) pair.getSecond());
            gob.EZpvd.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gob, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            gob.valueOf();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gob, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        EZpvd().copydefault();
    }

    private final void valueOf() {
        hDE hde = this.copydefault;
        if (hde != null) {
            hde.KWHzl.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            hde.KWHzl.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
            hde.KWHzl.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            hde.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.gOI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    gOB.gEmmrt(this.KWHzl, view);
                }
            });
            hde.KWHzl.setEmptyTypeImage(2);
            hde.OLrzqt.setVisibility(8);
            hde.KWHzl.setVisibility(0);
        }
    }

    public static final void gEmmrt(gOB gob, android.view.View view) {
        gob.AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KWHzl().KWHzl().postValue(ExpireTimeData.Companion.OLrzqt());
        this.copydefault = null;
    }
}
