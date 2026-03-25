package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10828bvn;
import o.C13754dXa;
import o.C9694baS;
import o.eGH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18451fie<T extends AbstractC10828bvn> extends AbstractC14664dpi {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int values = 8;
    public InterfaceC58217yxC AkhnZx;
    public T AuCTel;
    public DappSignArgs DbNXlk;
    public C18351fgk ejfBZ;
    public InterfaceC58217yxC fARcdN;
    public boolean fIwbmz;
    public Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> fetchVPNInfo;
    public InterfaceC58217yxC isConnected;

    /* JADX INFO: renamed from: o.fie$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public abstract void DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSignArgs KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T djBIcL() {
        return this.AuCTel;
    }

    /* JADX INFO: renamed from: o.fie$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fie.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC57212yeE, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        this.ejfBZ = (C18351fgk) new ViewModelProvider(fragmentRequireParentFragment).get(C18351fgk.class);
        android.os.Bundle arguments = getArguments();
        this.DbNXlk = arguments != null ? (DappSignArgs) arguments.getParcelable("dappSignArgs") : null;
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        gEmmrt();
    }

    public final void valueOf() {
        showLoading();
        C10794bvF c10794bvF = new C10794bvF();
        DappSignArgs dappSignArgs = this.DbNXlk;
        if (dappSignArgs == null) {
            return;
        }
        AbstractC58260yxt<kotlin.Pair<T, java.lang.String>> abstractC58260yxtOLrzqt = c10794bvF.OLrzqt(dappSignArgs);
        final Function1 function1 = new Function1() { // from class: o.fim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.KWHzl(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<T, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fin
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        this.isConnected = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.djBIcL(function12, obj);
            }
        });
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final AbstractC18451fie abstractC18451fie, kotlin.Pair pair) {
        abstractC18451fie.dismissLoading();
        if (pair.getFirst() == null) {
            abstractC18451fie.OLrzqt((java.lang.String) pair.getSecond(), new Function0() { // from class: o.fil
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC18451fie.copydefault(this.copydefault);
                }
            });
            return Unit.INSTANCE;
        }
        abstractC18451fie.EZpvd();
        abstractC18451fie.AuCTel = (T) pair.getFirst();
        abstractC18451fie.DbNXlk();
        java.lang.Object first = pair.getFirst();
        Intrinsics.copydefault(first);
        ((AbstractC10828bvn) first).KWHzl(abstractC18451fie.fetchVPNInfo);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC18451fie, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC18451fie abstractC18451fie) {
        abstractC18451fie.valueOf();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC18451fie abstractC18451fie, java.lang.Throwable th) {
        abstractC18451fie.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("AbsDappSignBaseFragment", th);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC18451fie, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        DappSignArgs dappSignArgs = this.DbNXlk;
        C18351fgk c18351fgk = null;
        if (Intrinsics.EZpvd((java.lang.Object) (dappSignArgs != null ? dappSignArgs.getFrom() : null), (java.lang.Object) "wallet_connect")) {
            C18351fgk c18351fgk2 = this.ejfBZ;
            if (c18351fgk2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c18351fgk = c18351fgk2;
            }
            c18351fgk.copydefault().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.fig
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC18451fie.KWHzl(this.KWHzl, (java.lang.Integer) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(AbstractC18451fie abstractC18451fie, java.lang.Integer num) {
        if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 5)) {
            AbstractC57212yeE.close$default(abstractC18451fie, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        isConnected();
        AbstractC57212yeE.close$default(this, null, 1, null);
    }

    @Override // o.AbstractC57212yeE, o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
    public void copydefault(android.os.Bundle bundle) {
        super.copydefault(bundle);
        isConnected();
    }

    public final void AYXKKw() {
        AbstractC12782ctV abstractC12782ctVFJNWhG;
        T t = this.AuCTel;
        if (t == null || (abstractC12782ctVFJNWhG = t.fJNWhG()) == null) {
            return;
        }
        if (abstractC12782ctVFJNWhG.gHZMYf() || abstractC12782ctVFJNWhG.iwGUEr()) {
            sign$default(this, "", null, 2, null);
            return;
        }
        if (getActivity() == null) {
            return;
        }
        C15691eRs c15691eRs = C15691eRs.AEQbTJ;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(c15691eRs.copydefault(abstractC12782ctVFJNWhG, fragmentActivityRequireActivity, this), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.fip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fiq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fiv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.AhwBna(function12, obj);
            }
        });
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final AbstractC18451fie abstractC18451fie, java.lang.Boolean bool) {
        if (!bool.booleanValue()) {
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC18451fie.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            new C14461dlr(childFragmentManager, "mpcCheckAccountStatus", new Function1() { // from class: o.fio
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC18451fie.KWHzl(this.copydefault, (java.lang.String) obj);
                }
            }, null, null, false, 48, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC18451fie abstractC18451fie, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        sign$default(abstractC18451fie, str, null, 2, null);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void sign$default(AbstractC18451fie abstractC18451fie, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sign");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        abstractC18451fie.KWHzl(str, str2);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        final T t;
        showLoading();
        final FragmentActivity activity = getActivity();
        if (activity == null || (t = this.AuCTel) == null) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AkhnZx;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        eFB efb = eFB.KWHzl;
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXCopydefault = t.copydefault(str, str2);
        C10854bwM c10854bwMGEmmrt = t.gEmmrt();
        if (c10854bwMGEmmrt == null) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = efb.EZpvd(abstractC58185ywXCopydefault, activity, c10854bwMGEmmrt, t.fJNWhG(), true);
        final Function1 function1 = new Function1() { // from class: o.fix
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.OLrzqt(this.copydefault, activity, t, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fiw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.EZpvd(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.AkhnZx = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fiC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.values(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(final AbstractC18451fie abstractC18451fie, FragmentActivity fragmentActivity, AbstractC10828bvn abstractC10828bvn, ResponseData responseData) {
        java.lang.String publicKey;
        int code = responseData.getCode();
        if (code == -5014) {
            abstractC18451fie.dismissLoading();
        } else if (code == -5013) {
            abstractC18451fie.dismissLoading();
            C9694baS.Application application = C9694baS.Companion;
            eGH.Application application2 = eGH.Companion;
            java.lang.String strDbNXlk = abstractC10828bvn.fJNWhG().DbNXlk();
            java.lang.String strAhwBna = abstractC10828bvn.AhwBna();
            C10854bwM c10854bwMGEmmrt = abstractC10828bvn.gEmmrt();
            application.KWHzl(abstractC18451fie, application2.AEQbTJ(fragmentActivity, strDbNXlk, strAhwBna, c10854bwMGEmmrt != null ? c10854bwMGEmmrt.AhwBna() : 0L, (16 & 16) != 0 ? 0L : 0L, "", null, null, null), new Function2() { // from class: o.fit
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC18451fie.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                }
            });
        } else if (code != 0) {
            switch (code) {
                case -5007:
                    break;
                case -5006:
                    abstractC18451fie.KWHzl(abstractC18451fie.getString(C13754dXa.FragmentManager.Dfm));
                    break;
                case -5005:
                    abstractC18451fie.KWHzl(abstractC18451fie.getString(C13754dXa.FragmentManager.DRGLNw));
                    break;
                case -5004:
                    abstractC18451fie.KWHzl(abstractC18451fie.getString(C13754dXa.FragmentManager.sYcwUD));
                    break;
                case -5003:
                    abstractC18451fie.KWHzl(abstractC18451fie.getString(C13754dXa.FragmentManager.zpGcln));
                    break;
                case -5002:
                    abstractC18451fie.KWHzl(abstractC18451fie.getString(C13754dXa.FragmentManager.FhERFw));
                    break;
                case -5001:
                    java.lang.String str = (java.lang.String) responseData.getData();
                    java.lang.String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    ChainAddress chainAddressIsConnected = abstractC10828bvn.isConnected();
                    if (chainAddressIsConnected != null && (publicKey = chainAddressIsConnected.getPublicKey()) != null) {
                        str2 = publicKey;
                    }
                    abstractC18451fie.AEQbTJ(str, str2);
                    break;
                case -5000:
                    abstractC18451fie.KWHzl(responseData.getMsg());
                    break;
                default:
                    abstractC18451fie.KWHzl(responseData.getErrorMsg());
                    break;
            }
        }
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC18451fie abstractC18451fie, int i, android.content.Intent intent) {
        if (i == -1) {
            abstractC18451fie.KWHzl("", intent != null ? intent.getStringExtra("result") : null);
        }
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC18451fie abstractC18451fie, java.lang.Throwable th) {
        abstractC18451fie.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("AbsDappSignBaseFragment", th);
        C10350bmm.AEQbTJ.copydefault(true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            KWHzl((java.lang.String) null);
            return;
        }
        DappSignArgs dappSignArgs = this.DbNXlk;
        if (Intrinsics.EZpvd((java.lang.Object) (dappSignArgs != null ? dappSignArgs.getFrom() : null), (java.lang.Object) "wallet_connect")) {
            OLrzqt(str);
            return;
        }
        dismissLoading();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", str);
        bundle.putString("publicKey", str2);
        bundle.putBoolean("is_reject_sign", false);
        AEQbTJ(bundle);
    }

    private final void KWHzl(java.lang.String str) {
        dismissLoading();
        if (str == null || str.length() == 0) {
            C33134mqi.copydefault(C13754dXa.FragmentManager.Dfm);
        } else {
            C33134mqi.AEQbTJ(str);
        }
        isConnected();
    }

    public final void OLrzqt(final java.lang.String str) {
        this.fIwbmz = true;
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.fiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58249yxi
            public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) {
                AbstractC18451fie.KWHzl(this.OLrzqt, str, interfaceC58251yxk);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fiB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.copydefault(this.copydefault, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.fiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC18451fie.AYXKKw(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        this.fARcdN = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC18451fie.isConnected(function1, obj);
            }
        });
    }

    public static final void KWHzl(AbstractC18451fie abstractC18451fie, java.lang.String str, InterfaceC58251yxk interfaceC58251yxk) {
        java.lang.Long wcId;
        java.lang.String wcTopic;
        AbstractC12782ctV abstractC12782ctVFJNWhG;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(interfaceC58251yxk, "");
        DappSignArgs dappSignArgs = abstractC18451fie.DbNXlk;
        java.lang.Long wcId2 = dappSignArgs != null ? dappSignArgs.getWcId() : null;
        DappSignArgs dappSignArgs2 = abstractC18451fie.DbNXlk;
        java.lang.String wcAuthRequestIssuer = dappSignArgs2 != null ? dappSignArgs2.getWcAuthRequestIssuer() : null;
        if (wcId2 != null && wcAuthRequestIssuer != null) {
            WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
            long jLongValue = wcId2.longValue();
            T t = abstractC18451fie.AuCTel;
            instance$default.KWHzl(jLongValue, str, wcAuthRequestIssuer, (t == null || (abstractC12782ctVFJNWhG = t.fJNWhG()) == null) ? false : abstractC12782ctVFJNWhG.getFieldNames());
        } else {
            WalletConnectUtils instance$default2 = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
            DappSignArgs dappSignArgs3 = abstractC18451fie.DbNXlk;
            if (dappSignArgs3 != null && (wcTopic = dappSignArgs3.getWcTopic()) != null) {
                str2 = wcTopic;
            }
            DappSignArgs dappSignArgs4 = abstractC18451fie.DbNXlk;
            instance$default2.AEQbTJ(str2, (dappSignArgs4 == null || (wcId = dappSignArgs4.getWcId()) == null) ? 0L : wcId.longValue(), str);
        }
        interfaceC58251yxk.onNext(1);
    }

    public static final void copydefault(AbstractC18451fie abstractC18451fie, java.lang.Object obj) {
        abstractC18451fie.dismissLoading();
        AbstractC57212yeE.close$default(abstractC18451fie, null, 1, null);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(AbstractC18451fie abstractC18451fie, java.lang.Throwable th) {
        abstractC18451fie.dismissLoading();
        Intrinsics.copydefault(th);
        C10857bwP.copydefault("AbsDappSignBaseFragment", th);
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        java.lang.Long wcId;
        java.lang.String wcTopic;
        java.lang.Long wcId2;
        DappSignArgs dappSignArgs = this.DbNXlk;
        if (!Intrinsics.EZpvd((java.lang.Object) (dappSignArgs != null ? dappSignArgs.getFrom() : null), (java.lang.Object) "wallet_connect") || this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        DappSignArgs dappSignArgs2 = this.DbNXlk;
        if (dappSignArgs2 == null || (wcId = dappSignArgs2.getWcId()) == null) {
            return;
        }
        long jLongValue = wcId.longValue();
        DappSignArgs dappSignArgs3 = this.DbNXlk;
        if ((dappSignArgs3 != null ? dappSignArgs3.getWcAuthRequestIssuer() : null) != null) {
            WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).EZpvd(jLongValue);
            return;
        }
        WalletConnectUtils instance$default = WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null);
        DappSignArgs dappSignArgs4 = this.DbNXlk;
        if (dappSignArgs4 == null || (wcTopic = dappSignArgs4.getWcTopic()) == null) {
            wcTopic = "";
        }
        java.lang.String str = wcTopic;
        DappSignArgs dappSignArgs5 = this.DbNXlk;
        WalletConnectUtils.rejectRequest$default(instance$default, str, (dappSignArgs5 == null || (wcId2 = dappSignArgs5.getWcId()) == null) ? 0L : wcId2.longValue(), null, 0, 12, null);
    }

    @Override // o.AbstractC14664dpi, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.isConnected;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fARcdN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.AkhnZx;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
    }
}
