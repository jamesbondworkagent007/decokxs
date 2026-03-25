package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.InterfaceC46550tYm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21205gvP extends wXX {
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public java.util.HashSet<java.lang.String> OLrzqt;
    public float copydefault = 0.92f;
    public AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity djBIcL;
    public AbstractC16539elo gEmmrt;
    public int valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.valueOf = i;
    }

    /* JADX INFO: renamed from: o.gvP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gvP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gvP$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C21205gvP newInstance$default(Application application, java.lang.String str, java.util.HashSet hashSet, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                hashSet = null;
            }
            return application.OLrzqt(str, hashSet);
        }

        public final C21205gvP OLrzqt(@NotNull java.lang.String str, java.util.HashSet<java.lang.String> hashSet) {
            Intrinsics.checkNotNullParameter(str, "");
            C21205gvP c21205gvP = new C21205gvP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("name", str);
            bundle.putSerializable("supported_fiat_array", hashSet);
            c21205gvP.setArguments(bundle);
            return c21205gvP;
        }
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, @NotNull AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.djBIcL = activity;
        super.show(fragmentManager, str);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.KWHzl || (activity = this.djBIcL) == null) {
            return;
        }
        activity.copydefault(null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("name")) == null) {
            return;
        }
        this.EZpvd = string;
        android.os.Bundle arguments2 = getArguments();
        this.OLrzqt = (java.util.HashSet) (arguments2 != null ? arguments2.getSerializable("supported_fiat_array") : null);
        this.gEmmrt = AbstractC16539elo.AEQbTJ(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        EZpvd();
    }

    /* JADX INFO: renamed from: o.gvP$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ C21205gvP KWHzl;
        public final /* synthetic */ C19583gHt copydefault;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(C19583gHt c19583gHt, C21205gvP c21205gvP) {
            this.copydefault = c19583gHt;
            this.KWHzl = c21205gvP;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            AbstractC16539elo abstractC16539elo = null;
            if (this.copydefault.copydefault(charSequence != null ? charSequence.toString() : null) == 0) {
                AbstractC16539elo abstractC16539elo2 = this.KWHzl.gEmmrt;
                if (abstractC16539elo2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16539elo = abstractC16539elo2;
                }
                abstractC16539elo.OLrzqt.setVisibility(0);
                return;
            }
            AbstractC16539elo abstractC16539elo3 = this.KWHzl.gEmmrt;
            if (abstractC16539elo3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16539elo3 = null;
            }
            abstractC16539elo3.OLrzqt.setVisibility(8);
            AbstractC16539elo abstractC16539elo4 = this.KWHzl.gEmmrt;
            if (abstractC16539elo4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16539elo = abstractC16539elo4;
            }
            abstractC16539elo.AEQbTJ.scrollToPosition(0);
        }
    }

    public final void EZpvd() {
        copydefault();
        AbstractC58185ywX currencyList$default = InterfaceC46550tYm.ActionBar.getCurrencyList$default((InterfaceC46550tYm) C43251rlk.copydefault(InterfaceC46550tYm.class), false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.gvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21205gvP.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21205gvP.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21205gvP.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        currencyList$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21205gvP.KWHzl(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C21205gvP c21205gvP, java.lang.Throwable th) {
        c21205gvP.OLrzqt();
        java.lang.String message = th.getMessage();
        if (message != null && C33129mqd.OLrzqt((java.lang.CharSequence) message)) {
            java.lang.String message2 = th.getMessage();
            Intrinsics.copydefault((java.lang.Object) message2);
            c21205gvP.EZpvd(C10857bwP.AEQbTJ("SwitchCurrencyBottomSubFragment", message2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gvP$ActionBar */
    public static final class ActionBar implements RecyclerView.OnItemTouchListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
        }

        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView recyclerView, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(motionEvent, "");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            AbstractC16539elo abstractC16539elo = C21205gvP.this.gEmmrt;
            if (abstractC16539elo == null) {
                Intrinsics.gEmmrt("");
                abstractC16539elo = null;
            }
            C33054mpH.OLrzqt(context, abstractC16539elo.EZpvd);
            return false;
        }
    }

    public static final Unit EZpvd(C21205gvP c21205gvP, ValuationCurrencyBean valuationCurrencyBean) {
        Intrinsics.checkNotNullParameter(valuationCurrencyBean, "");
        c21205gvP.dismissAllowingStateLoss();
        c21205gvP.KWHzl = true;
        AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity activity = c21205gvP.djBIcL;
        if (activity != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("currencyData", new WalletCurrencyBean(valuationCurrencyBean.getIsoCode(), valuationCurrencyBean.getSymbol(), valuationCurrencyBean.getUsdToThisRate(), valuationCurrencyBean.getPrecision(), 0, 16, null));
            activity.copydefault(bundle);
        }
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.String str) {
        AbstractC16539elo abstractC16539elo = this.gEmmrt;
        AbstractC16539elo abstractC16539elo2 = null;
        if (abstractC16539elo == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo = null;
        }
        abstractC16539elo.copydefault.setVisibility(0);
        AbstractC16539elo abstractC16539elo3 = this.gEmmrt;
        if (abstractC16539elo3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo3 = null;
        }
        abstractC16539elo3.copydefault.setSubTitle((java.lang.CharSequence) str);
        AbstractC16539elo abstractC16539elo4 = this.gEmmrt;
        if (abstractC16539elo4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16539elo2 = abstractC16539elo4;
        }
        abstractC16539elo2.copydefault.setRetryClickListener(new View.OnClickListener() { // from class: o.gvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C21205gvP.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(C21205gvP c21205gvP, android.view.View view) {
        AbstractC16539elo abstractC16539elo = c21205gvP.gEmmrt;
        if (abstractC16539elo == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo = null;
        }
        abstractC16539elo.copydefault.setVisibility(8);
        c21205gvP.EZpvd();
    }

    private final void copydefault() {
        AbstractC16539elo abstractC16539elo = this.gEmmrt;
        if (abstractC16539elo == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo = null;
        }
        abstractC16539elo.KWHzl.KWHzl(0L);
    }

    private final void OLrzqt() {
        AbstractC16539elo abstractC16539elo = this.gEmmrt;
        if (abstractC16539elo == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo = null;
        }
        abstractC16539elo.KWHzl.copydefault();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(67);
        c52781wYc.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.svhCHd));
    }

    public final void AEQbTJ(java.util.ArrayList<ValuationCurrencyBean> arrayList) {
        java.util.HashSet<java.lang.String> hashSet = this.OLrzqt;
        java.util.ArrayList arrayList2 = arrayList;
        if (hashSet != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (hashSet.contains(((ValuationCurrencyBean) obj).getIsoCode())) {
                    arrayList3.add(obj);
                }
            }
            arrayList2 = arrayList3;
        }
        C19583gHt c19583gHt = new C19583gHt(arrayList2, this.EZpvd);
        AbstractC16539elo abstractC16539elo = this.gEmmrt;
        AbstractC16539elo abstractC16539elo2 = null;
        if (abstractC16539elo == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo = null;
        }
        abstractC16539elo.AEQbTJ.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        AbstractC16539elo abstractC16539elo3 = this.gEmmrt;
        if (abstractC16539elo3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo3 = null;
        }
        abstractC16539elo3.AEQbTJ.setAdapter(c19583gHt);
        AbstractC16539elo abstractC16539elo4 = this.gEmmrt;
        if (abstractC16539elo4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo4 = null;
        }
        abstractC16539elo4.AEQbTJ.addOnItemTouchListener(new ActionBar());
        c19583gHt.OLrzqt(new Function1() { // from class: o.gvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C21205gvP.EZpvd(this.EZpvd, (ValuationCurrencyBean) obj2);
            }
        });
        AbstractC16539elo abstractC16539elo5 = this.gEmmrt;
        if (abstractC16539elo5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo5 = null;
        }
        abstractC16539elo5.AEQbTJ.addItemDecoration(new C8039avH(new C19587gHx(c19583gHt)));
        AbstractC16539elo abstractC16539elo6 = this.gEmmrt;
        if (abstractC16539elo6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16539elo6 = null;
        }
        abstractC16539elo6.EZpvd.setVisibility(0);
        AbstractC16539elo abstractC16539elo7 = this.gEmmrt;
        if (abstractC16539elo7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16539elo2 = abstractC16539elo7;
        }
        abstractC16539elo2.EZpvd.KWHzl().addTextChangedListener(new TaskDescription(c19583gHt, this));
    }

    public static final Unit AEQbTJ(C21205gvP c21205gvP, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null && C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            c21205gvP.OLrzqt();
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c21205gvP.AEQbTJ((java.util.ArrayList) data);
        }
        return Unit.INSTANCE;
    }
}
