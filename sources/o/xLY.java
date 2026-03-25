package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54530xLv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xLY implements InterfaceC54530xLv {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public BizInfoConfig EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull BizInfoConfig bizInfoConfig) {
        Intrinsics.checkNotNullParameter(bizInfoConfig, "");
        this.EZpvd = bizInfoConfig;
    }

    public xLY(@NotNull BizInfoConfig bizInfoConfig) {
        Intrinsics.checkNotNullParameter(bizInfoConfig, "");
        this.EZpvd = bizInfoConfig;
    }

    public java.lang.String KWHzl() {
        return InterfaceC54530xLv.TaskDescription.copydefault(this);
    }

    public java.lang.String OLrzqt() {
        return InterfaceC54530xLv.TaskDescription.KWHzl(this);
    }

    public java.lang.String copydefault() {
        return InterfaceC54530xLv.TaskDescription.AEQbTJ(this);
    }

    public java.lang.String djBIcL() {
        return InterfaceC54530xLv.TaskDescription.OLrzqt(this);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xLY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.InterfaceC54530xLv
    public BizInstrument EZpvd() {
        BizInstrument bizInstrumentValueOf;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInfoConfig bizInfoConfig = this.EZpvd;
        if (bizInfoConfig instanceof BizInfoConfig.DefaultBizConfig) {
            return AEQbTJ();
        }
        if (!(bizInfoConfig instanceof BizInfoConfig.CustomArgsBizConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.copydefault(bizInfoConfig, "");
        BizInfoConfig.CustomArgsBizConfig customArgsBizConfig = (BizInfoConfig.CustomArgsBizConfig) bizInfoConfig;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(customArgsBizConfig.KWHzl())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(customArgsBizConfig.EZpvd())) == null) {
            bizInstrumentValueOf = null;
        }
        pUU.EZpvd("SelectBizManager", "CustomArgsBizConfig=" + (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstType() : null) + "_" + (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstId() : null));
        return bizInstrumentValueOf;
    }

    public final BizInstrument AEQbTJ() {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        BizInstrument bizInstrumentCopydefault;
        xUV xuv = xUV.EZpvd;
        java.lang.String strEZpvd = xuv.EZpvd("current_instrument_type");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strEZpvd == null ? "" : strEZpvd);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt == null) {
            pUU.KWHzl("SelectBizManager", "cache instType=" + strEZpvd + ",biz == null");
            bizInstrumentValueOf = null;
        } else {
            java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_id");
            if (strEZpvd2 == null) {
                strEZpvd2 = "";
            }
            java.lang.String strEZpvd3 = xuv.EZpvd("current_uly");
            if (strEZpvd3 == null) {
                strEZpvd3 = "";
            }
            java.lang.String strEZpvd4 = xuv.EZpvd("current_alias");
            java.lang.String str = strEZpvd4 != null ? strEZpvd4 : "";
            if ((abstractC54531xLwOLrzqt instanceof xLC) && C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd3) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                bizInstrumentValueOf = ((xLC) abstractC54531xLwOLrzqt).valueOf(strEZpvd3, str);
            } else {
                bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(strEZpvd2);
            }
        }
        if (abstractC54531xLwOLrzqt != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null) && bizInstrumentValueOf == null && (bizInstrumentCopydefault = abstractC54531xLwOLrzqt.copydefault()) != null) {
            bizInstrumentValueOf = bizInstrumentCopydefault;
        }
        pUU.EZpvd("SelectBizManager", "cache instType=" + strEZpvd + ",DefaultBizConfig=" + (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstType() : null) + "_" + (bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstId() : null));
        return bizInstrumentValueOf;
    }
}
