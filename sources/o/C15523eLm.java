package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C14557dnh;
import o.C15523eLm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15523eLm extends eLJ {
    public static InterfaceC58217yxC AhwBna;
    public static final LiveData<java.util.List<ApproveItem>> EZpvd;
    public static final int OLrzqt;
    public static final MutableLiveData<java.util.List<ApproveItem>> copydefault;
    public static volatile boolean djBIcL;
    public static InterfaceC9738bbJ gEmmrt;
    public static final C15523eLm KWHzl = new C15523eLm();
    public static final C12827cuN AYXKKw = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
    public static final C13934dbu valueOf = new C13934dbu();
    public static final InterfaceC14563dnn AEQbTJ = new C14565dnp();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<ApproveItem>> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.eLJ
    public InterfaceC9738bbJ OLrzqt() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return djBIcL;
    }

    private C15523eLm() {
    }

    static {
        MutableLiveData<java.util.List<ApproveItem>> mutableLiveData = new MutableLiveData<>();
        copydefault = mutableLiveData;
        EZpvd = mutableLiveData;
        OLrzqt = 8;
    }

    public final void AhwBna() {
        InterfaceC58217yxC interfaceC58217yxC = AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        copydefault.setValue(null);
        gEmmrt = null;
    }

    public static /* synthetic */ void refresh$default(C15523eLm c15523eLm, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c15523eLm.KWHzl(str, z);
    }

    public final void KWHzl(java.lang.String str, boolean z) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl;
        InterfaceC58217yxC interfaceC58217yxC = AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (z) {
            copydefault.setValue(null);
        }
        if (str == null || str.length() == 0) {
            abstractC58260yxtKWHzl = AYXKKw.KWHzl();
        } else {
            abstractC58260yxtKWHzl = AYXKKw.OLrzqt(str, false);
        }
        final ActionBar actionBar = ActionBar.OLrzqt;
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.eLl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15523eLm.OLrzqt(actionBar, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.eLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15523eLm.OLrzqt((C15523eLm.StateListAnimator) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eLo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15523eLm.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eLp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15523eLm.copydefault((java.lang.Throwable) obj);
            }
        };
        AhwBna = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eLr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15523eLm.AhwBna(function12, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.eLm$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends StateListAnimator>> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends StateListAnimator> invoke(final InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C15523eLm c15523eLm = C15523eLm.KWHzl;
            C15523eLm.gEmmrt = interfaceC9738bbJ;
            AbstractC58185ywX approveListInCallThread$default = C13934dbu.getApproveListInCallThread$default(C15523eLm.valueOf, C56402yEa.EZpvd(interfaceC9738bbJ.DbNXlk()), null, 2, null);
            final Function1 function1 = new Function1() { // from class: o.eLs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15523eLm.ActionBar.AEQbTJ(interfaceC9738bbJ, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = approveListInCallThread$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eLq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15523eLm.ActionBar.KWHzl(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return C33024moe.KWHzl(abstractC58185ywXAEQbTJ);
        }

        public static final StateListAnimator KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (StateListAnimator) function1.invoke(obj);
        }

        public static final StateListAnimator AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            return new StateListAnimator(interfaceC9738bbJ.DbNXlk(), responseData);
        }
    }

    public static final InterfaceC60096zvd OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(StateListAnimator stateListAnimator) {
        if (stateListAnimator.KWHzl().getCode() == 0) {
            copydefault.setValue(stateListAnimator.KWHzl().getData());
            C15523eLm c15523eLm = KWHzl;
            java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
            java.util.List<ApproveItem> value = EZpvd.getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (((ApproveItem) obj).isRiskyProject()) {
                    arrayList.add(obj);
                }
            }
            c15523eLm.KWHzl(strOLrzqt, arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        copydefault.setValue(yDY.AhwBna());
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.util.List<ApproveItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        copydefault.setValue(list);
    }

    @Override // o.eLJ
    public java.util.List<ApproveItem> EZpvd() {
        return EZpvd.getValue();
    }

    public final void AYXKKw() {
        InterfaceC58217yxC interfaceC58217yxC = AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX INFO: renamed from: o.eLm$StateListAnimator */
    public static final class StateListAnimator {
        public final ResponseData<java.util.List<ApproveItem>> AEQbTJ;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eLm$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, ResponseData responseData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                responseData = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(str, responseData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResponseData<java.util.List<ApproveItem>> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull ResponseData<java.util.List<ApproveItem>> responseData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(responseData, "");
            return new StateListAnimator(str, responseData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WalletApproval(walletId=" + this.copydefault + ", responseData=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull ResponseData<java.util.List<ApproveItem>> responseData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(responseData, "");
            this.copydefault = str;
            this.AEQbTJ = responseData;
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<ApproveItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        for (ApproveItem approveItem : list) {
            C14557dnh.TaskDescription taskDescription = C14557dnh.TaskDescription.EZpvd;
            java.lang.String approvalAddress = approveItem.getApprovalAddress();
            if (approvalAddress == null) {
                approvalAddress = "";
            }
            AEQbTJ.KWHzl(C14560dnk.OLrzqt(taskDescription, str, "yes", approvalAddress, "android"));
        }
    }
}
