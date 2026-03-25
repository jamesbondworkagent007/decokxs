package com.okinc.business.market.data.model;

import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomepageConfigResponse {
    public final List<CategoryModuleData> categoryModules;
    public final AdvancedFilterData defaultFilter;
    public final QuickFilterConfigData quickButtonConfig;
    public final DefaultChainFilter specialChainFilter;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CategoryModuleData$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomepageConfigResponse() {
        this((List) null, (AdvancedFilterData) null, (QuickFilterConfigData) null, (DefaultChainFilter) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.HomepageConfigResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomepageConfigResponse copy$default(HomepageConfigResponse homepageConfigResponse, List list, AdvancedFilterData advancedFilterData, QuickFilterConfigData quickFilterConfigData, DefaultChainFilter defaultChainFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            list = homepageConfigResponse.categoryModules;
        }
        if ((i & 2) != 0) {
            advancedFilterData = homepageConfigResponse.defaultFilter;
        }
        if ((i & 4) != 0) {
            quickFilterConfigData = homepageConfigResponse.quickButtonConfig;
        }
        if ((i & 8) != 0) {
            defaultChainFilter = homepageConfigResponse.specialChainFilter;
        }
        return homepageConfigResponse.OLrzqt(list, advancedFilterData, quickFilterConfigData, defaultChainFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilterData AEQbTJ() {
        return this.defaultFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickFilterConfigData KWHzl() {
        return this.quickButtonConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomepageConfigResponse OLrzqt(@NotNull List<CategoryModuleData> list, @NotNull AdvancedFilterData advancedFilterData, @NotNull QuickFilterConfigData quickFilterConfigData, @NotNull DefaultChainFilter defaultChainFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(advancedFilterData, "");
        Intrinsics.checkNotNullParameter(quickFilterConfigData, "");
        Intrinsics.checkNotNullParameter(defaultChainFilter, "");
        return new HomepageConfigResponse(list, advancedFilterData, quickFilterConfigData, defaultChainFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryModuleData> OLrzqt() {
        return this.categoryModules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultChainFilter copydefault() {
        return this.specialChainFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomepageConfigResponse)) {
            return false;
        }
        HomepageConfigResponse homepageConfigResponse = (HomepageConfigResponse) obj;
        return Intrinsics.EZpvd(this.categoryModules, homepageConfigResponse.categoryModules) && Intrinsics.EZpvd(this.defaultFilter, homepageConfigResponse.defaultFilter) && Intrinsics.EZpvd(this.quickButtonConfig, homepageConfigResponse.quickButtonConfig) && Intrinsics.EZpvd(this.specialChainFilter, homepageConfigResponse.specialChainFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.categoryModules.hashCode() * 31) + this.defaultFilter.hashCode()) * 31) + this.quickButtonConfig.hashCode()) * 31) + this.specialChainFilter.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomepageConfigResponse(categoryModules=" + this.categoryModules + ", defaultFilter=" + this.defaultFilter + ", quickButtonConfig=" + this.quickButtonConfig + ", specialChainFilter=" + this.specialChainFilter + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.HomepageConfigResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomepageConfigResponse> serializer() {
            return HomepageConfigResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomepageConfigResponse(int i, List list, AdvancedFilterData advancedFilterData, QuickFilterConfigData quickFilterConfigData, DefaultChainFilter defaultChainFilter, SerializationConstructorMarker serializationConstructorMarker) {
        this.categoryModules = (i & 1) == 0 ? yDY.AhwBna() : list;
        this.defaultFilter = (i & 2) == 0 ? new AdvancedFilterData((String) null, (TimeIntervalType) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (TimeIntervalType) null, false, false, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, (String) null, (TimeIntervalType) null, 0, (RankingType) null, (TokenAgeType) null, (String) null, (String) null, 0, 0, 0, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, -1, 31, (DefaultConstructorMarker) null) : advancedFilterData;
        this.quickButtonConfig = (i & 4) == 0 ? new QuickFilterConfigData((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : quickFilterConfigData;
        this.specialChainFilter = (i & 8) == 0 ? new DefaultChainFilter((String) null, false, (TimeIntervalType) null, 7, (DefaultConstructorMarker) null) : defaultChainFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [7=5] */
    public static final /* synthetic */ void EZpvd(HomepageConfigResponse homepageConfigResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(homepageConfigResponse.categoryModules, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], homepageConfigResponse.categoryModules);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(homepageConfigResponse.defaultFilter, new AdvancedFilterData((String) null, (TimeIntervalType) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (TimeIntervalType) null, false, false, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, (String) null, (TimeIntervalType) null, 0, (RankingType) null, (TokenAgeType) null, (String) null, (String) null, 0, 0, 0, (TimeIntervalType) null, (String) null, (String) null, (TimeIntervalType) null, (String) null, (String) null, (String) null, -1, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, AdvancedFilterData$$serializer.INSTANCE, homepageConfigResponse.defaultFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(homepageConfigResponse.quickButtonConfig, new QuickFilterConfigData((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, QuickFilterConfigData$$serializer.INSTANCE, homepageConfigResponse.quickButtonConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(homepageConfigResponse.specialChainFilter, new DefaultChainFilter((String) null, false, (TimeIntervalType) null, 7, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, DefaultChainFilter$$serializer.INSTANCE, homepageConfigResponse.specialChainFilter);
    }

    public HomepageConfigResponse(@NotNull List<CategoryModuleData> list, @NotNull AdvancedFilterData advancedFilterData, @NotNull QuickFilterConfigData quickFilterConfigData, @NotNull DefaultChainFilter defaultChainFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(advancedFilterData, "");
        Intrinsics.checkNotNullParameter(quickFilterConfigData, "");
        Intrinsics.checkNotNullParameter(defaultChainFilter, "");
        this.categoryModules = list;
        this.defaultFilter = advancedFilterData;
        this.quickButtonConfig = quickFilterConfigData;
        this.specialChainFilter = defaultChainFilter;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HomepageConfigResponse(java.util.List r44, com.okinc.business.market.data.model.AdvancedFilterData r45, com.okinc.business.market.data.model.QuickFilterConfigData r46, com.okinc.business.market.data.model.DefaultChainFilter r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r43 = this;
            r0 = r48 & 1
            if (r0 == 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.EZpvd()
            goto Lb
        L9:
            r0 = r44
        Lb:
            r1 = r48 & 2
            if (r1 == 0) goto L59
            com.okinc.business.market.data.model.AdvancedFilterData r1 = new com.okinc.business.market.data.model.AdvancedFilterData
            r2 = r1
            r3 = 0
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
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = -1
            r41 = 31
            r42 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L5b
        L59:
            r1 = r45
        L5b:
            r2 = r48 & 4
            if (r2 == 0) goto L6d
            com.okinc.business.market.data.model.QuickFilterConfigData r2 = new com.okinc.business.market.data.model.QuickFilterConfigData
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L6f
        L6d:
            r2 = r46
        L6f:
            r3 = r48 & 8
            if (r3 == 0) goto L8c
            com.okinc.business.market.data.model.DefaultChainFilter r3 = new com.okinc.business.market.data.model.DefaultChainFilter
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r44 = r3
            r45 = r4
            r46 = r5
            r47 = r6
            r48 = r7
            r49 = r8
            r44.<init>(r45, r46, r47, r48, r49)
            r4 = r43
            goto L90
        L8c:
            r4 = r43
            r3 = r47
        L90:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.data.model.HomepageConfigResponse.<init>(java.util.List, com.okinc.business.market.data.model.AdvancedFilterData, com.okinc.business.market.data.model.QuickFilterConfigData, com.okinc.business.market.data.model.DefaultChainFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
