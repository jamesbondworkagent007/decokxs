package com.okinc.business.dex.trade.copytrading.edit.data.model;

import com.okinc.business.dex.tee.domain.model.Rules;
import com.okinc.business.dex.tee.domain.model.Rules$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SellSettings {
    public static final String COPY_SELL_TYPE_MIXED = "3";
    public static final String COPY_SELL_TYPE_ONLY_COPY_SELL = "1";
    public static final String COPY_SELL_TYPE_ONLY_TP_SL = "2";
    private final boolean copySell;
    private final String copySellType;
    private final List<Rules> rules;
    private final CopyTradingPreset sellPreset;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Rules$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SellSettings() {
        this(false, (String) null, (List) null, (CopyTradingPreset) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellSettings copy$default(SellSettings sellSettings, boolean z, String str, List list, CopyTradingPreset copyTradingPreset, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sellSettings.copySell;
        }
        if ((i & 2) != 0) {
            str = sellSettings.copySellType;
        }
        if ((i & 4) != 0) {
            list = sellSettings.rules;
        }
        if ((i & 8) != 0) {
            copyTradingPreset = sellSettings.sellPreset;
        }
        return sellSettings.copy(z, str, list, copyTradingPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.copySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.copySellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rules> component3() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPreset component4() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellSettings copy(boolean z, String str, @NotNull List<Rules> list, @NotNull CopyTradingPreset copyTradingPreset) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(copyTradingPreset, "");
        return new SellSettings(z, str, list, copyTradingPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellSettings)) {
            return false;
        }
        SellSettings sellSettings = (SellSettings) obj;
        return this.copySell == sellSettings.copySell && Intrinsics.EZpvd((Object) this.copySellType, (Object) sellSettings.copySellType) && Intrinsics.EZpvd(this.rules, sellSettings.rules) && Intrinsics.EZpvd(this.sellPreset, sellSettings.sellPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCopySell() {
        return this.copySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCopySellType() {
        return this.copySellType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rules> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradingPreset getSellPreset() {
        return this.sellPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.copySell);
        String str = this.copySellType;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.rules.hashCode()) * 31) + this.sellPreset.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SellSettings(copySell=" + this.copySell + ", copySellType=" + this.copySellType + ", rules=" + this.rules + ", sellPreset=" + this.sellPreset + ")";
    }

    public /* synthetic */ SellSettings(int i, boolean z, String str, List list, CopyTradingPreset copyTradingPreset, SerializationConstructorMarker serializationConstructorMarker) {
        this.copySell = (i & 1) == 0 ? false : z;
        this.copySellType = (i & 2) == 0 ? null : str;
        this.rules = (i & 4) == 0 ? yDY.AhwBna() : list;
        this.sellPreset = (i & 8) == 0 ? new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null) : copyTradingPreset;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SellSettings sellSettings, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sellSettings.copySell) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, sellSettings.copySell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sellSettings.copySellType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, sellSettings.copySellType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(sellSettings.rules, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], sellSettings.rules);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(sellSettings.sellPreset, new CopyTradingPreset((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (JsonElement) null, 1023, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, CopyTradingPreset$$serializer.INSTANCE, sellSettings.sellPreset);
    }

    public SellSettings(boolean z, String str, @NotNull List<Rules> list, @NotNull CopyTradingPreset copyTradingPreset) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(copyTradingPreset, "");
        this.copySell = z;
        this.copySellType = str;
        this.rules = list;
        this.sellPreset = copyTradingPreset;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SellSettings(boolean r18, java.lang.String r19, java.util.List r20, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r17 = this;
            r0 = r22 & 1
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r18
        L8:
            r1 = r22 & 2
            if (r1 == 0) goto Le
            r1 = 0
            goto L10
        Le:
            r1 = r19
        L10:
            r2 = r22 & 4
            if (r2 == 0) goto L19
            java.util.List r2 = kotlin.collections.CollectionsKt.EZpvd()
            goto L1b
        L19:
            r2 = r20
        L1b:
            r3 = r22 & 8
            if (r3 == 0) goto L36
            com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset r3 = new com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset
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
            r15 = 1023(0x3ff, float:1.434E-42)
            r16 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r17
            goto L3a
        L36:
            r4 = r17
            r3 = r21
        L3a:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings.<init>(boolean, java.lang.String, java.util.List, com.okinc.business.dex.trade.copytrading.edit.data.model.CopyTradingPreset, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.data.model.SellSettings.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SellSettings> serializer() {
            return SellSettings$$serializer.INSTANCE;
        }
    }
}
