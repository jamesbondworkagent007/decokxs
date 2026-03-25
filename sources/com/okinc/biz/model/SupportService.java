package com.okinc.biz.model;

import com.okinc.biz.bean.enums.SupportChannelType;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import o.InterfaceC6817aWY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SupportService {
    private final InterfaceC6817aWY serviceAction;
    private final String serviceLabel;
    private final SupportChannelType supportChannelType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {SupportChannelType.Companion.serializer(), new PolymorphicSerializer(C56524yIo.AEQbTJ(InterfaceC6817aWY.class), new Annotation[0]), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SupportChannelType component1() {
        return this.supportChannelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportService copy$default(SupportService supportService, SupportChannelType supportChannelType, InterfaceC6817aWY interfaceC6817aWY, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            supportChannelType = supportService.supportChannelType;
        }
        if ((i & 2) != 0) {
            interfaceC6817aWY = supportService.serviceAction;
        }
        if ((i & 4) != 0) {
            str = supportService.serviceLabel;
        }
        return supportService.copy(supportChannelType, interfaceC6817aWY, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC6817aWY component2() {
        return this.serviceAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.serviceLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportService copy(@NotNull SupportChannelType supportChannelType, @NotNull InterfaceC6817aWY interfaceC6817aWY, @NotNull String str) {
        Intrinsics.checkNotNullParameter(supportChannelType, "");
        Intrinsics.checkNotNullParameter(interfaceC6817aWY, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SupportService(supportChannelType, interfaceC6817aWY, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportService)) {
            return false;
        }
        SupportService supportService = (SupportService) obj;
        return this.supportChannelType == supportService.supportChannelType && Intrinsics.EZpvd(this.serviceAction, supportService.serviceAction) && Intrinsics.EZpvd((Object) this.serviceLabel, (Object) supportService.serviceLabel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC6817aWY getServiceAction() {
        return this.serviceAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceLabel() {
        return this.serviceLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.supportChannelType.hashCode() * 31) + this.serviceAction.hashCode()) * 31) + this.serviceLabel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportService(supportChannelType=" + this.supportChannelType + ", serviceAction=" + this.serviceAction + ", serviceLabel=" + this.serviceLabel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.model.SupportService.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportService> serializer() {
            return SupportService$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportService(int i, SupportChannelType supportChannelType, InterfaceC6817aWY interfaceC6817aWY, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SupportService$$serializer.INSTANCE.getDescriptor());
        }
        this.supportChannelType = supportChannelType;
        this.serviceAction = interfaceC6817aWY;
        this.serviceLabel = str;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(SupportService supportService, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportService.supportChannelType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], supportService.serviceAction);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, supportService.serviceLabel);
    }

    public SupportService(@NotNull SupportChannelType supportChannelType, @NotNull InterfaceC6817aWY interfaceC6817aWY, @NotNull String str) {
        Intrinsics.checkNotNullParameter(supportChannelType, "");
        Intrinsics.checkNotNullParameter(interfaceC6817aWY, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.supportChannelType = supportChannelType;
        this.serviceAction = interfaceC6817aWY;
        this.serviceLabel = str;
    }

    public final String getSupportChannel() {
        return this.supportChannelType.getValue();
    }
}
