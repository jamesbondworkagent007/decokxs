package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class HeroResponseRootModel {
    public final HeroResponseModel heroSection;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeroResponseRootModel copy$default(HeroResponseRootModel heroResponseRootModel, HeroResponseModel heroResponseModel, int i, Object obj) {
        if ((i & 1) != 0) {
            heroResponseModel = heroResponseRootModel.heroSection;
        }
        return heroResponseRootModel.KWHzl(heroResponseModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroResponseModel EZpvd() {
        return this.heroSection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroResponseRootModel KWHzl(HeroResponseModel heroResponseModel) {
        return new HeroResponseRootModel(heroResponseModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeroResponseRootModel) && Intrinsics.EZpvd(this.heroSection, ((HeroResponseRootModel) obj).heroSection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        HeroResponseModel heroResponseModel = this.heroSection;
        if (heroResponseModel == null) {
            return 0;
        }
        return heroResponseModel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroResponseRootModel(heroSection=" + this.heroSection + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroResponseRootModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroResponseRootModel> serializer() {
            return HeroResponseRootModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroResponseRootModel(int i, HeroResponseModel heroResponseModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, HeroResponseRootModel$$serializer.INSTANCE.getDescriptor());
        }
        this.heroSection = heroResponseModel;
    }

    public HeroResponseRootModel(HeroResponseModel heroResponseModel) {
        this.heroSection = heroResponseModel;
    }
}
