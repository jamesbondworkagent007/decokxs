package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SpotSearchTraderResponseBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String aum;
    private final String defaultHeadPictureId;
    private final String headPicture;
    private final String incomeRate;
    private final String jumpParam;
    private final String nickNameCn;
    private final String nickNameEn;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchTraderResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.incomeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickNameCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nickNameEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.headPicture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultHeadPictureId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.aum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchTraderResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new SpotSearchTraderResponseBean(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotSearchTraderResponseBean)) {
            return false;
        }
        SpotSearchTraderResponseBean spotSearchTraderResponseBean = (SpotSearchTraderResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.incomeRate, (Object) spotSearchTraderResponseBean.incomeRate) && Intrinsics.EZpvd((Object) this.jumpParam, (Object) spotSearchTraderResponseBean.jumpParam) && Intrinsics.EZpvd((Object) this.nickNameCn, (Object) spotSearchTraderResponseBean.nickNameCn) && Intrinsics.EZpvd((Object) this.nickNameEn, (Object) spotSearchTraderResponseBean.nickNameEn) && Intrinsics.EZpvd((Object) this.headPicture, (Object) spotSearchTraderResponseBean.headPicture) && Intrinsics.EZpvd((Object) this.defaultHeadPictureId, (Object) spotSearchTraderResponseBean.defaultHeadPictureId) && Intrinsics.EZpvd((Object) this.type, (Object) spotSearchTraderResponseBean.type) && Intrinsics.EZpvd((Object) this.aum, (Object) spotSearchTraderResponseBean.aum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAum() {
        return this.aum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultHeadPictureId() {
        return this.defaultHeadPictureId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeadPicture() {
        return this.headPicture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIncomeRate() {
        return this.incomeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJumpParam() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickNameCn() {
        return this.nickNameCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickNameEn() {
        return this.nickNameEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.incomeRate.hashCode() * 31) + this.jumpParam.hashCode()) * 31) + this.nickNameCn.hashCode()) * 31) + this.nickNameEn.hashCode()) * 31) + this.headPicture.hashCode()) * 31) + this.defaultHeadPictureId.hashCode()) * 31) + this.type.hashCode()) * 31) + this.aum.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchTraderResponseBean(incomeRate=" + this.incomeRate + ", jumpParam=" + this.jumpParam + ", nickNameCn=" + this.nickNameCn + ", nickNameEn=" + this.nickNameEn + ", headPicture=" + this.headPicture + ", defaultHeadPictureId=" + this.defaultHeadPictureId + ", type=" + this.type + ", aum=" + this.aum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchTraderResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotSearchTraderResponseBean> serializer() {
            return SpotSearchTraderResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotSearchTraderResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.incomeRate = "";
        } else {
            this.incomeRate = str;
        }
        if ((i & 2) == 0) {
            this.jumpParam = "";
        } else {
            this.jumpParam = str2;
        }
        if ((i & 4) == 0) {
            this.nickNameCn = "";
        } else {
            this.nickNameCn = str3;
        }
        if ((i & 8) == 0) {
            this.nickNameEn = "";
        } else {
            this.nickNameEn = str4;
        }
        if ((i & 16) == 0) {
            this.headPicture = "";
        } else {
            this.headPicture = str5;
        }
        if ((i & 32) == 0) {
            this.defaultHeadPictureId = "";
        } else {
            this.defaultHeadPictureId = str6;
        }
        if ((i & 64) == 0) {
            this.type = "";
        } else {
            this.type = str7;
        }
        if ((i & 128) == 0) {
            this.aum = "";
        } else {
            this.aum = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SpotSearchTraderResponseBean spotSearchTraderResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.incomeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, spotSearchTraderResponseBean.incomeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.jumpParam, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, spotSearchTraderResponseBean.jumpParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.nickNameCn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, spotSearchTraderResponseBean.nickNameCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.nickNameEn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotSearchTraderResponseBean.nickNameEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.headPicture, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotSearchTraderResponseBean.headPicture);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.defaultHeadPictureId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, spotSearchTraderResponseBean.defaultHeadPictureId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, spotSearchTraderResponseBean.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) spotSearchTraderResponseBean.aum, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, spotSearchTraderResponseBean.aum);
    }

    public SpotSearchTraderResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.incomeRate = str;
        this.jumpParam = str2;
        this.nickNameCn = str3;
        this.nickNameEn = str4;
        this.headPicture = str5;
        this.defaultHeadPictureId = str6;
        this.type = str7;
        this.aum = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchTraderResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSearchTraderResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "");
    }
}
