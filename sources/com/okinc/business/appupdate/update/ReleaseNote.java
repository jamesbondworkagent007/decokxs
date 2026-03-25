package com.okinc.business.appupdate.update;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class ReleaseNote {
    private final String language;
    private final List<String> text;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.appupdate.update.ReleaseNote */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReleaseNote copy$default(ReleaseNote releaseNote, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = releaseNote.language;
        }
        if ((i & 2) != 0) {
            list = releaseNote.text;
        }
        return releaseNote.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReleaseNote copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ReleaseNote(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleaseNote)) {
            return false;
        }
        ReleaseNote releaseNote = (ReleaseNote) obj;
        return Intrinsics.EZpvd((Object) this.language, (Object) releaseNote.language) && Intrinsics.EZpvd(this.text, releaseNote.text);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.language.hashCode() * 31) + this.text.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReleaseNote(language=" + this.language + ", text=" + this.text + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.ReleaseNote.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReleaseNote> serializer() {
            return ReleaseNote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReleaseNote(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ReleaseNote$$serializer.INSTANCE.getDescriptor());
        }
        this.language = str;
        this.text = list;
    }

    public static final /* synthetic */ void write$Self$OKUpgrade_ok_upgrade(ReleaseNote releaseNote, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, releaseNote.language);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], releaseNote.text);
    }

    public ReleaseNote(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.language = str;
        this.text = list;
    }
}
