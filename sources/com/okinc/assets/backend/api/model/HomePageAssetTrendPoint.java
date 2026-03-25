package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class HomePageAssetTrendPoint {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String period;
    private final String valuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomePageAssetTrendPoint() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomePageAssetTrendPoint copy$default(HomePageAssetTrendPoint homePageAssetTrendPoint, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homePageAssetTrendPoint.period;
        }
        if ((i & 2) != 0) {
            str2 = homePageAssetTrendPoint.valuation;
        }
        return homePageAssetTrendPoint.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomePageAssetTrendPoint copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HomePageAssetTrendPoint(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomePageAssetTrendPoint)) {
            return false;
        }
        HomePageAssetTrendPoint homePageAssetTrendPoint = (HomePageAssetTrendPoint) obj;
        return Intrinsics.EZpvd((Object) this.period, (Object) homePageAssetTrendPoint.period) && Intrinsics.EZpvd((Object) this.valuation, (Object) homePageAssetTrendPoint.valuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.period.hashCode() * 31) + this.valuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomePageAssetTrendPoint(period=" + this.period + ", valuation=" + this.valuation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.HomePageAssetTrendPoint.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomePageAssetTrendPoint> serializer() {
            return HomePageAssetTrendPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomePageAssetTrendPoint(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.period = "";
        } else {
            this.period = str;
        }
        if ((i & 2) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(HomePageAssetTrendPoint homePageAssetTrendPoint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homePageAssetTrendPoint.period, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homePageAssetTrendPoint.period);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) homePageAssetTrendPoint.valuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, homePageAssetTrendPoint.valuation);
    }

    public HomePageAssetTrendPoint(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.period = str;
        this.valuation = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.assets.backend.api.model.HomePageAssetTrendPoint.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomePageAssetTrendPoint(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
