package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_positions.data.LatestRecordDto;
import com.okinc.planet.format.InstId;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public interface tEF {

    public static final class StateListAnimator implements tEF {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int copydefault = 8;
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final tRU AkhnZx;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String djBIcL;
        public final java.lang.String fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 o.tRU)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] call: o.tEF.StateListAnimator.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.tRU, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, tRU tru, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, str7, str8, tru, str9, str10, str11, str12);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final tRU DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull tRU tru, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            return new StateListAnimator(str, str2, str3, str4, str5, str6, str7, str8, tru, str9, str10, str11, str12, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) stateListAnimator.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stateListAnimator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) stateListAnimator.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) stateListAnimator.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AkhnZx, stateListAnimator.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) stateListAnimator.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) stateListAnimator.values) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) stateListAnimator.AhwBna) && InstId.copydefault(this.AYXKKw, stateListAnimator.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((this.EZpvd.hashCode() * 31) + this.DbNXlk.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + InstId.OLrzqt(this.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Item(id=" + this.EZpvd + ", price=" + this.DbNXlk + ", positionValue=" + this.valueOf + ", positionSymbol=" + this.djBIcL + ", coinName=" + this.KWHzl + ", leverage=" + this.gEmmrt + ", contentTemplate=" + this.AEQbTJ + ", coinTitleDisplay=" + this.OLrzqt + ", tradeSide=" + this.AkhnZx + ", tradeSideText=" + this.fetchVPNInfo + ", time=" + this.values + ", instType=" + this.AhwBna + ", instId=" + InstId.AEQbTJ(this.AYXKKw) + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.DbNXlk;
        }

        public StateListAnimator(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, tRU tru, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            this.EZpvd = str;
            this.DbNXlk = str2;
            this.valueOf = str3;
            this.djBIcL = str4;
            this.KWHzl = str5;
            this.gEmmrt = str6;
            this.AEQbTJ = str7;
            this.OLrzqt = str8;
            this.AkhnZx = tru;
            this.fetchVPNInfo = str9;
            this.values = str10;
            this.AhwBna = str11;
            this.AYXKKw = str12;
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tEF.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final tEF OLrzqt(@NotNull LatestRecordDto latestRecordDto) {
                java.lang.String str;
                java.lang.String str2;
                kotlin.Pair pairOLrzqt;
                java.lang.String strAYXKKw;
                java.lang.String str3;
                Triple triple;
                Triple triple2;
                AbstractC54531xLw abstractC54531xLwOLrzqt;
                IdxConfig idxConfigAkhnZx;
                Intrinsics.checkNotNullParameter(latestRecordDto, "");
                InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
                tRU truCopydefault = tRQ.copydefault(latestRecordDto.getInstType(), latestRecordDto.getPosSide(), latestRecordDto.getSide());
                java.lang.String leverage$default = C46367tRs.formatLeverage$default(latestRecordDto.m6988getLever8XBoXJE(), false, 2, null);
                kotlin.Pair allUserTradeSide$default = tIX.getAllUserTradeSide$default(tIX.KWHzl, null, latestRecordDto.getInstType(), latestRecordDto.getSide(), latestRecordDto.getPosSide(), 1, null);
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) latestRecordDto.m6986getFillTime8XBoXJE())) {
                    str2 = "--";
                } else {
                    long jValueOf = C33129mqd.valueOf(latestRecordDto.m6986getFillTime8XBoXJE());
                    if (OLrzqt(new Date(jValueOf))) {
                        str = pTA.format$default(new Date(jValueOf), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
                    } else {
                        str = pTA.format$default(new Date(jValueOf), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
                    }
                    str2 = str;
                }
                java.lang.String strKWHzl = tRQ.KWHzl(latestRecordDto.m6987getInstIdy_k7uyA(), latestRecordDto.getInstType(), Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "FUTURES"));
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, latestRecordDto.getInstType(), latestRecordDto.m6987getInstIdy_k7uyA(), null, null, 12, null) : null;
                java.lang.String strTakeNonBlankTradeQuoteCcy = latestRecordDto.takeNonBlankTradeQuoteCcy();
                if (strTakeNonBlankTradeQuoteCcy == null) {
                    strTakeNonBlankTradeQuoteCcy = suggestedInstrument$default != null ? suggestedInstrument$default.getDisplayQuoteSymbol() : null;
                    if (strTakeNonBlankTradeQuoteCcy == null) {
                        strTakeNonBlankTradeQuoteCcy = latestRecordDto.getQuoteName();
                    }
                }
                if (interfaceC54581xNrEZpvd == null) {
                    triple2 = new Triple(C56390yDp.OLrzqt("--", "--"), "--", "--");
                } else {
                    if (Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "OPTION")) {
                        java.lang.String instType = latestRecordDto.getInstType();
                        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "OPTION")) {
                            java.lang.String strEZpvd = EZpvd(latestRecordDto.m6992getValue8XBoXJE());
                            java.lang.String upperCase = latestRecordDto.getBaseName().toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            pairOLrzqt = C56390yDp.OLrzqt(strEZpvd, upperCase);
                        } else if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SPOT")) {
                            java.lang.String strEZpvd2 = EZpvd(latestRecordDto.m6992getValue8XBoXJE());
                            java.lang.String upperCase2 = strTakeNonBlankTradeQuoteCcy.toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                            pairOLrzqt = C56390yDp.OLrzqt(strEZpvd2, upperCase2);
                        } else {
                            java.lang.String strEZpvd3 = EZpvd(latestRecordDto.m6992getValue8XBoXJE());
                            java.lang.String upperCase3 = latestRecordDto.getQuoteName().toUpperCase(java.util.Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                            pairOLrzqt = C56390yDp.OLrzqt(strEZpvd3, upperCase3);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "OPTION")) {
                            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.RZNAhV);
                        } else {
                            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.RTWSvT);
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "MARGIN")) {
                            str3 = strKWHzl + " " + leverage$default;
                        } else {
                            str3 = strKWHzl;
                        }
                        triple = new Triple(pairOLrzqt, strAYXKKw, str3);
                    } else if (Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) latestRecordDto.getInstType(), (java.lang.Object) "SWAP")) {
                        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
                        java.lang.String marginDig = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(latestRecordDto.getInstType())) == null || (idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(latestRecordDto.getInstFamily())) == null) ? null : idxConfigAkhnZx.getMarginDig();
                        C54536xML c54536xMLIsConnected = new C54571xNh().isConnected(C33129mqd.gEmmrt(PlanetNumericString.OLrzqt(latestRecordDto.m6992getValue8XBoXJE())));
                        if (marginDig == null || marginDig.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) marginDig)) {
                            marginDig = "2";
                        }
                        triple = new Triple(C56390yDp.OLrzqt(C54536xML.toSafeString$default(c54536xMLIsConnected.EZpvd(marginDig).djBIcL(), false, 1, null), latestRecordDto.getQuoteName()), C33070mpX.AYXKKw(C47501trL.Fragment.RZNAhV), strKWHzl + " " + leverage$default);
                    } else {
                        triple2 = new Triple(C56390yDp.OLrzqt("--", "--"), "--", "--");
                    }
                    triple2 = triple;
                }
                kotlin.Pair pair = (kotlin.Pair) triple2.component1();
                return new StateListAnimator(latestRecordDto.getOrdId(), tRR.AEQbTJ(latestRecordDto.m6985getAvgPx8XBoXJE(), latestRecordDto.getInstType(), latestRecordDto.m6987getInstIdy_k7uyA(), truCopydefault, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : false), (java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond(), strKWHzl, leverage$default, (java.lang.String) triple2.component2(), (java.lang.String) triple2.component3(), truCopydefault, (java.lang.String) allUserTradeSide$default.getFirst(), str2, latestRecordDto.getInstType(), latestRecordDto.m6987getInstIdy_k7uyA(), null);
            }

            public final java.lang.String EZpvd(java.lang.String str) {
                java.lang.String iCUNumber$default;
                BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(str);
                return (bigDecimalFARcdN == null || (iCUNumber$default = pTB.formatICUNumber$default(bigDecimalFARcdN, null, C38307pTy.Companion.EZpvd(2), null, null, 13, null)) == null) ? "--" : iCUNumber$default;
            }

            public final boolean OLrzqt(Date date) {
                Calendar calendar = Calendar.getInstance();
                int i = calendar.get(1);
                calendar.setTime(date);
                return i == calendar.get(1);
            }
        }
    }

    public static final class TaskDescription implements tEF {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }
}
