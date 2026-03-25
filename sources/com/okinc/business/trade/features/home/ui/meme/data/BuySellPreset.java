package com.okinc.business.trade.features.home.ui.meme.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class BuySellPreset implements Parcelable {
    private final FeeConfig feeConfig;
    private final RouteConfig routeConfig;
    private final SlippageConfigPreset slippageConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BuySellPreset> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BuySellPreset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellPreset createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellPreset(FeeConfig.CREATOR.createFromParcel(parcel), RouteConfig.CREATOR.createFromParcel(parcel), SlippageConfigPreset.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellPreset[] newArray(int i) {
            return new BuySellPreset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellPreset() {
        this((FeeConfig) null, (RouteConfig) null, (SlippageConfigPreset) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellPreset copy$default(BuySellPreset buySellPreset, FeeConfig feeConfig, RouteConfig routeConfig, SlippageConfigPreset slippageConfigPreset, int i, Object obj) {
        if ((i & 1) != 0) {
            feeConfig = buySellPreset.feeConfig;
        }
        if ((i & 2) != 0) {
            routeConfig = buySellPreset.routeConfig;
        }
        if ((i & 4) != 0) {
            slippageConfigPreset = buySellPreset.slippageConfig;
        }
        return buySellPreset.copy(feeConfig, routeConfig, slippageConfigPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeConfig component1() {
        return this.feeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteConfig component2() {
        return this.routeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfigPreset component3() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellPreset copy(@NotNull FeeConfig feeConfig, @NotNull RouteConfig routeConfig, @NotNull SlippageConfigPreset slippageConfigPreset) {
        Intrinsics.checkNotNullParameter(feeConfig, "");
        Intrinsics.checkNotNullParameter(routeConfig, "");
        Intrinsics.checkNotNullParameter(slippageConfigPreset, "");
        return new BuySellPreset(feeConfig, routeConfig, slippageConfigPreset);
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
        if (!(obj instanceof BuySellPreset)) {
            return false;
        }
        BuySellPreset buySellPreset = (BuySellPreset) obj;
        return Intrinsics.EZpvd(this.feeConfig, buySellPreset.feeConfig) && Intrinsics.EZpvd(this.routeConfig, buySellPreset.routeConfig) && Intrinsics.EZpvd(this.slippageConfig, buySellPreset.slippageConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeConfig getFeeConfig() {
        return this.feeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageConfigPreset getSlippageConfig() {
        return this.slippageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.feeConfig.hashCode() * 31) + this.routeConfig.hashCode()) * 31) + this.slippageConfig.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellPreset(feeConfig=" + this.feeConfig + ", routeConfig=" + this.routeConfig + ", slippageConfig=" + this.slippageConfig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.feeConfig.writeToParcel(parcel, i);
        this.routeConfig.writeToParcel(parcel, i);
        this.slippageConfig.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuySellPreset> serializer() {
            return BuySellPreset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuySellPreset(int i, FeeConfig feeConfig, RouteConfig routeConfig, SlippageConfigPreset slippageConfigPreset, SerializationConstructorMarker serializationConstructorMarker) {
        RouteConfig routeConfig2;
        this.feeConfig = (i & 1) == 0 ? new FeeConfig((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null) : feeConfig;
        if ((i & 2) == 0) {
            routeConfig2 = new RouteConfig((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        } else {
            routeConfig2 = routeConfig;
        }
        this.routeConfig = routeConfig2;
        this.slippageConfig = (i & 4) == 0 ? new SlippageConfigPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, 2047, (DefaultConstructorMarker) null) : slippageConfigPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [55=4] */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BuySellPreset buySellPreset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(buySellPreset.feeConfig, new FeeConfig((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, FeeConfig$$serializer.INSTANCE, buySellPreset.feeConfig);
        }
        int i = 1;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(buySellPreset.routeConfig, new RouteConfig((String) null, i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, RouteConfig$$serializer.INSTANCE, buySellPreset.routeConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(buySellPreset.slippageConfig, new SlippageConfigPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, 2047, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, SlippageConfigPreset$$serializer.INSTANCE, buySellPreset.slippageConfig);
    }

    public BuySellPreset(@NotNull FeeConfig feeConfig, @NotNull RouteConfig routeConfig, @NotNull SlippageConfigPreset slippageConfigPreset) {
        Intrinsics.checkNotNullParameter(feeConfig, "");
        Intrinsics.checkNotNullParameter(routeConfig, "");
        Intrinsics.checkNotNullParameter(slippageConfigPreset, "");
        this.feeConfig = feeConfig;
        this.routeConfig = routeConfig;
        this.slippageConfig = slippageConfigPreset;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BuySellPreset(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig r18, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig r19, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r17 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L14
            com.okinc.business.trade.features.home.ui.meme.data.FeeConfig r0 = new com.okinc.business.trade.features.home.ui.meme.data.FeeConfig
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 63
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L16
        L14:
            r0 = r18
        L16:
            r1 = r21 & 2
            if (r1 == 0) goto L22
            com.okinc.business.trade.features.home.ui.meme.data.RouteConfig r1 = new com.okinc.business.trade.features.home.ui.meme.data.RouteConfig
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3, r2)
            goto L24
        L22:
            r1 = r19
        L24:
            r2 = r21 & 4
            if (r2 == 0) goto L40
            com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset r2 = new com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2047(0x7ff, float:2.868E-42)
            r16 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r17
            goto L44
        L40:
            r3 = r17
            r2 = r20
        L44:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset.<init>(com.okinc.business.trade.features.home.ui.meme.data.FeeConfig, com.okinc.business.trade.features.home.ui.meme.data.RouteConfig, com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
