package com.okinc.tradeapi.bean;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ParamBuilder implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ParamBuilder> CREATOR = new Creator();
    private final Bundle bundle;
    private final String from;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final Boolean isCopyTrading;
    private Boolean isCountDown;
    private final boolean isForceTrade;
    private final boolean isManual;
    private final boolean isOptionType;
    private final Boolean isPreMarket;
    private final boolean isScrollTop;
    private final boolean isSwitchCoin;
    private final RouteData routeData;
    private final String strategyType;

    public static final class Creator implements Parcelable.Creator<ParamBuilder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParamBuilder createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            RouteData routeDataCreateFromParcel = parcel.readInt() == 0 ? null : RouteData.CREATOR.createFromParcel(parcel);
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Bundle bundle = parcel.readBundle(ParamBuilder.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ParamBuilder(z, string, z2, string2, string3, routeDataCreateFromParcel, z3, z4, z5, string4, boolValueOf, bundle, boolValueOf2, boolValueOf3, parcel.readString(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParamBuilder[] newArray(int i) {
            return new ParamBuilder[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.okinc.tradeapi.bean.ParamBuilder$ActionBar) A[MD:(com.okinc.tradeapi.bean.ParamBuilder$ActionBar):void (m)] call: com.okinc.tradeapi.bean.ParamBuilder.<init>(com.okinc.tradeapi.bean.ParamBuilder$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParamBuilder(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 boolean)
  (r2v0 java.lang.String)
  (r3v0 boolean)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 com.okinc.tradeapi.bean.RouteData)
  (r7v0 boolean)
  (r8v0 boolean)
  (r9v0 boolean)
  (r10v0 java.lang.String)
  (r11v0 java.lang.Boolean)
  (r12v0 android.os.Bundle)
  (r13v0 java.lang.Boolean)
  (r14v0 java.lang.Boolean)
  (r15v0 java.lang.String)
 A[MD:(boolean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.tradeapi.bean.RouteData, boolean, boolean, boolean, java.lang.String, java.lang.Boolean, android.os.Bundle, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] call: com.okinc.tradeapi.bean.ParamBuilder.<init>(boolean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.tradeapi.bean.RouteData, boolean, boolean, boolean, java.lang.String, java.lang.Boolean, android.os.Bundle, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParamBuilder(boolean z, String str, boolean z2, String str2, String str3, RouteData routeData, boolean z3, boolean z4, boolean z5, String str4, Boolean bool, Bundle bundle, Boolean bool2, Boolean bool3, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, str2, str3, routeData, z3, z4, z5, str4, bool, bundle, bool2, bool3, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getBundle() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
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
    public final RouteData getRouteData() {
        return this.routeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCopyTrading() {
        return this.isCopyTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isCountDown() {
        return this.isCountDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isForceTrade() {
        return this.isForceTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isManual() {
        return this.isManual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOptionType() {
        return this.isOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isPreMarket() {
        return this.isPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isScrollTop() {
        return this.isScrollTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSwitchCoin() {
        return this.isSwitchCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDown(Boolean bool) {
        this.isCountDown = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isManual ? 1 : 0);
        parcel.writeString(this.strategyType);
        parcel.writeInt(this.isOptionType ? 1 : 0);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        RouteData routeData = this.routeData;
        if (routeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            routeData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isForceTrade ? 1 : 0);
        parcel.writeInt(this.isSwitchCoin ? 1 : 0);
        parcel.writeInt(this.isScrollTop ? 1 : 0);
        parcel.writeString(this.instFamily);
        Boolean bool = this.isCountDown;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeBundle(this.bundle);
        Boolean bool2 = this.isCopyTrading;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isPreMarket;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.from);
    }

    private ParamBuilder(boolean z, String str, boolean z2, String str2, String str3, RouteData routeData, boolean z3, boolean z4, boolean z5, String str4, Boolean bool, Bundle bundle, Boolean bool2, Boolean bool3, String str5) {
        this.isManual = z;
        this.strategyType = str;
        this.isOptionType = z2;
        this.instId = str2;
        this.instType = str3;
        this.routeData = routeData;
        this.isForceTrade = z3;
        this.isSwitchCoin = z4;
        this.isScrollTop = z5;
        this.instFamily = str4;
        this.isCountDown = bool;
        this.bundle = bundle;
        this.isCopyTrading = bool2;
        this.isPreMarket = bool3;
        this.from = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (r19v0 boolean)
  (r20v0 java.lang.String)
  (r21v0 boolean)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 com.okinc.tradeapi.bean.RouteData)
  (r25v0 boolean)
  (r26v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (r28v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 android.os.Bundle)
  (r31v0 java.lang.Boolean)
  (r32v0 java.lang.Boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(boolean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.tradeapi.bean.RouteData, boolean, boolean, boolean, java.lang.String, java.lang.Boolean, android.os.Bundle, java.lang.Boolean, java.lang.Boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.tradeapi.bean.ParamBuilder.<init>(boolean, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.tradeapi.bean.RouteData, boolean, boolean, boolean, java.lang.String, java.lang.Boolean, android.os.Bundle, java.lang.Boolean, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ParamBuilder(boolean z, String str, boolean z2, String str2, String str3, RouteData routeData, boolean z3, boolean z4, boolean z5, String str4, Boolean bool, Bundle bundle, Boolean bool2, Boolean bool3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, str2, str3, routeData, z3, z4, (i & 256) != 0 ? false : z5, str4, (i & 1024) != 0 ? Boolean.FALSE : bool, bundle, bool2, bool3, (i & 16384) != 0 ? "" : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ParamBuilder(ActionBar actionBar) {
        boolean zAkhnZx = actionBar.AkhnZx();
        String strAYXKKw = actionBar.AYXKKw();
        boolean zIsConnected = actionBar.isConnected();
        String strCopydefault = actionBar.copydefault();
        String strGEmmrt = actionBar.gEmmrt();
        RouteData routeDataAhwBna = actionBar.AhwBna();
        boolean zDbNXlk = actionBar.DbNXlk();
        boolean zFJNWhG = actionBar.fJNWhG();
        boolean zValues = actionBar.values();
        String strOLrzqt = actionBar.OLrzqt();
        boolean zValueOf = actionBar.valueOf();
        this(zAkhnZx, strAYXKKw, zIsConnected, strCopydefault, strGEmmrt, routeDataAhwBna, zDbNXlk, zFJNWhG, zValues, strOLrzqt, Boolean.valueOf(zValueOf), actionBar.KWHzl(), actionBar.djBIcL(), actionBar.fetchVPNInfo(), actionBar.AEQbTJ());
    }

    public String toString() {
        return "isManual:" + this.isManual + ",strategyType:" + this.strategyType + ",isOptionType:" + this.isOptionType + ",instId:" + this.instId + ",instType:" + this.instType + ",routeData:" + this.routeData + ",isForceTrade:" + this.isForceTrade + ",isSwitchCoin" + this.isSwitchCoin + "isScrollTop:" + this.isScrollTop + ",instFamily:" + this.instFamily + ",from:" + this.from + ",isPreMarket:" + this.isPreMarket;
    }

    public static final class ActionBar {
        public Bundle AEQbTJ;
        public Boolean AYXKKw;
        public boolean AhwBna;
        public boolean DbNXlk;
        public Boolean fetchVPNInfo;
        public boolean gEmmrt;
        public RouteData isConnected;
        public boolean djBIcL = true;
        public String AkhnZx = "";
        public String copydefault = "";
        public String EZpvd = "";
        public boolean valueOf = true;
        public boolean values = true;
        public String OLrzqt = "";
        public String KWHzl = "";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z) {
            this.AhwBna = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RouteData AhwBna() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(String str) {
            this.OLrzqt = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(boolean z) {
            this.values = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Bundle KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(boolean z) {
            this.djBIcL = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AkhnZx = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "");
            this.AEQbTJ = bundle;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(boolean z) {
            this.DbNXlk = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fJNWhG() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.DbNXlk;
        }

        public final ActionBar OLrzqt(boolean z) {
            this.fetchVPNInfo = Boolean.valueOf(z);
            return this;
        }

        public final ParamBuilder EZpvd() {
            return new ParamBuilder(this, null);
        }
    }
}
