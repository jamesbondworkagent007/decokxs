package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.utility.UriSerializer;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class OKMediaMessageContent extends OKMessageContent {
    private Uri localUri;
    private String name;
    private Uri remoteUri;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null};
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OKMediaMessageContent._init_$_anonymous_();
        }
    });

    @SerialName("localPath")
    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getLocalUri$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getRemoteUri$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Uri getLocalUri() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Uri getRemoteUri() {
        return this.remoteUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLocalUri(Uri uri) {
        this.localUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRemoteUri(Uri uri) {
        this.remoteUri = uri;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMediaMessageContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) OKMediaMessageContent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKMediaMessageContent> serializer() {
            return AEQbTJ();
        }
    }

    public /* synthetic */ OKMediaMessageContent(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.localUri = null;
        } else {
            this.localUri = uri;
        }
        if ((i & 512) == 0) {
            this.remoteUri = null;
        } else {
            this.remoteUri = uri2;
        }
        if ((i & 1024) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new PolymorphicSerializer(C56524yIo.AEQbTJ(OKMediaMessageContent.class), new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(OKMediaMessageContent oKMediaMessageContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKMediaMessageContent, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKMediaMessageContent.getLocalUri() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, UriSerializer.INSTANCE, oKMediaMessageContent.getLocalUri());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKMediaMessageContent.getRemoteUri() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, UriSerializer.INSTANCE, oKMediaMessageContent.getRemoteUri());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && oKMediaMessageContent.name == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKMediaMessageContent.name);
    }

    public OKMediaMessageContent() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKMediaMessageContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        setLocalUri((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
        setRemoteUri((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
        this.name = parcel.readString();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getLocalUri(), i);
        parcel.writeParcelable(getRemoteUri(), i);
        parcel.writeString(this.name);
    }
}
