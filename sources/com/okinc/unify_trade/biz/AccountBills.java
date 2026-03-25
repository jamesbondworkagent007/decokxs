package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountBills {
    private String bal;
    private String balChg;
    private String billId;
    private String ccy;
    private String displayId;
    private String earnAmt;
    private String earnApr;
    private String fee;
    private String from;
    private String instId;
    private String instType;
    private String mgnMode;
    private String notes;
    private String ordId;
    private String pnl;
    private String posBal;
    private String posBalChg;
    private String postSide;
    private String ruleType;
    private String side;
    private String subType;
    private String subTypeDesc;
    private String sz;
    private String to;
    private String ts;
    private String type;
    private String typeDesc;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountBills() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.balChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.bal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.posBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.posBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.billId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.earnAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.earnApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.subType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.typeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.postSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountBills copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        return new AccountBills(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountBills)) {
            return false;
        }
        AccountBills accountBills = (AccountBills) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) accountBills.instType) && Intrinsics.EZpvd((Object) this.billId, (Object) accountBills.billId) && Intrinsics.EZpvd((Object) this.type, (Object) accountBills.type) && Intrinsics.EZpvd((Object) this.subType, (Object) accountBills.subType) && Intrinsics.EZpvd((Object) this.subTypeDesc, (Object) accountBills.subTypeDesc) && Intrinsics.EZpvd((Object) this.typeDesc, (Object) accountBills.typeDesc) && Intrinsics.EZpvd((Object) this.postSide, (Object) accountBills.postSide) && Intrinsics.EZpvd((Object) this.side, (Object) accountBills.side) && Intrinsics.EZpvd((Object) this.ts, (Object) accountBills.ts) && Intrinsics.EZpvd((Object) this.balChg, (Object) accountBills.balChg) && Intrinsics.EZpvd((Object) this.bal, (Object) accountBills.bal) && Intrinsics.EZpvd((Object) this.sz, (Object) accountBills.sz) && Intrinsics.EZpvd((Object) this.ccy, (Object) accountBills.ccy) && Intrinsics.EZpvd((Object) this.pnl, (Object) accountBills.pnl) && Intrinsics.EZpvd((Object) this.posBalChg, (Object) accountBills.posBalChg) && Intrinsics.EZpvd((Object) this.posBal, (Object) accountBills.posBal) && Intrinsics.EZpvd((Object) this.fee, (Object) accountBills.fee) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) accountBills.mgnMode) && Intrinsics.EZpvd((Object) this.instId, (Object) accountBills.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) accountBills.displayId) && Intrinsics.EZpvd((Object) this.ordId, (Object) accountBills.ordId) && Intrinsics.EZpvd((Object) this.from, (Object) accountBills.from) && Intrinsics.EZpvd((Object) this.to, (Object) accountBills.to) && Intrinsics.EZpvd((Object) this.notes, (Object) accountBills.notes) && Intrinsics.EZpvd((Object) this.ruleType, (Object) accountBills.ruleType) && Intrinsics.EZpvd((Object) this.earnAmt, (Object) accountBills.earnAmt) && Intrinsics.EZpvd((Object) this.earnApr, (Object) accountBills.earnApr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBal() {
        return this.bal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalChg() {
        return this.balChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBillId() {
        return this.billId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnAmt() {
        return this.earnAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnApr() {
        return this.earnApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosBal() {
        return this.posBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosBalChg() {
        return this.posBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPostSide() {
        return this.postSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTypeDesc() {
        return this.subTypeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeDesc() {
        return this.typeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.instType.hashCode() * 31) + this.billId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.subType.hashCode()) * 31) + this.subTypeDesc.hashCode()) * 31) + this.typeDesc.hashCode()) * 31) + this.postSide.hashCode()) * 31) + this.side.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.balChg.hashCode()) * 31) + this.bal.hashCode()) * 31) + this.sz.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.posBalChg.hashCode()) * 31) + this.posBal.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.ordId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.ruleType.hashCode()) * 31) + this.earnAmt.hashCode()) * 31) + this.earnApr.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalChg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balChg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBillId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.billId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnAmt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.earnAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnApr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.earnApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosBalChg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posBalChg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPostSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.postSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ruleType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTypeDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTypeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.typeDesc = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountBills(instType=" + this.instType + ", billId=" + this.billId + ", type=" + this.type + ", subType=" + this.subType + ", subTypeDesc=" + this.subTypeDesc + ", typeDesc=" + this.typeDesc + ", postSide=" + this.postSide + ", side=" + this.side + ", ts=" + this.ts + ", balChg=" + this.balChg + ", bal=" + this.bal + ", sz=" + this.sz + ", ccy=" + this.ccy + ", pnl=" + this.pnl + ", posBalChg=" + this.posBalChg + ", posBal=" + this.posBal + ", fee=" + this.fee + ", mgnMode=" + this.mgnMode + ", instId=" + this.instId + ", displayId=" + this.displayId + ", ordId=" + this.ordId + ", from=" + this.from + ", to=" + this.to + ", notes=" + this.notes + ", ruleType=" + this.ruleType + ", earnAmt=" + this.earnAmt + ", earnApr=" + this.earnApr + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountBills.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountBills> serializer() {
            return AccountBills$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountBills(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.billId = "";
        } else {
            this.billId = str2;
        }
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.subType = "";
        } else {
            this.subType = str4;
        }
        if ((i & 16) == 0) {
            this.subTypeDesc = "";
        } else {
            this.subTypeDesc = str5;
        }
        if ((i & 32) == 0) {
            this.typeDesc = "";
        } else {
            this.typeDesc = str6;
        }
        if ((i & 64) == 0) {
            this.postSide = "";
        } else {
            this.postSide = str7;
        }
        if ((i & 128) == 0) {
            this.side = "";
        } else {
            this.side = str8;
        }
        if ((i & 256) == 0) {
            this.ts = "";
        } else {
            this.ts = str9;
        }
        if ((i & 512) == 0) {
            this.balChg = "";
        } else {
            this.balChg = str10;
        }
        if ((i & 1024) == 0) {
            this.bal = "";
        } else {
            this.bal = str11;
        }
        if ((i & 2048) == 0) {
            this.sz = "";
        } else {
            this.sz = str12;
        }
        if ((i & 4096) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str13;
        }
        if ((i & 8192) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str14;
        }
        if ((i & 16384) == 0) {
            this.posBalChg = "";
        } else {
            this.posBalChg = str15;
        }
        if ((32768 & i) == 0) {
            this.posBal = "";
        } else {
            this.posBal = str16;
        }
        if ((65536 & i) == 0) {
            this.fee = "";
        } else {
            this.fee = str17;
        }
        if ((131072 & i) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str18;
        }
        if ((262144 & i) == 0) {
            this.instId = "";
        } else {
            this.instId = str19;
        }
        if ((524288 & i) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str20;
        }
        if ((1048576 & i) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str21;
        }
        if ((2097152 & i) == 0) {
            this.from = "";
        } else {
            this.from = str22;
        }
        if ((4194304 & i) == 0) {
            this.to = "";
        } else {
            this.to = str23;
        }
        if ((8388608 & i) == 0) {
            this.notes = "";
        } else {
            this.notes = str24;
        }
        if ((16777216 & i) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str25;
        }
        if ((33554432 & i) == 0) {
            this.earnAmt = "";
        } else {
            this.earnAmt = str26;
        }
        if ((i & 67108864) == 0) {
            this.earnApr = "";
        } else {
            this.earnApr = str27;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountBills accountBills, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountBills.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountBills.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountBills.billId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountBills.billId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountBills.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountBills.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountBills.subType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountBills.subType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountBills.subTypeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountBills.subTypeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountBills.typeDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountBills.typeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) accountBills.postSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, accountBills.postSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountBills.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountBills.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountBills.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountBills.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) accountBills.balChg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, accountBills.balChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) accountBills.bal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, accountBills.bal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) accountBills.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, accountBills.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) accountBills.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, accountBills.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) accountBills.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, accountBills.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) accountBills.posBalChg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, accountBills.posBalChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) accountBills.posBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, accountBills.posBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) accountBills.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, accountBills.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) accountBills.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, accountBills.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) accountBills.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, accountBills.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) accountBills.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, accountBills.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) accountBills.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, accountBills.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) accountBills.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, accountBills.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) accountBills.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, accountBills.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) accountBills.notes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, accountBills.notes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) accountBills.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, accountBills.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) accountBills.earnAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, accountBills.earnAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && Intrinsics.EZpvd((Object) accountBills.earnApr, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 26, accountBills.earnApr);
    }

    public AccountBills(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        this.instType = str;
        this.billId = str2;
        this.type = str3;
        this.subType = str4;
        this.subTypeDesc = str5;
        this.typeDesc = str6;
        this.postSide = str7;
        this.side = str8;
        this.ts = str9;
        this.balChg = str10;
        this.bal = str11;
        this.sz = str12;
        this.ccy = str13;
        this.pnl = str14;
        this.posBalChg = str15;
        this.posBal = str16;
        this.fee = str17;
        this.mgnMode = str18;
        this.instId = str19;
        this.displayId = str20;
        this.ordId = str21;
        this.from = str22;
        this.to = str23;
        this.notes = str24;
        this.ruleType = str25;
        this.earnAmt = str26;
        this.earnApr = str27;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x013c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:970) call: com.okinc.unify_trade.biz.AccountBills.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountBills(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27);
    }
}
