package o;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC31451luK;
import o.C31351lsQ;
import o.C33070mpX;
import o.lOP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lPa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30186lPa extends AbstractC30195lPj {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public final int AhwBna = C31351lsQ.ActionBar.AxsJAY;
    public boolean KWHzl;
    public boolean OLrzqt;
    public AbstractC31451luK copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.lPj.OLrzqt()V */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX INFO: renamed from: o.lPa$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lPa.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C30186lPa copydefault(int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("USER_MODE", i);
            bundle.putInt("index", i2);
            bundle.putString("search", str);
            bundle.putString("id", str2);
            bundle.putBoolean("is_gateway", z);
            bundle.putString("source", str3);
            C30186lPa c30186lPa = new C30186lPa();
            c30186lPa.setArguments(bundle);
            return c30186lPa;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC31451luK abstractC31451luK = (AbstractC31451luK) DataBindingUtil.inflate(layoutInflater, C31351lsQ.ActionBar.AxsJAY, null, false);
        this.copydefault = abstractC31451luK;
        if (abstractC31451luK != null) {
            return abstractC31451luK.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = requireArguments().getInt("index", 0);
        this.AEQbTJ = requireArguments().getBoolean("is_gateway", false);
        AbstractC31451luK abstractC31451luK = this.copydefault;
        if (abstractC31451luK != null) {
            abstractC31451luK.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C30186lPa.AEQbTJ(this.KWHzl, view2);
                }
            });
            android.widget.ImageView imageView = abstractC31451luK.KWHzl;
            imageView.setOnClickListener(new TaskDescription(imageView, 1000L, intRef, this));
            abstractC31451luK.copydefault.setupWithViewPager(abstractC31451luK.gEmmrt);
            abstractC31451luK.gEmmrt.setOffscreenPageLimit(1);
            C33544myU c33544myU = abstractC31451luK.gEmmrt;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c33544myU.setAdapter(new C30204lPs(childFragmentManager, this));
            KWHzl(intRef.element);
            if (intRef.element == 0) {
                this.KWHzl = true;
            }
            abstractC31451luK.gEmmrt.setOnPageChangeListener(new ActionBar(intRef, this));
            EZpvd();
            abstractC31451luK.EZpvd.setVisibility(8);
        }
    }

    public static final void AEQbTJ(C30186lPa c30186lPa, android.view.View view) {
        FragmentActivity activity = c30186lPa.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: o.lPa$ActionBar */
    public static final class ActionBar extends ViewPager.SimpleOnPageChangeListener {
        public final /* synthetic */ Ref.IntRef KWHzl;
        public final /* synthetic */ C30186lPa copydefault;

        public ActionBar(Ref.IntRef intRef, C30186lPa c30186lPa) {
            this.KWHzl = intRef;
            this.copydefault = c30186lPa;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.KWHzl.element = i;
            this.copydefault.copydefault(false);
            C30193lPh.copydefault.KWHzl(null);
            RxBus.KWHzl("event_fiat_order_list_clear_filter");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C30193lPh.copydefault.KWHzl(null);
        super.onDestroy();
    }

    public final void KWHzl(int i) {
        C33544myU c33544myU;
        C30193lPh.copydefault.KWHzl(null);
        RxBus.KWHzl("event_fiat_order_list_clear_filter");
        AbstractC31451luK abstractC31451luK = this.copydefault;
        if (abstractC31451luK == null || (c33544myU = abstractC31451luK.gEmmrt) == null) {
            return;
        }
        c33544myU.setCurrentItem(i, false);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        RxBus.AEQbTJ("event_fiat_order_list_clear_filter").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderPageFragment$onVisible$1
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                ImageView imageView;
                AbstractC31451luK abstractC31451luK = this.this$0.copydefault;
                if (abstractC31451luK != null && (imageView = abstractC31451luK.KWHzl) != null) {
                    imageView.setBackground(C33070mpX.KWHzl(C31351lsQ.TaskDescription.AEQbTJ));
                }
                this.this$0.EZpvd(false);
            }
        });
        RxBus.AEQbTJ("event_fiat_order_list_applied_filter").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderPageFragment$onVisible$2
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                ImageView imageView;
                AbstractC31451luK abstractC31451luK = this.this$0.copydefault;
                if (abstractC31451luK != null && (imageView = abstractC31451luK.KWHzl) != null) {
                    imageView.setBackground(C33070mpX.KWHzl(C31351lsQ.TaskDescription.EZpvd));
                }
                this.this$0.EZpvd(true);
            }
        });
        RxBus.AEQbTJ("event_fiat_order_list_hide_filter_icon").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderPageFragment$onVisible$3
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                ImageView imageView;
                ImageView imageView2;
                if (this.this$0.OLrzqt()) {
                    AbstractC31451luK abstractC31451luK = this.this$0.copydefault;
                    if (abstractC31451luK == null || (imageView2 = abstractC31451luK.KWHzl) == null) {
                        return;
                    }
                    imageView2.setVisibility(0);
                    return;
                }
                AbstractC31451luK abstractC31451luK2 = this.this$0.copydefault;
                if (abstractC31451luK2 == null || (imageView = abstractC31451luK2.KWHzl) == null) {
                    return;
                }
                imageView.setVisibility(8);
            }
        });
        RxBus.AEQbTJ("event_fiat_order_list_show_filter_icon").subscribe(new RxBus.EventCallback<java.lang.String>() { // from class: com.okinc.buysell.ui.pro.transaction.list.FiatCryptoOrderPageFragment$onVisible$4
            {
                super(this.this$0);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                ImageView imageView;
                AbstractC31451luK abstractC31451luK = this.this$0.copydefault;
                if (abstractC31451luK == null || (imageView = abstractC31451luK.KWHzl) == null) {
                    return;
                }
                imageView.setVisibility(0);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SubHelper.AEQbTJ(this);
        C30193lPh.copydefault.KWHzl(null);
    }

    /* JADX INFO: renamed from: o.lPa$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Ref.IntRef AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30186lPa KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Ref.IntRef intRef, C30186lPa c30186lPa) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = intRef;
            this.KWHzl = c30186lPa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                lOP.Application application = lOP.Companion;
                application.EZpvd(this.AEQbTJ.element).show(this.KWHzl.getChildFragmentManager(), application.getClass().getName());
            }
        }
    }

    public final void EZpvd() {
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("switch_to_complete_tab");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.lPc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30186lPa.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C30186lPa.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.lOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30186lPa.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C30186lPa.copydefault(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C30186lPa c30186lPa, java.lang.String str) {
        c30186lPa.KWHzl(1);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }
}
