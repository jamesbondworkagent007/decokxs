package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.InterfaceC27161jpv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.joM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27073joM extends ViewModel {
    public boolean EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final MutableLiveData<java.lang.Object> djBIcL = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Object> OLrzqt = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> copydefault = new MutableLiveData<>();
    public final MutableLiveData<Bitmap<InvestSubscriptionInfo>> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<Bitmap<java.util.List<InvestValidatorListItems>>> gEmmrt = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AhwBna = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AYXKKw = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> valueOf = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Object> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return !this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<InvestSubscriptionInfo>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Object> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<java.util.List<InvestValidatorListItems>>> valueOf() {
        return this.gEmmrt;
    }

    public C27073joM(boolean z) {
        this.EZpvd = z;
    }

    /* JADX INFO: renamed from: o.joM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.joM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C23539iAc c23539iAc = C23539iAc.EZpvd;
        boolean z = this.EZpvd;
        AbstractC58185ywX<InvestSubscriptionInfo> abstractC58185ywXAEQbTJ = c23539iAc.AEQbTJ(j, str, z ? str3 : "", z, str2, java.lang.Integer.valueOf(i), num);
        final Function1 function1 = new Function1() { // from class: o.joR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27073joM.KWHzl(this.AEQbTJ, (InvestSubscriptionInfo) obj);
            }
        };
        InterfaceC58227yxM<? super InvestSubscriptionInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.joT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27073joM.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.joW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27073joM.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.joV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27073joM.gEmmrt(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C27073joM c27073joM, InvestSubscriptionInfo investSubscriptionInfo) {
        if (investSubscriptionInfo == null) {
            c27073joM.KWHzl.setValue(new Bitmap.ActionBar("false", null, 2, null));
        } else {
            c27073joM.KWHzl.setValue(new Bitmap.StateListAnimator(investSubscriptionInfo));
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C27073joM c27073joM, java.lang.Throwable th) {
        if ((th instanceof ResponseFailedException) || (th instanceof java.lang.IllegalArgumentException)) {
            c27073joM.KWHzl.setValue(new Bitmap.ActionBar("false", null, 2, null));
        } else {
            c27073joM.KWHzl.setValue(new Bitmap.ActionBar("true", null, 2, null));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(long j, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.setValue(new Bitmap.TaskDescription());
        AbstractC58185ywX<java.util.List<InvestValidatorListItems>> abstractC58185ywXEZpvd = C25534iyY.KWHzl.EZpvd(C33129mqd.valueOf(java.lang.Long.valueOf(j)), i, str);
        final Function1 function1 = new Function1() { // from class: o.joO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27073joM.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<InvestValidatorListItems>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.joP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27073joM.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.joQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27073joM.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.joS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27073joM.AYXKKw(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C27073joM c27073joM, java.util.List list) {
        c27073joM.gEmmrt.setValue(new Bitmap.StateListAnimator(list));
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C27073joM c27073joM, java.lang.Throwable th) {
        c27073joM.gEmmrt.setValue(new Bitmap.ActionBar(th.getMessage(), null));
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        boolean z = !this.EZpvd;
        this.EZpvd = z;
        this.AYXKKw.setValue(java.lang.Boolean.valueOf(z));
    }

    public final void AEQbTJ(boolean z) {
        if (!z) {
            this.EZpvd = !this.EZpvd;
        }
        this.valueOf.setValue(java.lang.Boolean.valueOf(z));
    }

    public final InterfaceC27161jpv OLrzqt(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (investTokenWithAmount.getOriginalInvestmentId() != null) {
            return new InterfaceC27161jpv.ActionBar(investTokenWithAmount.getOriginalInvestmentId().longValue(), investTokenWithAmount.getOriginalProductType());
        }
        return new InterfaceC27161jpv.StateListAnimator(investTokenWithAmount);
    }
}
