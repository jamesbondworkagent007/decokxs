package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vYW extends AbstractC49732uuB {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C52794wYp AEQbTJ;
    public ViewOnClickListenerC54939xaY AYXKKw;
    public wYK KWHzl;
    public java.lang.String QUSxYX;
    public C52794wYp QVAiDq;
    public android.widget.TextView QbewEr;
    public Function2<? super java.lang.String, ? super java.util.ArrayList<SignalCoinPairItemData>, Unit> QfsBiF;
    public android.view.View copydefault;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;
    public int RJOkX = 2;
    public java.util.ArrayList<SignalCoinPairItemData> OLrzqt = new java.util.ArrayList<>();
    public java.lang.String djBIcL = "";
    public final java.util.ArrayList<SignalCoinPairItemData> dNCPSb = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.RJOkX = i;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str5, @NotNull java.util.ArrayList<SignalCoinPairItemData> arrayList, Function2<? super java.lang.String, ? super java.util.ArrayList<SignalCoinPairItemData>, Unit> function2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            vYW vyw = new vYW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("leveragePercents", str2);
            bundle.putString("currentLeverage", str);
            bundle.putString("minLever", str3);
            bundle.putString("maxLever", str4);
            bundle.putString("subTitle", str5);
            bundle.putParcelableArrayList("coinList", arrayList);
            vyw.setArguments(bundle);
            vyw.QfsBiF = function2;
            if (fragmentManager == null) {
                return;
            }
            vyw.show(fragmentManager, "SignalBotSelectLeverDialog");
        }
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("minLever")) == null) {
            string = "1";
        }
        this.QUSxYX = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("maxLever")) == null) {
            string2 = "2147483647";
        }
        this.valueOf = string2;
        android.os.Bundle arguments3 = getArguments();
        this.gEmmrt = arguments3 != null ? arguments3.getString("subTitle") : null;
        this.OLrzqt.clear();
        java.util.ArrayList<SignalCoinPairItemData> arrayList2 = this.OLrzqt;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (arrayList = arguments4.getParcelableArrayList("coinList")) == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList2.addAll(arrayList);
        android.os.Bundle arguments5 = getArguments();
        KWHzl(arguments5 != null ? arguments5.getString("leveragePercents") : null);
        copydefault(true);
        AuCTel();
        java.lang.String str = this.QUSxYX;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String str2 = this.valueOf;
        Intrinsics.copydefault((java.lang.Object) str2);
        EZpvd("", str, str2);
        KWHzl(4);
        OLrzqt(fetchVPNInfo());
        AEQbTJ();
    }

    public final void AEQbTJ() {
        android.view.View view;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = null;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C49511upt.StateListAnimator.gEmmrt, (android.view.ViewGroup) null);
        this.copydefault = viewInflate;
        this.QbewEr = viewInflate != null ? (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.DUUtXg) : null;
        android.view.View view2 = this.copydefault;
        this.KWHzl = view2 != null ? (wYK) view2.findViewById(C49511upt.Application.ejfBZ) : null;
        android.view.View view3 = this.copydefault;
        this.QVAiDq = view3 != null ? (C52794wYp) view3.findViewById(C49511upt.Application.DGUQLIekVPG) : null;
        android.view.View view4 = this.copydefault;
        this.AEQbTJ = view4 != null ? (C52794wYp) view4.findViewById(C49511upt.Application.getPriority) : null;
        android.content.Context context = getContext();
        if (context != null && (view = this.copydefault) != null) {
            viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.dHAKvv));
            viewOnClickListenerC54939xaY.EZpvd(view);
        }
        this.AYXKKw = viewOnClickListenerC54939xaY;
        wYK wyk = this.KWHzl;
        if (wyk != null) {
            wyk.setVisibility(8);
        }
        C52794wYp c52794wYp = this.QVAiDq;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        }
        C52794wYp c52794wYp2 = this.AEQbTJ;
        if (c52794wYp2 != null) {
            c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
        }
    }

    private final void OLrzqt(java.lang.String str) {
        java.lang.String strAYXKKw;
        if (C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 10)) {
            KWHzl(0);
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.gsvlRV);
        } else {
            KWHzl(4);
            strAYXKKw = "";
        }
        AEQbTJ(C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.vYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vYW.copydefault((java.util.List) obj);
            }
        }, 14, null), "", true);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vYW EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vYW vyw) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = vyw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.EZpvd.AYXKKw;
                if (viewOnClickListenerC54939xaY != null) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ vYW KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vYW vyw) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = vyw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function2 function2 = this.KWHzl.QfsBiF;
                if (function2 != null) {
                    function2.invoke(this.KWHzl.fetchVPNInfo(), this.KWHzl.dNCPSb);
                }
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.KWHzl.AYXKKw;
                if (viewOnClickListenerC54939xaY != null) {
                    viewOnClickListenerC54939xaY.dismiss();
                }
                this.KWHzl.dismiss();
            }
        }
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.BVXAa)));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void valueOf() {
        android.view.Window window;
        C33054mpH.copydefault(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        OLrzqt();
    }

    public final void OLrzqt() {
        this.dNCPSb.clear();
        java.util.ArrayList<SignalCoinPairItemData> arrayList = this.OLrzqt;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (C33129mqd.AEQbTJ(fetchVPNInfo(), ((SignalCoinPairItemData) obj).getMaxLever())) {
                arrayList2.add(obj);
            }
        }
        this.dNCPSb.addAll(arrayList2);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.dNCPSb.size()), 0)) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.ZqidTP, C56424yEw.gEmmrt(C56390yDp.OLrzqt("leverage", C56033xvF.getBotLever$default(fetchVPNInfo(), false, 2, null)), C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(this.dNCPSb.size()))))));
            this.djBIcL = strCopydefault;
            java.lang.String str = strCopydefault + " \n\n" + C33069mpW.copydefault(C55688xof.Application.Zpvmxu, C56423yEv.EZpvd(C56390yDp.OLrzqt("instrument", EZpvd())));
            android.widget.TextView textView = this.QbewEr;
            if (textView != null) {
                textView.setText(str);
            }
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AYXKKw;
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.show();
                return;
            }
            return;
        }
        Function2<? super java.lang.String, ? super java.util.ArrayList<SignalCoinPairItemData>, Unit> function2 = this.QfsBiF;
        if (function2 != null) {
            function2.invoke(fetchVPNInfo(), new java.util.ArrayList());
        }
        dismissAllowingStateLoss();
    }

    /* JADX DEBUG: Possible override for method o.uuB.EZpvd()V */
    public final java.lang.String EZpvd() {
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(this.dNCPSb.size()), (java.lang.Object) 1)) {
            return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, this.dNCPSb.get(0).getInstId(), this.dNCPSb.get(0).getInstType(), false, false, 12, null);
        }
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(this.dNCPSb.size()), 1)) {
            return "";
        }
        java.util.ArrayList<SignalCoinPairItemData> arrayList = this.dNCPSb;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SignalCoinPairItemData signalCoinPairItemData : arrayList) {
            arrayList2.add(C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, signalCoinPairItemData.getInstId(), signalCoinPairItemData.getInstType(), false, false, 12, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
    }

    private final void KWHzl(java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = "1,2,3,5,10,20,30,50";
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            java.lang.String str2 = (java.lang.String) obj;
            if (C33129mqd.copydefault(str2, this.QUSxYX) && C33129mqd.valueOf(str2, this.valueOf)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        int i = 0;
        for (java.lang.Object obj2 : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str3 = (java.lang.String) obj2;
            arrayList2.add(new C49777uuu(str3 + "x", str3, C33129mqd.OLrzqt(str3, fetchVPNInfo()), i));
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            OLrzqt(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    @Override // o.AbstractC49732uuB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.valueOf;
        if (str2 == null || str2.length() == 0) {
            str2 = "2147483647";
        }
        if (C33129mqd.valueOf(str, str2)) {
            java.lang.String str3 = this.QUSxYX;
            if (str3 == null || str3.length() == 0) {
                str3 = "1";
            }
            if (C33129mqd.copydefault(str, str3)) {
                z = true;
            }
        } else {
            z = false;
        }
        copydefault(z);
        OLrzqt(str);
    }
}
