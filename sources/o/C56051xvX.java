package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56051xvX {
    public static final C56051xvX AEQbTJ = new C56051xvX();

    private C56051xvX() {
    }

    public static /* synthetic */ java.lang.String getSmartArbProfit$default(C56051xvX c56051xvX, java.lang.String str, BizInstrument bizInstrument, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c56051xvX.EZpvd(str, bizInstrument, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str, BizInstrument bizInstrument, boolean z, boolean z2) {
        java.lang.String fundingFeeDig;
        java.lang.String instType;
        java.lang.String instId;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SWAP")) == null) {
            fundingFeeDig = null;
        } else {
            if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                fundingFeeDig = idxConfigAkhnZx.getFundingFeeDig();
            }
        }
        return C56068xvo.copydefault.AEQbTJ((bizInstrument == null || (instId = bizInstrument.getInstId()) == null) ? "" : instId, (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) ? "" : instType, str == null ? "" : str, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : z2, (536 & 64) != 0 ? false : z, (536 & 128) != 0 ? null : fundingFeeDig, (536 & 256) != 0 ? RoundingMode.FLOOR : RoundingMode.FLOOR, (536 & 512) != 0 ? null : null);
    }

    public final BizInstrument copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null) {
            return null;
        }
        return abstractC54531xLwOLrzqt.DbNXlk(str);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsListLabelData> KWHzl(SmartArbPlanLeg smartArbPlanLeg, boolean z) {
        java.lang.String strAYXKKw;
        java.util.ArrayList<TacticsListLabelData> arrayList = new java.util.ArrayList<>();
        java.lang.String lever = smartArbPlanLeg != null ? smartArbPlanLeg.getLever() : null;
        if (lever == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lever)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dispose);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryKtrememberLauncherForActivityResultkey1);
        }
        arrayList.add(new TacticsListLabelData(strAYXKKw, false, 6, 0, 0, 26, null));
        if (z) {
            TacticsListLabelData tacticsListLabelDataCopydefault = copydefault(smartArbPlanLeg);
            if (tacticsListLabelDataCopydefault != null) {
                arrayList.add(tacticsListLabelDataCopydefault);
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.Object) (smartArbPlanLeg != null ? smartArbPlanLeg.getPos() : null), (java.lang.Object) 0)) {
                if (C33129mqd.OLrzqt((java.lang.Object) (smartArbPlanLeg != null ? smartArbPlanLeg.getStakePos() : null), (java.lang.Object) 0)) {
                    arrayList.add(new TacticsListLabelData(C33070mpX.AYXKKw(C55688xof.Application.getSmallIconId), false, 6, 0, 0, 26, null));
                }
            } else {
                TacticsListLabelData tacticsListLabelDataCopydefault2 = copydefault(smartArbPlanLeg);
                if (tacticsListLabelDataCopydefault2 != null) {
                    arrayList.add(tacticsListLabelDataCopydefault2);
                }
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList<TacticsListLabelData> copydefault(SmartArbPlanLeg smartArbPlanLeg, boolean z) {
        java.util.ArrayList<TacticsListLabelData> arrayList = new java.util.ArrayList<>();
        arrayList.add(new TacticsListLabelData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerlambda0), false, 6, 0, 0, 26, null));
        if (z) {
            TacticsListLabelData tacticsListLabelDataCopydefault = copydefault(smartArbPlanLeg);
            if (tacticsListLabelDataCopydefault != null) {
                arrayList.add(tacticsListLabelDataCopydefault);
            }
        } else {
            if (C33129mqd.OLrzqt((java.lang.Object) (smartArbPlanLeg != null ? smartArbPlanLeg.getPos() : null), (java.lang.Object) 0)) {
                arrayList.add(new TacticsListLabelData(C33070mpX.AYXKKw(C55688xof.Application.getSmallIconId), false, 6, 0, 0, 26, null));
            } else {
                TacticsListLabelData tacticsListLabelDataCopydefault2 = copydefault(smartArbPlanLeg);
                if (tacticsListLabelDataCopydefault2 != null) {
                    arrayList.add(tacticsListLabelDataCopydefault2);
                }
            }
        }
        return arrayList;
    }

    public final TacticsListLabelData copydefault(SmartArbPlanLeg smartArbPlanLeg) {
        java.lang.String first;
        if (smartArbPlanLeg == null) {
            return null;
        }
        java.lang.String side = smartArbPlanLeg.getSide();
        if (side == null) {
            side = "";
        }
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairEZpvd = EZpvd(side);
        java.lang.String botLever$default = C56033xvF.getBotLever$default(smartArbPlanLeg.getLever(), false, 2, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botLever$default)) {
            first = pairEZpvd.getFirst();
        } else {
            first = ((java.lang.Object) pairEZpvd.getFirst()) + " " + botLever$default;
        }
        return new TacticsListLabelData(first, false, C56033xvF.AEQbTJ(pairEZpvd.getSecond().booleanValue()), 0, 0, 26, null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.Boolean> EZpvd(java.lang.String str) {
        if (C59449zhJ.gEmmrt(str, "buy", true)) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume), java.lang.Boolean.TRUE);
        }
        return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl), java.lang.Boolean.FALSE);
    }

    public static /* synthetic */ java.util.List getDataList$default(C56051xvX c56051xvX, SmartArbPlanLeg smartArbPlanLeg, SmartArbPlanLeg smartArbPlanLeg2, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        return c56051xvX.copydefault(smartArbPlanLeg, smartArbPlanLeg2, z, z2, str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xwa.AEQbTJ(com.okinc.unify_trade.biz.SmartArbPlanLeg, com.okinc.unify_trade.biz.BizInstrument):com.okinc.unify_trade.bot.data.TacticsInsideItemData */
    public final java.util.List<TacticsInsideItemData> copydefault(SmartArbPlanLeg smartArbPlanLeg, SmartArbPlanLeg smartArbPlanLeg2, boolean z, boolean z2, java.lang.String str) {
        BizInstrument suggestedInstrument$default;
        java.lang.String instType;
        java.lang.String instType2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default2 = null;
        if (interfaceC54581xNrOLrzqt != null) {
            if (smartArbPlanLeg == null || (instType2 = smartArbPlanLeg.getInstType()) == null) {
                instType2 = "";
            }
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType2, smartArbPlanLeg != null ? smartArbPlanLeg.getInstId() : null, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, (smartArbPlanLeg2 == null || (instType = smartArbPlanLeg2.getInstType()) == null) ? "" : instType, smartArbPlanLeg2 != null ? smartArbPlanLeg2.getInstId() : null, null, null, 12, null);
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(C56107xwa.gEmmrt(smartArbPlanLeg, suggestedInstrument$default));
        listOLrzqt.add(C56107xwa.AkhnZx(smartArbPlanLeg2, suggestedInstrument$default2));
        listOLrzqt.add(C56107xwa.AhwBna(smartArbPlanLeg, suggestedInstrument$default));
        listOLrzqt.add(C56107xwa.isConnected(smartArbPlanLeg2, suggestedInstrument$default2));
        listOLrzqt.add(C56107xwa.valueOf(smartArbPlanLeg, suggestedInstrument$default));
        listOLrzqt.add(C56107xwa.values(smartArbPlanLeg2, suggestedInstrument$default2));
        if (!z && z2) {
            listOLrzqt.add(C56107xwa.AEQbTJ(smartArbPlanLeg, str));
            listOLrzqt.add(C56107xwa.EZpvd(smartArbPlanLeg2, str));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}
