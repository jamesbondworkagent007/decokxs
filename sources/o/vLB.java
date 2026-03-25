package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import com.okinc.unify_trade.bot.dcd.config.DcdProductSortCategory;
import com.okinc.unify_trade.bot.dcd.presenter.DcdProductListPresenter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC50353vLg;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vLB extends AbstractActivityC48163uHh<uYQ, DcdProductListPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public boolean OLrzqt = true;
    public final C59534zip EZpvd = new C59534zip();

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.GiPPlL;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vLB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull DcdProductListReq dcdProductListReq) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(dcdProductListReq, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) vLB.class);
            intent.putExtra("data", dcdProductListReq);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        OLrzqt();
        AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        EZpvd();
        this.EZpvd.register(ProductItemResp.class, new C50390vMq(new Function1() { // from class: o.vLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLB.copydefault(this.copydefault, (ProductItemResp) obj);
            }
        }));
        ((uYQ) sSMYrx()).AYXKKw.setLayoutManager(new LinearLayoutManager(this));
        ((uYQ) sSMYrx()).AYXKKw.setAdapter(this.EZpvd);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vLg.Application.open$default(o.vLg$Application, android.content.Context, com.okinc.unify_trade.biz.ProductItemResp, com.okinc.unify_trade.bot.data.DcdProductListReq, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vLB vlb, ProductItemResp productItemResp) {
        Intrinsics.checkNotNullParameter(productItemResp, "");
        ActivityC50353vLg.Application.open$default(ActivityC50353vLg.Companion, vlb, productItemResp, ((DcdProductListPresenter) vlb.gHZMYf()).EZpvd(), false, 8, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        for (final Map.Entry<DcdProductSortCategory, OKSortTextView> entry : copydefault().entrySet()) {
            entry.getValue().setOnClickListener(new View.OnClickListener() { // from class: o.vLC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vLB.KWHzl(this.EZpvd, entry, view);
                }
            });
            entry.getValue().setOnSortTypeChangeListener(new Function2() { // from class: o.vLA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return vLB.EZpvd(this.copydefault, entry, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
                }
            });
        }
    }

    public static final void KWHzl(vLB vlb, Map.Entry entry, android.view.View view) {
        vlb.OLrzqt((OKSortTextView) entry.getValue());
        OKSortTextView.setNextSortType$default((OKSortTextView) entry.getValue(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vLB vlb, Map.Entry entry, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        ((DcdProductListPresenter) vlb.gHZMYf()).KWHzl((DcdProductSortCategory) entry.getKey(), sortType);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(OKSortTextView oKSortTextView) {
        for (Map.Entry<DcdProductSortCategory, OKSortTextView> entry : copydefault().entrySet()) {
            if (Intrinsics.EZpvd(entry.getValue(), oKSortTextView)) {
                return;
            } else {
                entry.getValue().setSortType(OKSortTextView.SortType.NONE, false);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.Map<DcdProductSortCategory, OKSortTextView> copydefault() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(DcdProductSortCategory.STRIKE, ((uYQ) sSMYrx()).KWHzl), C56390yDp.OLrzqt(DcdProductSortCategory.TERM, ((uYQ) sSMYrx()).copydefault), C56390yDp.OLrzqt(DcdProductSortCategory.APR, ((uYQ) sSMYrx()).OLrzqt));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((DcdProductListPresenter) gHZMYf()).AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.vLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vLB.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    public static final Unit copydefault(vLB vlb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33064mpR.OLrzqt(vlb.EZpvd, (java.util.List<? extends java.lang.Object>) list);
        if (vlb.OLrzqt) {
            C55326xho.toastWithSuccessfulIcon$default(pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C48033uCm.Dialog.copydefault, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(list.size())))))), 0, 1, (java.lang.Object) null);
            vlb.OLrzqt = false;
        }
        rVN.reportFullyDrawn$default((android.app.Activity) vlb, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((DcdProductListPresenter) gHZMYf()).AEQbTJ((DcdProductListReq) getIntent().getParcelableExtra("data"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class);
        ((DcdProductListPresenter) gHZMYf()).KWHzl(oKComplianceRestrictionService.zsXlph(), oKComplianceRestrictionService.AuCTelauCTel());
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
