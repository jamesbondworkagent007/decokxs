package o;

import android.animation.ValueAnimator;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import o.AbstractC27165jpz;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iTb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractActivityC24051iTb<T extends AbstractC27165jpz> extends AbstractActivityC33013moT implements InterfaceC23612iCv {
    public iGP EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iTr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC24051iTb.AYXKKw(this.EZpvd);
        }
    });
    public final Observer<InvestTransactionModel> OLrzqt = new Observer() { // from class: o.iTq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractActivityC24051iTb.AEQbTJ(this.EZpvd, (InvestTransactionModel) obj);
        }
    };
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.iTn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC24051iTb.gEmmrt();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iTo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC24051iTb.OLrzqt();
        }
    });

    /* JADX INFO: renamed from: o.iTb$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public abstract void AhwBna();

    public abstract java.lang.Class<T> AkhnZx();

    public abstract void OLrzqt(android.os.Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull iGP igp) {
        Intrinsics.checkNotNullParameter(igp, "");
        this.EZpvd = igp;
    }

    public void OLrzqt(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull InvestTransactionModel investTransactionModel) {
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
    }

    public abstract boolean djBIcL();

    public void ejfBZ() {
    }

    public void fetchVPNInfo() {
    }

    public abstract void isConnected();

    public abstract C27206jqn valueOf();

    public abstract int values();

    public AbstractActivityC24051iTb() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(C23611iCu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new TaskDescription("invest-tx-status-toast", ActionBar.EZpvd), new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.base.BaseInvestPlaceOrderActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final iGP AYXKKw() {
        iGP igp = this.EZpvd;
        if (igp != null) {
            return igp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final T DbNXlk() {
        return (T) this.AhwBna.getValue();
    }

    public static final AbstractC27165jpz AYXKKw(AbstractActivityC24051iTb abstractActivityC24051iTb) {
        return (AbstractC27165jpz) new ViewModelProvider(abstractActivityC24051iTb).get(abstractActivityC24051iTb.AkhnZx());
    }

    private final C23611iCu<InvestTransactionModel> fARcdN() {
        return (C23611iCu) this.KWHzl.getValue();
    }

    public static final void AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, InvestTransactionModel investTransactionModel) {
        Intrinsics.checkNotNullParameter(investTransactionModel, "");
        abstractActivityC24051iTb.copydefault(investTransactionModel);
    }

    private final android.animation.ValueAnimator fJNWhG() {
        return (android.animation.ValueAnimator) this.AEQbTJ.getValue();
    }

    public static final android.animation.ValueAnimator gEmmrt() {
        return android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
    }

    public static final android.animation.ValueAnimator OLrzqt() {
        return android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
    }

    private final android.animation.ValueAnimator fIwbmz() {
        return (android.animation.ValueAnimator) this.copydefault.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt(iGP.EZpvd(getLayoutInflater()));
        setContentView(AYXKKw().getRoot());
        iwGUEr();
        OLrzqt(bundle);
        isConnected();
        hDKMBd();
        AhwBna();
        getNewProxyInstance();
        getFieldNames();
        fARcdN().KWHzl().observeForever(this.OLrzqt);
    }

    /* JADX INFO: renamed from: o.iTb$ActionBar */
    public static final class ActionBar implements Function1<java.lang.String, InvestTransactionModel> {
        public static final ActionBar EZpvd = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final InvestTransactionModel invoke(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InvestTransactionModel.Companion.serializer(), str);
        }
    }

    /* JADX INFO: renamed from: o.iTb$TaskDescription */
    public static final class TaskDescription implements Function0<java.lang.Object> {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str, Function1 function1) {
            this.KWHzl = str;
            this.copydefault = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r0v0, types: [o.iTb$TaskDescription$2] */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass2 invoke() {
            final java.lang.String str = this.KWHzl;
            final Function1 function1 = this.copydefault;
            return new ViewModelProvider.Factory() { // from class: o.iTb.TaskDescription.2
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(java.lang.Class<T> cls) {
                    Intrinsics.checkNotNullParameter(cls, "");
                    return (T) new C23611iCu(str, function1);
                }
            };
        }
    }

    public final void AuCTel() {
        AYXKKw().values.AhwBna(false);
        AYXKKw().values.djBIcL(false);
        AYXKKw().values.OLrzqt(new InterfaceC57903yrG() { // from class: o.iTj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                AbstractActivityC24051iTb.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        abstractActivityC24051iTb.ejfBZ();
    }

    private final void iwGUEr() {
        AuCTel();
        boolean zDjBIcL = djBIcL();
        android.widget.LinearLayout linearLayout = AYXKKw().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        boolean z = !zDjBIcL;
        linearLayout.setVisibility(z ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = AYXKKw().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(z ? 0 : 8);
        android.widget.LinearLayout linearLayout3 = AYXKKw().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(zDjBIcL ? 0 : 8);
        android.widget.LinearLayout linearLayout4 = AYXKKw().AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
        linearLayout4.setVisibility(zDjBIcL ? 0 : 8);
    }

    private final void getFieldNames() {
        AYXKKw().copydefault.setRetryClick(new Function0() { // from class: o.iTe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC24051iTb.OLrzqt(this.OLrzqt);
            }
        });
        fJNWhG().setInterpolator(new android.view.animation.LinearInterpolator());
        fJNWhG().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                AbstractActivityC24051iTb.copydefault(this.copydefault, valueAnimator);
            }
        });
        fIwbmz().setInterpolator(new android.view.animation.LinearInterpolator());
        fIwbmz().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.iTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                AbstractActivityC24051iTb.AEQbTJ(this.KWHzl, valueAnimator);
            }
        });
        C27137jpX c27137jpX = AYXKKw().copydefault;
        c27137jpX.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY));
        c27137jpX.setSubTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AxsJAYsNCnLh));
        c27137jpX.setButtonText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.AwvSrB));
        valueOf().setSlippageClickListener(new Function0() { // from class: o.iTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC24051iTb.KWHzl(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(AbstractActivityC24051iTb abstractActivityC24051iTb) {
        abstractActivityC24051iTb.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final void copydefault(AbstractActivityC24051iTb abstractActivityC24051iTb, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.widget.LinearLayout linearLayout = abstractActivityC24051iTb.AYXKKw().DbNXlk;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        linearLayout.setAlpha(((java.lang.Float) animatedValue).floatValue());
        android.widget.LinearLayout linearLayout2 = abstractActivityC24051iTb.AYXKKw().AYXKKw;
        java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        linearLayout2.setAlpha(((java.lang.Float) animatedValue2).floatValue());
        android.widget.LinearLayout linearLayout3 = abstractActivityC24051iTb.AYXKKw().AhwBna;
        java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        linearLayout3.setAlpha(1.0f - ((java.lang.Float) animatedValue3).floatValue());
        android.widget.LinearLayout linearLayout4 = abstractActivityC24051iTb.AYXKKw().gEmmrt;
        java.lang.Object animatedValue4 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue4, "");
        linearLayout4.setAlpha(1.0f - ((java.lang.Float) animatedValue4).floatValue());
        java.lang.Object animatedValue5 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue5, "");
        if (((java.lang.Float) animatedValue5).floatValue() == 1.0f) {
            abstractActivityC24051iTb.AYXKKw().gEmmrt.setVisibility(8);
            abstractActivityC24051iTb.AYXKKw().AhwBna.setVisibility(8);
        }
    }

    public static final void AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        android.widget.LinearLayout linearLayout = abstractActivityC24051iTb.AYXKKw().DbNXlk;
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        linearLayout.setAlpha(((java.lang.Float) animatedValue).floatValue());
        android.widget.LinearLayout linearLayout2 = abstractActivityC24051iTb.AYXKKw().AYXKKw;
        java.lang.Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue2, "");
        linearLayout2.setAlpha(((java.lang.Float) animatedValue2).floatValue());
        java.lang.Object animatedValue3 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue3, "");
        if (((java.lang.Float) animatedValue3).floatValue() == 0.0f) {
            abstractActivityC24051iTb.AYXKKw().DbNXlk.setVisibility(8);
            abstractActivityC24051iTb.AYXKKw().AYXKKw.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout3 = abstractActivityC24051iTb.AYXKKw().gEmmrt;
        java.lang.Object animatedValue4 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue4, "");
        linearLayout3.setAlpha(1.0f - ((java.lang.Float) animatedValue4).floatValue());
        android.widget.LinearLayout linearLayout4 = abstractActivityC24051iTb.AYXKKw().AhwBna;
        java.lang.Object animatedValue5 = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue5, "");
        linearLayout4.setAlpha(1.0f - ((java.lang.Float) animatedValue5).floatValue());
    }

    public static final Unit KWHzl(AbstractActivityC24051iTb abstractActivityC24051iTb) {
        C23978iQj.Companion.AEQbTJ(abstractActivityC24051iTb.values()).show(abstractActivityC24051iTb.getSupportFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        DbNXlk().QOLQEE().observe(this, new Observer() { // from class: o.iTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractActivityC24051iTb.copydefault(this.KWHzl, (ResponseState) obj);
            }
        });
        DbNXlk().gHZMYf().observe(this, new Activity(new Function1() { // from class: o.iTd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC24051iTb.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().QfsBiF().observe(this, new Activity(new Function1() { // from class: o.iTf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC24051iTb.AEQbTJ(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().copydefault().observe(this, new Activity(new Function1() { // from class: o.iTg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC24051iTb.AEQbTJ(this.copydefault, (InvestConsumeData) obj);
            }
        }));
        DbNXlk().AwvSrB().observe(this, new Activity(new Function1() { // from class: o.iTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC24051iTb.AEQbTJ(this.OLrzqt, (C23953iPl) obj);
            }
        }));
        DbNXlk().ORxRYg().observe(this, new Activity(new Function1() { // from class: o.iTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC24051iTb.AEQbTJ(this.OLrzqt, (C23963iPv) obj);
            }
        }));
    }

    public static final void copydefault(AbstractActivityC24051iTb abstractActivityC24051iTb, ResponseState responseState) {
        if (responseState.getErrorType() == ResponseStateType.NET_ERRO) {
            C57604ylZ.show$default(C57604ylZ.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        } else if (responseState.getErrorType() == ResponseStateType.SERVER_ERRRO) {
            java.lang.String errorMsg = responseState.getErrorMsg();
            if (errorMsg == null || errorMsg.length() == 0) {
                C57604ylZ.show$default(C57604ylZ.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            } else {
                C57604ylZ.show$default(C57604ylZ.OLrzqt, responseState.getErrorMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            }
        }
        rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC24051iTb, false, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(AbstractActivityC24051iTb abstractActivityC24051iTb, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            abstractActivityC24051iTb.showLoading();
        } else {
            abstractActivityC24051iTb.dismissLoading();
            rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC24051iTb, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, java.lang.Boolean bool) {
        if (!bool.booleanValue()) {
            abstractActivityC24051iTb.AYXKKw().values.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, InvestConsumeData investConsumeData) {
        if (!((java.lang.Boolean) investConsumeData.getData()).booleanValue()) {
            abstractActivityC24051iTb.valueOf().setSlippageText(abstractActivityC24051iTb.DbNXlk().QKVWgx());
            abstractActivityC24051iTb.DbNXlk().hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, C23953iPl c23953iPl) {
        abstractActivityC24051iTb.valueOf().AEQbTJ(c23953iPl.AYXKKw(), c23953iPl.AhwBna(), c23953iPl.AEQbTJ(), c23953iPl.OLrzqt(), c23953iPl.EZpvd(), java.lang.Boolean.TRUE, (512 & 64) != 0 ? 0 : c23953iPl.copydefault(), (512 & 128) != 0 ? "" : c23953iPl.KWHzl(), (512 & 256) != 0 ? false : c23953iPl.valueOf(), (512 & 512) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractActivityC24051iTb abstractActivityC24051iTb, C23963iPv c23963iPv) {
        if (c23963iPv.OLrzqt()) {
            abstractActivityC24051iTb.EZpvd(c23963iPv.copydefault());
        } else {
            abstractActivityC24051iTb.AEQbTJ(c23963iPv.copydefault());
        }
        abstractActivityC24051iTb.OLrzqt(c23963iPv.OLrzqt());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fARcdN().KWHzl().removeObserver(this.OLrzqt);
    }

    private final void getNewProxyInstance() {
        DbNXlk().AuCTel();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        DbNXlk().uzCIH();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        DbNXlk().getFieldNames();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C23963iPv value;
        if (djBIcL() || ((value = DbNXlk().ORxRYg().getValue()) != null && value.OLrzqt())) {
            super.onBackPressed();
        } else {
            DbNXlk().ORxRYg().setValue(new C23963iPv(true, true));
        }
    }

    public static /* synthetic */ void showKeyboardLayout$default(AbstractActivityC24051iTb abstractActivityC24051iTb, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showKeyboardLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractActivityC24051iTb.EZpvd(z);
    }

    private final void EZpvd(boolean z) {
        DbNXlk().EZpvd(true);
        if (z) {
            AYXKKw().DbNXlk.setAlpha(0.0f);
            AYXKKw().DbNXlk.setVisibility(0);
            AYXKKw().AYXKKw.setAlpha(0.0f);
            AYXKKw().AYXKKw.setVisibility(0);
            fJNWhG().start();
            return;
        }
        AYXKKw().DbNXlk.setVisibility(0);
        AYXKKw().DbNXlk.setAlpha(1.0f);
        AYXKKw().AYXKKw.setVisibility(0);
        AYXKKw().AYXKKw.setAlpha(1.0f);
        AYXKKw().gEmmrt.setAlpha(0.0f);
        AYXKKw().gEmmrt.setVisibility(8);
        AYXKKw().AhwBna.setAlpha(0.0f);
        AYXKKw().AhwBna.setVisibility(8);
    }

    public static /* synthetic */ void showConfirmLayout$default(AbstractActivityC24051iTb abstractActivityC24051iTb, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConfirmLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractActivityC24051iTb.AEQbTJ(z);
    }

    private final void AEQbTJ(boolean z) {
        DbNXlk().EZpvd(false);
        if (z) {
            fIwbmz().start();
            AYXKKw().gEmmrt.setAlpha(0.0f);
            AYXKKw().gEmmrt.setVisibility(0);
            AYXKKw().AhwBna.setAlpha(0.0f);
            AYXKKw().AhwBna.setVisibility(0);
            return;
        }
        AYXKKw().DbNXlk.setAlpha(0.0f);
        AYXKKw().DbNXlk.setVisibility(8);
        AYXKKw().AYXKKw.setAlpha(0.0f);
        AYXKKw().AYXKKw.setVisibility(8);
        AYXKKw().gEmmrt.setAlpha(1.0f);
        AYXKKw().gEmmrt.setVisibility(0);
        AYXKKw().AhwBna.setAlpha(1.0f);
        AYXKKw().AhwBna.setVisibility(0);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
