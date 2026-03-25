package com.okinc.okx.paymentapi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class ResultType {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.ResultType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResultType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static abstract class ActionBar extends ResultType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.ResultType.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
            super(null);
        }

        public static abstract class Application extends ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.ResultType.ActionBar.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final class Activity extends Application {
                public static final Activity EZpvd = new Activity();

                private Activity() {
                    super(null);
                }
            }

            private Application() {
                super(null);
            }
        }
    }

    private ResultType() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ErrorTemplateType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ErrorTemplateType[] $VALUES;
        private final int type;
        public static final ErrorTemplateType ERROR_TEMPLATE_DEFAULT = new ErrorTemplateType("ERROR_TEMPLATE_DEFAULT", 0, 0);
        public static final ErrorTemplateType ERROR_TEMPLATE_RETRY = new ErrorTemplateType("ERROR_TEMPLATE_RETRY", 1, 1);
        public static final ErrorTemplateType ERROR_TEMPLATE_EXTERNAL = new ErrorTemplateType("ERROR_TEMPLATE_EXTERNAL", 2, 2);
        public static final ErrorTemplateType ERROR_TEMPLATE_RISK = new ErrorTemplateType("ERROR_TEMPLATE_RISK", 3, 3);
        public static final ErrorTemplateType ERROR_TEMPLATE_RELINK = new ErrorTemplateType("ERROR_TEMPLATE_RELINK", 4, 4);
        public static final ErrorTemplateType ERROR_TEMPLATE_RETRY_V2 = new ErrorTemplateType("ERROR_TEMPLATE_RETRY_V2", 5, 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ErrorTemplateType[] $values() {
            return new ErrorTemplateType[]{ERROR_TEMPLATE_DEFAULT, ERROR_TEMPLATE_RETRY, ERROR_TEMPLATE_EXTERNAL, ERROR_TEMPLATE_RISK, ERROR_TEMPLATE_RELINK, ERROR_TEMPLATE_RETRY_V2};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ErrorTemplateType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        private ErrorTemplateType(String str, int i, int i2) {
            this.type = i2;
        }

        static {
            ErrorTemplateType[] errorTemplateTypeArr$values = $values();
            $VALUES = errorTemplateTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(errorTemplateTypeArr$values);
        }

        public static ErrorTemplateType valueOf(String str) {
            return (ErrorTemplateType) Enum.valueOf(ErrorTemplateType.class, str);
        }

        public static ErrorTemplateType[] values() {
            return (ErrorTemplateType[]) $VALUES.clone();
        }
    }

    public static final class ResultErrorParams implements Parcelable {
        public static final Parcelable.Creator<ResultErrorParams> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final TradeType gEmmrt;
        public final String valueOf;

        public static final class Creator implements Parcelable.Creator<ResultErrorParams> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultErrorParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ResultErrorParams(parcel.readInt() == 0 ? null : TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResultErrorParams[] newArray(int i) {
                return new ResultErrorParams[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ResultErrorParams() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeType AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResultErrorParams copydefault(TradeType tradeType, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new ResultErrorParams(tradeType, str, str2, str3, str4, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultErrorParams)) {
                return false;
            }
            ResultErrorParams resultErrorParams = (ResultErrorParams) obj;
            return this.gEmmrt == resultErrorParams.gEmmrt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) resultErrorParams.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) resultErrorParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) resultErrorParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.valueOf, (Object) resultErrorParams.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) resultErrorParams.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) resultErrorParams.AYXKKw) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) resultErrorParams.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            TradeType tradeType = this.gEmmrt;
            int iHashCode = tradeType == null ? 0 : tradeType.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            int iHashCode3 = this.copydefault.hashCode();
            String str = this.AEQbTJ;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResultErrorParams(tradeType=" + this.gEmmrt + ", depositPlatformCode=" + this.KWHzl + ", currency=" + this.copydefault + ", errorMessage=" + this.AEQbTJ + ", orderId=" + this.valueOf + ", amount=" + this.EZpvd + ", sourceErrorCode=" + this.AYXKKw + ", flow=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TradeType tradeType = this.gEmmrt;
            if (tradeType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tradeType.writeToParcel(parcel, i);
            }
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AYXKKw);
            parcel.writeString(this.OLrzqt);
        }

        public ResultErrorParams(TradeType tradeType, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.gEmmrt = tradeType;
            this.KWHzl = str;
            this.copydefault = str2;
            this.AEQbTJ = str3;
            this.valueOf = str4;
            this.EZpvd = str5;
            this.AYXKKw = str6;
            this.OLrzqt = str7;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r10v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:200) call: com.okinc.okx.paymentapi.data.ResultType.ResultErrorParams.<init>(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ResultErrorParams(TradeType tradeType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : tradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
        }
    }

    public static class Application extends ResultType {
        public final PaymentErrorData AEQbTJ;
        public final ResultErrorParams KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public Application(PaymentErrorData paymentErrorData, ResultErrorParams resultErrorParams) {
            super(null);
            this.AEQbTJ = paymentErrorData;
            this.KWHzl = resultErrorParams;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.okx.paymentapi.data.PaymentErrorData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.PaymentErrorData) : (r2v0 com.okinc.okx.paymentapi.data.PaymentErrorData))
  (wrap:com.okinc.okx.paymentapi.data.ResultType$ResultErrorParams:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.data.ResultType$ResultErrorParams) : (r3v0 com.okinc.okx.paymentapi.data.ResultType$ResultErrorParams))
 A[MD:(com.okinc.okx.paymentapi.data.PaymentErrorData, com.okinc.okx.paymentapi.data.ResultType$ResultErrorParams):void (m)] (LINE:211) call: com.okinc.okx.paymentapi.data.ResultType.Application.<init>(com.okinc.okx.paymentapi.data.PaymentErrorData, com.okinc.okx.paymentapi.data.ResultType$ResultErrorParams):void type: THIS */
        public /* synthetic */ Application(PaymentErrorData paymentErrorData, ResultErrorParams resultErrorParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : paymentErrorData, (i & 2) != 0 ? null : resultErrorParams);
        }
    }

    public static abstract class ResultButtonActionType implements Parcelable {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.data.ResultType.ResultButtonActionType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ResultButtonActionType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResultButtonActionType() {
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartBuySellOrderDetail extends ResultButtonActionType {
            public static final StartBuySellOrderDetail copydefault = new StartBuySellOrderDetail();
            public static final Parcelable.Creator<StartBuySellOrderDetail> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<StartBuySellOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuySellOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return StartBuySellOrderDetail.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuySellOrderDetail[] newArray(int i) {
                    return new StartBuySellOrderDetail[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private StartBuySellOrderDetail() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartBuySellRecurringOrderDetail extends ResultButtonActionType {
            public static final StartBuySellRecurringOrderDetail KWHzl = new StartBuySellRecurringOrderDetail();
            public static final Parcelable.Creator<StartBuySellRecurringOrderDetail> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<StartBuySellRecurringOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuySellRecurringOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return StartBuySellRecurringOrderDetail.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuySellRecurringOrderDetail[] newArray(int i) {
                    return new StartBuySellRecurringOrderDetail[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private StartBuySellRecurringOrderDetail() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartExchangeTopUpOrderDetail extends ResultButtonActionType {
            public static final Parcelable.Creator<StartExchangeTopUpOrderDetail> CREATOR = new Creator();
            public final String KWHzl;

            public static final class Creator implements Parcelable.Creator<StartExchangeTopUpOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartExchangeTopUpOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartExchangeTopUpOrderDetail(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartExchangeTopUpOrderDetail[] newArray(int i) {
                    return new StartExchangeTopUpOrderDetail[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartExchangeTopUpOrderDetail copy$default(StartExchangeTopUpOrderDetail startExchangeTopUpOrderDetail, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startExchangeTopUpOrderDetail.KWHzl;
                }
                return startExchangeTopUpOrderDetail.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartExchangeTopUpOrderDetail AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StartExchangeTopUpOrderDetail(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartExchangeTopUpOrderDetail) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((StartExchangeTopUpOrderDetail) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartExchangeTopUpOrderDetail(orderNo=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.KWHzl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartExchangeTopUpOrderDetail(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartContactSupport extends ResultButtonActionType {
            public static final StartContactSupport OLrzqt = new StartContactSupport();
            public static final Parcelable.Creator<StartContactSupport> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<StartContactSupport> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartContactSupport createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return StartContactSupport.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartContactSupport[] newArray(int i) {
                    return new StartContactSupport[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private StartContactSupport() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Dismiss extends ResultButtonActionType {
            public static final Dismiss OLrzqt = new Dismiss();
            public static final Parcelable.Creator<Dismiss> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Dismiss> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Dismiss createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Dismiss.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Dismiss[] newArray(int i) {
                    return new Dismiss[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Dismiss() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Done extends ResultButtonActionType {
            public static final Done EZpvd = new Done();
            public static final Parcelable.Creator<Done> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Done> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Done createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Done.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Done[] newArray(int i) {
                    return new Done[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Done() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class BackToPay extends ResultButtonActionType {
            public static final BackToPay OLrzqt = new BackToPay();
            public static final Parcelable.Creator<BackToPay> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<BackToPay> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BackToPay createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return BackToPay.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BackToPay[] newArray(int i) {
                    return new BackToPay[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private BackToPay() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class TryAgain extends ResultButtonActionType {
            public static final TryAgain OLrzqt = new TryAgain();
            public static final Parcelable.Creator<TryAgain> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<TryAgain> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TryAgain createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return TryAgain.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TryAgain[] newArray(int i) {
                    return new TryAgain[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private TryAgain() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartBuyRecurringOrderDetail extends ResultButtonActionType {
            public static final Parcelable.Creator<StartBuyRecurringOrderDetail> CREATOR = new Creator();
            public final String AEQbTJ;

            public static final class Creator implements Parcelable.Creator<StartBuyRecurringOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuyRecurringOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartBuyRecurringOrderDetail(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartBuyRecurringOrderDetail[] newArray(int i) {
                    return new StartBuyRecurringOrderDetail[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartBuyRecurringOrderDetail copy$default(StartBuyRecurringOrderDetail startBuyRecurringOrderDetail, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startBuyRecurringOrderDetail.AEQbTJ;
                }
                return startBuyRecurringOrderDetail.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartBuyRecurringOrderDetail OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StartBuyRecurringOrderDetail(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartBuyRecurringOrderDetail) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StartBuyRecurringOrderDetail) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartBuyRecurringOrderDetail(planId=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartBuyRecurringOrderDetail(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class TryAgainWithExtra extends ResultButtonActionType {
            public static final Parcelable.Creator<TryAgainWithExtra> CREATOR = new Creator();
            public final String AEQbTJ;
            public final String EZpvd;
            public final String KWHzl;
            public final String copydefault;

            public static final class Creator implements Parcelable.Creator<TryAgainWithExtra> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TryAgainWithExtra createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new TryAgainWithExtra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TryAgainWithExtra[] newArray(int i) {
                    return new TryAgainWithExtra[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TryAgainWithExtra copy$default(TryAgainWithExtra tryAgainWithExtra, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tryAgainWithExtra.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = tryAgainWithExtra.EZpvd;
                }
                if ((i & 4) != 0) {
                    str3 = tryAgainWithExtra.KWHzl;
                }
                if ((i & 8) != 0) {
                    str4 = tryAgainWithExtra.copydefault;
                }
                return tryAgainWithExtra.OLrzqt(str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TryAgainWithExtra OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                return new TryAgainWithExtra(str, str2, str3, str4);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TryAgainWithExtra)) {
                    return false;
                }
                TryAgainWithExtra tryAgainWithExtra = (TryAgainWithExtra) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) tryAgainWithExtra.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) tryAgainWithExtra.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tryAgainWithExtra.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tryAgainWithExtra.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TryAgainWithExtra(baseCurrency=" + this.AEQbTJ + ", baseAmount=" + this.EZpvd + ", quoteCurrency=" + this.KWHzl + ", quoteAmount=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
                parcel.writeString(this.EZpvd);
                parcel.writeString(this.KWHzl);
                parcel.writeString(this.copydefault);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TryAgainWithExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.AEQbTJ = str;
                this.EZpvd = str2;
                this.KWHzl = str3;
                this.copydefault = str4;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartDepositOrderDetail extends ResultButtonActionType {
            public static final Parcelable.Creator<StartDepositOrderDetail> CREATOR = new Creator();
            public final String AEQbTJ;
            public final String OLrzqt;

            public static final class Creator implements Parcelable.Creator<StartDepositOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartDepositOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartDepositOrderDetail(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartDepositOrderDetail[] newArray(int i) {
                    return new StartDepositOrderDetail[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartDepositOrderDetail copy$default(StartDepositOrderDetail startDepositOrderDetail, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startDepositOrderDetail.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = startDepositOrderDetail.OLrzqt;
                }
                return startDepositOrderDetail.EZpvd(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartDepositOrderDetail EZpvd(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new StartDepositOrderDetail(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartDepositOrderDetail)) {
                    return false;
                }
                StartDepositOrderDetail startDepositOrderDetail = (StartDepositOrderDetail) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) startDepositOrderDetail.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) startDepositOrderDetail.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartDepositOrderDetail(orderNo=" + this.AEQbTJ + ", tradeType=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
                parcel.writeString(this.OLrzqt);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartDepositOrderDetail(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.OLrzqt = str2;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartWithdrawOrderDetail extends ResultButtonActionType {
            public static final Parcelable.Creator<StartWithdrawOrderDetail> CREATOR = new Creator();
            public final String AEQbTJ;

            public static final class Creator implements Parcelable.Creator<StartWithdrawOrderDetail> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartWithdrawOrderDetail createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartWithdrawOrderDetail(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartWithdrawOrderDetail[] newArray(int i) {
                    return new StartWithdrawOrderDetail[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartWithdrawOrderDetail copy$default(StartWithdrawOrderDetail startWithdrawOrderDetail, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startWithdrawOrderDetail.AEQbTJ;
                }
                return startWithdrawOrderDetail.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartWithdrawOrderDetail EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StartWithdrawOrderDetail(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartWithdrawOrderDetail) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StartWithdrawOrderDetail) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartWithdrawOrderDetail(orderNo=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartWithdrawOrderDetail(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartPlaidFlow extends ResultButtonActionType {
            public static final StartPlaidFlow KWHzl = new StartPlaidFlow();
            public static final Parcelable.Creator<StartPlaidFlow> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<StartPlaidFlow> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartPlaidFlow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return StartPlaidFlow.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartPlaidFlow[] newArray(int i) {
                    return new StartPlaidFlow[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private StartPlaidFlow() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class ConvertSuccessDismissButton extends ResultButtonActionType {
            public static final ConvertSuccessDismissButton EZpvd = new ConvertSuccessDismissButton();
            public static final Parcelable.Creator<ConvertSuccessDismissButton> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<ConvertSuccessDismissButton> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConvertSuccessDismissButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return ConvertSuccessDismissButton.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConvertSuccessDismissButton[] newArray(int i) {
                    return new ConvertSuccessDismissButton[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private ConvertSuccessDismissButton() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class GoToTradingButton extends ResultButtonActionType {
            public static final GoToTradingButton OLrzqt = new GoToTradingButton();
            public static final Parcelable.Creator<GoToTradingButton> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<GoToTradingButton> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToTradingButton createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return GoToTradingButton.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToTradingButton[] newArray(int i) {
                    return new GoToTradingButton[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private GoToTradingButton() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class GoToActivity extends ResultButtonActionType {
            public static final GoToActivity AEQbTJ = new GoToActivity();
            public static final Parcelable.Creator<GoToActivity> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<GoToActivity> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToActivity createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return GoToActivity.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToActivity[] newArray(int i) {
                    return new GoToActivity[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private GoToActivity() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartTopUpFlow extends ResultButtonActionType {
            public static final Parcelable.Creator<StartTopUpFlow> CREATOR = new Creator();
            public final String AEQbTJ;

            public static final class Creator implements Parcelable.Creator<StartTopUpFlow> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartTopUpFlow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartTopUpFlow(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartTopUpFlow[] newArray(int i) {
                    return new StartTopUpFlow[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartTopUpFlow copy$default(StartTopUpFlow startTopUpFlow, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startTopUpFlow.AEQbTJ;
                }
                return startTopUpFlow.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartTopUpFlow OLrzqt(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StartTopUpFlow(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StartTopUpFlow) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StartTopUpFlow) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartTopUpFlow(baseCurrency=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartTopUpFlow(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartPaybackFlow extends ResultButtonActionType {
            public static final Parcelable.Creator<StartPaybackFlow> CREATOR = new Creator();
            public final String AEQbTJ;
            public final String KWHzl;
            public final boolean copydefault;

            public static final class Creator implements Parcelable.Creator<StartPaybackFlow> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartPaybackFlow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new StartPaybackFlow(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartPaybackFlow[] newArray(int i) {
                    return new StartPaybackFlow[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartPaybackFlow copy$default(StartPaybackFlow startPaybackFlow, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = startPaybackFlow.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = startPaybackFlow.KWHzl;
                }
                if ((i & 4) != 0) {
                    z = startPaybackFlow.copydefault;
                }
                return startPaybackFlow.KWHzl(str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartPaybackFlow KWHzl(@NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new StartPaybackFlow(str, str2, z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartPaybackFlow)) {
                    return false;
                }
                StartPaybackFlow startPaybackFlow = (StartPaybackFlow) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) startPaybackFlow.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) startPaybackFlow.KWHzl) && this.copydefault == startPaybackFlow.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartPaybackFlow(requestCurrency=" + this.AEQbTJ + ", depositPlatformCode=" + this.KWHzl + ", preselectFirst=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.AEQbTJ);
                parcel.writeString(this.KWHzl);
                parcel.writeInt(this.copydefault ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartPaybackFlow(@NotNull String str, @NotNull String str2, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.KWHzl = str2;
                this.copydefault = z;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class AddWalletPasskey extends ResultButtonActionType {
            public static final Parcelable.Creator<AddWalletPasskey> CREATOR = new Creator();
            public final String KWHzl;

            public static final class Creator implements Parcelable.Creator<AddWalletPasskey> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddWalletPasskey createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new AddWalletPasskey(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AddWalletPasskey[] newArray(int i) {
                    return new AddWalletPasskey[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ AddWalletPasskey copy$default(AddWalletPasskey addWalletPasskey, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = addWalletPasskey.KWHzl;
                }
                return addWalletPasskey.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AddWalletPasskey EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new AddWalletPasskey(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddWalletPasskey) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((AddWalletPasskey) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AddWalletPasskey(chainIndex=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.KWHzl);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddWalletPasskey(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class ContinueToDexTrade extends ResultButtonActionType {
            public static final Parcelable.Creator<ContinueToDexTrade> CREATOR = new Creator();
            public final String EZpvd;
            public final String KWHzl;

            public static final class Creator implements Parcelable.Creator<ContinueToDexTrade> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContinueToDexTrade createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new ContinueToDexTrade(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ContinueToDexTrade[] newArray(int i) {
                    return new ContinueToDexTrade[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ContinueToDexTrade copy$default(ContinueToDexTrade continueToDexTrade, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = continueToDexTrade.KWHzl;
                }
                if ((i & 2) != 0) {
                    str2 = continueToDexTrade.EZpvd;
                }
                return continueToDexTrade.AEQbTJ(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ContinueToDexTrade AEQbTJ(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ContinueToDexTrade(str, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContinueToDexTrade)) {
                    return false;
                }
                ContinueToDexTrade continueToDexTrade = (ContinueToDexTrade) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) continueToDexTrade.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) continueToDexTrade.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ContinueToDexTrade(chainIndex=" + this.KWHzl + ", tokenAddress=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.KWHzl);
                parcel.writeString(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContinueToDexTrade(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.KWHzl = str;
                this.EZpvd = str2;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class GoToDeeplink extends ResultButtonActionType {
            public static final Parcelable.Creator<GoToDeeplink> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<GoToDeeplink> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToDeeplink createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new GoToDeeplink(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GoToDeeplink[] newArray(int i) {
                    return new GoToDeeplink[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ GoToDeeplink copy$default(GoToDeeplink goToDeeplink, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = goToDeeplink.EZpvd;
                }
                return goToDeeplink.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GoToDeeplink KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new GoToDeeplink(str);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToDeeplink) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((GoToDeeplink) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GoToDeeplink(deeplink=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToDeeplink(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class StartCardFlow extends ResultButtonActionType {
            public static final StartCardFlow copydefault = new StartCardFlow();
            public static final Parcelable.Creator<StartCardFlow> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<StartCardFlow> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartCardFlow createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return StartCardFlow.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final StartCardFlow[] newArray(int i) {
                    return new StartCardFlow[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private StartCardFlow() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class ReturnToOffshoreHomeTab extends ResultButtonActionType {
            public static final ReturnToOffshoreHomeTab KWHzl = new ReturnToOffshoreHomeTab();
            public static final Parcelable.Creator<ReturnToOffshoreHomeTab> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<ReturnToOffshoreHomeTab> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReturnToOffshoreHomeTab createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return ReturnToOffshoreHomeTab.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReturnToOffshoreHomeTab[] newArray(int i) {
                    return new ReturnToOffshoreHomeTab[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private ReturnToOffshoreHomeTab() {
                super(null);
            }
        }
    }
}
