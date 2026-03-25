package o;

import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverageReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49827uvr;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uvs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49828uvs extends AbstractC49732uuB implements InterfaceC49827uvr.Application {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public InterfaceC58217yxC AEQbTJ;
    public C49838uwB KWHzl;
    public boolean djBIcL;
    public float OLrzqt = 0.95f;
    public int AYXKKw = 1;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uvy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C49828uvs.AEQbTJ(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.uvs$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "ContractAdjustLeverageDFragment";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.OLrzqt;
    }

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

    public static final int AEQbTJ(C49828uvs c49828uvs) {
        FragmentActivity activity = c49828uvs.getActivity();
        if (activity == null) {
            return 0;
        }
        return ContextCompat.getColor(activity, C52761wXj.Activity.fbC);
    }

    /* JADX INFO: renamed from: o.uvs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uvs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C49828uvs AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, TradePositionManager.PositionItem positionItem, java.lang.Boolean bool, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49828uvs c49828uvs = new C49828uvs();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", "FUTURES");
            bundle.putString("marginModel", str2);
            bundle.putString("posSide", str3);
            bundle.putString("lastPrice", str4);
            bundle.putParcelable("positionsItem", positionItem);
            if (bool != null) {
                bundle.putBoolean("showArbitrageTip", bool.booleanValue());
            }
            c49828uvs.setArguments(bundle);
            c49828uvs.KWHzl(function1);
            return c49828uvs;
        }

        public final C49828uvs AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, TradePositionManager.PositionItem positionItem, java.lang.Boolean bool, java.lang.String str5, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49828uvs c49828uvs = new C49828uvs();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instId", str);
            bundle.putString("instType", "SWAP");
            bundle.putString("marginModel", str2);
            bundle.putString("posSide", str3);
            bundle.putString("lastPrice", str4);
            bundle.putParcelable("positionsItem", positionItem);
            if (bool != null) {
                bundle.putBoolean("showArbitrageTip", bool.booleanValue());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str5)) {
                bundle.putString("from", str5);
            }
            c49828uvs.setArguments(bundle);
            c49828uvs.KWHzl(function1);
            return c49828uvs;
        }
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C49838uwB c49838uwB = new C49838uwB();
        this.KWHzl = c49838uwB;
        c49838uwB.copydefault(this);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            C49838uwB c49838uwB2 = this.KWHzl;
            if (c49838uwB2 == null) {
                Intrinsics.gEmmrt("");
                c49838uwB2 = null;
            }
            java.lang.String string = arguments.getString("instId", "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = arguments.getString("instType", "");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String string3 = arguments.getString("marginModel", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String string4 = arguments.getString("posSide", "");
            Intrinsics.checkNotNullExpressionValue(string4, "");
            java.lang.String string5 = arguments.getString("lastPrice", "");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            c49838uwB2.KWHzl(string, string2, string3, string4, string5, (TradePositionManager.PositionItem) arguments.getParcelable("positionsItem"));
            this.djBIcL = arguments.getBoolean("showArbitrageTip", false);
        }
        getNewProxyInstance();
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C49838uwB c49838uwB = this.KWHzl;
        C49838uwB c49838uwB2 = null;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        OLrzqt(c49838uwB.DbNXlk());
        C49838uwB c49838uwB3 = this.KWHzl;
        if (c49838uwB3 == null) {
            Intrinsics.gEmmrt("");
            c49838uwB3 = null;
        }
        C49838uwB c49838uwB4 = this.KWHzl;
        if (c49838uwB4 == null) {
            Intrinsics.gEmmrt("");
            c49838uwB4 = null;
        }
        c49838uwB3.OLrzqt(c49838uwB4.KWHzl());
        AbstractC49732uuB.refreshLeverage$default(this, null, 1, null);
        C49838uwB c49838uwB5 = this.KWHzl;
        if (c49838uwB5 == null) {
            Intrinsics.gEmmrt("");
            c49838uwB5 = null;
        }
        c49838uwB5.AEQbTJ(fetchVPNInfo());
        OLrzqt(java.lang.Boolean.valueOf(this.djBIcL));
        C49838uwB c49838uwB6 = this.KWHzl;
        if (c49838uwB6 == null) {
            Intrinsics.gEmmrt("");
            c49838uwB6 = null;
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = c49838uwB6.isConnected().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.uvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49828uvs.KWHzl(this.copydefault, (java.lang.Exception) obj);
            }
        }));
        C49838uwB c49838uwB7 = this.KWHzl;
        if (c49838uwB7 == null) {
            Intrinsics.gEmmrt("");
            c49838uwB7 = null;
        }
        C56111xwe<java.util.ArrayList<LeverageReq>> c56111xweAEQbTJ = c49838uwB7.AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweAEQbTJ.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.uvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49828uvs.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C49838uwB c49838uwB8 = this.KWHzl;
        if (c49838uwB8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49838uwB2 = c49838uwB8;
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = c49838uwB2.AYXKKw().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner3, new TaskDescription(new Function1() { // from class: o.uvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49828uvs.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit KWHzl(C49828uvs c49828uvs, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C49838uwB c49838uwB = c49828uvs.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.EZpvd(false, null, exc);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C49828uvs c49828uvs, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c49828uvs.KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C49828uvs c49828uvs, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        BizApiException bizApiException = exc instanceof BizApiException ? (BizApiException) exc : null;
        java.lang.String code = bizApiException != null ? bizApiException.getCode() : null;
        if (Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) "59103") || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) "59108")) {
            c49828uvs.values(exc.getMessage());
        } else {
            java.lang.String message = exc.getMessage();
            if (message != null) {
                C33134mqi.AEQbTJ(message);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // o.AbstractC49732uuB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fARcdN() {
        java.lang.String strCopydefault;
        C56084xwD fieldNames;
        BizInstrument suggestedInstrument$default;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C49838uwB c49838uwB = null;
        if (interfaceC54581xNrOLrzqt == null) {
            strCopydefault = null;
        } else {
            C49838uwB c49838uwB2 = this.KWHzl;
            if (c49838uwB2 == null) {
                Intrinsics.gEmmrt("");
                c49838uwB2 = null;
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c49838uwB2.OLrzqt());
            if (abstractC54531xLwOLrzqt != null) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null) {
                    C49838uwB c49838uwB3 = this.KWHzl;
                    if (c49838uwB3 == null) {
                        Intrinsics.gEmmrt("");
                        c49838uwB3 = null;
                    }
                    java.lang.String strOLrzqt = c49838uwB3.OLrzqt();
                    C49838uwB c49838uwB4 = this.KWHzl;
                    if (c49838uwB4 == null) {
                        Intrinsics.gEmmrt("");
                        c49838uwB4 = null;
                    }
                    suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, strOLrzqt, c49838uwB4.KWHzl(), null, null, 12, null);
                } else {
                    suggestedInstrument$default = null;
                }
                strCopydefault = abstractC54531xLwOLrzqt.copydefault(suggestedInstrument$default);
            }
        }
        android.os.Bundle arguments = getArguments();
        if (Intrinsics.EZpvd((java.lang.Object) "from_order_follow", (java.lang.Object) (arguments != null ? arguments.getString("from", "") : null))) {
            return true;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null && (fieldNames = interfaceC54581xNrOLrzqt3.getFieldNames()) != null && fieldNames.gEmmrt()) {
            C49838uwB c49838uwB5 = this.KWHzl;
            if (c49838uwB5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c49838uwB = c49838uwB5;
            }
            if (Intrinsics.EZpvd((java.lang.Object) "SWAP", (java.lang.Object) c49838uwB.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) "linear", (java.lang.Object) strCopydefault)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC49827uvr.Application
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (isAdded() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            copydefault(str, "", "", "");
            AkhnZx("");
            copydefault(false);
        }
    }

    @Override // o.AbstractC49732uuB
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.just("").delay(300L, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.uvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49828uvs.copydefault(this.AEQbTJ, str, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49828uvs.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49828uvs.KWHzl((java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49828uvs.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C49828uvs c49828uvs, java.lang.String str, java.lang.String str2) {
        C49838uwB c49838uwB = c49828uvs.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49838uwB c49838uwB = this.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.EZpvd(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    @Override // o.InterfaceC49827uvr.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        BizInstrument suggestedInstrument$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String str5;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String safeString$default;
        java.lang.String strGEmmrt;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLAkhnZx;
        java.lang.String str6;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLFetchVPNInfo2;
        java.lang.String safeString$default2;
        java.lang.String strEZpvd;
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (isAdded() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                C49838uwB c49838uwB = this.KWHzl;
                if (c49838uwB == null) {
                    Intrinsics.gEmmrt("");
                    c49838uwB = null;
                }
                java.lang.String strOLrzqt = c49838uwB.OLrzqt();
                C49838uwB c49838uwB2 = this.KWHzl;
                if (c49838uwB2 == null) {
                    Intrinsics.gEmmrt("");
                    c49838uwB2 = null;
                }
                suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strOLrzqt, c49838uwB2.KWHzl(), null, null, 12, null);
            } else {
                suggestedInstrument$default = null;
            }
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null) {
                C49838uwB c49838uwB3 = this.KWHzl;
                if (c49838uwB3 == null) {
                    Intrinsics.gEmmrt("");
                    c49838uwB3 = null;
                }
                abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c49838uwB3.OLrzqt());
            } else {
                abstractC54531xLwOLrzqt = null;
            }
            if (str2.length() == 0) {
                if (abstractC54531xLwOLrzqt != null) {
                    c54571xNhCreateTradeConverterWithIndex$default2 = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily == null ? "" : instFamily, null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default2 = null;
                }
                java.lang.String str7 = "-- " + (c54571xNhCreateTradeConverterWithIndex$default2 != null ? c54571xNhCreateTradeConverterWithIndex$default2.OLrzqt() : null);
                java.lang.String string = getString(C55688xof.Application.getSynchronousResult);
                Intrinsics.checkNotNullExpressionValue(string, "");
                str5 = null;
                AbstractC49732uuB.setMaxAdditionalAmt$default(this, string, str7, false, 4, null);
            } else {
                str5 = null;
                if (abstractC54531xLwOLrzqt != null) {
                    c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily == null ? "" : instFamily, null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default = null;
                }
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    C49838uwB c49838uwB4 = this.KWHzl;
                    if (c49838uwB4 == null) {
                        Intrinsics.gEmmrt("");
                        c49838uwB4 = null;
                    }
                    xMJ.Application applicationAhwBna = c49838uwB4.AhwBna();
                    if (applicationAhwBna == null || (strGEmmrt = applicationAhwBna.AYXKKw()) == null) {
                        C49838uwB c49838uwB5 = this.KWHzl;
                        if (c49838uwB5 == null) {
                            Intrinsics.gEmmrt("");
                            c49838uwB5 = null;
                        }
                        strGEmmrt = c49838uwB5.gEmmrt();
                        if (strGEmmrt == null) {
                            strGEmmrt = "";
                        }
                    }
                    c54571xNhCreateTradeConverterWithIndex$default.AhwBna(strGEmmrt);
                }
                java.lang.String str8 = (c54571xNhCreateTradeConverterWithIndex$default == null || (c54536xMLDjBIcL = c54571xNhCreateTradeConverterWithIndex$default.djBIcL(str2)) == null || (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) == null || (c54536xMLDjBIcL2 = c54536xMLIsConnected.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null)) == null) ? "" : safeString$default;
                java.lang.String string2 = getString(C55688xof.Application.getSynchronousResult);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                AbstractC49732uuB.setMaxAdditionalAmt$default(this, string2, str8, false, 4, null);
            }
            if (str3.length() == 0) {
                java.lang.String string3 = getString(C55688xof.Application.DcMfJKDCKfqP);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                KWHzl(string3, "");
            } else if (abstractC54531xLwOLrzqt != null) {
                xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily == null ? "" : instFamily);
                if (xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) == null || (c54536xMLIsConnected2 = c54536xMLAYXKKw.isConnected()) == null || (c54536xMLDjBIcL3 = c54536xMLIsConnected2.djBIcL()) == null || (c54536xMLAkhnZx = c54536xMLDjBIcL3.AkhnZx()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAkhnZx, false, 1, str5)) == null) {
                }
                java.lang.String string4 = getString(C55688xof.Application.DcMfJKDCKfqP);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                KWHzl(string4, safeString$default);
            } else {
                java.lang.String safeString$default3 = "";
                java.lang.String string42 = getString(C55688xof.Application.DcMfJKDCKfqP);
                Intrinsics.checkNotNullExpressionValue(string42, "");
                KWHzl(string42, safeString$default3);
            }
            if (str4.length() == 0) {
                if (abstractC54531xLwOLrzqt == null) {
                    strEZpvd = str5;
                } else {
                    if (instFamily == null) {
                        instFamily = "";
                    }
                    xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, str5, 2, str5);
                    if (xmvCreateSizeConverterWithIndex$default != null) {
                        strEZpvd = xmvCreateSizeConverterWithIndex$default.EZpvd();
                    }
                }
                java.lang.String string5 = getString(C55688xof.Application.ORmwhf);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                AbstractC49732uuB.setRequiredMarginContract$default(this, string5, "-- " + strEZpvd, false, 4, null);
                return;
            }
            if (abstractC54531xLwOLrzqt == null) {
                str6 = "";
            } else {
                if (instFamily == null) {
                    instFamily = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default2 = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, str5, 2, str5);
                if (xmvCreateSizeConverterWithIndex$default2 != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default2.copydefault(str4)) != null && (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) != null && (c54536xMLDjBIcL4 = c54536xMLAuCTel.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL4.fetchVPNInfo()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo2, false, 1, str5)) != null) {
                    str6 = safeString$default2;
                }
            }
            java.lang.String string6 = getString(C55688xof.Application.ORmwhf);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            AbstractC49732uuB.setRequiredMarginContract$default(this, string6, str6, false, 4, null);
        }
    }

    public static final void KWHzl(C49828uvs c49828uvs, java.lang.String str) {
        if (str == null || str.length() == 0) {
            C49838uwB c49838uwB = c49828uvs.KWHzl;
            C49838uwB c49838uwB2 = null;
            if (c49838uwB == null) {
                Intrinsics.gEmmrt("");
                c49838uwB = null;
            }
            if (c49838uwB.AkhnZx()) {
                java.lang.String string = c49828uvs.getString(C55688xof.Application.AlertController5);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c49828uvs.AkhnZx(string);
            } else {
                C49838uwB c49838uwB3 = c49828uvs.KWHzl;
                if (c49838uwB3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c49838uwB2 = c49838uwB3;
                }
                if (c49838uwB2.DbNXlk()) {
                    java.lang.String string2 = c49828uvs.getString(C55688xof.Application.Rstyleable);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c49828uvs.AkhnZx(string2);
                }
            }
        } else {
            c49828uvs.AkhnZx(str);
        }
        c49828uvs.EZpvd(false);
    }

    public static final void EZpvd(C49828uvs c49828uvs, java.lang.String str) {
        c49828uvs.AkhnZx(str);
        c49828uvs.copydefault(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(C49828uvs c49828uvs, java.lang.String str) {
        BizInstrument suggestedInstrument$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        c49828uvs.copydefault(true);
        if (C33129mqd.AEQbTJ(str) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            c49828uvs.AkhnZx("");
            return;
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C49838uwB c49838uwB = null;
        if (interfaceC54581xNrOLrzqt != null) {
            C49838uwB c49838uwB2 = c49828uvs.KWHzl;
            if (c49838uwB2 == null) {
                Intrinsics.gEmmrt("");
                c49838uwB2 = null;
            }
            java.lang.String strOLrzqt = c49838uwB2.OLrzqt();
            C49838uwB c49838uwB3 = c49828uvs.KWHzl;
            if (c49838uwB3 == null) {
                Intrinsics.gEmmrt("");
                c49838uwB3 = null;
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strOLrzqt, c49838uwB3.KWHzl(), null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            C49838uwB c49838uwB4 = c49828uvs.KWHzl;
            if (c49838uwB4 == null) {
                Intrinsics.gEmmrt("");
                c49838uwB4 = null;
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(c49838uwB4.OLrzqt());
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt == null) {
            c54536xMLCopydefault = null;
        } else {
            if (instFamily == null) {
                instFamily = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.abs(dAEQbTJ))));
            }
        }
        java.lang.String strGEmmrt = c54536xMLCopydefault != null ? c54536xMLCopydefault.gEmmrt() : null;
        if (c54536xMLCopydefault == null || (c54536xMLAuCTel = c54536xMLCopydefault.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
            safeString$default = "";
        }
        C49838uwB c49838uwB5 = c49828uvs.KWHzl;
        if (c49838uwB5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49838uwB = c49838uwB5;
        }
        if (c49838uwB.AkhnZx()) {
            if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
                int i = C49511upt.Activity.zsXlph;
                java.util.Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
                Intrinsics.copydefault(mapGEmmrt, "");
                c49828uvs.AkhnZx(C33069mpW.copydefault(c49828uvs, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt));
            } else {
                int i2 = C49511upt.Activity.hDKMBd;
                java.util.Map mapGEmmrt2 = C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
                Intrinsics.copydefault(mapGEmmrt2, "");
                c49828uvs.AkhnZx(C33069mpW.copydefault(c49828uvs, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt2));
            }
        } else if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            c49828uvs.AkhnZx("");
        } else {
            int i3 = C49511upt.Activity.AubY;
            java.util.Map mapGEmmrt3 = C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", safeString$default), C56390yDp.OLrzqt("unit", strGEmmrt));
            Intrinsics.copydefault(mapGEmmrt3, "");
            c49828uvs.AkhnZx(C33069mpW.copydefault(c49828uvs, i3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) mapGEmmrt3));
        }
        if (c49828uvs.DbNXlk().length() != 0 || C33129mqd.AEQbTJ(c49828uvs.fetchVPNInfo()) < c49828uvs.fIwbmz()) {
            return;
        }
        c49828uvs.AkhnZx(c49828uvs.fJNWhG());
    }

    @Override // o.InterfaceC49827uvr.Application
    public void copydefault(@NotNull java.lang.String str, boolean z, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) fetchVPNInfo())) {
            if (z) {
                KWHzl(this, str2);
            } else if (str2 != null && str2.length() != 0) {
                EZpvd(this, str2);
            } else {
                copydefault(this, str3);
            }
        }
    }

    public void KWHzl(boolean z) {
        Function2<java.lang.Boolean, java.lang.String, Unit> function2EjfBZ;
        dismissAllowingStateLoss();
        if (!z || (function2EjfBZ = ejfBZ()) == null) {
            return;
        }
        function2EjfBZ.invoke(java.lang.Boolean.TRUE, fetchVPNInfo());
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C49838uwB c49838uwB = this.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.EZpvd();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C49838uwB c49838uwB = this.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.copydefault();
    }

    @Override // o.AbstractC49732uuB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C49838uwB c49838uwB = this.KWHzl;
        if (c49838uwB == null) {
            Intrinsics.gEmmrt("");
            c49838uwB = null;
        }
        c49838uwB.fetchVPNInfo();
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
