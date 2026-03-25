package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class HeroCta {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String link;
    public final String text;
    public final String trackingKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeroCta copy$default(HeroCta heroCta, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = heroCta.text;
        }
        if ((i & 2) != 0) {
            str2 = heroCta.link;
        }
        if ((i & 4) != 0) {
            str3 = heroCta.trackingKey;
        }
        return heroCta.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.trackingKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroCta KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HeroCta(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroCta)) {
            return false;
        }
        HeroCta heroCta = (HeroCta) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) heroCta.text) && Intrinsics.EZpvd((Object) this.link, (Object) heroCta.link) && Intrinsics.EZpvd((Object) this.trackingKey, (Object) heroCta.trackingKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.link.hashCode()) * 31) + this.trackingKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroCta(text=" + this.text + ", link=" + this.link + ", trackingKey=" + this.trackingKey + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroCta.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroCta> serializer() {
            return HeroCta$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroCta(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, HeroCta$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.link = str2;
        this.trackingKey = str3;
    }

    public static final /* synthetic */ void EZpvd(HeroCta heroCta, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, heroCta.text);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, heroCta.link);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, heroCta.trackingKey);
    }

    public HeroCta(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.text = str;
        this.link = str2;
        this.trackingKey = str3;
    }
}
