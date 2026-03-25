package com.okinc.im.call.model;

import com.okinc.im.call.model.CallStateV2;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public abstract class CallStateV2 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.nrR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return CallStateV2.EZpvd();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CallStateV2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final /* synthetic */ void copydefault(CallStateV2 callStateV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) CallStateV2.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CallStateV2> serializer() {
            return EZpvd();
        }
    }

    private CallStateV2() {
    }

    public /* synthetic */ CallStateV2(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer EZpvd() {
        return new SealedClassSerializer("com.okinc.im.call.model.CallStateV2", C56524yIo.AEQbTJ(CallStateV2.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Connected.class), C56524yIo.AEQbTJ(Connecting.class), C56524yIo.AEQbTJ(Disconnected.class), C56524yIo.AEQbTJ(Idle.class), C56524yIo.AEQbTJ(Ringing.class)}, new KSerializer[]{CallStateV2$Connected$$serializer.INSTANCE, CallStateV2$Connecting$$serializer.INSTANCE, CallStateV2$Disconnected$$serializer.INSTANCE, new ObjectSerializer("com.okinc.im.call.model.CallStateV2.Idle", Idle.INSTANCE, new Annotation[0]), CallStateV2$Ringing$$serializer.INSTANCE}, new Annotation[0]);
    }

    @Serializable
    public static final class Idle extends CallStateV2 {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();
        public static final /* synthetic */ InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.nrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CallStateV2.Idle.valueOf();
            }
        });

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Idle";
        }

        public static final /* synthetic */ KSerializer valueOf() {
            return new ObjectSerializer("com.okinc.im.call.model.CallStateV2.Idle", INSTANCE, new Annotation[0]);
        }

        public final /* synthetic */ KSerializer djBIcL() {
            return $cachedSerializer$delegate.getValue();
        }

        public final KSerializer<Idle> serializer() {
            return djBIcL();
        }

        private Idle() {
            super(null);
        }
    }

    @Serializable
    public static final class Ringing extends CallStateV2 {
        public static final int $stable = 0;
        public final CallDirection direction;
        public final CallSessionV2 session;
        public final long startedAt;
        public static final Companion Companion = new Companion(null);
        public static final KSerializer<Object>[] $childSerializers = {null, CallDirection.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Ringing copy$default(Ringing ringing, CallSessionV2 callSessionV2, CallDirection callDirection, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = ringing.session;
            }
            if ((i & 2) != 0) {
                callDirection = ringing.direction;
            }
            if ((i & 4) != 0) {
                j = ringing.startedAt;
            }
            return ringing.AEQbTJ(callSessionV2, callDirection, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Ringing AEQbTJ(@NotNull CallSessionV2 callSessionV2, @NotNull CallDirection callDirection, long j) {
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            Intrinsics.checkNotNullParameter(callDirection, "");
            return new Ringing(callSessionV2, callDirection, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 djBIcL() {
            return this.session;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ringing)) {
                return false;
            }
            Ringing ringing = (Ringing) obj;
            return Intrinsics.EZpvd(this.session, ringing.session) && this.direction == ringing.direction && this.startedAt == ringing.startedAt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.session.hashCode() * 31) + this.direction.hashCode()) * 31) + Long.hashCode(this.startedAt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Ringing(session=" + this.session + ", direction=" + this.direction + ", startedAt=" + this.startedAt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallDirection valueOf() {
            return this.direction;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.Ringing.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Ringing> serializer() {
                return CallStateV2$Ringing$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Ringing(int i, CallSessionV2 callSessionV2, CallDirection callDirection, long j, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CallStateV2$Ringing$$serializer.INSTANCE.getDescriptor());
            }
            this.session = callSessionV2;
            this.direction = callDirection;
            if ((i & 4) == 0) {
                this.startedAt = System.currentTimeMillis();
            } else {
                this.startedAt = j;
            }
        }

        public static final /* synthetic */ void KWHzl(Ringing ringing, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CallStateV2.copydefault(ringing, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, ringing.session);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], ringing.direction);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && ringing.startedAt == System.currentTimeMillis()) {
                return;
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 2, ringing.startedAt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.im.call.model.CallSessionV2)
  (r2v0 com.okinc.im.call.model.CallDirection)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:49)) : (r3v0 long))
 A[MD:(com.okinc.im.call.model.CallSessionV2, com.okinc.im.call.model.CallDirection, long):void (m)] (LINE:46) call: com.okinc.im.call.model.CallStateV2.Ringing.<init>(com.okinc.im.call.model.CallSessionV2, com.okinc.im.call.model.CallDirection, long):void type: THIS */
        public /* synthetic */ Ringing(CallSessionV2 callSessionV2, CallDirection callDirection, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callSessionV2, callDirection, (i & 4) != 0 ? System.currentTimeMillis() : j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ringing(@NotNull CallSessionV2 callSessionV2, @NotNull CallDirection callDirection, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            Intrinsics.checkNotNullParameter(callDirection, "");
            this.session = callSessionV2;
            this.direction = callDirection;
            this.startedAt = j;
        }
    }

    @Serializable
    public static final class Connecting extends CallStateV2 {
        public static final int $stable = 0;
        public final CallDirection direction;
        public final CallSessionV2 session;
        public static final Companion Companion = new Companion(null);
        public static final KSerializer<Object>[] $childSerializers = {null, CallDirection.Companion.serializer()};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Connecting copy$default(Connecting connecting, CallSessionV2 callSessionV2, CallDirection callDirection, int i, Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = connecting.session;
            }
            if ((i & 2) != 0) {
                callDirection = connecting.direction;
            }
            return connecting.EZpvd(callSessionV2, callDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 AYXKKw() {
            return this.session;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Connecting EZpvd(@NotNull CallSessionV2 callSessionV2, @NotNull CallDirection callDirection) {
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            Intrinsics.checkNotNullParameter(callDirection, "");
            return new Connecting(callSessionV2, callDirection);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connecting)) {
                return false;
            }
            Connecting connecting = (Connecting) obj;
            return Intrinsics.EZpvd(this.session, connecting.session) && this.direction == connecting.direction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.session.hashCode() * 31) + this.direction.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Connecting(session=" + this.session + ", direction=" + this.direction + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallDirection valueOf() {
            return this.direction;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.Connecting.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Connecting> serializer() {
                return CallStateV2$Connecting$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Connecting(int i, CallSessionV2 callSessionV2, CallDirection callDirection, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CallStateV2$Connecting$$serializer.INSTANCE.getDescriptor());
            }
            this.session = callSessionV2;
            this.direction = callDirection;
        }

        public static final /* synthetic */ void AEQbTJ(Connecting connecting, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CallStateV2.copydefault(connecting, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, connecting.session);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], connecting.direction);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Connecting(@NotNull CallSessionV2 callSessionV2, @NotNull CallDirection callDirection) {
            super(null);
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            Intrinsics.checkNotNullParameter(callDirection, "");
            this.session = callSessionV2;
            this.direction = callDirection;
        }
    }

    @Serializable
    public static final class Connected extends CallStateV2 {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final long connectedAt;
        public final CallSessionV2 session;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Connected copy$default(Connected connected, CallSessionV2 callSessionV2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = connected.session;
            }
            if ((i & 2) != 0) {
                j = connected.connectedAt;
            }
            return connected.EZpvd(callSessionV2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 AYXKKw() {
            return this.session;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.connectedAt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Connected EZpvd(@NotNull CallSessionV2 callSessionV2, long j) {
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            return new Connected(callSessionV2, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connected)) {
                return false;
            }
            Connected connected = (Connected) obj;
            return Intrinsics.EZpvd(this.session, connected.session) && this.connectedAt == connected.connectedAt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.session.hashCode() * 31) + Long.hashCode(this.connectedAt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Connected(session=" + this.session + ", connectedAt=" + this.connectedAt + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.Connected.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Connected> serializer() {
                return CallStateV2$Connected$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Connected(int i, CallSessionV2 callSessionV2, long j, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CallStateV2$Connected$$serializer.INSTANCE.getDescriptor());
            }
            this.session = callSessionV2;
            if ((i & 2) == 0) {
                this.connectedAt = System.currentTimeMillis();
            } else {
                this.connectedAt = j;
            }
        }

        public static final /* synthetic */ void copydefault(Connected connected, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CallStateV2.copydefault(connected, compositeEncoder, serialDescriptor);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, connected.session);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && connected.connectedAt == System.currentTimeMillis()) {
                return;
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 1, connected.connectedAt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.im.call.model.CallSessionV2)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:74)) : (r2v0 long))
 A[MD:(com.okinc.im.call.model.CallSessionV2, long):void (m)] (LINE:72) call: com.okinc.im.call.model.CallStateV2.Connected.<init>(com.okinc.im.call.model.CallSessionV2, long):void type: THIS */
        public /* synthetic */ Connected(CallSessionV2 callSessionV2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callSessionV2, (i & 2) != 0 ? System.currentTimeMillis() : j);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Connected(@NotNull CallSessionV2 callSessionV2, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(callSessionV2, "");
            this.session = callSessionV2;
            this.connectedAt = j;
        }
    }

    @Serializable
    public static final class Disconnected extends CallStateV2 {
        public static final int $stable = 0;
        public final Long duration;
        public final DisconnectReason reason;
        public final CallSessionV2 session;
        public static final Companion Companion = new Companion(null);
        public static final KSerializer<Object>[] $childSerializers = {null, DisconnectReason.Companion.serializer(), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, CallSessionV2 callSessionV2, DisconnectReason disconnectReason, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                callSessionV2 = disconnected.session;
            }
            if ((i & 2) != 0) {
                disconnectReason = disconnected.reason;
            }
            if ((i & 4) != 0) {
                l = disconnected.duration;
            }
            return disconnected.KWHzl(callSessionV2, disconnectReason, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CallSessionV2 AhwBna() {
            return this.session;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Disconnected KWHzl(CallSessionV2 callSessionV2, @NotNull DisconnectReason disconnectReason, Long l) {
            Intrinsics.checkNotNullParameter(disconnectReason, "");
            return new Disconnected(callSessionV2, disconnectReason, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Disconnected)) {
                return false;
            }
            Disconnected disconnected = (Disconnected) obj;
            return Intrinsics.EZpvd(this.session, disconnected.session) && this.reason == disconnected.reason && Intrinsics.EZpvd(this.duration, disconnected.duration);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            CallSessionV2 callSessionV2 = this.session;
            int iHashCode = callSessionV2 == null ? 0 : callSessionV2.hashCode();
            int iHashCode2 = this.reason.hashCode();
            Long l = this.duration;
            return (((iHashCode * 31) + iHashCode2) * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Disconnected(session=" + this.session + ", reason=" + this.reason + ", duration=" + this.duration + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DisconnectReason valueOf() {
            return this.reason;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallStateV2.Disconnected.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Disconnected> serializer() {
                return CallStateV2$Disconnected$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Disconnected(int i, CallSessionV2 callSessionV2, DisconnectReason disconnectReason, Long l, SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CallStateV2$Disconnected$$serializer.INSTANCE.getDescriptor());
            }
            this.session = callSessionV2;
            this.reason = disconnectReason;
            if ((i & 4) == 0) {
                this.duration = null;
            } else {
                this.duration = l;
            }
        }

        public static final /* synthetic */ void KWHzl(Disconnected disconnected, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            CallStateV2.copydefault(disconnected, compositeEncoder, serialDescriptor);
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CallSessionV2$$serializer.INSTANCE, disconnected.session);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], disconnected.reason);
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && disconnected.duration == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, disconnected.duration);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.im.call.model.CallSessionV2)
  (r2v0 com.okinc.im.call.model.DisconnectReason)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(com.okinc.im.call.model.CallSessionV2, com.okinc.im.call.model.DisconnectReason, java.lang.Long):void (m)] (LINE:86) call: com.okinc.im.call.model.CallStateV2.Disconnected.<init>(com.okinc.im.call.model.CallSessionV2, com.okinc.im.call.model.DisconnectReason, java.lang.Long):void type: THIS */
        public /* synthetic */ Disconnected(CallSessionV2 callSessionV2, DisconnectReason disconnectReason, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(callSessionV2, disconnectReason, (i & 4) != 0 ? null : l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disconnected(CallSessionV2 callSessionV2, @NotNull DisconnectReason disconnectReason, Long l) {
            super(null);
            Intrinsics.checkNotNullParameter(disconnectReason, "");
            this.session = callSessionV2;
            this.reason = disconnectReason;
            this.duration = l;
        }
    }

    public final CallSessionV2 AEQbTJ() {
        if (this instanceof Idle) {
            return null;
        }
        if (this instanceof Ringing) {
            return ((Ringing) this).djBIcL();
        }
        if (this instanceof Connecting) {
            return ((Connecting) this).AYXKKw();
        }
        if (this instanceof Connected) {
            return ((Connected) this).AYXKKw();
        }
        if (this instanceof Disconnected) {
            return ((Disconnected) this).AhwBna();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean OLrzqt() {
        if ((this instanceof Idle) || (this instanceof Disconnected)) {
            return false;
        }
        if ((this instanceof Ringing) || (this instanceof Connecting) || (this instanceof Connected)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
