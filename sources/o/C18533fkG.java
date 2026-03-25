package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.constant.EOSOpenType;
import com.okinc.business.defi.wallet.mine.data.EosSelectPayMethod;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C10216bkK;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18533fkG extends AbstractC32998moE {
    public android.widget.ImageView AYXKKw;
    public C19301fyh AhwBna;
    public C55018xby AkhnZx;
    public android.widget.TextView AuCTel;
    public android.widget.TextView ejfBZ;
    public android.widget.TextView fARcdN;
    public C52794wYp fIwbmz;
    public android.widget.TextView fJNWhG;
    public C10216bkK valueOf;
    public java.util.ArrayList<EosSelectPayMethod> gEmmrt = new java.util.ArrayList<>();
    public java.lang.String isConnected = "";
    public java.lang.String KWHzl = "";
    public final C10882bwo djBIcL = new C10882bwo(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    public java.lang.String OLrzqt = "";
    public long EZpvd = -1;
    public java.lang.String hDKMBd = "";
    public java.lang.String fetchVPNInfo = "^[a-z1-5]{12}$";
    public java.lang.String copydefault = "";
    public java.lang.String AEQbTJ = "";
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.fkV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18533fkG.EZpvd(this.AEQbTJ);
        }
    });
    public final Observer<java.lang.String> DbNXlk = new Observer() { // from class: o.fkX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            C18533fkG.KWHzl(this.OLrzqt, (java.lang.String) obj);
        }
    };

    /* JADX INFO: renamed from: o.fkG$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.RkASWs;
    }

    public final C10257bkz OLrzqt() {
        return (C10257bkz) this.values.getValue();
    }

    public static final C10257bkz EZpvd(C18533fkG c18533fkG) {
        FragmentActivity fragmentActivityRequireActivity = c18533fkG.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C10257bkz) new ViewModelProvider(fragmentActivityRequireActivity).get(C10257bkz.class);
    }

    public static final void KWHzl(C18533fkG c18533fkG, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c18533fkG.OLrzqt = str;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("id", "")) == null) {
            string = "";
        }
        this.hDKMBd = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("name", "")) == null) {
            string2 = "";
        }
        this.OLrzqt = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString(OtcExtraKeys.ORDER_DETAIL_KEY, "")) == null) {
            string3 = "";
        }
        this.KWHzl = string3;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string4 = arguments4.getString("order_id_key", "")) == null) {
            string4 = "";
        }
        this.isConnected = string4;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.AhwBna = (C19301fyh) new ViewModelProvider(fragmentActivityRequireActivity).get(C19301fyh.class);
        this.fIwbmz = (C52794wYp) view.findViewById(C13754dXa.ActionBar.OnBackPressedDispatcherOwner);
        this.AkhnZx = (C55018xby) view.findViewById(C13754dXa.ActionBar.MediaSessionCompat2);
        this.fJNWhG = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0);
        this.fARcdN = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.ActivityResultKt);
        this.ejfBZ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.IntentSenderRequestCompanionCREATOR1);
        this.AuCTel = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.FontRes);
        this.AYXKKw = (android.widget.ImageView) view.findViewById(C13754dXa.ActionBar.zMXLsR);
        OLrzqt().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.fkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18533fkG.EZpvd(this.copydefault, (AbstractC12782ctV) obj);
            }
        }));
        android.widget.ImageView imageView = this.AYXKKw;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.fkQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C18533fkG.OLrzqt(this.OLrzqt, view2);
                }
            });
        }
        C52794wYp c52794wYp = this.fIwbmz;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.fkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C18533fkG.copydefault(this.OLrzqt, view2);
                }
            });
        }
        C55018xby c55018xby = this.AkhnZx;
        if (c55018xby != null) {
            c55018xby.setBottomSheet(new C18574fkv(this.gEmmrt, new Application()));
        }
    }

    public static final Unit EZpvd(C18533fkG c18533fkG, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            return Unit.INSTANCE;
        }
        c18533fkG.djBIcL.KWHzl(abstractC12782ctV);
        c18533fkG.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C18533fkG c18533fkG, android.view.View view) {
        FragmentActivity activity = c18533fkG.getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.EZpvd(c18533fkG.getString(C13754dXa.FragmentManager.RuDPQV));
        java.lang.String string = c18533fkG.getString(C13754dXa.FragmentManager.invokespecialhOMIpD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.fkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C18533fkG.KWHzl(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(C18533fkG c18533fkG, android.view.View view) {
        if (Pattern.matches(c18533fkG.fetchVPNInfo, c18533fkG.OLrzqt)) {
            long j = c18533fkG.EZpvd;
            if (j != -1) {
                C10216bkK c10216bkKNewInstance$default = C10216bkK.ActionBar.newInstance$default(C10216bkK.Companion, "eosOpen", null, C10953byF.KWHzl.AEQbTJ(j), 2, null);
                c18533fkG.valueOf = c10216bkKNewInstance$default;
                if (c10216bkKNewInstance$default != null) {
                    c10216bkKNewInstance$default.show(c18533fkG.getChildFragmentManager(), c18533fkG.getTAG());
                    return;
                }
                return;
            }
            return;
        }
        C55326xho.toast$default(c18533fkG.getString(C13754dXa.FragmentManager.HJWChPRGtXKC), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fkG$Application */
    public static final class Application implements yHO<C55276xgr, C55276xgr, C55276xgr, Unit> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            KWHzl(c55276xgr, c55276xgr2, c55276xgr3);
            return Unit.INSTANCE;
        }

        public void KWHzl(C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
            C10854bwM c10854bwMAEQbTJ;
            AbstractC52786wYh abstractC52786wYhOLrzqt;
            C55018xby c55018xby = C18533fkG.this.AkhnZx;
            if (c55018xby != null && (abstractC52786wYhOLrzqt = c55018xby.OLrzqt()) != null) {
                abstractC52786wYhOLrzqt.dismissAllowingStateLoss();
            }
            int size = C18533fkG.this.gEmmrt.size();
            for (int i = 0; i < size; i++) {
                ((EosSelectPayMethod) C18533fkG.this.gEmmrt.get(i)).setSelect(false);
            }
            java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            EosSelectPayMethod eosSelectPayMethod = objOLrzqt instanceof EosSelectPayMethod ? (EosSelectPayMethod) objOLrzqt : null;
            if (eosSelectPayMethod != null) {
                C18533fkG c18533fkG = C18533fkG.this;
                eosSelectPayMethod.setSelect(true);
                C10849bwH payMethod = eosSelectPayMethod.getPayMethod();
                c18533fkG.EZpvd = (payMethod == null || (c10854bwMAEQbTJ = payMethod.AEQbTJ()) == null) ? -1L : c10854bwMAEQbTJ.AhwBna();
            }
            C18533fkG.this.KWHzl();
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        MutableLiveData<java.lang.String> mutableLiveDataEZpvd;
        C19301fyh c19301fyh = this.AhwBna;
        if (c19301fyh != null && (mutableLiveDataEZpvd = c19301fyh.EZpvd()) != null) {
            mutableLiveDataEZpvd.observeForever(this.DbNXlk);
        }
        EZpvd();
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        MutableLiveData<java.lang.String> mutableLiveDataEZpvd;
        C19301fyh c19301fyh = this.AhwBna;
        if (c19301fyh == null || (mutableLiveDataEZpvd = c19301fyh.EZpvd()) == null) {
            return;
        }
        mutableLiveDataEZpvd.removeObserver(this.DbNXlk);
    }

    private final void EZpvd() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.hDKMBd)) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.hDKMBd, true);
            final Function1 function1 = new Function1() { // from class: o.fkU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18533fkG.OLrzqt(this.OLrzqt, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.flb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18533fkG.AhwBna(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.flc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18533fkG.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fkJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C18533fkG.AYXKKw(function12, obj);
                }
            });
            this.djBIcL.OLrzqt(EOSOpenType.SelfOpen);
        } else {
            this.djBIcL.OLrzqt(EOSOpenType.FriendOpen);
        }
        AbstractC58185ywX<Unit> abstractC58185ywXAhwBna = this.djBIcL.AhwBna();
        final Function1 function13 = new Function1() { // from class: o.fkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18533fkG.KWHzl(this.copydefault, (Unit) obj);
            }
        };
        abstractC58185ywXAhwBna.AEQbTJ(new InterfaceC58227yxM() { // from class: o.fkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18533fkG.gEmmrt(function13, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C18533fkG c18533fkG, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strAEQbTJ;
        java.lang.String strOLrzqt;
        C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
        java.lang.String str = "";
        if (c13852daRODWQjV == null || (strAEQbTJ = c13852daRODWQjV.AEQbTJ()) == null) {
            strAEQbTJ = "";
        }
        c18533fkG.isConnected = strAEQbTJ;
        C13852daR c13852daRODWQjV2 = abstractC12782ctV.ODWQjV();
        if (c13852daRODWQjV2 != null && (strOLrzqt = c13852daRODWQjV2.OLrzqt()) != null) {
            str = strOLrzqt;
        }
        c18533fkG.KWHzl = str;
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C18533fkG c18533fkG, Unit unit) {
        android.widget.TextView textView = c18533fkG.fJNWhG;
        if (textView != null) {
            C10883bwp c10883bwpAEQbTJ = c18533fkG.djBIcL.AEQbTJ();
            textView.setText(c10883bwpAEQbTJ != null ? c10883bwpAEQbTJ.OLrzqt() : null);
        }
        android.widget.TextView textView2 = c18533fkG.fARcdN;
        if (textView2 != null) {
            C10883bwp c10883bwpAEQbTJ2 = c18533fkG.djBIcL.AEQbTJ();
            textView2.setText(c10883bwpAEQbTJ2 != null ? c10883bwpAEQbTJ2.KWHzl() : null);
        }
        android.widget.TextView textView3 = c18533fkG.ejfBZ;
        if (textView3 != null) {
            C10883bwp c10883bwpAEQbTJ3 = c18533fkG.djBIcL.AEQbTJ();
            textView3.setText(c10883bwpAEQbTJ3 != null ? c10883bwpAEQbTJ3.valueOf() : null);
        }
        android.widget.TextView textView4 = c18533fkG.AuCTel;
        if (textView4 != null) {
            C10883bwp c10883bwpAEQbTJ4 = c18533fkG.djBIcL.AEQbTJ();
            textView4.setText(c10883bwpAEQbTJ4 != null ? c10883bwpAEQbTJ4.djBIcL() : null);
        }
        java.util.ArrayList<C10849bwH> arrayListEZpvd = c18533fkG.djBIcL.EZpvd();
        c18533fkG.gEmmrt.clear();
        int size = arrayListEZpvd.size();
        for (int i = 0; i < size; i++) {
            c18533fkG.gEmmrt.add(new EosSelectPayMethod(arrayListEZpvd.get(i).AYXKKw(), arrayListEZpvd.get(i)));
        }
        c18533fkG.KWHzl();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18533fkG, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "showEosPay", new Function1() { // from class: o.fkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18533fkG.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }, null, null, false, 48, null).EZpvd();
    }

    public static final Unit AEQbTJ(final C18533fkG c18533fkG, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXOLrzqt = c18533fkG.djBIcL.OLrzqt(str, c18533fkG.OLrzqt, c18533fkG.isConnected, c18533fkG.KWHzl);
        final Function1 function1 = new Function1() { // from class: o.fkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18533fkG.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18533fkG.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fkO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18533fkG.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18533fkG.djBIcL(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C18533fkG c18533fkG, java.lang.Throwable th) {
        pUU.copydefault(c18533fkG.getTAG(), "showEosPay submit error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        java.lang.String strEZpvd;
        C10854bwM c10854bwMAEQbTJ;
        java.lang.String strKWHzl;
        C55001xbh c55001xbhAkhnZx;
        int size = this.gEmmrt.size();
        for (int i = 0; i < size; i++) {
            if (this.gEmmrt.get(i).isSelect()) {
                C55018xby c55018xby = this.AkhnZx;
                if (c55018xby != null && (c55001xbhAkhnZx = c55018xby.AkhnZx()) != null) {
                    C10849bwH payMethod = this.gEmmrt.get(i).getPayMethod();
                    c55001xbhAkhnZx.setText(payMethod != null ? payMethod.EZpvd() : null);
                }
                C10849bwH payMethod2 = this.gEmmrt.get(i).getPayMethod();
                java.lang.String str = "";
                if (payMethod2 == null || (strEZpvd = payMethod2.EZpvd()) == null) {
                    strEZpvd = "";
                }
                this.copydefault = strEZpvd;
                C10849bwH payMethod3 = this.gEmmrt.get(i).getPayMethod();
                if (payMethod3 != null && (strKWHzl = payMethod3.KWHzl()) != null) {
                    str = strKWHzl;
                }
                this.AEQbTJ = str;
                this.djBIcL.KWHzl(this.gEmmrt.get(i).getPayMethod());
                C10849bwH payMethod4 = this.gEmmrt.get(i).getPayMethod();
                this.EZpvd = (payMethod4 == null || (c10854bwMAEQbTJ = payMethod4.AEQbTJ()) == null) ? -1L : c10854bwMAEQbTJ.AhwBna();
            }
        }
    }

    public static final Unit KWHzl(C18533fkG c18533fkG, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            FragmentActivity activity = c18533fkG.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
