package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.common.model.TextColor;
import com.okinc.tradingbot.impl.dto.NumericString;
import com.okinc.tradingbot.impl.planet.domain.BotDisplayName;
import com.okinc.tradingbot.impl.planet.dto.BotDirection;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import com.okinc.tradingbot.impl.planet.model.BotUiExtras;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import com.okinc.tradingbot.impl.planet.model.PlanetBotMetadata;
import java.math.RoundingMode;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C53667wpn;
import o.C53669wpp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53671wpr extends vNA<ActionBar, BotUiState> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final C53667wpn AEQbTJ;
    public final C53665wpl copydefault;

    @yCM
    public C53671wpr(@NotNull C53665wpl c53665wpl, @NotNull C53667wpn c53667wpn) {
        Intrinsics.checkNotNullParameter(c53665wpl, "");
        Intrinsics.checkNotNullParameter(c53667wpn, "");
        this.copydefault = c53665wpl;
        this.AEQbTJ = c53667wpn;
    }

    /* JADX INFO: renamed from: o.wpr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wpr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53671wpr OLrzqt() {
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC51009vet.class)).invokespecialRtjmuc();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.vNA
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BotUiState KWHzl(@NotNull ActionBar actionBar) {
        java.lang.Object objM7377constructorimpl;
        BotDirection botDirection;
        Intrinsics.checkNotNullParameter(actionBar, "");
        PlanetBotMetadata planetBotMetadataOLrzqt = actionBar.OLrzqt();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(planetBotMetadataOLrzqt.AkhnZx());
        if (str == null) {
            str = "";
        }
        BotDisplayName botDisplayNameOLrzqt = OLrzqt(planetBotMetadataOLrzqt, str);
        int iAhwBna = C33129mqd.AhwBna(actionBar.OLrzqt().ejfBZ());
        TextColor textColorCopydefault = TextColor.Companion.copydefault(NumericString.AEQbTJ(C33129mqd.gEmmrt(C33129mqd.EZpvd(planetBotMetadataOLrzqt.fIwbmz()).setScale(2, RoundingMode.UP))));
        java.lang.String iCUNumber$default = pTB.formatICUNumber$default(C33129mqd.EZpvd(planetBotMetadataOLrzqt.fetchVPNInfo()), null, C38307pTy.Companion.EZpvd(iAhwBna), DisplaySign.EXCEPT_ZERO, null, 9, null);
        java.lang.String strCopydefault = C56068xvo.copydefault.copydefault(planetBotMetadataOLrzqt.fIwbmz(), true);
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = EZpvd(planetBotMetadataOLrzqt.copydefault());
        java.lang.String str2 = mapEZpvd.get("last");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String localized$default = str2.length() == 0 ? "--" : pTB.formatLocalized$default(str2, null, 1, null);
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(mapEZpvd.get("runtime"));
        java.lang.String strCopydefault2 = wUB.copydefault(C33129mqd.valueOf(C33129mqd.subS$default(pairOLrzqt.component1(), pairOLrzqt.component2(), null, null, null, 14, null)));
        java.util.List<java.lang.String> listAkhnZx = planetBotMetadataOLrzqt.AkhnZx();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAkhnZx, 10));
        int i = 0;
        for (java.lang.Object obj : listAkhnZx) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str3 = (java.lang.String) obj;
            java.lang.String strAEQbTJ = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(planetBotMetadataOLrzqt.valueOf(), i);
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            if (strAEQbTJ.length() == 0) {
                C53669wpp.Application application = C53669wpp.Companion;
                java.lang.String strCopydefault3 = o.TaskDescription.AEQbTJ(str3).copydefault();
                if (strCopydefault3.length() != 0) {
                    str3 = strCopydefault3;
                }
                strAEQbTJ = application.AEQbTJ(str3);
            }
            arrayList.add(strAEQbTJ);
            i++;
        }
        java.lang.String str4 = mapEZpvd.get(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE);
        java.lang.String str5 = mapEZpvd.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        if (str5 != null) {
            try {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(BotDirection.Companion.EZpvd(str5));
            } catch (java.lang.Throwable th) {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.OLrzqt("MapPlanetBotMetadataToBotUiStateUseCase", "Failed to parse bot direction: " + str5, thM7380exceptionOrNullimpl);
            }
            botDirection = (BotDirection) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        } else {
            botDirection = null;
        }
        return new BotUiState(planetBotMetadataOLrzqt.EZpvd(), str, planetBotMetadataOLrzqt.isConnected(), botDisplayNameOLrzqt, iCUNumber$default, strCopydefault, textColorCopydefault, strCopydefault2, planetBotMetadataOLrzqt.DbNXlk(), localized$default, actionBar.copydefault(), arrayList, this.copydefault.AEQbTJ(new C53598woX(str, planetBotMetadataOLrzqt.isConnected(), planetBotMetadataOLrzqt.OLrzqt(), str4, botDirection)), planetBotMetadataOLrzqt.OLrzqt(), actionBar.EZpvd(), actionBar.AEQbTJ(), KWHzl(planetBotMetadataOLrzqt.OLrzqt(), mapEZpvd), actionBar.OLrzqt());
    }

    public final BotDisplayName OLrzqt(PlanetBotMetadata planetBotMetadata, java.lang.String str) {
        java.lang.String strValues = planetBotMetadata.values();
        if (strValues.length() > 0) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strValues, JsonPointer.SEPARATOR, 0, false, 6, (java.lang.Object) null);
            int i = 0;
            for (int i2 = 0; i2 < strValues.length(); i2++) {
                if (strValues.charAt(i2) == '/') {
                    i++;
                }
            }
            if (iIndexOf$default > 0 && i == 1) {
                java.lang.String strAkhnZx = C59454zhO.AkhnZx(strValues, iIndexOf$default);
                java.lang.String strSubstring = strValues.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                if (strAkhnZx.length() > 0 && strSubstring.length() > 0) {
                    return new BotDisplayName.PartialHighlight(strAkhnZx, " / " + strSubstring);
                }
            }
            return new BotDisplayName.Plain(strValues);
        }
        return this.AEQbTJ.AEQbTJ(new C53667wpn.StateListAnimator(planetBotMetadata.OLrzqt(), str, planetBotMetadata.isConnected(), str, planetBotMetadata.AkhnZx(), planetBotMetadata.values()));
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd(java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll((java.util.Map) it.next());
        }
        return linkedHashMap;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() == 2) {
            return C56390yDp.OLrzqt(listSplit$default.get(0), listSplit$default.get(1));
        }
        return C56390yDp.OLrzqt("", "");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvS.getRecurringTime$default(o.xvS, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):java.lang.String */
    public final BotUiExtras KWHzl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2;
        java.lang.Long fieldNames;
        java.lang.String simpleDateTime$default;
        int iHashCode = str.hashCode();
        str2 = "";
        if (iHashCode != -1086683216) {
            if (iHashCode != -557961837) {
                if (iHashCode == 1165749981 && str.equals("recurring")) {
                    java.lang.String str3 = map.get("recurringInfo");
                    java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) (str3 == null ? "" : str3), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                    java.lang.String str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 0);
                    java.lang.String str5 = str4 == null ? "" : str4;
                    java.lang.String str6 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
                    java.lang.String str7 = str6 == null ? "" : str6;
                    java.lang.String str8 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 2);
                    java.lang.String str9 = str8 == null ? "" : str8;
                    java.lang.String str10 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 3);
                    return new BotUiExtras.RecurringBuy(C56046xvS.AEQbTJ.copydefault(str5, str7, str10 == null ? "" : str10, str9, (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? "" : null));
                }
            } else if (str.equals("smart_arbitrage")) {
                java.lang.String str11 = map.get("apy");
                return new BotUiExtras.SmartArbitrage(pTB.formatICUPercent$default(C33129mqd.EZpvd(str11 != null ? str11 : ""), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null));
            }
        } else if (str.equals("signal_bot")) {
            java.lang.String str12 = map.get("triggerTime");
            if (str12 != null && (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str12)) != null && (simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(fieldNames.longValue()), null, 1, null)) != null) {
                str2 = simpleDateTime$default;
            }
            return new BotUiExtras.SignalBot(str2);
        }
        return BotUiExtras.Nothing.EZpvd;
    }

    /* JADX INFO: renamed from: o.wpr$ActionBar */
    public static final class ActionBar {
        public final BotDisplayType AEQbTJ;
        public final boolean EZpvd;
        public final PlanetBotMetadata KWHzl;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, PlanetBotMetadata planetBotMetadata, boolean z, BotDisplayType botDisplayType, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planetBotMetadata = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                z = actionBar.EZpvd;
            }
            if ((i & 4) != 0) {
                botDisplayType = actionBar.AEQbTJ;
            }
            if ((i & 8) != 0) {
                z2 = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(planetBotMetadata, z, botDisplayType, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BotDisplayType EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PlanetBotMetadata OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull PlanetBotMetadata planetBotMetadata, boolean z, @NotNull BotDisplayType botDisplayType, boolean z2) {
            Intrinsics.checkNotNullParameter(planetBotMetadata, "");
            Intrinsics.checkNotNullParameter(botDisplayType, "");
            return new ActionBar(planetBotMetadata, z, botDisplayType, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.EZpvd == actionBar.EZpvd && this.AEQbTJ == actionBar.AEQbTJ && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(metadata=" + this.KWHzl + ", isSelected=" + this.EZpvd + ", displayType=" + this.AEQbTJ + ", showTradeCTA=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull PlanetBotMetadata planetBotMetadata, boolean z, @NotNull BotDisplayType botDisplayType, boolean z2) {
            Intrinsics.checkNotNullParameter(planetBotMetadata, "");
            Intrinsics.checkNotNullParameter(botDisplayType, "");
            this.KWHzl = planetBotMetadata;
            this.EZpvd = z;
            this.AEQbTJ = botDisplayType;
            this.OLrzqt = z2;
        }
    }
}
