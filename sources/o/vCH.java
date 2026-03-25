package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vCH extends AbstractC49732uuB {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public Function1<? super java.lang.String, Unit> valueOf;
    public int AYXKKw = 2;
    public java.lang.String AEQbTJ = "contract_grid";
    public final C56168xxi KWHzl = new C56168xxi();
    public final C54282xCq QfsBiF = new C54282xCq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.AYXKKw = i;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str9, java.lang.String str10, Function1<? super java.lang.String, Unit> function1) {
            vCH vch = new vCH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("leveragePercents", str2);
            bundle.putString("currentLeverage", str);
            bundle.putString("minLever", str3);
            bundle.putString("maxLever", str4);
            bundle.putString("instId", str5);
            bundle.putString("instType", str6);
            bundle.putString("mgnMode", str7);
            bundle.putString("posSide", str8);
            bundle.putString("subTitle", str9);
            bundle.putString("bot_type", str10);
            vch.setArguments(bundle);
            vch.valueOf = function1;
            if (fragmentManager == null) {
                return;
            }
            vch.show(fragmentManager, "ContractLeverSelectDialog");
        }
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("minLever")) == null) {
            string = "1";
        }
        this.gEmmrt = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("maxLever")) == null) {
            string2 = "2147483647";
        }
        this.OLrzqt = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("bot_type")) == null) {
            string3 = "contract_grid";
        }
        this.AEQbTJ = string3;
        android.os.Bundle arguments4 = getArguments();
        KWHzl(arguments4 != null ? arguments4.getString("leveragePercents") : null);
        copydefault(true);
        AuCTel();
        OLrzqt(fetchVPNInfo());
        java.lang.String str = this.gEmmrt;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String str2 = this.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) str2);
        EZpvd("", str, str2);
        EZpvd();
        iwGUEr();
        getFieldNames();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        BizInstrument suggestedInstrument$default;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        java.lang.String safeString$default;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String string;
        java.lang.String instFamily;
        java.lang.String string2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (string2 = arguments.getString("instType")) == null) {
                string2 = "";
            }
            android.os.Bundle arguments2 = getArguments();
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, string2, arguments2 != null ? arguments2.getString("instId") : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null) {
            c54571xNhCreateTradeConverterWithIndex$default = null;
        } else {
            android.os.Bundle arguments3 = getArguments();
            if (arguments3 == null || (string = arguments3.getString("instType")) == null) {
                string = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(string);
            if (abstractC54531xLwOLrzqt != null) {
                if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily = "";
                }
                c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            }
        }
        if (c54571xNhCreateTradeConverterWithIndex$default != null) {
            java.lang.String str = this.EZpvd;
            if (str == null) {
                str = "";
            }
            c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str);
        }
        if (c54571xNhCreateTradeConverterWithIndex$default == null) {
            safeString$default = "";
        } else {
            java.lang.String str2 = this.djBIcL;
            if (str2 == null) {
                str2 = "";
            }
            C54536xML c54536xMLDjBIcL2 = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str2);
            if (c54536xMLDjBIcL2 == null || (c54536xMLIsConnected = c54536xMLDjBIcL2.isConnected()) == null || (c54536xMLAEQbTJ = c54536xMLIsConnected.AEQbTJ(true)) == null || (c54536xMLDjBIcL = c54536xMLAEQbTJ.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) {
            }
        }
        AEQbTJ(C33061mpO.setupSpanStyles$default(getString(C55688xof.Application.hNurIN) + " " + safeString$default, new java.lang.String[]{safeString$default}, 0, null, false, new Function1() { // from class: o.vCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCH.EZpvd(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null), "", true);
    }

    public static final Unit EZpvd(vCH vch, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(vch.getContext(), C48033uCm.FragmentManager.copydefault));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String strCopydefault;
        java.lang.String str2 = this.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_dca")) {
            java.lang.String strAYXKKw = C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 10) ? C33070mpX.AYXKKw(C55688xof.Application.gsvlRV) : "";
            KWHzl(C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.vCP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vCH.AEQbTJ(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null), "", true);
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "contract_grid")) {
            if (C33129mqd.gEmmrt(str, 10)) {
                strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplApi23);
            } else {
                strCopydefault = C33069mpW.copydefault(C55688xof.Application.RckOJh, C56423yEv.EZpvd(C56390yDp.OLrzqt("warnLeverage", "10")));
            }
            AEQbTJ(strCopydefault, "", true);
        }
    }

    public static final Unit AEQbTJ(vCH vch, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(vch.getContext(), C48033uCm.FragmentManager.copydefault));
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        android.widget.LinearLayout linearLayout = isConnected().getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "contract_dca") ? 0 : 8);
    }

    public final void iwGUEr() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "contract_dca")) {
            uzCIH();
        }
    }

    public final void getFieldNames() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "contract_dca")) {
            OLrzqt();
        }
    }

    public final void OLrzqt() {
        java.lang.String string;
        C56168xxi c56168xxi = this.KWHzl;
        android.os.Bundle arguments = getArguments();
        c56168xxi.AEQbTJ(arguments != null ? arguments.getString("instId") : null);
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("instType")) == null) {
            string = "";
        }
        c56168xxi.KWHzl(string);
        android.os.Bundle arguments3 = getArguments();
        c56168xxi.copydefault(arguments3 != null ? arguments3.getString("mgnMode") : null);
        android.os.Bundle arguments4 = getArguments();
        c56168xxi.valueOf(arguments4 != null ? arguments4.getString("posSide") : null);
        c56168xxi.OLrzqt(fetchVPNInfo());
        c56168xxi.KWHzl(new Function1() { // from class: o.vCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCH.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
    }

    private final void uzCIH() {
        java.lang.String string;
        C54282xCq c54282xCq = this.QfsBiF;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("instId")) == null) {
            string = "";
        }
        c54282xCq.AEQbTJ(string);
        c54282xCq.KWHzl(new Function1() { // from class: o.vCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vCH.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(str, "");
        C33054mpH.copydefault(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        Function1<? super java.lang.String, Unit> function1 = this.valueOf;
        if (function1 != null) {
            function1.invoke(str);
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.KWHzl.AYXKKw();
    }

    public final void KWHzl(java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = "1,2,3,5,10,20,30,50";
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            java.lang.String str2 = (java.lang.String) obj;
            if (C33129mqd.copydefault(str2, this.gEmmrt) && C33129mqd.valueOf(str2, this.OLrzqt)) {
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
        java.lang.String str2 = this.OLrzqt;
        if (str2 == null || str2.length() == 0) {
            str2 = "2147483647";
        }
        if (C33129mqd.valueOf(str, str2)) {
            java.lang.String str3 = this.gEmmrt;
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
        getFieldNames();
    }

    public static final Unit AEQbTJ(vCH vch, ResponseData responseData) {
        AdjustLeverRequiredData adjustLeverRequiredData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            vch.djBIcL = (list == null || (adjustLeverRequiredData = (AdjustLeverRequiredData) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : adjustLeverRequiredData.getMaxAmount();
            vch.AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vCH vch, ResponseData responseData) {
        TickersData tickersData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            vch.EZpvd = (list == null || (tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : tickersData.getLast();
            vch.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}
