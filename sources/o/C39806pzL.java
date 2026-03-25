package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39806pzL implements InterfaceC35984oKz {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public java.lang.String EZpvd;
    public AbstractC54531xLw copydefault;
    public java.lang.String AEQbTJ = "";
    public java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.pzL$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pzL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC35984oKz
    public void copydefault(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        BizInstrument bizInstrumentValueOf;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("InstId");
        java.lang.String instFamily = null;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = this.AEQbTJ;
        }
        this.AEQbTJ = str;
        java.lang.Object obj2 = map.get("InstType");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = this.KWHzl;
        }
        this.KWHzl = str2;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        AbstractC54531xLw abstractC54531xLwOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) ? null : interfaceC54581xNrOLrzqt.OLrzqt(this.KWHzl);
        this.copydefault = abstractC54531xLwOLrzqt;
        if (abstractC54531xLwOLrzqt != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.AEQbTJ)) != null) {
            instFamily = bizInstrumentValueOf.getInstFamily();
        }
        this.EZpvd = instFamily;
    }

    @Override // o.InterfaceC35984oKz
    public float AEQbTJ(float f, java.lang.String str, java.lang.String str2) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String usdToThisRate;
        if (!Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "SWAP") && !Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "FUTURES")) {
            return f;
        }
        AbstractC54531xLw abstractC54531xLw = this.copydefault;
        BizInstrument bizInstrumentValueOf = abstractC54531xLw != null ? abstractC54531xLw.valueOf(this.AEQbTJ) : null;
        AbstractC54531xLw abstractC54531xLw2 = this.copydefault;
        if (!Intrinsics.EZpvd((java.lang.Object) (abstractC54531xLw2 != null ? abstractC54531xLw2.copydefault(bizInstrumentValueOf) : null), (java.lang.Object) "inverse")) {
            return f;
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        return C33129mqd.djBIcL(java.lang.Double.valueOf(C33471mxA.EZpvd(C33129mqd.AEQbTJ(java.lang.Float.valueOf(f)), (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (mutableLiveDataBG_ = newProxyInstance.bG_()) == null || (value = mutableLiveDataBG_.getValue()) == null || (usdToThisRate = value.getUsdToThisRate()) == null) ? 1.0d : java.lang.Double.parseDouble(usdToThisRate))));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // o.InterfaceC35984oKz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String KWHzl(float f, java.lang.String str, java.lang.String str2) {
        C54536xML c54536xMLKWHzl;
        AbstractC54531xLw abstractC54531xLw = this.copydefault;
        if (abstractC54531xLw == null) {
            c54536xMLKWHzl = null;
        } else {
            java.lang.String str3 = this.EZpvd;
            if (str3 == null) {
                str3 = "";
            }
            xMS xmsGEmmrt = abstractC54531xLw.gEmmrt(str3);
            if (xmsGEmmrt != null) {
                c54536xMLKWHzl = xmsGEmmrt.KWHzl(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
            }
        }
        Intrinsics.copydefault(c54536xMLKWHzl);
        return C54536xML.toSafeString$default(c54536xMLKWHzl.djBIcL(), false, 1, null);
    }
}
