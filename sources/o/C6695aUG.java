package o;

import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.auth.impl.widget.SecurityCountrySelectorView$getDefaultCountry$1;
import com.okinc.ok_kyc_core_api.ComplianceCountryListService;
import com.okinc.ok_kyc_core_api.model.CountryBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aUG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6695aUG extends android.widget.RelativeLayout {
    public CountryBean.Country EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public final C8284azo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6695aUG(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6695aUG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.aUG.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C6695aUG(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6695aUG(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C8284azo c8284azoAEQbTJ = C8284azo.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c8284azoAEQbTJ, "");
        this.copydefault = c8284azoAEQbTJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(CountryBean.Country country) {
        this.EZpvd = country;
        EZpvd();
    }

    public final java.lang.String OLrzqt() {
        java.lang.Object tag = this.copydefault.copydefault.getTag();
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        return str == null ? "" : str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AEQbTJ();
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aUG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initRegionClick$default(C6695aUG c6695aUG, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.aUC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6695aUG.copydefault();
                }
            };
        }
        c6695aUG.KWHzl(fragmentManager, lifecycleOwner, (Function0<Unit>) function0);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.widget.TextView textView = this.copydefault.copydefault;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, function0, this, fragmentManager, lifecycleOwner));
    }

    private final void AEQbTJ() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        lifecycleScope.launchWhenCreated(new SecurityCountrySelectorView$getDefaultCountry$1(this, null));
    }

    public final void EZpvd() {
        CountryBean.Country country = this.EZpvd;
        if (country != null) {
            this.copydefault.copydefault.setText(" +" + country.getTelephoneCode());
            this.copydefault.copydefault.setTag(country.getTelephoneCode());
            Function1<? super java.lang.String, Unit> function1 = this.KWHzl;
            if (function1 != null) {
                function1.invoke(OLrzqt());
            }
        }
    }

    public final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
        ComplianceCountryListService.StateListAnimator.showCountryListPage$default((ComplianceCountryListService) C43251rlk.copydefault(ComplianceCountryListService.class), fragmentManager, lifecycleOwner, ComplianceCountryListService.FunctionType.OKX_PHONE, null, java.lang.Boolean.FALSE, new Function1() { // from class: o.aUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6695aUG.AEQbTJ(this.EZpvd, (CountryBean.Country) obj);
            }
        }, 8, null);
    }

    public static final Unit AEQbTJ(C6695aUG c6695aUG, CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(country, "");
        c6695aUG.EZpvd(country);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aUG$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ C6695aUG AYXKKw;
        public final /* synthetic */ LifecycleOwner EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ androidx.fragment.app.FragmentManager copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0, C6695aUG c6695aUG, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = function0;
            this.AYXKKw = c6695aUG;
            this.copydefault = fragmentManager;
            this.EZpvd = lifecycleOwner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
                this.AYXKKw.KWHzl(this.copydefault, this.EZpvd);
            }
        }
    }
}
