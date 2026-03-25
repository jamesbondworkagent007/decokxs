package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.constant.ApproveRiskyType;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveRiskResponse;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C15530eLt;
import o.dTK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15530eLt extends eLJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final LiveData<java.util.List<ApproveItem>> AEQbTJ;
    public final C13934dbu AYXKKw;
    public final ConcurrentHashMap<java.lang.String, Application> AhwBna;
    public volatile boolean EZpvd;
    public final MutableLiveData<java.util.List<ApproveItem>> KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public InterfaceC9738bbJ djBIcL;
    public final C12827cuN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.eLJ
    public InterfaceC9738bbJ OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<ApproveItem>> copydefault() {
        return this.AEQbTJ;
    }

    public C15530eLt(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.AYXKKw = c13934dbu;
        this.valueOf = c12827cuN;
        MutableLiveData<java.util.List<ApproveItem>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.AEQbTJ = mutableLiveData;
        this.AhwBna = new ConcurrentHashMap<>();
        this.EZpvd = true;
    }

    /* JADX INFO: renamed from: o.eLt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eLt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C15530eLt getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.OLrzqt(context);
        }

        public final C15530eLt OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).KWHzl();
        }
    }

    @Override // o.eLJ
    public java.util.List<ApproveItem> EZpvd() {
        return this.AEQbTJ.getValue();
    }

    public final void copydefault(ResponseData<java.util.List<ApproveItem>> responseData) {
        EZpvd(false);
        if (responseData != null && responseData.getCode() == 0 && responseData.getData() != null) {
            this.KWHzl.setValue(responseData.getData());
            InterfaceC9738bbJ interfaceC9738bbJOLrzqt = OLrzqt();
            if (interfaceC9738bbJOLrzqt != null) {
                Application applicationAEQbTJ = AEQbTJ(interfaceC9738bbJOLrzqt.DbNXlk());
                long jCopydefault = applicationAEQbTJ != null ? applicationAEQbTJ.copydefault() : 0L;
                if (jCopydefault > 0) {
                    EZpvd(interfaceC9738bbJOLrzqt.DbNXlk(), jCopydefault);
                }
                Application applicationAEQbTJ2 = AEQbTJ(interfaceC9738bbJOLrzqt.DbNXlk());
                long jKWHzl = applicationAEQbTJ2 != null ? applicationAEQbTJ2.KWHzl() : 0L;
                if (jKWHzl > 0) {
                    AEQbTJ(interfaceC9738bbJOLrzqt.DbNXlk(), jKWHzl);
                }
                this.AhwBna.remove(interfaceC9738bbJOLrzqt.DbNXlk());
            }
            C15523eLm c15523eLm = C15523eLm.KWHzl;
            InterfaceC9738bbJ interfaceC9738bbJ = this.djBIcL;
            Intrinsics.copydefault(interfaceC9738bbJ);
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            java.util.List<ApproveItem> data = responseData.getData();
            if (data == null) {
                data = yDY.AhwBna();
            }
            c15523eLm.KWHzl(strDbNXlk, data);
            java.util.List<ApproveItem> data2 = responseData.getData();
            if (data2 == null) {
                data2 = yDY.AhwBna();
            }
            c15523eLm.KWHzl(data2);
            return;
        }
        this.KWHzl.setValue(null);
    }

    public final void KWHzl(java.lang.String str) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl;
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (str == null || str.length() == 0) {
            abstractC58260yxtKWHzl = this.valueOf.KWHzl();
        } else {
            abstractC58260yxtKWHzl = this.valueOf.OLrzqt(str, false);
        }
        final StateListAnimator stateListAnimator = new StateListAnimator();
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.eLz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15530eLt.AhwBna(stateListAnimator, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.eLC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15530eLt.OLrzqt(this.AEQbTJ, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eLA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15530eLt.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eLE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15530eLt.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eLw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C15530eLt.djBIcL(function12, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.eLt$StateListAnimator */
    public static final class StateListAnimator implements Function1<?, InterfaceC60096zvd<? extends ResponseData<java.util.List<? extends ApproveItem>>>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<java.util.List<ApproveItem>>> invoke(final InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            C15530eLt.this.djBIcL = interfaceC9738bbJ;
            AbstractC58185ywX abstractC58185ywXOLrzqt = C15530eLt.this.OLrzqt(interfaceC9738bbJ);
            final C15530eLt c15530eLt = C15530eLt.this;
            final Function1 function1 = new Function1() { // from class: o.eLH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15530eLt.StateListAnimator.KWHzl(interfaceC9738bbJ, c15530eLt, (C15530eLt.Application) obj);
                }
            };
            return abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.eLF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15530eLt.StateListAnimator.AEQbTJ(function1, obj);
                }
            });
        }

        public static final InterfaceC60096zvd AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final InterfaceC60096zvd KWHzl(final InterfaceC9738bbJ interfaceC9738bbJ, final C15530eLt c15530eLt, final Application application) {
            AbstractC58185ywX<ResponseData<java.util.List<ApproveItem>>> abstractC58185ywXEZpvd;
            Intrinsics.checkNotNullParameter(application, "");
            if (!application.EZpvd()) {
                Intrinsics.copydefault(interfaceC9738bbJ, "");
                if (C17922fXg.EZpvd((AbstractC12782ctV) interfaceC9738bbJ) instanceof dTK.Application) {
                    abstractC58185ywXEZpvd = c15530eLt.AYXKKw.EZpvd(C56402yEa.EZpvd(interfaceC9738bbJ.DbNXlk()), (java.lang.Integer) 1);
                } else {
                    abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
                    Intrinsics.copydefault(abstractC58185ywXEZpvd);
                }
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(abstractC58185ywXEZpvd);
            final Function1 function1 = new Function1() { // from class: o.eLG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C15530eLt.StateListAnimator.OLrzqt(c15530eLt, interfaceC9738bbJ, application, (ResponseData) obj);
                }
            };
            return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eLI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C15530eLt.StateListAnimator.copydefault(function1, obj);
                }
            });
        }

        public static final ResponseData copydefault(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData OLrzqt(C15530eLt c15530eLt, InterfaceC9738bbJ interfaceC9738bbJ, Application application, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            Intrinsics.copydefault(application);
            c15530eLt.EZpvd(strDbNXlk, application);
            return responseData;
        }
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C15530eLt c15530eLt, ResponseData responseData) {
        c15530eLt.copydefault((ResponseData<java.util.List<ApproveItem>>) responseData);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C15530eLt c15530eLt, java.lang.Throwable th) {
        c15530eLt.copydefault((ResponseData<java.util.List<ApproveItem>>) null);
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<Application> OLrzqt(final InterfaceC9738bbJ interfaceC9738bbJ) {
        AbstractC58185ywX<ResponseData<ApproveRiskResponse>> abstractC58185ywXCopydefault = this.AYXKKw.copydefault(interfaceC9738bbJ.DbNXlk(), ApproveRiskyType.ApprovalAddressRisk.getType(), "NO_CACHE", (java.lang.Integer) null);
        final Function1 function1 = new Function1() { // from class: o.eLy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15530eLt.OLrzqt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<ApproveRiskResponse>> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.djBIcL(new InterfaceC58229yxO() { // from class: o.eLx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15530eLt.AYXKKw(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        AbstractC58185ywX<ResponseData<ApproveRiskResponse>> abstractC58185ywXCopydefault3 = this.AYXKKw.copydefault(interfaceC9738bbJ.DbNXlk(), ApproveRiskyType.LongTimeNoActive.getType(), "FIRST_CACHE", (java.lang.Integer) 72000);
        final Function1 function12 = new Function1() { // from class: o.eLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15530eLt.KWHzl((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<ApproveRiskResponse>> abstractC58185ywXCopydefault4 = abstractC58185ywXCopydefault3.djBIcL(new InterfaceC58229yxO() { // from class: o.eLv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15530eLt.gEmmrt(function12, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        final Function2 function2 = new Function2() { // from class: o.eLD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15530eLt.EZpvd(this.OLrzqt, interfaceC9738bbJ, (ResponseData) obj, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX<Application> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXCopydefault2, abstractC58185ywXCopydefault4, new InterfaceC58223yxI() { // from class: o.eLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C15530eLt.KWHzl(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final ResponseData AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 62, null);
    }

    public static final ResponseData KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 62, null);
    }

    public static final ResponseData gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final Application KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Application) function2.invoke(obj, obj2);
    }

    public static final Application EZpvd(C15530eLt c15530eLt, InterfaceC9738bbJ interfaceC9738bbJ, ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        ApproveRiskResponse approveRiskResponse = (ApproveRiskResponse) responseData.getData();
        java.lang.Boolean approvalAddressRiskyFlag = approveRiskResponse != null ? approveRiskResponse.getApprovalAddressRiskyFlag() : null;
        ApproveRiskResponse approveRiskResponse2 = (ApproveRiskResponse) responseData.getData();
        java.lang.Long approvalAddressRiskyTimeStamp = approveRiskResponse2 != null ? approveRiskResponse2.getApprovalAddressRiskyTimeStamp() : null;
        ApproveRiskResponse approveRiskResponse3 = (ApproveRiskResponse) responseData2.getData();
        java.lang.Boolean longTimeNoActiveFlag = approveRiskResponse3 != null ? approveRiskResponse3.getLongTimeNoActiveFlag() : null;
        ApproveRiskResponse approveRiskResponse4 = (ApproveRiskResponse) responseData2.getData();
        return c15530eLt.copydefault(strDbNXlk, approvalAddressRiskyFlag, approvalAddressRiskyTimeStamp, longTimeNoActiveFlag, approveRiskResponse4 != null ? approveRiskResponse4.getLongTimeNoActiveFlagTimeStamp() : null);
    }

    public final Application AEQbTJ(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.AhwBna.get(str);
    }

    public final Application copydefault(java.lang.String str, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, java.lang.Long l2) {
        boolean z;
        long jLongValue;
        boolean z2;
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(bool, bool3) && C33129mqd.AEQbTJ(l, java.lang.Long.valueOf(copydefault(str)))) {
            jLongValue = l != null ? l.longValue() : 0L;
            z = true;
        } else {
            z = false;
            jLongValue = 0;
        }
        if (Intrinsics.EZpvd(bool2, bool3) && C33129mqd.AEQbTJ(l2, java.lang.Long.valueOf(EZpvd(str)))) {
            jLongValue = l2 != null ? l2.longValue() : 0L;
            z2 = true;
        } else {
            z2 = z;
        }
        return new Application(z2, jLongValue, jLongValue);
    }

    public final void EZpvd(@NotNull java.lang.String str, java.lang.Boolean bool, java.lang.Long l, java.lang.Boolean bool2, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(str, copydefault(str, bool, l, bool2, l2));
    }

    public final void EZpvd(java.lang.String str, Application application) {
        this.AhwBna.put(str, application);
        EZpvd(application.EZpvd());
    }

    public final void KWHzl() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.KWHzl.setValue(null);
        this.djBIcL = null;
        this.EZpvd = true;
    }

    public final long copydefault(java.lang.String str) {
        java.lang.Long l = SPUtils.getLong(AEQbTJ("approve_address_risk", str), 0L, "wallet_risk_approve");
        Intrinsics.checkNotNullExpressionValue(l, "");
        return l.longValue();
    }

    public final void EZpvd(java.lang.String str, long j) {
        SPUtils.commit(AEQbTJ("approve_address_risk", str), java.lang.Long.valueOf(j), "wallet_risk_approve");
    }

    public final long EZpvd(java.lang.String str) {
        java.lang.Long l = SPUtils.getLong(AEQbTJ("long_time_no_active", str), 0L, "wallet_risk_approve");
        Intrinsics.checkNotNullExpressionValue(l, "");
        return l.longValue();
    }

    public final void AEQbTJ(java.lang.String str, long j) {
        SPUtils.commit(AEQbTJ("long_time_no_active", str), java.lang.Long.valueOf(j), "wallet_risk_approve");
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        return str + "-" + str2;
    }

    /* JADX INFO: renamed from: o.eLt$Application */
    public static final class Application {
        public final long EZpvd;
        public final long KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, boolean z, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = application.copydefault;
            }
            if ((i & 2) != 0) {
                j = application.EZpvd;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = application.KWHzl;
            }
            return application.OLrzqt(z, j3, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(boolean z, long j, long j2) {
            return new Application(z, j, j2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.copydefault == application.copydefault && this.EZpvd == application.EZpvd && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Long.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApproveRiskInfo(hasRisk=" + this.copydefault + ", approvalAddressRiskyTimeStamp=" + this.EZpvd + ", longTimeNoActiveFlagTimeStamp=" + this.KWHzl + ")";
        }

        public Application(boolean z, long j, long j2) {
            this.copydefault = z;
            this.EZpvd = j;
            this.KWHzl = j2;
        }
    }
}
