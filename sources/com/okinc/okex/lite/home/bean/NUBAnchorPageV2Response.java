package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class NUBAnchorPageV2Response {

    @SerializedName("anchorDataV1")
    private final NUBAnchorPageResponse anchorDataV1;

    @SerializedName("anchorDataV2")
    private final AnchorDataV2 anchorDataV2;

    @SerializedName("anchorVersion")
    private final AnchorVersion anchorVersion;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, AnchorVersion.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NUBAnchorPageV2Response copy$default(NUBAnchorPageV2Response nUBAnchorPageV2Response, NUBAnchorPageResponse nUBAnchorPageResponse, AnchorDataV2 anchorDataV2, AnchorVersion anchorVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            nUBAnchorPageResponse = nUBAnchorPageV2Response.anchorDataV1;
        }
        if ((i & 2) != 0) {
            anchorDataV2 = nUBAnchorPageV2Response.anchorDataV2;
        }
        if ((i & 4) != 0) {
            anchorVersion = nUBAnchorPageV2Response.anchorVersion;
        }
        return nUBAnchorPageV2Response.copy(nUBAnchorPageResponse, anchorDataV2, anchorVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBAnchorPageResponse component1() {
        return this.anchorDataV1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnchorDataV2 component2() {
        return this.anchorDataV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnchorVersion component3() {
        return this.anchorVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBAnchorPageV2Response copy(NUBAnchorPageResponse nUBAnchorPageResponse, AnchorDataV2 anchorDataV2, @NotNull AnchorVersion anchorVersion) {
        Intrinsics.checkNotNullParameter(anchorVersion, "");
        return new NUBAnchorPageV2Response(nUBAnchorPageResponse, anchorDataV2, anchorVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NUBAnchorPageV2Response)) {
            return false;
        }
        NUBAnchorPageV2Response nUBAnchorPageV2Response = (NUBAnchorPageV2Response) obj;
        return Intrinsics.EZpvd(this.anchorDataV1, nUBAnchorPageV2Response.anchorDataV1) && Intrinsics.EZpvd(this.anchorDataV2, nUBAnchorPageV2Response.anchorDataV2) && this.anchorVersion == nUBAnchorPageV2Response.anchorVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NUBAnchorPageResponse getAnchorDataV1() {
        return this.anchorDataV1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnchorDataV2 getAnchorDataV2() {
        return this.anchorDataV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnchorVersion getAnchorVersion() {
        return this.anchorVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        NUBAnchorPageResponse nUBAnchorPageResponse = this.anchorDataV1;
        int iHashCode = nUBAnchorPageResponse == null ? 0 : nUBAnchorPageResponse.hashCode();
        AnchorDataV2 anchorDataV2 = this.anchorDataV2;
        return (((iHashCode * 31) + (anchorDataV2 != null ? anchorDataV2.hashCode() : 0)) * 31) + this.anchorVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NUBAnchorPageV2Response(anchorDataV1=" + this.anchorDataV1 + ", anchorDataV2=" + this.anchorDataV2 + ", anchorVersion=" + this.anchorVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NUBAnchorPageV2Response> serializer() {
            return NUBAnchorPageV2Response$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NUBAnchorPageV2Response(int i, NUBAnchorPageResponse nUBAnchorPageResponse, AnchorDataV2 anchorDataV2, AnchorVersion anchorVersion, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, NUBAnchorPageV2Response$$serializer.INSTANCE.getDescriptor());
        }
        this.anchorDataV1 = nUBAnchorPageResponse;
        this.anchorDataV2 = anchorDataV2;
        this.anchorVersion = anchorVersion;
    }

    public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(NUBAnchorPageV2Response nUBAnchorPageV2Response, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, NUBAnchorPageResponse$$serializer.INSTANCE, nUBAnchorPageV2Response.anchorDataV1);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE, nUBAnchorPageV2Response.anchorDataV2);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], nUBAnchorPageV2Response.anchorVersion);
    }

    public NUBAnchorPageV2Response(NUBAnchorPageResponse nUBAnchorPageResponse, AnchorDataV2 anchorDataV2, @NotNull AnchorVersion anchorVersion) {
        Intrinsics.checkNotNullParameter(anchorVersion, "");
        this.anchorDataV1 = nUBAnchorPageResponse;
        this.anchorDataV2 = anchorDataV2;
        this.anchorVersion = anchorVersion;
    }

    @Serializable
    public static final class AnchorDataV2 {

        @SerializedName("checklist")
        private final Checklist checklist;

        @SerializedName("ctaButton")
        private final CtaButton ctaButton;

        @SerializedName("description")
        private final Description description;

        @SerializedName("explore")
        private final Explore explore;

        @SerializedName("needHelp")
        private final NeedHelp needHelp;

        @SerializedName("reward")
        private final Reward reward;

        @SerializedName("title")
        private final String title;

        @SerializedName("trackingProperties")
        private final AnchorTrackingProperties trackingProperties;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Checklist component1() {
            return this.checklist;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CtaButton component2() {
            return this.ctaButton;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Description component3() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Explore component4() {
            return this.explore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NeedHelp component5() {
            return this.needHelp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Reward component6() {
            return this.reward;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnchorTrackingProperties component8() {
            return this.trackingProperties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnchorDataV2 copy(@NotNull Checklist checklist, @NotNull CtaButton ctaButton, @NotNull Description description, @NotNull Explore explore, @NotNull NeedHelp needHelp, Reward reward, @NotNull String str, @NotNull AnchorTrackingProperties anchorTrackingProperties) {
            Intrinsics.checkNotNullParameter(checklist, "");
            Intrinsics.checkNotNullParameter(ctaButton, "");
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(explore, "");
            Intrinsics.checkNotNullParameter(needHelp, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(anchorTrackingProperties, "");
            return new AnchorDataV2(checklist, ctaButton, description, explore, needHelp, reward, str, anchorTrackingProperties);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorDataV2)) {
                return false;
            }
            AnchorDataV2 anchorDataV2 = (AnchorDataV2) obj;
            return Intrinsics.EZpvd(this.checklist, anchorDataV2.checklist) && Intrinsics.EZpvd(this.ctaButton, anchorDataV2.ctaButton) && Intrinsics.EZpvd(this.description, anchorDataV2.description) && Intrinsics.EZpvd(this.explore, anchorDataV2.explore) && Intrinsics.EZpvd(this.needHelp, anchorDataV2.needHelp) && Intrinsics.EZpvd(this.reward, anchorDataV2.reward) && Intrinsics.EZpvd((Object) this.title, (Object) anchorDataV2.title) && Intrinsics.EZpvd(this.trackingProperties, anchorDataV2.trackingProperties);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Checklist getChecklist() {
            return this.checklist;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CtaButton getCtaButton() {
            return this.ctaButton;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Description getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Explore getExplore() {
            return this.explore;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NeedHelp getNeedHelp() {
            return this.needHelp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Reward getReward() {
            return this.reward;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnchorTrackingProperties getTrackingProperties() {
            return this.trackingProperties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.checklist.hashCode();
            int iHashCode2 = this.ctaButton.hashCode();
            int iHashCode3 = this.description.hashCode();
            int iHashCode4 = this.explore.hashCode();
            int iHashCode5 = this.needHelp.hashCode();
            Reward reward = this.reward;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (reward == null ? 0 : reward.hashCode())) * 31) + this.title.hashCode()) * 31) + this.trackingProperties.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AnchorDataV2(checklist=" + this.checklist + ", ctaButton=" + this.ctaButton + ", description=" + this.description + ", explore=" + this.explore + ", needHelp=" + this.needHelp + ", reward=" + this.reward + ", title=" + this.title + ", trackingProperties=" + this.trackingProperties + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AnchorDataV2> serializer() {
                return NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AnchorDataV2(int i, Checklist checklist, CtaButton ctaButton, Description description, Explore explore, NeedHelp needHelp, Reward reward, String str, AnchorTrackingProperties anchorTrackingProperties, SerializationConstructorMarker serializationConstructorMarker) {
            if (255 != (i & 255)) {
                PluginExceptionsKt.throwMissingFieldException(i, 255, NUBAnchorPageV2Response$AnchorDataV2$$serializer.INSTANCE.getDescriptor());
            }
            this.checklist = checklist;
            this.ctaButton = ctaButton;
            this.description = description;
            this.explore = explore;
            this.needHelp = needHelp;
            this.reward = reward;
            this.title = str;
            this.trackingProperties = anchorTrackingProperties;
        }

        public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(AnchorDataV2 anchorDataV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE, anchorDataV2.checklist);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE, anchorDataV2.ctaButton);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE, anchorDataV2.description);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE, anchorDataV2.explore);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE, anchorDataV2.needHelp);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE, anchorDataV2.reward);
            compositeEncoder.encodeStringElement(serialDescriptor, 6, anchorDataV2.title);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE, anchorDataV2.trackingProperties);
        }

        public AnchorDataV2(@NotNull Checklist checklist, @NotNull CtaButton ctaButton, @NotNull Description description, @NotNull Explore explore, @NotNull NeedHelp needHelp, Reward reward, @NotNull String str, @NotNull AnchorTrackingProperties anchorTrackingProperties) {
            Intrinsics.checkNotNullParameter(checklist, "");
            Intrinsics.checkNotNullParameter(ctaButton, "");
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(explore, "");
            Intrinsics.checkNotNullParameter(needHelp, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(anchorTrackingProperties, "");
            this.checklist = checklist;
            this.ctaButton = ctaButton;
            this.description = description;
            this.explore = explore;
            this.needHelp = needHelp;
            this.reward = reward;
            this.title = str;
            this.trackingProperties = anchorTrackingProperties;
        }

        @Serializable
        public static final class AnchorTrackingProperties {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);

            @SerializedName("account_state")
            private final String accountState;

            @SerializedName("button")
            private final String button;

            @SerializedName("reward_available")
            private final String rewardAvailable;

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.AnchorTrackingProperties.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<AnchorTrackingProperties> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ AnchorTrackingProperties(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 7, NUBAnchorPageV2Response$AnchorDataV2$AnchorTrackingProperties$$serializer.INSTANCE.getDescriptor());
                }
                this.accountState = str;
                this.rewardAvailable = str2;
                this.button = str3;
            }

            public static final /* synthetic */ void OLrzqt(AnchorTrackingProperties anchorTrackingProperties, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, anchorTrackingProperties.accountState);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, anchorTrackingProperties.rewardAvailable);
                compositeEncoder.encodeStringElement(serialDescriptor, 2, anchorTrackingProperties.button);
            }
        }

        @Serializable
        public static final class Checklist {

            @SerializedName("steps")
            private final List<Step> steps;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer.INSTANCE)};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response$AnchorDataV2$Checklist */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Checklist copy$default(Checklist checklist, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = checklist.steps;
                }
                return checklist.copy(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Step> component1() {
                return this.steps;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Checklist copy(@NotNull List<Step> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Checklist(list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Checklist) && Intrinsics.EZpvd(this.steps, ((Checklist) obj).steps);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Step> getSteps() {
                return this.steps;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.steps.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Checklist(steps=" + this.steps + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Checklist.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Checklist> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Checklist(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, NUBAnchorPageV2Response$AnchorDataV2$Checklist$$serializer.INSTANCE.getDescriptor());
                }
                this.steps = list;
            }

            public Checklist(@NotNull List<Step> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.steps = list;
            }

            @Serializable
            public static final class Step {
                public static final int $stable = 0;

                @SerializedName("badgeLabel")
                private final String badgeLabel;

                @SerializedName("description")
                private final String description;

                @SerializedName("status")
                private final StepStatus status;

                @SerializedName("title")
                private final String title;
                public static final Companion Companion = new Companion(null);
                private static final KSerializer<Object>[] $childSerializers = {null, null, StepStatus.Companion.serializer(), null};

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ Step copy$default(Step step, String str, String str2, StepStatus stepStatus, String str3, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = step.badgeLabel;
                    }
                    if ((i & 2) != 0) {
                        str2 = step.description;
                    }
                    if ((i & 4) != 0) {
                        stepStatus = step.status;
                    }
                    if ((i & 8) != 0) {
                        str3 = step.title;
                    }
                    return step.copy(str, str2, stepStatus, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.badgeLabel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final StepStatus component3() {
                    return this.status;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Step copy(String str, @NotNull String str2, @NotNull StepStatus stepStatus, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(stepStatus, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    return new Step(str, str2, stepStatus, str3);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Step)) {
                        return false;
                    }
                    Step step = (Step) obj;
                    return Intrinsics.EZpvd((Object) this.badgeLabel, (Object) step.badgeLabel) && Intrinsics.EZpvd((Object) this.description, (Object) step.description) && this.status == step.status && Intrinsics.EZpvd((Object) this.title, (Object) step.title);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getBadgeLabel() {
                    return this.badgeLabel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getDescription() {
                    return this.description;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final StepStatus getStatus() {
                    return this.status;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTitle() {
                    return this.title;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    String str = this.badgeLabel;
                    return ((((((str == null ? 0 : str.hashCode()) * 31) + this.description.hashCode()) * 31) + this.status.hashCode()) * 31) + this.title.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Step(badgeLabel=" + this.badgeLabel + ", description=" + this.description + ", status=" + this.status + ", title=" + this.title + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Step> serializer() {
                        return NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Step(int i, String str, String str2, StepStatus stepStatus, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                    if (15 != (i & 15)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 15, NUBAnchorPageV2Response$AnchorDataV2$Checklist$Step$$serializer.INSTANCE.getDescriptor());
                    }
                    this.badgeLabel = str;
                    this.description = str2;
                    this.status = stepStatus;
                    this.title = str3;
                }

                public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(Step step, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, step.badgeLabel);
                    compositeEncoder.encodeStringElement(serialDescriptor, 1, step.description);
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], step.status);
                    compositeEncoder.encodeStringElement(serialDescriptor, 3, step.title);
                }

                public Step(String str, @NotNull String str2, @NotNull StepStatus stepStatus, @NotNull String str3) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(stepStatus, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    this.badgeLabel = str;
                    this.description = str2;
                    this.status = stepStatus;
                    this.title = str3;
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Serializable
                public static final class StepStatus {
                    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
                    private static final /* synthetic */ StepStatus[] $VALUES;
                    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
                    public static final Companion Companion;

                    @SerializedName("completed")
                    @SerialName("completed")
                    public static final StepStatus COMPLETED = new StepStatus("COMPLETED", 0);

                    @SerializedName("current")
                    @SerialName("current")
                    public static final StepStatus CURRENT = new StepStatus("CURRENT", 1);

                    @SerializedName(EopTrackEvent.KEY_RESULT_FAILED)
                    @SerialName(EopTrackEvent.KEY_RESULT_FAILED)
                    public static final StepStatus FAILED = new StepStatus(CardSyncResponse.FAILED, 2);

                    @SerializedName("under_review")
                    @SerialName("under_review")
                    public static final StepStatus UNDER_REVIEW = new StepStatus("UNDER_REVIEW", 3);

                    @SerializedName("pending")
                    @SerialName("pending")
                    public static final StepStatus PENDING = new StepStatus(CardSyncResponse.PENDING, 4);

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private static final /* synthetic */ StepStatus[] $values() {
                        return new StepStatus[]{COMPLETED, CURRENT, FAILED, UNDER_REVIEW, PENDING};
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static InterfaceC56445yFq<StepStatus> getEntries() {
                        return $ENTRIES;
                    }

                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final /* synthetic */ KSerializer EZpvd() {
                            return (KSerializer) StepStatus.$cachedSerializer$delegate.getValue();
                        }

                        public final KSerializer<StepStatus> serializer() {
                            return EZpvd();
                        }
                    }

                    private StepStatus(String str, int i) {
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus", values(), new String[]{"completed", "current", EopTrackEvent.KEY_RESULT_FAILED, "under_review", "pending"}, new Annotation[][]{null, null, null, null, null}, null);
                    }

                    static {
                        StepStatus[] stepStatusArr$values = $values();
                        $VALUES = stepStatusArr$values;
                        $ENTRIES = C56444yFp.AEQbTJ(stepStatusArr$values);
                        Companion = new Companion(null);
                        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.svR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return NUBAnchorPageV2Response.AnchorDataV2.Checklist.Step.StepStatus._init_$_anonymous_();
                            }
                        });
                    }

                    public static StepStatus valueOf(String str) {
                        return (StepStatus) Enum.valueOf(StepStatus.class, str);
                    }

                    public static StepStatus[] values() {
                        return (StepStatus[]) $VALUES.clone();
                    }
                }
            }
        }

        @Serializable
        public static final class CtaButton {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);

            @SerializedName("href")
            private final String href;

            @SerializedName("text")
            private final String text;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CtaButton copy$default(CtaButton ctaButton, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ctaButton.href;
                }
                if ((i & 2) != 0) {
                    str2 = ctaButton.text;
                }
                return ctaButton.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CtaButton copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new CtaButton(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CtaButton)) {
                    return false;
                }
                CtaButton ctaButton = (CtaButton) obj;
                return Intrinsics.EZpvd((Object) this.href, (Object) ctaButton.href) && Intrinsics.EZpvd((Object) this.text, (Object) ctaButton.text);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getHref() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.href.hashCode() * 31) + this.text.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CtaButton(href=" + this.href + ", text=" + this.text + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.CtaButton.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<CtaButton> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ CtaButton(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$CtaButton$$serializer.INSTANCE.getDescriptor());
                }
                this.href = str;
                this.text = str2;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(CtaButton ctaButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, ctaButton.href);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, ctaButton.text);
            }

            public CtaButton(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.href = str;
                this.text = str2;
            }
        }

        @Serializable
        public static final class Description {

            @SerializedName("templateParams")
            private final List<DescriptionTemplate> templateParams;

            @SerializedName("text")
            private final String text;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DescriptionTemplate$$serializer.INSTANCE), null};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response$AnchorDataV2$Description */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Description copy$default(Description description, List list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = description.templateParams;
                }
                if ((i & 2) != 0) {
                    str = description.text;
                }
                return description.copy(list, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<DescriptionTemplate> component1() {
                return this.templateParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Description copy(@NotNull List<DescriptionTemplate> list, @NotNull String str) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new Description(list, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Description)) {
                    return false;
                }
                Description description = (Description) obj;
                return Intrinsics.EZpvd(this.templateParams, description.templateParams) && Intrinsics.EZpvd((Object) this.text, (Object) description.text);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<DescriptionTemplate> getTemplateParams() {
                return this.templateParams;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.templateParams.hashCode() * 31) + this.text.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Description(templateParams=" + this.templateParams + ", text=" + this.text + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Description.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Description> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Description(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$Description$$serializer.INSTANCE.getDescriptor());
                }
                this.templateParams = list;
                this.text = str;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(Description description, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], description.templateParams);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, description.text);
            }

            public Description(@NotNull List<DescriptionTemplate> list, @NotNull String str) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.templateParams = list;
                this.text = str;
            }
        }

        @Serializable
        public static final class Explore {

            @SerializedName("sections")
            private final List<ExploreSection> sections;

            @SerializedName("title")
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer.INSTANCE)};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response$AnchorDataV2$Explore */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Explore copy$default(Explore explore, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = explore.title;
                }
                if ((i & 2) != 0) {
                    list = explore.sections;
                }
                return explore.copy(str, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<ExploreSection> component2() {
                return this.sections;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Explore copy(@NotNull String str, @NotNull List<ExploreSection> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new Explore(str, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Explore)) {
                    return false;
                }
                Explore explore = (Explore) obj;
                return Intrinsics.EZpvd((Object) this.title, (Object) explore.title) && Intrinsics.EZpvd(this.sections, explore.sections);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<ExploreSection> getSections() {
                return this.sections;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTitle() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.title.hashCode() * 31) + this.sections.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Explore(title=" + this.title + ", sections=" + this.sections + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Explore.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Explore> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Explore(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$Explore$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                this.sections = list;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(Explore explore, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, explore.title);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], explore.sections);
            }

            public Explore(@NotNull String str, @NotNull List<ExploreSection> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.title = str;
                this.sections = list;
            }
        }

        @Serializable
        public static final class ExploreSection {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);

            @SerializedName("darkImage")
            private final String darkImage;

            @SerializedName("subtitle")
            private final String description;

            @SerializedName("href")
            private final String href;

            @SerializedName("lightImage")
            private final String lightImage;

            @SerializedName("title")
            private final String title;

            @SerializedName("trackingProperties")
            private final TrackingProperties trackingProperties;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ExploreSection copy$default(ExploreSection exploreSection, String str, String str2, TrackingProperties trackingProperties, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = exploreSection.darkImage;
                }
                if ((i & 2) != 0) {
                    str2 = exploreSection.description;
                }
                String str6 = str2;
                if ((i & 4) != 0) {
                    trackingProperties = exploreSection.trackingProperties;
                }
                TrackingProperties trackingProperties2 = trackingProperties;
                if ((i & 8) != 0) {
                    str3 = exploreSection.href;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = exploreSection.lightImage;
                }
                String str8 = str4;
                if ((i & 32) != 0) {
                    str5 = exploreSection.title;
                }
                return exploreSection.copy(str, str6, trackingProperties2, str7, str8, str5);
            }

            @SerialName("subtitle")
            public static /* synthetic */ void getDescription$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.darkImage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TrackingProperties component3() {
                return this.trackingProperties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.lightImage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component6() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ExploreSection copy(@NotNull String str, @NotNull String str2, @NotNull TrackingProperties trackingProperties, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(trackingProperties, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                return new ExploreSection(str, str2, trackingProperties, str3, str4, str5);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExploreSection)) {
                    return false;
                }
                ExploreSection exploreSection = (ExploreSection) obj;
                return Intrinsics.EZpvd((Object) this.darkImage, (Object) exploreSection.darkImage) && Intrinsics.EZpvd((Object) this.description, (Object) exploreSection.description) && Intrinsics.EZpvd(this.trackingProperties, exploreSection.trackingProperties) && Intrinsics.EZpvd((Object) this.href, (Object) exploreSection.href) && Intrinsics.EZpvd((Object) this.lightImage, (Object) exploreSection.lightImage) && Intrinsics.EZpvd((Object) this.title, (Object) exploreSection.title);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDarkImage() {
                return this.darkImage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getDescription() {
                return this.description;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getHref() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getLightImage() {
                return this.lightImage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTitle() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TrackingProperties getTrackingProperties() {
                return this.trackingProperties;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((((((this.darkImage.hashCode() * 31) + this.description.hashCode()) * 31) + this.trackingProperties.hashCode()) * 31) + this.href.hashCode()) * 31) + this.lightImage.hashCode()) * 31) + this.title.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ExploreSection(darkImage=" + this.darkImage + ", description=" + this.description + ", trackingProperties=" + this.trackingProperties + ", href=" + this.href + ", lightImage=" + this.lightImage + ", title=" + this.title + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<ExploreSection> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ ExploreSection(int i, String str, String str2, TrackingProperties trackingProperties, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
                if (63 != (i & 63)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 63, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$$serializer.INSTANCE.getDescriptor());
                }
                this.darkImage = str;
                this.description = str2;
                this.trackingProperties = trackingProperties;
                this.href = str3;
                this.lightImage = str4;
                this.title = str5;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(ExploreSection exploreSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, exploreSection.darkImage);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, exploreSection.description);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 2, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE, exploreSection.trackingProperties);
                compositeEncoder.encodeStringElement(serialDescriptor, 3, exploreSection.href);
                compositeEncoder.encodeStringElement(serialDescriptor, 4, exploreSection.lightImage);
                compositeEncoder.encodeStringElement(serialDescriptor, 5, exploreSection.title);
            }

            public ExploreSection(@NotNull String str, @NotNull String str2, @NotNull TrackingProperties trackingProperties, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(trackingProperties, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                this.darkImage = str;
                this.description = str2;
                this.trackingProperties = trackingProperties;
                this.href = str3;
                this.lightImage = str4;
                this.title = str5;
            }

            @Serializable
            public static final class TrackingProperties {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);

                @SerializedName("card_name")
                private final String cardName;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ TrackingProperties copy$default(TrackingProperties trackingProperties, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = trackingProperties.cardName;
                    }
                    return trackingProperties.copy(str);
                }

                @SerialName("card_name")
                public static /* synthetic */ void getCardName$annotations() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.cardName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TrackingProperties copy(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return new TrackingProperties(str);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof TrackingProperties) && Intrinsics.EZpvd((Object) this.cardName, (Object) ((TrackingProperties) obj).cardName);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getCardName() {
                    return this.cardName;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.cardName.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "TrackingProperties(cardName=" + this.cardName + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.ExploreSection.TrackingProperties.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<TrackingProperties> serializer() {
                        return NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ TrackingProperties(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    if (1 != (i & 1)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 1, NUBAnchorPageV2Response$AnchorDataV2$ExploreSection$TrackingProperties$$serializer.INSTANCE.getDescriptor());
                    }
                    this.cardName = str;
                }

                public TrackingProperties(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.cardName = str;
                }
            }
        }

        @Serializable
        public static final class NeedHelp {

            @SerializedName("sections")
            private final List<NeedHelpSection> sections;

            @SerializedName("title")
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(NUBAnchorPageV2Response$AnchorDataV2$NeedHelpSection$$serializer.INSTANCE)};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response$AnchorDataV2$NeedHelp */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NeedHelp copy$default(NeedHelp needHelp, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = needHelp.title;
                }
                if ((i & 2) != 0) {
                    list = needHelp.sections;
                }
                return needHelp.copy(str, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<NeedHelpSection> component2() {
                return this.sections;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final NeedHelp copy(@NotNull String str, @NotNull List<NeedHelpSection> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new NeedHelp(str, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NeedHelp)) {
                    return false;
                }
                NeedHelp needHelp = (NeedHelp) obj;
                return Intrinsics.EZpvd((Object) this.title, (Object) needHelp.title) && Intrinsics.EZpvd(this.sections, needHelp.sections);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<NeedHelpSection> getSections() {
                return this.sections;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTitle() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.title.hashCode() * 31) + this.sections.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NeedHelp(title=" + this.title + ", sections=" + this.sections + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.NeedHelp.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<NeedHelp> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ NeedHelp(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$NeedHelp$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                this.sections = list;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(NeedHelp needHelp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, needHelp.title);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], needHelp.sections);
            }

            public NeedHelp(@NotNull String str, @NotNull List<NeedHelpSection> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.title = str;
                this.sections = list;
            }
        }

        @Serializable
        public static final class NeedHelpSection {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);

            @SerializedName("href")
            private final String href;

            @SerializedName("text")
            private final String text;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ NeedHelpSection copy$default(NeedHelpSection needHelpSection, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = needHelpSection.href;
                }
                if ((i & 2) != 0) {
                    str2 = needHelpSection.text;
                }
                return needHelpSection.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final NeedHelpSection copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new NeedHelpSection(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NeedHelpSection)) {
                    return false;
                }
                NeedHelpSection needHelpSection = (NeedHelpSection) obj;
                return Intrinsics.EZpvd((Object) this.href, (Object) needHelpSection.href) && Intrinsics.EZpvd((Object) this.text, (Object) needHelpSection.text);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getHref() {
                return this.href;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getText() {
                return this.text;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.href.hashCode() * 31) + this.text.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "NeedHelpSection(href=" + this.href + ", text=" + this.text + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.NeedHelpSection.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<NeedHelpSection> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$NeedHelpSection$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ NeedHelpSection(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$NeedHelpSection$$serializer.INSTANCE.getDescriptor());
                }
                this.href = str;
                this.text = str2;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(NeedHelpSection needHelpSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, needHelpSection.href);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, needHelpSection.text);
            }

            public NeedHelpSection(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.href = str;
                this.text = str2;
            }
        }

        @Serializable
        public static final class Reward {

            @SerializedName("expiryTimeMillis")
            private final long expiryDate;

            @SerializedName("sections")
            private final List<RewardCard> rewardCards;

            @SerializedName("title")
            private final String title;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;
            private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer.INSTANCE)};

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response$AnchorDataV2$Reward */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Reward copy$default(Reward reward, String str, long j, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reward.title;
                }
                if ((i & 2) != 0) {
                    j = reward.expiryDate;
                }
                if ((i & 4) != 0) {
                    list = reward.rewardCards;
                }
                return reward.copy(str, j, list);
            }

            @SerialName("expiryTimeMillis")
            public static /* synthetic */ void getExpiryDate$annotations() {
            }

            @SerialName("sections")
            public static /* synthetic */ void getRewardCards$annotations() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component2() {
                return this.expiryDate;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<RewardCard> component3() {
                return this.rewardCards;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Reward copy(@NotNull String str, long j, @NotNull List<RewardCard> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new Reward(str, j, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Reward)) {
                    return false;
                }
                Reward reward = (Reward) obj;
                return Intrinsics.EZpvd((Object) this.title, (Object) reward.title) && this.expiryDate == reward.expiryDate && Intrinsics.EZpvd(this.rewardCards, reward.rewardCards);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getExpiryDate() {
                return this.expiryDate;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<RewardCard> getRewardCards() {
                return this.rewardCards;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTitle() {
                return this.title;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.title.hashCode() * 31) + Long.hashCode(this.expiryDate)) * 31) + this.rewardCards.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Reward(title=" + this.title + ", expiryDate=" + this.expiryDate + ", rewardCards=" + this.rewardCards + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Reward.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Reward> serializer() {
                    return NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Reward(int i, String str, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 7, NUBAnchorPageV2Response$AnchorDataV2$Reward$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                this.expiryDate = j;
                this.rewardCards = list;
            }

            public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(Reward reward, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, reward.title);
                compositeEncoder.encodeLongElement(serialDescriptor, 1, reward.expiryDate);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], reward.rewardCards);
            }

            public Reward(@NotNull String str, long j, @NotNull List<RewardCard> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.title = str;
                this.expiryDate = j;
                this.rewardCards = list;
            }

            @Serializable
            public static final class RewardCard {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);

                @SerializedName("bottomText")
                private final String bottomText;

                @SerializedName("href")
                private final String href;

                @SerializedName("mainDescription")
                private final String mainDescription;

                @SerializedName("rewardAmount")
                private final String rewardAmount;

                @SerializedName("topText")
                private final String topText;

                @SerializedName("trackingProperties")
                private final TrackingProperties trackingProperties;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ RewardCard copy$default(RewardCard rewardCard, String str, String str2, String str3, String str4, String str5, TrackingProperties trackingProperties, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = rewardCard.bottomText;
                    }
                    if ((i & 2) != 0) {
                        str2 = rewardCard.href;
                    }
                    String str6 = str2;
                    if ((i & 4) != 0) {
                        str3 = rewardCard.mainDescription;
                    }
                    String str7 = str3;
                    if ((i & 8) != 0) {
                        str4 = rewardCard.rewardAmount;
                    }
                    String str8 = str4;
                    if ((i & 16) != 0) {
                        str5 = rewardCard.topText;
                    }
                    String str9 = str5;
                    if ((i & 32) != 0) {
                        trackingProperties = rewardCard.trackingProperties;
                    }
                    return rewardCard.copy(str, str6, str7, str8, str9, trackingProperties);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.bottomText;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.href;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component3() {
                    return this.mainDescription;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component4() {
                    return this.rewardAmount;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component5() {
                    return this.topText;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TrackingProperties component6() {
                    return this.trackingProperties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final RewardCard copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull TrackingProperties trackingProperties) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(trackingProperties, "");
                    return new RewardCard(str, str2, str3, str4, str5, trackingProperties);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RewardCard)) {
                        return false;
                    }
                    RewardCard rewardCard = (RewardCard) obj;
                    return Intrinsics.EZpvd((Object) this.bottomText, (Object) rewardCard.bottomText) && Intrinsics.EZpvd((Object) this.href, (Object) rewardCard.href) && Intrinsics.EZpvd((Object) this.mainDescription, (Object) rewardCard.mainDescription) && Intrinsics.EZpvd((Object) this.rewardAmount, (Object) rewardCard.rewardAmount) && Intrinsics.EZpvd((Object) this.topText, (Object) rewardCard.topText) && Intrinsics.EZpvd(this.trackingProperties, rewardCard.trackingProperties);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getBottomText() {
                    return this.bottomText;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getHref() {
                    return this.href;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMainDescription() {
                    return this.mainDescription;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getRewardAmount() {
                    return this.rewardAmount;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getTopText() {
                    return this.topText;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final TrackingProperties getTrackingProperties() {
                    return this.trackingProperties;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.bottomText.hashCode();
                    int iHashCode2 = this.href.hashCode();
                    int iHashCode3 = this.mainDescription.hashCode();
                    int iHashCode4 = this.rewardAmount.hashCode();
                    String str = this.topText;
                    return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.trackingProperties.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "RewardCard(bottomText=" + this.bottomText + ", href=" + this.href + ", mainDescription=" + this.mainDescription + ", rewardAmount=" + this.rewardAmount + ", topText=" + this.topText + ", trackingProperties=" + this.trackingProperties + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<RewardCard> serializer() {
                        return NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ RewardCard(int i, String str, String str2, String str3, String str4, String str5, TrackingProperties trackingProperties, SerializationConstructorMarker serializationConstructorMarker) {
                    if (63 != (i & 63)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 63, NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$$serializer.INSTANCE.getDescriptor());
                    }
                    this.bottomText = str;
                    this.href = str2;
                    this.mainDescription = str3;
                    this.rewardAmount = str4;
                    this.topText = str5;
                    this.trackingProperties = trackingProperties;
                }

                public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(RewardCard rewardCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardCard.bottomText);
                    compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardCard.href);
                    compositeEncoder.encodeStringElement(serialDescriptor, 2, rewardCard.mainDescription);
                    compositeEncoder.encodeStringElement(serialDescriptor, 3, rewardCard.rewardAmount);
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rewardCard.topText);
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 5, NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE, rewardCard.trackingProperties);
                }

                public RewardCard(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull TrackingProperties trackingProperties) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    Intrinsics.checkNotNullParameter(str3, "");
                    Intrinsics.checkNotNullParameter(str4, "");
                    Intrinsics.checkNotNullParameter(trackingProperties, "");
                    this.bottomText = str;
                    this.href = str2;
                    this.mainDescription = str3;
                    this.rewardAmount = str4;
                    this.topText = str5;
                    this.trackingProperties = trackingProperties;
                }

                @Serializable
                public static final class TrackingProperties {
                    public static final int $stable = 0;
                    public static final Companion Companion = new Companion(null);

                    @SerializedName("reward_style")
                    private final String rewardStyle;

                    @SerializedName("reward_type")
                    private final String rewardType;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public static /* synthetic */ TrackingProperties copy$default(TrackingProperties trackingProperties, String str, String str2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = trackingProperties.rewardStyle;
                        }
                        if ((i & 2) != 0) {
                            str2 = trackingProperties.rewardType;
                        }
                        return trackingProperties.copy(str, str2);
                    }

                    @SerialName("reward_style")
                    public static /* synthetic */ void getRewardStyle$annotations() {
                    }

                    @SerialName("reward_type")
                    public static /* synthetic */ void getRewardType$annotations() {
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component1() {
                        return this.rewardStyle;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String component2() {
                        return this.rewardType;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final TrackingProperties copy(@NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        return new TrackingProperties(str, str2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof TrackingProperties)) {
                            return false;
                        }
                        TrackingProperties trackingProperties = (TrackingProperties) obj;
                        return Intrinsics.EZpvd((Object) this.rewardStyle, (Object) trackingProperties.rewardStyle) && Intrinsics.EZpvd((Object) this.rewardType, (Object) trackingProperties.rewardType);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getRewardStyle() {
                        return this.rewardStyle;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final String getRewardType() {
                        return this.rewardType;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public int hashCode() {
                        return (this.rewardStyle.hashCode() * 31) + this.rewardType.hashCode();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public String toString() {
                        return "TrackingProperties(rewardStyle=" + this.rewardStyle + ", rewardType=" + this.rewardType + ")";
                    }

                    public static final class Companion {
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        private Companion() {
                        }

                        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.NUBAnchorPageV2Response.AnchorDataV2.Reward.RewardCard.TrackingProperties.Companion.<init>():void type: THIS */
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<TrackingProperties> serializer() {
                            return NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE;
                        }
                    }

                    public /* synthetic */ TrackingProperties(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            PluginExceptionsKt.throwMissingFieldException(i, 3, NUBAnchorPageV2Response$AnchorDataV2$Reward$RewardCard$TrackingProperties$$serializer.INSTANCE.getDescriptor());
                        }
                        this.rewardStyle = str;
                        this.rewardType = str2;
                    }

                    public static final /* synthetic */ void write$Self$OKHomeLite_home_lite_api(TrackingProperties trackingProperties, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                        compositeEncoder.encodeStringElement(serialDescriptor, 0, trackingProperties.rewardStyle);
                        compositeEncoder.encodeStringElement(serialDescriptor, 1, trackingProperties.rewardType);
                    }

                    public TrackingProperties(@NotNull String str, @NotNull String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.rewardStyle = str;
                        this.rewardType = str2;
                    }
                }
            }
        }
    }
}
